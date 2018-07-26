package com.lcfu1.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mToastUtil=(Button)findViewById(R.id.ToastUtil);
        Button mLogUtil=(Button)findViewById(R.id.LogUtil);

        mToastUtil.setOnClickListener(this);
        mLogUtil.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.ToastUtil){
            Intent intent=new Intent(this,ToastUtilActivity.class);
            startActivity(intent);
        }else if(v.getId()==R.id.LogUtil){
            Intent intent=new Intent(this,LogUtilActivity.class);
            startActivity(intent);
        }
    }
}
