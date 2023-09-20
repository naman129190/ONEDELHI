package com.onedelhi.secure;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004B\u0017\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ0\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\n\u001a\u00028\u00002\b\b\u0002\u0010\u000b\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\n\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u000b\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0016\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/onedelhi/secure/ey2;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "toString", "a", "()Ljava/lang/Object;", "b", "first", "second", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/onedelhi/secure/ey2;", "", "hashCode", "", "other", "", "equals", "Ljava/lang/Object;", "e", "f", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class ey2<A, B> implements Serializable {

    /* renamed from: a */
    public final A f28122a;

    /* renamed from: b */
    public final B f28123b;

    public ey2(A a, B b) {
        this.f28122a = a;
        this.f28123b = b;
    }

    /* renamed from: d */
    public static /* synthetic */ ey2 m47340d(ey2 ey2, A a, B b, int i, Object obj) {
        if ((i & 1) != 0) {
            a = ey2.f28122a;
        }
        if ((i & 2) != 0) {
            b = ey2.f28123b;
        }
        return ey2.mo35667c(a, b);
    }

    /* renamed from: a */
    public final A mo35665a() {
        return this.f28122a;
    }

    /* renamed from: b */
    public final B mo35666b() {
        return this.f28123b;
    }

    @vr2
    /* renamed from: c */
    public final ey2<A, B> mo35667c(A a, B b) {
        return new ey2<>(a, b);
    }

    /* renamed from: e */
    public final A mo35668e() {
        return this.f28122a;
    }

    public boolean equals(@ss2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey2)) {
            return false;
        }
        ey2 ey2 = (ey2) obj;
        return jt1.m53768g(this.f28122a, ey2.f28122a) && jt1.m53768g(this.f28123b, ey2.f28123b);
    }

    /* renamed from: f */
    public final B mo35670f() {
        return this.f28123b;
    }

    public int hashCode() {
        A a = this.f28122a;
        int i = 0;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f28123b;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    @vr2
    public String toString() {
        return '(' + this.f28122a + ", " + this.f28123b + ')';
    }
}
