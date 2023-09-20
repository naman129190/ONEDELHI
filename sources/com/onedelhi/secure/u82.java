package com.onedelhi.secure;

import android.util.Log;

public class u82 {

    /* renamed from: a */
    public static boolean f36003a = false;

    /* renamed from: a */
    public static void m66896a(String str, String str2) {
        if (f36003a) {
            Log.d(str, str2);
        }
    }

    /* renamed from: b */
    public static void m66897b(String str, String str2, Throwable th) {
        if (f36003a) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: c */
    public static void m66898c(String str, String str2) {
        if (f36003a) {
            Log.e(str, str2);
        }
    }

    /* renamed from: d */
    public static void m66899d(String str, String str2, Throwable th) {
        if (f36003a) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m66900e(String str, String str2) {
        Log.i(str, str2);
    }

    /* renamed from: f */
    public static void m66901f(boolean z) {
        f36003a = z;
    }

    /* renamed from: g */
    public static void m66902g(String str, String str2) {
    }

    /* renamed from: h */
    public static void m66903h(String str, String str2) {
        if (f36003a) {
            Log.w(str, str2);
        }
    }

    /* renamed from: i */
    public static void m66904i(String str, String str2, Throwable th) {
        if (f36003a) {
            Log.w(str, str2, th);
        }
    }
}
