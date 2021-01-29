package com.glf.rxjavademo.app;

import android.app.Application;
import android.content.Context;


/**
 * Created by tomcat on 18/11/19.
 */

public class MyAppliaction extends Application {

    private static Context context;
    private static final String TAG = "MyApplication";


    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        initData();
    }

    private void initData() {

    }

    public static Context getContext() {
        return context;
    }
}
