package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.onedelhi.secure.r4 */
public final class C6636r4 {

    /* renamed from: a */
    public final float f34491a;

    /* renamed from: a */
    public final int f34492a;

    /* renamed from: a */
    public final C6190nl f34493a;

    /* renamed from: a */
    public final tl3 f34494a;

    /* renamed from: a */
    public final List<C6505q4> f34495a = new ArrayList(5);

    /* renamed from: a */
    public final int[] f34496a;

    /* renamed from: b */
    public final int f34497b;

    /* renamed from: c */
    public final int f34498c;

    /* renamed from: d */
    public final int f34499d;

    public C6636r4(C6190nl nlVar, int i, int i2, int i3, int i4, float f, tl3 tl3) {
        this.f34493a = nlVar;
        this.f34492a = i;
        this.f34497b = i2;
        this.f34498c = i3;
        this.f34499d = i4;
        this.f34491a = f;
        this.f34496a = new int[3];
        this.f34494a = tl3;
    }

    /* renamed from: a */
    public static float m63366a(int[] iArr, int i) {
        return ((float) (i - iArr[2])) - (((float) iArr[1]) / 2.0f);
    }

    /* renamed from: b */
    public final float mo43807b(int i, int i2, int i3, int i4) {
        C6190nl nlVar = this.f34493a;
        int h = nlVar.mo41089h();
        int[] iArr = this.f34496a;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i5 = i;
        while (i5 >= 0 && nlVar.mo41085e(i2, i5) && iArr[1] <= i3) {
            iArr[1] = iArr[1] + 1;
            i5--;
        }
        if (i5 >= 0 && iArr[1] <= i3) {
            while (i5 >= 0 && !nlVar.mo41085e(i2, i5) && iArr[0] <= i3) {
                iArr[0] = iArr[0] + 1;
                i5--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < h && nlVar.mo41085e(i2, i6) && iArr[1] <= i3) {
                iArr[1] = iArr[1] + 1;
                i6++;
            }
            if (i6 != h && iArr[1] <= i3) {
                while (i6 < h && !nlVar.mo41085e(i2, i6) && iArr[2] <= i3) {
                    iArr[2] = iArr[2] + 1;
                    i6++;
                }
                if (iArr[2] <= i3 && Math.abs(((iArr[0] + iArr[1]) + iArr[2]) - i4) * 5 < i4 * 2 && mo43809d(iArr)) {
                    return m63366a(iArr, i6);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: c */
    public C6505q4 mo43808c() throws tr2 {
        C6505q4 e;
        C6505q4 e2;
        int i = this.f34492a;
        int i2 = this.f34499d;
        int i3 = this.f34498c + i;
        int i4 = this.f34497b + (i2 / 2);
        int[] iArr = new int[3];
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = ((i5 & 1) == 0 ? (i5 + 1) / 2 : -((i5 + 1) / 2)) + i4;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i7 = i;
            while (i7 < i3 && !this.f34493a.mo41085e(i7, i6)) {
                i7++;
            }
            int i8 = 0;
            while (i7 < i3) {
                if (!this.f34493a.mo41085e(i7, i6)) {
                    if (i8 == 1) {
                        i8++;
                    }
                    iArr[i8] = iArr[i8] + 1;
                } else if (i8 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i8 != 2) {
                    i8++;
                    iArr[i8] = iArr[i8] + 1;
                } else if (mo43809d(iArr) && (e2 = mo43810e(iArr, i6, i7)) != null) {
                    return e2;
                } else {
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i8 = 1;
                }
                i7++;
            }
            if (mo43809d(iArr) && (e = mo43810e(iArr, i6, i3)) != null) {
                return e;
            }
        }
        if (!this.f34495a.isEmpty()) {
            return this.f34495a.get(0);
        }
        throw tr2.m66179a();
    }

    /* renamed from: d */
    public final boolean mo43809d(int[] iArr) {
        float f = this.f34491a;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - ((float) iArr[i])) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final C6505q4 mo43810e(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float a = m63366a(iArr, i2);
        float b = mo43807b(i, (int) a, iArr[1] * 2, i3);
        if (Float.isNaN(b)) {
            return null;
        }
        float f = ((float) ((iArr[0] + iArr[1]) + iArr[2])) / 3.0f;
        for (C6505q4 next : this.f34495a) {
            if (next.mo43138f(f, b, a)) {
                return next.mo43139g(b, a, f);
            }
        }
        C6505q4 q4Var = new C6505q4(a, b, f);
        this.f34495a.add(q4Var);
        tl3 tl3 = this.f34494a;
        if (tl3 == null) {
            return null;
        }
        tl3.mo35233a(q4Var);
        return null;
    }
}
