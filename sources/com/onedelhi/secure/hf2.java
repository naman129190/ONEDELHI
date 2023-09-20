package com.onedelhi.secure;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.onedelhi.secure.fd3;

public class hf2 {

    /* renamed from: a */
    public static final int[] f29592a = {16842752, fd3.C2153c.theme};

    /* renamed from: b */
    public static final int[] f29593b = {fd3.C2153c.materialThemeOverlay};

    @e64
    /* renamed from: a */
    public static int m50486a(@mr2 Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f29592a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    @e64
    /* renamed from: b */
    public static int m50487b(@mr2 Context context, @ts2 AttributeSet attributeSet, @C3982yb int i, @e64 int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f29593b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @mr2
    /* renamed from: c */
    public static Context m50488c(@mr2 Context context, @ts2 AttributeSet attributeSet, @C3982yb int i, @e64 int i2) {
        int b = m50487b(context, attributeSet, i, i2);
        boolean z = (context instanceof z70) && ((z70) context).mo27822c() == b;
        if (b == 0 || z) {
            return context;
        }
        z70 z70 = new z70(context, b);
        int a = m50486a(context, attributeSet);
        if (a != 0) {
            z70.getTheme().applyStyle(a, true);
        }
        return z70;
    }
}
