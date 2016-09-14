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
import com.yywh.buddhist.http.pojo.ActivityData;
import com.yywh.buddhist.utils.DateUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 活动的adapter
 */
public class ActivityAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private List<ActivityData.ActivityBean> activities;
    private List<ActivityData.NewsBean> news;

    public ActivityAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        activities = new ArrayList<>();
        news = new ArrayList<>();
    }

    public void setAdapterData(List<ActivityData.ActivityBean> activities, List<ActivityData.NewsBean> news) {
        if (activities != null) {
            this.activities.clear();
            this.activities.addAll(activities);
        }

        if (news != null) {
            this.news.clear();
            this.news.addAll(news);
        }
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return activities.size() + news.size();
    }

    @Override
    public Object getItem(int position) {
        if (position < activities.size())
            return activities.get(position);
        else
            return news.get(position - activities.size());
    }

    @Override
    public long getItemId(int position) {
        return activities.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (getItem(position) instanceof ActivityData.ActivityBean) {
            ActivityData.ActivityBean bean = (ActivityData.ActivityBean) getItem(position);
            ActivityViewHolder vh;
            convertView = inflater.inflate(R.layout.adapter_activity_list, parent, false);
            vh = new ActivityViewHolder(convertView);

            if (position == 0) vh.tvList.setVisibility(View.VISIBLE);
            else vh.tvList.setVisibility(View.GONE);
            Glide.with(context).load(bean.getAt_logo()).into(vh.ivIcon);
            vh.tvTitle.setText(bean.getAt_name());
            vh.tvStime.setText(DateUtils.getDate1(bean.getAt_sign_time()) + " 开始");
            vh.tvEtime.setText(DateUtils.getDate1(bean.getAt_sign_end_time()) + " 结束");
            vh.tvCycle.setText(bean.getDay() + "天 " + DateUtils.getDate2(bean.getAt_start_time()) + "至" + DateUtils.getDate2(bean.getAt_end_time()));
            int count = 0;
            if (bean.getJoinNum() != null) count = bean.getJoinNum().getCount();
            vh.tvCount.setText(count + "人");
            vh.tvPlan.setText(DateUtils.hasFutureTime(bean.getAt_end_time()) ? "进行中" : "已结束");
        } else {
            ActivityData.NewsBean bean = (ActivityData.NewsBean) getItem(position);
            convertView = inflater.inflate(R.layout.adapter_news_list, parent, false);
            NewsViewHolder vh = new NewsViewHolder(convertView);
            if (position == activities.size()) vh.tvList.setVisibility(View.VISIBLE);
            else vh.tvList.setVisibility(View.GONE);
            vh.tvTitle.setText(bean.getNew_title());
            vh.tvDate.setText(DateUtils.getDate3(bean.getNew_time()));
            vh.tvTemple.setText("[ " +bean.getRaiseList().getTp_name() + " ]");
            vh.tvContent.setText(bean.getNew_content());
            vh.tvCount.setText("阅读 " + bean.getNew_count());
        }

        return convertView;
    }


    static class ActivityViewHolder {

        @BindView(R.id.tv_list)
        TextView tvList;
        @BindView(R.id.iv_icon)
        ImageView ivIcon;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.tv_stime)
        TextView tvStime;
        @BindView(R.id.tv_etime)
        TextView tvEtime;
        @BindView(R.id.tv_cycle)
        TextView tvCycle;
        @BindView(R.id.tv_count)
        TextView tvCount;
        @BindView(R.id.tv_plan)
        TextView tvPlan;

        ActivityViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

    static class NewsViewHolder {
        @BindView(R.id.tv_list)
        TextView tvList;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.tv_temple)
        TextView tvTemple;
        @BindView(R.id.tv_date)
        TextView tvDate;
        @BindView(R.id.tv_content)
        TextView tvContent;
        @BindView(R.id.tv_count)
        TextView tvCount;


        NewsViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
