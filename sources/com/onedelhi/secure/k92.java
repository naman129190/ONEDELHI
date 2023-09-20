package com.onedelhi.secure;

import android.util.Log;

public class k92 {

    /* renamed from: a */
    public static k92 f31168a = null;

    /* renamed from: a */
    public static final String f31169a = "FirebasePerformance";

    /* renamed from: c */
    public static synchronized k92 m54160c() {
        k92 k92;
        synchronized (k92.class) {
            if (f31168a == null) {
                f31168a = new k92();
            }
            k92 = f31168a;
        }
        return k92;
    }

    /* renamed from: a */
    public void mo39125a(String str) {
        Log.d(f31169a, str);
    }

    /* renamed from: b */
    public void mo39126b(String str) {
        Log.e(f31169a, str);
    }

    /* renamed from: d */
    public void mo39127d(String str) {
        Log.i(f31169a, str);
    }

    /* renamed from: e */
    public void mo39128e(String str) {
        Log.v(f31169a, str);
    }

    /* renamed from: f */
    public void mo39129f(String str) {
        Log.w(f31169a, str);
    }
}
