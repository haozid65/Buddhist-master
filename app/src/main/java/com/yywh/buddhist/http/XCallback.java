package com.yywh.buddhist.http;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.util.Log;

import org.xutils.common.Callback;

import java.lang.ref.WeakReference;

/**
 * xutils网络访问的回调方法
 * pageRef用于判断网络结束的标记
 * 比如传递的是activity 当activity finish相应要结束网络请求
 *
 */
public abstract class XCallback<Prepare, Result> implements Callback.PrepareCallback<Prepare, Result>, Callback.Cancelable {

    private boolean cancelled = false;

    private final WeakReference<Object> pageRef;

    public XCallback(Object page) {
        this.pageRef = new WeakReference<Object>(page);
    }

    @Override
    public void cancel() {
        cancelled = true;
    }

    @Override
    public boolean isCancelled() {
        if (cancelled) return true;
        else {
            Object page = pageRef.get();
            if (page == null) return true;

            if (page instanceof Activity) {
                return ((Activity) page).isFinishing();
            } else if (page instanceof Fragment) {
                return ((Fragment) page).isDetached();
            } else if (page instanceof  android.app.Fragment) {
                return ((android.app.Fragment) page).isDetached();
            } else if (page instanceof Dialog) {
                boolean b = !((Dialog) page).isShowing();
                return !((Dialog) page).isShowing();
            } else if (page instanceof DialogFragment) {
                return ((DialogFragment) page).isCancelable();
            } else if (page instanceof android.support.v4.app.DialogFragment) {
                return ((android.support.v4.app.DialogFragment) page).isCancelable();
            }
        }
        return false;
    }

    @Override
    public void onCancelled(CancelledException e) {

    }

    @Override
    public void onError(Throwable throwable, boolean b) {

    }

    @Override
    public void onFinished() {
    }

}
