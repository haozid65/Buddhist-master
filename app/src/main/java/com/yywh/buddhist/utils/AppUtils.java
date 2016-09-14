package com.yywh.buddhist.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;

public class AppUtils {

    /**
     * 获取app版本名
     */
    public static String getVersionName(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            //获取包信息
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            String versionName = packageInfo.versionName;
            return versionName;
        } catch (PackageManager.NameNotFoundException e) {
            //没有找到包名或者包名错误走此异常
            e.printStackTrace();
        }
        return "1.0";
    }

    /**
     * 隐藏软键盘
     * @param activity
     * @param view
     */
    public static void hideSoftInput(Activity activity, View view) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }


    /**
     *同步cookie
     * @param context
     * @param url
     */
    public static void synCookies(Context context, String url,String cookieValue) {
        CookieSyncManager.createInstance(context);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setCookie(url,cookieValue);
        CookieSyncManager.getInstance().sync();
    }

    /**
     * 移除cookie
     * @param context
     */
    private void removeCookie(Context context) {
        CookieSyncManager.createInstance(context);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookie();
        CookieSyncManager.getInstance().sync();
    }
}
