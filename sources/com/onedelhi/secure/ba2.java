package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB!\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/onedelhi/secure/ba2;", "", "", "Lcom/onedelhi/secure/y92;", "o", "", "isEmpty", "", "other", "equals", "", "hashCode", "", "toString", "first", "J", "j", "()J", "last", "l", "step", "n", "start", "endInclusive", "<init>", "(JJJ)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public class ba2 implements Iterable<Long>, nx1 {
    @vr2

    /* renamed from: a */
    public static final C4661a f26256a = new C4661a((wg0) null);

    /* renamed from: b */
    public final long f26257b;

    /* renamed from: c */
    public final long f26258c;

    /* renamed from: d */
    public final long f26259d;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/ba2$a;", "", "", "rangeStart", "rangeEnd", "step", "Lcom/onedelhi/secure/ba2;", "a", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.ba2$a */
    public static final class C4661a {
        public C4661a() {
        }

        public /* synthetic */ C4661a(wg0 wg0) {
            this();
        }

        @vr2
        /* renamed from: a */
        public final ba2 mo31548a(long j, long j2, long j3) {
            return new ba2(j, j2, j3);
        }
    }

    public ba2(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j3 != Long.MIN_VALUE) {
            this.f26257b = j;
            this.f26258c = t53.m65387d(j, j2, j3);
            this.f26259d = j3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(@ss2 Object obj) {
        if (obj instanceof ba2) {
            if (!isEmpty() || !((ba2) obj).isEmpty()) {
                ba2 ba2 = (ba2) obj;
                if (!(this.f26257b == ba2.f26257b && this.f26258c == ba2.f26258c && this.f26259d == ba2.f26259d)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = (long) 31;
        long j2 = this.f26257b;
        long j3 = this.f26258c;
        long j4 = j * (((j2 ^ (j2 >>> 32)) * j) + (j3 ^ (j3 >>> 32)));
        long j5 = this.f26259d;
        return (int) (j4 + (j5 ^ (j5 >>> 32)));
    }

    public boolean isEmpty() {
        int i = (this.f26259d > 0 ? 1 : (this.f26259d == 0 ? 0 : -1));
        long j = this.f26257b;
        long j2 = this.f26258c;
        if (i > 0) {
            if (j > j2) {
                return true;
            }
        } else if (j < j2) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final long mo31543j() {
        return this.f26257b;
    }

    /* renamed from: l */
    public final long mo31544l() {
        return this.f26258c;
    }

    /* renamed from: n */
    public final long mo31545n() {
        return this.f26259d;
    }

    @vr2
    /* renamed from: o */
    public y92 iterator() {
        return new ca2(this.f26257b, this.f26258c, this.f26259d);
    }

    @vr2
    public String toString() {
        StringBuilder sb;
        long j;
        if (this.f26259d > 0) {
            sb.append(this.f26257b);
            sb.append("..");
            sb.append(this.f26258c);
            sb.append(" step ");
            j = this.f26259d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f26257b);
            sb.append(" downTo ");
            sb.append(this.f26258c);
            sb.append(" step ");
            j = -this.f26259d;
        }
        sb.append(j);
        return sb.toString();
    }
}
