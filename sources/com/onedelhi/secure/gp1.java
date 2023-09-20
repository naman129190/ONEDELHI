package com.onedelhi.secure;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.onedelhi.secure.jh4;

public abstract class gp1<Z> extends gv4<ImageView, Z> implements jh4.C2520a {
    @ts2

    /* renamed from: a */
    public Animatable f12690a;

    public gp1(ImageView imageView) {
        super(imageView);
    }

    @Deprecated
    public gp1(ImageView imageView, boolean z) {
        super(imageView, z);
    }

    /* renamed from: b */
    public void mo16019b(@ts2 Drawable drawable) {
        super.mo16019b(drawable);
        mo16802z((Object) null);
        mo16800j(drawable);
    }

    /* renamed from: c */
    public void mo15993c() {
        Animatable animatable = this.f12690a;
        if (animatable != null) {
            animatable.stop();
        }
    }

    /* renamed from: d */
    public void mo15995d() {
        Animatable animatable = this.f12690a;
        if (animatable != null) {
            animatable.start();
        }
    }

    /* renamed from: h */
    public void mo16334h(@ts2 Drawable drawable) {
        super.mo16334h(drawable);
        mo16802z((Object) null);
        mo16800j(drawable);
    }

    @ts2
    /* renamed from: i */
    public Drawable mo16799i() {
        return ((ImageView) this.f12769a).getDrawable();
    }

    /* renamed from: j */
    public void mo16800j(Drawable drawable) {
        ((ImageView) this.f12769a).setImageDrawable(drawable);
    }

    /* renamed from: p */
    public void mo16336p(@ts2 Drawable drawable) {
        super.mo16336p(drawable);
        Animatable animatable = this.f12690a;
        if (animatable != null) {
            animatable.stop();
        }
        mo16802z((Object) null);
        mo16800j(drawable);
    }

    /* renamed from: s */
    public void mo16021s(@mr2 Z z, @ts2 jh4<? super Z> jh4) {
        if (jh4 == null || !jh4.mo13290a(z, this)) {
            mo16802z(z);
        } else {
            mo16801x(z);
        }
    }

    /* renamed from: x */
    public final void mo16801x(@ts2 Z z) {
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.f12690a = animatable;
            animatable.start();
            return;
        }
        this.f12690a = null;
    }

    /* renamed from: y */
    public abstract void mo13790y(@ts2 Z z);

    /* renamed from: z */
    public final void mo16802z(@ts2 Z z) {
        mo13790y(z);
        mo16801x(z);
    }
}
