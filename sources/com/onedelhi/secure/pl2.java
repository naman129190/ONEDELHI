package com.onedelhi.secure;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;

public class pl2 {

    /* renamed from: a */
    public static final String f33724a = "cubic-bezier";

    /* renamed from: b */
    public static final String f33725b = "path";

    /* renamed from: c */
    public static final String f33726c = "(";

    /* renamed from: d */
    public static final String f33727d = ")";

    /* renamed from: a */
    public static float m61416a(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    /* renamed from: b */
    public static String m61417b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    /* renamed from: c */
    public static TimeInterpolator m61418c(String str) {
        if (m61420e(str, f33724a)) {
            String[] split = m61417b(str, f33724a).split(vf4.f36537c);
            if (split.length == 4) {
                return rz2.m27163b(m61416a(split, 0), m61416a(split, 1), m61416a(split, 2), m61416a(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        } else if (m61420e(str, "path")) {
            return rz2.m27164c(xz2.m31794e(m61417b(str, "path")));
        } else {
            throw new IllegalArgumentException("Invalid motion easing type: " + str);
        }
    }

    /* renamed from: d */
    public static boolean m61419d(String str) {
        return m61420e(str, f33724a) || m61420e(str, "path");
    }

    /* renamed from: e */
    public static boolean m61420e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(f33726c);
        return str.startsWith(sb.toString()) && str.endsWith(f33727d);
    }

    /* renamed from: f */
    public static int m61421f(@mr2 Context context, @C3982yb int i, int i2) {
        return je2.m53276e(context, i, i2);
    }

    @mr2
    /* renamed from: g */
    public static TimeInterpolator m61422g(@mr2 Context context, @C3982yb int i, @mr2 TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            return m61419d(valueOf) ? m61418c(valueOf) : AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }
}
