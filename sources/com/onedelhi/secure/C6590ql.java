package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.ql */
public final class C6590ql {

    /* renamed from: a */
    public final C6190nl f34269a;

    /* renamed from: a */
    public final ss4 f34270a;

    /* renamed from: b */
    public final C6190nl f34271b;

    public C6590ql(C6190nl nlVar) throws ha1 {
        int h = nlVar.mo41089h();
        if (h < 8 || h > 144 || (h & 1) != 0) {
            throw ha1.m50341a();
        }
        this.f34270a = m63025j(nlVar);
        C6190nl a = mo43650a(nlVar);
        this.f34269a = a;
        this.f34271b = new C6190nl(a.mo41094l(), a.mo41089h());
    }

    /* renamed from: j */
    public static ss4 m63025j(C6190nl nlVar) throws ha1 {
        return ss4.m64851h(nlVar.mo41089h(), nlVar.mo41094l());
    }

    /* renamed from: a */
    public final C6190nl mo43650a(C6190nl nlVar) {
        int f = this.f34270a.mo44532f();
        int e = this.f34270a.mo44531e();
        if (nlVar.mo41089h() == f) {
            int c = this.f34270a.mo44529c();
            int b = this.f34270a.mo44528b();
            int i = f / c;
            int i2 = e / b;
            C6190nl nlVar2 = new C6190nl(i2 * b, i * c);
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * c;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i5 * b;
                    for (int i7 = 0; i7 < c; i7++) {
                        int i8 = ((c + 2) * i3) + 1 + i7;
                        int i9 = i4 + i7;
                        for (int i10 = 0; i10 < b; i10++) {
                            if (nlVar.mo41085e(((b + 2) * i5) + 1 + i10, i8)) {
                                nlVar2.mo41096p(i6 + i10, i9);
                            }
                        }
                        C6190nl nlVar3 = nlVar;
                    }
                    C6190nl nlVar4 = nlVar;
                }
                C6190nl nlVar5 = nlVar;
            }
            return nlVar2;
        }
        throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
    }

    /* renamed from: b */
    public ss4 mo43651b() {
        return this.f34270a;
    }

    /* renamed from: c */
    public byte[] mo43652c() throws ha1 {
        byte[] bArr = new byte[this.f34270a.mo44533g()];
        int h = this.f34269a.mo41089h();
        int l = this.f34269a.mo41094l();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = 4;
        while (true) {
            if (i3 == h && i == 0 && !z) {
                bArr[i2] = (byte) mo43653d(h, l);
                i3 -= 2;
                i += 2;
                i2++;
                z = true;
            } else {
                int i4 = h - 2;
                if (i3 == i4 && i == 0 && (l & 3) != 0 && !z2) {
                    bArr[i2] = (byte) mo43654e(h, l);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z2 = true;
                } else if (i3 == h + 4 && i == 2 && (l & 7) == 0 && !z3) {
                    bArr[i2] = (byte) mo43655f(h, l);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z3 = true;
                } else if (i3 == i4 && i == 0 && (l & 7) == 4 && !z4) {
                    bArr[i2] = (byte) mo43656g(h, l);
                    i3 -= 2;
                    i += 2;
                    i2++;
                    z4 = true;
                } else {
                    do {
                        if (i3 < h && i >= 0 && !this.f34271b.mo41085e(i, i3)) {
                            bArr[i2] = (byte) mo43658i(i3, i, h, l);
                            i2++;
                        }
                        i3 -= 2;
                        i += 2;
                        if (i3 < 0) {
                            break;
                        }
                    } while (i < l);
                    int i5 = i3 + 1;
                    int i6 = i + 3;
                    do {
                        if (i5 >= 0 && i6 < l && !this.f34271b.mo41085e(i6, i5)) {
                            bArr[i2] = (byte) mo43658i(i5, i6, h, l);
                            i2++;
                        }
                        i5 += 2;
                        i6 -= 2;
                        if (i5 >= h) {
                            break;
                        }
                    } while (i6 >= 0);
                    i3 = i5 + 3;
                    i = i6 + 1;
                }
            }
            if (i3 >= h && i >= l) {
                break;
            }
        }
        if (i2 == this.f34270a.mo44533g()) {
            return bArr;
        }
        throw ha1.m50341a();
    }

    /* renamed from: d */
    public final int mo43653d(int i, int i2) {
        int i3 = i - 1;
        int i4 = (mo43657h(i3, 0, i, i2) ? 1 : 0) << true;
        if (mo43657h(i3, 1, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (mo43657h(i3, 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (mo43657h(0, i2 - 2, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        int i8 = i2 - 1;
        if (mo43657h(0, i8, i, i2)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        if (mo43657h(1, i8, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        if (mo43657h(2, i8, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        return mo43657h(3, i8, i, i2) ? i11 | 1 : i11;
    }

    /* renamed from: e */
    public final int mo43654e(int i, int i2) {
        int i3 = (mo43657h(i + -3, 0, i, i2) ? 1 : 0) << true;
        if (mo43657h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (mo43657h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (mo43657h(0, i2 - 4, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        if (mo43657h(0, i2 - 3, i, i2)) {
            i6 |= 1;
        }
        int i7 = i6 << 1;
        if (mo43657h(0, i2 - 2, i, i2)) {
            i7 |= 1;
        }
        int i8 = i7 << 1;
        int i9 = i2 - 1;
        if (mo43657h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        return mo43657h(1, i9, i, i2) ? i10 | 1 : i10;
    }

    /* renamed from: f */
    public final int mo43655f(int i, int i2) {
        int i3 = i - 1;
        int i4 = (mo43657h(i3, 0, i, i2) ? 1 : 0) << true;
        int i5 = i2 - 1;
        if (mo43657h(i3, i5, i, i2)) {
            i4 |= 1;
        }
        int i6 = i4 << 1;
        int i7 = i2 - 3;
        if (mo43657h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        int i9 = i2 - 2;
        if (mo43657h(0, i9, i, i2)) {
            i8 |= 1;
        }
        int i10 = i8 << 1;
        if (mo43657h(0, i5, i, i2)) {
            i10 |= 1;
        }
        int i11 = i10 << 1;
        if (mo43657h(1, i7, i, i2)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (mo43657h(1, i9, i, i2)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        return mo43657h(1, i5, i, i2) ? i13 | 1 : i13;
    }

    /* renamed from: g */
    public final int mo43656g(int i, int i2) {
        int i3 = (mo43657h(i + -3, 0, i, i2) ? 1 : 0) << true;
        if (mo43657h(i - 2, 0, i, i2)) {
            i3 |= 1;
        }
        int i4 = i3 << 1;
        if (mo43657h(i - 1, 0, i, i2)) {
            i4 |= 1;
        }
        int i5 = i4 << 1;
        if (mo43657h(0, i2 - 2, i, i2)) {
            i5 |= 1;
        }
        int i6 = i5 << 1;
        int i7 = i2 - 1;
        if (mo43657h(0, i7, i, i2)) {
            i6 |= 1;
        }
        int i8 = i6 << 1;
        if (mo43657h(1, i7, i, i2)) {
            i8 |= 1;
        }
        int i9 = i8 << 1;
        if (mo43657h(2, i7, i, i2)) {
            i9 |= 1;
        }
        int i10 = i9 << 1;
        return mo43657h(3, i7, i, i2) ? i10 | 1 : i10;
    }

    /* renamed from: h */
    public final boolean mo43657h(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        this.f34271b.mo41096p(i2, i);
        return this.f34269a.mo41085e(i2, i);
    }

    /* renamed from: i */
    public final int mo43658i(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (mo43657h(i5, i6, i3, i4) ? 1 : 0) << true;
        int i8 = i2 - 1;
        if (mo43657h(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (mo43657h(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (mo43657h(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (mo43657h(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (mo43657h(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (mo43657h(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return mo43657h(i, i2, i3, i4) ? i15 | 1 : i15;
    }
}
