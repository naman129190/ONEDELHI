package com.onedelhi.secure;

import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import easypay.appinvoke.manager.Constants;

public final class ss4 {

    /* renamed from: a */
    public static final ss4[] f35175a = m64850a();

    /* renamed from: a */
    public final int f35176a;

    /* renamed from: a */
    public final C6791c f35177a;

    /* renamed from: b */
    public final int f35178b;

    /* renamed from: c */
    public final int f35179c;

    /* renamed from: d */
    public final int f35180d;

    /* renamed from: e */
    public final int f35181e;

    /* renamed from: f */
    public final int f35182f;

    /* renamed from: com.onedelhi.secure.ss4$b */
    public static final class C6790b {

        /* renamed from: a */
        public final int f35183a;

        /* renamed from: b */
        public final int f35184b;

        public C6790b(int i, int i2) {
            this.f35183a = i;
            this.f35184b = i2;
        }

        /* renamed from: a */
        public int mo44536a() {
            return this.f35183a;
        }

        /* renamed from: b */
        public int mo44537b() {
            return this.f35184b;
        }
    }

    /* renamed from: com.onedelhi.secure.ss4$c */
    public static final class C6791c {

        /* renamed from: a */
        public final int f35185a;

        /* renamed from: a */
        public final C6790b[] f35186a;

        public C6791c(int i, C6790b bVar) {
            this.f35185a = i;
            this.f35186a = new C6790b[]{bVar};
        }

        public C6791c(int i, C6790b bVar, C6790b bVar2) {
            this.f35185a = i;
            this.f35186a = new C6790b[]{bVar, bVar2};
        }

        /* renamed from: a */
        public C6790b[] mo44538a() {
            return this.f35186a;
        }

        /* renamed from: b */
        public int mo44539b() {
            return this.f35185a;
        }
    }

    public ss4(int i, int i2, int i3, int i4, int i5, C6791c cVar) {
        this.f35176a = i;
        this.f35178b = i2;
        this.f35179c = i3;
        this.f35180d = i4;
        this.f35181e = i5;
        this.f35177a = cVar;
        int b = cVar.mo44539b();
        int i6 = 0;
        for (C6790b bVar : cVar.mo44538a()) {
            i6 += bVar.mo44536a() * (bVar.mo44537b() + b);
        }
        this.f35182f = i6;
    }

    /* renamed from: a */
    public static ss4[] m64850a() {
        return new ss4[]{new ss4(1, 10, 10, 8, 8, new C6791c(5, new C6790b(1, 3))), new ss4(2, 12, 12, 10, 10, new C6791c(7, new C6790b(1, 5))), new ss4(3, 14, 14, 12, 12, new C6791c(10, new C6790b(1, 8))), new ss4(4, 16, 16, 14, 14, new C6791c(12, new C6790b(1, 12))), new ss4(5, 18, 18, 16, 16, new C6791c(14, new C6790b(1, 18))), new ss4(6, 20, 20, 18, 18, new C6791c(18, new C6790b(1, 22))), new ss4(7, 22, 22, 20, 20, new C6791c(20, new C6790b(1, 30))), new ss4(8, 24, 24, 22, 22, new C6791c(24, new C6790b(1, 36))), new ss4(9, 26, 26, 24, 24, new C6791c(28, new C6790b(1, 44))), new ss4(10, 32, 32, 14, 14, new C6791c(36, new C6790b(1, 62))), new ss4(11, 36, 36, 16, 16, new C6791c(42, new C6790b(1, 86))), new ss4(12, 40, 40, 18, 18, new C6791c(48, new C6790b(1, 114))), new ss4(13, 44, 44, 20, 20, new C6791c(56, new C6790b(1, 144))), new ss4(14, 48, 48, 22, 22, new C6791c(68, new C6790b(1, 174))), new ss4(15, 52, 52, 24, 24, new C6791c(42, new C6790b(2, 102))), new ss4(16, 64, 64, 14, 14, new C6791c(56, new C6790b(2, 140))), new ss4(17, 72, 72, 16, 16, new C6791c(36, new C6790b(4, 92))), new ss4(18, 80, 80, 18, 18, new C6791c(48, new C6790b(4, 114))), new ss4(19, 88, 88, 20, 20, new C6791c(56, new C6790b(4, 144))), new ss4(20, 96, 96, 22, 22, new C6791c(68, new C6790b(4, 174))), new ss4(21, 104, 104, 24, 24, new C6791c(56, new C6790b(6, 136))), new ss4(22, 120, 120, 18, 18, new C6791c(68, new C6790b(6, HideBottomViewOnScrollBehavior.f7732e))), new ss4(23, 132, 132, 20, 20, new C6791c(62, new C6790b(8, Constants.ACTION_NB_RESEND_CLICKED))), new ss4(24, 144, 144, 22, 22, new C6791c(62, new C6790b(8, Constants.ACTION_DELAY_PASSWORD_FOUND), new C6790b(2, 155))), new ss4(25, 8, 18, 6, 16, new C6791c(7, new C6790b(1, 5))), new ss4(26, 8, 32, 6, 14, new C6791c(11, new C6790b(1, 10))), new ss4(27, 12, 26, 10, 24, new C6791c(14, new C6790b(1, 16))), new ss4(28, 12, 36, 10, 16, new C6791c(18, new C6790b(1, 22))), new ss4(29, 16, 36, 14, 16, new C6791c(24, new C6790b(1, 32))), new ss4(30, 16, 48, 14, 22, new C6791c(28, new C6790b(1, 49)))};
    }

    /* renamed from: h */
    public static ss4 m64851h(int i, int i2) throws ha1 {
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            for (ss4 ss4 : f35175a) {
                if (ss4.f35178b == i && ss4.f35179c == i2) {
                    return ss4;
                }
            }
            throw ha1.m50341a();
        }
        throw ha1.m50341a();
    }

    /* renamed from: b */
    public int mo44528b() {
        return this.f35181e;
    }

    /* renamed from: c */
    public int mo44529c() {
        return this.f35180d;
    }

    /* renamed from: d */
    public C6791c mo44530d() {
        return this.f35177a;
    }

    /* renamed from: e */
    public int mo44531e() {
        return this.f35179c;
    }

    /* renamed from: f */
    public int mo44532f() {
        return this.f35178b;
    }

    /* renamed from: g */
    public int mo44533g() {
        return this.f35182f;
    }

    /* renamed from: i */
    public int mo44534i() {
        return this.f35176a;
    }

    public String toString() {
        return String.valueOf(this.f35176a);
    }
}
