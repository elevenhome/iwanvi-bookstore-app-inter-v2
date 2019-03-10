package com.iwanvi.bookstore.appinterv2.common;

/**
 * @Description 缓存设置相关常量类
 * @Auth zzw
 * @Date 2018年11月29日10:53:07
 */
public class RedisConstant {

    /**
     * @Description 缓存有效时间(单位：秒)
     * @Auth zzw
     * @Date 2018年11月29日10:53:07
     */
    public static final class Expire {
        public static final long MINUTE =  60;//1分钟
        public static final long MINUTE_TWO =  120; // 2分钟 60*2
        public static final long MINUTE_THR =  180; // 3分钟 60*3
        public static final long MINUTE_FIV =  300; // 5分钟 60*5
        public static final long MINUTE_TEN =  600; // 10分钟 60*10
        public static final long MINUTE_THIRTY =  1800; // 30分钟 60*30
        public static final long HOUR = 3600;//1小时 60*60*1
        public static final long HOUR_TWO = 7200;//2小时  60*60*2
        public static final long HOUR_FOUR = 14400;//4小时
        public static final long DAY = 86400;//1天 60*60*24
        public static final long DAY_TWO = 172800;//2天 60*60*24*2
        public static final long WEEK = 604800;//1周 60*60*24*7
        public static final long MONTH = 2592000;//1月 60*60*24*30
        public static final long YEAR = 31536000;//1年 60*60*24*365
    }


    /**
     * @Description 图书中心图书相关缓存KEY
     * @Auth zzw
     * @Date 2018年11月29日10:53:07
     */
    public static final class Book{
        //下架图书ID缓存 (bookId)
        public static final String bc_book_off_line = "bc_book_off_line_%s";
        //图书信息缓存(bookId)
        public static final String bc_book_info = "bc_book_info_%s";
        //卷列表 (bookId)
        public static final String bc_book_volu_list = "bc_book_volu_list_%s";
        //章节列表 (bookId)
        public static final String bc_book_chap_list = "bc_book_chap_list_%s";
        //图书的最大章节信息 （bookId）
        public static final String bc_book_chap_max = "bc_book_chap_max_%s";
        //图书的章节总数 （bookId）
        public static final String bc_book_chap_sum = "bc_book_chap_sum_%s";
        //图书免费章节总数 （bookId）
        public static final String bc_book_chap_free_sum = "bc_book_chap_free_sum_%s";

        //卷信息（卷ID）
        public static final String bc_volu_info = "bc_volu_info_%s";
        //章节列表 （卷ID）
        public static final String bc_volu_chap_list = "bc_volu_chap_list_%s";

        //章节信息 (章节ID)
        public static final String bc_chap_info = "bc_chap_info_%s";
        //章节内容 (章节内容)
        public static final String bc_chap_cont_info = "bc_chap_cont_info_%s";
    }


    /**
     * @Description 获取KEY-图书下架状态
     * @Author zzw
     * @Date 2018年8月11日14:26:28
     */
    public static String getKeyBookOffLine(final String bookId){
        return String.format(RedisConstant.Book.bc_book_off_line,bookId);
    }

    /**
     * @Description 获取KEY-图书信息
     * @Author zzw
     * @Date 2018年8月11日14:26:28
     */
    public static String getKeyBookInfo(final String bookId){
        return String.format(RedisConstant.Book.bc_book_info,bookId);
    }

    /**
     * @Description 获取KEY-最大章节信息-bookId
     * @Author zzw
     * @Date 2018年8月11日14:26:28
     */
    public static String getKeyBookChapMax(final String bookId){
        return String.format(RedisConstant.Book.bc_book_chap_max,bookId);
    }

    /**
     * @Description 获取KEY-图书免费章节数量
     * @Author zzw
     * @Date 2018年8月11日14:26:28
     */
    public static String getKeyBookChapFreeSum(final String bookId){
        return String.format(RedisConstant.Book.bc_book_chap_free_sum,bookId);
    }

    /**
     * @Description 获取KEY-卷列表
     * @Author zzw
     * @Date 2018年8月11日14:26:28
     */
    public static String getKeyBookVoluList(final String bookId){
        return String.format(RedisConstant.Book.bc_book_volu_list,bookId);
    }

    /**
     * @Description 获取KEY-章节列表-bookId
     * @Author zzw
     * @Date 2018年8月11日14:26:28
     */
    public static String getKeyBookChapList(final String bookId){
        return String.format(RedisConstant.Book.bc_book_chap_list,bookId);
    }

    /**
     * @Description 获取KEY-图书章节数量
     * @Author zzw
     * @Date 2018年8月11日14:26:28
     */
    public static String getKeyBookChapSum(final String bookId){
        return String.format(RedisConstant.Book.bc_book_chap_sum,bookId);
    }

    /**
     * @Description 获取KEY-卷信息
     * @Author zzw
     * @Date 2018年8月11日14:26:28
     */
    public static String getKeyVoluInfo(final String voluId){
        return String.format(RedisConstant.Book.bc_volu_info,voluId);
    }

    /**
     * @Description 获取KEY-章节列表-voluId
     * @Author zzw
     * @Date 2018年8月11日14:26:28
     */
    public static String getVoluChapList(final String voluId){
        return String.format(RedisConstant.Book.bc_volu_chap_list,voluId);
    }

    /**
     * @Description 获取KEY-章节信息
     * @Author zzw
     * @Date 2018年8月11日14:26:28
     */
    public static String getKeyChapInfo(final String chapId){
        return String.format(RedisConstant.Book.bc_chap_info,chapId);
    }

    /**
     * @Description 获取KEY-章节内容
     * @Author zzw
     * @Date 2018年8月11日14:26:28
     */
    public static String getKeyChapContInfo(final String chapId){
        return String.format(RedisConstant.Book.bc_chap_cont_info,chapId);
    }




}
