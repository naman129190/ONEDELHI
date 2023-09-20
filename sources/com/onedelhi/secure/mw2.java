package com.onedelhi.secure;

import com.onedelhi.secure.o60;

public class mw2 {

    /* renamed from: a */
    public static final int f16394a = 0;

    /* renamed from: a */
    public static boolean[] f16395a = new boolean[3];

    /* renamed from: b */
    public static final int f16396b = 1;

    /* renamed from: c */
    public static final int f16397c = 2;

    /* renamed from: d */
    public static final int f16398d = 4;

    /* renamed from: e */
    public static final int f16399e = 8;

    /* renamed from: f */
    public static final int f16400f = 16;

    /* renamed from: g */
    public static final int f16401g = 32;

    /* renamed from: h */
    public static final int f16402h = 64;

    /* renamed from: i */
    public static final int f16403i = 128;

    /* renamed from: j */
    public static final int f16404j = 256;

    /* renamed from: k */
    public static final int f16405k = 512;

    /* renamed from: l */
    public static final int f16406l = 1024;

    /* renamed from: m */
    public static final int f16407m = 257;

    /* renamed from: n */
    public static final int f16408n = 0;

    /* renamed from: o */
    public static final int f16409o = 1;

    /* renamed from: p */
    public static final int f16410p = 2;

    /* renamed from: a */
    public static void m22046a(p60 p60, p32 p32, o60 o60) {
        o60.f17774c = -1;
        o60.f17780d = -1;
        o60.C3032b bVar = p60.f17760a[0];
        o60.C3032b bVar2 = o60.C3032b.WRAP_CONTENT;
        if (bVar != bVar2 && o60.f17760a[0] == o60.C3032b.MATCH_PARENT) {
            int i = o60.f17748a.f15920b;
            int m0 = p60.mo21723m0() - o60.f17775c.f15920b;
            m60 m60 = o60.f17748a;
            m60.f15917a = p32.mo22291u(m60);
            m60 m602 = o60.f17775c;
            m602.f15917a = p32.mo22291u(m602);
            p32.mo22276f(o60.f17748a.f15917a, i);
            p32.mo22276f(o60.f17775c.f15917a, m0);
            o60.f17774c = 2;
            o60.mo21618C1(i, m0);
        }
        if (p60.f17760a[1] != bVar2 && o60.f17760a[1] == o60.C3032b.MATCH_PARENT) {
            int i2 = o60.f17765b.f15920b;
            int D = p60.mo21619D() - o60.f17781d.f15920b;
            m60 m603 = o60.f17765b;
            m603.f15917a = p32.mo22291u(m603);
            m60 m604 = o60.f17781d;
            m604.f15917a = p32.mo22291u(m604);
            p32.mo22276f(o60.f17765b.f15917a, i2);
            p32.mo22276f(o60.f17781d.f15917a, D);
            if (o60.f17828x > 0 || o60.mo21720l0() == 8) {
                m60 m605 = o60.f17785e;
                m605.f15917a = p32.mo22291u(m605);
                p32.mo22276f(o60.f17785e.f15917a, o60.f17828x + i2);
            }
            o60.f17780d = 2;
            o60.mo21676X1(i2, D);
        }
    }

    /* renamed from: b */
    public static final boolean m22047b(int i, int i2) {
        return (i & i2) == i2;
    }
}
