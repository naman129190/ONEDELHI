package com.onedelhi.secure;

import java.util.Iterator;
import kotlin.Metadata;

@gz3(version = "1.5")
@tw4(markerClass = {oy0.class})
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B$\b\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002ø\u0001\u0000J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/onedelhi/secure/xl4;", "", "Lcom/onedelhi/secure/tl4;", "", "iterator", "", "isEmpty", "", "other", "equals", "", "hashCode", "", "toString", "", "step", "J", "n", "()J", "start", "endInclusive", "<init>", "(JJJLcom/onedelhi/secure/wg0;)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public class xl4 implements Iterable<tl4>, nx1 {
    @vr2

    /* renamed from: a */
    public static final C7270a f37533a = new C7270a((wg0) null);

    /* renamed from: b */
    public final long f37534b;

    /* renamed from: c */
    public final long f37535c;

    /* renamed from: d */
    public final long f37536d;

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/xl4$a;", "", "Lcom/onedelhi/secure/tl4;", "rangeStart", "rangeEnd", "", "step", "Lcom/onedelhi/secure/xl4;", "a", "(JJJ)Lcom/onedelhi/secure/xl4;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.onedelhi.secure.xl4$a */
    public static final class C7270a {
        public C7270a() {
        }

        public /* synthetic */ C7270a(wg0 wg0) {
            this();
        }

        @vr2
        /* renamed from: a */
        public final xl4 mo47354a(long j, long j2, long j3) {
            return new xl4(j, j2, j3, (wg0) null);
        }
    }

    public xl4(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j3 != Long.MIN_VALUE) {
            this.f37534b = j;
            this.f37535c = mm4.m57424c(j, j2, j3);
            this.f37536d = j3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public /* synthetic */ xl4(long j, long j2, long j3, wg0 wg0) {
        this(j, j2, j3);
    }

    public boolean equals(@ss2 Object obj) {
        if (obj instanceof xl4) {
            if (!isEmpty() || !((xl4) obj).isEmpty()) {
                xl4 xl4 = (xl4) obj;
                if (!(this.f37534b == xl4.f37534b && this.f37535c == xl4.f37535c && this.f37536d == xl4.f37536d)) {
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
        long j = this.f37534b;
        long j2 = this.f37535c;
        long j3 = this.f37536d;
        return ((int) (j3 ^ (j3 >>> 32))) + (((((int) tl4.m66012s(j ^ tl4.m66012s(j >>> 32))) * 31) + ((int) tl4.m66012s(j2 ^ tl4.m66012s(j2 >>> 32)))) * 31);
    }

    public boolean isEmpty() {
        int i = (this.f37536d > 0 ? 1 : (this.f37536d == 0 ? 0 : -1));
        int g = mo4.m57481g(this.f37534b, this.f37535c);
        if (i > 0) {
            if (g > 0) {
                return true;
            }
        } else if (g < 0) {
            return true;
        }
        return false;
    }

    @vr2
    public final Iterator<tl4> iterator() {
        return new yl4(this.f37534b, this.f37535c, this.f37536d, (wg0) null);
    }

    /* renamed from: j */
    public final long mo47350j() {
        return this.f37534b;
    }

    /* renamed from: l */
    public final long mo47351l() {
        return this.f37535c;
    }

    /* renamed from: n */
    public final long mo47352n() {
        return this.f37536d;
    }

    @vr2
    public String toString() {
        StringBuilder sb;
        long j;
        if (this.f37536d > 0) {
            sb.append(tl4.m66005m0(this.f37534b));
            sb.append("..");
            sb.append(tl4.m66005m0(this.f37535c));
            sb.append(" step ");
            j = this.f37536d;
        } else {
            sb = new StringBuilder();
            sb.append(tl4.m66005m0(this.f37534b));
            sb.append(" downTo ");
            sb.append(tl4.m66005m0(this.f37535c));
            sb.append(" step ");
            j = -this.f37536d;
        }
        sb.append(j);
        return sb.toString();
    }
}
