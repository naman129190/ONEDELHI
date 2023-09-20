package com.onedelhi.secure;

import com.onedelhi.secure.tx1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class lj4 {
    /* renamed from: A */
    public static int m55673A(Object obj) {
        if (obj instanceof dd1) {
            return ((dd1) obj).getArity();
        }
        if (obj instanceof cc1) {
            return 0;
        }
        if (obj instanceof ec1) {
            return 1;
        }
        if (obj instanceof sc1) {
            return 2;
        }
        if (obj instanceof uc1) {
            return 3;
        }
        if (obj instanceof vc1) {
            return 4;
        }
        if (obj instanceof wc1) {
            return 5;
        }
        if (obj instanceof xc1) {
            return 6;
        }
        if (obj instanceof yc1) {
            return 7;
        }
        if (obj instanceof zc1) {
            return 8;
        }
        if (obj instanceof ad1) {
            return 9;
        }
        if (obj instanceof dc1) {
            return 10;
        }
        if (obj instanceof fc1) {
            return 11;
        }
        if (obj instanceof gc1) {
            return 12;
        }
        if (obj instanceof hc1) {
            return 13;
        }
        if (obj instanceof ic1) {
            return 14;
        }
        if (obj instanceof jc1) {
            return 15;
        }
        if (obj instanceof kc1) {
            return 16;
        }
        if (obj instanceof lc1) {
            return 17;
        }
        if (obj instanceof mc1) {
            return 18;
        }
        if (obj instanceof nc1) {
            return 19;
        }
        if (obj instanceof pc1) {
            return 20;
        }
        if (obj instanceof qc1) {
            return 21;
        }
        return obj instanceof rc1 ? 22 : -1;
    }

    /* renamed from: B */
    public static boolean m55674B(Object obj, int i) {
        return (obj instanceof tc1) && m55673A(obj) == i;
    }

    /* renamed from: C */
    public static boolean m55675C(Object obj) {
        return (obj instanceof Collection) && (!(obj instanceof nx1) || (obj instanceof ox1));
    }

    /* renamed from: D */
    public static boolean m55676D(Object obj) {
        return (obj instanceof Iterable) && (!(obj instanceof nx1) || (obj instanceof px1));
    }

    /* renamed from: E */
    public static boolean m55677E(Object obj) {
        return (obj instanceof Iterator) && (!(obj instanceof nx1) || (obj instanceof qx1));
    }

    /* renamed from: F */
    public static boolean m55678F(Object obj) {
        return (obj instanceof List) && (!(obj instanceof nx1) || (obj instanceof rx1));
    }

    /* renamed from: G */
    public static boolean m55679G(Object obj) {
        return (obj instanceof ListIterator) && (!(obj instanceof nx1) || (obj instanceof sx1));
    }

    /* renamed from: H */
    public static boolean m55680H(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof nx1) || (obj instanceof tx1));
    }

    /* renamed from: I */
    public static boolean m55681I(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof nx1) || (obj instanceof tx1.C6906a));
    }

    /* renamed from: J */
    public static boolean m55682J(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof nx1) || (obj instanceof yx1));
    }

    /* renamed from: K */
    public static <T extends Throwable> T m55683K(T t) {
        return jt1.m53744B(t, lj4.class.getName());
    }

    /* renamed from: L */
    public static ClassCastException m55684L(ClassCastException classCastException) {
        throw ((ClassCastException) m55683K(classCastException));
    }

    /* renamed from: M */
    public static void m55685M(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        m55686N(name + " cannot be cast to " + str);
    }

    /* renamed from: N */
    public static void m55686N(String str) {
        throw m55684L(new ClassCastException(str));
    }

    /* renamed from: a */
    public static Collection m55687a(Object obj) {
        if ((obj instanceof nx1) && !(obj instanceof ox1)) {
            m55685M(obj, "kotlin.collections.MutableCollection");
        }
        return m55705s(obj);
    }

    /* renamed from: b */
    public static Collection m55688b(Object obj, String str) {
        if ((obj instanceof nx1) && !(obj instanceof ox1)) {
            m55686N(str);
        }
        return m55705s(obj);
    }

    /* renamed from: c */
    public static Iterable m55689c(Object obj) {
        if ((obj instanceof nx1) && !(obj instanceof px1)) {
            m55685M(obj, "kotlin.collections.MutableIterable");
        }
        return m55706t(obj);
    }

    /* renamed from: d */
    public static Iterable m55690d(Object obj, String str) {
        if ((obj instanceof nx1) && !(obj instanceof px1)) {
            m55686N(str);
        }
        return m55706t(obj);
    }

    /* renamed from: e */
    public static Iterator m55691e(Object obj) {
        if ((obj instanceof nx1) && !(obj instanceof qx1)) {
            m55685M(obj, "kotlin.collections.MutableIterator");
        }
        return m55707u(obj);
    }

    /* renamed from: f */
    public static Iterator m55692f(Object obj, String str) {
        if ((obj instanceof nx1) && !(obj instanceof qx1)) {
            m55686N(str);
        }
        return m55707u(obj);
    }

    /* renamed from: g */
    public static List m55693g(Object obj) {
        if ((obj instanceof nx1) && !(obj instanceof rx1)) {
            m55685M(obj, "kotlin.collections.MutableList");
        }
        return m55708v(obj);
    }

    /* renamed from: h */
    public static List m55694h(Object obj, String str) {
        if ((obj instanceof nx1) && !(obj instanceof rx1)) {
            m55686N(str);
        }
        return m55708v(obj);
    }

    /* renamed from: i */
    public static ListIterator m55695i(Object obj) {
        if ((obj instanceof nx1) && !(obj instanceof sx1)) {
            m55685M(obj, "kotlin.collections.MutableListIterator");
        }
        return m55709w(obj);
    }

    /* renamed from: j */
    public static ListIterator m55696j(Object obj, String str) {
        if ((obj instanceof nx1) && !(obj instanceof sx1)) {
            m55686N(str);
        }
        return m55709w(obj);
    }

    /* renamed from: k */
    public static Map m55697k(Object obj) {
        if ((obj instanceof nx1) && !(obj instanceof tx1)) {
            m55685M(obj, "kotlin.collections.MutableMap");
        }
        return m55710x(obj);
    }

    /* renamed from: l */
    public static Map m55698l(Object obj, String str) {
        if ((obj instanceof nx1) && !(obj instanceof tx1)) {
            m55686N(str);
        }
        return m55710x(obj);
    }

    /* renamed from: m */
    public static Map.Entry m55699m(Object obj) {
        if ((obj instanceof nx1) && !(obj instanceof tx1.C6906a)) {
            m55685M(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return m55711y(obj);
    }

    /* renamed from: n */
    public static Map.Entry m55700n(Object obj, String str) {
        if ((obj instanceof nx1) && !(obj instanceof tx1.C6906a)) {
            m55686N(str);
        }
        return m55711y(obj);
    }

    /* renamed from: o */
    public static Set m55701o(Object obj) {
        if ((obj instanceof nx1) && !(obj instanceof yx1)) {
            m55685M(obj, "kotlin.collections.MutableSet");
        }
        return m55712z(obj);
    }

    /* renamed from: p */
    public static Set m55702p(Object obj, String str) {
        if ((obj instanceof nx1) && !(obj instanceof yx1)) {
            m55686N(str);
        }
        return m55712z(obj);
    }

    /* renamed from: q */
    public static Object m55703q(Object obj, int i) {
        if (obj != null && !m55674B(obj, i)) {
            m55685M(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    /* renamed from: r */
    public static Object m55704r(Object obj, int i, String str) {
        if (obj != null && !m55674B(obj, i)) {
            m55686N(str);
        }
        return obj;
    }

    /* renamed from: s */
    public static Collection m55705s(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw m55684L(e);
        }
    }

    /* renamed from: t */
    public static Iterable m55706t(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw m55684L(e);
        }
    }

    /* renamed from: u */
    public static Iterator m55707u(Object obj) {
        try {
            return (Iterator) obj;
        } catch (ClassCastException e) {
            throw m55684L(e);
        }
    }

    /* renamed from: v */
    public static List m55708v(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m55684L(e);
        }
    }

    /* renamed from: w */
    public static ListIterator m55709w(Object obj) {
        try {
            return (ListIterator) obj;
        } catch (ClassCastException e) {
            throw m55684L(e);
        }
    }

    /* renamed from: x */
    public static Map m55710x(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw m55684L(e);
        }
    }

    /* renamed from: y */
    public static Map.Entry m55711y(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e) {
            throw m55684L(e);
        }
    }

    /* renamed from: z */
    public static Set m55712z(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw m55684L(e);
        }
    }
}
