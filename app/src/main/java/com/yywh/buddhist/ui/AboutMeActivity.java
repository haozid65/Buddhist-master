package com.yywh.buddhist.ui;

/**
 * Created by dfds on 2016/9/9.
 */

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.yywh.buddhist.R;

public class AboutMeActivity extends Activity implements OnItemClickListener, OnScrollListener {

    private ListView lv;
    public static final String[] names = {"关注法师", "关注寺庙", "我的活动", "祈福供养", "问答记录", "个人信息", "新闻收藏"};
    public static final int[] imageIds = {R.mipmap.icon_01, R.mipmap.icon_02, R.mipmap.icon_03,
            R.mipmap.icon_04, R.mipmap.icon_05, R.mipmap.icon_06, R.mipmap.icon_11};
    private List<Map<String, Object>> dataList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_me);

        lv = (ListView) findViewById(R.id.listView);
        dataList = new ArrayList<Map<String, Object>>();

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, getData(), R.layout.item_myinfo, new String[]{"pic", "text"}, new int[]{R.id.imageView2, R.id.iv_head_title});

        lv.setAdapter(simpleAdapter);
        lv.setOnItemClickListener(this);
        lv.setOnScrollListener(this);

    }

    private List<Map<String, Object>> getData() {

//        for (int i = 0; i < imageIds.length; i++) {
//            List<ImageView> mImageList = new ArrayList<ImageView>();
//            ImageView iv = new ImageView(this);
//            iv.setImageResource(imageIds[i]);
//
//            TextView tv = new TextView(this);
//            tv.setText(names[i]);
//
//            mImageList.add(iv);
//
//        }

        for (int i = 0; i < names.length; i++) {
//            ImageView iv = new ImageView(this);
//
//            TextView tv = new TextView(this);


            Map<String, Object> map = new HashMap<String, Object>();
            map.put("pic", imageIds[i]);
            map.put("text", names[i]);


            dataList.add(map);
        }
        return dataList;


    }

    @Override
    public void onScroll(AbsListView arg0, int arg1, int arg2, int arg3) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onScrollStateChanged(AbsListView arg0, int arg1) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, H5Activity.class);
        intent.putExtra(H5Activity.KEY_TYPE, 5 + position);
        startActivity(intent);
    }


}

