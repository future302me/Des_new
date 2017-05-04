package com.rztong.mo.rongzitong.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by royal on 04/05/2017.
 * The base Activity
 */

public class BaseActivity extends AppCompatActivity{

    private String tag;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tag = this.getClass().getSimpleName().toString();
    }
}
