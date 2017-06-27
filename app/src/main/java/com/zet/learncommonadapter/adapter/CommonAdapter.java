package com.zet.learncommonadapter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Zet on 2017/6/27.
 * 通用适配器
 */

public abstract class CommonAdapter<T> extends BaseAdapter {

    protected LayoutInflater mLayoutInflater;
    protected Context mContext;
    protected List<T> mList;
    protected final int mItemLayoutId;

    public CommonAdapter(Context context, List<T> list, int itemLayoutId) {
        this.mLayoutInflater = LayoutInflater.from(context);
        this.mContext = context;
        this.mList = list;
        this.mItemLayoutId = itemLayoutId;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public T getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder = ViewHolder.get(mContext, convertView, parent, mItemLayoutId, position);
        convert(viewHolder, mList.get(position));
        return viewHolder.getConvertView();
    }

    protected abstract void convert(ViewHolder viewHolder, T t);

}
