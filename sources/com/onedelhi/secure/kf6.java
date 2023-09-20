package com.onedelhi.secure;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

public final class kf6 {

    /* renamed from: a */
    public static final hf6 f14884a;

    /* renamed from: a */
    public static final Class f14885a = q06.m25233a();

    /* renamed from: a */
    public static final Unsafe f14886a;

    /* renamed from: a */
    public static final boolean f14887a;

    /* renamed from: b */
    public static final boolean f14888b;

    /* renamed from: c */
    public static final boolean f14889c;

    /* renamed from: d */
    public static final boolean f14890d;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x012e  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            sun.misc.Unsafe r7 = m19751g()
            f14886a = r7
            java.lang.Class r8 = com.onedelhi.secure.q06.m25233a()
            f14885a = r8
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r9 = m19763s(r8)
            f14887a = r9
            java.lang.Class r10 = java.lang.Integer.TYPE
            boolean r10 = m19763s(r10)
            r11 = 0
            if (r7 != 0) goto L_0x002c
            goto L_0x003b
        L_0x002c:
            if (r9 == 0) goto L_0x0034
            com.onedelhi.secure.ef6 r11 = new com.onedelhi.secure.ef6
            r11.<init>(r7)
            goto L_0x003b
        L_0x0034:
            if (r10 == 0) goto L_0x003b
            com.onedelhi.secure.bf6 r11 = new com.onedelhi.secure.bf6
            r11.<init>(r7)
        L_0x003b:
            f14884a = r11
            java.lang.String r7 = "getLong"
            java.lang.String r9 = "objectFieldOffset"
            r10 = 2
            r12 = 1
            r13 = 0
            if (r11 != 0) goto L_0x0048
        L_0x0046:
            r8 = 0
            goto L_0x006e
        L_0x0048:
            sun.misc.Unsafe r11 = r11.f13067a
            java.lang.Class r11 = r11.getClass()     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x0069 }
            java.lang.Class<java.lang.reflect.Field> r15 = java.lang.reflect.Field.class
            r14[r13] = r15     // Catch:{ all -> 0x0069 }
            r11.getMethod(r9, r14)     // Catch:{ all -> 0x0069 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x0069 }
            r14[r13] = r6     // Catch:{ all -> 0x0069 }
            r14[r12] = r8     // Catch:{ all -> 0x0069 }
            r11.getMethod(r7, r14)     // Catch:{ all -> 0x0069 }
            java.lang.reflect.Field r8 = m19769y()     // Catch:{ all -> 0x0069 }
            if (r8 != 0) goto L_0x0067
            goto L_0x0046
        L_0x0067:
            r8 = 1
            goto L_0x006e
        L_0x0069:
            r8 = move-exception
            java.util.logging.Logger.getLogger(com.onedelhi.secure.kf6.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r8.toString()))
            goto L_0x0046
        L_0x006e:
            f14888b = r8
            com.onedelhi.secure.hf6 r8 = f14884a
            if (r8 != 0) goto L_0x0076
        L_0x0074:
            r6 = 0
            goto L_0x00ed
        L_0x0076:
            sun.misc.Unsafe r8 = r8.f13067a
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r11 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.reflect.Field> r14 = java.lang.reflect.Field.class
            r11[r13] = r14     // Catch:{ all -> 0x00e8 }
            r8.getMethod(r9, r11)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r11 = "arrayBaseOffset"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r9 = new java.lang.Class[r12]     // Catch:{ all -> 0x00e8 }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r9[r13] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r11 = "arrayIndexScale"
            r8.getMethod(r11, r9)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r9 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r9[r13] = r6     // Catch:{ all -> 0x00e8 }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x00e8 }
            r9[r12] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r14 = "getInt"
            r8.getMethod(r14, r9)     // Catch:{ all -> 0x00e8 }
            r9 = 3
            java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e8 }
            r14[r13] = r6     // Catch:{ all -> 0x00e8 }
            r14[r12] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00e8 }
            r14[r10] = r15     // Catch:{ all -> 0x00e8 }
            java.lang.String r15 = "putInt"
            r8.getMethod(r15, r14)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r14[r13] = r6     // Catch:{ all -> 0x00e8 }
            r14[r12] = r11     // Catch:{ all -> 0x00e8 }
            r8.getMethod(r7, r14)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e8 }
            r7[r13] = r6     // Catch:{ all -> 0x00e8 }
            r7[r12] = r11     // Catch:{ all -> 0x00e8 }
            r7[r10] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r14 = "putLong"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r7 = new java.lang.Class[r10]     // Catch:{ all -> 0x00e8 }
            r7[r13] = r6     // Catch:{ all -> 0x00e8 }
            r7[r12] = r11     // Catch:{ all -> 0x00e8 }
            java.lang.String r14 = "getObject"
            r8.getMethod(r14, r7)     // Catch:{ all -> 0x00e8 }
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e8 }
            r7[r13] = r6     // Catch:{ all -> 0x00e8 }
            r7[r12] = r11     // Catch:{ all -> 0x00e8 }
            r7[r10] = r6     // Catch:{ all -> 0x00e8 }
            java.lang.String r6 = "putObject"
            r8.getMethod(r6, r7)     // Catch:{ all -> 0x00e8 }
            r6 = 1
            goto L_0x00ed
        L_0x00e8:
            r6 = move-exception
            java.util.logging.Logger.getLogger(com.onedelhi.secure.kf6.class.getName()).logp(java.util.logging.Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(r6.toString()))
            goto L_0x0074
        L_0x00ed:
            f14889c = r6
            java.lang.Class<byte[]> r6 = byte[].class
            m19767w(r6)
            m19767w(r5)
            m19768x(r5)
            m19767w(r4)
            m19768x(r4)
            m19767w(r3)
            m19768x(r3)
            m19767w(r2)
            m19768x(r2)
            m19767w(r1)
            m19768x(r1)
            m19767w(r0)
            m19768x(r0)
            java.lang.reflect.Field r0 = m19769y()
            if (r0 == 0) goto L_0x0125
            com.onedelhi.secure.hf6 r1 = f14884a
            if (r1 == 0) goto L_0x0125
            r1.mo17251k(r0)
        L_0x0125:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x012e
            goto L_0x012f
        L_0x012e:
            r12 = 0
        L_0x012f:
            f14890d = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.kf6.<clinit>():void");
    }

    /* renamed from: a */
    public static double m19745a(Object obj, long j) {
        return f14884a.mo13677a(obj, j);
    }

    /* renamed from: b */
    public static float m19746b(Object obj, long j) {
        return f14884a.mo13678b(obj, j);
    }

    /* renamed from: c */
    public static int m19747c(Object obj, long j) {
        return f14884a.mo17249i(obj, j);
    }

    /* renamed from: d */
    public static long m19748d(Object obj, long j) {
        return f14884a.mo17250j(obj, j);
    }

    /* renamed from: e */
    public static Object m19749e(Class cls) {
        try {
            return f14886a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: f */
    public static Object m19750f(Object obj, long j) {
        return f14884a.mo17252l(obj, j);
    }

    /* renamed from: g */
    public static Unsafe m19751g() {
        try {
            return (Unsafe) AccessController.doPrivileged(new ye6());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static /* synthetic */ void m19753i(Object obj, long j, boolean z) {
        long j2 = -4 & j;
        hf6 hf6 = f14884a;
        int i = hf6.mo17249i(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        hf6.mo17253m(obj, j2, ((z ? 1 : 0) << i2) | ((~(255 << i2)) & i));
    }

    /* renamed from: j */
    public static /* synthetic */ void m19754j(Object obj, long j, boolean z) {
        long j2 = -4 & j;
        hf6 hf6 = f14884a;
        int i = hf6.mo17249i(obj, j2);
        int i2 = (((int) j) & 3) << 3;
        hf6.mo17253m(obj, j2, ((z ? 1 : 0) << i2) | ((~(255 << i2)) & i));
    }

    /* renamed from: k */
    public static void m19755k(Object obj, long j, boolean z) {
        f14884a.mo13679c(obj, j, z);
    }

    /* renamed from: l */
    public static void m19756l(Object obj, long j, double d) {
        f14884a.mo13680d(obj, j, d);
    }

    /* renamed from: m */
    public static void m19757m(Object obj, long j, float f) {
        f14884a.mo13681e(obj, j, f);
    }

    /* renamed from: n */
    public static void m19758n(Object obj, long j, int i) {
        f14884a.mo17253m(obj, j, i);
    }

    /* renamed from: o */
    public static void m19759o(Object obj, long j, long j2) {
        f14884a.mo17254n(obj, j, j2);
    }

    /* renamed from: p */
    public static void m19760p(Object obj, long j, Object obj2) {
        f14884a.mo17255o(obj, j, obj2);
    }

    /* renamed from: q */
    public static /* bridge */ /* synthetic */ boolean m19761q(Object obj, long j) {
        return ((byte) ((f14884a.mo17249i(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: r */
    public static /* bridge */ /* synthetic */ boolean m19762r(Object obj, long j) {
        return ((byte) ((f14884a.mo17249i(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: s */
    public static boolean m19763s(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = q06.f18847a;
        try {
            Class cls3 = f14885a;
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

    /* renamed from: t */
    public static boolean m19764t(Object obj, long j) {
        return f14884a.mo13682f(obj, j);
    }

    /* renamed from: u */
    public static boolean m19765u() {
        return f14889c;
    }

    /* renamed from: v */
    public static boolean m19766v() {
        return f14888b;
    }

    /* renamed from: w */
    public static int m19767w(Class cls) {
        if (f14889c) {
            return f14884a.mo17247g(cls);
        }
        return -1;
    }

    /* renamed from: x */
    public static int m19768x(Class cls) {
        if (f14889c) {
            return f14884a.mo17248h(cls);
        }
        return -1;
    }

    /* renamed from: y */
    public static Field m19769y() {
        int i = q06.f18847a;
        Field z = m19770z(Buffer.class, "effectiveDirectAddress");
        if (z != null) {
            return z;
        }
        Field z2 = m19770z(Buffer.class, "address");
        if (z2 == null || z2.getType() != Long.TYPE) {
            return null;
        }
        return z2;
    }

    /* renamed from: z */
    public static Field m19770z(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
