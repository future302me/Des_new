package com.rztong.mo.rongzitong.ui;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.rztong.mo.rongzitong.R;
import com.rztong.mo.rongzitong.base.BaseActivity;
import com.rztong.mo.rongzitong.databinding.ActivitySplashBinding;

public class SplashActivity extends BaseActivity {


    private ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splash);
        binding = DataBindingUtil.setContentView(this , R.layout.activity_splash);

    }


    private void sendAdInfoReq(){
        
    }
}
