package com.onedelhi.secure;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import libcore.io.Memory;
import sun.misc.Unsafe;

public final class zu6 {

    /* renamed from: a */
    public static final long f23900a = ((long) m33453E(byte[].class));

    /* renamed from: a */
    public static final yu6 f23901a;

    /* renamed from: a */
    public static final Class f23902a = Memory.class;

    /* renamed from: a */
    public static final Unsafe f23903a;

    /* renamed from: a */
    public static final boolean f23904a;

    /* renamed from: b */
    public static final boolean f23905b;

    /* renamed from: c */
    public static final boolean f23906c;

    /* renamed from: d */
    public static final boolean f23907d;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0134  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            java.lang.Class<double[]> r2 = double[].class
            java.lang.Class<float[]> r3 = float[].class
            java.lang.Class<long[]> r4 = long[].class
            java.lang.Class<int[]> r5 = int[].class
            java.lang.Class<boolean[]> r6 = boolean[].class
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            sun.misc.Unsafe r0 = m33465l()
            f23903a = r0
            int r8 = com.onedelhi.secure.tl6.f20961a
            java.lang.Class<libcore.io.Memory> r8 = libcore.io.Memory.class
            f23902a = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m33449A(r8)
            f23904a = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = m33449A(r10)
            r11 = 0
            if (r0 != 0) goto L_0x002c
            goto L_0x003b
        L_0x002c:
            if (r9 == 0) goto L_0x0034
            com.onedelhi.secure.xu6 r11 = new com.onedelhi.secure.xu6
            r11.<init>(r0)
            goto L_0x003b
        L_0x0034:
            if (r10 == 0) goto L_0x003b
            com.onedelhi.secure.wu6 r11 = new com.onedelhi.secure.wu6
            r11.<init>(r0)
        L_0x003b:
            f23901a = r11
            java.lang.String r9 = "getLong"
            java.lang.String r10 = "objectFieldOffset"
            r12 = 2
            r13 = 1
            r14 = 0
            if (r11 != 0) goto L_0x0048
        L_0x0046:
            r0 = 0
            goto L_0x006e
        L_0x0048:
            sun.misc.Unsafe r0 = r11.f23341a
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r11 = new java.lang.Class[r13]     // Catch:{ all -> 0x0069 }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r11[r14] = r15     // Catch:{ all -> 0x0069 }
            r0.getMethod(r10, r11)     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r11 = new java.lang.Class[r12]     // Catch:{ all -> 0x0069 }
            r11[r14] = r7     // Catch:{ all -> 0x0069 }
            r11[r13] = r8     // Catch:{ all -> 0x0069 }
            r0.getMethod(r9, r11)     // Catch:{ all -> 0x0069 }
            java.lang.reflect.Field r0 = m33455b()     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x0067
            goto L_0x0046
        L_0x0067:
            r0 = 1
            goto L_0x006e
        L_0x0069:
            r0 = move-exception
            java.util.logging.Logger.getLogger(com.onedelhi.secure.zu6.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r0.toString()))
            goto L_0x0046
        L_0x006e:
            f23905b = r0
            com.onedelhi.secure.yu6 r0 = f23901a
            if (r0 != 0) goto L_0x0076
        L_0x0074:
            r0 = 0
            goto L_0x00ed
        L_0x0076:
            sun.misc.Unsafe r0 = r0.f23341a
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r8 = new java.lang.Class[r13]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.reflect.Field> r11 = java.lang.reflect.Field.class
            r8[r14] = r11     // Catch:{ all -> 0x00e8 }
            r0.getMethod(r10, r8)     // Catch:{ all -> 0x00e8 }
            java.lang.String r8 = "arrayBaseOffset"
            java.lang.Class[] r10 = new java.lang.Class[r13]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r10[r14] = r11     // Catch:{ all -> 0x00e8 }
            r0.getMethod(r8, r10)     // Catch:{ all -> 0x00e8 }
            java.lang.String r8 = "arrayIndexScale"
            java.lang.Class[] r10 = new java.lang.Class[r13]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r10[r14] = r11     // Catch:{ all -> 0x00e8 }
            r0.getMethod(r8, r10)     // Catch:{ all -> 0x00e8 }
            java.lang.String r8 = "getInt"
            java.lang.Class[] r10 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            r10[r14] = r7     // Catch:{ all -> 0x00e8 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x00e8 }
            r10[r13] = r11     // Catch:{ all -> 0x00e8 }
            r0.getMethod(r8, r10)     // Catch:{ all -> 0x00e8 }
            java.lang.String r8 = "putInt"
            r10 = 3
            java.lang.Class[] r15 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r15[r14] = r7     // Catch:{ all -> 0x00e8 }
            r15[r13] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.Class r16 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00e8 }
            r15[r12] = r16     // Catch:{ all -> 0x00e8 }
            r0.getMethod(r8, r15)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r8 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            r8[r14] = r7     // Catch:{ all -> 0x00e8 }
            r8[r13] = r11     // Catch:{ all -> 0x00e8 }
            r0.getMethod(r9, r8)     // Catch:{ all -> 0x00e8 }
            java.lang.String r8 = "putLong"
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r9[r14] = r7     // Catch:{ all -> 0x00e8 }
            r9[r13] = r11     // Catch:{ all -> 0x00e8 }
            r9[r12] = r11     // Catch:{ all -> 0x00e8 }
            r0.getMethod(r8, r9)     // Catch:{ all -> 0x00e8 }
            java.lang.String r8 = "getObject"
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            r9[r14] = r7     // Catch:{ all -> 0x00e8 }
            r9[r13] = r11     // Catch:{ all -> 0x00e8 }
            r0.getMethod(r8, r9)     // Catch:{ all -> 0x00e8 }
            java.lang.String r8 = "putObject"
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r9[r14] = r7     // Catch:{ all -> 0x00e8 }
            r9[r13] = r11     // Catch:{ all -> 0x00e8 }
            r9[r12] = r7     // Catch:{ all -> 0x00e8 }
            r0.getMethod(r8, r9)     // Catch:{ all -> 0x00e8 }
            r0 = 1
            goto L_0x00ed
        L_0x00e8:
            r0 = move-exception
            java.util.logging.Logger.getLogger(com.onedelhi.secure.zu6.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r0.toString()))
            goto L_0x0074
        L_0x00ed:
            f23906c = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = m33453E(r0)
            long r7 = (long) r0
            f23900a = r7
            m33453E(r6)
            m33454a(r6)
            m33453E(r5)
            m33454a(r5)
            m33453E(r4)
            m33454a(r4)
            m33453E(r3)
            m33454a(r3)
            m33453E(r2)
            m33454a(r2)
            m33453E(r1)
            m33454a(r1)
            java.lang.reflect.Field r0 = m33455b()
            if (r0 == 0) goto L_0x012b
            com.onedelhi.secure.yu6 r1 = f23901a
            if (r1 == 0) goto L_0x012b
            sun.misc.Unsafe r1 = r1.f23341a
            r1.objectFieldOffset(r0)
        L_0x012b:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x0134
            goto L_0x0135
        L_0x0134:
            r13 = 0
        L_0x0135:
            f23907d = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.zu6.<clinit>():void");
    }

    /* renamed from: A */
    public static boolean m33449A(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = tl6.f20961a;
        try {
            Class cls3 = f23902a;
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

    /* renamed from: B */
    public static boolean m33450B(Object obj, long j) {
        return f23901a.mo26705g(obj, j);
    }

    /* renamed from: C */
    public static boolean m33451C() {
        return f23906c;
    }

    /* renamed from: D */
    public static boolean m33452D() {
        return f23905b;
    }

    /* renamed from: E */
    public static int m33453E(Class cls) {
        if (f23906c) {
            return f23901a.f23341a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: a */
    public static int m33454a(Class cls) {
        if (f23906c) {
            return f23901a.f23341a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static Field m33455b() {
        int i = tl6.f20961a;
        Field c = m33456c(Buffer.class, "effectiveDirectAddress");
        if (c != null) {
            return c;
        }
        Field c2 = m33456c(Buffer.class, "address");
        if (c2 == null || c2.getType() != Long.TYPE) {
            return null;
        }
        return c2;
    }

    /* renamed from: c */
    public static Field m33456c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m33457d(Object obj, long j, byte b) {
        yu6 yu6 = f23901a;
        long j2 = -4 & j;
        int i = yu6.f23341a.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        yu6.f23341a.putInt(obj, j2, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* renamed from: e */
    public static void m33458e(Object obj, long j, byte b) {
        yu6 yu6 = f23901a;
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        yu6.f23341a.putInt(obj, j2, ((255 & b) << i) | (yu6.f23341a.getInt(obj, j2) & (~(255 << i))));
    }

    /* renamed from: f */
    public static double m33459f(Object obj, long j) {
        return f23901a.mo26699a(obj, j);
    }

    /* renamed from: g */
    public static float m33460g(Object obj, long j) {
        return f23901a.mo26700b(obj, j);
    }

    /* renamed from: h */
    public static int m33461h(Object obj, long j) {
        return f23901a.f23341a.getInt(obj, j);
    }

    /* renamed from: i */
    public static long m33462i(Object obj, long j) {
        return f23901a.f23341a.getLong(obj, j);
    }

    /* renamed from: j */
    public static Object m33463j(Class cls) {
        try {
            return f23903a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    public static Object m33464k(Object obj, long j) {
        return f23901a.f23341a.getObject(obj, j);
    }

    /* renamed from: l */
    public static Unsafe m33465l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new vu6());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: r */
    public static void m33471r(Object obj, long j, boolean z) {
        f23901a.mo26701c(obj, j, z);
    }

    /* renamed from: s */
    public static void m33472s(byte[] bArr, long j, byte b) {
        f23901a.mo26702d(bArr, f23900a + j, b);
    }

    /* renamed from: t */
    public static void m33473t(Object obj, long j, double d) {
        f23901a.mo26703e(obj, j, d);
    }

    /* renamed from: u */
    public static void m33474u(Object obj, long j, float f) {
        f23901a.mo26704f(obj, j, f);
    }

    /* renamed from: v */
    public static void m33475v(Object obj, long j, int i) {
        f23901a.f23341a.putInt(obj, j, i);
    }

    /* renamed from: w */
    public static void m33476w(Object obj, long j, long j2) {
        f23901a.f23341a.putLong(obj, j, j2);
    }

    /* renamed from: x */
    public static void m33477x(Object obj, long j, Object obj2) {
        f23901a.f23341a.putObject(obj, j, obj2);
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m33478y(Object obj, long j) {
        return ((byte) ((f23901a.f23341a.getInt(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m33479z(Object obj, long j) {
        return ((byte) ((f23901a.f23341a.getInt(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }
}
