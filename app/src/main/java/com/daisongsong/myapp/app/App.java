package com.daisongsong.myapp.app;

import android.app.Application;

import com.daisongsong.myapp.utils.L;

/**
 * Created by daisong on 15/7/26.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        L.i(getClass().getSimpleName(), "onCreate");
    }
}
