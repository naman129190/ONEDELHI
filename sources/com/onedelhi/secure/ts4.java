package com.onedelhi.secure;

import easypay.appinvoke.manager.Constants;

public final class ts4 {

    /* renamed from: a */
    public static final ts4[] f35774a = m66183b();

    /* renamed from: b */
    public static final int[] f35775b = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: a */
    public final int f35776a;

    /* renamed from: a */
    public final int[] f35777a;

    /* renamed from: a */
    public final C6897b[] f35778a;

    /* renamed from: b */
    public final int f35779b;

    /* renamed from: com.onedelhi.secure.ts4$a */
    public static final class C6896a {

        /* renamed from: a */
        public final int f35780a;

        /* renamed from: b */
        public final int f35781b;

        public C6896a(int i, int i2) {
            this.f35780a = i;
            this.f35781b = i2;
        }

        /* renamed from: a */
        public int mo45302a() {
            return this.f35780a;
        }

        /* renamed from: b */
        public int mo45303b() {
            return this.f35781b;
        }
    }

    /* renamed from: com.onedelhi.secure.ts4$b */
    public static final class C6897b {

        /* renamed from: a */
        public final int f35782a;

        /* renamed from: a */
        public final C6896a[] f35783a;

        public C6897b(int i, C6896a... aVarArr) {
            this.f35782a = i;
            this.f35783a = aVarArr;
        }

        /* renamed from: a */
        public C6896a[] mo45304a() {
            return this.f35783a;
        }

        /* renamed from: b */
        public int mo45305b() {
            return this.f35782a;
        }

        /* renamed from: c */
        public int mo45306c() {
            int i = 0;
            for (C6896a a : this.f35783a) {
                i += a.mo45302a();
            }
            return i;
        }

        /* renamed from: d */
        public int mo45307d() {
            return this.f35782a * mo45306c();
        }
    }

    public ts4(int i, int[] iArr, C6897b... bVarArr) {
        this.f35776a = i;
        this.f35777a = iArr;
        this.f35778a = bVarArr;
        int b = bVarArr[0].mo45305b();
        int i2 = 0;
        for (C6896a aVar : bVarArr[0].mo45304a()) {
            i2 += aVar.mo45302a() * (aVar.mo45303b() + b);
        }
        this.f35779b = i2;
    }

