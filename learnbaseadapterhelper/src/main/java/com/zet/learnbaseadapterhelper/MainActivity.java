package com.zet.learnbaseadapterhelper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.joanzapata.android.BaseAdapterHelper;
import com.joanzapata.android.QuickAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mLvMain;
    private List<String> mList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();

        viewBindingData();
    }

    private void viewBindingData() {
        mLvMain.setAdapter(new QuickAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, mList) {
            @Override
            protected void convert(BaseAdapterHelper helper, String item) {
                helper.setText(android.R.id.text1, item);
            }
        });
    }

    private void initData() {
        for (int i = 0; i < 20; i++) {
            mList.add("hello" + i);
        }
    }

    private void initView() {
        mLvMain = (ListView) findViewById(R.id.mLvMain);
    }
}
