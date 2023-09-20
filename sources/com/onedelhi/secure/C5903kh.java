package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.kh */
public final class C5903kh extends y24 {

    /* renamed from: a */
    public final long f31223a;

    /* renamed from: b */
    public final long f31224b;

    /* renamed from: c */
    public final long f31225c;

    public C5903kh(long j, long j2, long j3) {
        this.f31223a = j;
        this.f31224b = j2;
        this.f31225c = j3;
    }

    /* renamed from: b */
    public long mo39258b() {
        return this.f31224b;
    }

    /* renamed from: c */
    public long mo39259c() {
        return this.f31223a;
    }

    /* renamed from: d */
    public long mo39260d() {
        return this.f31225c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y24)) {
            return false;
        }
        y24 y24 = (y24) obj;
        return this.f31223a == y24.mo39259c() && this.f31224b == y24.mo39258b() && this.f31225c == y24.mo39260d();
    }

    public int hashCode() {
        long j = this.f31223a;
        long j2 = this.f31224b;
        long j3 = this.f31225c;
        return ((int) ((j3 >>> 32) ^ j3)) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f31223a + ", elapsedRealtime=" + this.f31224b + ", uptimeMillis=" + this.f31225c + "}";
    }
}
