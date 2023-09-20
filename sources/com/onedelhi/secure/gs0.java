package com.onedelhi.secure;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.C4238a;
import com.google.android.material.tabs.TabLayout;

public class gs0 extends C4238a {
    /* renamed from: e */
    public static float m49708e(@d81(from = 0.0d, mo14561to = 1.0d) float f) {
        return (float) (1.0d - Math.cos((((double) f) * 3.141592653589793d) / 2.0d));
    }

    /* renamed from: f */
    public static float m49709f(@d81(from = 0.0d, mo14561to = 1.0d) float f) {
        return (float) Math.sin((((double) f) * 3.141592653589793d) / 2.0d);
    }

    /* renamed from: d */
    public void mo29111d(TabLayout tabLayout, View view, View view2, float f, @mr2 Drawable drawable) {
        float f2;
        float f3;
        RectF a = C4238a.m34152a(tabLayout, view);
        RectF a2 = C4238a.m34152a(tabLayout, view2);
        if (a.left < a2.left) {
            f3 = m49708e(f);
            f2 = m49709f(f);
        } else {
            f3 = m49709f(f);
            f2 = m49708e(f);
        }
        drawable.setBounds(C1947d7.m12987c((int) a.left, (int) a2.left, f3), drawable.getBounds().top, C1947d7.m12987c((int) a.right, (int) a2.right, f2), drawable.getBounds().bottom);
    }
}
