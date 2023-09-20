package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zf4 {

    /* renamed from: a */
    public static long f23605a = 0;

    /* renamed from: a */
    public static final String f23606a = "Trace";

    /* renamed from: a */
    public static Method f23607a;

    /* renamed from: b */
    public static Method f23608b;

    /* renamed from: c */
    public static Method f23609c;

    /* renamed from: d */
    public static Method f23610d;

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m33103a(@mr2 String str, int i) {
        try {
            if (f23608b == null) {
                bg4.m11854a(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m33104b(str, i);
    }

    /* renamed from: b */
    public static void m33104b(@mr2 String str, int i) {
        try {
            if (f23608b == null) {
                f23608b = Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            }
            f23608b.invoke((Object) null, new Object[]{Long.valueOf(f23605a), str, Integer.valueOf(i)});
        } catch (Exception e) {
            m33109g("asyncTraceBegin", e);
        }
    }

    /* renamed from: c */
    public static void m33105c(@mr2 String str) {
        ag4.m11152a(str);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static void m33106d(@mr2 String str, int i) {
        try {
            if (f23609c == null) {
                bg4.m11855b(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m33107e(str, i);
    }

    /* renamed from: e */
    public static void m33107e(@mr2 String str, int i) {
        try {
            if (f23609c == null) {
                f23609c = Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            }
            f23609c.invoke((Object) null, new Object[]{Long.valueOf(f23605a), str, Integer.valueOf(i)});
        } catch (Exception e) {
            m33109g("asyncTraceEnd", e);
        }
    }

    /* renamed from: f */
    public static void m33108f() {
        ag4.m11153b();
    }

    /* renamed from: g */
    public static void m33109g(@mr2 String str, @mr2 Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public static boolean m33110h() {
        try {
            if (f23607a == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m33111i();
    }

    /* renamed from: i */
    public static boolean m33111i() {
        try {
            if (f23607a == null) {
                f23605a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                f23607a = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f23607a.invoke((Object) null, new Object[]{Long.valueOf(f23605a)})).booleanValue();
        } catch (Exception e) {
            m33109g("isTagEnabled", e);
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: j */
    public static void m33112j(@mr2 String str, int i) {
        try {
            if (f23610d == null) {
                bg4.m11856c(str, i);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m33113k(str, i);
    }

    /* renamed from: k */
    public static void m33113k(@mr2 String str, int i) {
        try {
            if (f23610d == null) {
                f23610d = Trace.class.getMethod("traceCounter", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            }
            f23610d.invoke((Object) null, new Object[]{Long.valueOf(f23605a), str, Integer.valueOf(i)});
        } catch (Exception e) {
            m33109g("traceCounter", e);
        }
    }
}
