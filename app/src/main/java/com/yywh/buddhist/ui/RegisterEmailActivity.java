package com.yywh.buddhist.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.yywh.buddhist.R;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;

/**
 * Created by haozid on 2016/9/8.
 */
public class RegisterEmailActivity extends BaseActivity {
    @BindView(R.id.et_registered_email)
    EditText regEmail;
    @BindView(R.id.et_registered_pwd)
    EditText regPwd;
    @BindView(R.id.btn_email_registered)
    Button BtnEmailReg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.register_email;
    }

    @Override
    protected void init() {
        BtnEmailReg.setOnClickListener(new View.OnClickListener() {
            private String password;
            private String email;

            @Override
            public void onClick(View v) {
                email = regEmail.getText().toString().trim();
                password = regPwd.getText().toString().trim();

                if (!(TextUtils.isEmpty(email) || TextUtils.isEmpty(password))) {
                    // 执行注册逻辑
                    register();

                } else {
                    Toast.makeText(RegisterEmailActivity.this, "邮箱或密码不能为空", Toast.LENGTH_SHORT).show();
                }
            }

            private void register() {
                String url = "http://wx.yywhsh.com/login/register";
                RequestQueue mRequestQueue = Volley.newRequestQueue(getApplicationContext());
                StringRequest postRequest = new StringRequest(Request.Method.POST, url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                // response
                                System.out.println("Response" + response);
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                // error
                                Log.d("Error.Response", error.getMessage());
                                System.out.println("Error.Response" + error.getMessage());
                            }
                        }
                ) {
                    @Override
                    protected Map<String, String> getParams() {
                        Map<String, String> params = new HashMap<String, String>();
                        params.put("userName", email);
                        params.put("email", email);
                        params.put("pwd", password);

                        return params;
                    }
                };
                mRequestQueue.add(postRequest);

            }
        });
    }
}
