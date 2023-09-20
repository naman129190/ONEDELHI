package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.onedelhi.secure.C1947d7;
import com.onedelhi.secure.d81;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pv4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.zk0;

/* renamed from: com.google.android.material.tabs.a */
public class C4238a {
    @zk0(unit = 0)

    /* renamed from: a */
    public static final int f24540a = 24;

    /* renamed from: a */
    public static RectF m34152a(TabLayout tabLayout, @ts2 View view) {
        return view == null ? new RectF() : (tabLayout.mo28944C() || !(view instanceof TabLayout.TabView)) ? new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom()) : m34153b((TabLayout.TabView) view, 24);
    }

    /* renamed from: b */
    public static RectF m34153b(@mr2 TabLayout.TabView tabView, @zk0(unit = 0) int i) {
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int e = (int) pv4.m61665e(tabView.getContext(), i);
        if (contentWidth < e) {
            contentWidth = e;
        }
        int left = (tabView.getLeft() + tabView.getRight()) / 2;
        int top = (tabView.getTop() + tabView.getBottom()) / 2;
        int i2 = contentWidth / 2;
        return new RectF((float) (left - i2), (float) (top - (contentHeight / 2)), (float) (i2 + left), (float) (top + (left / 2)));
    }

    /* renamed from: c */
    public void mo29110c(TabLayout tabLayout, View view, @mr2 Drawable drawable) {
        RectF a = m34152a(tabLayout, view);
        drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
    }

    /* renamed from: d */
    public void mo29111d(TabLayout tabLayout, View view, View view2, @d81(from = 0.0d, mo14561to = 1.0d) float f, @mr2 Drawable drawable) {
        RectF a = m34152a(tabLayout, view);
        RectF a2 = m34152a(tabLayout, view2);
        drawable.setBounds(C1947d7.m12987c((int) a.left, (int) a2.left, f), drawable.getBounds().top, C1947d7.m12987c((int) a.right, (int) a2.right, f), drawable.getBounds().bottom);
    }
}
