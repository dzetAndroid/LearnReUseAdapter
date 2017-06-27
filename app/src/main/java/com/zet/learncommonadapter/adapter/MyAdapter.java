package com.zet.learncommonadapter.adapter;

import android.content.Context;
import android.widget.TextView;

import com.zet.learncommonadapter.R;

import java.util.List;

/**
 * Created by Zet on 2017/6/27.
 * 废弃
 */

public class MyAdapter extends CommonAdapter<String> {

    public MyAdapter(Context context, List<String> list, int itemLayoutId) {
        super(context, list, itemLayoutId);
    }

//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        ViewHolder viewHolder = ViewHolder.get(mContext, convertView, parent, R.layout.item_textview, position);
//        TextView mTvTitle = viewHolder.getView(R.id.mTvTitle);
//
//        String s = mList.get(position);
//        mTvTitle.setText(s);
//
//        return viewHolder.getConvertView();
//    }

    @Override
    protected void convert(ViewHolder viewHolder, String s) {
        TextView mTvTitle = viewHolder.getView(R.id.mTvTitle);
        mTvTitle.setText(s);
    }

    //    /**
//     * 布局解析器
//     */
//    private LayoutInflater mLayoutInflater;
//    /**
//     * 上下文
//     */
//    private Context mContext;
//    /**
//     * 数据集合
//     */
//    private List<String> mList;
//
//    /**
//     * 适配器构造
//     *
//     * @param context 上下文
//     * @param list    数据集合
//     */
//    public MyAdapter(Context context, List<String> list) {
//        this.mLayoutInflater = LayoutInflater.from(context); // 从上下文中获取视图解析器
//        mContext = context;
//        mList = list;
//    }
//
//    /**
//     * 获取数据数量
//     *
//     * @return 数据数量
//     */
//    @Override
//    public int getCount() {
//        return this.mList.size(); // 内部已做处理, 若为0, 则返回0
//    }
//
//    /**
//     * 根据下标获取数据
//     *
//     * @param position 下标
//     * @return 数据
//     */
//    @Override
//    public Object getItem(int position) {
//        return this.mList.get(position);
//    }
//
//    /**
//     * 获取下标
//     *
//     * @param position 下标
//     * @return 下标
//     */
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//    /**
//     * 获取要显示数据的视图
//     *
//     * @param position    下标
//     * @param convertView 缓存视图
//     * @param parent      父容器
//     * @return 显示数据的视图
//     */
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
////        ViewHolder viewHolder = null; // 新建一个view holder = null
////        if (convertView == null) { // if convert view == null
////            // 布局解析重新解析布局, 并赋值给convert view
////            convertView = mLayoutInflater.inflate(R.layout.item_textview, parent, false);
////            viewHolder = new ViewHolder(); // 实例化view holder
////            // 接下来就是视图控件与view holder控件字段进行绑定
////            viewHolder.mTvTitle = (TextView) convertView.findViewById(R.id.mTvTitle);
////
////            // convert view存放view holder, 以便下次使用
////            convertView.setTag(viewHolder);
////        } else { // convert view != null
////            // convert view获取view holder
////            viewHolder = (ViewHolder) convertView.getTag();
////        }
////
////        // 保证了view holder控件字段不为空的前提之下，进行视图控件和数据的绑定==》控件显示数据
////        String s = this.mList.get(position);
////        viewHolder.mTvTitle.setText(s);
////
////        return convertView; // 返回绑定好数据的视图
//        ViewHolder viewHolder = ViewHolder.get(mContext, convertView, parent, R.layout.item_textview, position);
//        TextView mTvTitle = viewHolder.getView(R.id.mTvTitle);
//
//        String s = mList.get(position);
//        mTvTitle.setText(s);
//
//        return viewHolder.getConvertView();
//    }
//
////    private final class ViewHolder {
////        TextView mTvTitle;
////    }

}