    /* renamed from: b */
    public static ts4[] m66183b() {
        return new ts4[]{new ts4(1, new int[0], new C6897b(7, new C6896a(1, 19)), new C6897b(10, new C6896a(1, 16)), new C6897b(13, new C6896a(1, 13)), new C6897b(17, new C6896a(1, 9))), new ts4(2, new int[]{6, 18}, new C6897b(10, new C6896a(1, 34)), new C6897b(16, new C6896a(1, 28)), new C6897b(22, new C6896a(1, 22)), new C6897b(28, new C6896a(1, 16))), new ts4(3, new int[]{6, 22}, new C6897b(15, new C6896a(1, 55)), new C6897b(26, new C6896a(1, 44)), new C6897b(18, new C6896a(2, 17)), new C6897b(22, new C6896a(2, 13))), new ts4(4, new int[]{6, 26}, new C6897b(20, new C6896a(1, 80)), new C6897b(18, new C6896a(2, 32)), new C6897b(26, new C6896a(2, 24)), new C6897b(16, new C6896a(4, 9))), new ts4(5, new int[]{6, 30}, new C6897b(26, new C6896a(1, 108)), new C6897b(24, new C6896a(2, 43)), new C6897b(18, new C6896a(2, 15), new C6896a(2, 16)), new C6897b(22, new C6896a(2, 11), new C6896a(2, 12))), new ts4(6, new int[]{6, 34}, new C6897b(18, new C6896a(2, 68)), new C6897b(16, new C6896a(4, 27)), new C6897b(24, new C6896a(4, 19)), new C6897b(28, new C6896a(4, 15))), new ts4(7, new int[]{6, 22, 38}, new C6897b(20, new C6896a(2, 78)), new C6897b(18, new C6896a(4, 31)), new C6897b(18, new C6896a(2, 14), new C6896a(4, 15)), new C6897b(26, new C6896a(4, 13), new C6896a(1, 14))), new ts4(8, new int[]{6, 24, 42}, new C6897b(24, new C6896a(2, 97)), new C6897b(22, new C6896a(2, 38), new C6896a(2, 39)), new C6897b(22, new C6896a(4, 18), new C6896a(2, 19)), new C6897b(26, new C6896a(4, 14), new C6896a(2, 15))), new ts4(9, new int[]{6, 26, 46}, new C6897b(30, new C6896a(2, 116)), new C6897b(22, new C6896a(3, 36), new C6896a(2, 37)), new C6897b(20, new C6896a(4, 16), new C6896a(4, 17)), new C6897b(24, new C6896a(4, 12), new C6896a(4, 13))), new ts4(10, new int[]{6, 28, 50}, new C6897b(18, new C6896a(2, 68), new C6896a(2, 69)), new C6897b(26, new C6896a(4, 43), new C6896a(1, 44)), new C6897b(24, new C6896a(6, 19), new C6896a(2, 20)), new C6897b(28, new C6896a(6, 15), new C6896a(2, 16))), new ts4(11, new int[]{6, 30, 54}, new C6897b(20, new C6896a(4, 81)), new C6897b(30, new C6896a(1, 50), new C6896a(4, 51)), new C6897b(28, new C6896a(4, 22), new C6896a(4, 23)), new C6897b(24, new C6896a(3, 12), new C6896a(8, 13))), new ts4(12, new int[]{6, 32, 58}, new C6897b(24, new C6896a(2, 92), new C6896a(2, 93)), new C6897b(22, new C6896a(6, 36), new C6896a(2, 37)), new C6897b(26, new C6896a(4, 20), new C6896a(6, 21)), new C6897b(28, new C6896a(7, 14), new C6896a(4, 15))), new ts4(13, new int[]{6, 34, 62}, new C6897b(26, new C6896a(4, 107)), new C6897b(22, new C6896a(8, 37), new C6896a(1, 38)), new C6897b(24, new C6896a(8, 20), new C6896a(4, 21)), new C6897b(22, new C6896a(12, 11), new C6896a(4, 12))), new ts4(14, new int[]{6, 26, 46, 66}, new C6897b(30, new C6896a(3, 115), new C6896a(1, 116)), new C6897b(24, new C6896a(4, 40), new C6896a(5, 41)), new C6897b(20, new C6896a(11, 16), new C6896a(5, 17)), new C6897b(24, new C6896a(11, 12), new C6896a(5, 13))), new ts4(15, new int[]{6, 26, 48, 70}, new C6897b(22, new C6896a(5, 87), new C6896a(1, 88)), new C6897b(24, new C6896a(5, 41), new C6896a(5, 42)), new C6897b(30, new C6896a(5, 24), new C6896a(7, 25)), new C6897b(24, new C6896a(11, 12), new C6896a(7, 13))), new ts4(16, new int[]{6, 26, 50, 74}, new C6897b(24, new C6896a(5, 98), new C6896a(1, 99)), new C6897b(28, new C6896a(7, 45), new C6896a(3, 46)), new C6897b(24, new C6896a(15, 19), new C6896a(2, 20)), new C6897b(30, new C6896a(3, 15), new C6896a(13, 16))), new ts4(17, new int[]{6, 30, 54, 78}, new C6897b(28, new C6896a(1, 107), new C6896a(5, 108)), new C6897b(28, new C6896a(10, 46), new C6896a(1, 47)), new C6897b(28, new C6896a(1, 22), new C6896a(15, 23)), new C6897b(28, new C6896a(2, 14), new C6896a(17, 15))), new ts4(18, new int[]{6, 30, 56, 82}, new C6897b(30, new C6896a(5, 120), new C6896a(1, 121)), new C6897b(26, new C6896a(9, 43), new C6896a(4, 44)), new C6897b(28, new C6896a(17, 22), new C6896a(1, 23)), new C6897b(28, new C6896a(2, 14), new C6896a(19, 15))), new ts4(19, new int[]{6, 30, 58, 86}, new C6897b(28, new C6896a(3, 113), new C6896a(4, 114)), new C6897b(26, new C6896a(3, 44), new C6896a(11, 45)), new C6897b(26, new C6896a(17, 21), new C6896a(4, 22)), new C6897b(26, new C6896a(9, 13), new C6896a(16, 14))), new ts4(20, new int[]{6, 34, 62, 90}, new C6897b(28, new C6896a(3, 107), new C6896a(5, 108)), new C6897b(26, new C6896a(3, 41), new C6896a(13, 42)), new C6897b(30, new C6896a(15, 24), new C6896a(5, 25)), new C6897b(28, new C6896a(15, 15), new C6896a(10, 16))), new ts4(21, new int[]{6, 28, 50, 72, 94}, new C6897b(28, new C6896a(4, 116), new C6896a(4, 117)), new C6897b(26, new C6896a(17, 42)), new C6897b(28, new C6896a(17, 22), new C6896a(6, 23)), new C6897b(30, new C6896a(19, 16), new C6896a(6, 17))), new ts4(22, new int[]{6, 26, 50, 74, 98}, new C6897b(28, new C6896a(2, 111), new C6896a(7, 112)), new C6897b(28, new C6896a(17, 46)), new C6897b(30, new C6896a(7, 24), new C6896a(16, 25)), new C6897b(24, new C6896a(34, 13))), new ts4(23, new int[]{6, 30, 54, 78, 102}, new C6897b(30, new C6896a(4, 121), new C6896a(5, 122)), new C6897b(28, new C6896a(4, 47), new C6896a(14, 48)), new C6897b(30, new C6896a(11, 24), new C6896a(14, 25)), new C6897b(30, new C6896a(16, 15), new C6896a(14, 16))), new ts4(24, new int[]{6, 28, 54, 80, 106}, new C6897b(30, new C6896a(6, 117), new C6896a(4, 118)), new C6897b(28, new C6896a(6, 45), new C6896a(14, 46)), new C6897b(30, new C6896a(11, 24), new C6896a(16, 25)), new C6897b(30, new C6896a(30, 16), new C6896a(2, 17))), new ts4(25, new int[]{6, 32, 58, 84, 110}, new C6897b(26, new C6896a(8, 106), new C6896a(4, 107)), new C6897b(28, new C6896a(8, 47), new C6896a(13, 48)), new C6897b(30, new C6896a(7, 24), new C6896a(22, 25)), new C6897b(30, new C6896a(22, 15), new C6896a(13, 16))), new ts4(26, new int[]{6, 30, 58, 86, 114}, new C6897b(28, new C6896a(10, 114), new C6896a(2, 115)), new C6897b(28, new C6896a(19, 46), new C6896a(4, 47)), new C6897b(28, new C6896a(28, 22), new C6896a(6, 23)), new C6897b(30, new C6896a(33, 16), new C6896a(4, 17))), new ts4(27, new int[]{6, 34, 62, 90, 118}, new C6897b(30, new C6896a(8, 122), new C6896a(4, 123)), new C6897b(28, new C6896a(22, 45), new C6896a(3, 46)), new C6897b(30, new C6896a(8, 23), new C6896a(26, 24)), new C6897b(30, new C6896a(12, 15), new C6896a(28, 16))), new ts4(28, new int[]{6, 26, 50, 74, 98, 122}, new C6897b(30, new C6896a(3, 117), new C6896a(10, 118)), new C6897b(28, new C6896a(3, 45), new C6896a(23, 46)), new C6897b(30, new C6896a(4, 24), new C6896a(31, 25)), new C6897b(30, new C6896a(11, 15), new C6896a(31, 16))), new ts4(29, new int[]{6, 30, 54, 78, 102, 126}, new C6897b(30, new C6896a(7, 116), new C6896a(7, 117)), new C6897b(28, new C6896a(21, 45), new C6896a(7, 46)), new C6897b(30, new C6896a(1, 23), new C6896a(37, 24)), new C6897b(30, new C6896a(19, 15), new C6896a(26, 16))), new ts4(30, new int[]{6, 26, 52, 78, 104, 130}, new C6897b(30, new C6896a(5, 115), new C6896a(10, 116)), new C6897b(28, new C6896a(19, 47), new C6896a(10, 48)), new C6897b(30, new C6896a(15, 24), new C6896a(25, 25)), new C6897b(30, new C6896a(23, 15), new C6896a(25, 16))), new ts4(31, new int[]{6, 30, 56, 82, 108, 134}, new C6897b(30, new C6896a(13, 115), new C6896a(3, 116)), new C6897b(28, new C6896a(2, 46), new C6896a(29, 47)), new C6897b(30, new C6896a(42, 24), new C6896a(1, 25)), new C6897b(30, new C6896a(23, 15), new C6896a(28, 16))), new ts4(32, new int[]{6, 34, 60, 86, 112, 138}, new C6897b(30, new C6896a(17, 115)), new C6897b(28, new C6896a(10, 46), new C6896a(23, 47)), new C6897b(30, new C6896a(10, 24), new C6896a(35, 25)), new C6897b(30, new C6896a(19, 15), new C6896a(35, 16))), new ts4(33, new int[]{6, 30, 58, 86, 114, 142}, new C6897b(30, new C6896a(17, 115), new C6896a(1, 116)), new C6897b(28, new C6896a(14, 46), new C6896a(21, 47)), new C6897b(30, new C6896a(29, 24), new C6896a(19, 25)), new C6897b(30, new C6896a(11, 15), new C6896a(46, 16))), new ts4(34, new int[]{6, 34, 62, 90, 118, 146}, new C6897b(30, new C6896a(13, 115), new C6896a(6, 116)), new C6897b(28, new C6896a(14, 46), new C6896a(23, 47)), new C6897b(30, new C6896a(44, 24), new C6896a(7, 25)), new C6897b(30, new C6896a(59, 16), new C6896a(1, 17))), new ts4(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new C6897b(30, new C6896a(12, 121), new C6896a(7, 122)), new C6897b(28, new C6896a(12, 47), new C6896a(26, 48)), new C6897b(30, new C6896a(39, 24), new C6896a(14, 25)), new C6897b(30, new C6896a(22, 15), new C6896a(41, 16))), new ts4(36, new int[]{6, 24, 50, 76, 102, 128, Constants.ACTION_PASSWORD_FOUND}, new C6897b(30, new C6896a(6, 121), new C6896a(14, 122)), new C6897b(28, new C6896a(6, 47), new C6896a(34, 48)), new C6897b(30, new C6896a(46, 24), new C6896a(10, 25)), new C6897b(30, new C6896a(2, 15), new C6896a(64, 16))), new ts4(37, new int[]{6, 28, 54, 80, 106, 132, Constants.ACTION_INCORRECT_OTP}, new C6897b(30, new C6896a(17, 122), new C6896a(4, 123)), new C6897b(28, new C6896a(29, 46), new C6896a(14, 47)), new C6897b(30, new C6896a(49, 24), new C6896a(10, 25)), new C6897b(30, new C6896a(24, 15), new C6896a(46, 16))), new ts4(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new C6897b(30, new C6896a(4, 122), new C6896a(18, 123)), new C6897b(28, new C6896a(13, 46), new C6896a(32, 47)), new C6897b(30, new C6896a(48, 24), new C6896a(14, 25)), new C6897b(30, new C6896a(42, 15), new C6896a(32, 16))), new ts4(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new C6897b(30, new C6896a(20, 117), new C6896a(4, 118)), new C6897b(28, new C6896a(40, 47), new C6896a(7, 48)), new C6897b(30, new C6896a(43, 24), new C6896a(22, 25)), new C6897b(30, new C6896a(10, 15), new C6896a(67, 16))), new ts4(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new C6897b(30, new C6896a(19, 118), new C6896a(6, 119)), new C6897b(28, new C6896a(18, 47), new C6896a(31, 48)), new C6897b(30, new C6896a(34, 24), new C6896a(34, 25)), new C6897b(30, new C6896a(20, 15), new C6896a(61, 16)))};
    }

