package com.onedelhi.secure;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import com.onedelhi.secure.fd3;

public class oe2 {

    /* renamed from: a */
    public static final float f17925a = 1.0f;

    /* renamed from: a */
    public static final int f17926a = 40;

    /* renamed from: b */
    public static final float f17927b = 0.54f;

    /* renamed from: b */
    public static final int f17928b = 100;

    /* renamed from: c */
    public static final float f17929c = 0.38f;

    /* renamed from: c */
    public static final int f17930c = 90;

    /* renamed from: d */
    public static final float f17931d = 0.32f;

    /* renamed from: d */
    public static final int f17932d = 10;

    /* renamed from: e */
    public static final float f17933e = 0.12f;

    /* renamed from: e */
    public static final int f17934e = 80;

    /* renamed from: f */
    public static final int f17935f = 20;

    /* renamed from: g */
    public static final int f17936g = 30;

    /* renamed from: h */
    public static final int f17937h = 90;

    @d10
    /* renamed from: a */
    public static int m23715a(@d10 int i, @js1(from = 0, mo18580to = 255) int i2) {
        return p10.m24299B(i, (Color.alpha(i) * i2) / 255);
    }

    @d10
    /* renamed from: b */
    public static int m23716b(@mr2 Context context, @C3982yb int i, @d10 int i2) {
        TypedValue a = je2.m53272a(context, i);
        return a != null ? m23731q(context, a) : i2;
    }

    @d10
    /* renamed from: c */
    public static int m23717c(Context context, @C3982yb int i, String str) {
        return m23731q(context, je2.m53280i(context, i, str));
    }

    @d10
    /* renamed from: d */
    public static int m23718d(@mr2 View view, @C3982yb int i) {
        return m23731q(view.getContext(), je2.m53281j(view, i));
    }

    @d10
    /* renamed from: e */
    public static int m23719e(@mr2 View view, @C3982yb int i, @d10 int i2) {
        return m23716b(view.getContext(), i, i2);
    }

    @d10
    /* renamed from: f */
    public static int m23720f(@d10 int i, @js1(from = 0, mo18580to = 100) int i2) {
        rk1 c = rk1.m26837c(i);
        c.mo23925l((float) i2);
        return c.mo23926m();
    }

    @mr2
    /* renamed from: g */
    public static n10 m23721g(@d10 int i, boolean z) {
        return z ? new n10(m23720f(i, 40), m23720f(i, 100), m23720f(i, 90), m23720f(i, 10)) : new n10(m23720f(i, 80), m23720f(i, 20), m23720f(i, 30), m23720f(i, 90));
    }

    @mr2
    /* renamed from: h */
    public static n10 m23722h(@mr2 Context context, @d10 int i) {
        return m23721g(i, je2.m53273b(context, fd3.C2153c.isLightTheme, true));
    }

    @mr2
    /* renamed from: i */
    public static ColorStateList m23723i(@mr2 Context context, @C3982yb int i, @mr2 ColorStateList colorStateList) {
        TypedValue a = je2.m53272a(context, i);
        ColorStateList r = a != null ? m23732r(context, a) : null;
        return r == null ? colorStateList : r;
    }

    @d10
    /* renamed from: j */
    public static int m23724j(@d10 int i, @d10 int i2) {
        return C3646tm.m28815c(i, i2);
    }

    @d10
    /* renamed from: k */
    public static int m23725k(@mr2 Context context, @d10 int i) {
        return m23724j(i, m23717c(context, fd3.C2153c.colorPrimary, oe2.class.getCanonicalName()));
    }

    /* renamed from: l */
    public static boolean m23726l(@d10 int i) {
        return i != 0 && p10.m24312m(i) > 0.5d;
    }

    @d10
    /* renamed from: m */
    public static int m23727m(@d10 int i, @d10 int i2) {
        return p10.m24319t(i2, i);
    }

    @d10
    /* renamed from: n */
    public static int m23728n(@d10 int i, @d10 int i2, @d81(from = 0.0d, mo14561to = 1.0d) float f) {
        return m23727m(i, p10.m24299B(i2, Math.round(((float) Color.alpha(i2)) * f)));
    }

    @d10
    /* renamed from: o */
    public static int m23729o(@mr2 View view, @C3982yb int i, @C3982yb int i2) {
        return m23730p(view, i, i2, 1.0f);
    }

    @d10
    /* renamed from: p */
    public static int m23730p(@mr2 View view, @C3982yb int i, @C3982yb int i2, @d81(from = 0.0d, mo14561to = 1.0d) float f) {
        return m23728n(m23718d(view, i), m23718d(view, i2), f);
    }

    /* renamed from: q */
    public static int m23731q(@mr2 Context context, @mr2 TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? r70.m26353f(context, i) : typedValue.data;
    }

    /* renamed from: r */
    public static ColorStateList m23732r(@mr2 Context context, @mr2 TypedValue typedValue) {
        int i = typedValue.resourceId;
        return i != 0 ? r70.m26354g(context, i) : ColorStateList.valueOf(typedValue.data);
    }
}
