package com.onedelhi.secure;

import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import easypay.appinvoke.manager.Constants;

public class m84 {

    /* renamed from: a */
    public static final m84[] f32055a;

    /* renamed from: b */
    public static m84[] f32056b;

    /* renamed from: a */
    public final int f32057a;

    /* renamed from: a */
    public final boolean f32058a;

    /* renamed from: b */
    public final int f32059b;

    /* renamed from: c */
    public final int f32060c;

    /* renamed from: d */
    public final int f32061d;

    /* renamed from: e */
    public final int f32062e;

    /* renamed from: f */
    public final int f32063f;

    /* renamed from: g */
    public final int f32064g;

    static {
        m84[] m84Arr = {new m84(false, 3, 5, 8, 8, 1), new m84(false, 5, 7, 10, 10, 1), new m84(true, 5, 7, 16, 6, 1), new m84(false, 8, 10, 12, 12, 1), new m84(true, 10, 11, 14, 6, 2), new m84(false, 12, 12, 14, 14, 1), new m84(true, 16, 14, 24, 10, 1), new m84(false, 18, 14, 16, 16, 1), new m84(false, 22, 18, 18, 18, 1), new m84(true, 22, 18, 16, 10, 2), new m84(false, 30, 20, 20, 20, 1), new m84(true, 32, 24, 16, 14, 2), new m84(false, 36, 24, 22, 22, 1), new m84(false, 44, 28, 24, 24, 1), new m84(true, 49, 28, 22, 14, 2), new m84(false, 62, 36, 14, 14, 4), new m84(false, 86, 42, 16, 16, 4), new m84(false, 114, 48, 18, 18, 4), new m84(false, 144, 56, 20, 20, 4), new m84(false, 174, 68, 22, 22, 4), new m84(false, 204, 84, 24, 24, 4, 102, 42), new m84(false, 280, 112, 14, 14, 16, 140, 56), new m84(false, 368, 144, 16, 16, 16, 92, 36), new m84(false, 456, 192, 18, 18, 16, 114, 48), new m84(false, 576, 224, 20, 20, 16, 144, 56), new m84(false, 696, u02.f35863B, 22, 22, 16, 174, 68), new m84(false, 816, 336, 24, 24, 16, 136, 56), new m84(false, C4715bz.f26578c, 408, 18, 18, 36, HideBottomViewOnScrollBehavior.f7732e, 68), new m84(false, 1304, 496, 20, 20, 36, Constants.ACTION_NB_RESEND_CLICKED, 62), new td0()};
        f32055a = m84Arr;
        f32056b = m84Arr;
    }

    public m84(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    public m84(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f32058a = z;
        this.f32057a = i;
        this.f32059b = i2;
        this.f32060c = i3;
        this.f32061d = i4;
        this.f32062e = i5;
        this.f32063f = i6;
        this.f32064g = i7;
    }

    /* renamed from: m */
    public static m84 m56969m(int i) {
        return m56972p(i, n84.FORCE_NONE, true);
    }

    /* renamed from: n */
    public static m84 m56970n(int i, n84 n84) {
        return m56972p(i, n84, true);
    }

    /* renamed from: o */
    public static m84 m56971o(int i, n84 n84, bl0 bl0, bl0 bl02, boolean z) {
        for (m84 m84 : f32056b) {
            if ((n84 != n84.FORCE_SQUARE || !m84.f32058a) && ((n84 != n84.FORCE_RECTANGLE || m84.f32058a) && ((bl0 == null || (m84.mo40520k() >= bl0.mo31917b() && m84.mo40519j() >= bl0.mo31916a())) && ((bl02 == null || (m84.mo40520k() <= bl02.mo31917b() && m84.mo40519j() <= bl02.mo31916a())) && i <= m84.f32057a)))) {
                return m84;
            }
        }
        if (!z) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
    }

    /* renamed from: p */
    public static m84 m56972p(int i, n84 n84, boolean z) {
        return m56971o(i, n84, (bl0) null, (bl0) null, z);
    }

    /* renamed from: q */
    public static m84 m56973q(int i, boolean z, boolean z2) {
        return m56972p(i, z ? n84.FORCE_NONE : n84.FORCE_SQUARE, z2);
    }

    /* renamed from: r */
    public static void m56974r(m84[] m84Arr) {
        f32056b = m84Arr;
    }

    /* renamed from: a */
    public int mo40510a() {
        return this.f32057a + this.f32059b;
    }

    /* renamed from: b */
    public final int mo40511b() {
        return this.f32057a;
    }

    /* renamed from: c */
    public int mo40512c(int i) {
        return this.f32063f;
    }

    /* renamed from: d */
    public final int mo40513d() {
        return this.f32059b;
    }

    /* renamed from: e */
    public final int mo40514e(int i) {
        return this.f32064g;
    }

    /* renamed from: f */
    public final int mo40515f() {
        int i = this.f32062e;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (!(i == 2 || i == 4)) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i2;
    }

    /* renamed from: g */
    public int mo40516g() {
        return this.f32057a / this.f32063f;
    }

    /* renamed from: h */
    public final int mo40517h() {
        return mo40521l() * this.f32061d;
    }

    /* renamed from: i */
    public final int mo40518i() {
        return mo40515f() * this.f32060c;
    }

    /* renamed from: j */
    public final int mo40519j() {
        return mo40517h() + (mo40521l() << 1);
    }

    /* renamed from: k */
    public final int mo40520k() {
        return mo40518i() + (mo40515f() << 1);
    }

    /* renamed from: l */
    public final int mo40521l() {
        int i = this.f32062e;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f32058a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.f32060c);
        sb.append('x');
        sb.append(this.f32061d);
        sb.append(", symbol size ");
        sb.append(mo40520k());
        sb.append('x');
        sb.append(mo40519j());
        sb.append(", symbol data size ");
        sb.append(mo40518i());
        sb.append('x');
        sb.append(mo40517h());
        sb.append(", codewords ");
        sb.append(this.f32057a);
        sb.append('+');
        sb.append(this.f32059b);
        return sb.toString();
    }
}
