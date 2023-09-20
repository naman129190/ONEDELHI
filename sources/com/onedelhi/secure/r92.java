package com.onedelhi.secure;

import android.os.Build;
import android.util.Log;

public final class r92 {

    /* renamed from: a */
    public static final int f19720a = 23;

    /* renamed from: a */
    public static final String f19721a = "TRuntime.";

    /* renamed from: a */
    public static String m26527a(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    /* renamed from: b */
    public static void m26528b(String str, String str2) {
        String g = m26533g(str);
        if (Log.isLoggable(g, 3)) {
            Log.d(g, str2);
        }
    }

    /* renamed from: c */
    public static void m26529c(String str, String str2, Object obj) {
        String g = m26533g(str);
        if (Log.isLoggable(g, 3)) {
            Log.d(g, String.format(str2, new Object[]{obj}));
        }
    }

    /* renamed from: d */
    public static void m26530d(String str, String str2, Object obj, Object obj2) {
        String g = m26533g(str);
        if (Log.isLoggable(g, 3)) {
            Log.d(g, String.format(str2, new Object[]{obj, obj2}));
        }
    }

    /* renamed from: e */
    public static void m26531e(String str, String str2, Object... objArr) {
        String g = m26533g(str);
        if (Log.isLoggable(g, 3)) {
            Log.d(g, String.format(str2, objArr));
        }
    }

    /* renamed from: f */
    public static void m26532f(String str, String str2, Throwable th) {
        String g = m26533g(str);
        if (Log.isLoggable(g, 6)) {
            Log.e(g, str2, th);
        }
    }

    /* renamed from: g */
    public static String m26533g(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return m26527a(f19721a, str);
        }
        return f19721a + str;
    }

    /* renamed from: h */
    public static void m26534h(String str, String str2, Object obj) {
        String g = m26533g(str);
        if (Log.isLoggable(g, 4)) {
            Log.i(g, String.format(str2, new Object[]{obj}));
        }
    }

    /* renamed from: i */
    public static void m26535i(String str, String str2, Object obj) {
        String g = m26533g(str);
        if (Log.isLoggable(g, 5)) {
            Log.w(g, String.format(str2, new Object[]{obj}));
        }
    }
}
