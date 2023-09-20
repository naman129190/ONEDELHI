package com.onedelhi.secure;

import android.content.Context;
import android.content.SharedPreferences;

public final class m73 {

    /* renamed from: a */
    public static final String f32052a = "com.google.firebase.messaging";

    /* renamed from: a */
    public static SharedPreferences m56964a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    @ly4
    /* renamed from: b */
    public static boolean m56965b(Context context) {
        return m56964a(context).getBoolean("proxy_notification_initialized", false);
    }

    @ly4
    /* renamed from: c */
    public static void m56966c(Context context, boolean z) {
        SharedPreferences.Editor edit = m56964a(context).edit();
        edit.putBoolean("proxy_notification_initialized", z);
        edit.apply();
    }
}
