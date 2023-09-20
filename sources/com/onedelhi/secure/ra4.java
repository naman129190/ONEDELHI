package com.onedelhi.secure;

import kotlin.Metadata;

@gz3(version = "1.3")
@my0
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/onedelhi/secure/ra4;", "Lcom/onedelhi/secure/u0;", "", "c", "Lcom/onedelhi/secure/fq0;", "duration", "Lcom/onedelhi/secure/un4;", "e", "(J)V", "d", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
public final class ra4 extends C6913u0 {

    /* renamed from: a */
    public long f34547a;

    public ra4() {
        super(lq0.NANOSECONDS);
    }

    /* renamed from: c */
    public long mo43830c() {
        return this.f34547a;
    }

    /* renamed from: d */
    public final void mo43831d(long j) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.f34547a + "ns is advanced by " + fq0.m48232B0(j) + '.');
    }

    /* renamed from: e */
    public final void mo43832e(long j) {
        long j2;
        long y0 = fq0.m48297y0(j, mo45346b());
        if (y0 == Long.MIN_VALUE || y0 == Long.MAX_VALUE) {
            double v0 = ((double) this.f34547a) + fq0.m48291v0(j, mo45346b());
            if (v0 > 9.223372036854776E18d || v0 < -9.223372036854776E18d) {
                mo43831d(j);
            }
            j2 = (long) v0;
        } else {
            long j3 = this.f34547a;
            j2 = j3 + y0;
            if ((y0 ^ j3) >= 0 && (j3 ^ j2) < 0) {
                mo43831d(j);
            }
        }
        this.f34547a = j2;
    }
}
