package com.zet.learncommonadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import com.zet.learncommonadapter.adapter.CommonAdapter;
import com.zet.learncommonadapter.adapter.ViewHolder;

import java.util.ArrayList;
import java.util.List;

import static com.zet.learncommonadapter.R.id.mTvTitle;

/**
 * 主活动
 */
public class MainActivity extends AppCompatActivity {

    /**
     * 列表视图
     */
    private ListView mLvMain;
    /**
     * 数据集合
     */
    private List<String> mList = new ArrayList<>();
//    /**
//     * 适配器
//     */
//    private MyAdapter mMyAdapter;

    /**
     * 创建
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
//        initField();
        initData();

        viewBindingData();
    }

    /**
     * 视图绑定数据
     */
    private void viewBindingData() {
        mLvMain.setAdapter(new CommonAdapter<String>(MainActivity.this, mList, R.layout.item_textview) {
            @Override
            protected void convert(ViewHolder viewHolder, String s) {
                viewHolder.<TextView>getView(mTvTitle).setText(s);
            }
        });
    }

    /**
     * 初始化数据
     */
    private void initData() {
        for (int i = 0; i < 20; i++) {
            mList.add("hello" + i);
        }
    }

//    /**
//     * 初始化变量
//     */
//    private void initField() {
//        mMyAdapter = new MyAdapter(MainActivity.this, mList);
//    }

    /**
     * 初始化视图
     */
    private void initView() {
        mLvMain = (ListView) findViewById(R.id.mLvMain);
    }
}