    /* renamed from: c */
    public static ts4 m66184c(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        while (true) {
            int[] iArr = f35775b;
            if (i2 < iArr.length) {
                int i5 = iArr[i2];
                if (i5 == i) {
                    return m66186i(i2 + 7);
                }
                int e = ia1.m51967e(i, i5);
                if (e < i4) {
                    i3 = i2 + 7;
                    i4 = e;
                }
                i2++;
            } else if (i4 <= 3) {
                return m66186i(i3);
            } else {
                return null;
            }
        }
    }

    /* renamed from: g */
    public static ts4 m66185g(int i) throws ha1 {
        if (i % 4 == 1) {
            try {
                return m66186i((i - 17) / 4);
            } catch (IllegalArgumentException unused) {
                throw ha1.m50341a();
            }
        } else {
            throw ha1.m50341a();
        }
    }

    /* renamed from: i */
    public static ts4 m66186i(int i) {
        if (i > 0 && i <= 40) {
            return f35774a[i - 1];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public C6190nl mo45295a() {
        int e = mo45297e();
        C6190nl nlVar = new C6190nl(e);
        nlVar.mo41097q(0, 0, 9, 9);
        int i = e - 8;
        nlVar.mo41097q(i, 0, 8, 9);
        nlVar.mo41097q(0, i, 9, 8);
        int length = this.f35777a.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.f35777a[i2] - 2;
            for (int i4 = 0; i4 < length; i4++) {
                if (!((i2 == 0 && (i4 == 0 || i4 == length - 1)) || (i2 == length - 1 && i4 == 0))) {
                    nlVar.mo41097q(this.f35777a[i4] - 2, i3, 5, 5);
                }
            }
        }
        int i5 = e - 17;
        nlVar.mo41097q(6, 9, 1, i5);
        nlVar.mo41097q(9, 6, i5, 1);
        if (this.f35776a > 6) {
            int i6 = e - 11;
            nlVar.mo41097q(i6, 0, 3, 6);
            nlVar.mo41097q(0, i6, 6, 3);
        }
        return nlVar;
    }

    /* renamed from: d */
    public int[] mo45296d() {
        return this.f35777a;
    }

    /* renamed from: e */
    public int mo45297e() {
        return (this.f35776a * 4) + 17;
    }

    /* renamed from: f */
    public C6897b mo45298f(kv0 kv0) {
        return this.f35778a[kv0.ordinal()];
    }

    /* renamed from: h */
    public int mo45299h() {
        return this.f35779b;
    }

    /* renamed from: j */
    public int mo45300j() {
        return this.f35776a;
    }

    public String toString() {
        return String.valueOf(this.f35776a);
    }
}
