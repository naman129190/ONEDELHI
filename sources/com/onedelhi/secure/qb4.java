package com.onedelhi.secure;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.za3;

@hl3({hl3.C2354a.LIBRARY})
public class qb4 {

    /* renamed from: a */
    public static final String f19061a = "ThemeUtils";

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f19062a = new ThreadLocal<>();

    /* renamed from: a */
    public static final int[] f19063a = {-16842910};

    /* renamed from: b */
    public static final int[] f19064b = {16842908};

    /* renamed from: c */
    public static final int[] f19065c = {16843518};

    /* renamed from: d */
    public static final int[] f19066d = {16842919};

    /* renamed from: e */
    public static final int[] f19067e = {16842912};

    /* renamed from: f */
    public static final int[] f19068f = {16842913};

    /* renamed from: g */
    public static final int[] f19069g = {-16842919, -16842908};

    /* renamed from: h */
    public static final int[] f19070h = new int[0];

    /* renamed from: i */
    public static final int[] f19071i = new int[1];

    /* renamed from: a */
    public static void m25632a(@mr2 View view, @mr2 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(za3.C4068m.AppCompatTheme);
        try {
            if (!obtainStyledAttributes.hasValue(za3.C4068m.AppCompatTheme_windowActionBar)) {
                Log.e(f19061a, "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @mr2
    /* renamed from: b */
    public static ColorStateList m25633b(int i, int i2) {
        return new ColorStateList(new int[][]{f19063a, f19070h}, new int[]{i2, i});
    }

    /* renamed from: c */
    public static int m25634c(@mr2 Context context, int i) {
        ColorStateList f = m25637f(context, i);
        if (f != null && f.isStateful()) {
            return f.getColorForState(f19063a, f.getDefaultColor());
        }
        TypedValue g = m25638g();
        context.getTheme().resolveAttribute(16842803, g, true);
        return m25636e(context, i, g.getFloat());
    }

    /* renamed from: d */
    public static int m25635d(@mr2 Context context, int i) {
        int[] iArr = f19071i;
        iArr[0] = i;
        af4 F = af4.m11109F(context, (AttributeSet) null, iArr);
        try {
            return F.mo13032c(0, 0);
        } finally {
            F.mo13029I();
        }
    }

    /* renamed from: e */
    public static int m25636e(@mr2 Context context, int i, float f) {
        int d = m25635d(context, i);
        return p10.m24299B(d, Math.round(((float) Color.alpha(d)) * f));
    }

    @ts2
    /* renamed from: f */
    public static ColorStateList m25637f(@mr2 Context context, int i) {
        int[] iArr = f19071i;
        iArr[0] = i;
        af4 F = af4.m11109F(context, (AttributeSet) null, iArr);
        try {
            return F.mo13033d(0);
        } finally {
            F.mo13029I();
        }
    }

    /* renamed from: g */
    public static TypedValue m25638g() {
        ThreadLocal<TypedValue> threadLocal = f19062a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
