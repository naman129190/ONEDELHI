package com.onedelhi.secure;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

@sj3(18)
public class nu4 implements pu4 {

    /* renamed from: a */
    public final ViewOverlay f32791a;

    public nu4(@mr2 View view) {
        this.f32791a = view.getOverlay();
    }

    /* renamed from: b */
    public void mo40792b(@mr2 Drawable drawable) {
        this.f32791a.add(drawable);
    }

    /* renamed from: c */
    public void mo40793c(@mr2 Drawable drawable) {
        this.f32791a.remove(drawable);
    }
}
