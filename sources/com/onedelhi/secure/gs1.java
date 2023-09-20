package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B!\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/onedelhi/secure/gs1;", "", "", "Lcom/onedelhi/secure/ds1;", "o", "", "isEmpty", "", "other", "equals", "hashCode", "", "toString", "first", "I", "j", "()I", "last", "l", "step", "n", "start", "endInclusive", "<init>", "(III)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public class gs1 implements Iterable<Integer>, nx1 {
    @vr2

    /* renamed from: a */
    public static final C5447a f29297a = new C5447a((wg0) null);

    /* renamed from: n */
    public final int f29298n;

    /* renamed from: o */
    public final int f29299o;

    /* renamed from: p */
    public final int f29300p;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/onedelhi/secure/gs1$a;", "", "", "rangeStart", "rangeEnd", "step", "Lcom/onedelhi/secure/gs1;", "a", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.gs1$a */
    public static final class C5447a {
        public C5447a() {
        }

        public /* synthetic */ C5447a(wg0 wg0) {
            this();
        }

        @vr2
        /* renamed from: a */
        public final gs1 mo36876a(int i, int i2, int i3) {
            return new gs1(i, i2, i3);
        }
    }

    public gs1(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f29298n = i;
            this.f29299o = t53.m65386c(i, i2, i3);
            this.f29300p = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(@ss2 Object obj) {
        if (obj instanceof gs1) {
            if (!isEmpty() || !((gs1) obj).isEmpty()) {
                gs1 gs1 = (gs1) obj;
                if (!(this.f29298n == gs1.f29298n && this.f29299o == gs1.f29299o && this.f29300p == gs1.f29300p)) {
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
        return (((this.f29298n * 31) + this.f29299o) * 31) + this.f29300p;
    }

    public boolean isEmpty() {
        if (this.f29300p > 0) {
            if (this.f29298n > this.f29299o) {
                return true;
            }
        } else if (this.f29298n < this.f29299o) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final int mo36871j() {
        return this.f29298n;
    }

    /* renamed from: l */
    public final int mo36872l() {
        return this.f29299o;
    }

    /* renamed from: n */
    public final int mo36873n() {
        return this.f29300p;
    }

    @vr2
    /* renamed from: o */
    public ds1 iterator() {
        return new hs1(this.f29298n, this.f29299o, this.f29300p);
    }

    @vr2
    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f29300p > 0) {
            sb = new StringBuilder();
            sb.append(this.f29298n);
            sb.append("..");
            sb.append(this.f29299o);
            sb.append(" step ");
            i = this.f29300p;
        } else {
            sb = new StringBuilder();
            sb.append(this.f29298n);
            sb.append(" downTo ");
            sb.append(this.f29299o);
            sb.append(" step ");
            i = -this.f29300p;
        }
        sb.append(i);
        return sb.toString();
    }
}
