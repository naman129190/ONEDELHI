package com.onedelhi.secure;

public final class vb0 {

    /* renamed from: a */
    public int f36471a = 0;

    /* renamed from: a */
    public C7023a f36472a = C7023a.NUMERIC;

    /* renamed from: com.onedelhi.secure.vb0$a */
    public enum C7023a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    /* renamed from: a */
    public int mo46064a() {
        return this.f36471a;
    }

    /* renamed from: b */
    public void mo46065b(int i) {
        this.f36471a += i;
    }

    /* renamed from: c */
    public boolean mo46066c() {
        return this.f36472a == C7023a.ALPHA;
    }

    /* renamed from: d */
    public boolean mo46067d() {
        return this.f36472a == C7023a.ISO_IEC_646;
    }

    /* renamed from: e */
    public boolean mo46068e() {
        return this.f36472a == C7023a.NUMERIC;
    }

    /* renamed from: f */
    public void mo46069f() {
        this.f36472a = C7023a.ALPHA;
    }

    /* renamed from: g */
    public void mo46070g() {
        this.f36472a = C7023a.ISO_IEC_646;
    }

    /* renamed from: h */
    public void mo46071h() {
        this.f36472a = C7023a.NUMERIC;
    }

    /* renamed from: i */
    public void mo46072i(int i) {
        this.f36471a = i;
    }
}
