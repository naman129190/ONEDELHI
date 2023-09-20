package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB!\b\u0000\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/onedelhi/secure/vw;", "", "", "Lcom/onedelhi/secure/uw;", "o", "", "isEmpty", "", "other", "equals", "", "hashCode", "", "toString", "first", "C", "j", "()C", "last", "l", "step", "I", "n", "()I", "start", "endInclusive", "<init>", "(CCI)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.onedelhi.secure.vw */
public class C7100vw implements Iterable<Character>, nx1 {
    @vr2

    /* renamed from: a */
    public static final C7101a f36727a = new C7101a((wg0) null);

    /* renamed from: a */
    public final char f36728a;

    /* renamed from: b */
    public final char f36729b;

    /* renamed from: n */
    public final int f36730n;

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/onedelhi/secure/vw$a;", "", "", "rangeStart", "rangeEnd", "", "step", "Lcom/onedelhi/secure/vw;", "a", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.vw$a */
    public static final class C7101a {
        public C7101a() {
        }

        public /* synthetic */ C7101a(wg0 wg0) {
            this();
        }

        @vr2
        /* renamed from: a */
        public final C7100vw mo46398a(char c, char c2, int i) {
            return new C7100vw(c, c2, i);
        }
    }

    public C7100vw(char c, char c2, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i != Integer.MIN_VALUE) {
            this.f36728a = c;
            this.f36729b = (char) t53.m65386c(c, c2, i);
            this.f36730n = i;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(@ss2 Object obj) {
        if (obj instanceof C7100vw) {
            if (!isEmpty() || !((C7100vw) obj).isEmpty()) {
                C7100vw vwVar = (C7100vw) obj;
                if (!(this.f36728a == vwVar.f36728a && this.f36729b == vwVar.f36729b && this.f36730n == vwVar.f36730n)) {
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
        return (((this.f36728a * oo2.f33149a) + this.f36729b) * 31) + this.f36730n;
    }

    public boolean isEmpty() {
        if (this.f36730n > 0) {
            if (jt1.m53781t(this.f36728a, this.f36729b) > 0) {
                return true;
            }
        } else if (jt1.m53781t(this.f36728a, this.f36729b) < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final char mo46393j() {
        return this.f36728a;
    }

    /* renamed from: l */
    public final char mo46394l() {
        return this.f36729b;
    }

    /* renamed from: n */
    public final int mo46395n() {
        return this.f36730n;
    }

    @vr2
    /* renamed from: o */
    public C6980uw iterator() {
        return new C7191ww(this.f36728a, this.f36729b, this.f36730n);
    }

    @vr2
    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f36730n > 0) {
            sb = new StringBuilder();
            sb.append(this.f36728a);
            sb.append("..");
            sb.append(this.f36729b);
            sb.append(" step ");
            i = this.f36730n;
        } else {
            sb = new StringBuilder();
            sb.append(this.f36728a);
            sb.append(" downTo ");
            sb.append(this.f36729b);
            sb.append(" step ");
            i = -this.f36730n;
        }
        sb.append(i);
        return sb.toString();
    }
}
