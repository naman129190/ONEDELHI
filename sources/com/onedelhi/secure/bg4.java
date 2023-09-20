package com.onedelhi.secure;

import android.os.Trace;

@sj3(29)
public final class bg4 {
    /* renamed from: a */
    public static void m11854a(@mr2 String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    /* renamed from: b */
    public static void m11855b(@mr2 String str, int i) {
        Trace.endAsyncSection(str, i);
    }

    /* renamed from: c */
    public static void m11856c(@mr2 String str, int i) {
        Trace.setCounter(str, (long) i);
    }
}
