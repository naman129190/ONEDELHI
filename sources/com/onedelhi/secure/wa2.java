package com.onedelhi.secure;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

public abstract class wa2<T> extends hb2<T> {

    /* renamed from: a */
    public final Interpolator f22076a;

    /* renamed from: b */
    public final T f22077b;

    /* renamed from: c */
    public final T f22078c;

    public wa2(T t, T t2) {
        this(t, t2, new LinearInterpolator());
    }

    public wa2(T t, T t2, Interpolator interpolator) {
        this.f22077b = t;
        this.f22078c = t2;
        this.f22076a = interpolator;
    }

    /* renamed from: a */
    public T mo7444a(ra2<T> ra2) {
        return mo24817e(this.f22077b, this.f22078c, this.f22076a.getInterpolation(ra2.mo23770e()));
    }

    /* renamed from: e */
    public abstract T mo24817e(T t, T t2, float f);
}
