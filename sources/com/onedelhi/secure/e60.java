package com.onedelhi.secure;

public final class e60 {

    /* renamed from: a */
    public static final String f27706a = "https://console.firebase.google.com";

    /* renamed from: b */
    public static final String f27707b = "android-ide";

    /* renamed from: c */
    public static final String f27708c = "perf-android-sdk";

    /* renamed from: a */
    public static String m46045a(String str, String str2, String str3) {
        return String.format("%s/troubleshooting/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s", new Object[]{m46048d(str, str2), str3, f27708c, f27707b});
    }

    /* renamed from: b */
    public static String m46046b(String str, String str2) {
        return String.format("%s/trends?utm_source=%s&utm_medium=%s", new Object[]{m46048d(str, str2), f27708c, f27707b});
    }

    /* renamed from: c */
    public static String m46047c(String str, String str2, String str3) {
        return String.format("%s/troubleshooting/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s", new Object[]{m46048d(str, str2), str3, f27708c, f27707b});
    }

    /* renamed from: d */
    public static String m46048d(String str, String str2) {
        return String.format("%s/project/%s/performance/app/android:%s", new Object[]{f27706a, str, str2});
    }
}
