package com.iwanvi.bookstore.appinterv2.common.redis;


import com.iwanvi.bookstore.appinterv2.common.RedisConstant;
import com.iwanvi.bookstore.appinterv2.common.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.support.atomic.RedisAtomicLong;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 *
 */
@Service
public class RedisComponentOne {

    private final static Logger logger = LoggerFactory.getLogger(RedisComponentOne.class);

//    @Autowired
    @Resource(name="redisTemplateOne")
    private RedisTemplate stringRedisTemplate;

    private ValueOperations valueOperations;
    private RedisConnectionFactory redisConnectionFactory;

    @PostConstruct
    private void inInit() {
        valueOperations = stringRedisTemplate.opsForValue();
        redisConnectionFactory = stringRedisTemplate.getConnectionFactory();
    }

    public String getString(String key) {
         Object obj = valueOperations.get(key);
         if(Utils.isNotEmpty(obj)){
             return obj.toString();
         }else{
             return "";
         }
    }

    public Object getCache(String key) {
        if(Utils.isEmpty(key)){
            return null;
        }
        return valueOperations.get(key);
    }

    public void setCache(String key, Object value) {
        if(Utils.isEmpty(key)||Utils.isEmpty(value)){
            return;
        }
        valueOperations.set(key, value);
    }



    public Boolean removeCache(String key){
        if(Utils.isEmpty(key)){
            return false;
        }
        return stringRedisTemplate.delete(key);
    }

    //设置缓存过期时间
    public void setExpireCache(final String key,final Object value,int time){
        if(Utils.isEmpty(key)||Utils.isEmpty(value)){
            return;
        }
        valueOperations.set(key,value, time, TimeUnit.SECONDS);
    }

    public void setExpireCacheDefault(final String key,final Object value){
        if(Utils.isEmpty(key)||Utils.isEmpty(value)){
            return;
        }
        valueOperations.set(key,value, RedisConstant.Expire.MINUTE_TEN, TimeUnit.SECONDS);
    }

    //累加先累加在获取
    public Long getAndIncrement(String key){
        //从redis获取ID
        RedisAtomicLong entityIdCounter = new RedisAtomicLong(key,redisConnectionFactory);
        return entityIdCounter.getAndIncrement();
    }


    //先累加在获取
    public Long incrementAndGet(String key){
        //从redis获取ID
        RedisAtomicLong entityIdCounter = new RedisAtomicLong(key,redisConnectionFactory);
        return entityIdCounter.incrementAndGet();
    }

}
