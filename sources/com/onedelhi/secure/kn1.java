package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class kn1 {

    /* renamed from: a */
    public static final String f15033a = "ICUCompat";

    /* renamed from: a */
    public static Method f15034a;

    /* renamed from: b */
    public static Method f15035b;

    @sj3(21)
    /* renamed from: com.onedelhi.secure.kn1$a */
    public static class C2652a {
        @pn0
        /* renamed from: a */
        public static String m19940a(Locale locale) {
            return locale.getScript();
        }
    }

    @sj3(24)
    /* renamed from: com.onedelhi.secure.kn1$b */
    public static class C2653b {
        @pn0
        /* renamed from: a */
        public static ULocale m19941a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        @pn0
        /* renamed from: b */
        public static ULocale m19942b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        @pn0
        /* renamed from: c */
        public static String m19943c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f15035b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: a */
    public static String m19937a(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f15035b;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{locale2});
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w(f15033a, e);
        }
        return locale2;
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: b */
    public static String m19938b(String str) {
        try {
            Method method = f15034a;
            if (method != null) {
                return (String) method.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w(f15033a, e);
        }
        return null;
    }

    @ts2
    /* renamed from: c */
    public static String m19939c(@mr2 Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C2653b.m19943c(C2653b.m19941a(C2653b.m19942b(locale)));
        }
        try {
            return C2652a.m19940a((Locale) f15035b.invoke((Object) null, new Object[]{locale}));
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w(f15033a, e);
            return C2652a.m19940a(locale);
        }
    }
}
