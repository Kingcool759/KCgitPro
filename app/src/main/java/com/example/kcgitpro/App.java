package com.example.kcgitpro;

import android.app.Application;
import android.content.Context;

/**
 * created by zhaojianwei03
 * on 2021-11-12
 * at 3:24 PM
 */
public class App extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    /**
     * 获取全局Context
     */
    public static Context getContext(){
        return mContext;
    }
}
