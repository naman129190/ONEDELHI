package com.onedelhi.secure;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

@sj3(18)
public class st4 implements ut4 {

    /* renamed from: a */
    public final ViewGroupOverlay f35195a;

    public st4(@mr2 ViewGroup viewGroup) {
        this.f35195a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo43729a(@mr2 View view) {
        this.f35195a.add(view);
    }

    /* renamed from: b */
    public void mo40792b(@mr2 Drawable drawable) {
        this.f35195a.add(drawable);
    }

    /* renamed from: c */
    public void mo40793c(@mr2 Drawable drawable) {
        this.f35195a.remove(drawable);
    }

    /* renamed from: d */
    public void mo43730d(@mr2 View view) {
        this.f35195a.remove(view);
    }
}
