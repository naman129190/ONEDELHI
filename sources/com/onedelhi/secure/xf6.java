package com.onedelhi.secure;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import javax.annotation.Nullable;

public final class xf6 implements of6 {
    @mj1("GservicesLoader.class")

    /* renamed from: a */
    public static xf6 f22550a;
    @Nullable

    /* renamed from: a */
    public final Context f22551a;
    @Nullable

    /* renamed from: a */
    public final ContentObserver f22552a;

    public xf6() {
        this.f22551a = null;
        this.f22552a = null;
    }

    public xf6(Context context) {
        this.f22551a = context;
        uf6 uf6 = new uf6(this, (Handler) null);
        this.f22552a = uf6;
        context.getContentResolver().registerContentObserver(ke6.f14870a, true, uf6);
    }

    /* renamed from: b */
    public static xf6 m31425b(Context context) {
        xf6 xf6;
        synchronized (xf6.class) {
            if (f22550a == null) {
                f22550a = k13.m19369d(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new xf6(context) : new xf6();
            }
            xf6 = f22550a;
        }
        return xf6;
    }

    /* renamed from: e */
    public static synchronized void m31426e() {
        Context context;
        synchronized (xf6.class) {
            xf6 xf6 = f22550a;
            if (!(xf6 == null || (context = xf6.f22551a) == null || xf6.f22552a == null)) {
                context.getContentResolver().unregisterContentObserver(f22550a.f22552a);
            }
            f22550a = null;
        }
    }

    @Nullable
    /* renamed from: c */
    public final String mo16663a(String str) {
        Context context = this.f22551a;
        if (context != null && !ne6.m22718a(context)) {
            try {
                return (String) if6.m17516a(new rf6(this, str));
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
            }
        }
        return null;
    }

    /* renamed from: d */
    public final /* synthetic */ String mo26919d(String str) {
        return ke6.m19741a(this.f22551a.getContentResolver(), str, (String) null);
    }
}
