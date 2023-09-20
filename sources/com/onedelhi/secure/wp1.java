package com.onedelhi.secure;

public abstract class wp1 {

    /* renamed from: a */
    public long f37066a = 0;

    /* renamed from: a */
    public final bz4 f37067a;

    /* renamed from: b */
    public long f37068b = 0;

    /* renamed from: c */
    public long f37069c = 0;

    /* renamed from: d */
    public long f37070d = 0;

    public wp1(bz4 bz4) {
        this.f37067a = bz4;
    }

    /* renamed from: a */
    public void mo46813a(long j, long j2) throws bz4 {
        this.f37066a += (3 + j) & -4;
        this.f37068b += j2;
        this.f37069c += (long) (qq4.m63145a(j) + qq4.m63145a(j2));
        this.f37070d++;
        if (this.f37066a < 0 || this.f37068b < 0 || mo46815c() > qq4.f34329a || mo46816d() < 0) {
            throw this.f37067a;
        }
    }

    /* renamed from: b */
    public int mo46814b() {
        return (int) (3 & (4 - mo46817e()));
    }

    /* renamed from: c */
    public long mo46815c() {
        return (mo46817e() + 3) & -4;
    }

    /* renamed from: d */
    public long mo46816d() {
        return this.f37066a + 12 + mo46815c() + 12;
    }

    /* renamed from: e */
    public final long mo46817e() {
        return ((long) (qq4.m63145a(this.f37070d) + 1)) + this.f37069c + 4;
    }
}
