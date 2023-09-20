package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.onedelhi.secure.af4;
import com.onedelhi.secure.fd3;

public class TabItem extends View {

    /* renamed from: a */
    public final Drawable f24430a;

    /* renamed from: a */
    public final CharSequence f24431a;

    /* renamed from: n */
    public final int f24432n;

    public TabItem(Context context) {
        this(context, (AttributeSet) null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        af4 F = af4.m11109F(context, attributeSet, fd3.C2165o.TabItem);
        this.f24431a = F.mo13053x(fd3.C2165o.TabItem_android_text);
        this.f24430a = F.mo13037h(fd3.C2165o.TabItem_android_icon);
        this.f24432n = F.mo13050u(fd3.C2165o.TabItem_android_layout, 0);
        F.mo13029I();
    }
}
