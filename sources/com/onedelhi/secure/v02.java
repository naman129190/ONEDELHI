package com.onedelhi.secure;

import org.apache.commons.compress.archivers.zip.UnixStat;

public final class v02 extends t02 {

    /* renamed from: C */
    public static final int f36374C = 4096;

    /* renamed from: D */
    public static final int f36375D = 4096;

    /* renamed from: E */
    public static final int f36376E = 4096;

    /* renamed from: b */
    public static final /* synthetic */ boolean f36377b = false;

    /* renamed from: A */
    public int f36378A;

    /* renamed from: B */
    public int f36379B;

    /* renamed from: a */
    public fe2 f36380a;

    /* renamed from: a */
    public final nw2[] f36381a = new nw2[4096];

    /* renamed from: b */
    public final c34 f36382b;

    /* renamed from: c */
    public final int[] f36383c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v02(ve3 ve3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, C4477aa aaVar) {
        super(ve3, k02.m53925g(i4, Math.max(i5, 4096), 4096, i6, 273, i7, i8, aaVar), i, i2, i3, i4, i6);
        this.f36378A = 0;
        this.f36379B = 0;
        this.f36383c = new int[4];
        this.f36382b = new c34();
        for (int i9 = 0; i9 < 4096; i9++) {
            this.f36381a[i9] = new nw2();
        }
    }

    /* renamed from: I */
    public static int m67567I(int i, int i2, int i3) {
        return k02.m53926k(i, Math.max(i2, 4096), 4096, 273, i3) + 256;
    }

    /* renamed from: E */
    public final void mo45916E(int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        int e = this.f35294a.mo38969e(0);
        int e2 = this.f35294a.mo38969e(this.f36381a[this.f36378A].f32813a[0] + 1);
        int d = this.f36381a[this.f36378A].f32810a + this.f35296a.mo44718d(e, e2, this.f35294a.mo38969e(1), i, this.f36381a[this.f36378A].f32811a);
        nw2[] nw2Arr = this.f36381a;
        int i6 = this.f36378A;
        if (d < nw2Arr[i6 + 1].f32810a) {
            nw2Arr[i6 + 1].mo41496b(d, i6, -1);
            z = true;
        } else {
            z = false;
        }
        if (e2 == e) {
            nw2[] nw2Arr2 = this.f36381a;
            int i7 = this.f36378A;
            if (nw2Arr2[i7 + 1].f32814b == i7 || nw2Arr2[i7 + 1].f32816c != 0) {
                int w = mo44708w(i4, nw2Arr2[i7].f32811a, i2);
                nw2[] nw2Arr3 = this.f36381a;
                int i8 = this.f36378A;
                if (w <= nw2Arr3[i8 + 1].f32810a) {
                    nw2Arr3[i8 + 1].mo41496b(w, i8, 0);
                    z = true;
                }
            }
        }
        if (!z && e2 != e && i3 > 2 && (i5 = this.f35294a.mo38972i(1, this.f36381a[this.f36378A].f32813a[0], Math.min(this.f35302n, i3 - 1))) >= 2) {
            this.f36382b.mo32229d(this.f36381a[this.f36378A].f32811a);
            this.f36382b.mo32230e();
            int p = d + mo44702p(0, i5, this.f36382b, (i + 1) & this.f34427a);
            int i9 = this.f36378A + 1 + i5;
            while (true) {
                int i10 = this.f36379B;
                if (i10 >= i9) {
                    break;
                }
                nw2[] nw2Arr4 = this.f36381a;
                int i11 = i10 + 1;
                this.f36379B = i11;
                nw2Arr4[i11].mo41495a();
            }
            nw2[] nw2Arr5 = this.f36381a;
            if (p < nw2Arr5[i9].f32810a) {
                nw2Arr5[i9].mo41497c(p, this.f36378A, 0);
            }
        }
    }

