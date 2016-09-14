package com.yywh.buddhist.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yywh.buddhist.R;
import com.yywh.buddhist.http.pojo.SearchData;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 */
public class SearchAdapter extends BaseAdapter {

    private List<SearchData.TemplesAllBean> data;
    private Context context;

    public SearchAdapter(Context context) {
        this.context = context;
        data = new ArrayList<>();
    }

    public void setData(List<SearchData.TemplesAllBean> data) {
        if (data == null) return;
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public SearchData.TemplesAllBean getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_search, parent, false);
            vh = new ViewHolder(convertView);
            convertView.setTag(vh);
        } else vh = (ViewHolder) convertView.getTag();

        SearchData.TemplesAllBean item = getItem(position);
        Glide.with(context).load(item.getTp_logo()).into(vh.ivTemple);
        vh.tvTempleName.setText(item.getTp_name());
        vh.tvTempleAddr.setText(item.getTemplePro().getArea_name() + item.getTempleCity().getArea_name());

        return convertView;
    }


    static class ViewHolder {
        @BindView(R.id.iv_temple)
        ImageView ivTemple;
        @BindView(R.id.tv_temple_name)
        TextView tvTempleName;
        @BindView(R.id.tv_temple_addr)
        TextView tvTempleAddr;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
