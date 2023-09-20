package com.onedelhi.secure;

public final class bg0 {

    /* renamed from: a */
    public final vg3 f26337a = new vg3(te1.f35530f);

    /* renamed from: a */
    public final void mo31663a(byte[] bArr, int i) throws C6619qx {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f26337a.mo46148a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (xg3 unused) {
            throw C6619qx.m63242a();
        }
    }

    /* renamed from: b */
    public gg0 mo31664b(C6190nl nlVar) throws ha1, C6619qx {
        C6590ql qlVar = new C6590ql(nlVar);
        gd0[] b = gd0.m49373b(qlVar.mo43652c(), qlVar.mo43651b());
        int i = 0;
        for (gd0 c : b) {
            i += c.mo36681c();
        }
        byte[] bArr = new byte[i];
        int length = b.length;
        for (int i2 = 0; i2 < length; i2++) {
            gd0 gd0 = b[i2];
            byte[] a = gd0.mo36680a();
            int c2 = gd0.mo36681c();
            mo31663a(a, c2);
            for (int i3 = 0; i3 < c2; i3++) {
                bArr[(i3 * length) + i2] = a[i3];
            }
        }
        return sf0.m64520a(bArr);
    }

    /* renamed from: c */
    public gg0 mo31665c(boolean[][] zArr) throws ha1, C6619qx {
        return mo31664b(C6190nl.m58165n(zArr));
    }
}
