package com.onedelhi.secure;

public final class kk0 {

    /* renamed from: a */
    public final cx4 f31237a;

    /* renamed from: a */
    public final C6190nl f31238a;

    public kk0(C6190nl nlVar) throws tr2 {
        this.f31238a = nlVar;
        this.f31237a = new cx4(nlVar);
    }

    /* renamed from: f */
    public static sl3 m54422f(sl3 sl3, float f, float f2) {
        float c = sl3.mo44403c();
        float d = sl3.mo44404d();
        return new sl3(c < f ? c - 1.0f : c + 1.0f, d < f2 ? d - 1.0f : d + 1.0f);
    }

    /* renamed from: g */
    public static C6190nl m54423g(C6190nl nlVar, sl3 sl3, sl3 sl32, sl3 sl33, sl3 sl34, int i, int i2) throws tr2 {
        float f = ((float) i) - 0.5f;
        float f2 = ((float) i2) - 0.5f;
        return vi1.m68088b().mo31720c(nlVar, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, sl3.mo44403c(), sl3.mo44404d(), sl34.mo44403c(), sl34.mo44404d(), sl33.mo44403c(), sl33.mo44404d(), sl32.mo44403c(), sl32.mo44404d());
    }

    /* renamed from: h */
    public static sl3 m54424h(sl3 sl3, sl3 sl32, int i) {
        float f = (float) (i + 1);
        return new sl3(sl3.mo44403c() + ((sl32.mo44403c() - sl3.mo44403c()) / f), sl3.mo44404d() + ((sl32.mo44404d() - sl3.mo44404d()) / f));
    }

    /* renamed from: a */
    public final sl3 mo39271a(sl3[] sl3Arr) {
        sl3 sl3 = sl3Arr[0];
        sl3 sl32 = sl3Arr[1];
        sl3 sl33 = sl3Arr[2];
        sl3 sl34 = sl3Arr[3];
        int j = mo39277j(sl3, sl34);
        sl3 h = m54424h(sl3, sl32, (mo39277j(sl32, sl34) + 1) << 2);
        sl3 h2 = m54424h(sl33, sl32, (j + 1) << 2);
        int j2 = mo39277j(h, sl34);
        int j3 = mo39277j(h2, sl34);
        float f = (float) (j2 + 1);
        sl3 sl35 = new sl3(sl34.mo44403c() + ((sl33.mo44403c() - sl32.mo44403c()) / f), sl34.mo44404d() + ((sl33.mo44404d() - sl32.mo44404d()) / f));
        float f2 = (float) (j3 + 1);
        sl3 sl36 = new sl3(sl34.mo44403c() + ((sl3.mo44403c() - sl32.mo44403c()) / f2), sl34.mo44404d() + ((sl3.mo44404d() - sl32.mo44404d()) / f2));
        if (mo39275e(sl35)) {
            return (mo39275e(sl36) && mo39277j(h, sl35) + mo39277j(h2, sl35) <= mo39277j(h, sl36) + mo39277j(h2, sl36)) ? sl36 : sl35;
        }
        if (mo39275e(sl36)) {
            return sl36;
        }
        return null;
    }

    /* renamed from: b */
    public nk0 mo39272b() throws tr2 {
        int i;
        int i2;
        sl3[] d = mo39274d(mo39273c(this.f31237a.mo33995c()));
        d[3] = mo39271a(d);
        if (d[3] != null) {
            sl3[] i3 = mo39276i(d);
            sl3 sl3 = i3[0];
            sl3 sl32 = i3[1];
            sl3 sl33 = i3[2];
            sl3 sl34 = i3[3];
            int j = mo39277j(sl3, sl34) + 1;
            int j2 = mo39277j(sl33, sl34) + 1;
            if ((j & 1) == 1) {
                j++;
            }
            if ((j2 & 1) == 1) {
                j2++;
            }
            if (j * 4 >= j2 * 7 || j2 * 4 >= j * 7) {
                i2 = j;
                i = j2;
            } else {
                i2 = Math.max(j, j2);
                i = i2;
            }
            return new nk0(m54423g(this.f31238a, sl3, sl32, sl33, sl34, i2, i), new sl3[]{sl3, sl32, sl33, sl34});
        }
        throw tr2.m66179a();
    }

