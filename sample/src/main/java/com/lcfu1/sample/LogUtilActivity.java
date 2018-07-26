package com.lcfu1.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lcfu1.utilslib.LogUtil;


public class LogUtilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_util);

        LogUtil.close();

        LogUtil.v("------v-----","verbose");
        LogUtil.d("------d-----","debug");
        LogUtil.i("------i-----","info");
        LogUtil.w("------w-----","warn");
        LogUtil.e("------e-----","error");
    }
}
