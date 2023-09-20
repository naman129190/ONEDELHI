package com.onedelhi.secure;

import java.util.Iterator;
import javax.annotation.CheckForNull;

public final class ak5 extends cj5 {

    /* renamed from: a */
    public static final ak5 f9339a;

    /* renamed from: d */
    public static final Object[] f9340d;

    /* renamed from: b */
    public final transient Object[] f9341b;

    /* renamed from: c */
    public final transient Object[] f9342c;

    /* renamed from: n */
    public final transient int f9343n;

    /* renamed from: o */
    public final transient int f9344o;

    /* renamed from: p */
    public final transient int f9345p;

    static {
        Object[] objArr = new Object[0];
        f9340d = objArr;
        f9339a = new ak5(objArr, 0, objArr, 0, 0);
    }

    public ak5(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f9341b = objArr;
        this.f9343n = i;
        this.f9342c = objArr2;
        this.f9344o = i2;
        this.f9345p = i3;
    }

    /* renamed from: b */
    public final int mo13125b(Object[] objArr, int i) {
        System.arraycopy(this.f9341b, 0, objArr, 0, this.f9345p);
        return this.f9345p;
    }

    public final boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.f9342c;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int a = oh5.m23797a(obj.hashCode());
        while (true) {
            int i = a & this.f9344o;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a = i + 1;
        }
    }

    /* renamed from: e */
    public final int mo13127e() {
        return this.f9345p;
    }

    /* renamed from: f */
    public final int mo13128f() {
        return 0;
    }

    /* renamed from: g */
    public final qk5 mo13129g() {
        return mo14168k().listIterator(0);
    }

    public final int hashCode() {
        return this.f9343n;
    }

    /* renamed from: i */
    public final Object[] mo13131i() {
        return this.f9341b;
    }

    public final /* synthetic */ Iterator iterator() {
        return mo14168k().listIterator(0);
    }

    /* renamed from: l */
    public final ui5 mo13133l() {
        return ui5.m29372k(this.f9341b, this.f9345p);
    }

    /* renamed from: o */
    public final boolean mo13134o() {
        return true;
    }

    public final int size() {
        return this.f9345p;
    }
}
