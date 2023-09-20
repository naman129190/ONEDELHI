package com.onedelhi.secure;

public final class jk0 {

    /* renamed from: a */
    public static final int[] f30847a = {3808, 476, 2107, 1799};

    /* renamed from: a */
    public int f30848a;

    /* renamed from: a */
    public final C6190nl f30849a;

    /* renamed from: a */
    public boolean f30850a;

    /* renamed from: b */
    public int f30851b;

    /* renamed from: c */
    public int f30852c;

    /* renamed from: d */
    public int f30853d;

    /* renamed from: com.onedelhi.secure.jk0$a */
    public static final class C5826a {

        /* renamed from: a */
        public final int f30854a;

        /* renamed from: b */
        public final int f30855b;

        public C5826a(int i, int i2) {
            this.f30854a = i;
            this.f30855b = i2;
        }

        /* renamed from: a */
        public int mo38714a() {
            return this.f30854a;
        }

        /* renamed from: b */
        public int mo38715b() {
            return this.f30855b;
        }

        /* renamed from: c */
        public sl3 mo38716c() {
            return new sl3((float) this.f30854a, (float) this.f30855b);
        }

        public String toString() {
            return "<" + this.f30854a + ' ' + this.f30855b + tk4.f35698e;
        }
    }

    public jk0(C6190nl nlVar) {
        this.f30849a = nlVar;
    }

    /* renamed from: c */
    public static float m53453c(C5826a aVar, C5826a aVar2) {
        return qf2.m62732b(aVar.mo38714a(), aVar.mo38715b(), aVar2.mo38714a(), aVar2.mo38715b());
    }

    /* renamed from: d */
    public static float m53454d(sl3 sl3, sl3 sl32) {
        return qf2.m62731a(sl3.mo44403c(), sl3.mo44404d(), sl32.mo44403c(), sl32.mo44404d());
    }

    /* renamed from: e */
    public static sl3[] m53455e(sl3[] sl3Arr, int i, int i2) {
        float f = ((float) i2) / (((float) i) * 2.0f);
        float c = sl3Arr[0].mo44403c() - sl3Arr[2].mo44403c();
        float d = sl3Arr[0].mo44404d() - sl3Arr[2].mo44404d();
        float c2 = (sl3Arr[0].mo44403c() + sl3Arr[2].mo44403c()) / 2.0f;
        float d2 = (sl3Arr[0].mo44404d() + sl3Arr[2].mo44404d()) / 2.0f;
        float f2 = c * f;
        float f3 = d * f;
        sl3 sl3 = new sl3(c2 + f2, d2 + f3);
        sl3 sl32 = new sl3(c2 - f2, d2 - f3);
        float c3 = sl3Arr[1].mo44403c() - sl3Arr[3].mo44403c();
        float d3 = sl3Arr[1].mo44404d() - sl3Arr[3].mo44404d();
        float c4 = (sl3Arr[1].mo44403c() + sl3Arr[3].mo44403c()) / 2.0f;
        float d4 = (sl3Arr[1].mo44404d() + sl3Arr[3].mo44404d()) / 2.0f;
        float f4 = c3 * f;
        float f5 = f * d3;
        return new sl3[]{sl3, new sl3(c4 + f4, d4 + f5), sl32, new sl3(c4 - f4, d4 - f5)};
    }

