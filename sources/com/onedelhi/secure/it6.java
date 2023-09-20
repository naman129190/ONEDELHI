package com.onedelhi.secure;

import java.io.IOException;
import java.util.List;

public final class it6 {

    /* renamed from: a */
    public static final /* synthetic */ int f13838a = 0;

    /* renamed from: a */
    public static final pu6 f13839a = m17882x(false);

    /* renamed from: a */
    public static final Class f13840a;

    /* renamed from: b */
    public static final pu6 f13841b = m17882x(true);

    /* renamed from: c */
    public static final pu6 f13842c = new ru6();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f13840a = cls;
    }

    /* renamed from: A */
    public static int m17835A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m17836B(list) + (size * eo6.m13910y(i << 3));
    }

    /* renamed from: B */
    public static int m17836B(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof lq6) {
            lq6 lq6 = (lq6) list;
            i = 0;
            while (i2 < size) {
                i += eo6.m13907v(lq6.mo19757e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + eo6.m13907v(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: C */
    public static int m17837C(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (eo6.m13910y(i << 3) + 4);
    }

    /* renamed from: D */
    public static int m17838D(List list) {
        return list.size() * 4;
    }

    /* renamed from: E */
    public static int m17839E(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (eo6.m13910y(i << 3) + 8);
    }

    /* renamed from: F */
    public static int m17840F(List list) {
        return list.size() * 8;
    }

    /* renamed from: G */
    public static int m17841G(int i, List list, gt6 gt6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += eo6.m13906u(i, (vs6) list.get(i3), gt6);
        }
        return i2;
    }

    /* renamed from: H */
    public static int m17842H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m17843I(list) + (size * eo6.m13910y(i << 3));
    }

    /* renamed from: I */
    public static int m17843I(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof lq6) {
            lq6 lq6 = (lq6) list;
            i = 0;
            while (i2 < size) {
                i += eo6.m13907v(lq6.mo19757e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + eo6.m13907v(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: J */
    public static int m17844J(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m17845K(list) + (list.size() * eo6.m13910y(i << 3));
    }

    /* renamed from: K */
    public static int m17845K(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof rr6) {
            rr6 rr6 = (rr6) list;
            i = 0;
            while (i2 < size) {
                i += eo6.m13911z(rr6.mo24060O0(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + eo6.m13911z(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: L */
    public static int m17846L(int i, Object obj, gt6 gt6) {
        if (obj instanceof ir6) {
            int i2 = eo6.f11310a;
            int a = ((ir6) obj).mo17946a();
            return eo6.m13910y(i << 3) + eo6.m13910y(a) + a;
        }
        return eo6.m13910y(i << 3) + eo6.m13908w((vs6) obj, gt6);
    }

    /* renamed from: M */
    public static int m17847M(int i, List list, gt6 gt6) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = eo6.m13910y(i << 3) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof ir6) {
                int a = ((ir6) obj).mo17946a();
                y += eo6.m13910y(a) + a;
            } else {
                y += eo6.m13908w((vs6) obj, gt6);
            }
        }
        return y;
    }

    /* renamed from: N */
    public static int m17848N(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m17849O(list) + (size * eo6.m13910y(i << 3));
    }

    /* renamed from: O */
    public static int m17849O(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof lq6) {
            lq6 lq6 = (lq6) list;
            i = 0;
            while (i2 < size) {
                int e = lq6.mo19757e(i2);
                i += eo6.m13910y((e >> 31) ^ (e + e));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + eo6.m13910y((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: P */
    public static int m17850P(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m17851Q(list) + (size * eo6.m13910y(i << 3));
    }

    /* renamed from: Q */
    public static int m17851Q(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof rr6) {
            rr6 rr6 = (rr6) list;
            i = 0;
            while (i2 < size) {
                long O0 = rr6.mo24060O0(i2);
                i += eo6.m13911z((O0 >> 63) ^ (O0 + O0));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + eo6.m13911z((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: R */
    public static int m17852R(int i, List list) {
        int x;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int i3 = eo6.f11310a;
        boolean z = list instanceof kr6;
        int y = eo6.m13910y(i << 3) * size;
        if (z) {
            kr6 kr6 = (kr6) list;
            while (i2 < size) {
                Object u0 = kr6.mo18565u0(i2);
                if (u0 instanceof on6) {
                    int f = ((on6) u0).mo18486f();
                    y += eo6.m13910y(f) + f;
                } else {
                    y += eo6.m13909x((String) u0);
                }
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof on6) {
                    int f2 = ((on6) obj).mo18486f();
                    x = y + eo6.m13910y(f2) + f2;
                } else {
                    x = y + eo6.m13909x((String) obj);
                }
                i2++;
            }
        }
        return y;
    }

    /* renamed from: S */
    public static int m17853S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m17854T(list) + (size * eo6.m13910y(i << 3));
    }

    /* renamed from: T */
    public static int m17854T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof lq6) {
            lq6 lq6 = (lq6) list;
            i = 0;
            while (i2 < size) {
                i += eo6.m13910y(lq6.mo19757e(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + eo6.m13910y(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    public static int m17855U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m17856V(list) + (size * eo6.m13910y(i << 3));
    }

    /* renamed from: V */
    public static int m17856V(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof rr6) {
            rr6 rr6 = (rr6) list;
            i = 0;
            while (i2 < size) {
                i += eo6.m13911z(rr6.mo24060O0(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + eo6.m13911z(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    public static pu6 m17857W() {
        return f13839a;
    }

    /* renamed from: X */
    public static pu6 m17858X() {
        return f13841b;
    }

    /* renamed from: a */
    public static pu6 m17859a() {
        return f13842c;
    }

    /* renamed from: b */
    public static Object m17860b(Object obj, int i, int i2, Object obj2, pu6 pu6) {
        if (obj2 == null) {
            obj2 = pu6.mo22655c(obj);
        }
        pu6.mo22658f(obj2, i, (long) i2);
        return obj2;
    }

    /* renamed from: c */
    public static void m17861c(pu6 pu6, Object obj, Object obj2) {
        pu6.mo22660h(obj, pu6.mo22657e(pu6.mo22656d(obj), pu6.mo22656d(obj2)));
    }

    /* renamed from: d */
    public static void m17862d(Class cls) {
        Class cls2;
        if (!jq6.class.isAssignableFrom(cls) && (cls2 = f13840a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: e */
    public static void m17863e(int i, List list, yv6 yv6, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yv6.mo16795x(i, list, z);
        }
    }

    /* renamed from: f */
    public static void m17864f(int i, List list, yv6 yv6) throws IOException {
        if (list != null && !list.isEmpty()) {
            yv6.mo16786o(i, list);
        }
    }

    /* renamed from: g */
    public static void m17865g(int i, List list, yv6 yv6, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yv6.mo16777f(i, list, z);
        }
    }

    /* renamed from: h */
    public static void m17866h(int i, List list, yv6 yv6, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yv6.mo16787p(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m17867i(int i, List list, yv6 yv6, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yv6.mo16797z(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m17868j(int i, List list, yv6 yv6, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yv6.mo16768G(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m17869k(int i, List list, yv6 yv6, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yv6.mo16779h(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m17870l(int i, List list, yv6 yv6, gt6 gt6) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((go6) yv6).mo16793v(i, list.get(i2), gt6);
            }
        }
    }

    /* renamed from: m */
    public static void m17871m(int i, List list, yv6 yv6, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yv6.mo16789r(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m17872n(int i, List list, yv6 yv6, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yv6.mo16762A(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m17873o(int i, List list, yv6 yv6, gt6 gt6) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((go6) yv6).mo16763B(i, list.get(i2), gt6);
            }
        }
    }

    /* renamed from: p */
    public static void m17874p(int i, List list, yv6 yv6, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yv6.mo16776e(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m17875q(int i, List list, yv6 yv6, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yv6.mo16784m(i, list, z);
        }
    }

    /* renamed from: r */
    public static void m17876r(int i, List list, yv6 yv6, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yv6.mo16765D(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m17877s(int i, List list, yv6 yv6, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yv6.mo16772a(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m17878t(int i, List list, yv6 yv6) throws IOException {
        if (list != null && !list.isEmpty()) {
            yv6.mo16770I(i, list);
        }
    }

    /* renamed from: u */
    public static void m17879u(int i, List list, yv6 yv6, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yv6.mo16791t(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m17880v(int i, List list, yv6 yv6, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            yv6.mo16767F(i, list, z);
        }
    }

    /* renamed from: w */
    public static boolean m17881w(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: x */
    public static pu6 m17882x(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (pu6) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: y */
    public static int m17883y(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (eo6.m13910y(i << 3) + 1);
    }

    /* renamed from: z */
    public static int m17884z(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = size * eo6.m13910y(i << 3);
        for (int i2 = 0; i2 < list.size(); i2++) {
            int f = ((on6) list.get(i2)).mo18486f();
            y += eo6.m13910y(f) + f;
        }
        return y;
    }
}
