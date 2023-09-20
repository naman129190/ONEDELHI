package com.onedelhi.secure;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import javax.annotation.Nullable;

public final class bv5 implements pu5 {
    @mj1("GservicesLoader.class")

    /* renamed from: a */
    public static bv5 f9987a;
    @Nullable

    /* renamed from: a */
    public final Context f9988a;
    @Nullable

    /* renamed from: a */
    public final ContentObserver f9989a;

    public bv5() {
        this.f9988a = null;
        this.f9989a = null;
    }

    public bv5(Context context) {
        this.f9988a = context;
        xu5 xu5 = new xu5(this, (Handler) null);
        this.f9989a = xu5;
        context.getContentResolver().registerContentObserver(bt5.f9966a, true, xu5);
    }

    /* renamed from: b */
    public static bv5 m12098b(Context context) {
        bv5 bv5;
        synchronized (bv5.class) {
            if (f9987a == null) {
                f9987a = k13.m19369d(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new bv5(context) : new bv5();
            }
            bv5 = f9987a;
        }
        return bv5;
    }

    /* renamed from: e */
    public static synchronized void m12099e() {
        Context context;
        synchronized (bv5.class) {
            bv5 bv5 = f9987a;
            if (!(bv5 == null || (context = bv5.f9988a) == null || bv5.f9989a == null)) {
                context.getContentResolver().unregisterContentObserver(f9987a.f9989a);
            }
            f9987a = null;
        }
    }

    @Nullable
    /* renamed from: c */
    public final String mo13831a(String str) {
        Context context = this.f9988a;
        if (context != null && !ft5.m15294a(context)) {
            try {
                return (String) hu5.m16941a(new tu5(this, str));
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
            }
        }
        return null;
    }

    /* renamed from: d */
    public final /* synthetic */ String mo13833d(String str) {
        return bt5.m12064a(this.f9988a.getContentResolver(), str, (String) null);
    }
}
