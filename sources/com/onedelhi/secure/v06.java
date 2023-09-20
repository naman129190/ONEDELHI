package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;

public final class v06 extends r06 {

    /* renamed from: a */
    public static final r06 f21630a = new v06(new Object[0], 0);

    /* renamed from: b */
    public final transient Object[] f21631b;

    /* renamed from: n */
    public final transient int f21632n;

    public v06(Object[] objArr, int i) {
        this.f21631b = objArr;
        this.f21632n = i;
    }

    /* renamed from: b */
    public final int mo15671b(Object[] objArr, int i) {
        System.arraycopy(this.f21631b, 0, objArr, 0, this.f21632n);
        return this.f21632n;
    }

    /* renamed from: e */
    public final int mo15673e() {
        return this.f21632n;
    }

    /* renamed from: f */
    public final int mo15674f() {
        return 0;
    }

    public final Object get(int i) {
        tz5.m29033a(i, this.f21632n, FirebaseAnalytics.C4305d.f24955X);
        Object obj = this.f21631b[i];
        obj.getClass();
        return obj;
    }

    /* renamed from: j */
    public final boolean mo15678j() {
        return false;
    }

    /* renamed from: k */
    public final Object[] mo15679k() {
        return this.f21631b;
    }

    public final int size() {
        return this.f21632n;
    }
}
