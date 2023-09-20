package com.onedelhi.secure;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;

public final class my5 implements pu5 {
    @mj1("SharedPreferencesLoader.class")

    /* renamed from: a */
    public static final Map f16945a = new C3042oa();

    /* renamed from: a */
    public final SharedPreferences.OnSharedPreferenceChangeListener f16946a;

    /* renamed from: a */
    public final SharedPreferences f16947a;

    @ts2
    /* renamed from: b */
    public static my5 m22222b(Context context, String str, Runnable runnable) {
        my5 my5;
        if (!ft5.m15295b()) {
            synchronized (my5.class) {
                my5 = (my5) f16945a.get((Object) null);
                if (my5 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
            return my5;
        }
        throw null;
    }

    /* renamed from: c */
    public static synchronized void m22223c() {
        synchronized (my5.class) {
            Map map = f16945a;
            Iterator it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = ((my5) it.next()).f16947a;
                throw null;
            }
        }
    }

    @ts2
    /* renamed from: a */
    public final Object mo13831a(String str) {
        throw null;
    }
}
