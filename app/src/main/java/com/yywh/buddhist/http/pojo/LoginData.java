package com.yywh.buddhist.http.pojo;

/**
 * 邮箱登录
 */
public class LoginData {

    private int statu;

    private String message;

    private String uid;

    public int getStatu() {
        return statu;
    }

    public void setStatu(int statu) {
        this.statu = statu;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
