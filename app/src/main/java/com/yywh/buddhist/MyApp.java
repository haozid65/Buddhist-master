package com.yywh.buddhist;

import android.app.Application;

import com.umeng.socialize.PlatformConfig;

import org.xutils.x;

/**
 *
 */
public class MyApp extends Application {

    public  static String cookieValue;

    @Override
    public void onCreate() {
        super.onCreate();

        // 初始化xUtils3框架
        x.Ext.init(this);

        // umeng initialize
//        PlatformConfig.setWeixin("wx8d3275dc2708f9b9", "215618469df5901b55b5035ee9bc887f"); //微信 appid appsecret
        PlatformConfig.setWeixin("wxd78500b5bf0ed3a1", "cde3e58336b35d8f849ece0560b13a37"); //微信 appid appsecret
        PlatformConfig.setQQZone("1105666148", "0bX6Bgu9S36GdaCA"); //QQ appid appsecret
        PlatformConfig.setSinaWeibo("2290801157","7e27f536443c2e1528f01cbf598ae32a");   //新浪微博 appkey appsecret
    }

    public  static String getCookieValue() {
        return cookieValue;
    }

    public static void setCookieValue(String cookie) {
        cookieValue = cookie;
    }
}




//package com.yywh.buddhist;
//
//import android.app.Application;
//
//import com.umeng.socialize.PlatformConfig;
//
//import org.xutils.x;
//
///**
// *
// */
//public class MyApp extends Application {
//
//    @Override
//    public void onCreate() {
//        super.onCreate();
//
//        // 初始化xUtils3框架
//        x.Ext.init(this);
//
//        // umeng initialize
////        PlatformConfig.setWeixin("wx8d3275dc2708f9b9", "215618469df5901b55b5035ee9bc887f"); //微信 appid appsecret
//        PlatformConfig.setWeixin("wxd78500b5bf0ed3a1", "cde3e58336b35d8f849ece0560b13a37"); //微信 appid appsecret
//        PlatformConfig.setQQZone("1105666148", "0bX6Bgu9S36GdaCA"); //QQ appid appsecret
//        PlatformConfig.setSinaWeibo("2290801157","7e27f536443c2e1528f01cbf598ae32a");   //新浪微博 appkey appsecret
//    }
//}
