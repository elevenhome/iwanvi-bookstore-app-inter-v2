package com.iwanvi.bookstore.appinterv2.common.redis;

import com.alibaba.fastjson.JSONObject;
import com.iwanvi.bookstore.appinterv2.common.RedisConstant;
import com.iwanvi.bookstore.appinterv2.common.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


/**
 * @Desciption Redis操作类
 * @author  zzw
 * @date 2018年11月29日15:06:06
 */
@Component
public class RedisComponent {

    private static final Logger logger = LoggerFactory.getLogger(RedisComponent.class);

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    //缓存默认时间
    public static final long DEFAULT_CACHE_TIME = RedisConstant.Expire.MINUTE_THIRTY;

    private ValueOperations<String, String> valueOperations;//操作字符串
    private HashOperations hashOperations;//操作hash
    private ListOperations listOperations;//操作list
    private SetOperations setOperations;//操作set
    private ZSetOperations zSetOperations;//操作有序set



    @PostConstruct
    private void inInit() {
        valueOperations = stringRedisTemplate.opsForValue();//操作字符串
        hashOperations = stringRedisTemplate.opsForHash();//操作hash
        listOperations = stringRedisTemplate.opsForList();//操作list
        setOperations = stringRedisTemplate.opsForSet();//操作set
        zSetOperations = stringRedisTemplate.opsForZSet();//操作有序set
    }

    //**************公共方法***************//
    //删除缓存
    public Boolean removeCache(String key){
        Long begTime = System.currentTimeMillis();
        Boolean result = this.removeCacheComm(key);
        Long endTime = System.currentTimeMillis();
        logger.info("删除缓存耗时 key={} time={}",key,endTime - begTime);
        return result;
    }

    public Boolean removeCacheComm(String key){
        Boolean hasExist = hasKey(key);
        if(hasExist){
            return stringRedisTemplate.delete(key);
        }else{
            return true;
        }
    }

    //删除多个key
    public Long removeList(Set<String> keys){
        if(Utils.isEmpty(keys)) return null;
        return stringRedisTemplate.delete(keys);
    }

    //获取匹配的key
    public Set<String> getKeyRegualr(String keyRegular){
        if(Utils.isEmpty(keyRegular)) return null;
        return stringRedisTemplate.keys(keyRegular);
    }

    //设置过期时间
    public void setExpire(final String key,Long time){
        stringRedisTemplate.expire(key,time,TimeUnit.SECONDS);
    }
    //获取缓存时间剩余时间
    public long getExpire(final String key){
        return stringRedisTemplate.getExpire(key,TimeUnit.SECONDS);
    }
    //判断key是否存在
    public boolean hasKey(String key){
       return stringRedisTemplate.hasKey(key);
    }

    //**************String处理（实体转化为json字符串）***************//

    public <T>T getCache(String key, Class<T> c) {
        return JSONObject.parseObject(getCache(key), c);
    }

    //从缓存中获取参数
    public Object getCache(String key, Type typeOff) {
        return JSONObject.parseObject(getCache(key), typeOff);
    }


    public String getCache(String key) {
        return valueOperations.get(key);
    }

    //设置缓存值没有设置过期时间
    public void setCache(String key, String value) {
        if(Utils.isEmpty(key)||Utils.isEmpty(value)){
            return;
        }
        valueOperations.set(key, value);
    }

    //设置缓存过期时间
    public void setExpireCacheDefault(final String key,final String value){
        if(Utils.isEmpty(key)||Utils.isEmpty(value)){
            return;
        }
        valueOperations.set(key,value, DEFAULT_CACHE_TIME, TimeUnit.SECONDS);
    }


    //设置缓存过期时间
    public void setExpireCache(final String key,final String value,Long time){
        if(Utils.isEmpty(key)||Utils.isEmpty(value)||Utils.isEmpty(time)||time<=0){
            return;
        }
        valueOperations.set(key,value, time, TimeUnit.SECONDS);
    }

    //**************Object处理***************//

    public void setCache(String key, Object obj) {
        setCache(key, JSONObject.toJSONString(obj));
    }

    //设置缓存并添加默认过期时间
    public void setExpireCacheDefault(final String key,final Object obj){
        if(Utils.isEmpty(key)||Utils.isEmpty(obj)){
            return;
        }
        setExpireCache(key,obj, DEFAULT_CACHE_TIME);
    }

    //设置缓存并添加缓存过期时间
    public void setExpireCache(final String key,final Object obj,Long time){
        if(Utils.isEmpty(key)||Utils.isEmpty(obj)||Utils.isEmpty(time)){
            return;
        }
        this.setExpireCache(key, JSONObject.toJSONString(obj), time);
    }


    //**************List处理***************//


    //添加缓存
    public void rightPushAll(String key, List list){
        if(Utils.isEmpty(key)||Utils.isEmpty(list)){
            return;
        }
        List<String> redisList = new ArrayList<>();
        if(list!=null && !list.isEmpty() && list.size()>0){
            for(Object obj : list){
                if(obj!=null){
                    redisList.add(JSONObject.toJSONString(obj));
                }
            }
        }
        listOperations.rightPushAll(key, redisList);
    }

    //添加缓存并设置过期时间 有默认值
    public void rightPushAllExpireDefault(String key, List list){
        if(Utils.isEmpty(key)||Utils.isEmpty(list)){
            return;
        }
        this.rightPushAll(key,list);
        setExpire(key, DEFAULT_CACHE_TIME);
    }


    //添加缓存并设置过期时间
    public void rightPushAllExpire(String key, List list, Long time){
        this.rightPushAll(key, list);
        setExpire(key, time);
    }

    //添加缓存
    public void leftPushAll(String key, List list){
        if(Utils.isEmpty(key)||Utils.isEmpty(list)){
            return;
        }
        List<String> redisList = new ArrayList<>();
        if(list!=null && !list.isEmpty() && list.size()>0){
            for(Object obj : list){
                if(obj!=null){
                    redisList.add(JSONObject.toJSONString(obj));
                }
            }
        }
        listOperations.leftPushAll(key, redisList);
    }

    //添加缓存并设置过期时间 有默认值
    public void leftPushAllExpireDefault(String key, List list){
        if(Utils.isEmpty(key)||Utils.isEmpty(list)){
            return;
        }
        this.leftPushAll(key,list);
        setExpire(key, DEFAULT_CACHE_TIME);
    }


    //添加缓存并设置过期时间
    public void leftPushAllExpire(String key, List list,Long time){
        this.leftPushAll(key, list);
        setExpire(key, time);
    }

    //从缓存获取数据
    public <T>List<T> getRedisList(String key,Class<T> c){
        List<String> listStr = listOperations.range(key,0,-1);
        if(listStr==null || listStr.isEmpty()){
            return null;
        }
        List<T> backList = new ArrayList<>();
        for(String str : listStr){
            if(Utils.isNotEmpty(str)){
                backList.add(JSONObject.parseObject(str,c));
            }
        }
        return backList;
    }



    //**************Map处理***************//


    //**************Set处理***************//





}
