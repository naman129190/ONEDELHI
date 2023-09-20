package com.onedelhi.secure;

import android.graphics.drawable.Drawable;

public abstract class nc0<T> implements s94<T> {
    @ts2

    /* renamed from: a */
    public si3 f17300a;

    /* renamed from: n */
    public final int f17301n;

    /* renamed from: o */
    public final int f17302o;

    public nc0() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public nc0(int i, int i2) {
        if (oq4.m24035w(i, i2)) {
            this.f17301n = i;
            this.f17302o = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }

    /* renamed from: a */
    public final void mo16333a(@ts2 si3 si3) {
        this.f17300a = si3;
    }

    /* renamed from: b */
    public void mo16019b(@ts2 Drawable drawable) {
    }

    /* renamed from: c */
    public void mo15993c() {
    }

    /* renamed from: d */
    public void mo15995d() {
    }

    /* renamed from: e */
    public final void mo14955e(@mr2 uz3 uz3) {
        uz3.mo19958e(this.f17301n, this.f17302o);
    }

    /* renamed from: g */
    public void mo15999g() {
    }

    /* renamed from: h */
    public void mo16334h(@ts2 Drawable drawable) {
    }

    @ts2
    /* renamed from: m */
    public final si3 mo16335m() {
        return this.f17300a;
    }

    /* renamed from: r */
    public final void mo14956r(@mr2 uz3 uz3) {
    }
}