    /* renamed from: i */
    public static int m53456i(long j, boolean z) throws tr2 {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int i3 = i - i2;
        int[] iArr = new int[i];
        for (int i4 = i - 1; i4 >= 0; i4--) {
            iArr[i4] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            new vg3(te1.f35528d).mo46148a(iArr, i3);
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i5 = (i5 << 4) + iArr[i6];
            }
            return i5;
        } catch (xg3 unused) {
            throw tr2.m66179a();
        }
    }

    /* renamed from: n */
    public static int m53457n(int[] iArr, int i) throws tr2 {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        int i4 = ((i2 & 1) << 11) + (i2 >> 1);
        for (int i5 = 0; i5 < 4; i5++) {
            if (Integer.bitCount(f30847a[i5] ^ i4) <= 2) {
                return i5;
            }
        }
        throw tr2.m66179a();
    }

    /* renamed from: a */
    public C7049vh mo38700a() throws tr2 {
        return mo38701b(false);
    }

    /* renamed from: b */
    public C7049vh mo38701b(boolean z) throws tr2 {
        sl3[] g = mo38703g(mo38707l());
        if (z) {
            sl3 sl3 = g[0];
            g[0] = g[2];
            g[2] = sl3;
        }
        mo38702f(g);
        C6190nl nlVar = this.f30849a;
        int i = this.f30853d;
        return new C7049vh(mo38712r(nlVar, g[i % 4], g[(i + 1) % 4], g[(i + 2) % 4], g[(i + 3) % 4]), mo38708m(g), this.f30850a, this.f30851b, this.f30848a);
    }

    /* renamed from: f */
    public final void mo38702f(sl3[] sl3Arr) throws tr2 {
        int i;
        long j;
        long j2;
        if (!mo38710p(sl3Arr[0]) || !mo38710p(sl3Arr[1]) || !mo38710p(sl3Arr[2]) || !mo38710p(sl3Arr[3])) {
            throw tr2.m66179a();
        }
        int i2 = this.f30852c * 2;
        int[] iArr = {mo38713s(sl3Arr[0], sl3Arr[1], i2), mo38713s(sl3Arr[1], sl3Arr[2], i2), mo38713s(sl3Arr[2], sl3Arr[3], i2), mo38713s(sl3Arr[3], sl3Arr[0], i2)};
        this.f30853d = m53457n(iArr, i2);
        long j3 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = iArr[(this.f30853d + i3) % 4];
            if (this.f30850a) {
                j2 = j3 << 7;
                j = (long) ((i4 >> 1) & 127);
            } else {
                j2 = j3 << 10;
                j = (long) (((i4 >> 2) & 992) + ((i4 >> 1) & 31));
            }
            j3 = j2 + j;
        }
        int i5 = m53456i(j3, this.f30850a);
        if (this.f30850a) {
            this.f30848a = (i5 >> 6) + 1;
            i = i5 & 63;
        } else {
            this.f30848a = (i5 >> 11) + 1;
            i = i5 & 2047;
        }
        this.f30851b = i + 1;
    }

    /* renamed from: g */
    public final sl3[] mo38703g(C5826a aVar) throws tr2 {
        this.f30852c = 1;
        C5826a aVar2 = aVar;
        C5826a aVar3 = aVar2;
        C5826a aVar4 = aVar3;
        C5826a aVar5 = aVar4;
        boolean z = true;
        while (this.f30852c < 9) {
            C5826a k = mo38706k(aVar2, z, 1, -1);
            C5826a k2 = mo38706k(aVar3, z, 1, 1);
            C5826a k3 = mo38706k(aVar4, z, -1, 1);
            C5826a k4 = mo38706k(aVar5, z, -1, -1);
            if (this.f30852c > 2) {
                double c = (double) ((m53453c(k4, k) * ((float) this.f30852c)) / (m53453c(aVar5, aVar2) * ((float) (this.f30852c + 2))));
                if (c < 0.75d || c > 1.25d || !mo38711q(k, k2, k3, k4)) {
                    break;
                }
            }
            z = !z;
            this.f30852c++;
            aVar5 = k4;
            aVar2 = k;
            aVar3 = k2;
            aVar4 = k3;
        }
        int i = this.f30852c;
        if (i == 5 || i == 7) {
            this.f30850a = i == 5;
            sl3[] sl3Arr = {new sl3(((float) aVar2.mo38714a()) + 0.5f, ((float) aVar2.mo38715b()) - 0.5f), new sl3(((float) aVar3.mo38714a()) + 0.5f, ((float) aVar3.mo38715b()) + 0.5f), new sl3(((float) aVar4.mo38714a()) - 0.5f, ((float) aVar4.mo38715b()) + 0.5f), new sl3(((float) aVar5.mo38714a()) - 0.5f, ((float) aVar5.mo38715b()) - 0.5f)};
            int i2 = this.f30852c;
            return m53455e(sl3Arr, (i2 * 2) - 3, i2 * 2);
        }
        throw tr2.m66179a();
    }

    /* renamed from: h */
    public final int mo38704h(C5826a aVar, C5826a aVar2) {
        float c = m53453c(aVar, aVar2);
        float a = ((float) (aVar2.mo38714a() - aVar.mo38714a())) / c;
        float b = ((float) (aVar2.mo38715b() - aVar.mo38715b())) / c;
        float a2 = (float) aVar.mo38714a();
        float b2 = (float) aVar.mo38715b();
        boolean e = this.f30849a.mo41085e(aVar.mo38714a(), aVar.mo38715b());
        int ceil = (int) Math.ceil((double) c);
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            a2 += a;
            b2 += b;
            if (this.f30849a.mo41085e(qf2.m62733c(a2), qf2.m62733c(b2)) != e) {
                i++;
            }
        }
        float f = ((float) i) / c;
        if (f > 0.1f && f < 0.9f) {
            return 0;
        }
        if (f <= 0.1f) {
            z = true;
        }
        return z == e ? 1 : -1;
    }

    /* renamed from: j */
    public final int mo38705j() {
        if (this.f30850a) {
            return (this.f30848a * 4) + 11;
        }
        int i = this.f30848a;
        return i <= 4 ? (i * 4) + 15 : (i * 4) + ((((i - 4) / 8) + 1) * 2) + 15;
    }

    /* renamed from: k */
    public final C5826a mo38706k(C5826a aVar, boolean z, int i, int i2) {
        int a = aVar.mo38714a() + i;
        int b = aVar.mo38715b();
        while (true) {
            b += i2;
            if (!mo38709o(a, b) || this.f30849a.mo41085e(a, b) != z) {
                int i3 = a - i;
                int i4 = b - i2;
            } else {
                a += i;
            }
        }
        int i32 = a - i;
        int i42 = b - i2;
        while (mo38709o(i32, i42) && this.f30849a.mo41085e(i32, i42) == z) {
            i32 += i;
        }
        int i5 = i32 - i;
        while (mo38709o(i5, i42) && this.f30849a.mo41085e(i5, i42) == z) {
            i42 += i2;
        }
        return new C5826a(i5, i42 - i2);
    }

    /* renamed from: l */
    public final C5826a mo38707l() {
        sl3 sl3;
        sl3 sl32;
        sl3 sl33;
        sl3 sl34;
        sl3 sl35;
        sl3 sl36;
        sl3 sl37;
        sl3 sl38;
        try {
            sl3[] c = new cx4(this.f30849a).mo33995c();
            sl33 = c[0];
            sl32 = c[1];
            sl3 = c[2];
            sl34 = c[3];
        } catch (tr2 unused) {
            int l = this.f30849a.mo41094l() / 2;
            int h = this.f30849a.mo41089h() / 2;
            int i = l + 7;
            int i2 = h - 7;
            sl3 c2 = mo38706k(new C5826a(i, i2), false, 1, -1).mo38716c();
            int i3 = h + 7;
            sl3 c3 = mo38706k(new C5826a(i, i3), false, 1, 1).mo38716c();
            int i4 = l - 7;
            sl3 c4 = mo38706k(new C5826a(i4, i3), false, -1, 1).mo38716c();
            sl34 = mo38706k(new C5826a(i4, i2), false, -1, -1).mo38716c();
            sl3 sl39 = c3;
            sl3 = c4;
            sl33 = c2;
            sl32 = sl39;
        }
        int c5 = qf2.m62733c((((sl33.mo44403c() + sl34.mo44403c()) + sl32.mo44403c()) + sl3.mo44403c()) / 4.0f);
        int c6 = qf2.m62733c((((sl33.mo44404d() + sl34.mo44404d()) + sl32.mo44404d()) + sl3.mo44404d()) / 4.0f);
        try {
            sl3[] c7 = new cx4(this.f30849a, 15, c5, c6).mo33995c();
            sl36 = c7[0];
            sl35 = c7[1];
            sl37 = c7[2];
            sl38 = c7[3];
        } catch (tr2 unused2) {
            int i5 = c5 + 7;
            int i6 = c6 - 7;
            sl36 = mo38706k(new C5826a(i5, i6), false, 1, -1).mo38716c();
            int i7 = c6 + 7;
            sl35 = mo38706k(new C5826a(i5, i7), false, 1, 1).mo38716c();
            int i8 = c5 - 7;
            sl37 = mo38706k(new C5826a(i8, i7), false, -1, 1).mo38716c();
            sl38 = mo38706k(new C5826a(i8, i6), false, -1, -1).mo38716c();
        }
        return new C5826a(qf2.m62733c((((sl36.mo44403c() + sl38.mo44403c()) + sl35.mo44403c()) + sl37.mo44403c()) / 4.0f), qf2.m62733c((((sl36.mo44404d() + sl38.mo44404d()) + sl35.mo44404d()) + sl37.mo44404d()) / 4.0f));
    }

    /* renamed from: m */
    public final sl3[] mo38708m(sl3[] sl3Arr) {
        return m53455e(sl3Arr, this.f30852c * 2, mo38705j());
    }

    /* renamed from: o */
    public final boolean mo38709o(int i, int i2) {
        return i >= 0 && i < this.f30849a.mo41094l() && i2 > 0 && i2 < this.f30849a.mo41089h();
    }

    /* renamed from: p */
    public final boolean mo38710p(sl3 sl3) {
        return mo38709o(qf2.m62733c(sl3.mo44403c()), qf2.m62733c(sl3.mo44404d()));
    }

    /* renamed from: q */
    public final boolean mo38711q(C5826a aVar, C5826a aVar2, C5826a aVar3, C5826a aVar4) {
        C5826a aVar5 = new C5826a(aVar.mo38714a() - 3, aVar.mo38715b() + 3);
        C5826a aVar6 = new C5826a(aVar2.mo38714a() - 3, aVar2.mo38715b() - 3);
        C5826a aVar7 = new C5826a(aVar3.mo38714a() + 3, aVar3.mo38715b() - 3);
        C5826a aVar8 = new C5826a(aVar4.mo38714a() + 3, aVar4.mo38715b() + 3);
        int h = mo38704h(aVar8, aVar5);
        return h != 0 && mo38704h(aVar5, aVar6) == h && mo38704h(aVar6, aVar7) == h && mo38704h(aVar7, aVar8) == h;
    }

    /* renamed from: r */
    public final C6190nl mo38712r(C6190nl nlVar, sl3 sl3, sl3 sl32, sl3 sl33, sl3 sl34) throws tr2 {
        vi1 b = vi1.m68088b();
        int j = mo38705j();
        int i = j;
        int i2 = j;
        float f = ((float) j) / 2.0f;
        int i3 = this.f30852c;
        float f2 = f - ((float) i3);
        float f3 = f + ((float) i3);
        return b.mo31720c(nlVar, i2, i, f2, f2, f3, f2, f3, f3, f2, f3, sl3.mo44403c(), sl3.mo44404d(), sl32.mo44403c(), sl32.mo44404d(), sl33.mo44403c(), sl33.mo44404d(), sl34.mo44403c(), sl34.mo44404d());
    }

    /* renamed from: s */
    public final int mo38713s(sl3 sl3, sl3 sl32, int i) {
        float d = m53454d(sl3, sl32);
        float f = d / ((float) i);
        float c = sl3.mo44403c();
        float d2 = sl3.mo44404d();
        float c2 = ((sl32.mo44403c() - sl3.mo44403c()) * f) / d;
        float d3 = (f * (sl32.mo44404d() - sl3.mo44404d())) / d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = (float) i3;
            if (this.f30849a.mo41085e(qf2.m62733c((f2 * c2) + c), qf2.m62733c((f2 * d3) + d2))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }
}
