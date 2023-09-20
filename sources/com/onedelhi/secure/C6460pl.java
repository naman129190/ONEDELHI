package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.pl */
public final class C6460pl {

    /* renamed from: a */
    public ia1 f33708a;

    /* renamed from: a */
    public final C6190nl f33709a;

    /* renamed from: a */
    public ts4 f33710a;

    /* renamed from: a */
    public boolean f33711a;

    public C6460pl(C6190nl nlVar) throws ha1 {
        int h = nlVar.mo41089h();
        if (h < 21 || (h & 3) != 1) {
            throw ha1.m50341a();
        }
        this.f33709a = nlVar;
    }

    /* renamed from: a */
    public final int mo42804a(int i, int i2, int i3) {
        return this.f33711a ? this.f33709a.mo41085e(i2, i) : this.f33709a.mo41085e(i, i2) ? (i3 << 1) | 1 : i3 << 1;
    }

    /* renamed from: b */
    public void mo42805b() {
        int i = 0;
        while (i < this.f33709a.mo41094l()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f33709a.mo41089h(); i3++) {
                if (this.f33709a.mo41085e(i, i3) != this.f33709a.mo41085e(i3, i)) {
                    this.f33709a.mo41084d(i3, i);
                    this.f33709a.mo41084d(i, i3);
                }
            }
            i = i2;
        }
    }

    /* renamed from: c */
    public byte[] mo42806c() throws ha1 {
        ia1 d = mo42807d();
        ts4 e = mo42808e();
        rd0 rd0 = rd0.values()[d.mo37925c()];
        int h = this.f33709a.mo41089h();
        rd0.mo43851b(this.f33709a, h);
        C6190nl a = e.mo45295a();
        byte[] bArr = new byte[e.mo45299h()];
        int i = h - 1;
        boolean z = true;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 > 0) {
            if (i2 == 6) {
                i2--;
            }
            for (int i6 = 0; i6 < h; i6++) {
                int i7 = z ? i - i6 : i6;
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i2 - i8;
                    if (!a.mo41085e(i9, i7)) {
                        i4++;
                        i5 <<= 1;
                        if (this.f33709a.mo41085e(i9, i7)) {
                            i5 |= 1;
                        }
                        if (i4 == 8) {
                            bArr[i3] = (byte) i5;
                            i3++;
                            i4 = 0;
                            i5 = 0;
                        }
                    }
                }
            }
            z = !z;
            i2 -= 2;
        }
        if (i3 == e.mo45299h()) {
            return bArr;
        }
        throw ha1.m50341a();
    }

    /* renamed from: d */
    public ia1 mo42807d() throws ha1 {
        ia1 ia1 = this.f33708a;
        if (ia1 != null) {
            return ia1;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = mo42804a(i3, 8, i2);
        }
        int a = mo42804a(8, 7, mo42804a(8, 8, mo42804a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            a = mo42804a(8, i4, a);
        }
        int h = this.f33709a.mo41089h();
        int i5 = h - 7;
        for (int i6 = h - 1; i6 >= i5; i6--) {
            i = mo42804a(8, i6, i);
        }
        for (int i7 = h - 8; i7 < h; i7++) {
            i = mo42804a(i7, 8, i);
        }
        ia1 a2 = ia1.m51965a(a, i);
        this.f33708a = a2;
        if (a2 != null) {
            return a2;
        }
        throw ha1.m50341a();
    }

    /* renamed from: e */
    public ts4 mo42808e() throws ha1 {
        ts4 ts4 = this.f33710a;
        if (ts4 != null) {
            return ts4;
        }
        int h = this.f33709a.mo41089h();
        int i = (h - 17) / 4;
        if (i <= 6) {
            return ts4.m66186i(i);
        }
        int i2 = h - 11;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = h - 9; i6 >= i2; i6--) {
                i4 = mo42804a(i6, i5, i4);
            }
        }
        ts4 c = ts4.m66184c(i4);
        if (c == null || c.mo45297e() != h) {
            for (int i7 = 5; i7 >= 0; i7--) {
                for (int i8 = h - 9; i8 >= i2; i8--) {
                    i3 = mo42804a(i7, i8, i3);
                }
            }
            ts4 c2 = ts4.m66184c(i3);
            if (c2 == null || c2.mo45297e() != h) {
                throw ha1.m50341a();
            }
            this.f33710a = c2;
            return c2;
        }
        this.f33710a = c;
        return c;
    }

    /* renamed from: f */
    public void mo42809f() {
        if (this.f33708a != null) {
            rd0.values()[this.f33708a.mo37925c()].mo43851b(this.f33709a, this.f33709a.mo41089h());
        }
    }

    /* renamed from: g */
    public void mo42810g(boolean z) {
        this.f33710a = null;
        this.f33708a = null;
        this.f33711a = z;
    }
}
