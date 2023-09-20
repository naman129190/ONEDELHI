package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0005\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00028\u0000HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0006¨\u0006\u0018"}, d2 = {"Lcom/onedelhi/secure/cq1;", "T", "", "", "a", "b", "()Ljava/lang/Object;", "index", "value", "c", "(ILjava/lang/Object;)Lcom/onedelhi/secure/cq1;", "", "toString", "hashCode", "other", "", "equals", "I", "e", "()I", "Ljava/lang/Object;", "f", "<init>", "(ILjava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class cq1<T> {

    /* renamed from: a */
    public final int f27035a;

    /* renamed from: a */
    public final T f27036a;

    public cq1(int i, T t) {
        this.f27035a = i;
        this.f27036a = t;
    }

    /* renamed from: d */
    public static /* synthetic */ cq1 m44220d(cq1 cq1, int i, T t, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cq1.f27035a;
        }
        if ((i2 & 2) != 0) {
            t = cq1.f27036a;
        }
        return cq1.mo33924c(i, t);
    }

    /* renamed from: a */
    public final int mo33922a() {
        return this.f27035a;
    }

    /* renamed from: b */
    public final T mo33923b() {
        return this.f27036a;
    }

    @vr2
    /* renamed from: c */
    public final cq1<T> mo33924c(int i, T t) {
        return new cq1<>(i, t);
    }

    /* renamed from: e */
    public final int mo33925e() {
        return this.f27035a;
    }

    public boolean equals(@ss2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq1)) {
            return false;
        }
        cq1 cq1 = (cq1) obj;
        return this.f27035a == cq1.f27035a && jt1.m53768g(this.f27036a, cq1.f27036a);
    }

    /* renamed from: f */
    public final T mo33927f() {
        return this.f27036a;
    }

    public int hashCode() {
        int i = this.f27035a * 31;
        T t = this.f27036a;
        return i + (t == null ? 0 : t.hashCode());
    }

    @vr2
    public String toString() {
        return "IndexedValue(index=" + this.f27035a + ", value=" + this.f27036a + ')';
    }
}
