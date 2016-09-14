package com.yywh.buddhist.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yywh.buddhist.R;
import com.yywh.buddhist.http.pojo.RaiseData;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 *
 */
public class RaiseAdapter extends BaseAdapter {

    private List<RaiseData.RaisesBean> data;
    private Context context;


    public RaiseAdapter(Context context) {
        this.context = context;
        data = new ArrayList<>();
    }

    public void setAdapterData(List<RaiseData.RaisesBean> adapterData) {
        this.data = adapterData;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public RaiseData.RaisesBean getItem(int position) {
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
            convertView = LayoutInflater.from(context).inflate(R.layout.adapter_raise_list, parent, false);
            vh = new ViewHolder(convertView);
            convertView.setTag(vh);
        } else vh = (ViewHolder) convertView.getTag();

        RaiseData.RaisesBean item = getItem(position);

        Glide.with(context).load(item.getRa_logo()).into(vh.ivIcon);
        vh.tvTitle.setText(item.getRa_name());
        vh.tvCount.setText("发心" + item.getFundraising().getCount() + "人");
        vh.tvTemple.setText(item.getRaiseList().getTp_name());

        vh.progress.setMax((int)(Double.parseDouble(item.getRa_amount())));
        vh.progress.setProgress((int) item.getFundraising().getMoney());

        vh.tvProgress.setText(item.getFundraising().getMoney() + "元 / " + item.getRa_amount() + "元");

        return convertView;
    }


    static class ViewHolder {
        @BindView(R.id.iv_icon)
        ImageView ivIcon;
        @BindView(R.id.tv_temple)
        TextView tvTemple;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.progress)
        ProgressBar progress;
        @BindView(R.id.tv_progress)
        TextView tvProgress;
        @BindView(R.id.tv_count)
        TextView tvCount;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
