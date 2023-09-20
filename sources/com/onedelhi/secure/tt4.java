package com.onedelhi.secure;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

@sj3(18)
public class tt4 implements vt4 {

    /* renamed from: a */
    public final ViewGroupOverlay f21132a;

    public tt4(@mr2 ViewGroup viewGroup) {
        this.f21132a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo24083a(@mr2 View view) {
        this.f21132a.add(view);
    }

    /* renamed from: b */
    public void mo19884b(@mr2 Drawable drawable) {
        this.f21132a.add(drawable);
    }

    /* renamed from: c */
    public void mo19885c(@mr2 Drawable drawable) {
        this.f21132a.remove(drawable);
    }

    /* renamed from: d */
    public void mo24084d(@mr2 View view) {
        this.f21132a.remove(view);
    }
}
