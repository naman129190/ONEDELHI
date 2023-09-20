package com.delhitransport.onedelhi.receivers;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pj0;
import com.onedelhi.secure.w62;

public class MyApplication extends Application {

    /* renamed from: a */
    public static SharedPreferences f7204a;

    /* renamed from: a */
    public static String m8702a() {
        return String.valueOf(pj0.m61166a(-143553999247175L));
    }

    /* renamed from: b */
    public static String m8703b() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: c */
    public static String m8704c() {
        return f7204a.getString(pj0.m61166a(-143506754606919L), pj0.m61166a(-143549704279879L));
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(w62.m30702d(context));
    }

    public void onConfigurationChanged(@mr2 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w62.m30702d(this);
    }

    public void onCreate() {
        super.onCreate();
        f7204a = getSharedPreferences(pj0.m61166a(-143420855260999L), 0);
    }
}