    /* renamed from: F */
    public final int mo45917F(int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i2;
        int i7 = i3;
        int min = Math.min(i7, this.f35302n);
        int i8 = 2;
        for (int i9 = 0; i9 < 4; i9++) {
            int h = this.f35294a.mo38971h(this.f36381a[this.f36378A].f32813a[i9], min);
            if (h < 2) {
                int i10 = i4;
            } else {
                while (true) {
                    int i11 = this.f36379B;
                    i5 = this.f36378A;
                    if (i11 >= i5 + h) {
                        break;
                    }
                    nw2[] nw2Arr = this.f36381a;
                    int i12 = i11 + 1;
                    this.f36379B = i12;
                    nw2Arr[i12].mo41495a();
                }
                int q = mo44703q(i4, i9, this.f36381a[i5].f32811a, i6);
                for (int i13 = h; i13 >= 2; i13--) {
                    int c = this.f35299b.mo44713c(i13, i6) + q;
                    nw2[] nw2Arr2 = this.f36381a;
                    int i14 = this.f36378A;
                    if (c < nw2Arr2[i14 + i13].f32810a) {
                        nw2Arr2[i14 + i13].mo41496b(c, i14, i9);
                    }
                }
                if (i9 == 0) {
                    i8 = h + 1;
                }
                int i15 = i8;
                int i16 = this.f35294a.mo38972i(h + 1, this.f36381a[this.f36378A].f32813a[i9], Math.min(this.f35302n, (i7 - h) - 1));
                if (i16 >= 2) {
                    int c2 = q + this.f35299b.mo44713c(h, i6);
                    this.f36382b.mo32229d(this.f36381a[this.f36378A].f32811a);
                    this.f36382b.mo32231f();
                    int i17 = i + h;
                    int d = c2 + this.f35296a.mo44718d(this.f35294a.mo38970f(h, 0), this.f35294a.mo38969e(0), this.f35294a.mo38970f(h, 1), i17, this.f36382b);
                    this.f36382b.mo32230e();
                    int p = d + mo44702p(0, i16, this.f36382b, (i17 + 1) & this.f34427a);
                    int i18 = this.f36378A + h + 1 + i16;
                    while (true) {
                        int i19 = this.f36379B;
                        if (i19 >= i18) {
                            break;
                        }
                        nw2[] nw2Arr3 = this.f36381a;
                        int i20 = i19 + 1;
                        this.f36379B = i20;
                        nw2Arr3[i20].mo41495a();
                    }
                    nw2[] nw2Arr4 = this.f36381a;
                    if (p < nw2Arr4[i18].f32810a) {
                        nw2Arr4[i18].mo41498d(p, this.f36378A, i9, h, 0);
                    }
                }
                i8 = i15;
            }
        }
        return i8;
    }

    /* renamed from: G */
    public final void mo45918G(int i, int i2, int i3, int i4, int i5) {
        int i6;
        fe2 fe2;
        int[] iArr;
        int i7;
        int i8 = i3;
        int i9 = i5;
        fe2 fe22 = this.f36380a;
        if (fe22.f28272a[fe22.f28271a - 1] > i8) {
            fe22.f28271a = 0;
            while (true) {
                fe2 = this.f36380a;
                iArr = fe2.f28272a;
                i7 = fe2.f28271a;
                if (iArr[i7] >= i8) {
                    break;
                }
                fe2.f28271a = i7 + 1;
            }
            fe2.f28271a = i7 + 1;
            iArr[i7] = i8;
        }
        fe2 fe23 = this.f36380a;
        if (fe23.f28272a[fe23.f28271a - 1] >= i9) {
            while (true) {
                int i10 = this.f36379B;
                i6 = this.f36378A;
                fe2 fe24 = this.f36380a;
                if (i10 >= fe24.f28272a[fe24.f28271a - 1] + i6) {
                    break;
                }
                nw2[] nw2Arr = this.f36381a;
                int i11 = i10 + 1;
                this.f36379B = i11;
                nw2Arr[i11].mo41495a();
            }
            int v = mo44707v(i4, this.f36381a[i6].f32811a);
            int i12 = 0;
            while (i9 > this.f36380a.f28272a[i12]) {
                i12++;
            }
            while (true) {
                int i13 = this.f36380a.f28273b[i12];
                int r = mo44704r(v, i13, i9, i2);
                nw2[] nw2Arr2 = this.f36381a;
                int i14 = this.f36378A;
                if (r < nw2Arr2[i14 + i9].f32810a) {
                    nw2Arr2[i14 + i9].mo41496b(r, i14, i13 + 4);
                }
                if (i9 == this.f36380a.f28272a[i12]) {
                    int i15 = this.f35294a.mo38972i(i9 + 1, i13, Math.min(this.f35302n, (i8 - i9) - 1));
                    if (i15 >= 2) {
                        this.f36382b.mo32229d(this.f36381a[this.f36378A].f32811a);
                        this.f36382b.mo32232g();
                        int i16 = i + i9;
                        int d = r + this.f35296a.mo44718d(this.f35294a.mo38970f(i9, 0), this.f35294a.mo38969e(0), this.f35294a.mo38970f(i9, 1), i16, this.f36382b);
                        this.f36382b.mo32230e();
                        int p = d + mo44702p(0, i15, this.f36382b, (i16 + 1) & this.f34427a);
                        int i17 = this.f36378A + i9 + 1 + i15;
                        while (true) {
                            int i18 = this.f36379B;
                            if (i18 >= i17) {
                                break;
                            }
                            nw2[] nw2Arr3 = this.f36381a;
                            int i19 = i18 + 1;
                            this.f36379B = i19;
                            nw2Arr3[i19].mo41495a();
                        }
                        nw2[] nw2Arr4 = this.f36381a;
                        if (p < nw2Arr4[i17].f32810a) {
                            nw2Arr4[i17].mo41498d(p, this.f36378A, i13 + 4, i9, 0);
                        }
                    }
                    i12++;
                    if (i12 == this.f36380a.f28271a) {
                        return;
                    }
                }
                i9++;
            }
        }
    }

