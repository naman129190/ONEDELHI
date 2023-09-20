package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.Executor;

public class ld0 {

    /* renamed from: a */
    public static final String f31615a = "firebase_crashlytics_collection_enabled";

    /* renamed from: a */
    public final SharedPreferences f31616a;

    /* renamed from: a */
    public final w31 f31617a;

    /* renamed from: a */
    public x94<Void> f31618a = new x94<>();
    @ts2

    /* renamed from: a */
    public Boolean f31619a;

    /* renamed from: a */
    public final Object f31620a;

    /* renamed from: a */
    public boolean f31621a = false;

    /* renamed from: b */
    public final x94<Void> f31622b = new x94<>();

    /* renamed from: b */
    public boolean f31623b = false;

    public ld0(w31 w31) {
        Object obj = new Object();
        this.f31620a = obj;
        Context n = w31.mo46527n();
        this.f31617a = w31;
        this.f31616a = u10.m66373t(n);
        Boolean b = mo39783b();
        this.f31619a = b == null ? mo39782a(n) : b;
        synchronized (obj) {
            if (mo39785d()) {
                this.f31618a.mo26839e(null);
                this.f31621a = true;
            }
        }
    }

    @ts2
    /* renamed from: f */
    public static Boolean m55526f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(f31615a)) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean(f31615a));
        } catch (PackageManager.NameNotFoundException e) {
            o92.m59120f().mo41616e("Could not read data collection permission from manifest", e);
            return null;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    /* renamed from: h */
    public static void m55527h(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bool != null) {
            edit.putBoolean(f31615a, bool.booleanValue());
        } else {
            edit.remove(f31615a);
        }
        edit.apply();
    }

    @ts2
    /* renamed from: a */
    public final Boolean mo39782a(Context context) {
        Boolean f = m55526f(context);
        if (f == null) {
            this.f31623b = false;
            return null;
        }
        this.f31623b = true;
        return Boolean.valueOf(Boolean.TRUE.equals(f));
    }

    @ts2
    /* renamed from: b */
    public final Boolean mo39783b() {
        if (!this.f31616a.contains(f31615a)) {
            return null;
        }
        this.f31623b = false;
        return Boolean.valueOf(this.f31616a.getBoolean(f31615a, true));
    }

    /* renamed from: c */
    public void mo39784c(boolean z) {
        if (z) {
            this.f31622b.mo26839e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    /* renamed from: d */
    public synchronized boolean mo39785d() {
        boolean booleanValue;
        Boolean bool = this.f31619a;
        booleanValue = bool != null ? bool.booleanValue() : this.f31617a.mo46511A();
        mo39786e(booleanValue);
        return booleanValue;
    }

    /* renamed from: e */
    public final void mo39786e(boolean z) {
        o92.m59120f().mo41613b(String.format("Crashlytics automatic data collection %s by %s.", new Object[]{z ? "ENABLED" : "DISABLED", this.f31619a == null ? "global Firebase setting" : this.f31623b ? "firebase_crashlytics_collection_enabled manifest flag" : "API"}));
    }

    /* renamed from: g */
    public synchronized void mo39787g(@ts2 Boolean bool) {
        if (bool != null) {
            try {
                this.f31623b = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f31619a = bool != null ? bool : mo39782a(this.f31617a.mo46527n());
        m55527h(this.f31616a, bool);
        synchronized (this.f31620a) {
            if (mo39785d()) {
                if (!this.f31621a) {
                    this.f31618a.mo26839e(null);
                    this.f31621a = true;
                }
            } else if (this.f31621a) {
                this.f31618a = new x94<>();
                this.f31621a = false;
            }
        }
    }

    /* renamed from: i */
    public w94<Void> mo39788i() {
        w94<Void> a;
        synchronized (this.f31620a) {
            a = this.f31618a.mo26835a();
        }
        return a;
    }

    /* renamed from: j */
    public w94<Void> mo39789j(Executor executor) {
        return zq4.m74251o(executor, this.f31622b.mo26835a(), mo39788i());
    }
}
