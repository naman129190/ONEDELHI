package com.onedelhi.secure;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class mi2 extends l94 {

    /* renamed from: com.onedelhi.secure.mi2$a */
    public static final class C2860a extends C3841wj {
        /* renamed from: f */
        public C2860a mo20416f(int i, int i2, ByteBuffer byteBuffer) {
            mo26580b(i, i2, byteBuffer);
            return this;
        }

        /* renamed from: g */
        public mi2 mo20417g(int i) {
            return mo20418h(new mi2(), i);
        }

        /* renamed from: h */
        public mi2 mo20418h(mi2 mi2, int i) {
            return mi2.mo20414v(l94.m20356c(mo26579a(i), this.f22138a), this.f22138a);
        }
    }

    /* renamed from: A */
    public static void m21564A(o71 o71, boolean z) {
        o71.mo21788b(1, z, false);
    }

    /* renamed from: B */
    public static void m21565B(o71 o71, short s) {
        o71.mo21809p(5, s, 0);
    }

    /* renamed from: C */
    public static void m21566C(o71 o71, int i) {
        o71.mo21804k(0, i, 0);
    }

    /* renamed from: D */
    public static void m21567D(o71 o71, short s) {
        o71.mo21809p(2, s, 0);
    }

    /* renamed from: E */
    public static void m21568E(o71 o71, short s) {
        o71.mo21809p(4, s, 0);
    }

    /* renamed from: M */
    public static int m21569M(o71 o71, int[] iArr) {
        o71.mo21801h0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            o71.mo21803j(iArr[length]);
        }
        return o71.mo21766E();
    }

    /* renamed from: N */
    public static int m21570N(o71 o71, int i, boolean z, short s, short s2, short s3, short s4, int i2) {
        o71.mo21799g0(7);
        m21578y(o71, i2);
        m21566C(o71, i);
        m21565B(o71, s4);
        m21568E(o71, s3);
        m21579z(o71, s2);
        m21567D(o71, s);
        m21564A(o71, z);
        return m21571P(o71);
    }

    /* renamed from: P */
    public static int m21571P(o71 o71) {
        return o71.mo21765D();
    }

    /* renamed from: Q */
    public static mi2 m21572Q(ByteBuffer byteBuffer) {
        return m21573R(byteBuffer, new mi2());
    }

    /* renamed from: R */
    public static mi2 m21573R(ByteBuffer byteBuffer, mi2 mi2) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return mi2.mo20414v(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: V */
    public static void m21574V(o71 o71, int i) {
        o71.mo21801h0(4, i, 4);
    }

    /* renamed from: W */
    public static void m21575W(o71 o71) {
        o71.mo21799g0(7);
    }

    /* renamed from: u */
    public static void m21576u() {
        j60.m18171a();
    }

    /* renamed from: y */
    public static void m21578y(o71 o71, int i) {
        o71.mo21808o(6, i, 0);
    }

    /* renamed from: z */
    public static void m21579z(o71 o71, short s) {
        o71.mo21809p(3, s, 0);
    }

    /* renamed from: F */
    public int mo20402F(int i) {
        int d = mo19347d(16);
        if (d != 0) {
            return this.f15240a.getInt(mo19352l(d) + (i * 4));
        }
        return 0;
    }

    /* renamed from: G */
    public ByteBuffer mo20403G() {
        return mo19353m(16, 4);
    }

    /* renamed from: H */
    public ByteBuffer mo20404H(ByteBuffer byteBuffer) {
        return mo19354n(byteBuffer, 16, 4);
    }

    /* renamed from: I */
    public int mo20405I() {
        int d = mo19347d(16);
        if (d != 0) {
            return mo19355o(d);
        }
        return 0;
    }

    /* renamed from: J */
    public ls1 mo20406J() {
        return mo20407K(new ls1());
    }

    /* renamed from: K */
    public ls1 mo20407K(ls1 ls1) {
        int d = mo19347d(16);
        if (d != 0) {
            return ls1.mo19768f(mo19352l(d), this.f15240a);
        }
        return null;
    }

    /* renamed from: L */
    public short mo20408L() {
        int d = mo19347d(10);
        if (d != 0) {
            return this.f15240a.getShort(d + this.f15238a);
        }
        return 0;
    }

    /* renamed from: O */
    public boolean mo20409O() {
        int d = mo19347d(6);
        return (d == 0 || this.f15240a.get(d + this.f15238a) == 0) ? false : true;
    }

    /* renamed from: S */
    public short mo20410S() {
        int d = mo19347d(14);
        if (d != 0) {
            return this.f15240a.getShort(d + this.f15238a);
        }
        return 0;
    }

    /* renamed from: T */
    public int mo20411T() {
        int d = mo19347d(4);
        if (d != 0) {
            return this.f15240a.getInt(d + this.f15238a);
        }
        return 0;
    }

    /* renamed from: U */
    public short mo20412U() {
        int d = mo19347d(8);
        if (d != 0) {
            return this.f15240a.getShort(d + this.f15238a);
        }
        return 0;
    }

    /* renamed from: X */
    public short mo20413X() {
        int d = mo19347d(12);
        if (d != 0) {
            return this.f15240a.getShort(d + this.f15238a);
        }
        return 0;
    }

    /* renamed from: v */
    public mi2 mo20414v(int i, ByteBuffer byteBuffer) {
        mo20415w(i, byteBuffer);
        return this;
    }

    /* renamed from: w */
    public void mo20415w(int i, ByteBuffer byteBuffer) {
        mo19349g(i, byteBuffer);
    }
}
