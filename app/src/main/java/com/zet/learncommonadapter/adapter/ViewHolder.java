package com.zet.learncommonadapter.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Zet on 2017/6/27.
 * 通用View Holder
 */

public class ViewHolder {
    /**
     * 视图控件数组
     */
    private final SparseArray<View> mViews = new SparseArray<>();
    /**
     * 视图，子项视图，列表视图中要显示的子项视图
     */
    private View mConvertView;
    private int mPosition;

    /**
     * View Holder构造函数
     *
     * @param context   上下文
     * @param viewGroup 父容器，一般指列表视图
     * @param layoutId  子项视图layoutId
     * @param position  列表中其中一项的下标
     */
    public ViewHolder(Context context, ViewGroup viewGroup, int layoutId, int position) {
        this.mPosition = position;
        this.mConvertView = LayoutInflater.from(context).inflate(layoutId, viewGroup, false);
        this.mConvertView.setTag(this);
    }

    /**
     * 获取View Holder
     *
     * @param context     上下文
     * @param convertView 子项视图，已处理好数据的
     * @param parent      父容器
     * @param layoutId    子项视图layoutId
     * @param position    列表中其中一项的下标
     * @return VIew Holder
     */
    public static ViewHolder get(Context context, View convertView, ViewGroup parent, int layoutId, int position) {
        if (convertView == null) {
            return new ViewHolder(context, parent, layoutId, position);
        }
        return (ViewHolder) convertView.getTag();
    }

    /**
     * 获取子项视图中的控件View
     *
     * @param viewId 视图控件id
     * @param <T>    泛型
     * @return 控件View
     */
    public <T extends View> T getView(int viewId) {
        View view = mViews.get(viewId); // 从数组中获取
        if (view == null) { // if == null
            view = mConvertView.findViewById(viewId); // findviewbyid
            mViews.put(viewId, view); // 放入数组中
        }
        return (T) view; // if != null，直接返回该View
    }

    /**
     * 获取子项视图
     *
     * @return
     */
    public View getConvertView() {
        return mConvertView;
    }

    /**
     * 获取下标
     *
     * @return
     */
    public int getPosition() {
        return this.mPosition;
    }

    public ViewHolder setText(int viewId, String text) {
        TextView textView = getView(viewId);
        textView.setText(text);
        return this;
    }

    public ViewHolder setImageResource(int viewId, int drawabledId) {
        ImageView imageView = getView(viewId);
        imageView.setImageResource(drawabledId);
        return this;
    }

    public ViewHolder setImageBitmap(int viewId, Bitmap bitmap) {
        ImageView imageView = getView(viewId);
        imageView.setImageBitmap(bitmap);
        return this;
    }

    public ViewHolder setImageByUrl(int viewId, String imageUrl) {

        return this;
    }

}
