package com.onedelhi.secure;

import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a$\u0010\u0003\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\b\u0010\u0006\u001a\u00020\u0005H\u0002\u001a \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0001¨\u0006\f"}, d2 = {"", "T", "instance", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "c", "major", "minor", "patch", "", "a", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1})
public final class o23 {
    @rw1
    @vr2

    /* renamed from: a */
    public static final n23 f32878a;

    static {
        n23 n23;
        hu1 newInstance;
        iu1 newInstance2;
        Class<n23> cls = n23.class;
        int c = m58900c();
        if (c >= 65544 || c < 65536) {
            try {
                newInstance2 = iu1.class.newInstance();
                jt1.m53776o(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                if (newInstance2 != null) {
                    n23 = newInstance2;
                    f32878a = n23;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e) {
                ClassLoader classLoader = newInstance2.getClass().getClassLoader();
                ClassLoader classLoader2 = cls.getClassLoader();
                if (!jt1.m53768g(classLoader, classLoader2)) {
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
                }
                throw e;
            } catch (ClassNotFoundException unused) {
                try {
                    Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    jt1.m53776o(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                    if (newInstance3 != null) {
                        try {
                            n23 = (n23) newInstance3;
                        } catch (ClassCastException e2) {
                            ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                            ClassLoader classLoader4 = cls.getClassLoader();
                            if (!jt1.m53768g(classLoader3, classLoader4)) {
                                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e2);
                            }
                            throw e2;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        if (c >= 65543 || c < 65536) {
            try {
                newInstance = hu1.class.newInstance();
                jt1.m53776o(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                if (newInstance != null) {
                    n23 = newInstance;
                    f32878a = n23;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e3) {
                ClassLoader classLoader5 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader6 = cls.getClassLoader();
                if (!jt1.m53768g(classLoader5, classLoader6)) {
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e3);
                }
                throw e3;
            } catch (ClassNotFoundException unused3) {
                try {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    jt1.m53776o(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    if (newInstance4 != null) {
                        try {
                            n23 = (n23) newInstance4;
                        } catch (ClassCastException e4) {
                            ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                            ClassLoader classLoader8 = cls.getClassLoader();
                            if (!jt1.m53768g(classLoader7, classLoader8)) {
                                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e4);
                            }
                            throw e4;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused4) {
                }
            }
        }
        n23 = new n23();
        f32878a = n23;
    }

    @gz3(version = "1.2")
    @z73
    /* renamed from: a */
    public static final boolean m58898a(int i, int i2, int i3) {
        return f02.f28132a.mo35689q(i, i2, i3);
    }

    @xq1
    /* renamed from: b */
    public static final /* synthetic */ <T> T m58899b(Object obj) {
        try {
            jt1.m53786y(1, mx0.f16794s2);
            return obj;
        } catch (ClassCastException e) {
            ClassLoader classLoader = obj.getClass().getClassLoader();
            jt1.m53786y(4, mx0.f16794s2);
            ClassLoader classLoader2 = Object.class.getClassLoader();
            if (!jt1.m53768g(classLoader, classLoader2)) {
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
            }
            throw e;
        }
    }

    /* renamed from: c */
    public static final int m58900c() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int q3 = u54.m66666q3(property, '.', 0, false, 6, (Object) null);
        if (q3 < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        } else {
            int i = q3 + 1;
            int q32 = u54.m66666q3(property, '.', i, false, 4, (Object) null);
            if (q32 < 0) {
                q32 = property.length();
            }
            String substring = property.substring(0, q3);
            jt1.m53776o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = property.substring(i, q32);
            jt1.m53776o(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            try {
                return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
            } catch (NumberFormatException unused2) {
                return 65542;
            }
        }
    }
}
