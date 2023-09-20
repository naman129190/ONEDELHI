package com.onedelhi.secure;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

public class md0 {

    /* renamed from: a */
    public static final String f32076a = "com.google.firebase.common.prefs:";
    @hw4

    /* renamed from: b */
    public static final String f32077b = "firebase_data_collection_default_enabled";

    /* renamed from: a */
    public final Context f32078a;

    /* renamed from: a */
    public final SharedPreferences f32079a;

    /* renamed from: a */
    public final a83 f32080a;

    /* renamed from: a */
    public boolean f32081a = mo40538c();

    public md0(Context context, String str, a83 a83) {
        Context a = m57026a(context);
        this.f32078a = a;
        this.f32079a = a.getSharedPreferences(f32076a + str, 0);
        this.f32080a = a83;
    }

    /* renamed from: a */
    public static Context m57026a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : r70.m26349b(context);
    }

    /* renamed from: b */
    public synchronized boolean mo40537b() {
        return this.f32081a;
    }

    /* renamed from: c */
    public final boolean mo40538c() {
        return this.f32079a.contains(f32077b) ? this.f32079a.getBoolean(f32077b, true) : mo40539d();
    }

    /* renamed from: d */
    public final boolean mo40539d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f32078a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f32078a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(f32077b)) {
                return true;
            }
            return applicationInfo.metaData.getBoolean(f32077b);
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: e */
    public synchronized void mo40540e(Boolean bool) {
        boolean equals;
        if (bool == null) {
            this.f32079a.edit().remove(f32077b).apply();
            equals = mo40539d();
        } else {
            equals = Boolean.TRUE.equals(bool);
            this.f32079a.edit().putBoolean(f32077b, equals).apply();
        }
        mo40541f(equals);
    }

    /* renamed from: f */
    public final synchronized void mo40541f(boolean z) {
        if (this.f32081a != z) {
            this.f32081a = z;
            this.f32080a.mo30482b(new pv0(nd0.class, new nd0(z)));
        }
    }
}
