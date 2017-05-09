package com.rztong.mo.rongzitong.ui;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.rztong.mo.rongzitong.R;
import com.rztong.mo.rongzitong.base.BaseActivity;
import com.rztong.mo.rongzitong.bean.User;
import com.rztong.mo.rongzitong.databinding.ActivitySplashBinding;

public class SplashActivity extends BaseActivity {

    private User user;
    private ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splash);
        binding = DataBindingUtil.setContentView(this , R.layout.activity_splash);
        getUserInfo();
    }

    public void getUserInfo() {
        user = new User();
        user.setId("11111");
        user.setName("guiyang");
        user.setPhone("18393234234");

        setData();
    }

    private void setData() {
        binding.setUser(user);
    }

    public void btnClick(View v){
        binding.tv.setText("qwer");
    }
}
