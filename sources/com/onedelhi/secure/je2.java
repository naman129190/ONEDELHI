package com.onedelhi.secure;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class je2 {
    @ts2
    /* renamed from: a */
    public static TypedValue m53272a(@mr2 Context context, @C3982yb int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m53273b(@mr2 Context context, @C3982yb int i, boolean z) {
        TypedValue a = m53272a(context, i);
        return (a == null || a.type != 18) ? z : a.data != 0;
    }

    /* renamed from: c */
    public static boolean m53274c(@mr2 Context context, @C3982yb int i, @mr2 String str) {
        return m53278g(context, i, str) != 0;
    }

    @e83
    /* renamed from: d */
    public static int m53275d(@mr2 Context context, @C3982yb int i, @yk0 int i2) {
        TypedValue a = m53272a(context, i);
        return (int) ((a == null || a.type != 5) ? context.getResources().getDimension(i2) : a.getDimension(context.getResources().getDisplayMetrics()));
    }

    /* renamed from: e */
    public static int m53276e(@mr2 Context context, @C3982yb int i, int i2) {
        TypedValue a = m53272a(context, i);
        return (a == null || a.type != 16) ? i2 : a.data;
    }

    @e83
    /* renamed from: f */
    public static int m53277f(@mr2 Context context) {
        return m53275d(context, fd3.C2153c.minTouchTargetSize, fd3.C2156f.mtrl_min_touch_target_size);
    }

    /* renamed from: g */
    public static int m53278g(@mr2 Context context, @C3982yb int i, @mr2 String str) {
        return m53280i(context, i, str).data;
    }

    /* renamed from: h */
    public static int m53279h(@mr2 View view, @C3982yb int i) {
        return m53281j(view, i).data;
    }

    @mr2
    /* renamed from: i */
    public static TypedValue m53280i(@mr2 Context context, @C3982yb int i, @mr2 String str) {
        TypedValue a = m53272a(context, i);
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    @mr2
    /* renamed from: j */
    public static TypedValue m53281j(@mr2 View view, @C3982yb int i) {
        return m53280i(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
