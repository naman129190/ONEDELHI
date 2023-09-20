package com.onedelhi.secure;

public final class nu1 {

    /* renamed from: a */
    public static final int f32790a = m58803a();

    /* renamed from: a */
    public static int m58803a() {
        return m58806d(System.getProperty("java.version"));
    }

    /* renamed from: b */
    public static int m58804b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static int m58805c() {
        return f32790a;
    }

    /* renamed from: d */
    public static int m58806d(String str) {
        int f = m58808f(str);
        if (f == -1) {
            f = m58804b(str);
        }
        if (f == -1) {
            return 6;
        }
        return f;
    }

    /* renamed from: e */
    public static boolean m58807e() {
        return f32790a >= 9;
    }

    /* renamed from: f */
    public static int m58808f(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
