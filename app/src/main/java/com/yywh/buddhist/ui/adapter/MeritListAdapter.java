package com.yywh.buddhist.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.yywh.buddhist.R;
import com.yywh.buddhist.http.pojo.HomeData;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 功绩adapter
 */
public class MeritListAdapter extends BaseAdapter {

    private Context context;
    private List<HomeData.MeritListBean> list;

    public MeritListAdapter(Context context) {
        this.context = context;
        list = new ArrayList<>();
    }

    public void setData(List<HomeData.MeritListBean> data) {
        this.list = data;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        if (list.size() == 0)
            return 0;
        else
            return Integer.MAX_VALUE;
    }

    @Override
    public HomeData.MeritListBean getItem(int position) {
        return list.get(position % list.size());
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_merit_list, parent, false);
            vh = new ViewHolder(convertView);
            convertView.setTag(vh);
        } else vh = (ViewHolder) convertView.getTag();

        HomeData.MeritListBean item = getItem(position);

        vh.text3.setText(item.getOrder_money() + "元");
        vh.text2.setText(item.getRecord().getMu_username());

        return convertView;
    }


    static class ViewHolder {
        @BindView(R.id.text1)
        TextView text1;
        @BindView(R.id.text2)
        TextView text2;
        @BindView(R.id.text3)
        TextView text3;
        @BindView(R.id.text4)
        TextView text4;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
