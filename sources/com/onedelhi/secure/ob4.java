package com.onedelhi.secure;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public final class ob4 {

    /* renamed from: a */
    public static final String f32977a = "Theme.AppCompat";

    /* renamed from: a */
    public static final int[] f32978a = {fd3.C2153c.colorPrimary};

    /* renamed from: b */
    public static final String f32979b = "Theme.MaterialComponents";

    /* renamed from: b */
    public static final int[] f32980b = {fd3.C2153c.colorPrimaryVariant};

    /* renamed from: a */
    public static void m59185a(@mr2 Context context) {
        m59189e(context, f32978a, f32977a);
    }

    /* renamed from: b */
    public static void m59186b(@mr2 Context context, AttributeSet attributeSet, @C3982yb int i, @e64 int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fd3.C2165o.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(fd3.C2165o.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(fd3.C2153c.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m59187c(context);
            }
        }
        m59185a(context);
    }

    /* renamed from: c */
    public static void m59187c(@mr2 Context context) {
        m59189e(context, f32980b, f32979b);
    }

    /* renamed from: d */
    public static void m59188d(@mr2 Context context, AttributeSet attributeSet, @g64 @mr2 int[] iArr, @C3982yb int i, @e64 int i2, @g64 @ts2 int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fd3.C2165o.ThemeEnforcement, i, i2);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(fd3.C2165o.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(fd3.C2165o.ThemeEnforcement_android_textAppearance, -1) != -1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = m59191g(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: e */
    public static void m59189e(@mr2 Context context, @mr2 int[] iArr, String str) {
        if (!m59194j(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    /* renamed from: f */
    public static boolean m59190f(@mr2 Context context) {
        return m59194j(context, f32978a);
    }

    /* renamed from: g */
    public static boolean m59191g(@mr2 Context context, AttributeSet attributeSet, @g64 @mr2 int[] iArr, @C3982yb int i, @e64 int i2, @g64 @mr2 int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: h */
    public static boolean m59192h(@mr2 Context context) {
        return je2.m53273b(context, fd3.C2153c.isMaterial3Theme, false);
    }

    /* renamed from: i */
    public static boolean m59193i(@mr2 Context context) {
        return m59194j(context, f32980b);
    }

    /* renamed from: j */
    public static boolean m59194j(@mr2 Context context, @mr2 int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    @mr2
    /* renamed from: k */
    public static TypedArray m59195k(@mr2 Context context, AttributeSet attributeSet, @g64 @mr2 int[] iArr, @C3982yb int i, @e64 int i2, @g64 int... iArr2) {
        m59186b(context, attributeSet, i, i2);
        m59188d(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: l */
    public static af4 m59196l(@mr2 Context context, AttributeSet attributeSet, @g64 @mr2 int[] iArr, @C3982yb int i, @e64 int i2, @g64 int... iArr2) {
        m59186b(context, attributeSet, i, i2);
        m59188d(context, attributeSet, iArr, i, i2, iArr2);
        return af4.m11110G(context, attributeSet, iArr, i, i2);
    }
}
