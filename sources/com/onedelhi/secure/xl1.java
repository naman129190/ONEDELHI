package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;

@SuppressLint({"InlinedApi"})
public final class xl1 {

    /* renamed from: a */
    public static final int f22622a = 0;

    /* renamed from: b */
    public static final int f22623b = 1;

    /* renamed from: c */
    public static final int f22624c = 1;

    /* renamed from: d */
    public static final int f22625d = 2;

    /* renamed from: e */
    public static final int f22626e = 4;

    /* renamed from: f */
    public static final int f22627f = 8;

    /* renamed from: g */
    public static final int f22628g = 16;

    /* renamed from: h */
    public static final int f22629h = 32;

    /* renamed from: i */
    public static final int f22630i = 256;

    /* renamed from: j */
    public static final int f22631j = 0;

    /* renamed from: k */
    public static final int f22632k = 63;

    @sj3(24)
    /* renamed from: com.onedelhi.secure.xl1$a */
    public static class C3931a {
        @pn0
        /* renamed from: a */
        public static Spanned m31531a(String str, int i) {
            return Html.fromHtml(str, i);
        }

        @pn0
        /* renamed from: b */
        public static Spanned m31532b(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i, imageGetter, tagHandler);
        }

        @pn0
        /* renamed from: c */
        public static String m31533c(Spanned spanned, int i) {
            return Html.toHtml(spanned, i);
        }
    }

    @mr2
    /* renamed from: a */
    public static Spanned m31528a(@mr2 String str, int i) {
        return Build.VERSION.SDK_INT >= 24 ? C3931a.m31531a(str, i) : Html.fromHtml(str);
    }

    @mr2
    /* renamed from: b */
    public static Spanned m31529b(@mr2 String str, int i, @ts2 Html.ImageGetter imageGetter, @ts2 Html.TagHandler tagHandler) {
        return Build.VERSION.SDK_INT >= 24 ? C3931a.m31532b(str, i, imageGetter, tagHandler) : Html.fromHtml(str, imageGetter, tagHandler);
    }

    @mr2
    /* renamed from: c */
    public static String m31530c(@mr2 Spanned spanned, int i) {
        return Build.VERSION.SDK_INT >= 24 ? C3931a.m31533c(spanned, i) : Html.toHtml(spanned);
    }
}
