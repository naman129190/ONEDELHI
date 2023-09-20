package com.onedelhi.secure;

import java.io.IOException;

public class co4 extends ao4<bo4, bo4> {
    /* renamed from: A */
    public bo4 mo31095g(Object obj) {
        return ((qe1) obj).unknownFields;
    }

    /* renamed from: B */
    public int mo31096h(bo4 bo4) {
        return bo4.mo31960d();
    }

    /* renamed from: C */
    public int mo31097i(bo4 bo4) {
        return bo4.mo31961e();
    }

    /* renamed from: D */
    public bo4 mo31099k(bo4 bo4, bo4 bo42) {
        return bo42.equals(bo4.m40221c()) ? bo4 : bo4.m40224m(bo4, bo42);
    }

    /* renamed from: E */
    public bo4 mo31102n() {
        return bo4.m40225n();
    }

    /* renamed from: F */
    public void mo31103o(Object obj, bo4 bo4) {
        mo31104p(obj, bo4);
    }

    /* renamed from: G */
    public void mo31104p(Object obj, bo4 bo4) {
        ((qe1) obj).unknownFields = bo4;
    }

    /* renamed from: H */
    public bo4 mo31106r(bo4 bo4) {
        bo4.mo31963h();
        return bo4;
    }

    /* renamed from: I */
    public void mo31107s(bo4 bo4, ty4 ty4) throws IOException {
        bo4.mo31972t(ty4);
    }

    /* renamed from: J */
    public void mo31108t(bo4 bo4, ty4 ty4) throws IOException {
        bo4.mo31974w(ty4);
    }

    /* renamed from: j */
    public void mo31098j(Object obj) {
        mo31095g(obj).mo31963h();
    }

    /* renamed from: q */
    public boolean mo31105q(vf3 vf3) {
        return false;
    }

    /* renamed from: u */
    public void mo31089a(bo4 bo4, int i, int i2) {
        bo4.mo31970q(wx4.m69700c(i, 5), Integer.valueOf(i2));
    }

    /* renamed from: v */
    public void mo31090b(bo4 bo4, int i, long j) {
        bo4.mo31970q(wx4.m69700c(i, 1), Long.valueOf(j));
    }

    /* renamed from: w */
    public void mo31091c(bo4 bo4, int i, bo4 bo42) {
        bo4.mo31970q(wx4.m69700c(i, 3), bo42);
    }

    /* renamed from: x */
    public void mo31092d(bo4 bo4, int i, C5173er erVar) {
        bo4.mo31970q(wx4.m69700c(i, 2), erVar);
    }

    /* renamed from: y */
    public void mo31093e(bo4 bo4, int i, long j) {
        bo4.mo31970q(wx4.m69700c(i, 0), Long.valueOf(j));
    }

    /* renamed from: z */
    public bo4 mo31094f(Object obj) {
        bo4 A = mo31095g(obj);
        if (A != bo4.m40221c()) {
            return A;
        }
        bo4 n = bo4.m40225n();
        mo31104p(obj, n);
        return n;
    }
}
