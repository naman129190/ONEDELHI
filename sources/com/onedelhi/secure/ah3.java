package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Collections;

public class ah3 {

    /* renamed from: a */
    public static final bh3 f25850a;

    /* renamed from: a */
    public static final String f25851a = " (Kotlin reflection is not available)";

    /* renamed from: a */
    public static final hx1[] f25852a = new hx1[0];

    static {
        bh3 bh3 = null;
        try {
            bh3 = (bh3) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (bh3 == null) {
            bh3 = new bh3();
        }
        f25850a = bh3;
    }

    @gz3(version = "1.4")
    /* renamed from: A */
    public static ey1 m38672A(kx1 kx1) {
        return f25850a.mo31740s(kx1, Collections.emptyList(), false);
    }

    @gz3(version = "1.4")
    /* renamed from: B */
    public static ey1 m38673B(Class cls) {
        return f25850a.mo31740s(m38681d(cls), Collections.emptyList(), false);
    }

    @gz3(version = "1.4")
    /* renamed from: C */
    public static ey1 m38674C(Class cls, hy1 hy1) {
        return f25850a.mo31740s(m38681d(cls), Collections.singletonList(hy1), false);
    }

    @gz3(version = "1.4")
    /* renamed from: D */
    public static ey1 m38675D(Class cls, hy1 hy1, hy1 hy12) {
        return f25850a.mo31740s(m38681d(cls), Arrays.asList(new hy1[]{hy1, hy12}), false);
    }

    @gz3(version = "1.4")
    /* renamed from: E */
    public static ey1 m38676E(Class cls, hy1... hy1Arr) {
        return f25850a.mo31740s(m38681d(cls), C4478ab.m37236iz(hy1Arr), false);
    }

    @gz3(version = "1.4")
    /* renamed from: F */
    public static gy1 m38677F(Object obj, String str, iy1 iy1, boolean z) {
        return f25850a.mo31741t(obj, str, iy1, z);
    }

    /* renamed from: a */
    public static hx1 m38678a(Class cls) {
        return f25850a.mo31722a(cls);
    }

    /* renamed from: b */
    public static hx1 m38679b(Class cls, String str) {
        return f25850a.mo31723b(cls, str);
    }

    /* renamed from: c */
    public static mx1 m38680c(gd1 gd1) {
        return f25850a.mo31724c(gd1);
    }

    /* renamed from: d */
    public static hx1 m38681d(Class cls) {
        return f25850a.mo31725d(cls);
    }

    /* renamed from: e */
    public static hx1 m38682e(Class cls, String str) {
        return f25850a.mo31726e(cls, str);
    }

    /* renamed from: f */
    public static hx1[] m38683f(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return f25852a;
        }
        hx1[] hx1Arr = new hx1[length];
        for (int i = 0; i < length; i++) {
            hx1Arr[i] = m38681d(clsArr[i]);
        }
        return hx1Arr;
    }

    @gz3(version = "1.4")
    /* renamed from: g */
    public static lx1 m38684g(Class cls) {
        return f25850a.mo31727f(cls, "");
    }

    /* renamed from: h */
    public static lx1 m38685h(Class cls, String str) {
        return f25850a.mo31727f(cls, str);
    }

    @gz3(version = "1.6")
    /* renamed from: i */
    public static ey1 m38686i(ey1 ey1) {
        return f25850a.mo31728g(ey1);
    }

    /* renamed from: j */
    public static vx1 m38687j(qm2 qm2) {
        return f25850a.mo31729h(qm2);
    }

    /* renamed from: k */
    public static wx1 m38688k(sm2 sm2) {
        return f25850a.mo31730i(sm2);
    }

    /* renamed from: l */
    public static xx1 m38689l(um2 um2) {
        return f25850a.mo31731j(um2);
    }

    @gz3(version = "1.6")
    /* renamed from: m */
    public static ey1 m38690m(ey1 ey1) {
        return f25850a.mo31732k(ey1);
    }

    @gz3(version = "1.4")
    /* renamed from: n */
    public static ey1 m38691n(kx1 kx1) {
        return f25850a.mo31740s(kx1, Collections.emptyList(), true);
    }

    @gz3(version = "1.4")
    /* renamed from: o */
    public static ey1 m38692o(Class cls) {
        return f25850a.mo31740s(m38681d(cls), Collections.emptyList(), true);
    }

    @gz3(version = "1.4")
    /* renamed from: p */
    public static ey1 m38693p(Class cls, hy1 hy1) {
        return f25850a.mo31740s(m38681d(cls), Collections.singletonList(hy1), true);
    }

    @gz3(version = "1.4")
    /* renamed from: q */
    public static ey1 m38694q(Class cls, hy1 hy1, hy1 hy12) {
        return f25850a.mo31740s(m38681d(cls), Arrays.asList(new hy1[]{hy1, hy12}), true);
    }

    @gz3(version = "1.4")
    /* renamed from: r */
    public static ey1 m38695r(Class cls, hy1... hy1Arr) {
        return f25850a.mo31740s(m38681d(cls), C4478ab.m37236iz(hy1Arr), true);
    }

    @gz3(version = "1.6")
    /* renamed from: s */
    public static ey1 m38696s(ey1 ey1, ey1 ey12) {
        return f25850a.mo31733l(ey1, ey12);
    }

    /* renamed from: t */
    public static by1 m38697t(b63 b63) {
        return f25850a.mo31734m(b63);
    }

    /* renamed from: u */
    public static cy1 m38698u(d63 d63) {
        return f25850a.mo31735n(d63);
    }

    /* renamed from: v */
    public static dy1 m38699v(f63 f63) {
        return f25850a.mo31736o(f63);
    }

    @gz3(version = "1.3")
    /* renamed from: w */
    public static String m38700w(dd1 dd1) {
        return f25850a.mo31737p(dd1);
    }

    @gz3(version = "1.1")
    /* renamed from: x */
    public static String m38701x(d12 d12) {
        return f25850a.mo31738q(d12);
    }

    @gz3(version = "1.4")
    /* renamed from: y */
    public static void m38702y(gy1 gy1, ey1 ey1) {
        f25850a.mo31739r(gy1, Collections.singletonList(ey1));
    }

    @gz3(version = "1.4")
    /* renamed from: z */
    public static void m38703z(gy1 gy1, ey1... ey1Arr) {
        f25850a.mo31739r(gy1, C4478ab.m37236iz(ey1Arr));
    }
}
