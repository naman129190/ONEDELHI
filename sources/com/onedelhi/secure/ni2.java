package com.onedelhi.secure;

import com.onedelhi.secure.mi2;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class ni2 extends l94 {

    /* renamed from: com.onedelhi.secure.ni2$a */
    public static final class C2981a extends C3841wj {
        /* renamed from: f */
        public C2981a mo21293f(int i, int i2, ByteBuffer byteBuffer) {
            mo26580b(i, i2, byteBuffer);
            return this;
        }

        /* renamed from: g */
        public ni2 mo21294g(int i) {
            return mo21295h(new ni2(), i);
        }

        /* renamed from: h */
        public ni2 mo21295h(ni2 ni2, int i) {
            return ni2.mo21291v(l94.m20356c(mo26579a(i), this.f22138a), this.f22138a);
        }
    }

    /* renamed from: A */
    public static void m22830A(o71 o71, int i) {
        o71.mo21804k(0, i, 0);
    }

    /* renamed from: B */
    public static int m22831B(o71 o71, int[] iArr) {
        o71.mo21801h0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            o71.mo21807n(iArr[length]);
        }
        return o71.mo21766E();
    }

    /* renamed from: C */
    public static int m22832C(o71 o71, int i, int i2, int i3) {
        o71.mo21799g0(3);
        m22843z(o71, i3);
        m22842y(o71, i2);
        m22830A(o71, i);
        return m22833D(o71);
    }

    /* renamed from: D */
    public static int m22833D(o71 o71) {
        return o71.mo21765D();
    }

    /* renamed from: E */
    public static void m22834E(o71 o71, int i) {
        o71.mo21767F(i);
    }

    /* renamed from: F */
    public static void m22835F(o71 o71, int i) {
        o71.mo21771J(i);
    }

    /* renamed from: G */
    public static ni2 m22836G(ByteBuffer byteBuffer) {
        return m22837H(byteBuffer, new ni2());
    }

    /* renamed from: H */
    public static ni2 m22837H(ByteBuffer byteBuffer, ni2 ni2) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return ni2.mo21291v(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: Q */
    public static void m22838Q(o71 o71, int i) {
        o71.mo21801h0(4, i, 4);
    }

    /* renamed from: R */
    public static void m22839R(o71 o71) {
        o71.mo21799g0(3);
    }

    /* renamed from: u */
    public static void m22840u() {
        j60.m18171a();
    }

    /* renamed from: y */
    public static void m22842y(o71 o71, int i) {
        o71.mo21808o(1, i, 0);
    }

    /* renamed from: z */
    public static void m22843z(o71 o71, int i) {
        o71.mo21808o(2, i, 0);
    }

    /* renamed from: I */
    public mi2 mo21282I(int i) {
        return mo21283J(new mi2(), i);
    }

    /* renamed from: J */
    public mi2 mo21283J(mi2 mi2, int i) {
        int d = mo19347d(6);
        if (d != 0) {
            return mi2.mo20414v(mo19346b(mo19352l(d) + (i * 4)), this.f15240a);
        }
        return null;
    }

    /* renamed from: K */
    public int mo21284K() {
        int d = mo19347d(6);
        if (d != 0) {
            return mo19355o(d);
        }
        return 0;
    }

    /* renamed from: L */
    public mi2.C2860a mo21285L() {
        return mo21286M(new mi2.C2860a());
    }

    /* renamed from: M */
    public mi2.C2860a mo21286M(mi2.C2860a aVar) {
        int d = mo19347d(6);
        if (d != 0) {
            return aVar.mo20416f(mo19352l(d), 4, this.f15240a);
        }
        return null;
    }

    /* renamed from: N */
    public String mo21287N() {
        int d = mo19347d(8);
        if (d != 0) {
            return mo19350h(d + this.f15238a);
        }
        return null;
    }

    /* renamed from: O */
    public ByteBuffer mo21288O() {
        return mo19353m(8, 1);
    }

    /* renamed from: P */
    public ByteBuffer mo21289P(ByteBuffer byteBuffer) {
        return mo19354n(byteBuffer, 8, 1);
    }

    /* renamed from: S */
    public int mo21290S() {
        int d = mo19347d(4);
        if (d != 0) {
            return this.f15240a.getInt(d + this.f15238a);
        }
        return 0;
    }

    /* renamed from: v */
    public ni2 mo21291v(int i, ByteBuffer byteBuffer) {
        mo21292w(i, byteBuffer);
        return this;
    }

    /* renamed from: w */
    public void mo21292w(int i, ByteBuffer byteBuffer) {
        mo19349g(i, byteBuffer);
    }
}
