package com.onedelhi.secure;

import java.io.IOException;

public abstract class ao4<T, B> {
    /* renamed from: a */
    public abstract void mo31089a(B b, int i, int i2);

    /* renamed from: b */
    public abstract void mo31090b(B b, int i, long j);

    /* renamed from: c */
    public abstract void mo31091c(B b, int i, T t);

    /* renamed from: d */
    public abstract void mo31092d(B b, int i, C5173er erVar);

    /* renamed from: e */
    public abstract void mo31093e(B b, int i, long j);

    /* renamed from: f */
    public abstract B mo31094f(Object obj);

    /* renamed from: g */
    public abstract T mo31095g(Object obj);

    /* renamed from: h */
    public abstract int mo31096h(T t);

    /* renamed from: i */
    public abstract int mo31097i(T t);

    /* renamed from: j */
    public abstract void mo31098j(Object obj);

    /* renamed from: k */
    public abstract T mo31099k(T t, T t2);

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000d, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31100l(B r3, com.onedelhi.secure.vf3 r4) throws java.io.IOException {
        /*
            r2 = this;
        L_0x0000:
            int r0 = r4.mo36994C()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x000f
            boolean r0 = r2.mo31101m(r3, r4)
            if (r0 != 0) goto L_0x0000
        L_0x000f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ao4.mo31100l(java.lang.Object, com.onedelhi.secure.vf3):void");
    }

    /* renamed from: m */
    public final boolean mo31101m(B b, vf3 vf3) throws IOException {
        int y = vf3.mo37045y();
        int a = wx4.m69698a(y);
        int b2 = wx4.m69699b(y);
        if (b2 == 0) {
            mo31093e(b, a, vf3.mo37005N());
            return true;
        } else if (b2 == 1) {
            mo31090b(b, a, vf3.mo37021c());
            return true;
        } else if (b2 == 2) {
            mo31092d(b, a, vf3.mo37007P());
            return true;
        } else if (b2 == 3) {
            Object n = mo31102n();
            int c = wx4.m69700c(a, 4);
            mo31100l(n, vf3);
            if (c == vf3.mo37045y()) {
                mo31091c(b, a, mo31106r(n));
                return true;
            }
            throw nt1.m58782c();
        } else if (b2 == 4) {
            return false;
        } else {
            if (b2 == 5) {
                mo31089a(b, a, vf3.mo37031m());
                return true;
            }
            throw nt1.m58785f();
        }
    }

    /* renamed from: n */
    public abstract B mo31102n();

    /* renamed from: o */
    public abstract void mo31103o(Object obj, B b);

    /* renamed from: p */
    public abstract void mo31104p(Object obj, T t);

    /* renamed from: q */
    public abstract boolean mo31105q(vf3 vf3);

    /* renamed from: r */
    public abstract T mo31106r(B b);

    /* renamed from: s */
    public abstract void mo31107s(T t, ty4 ty4) throws IOException;

    /* renamed from: t */
    public abstract void mo31108t(T t, ty4 ty4) throws IOException;
}
