package com.onedelhi.secure;

import java.util.Arrays;

public class jt1 {

    @gz3(version = "1.4")
    /* renamed from: com.onedelhi.secure.jt1$a */
    public static class C5846a {
    }

    /* renamed from: A */
    public static <T extends Throwable> T m53743A(T t) {
        return m53744B(t, jt1.class.getName());
    }

    /* renamed from: B */
    public static <T extends Throwable> T m53744B(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: C */
    public static String m53745C(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: D */
    public static void m53746D() {
        throw ((AssertionError) m53743A(new AssertionError()));
    }

    /* renamed from: E */
    public static void m53747E(String str) {
        throw ((AssertionError) m53743A(new AssertionError(str)));
    }

    /* renamed from: F */
    public static void m53748F() {
        throw ((IllegalArgumentException) m53743A(new IllegalArgumentException()));
    }

    /* renamed from: G */
    public static void m53749G(String str) {
        throw ((IllegalArgumentException) m53743A(new IllegalArgumentException(str)));
    }

    /* renamed from: H */
    public static void m53750H() {
        throw ((IllegalStateException) m53743A(new IllegalStateException()));
    }

    /* renamed from: I */
    public static void m53751I(String str) {
        throw ((IllegalStateException) m53743A(new IllegalStateException(str)));
    }

    @gz3(version = "1.4")
    /* renamed from: J */
    public static void m53752J() {
        throw ((NullPointerException) m53743A(new NullPointerException()));
    }

    @gz3(version = "1.4")
    /* renamed from: K */
    public static void m53753K(String str) {
        throw ((NullPointerException) m53743A(new NullPointerException(str)));
    }

    /* renamed from: L */
    public static void m53754L() {
        throw ((c02) m53743A(new c02()));
    }

    /* renamed from: M */
    public static void m53755M(String str) {
        throw ((c02) m53743A(new c02(str)));
    }

    /* renamed from: N */
    public static void m53756N(String str) {
        throw ((IllegalArgumentException) m53743A(new IllegalArgumentException(m53783v(str))));
    }

    /* renamed from: O */
    public static void m53757O(String str) {
        throw ((NullPointerException) m53743A(new NullPointerException(m53783v(str))));
    }

    /* renamed from: P */
    public static void m53758P() {
        m53759Q("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: Q */
    public static void m53759Q(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* renamed from: R */
    public static void m53760R(String str) {
        throw ((sn4) m53743A(new sn4(str)));
    }

    /* renamed from: S */
    public static void m53761S(String str) {
        m53760R("lateinit property " + str + " has not been initialized");
    }

    @gz3(version = "1.1")
    /* renamed from: a */
    public static boolean m53762a(double d, Double d2) {
        return d2 != null && d == d2.doubleValue();
    }

    @gz3(version = "1.1")
    /* renamed from: b */
    public static boolean m53763b(float f, Float f2) {
        return f2 != null && f == f2.floatValue();
    }

    @gz3(version = "1.1")
    /* renamed from: c */
    public static boolean m53764c(Double d, double d2) {
        return d != null && d.doubleValue() == d2;
    }

    @gz3(version = "1.1")
    /* renamed from: d */
    public static boolean m53765d(Double d, Double d2) {
        if (d != null) {
            return d2 != null && d.doubleValue() == d2.doubleValue();
        }
        if (d2 == null) {
            return true;
        }
    }

    @gz3(version = "1.1")
    /* renamed from: e */
    public static boolean m53766e(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    @gz3(version = "1.1")
    /* renamed from: f */
    public static boolean m53767f(Float f, Float f2) {
        if (f != null) {
            return f2 != null && f.floatValue() == f2.floatValue();
        }
        if (f2 == null) {
            return true;
        }
    }

    /* renamed from: g */
    public static boolean m53768g(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: h */
    public static void m53769h(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) m53743A(new IllegalStateException(str + " must not be null")));
        }
    }

    /* renamed from: i */
    public static void m53770i(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) m53743A(new IllegalStateException(str)));
        }
    }

    /* renamed from: j */
    public static void m53771j(Object obj, String str, String str2) {
        if (obj == null) {
            throw ((IllegalStateException) m53743A(new IllegalStateException("Field specified as non-null is null: " + str + "." + str2)));
        }
    }

    /* renamed from: k */
    public static void m53772k(String str) throws ClassNotFoundException {
        String replace = str.replace('/', '.');
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e) {
            throw ((ClassNotFoundException) m53743A(new ClassNotFoundException("Class " + replace + " is not found. Please update the Kotlin runtime to the latest version", e)));
        }
    }

    /* renamed from: l */
    public static void m53773l(String str, String str2) throws ClassNotFoundException {
        String replace = str.replace('/', '.');
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e) {
            throw ((ClassNotFoundException) m53743A(new ClassNotFoundException("Class " + replace + " is not found: this code requires the Kotlin runtime of version at least " + str2, e)));
        }
    }

    /* renamed from: m */
    public static void m53774m(Object obj) {
        if (obj == null) {
            m53752J();
        }
    }

    /* renamed from: n */
    public static void m53775n(Object obj, String str) {
        if (obj == null) {
            m53753K(str);
        }
    }

    /* renamed from: o */
    public static void m53776o(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) m53743A(new NullPointerException(str + " must not be null")));
        }
    }

    /* renamed from: p */
    public static void m53777p(Object obj, String str) {
        if (obj == null) {
            m53757O(str);
        }
    }

    /* renamed from: q */
    public static void m53778q(Object obj, String str) {
        if (obj == null) {
            m53756N(str);
        }
    }

    /* renamed from: r */
    public static void m53779r(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) m53743A(new IllegalStateException(str)));
        }
    }

    /* renamed from: s */
    public static void m53780s(Object obj, String str, String str2) {
        if (obj == null) {
            throw ((IllegalStateException) m53743A(new IllegalStateException("Method specified as non-null returned null: " + str + "." + str2)));
        }
    }

    /* renamed from: t */
    public static int m53781t(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: u */
    public static int m53782u(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    /* renamed from: v */
    public static String m53783v(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: w */
    public static void m53784w() {
        m53758P();
    }

    /* renamed from: x */
    public static void m53785x(String str) {
        m53759Q(str);
    }

    /* renamed from: y */
    public static void m53786y(int i, String str) {
        m53758P();
    }

    /* renamed from: z */
    public static void m53787z(int i, String str, String str2) {
        m53759Q(str2);
    }
}
