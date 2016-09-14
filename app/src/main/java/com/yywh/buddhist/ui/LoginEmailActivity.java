package com.yywh.buddhist.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.yywh.buddhist.MyApp;
import com.yywh.buddhist.R;
import com.yywh.buddhist.http.XCallback;

import org.xutils.http.RequestParams;
import org.xutils.x;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 邮箱登录
 * Created by dfds on 2016/9/8.
 */
public class LoginEmailActivity extends BaseActivity {
    @BindView(R.id.et_login_email)
    EditText LoginEmail;
    @BindView(R.id.et_login_pwd)
    EditText LoginPwd;
    @BindView(R.id.btn_email_login)
    Button BtnEmailLogin;

    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.login_email;
    }

    @Override
    protected void init() {
//        BtnEmailLogin.setOnClickListener(new View.OnClickListener() {
//            private String password;
//            private String email;
//
//            @Override
//            public void onClick(View v) {
//                email = LoginEmail.getText().toString().trim();
//                password = LoginPwd.getText().toString().trim();
//
//                if (!(TextUtils.isEmpty(email) || TextUtils.isEmpty(password))) {
//                    // 执行登录逻辑
//                    Login();
//                } else {
//                    Toast.makeText(LoginEmailActivity.this, "邮箱或密码不能为空", Toast.LENGTH_SHORT).show();
//                }
//            }
//
//            private void Login() {
//                String url = "http://wx.yywhsh.com/login/login";
//                RequestQueue mRequestQueue = Volley.newRequestQueue(getApplicationContext());
//                StringRequest postRequest = new StringRequest(Request.Method.POST, url,
//                        new Response.Listener<String>() {
//                            @Override
//                            public void onResponse(String response) {
//                                if (progressDialog != null && progressDialog.isShowing()) progressDialog.dismiss();
//
//                                // response
//                                Log.d("Response", response);
//                                System.out.println("Response" + response);
//                                Intent intent = new Intent(LoginEmailActivity.this, MainActivity.class);
//
//                                startActivity(intent);
//
//                            }
//                        },
//                        new Response.ErrorListener() {
//                            @Override
//                            public void onErrorResponse(VolleyError error) {
//
//                            }
//                        }
//
//
//                ) {
//                    @Override
//                    protected Map<String, String> getParams() {
//                        Map<String, String> params = new HashMap<String, String>();
//                        params.put("userName", email);
//                        params.put("email", email);
//                        params.put("pwd", password);
//
//                        return params;
//                    }
//
//                    @Override
//                    protected Response<String> parseNetworkResponse(NetworkResponse response) {
//                        try {
//
//                            Map<String, String> responseHeaders = response.headers;
//                            String rawCookies = responseHeaders.get("Set-Cookie");
//                            System.out.println("rawCookies===" + rawCookies);
//                            String dataString = new String(response.data, "UTF-8");
//                            MyApp.setCookieValue(rawCookies);
//                            return Response.success(dataString, HttpHeaderParser.parseCacheHeaders(response));
//                        } catch (UnsupportedEncodingException e) {
//                            return Response.error(new ParseError(e));
//                        }
//                    }
//                };
//                mRequestQueue.add(postRequest);
//
//                progressDialog = new ProgressDialog(LoginEmailActivity.this);
//                progressDialog.setMessage("登录中...");
//                progressDialog.show();
//            }
//
//        });
    }

    @OnClick({R.id.btn_email_login})
    public void doClick() {
        RequestParams requestParams = new RequestParams("http://wx.yywhsh.com/login/login");
        requestParams.addParameter("userName", LoginEmail.getText().toString());
        x.http().post(requestParams, new XCallback<String, String>(this) {
            @Override
            public void onSuccess(String result) {

            }

            @Override
            public String prepare(String rawData) {
                return null;
            }
        });
        List headers = requestParams.getHeaders();

    }

}
