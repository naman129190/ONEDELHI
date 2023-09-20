package com.onedelhi.secure;

import java.util.Map;

public class mk0 {

    /* renamed from: a */
    public final C6190nl f32173a;

    /* renamed from: a */
    public tl3 f32174a;

    public mk0(C6190nl nlVar) {
        this.f32173a = nlVar;
    }

    /* renamed from: c */
    public static int m57393c(sl3 sl3, sl3 sl32, sl3 sl33, float f) throws tr2 {
        int c = ((qf2.m62733c(sl3.m64700b(sl3, sl32) / f) + qf2.m62733c(sl3.m64700b(sl3, sl33) / f)) / 2) + 7;
        int i = c & 3;
        if (i == 0) {
            return c + 1;
        }
        if (i == 2) {
            return c - 1;
        }
        if (i != 3) {
            return c;
        }
        throw tr2.m66179a();
    }

    /* renamed from: d */
    public static u13 m57394d(sl3 sl3, sl3 sl32, sl3 sl33, sl3 sl34, int i) {
        float f;
        float f2;
        float f3;
        float f4 = ((float) i) - 3.5f;
        if (sl34 != null) {
            f2 = sl34.mo44403c();
            f = sl34.mo44404d();
            f3 = f4 - 3.0f;
        } else {
            f2 = (sl32.mo44403c() - sl3.mo44403c()) + sl33.mo44403c();
            f = (sl32.mo44404d() - sl3.mo44404d()) + sl33.mo44404d();
            f3 = f4;
        }
        return u13.m66383b(3.5f, 3.5f, f4, 3.5f, f3, f3, 3.5f, f4, sl3.mo44403c(), sl3.mo44404d(), sl32.mo44403c(), sl32.mo44404d(), f2, f, sl33.mo44403c(), sl33.mo44404d());
    }

    /* renamed from: k */
    public static C6190nl m57395k(C6190nl nlVar, u13 u13, int i) throws tr2 {
        return vi1.m68088b().mo31721d(nlVar, i, i, u13);
    }

    /* renamed from: a */
    public final float mo40683a(sl3 sl3, sl3 sl32, sl3 sl33) {
        return (mo40684b(sl3, sl32) + mo40684b(sl3, sl33)) / 2.0f;
    }

    /* renamed from: b */
    public final float mo40684b(sl3 sl3, sl3 sl32) {
        float m = mo40692m((int) sl3.mo44403c(), (int) sl3.mo44404d(), (int) sl32.mo44403c(), (int) sl32.mo44404d());
        float m2 = mo40692m((int) sl32.mo44403c(), (int) sl32.mo44404d(), (int) sl3.mo44403c(), (int) sl3.mo44404d());
        return Float.isNaN(m) ? m2 / 7.0f : Float.isNaN(m2) ? m / 7.0f : (m + m2) / 14.0f;
    }

    /* renamed from: e */
    public nk0 mo40685e() throws tr2, ha1 {
        return mo40686f((Map<pf0, ?>) null);
    }

    /* renamed from: f */
    public final nk0 mo40686f(Map<pf0, ?> map) throws tr2, ha1 {
        this.f32174a = map == null ? null : (tl3) map.get(pf0.NEED_RESULT_POINT_CALLBACK);
        return mo40690j(new n31(this.f32173a, this.f32174a).mo40907h(map));
    }

