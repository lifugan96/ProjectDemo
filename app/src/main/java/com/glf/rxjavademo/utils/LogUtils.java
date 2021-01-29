package com.glf.rxjavademo.utils;

import android.util.Log;

/**
 * 日志工具类
 */
public class LogUtils {

    private static int currentlev = 4;

    private static final int DEBUG_LEV = 4;

    private static final int INFO_LEV = 3;

    private static final int WARNING_LEV = 2;

    private static final int ERROR_LEV = 1;

    public static void d(Class clazz, String log) {
        if (currentlev >= DEBUG_LEV) {
            Log.d(clazz.getSimpleName(), log);
        }
    }

    public static void i(Class clazz, String log) {
        if (currentlev >= INFO_LEV) {
            Log.d(clazz.getSimpleName(), log);
        }
    }

    public static void w(Class clazz, String log) {
        if (currentlev >= WARNING_LEV) {
            Log.d(clazz.getSimpleName(), log);
        }
    }

    public static void e(Class clazz, String log) {
        if (currentlev >= ERROR_LEV) {
            Log.d(clazz.getSimpleName(), log);
        }
    }
}