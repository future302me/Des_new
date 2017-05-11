package com.rztong.mo.rongzitong.base;

import android.app.Application;
import android.content.Context;
import android.support.compat.BuildConfig;
import android.support.multidex.MultiDex;

/**
 * Created by royal on 04/05/2017.
 * The BaseApplication to maintain some global variable
 */

public class BaseApplication extends Application{

    private static boolean DEBUG = BuildConfig.DEBUG;

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    public static Context getContext(){
        return context;
    }


}
