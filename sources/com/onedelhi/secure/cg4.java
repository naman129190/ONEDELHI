package com.onedelhi.secure;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

@Deprecated
public final class cg4 {

    /* renamed from: a */
    public static long f10272a = 0;

    /* renamed from: a */
    public static final String f10273a = "TraceCompat";

    /* renamed from: a */
    public static Method f10274a;

    /* renamed from: b */
    public static Method f10275b;

    /* renamed from: c */
    public static Method f10276c;

    /* renamed from: d */
    public static Method f10277d;

    @sj3(18)
    /* renamed from: com.onedelhi.secure.cg4$a */
    public static class C1908a {
        @pn0
        /* renamed from: a */
        public static void m12482a(String str) {
            Trace.beginSection(str);
        }

        @pn0
        /* renamed from: b */
        public static void m12483b() {
            Trace.endSection();
        }
    }

    @sj3(29)
    /* renamed from: com.onedelhi.secure.cg4$b */
    public static class C1909b {
        @pn0
        /* renamed from: a */
        public static void m12484a(String str, int i) {
            Trace.beginAsyncSection(str, i);
        }

        @pn0
        /* renamed from: b */
        public static void m12485b(String str, int i) {
            Trace.endAsyncSection(str, i);
        }

        @pn0
        /* renamed from: c */
        public static boolean m12486c() {
            return Trace.isEnabled();
        }

        @pn0
        /* renamed from: d */
        public static void m12487d(String str, long j) {
            Trace.setCounter(str, j);
        }
    }

    static {
        Class<String> cls = String.class;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f10272a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls2 = Long.TYPE;
                f10274a = Trace.class.getMethod("isTagEnabled", new Class[]{cls2});
                Class cls3 = Integer.TYPE;
                f10275b = Trace.class.getMethod("asyncTraceBegin", new Class[]{cls2, cls, cls3});
                f10276c = Trace.class.getMethod("asyncTraceEnd", new Class[]{cls2, cls, cls3});
                f10277d = Trace.class.getMethod("traceCounter", new Class[]{cls2, cls, cls3});
            } catch (Exception e) {
                Log.i(f10273a, "Unable to initialize via reflection.", e);
            }
        }
    }

    /* renamed from: a */
    public static void m12476a(@mr2 String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1909b.m12484a(str, i);
            return;
        }
        try {
            f10275b.invoke((Object) null, new Object[]{Long.valueOf(f10272a), str, Integer.valueOf(i)});
        } catch (Exception unused) {
            Log.v(f10273a, "Unable to invoke asyncTraceBegin() via reflection.");
        }
    }

    /* renamed from: b */
    public static void m12477b(@mr2 String str) {
        C1908a.m12482a(str);
    }

    /* renamed from: c */
    public static void m12478c(@mr2 String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1909b.m12485b(str, i);
            return;
        }
        try {
            f10276c.invoke((Object) null, new Object[]{Long.valueOf(f10272a), str, Integer.valueOf(i)});
        } catch (Exception unused) {
            Log.v(f10273a, "Unable to invoke endAsyncSection() via reflection.");
        }
    }

    /* renamed from: d */
    public static void m12479d() {
        C1908a.m12483b();
    }

    /* renamed from: e */
    public static boolean m12480e() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C1909b.m12486c();
        }
        try {
            return ((Boolean) f10274a.invoke((Object) null, new Object[]{Long.valueOf(f10272a)})).booleanValue();
        } catch (Exception unused) {
            Log.v(f10273a, "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }

    /* renamed from: f */
    public static void m12481f(@mr2 String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1909b.m12487d(str, (long) i);
            return;
        }
        try {
            f10277d.invoke((Object) null, new Object[]{Long.valueOf(f10272a), str, Integer.valueOf(i)});
        } catch (Exception unused) {
            Log.v(f10273a, "Unable to invoke traceCounter() via reflection.");
        }
    }
}