    /* renamed from: H */
    public final int mo45919H() {
        int i = this.f36378A;
        this.f36379B = i;
        int i2 = this.f36381a[i].f32814b;
        while (true) {
            nw2[] nw2Arr = this.f36381a;
            int i3 = this.f36378A;
            nw2 nw2 = nw2Arr[i3];
            if (nw2.f32812a) {
                nw2Arr[i2].f32814b = i3;
                nw2Arr[i2].f32816c = -1;
                int i4 = i2 - 1;
                this.f36378A = i2;
                if (nw2.f32815b) {
                    nw2Arr[i4].f32814b = i4 + 1;
                    nw2Arr[i4].f32816c = nw2.f32818e;
                    this.f36378A = i4;
                    i2 = nw2.f32817d;
                } else {
                    i2 = i4;
                }
            }
            int i5 = nw2Arr[i2].f32814b;
            nw2Arr[i2].f32814b = this.f36378A;
            this.f36378A = i2;
            if (i2 <= 0) {
                int i6 = nw2Arr[0].f32814b;
                this.f36378A = i6;
                this.f35306r = nw2Arr[i6].f32816c;
                return i6;
            }
            i2 = i5;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00fe  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45920J() {
        /*
            r8 = this;
            com.onedelhi.secure.nw2[] r0 = r8.f36381a
            int r1 = r8.f36378A
            r2 = r0[r1]
            int r2 = r2.f32814b
            r3 = r0[r1]
            boolean r3 = r3.f32812a
            r4 = 4
            if (r3 == 0) goto L_0x0057
            int r2 = r2 + -1
            r3 = r0[r1]
            boolean r3 = r3.f32815b
            if (r3 == 0) goto L_0x0040
            r3 = r0[r1]
            com.onedelhi.secure.c34 r3 = r3.f32811a
            r1 = r0[r1]
            int r1 = r1.f32817d
            r0 = r0[r1]
            com.onedelhi.secure.c34 r0 = r0.f32811a
            r3.mo32229d(r0)
            com.onedelhi.secure.nw2[] r0 = r8.f36381a
            int r1 = r8.f36378A
            r3 = r0[r1]
            int r3 = r3.f32818e
            if (r3 >= r4) goto L_0x0038
            r0 = r0[r1]
            com.onedelhi.secure.c34 r0 = r0.f32811a
            r0.mo32231f()
            goto L_0x004b
        L_0x0038:
            r0 = r0[r1]
            com.onedelhi.secure.c34 r0 = r0.f32811a
            r0.mo32232g()
            goto L_0x004b
        L_0x0040:
            r1 = r0[r1]
            com.onedelhi.secure.c34 r1 = r1.f32811a
            r0 = r0[r2]
            com.onedelhi.secure.c34 r0 = r0.f32811a
            r1.mo32229d(r0)
        L_0x004b:
            com.onedelhi.secure.nw2[] r0 = r8.f36381a
            int r1 = r8.f36378A
            r0 = r0[r1]
            com.onedelhi.secure.c34 r0 = r0.f32811a
            r0.mo32230e()
            goto L_0x0062
        L_0x0057:
            r1 = r0[r1]
            com.onedelhi.secure.c34 r1 = r1.f32811a
            r0 = r0[r2]
            com.onedelhi.secure.c34 r0 = r0.f32811a
            r1.mo32229d(r0)
        L_0x0062:
            int r0 = r8.f36378A
            int r1 = r0 + -1
            r3 = 0
            if (r2 != r1) goto L_0x0091
            com.onedelhi.secure.nw2[] r1 = r8.f36381a
            r5 = r1[r0]
            int r5 = r5.f32816c
            if (r5 != 0) goto L_0x0079
            r0 = r1[r0]
            com.onedelhi.secure.c34 r0 = r0.f32811a
            r0.mo32233h()
            goto L_0x0080
        L_0x0079:
            r0 = r1[r0]
            com.onedelhi.secure.c34 r0 = r0.f32811a
            r0.mo32230e()
        L_0x0080:
            com.onedelhi.secure.nw2[] r0 = r8.f36381a
            r1 = r0[r2]
            int[] r1 = r1.f32813a
            int r2 = r8.f36378A
            r0 = r0[r2]
            int[] r0 = r0.f32813a
            java.lang.System.arraycopy(r1, r3, r0, r3, r4)
            goto L_0x0111
        L_0x0091:
            com.onedelhi.secure.nw2[] r1 = r8.f36381a
            r5 = r1[r0]
            boolean r5 = r5.f32812a
            if (r5 == 0) goto L_0x00af
            r5 = r1[r0]
            boolean r5 = r5.f32815b
            if (r5 == 0) goto L_0x00af
            r2 = r1[r0]
            int r2 = r2.f32817d
            r5 = r1[r0]
            int r5 = r5.f32818e
            r0 = r1[r0]
        L_0x00a9:
            com.onedelhi.secure.c34 r0 = r0.f32811a
            r0.mo32231f()
            goto L_0x00bf
        L_0x00af:
            r5 = r1[r0]
            int r5 = r5.f32816c
            if (r5 >= r4) goto L_0x00b8
            r0 = r1[r0]
            goto L_0x00a9
        L_0x00b8:
            r0 = r1[r0]
            com.onedelhi.secure.c34 r0 = r0.f32811a
            r0.mo32232g()
        L_0x00bf:
            r0 = 1
            com.onedelhi.secure.nw2[] r1 = r8.f36381a
            int r6 = r8.f36378A
            if (r5 >= r4) goto L_0x00fe
            r6 = r1[r6]
            int[] r6 = r6.f32813a
            r1 = r1[r2]
            int[] r1 = r1.f32813a
            r1 = r1[r5]
            r6[r3] = r1
        L_0x00d2:
            if (r0 > r5) goto L_0x00e9
            com.onedelhi.secure.nw2[] r1 = r8.f36381a
            int r3 = r8.f36378A
            r3 = r1[r3]
            int[] r3 = r3.f32813a
            r1 = r1[r2]
            int[] r1 = r1.f32813a
            int r6 = r0 + -1
            r1 = r1[r6]
            r3[r0] = r1
            int r0 = r0 + 1
            goto L_0x00d2
        L_0x00e9:
            if (r0 >= r4) goto L_0x0111
            com.onedelhi.secure.nw2[] r1 = r8.f36381a
            int r3 = r8.f36378A
            r3 = r1[r3]
            int[] r3 = r3.f32813a
            r1 = r1[r2]
            int[] r1 = r1.f32813a
            r1 = r1[r0]
            r3[r0] = r1
            int r0 = r0 + 1
            goto L_0x00e9
        L_0x00fe:
            r7 = r1[r6]
            int[] r7 = r7.f32813a
            int r5 = r5 - r4
            r7[r3] = r5
            r2 = r1[r2]
            int[] r2 = r2.f32813a
            r1 = r1[r6]
            int[] r1 = r1.f32813a
            r4 = 3
            java.lang.System.arraycopy(r2, r3, r1, r0, r4)
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.v02.mo45920J():void");
    }

    /* renamed from: b */
    public void mo43775b() {
        this.f36378A = 0;
        this.f36379B = 0;
        super.mo43775b();
    }

    /* renamed from: u */
    public int mo44706u() {
        int i;
        int i2 = this.f36378A;
        if (i2 < this.f36379B) {
            nw2[] nw2Arr = this.f36381a;
            int i3 = nw2Arr[i2].f32814b - i2;
            int i4 = nw2Arr[i2].f32814b;
            this.f36378A = i4;
            this.f35306r = nw2Arr[i4].f32816c;
            return i3;
        }
        this.f36378A = 0;
        this.f36379B = 0;
        this.f35306r = -1;
        if (this.f35307s == -1) {
            this.f36380a = mo44705s();
        }
        int min = Math.min(this.f35294a.mo38968c(), 273);
        if (min < 2) {
            return 1;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < 4; i6++) {
            this.f36383c[i6] = this.f35294a.mo38971h(this.f34429a[i6], min);
            int[] iArr = this.f36383c;
            if (iArr[i6] < 2) {
                iArr[i6] = 0;
            } else if (iArr[i6] > iArr[i5]) {
                i5 = i6;
            }
        }
        int[] iArr2 = this.f36383c;
        int i7 = iArr2[i5];
        int i8 = this.f35302n;
        if (i7 >= i8) {
            this.f35306r = i5;
            mo44688A(iArr2[i5] - 1);
            return this.f36383c[i5];
        }
        fe2 fe2 = this.f36380a;
        int i9 = fe2.f28271a;
        if (i9 > 0) {
            i = fe2.f28272a[i9 - 1];
            int i10 = fe2.f28273b[i9 - 1];
            if (i >= i8) {
                this.f35306r = i10 + 4;
                mo44688A(i - 1);
                return i;
            }
        } else {
            i = 0;
        }
        int e = this.f35294a.mo38969e(0);
        int e2 = this.f35294a.mo38969e(this.f34429a[0] + 1);
        if (i < 2 && e != e2 && this.f36383c[i5] < 2) {
            return 1;
        }
        int l = this.f35294a.mo38973l();
        int i11 = l & this.f34427a;
        int i12 = i11;
        this.f36381a[1].mo41496b(this.f35296a.mo44718d(e, e2, this.f35294a.mo38969e(1), l, this.f34428a), 0, -1);
        int k = mo44699k(this.f34428a, i12);
        int l2 = mo44700l(k, this.f34428a);
        if (e2 == e) {
            int w = mo44708w(l2, this.f34428a, i12);
            nw2[] nw2Arr2 = this.f36381a;
            if (w < nw2Arr2[1].f32810a) {
                nw2Arr2[1].mo41496b(w, 0, 0);
            }
        }
        int max = Math.max(i, this.f36383c[i5]);
        this.f36379B = max;
        if (max < 2) {
            this.f35306r = this.f36381a[1].f32816c;
            return 1;
        }
        mo44691D();
        this.f36381a[0].f32811a.mo32229d(this.f34428a);
        System.arraycopy(this.f34429a, 0, this.f36381a[0].f32813a, 0, 4);
        for (int i13 = this.f36379B; i13 >= 2; i13--) {
            this.f36381a[i13].mo41495a();
        }
        int i14 = 0;
        for (int i15 = 4; i14 < i15; i15 = 4) {
            int i16 = this.f36383c[i14];
            if (i16 >= 2) {
                int q = mo44703q(l2, i14, this.f34428a, i12);
                while (true) {
                    int c = this.f35299b.mo44713c(i16, i12) + q;
                    nw2[] nw2Arr3 = this.f36381a;
                    if (c < nw2Arr3[i16].f32810a) {
                        nw2Arr3[i16].mo41496b(c, 0, i14);
                    }
                    i16--;
                    if (i16 < 2) {
                        break;
                    }
                }
            }
            i14++;
        }
        int max2 = Math.max(this.f36383c[0] + 1, 2);
        if (max2 <= i) {
            int v = mo44707v(k, this.f34428a);
            int i17 = 0;
            while (max2 > this.f36380a.f28272a[i17]) {
                i17++;
            }
            while (true) {
                int i18 = this.f36380a.f28273b[i17];
                int r = mo44704r(v, i18, max2, i12);
                nw2[] nw2Arr4 = this.f36381a;
                if (r < nw2Arr4[max2].f32810a) {
                    nw2Arr4[max2].mo41496b(r, 0, i18 + 4);
                }
                fe2 fe22 = this.f36380a;
                if (max2 == fe22.f28272a[i17] && (i17 = i17 + 1) == fe22.f28271a) {
                    break;
                }
                max2++;
            }
        }
        int min2 = Math.min(this.f35294a.mo38968c(), UnixStat.PERM_MASK);
        while (true) {
            int i19 = this.f36378A + 1;
            this.f36378A = i19;
            if (i19 >= this.f36379B) {
                break;
            }
            fe2 s = mo44705s();
            this.f36380a = s;
            int i20 = s.f28271a;
            if (i20 > 0 && s.f28272a[i20 - 1] >= this.f35302n) {
                break;
            }
            int i21 = min2 - 1;
            int i22 = l + 1;
            int i23 = i22 & this.f34427a;
            mo45920J();
            nw2[] nw2Arr5 = this.f36381a;
            int i24 = this.f36378A;
            int k2 = nw2Arr5[i24].f32810a + mo44699k(nw2Arr5[i24].f32811a, i23);
            int l3 = mo44700l(k2, this.f36381a[this.f36378A].f32811a);
            mo45916E(i22, i23, i21, l3);
            if (i21 >= 2) {
                int F = mo45917F(i22, i23, i21, l3);
                if (this.f36380a.f28271a > 0) {
                    mo45918G(i22, i23, i21, k2, F);
                }
            }
            min2 = i21;
            l = i22;
        }
        return mo45919H();
    }
}
