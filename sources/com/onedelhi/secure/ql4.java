package com.onedelhi.secure;

import java.util.Iterator;
import kotlin.Metadata;

@gz3(version = "1.5")
@tw4(markerClass = {oy0.class})
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B$\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002ø\u0001\u0000J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/onedelhi/secure/ql4;", "", "Lcom/onedelhi/secure/il4;", "", "iterator", "", "isEmpty", "", "other", "equals", "", "hashCode", "", "toString", "step", "I", "n", "()I", "start", "endInclusive", "<init>", "(IIILcom/onedelhi/secure/wg0;)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public class ql4 implements Iterable<il4>, nx1 {
    @vr2

    /* renamed from: a */
    public static final C6591a f34305a = new C6591a((wg0) null);

    /* renamed from: n */
    public final int f34306n;

    /* renamed from: o */
    public final int f34307o;

    /* renamed from: p */
    public final int f34308p;

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/ql4$a;", "", "Lcom/onedelhi/secure/il4;", "rangeStart", "rangeEnd", "", "step", "Lcom/onedelhi/secure/ql4;", "a", "(III)Lcom/onedelhi/secure/ql4;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.ql4$a */
    public static final class C6591a {
        public C6591a() {
        }

        public /* synthetic */ C6591a(wg0 wg0) {
            this();
        }

        @vr2
        /* renamed from: a */
        public final ql4 mo43667a(int i, int i2, int i3) {
            return new ql4(i, i2, i3, (wg0) null);
        }
    }

    public ql4(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f34306n = i;
            this.f34307o = mm4.m57425d(i, i2, i3);
            this.f34308p = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public /* synthetic */ ql4(int i, int i2, int i3, wg0 wg0) {
        this(i, i2, i3);
    }

    public boolean equals(@ss2 Object obj) {
        if (obj instanceof ql4) {
            if (!isEmpty() || !((ql4) obj).isEmpty()) {
                ql4 ql4 = (ql4) obj;
                if (!(this.f34306n == ql4.f34306n && this.f34307o == ql4.f34307o && this.f34308p == ql4.f34308p)) {
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
        return (((this.f34306n * 31) + this.f34307o) * 31) + this.f34308p;
    }

    public boolean isEmpty() {
        if (this.f34308p > 0) {
            if (mo4.m57477c(this.f34306n, this.f34307o) > 0) {
                return true;
            }
        } else if (mo4.m57477c(this.f34306n, this.f34307o) < 0) {
            return true;
        }
        return false;
    }

    @vr2
    public final Iterator<il4> iterator() {
        return new rl4(this.f34306n, this.f34307o, this.f34308p, (wg0) null);
    }

    /* renamed from: j */
    public final int mo43663j() {
        return this.f34306n;
    }

    /* renamed from: l */
    public final int mo43664l() {
        return this.f34307o;
    }

    /* renamed from: n */
    public final int mo43665n() {
        return this.f34308p;
    }

    @vr2
    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f34308p > 0) {
            sb = new StringBuilder();
            sb.append(il4.m52428m0(this.f34306n));
            sb.append("..");
            sb.append(il4.m52428m0(this.f34307o));
            sb.append(" step ");
            i = this.f34308p;
        } else {
            sb = new StringBuilder();
            sb.append(il4.m52428m0(this.f34306n));
            sb.append(" downTo ");
            sb.append(il4.m52428m0(this.f34307o));
            sb.append(" step ");
            i = -this.f34308p;
        }
        sb.append(i);
        return sb.toString();
    }
}
