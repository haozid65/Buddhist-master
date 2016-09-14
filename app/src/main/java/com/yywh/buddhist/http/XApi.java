package com.yywh.buddhist.http;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.Iterator;
import java.util.Map;

/**
 * xutils请求
 */
public class XApi {

    public static void get(String url, XCallback callback) {
        RequestParams requestParams = new RequestParams(url);
        x.http().get(requestParams, callback);
    }


    public static void post(String url, Map<String, Object> params, XCallback callback) {
        RequestParams requestParams = new RequestParams(url);
        requestParams.setBodyContent(getBodyContent(params));
        x.http().post(requestParams, callback);
    }

    private static String getBodyContent(Map<String, Object> params) {
        if (null != params) {
            JSONObject result = new JSONObject();
            Iterator<Map.Entry<String, Object>> it = params.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Object> entity = it.next();
                result.put(entity.getKey(), entity.getValue());
            }
            return result.toJSONString();
        }
        return null;
    }


    /**
     * 解析服务器返回过来的数据方法
     *
     * @param result response data
     * @param dataClass data实体类class对象
     * @param <T> 泛型 指向dataClass
     * @return
     */
    public static <T> T getRespResult(String result, Class<T> dataClass) {
        T body;
        try {
            body = (T) JSON.parseObject(result, dataClass);
        } catch (Exception e) {
            e.printStackTrace();
            body = null;
        }
        return body;
    }

}
