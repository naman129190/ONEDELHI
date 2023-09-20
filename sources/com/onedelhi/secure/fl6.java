package com.onedelhi.secure;

import java.util.Iterator;
import javax.annotation.CheckForNull;

public final class fl6 extends xk6 {

    /* renamed from: a */
    public static final fl6 f12145a;

    /* renamed from: d */
    public static final Object[] f12146d;

    /* renamed from: b */
    public final transient Object[] f12147b;

    /* renamed from: c */
    public final transient Object[] f12148c;

    /* renamed from: n */
    public final transient int f12149n;

    /* renamed from: o */
    public final transient int f12150o;

    /* renamed from: p */
    public final transient int f12151p;

    static {
        Object[] objArr = new Object[0];
        f12146d = objArr;
        f12145a = new fl6(objArr, 0, objArr, 0, 0);
    }

    public fl6(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f12147b = objArr;
        this.f12149n = i;
        this.f12148c = objArr2;
        this.f12150o = i2;
        this.f12151p = i3;
    }

    /* renamed from: b */
    public final int mo14790b(Object[] objArr, int i) {
        System.arraycopy(this.f12147b, 0, objArr, 0, this.f12151p);
        return this.f12151p;
    }

    public final boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.f12148c;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int a = oj6.m23837a(obj.hashCode());
        while (true) {
            int i = a & this.f12150o;
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
    public final int mo13136e() {
        return this.f12151p;
    }

    /* renamed from: f */
    public final int mo13137f() {
        return 0;
    }

    /* renamed from: g */
    public final jl6 mo16060g() {
        return mo26984k().listIterator(0);
    }

    public final int hashCode() {
        return this.f12149n;
    }

    /* renamed from: i */
    public final Object[] mo13139i() {
        return this.f12147b;
    }

    public final /* synthetic */ Iterator iterator() {
        return mo26984k().listIterator(0);
    }

    /* renamed from: l */
    public final vk6 mo16063l() {
        return vk6.m30218k(this.f12147b, this.f12151p);
    }

    /* renamed from: o */
    public final boolean mo16064o() {
        return true;
    }

    public final int size() {
        return this.f12151p;
    }
}
