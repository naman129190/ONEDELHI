package com.onedelhi.secure;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.C4238a;
import com.google.android.material.tabs.TabLayout;

public class vz0 extends C4238a {

    /* renamed from: a */
    public static final float f36785a = 0.5f;

    /* renamed from: d */
    public void mo29111d(TabLayout tabLayout, View view, View view2, float f, @mr2 Drawable drawable) {
        int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        if (i >= 0) {
            view = view2;
        }
        RectF a = C4238a.m34152a(tabLayout, view);
        float b = i < 0 ? C1947d7.m12986b(1.0f, 0.0f, 0.0f, 0.5f, f) : C1947d7.m12986b(0.0f, 1.0f, 0.5f, 1.0f, f);
        drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (b * 255.0f));
    }
}
