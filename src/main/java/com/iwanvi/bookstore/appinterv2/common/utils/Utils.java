package com.iwanvi.bookstore.appinterv2.common.utils;


import java.util.Collection;
import java.util.List;
import java.util.Map;


/**
 * @Description 常用的方法集合
 * @author zzw
 * @date 2018年7月9日17:00:31
 */
public class Utils {

    /**
     * @Description: 字符串为空判断
     * @date 2016年10月21日 上午9:27:57
     */
    public static boolean isEmpty(final String str) {
        if (null == str || str.trim().length() == 0 || "null".equals(str)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @Description: 字符串非空判断
     * @date 2016年10月21日 上午9:30:25
     */
    public static boolean isNotEmpty(final String str) {
        return !isEmpty(str);
    }

    /**
     * @Description: 判断StringBuilder是否为空
     * @return boolean
     * @date 2017年6月5日 下午8:30:15
     */
    public static boolean isEmpty(final StringBuilder obj) {
        if (null == obj || obj.length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @Description: StringBuilder非空判断
     * @return boolean
     * @date 2017年6月5日 下午8:35:57
     */
    public static boolean isNotEmpty(final StringBuilder obj) {
        return !isEmpty(obj);
    }

    /**
     * @Description: 判断实体是否为空
     * @date 2016年10月21日 上午9:30:48
     */
    public static boolean isEmpty(final Object obj) {
        return null == obj;
    }

    /**
     * @Description: 字符串不为空判断
     * @date 2016年11月1日 上午11:15:14
     */
    public static boolean isNotEmpty(final Object obj) {
        return null != obj;
    }

    /**
     * @Description: 判断Integer不为空，且不等于0
     * @return boolean
     * @date 2017年8月28日 下午2:32:57
     */
    public static boolean isNotEmptyZero(final Integer obj) {
        return !isEmptyZero(obj);
    }

    public static boolean isEmptyZero(final Integer obj) {
        return isEmpty(obj) || obj == 0;
    }

    /**
     * @Description: 判断Long不为空，企业不等于
     * @return boolean
     * @date 2017年8月28日 下午4:14:46
     */
    public static boolean isNotEmptyZero(final Long obj) {
        return !isEmptyZero(obj);
    }

    public static boolean isEmptyZero(final Long obj) {
        return isEmpty(obj) || obj == 0;
    }

    //-----------------collection--------------------

    /**
     * @Description: 获取Collection集合长度
     * @return int
     * @date 2017年5月30日 下午4:29:28
     */
    public static int size(final Collection<?> collection) {
        return isEmpty(collection) ? 0 : collection.size();
    }

    /**
     * @Description: 获取Map集合长度
     * @return int
     * @date 2017年5月30日 下午4:29:43
     */
    public static int size(final Map<?, ?> map) {
        return isEmpty(map) ? 0 : map.size();
    }


    /**
     * @Description: 判断Collection集合为空
     * @return boolean
     * @date 2017年5月30日 下午4:29:56
     */
    public static boolean isEmpty(final Collection<?> collection) {
        return collection == null || collection.isEmpty() || collection.size() <= 0;
    }


    /**
     * @Description: 判断Collection集合为空
     * @return boolean
     * @date 2017年5月30日 下午4:30:07
     */
    public static boolean isNotEmpty(final Collection<?> collection) {
        return !isEmpty(collection);
    }

    /**
     * @Description: 判断Map集合为空
     * @return boolean
     * @date 2017年5月30日 下午4:30:24
     */
    public static boolean isEmpty(final Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    /**
     * @Description: 判断Map集合不为空
     * @return boolean
     * @date 2017年5月30日 下午4:30:40
     */
    public static boolean isNotEmpty(final Map<?, ?> map) {
        return !isEmpty(map);
    }

    /**
     * @Description: 整形List集合转化为int数组
     * @return int[]
     * @date 2017年7月4日 下午6:49:14
     */
    public static int[] listToInArray(final List<Integer> list) {
        int[] intArry = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            intArry[i] = list.get(i);
        }
        return intArry;
    }

    /**
     * @Description: 判断是否为数字
     * @return boolean
     * @author asus
     * @date 2018年2月7日 下午4:31:56
     */
    public static boolean isNumeric(String str) {
        for (int i = str.length(); --i >= 0; ) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }



}
