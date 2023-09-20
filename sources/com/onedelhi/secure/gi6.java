package com.onedelhi.secure;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;

public final class gi6 implements of6 {
    @mj1("SharedPreferencesLoader.class")

    /* renamed from: a */
    public static final Map f12602a = new C3042oa();

    /* renamed from: a */
    public final SharedPreferences.OnSharedPreferenceChangeListener f12603a;

    /* renamed from: a */
    public final SharedPreferences f12604a;

    @ts2
    /* renamed from: b */
    public static gi6 m15865b(Context context, String str, Runnable runnable) {
        gi6 gi6;
        if (!ne6.m22719b()) {
            synchronized (gi6.class) {
                gi6 = (gi6) f12602a.get((Object) null);
                if (gi6 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
            return gi6;
        }
        throw null;
    }

    /* renamed from: c */
    public static synchronized void m15866c() {
        synchronized (gi6.class) {
            Map map = f12602a;
            Iterator it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = ((gi6) it.next()).f12604a;
                throw null;
            }
        }
    }

    @ts2
    /* renamed from: a */
    public final Object mo16663a(String str) {
        throw null;
    }
}
