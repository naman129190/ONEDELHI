package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;

public final class dl6 extends vk6 {

    /* renamed from: a */
    public static final vk6 f10859a = new dl6(new Object[0], 0);

    /* renamed from: b */
    public final transient Object[] f10860b;

    /* renamed from: o */
    public final transient int f10861o;

    public dl6(Object[] objArr, int i) {
        this.f10860b = objArr;
        this.f10861o = i;
    }

    /* renamed from: b */
    public final int mo14790b(Object[] objArr, int i) {
        System.arraycopy(this.f10860b, 0, objArr, 0, this.f10861o);
        return this.f10861o;
    }

    /* renamed from: e */
    public final int mo13136e() {
        return this.f10861o;
    }

    /* renamed from: f */
    public final int mo13137f() {
        return 0;
    }

    public final Object get(int i) {
        ui6.m29377a(i, this.f10861o, FirebaseAnalytics.C4305d.f24955X);
        Object obj = this.f10860b[i];
        obj.getClass();
        return obj;
    }

    /* renamed from: i */
    public final Object[] mo13139i() {
        return this.f10860b;
    }

    public final int size() {
        return this.f10861o;
    }
}
