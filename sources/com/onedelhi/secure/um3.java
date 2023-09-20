package com.onedelhi.secure;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class um3 {
    @hw4

    /* renamed from: a */
    public static final String f36189a = um3.class.getSimpleName();
    @C3196px(api = 21)

    /* renamed from: a */
    public static final boolean f36190a = true;

    /* renamed from: a */
    public static final int[] f36191a = {16842919};
    @hw4

    /* renamed from: b */
    public static final String f36192b = "Use a non-transparent color for the default color as it will be used to finish ripple animations.";

    /* renamed from: b */
    public static final int[] f36193b = {16843623, 16842908};

    /* renamed from: c */
    public static final int[] f36194c = {16842908};

    /* renamed from: d */
    public static final int[] f36195d = {16843623};

    /* renamed from: e */
    public static final int[] f36196e = {16842913, 16842919};

    /* renamed from: f */
    public static final int[] f36197f = {16842913, 16843623, 16842908};

    /* renamed from: g */
    public static final int[] f36198g = {16842913, 16842908};

    /* renamed from: h */
    public static final int[] f36199h = {16842913, 16843623};

    /* renamed from: i */
    public static final int[] f36200i = {16842913};

    /* renamed from: j */
    public static final int[] f36201j = {16842910, 16842919};

    @sj3(21)
    /* renamed from: com.onedelhi.secure.um3$a */
    public static class C6975a {
        /* access modifiers changed from: private */
        @pn0
        /* renamed from: b */
        public static Drawable m67330b(@mr2 Context context, @e83 int i) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-1);
            gradientDrawable.setShape(1);
            return new RippleDrawable(oe2.m23723i(context, fd3.C2153c.colorControlHighlight, ColorStateList.valueOf(0)), (Drawable) null, new InsetDrawable(gradientDrawable, i, i, i, i));
        }
    }

    @mr2
    /* renamed from: a */
    public static ColorStateList m67323a(@ts2 ColorStateList colorStateList) {
        if (f36190a) {
            int[] iArr = f36194c;
            return new ColorStateList(new int[][]{f36200i, iArr, StateSet.NOTHING}, new int[]{m67326d(colorStateList, f36196e), m67326d(colorStateList, iArr), m67326d(colorStateList, f36191a)});
        }
        int[] iArr2 = f36196e;
        int[] iArr3 = f36197f;
        int[] iArr4 = f36198g;
        int[] iArr5 = f36199h;
        int[] iArr6 = f36191a;
        int[] iArr7 = f36193b;
        int[] iArr8 = f36194c;
        int[] iArr9 = f36195d;
        return new ColorStateList(new int[][]{iArr2, iArr3, iArr4, iArr5, f36200i, iArr6, iArr7, iArr8, iArr9, StateSet.NOTHING}, new int[]{m67326d(colorStateList, iArr2), m67326d(colorStateList, iArr3), m67326d(colorStateList, iArr4), m67326d(colorStateList, iArr5), 0, m67326d(colorStateList, iArr6), m67326d(colorStateList, iArr7), m67326d(colorStateList, iArr8), m67326d(colorStateList, iArr9), 0});
    }

    @mr2
    @sj3(21)
    /* renamed from: b */
    public static Drawable m67324b(@mr2 Context context, @e83 int i) {
        return C6975a.m67330b(context, i);
    }

    @TargetApi(21)
    @d10
    /* renamed from: c */
    public static int m67325c(@d10 int i) {
        return p10.m24299B(i, Math.min(Color.alpha(i) * 2, 255));
    }

    @d10
    /* renamed from: d */
    public static int m67326d(@ts2 ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f36190a ? m67325c(colorForState) : colorForState;
    }

    @mr2
    /* renamed from: e */
    public static ColorStateList m67327e(@ts2 ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f36201j, 0)) != 0) {
            Log.w(f36189a, f36192b);
        }
        return colorStateList;
    }

    /* renamed from: f */
    public static boolean m67328f(@mr2 int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
