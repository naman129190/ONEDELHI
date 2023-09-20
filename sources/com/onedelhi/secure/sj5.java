package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;

public final class sj5 extends ui5 {

    /* renamed from: a */
    public static final ui5 f20401a = new sj5(new Object[0], 0);

    /* renamed from: b */
    public final transient Object[] f20402b;

    /* renamed from: o */
    public final transient int f20403o;

    public sj5(Object[] objArr, int i) {
        this.f20402b = objArr;
        this.f20403o = i;
    }

    /* renamed from: b */
    public final int mo13125b(Object[] objArr, int i) {
        System.arraycopy(this.f20402b, 0, objArr, 0, this.f20403o);
        return this.f20403o;
    }

    /* renamed from: e */
    public final int mo13127e() {
        return this.f20403o;
    }

    /* renamed from: f */
    public final int mo13128f() {
        return 0;
    }

    public final Object get(int i) {
        pg5.m24693a(i, this.f20403o, FirebaseAnalytics.C4305d.f24955X);
        Object obj = this.f20402b[i];
        obj.getClass();
        return obj;
    }

    /* renamed from: i */
    public final Object[] mo13131i() {
        return this.f20402b;
    }

    public final int size() {
        return this.f20403o;
    }
}
