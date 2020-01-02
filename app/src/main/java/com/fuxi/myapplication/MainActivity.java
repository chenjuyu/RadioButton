package com.fuxi.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Service;
import android.content.Context;
import android.graphics.Color;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   String TAG ="MainActivity";

   private RadioGroup sex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sex =(RadioGroup) findViewById(R.id.sex);


        // 方法一监听事件,通过获取点击的id来实例化并获取选中状态的RadioButton控件
        sex.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // 获取选中的RadioButton的id
                int id = group.getCheckedRadioButtonId();
                /* 通过id实例化选中的这个RadioButton */
                RadioButton choise = (RadioButton) findViewById(id);
               // choise.setTextColor(Color.WHITE);
             //   choise.setChecked(true);
                // 获取这个RadioButton的text内容
                String output = choise.getText().toString();
                Toast.makeText(MainActivity.this, "你的性别为：" + output, Toast.LENGTH_SHORT).show();
            }
        });








    }










}
