package com.onedelhi.secure;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.jspecify.nullness.NullMarked;

@NullMarked
public final class af5 extends ee5 {

    /* renamed from: a */
    public static final ee5 f9046a = new af5(new Object[0], 0);

    /* renamed from: b */
    public final transient Object[] f9047b;

    /* renamed from: n */
    public final transient int f9048n;

    public af5(Object[] objArr, int i) {
        this.f9047b = objArr;
        this.f9048n = i;
    }

    /* renamed from: b */
    public final int mo13056b(Object[] objArr, int i) {
        System.arraycopy(this.f9047b, 0, objArr, 0, this.f9048n);
        return this.f9048n;
    }

    /* renamed from: e */
    public final int mo13057e() {
        return this.f9048n;
    }

    /* renamed from: f */
    public final int mo13058f() {
        return 0;
    }

    public final Object get(int i) {
        z17.m32798a(i, this.f9048n, FirebaseAnalytics.C4305d.f24955X);
        Object obj = this.f9047b[i];
        obj.getClass();
        return obj;
    }

    /* renamed from: j */
    public final boolean mo13060j() {
        return false;
    }

    /* renamed from: k */
    public final Object[] mo13061k() {
        return this.f9047b;
    }

    public final int size() {
        return this.f9048n;
    }
}
