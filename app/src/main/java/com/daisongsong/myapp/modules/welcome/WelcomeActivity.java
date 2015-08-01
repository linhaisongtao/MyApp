package com.daisongsong.myapp.modules.welcome;

import android.os.Bundle;

import com.daisongsong.myapp.R;
import com.daisongsong.myapp.base.BaseActivity;
import com.daisongsong.myapp.utils.L;

import java.util.List;

/**
 * Created by daisong on 15/7/25.
 */
public class WelcomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        L.i(getClass().getSimpleName(), "onCreate");
    }
}
