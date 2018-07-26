package com.lcfu1.sample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.lcfu1.utilslib.ToastUtil;

public class ToastUtilActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_util);

        Button success = (Button) findViewById(R.id.success);
        success.setOnClickListener(this);

        Button error = (Button) findViewById(R.id.error);
        error.setOnClickListener(this);

        Button info = (Button) findViewById(R.id.info);
        info.setOnClickListener(this);

        Button warning = (Button) findViewById(R.id.warning);
        warning.setOnClickListener(this);

        Button normal = (Button) findViewById(R.id.normal);
        normal.setOnClickListener(this);

        Button custom = (Button) findViewById(R.id.custom);
        custom.setOnClickListener(this);

        ToastUtil.Config.reset();//重置配置
//        ToastUtil.Config.getInstance()
//                .setSuccessColor(Color.parseColor("#FFAA91"))
//                .setErrorColor(Color.parseColor("#FF545D"))
//                .setInfoColor(Color.parseColor("#B99FFF"))
//                .setWarningColor(Color.parseColor("#FEFF82"))
//                .setTextColor(Color.parseColor("#4CFF79"))//设置文本的颜色
//                .tintIcon(true)//设置Icon是否与文本颜色一致
//                .setToastTypeface(Typeface.DEFAULT)//设置文本的字体样式
//                .setTextSize(18)//设置文本的字体大小
//                .apply();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.success) {
            ToastUtil.success(this, "success!").show();
        } else if (id == R.id.error) {
            ToastUtil.error(this, "error!").show();
        } else if (id == R.id.info) {
            ToastUtil.info(this, "info!").show();
        }
        if (id == R.id.warning) {
            ToastUtil.warning(this, "warning!").show();
        }
        if (id == R.id.normal) {
            ToastUtil.normal(this, "normal!", 0, R.drawable.check).show();
        }
        if (id == R.id.custom) {
            ToastUtil.custom(this, "custom!", R.drawable.check, Color.RED, 1000, true, true).show();
        }
    }
}
