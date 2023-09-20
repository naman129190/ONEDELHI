package com.onedelhi.secure;

import com.onedelhi.secure.e56;
import com.onedelhi.secure.y46;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class e56<MessageType extends e56<MessageType, BuilderType>, BuilderType extends y46<MessageType, BuilderType>> extends i06<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    public od6 zzc = od6.m23709a();

    /* renamed from: c */
    public static e56 m13584c(Class cls) {
        Map map = zzb;
        e56 e56 = (e56) map.get(cls);
        if (e56 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                e56 = (e56) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (e56 == null) {
            e56 = (e56) ((e56) kf6.m19749e(cls)).mo15053i(6, (Object) null, (Object) null);
            if (e56 != null) {
                map.put(cls, e56);
            } else {
                throw new IllegalStateException();
            }
        }
        return e56;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r1 != false) goto L_0x0044;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.e56 m13585d(com.onedelhi.secure.e56 r3, byte[] r4) throws com.onedelhi.secure.t66 {
        /*
            int r0 = r4.length
            com.onedelhi.secure.a46 r1 = com.onedelhi.secure.a46.f8743a
            r2 = 0
            com.onedelhi.secure.e56 r3 = m13590j(r3, r4, r2, r0, r1)
            if (r3 == 0) goto L_0x0044
            r4 = 1
            r0 = 0
            java.lang.Object r1 = r3.mo15053i(r4, r0, r0)
            java.lang.Byte r1 = (java.lang.Byte) r1
            byte r1 = r1.byteValue()
            if (r1 != r4) goto L_0x0019
            goto L_0x0044
        L_0x0019:
            if (r1 == 0) goto L_0x0037
            com.onedelhi.secure.db6 r1 = com.onedelhi.secure.db6.m13046a()
            java.lang.Class r2 = r3.getClass()
            com.onedelhi.secure.mb6 r1 = r1.mo14594b(r2)
            boolean r1 = r1.mo20294b(r3)
            if (r4 == r1) goto L_0x002f
            r4 = r0
            goto L_0x0030
        L_0x002f:
            r4 = r3
        L_0x0030:
            r2 = 2
            r3.mo15053i(r2, r4, r0)
            if (r1 == 0) goto L_0x0037
            goto L_0x0044
        L_0x0037:
            com.onedelhi.secure.id6 r4 = new com.onedelhi.secure.id6
            r4.<init>(r3)
            com.onedelhi.secure.t66 r4 = r4.mo17734a()
            r4.mo24732e(r3)
            throw r4
        L_0x0044:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.e56.m13585d(com.onedelhi.secure.e56, byte[]):com.onedelhi.secure.e56");
    }

    /* renamed from: e */
    public static q56 m13586e() {
        return gb6.m15700e();
    }

    /* renamed from: f */
    public static Object m13587f(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: g */
    public static Object m13588g(i96 i96, String str, Object[] objArr) {
        return new jb6(i96, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objArr);
    }

    /* renamed from: h */
    public static void m13589h(Class cls, e56 e56) {
        zzb.put(cls, e56);
    }

    /* renamed from: j */
    public static e56 m13590j(e56 e56, byte[] bArr, int i, int i2, a46 a46) throws t66 {
        e56 e562 = (e56) e56.mo15053i(4, (Object) null, (Object) null);
        try {
            mb6 b = db6.m13046a().mo14594b(e562.getClass());
            b.mo20296d(e562, bArr, 0, i2, new u06(a46));
            b.mo20295c(e562);
            if (e562.zza == 0) {
                return e562;
            }
            throw new RuntimeException();
        } catch (t66 e) {
            e.mo24732e(e562);
            throw e;
        } catch (id6 e2) {
            t66 a = e2.mo17734a();
            a.mo24732e(e562);
            throw a;
        } catch (IOException e3) {
            if (e3.getCause() instanceof t66) {
                throw ((t66) e3.getCause());
            }
            t66 t66 = new t66(e3);
            t66.mo24732e(e562);
            throw t66;
        } catch (IndexOutOfBoundsException unused) {
            t66 f = t66.m28138f();
            f.mo24732e(e562);
            throw f;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ i96 mo15049a() {
        return (e56) mo15053i(6, (Object) null, (Object) null);
    }

    /* renamed from: b */
    public final /* synthetic */ f96 mo15050b() {
        y46 y46 = (y46) mo15053i(5, (Object) null, (Object) null);
        y46.mo27198f(this);
        return y46;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return db6.m13046a().mo14594b(getClass()).mo20297e(this, (e56) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int a = db6.m13046a().mo14594b(getClass()).mo20293a(this);
        this.zza = a;
        return a;
    }

    /* renamed from: i */
    public abstract Object mo15053i(int i, Object obj, Object obj2);

    public final String toString() {
        return o96.m23616a(this, super.toString());
    }
}
