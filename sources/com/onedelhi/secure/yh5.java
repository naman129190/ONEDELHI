package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class yh5 implements qh5 {

    /* renamed from: a */
    public final ArrayList f23113a;

    /* renamed from: b */
    public final String f23114b;

    public yh5(String str, List list) {
        this.f23114b = str;
        ArrayList arrayList = new ArrayList();
        this.f23113a = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: a */
    public final String mo27495a() {
        return this.f23114b;
    }

    /* renamed from: b */
    public final String mo13084b() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    /* renamed from: c */
    public final ArrayList mo27496c() {
        return this.f23113a;
    }

    /* renamed from: e */
    public final Double mo13085e() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh5)) {
            return false;
        }
        yh5 yh5 = (yh5) obj;
        String str = this.f23114b;
        if (str == null ? yh5.f23114b == null : str.equals(yh5.f23114b)) {
            return this.f23113a.equals(yh5.f23113a);
        }
        return false;
    }

    /* renamed from: f */
    public final Boolean mo13087f() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    /* renamed from: g */
    public final qh5 mo13088g(String str, w96 w96, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final int hashCode() {
        String str = this.f23114b;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f23113a.hashCode();
    }

    /* renamed from: k */
    public final qh5 mo13090k() {
        return this;
    }

    /* renamed from: l */
    public final Iterator mo13091l() {
        return null;
    }
}
