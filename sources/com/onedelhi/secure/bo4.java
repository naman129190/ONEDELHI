package com.onedelhi.secure;

import com.onedelhi.secure.ty4;
import java.io.IOException;
import java.util.Arrays;

public final class bo4 {

    /* renamed from: a */
    public static final bo4 f26464a = new bo4(0, new int[0], new Object[0], false);

    /* renamed from: c */
    public static final int f26465c = 8;

    /* renamed from: a */
    public int f26466a;

    /* renamed from: a */
    public boolean f26467a;

    /* renamed from: a */
    public int[] f26468a;

    /* renamed from: a */
    public Object[] f26469a;

    /* renamed from: b */
    public int f26470b;

    public bo4() {
        this(0, new int[8], new Object[8], true);
    }

    public bo4(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f26470b = -1;
        this.f26466a = i;
        this.f26468a = iArr;
        this.f26469a = objArr;
        this.f26467a = z;
    }

    /* renamed from: c */
    public static bo4 m40221c() {
        return f26464a;
    }

    /* renamed from: f */
    public static int m40222f(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    /* renamed from: g */
    public static int m40223g(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    /* renamed from: m */
    public static bo4 m40224m(bo4 bo4, bo4 bo42) {
        int i = bo4.f26466a + bo42.f26466a;
        int[] copyOf = Arrays.copyOf(bo4.f26468a, i);
        System.arraycopy(bo42.f26468a, 0, copyOf, bo4.f26466a, bo42.f26466a);
        Object[] copyOf2 = Arrays.copyOf(bo4.f26469a, i);
        System.arraycopy(bo42.f26469a, 0, copyOf2, bo4.f26466a, bo42.f26466a);
        return new bo4(i, copyOf, copyOf2, true);
    }

    /* renamed from: n */
    public static bo4 m40225n() {
        return new bo4();
    }

    /* renamed from: o */
    public static boolean m40226o(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m40227r(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: u */
    public static void m40228u(int i, Object obj, ty4 ty4) throws IOException {
        int a = wx4.m69698a(i);
        int b = wx4.m69699b(i);
        if (b == 0) {
            ty4.mo38347h(a, ((Long) obj).longValue());
        } else if (b == 1) {
            ty4.mo38362w(a, ((Long) obj).longValue());
        } else if (b == 2) {
            ty4.mo38345f(a, (C5173er) obj);
        } else if (b != 3) {
            if (b == 5) {
                ty4.mo38351l(a, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(nt1.m58785f());
        } else if (ty4.mo38364y() == ty4.C6908a.ASCENDING) {
            ty4.mo38353n(a);
            ((bo4) obj).mo31974w(ty4);
            ty4.mo38344e(a);
        } else {
            ty4.mo38344e(a);
            ((bo4) obj).mo31974w(ty4);
            ty4.mo38353n(a);
        }
    }

    /* renamed from: a */
    public void mo31958a() {
        if (!this.f26467a) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final void mo31959b() {
        int i = this.f26466a;
        int[] iArr = this.f26468a;
        if (i == iArr.length) {
            int i2 = i + (i < 4 ? 8 : i >> 1);
            this.f26468a = Arrays.copyOf(iArr, i2);
            this.f26469a = Arrays.copyOf(this.f26469a, i2);
        }
    }

    /* renamed from: d */
    public int mo31960d() {
        int i;
        int i2 = this.f26470b;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f26466a; i4++) {
            int i5 = this.f26468a[i4];
            int a = wx4.m69698a(i5);
            int b = wx4.m69699b(i5);
            if (b == 0) {
                i = i00.m51416a1(a, ((Long) this.f26469a[i4]).longValue());
            } else if (b == 1) {
                i = i00.m51439o0(a, ((Long) this.f26469a[i4]).longValue());
            } else if (b == 2) {
                i = i00.m51425g0(a, (C5173er) this.f26469a[i4]);
            } else if (b == 3) {
                i = (i00.m51411X0(a) * 2) + ((bo4) this.f26469a[i4]).mo31960d();
            } else if (b == 5) {
                i = i00.m51435m0(a, ((Integer) this.f26469a[i4]).intValue());
            } else {
                throw new IllegalStateException(nt1.m58785f());
            }
            i3 += i;
        }
        this.f26470b = i3;
        return i3;
    }

    /* renamed from: e */
    public int mo31961e() {
        int i = this.f26470b;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f26466a; i3++) {
            i2 += i00.m51398K0(wx4.m69698a(this.f26468a[i3]), (C5173er) this.f26469a[i3]);
        }
        this.f26470b = i2;
        return i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bo4)) {
            return false;
        }
        bo4 bo4 = (bo4) obj;
        int i = this.f26466a;
        return i == bo4.f26466a && m40227r(this.f26468a, bo4.f26468a, i) && m40226o(this.f26469a, bo4.f26469a, this.f26466a);
    }

    /* renamed from: h */
    public void mo31963h() {
        this.f26467a = false;
    }

    public int hashCode() {
        int i = this.f26466a;
        return ((((527 + i) * 31) + m40222f(this.f26468a, i)) * 31) + m40223g(this.f26469a, this.f26466a);
    }

    /* renamed from: i */
    public boolean mo31965i(int i, g00 g00) throws IOException {
        mo31958a();
        int a = wx4.m69698a(i);
        int b = wx4.m69699b(i);
        if (b == 0) {
            mo31970q(i, Long.valueOf(g00.mo36417G()));
            return true;
        } else if (b == 1) {
            mo31970q(i, Long.valueOf(g00.mo36412B()));
            return true;
        } else if (b == 2) {
            mo31970q(i, g00.mo36459x());
            return true;
        } else if (b == 3) {
            bo4 bo4 = new bo4();
            bo4.mo31966j(g00);
            g00.mo36435a(wx4.m69700c(a, 4));
            mo31970q(i, bo4);
            return true;
        } else if (b == 4) {
            return false;
        } else {
            if (b == 5) {
                mo31970q(i, Integer.valueOf(g00.mo36411A()));
                return true;
            }
            throw nt1.m58785f();
        }
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: j */
    public final com.onedelhi.secure.bo4 mo31966j(com.onedelhi.secure.g00 r2) throws java.io.IOException {
        /*
            r1 = this;
        L_0x0000:
            int r0 = r2.mo36433Y()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.mo31965i(r0, r2)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.bo4.mo31966j(com.onedelhi.secure.g00):com.onedelhi.secure.bo4");
    }

    /* renamed from: k */
    public bo4 mo31967k(int i, C5173er erVar) {
        mo31958a();
        if (i != 0) {
            mo31970q(wx4.m69700c(i, 2), erVar);
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* renamed from: l */
    public bo4 mo31968l(int i, int i2) {
        mo31958a();
        if (i != 0) {
            mo31970q(wx4.m69700c(i, 0), Long.valueOf((long) i2));
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    /* renamed from: p */
    public final void mo31969p(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f26466a; i2++) {
            ai2.m38713c(sb, i, String.valueOf(wx4.m69698a(this.f26468a[i2])), this.f26469a[i2]);
        }
    }

    /* renamed from: q */
    public void mo31970q(int i, Object obj) {
        mo31958a();
        mo31959b();
        int[] iArr = this.f26468a;
        int i2 = this.f26466a;
        iArr[i2] = i;
        this.f26469a[i2] = obj;
        this.f26466a = i2 + 1;
    }

    /* renamed from: s */
    public void mo31971s(i00 i00) throws IOException {
        for (int i = 0; i < this.f26466a; i++) {
            i00.mo37760Y1(wx4.m69698a(this.f26468a[i]), (C5173er) this.f26469a[i]);
        }
    }

    /* renamed from: t */
    public void mo31972t(ty4 ty4) throws IOException {
        if (ty4.mo38364y() == ty4.C6908a.DESCENDING) {
            for (int i = this.f26466a - 1; i >= 0; i--) {
                ty4.mo38356q(wx4.m69698a(this.f26468a[i]), this.f26469a[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.f26466a; i2++) {
            ty4.mo38356q(wx4.m69698a(this.f26468a[i2]), this.f26469a[i2]);
        }
    }

    /* renamed from: v */
    public void mo31973v(i00 i00) throws IOException {
        for (int i = 0; i < this.f26466a; i++) {
            int i2 = this.f26468a[i];
            int a = wx4.m69698a(i2);
            int b = wx4.m69699b(i2);
            if (b == 0) {
                i00.mo37732A(a, ((Long) this.f26469a[i]).longValue());
            } else if (b == 1) {
                i00.mo37792w(a, ((Long) this.f26469a[i]).longValue());
            } else if (b == 2) {
                i00.mo37772f(a, (C5173er) this.f26469a[i]);
            } else if (b == 3) {
                i00.mo37776g2(a, 3);
                ((bo4) this.f26469a[i]).mo31973v(i00);
                i00.mo37776g2(a, 4);
            } else if (b == 5) {
                i00.mo37782l(a, ((Integer) this.f26469a[i]).intValue());
            } else {
                throw nt1.m58785f();
            }
        }
    }

    /* renamed from: w */
    public void mo31974w(ty4 ty4) throws IOException {
        if (this.f26466a != 0) {
            if (ty4.mo38364y() == ty4.C6908a.ASCENDING) {
                for (int i = 0; i < this.f26466a; i++) {
                    m40228u(this.f26468a[i], this.f26469a[i], ty4);
                }
                return;
            }
            for (int i2 = this.f26466a - 1; i2 >= 0; i2--) {
                m40228u(this.f26468a[i2], this.f26469a[i2], ty4);
            }
        }
    }
}
