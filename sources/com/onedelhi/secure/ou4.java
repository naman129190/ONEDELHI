package com.onedelhi.secure;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

@sj3(18)
public class ou4 implements qu4 {

    /* renamed from: a */
    public final ViewOverlay f18131a;

    public ou4(@mr2 View view) {
        this.f18131a = view.getOverlay();
    }

    /* renamed from: b */
    public void mo19884b(@mr2 Drawable drawable) {
        this.f18131a.add(drawable);
    }

    /* renamed from: c */
    public void mo19885c(@mr2 Drawable drawable) {
        this.f18131a.remove(drawable);
    }
}
