package com.onedelhi.secure;

import easypay.appinvoke.manager.Constants;

public final class uf2 {

    /* renamed from: a */
    public static final int f36089a = 7973;

    /* renamed from: a */
    public static final int[][] f36090a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b */
    public static final int f36091b = 1335;

    /* renamed from: b */
    public static final int[][] f36092b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c */
    public static final int f36093c = 21522;

    /* renamed from: c */
    public static final int[][] f36094c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, Constants.ACTION_PASSWORD_FOUND}, new int[]{6, 28, 54, 80, 106, 132, Constants.ACTION_INCORRECT_OTP}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d */
    public static final int[][] f36095d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* renamed from: a */
    public static void m66988a(C6014ll llVar, kv0 kv0, ts4 ts4, int i, C7512zq zqVar) throws vy4 {
        m66990c(zqVar);
        m66991d(ts4, zqVar);
        m66999l(kv0, i, zqVar);
        m67006s(ts4, zqVar);
        m66993f(llVar, i, zqVar);
    }

    /* renamed from: b */
    public static int m66989b(int i, int i2) {
        if (i2 != 0) {
            int n = m67001n(i2);
            int i3 = i << (n - 1);
            while (m67001n(i3) >= n) {
                i3 ^= i2 << (m67001n(i3) - n);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    /* renamed from: c */
    public static void m66990c(C7512zq zqVar) {
        zqVar.mo48425a((byte) -1);
    }

    /* renamed from: d */
    public static void m66991d(ts4 ts4, C7512zq zqVar) throws vy4 {
        m66997j(zqVar);
        m66992e(zqVar);
        m67005r(ts4, zqVar);
        m66998k(zqVar);
    }

    /* renamed from: e */
    public static void m66992e(C7512zq zqVar) throws vy4 {
        if (zqVar.mo48426b(8, zqVar.mo48428d() - 8) != 0) {
            zqVar.mo48431g(8, zqVar.mo48428d() - 8, 1);
            return;
        }
        throw new vy4();
    }

    /* renamed from: f */
    public static void m66993f(C6014ll llVar, int i, C7512zq zqVar) throws vy4 {
        boolean z;
        int e = zqVar.mo48429e() - 1;
        int d = zqVar.mo48428d() - 1;
        int i2 = 0;
        int i3 = -1;
        while (e > 0) {
            if (e == 6) {
                e--;
            }
            while (d >= 0 && d < zqVar.mo48428d()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = e - i4;
                    if (m67002o(zqVar.mo48426b(i5, d))) {
                        if (i2 < llVar.mo39935l()) {
                            z = llVar.mo39930h(i2);
                            i2++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && yd2.m71684f(i, i5, d)) {
                            z = !z;
                        }
                        zqVar.mo48432h(i5, d, z);
                    }
                }
                d += i3;
            }
            i3 = -i3;
            d += i3;
            e -= 2;
        }
        if (i2 != llVar.mo39935l()) {
            throw new vy4("Not all bits consumed: " + i2 + '/' + llVar.mo39935l());
        }
    }

    /* renamed from: g */
    public static void m66994g(int i, int i2, C7512zq zqVar) throws vy4 {
        int i3 = 0;
        while (i3 < 8) {
            int i4 = i + i3;
            if (m67002o(zqVar.mo48426b(i4, i2))) {
                zqVar.mo48431g(i4, i2, 0);
                i3++;
            } else {
                throw new vy4();
            }
        }
    }

    /* renamed from: h */
    public static void m66995h(int i, int i2, C7512zq zqVar) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = f36092b[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                zqVar.mo48431g(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* renamed from: i */
    public static void m66996i(int i, int i2, C7512zq zqVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = f36090a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                zqVar.mo48431g(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* renamed from: j */
    public static void m66997j(C7512zq zqVar) throws vy4 {
        int length = f36090a[0].length;
        m66996i(0, 0, zqVar);
        m66996i(zqVar.mo48429e() - length, 0, zqVar);
        m66996i(0, zqVar.mo48429e() - length, zqVar);
        m66994g(0, 7, zqVar);
        m66994g(zqVar.mo48429e() - 8, 7, zqVar);
        m66994g(0, zqVar.mo48429e() - 8, zqVar);
        m67000m(7, 0, zqVar);
        m67000m((zqVar.mo48428d() - 7) - 1, 0, zqVar);
        m67000m(7, zqVar.mo48428d() - 7, zqVar);
    }

    /* renamed from: k */
    public static void m66998k(C7512zq zqVar) {
        int i = 8;
        while (i < zqVar.mo48429e() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (m67002o(zqVar.mo48426b(i, 6))) {
                zqVar.mo48431g(i, 6, i3);
            }
            if (m67002o(zqVar.mo48426b(6, i))) {
                zqVar.mo48431g(6, i, i3);
            }
            i = i2;
        }
    }

    /* renamed from: l */
    public static void m66999l(kv0 kv0, int i, C7512zq zqVar) throws vy4 {
        int i2;
        C6014ll llVar = new C6014ll();
        m67003p(kv0, i, llVar);
        for (int i3 = 0; i3 < llVar.mo39935l(); i3++) {
            boolean h = llVar.mo39930h((llVar.mo39935l() - 1) - i3);
            int[] iArr = f36095d[i3];
            zqVar.mo48432h(iArr[0], iArr[1], h);
            int i4 = 8;
            if (i3 < 8) {
                i4 = (zqVar.mo48429e() - i3) - 1;
                i2 = 8;
            } else {
                i2 = (zqVar.mo48428d() - 7) + (i3 - 8);
            }
            zqVar.mo48432h(i4, i2, h);
        }
    }

    /* renamed from: m */
    public static void m67000m(int i, int i2, C7512zq zqVar) throws vy4 {
        int i3 = 0;
        while (i3 < 7) {
            int i4 = i2 + i3;
            if (m67002o(zqVar.mo48426b(i, i4))) {
                zqVar.mo48431g(i, i4, 0);
                i3++;
            } else {
                throw new vy4();
            }
        }
    }

    /* renamed from: n */
    public static int m67001n(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: o */
    public static boolean m67002o(int i) {
        return i == -1;
    }

    /* renamed from: p */
    public static void m67003p(kv0 kv0, int i, C6014ll llVar) throws vy4 {
        if (t83.m65529f(i)) {
            int b = (kv0.mo39519b() << 3) | i;
            llVar.mo39923c(b, 5);
            llVar.mo39923c(m66989b(b, f36091b), 10);
            C6014ll llVar2 = new C6014ll();
            llVar2.mo39923c(21522, 15);
            llVar.mo39944u(llVar2);
            if (llVar.mo39935l() != 15) {
                throw new vy4("should not happen but we got: " + llVar.mo39935l());
            }
            return;
        }
        throw new vy4("Invalid mask pattern");
    }

    /* renamed from: q */
    public static void m67004q(ts4 ts4, C6014ll llVar) throws vy4 {
        llVar.mo39923c(ts4.mo45300j(), 6);
        llVar.mo39923c(m66989b(ts4.mo45300j(), f36089a), 12);
        if (llVar.mo39935l() != 18) {
            throw new vy4("should not happen but we got: " + llVar.mo39935l());
        }
    }

    /* renamed from: r */
    public static void m67005r(ts4 ts4, C7512zq zqVar) {
        if (ts4.mo45300j() >= 2) {
            int[] iArr = f36094c[ts4.mo45300j() - 1];
            for (int i : iArr) {
                if (i >= 0) {
                    for (int i2 : iArr) {
                        if (i2 >= 0 && m67002o(zqVar.mo48426b(i2, i))) {
                            m66995h(i2 - 2, i - 2, zqVar);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: s */
    public static void m67006s(ts4 ts4, C7512zq zqVar) throws vy4 {
        if (ts4.mo45300j() >= 7) {
            C6014ll llVar = new C6014ll();
            m67004q(ts4, llVar);
            int i = 17;
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    boolean h = llVar.mo39930h(i);
                    i--;
                    zqVar.mo48432h(i2, (zqVar.mo48428d() - 11) + i3, h);
                    zqVar.mo48432h((zqVar.mo48428d() - 11) + i3, i2, h);
                }
            }
        }
    }
}
