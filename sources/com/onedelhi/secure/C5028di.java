package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.di */
public final class C5028di extends k02 {

    /* renamed from: a */
    public final fe2 f27453a;

    /* renamed from: a */
    public final lk1 f27454a;

    /* renamed from: a */
    public final int[] f27455a;

    /* renamed from: l */
    public final int f27456l;

    /* renamed from: m */
    public final int f27457m;

    /* renamed from: n */
    public int f27458n = -1;

    /* renamed from: o */
    public int f27459o;

    public C5028di(int i, int i2, int i3, int i4, int i5, int i6, C4477aa aaVar) {
        super(i, i2, i3, i4, i5, aaVar);
        int i7 = i + 1;
        this.f27457m = i7;
        this.f27459o = i7;
        this.f27454a = new lk1(i, aaVar);
        this.f27455a = aaVar.mo30488d(i7 * 2, false);
        this.f27453a = new fe2(i4 - 1);
        this.f27456l = i6 <= 0 ? (i4 / 2) + 16 : i6;
    }

    /* renamed from: y */
    public static int m45296y(int i) {
        return lk1.m55721f(i) + (i / 128) + 10;
    }

    /* renamed from: A */
    public final void mo34461A(int i, int i2) {
        int i3;
        byte[] bArr;
        int i4;
        int i5 = this.f27456l;
        int i6 = this.f27458n;
        int i7 = (i6 << 1) + 1;
        int i8 = i6 << 1;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int i11 = this.f27459o - i2;
            int i12 = i5 - 1;
            if (i5 == 0 || i11 >= (i3 = this.f27457m)) {
                int[] iArr = this.f27455a;
                iArr[i7] = 0;
                iArr[i8] = 0;
            } else {
                int i13 = this.f27458n;
                int i14 = i13 - i11;
                if (i11 <= i13) {
                    i3 = 0;
                }
                int i15 = (i14 + i3) << 1;
                int min = Math.min(i9, i10);
                byte[] bArr2 = this.f31038a;
                int i16 = this.f31043f;
                if (bArr2[(i16 + min) - i11] == bArr2[i16 + min]) {
                    do {
                        min++;
                        if (min == i) {
                            int[] iArr2 = this.f27455a;
                            iArr2[i8] = iArr2[i15];
                            iArr2[i7] = iArr2[i15 + 1];
                            return;
                        }
                        bArr = this.f31038a;
                        i4 = this.f31043f;
                    } while (bArr[(i4 + min) - i11] == bArr[i4 + min]);
                }
                byte[] bArr3 = this.f31038a;
                int i17 = this.f31043f;
                if ((bArr3[(i17 + min) - i11] & 255) < (bArr3[i17 + min] & 255)) {
                    int[] iArr3 = this.f27455a;
                    iArr3[i8] = i2;
                    int i18 = i15 + 1;
                    i2 = iArr3[i18];
                    i8 = i18;
                    i10 = min;
                } else {
                    int[] iArr4 = this.f27455a;
                    iArr4[i7] = i2;
                    i2 = iArr4[i15];
                    i7 = i15;
                    i9 = min;
                }
                i5 = i12;
            }
        }
        int[] iArr5 = this.f27455a;
        iArr5[i7] = 0;
        iArr5[i8] = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b A[LOOP:0: B:22:0x008b->B:25:0x009b, LOOP_START, PHI: r8 
      PHI: (r8v9 int) = (r8v3 int), (r8v10 int) binds: [B:21:0x0089, B:25:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014b A[EDGE_INSN: B:62:0x014b->B:59:0x014b ?: BREAK  
    EDGE_INSN: B:63:0x014b->B:59:0x014b ?: BREAK  ] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.onedelhi.secure.fe2 mo34462j() {
        /*
            r17 = this;
            r0 = r17
            com.onedelhi.secure.fe2 r1 = r0.f27453a
            r2 = 0
            r1.f28271a = r2
            int r1 = r0.f31040c
            int r3 = r0.f31041d
            int r4 = r17.mo34465z()
            if (r4 >= r1) goto L_0x001a
            if (r4 != 0) goto L_0x0016
            com.onedelhi.secure.fe2 r1 = r0.f27453a
            return r1
        L_0x0016:
            r1 = r4
            if (r3 <= r4) goto L_0x001a
            r3 = r1
        L_0x001a:
            com.onedelhi.secure.lk1 r4 = r0.f27454a
            byte[] r5 = r0.f31038a
            int r6 = r0.f31043f
            r4.mo39892a(r5, r6)
            int r4 = r0.f27459o
            com.onedelhi.secure.lk1 r5 = r0.f27454a
            int r5 = r5.mo39893b()
            int r4 = r4 - r5
            int r5 = r0.f27459o
            com.onedelhi.secure.lk1 r6 = r0.f27454a
            int r6 = r6.mo39894c()
            int r5 = r5 - r6
            com.onedelhi.secure.lk1 r6 = r0.f27454a
            int r6 = r6.mo39895d()
            com.onedelhi.secure.lk1 r7 = r0.f27454a
            int r8 = r0.f27459o
            r7.mo39898i(r8)
            int r7 = r0.f27457m
            r8 = 2
            r9 = 1
            if (r4 >= r7) goto L_0x0063
            byte[] r10 = r0.f31038a
            int r11 = r0.f31043f
            int r12 = r11 - r4
            byte r12 = r10[r12]
            byte r10 = r10[r11]
            if (r12 != r10) goto L_0x0063
            com.onedelhi.secure.fe2 r10 = r0.f27453a
            int[] r11 = r10.f28272a
            r11[r2] = r8
            int[] r11 = r10.f28273b
            int r12 = r4 + -1
            r11[r2] = r12
            r10.f28271a = r9
            goto L_0x0064
        L_0x0063:
            r8 = 0
        L_0x0064:
            r10 = 3
            if (r4 == r5) goto L_0x0085
            if (r5 >= r7) goto L_0x0085
            byte[] r7 = r0.f31038a
            int r11 = r0.f31043f
            int r12 = r11 - r5
            byte r12 = r7[r12]
            byte r7 = r7[r11]
            if (r12 != r7) goto L_0x0085
            com.onedelhi.secure.fe2 r4 = r0.f27453a
            int[] r7 = r4.f28273b
            int r8 = r4.f28271a
            int r11 = r8 + 1
            r4.f28271a = r11
            int r4 = r5 + -1
            r7[r8] = r4
            r4 = r5
            r8 = 3
        L_0x0085:
            com.onedelhi.secure.fe2 r5 = r0.f27453a
            int r5 = r5.f28271a
            if (r5 <= 0) goto L_0x00af
        L_0x008b:
            if (r8 >= r1) goto L_0x009e
            byte[] r5 = r0.f31038a
            int r7 = r0.f31043f
            int r11 = r7 + r8
            int r11 = r11 - r4
            byte r11 = r5[r11]
            int r7 = r7 + r8
            byte r5 = r5[r7]
            if (r11 != r5) goto L_0x009e
            int r8 = r8 + 1
            goto L_0x008b
        L_0x009e:
            com.onedelhi.secure.fe2 r4 = r0.f27453a
            int[] r5 = r4.f28272a
            int r4 = r4.f28271a
            int r4 = r4 - r9
            r5[r4] = r8
            if (r8 < r3) goto L_0x00af
            r0.mo34461A(r3, r6)
        L_0x00ac:
            com.onedelhi.secure.fe2 r1 = r0.f27453a
            return r1
        L_0x00af:
            if (r8 >= r10) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r10 = r8
        L_0x00b3:
            int r4 = r0.f27456l
            int r5 = r0.f27458n
            int r7 = r5 << 1
            int r7 = r7 + r9
            int r5 = r5 << r9
            r8 = 0
            r11 = 0
        L_0x00bd:
            int r12 = r0.f27459o
            int r12 = r12 - r6
            int r13 = r4 + -1
            if (r4 == 0) goto L_0x014b
            int r4 = r0.f27457m
            if (r12 < r4) goto L_0x00ca
            goto L_0x014b
        L_0x00ca:
            int r14 = r0.f27458n
            int r15 = r14 - r12
            if (r12 <= r14) goto L_0x00d1
            goto L_0x00d2
        L_0x00d1:
            r4 = 0
        L_0x00d2:
            int r15 = r15 + r4
            int r4 = r15 << 1
            int r14 = java.lang.Math.min(r8, r11)
            byte[] r15 = r0.f31038a
            int r2 = r0.f31043f
            int r16 = r2 + r14
            int r16 = r16 - r12
            byte r9 = r15[r16]
            int r2 = r2 + r14
            byte r2 = r15[r2]
            if (r9 != r2) goto L_0x011e
        L_0x00e8:
            r2 = 1
            int r14 = r14 + r2
            if (r14 >= r1) goto L_0x00fa
            byte[] r2 = r0.f31038a
            int r9 = r0.f31043f
            int r15 = r9 + r14
            int r15 = r15 - r12
            byte r15 = r2[r15]
            int r9 = r9 + r14
            byte r2 = r2[r9]
            if (r15 == r2) goto L_0x00e8
        L_0x00fa:
            if (r14 <= r10) goto L_0x011e
            com.onedelhi.secure.fe2 r2 = r0.f27453a
            int[] r9 = r2.f28272a
            int r10 = r2.f28271a
            r9[r10] = r14
            int[] r9 = r2.f28273b
            int r15 = r12 + -1
            r9[r10] = r15
            r9 = 1
            int r10 = r10 + r9
            r2.f28271a = r10
            if (r14 < r3) goto L_0x011c
            int[] r1 = r0.f27455a
            r3 = r1[r4]
            r1[r5] = r3
            int r4 = r4 + r9
            r3 = r1[r4]
            r1[r7] = r3
            return r2
        L_0x011c:
            r10 = r14
            goto L_0x011f
        L_0x011e:
            r9 = 1
        L_0x011f:
            byte[] r2 = r0.f31038a
            int r15 = r0.f31043f
            int r16 = r15 + r14
            int r16 = r16 - r12
            byte r12 = r2[r16]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r15 = r15 + r14
            byte r2 = r2[r15]
            r2 = r2 & 255(0xff, float:3.57E-43)
            if (r12 >= r2) goto L_0x013e
            int[] r2 = r0.f27455a
            r2[r5] = r6
            int r4 = r4 + 1
            r2 = r2[r4]
            r6 = r2
            r5 = r4
            r11 = r14
            goto L_0x0147
        L_0x013e:
            int[] r2 = r0.f27455a
            r2[r7] = r6
            r2 = r2[r4]
            r6 = r2
            r7 = r4
            r8 = r14
        L_0x0147:
            r4 = r13
            r2 = 0
            goto L_0x00bd
        L_0x014b:
            int[] r1 = r0.f27455a
            r2 = 0
            r1[r7] = r2
            r1[r5] = r2
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C5028di.mo34462j():com.onedelhi.secure.fe2");
    }

    /* renamed from: s */
    public void mo34463s(C4477aa aaVar) {
        aaVar.mo30490f(this.f27455a);
        this.f27454a.mo39897h(aaVar);
        super.mo34463s(aaVar);
    }

    /* renamed from: w */
    public void mo34464w(int i) {
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                int i3 = this.f31041d;
                int z = mo34465z();
                if (z < i3) {
                    if (z == 0) {
                        i = i2;
                    } else {
                        i3 = z;
                    }
                }
                this.f27454a.mo39892a(this.f31038a, this.f31043f);
                int d = this.f27454a.mo39895d();
                this.f27454a.mo39898i(this.f27459o);
                mo34461A(i3, d);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: z */
    public final int mo34465z() {
        int o = mo38976o(this.f31041d, 4);
        if (o != 0) {
            int i = this.f27459o + 1;
            this.f27459o = i;
            if (i == Integer.MAX_VALUE) {
                int i2 = Integer.MAX_VALUE - this.f27457m;
                this.f27454a.mo39896g(i2);
                k02.m53927q(this.f27455a, this.f27457m * 2, i2);
                this.f27459o -= i2;
            }
            int i3 = this.f27458n + 1;
            this.f27458n = i3;
            if (i3 == this.f27457m) {
                this.f27458n = 0;
            }
        }
        return o;
    }
}
