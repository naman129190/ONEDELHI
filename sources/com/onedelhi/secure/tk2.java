package com.onedelhi.secure;

@Deprecated
public final class tk2 {

    /* renamed from: a */
    public static final int f35670a = 32;

    /* renamed from: a */
    public final C6190nl f35671a;

    public tk2(C6190nl nlVar) {
        this.f35671a = nlVar;
    }

    /* renamed from: a */
    public final int[] mo45172a(int i, int i2, int i3, int i4, boolean z) {
        int i5 = (i3 + i4) / 2;
        int i6 = i5;
        while (i6 >= i3) {
            C6190nl nlVar = this.f35671a;
            if (!z ? !nlVar.mo41085e(i, i6) : !nlVar.mo41085e(i6, i)) {
                int i7 = i6;
                while (true) {
                    i7--;
                    if (i7 < i3) {
                        break;
                    }
                    C6190nl nlVar2 = this.f35671a;
                    if (z) {
                        if (nlVar2.mo41085e(i7, i)) {
                            break;
                        }
                    } else if (nlVar2.mo41085e(i, i7)) {
                        break;
                    }
                }
                int i8 = i6 - i7;
                if (i7 < i3 || i8 > i2) {
                    break;
                }
                i6 = i7;
            } else {
                i6--;
            }
        }
        int i9 = i6 + 1;
        while (i5 < i4) {
            C6190nl nlVar3 = this.f35671a;
            if (!z ? !nlVar3.mo41085e(i, i5) : !nlVar3.mo41085e(i5, i)) {
                int i10 = i5;
                while (true) {
                    i10++;
                    if (i10 >= i4) {
                        break;
                    }
                    C6190nl nlVar4 = this.f35671a;
                    if (z) {
                        if (nlVar4.mo41085e(i10, i)) {
                            break;
                        }
                    } else if (nlVar4.mo41085e(i, i10)) {
                        break;
                    }
                }
                int i11 = i10 - i5;
                if (i10 >= i4 || i11 > i2) {
                    break;
                }
                i5 = i10;
            } else {
                i5++;
            }
        }
        int i12 = i5 - 1;
        if (i12 <= i9) {
            return null;
        }
        return new int[]{i9, i12};
    }

    /* renamed from: b */
    public sl3[] mo45173b() throws tr2 {
        int h = this.f35671a.mo41089h();
        int l = this.f35671a.mo41094l();
        int i = h / 2;
        int i2 = l / 2;
        int max = Math.max(1, h / 256);
        int i3 = -max;
        int i4 = i2 / 2;
        int i5 = i2;
        int i6 = l;
        int i7 = i;
        int i8 = i3;
        int i9 = h;
        int i10 = max;
        int max2 = Math.max(1, l / 256);
        int i11 = -max2;
        int d = ((int) mo45174c(i5, 0, 0, i6, i7, i3, 0, i9, i4).mo44404d()) - 1;
        int i12 = max2;
        int i13 = i / 2;
        sl3 c = mo45174c(i5, i11, 0, i6, i7, 0, d, i9, i13);
        int c2 = ((int) c.mo44403c()) - 1;
        sl3 c3 = mo45174c(i5, i12, c2, i6, i7, 0, d, i9, i13);
        int c4 = ((int) c3.mo44403c()) + 1;
        sl3 c5 = mo45174c(i5, 0, c2, c4, i7, i10, d, i9, i4);
        return new sl3[]{mo45174c(i5, 0, c2, c4, i7, i8, d, ((int) c5.mo44404d()) + 1, i2 / 4), c, c3, c5};
    }

    /* renamed from: c */
    public final sl3 mo45174c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) throws tr2 {
        boolean z;
        int i10;
        int i11;
        int i12;
        int i13;
        tk2 tk2;
        int i14 = i;
        int i15 = i5;
        int[] iArr = null;
        int i16 = i8;
        int i17 = i14;
        int i18 = i15;
        while (i18 < i16 && i18 >= i7 && i17 < i4 && i17 >= i3) {
            if (i2 == 0) {
                z = true;
                tk2 = this;
                i13 = i18;
                i12 = i9;
                i11 = i3;
                i10 = i4;
            } else {
                z = false;
                tk2 = this;
                i13 = i17;
                i12 = i9;
                i11 = i7;
                i10 = i8;
            }
            int[] a = tk2.mo45172a(i13, i12, i11, i10, z);
            if (a != null) {
                i18 += i6;
                i17 += i2;
                iArr = a;
            } else if (iArr != null) {
                char c = 1;
                if (i2 == 0) {
                    int i19 = i18 - i6;
                    if (iArr[0] >= i14) {
                        return new sl3((float) iArr[1], (float) i19);
                    }
                    if (iArr[1] <= i14) {
                        return new sl3((float) iArr[0], (float) i19);
                    }
                    if (i6 > 0) {
                        c = 0;
                    }
                    return new sl3((float) iArr[c], (float) i19);
                }
                int i20 = i17 - i2;
                if (iArr[0] >= i15) {
                    return new sl3((float) i20, (float) iArr[1]);
                }
                if (iArr[1] <= i15) {
                    return new sl3((float) i20, (float) iArr[0]);
                }
                float f = (float) i20;
                if (i2 < 0) {
                    c = 0;
                }
                return new sl3(f, (float) iArr[c]);
            } else {
                throw tr2.m66179a();
            }
        }
        throw tr2.m66179a();
    }
}
