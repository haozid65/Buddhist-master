package com.yywh.buddhist.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间帮助类
 */
public class DateUtils {

    public static String getDate1(String sec) {
        try {
            long secLong = Long.parseLong(sec);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            return sdf.format(new Date(secLong * 1000));
        } catch (Exception e) {
        }
        return "未知";
    }

    public static String getDate2(String sec) {
        try {
            long secLong = Long.parseLong(sec);
            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
            return sdf.format(new Date(secLong * 1000));
        } catch (Exception e) {
        }
        return "未知";
    }

    public static String getDate3(String sec) {
        try {
            long secLong = Long.parseLong(sec);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            return sdf.format(new Date(secLong * 1000));
        } catch (Exception e) {
        }
        return "未知";
    }

    /**
     * 是否是未来时间
     */
    public static boolean hasFutureTime(String sec) {
        try {
            long secLong = Long.parseLong(sec);
            return secLong * 1000 > (new Date().getTime());
        } catch (Exception e) {
        }
        return false;
    }

}
