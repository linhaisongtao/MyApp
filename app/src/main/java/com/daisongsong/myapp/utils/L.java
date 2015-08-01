package com.daisongsong.myapp.utils;

import android.util.Log;

/**
 * Created by daisong on 15/7/25.
 */
public class L {
    private static boolean DEBUG = true;

    public static void i(String tag, String pattern, Object... objects) {
        if (DEBUG) {
            Log.i(tag, String.format(pattern, objects));
        }
    }
}
