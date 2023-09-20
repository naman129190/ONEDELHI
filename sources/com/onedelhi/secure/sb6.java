package com.onedelhi.secure;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public final class sb6 {

    /* renamed from: a */
    public static final ld6 f20277a = m27431j(false);

    /* renamed from: a */
    public static final Class f20278a;

    /* renamed from: b */
    public static final ld6 f20279b = m27431j(true);

    /* renamed from: c */
    public static final ld6 f20280c = new me6();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f20278a = cls;
    }

    /* renamed from: a */
    public static ld6 m27422a() {
        return f20277a;
    }

    /* renamed from: b */
    public static ld6 m27423b() {
        return f20279b;
    }

    /* renamed from: c */
    public static ld6 m27424c() {
        return f20280c;
    }

    /* renamed from: d */
    public static Object m27425d(int i, List list, n56 n56, Object obj, ld6 ld6) {
        if (n56 == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (n56.mo20869a()) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = m27426e(i, intValue, obj, ld6);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!n56.mo20869a()) {
                    obj = m27426e(i, intValue2, obj, ld6);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* renamed from: e */
    public static Object m27426e(int i, int i2, Object obj, ld6 ld6) {
        if (obj == null) {
            obj = ld6.mo19468c();
        }
        ld6.mo19469d(obj, i, (long) i2);
        return obj;
    }

    /* renamed from: f */
    public static void m27427f(ld6 ld6, Object obj, Object obj2) {
        ld6.mo19471f(obj, ld6.mo19467b(ld6.mo19466a(obj), ld6.mo19466a(obj2)));
    }

    /* renamed from: g */
    public static void m27428g(Class cls) {
        Class cls2;
        if (!e56.class.isAssignableFrom(cls) && (cls2 = f20278a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    public static boolean m27429h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: i */
    public static void m27430i(t86 t86, Object obj, Object obj2, long j) {
        kf6.m19760p(obj, j, t86.m28201a(kf6.m19750f(obj, j), kf6.m19750f(obj2, j)));
    }

    /* renamed from: j */
    public static ld6 m27431j(boolean z) {
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
            return (ld6) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }
}
