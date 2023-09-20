package com.onedelhi.secure;

import kotlin.Metadata;

@my0
@gz3(version = "1.3")
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001a\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012\u0006\u0010\t\u001a\u00020\u0005ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0003\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\u00020\u0005HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\b\u001a\u00028\u00002\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004R\u001d\u0010\t\u001a\u00020\u00058\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/onedelhi/secure/le4;", "T", "", "a", "()Ljava/lang/Object;", "Lcom/onedelhi/secure/fq0;", "b", "()J", "value", "duration", "c", "(Ljava/lang/Object;J)Lcom/onedelhi/secure/le4;", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Object;", "f", "J", "e", "<init>", "(Ljava/lang/Object;JLcom/onedelhi/secure/wg0;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class le4<T> {

    /* renamed from: a */
    public final long f31642a;

    /* renamed from: a */
    public final T f31643a;

    public le4(T t, long j) {
        this.f31643a = t;
        this.f31642a = j;
    }

    public /* synthetic */ le4(Object obj, long j, wg0 wg0) {
        this(obj, j);
    }

    /* renamed from: d */
    public static /* synthetic */ le4 m55543d(le4 le4, T t, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            t = le4.f31643a;
        }
        if ((i & 2) != 0) {
            j = le4.f31642a;
        }
        return le4.mo39804c(t, j);
    }

    /* renamed from: a */
    public final T mo39802a() {
        return this.f31643a;
    }

    /* renamed from: b */
    public final long mo39803b() {
        return this.f31642a;
    }

    @vr2
    /* renamed from: c */
    public final le4<T> mo39804c(T t, long j) {
        return new le4<>(t, j, (wg0) null);
    }

    /* renamed from: e */
    public final long mo39805e() {
        return this.f31642a;
    }

    public boolean equals(@ss2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le4)) {
            return false;
        }
        le4 le4 = (le4) obj;
        return jt1.m53768g(this.f31643a, le4.f31643a) && fq0.m48296y(this.f31642a, le4.f31642a);
    }

    /* renamed from: f */
    public final T mo39807f() {
        return this.f31643a;
    }

    public int hashCode() {
        T t = this.f31643a;
        return ((t == null ? 0 : t.hashCode()) * 31) + fq0.m48270g0(this.f31642a);
    }

    @vr2
    public String toString() {
        return "TimedValue(value=" + this.f31643a + ", duration=" + fq0.m48232B0(this.f31642a) + ')';
    }
}