    /* renamed from: c */
    public final sl3[] mo39273c(sl3[] sl3Arr) {
        sl3 sl3 = sl3Arr[0];
        sl3 sl32 = sl3Arr[1];
        sl3 sl33 = sl3Arr[3];
        sl3 sl34 = sl3Arr[2];
        int j = mo39277j(sl3, sl32);
        int j2 = mo39277j(sl32, sl33);
        int j3 = mo39277j(sl33, sl34);
        int j4 = mo39277j(sl34, sl3);
        sl3[] sl3Arr2 = {sl34, sl3, sl32, sl33};
        if (j > j2) {
            sl3Arr2[0] = sl3;
            sl3Arr2[1] = sl32;
            sl3Arr2[2] = sl33;
            sl3Arr2[3] = sl34;
            j = j2;
        }
        if (j > j3) {
            sl3Arr2[0] = sl32;
            sl3Arr2[1] = sl33;
            sl3Arr2[2] = sl34;
            sl3Arr2[3] = sl3;
        } else {
            j3 = j;
        }
        if (j3 > j4) {
            sl3Arr2[0] = sl33;
            sl3Arr2[1] = sl34;
            sl3Arr2[2] = sl3;
            sl3Arr2[3] = sl32;
        }
        return sl3Arr2;
    }

    /* renamed from: d */
    public final sl3[] mo39274d(sl3[] sl3Arr) {
        sl3 sl3 = sl3Arr[0];
        sl3 sl32 = sl3Arr[1];
        sl3 sl33 = sl3Arr[2];
        sl3 sl34 = sl3Arr[3];
        int j = (mo39277j(sl3, sl34) + 1) << 2;
        if (mo39277j(m54424h(sl32, sl33, j), sl3) < mo39277j(m54424h(sl33, sl32, j), sl34)) {
            sl3Arr[0] = sl3;
            sl3Arr[1] = sl32;
            sl3Arr[2] = sl33;
            sl3Arr[3] = sl34;
        } else {
            sl3Arr[0] = sl32;
            sl3Arr[1] = sl33;
            sl3Arr[2] = sl34;
            sl3Arr[3] = sl3;
        }
        return sl3Arr;
    }

    /* renamed from: e */
    public final boolean mo39275e(sl3 sl3) {
        return sl3.mo44403c() >= 0.0f && sl3.mo44403c() < ((float) this.f31238a.mo41094l()) && sl3.mo44404d() > 0.0f && sl3.mo44404d() < ((float) this.f31238a.mo41089h());
    }

    /* renamed from: i */
    public final sl3[] mo39276i(sl3[] sl3Arr) {
        sl3 sl3 = sl3Arr[0];
        sl3 sl32 = sl3Arr[1];
        sl3 sl33 = sl3Arr[2];
        sl3 sl34 = sl3Arr[3];
        sl3 h = m54424h(sl3, sl32, (mo39277j(sl33, sl34) + 1) << 2);
        sl3 h2 = m54424h(sl33, sl32, (mo39277j(sl3, sl34) + 1) << 2);
        int j = mo39277j(h, sl34) + 1;
        int j2 = mo39277j(h2, sl34) + 1;
        if ((j & 1) == 1) {
            j++;
        }
        if ((j2 & 1) == 1) {
            j2++;
        }
        float c = (((sl3.mo44403c() + sl32.mo44403c()) + sl33.mo44403c()) + sl34.mo44403c()) / 4.0f;
        float d = (((sl3.mo44404d() + sl32.mo44404d()) + sl33.mo44404d()) + sl34.mo44404d()) / 4.0f;
        sl3 f = m54422f(sl3, c, d);
        sl3 f2 = m54422f(sl32, c, d);
        sl3 f3 = m54422f(sl33, c, d);
        sl3 f4 = m54422f(sl34, c, d);
        int i = j2 << 2;
        int i2 = j << 2;
        return new sl3[]{m54424h(m54424h(f, f2, i), f4, i2), m54424h(m54424h(f2, f, i), f3, i2), m54424h(m54424h(f3, f4, i), f2, i2), m54424h(m54424h(f4, f3, i), f, i2)};
    }

    /* renamed from: j */
    public final int mo39277j(sl3 sl3, sl3 sl32) {
        int c = (int) sl3.mo44403c();
        int d = (int) sl3.mo44404d();
        int c2 = (int) sl32.mo44403c();
        int d2 = (int) sl32.mo44404d();
        int i = 0;
        int i2 = 1;
        boolean z = Math.abs(d2 - d) > Math.abs(c2 - c);
        if (z) {
            int i3 = d;
            d = c;
            c = i3;
            int i4 = d2;
            d2 = c2;
            c2 = i4;
        }
        int abs = Math.abs(c2 - c);
        int abs2 = Math.abs(d2 - d);
        int i5 = (-abs) / 2;
        int i6 = d < d2 ? 1 : -1;
        if (c >= c2) {
            i2 = -1;
        }
        boolean e = this.f31238a.mo41085e(z ? d : c, z ? c : d);
        while (c != c2) {
            boolean e2 = this.f31238a.mo41085e(z ? d : c, z ? c : d);
            if (e2 != e) {
                i++;
                e = e2;
            }
            i5 += abs2;
            if (i5 > 0) {
                if (d == d2) {
                    break;
                }
                d += i6;
                i5 -= abs;
            }
            c += i2;
        }
        return i;
    }
}
