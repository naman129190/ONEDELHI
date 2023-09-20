package com.onedelhi.secure;

import java.util.Collections;

public class es4<K, A> extends C2760lj<K, A> {

    /* renamed from: a */
    public final ra2<A> f11692a;

    /* renamed from: b */
    public final A f11693b;

    public es4(hb2<A> hb2) {
        this(hb2, (Object) null);
    }

    public es4(hb2<A> hb2, @ts2 A a) {
        super(Collections.emptyList());
        this.f11692a = new ra2<>();
        mo19645m(hb2);
        this.f11693b = a;
    }

    /* renamed from: c */
    public float mo15564c() {
        return 1.0f;
    }

    /* renamed from: h */
    public A mo15565h() {
        hb2<A> hb2 = this.f15424a;
        A a = this.f11693b;
        return hb2.mo17180b(0.0f, 0.0f, a, a, mo19642f(), mo19642f(), mo19642f());
    }

    /* renamed from: i */
    public A mo14089i(ez1<K> ez1, float f) {
        return mo15565h();
    }

    /* renamed from: j */
    public void mo15566j() {
        if (this.f15424a != null) {
            super.mo15566j();
        }
    }

    /* renamed from: l */
    public void mo15567l(float f) {
        this.f15423a = f;
    }
}
