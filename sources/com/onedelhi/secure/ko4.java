package com.onedelhi.secure;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public final class ko4 {

    /* renamed from: a */
    public static final int f31360a = 8;

    /* renamed from: a */
    public static final long f31361a;

    /* renamed from: a */
    public static final C5924e f31362a = m54678P();

    /* renamed from: a */
    public static final Class<?> f31363a = C6172n5.m57900b();

    /* renamed from: a */
    public static final Unsafe f31364a = m54682T();

    /* renamed from: a */
    public static final boolean f31365a = m54725s(Long.TYPE);

    /* renamed from: b */
    public static final int f31366b = 7;

    /* renamed from: b */
    public static final long f31367b;

    /* renamed from: b */
    public static final boolean f31368b = m54725s(Integer.TYPE);

    /* renamed from: c */
    public static final int f31369c;

    /* renamed from: c */
    public static final long f31370c;

    /* renamed from: c */
    public static final boolean f31371c = m54734w0();

    /* renamed from: d */
    public static final long f31372d;

    /* renamed from: d */
    public static final boolean f31373d = m54732v0();

    /* renamed from: e */
    public static final long f31374e;

    /* renamed from: e */
    public static final boolean f31375e = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: f */
    public static final long f31376f;

    /* renamed from: g */
    public static final long f31377g;

    /* renamed from: h */
    public static final long f31378h;

    /* renamed from: i */
    public static final long f31379i;

    /* renamed from: j */
    public static final long f31380j;

    /* renamed from: k */
    public static final long f31381k;

    /* renamed from: l */
    public static final long f31382l;

    /* renamed from: m */
    public static final long f31383m;

    /* renamed from: n */
    public static final long f31384n = m54729u(m54717o());

    /* renamed from: com.onedelhi.secure.ko4$a */
    public static class C5920a implements PrivilegedExceptionAction<Unsafe> {
        /* renamed from: a */
        public Unsafe run() throws Exception {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }

    /* renamed from: com.onedelhi.secure.ko4$b */
    public static final class C5921b extends C5924e {

        /* renamed from: a */
        public static final long f31385a = -1;

        public C5921b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: C */
        public static int m54739C(long j) {
            return (int) (j & -1);
        }

        /* renamed from: B */
        public boolean mo39367B() {
            return false;
        }

        /* renamed from: c */
        public void mo39368c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo39369d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public boolean mo39370e(Object obj, long j) {
            return ko4.f31375e ? ko4.m54736y(obj, j) : ko4.m54737z(obj, j);
        }

        /* renamed from: f */
        public byte mo39371f(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public byte mo39372g(Object obj, long j) {
            return ko4.f31375e ? ko4.m54666D(obj, j) : ko4.m54667E(obj, j);
        }

        /* renamed from: h */
        public double mo39373h(Object obj, long j) {
            return Double.longBitsToDouble(mo39389m(obj, j));
        }

        /* renamed from: i */
        public float mo39374i(Object obj, long j) {
            return Float.intBitsToFloat(mo39388k(obj, j));
        }

        /* renamed from: j */
        public int mo39375j(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: l */
        public long mo39376l(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: o */
        public Object mo39377o(Field field) {
            try {
                return field.get((Object) null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        /* renamed from: q */
        public void mo39378q(Object obj, long j, boolean z) {
            if (ko4.f31375e) {
                ko4.m54694c0(obj, j, z);
            } else {
                ko4.m54696d0(obj, j, z);
            }
        }

        /* renamed from: r */
        public void mo39379r(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: s */
        public void mo39380s(Object obj, long j, byte b) {
            if (ko4.f31375e) {
                ko4.m54704h0(obj, j, b);
            } else {
                ko4.m54706i0(obj, j, b);
            }
        }

        /* renamed from: t */
        public void mo39381t(Object obj, long j, double d) {
            mo39393y(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: u */
        public void mo39382u(Object obj, long j, float f) {
            mo39392w(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: v */
        public void mo39383v(long j, int i) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: x */
        public void mo39384x(long j, long j2) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.onedelhi.secure.ko4$c */
    public static final class C5922c extends C5924e {
        public C5922c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: B */
        public boolean mo39367B() {
            return false;
        }

        /* renamed from: c */
        public void mo39368c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public void mo39369d(byte[] bArr, long j, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: e */
        public boolean mo39370e(Object obj, long j) {
            return ko4.f31375e ? ko4.m54736y(obj, j) : ko4.m54737z(obj, j);
        }

        /* renamed from: f */
        public byte mo39371f(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: g */
        public byte mo39372g(Object obj, long j) {
            return ko4.f31375e ? ko4.m54666D(obj, j) : ko4.m54667E(obj, j);
        }

        /* renamed from: h */
        public double mo39373h(Object obj, long j) {
            return Double.longBitsToDouble(mo39389m(obj, j));
        }

        /* renamed from: i */
        public float mo39374i(Object obj, long j) {
            return Float.intBitsToFloat(mo39388k(obj, j));
        }

        /* renamed from: j */
        public int mo39375j(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: l */
        public long mo39376l(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: o */
        public Object mo39377o(Field field) {
            try {
                return field.get((Object) null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        /* renamed from: q */
        public void mo39378q(Object obj, long j, boolean z) {
            if (ko4.f31375e) {
                ko4.m54694c0(obj, j, z);
            } else {
                ko4.m54696d0(obj, j, z);
            }
        }

        /* renamed from: r */
        public void mo39379r(long j, byte b) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: s */
        public void mo39380s(Object obj, long j, byte b) {
            if (ko4.f31375e) {
                ko4.m54704h0(obj, j, b);
            } else {
                ko4.m54706i0(obj, j, b);
            }
        }

        /* renamed from: t */
        public void mo39381t(Object obj, long j, double d) {
            mo39393y(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: u */
        public void mo39382u(Object obj, long j, float f) {
            mo39392w(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: v */
        public void mo39383v(long j, int i) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: x */
        public void mo39384x(long j, long j2) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.onedelhi.secure.ko4$d */
    public static final class C5923d extends C5924e {
        public C5923d(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: A */
        public boolean mo39385A() {
            Class<Object> cls = Object.class;
            if (!super.mo39385A()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f31386a.getClass();
                Class cls3 = Long.TYPE;
                cls2.getMethod("getByte", new Class[]{cls, cls3});
                cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
                cls2.getMethod("getBoolean", new Class[]{cls, cls3});
                cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
                cls2.getMethod("getFloat", new Class[]{cls, cls3});
                cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
                cls2.getMethod("getDouble", new Class[]{cls, cls3});
                cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
                return true;
            } catch (Throwable th) {
                ko4.m54686X(th);
                return false;
            }
        }

        /* renamed from: B */
        public boolean mo39367B() {
            Class<Object> cls = Object.class;
            if (!super.mo39367B()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f31386a.getClass();
                Class cls3 = Long.TYPE;
                cls2.getMethod("getByte", new Class[]{cls3});
                cls2.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
                cls2.getMethod("getInt", new Class[]{cls3});
                cls2.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
                cls2.getMethod("getLong", new Class[]{cls3});
                cls2.getMethod("putLong", new Class[]{cls3, cls3});
                cls2.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
                cls2.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
                return true;
            } catch (Throwable th) {
                ko4.m54686X(th);
                return false;
            }
        }

        /* renamed from: c */
        public void mo39368c(long j, byte[] bArr, long j2, long j3) {
            this.f31386a.copyMemory((Object) null, j, bArr, ko4.f31361a + j2, j3);
        }

        /* renamed from: d */
        public void mo39369d(byte[] bArr, long j, long j2, long j3) {
            this.f31386a.copyMemory(bArr, ko4.f31361a + j, (Object) null, j2, j3);
        }

        /* renamed from: e */
        public boolean mo39370e(Object obj, long j) {
            return this.f31386a.getBoolean(obj, j);
        }

        /* renamed from: f */
        public byte mo39371f(long j) {
            return this.f31386a.getByte(j);
        }

        /* renamed from: g */
        public byte mo39372g(Object obj, long j) {
            return this.f31386a.getByte(obj, j);
        }

        /* renamed from: h */
        public double mo39373h(Object obj, long j) {
            return this.f31386a.getDouble(obj, j);
        }

        /* renamed from: i */
        public float mo39374i(Object obj, long j) {
            return this.f31386a.getFloat(obj, j);
        }

        /* renamed from: j */
        public int mo39375j(long j) {
            return this.f31386a.getInt(j);
        }

        /* renamed from: l */
        public long mo39376l(long j) {
            return this.f31386a.getLong(j);
        }

        /* renamed from: o */
        public Object mo39377o(Field field) {
            return mo39390n(this.f31386a.staticFieldBase(field), this.f31386a.staticFieldOffset(field));
        }

        /* renamed from: q */
        public void mo39378q(Object obj, long j, boolean z) {
            this.f31386a.putBoolean(obj, j, z);
        }

        /* renamed from: r */
        public void mo39379r(long j, byte b) {
            this.f31386a.putByte(j, b);
        }

        /* renamed from: s */
        public void mo39380s(Object obj, long j, byte b) {
            this.f31386a.putByte(obj, j, b);
        }

        /* renamed from: t */
        public void mo39381t(Object obj, long j, double d) {
            this.f31386a.putDouble(obj, j, d);
        }

        /* renamed from: u */
        public void mo39382u(Object obj, long j, float f) {
            this.f31386a.putFloat(obj, j, f);
        }

        /* renamed from: v */
        public void mo39383v(long j, int i) {
            this.f31386a.putInt(j, i);
        }

        /* renamed from: x */
        public void mo39384x(long j, long j2) {
            this.f31386a.putLong(j, j2);
        }
    }

    /* renamed from: com.onedelhi.secure.ko4$e */
    public static abstract class C5924e {

        /* renamed from: a */
        public Unsafe f31386a;

        public C5924e(Unsafe unsafe) {
            this.f31386a = unsafe;
        }

        /* renamed from: A */
        public boolean mo39385A() {
            Class<Object> cls = Object.class;
            Unsafe unsafe = this.f31386a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls2 = unsafe.getClass();
                cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
                cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
                Class cls3 = Long.TYPE;
                cls2.getMethod("getInt", new Class[]{cls, cls3});
                cls2.getMethod("putInt", new Class[]{cls, cls3, Integer.TYPE});
                cls2.getMethod("getLong", new Class[]{cls, cls3});
                cls2.getMethod("putLong", new Class[]{cls, cls3, cls3});
                cls2.getMethod("getObject", new Class[]{cls, cls3});
                cls2.getMethod("putObject", new Class[]{cls, cls3, cls});
                return true;
            } catch (Throwable th) {
                ko4.m54686X(th);
                return false;
            }
        }

        /* renamed from: B */
        public boolean mo39367B() {
            Unsafe unsafe = this.f31386a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
                return ko4.m54717o() != null;
            } catch (Throwable th) {
                ko4.m54686X(th);
                return false;
            }
        }

        /* renamed from: a */
        public final int mo39386a(Class<?> cls) {
            return this.f31386a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int mo39387b(Class<?> cls) {
            return this.f31386a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract void mo39368c(long j, byte[] bArr, long j2, long j3);

        /* renamed from: d */
        public abstract void mo39369d(byte[] bArr, long j, long j2, long j3);

        /* renamed from: e */
        public abstract boolean mo39370e(Object obj, long j);

        /* renamed from: f */
        public abstract byte mo39371f(long j);

        /* renamed from: g */
        public abstract byte mo39372g(Object obj, long j);

        /* renamed from: h */
        public abstract double mo39373h(Object obj, long j);

        /* renamed from: i */
        public abstract float mo39374i(Object obj, long j);

        /* renamed from: j */
        public abstract int mo39375j(long j);

        /* renamed from: k */
        public final int mo39388k(Object obj, long j) {
            return this.f31386a.getInt(obj, j);
        }

        /* renamed from: l */
        public abstract long mo39376l(long j);

        /* renamed from: m */
        public final long mo39389m(Object obj, long j) {
            return this.f31386a.getLong(obj, j);
        }

        /* renamed from: n */
        public final Object mo39390n(Object obj, long j) {
            return this.f31386a.getObject(obj, j);
        }

        /* renamed from: o */
        public abstract Object mo39377o(Field field);

        /* renamed from: p */
        public final long mo39391p(Field field) {
            return this.f31386a.objectFieldOffset(field);
        }

        /* renamed from: q */
        public abstract void mo39378q(Object obj, long j, boolean z);

        /* renamed from: r */
        public abstract void mo39379r(long j, byte b);

        /* renamed from: s */
        public abstract void mo39380s(Object obj, long j, byte b);

        /* renamed from: t */
        public abstract void mo39381t(Object obj, long j, double d);

        /* renamed from: u */
        public abstract void mo39382u(Object obj, long j, float f);

        /* renamed from: v */
        public abstract void mo39383v(long j, int i);

        /* renamed from: w */
        public final void mo39392w(Object obj, long j, int i) {
            this.f31386a.putInt(obj, j, i);
        }

        /* renamed from: x */
        public abstract void mo39384x(long j, long j2);

        /* renamed from: y */
        public final void mo39393y(Object obj, long j, long j2) {
            this.f31386a.putLong(obj, j, j2);
        }

        /* renamed from: z */
        public final void mo39394z(Object obj, long j, Object obj2) {
            this.f31386a.putObject(obj, j, obj2);
        }
    }

    static {
        Class<Object[]> cls = Object[].class;
        Class<double[]> cls2 = double[].class;
        Class<float[]> cls3 = float[].class;
        Class<long[]> cls4 = long[].class;
        Class<int[]> cls5 = int[].class;
        Class<boolean[]> cls6 = boolean[].class;
        long m = (long) m54713m(byte[].class);
        f31361a = m;
        f31367b = (long) m54713m(cls6);
        f31370c = (long) m54715n(cls6);
        f31372d = (long) m54713m(cls5);
        f31374e = (long) m54715n(cls5);
        f31376f = (long) m54713m(cls4);
        f31377g = (long) m54715n(cls4);
        f31378h = (long) m54713m(cls3);
        f31379i = (long) m54715n(cls3);
        f31380j = (long) m54713m(cls2);
        f31381k = (long) m54715n(cls2);
        f31382l = (long) m54713m(cls);
        f31383m = (long) m54715n(cls);
        f31369c = (int) (7 & m);
    }

    /* renamed from: A */
    public static byte m54663A(long j) {
        return f31362a.mo39371f(j);
    }

    /* renamed from: B */
    public static byte m54664B(Object obj, long j) {
        return f31362a.mo39372g(obj, j);
    }

    /* renamed from: C */
    public static byte m54665C(byte[] bArr, long j) {
        return f31362a.mo39372g(bArr, f31361a + j);
    }

    /* renamed from: D */
    public static byte m54666D(Object obj, long j) {
        return (byte) ((m54673K(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* renamed from: E */
    public static byte m54667E(Object obj, long j) {
        return (byte) ((m54673K(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: F */
    public static double m54668F(Object obj, long j) {
        return f31362a.mo39373h(obj, j);
    }

    /* renamed from: G */
    public static double m54669G(double[] dArr, long j) {
        return f31362a.mo39373h(dArr, f31380j + (j * f31381k));
    }

    /* renamed from: H */
    public static float m54670H(Object obj, long j) {
        return f31362a.mo39374i(obj, j);
    }

    /* renamed from: I */
    public static float m54671I(float[] fArr, long j) {
        return f31362a.mo39374i(fArr, f31378h + (j * f31379i));
    }

    /* renamed from: J */
    public static int m54672J(long j) {
        return f31362a.mo39375j(j);
    }

    /* renamed from: K */
    public static int m54673K(Object obj, long j) {
        return f31362a.mo39388k(obj, j);
    }

    /* renamed from: L */
    public static int m54674L(int[] iArr, long j) {
        return f31362a.mo39388k(iArr, f31372d + (j * f31374e));
    }

    /* renamed from: M */
    public static long m54675M(long j) {
        return f31362a.mo39376l(j);
    }

    /* renamed from: N */
    public static long m54676N(Object obj, long j) {
        return f31362a.mo39389m(obj, j);
    }

    /* renamed from: O */
    public static long m54677O(long[] jArr, long j) {
        return f31362a.mo39389m(jArr, f31376f + (j * f31377g));
    }

    /* renamed from: P */
    public static C5924e m54678P() {
        Unsafe unsafe = f31364a;
        if (unsafe == null) {
            return null;
        }
        if (!C6172n5.m57901c()) {
            return new C5923d(unsafe);
        }
        if (f31365a) {
            return new C5922c(unsafe);
        }
        if (f31368b) {
            return new C5921b(unsafe);
        }
        return null;
    }

    /* renamed from: Q */
    public static Object m54679Q(Object obj, long j) {
        return f31362a.mo39390n(obj, j);
    }

    /* renamed from: R */
    public static Object m54680R(Object[] objArr, long j) {
        return f31362a.mo39390n(objArr, f31382l + (j * f31383m));
    }

    /* renamed from: S */
    public static Object m54681S(Field field) {
        return f31362a.mo39377o(field);
    }

    /* renamed from: T */
    public static Unsafe m54682T() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C5920a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: U */
    public static boolean m54683U() {
        return f31373d;
    }

    /* renamed from: V */
    public static boolean m54684V() {
        return f31371c;
    }

    /* renamed from: W */
    public static boolean m54685W() {
        return f31365a;
    }

    /* renamed from: X */
    public static void m54686X(Throwable th) {
        Logger logger = Logger.getLogger(ko4.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* renamed from: Y */
    public static int m54687Y(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (i < 0 || i2 < 0 || i3 < 0 || i + i3 > bArr.length || i2 + i3 > bArr2.length) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = 0;
        if (f31373d) {
            int i5 = (f31369c + i) & 7;
            while (i4 < i3 && (i5 & 7) != 0) {
                if (bArr[i + i4] != bArr2[i2 + i4]) {
                    return i4;
                }
                i4++;
                i5++;
            }
            int i6 = ((i3 - i4) & -8) + i4;
            while (i4 < i6) {
                long j = f31361a;
                long j2 = (long) i4;
                long N = m54676N(bArr, ((long) i) + j + j2);
                long N2 = m54676N(bArr2, j + ((long) i2) + j2);
                if (N != N2) {
                    return i4 + m54731v(N, N2);
                }
                i4 += 8;
            }
        }
        while (i4 < i3) {
            if (bArr[i + i4] != bArr2[i2 + i4]) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    /* renamed from: Z */
    public static long m54688Z(Field field) {
        return f31362a.mo39391p(field);
    }

    /* renamed from: a0 */
    public static void m54690a0(Object obj, long j, boolean z) {
        f31362a.mo39378q(obj, j, z);
    }

    /* renamed from: b0 */
    public static void m54692b0(boolean[] zArr, long j, boolean z) {
        f31362a.mo39378q(zArr, f31367b + (j * f31370c), z);
    }

    /* renamed from: c0 */
    public static void m54694c0(Object obj, long j, boolean z) {
        m54704h0(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: d0 */
    public static void m54696d0(Object obj, long j, boolean z) {
        m54706i0(obj, j, z ? (byte) 1 : 0);
    }

    /* renamed from: e0 */
    public static void m54698e0(long j, byte b) {
        f31362a.mo39379r(j, b);
    }

    /* renamed from: f0 */
    public static void m54700f0(Object obj, long j, byte b) {
        f31362a.mo39380s(obj, j, b);
    }

    /* renamed from: g0 */
    public static void m54702g0(byte[] bArr, long j, byte b) {
        f31362a.mo39380s(bArr, f31361a + j, b);
    }

    /* renamed from: h0 */
    public static void m54704h0(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int K = m54673K(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m54718o0(obj, j2, ((255 & b) << i) | (K & (~(255 << i))));
    }

    /* renamed from: i0 */
    public static void m54706i0(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m54718o0(obj, j2, ((255 & b) << i) | (m54673K(obj, j2) & (~(255 << i))));
    }

    /* renamed from: j0 */
    public static void m54708j0(Object obj, long j, double d) {
        f31362a.mo39381t(obj, j, d);
    }

    /* renamed from: k */
    public static long m54709k(ByteBuffer byteBuffer) {
        return f31362a.mo39389m(byteBuffer, f31384n);
    }

    /* renamed from: k0 */
    public static void m54710k0(double[] dArr, long j, double d) {
        f31362a.mo39381t(dArr, f31380j + (j * f31381k), d);
    }

    /* renamed from: l */
    public static <T> T m54711l(Class<T> cls) {
        try {
            return f31364a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: l0 */
    public static void m54712l0(Object obj, long j, float f) {
        f31362a.mo39382u(obj, j, f);
    }

    /* renamed from: m */
    public static int m54713m(Class<?> cls) {
        if (f31373d) {
            return f31362a.mo39386a(cls);
        }
        return -1;
    }

    /* renamed from: m0 */
    public static void m54714m0(float[] fArr, long j, float f) {
        f31362a.mo39382u(fArr, f31378h + (j * f31379i), f);
    }

    /* renamed from: n */
    public static int m54715n(Class<?> cls) {
        if (f31373d) {
            return f31362a.mo39387b(cls);
        }
        return -1;
    }

    /* renamed from: n0 */
    public static void m54716n0(long j, int i) {
        f31362a.mo39383v(j, i);
    }

    /* renamed from: o */
    public static Field m54717o() {
        Field t;
        if (C6172n5.m57901c() && (t = m54727t(Buffer.class, "effectiveDirectAddress")) != null) {
            return t;
        }
        Field t2 = m54727t(Buffer.class, "address");
        if (t2 == null || t2.getType() != Long.TYPE) {
            return null;
        }
        return t2;
    }

    /* renamed from: o0 */
    public static void m54718o0(Object obj, long j, int i) {
        f31362a.mo39392w(obj, j, i);
    }

    /* renamed from: p */
    public static void m54719p(long j, byte[] bArr, long j2, long j3) {
        f31362a.mo39368c(j, bArr, j2, j3);
    }

    /* renamed from: p0 */
    public static void m54720p0(int[] iArr, long j, int i) {
        f31362a.mo39392w(iArr, f31372d + (j * f31374e), i);
    }

    /* renamed from: q */
    public static void m54721q(byte[] bArr, long j, long j2, long j3) {
        f31362a.mo39369d(bArr, j, j2, j3);
    }

    /* renamed from: q0 */
    public static void m54722q0(long j, long j2) {
        f31362a.mo39384x(j, j2);
    }

    /* renamed from: r */
    public static void m54723r(byte[] bArr, long j, byte[] bArr2, long j2, long j3) {
        System.arraycopy(bArr, (int) j, bArr2, (int) j2, (int) j3);
    }

    /* renamed from: r0 */
    public static void m54724r0(Object obj, long j, long j2) {
        f31362a.mo39393y(obj, j, j2);
    }

    /* renamed from: s */
    public static boolean m54725s(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C6172n5.m57901c()) {
            return false;
        }
        try {
            Class<?> cls3 = f31363a;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: s0 */
    public static void m54726s0(long[] jArr, long j, long j2) {
        f31362a.mo39393y(jArr, f31376f + (j * f31377g), j2);
    }

    /* renamed from: t */
    public static Field m54727t(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: t0 */
    public static void m54728t0(Object obj, long j, Object obj2) {
        f31362a.mo39394z(obj, j, obj2);
    }

    /* renamed from: u */
    public static long m54729u(Field field) {
        C5924e eVar;
        if (field == null || (eVar = f31362a) == null) {
            return -1;
        }
        return eVar.mo39391p(field);
    }

    /* renamed from: u0 */
    public static void m54730u0(Object[] objArr, long j, Object obj) {
        f31362a.mo39394z(objArr, f31382l + (j * f31383m), obj);
    }

    /* renamed from: v */
    public static int m54731v(long j, long j2) {
        long j3 = j ^ j2;
        return (f31375e ? Long.numberOfLeadingZeros(j3) : Long.numberOfTrailingZeros(j3)) >> 3;
    }

    /* renamed from: v0 */
    public static boolean m54732v0() {
        C5924e eVar = f31362a;
        if (eVar == null) {
            return false;
        }
        return eVar.mo39385A();
    }

    /* renamed from: w */
    public static boolean m54733w(Object obj, long j) {
        return f31362a.mo39370e(obj, j);
    }

    /* renamed from: w0 */
    public static boolean m54734w0() {
        C5924e eVar = f31362a;
        if (eVar == null) {
            return false;
        }
        return eVar.mo39367B();
    }

    /* renamed from: x */
    public static boolean m54735x(boolean[] zArr, long j) {
        return f31362a.mo39370e(zArr, f31367b + (j * f31370c));
    }

    /* renamed from: y */
    public static boolean m54736y(Object obj, long j) {
        return m54666D(obj, j) != 0;
    }

    /* renamed from: z */
    public static boolean m54737z(Object obj, long j) {
        return m54667E(obj, j) != 0;
    }
}
