package com.onedelhi.secure;

import java.util.Map;

public final class dg0 {

    /* renamed from: a */
    public final vg3 f27426a = new vg3(te1.f35529e);

    /* renamed from: a */
    public final void mo34410a(byte[] bArr, int i) throws C6619qx {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f27426a.mo46148a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (xg3 unused) {
            throw C6619qx.m63242a();
        }
    }

    /* renamed from: b */
    public gg0 mo34411b(C6190nl nlVar) throws C6619qx, ha1 {
        return mo34412c(nlVar, (Map<pf0, ?>) null);
    }

    /* renamed from: c */
    public gg0 mo34412c(C6190nl nlVar, Map<pf0, ?> map) throws ha1, C6619qx {
        C6619qx e;
        C6460pl plVar = new C6460pl(nlVar);
        ha1 ha1 = null;
        try {
            return mo34413d(plVar, map);
        } catch (ha1 e2) {
            ha1 ha12 = e2;
            e = null;
            ha1 = ha12;
            try {
                plVar.mo42809f();
                plVar.mo42810g(true);
                plVar.mo42808e();
                plVar.mo42807d();
                plVar.mo42805b();
                gg0 d = mo34413d(plVar, map);
                d.mo36731o(new u83(true));
                return d;
            } catch (ha1 | C6619qx unused) {
                if (ha1 != null) {
                    throw ha1;
                }
                throw e;
            }
        } catch (C6619qx e3) {
            e = e3;
            plVar.mo42809f();
            plVar.mo42810g(true);
            plVar.mo42808e();
            plVar.mo42807d();
            plVar.mo42805b();
            gg0 d2 = mo34413d(plVar, map);
            d2.mo36731o(new u83(true));
            return d2;
        }
    }

    /* renamed from: d */
    public final gg0 mo34413d(C6460pl plVar, Map<pf0, ?> map) throws ha1, C6619qx {
        ts4 e = plVar.mo42808e();
        kv0 d = plVar.mo42807d().mo37926d();
        fd0[] b = fd0.m47749b(plVar.mo42806c(), e, d);
        int i = 0;
        for (fd0 c : b) {
            i += c.mo35849c();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (fd0 fd0 : b) {
            byte[] a = fd0.mo35848a();
            int c2 = fd0.mo35849c();
            mo34410a(a, c2);
            int i3 = 0;
            while (i3 < c2) {
                bArr[i2] = a[i3];
                i3++;
                i2++;
            }
        }
        return vf0.m68012a(bArr, e, d, map);
    }

    /* renamed from: e */
    public gg0 mo34414e(boolean[][] zArr) throws C6619qx, ha1 {
        return mo34415f(zArr, (Map<pf0, ?>) null);
    }

    /* renamed from: f */
    public gg0 mo34415f(boolean[][] zArr, Map<pf0, ?> map) throws C6619qx, ha1 {
        return mo34412c(C6190nl.m58165n(zArr), map);
    }
}
