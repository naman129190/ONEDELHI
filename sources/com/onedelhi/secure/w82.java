package com.onedelhi.secure;

import android.util.Log;

public class w82 {

    /* renamed from: a */
    public static boolean f36926a = false;

    /* renamed from: a */
    public static void m69214a(String str, String str2) {
        if (f36926a) {
            Log.d(str, str2);
        }
    }

    /* renamed from: b */
    public static void m69215b(String str, String str2, Throwable th) {
        if (f36926a) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: c */
    public static void m69216c(String str, String str2) {
        if (f36926a) {
            Log.e(str, str2);
        }
    }

    /* renamed from: d */
    public static void m69217d(String str, String str2, Throwable th) {
        if (f36926a) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m69218e(String str, String str2) {
        Log.i(str, str2);
    }

    /* renamed from: f */
    public static void m69219f(boolean z) {
        f36926a = z;
    }

    /* renamed from: g */
    public static void m69220g(String str, String str2) {
        if (f36926a) {
            Log.v(str, str2);
        }
    }

    /* renamed from: h */
    public static void m69221h(String str, String str2) {
        if (f36926a) {
            Log.w(str, str2);
        }
    }

    /* renamed from: i */
    public static void m69222i(String str, String str2, Throwable th) {
        if (f36926a) {
            Log.w(str, str2, th);
        }
    }
}
