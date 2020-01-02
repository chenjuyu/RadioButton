package com.fuxi.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TabHost;

import java.util.logging.Logger;

import androidx.annotation.Nullable;

public class TabActivity extends Activity {

    private TabHost tabHost;//声明TabHost组件的对象

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

         final  String TAG="TabActivity";

        setContentView(R.layout.activity_tab);

        tabHost=(TabHost)findViewById(android.R.id.tabhost);//获取tabHost对象
        tabHost.setup();//初始化TabHost组件

        LayoutInflater inflater=LayoutInflater.from(this);//声明并实例化一个LayoutInflater对象
        //关于LayoutInflater详细，请看我的另外一篇转载的总结
        inflater.inflate(R.layout.tab1, tabHost.getTabContentView());
        inflater.inflate(R.layout.tab2, tabHost.getTabContentView());
        inflater.inflate(R.layout.tab3, tabHost.getTabContentView());

        tabHost.addTab(tabHost.newTabSpec("tab01")
                .setIndicator("标签页一")
                .setContent(R.id.linearLayout1));//添加第一个标签页
        tabHost.addTab(tabHost.newTabSpec("tab02")
                .setIndicator("标签页二")
                .setContent(R.id.linearLayout2));//添加第二个标签页
        tabHost.addTab(tabHost.newTabSpec("tab03")
                .setIndicator("标签页三")
                .setContent(R.id.linearLayout3));//添加第三个标签页
        tabHost.setCurrentTab(0);   //防止重复点击 产生错误
    /*
        tabHost.getTabWidget().getChildAt(0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // tabHost.setCurrentTab(0);
                Log.i(TAG,"当前索引值:"+String.valueOf(tabHost.getCurrentTab()));
            }
        }); */
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                Log.i(TAG,"当前tabId索引值:"+tabId);
                Log.i(TAG,"当前索引值:"+String.valueOf(tabHost.getCurrentTab()));
            }
        });



    }
}
