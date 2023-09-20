package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.n5 */
public final class C6172n5 {

    /* renamed from: a */
    public static final Class<?> f32412a = m57899a("libcore.io.Memory");

    /* renamed from: a */
    public static boolean f32413a;

    /* renamed from: b */
    public static final boolean f32414b = (!f32413a && m57899a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    public static <T> Class<T> m57899a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Class<?> m57900b() {
        return f32412a;
    }

    /* renamed from: c */
    public static boolean m57901c() {
        return f32413a || (f32412a != null && !f32414b);
    }
}
