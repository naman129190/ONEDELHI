package com.onedelhi.secure;

import java.util.Objects;

public class ot2 {

    @sj3(19)
    /* renamed from: com.onedelhi.secure.ot2$a */
    public static class C3088a {
        @pn0
        /* renamed from: a */
        public static boolean m24062a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        @pn0
        /* renamed from: b */
        public static int m24063b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    /* renamed from: a */
    public static boolean m24056a(@ts2 Object obj, @ts2 Object obj2) {
        return C3088a.m24062a(obj, obj2);
    }

    /* renamed from: b */
    public static int m24057b(@ts2 Object... objArr) {
        return C3088a.m24063b(objArr);
    }

    /* renamed from: c */
    public static int m24058c(@ts2 Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @mr2
    /* renamed from: d */
    public static <T> T m24059d(@ts2 T t) {
        Objects.requireNonNull(t);
        return t;
    }

    @mr2
    /* renamed from: e */
    public static <T> T m24060e(@ts2 T t, @mr2 String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    @ts2
    /* renamed from: f */
    public static String m24061f(@ts2 Object obj, @ts2 String str) {
        return obj != null ? obj.toString() : str;
    }
}