    /* renamed from: g */
    public final C6505q4 mo40687g(float f, int i, int i2, float f2) throws tr2 {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.f32173a.mo41094l() - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (((float) min) >= f3) {
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.f32173a.mo41089h() - 1, i2 + i3) - max2;
            if (((float) min2) >= f3) {
                return new C6636r4(this.f32173a, max, max2, min, min2, f, this.f32174a).mo43808c();
            }
            throw tr2.m66179a();
        }
        throw tr2.m66179a();
    }

    /* renamed from: h */
    public final C6190nl mo40688h() {
        return this.f32173a;
    }

    /* renamed from: i */
    public final tl3 mo40689i() {
        return this.f32174a;
    }

    /* renamed from: j */
    public final nk0 mo40690j(o31 o31) throws tr2, ha1 {
        sl3[] sl3Arr;
        l31 b = o31.mo41516b();
        l31 c = o31.mo41517c();
        l31 a = o31.mo41515a();
        float a2 = mo40683a(b, c, a);
        if (a2 >= 1.0f) {
            int c2 = m57393c(b, c, a, a2);
            ts4 g = ts4.m66185g(c2);
            int e = g.mo45297e() - 7;
            C6505q4 q4Var = null;
            if (g.mo45296d().length > 0) {
                float c3 = (c.mo44403c() - b.mo44403c()) + a.mo44403c();
                float d = (c.mo44404d() - b.mo44404d()) + a.mo44404d();
                float f = 1.0f - (3.0f / ((float) e));
                int c4 = (int) (b.mo44403c() + ((c3 - b.mo44403c()) * f));
                int d2 = (int) (b.mo44404d() + (f * (d - b.mo44404d())));
                int i = 4;
                while (true) {
                    if (i > 16) {
                        break;
                    }
                    try {
                        q4Var = mo40687g(a2, c4, d2, (float) i);
                        break;
                    } catch (tr2 unused) {
                        i <<= 1;
                    }
                }
            }
            C6190nl k = m57395k(this.f32173a, m57394d(b, c, a, q4Var, c2), c2);
            if (q4Var == null) {
                sl3Arr = new sl3[]{a, b, c};
            } else {
                sl3Arr = new sl3[]{a, b, c, q4Var};
            }
            return new nk0(k, sl3Arr);
        }
        throw tr2.m66179a();
    }

    /* renamed from: l */
    public final float mo40691l(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        mk0 mk0;
        boolean z2;
        int i10 = 1;
        boolean z3 = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z3) {
            i7 = i;
            i8 = i2;
            i5 = i3;
            i6 = i4;
        } else {
            i8 = i;
            i7 = i2;
            i6 = i3;
            i5 = i4;
        }
        int abs = Math.abs(i6 - i8);
        int abs2 = Math.abs(i5 - i7);
        int i11 = (-abs) / 2;
        int i12 = -1;
        int i13 = i8 < i6 ? 1 : -1;
        if (i7 < i5) {
            i12 = 1;
        }
        int i14 = i6 + i13;
        int i15 = i8;
        int i16 = i7;
        int i17 = 0;
        while (true) {
            if (i15 == i14) {
                i9 = i14;
                break;
            }
            int i18 = z3 ? i16 : i15;
            int i19 = z3 ? i15 : i16;
            if (i17 == i10) {
                mk0 = this;
                z = z3;
                i9 = i14;
                z2 = true;
            } else {
                mk0 = this;
                z = z3;
                i9 = i14;
                z2 = false;
            }
            if (z2 == mk0.f32173a.mo41085e(i18, i19)) {
                if (i17 == 2) {
                    return qf2.m62732b(i15, i16, i8, i7);
                }
                i17++;
            }
            i11 += abs2;
            if (i11 > 0) {
                if (i16 == i5) {
                    break;
                }
                i16 += i12;
                i11 -= abs;
            }
            i15 += i13;
            i14 = i9;
            z3 = z;
            i10 = 1;
        }
        if (i17 == 2) {
            return qf2.m62732b(i9, i5, i8, i7);
        }
        return Float.NaN;
    }

    /* renamed from: m */
    public final float mo40692m(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float l = mo40691l(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = ((float) i) / ((float) (i - i5));
            i5 = 0;
        } else if (i5 >= this.f32173a.mo41094l()) {
            f = ((float) ((this.f32173a.mo41094l() - 1) - i)) / ((float) (i5 - i));
            i5 = this.f32173a.mo41094l() - 1;
        } else {
            f = 1.0f;
        }
        float f3 = (float) i2;
        int i7 = (int) (f3 - (((float) (i4 - i2)) * f));
        if (i7 < 0) {
            f2 = f3 / ((float) (i2 - i7));
        } else if (i7 >= this.f32173a.mo41089h()) {
            f2 = ((float) ((this.f32173a.mo41089h() - 1) - i2)) / ((float) (i7 - i2));
            i6 = this.f32173a.mo41089h() - 1;
        } else {
            i6 = i7;
            f2 = 1.0f;
        }
        return (l + mo40691l(i, i2, (int) (((float) i) + (((float) (i5 - i)) * f2)), i6)) - 1.0f;
    }
}
