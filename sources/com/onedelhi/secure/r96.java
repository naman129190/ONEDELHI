package com.onedelhi.secure;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

public final class r96<T> implements mb6<T> {

    /* renamed from: a */
    public static final Unsafe f19724a = kf6.m19751g();

    /* renamed from: c */
    public static final int[] f19725c = new int[0];

    /* renamed from: a */
    public final int f19726a;

    /* renamed from: a */
    public final d46 f19727a;

    /* renamed from: a */
    public final i96 f19728a;

    /* renamed from: a */
    public final ld6 f19729a;

    /* renamed from: a */
    public final t86 f19730a;

    /* renamed from: a */
    public final ua6 f19731a;

    /* renamed from: a */
    public final x76 f19732a;

    /* renamed from: a */
    public final boolean f19733a;

    /* renamed from: a */
    public final int[] f19734a;

    /* renamed from: a */
    public final Object[] f19735a;

    /* renamed from: b */
    public final int f19736b;

    /* renamed from: b */
    public final int[] f19737b;

    /* renamed from: c */
    public final int f19738c;

    /* renamed from: d */
    public final int f19739d;

    public r96(int[] iArr, Object[] objArr, int i, int i2, i96 i96, boolean z, boolean z2, int[] iArr2, int i3, int i4, ua6 ua6, x76 x76, ld6 ld6, d46 d46, t86 t86, byte[] bArr) {
        this.f19734a = iArr;
        this.f19735a = objArr;
        this.f19726a = i;
        this.f19736b = i2;
        this.f19733a = z;
        this.f19737b = iArr2;
        this.f19738c = i3;
        this.f19739d = i4;
        this.f19731a = ua6;
        this.f19732a = x76;
        this.f19729a = ld6;
        this.f19727a = d46;
        this.f19728a = i96;
        this.f19730a = t86;
    }

    /* renamed from: E */
    public static int m26536E(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: G */
    public static long m26537G(Object obj, long j) {
        return ((Long) kf6.m19750f(obj, j)).longValue();
    }

    /* renamed from: h */
    public static Field m26538h(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: p */
    public static boolean m26539p(Object obj, int i, mb6 mb6) {
        return mb6.mo20294b(kf6.m19750f(obj, (long) (i & 1048575)));
    }

    /* renamed from: s */
    public static od6 m26540s(Object obj) {
        e56 e56 = (e56) obj;
        od6 od6 = e56.zzc;
        if (od6 != od6.m23709a()) {
            return od6;
        }
        od6 c = od6.m23711c();
        e56.zzc = c;
        return c;
    }

    /* renamed from: t */
    public static r96 m26541t(Class cls, z86 z86, ua6 ua6, x76 x76, ld6 ld6, d46 d46, t86 t86) {
        if (z86 instanceof jb6) {
            return m26542u((jb6) z86, ua6, x76, ld6, d46, t86);
        }
        cd6 cd6 = (cd6) z86;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0378  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.r96 m26542u(com.onedelhi.secure.jb6 r34, com.onedelhi.secure.ua6 r35, com.onedelhi.secure.x76 r36, com.onedelhi.secure.ld6 r37, com.onedelhi.secure.d46 r38, com.onedelhi.secure.t86 r39) {
        /*
            int r0 = r34.zzc()
            r1 = 0
            r3 = 2
            if (r0 != r3) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = 0
        L_0x000b:
            java.lang.String r0 = r34.mo18248c()
            int r3 = r0.length()
            char r4 = r0.charAt(r1)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0027
            r4 = 1
        L_0x001d:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0028
            r4 = r6
            goto L_0x001d
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0047
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0034:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0047:
            if (r6 != 0) goto L_0x0056
            int[] r6 = f19725c
            r13 = r6
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            goto L_0x0165
        L_0x0056:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0075
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0062:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0072
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0062
        L_0x0072:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0075:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0094
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0081:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0091
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0081
        L_0x0091:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0094:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b3
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a0:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b0
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a0
        L_0x00b0:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b3:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d2
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00bf:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00cf
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00bf
        L_0x00cf:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d2:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00de:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ee
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00de
        L_0x00ee:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f1:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0110
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fd:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010d
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fd
        L_0x010d:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0110:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0131
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011c:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011c
        L_0x012d:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0131:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0154
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013d:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x014f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013d
        L_0x014f:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0154:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 + r4
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r33 = r12
            r12 = r9
            r9 = r33
        L_0x0165:
            sun.misc.Unsafe r15 = f19724a
            java.lang.Object[] r17 = r34.mo18249d()
            com.onedelhi.secure.i96 r18 = r34.mo14104a()
            java.lang.Class r1 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r21 = r14 + r9
            r22 = r14
            r23 = r21
            r9 = 0
            r20 = 0
        L_0x0183:
            if (r4 >= r3) goto L_0x03ca
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01ab
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = r24
            r24 = 13
        L_0x0193:
            int r26 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01a5
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r24
            r4 = r4 | r2
            int r24 = r24 + 13
            r2 = r26
            goto L_0x0193
        L_0x01a5:
            int r2 = r2 << r24
            r4 = r4 | r2
            r2 = r26
            goto L_0x01ad
        L_0x01ab:
            r2 = r24
        L_0x01ad:
            int r24 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01da
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01bb:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r3) goto L_0x01d4
            r3 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r2 = r2 | r3
            int r24 = r24 + 13
            r5 = r27
            r3 = r28
            goto L_0x01bb
        L_0x01d4:
            int r3 = r5 << r24
            r2 = r2 | r3
            r3 = r27
            goto L_0x01de
        L_0x01da:
            r28 = r3
            r3 = r24
        L_0x01de:
            r5 = r2 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r2 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01ec
            int r14 = r20 + 1
            r13[r20] = r9
            r20 = r14
        L_0x01ec:
            r14 = 51
            if (r5 < r14) goto L_0x0295
            int r14 = r3 + 1
            char r3 = r0.charAt(r3)
            r27 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r14) goto L_0x0222
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r14 = r27
            r27 = 13
        L_0x0203:
            int r31 = r14 + 1
            char r14 = r0.charAt(r14)
            r32 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x021c
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r27
            r3 = r3 | r12
            int r27 = r27 + 13
            r14 = r31
            r12 = r32
            goto L_0x0203
        L_0x021c:
            int r12 = r14 << r27
            r3 = r3 | r12
            r14 = r31
            goto L_0x0226
        L_0x0222:
            r32 = r12
            r14 = r27
        L_0x0226:
            int r12 = r5 + -51
            r27 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0247
            r14 = 17
            if (r12 != r14) goto L_0x0233
            goto L_0x0247
        L_0x0233:
            r14 = 12
            if (r12 != r14) goto L_0x0256
            if (r10 != 0) goto L_0x0256
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0254
        L_0x0247:
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0254:
            r16 = r14
        L_0x0256:
            int r3 = r3 + r3
            r12 = r17[r3]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0260
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0268
        L_0x0260:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m26538h(r1, r12)
            r17[r3] = r12
        L_0x0268:
            r31 = r7
            r14 = r8
            long r7 = r15.objectFieldOffset(r12)
            int r8 = (int) r7
            int r3 = r3 + 1
            r7 = r17[r3]
            boolean r12 = r7 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x027b
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x0283
        L_0x027b:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = m26538h(r1, r7)
            r17[r3] = r7
        L_0x0283:
            r3 = r8
            long r7 = r15.objectFieldOffset(r7)
            int r8 = (int) r7
            r30 = r0
            r7 = r1
            r1 = r8
            r29 = r11
            r25 = 1
            r8 = r3
            r3 = 0
            goto L_0x0391
        L_0x0295:
            r31 = r7
            r14 = r8
            r32 = r12
            int r7 = r16 + 1
            r8 = r17[r16]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m26538h(r1, r8)
            r12 = 9
            if (r5 == r12) goto L_0x030d
            r12 = 17
            if (r5 != r12) goto L_0x02ad
            goto L_0x030d
        L_0x02ad:
            r12 = 27
            if (r5 == r12) goto L_0x02fd
            r12 = 49
            if (r5 != r12) goto L_0x02b6
            goto L_0x02fd
        L_0x02b6:
            r12 = 12
            if (r5 == r12) goto L_0x02ed
            r12 = 30
            if (r5 == r12) goto L_0x02ed
            r12 = 44
            if (r5 != r12) goto L_0x02c3
            goto L_0x02ed
        L_0x02c3:
            r12 = 50
            if (r5 != r12) goto L_0x02e3
            int r12 = r22 + 1
            r13[r22] = r9
            int r22 = r9 / 3
            int r22 = r22 + r22
            int r27 = r7 + 1
            r7 = r17[r7]
            r11[r22] = r7
            r7 = r2 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x02e6
            int r7 = r27 + 1
            int r22 = r22 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02e3:
            r25 = 1
            goto L_0x031a
        L_0x02e6:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x031b
        L_0x02ed:
            if (r10 != 0) goto L_0x02e3
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
            goto L_0x030a
        L_0x02fd:
            r25 = 1
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
        L_0x030a:
            r12 = r27
            goto L_0x031b
        L_0x030d:
            r25 = 1
            int r12 = r9 / 3
            int r12 = r12 + r12
            int r12 = r12 + 1
            java.lang.Class r27 = r8.getType()
            r11[r12] = r27
        L_0x031a:
            r12 = r7
        L_0x031b:
            long r7 = r15.objectFieldOffset(r8)
            int r8 = (int) r7
            r7 = r2 & 4096(0x1000, float:5.74E-42)
            r27 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r11
            r11 = 4096(0x1000, float:5.74E-42)
            if (r7 != r11) goto L_0x0378
            r7 = 17
            if (r5 > r7) goto L_0x0378
            int r7 = r3 + 1
            char r3 = r0.charAt(r3)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r11) goto L_0x0354
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x033e:
            int r27 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r11) goto L_0x0350
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r26
            r3 = r3 | r7
            int r26 = r26 + 13
            r7 = r27
            goto L_0x033e
        L_0x0350:
            int r7 = r7 << r26
            r3 = r3 | r7
            goto L_0x0356
        L_0x0354:
            r27 = r7
        L_0x0356:
            int r7 = r6 + r6
            int r26 = r3 / 32
            int r7 = r7 + r26
            r11 = r17[r7]
            r30 = r0
            boolean r0 = r11 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0367
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            goto L_0x036f
        L_0x0367:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = m26538h(r1, r11)
            r17[r7] = r11
        L_0x036f:
            r7 = r1
            long r0 = r15.objectFieldOffset(r11)
            int r1 = (int) r0
            int r3 = r3 % 32
            goto L_0x0381
        L_0x0378:
            r30 = r0
            r7 = r1
            r27 = r3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
        L_0x0381:
            r0 = 18
            if (r5 < r0) goto L_0x038f
            r0 = 49
            if (r5 > r0) goto L_0x038f
            int r0 = r23 + 1
            r13[r23] = r8
            r23 = r0
        L_0x038f:
            r16 = r12
        L_0x0391:
            int r0 = r9 + 1
            r31[r9] = r4
            int r4 = r0 + 1
            r9 = r2 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x039e
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x039f
        L_0x039e:
            r9 = 0
        L_0x039f:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03a6
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a7
        L_0x03a6:
            r2 = 0
        L_0x03a7:
            r2 = r2 | r9
            int r5 = r5 << 20
            r2 = r2 | r5
            r2 = r2 | r8
            r31[r0] = r2
            int r9 = r4 + 1
            int r0 = r3 << 20
            r0 = r0 | r1
            r31[r4] = r0
            r1 = r7
            r8 = r14
            r14 = r24
            r4 = r27
            r3 = r28
            r11 = r29
            r0 = r30
            r7 = r31
            r12 = r32
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0183
        L_0x03ca:
            r31 = r7
            r29 = r11
            r32 = r12
            r24 = r14
            r14 = r8
            com.onedelhi.secure.r96 r0 = new com.onedelhi.secure.r96
            r4 = r0
            com.onedelhi.secure.i96 r9 = r34.mo14104a()
            r11 = 0
            r1 = r29
            r20 = 0
            r5 = r31
            r6 = r1
            r7 = r14
            r8 = r32
            r12 = r13
            r13 = r24
            r14 = r21
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.r96.m26542u(com.onedelhi.secure.jb6, com.onedelhi.secure.ua6, com.onedelhi.secure.x76, com.onedelhi.secure.ld6, com.onedelhi.secure.d46, com.onedelhi.secure.t86):com.onedelhi.secure.r96");
    }

    /* renamed from: v */
    public static int m26543v(Object obj, long j) {
        return ((Integer) kf6.m19750f(obj, j)).intValue();
    }

    /* renamed from: A */
    public final int mo23727A(int i) {
        if (i < this.f19726a || i > this.f19736b) {
            return -1;
        }
        return mo23730D(i, 0);
    }

    /* renamed from: B */
    public final int mo23728B(int i, int i2) {
        if (i < this.f19726a || i > this.f19736b) {
            return -1;
        }
        return mo23730D(i, i2);
    }

    /* renamed from: C */
    public final int mo23729C(int i) {
        return this.f19734a[i + 2];
    }

    /* renamed from: D */
    public final int mo23730D(int i, int i2) {
        int length = (this.f19734a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f19734a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: F */
    public final int mo23731F(int i) {
        return this.f19734a[i + 1];
    }

    /* renamed from: H */
    public final n56 mo23732H(int i) {
        int i2 = i / 3;
        return (n56) this.f19735a[i2 + i2 + 1];
    }

    /* renamed from: I */
    public final mb6 mo23733I(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        mb6 mb6 = (mb6) this.f19735a[i3];
        if (mb6 != null) {
            return mb6;
        }
        mb6 b = db6.m13046a().mo14594b((Class) this.f19735a[i3 + 1]);
        this.f19735a[i3] = b;
        return b;
    }

    /* renamed from: J */
    public final Object mo23734J(int i) {
        int i2 = i / 3;
        return this.f19735a[i2 + i2];
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0093, code lost:
        r2 = r2 * 53;
        r3 = m26543v(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a8, code lost:
        r2 = r2 * 53;
        r3 = m26537G(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00da, code lost:
        if (r3 != null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dd, code lost:
        r2 = r2 * 53;
        r3 = com.onedelhi.secure.kf6.m19750f(r9, r5).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ec, code lost:
        if (r3 != null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ee, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f2, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f6, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) com.onedelhi.secure.kf6.m19750f(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0109, code lost:
        r3 = com.onedelhi.secure.t56.m28109a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0122, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012d, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0131, code lost:
        r3 = com.onedelhi.secure.t56.m28111c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0135, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0136, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo20293a(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.f19734a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x013a
            int r3 = r8.mo23731F(r1)
            int[] r4 = r8.f19734a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = m26536E(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0127;
                case 1: goto L_0x011c;
                case 2: goto L_0x0115;
                case 3: goto L_0x0115;
                case 4: goto L_0x010e;
                case 5: goto L_0x0115;
                case 6: goto L_0x010e;
                case 7: goto L_0x0103;
                case 8: goto L_0x00f6;
                case 9: goto L_0x00e8;
                case 10: goto L_0x00dd;
                case 11: goto L_0x010e;
                case 12: goto L_0x010e;
                case 13: goto L_0x010e;
                case 14: goto L_0x0115;
                case 15: goto L_0x010e;
                case 16: goto L_0x0115;
                case 17: goto L_0x00d6;
                case 18: goto L_0x00dd;
                case 19: goto L_0x00dd;
                case 20: goto L_0x00dd;
                case 21: goto L_0x00dd;
                case 22: goto L_0x00dd;
                case 23: goto L_0x00dd;
                case 24: goto L_0x00dd;
                case 25: goto L_0x00dd;
                case 26: goto L_0x00dd;
                case 27: goto L_0x00dd;
                case 28: goto L_0x00dd;
                case 29: goto L_0x00dd;
                case 30: goto L_0x00dd;
                case 31: goto L_0x00dd;
                case 32: goto L_0x00dd;
                case 33: goto L_0x00dd;
                case 34: goto L_0x00dd;
                case 35: goto L_0x00dd;
                case 36: goto L_0x00dd;
                case 37: goto L_0x00dd;
                case 38: goto L_0x00dd;
                case 39: goto L_0x00dd;
                case 40: goto L_0x00dd;
                case 41: goto L_0x00dd;
                case 42: goto L_0x00dd;
                case 43: goto L_0x00dd;
                case 44: goto L_0x00dd;
                case 45: goto L_0x00dd;
                case 46: goto L_0x00dd;
                case 47: goto L_0x00dd;
                case 48: goto L_0x00dd;
                case 49: goto L_0x00dd;
                case 50: goto L_0x00dd;
                case 51: goto L_0x00c3;
                case 52: goto L_0x00b0;
                case 53: goto L_0x00a2;
                case 54: goto L_0x009b;
                case 55: goto L_0x008d;
                case 56: goto L_0x0086;
                case 57: goto L_0x007f;
                case 58: goto L_0x006b;
                case 59: goto L_0x0063;
                case 60: goto L_0x005b;
                case 61: goto L_0x0053;
                case 62: goto L_0x004c;
                case 63: goto L_0x0045;
                case 64: goto L_0x003e;
                case 65: goto L_0x0036;
                case 66: goto L_0x002f;
                case 67: goto L_0x0027;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0136
        L_0x001f:
            boolean r3 = r8.mo23742q(r9, r4, r1)
            if (r3 == 0) goto L_0x0136
            goto L_0x00dd
        L_0x0027:
            boolean r3 = r8.mo23742q(r9, r4, r1)
            if (r3 == 0) goto L_0x0136
            goto L_0x00a8
        L_0x002f:
            boolean r3 = r8.mo23742q(r9, r4, r1)
            if (r3 == 0) goto L_0x0136
            goto L_0x004b
        L_0x0036:
            boolean r3 = r8.mo23742q(r9, r4, r1)
            if (r3 == 0) goto L_0x0136
            goto L_0x00a8
        L_0x003e:
            boolean r3 = r8.mo23742q(r9, r4, r1)
            if (r3 == 0) goto L_0x0136
            goto L_0x004b
        L_0x0045:
            boolean r3 = r8.mo23742q(r9, r4, r1)
            if (r3 == 0) goto L_0x0136
        L_0x004b:
            goto L_0x0093
        L_0x004c:
            boolean r3 = r8.mo23742q(r9, r4, r1)
            if (r3 == 0) goto L_0x0136
            goto L_0x0093
        L_0x0053:
            boolean r3 = r8.mo23742q(r9, r4, r1)
            if (r3 == 0) goto L_0x0136
            goto L_0x00dd
        L_0x005b:
            boolean r3 = r8.mo23742q(r9, r4, r1)
            if (r3 == 0) goto L_0x0136
            goto L_0x00dd
        L_0x0063:
            boolean r3 = r8.mo23742q(r9, r4, r1)
            if (r3 == 0) goto L_0x0136
            goto L_0x00f6
        L_0x006b:
            boolean r3 = r8.mo23742q(r9, r4, r1)
            if (r3 == 0) goto L_0x0136
            int r2 = r2 * 53
            java.lang.Object r3 = com.onedelhi.secure.kf6.m19750f(r9, r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L_0x0109
        L_0x007f:
            boolean r3 = r8.mo23742q(r9, r4, r1)
            if (r3 == 0) goto L_0x0136
            goto L_0x0093
        L_0x0086:
            boolean r3 = r8.mo23742q(r9, r4, r1)
            if (r3 == 0) goto L_0x0136
            goto L_0x00a8
        L_0x008d:
            boolean r3 = r8.mo23742q(r9, r4, r1)
            if (r3 == 0) goto L_0x0136
        L_0x0093:
            int r2 = r2 * 53
            int r3 = m26543v(r9, r5)
            goto L_0x0135
        L_0x009b:
            boolean r3 = r8.mo23742q(r9, r4, r1)
            if (r3 == 0) goto L_0x0136
            goto L_0x00a8
        L_0x00a2:
            boolean r3 = r8.mo23742q(r9, r4, r1)
            if (r3 == 0) goto L_0x0136
        L_0x00a8:
            int r2 = r2 * 53
            long r3 = m26537G(r9, r5)
            goto L_0x0131
        L_0x00b0:
            boolean r3 = r8.mo23742q(r9, r4, r1)
            if (r3 == 0) goto L_0x0136
            int r2 = r2 * 53
            java.lang.Object r3 = com.onedelhi.secure.kf6.m19750f(r9, r5)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L_0x0122
        L_0x00c3:
            boolean r3 = r8.mo23742q(r9, r4, r1)
            if (r3 == 0) goto L_0x0136
            int r2 = r2 * 53
            java.lang.Object r3 = com.onedelhi.secure.kf6.m19750f(r9, r5)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            goto L_0x012d
        L_0x00d6:
            java.lang.Object r3 = com.onedelhi.secure.kf6.m19750f(r9, r5)
            if (r3 == 0) goto L_0x00f2
            goto L_0x00ee
        L_0x00dd:
            int r2 = r2 * 53
            java.lang.Object r3 = com.onedelhi.secure.kf6.m19750f(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0135
        L_0x00e8:
            java.lang.Object r3 = com.onedelhi.secure.kf6.m19750f(r9, r5)
            if (r3 == 0) goto L_0x00f2
        L_0x00ee:
            int r7 = r3.hashCode()
        L_0x00f2:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0136
        L_0x00f6:
            int r2 = r2 * 53
            java.lang.Object r3 = com.onedelhi.secure.kf6.m19750f(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0135
        L_0x0103:
            int r2 = r2 * 53
            boolean r3 = com.onedelhi.secure.kf6.m19764t(r9, r5)
        L_0x0109:
            int r3 = com.onedelhi.secure.t56.m28109a(r3)
            goto L_0x0135
        L_0x010e:
            int r2 = r2 * 53
            int r3 = com.onedelhi.secure.kf6.m19747c(r9, r5)
            goto L_0x0135
        L_0x0115:
            int r2 = r2 * 53
            long r3 = com.onedelhi.secure.kf6.m19748d(r9, r5)
            goto L_0x0131
        L_0x011c:
            int r2 = r2 * 53
            float r3 = com.onedelhi.secure.kf6.m19746b(r9, r5)
        L_0x0122:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0135
        L_0x0127:
            int r2 = r2 * 53
            double r3 = com.onedelhi.secure.kf6.m19745a(r9, r5)
        L_0x012d:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x0131:
            int r3 = com.onedelhi.secure.t56.m28111c(r3)
        L_0x0135:
            int r2 = r2 + r3
        L_0x0136:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x013a:
            int r2 = r2 * 53
            com.onedelhi.secure.ld6 r0 = r8.f19729a
            java.lang.Object r9 = r0.mo19466a(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.r96.mo20293a(java.lang.Object):int");
    }

    /* renamed from: b */
    public final boolean mo20294b(Object obj) {
        int i;
        int i2;
        Object obj2 = obj;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f19738c) {
            int i6 = this.f19737b[i5];
            int i7 = this.f19734a[i6];
            int F = mo23731F(i6);
            int i8 = this.f19734a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f19724a.getInt(obj2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & F) != 0 && !mo23741o(obj, i6, i2, i, i10)) {
                return false;
            }
            int E = m26536E(F);
            if (E != 9 && E != 17) {
                if (E != 27) {
                    if (E == 60 || E == 68) {
                        if (mo23742q(obj2, i7, i6) && !m26539p(obj2, F, mo23733I(i6))) {
                            return false;
                        }
                    } else if (E != 49) {
                        if (E == 50 && !((q86) kf6.m19750f(obj2, (long) (F & 1048575))).isEmpty()) {
                            n86 n86 = (n86) mo23734J(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) kf6.m19750f(obj2, (long) (F & 1048575));
                if (!list.isEmpty()) {
                    mb6 I = mo23733I(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!I.mo20294b(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (mo23741o(obj, i6, i2, i, i10) && !m26539p(obj2, F, mo23733I(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo20295c(Object obj) {
        int i;
        int i2 = this.f19738c;
        while (true) {
            i = this.f19739d;
            if (i2 >= i) {
                break;
            }
            long F = (long) (mo23731F(this.f19737b[i2]) & 1048575);
            Object f = kf6.m19750f(obj, F);
            if (f != null) {
                ((q86) f).mo22948f();
                kf6.m19760p(obj, F, f);
            }
            i2++;
        }
        int length = this.f19737b.length;
        while (i < length) {
            this.f19732a.mo19293a(obj, (long) this.f19737b[i]);
            i++;
        }
        this.f19729a.mo19470e(obj);
    }

    /* renamed from: d */
    public final void mo20296d(Object obj, byte[] bArr, int i, int i2, u06 u06) throws IOException {
        if (this.f19733a) {
            mo23746y(obj, bArr, i, i2, u06);
        } else {
            mo23743r(obj, bArr, i, i2, 0, u06);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b6, code lost:
        r2 = r2 + 3;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo20297e(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            int[] r0 = r8.f19734a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r2 >= r0) goto L_0x01ba
            int r3 = r8.mo23731F(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r3 & r4
            long r5 = (long) r5
            int r3 = m26536E(r3)
            switch(r3) {
                case 0: goto L_0x019a;
                case 1: goto L_0x0181;
                case 2: goto L_0x016e;
                case 3: goto L_0x015b;
                case 4: goto L_0x014a;
                case 5: goto L_0x0136;
                case 6: goto L_0x0124;
                case 7: goto L_0x0112;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00be;
                case 12: goto L_0x00ac;
                case 13: goto L_0x009a;
                case 14: goto L_0x0086;
                case 15: goto L_0x0074;
                case 16: goto L_0x0060;
                case 17: goto L_0x004a;
                case 18: goto L_0x003a;
                case 19: goto L_0x003a;
                case 20: goto L_0x003a;
                case 21: goto L_0x003a;
                case 22: goto L_0x003a;
                case 23: goto L_0x003a;
                case 24: goto L_0x003a;
                case 25: goto L_0x003a;
                case 26: goto L_0x003a;
                case 27: goto L_0x003a;
                case 28: goto L_0x003a;
                case 29: goto L_0x003a;
                case 30: goto L_0x003a;
                case 31: goto L_0x003a;
                case 32: goto L_0x003a;
                case 33: goto L_0x003a;
                case 34: goto L_0x003a;
                case 35: goto L_0x003a;
                case 36: goto L_0x003a;
                case 37: goto L_0x003a;
                case 38: goto L_0x003a;
                case 39: goto L_0x003a;
                case 40: goto L_0x003a;
                case 41: goto L_0x003a;
                case 42: goto L_0x003a;
                case 43: goto L_0x003a;
                case 44: goto L_0x003a;
                case 45: goto L_0x003a;
                case 46: goto L_0x003a;
                case 47: goto L_0x003a;
                case 48: goto L_0x003a;
                case 49: goto L_0x003a;
                case 50: goto L_0x003a;
                case 51: goto L_0x001a;
                case 52: goto L_0x001a;
                case 53: goto L_0x001a;
                case 54: goto L_0x001a;
                case 55: goto L_0x001a;
                case 56: goto L_0x001a;
                case 57: goto L_0x001a;
                case 58: goto L_0x001a;
                case 59: goto L_0x001a;
                case 60: goto L_0x001a;
                case 61: goto L_0x001a;
                case 62: goto L_0x001a;
                case 63: goto L_0x001a;
                case 64: goto L_0x001a;
                case 65: goto L_0x001a;
                case 66: goto L_0x001a;
                case 67: goto L_0x001a;
                case 68: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x01b6
        L_0x001a:
            int r3 = r8.mo23729C(r2)
            r3 = r3 & r4
            long r3 = (long) r3
            int r7 = com.onedelhi.secure.kf6.m19747c(r9, r3)
            int r3 = com.onedelhi.secure.kf6.m19747c(r10, r3)
            if (r7 != r3) goto L_0x01b5
            java.lang.Object r3 = com.onedelhi.secure.kf6.m19750f(r9, r5)
            java.lang.Object r4 = com.onedelhi.secure.kf6.m19750f(r10, r5)
            boolean r3 = com.onedelhi.secure.sb6.m27429h(r3, r4)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x003a:
            java.lang.Object r3 = com.onedelhi.secure.kf6.m19750f(r9, r5)
            java.lang.Object r4 = com.onedelhi.secure.kf6.m19750f(r10, r5)
            boolean r3 = com.onedelhi.secure.sb6.m27429h(r3, r4)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x004a:
            boolean r3 = r8.mo23739m(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = com.onedelhi.secure.kf6.m19750f(r9, r5)
            java.lang.Object r4 = com.onedelhi.secure.kf6.m19750f(r10, r5)
            boolean r3 = com.onedelhi.secure.sb6.m27429h(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0060:
            boolean r3 = r8.mo23739m(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.onedelhi.secure.kf6.m19748d(r9, r5)
            long r5 = com.onedelhi.secure.kf6.m19748d(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0074:
            boolean r3 = r8.mo23739m(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.onedelhi.secure.kf6.m19747c(r9, r5)
            int r4 = com.onedelhi.secure.kf6.m19747c(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0086:
            boolean r3 = r8.mo23739m(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.onedelhi.secure.kf6.m19748d(r9, r5)
            long r5 = com.onedelhi.secure.kf6.m19748d(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x009a:
            boolean r3 = r8.mo23739m(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.onedelhi.secure.kf6.m19747c(r9, r5)
            int r4 = com.onedelhi.secure.kf6.m19747c(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00ac:
            boolean r3 = r8.mo23739m(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.onedelhi.secure.kf6.m19747c(r9, r5)
            int r4 = com.onedelhi.secure.kf6.m19747c(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00be:
            boolean r3 = r8.mo23739m(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.onedelhi.secure.kf6.m19747c(r9, r5)
            int r4 = com.onedelhi.secure.kf6.m19747c(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00d0:
            boolean r3 = r8.mo23739m(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = com.onedelhi.secure.kf6.m19750f(r9, r5)
            java.lang.Object r4 = com.onedelhi.secure.kf6.m19750f(r10, r5)
            boolean r3 = com.onedelhi.secure.sb6.m27429h(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00e6:
            boolean r3 = r8.mo23739m(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = com.onedelhi.secure.kf6.m19750f(r9, r5)
            java.lang.Object r4 = com.onedelhi.secure.kf6.m19750f(r10, r5)
            boolean r3 = com.onedelhi.secure.sb6.m27429h(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00fc:
            boolean r3 = r8.mo23739m(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = com.onedelhi.secure.kf6.m19750f(r9, r5)
            java.lang.Object r4 = com.onedelhi.secure.kf6.m19750f(r10, r5)
            boolean r3 = com.onedelhi.secure.sb6.m27429h(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0112:
            boolean r3 = r8.mo23739m(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            boolean r3 = com.onedelhi.secure.kf6.m19764t(r9, r5)
            boolean r4 = com.onedelhi.secure.kf6.m19764t(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0124:
            boolean r3 = r8.mo23739m(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.onedelhi.secure.kf6.m19747c(r9, r5)
            int r4 = com.onedelhi.secure.kf6.m19747c(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0136:
            boolean r3 = r8.mo23739m(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.onedelhi.secure.kf6.m19748d(r9, r5)
            long r5 = com.onedelhi.secure.kf6.m19748d(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x014a:
            boolean r3 = r8.mo23739m(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.onedelhi.secure.kf6.m19747c(r9, r5)
            int r4 = com.onedelhi.secure.kf6.m19747c(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x015b:
            boolean r3 = r8.mo23739m(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.onedelhi.secure.kf6.m19748d(r9, r5)
            long r5 = com.onedelhi.secure.kf6.m19748d(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x016e:
            boolean r3 = r8.mo23739m(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.onedelhi.secure.kf6.m19748d(r9, r5)
            long r5 = com.onedelhi.secure.kf6.m19748d(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0181:
            boolean r3 = r8.mo23739m(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            float r3 = com.onedelhi.secure.kf6.m19746b(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            float r4 = com.onedelhi.secure.kf6.m19746b(r10, r5)
            int r4 = java.lang.Float.floatToIntBits(r4)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x019a:
            boolean r3 = r8.mo23739m(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            double r3 = com.onedelhi.secure.kf6.m19745a(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = com.onedelhi.secure.kf6.m19745a(r10, r5)
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x01b5:
            return r1
        L_0x01b6:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01ba:
            com.onedelhi.secure.ld6 r0 = r8.f19729a
            java.lang.Object r9 = r0.mo19466a(r9)
            com.onedelhi.secure.ld6 r0 = r8.f19729a
            java.lang.Object r10 = r0.mo19466a(r10)
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x01cd
            return r1
        L_0x01cd:
            r9 = 1
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.r96.mo20297e(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final Object mo20298f() {
        return ((e56) this.f19728a).mo15053i(4, (Object) null, (Object) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        com.onedelhi.secure.kf6.m19760p(r7, r2, com.onedelhi.secure.kf6.m19750f(r8, r2));
        mo23738l(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0089, code lost:
        com.onedelhi.secure.kf6.m19760p(r7, r2, com.onedelhi.secure.kf6.m19750f(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b3, code lost:
        com.onedelhi.secure.kf6.m19758n(r7, r2, com.onedelhi.secure.kf6.m19747c(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c8, code lost:
        com.onedelhi.secure.kf6.m19759o(r7, r2, com.onedelhi.secure.kf6.m19748d(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00eb, code lost:
        mo23737k(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ee, code lost:
        r0 = r0 + 3;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20299g(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            java.util.Objects.requireNonNull(r8)
            r0 = 0
        L_0x0004:
            int[] r1 = r6.f19734a
            int r1 = r1.length
            if (r0 >= r1) goto L_0x00f2
            int r1 = r6.mo23731F(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.f19734a
            r4 = r4[r0]
            int r1 = m26536E(r1)
            switch(r1) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00d0;
                case 2: goto L_0x00c2;
                case 3: goto L_0x00bb;
                case 4: goto L_0x00ad;
                case 5: goto L_0x00a6;
                case 6: goto L_0x009f;
                case 7: goto L_0x0091;
                case 8: goto L_0x0083;
                case 9: goto L_0x007e;
                case 10: goto L_0x0077;
                case 11: goto L_0x0070;
                case 12: goto L_0x0069;
                case 13: goto L_0x0062;
                case 14: goto L_0x005a;
                case 15: goto L_0x0053;
                case 16: goto L_0x004b;
                case 17: goto L_0x007e;
                case 18: goto L_0x0044;
                case 19: goto L_0x0044;
                case 20: goto L_0x0044;
                case 21: goto L_0x0044;
                case 22: goto L_0x0044;
                case 23: goto L_0x0044;
                case 24: goto L_0x0044;
                case 25: goto L_0x0044;
                case 26: goto L_0x0044;
                case 27: goto L_0x0044;
                case 28: goto L_0x0044;
                case 29: goto L_0x0044;
                case 30: goto L_0x0044;
                case 31: goto L_0x0044;
                case 32: goto L_0x0044;
                case 33: goto L_0x0044;
                case 34: goto L_0x0044;
                case 35: goto L_0x0044;
                case 36: goto L_0x0044;
                case 37: goto L_0x0044;
                case 38: goto L_0x0044;
                case 39: goto L_0x0044;
                case 40: goto L_0x0044;
                case 41: goto L_0x0044;
                case 42: goto L_0x0044;
                case 43: goto L_0x0044;
                case 44: goto L_0x0044;
                case 45: goto L_0x0044;
                case 46: goto L_0x0044;
                case 47: goto L_0x0044;
                case 48: goto L_0x0044;
                case 49: goto L_0x0044;
                case 50: goto L_0x003d;
                case 51: goto L_0x002b;
                case 52: goto L_0x002b;
                case 53: goto L_0x002b;
                case 54: goto L_0x002b;
                case 55: goto L_0x002b;
                case 56: goto L_0x002b;
                case 57: goto L_0x002b;
                case 58: goto L_0x002b;
                case 59: goto L_0x002b;
                case 60: goto L_0x0026;
                case 61: goto L_0x001f;
                case 62: goto L_0x001f;
                case 63: goto L_0x001f;
                case 64: goto L_0x001f;
                case 65: goto L_0x001f;
                case 66: goto L_0x001f;
                case 67: goto L_0x001f;
                case 68: goto L_0x0026;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x00ee
        L_0x001f:
            boolean r1 = r6.mo23742q(r8, r4, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0031
        L_0x0026:
            r6.mo23736j(r7, r8, r0)
            goto L_0x00ee
        L_0x002b:
            boolean r1 = r6.mo23742q(r8, r4, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0031:
            java.lang.Object r1 = com.onedelhi.secure.kf6.m19750f(r8, r2)
            com.onedelhi.secure.kf6.m19760p(r7, r2, r1)
            r6.mo23738l(r7, r4, r0)
            goto L_0x00ee
        L_0x003d:
            com.onedelhi.secure.t86 r1 = r6.f19730a
            com.onedelhi.secure.sb6.m27430i(r1, r7, r8, r2)
            goto L_0x00ee
        L_0x0044:
            com.onedelhi.secure.x76 r1 = r6.f19732a
            r1.mo19294b(r7, r8, r2)
            goto L_0x00ee
        L_0x004b:
            boolean r1 = r6.mo23740n(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0053:
            boolean r1 = r6.mo23740n(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x005a:
            boolean r1 = r6.mo23740n(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0062:
            boolean r1 = r6.mo23740n(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x0069:
            boolean r1 = r6.mo23740n(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x006f:
            goto L_0x00b3
        L_0x0070:
            boolean r1 = r6.mo23740n(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x0077:
            boolean r1 = r6.mo23740n(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0089
        L_0x007e:
            r6.mo23735i(r7, r8, r0)
            goto L_0x00ee
        L_0x0083:
            boolean r1 = r6.mo23740n(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0089:
            java.lang.Object r1 = com.onedelhi.secure.kf6.m19750f(r8, r2)
            com.onedelhi.secure.kf6.m19760p(r7, r2, r1)
            goto L_0x00eb
        L_0x0091:
            boolean r1 = r6.mo23740n(r8, r0)
            if (r1 == 0) goto L_0x00ee
            boolean r1 = com.onedelhi.secure.kf6.m19764t(r8, r2)
            com.onedelhi.secure.kf6.m19755k(r7, r2, r1)
            goto L_0x00eb
        L_0x009f:
            boolean r1 = r6.mo23740n(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x00a6:
            boolean r1 = r6.mo23740n(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00ad:
            boolean r1 = r6.mo23740n(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00b3:
            int r1 = com.onedelhi.secure.kf6.m19747c(r8, r2)
            com.onedelhi.secure.kf6.m19758n(r7, r2, r1)
            goto L_0x00eb
        L_0x00bb:
            boolean r1 = r6.mo23740n(r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00c2:
            boolean r1 = r6.mo23740n(r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00c8:
            long r4 = com.onedelhi.secure.kf6.m19748d(r8, r2)
            com.onedelhi.secure.kf6.m19759o(r7, r2, r4)
            goto L_0x00eb
        L_0x00d0:
            boolean r1 = r6.mo23740n(r8, r0)
            if (r1 == 0) goto L_0x00ee
            float r1 = com.onedelhi.secure.kf6.m19746b(r8, r2)
            com.onedelhi.secure.kf6.m19757m(r7, r2, r1)
            goto L_0x00eb
        L_0x00de:
            boolean r1 = r6.mo23740n(r8, r0)
            if (r1 == 0) goto L_0x00ee
            double r4 = com.onedelhi.secure.kf6.m19745a(r8, r2)
            com.onedelhi.secure.kf6.m19756l(r7, r2, r4)
        L_0x00eb:
            r6.mo23737k(r7, r0)
        L_0x00ee:
            int r0 = r0 + 3
            goto L_0x0004
        L_0x00f2:
            com.onedelhi.secure.ld6 r0 = r6.f19729a
            com.onedelhi.secure.sb6.m27427f(r0, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.r96.mo20299g(java.lang.Object, java.lang.Object):void");
    }

    /* renamed from: i */
    public final void mo23735i(Object obj, Object obj2, int i) {
        long F = (long) (mo23731F(i) & 1048575);
        if (mo23740n(obj2, i)) {
            Object f = kf6.m19750f(obj, F);
            Object f2 = kf6.m19750f(obj2, F);
            if (f != null && f2 != null) {
                f2 = t56.m28115g(f, f2);
            } else if (f2 == null) {
                return;
            }
            kf6.m19760p(obj, F, f2);
            mo23737k(obj, i);
        }
    }

    /* renamed from: j */
    public final void mo23736j(Object obj, Object obj2, int i) {
        int F = mo23731F(i);
        int i2 = this.f19734a[i];
        long j = (long) (F & 1048575);
        if (mo23742q(obj2, i2, i)) {
            Object f = mo23742q(obj, i2, i) ? kf6.m19750f(obj, j) : null;
            Object f2 = kf6.m19750f(obj2, j);
            if (f != null && f2 != null) {
                f2 = t56.m28115g(f, f2);
            } else if (f2 == null) {
                return;
            }
            kf6.m19760p(obj, j, f2);
            mo23738l(obj, i2, i);
        }
    }

    /* renamed from: k */
    public final void mo23737k(Object obj, int i) {
        int C = mo23729C(i);
        long j = (long) (1048575 & C);
        if (j != 1048575) {
            kf6.m19758n(obj, j, (1 << (C >>> 20)) | kf6.m19747c(obj, j));
        }
    }

    /* renamed from: l */
    public final void mo23738l(Object obj, int i, int i2) {
        kf6.m19758n(obj, (long) (mo23729C(i2) & 1048575), i);
    }

    /* renamed from: m */
    public final boolean mo23739m(Object obj, Object obj2, int i) {
        return mo23740n(obj, i) == mo23740n(obj2, i);
    }

    /* renamed from: n */
    public final boolean mo23740n(Object obj, int i) {
        int C = mo23729C(i);
        long j = (long) (C & 1048575);
        if (j != 1048575) {
            return (kf6.m19747c(obj, j) & (1 << (C >>> 20))) != 0;
        }
        int F = mo23731F(i);
        long j2 = (long) (F & 1048575);
        switch (m26536E(F)) {
            case 0:
                return Double.doubleToRawLongBits(kf6.m19745a(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(kf6.m19746b(obj, j2)) != 0;
            case 2:
                return kf6.m19748d(obj, j2) != 0;
            case 3:
                return kf6.m19748d(obj, j2) != 0;
            case 4:
                return kf6.m19747c(obj, j2) != 0;
            case 5:
                return kf6.m19748d(obj, j2) != 0;
            case 6:
                return kf6.m19747c(obj, j2) != 0;
            case 7:
                return kf6.m19764t(obj, j2);
            case 8:
                Object f = kf6.m19750f(obj, j2);
                if (f instanceof String) {
                    return !((String) f).isEmpty();
                }
                if (f instanceof i36) {
                    return !i36.f13476a.equals(f);
                }
                throw new IllegalArgumentException();
            case 9:
                return kf6.m19750f(obj, j2) != null;
            case 10:
                return !i36.f13476a.equals(kf6.m19750f(obj, j2));
            case 11:
                return kf6.m19747c(obj, j2) != 0;
            case 12:
                return kf6.m19747c(obj, j2) != 0;
            case 13:
                return kf6.m19747c(obj, j2) != 0;
            case 14:
                return kf6.m19748d(obj, j2) != 0;
            case 15:
                return kf6.m19747c(obj, j2) != 0;
            case 16:
                return kf6.m19748d(obj, j2) != 0;
            case 17:
                return kf6.m19750f(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: o */
    public final boolean mo23741o(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? mo23740n(obj, i) : (i3 & i4) != 0;
    }

    /* renamed from: q */
    public final boolean mo23742q(Object obj, int i, int i2) {
        return kf6.m19747c(obj, (long) (mo23729C(i2) & 1048575)) == i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0336, code lost:
        if (r0 != r15) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0350, code lost:
        r7 = r33;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0371, code lost:
        if (r0 != r15) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0393, code lost:
        if (r0 != r15) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fd, code lost:
        r10.putInt(r14, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0145, code lost:
        r10.putObject(r14, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0148, code lost:
        r5 = r6 | r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014a, code lost:
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0176, code lost:
        r21 = r3;
        r17 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01d6, code lost:
        r5 = r6 | r23;
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d9, code lost:
        r3 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01fb, code lost:
        r17 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01fd, code lost:
        r21 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x026b, code lost:
        r0 = r13 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x026d, code lost:
        r5 = r6 | r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x026f, code lost:
        r13 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0271, code lost:
        r3 = r11;
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0274, code lost:
        r2 = r19;
        r6 = r24;
        r11 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x027c, code lost:
        r21 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0291, code lost:
        r7 = r33;
        r23 = r6;
        r27 = r10;
        r22 = r11;
        r8 = r17;
        r2 = r21;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo23743r(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.onedelhi.secure.u06 r34) throws java.io.IOException {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            sun.misc.Unsafe r10 = f19724a
            r16 = 0
            r0 = r31
            r1 = 0
            r2 = -1
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            if (r0 >= r13) goto L_0x03c4
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002a
            int r0 = com.onedelhi.secure.y06.m31823k(r0, r12, r1, r9)
            int r1 = r9.f21191a
            r4 = r1
            r1 = r0
            goto L_0x002b
        L_0x002a:
            r4 = r0
        L_0x002b:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r2) goto L_0x0038
            int r3 = r3 / r8
            int r2 = r15.mo23728B(r0, r3)
            goto L_0x003c
        L_0x0038:
            int r2 = r15.mo23727A(r0)
        L_0x003c:
            r3 = -1
            if (r2 != r3) goto L_0x004e
            r19 = r0
            r2 = r1
            r8 = r4
            r23 = r5
            r27 = r10
            r7 = r11
            r18 = -1
            r22 = 0
            goto L_0x0396
        L_0x004e:
            int[] r3 = r15.f19734a
            int r19 = r2 + 1
            r8 = r3[r19]
            int r11 = m26536E(r8)
            r19 = r0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r8 & r17
            r20 = r1
            long r0 = (long) r0
            r21 = r0
            r0 = 17
            if (r11 > r0) goto L_0x029f
            int r0 = r2 + 2
            r0 = r3[r0]
            int r3 = r0 >>> 20
            r1 = 1
            int r23 = r1 << r3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r3
            r17 = r4
            if (r0 == r6) goto L_0x0087
            if (r6 == r3) goto L_0x007f
            long r3 = (long) r6
            r10.putInt(r14, r3, r5)
        L_0x007f:
            long r3 = (long) r0
            int r5 = r10.getInt(r14, r3)
            r24 = r0
            goto L_0x0089
        L_0x0087:
            r24 = r6
        L_0x0089:
            r6 = r5
            r0 = 5
            switch(r11) {
                case 0: goto L_0x0254;
                case 1: goto L_0x023a;
                case 2: goto L_0x0217;
                case 3: goto L_0x0217;
                case 4: goto L_0x0201;
                case 5: goto L_0x01dc;
                case 6: goto L_0x01bf;
                case 7: goto L_0x019f;
                case 8: goto L_0x017c;
                case 9: goto L_0x014d;
                case 10: goto L_0x0130;
                case 11: goto L_0x0201;
                case 12: goto L_0x0101;
                case 13: goto L_0x01bf;
                case 14: goto L_0x01dc;
                case 15: goto L_0x00e5;
                case 16: goto L_0x00b8;
                default: goto L_0x008e;
            }
        L_0x008e:
            r11 = r2
            r13 = r20
            r4 = r21
            r0 = 3
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x027c
            com.onedelhi.secure.mb6 r0 = r15.mo23733I(r11)
            int r1 = r19 << 3
            r7 = r1 | 4
            r1 = r30
            r2 = r13
            r3 = r32
            r12 = r4
            r4 = r7
            r5 = r34
            int r0 = com.onedelhi.secure.y06.m31815c(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r23
            if (r1 != 0) goto L_0x027f
            java.lang.Object r1 = r9.f21194a
            goto L_0x0289
        L_0x00b8:
            if (r7 != 0) goto L_0x00db
            r3 = r20
            int r7 = com.onedelhi.secure.y06.m31825m(r12, r3, r9)
            long r0 = r9.f21192a
            long r4 = com.onedelhi.secure.u36.m29075b(r0)
            r0 = r10
            r1 = r29
            r11 = r2
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r21
            r8 = r17
            r0.putLong(r1, r2, r4)
            r5 = r6 | r23
            r0 = r7
            goto L_0x014a
        L_0x00db:
            r11 = r2
            r3 = r20
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x01fd
        L_0x00e5:
            r11 = r2
            r8 = r17
            r3 = r20
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x0176
            int r0 = com.onedelhi.secure.y06.m31822j(r12, r3, r9)
            int r1 = r9.f21191a
            int r1 = com.onedelhi.secure.u36.m29074a(r1)
            r4 = r21
        L_0x00fd:
            r10.putInt(r14, r4, r1)
            goto L_0x0148
        L_0x0101:
            r11 = r2
            r8 = r17
            r3 = r20
            r4 = r21
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x0176
            int r0 = com.onedelhi.secure.y06.m31822j(r12, r3, r9)
            int r1 = r9.f21191a
            com.onedelhi.secure.n56 r2 = r15.mo23732H(r11)
            if (r2 == 0) goto L_0x00fd
            boolean r2 = r2.mo20869a()
            if (r2 == 0) goto L_0x0122
            goto L_0x00fd
        L_0x0122:
            com.onedelhi.secure.od6 r2 = m26540s(r29)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo21901f(r8, r1)
            r5 = r6
            goto L_0x014a
        L_0x0130:
            r11 = r2
            r8 = r17
            r3 = r20
            r4 = r21
            r0 = 2
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x0176
            int r0 = com.onedelhi.secure.y06.m31813a(r12, r3, r9)
            java.lang.Object r1 = r9.f21194a
        L_0x0145:
            r10.putObject(r14, r4, r1)
        L_0x0148:
            r5 = r6 | r23
        L_0x014a:
            r1 = r8
            goto L_0x01d9
        L_0x014d:
            r11 = r2
            r8 = r17
            r3 = r20
            r4 = r21
            r0 = 2
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x0176
            com.onedelhi.secure.mb6 r0 = r15.mo23733I(r11)
            int r0 = com.onedelhi.secure.y06.m31816d(r0, r12, r3, r13, r9)
            r1 = r6 & r23
            if (r1 != 0) goto L_0x016b
            java.lang.Object r1 = r9.f21194a
            goto L_0x0145
        L_0x016b:
            java.lang.Object r1 = r10.getObject(r14, r4)
            java.lang.Object r2 = r9.f21194a
            java.lang.Object r1 = com.onedelhi.secure.t56.m28115g(r1, r2)
            goto L_0x0145
        L_0x0176:
            r21 = r3
            r17 = r8
            goto L_0x0291
        L_0x017c:
            r11 = r2
            r2 = r17
            r3 = r20
            r4 = r21
            r0 = 2
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x01fb
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r8
            if (r0 != 0) goto L_0x0195
            int r0 = com.onedelhi.secure.y06.m31819g(r12, r3, r9)
            goto L_0x0199
        L_0x0195:
            int r0 = com.onedelhi.secure.y06.m31820h(r12, r3, r9)
        L_0x0199:
            java.lang.Object r1 = r9.f21194a
            r10.putObject(r14, r4, r1)
            goto L_0x01d6
        L_0x019f:
            r11 = r2
            r2 = r17
            r3 = r20
            r4 = r21
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x01fb
            int r0 = com.onedelhi.secure.y06.m31825m(r12, r3, r9)
            long r7 = r9.f21192a
            r21 = 0
            int r3 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r3 == 0) goto L_0x01ba
            goto L_0x01bb
        L_0x01ba:
            r1 = 0
        L_0x01bb:
            com.onedelhi.secure.kf6.m19755k(r14, r4, r1)
            goto L_0x01d6
        L_0x01bf:
            r11 = r2
            r2 = r17
            r3 = r20
            r4 = r21
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x01fb
            int r0 = com.onedelhi.secure.y06.m31814b(r12, r3)
            r10.putInt(r14, r4, r0)
            int r0 = r3 + 4
        L_0x01d6:
            r5 = r6 | r23
            r1 = r2
        L_0x01d9:
            r3 = r11
            goto L_0x0274
        L_0x01dc:
            r11 = r2
            r2 = r17
            r3 = r20
            r4 = r21
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r1) goto L_0x01fb
            long r7 = com.onedelhi.secure.y06.m31826n(r12, r3)
            r0 = r10
            r1 = r29
            r17 = r2
            r13 = r3
            r2 = r4
            r4 = r7
            r0.putLong(r1, r2, r4)
            goto L_0x026b
        L_0x01fb:
            r17 = r2
        L_0x01fd:
            r21 = r3
            goto L_0x0291
        L_0x0201:
            r11 = r2
            r13 = r20
            r4 = r21
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x027c
            int r0 = com.onedelhi.secure.y06.m31822j(r12, r13, r9)
            int r1 = r9.f21191a
            r10.putInt(r14, r4, r1)
            goto L_0x026d
        L_0x0217:
            r11 = r2
            r13 = r20
            r4 = r21
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x027c
            int r7 = com.onedelhi.secure.y06.m31825m(r12, r13, r9)
            long r2 = r9.f21192a
            r0 = r10
            r1 = r29
            r21 = r2
            r2 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            r5 = r6 | r23
            r13 = r32
            r0 = r7
            goto L_0x0271
        L_0x023a:
            r11 = r2
            r13 = r20
            r4 = r21
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x027c
            int r0 = com.onedelhi.secure.y06.m31814b(r12, r13)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.onedelhi.secure.kf6.m19757m(r14, r4, r0)
            int r0 = r13 + 4
            goto L_0x026d
        L_0x0254:
            r11 = r2
            r13 = r20
            r4 = r21
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r1) goto L_0x027c
            long r0 = com.onedelhi.secure.y06.m31826n(r12, r13)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.onedelhi.secure.kf6.m19756l(r14, r4, r0)
        L_0x026b:
            int r0 = r13 + 8
        L_0x026d:
            r5 = r6 | r23
        L_0x026f:
            r13 = r32
        L_0x0271:
            r3 = r11
            r1 = r17
        L_0x0274:
            r2 = r19
            r6 = r24
            r11 = r33
            goto L_0x0019
        L_0x027c:
            r21 = r13
            goto L_0x0291
        L_0x027f:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r9.f21194a
            java.lang.Object r1 = com.onedelhi.secure.t56.m28115g(r1, r2)
        L_0x0289:
            r10.putObject(r14, r12, r1)
            r5 = r6 | r23
            r12 = r30
            goto L_0x026f
        L_0x0291:
            r7 = r33
            r23 = r6
            r27 = r10
            r22 = r11
            r8 = r17
            r2 = r21
            goto L_0x0379
        L_0x029f:
            r17 = r4
            r12 = r21
            r18 = -1
            r4 = r2
            r21 = r20
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r0 = 27
            if (r11 != r0) goto L_0x0305
            r0 = 2
            if (r7 != r0) goto L_0x02f9
            java.lang.Object r0 = r10.getObject(r14, r12)
            com.onedelhi.secure.q56 r0 = (com.onedelhi.secure.q56) r0
            boolean r1 = r0.mo19982c()
            if (r1 != 0) goto L_0x02cf
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02c7
            r1 = 10
            goto L_0x02c8
        L_0x02c7:
            int r1 = r1 + r1
        L_0x02c8:
            com.onedelhi.secure.q56 r0 = r0.mo12861z1(r1)
            r10.putObject(r14, r12, r0)
        L_0x02cf:
            r7 = r0
            com.onedelhi.secure.mb6 r0 = r15.mo23733I(r4)
            r1 = r17
            r2 = r30
            r3 = r21
            r22 = r4
            r4 = r32
            r23 = r5
            r5 = r7
            r24 = r6
            r6 = r34
            int r0 = com.onedelhi.secure.y06.m31817e(r0, r1, r2, r3, r4, r5, r6)
            r12 = r30
            r13 = r32
            r11 = r33
            r2 = r19
            r3 = r22
            r5 = r23
            r6 = r24
            goto L_0x0019
        L_0x02f9:
            r22 = r4
            r23 = r5
            r24 = r6
            r27 = r10
            r15 = r21
            goto L_0x0374
        L_0x0305:
            r22 = r4
            r23 = r5
            r24 = r6
            r0 = 49
            if (r11 > r0) goto L_0x0354
            long r5 = (long) r8
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r21
            r4 = r32
            r25 = r5
            r5 = r17
            r6 = r19
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r15 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r22
            r27 = r10
            r9 = r25
            r15 = r33
            r15 = r21
            r14 = r34
            int r0 = r0.mo23747z(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0350
        L_0x0338:
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            r1 = r17
            r2 = r19
            r3 = r22
            r5 = r23
            r6 = r24
            goto L_0x03c0
        L_0x0350:
            r7 = r33
            r2 = r0
            goto L_0x0377
        L_0x0354:
            r27 = r10
            r15 = r21
            r0 = 50
            if (r11 != r0) goto L_0x037c
            r0 = 2
            if (r7 != r0) goto L_0x0374
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r22
            r6 = r12
            r8 = r34
            int r0 = r0.mo23744w(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0350
            goto L_0x0338
        L_0x0374:
            r7 = r33
            r2 = r15
        L_0x0377:
            r8 = r17
        L_0x0379:
            r6 = r24
            goto L_0x0396
        L_0x037c:
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r17
            r6 = r19
            r9 = r11
            r10 = r12
            r12 = r22
            r13 = r34
            int r0 = r0.mo23745x(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0350
            goto L_0x0338
        L_0x0396:
            if (r8 != r7) goto L_0x039f
            if (r7 == 0) goto L_0x039f
            r0 = r2
            r1 = r8
            r5 = r23
            goto L_0x03cb
        L_0x039f:
            com.onedelhi.secure.od6 r4 = m26540s(r29)
            r0 = r8
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.onedelhi.secure.y06.m31821i(r0, r1, r2, r3, r4, r5)
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r9 = r34
            r11 = r7
            r1 = r8
            r2 = r19
            r3 = r22
            r5 = r23
        L_0x03c0:
            r10 = r27
            goto L_0x0019
        L_0x03c4:
            r23 = r5
            r24 = r6
            r27 = r10
            r7 = r11
        L_0x03cb:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r2) goto L_0x03d9
            long r3 = (long) r6
            r6 = r29
            r8 = r27
            r8.putInt(r6, r3, r5)
            goto L_0x03db
        L_0x03d9:
            r6 = r29
        L_0x03db:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r28
            int r4 = r2.f19738c
        L_0x03e2:
            int r5 = r2.f19739d
            if (r4 >= r5) goto L_0x040e
            int[] r5 = r2.f19737b
            r5 = r5[r4]
            int[] r8 = r2.f19734a
            r8 = r8[r5]
            int r8 = r2.mo23731F(r5)
            r8 = r8 & r3
            long r8 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.kf6.m19750f(r6, r8)
            if (r8 != 0) goto L_0x03fb
            goto L_0x0401
        L_0x03fb:
            com.onedelhi.secure.n56 r9 = r2.mo23732H(r5)
            if (r9 != 0) goto L_0x0404
        L_0x0401:
            int r4 = r4 + 1
            goto L_0x03e2
        L_0x0404:
            com.onedelhi.secure.q86 r8 = (com.onedelhi.secure.q86) r8
            java.lang.Object r0 = r2.mo23734J(r5)
            com.onedelhi.secure.n86 r0 = (com.onedelhi.secure.n86) r0
            r0 = 0
            throw r0
        L_0x040e:
            r3 = r32
            if (r7 != 0) goto L_0x041a
            if (r0 != r3) goto L_0x0415
            goto L_0x041e
        L_0x0415:
            com.onedelhi.secure.t66 r0 = com.onedelhi.secure.t66.m28137d()
            throw r0
        L_0x041a:
            if (r0 > r3) goto L_0x041f
            if (r1 != r7) goto L_0x041f
        L_0x041e:
            return r0
        L_0x041f:
            com.onedelhi.secure.t66 r0 = com.onedelhi.secure.t66.m28137d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.r96.mo23743r(java.lang.Object, byte[], int, int, int, com.onedelhi.secure.u06):int");
    }

    /* renamed from: w */
    public final int mo23744w(Object obj, byte[] bArr, int i, int i2, int i3, long j, u06 u06) throws IOException {
        Unsafe unsafe = f19724a;
        Object J = mo23734J(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((q86) object).mo22950h()) {
            q86 d = q86.m25463c().mo22945d();
            t86.m28201a(d, object);
            unsafe.putObject(obj, j, d);
        }
        n86 n86 = (n86) J;
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0066, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        r12.putObject(r1, r9, r3);
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007f, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ec, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010f, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return r2;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo23745x(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.onedelhi.secure.u06 r29) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f19724a
            int[] r7 = r0.f19734a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x0183;
                case 52: goto L_0x016b;
                case 53: goto L_0x0160;
                case 54: goto L_0x0160;
                case 55: goto L_0x0155;
                case 56: goto L_0x0140;
                case 57: goto L_0x012b;
                case 58: goto L_0x0114;
                case 59: goto L_0x00e0;
                case 60: goto L_0x00be;
                case 61: goto L_0x00b3;
                case 62: goto L_0x0155;
                case 63: goto L_0x0084;
                case 64: goto L_0x012b;
                case 65: goto L_0x0140;
                case 66: goto L_0x0071;
                case 67: goto L_0x0058;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x019c
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x019c
            com.onedelhi.secure.mb6 r5 = r0.mo23733I(r6)
            r2 = r2 & -8
            r6 = r2 | 4
            r2 = r5
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r29
            int r2 = com.onedelhi.secure.y06.m31815c(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            java.lang.Object r3 = r11.f21194a
            if (r15 != 0) goto L_0x0052
            goto L_0x00ec
        L_0x0052:
            java.lang.Object r3 = com.onedelhi.secure.t56.m28115g(r15, r3)
            goto L_0x00ec
        L_0x0058:
            if (r5 == 0) goto L_0x005c
            goto L_0x019c
        L_0x005c:
            int r2 = com.onedelhi.secure.y06.m31825m(r3, r4, r11)
            long r3 = r11.f21192a
            long r3 = com.onedelhi.secure.u36.m29075b(r3)
        L_0x0066:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x006a:
            r12.putObject(r1, r9, r3)
            r12.putInt(r1, r13, r8)
            return r2
        L_0x0071:
            if (r5 == 0) goto L_0x0075
            goto L_0x019c
        L_0x0075:
            int r2 = com.onedelhi.secure.y06.m31822j(r3, r4, r11)
            int r3 = r11.f21191a
            int r3 = com.onedelhi.secure.u36.m29074a(r3)
        L_0x007f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x006a
        L_0x0084:
            if (r5 != 0) goto L_0x019c
            int r3 = com.onedelhi.secure.y06.m31822j(r3, r4, r11)
            int r4 = r11.f21191a
            com.onedelhi.secure.n56 r5 = r0.mo23732H(r6)
            if (r5 == 0) goto L_0x00a6
            boolean r5 = r5.mo20869a()
            if (r5 == 0) goto L_0x0099
            goto L_0x00a6
        L_0x0099:
            com.onedelhi.secure.od6 r1 = m26540s(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.mo21901f(r2, r4)
            goto L_0x00b0
        L_0x00a6:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
        L_0x00b0:
            r2 = r3
            goto L_0x019d
        L_0x00b3:
            if (r5 == r15) goto L_0x00b7
            goto L_0x019c
        L_0x00b7:
            int r2 = com.onedelhi.secure.y06.m31813a(r3, r4, r11)
            java.lang.Object r3 = r11.f21194a
            goto L_0x006a
        L_0x00be:
            if (r5 != r15) goto L_0x019c
            com.onedelhi.secure.mb6 r2 = r0.mo23733I(r6)
            r5 = r20
            int r2 = com.onedelhi.secure.y06.m31816d(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00d5
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00d6
        L_0x00d5:
            r15 = 0
        L_0x00d6:
            java.lang.Object r3 = r11.f21194a
            if (r15 != 0) goto L_0x00db
            goto L_0x00ec
        L_0x00db:
            java.lang.Object r3 = com.onedelhi.secure.t56.m28115g(r15, r3)
            goto L_0x00ec
        L_0x00e0:
            if (r5 != r15) goto L_0x019c
            int r2 = com.onedelhi.secure.y06.m31822j(r3, r4, r11)
            int r4 = r11.f21191a
            if (r4 != 0) goto L_0x00f0
            java.lang.String r3 = ""
        L_0x00ec:
            r12.putObject(r1, r9, r3)
            goto L_0x010f
        L_0x00f0:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0104
            int r5 = r2 + r4
            boolean r5 = com.onedelhi.secure.wf6.m30812d(r3, r2, r5)
            if (r5 == 0) goto L_0x00ff
            goto L_0x0104
        L_0x00ff:
            com.onedelhi.secure.t66 r1 = com.onedelhi.secure.t66.m28135b()
            throw r1
        L_0x0104:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.onedelhi.secure.t56.f20660b
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x010f:
            r12.putInt(r1, r13, r8)
            goto L_0x019d
        L_0x0114:
            if (r5 != 0) goto L_0x019c
            int r2 = com.onedelhi.secure.y06.m31825m(r3, r4, r11)
            long r3 = r11.f21192a
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0124
            r15 = 1
            goto L_0x0125
        L_0x0124:
            r15 = 0
        L_0x0125:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x006a
        L_0x012b:
            if (r5 == r7) goto L_0x012f
            goto L_0x019c
        L_0x012f:
            int r2 = com.onedelhi.secure.y06.m31814b(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 4
            return r1
        L_0x0140:
            r2 = 1
            if (r5 == r2) goto L_0x0144
            goto L_0x019c
        L_0x0144:
            long r2 = com.onedelhi.secure.y06.m31826n(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 8
            return r1
        L_0x0155:
            if (r5 == 0) goto L_0x0158
            goto L_0x019c
        L_0x0158:
            int r2 = com.onedelhi.secure.y06.m31822j(r3, r4, r11)
            int r3 = r11.f21191a
            goto L_0x007f
        L_0x0160:
            if (r5 == 0) goto L_0x0163
            goto L_0x019c
        L_0x0163:
            int r2 = com.onedelhi.secure.y06.m31825m(r3, r4, r11)
            long r3 = r11.f21192a
            goto L_0x0066
        L_0x016b:
            if (r5 == r7) goto L_0x016e
            goto L_0x019c
        L_0x016e:
            int r2 = com.onedelhi.secure.y06.m31814b(r18, r19)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 4
            return r1
        L_0x0183:
            r2 = 1
            if (r5 == r2) goto L_0x0187
            goto L_0x019c
        L_0x0187:
            long r2 = com.onedelhi.secure.y06.m31826n(r18, r19)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
            r12.putInt(r1, r13, r8)
            int r1 = r4 + 8
            return r1
        L_0x019c:
            r2 = r4
        L_0x019d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.r96.mo23745x(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.onedelhi.secure.u06):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02cf, code lost:
        if (r0 != r15) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02e5, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0316, code lost:
        if (r0 != r15) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0337, code lost:
        if (r0 != r15) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010e, code lost:
        r1 = r11.f21194a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0110, code lost:
        r7.putObject(r14, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ad, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c1, code lost:
        r1 = r11.f21191a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c3, code lost:
        r7.putInt(r14, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x021f, code lost:
        r6 = r6 | r23;
        r9 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0223, code lost:
        r7 = r19;
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0229, code lost:
        r2 = r5;
        r28 = r7;
        r23 = r10;
        r7 = r19;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo23746y(java.lang.Object r31, byte[] r32, int r33, int r34, com.onedelhi.secure.u06 r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            sun.misc.Unsafe r9 = f19724a
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            if (r0 >= r13) goto L_0x0360
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.onedelhi.secure.y06.m31823k(r0, r12, r3, r11)
            int r3 = r11.f21191a
            r4 = r0
            r17 = r3
            goto L_0x002f
        L_0x002c:
            r17 = r0
            r4 = r3
        L_0x002f:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003c
            int r2 = r2 / 3
            int r0 = r15.mo23728B(r5, r2)
            goto L_0x0040
        L_0x003c:
            int r0 = r15.mo23727A(r5)
        L_0x0040:
            r2 = r0
            if (r2 != r10) goto L_0x004e
            r2 = r4
            r20 = r5
            r28 = r9
            r19 = -1
            r23 = 0
            goto L_0x033a
        L_0x004e:
            int[] r0 = r15.f19734a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r10 = m26536E(r1)
            r33 = r5
            r5 = r1 & r8
            r19 = r9
            long r8 = (long) r5
            r5 = 17
            r21 = r1
            if (r10 > r5) goto L_0x0234
            int r5 = r2 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r1 = 1
            int r23 = r1 << r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            r20 = r2
            if (r0 == r7) goto L_0x008b
            if (r7 == r5) goto L_0x007f
            long r1 = (long) r7
            r7 = r19
            r7.putInt(r14, r1, r6)
            goto L_0x0081
        L_0x007f:
            r7 = r19
        L_0x0081:
            if (r0 == r5) goto L_0x0088
            long r1 = (long) r0
            int r6 = r7.getInt(r14, r1)
        L_0x0088:
            r2 = r7
            r7 = r0
            goto L_0x008d
        L_0x008b:
            r2 = r19
        L_0x008d:
            r0 = 5
            switch(r10) {
                case 0: goto L_0x0204;
                case 1: goto L_0x01e9;
                case 2: goto L_0x01c8;
                case 3: goto L_0x01c8;
                case 4: goto L_0x01b0;
                case 5: goto L_0x018e;
                case 6: goto L_0x0177;
                case 7: goto L_0x0157;
                case 8: goto L_0x013a;
                case 9: goto L_0x0115;
                case 10: goto L_0x00fd;
                case 11: goto L_0x01b0;
                case 12: goto L_0x00eb;
                case 13: goto L_0x0177;
                case 14: goto L_0x018e;
                case 15: goto L_0x00d3;
                case 16: goto L_0x009e;
                default: goto L_0x0091;
            }
        L_0x0091:
            r5 = r4
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            goto L_0x0229
        L_0x009e:
            if (r3 != 0) goto L_0x00c5
            int r10 = com.onedelhi.secure.y06.m31825m(r12, r4, r11)
            long r0 = r11.f21192a
            long r21 = com.onedelhi.secure.u36.m29075b(r0)
            r0 = r2
            r1 = r31
            r19 = r7
            r4 = r20
            r7 = r2
            r2 = r8
            r20 = r33
            r8 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r21
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r8
            r0 = r10
            goto L_0x0223
        L_0x00c5:
            r19 = r7
            r8 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            r5 = r4
            r10 = r8
            goto L_0x0229
        L_0x00d3:
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x01ad
            int r0 = com.onedelhi.secure.y06.m31822j(r12, r4, r11)
            int r1 = r11.f21191a
            int r1 = com.onedelhi.secure.u36.m29074a(r1)
            goto L_0x01c3
        L_0x00eb:
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x01ad
            int r0 = com.onedelhi.secure.y06.m31822j(r12, r4, r11)
            goto L_0x01c1
        L_0x00fd:
            r19 = r7
            r10 = r20
            r0 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01ad
            int r0 = com.onedelhi.secure.y06.m31813a(r12, r4, r11)
        L_0x010e:
            java.lang.Object r1 = r11.f21194a
        L_0x0110:
            r7.putObject(r14, r8, r1)
            goto L_0x021f
        L_0x0115:
            r19 = r7
            r10 = r20
            r0 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01ad
            com.onedelhi.secure.mb6 r0 = r15.mo23733I(r10)
            int r0 = com.onedelhi.secure.y06.m31816d(r0, r12, r4, r13, r11)
            java.lang.Object r1 = r7.getObject(r14, r8)
            if (r1 != 0) goto L_0x0133
            java.lang.Object r1 = r11.f21194a
            goto L_0x0110
        L_0x0133:
            java.lang.Object r2 = r11.f21194a
            java.lang.Object r1 = com.onedelhi.secure.t56.m28115g(r1, r2)
            goto L_0x0110
        L_0x013a:
            r19 = r7
            r10 = r20
            r0 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01ad
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x0152
            int r0 = com.onedelhi.secure.y06.m31819g(r12, r4, r11)
            goto L_0x010e
        L_0x0152:
            int r0 = com.onedelhi.secure.y06.m31820h(r12, r4, r11)
            goto L_0x010e
        L_0x0157:
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x01ad
            int r0 = com.onedelhi.secure.y06.m31825m(r12, r4, r11)
            long r1 = r11.f21192a
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0171
            r1 = 1
            goto L_0x0172
        L_0x0171:
            r1 = 0
        L_0x0172:
            com.onedelhi.secure.kf6.m19755k(r14, r8, r1)
            goto L_0x021f
        L_0x0177:
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01ad
            int r0 = com.onedelhi.secure.y06.m31814b(r12, r4)
            r7.putInt(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x021f
        L_0x018e:
            r19 = r7
            r10 = r20
            r0 = 1
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01ad
            long r21 = com.onedelhi.secure.y06.m31826n(r12, r4)
            r0 = r7
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x021f
        L_0x01ad:
            r5 = r4
            goto L_0x0229
        L_0x01b0:
            r5 = r4
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x0229
            int r0 = com.onedelhi.secure.y06.m31822j(r12, r5, r11)
        L_0x01c1:
            int r1 = r11.f21191a
        L_0x01c3:
            r7.putInt(r14, r8, r1)
            goto L_0x021f
        L_0x01c8:
            r5 = r4
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x0229
            int r17 = com.onedelhi.secure.y06.m31825m(r12, r5, r11)
            long r4 = r11.f21192a
            r0 = r7
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r0 = r17
            goto L_0x0223
        L_0x01e9:
            r5 = r4
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x0229
            int r0 = com.onedelhi.secure.y06.m31814b(r12, r5)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.onedelhi.secure.kf6.m19757m(r14, r8, r0)
            int r0 = r5 + 4
            goto L_0x021f
        L_0x0204:
            r5 = r4
            r19 = r7
            r10 = r20
            r0 = 1
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x0229
            long r0 = com.onedelhi.secure.y06.m31826n(r12, r5)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.onedelhi.secure.kf6.m19756l(r14, r8, r0)
            int r0 = r5 + 8
        L_0x021f:
            r6 = r6 | r23
            r9 = r7
            r2 = r10
        L_0x0223:
            r7 = r19
            r1 = r20
            goto L_0x035a
        L_0x0229:
            r2 = r5
            r28 = r7
            r23 = r10
            r7 = r19
            r19 = -1
            goto L_0x033a
        L_0x0234:
            r20 = r33
            r5 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r29 = r19
            r19 = r7
            r7 = r29
            r0 = 27
            if (r10 != r0) goto L_0x0292
            r0 = 2
            if (r3 != r0) goto L_0x0285
            java.lang.Object r0 = r7.getObject(r14, r8)
            com.onedelhi.secure.q56 r0 = (com.onedelhi.secure.q56) r0
            boolean r1 = r0.mo19982c()
            if (r1 != 0) goto L_0x0265
            int r1 = r0.size()
            if (r1 != 0) goto L_0x025d
            r1 = 10
            goto L_0x025e
        L_0x025d:
            int r1 = r1 + r1
        L_0x025e:
            com.onedelhi.secure.q56 r0 = r0.mo12861z1(r1)
            r7.putObject(r14, r8, r0)
        L_0x0265:
            r8 = r0
            com.onedelhi.secure.mb6 r0 = r15.mo23733I(r4)
            r1 = r17
            r2 = r32
            r3 = r5
            r23 = r4
            r4 = r34
            r5 = r8
            r8 = r6
            r6 = r35
            int r0 = com.onedelhi.secure.y06.m31817e(r0, r1, r2, r3, r4, r5, r6)
            r9 = r7
            r6 = r8
            r7 = r19
            r1 = r20
            r2 = r23
            goto L_0x035a
        L_0x0285:
            r23 = r4
            r15 = r5
            r26 = r6
            r28 = r7
            r27 = r19
            r19 = -1
            goto L_0x0319
        L_0x0292:
            r23 = r4
            r0 = 49
            if (r10 > r0) goto L_0x02e7
            r1 = r21
            long r1 = (long) r1
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r4 = r3
            r3 = r5
            r33 = r4
            r4 = r34
            r15 = r5
            r5 = r17
            r26 = r6
            r6 = r20
            r27 = r19
            r19 = r7
            r7 = r33
            r24 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r23
            r18 = r10
            r28 = r19
            r19 = -1
            r9 = r21
            r11 = r18
            r12 = r24
            r14 = r35
            int r0 = r0.mo23747z(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02e5
        L_0x02d1:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r1 = r20
            r2 = r23
            r6 = r26
            r7 = r27
            goto L_0x0358
        L_0x02e5:
            r2 = r0
            goto L_0x031a
        L_0x02e7:
            r33 = r3
            r15 = r5
            r26 = r6
            r28 = r7
            r24 = r8
            r18 = r10
            r27 = r19
            r1 = r21
            r19 = -1
            r0 = 50
            r9 = r18
            r7 = r33
            if (r9 != r0) goto L_0x031f
            r0 = 2
            if (r7 != r0) goto L_0x0319
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r23
            r6 = r24
            r8 = r35
            int r0 = r0.mo23744w(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02e5
            goto L_0x02d1
        L_0x0319:
            r2 = r15
        L_0x031a:
            r6 = r26
            r7 = r27
            goto L_0x033a
        L_0x031f:
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r20
            r10 = r24
            r12 = r23
            r13 = r35
            int r0 = r0.mo23745x(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02e5
            goto L_0x02d1
        L_0x033a:
            com.onedelhi.secure.od6 r4 = m26540s(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.onedelhi.secure.y06.m31821i(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r1 = r20
            r2 = r23
        L_0x0358:
            r9 = r28
        L_0x035a:
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            goto L_0x001a
        L_0x0360:
            r26 = r6
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x0373
            long r1 = (long) r7
            r3 = r31
            r6 = r26
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x0373:
            r1 = r34
            if (r0 != r1) goto L_0x0378
            return r0
        L_0x0378:
            com.onedelhi.secure.t66 r0 = com.onedelhi.secure.t66.m28137d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.r96.mo23746y(java.lang.Object, byte[], int, int, com.onedelhi.secure.u06):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0254, code lost:
        if (r7.f21192a != 0) goto L_0x0256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0256, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0258, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0259, code lost:
        r12.mo13895e(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x025c, code lost:
        if (r4 >= r5) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x025e, code lost:
        r6 = com.onedelhi.secure.y06.m31822j(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0264, code lost:
        if (r2 == r7.f21191a) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0267, code lost:
        r4 = com.onedelhi.secure.y06.m31825m(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x026f, code lost:
        if (r7.f21192a == 0) goto L_0x0258;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0272, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0122, code lost:
        if (r4 == 0) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0124, code lost:
        r12.add(com.onedelhi.secure.i36.f13476a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012a, code lost:
        r12.add(com.onedelhi.secure.i36.m17166o(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0132, code lost:
        if (r1 >= r5) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0134, code lost:
        r4 = com.onedelhi.secure.y06.m31822j(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013a, code lost:
        if (r2 == r7.f21191a) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013d, code lost:
        r1 = com.onedelhi.secure.y06.m31822j(r3, r4, r7);
        r4 = r7.f21191a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0143, code lost:
        if (r4 < 0) goto L_0x0151;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0147, code lost:
        if (r4 > (r3.length - r1)) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0149, code lost:
        if (r4 != 0) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0150, code lost:
        throw com.onedelhi.secure.t66.m28138f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0155, code lost:
        throw com.onedelhi.secure.t66.m28136c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0156, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a4  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo23747z(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.onedelhi.secure.u06 r29) throws java.io.IOException {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = f19724a
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.onedelhi.secure.q56 r12 = (com.onedelhi.secure.q56) r12
            boolean r13 = r12.mo19982c()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.onedelhi.secure.q56 r12 = r12.mo12861z1(r13)
            r11.putObject(r1, r9, r12)
        L_0x0032:
            r9 = 5
            r10 = 0
            r13 = 1
            r14 = 2
            switch(r26) {
                case 18: goto L_0x0388;
                case 19: goto L_0x0342;
                case 20: goto L_0x030a;
                case 21: goto L_0x030a;
                case 22: goto L_0x02ef;
                case 23: goto L_0x02b1;
                case 24: goto L_0x0273;
                case 25: goto L_0x021f;
                case 26: goto L_0x017c;
                case 27: goto L_0x0161;
                case 28: goto L_0x0114;
                case 29: goto L_0x02ef;
                case 30: goto L_0x00dc;
                case 31: goto L_0x0273;
                case 32: goto L_0x02b1;
                case 33: goto L_0x009c;
                case 34: goto L_0x005c;
                case 35: goto L_0x0388;
                case 36: goto L_0x0342;
                case 37: goto L_0x030a;
                case 38: goto L_0x030a;
                case 39: goto L_0x02ef;
                case 40: goto L_0x02b1;
                case 41: goto L_0x0273;
                case 42: goto L_0x021f;
                case 43: goto L_0x02ef;
                case 44: goto L_0x00dc;
                case 45: goto L_0x0273;
                case 46: goto L_0x02b1;
                case 47: goto L_0x009c;
                case 48: goto L_0x005c;
                default: goto L_0x003a;
            }
        L_0x003a:
            r1 = 3
            if (r6 != r1) goto L_0x03eb
            com.onedelhi.secure.mb6 r1 = r15.mo23733I(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.onedelhi.secure.y06.m31815c(r21, r22, r23, r24, r25, r26)
        L_0x0055:
            java.lang.Object r8 = r7.f21194a
            r12.add(r8)
            goto L_0x03cd
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.onedelhi.secure.a86 r12 = (com.onedelhi.secure.a86) r12
            int r1 = com.onedelhi.secure.y06.m31822j(r3, r4, r7)
            int r2 = r7.f21191a
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.onedelhi.secure.y06.m31825m(r3, r1, r7)
            long r4 = r7.f21192a
            long r4 = com.onedelhi.secure.u36.m29075b(r4)
            r12.mo12850e(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x03ec
        L_0x007b:
            com.onedelhi.secure.t66 r1 = com.onedelhi.secure.t66.m28138f()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x03eb
            com.onedelhi.secure.a86 r12 = (com.onedelhi.secure.a86) r12
        L_0x0084:
            int r1 = com.onedelhi.secure.y06.m31825m(r3, r4, r7)
            long r8 = r7.f21192a
            long r8 = com.onedelhi.secure.u36.m29075b(r8)
            r12.mo12850e(r8)
            if (r1 >= r5) goto L_0x009b
            int r4 = com.onedelhi.secure.y06.m31822j(r3, r1, r7)
            int r6 = r7.f21191a
            if (r2 == r6) goto L_0x0084
        L_0x009b:
            return r1
        L_0x009c:
            if (r6 != r14) goto L_0x00c0
            com.onedelhi.secure.h56 r12 = (com.onedelhi.secure.h56) r12
            int r1 = com.onedelhi.secure.y06.m31822j(r3, r4, r7)
            int r2 = r7.f21191a
            int r2 = r2 + r1
        L_0x00a7:
            if (r1 >= r2) goto L_0x00b7
            int r1 = com.onedelhi.secure.y06.m31822j(r3, r1, r7)
            int r4 = r7.f21191a
            int r4 = com.onedelhi.secure.u36.m29074a(r4)
            r12.mo17067e(r4)
            goto L_0x00a7
        L_0x00b7:
            if (r1 != r2) goto L_0x00bb
            goto L_0x03ec
        L_0x00bb:
            com.onedelhi.secure.t66 r1 = com.onedelhi.secure.t66.m28138f()
            throw r1
        L_0x00c0:
            if (r6 != 0) goto L_0x03eb
            com.onedelhi.secure.h56 r12 = (com.onedelhi.secure.h56) r12
        L_0x00c4:
            int r1 = com.onedelhi.secure.y06.m31822j(r3, r4, r7)
            int r4 = r7.f21191a
            int r4 = com.onedelhi.secure.u36.m29074a(r4)
            r12.mo17067e(r4)
            if (r1 >= r5) goto L_0x00db
            int r4 = com.onedelhi.secure.y06.m31822j(r3, r1, r7)
            int r6 = r7.f21191a
            if (r2 == r6) goto L_0x00c4
        L_0x00db:
            return r1
        L_0x00dc:
            if (r6 != r14) goto L_0x00e3
            int r2 = com.onedelhi.secure.y06.m31818f(r3, r4, r12, r7)
            goto L_0x00f4
        L_0x00e3:
            if (r6 != 0) goto L_0x03eb
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.onedelhi.secure.y06.m31824l(r2, r3, r4, r5, r6, r7)
        L_0x00f4:
            com.onedelhi.secure.e56 r1 = (com.onedelhi.secure.e56) r1
            com.onedelhi.secure.od6 r3 = r1.zzc
            com.onedelhi.secure.od6 r4 = com.onedelhi.secure.od6.m23709a()
            if (r3 != r4) goto L_0x00ff
            r3 = 0
        L_0x00ff:
            com.onedelhi.secure.n56 r4 = r15.mo23732H(r8)
            com.onedelhi.secure.ld6 r5 = r0.f19729a
            r6 = r21
            java.lang.Object r3 = com.onedelhi.secure.sb6.m27425d(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x010f
            goto L_0x0240
        L_0x010f:
            com.onedelhi.secure.od6 r3 = (com.onedelhi.secure.od6) r3
            r1.zzc = r3
            return r2
        L_0x0114:
            if (r6 != r14) goto L_0x03eb
            int r1 = com.onedelhi.secure.y06.m31822j(r3, r4, r7)
            int r4 = r7.f21191a
            if (r4 < 0) goto L_0x015c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0157
            if (r4 != 0) goto L_0x012a
        L_0x0124:
            com.onedelhi.secure.i36 r4 = com.onedelhi.secure.i36.f13476a
            r12.add(r4)
            goto L_0x0132
        L_0x012a:
            com.onedelhi.secure.i36 r6 = com.onedelhi.secure.i36.m17166o(r3, r1, r4)
            r12.add(r6)
            int r1 = r1 + r4
        L_0x0132:
            if (r1 >= r5) goto L_0x0156
            int r4 = com.onedelhi.secure.y06.m31822j(r3, r1, r7)
            int r6 = r7.f21191a
            if (r2 == r6) goto L_0x013d
            goto L_0x0156
        L_0x013d:
            int r1 = com.onedelhi.secure.y06.m31822j(r3, r4, r7)
            int r4 = r7.f21191a
            if (r4 < 0) goto L_0x0151
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x014c
            if (r4 != 0) goto L_0x012a
            goto L_0x0124
        L_0x014c:
            com.onedelhi.secure.t66 r1 = com.onedelhi.secure.t66.m28138f()
            throw r1
        L_0x0151:
            com.onedelhi.secure.t66 r1 = com.onedelhi.secure.t66.m28136c()
            throw r1
        L_0x0156:
            return r1
        L_0x0157:
            com.onedelhi.secure.t66 r1 = com.onedelhi.secure.t66.m28138f()
            throw r1
        L_0x015c:
            com.onedelhi.secure.t66 r1 = com.onedelhi.secure.t66.m28136c()
            throw r1
        L_0x0161:
            if (r6 == r14) goto L_0x0165
            goto L_0x03eb
        L_0x0165:
            com.onedelhi.secure.mb6 r1 = r15.mo23733I(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.onedelhi.secure.y06.m31817e(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x017c:
            if (r6 != r14) goto L_0x03eb
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            int r4 = com.onedelhi.secure.y06.m31822j(r3, r4, r7)
            if (r6 != 0) goto L_0x01c9
            int r6 = r7.f21191a
            if (r6 < 0) goto L_0x01c4
            if (r6 != 0) goto L_0x0197
        L_0x0193:
            r12.add(r1)
            goto L_0x01a2
        L_0x0197:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.onedelhi.secure.t56.f20660b
            r8.<init>(r3, r4, r6, r9)
        L_0x019e:
            r12.add(r8)
            int r4 = r4 + r6
        L_0x01a2:
            if (r4 >= r5) goto L_0x03eb
            int r6 = com.onedelhi.secure.y06.m31822j(r3, r4, r7)
            int r8 = r7.f21191a
            if (r2 != r8) goto L_0x03eb
            int r4 = com.onedelhi.secure.y06.m31822j(r3, r6, r7)
            int r6 = r7.f21191a
            if (r6 < 0) goto L_0x01bf
            if (r6 != 0) goto L_0x01b7
            goto L_0x0193
        L_0x01b7:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.onedelhi.secure.t56.f20660b
            r8.<init>(r3, r4, r6, r9)
            goto L_0x019e
        L_0x01bf:
            com.onedelhi.secure.t66 r1 = com.onedelhi.secure.t66.m28136c()
            throw r1
        L_0x01c4:
            com.onedelhi.secure.t66 r1 = com.onedelhi.secure.t66.m28136c()
            throw r1
        L_0x01c9:
            int r6 = r7.f21191a
            if (r6 < 0) goto L_0x021a
            if (r6 != 0) goto L_0x01d3
        L_0x01cf:
            r12.add(r1)
            goto L_0x01e6
        L_0x01d3:
            int r8 = r4 + r6
            boolean r9 = com.onedelhi.secure.wf6.m30812d(r3, r4, r8)
            if (r9 == 0) goto L_0x0215
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.onedelhi.secure.t56.f20660b
            r9.<init>(r3, r4, r6, r10)
        L_0x01e2:
            r12.add(r9)
            r4 = r8
        L_0x01e6:
            if (r4 >= r5) goto L_0x03eb
            int r6 = com.onedelhi.secure.y06.m31822j(r3, r4, r7)
            int r8 = r7.f21191a
            if (r2 != r8) goto L_0x03eb
            int r4 = com.onedelhi.secure.y06.m31822j(r3, r6, r7)
            int r6 = r7.f21191a
            if (r6 < 0) goto L_0x0210
            if (r6 != 0) goto L_0x01fb
            goto L_0x01cf
        L_0x01fb:
            int r8 = r4 + r6
            boolean r9 = com.onedelhi.secure.wf6.m30812d(r3, r4, r8)
            if (r9 == 0) goto L_0x020b
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.onedelhi.secure.t56.f20660b
            r9.<init>(r3, r4, r6, r10)
            goto L_0x01e2
        L_0x020b:
            com.onedelhi.secure.t66 r1 = com.onedelhi.secure.t66.m28135b()
            throw r1
        L_0x0210:
            com.onedelhi.secure.t66 r1 = com.onedelhi.secure.t66.m28136c()
            throw r1
        L_0x0215:
            com.onedelhi.secure.t66 r1 = com.onedelhi.secure.t66.m28135b()
            throw r1
        L_0x021a:
            com.onedelhi.secure.t66 r1 = com.onedelhi.secure.t66.m28136c()
            throw r1
        L_0x021f:
            r1 = 0
            if (r6 != r14) goto L_0x0248
            com.onedelhi.secure.c16 r12 = (com.onedelhi.secure.c16) r12
            int r2 = com.onedelhi.secure.y06.m31822j(r3, r4, r7)
            int r4 = r7.f21191a
            int r4 = r4 + r2
        L_0x022b:
            if (r2 >= r4) goto L_0x023e
            int r2 = com.onedelhi.secure.y06.m31825m(r3, r2, r7)
            long r5 = r7.f21192a
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0239
            r5 = 1
            goto L_0x023a
        L_0x0239:
            r5 = 0
        L_0x023a:
            r12.mo13895e(r5)
            goto L_0x022b
        L_0x023e:
            if (r2 != r4) goto L_0x0243
        L_0x0240:
            r1 = r2
            goto L_0x03ec
        L_0x0243:
            com.onedelhi.secure.t66 r1 = com.onedelhi.secure.t66.m28138f()
            throw r1
        L_0x0248:
            if (r6 != 0) goto L_0x03eb
            com.onedelhi.secure.c16 r12 = (com.onedelhi.secure.c16) r12
            int r4 = com.onedelhi.secure.y06.m31825m(r3, r4, r7)
            long r8 = r7.f21192a
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0258
        L_0x0256:
            r6 = 1
            goto L_0x0259
        L_0x0258:
            r6 = 0
        L_0x0259:
            r12.mo13895e(r6)
            if (r4 >= r5) goto L_0x0272
            int r6 = com.onedelhi.secure.y06.m31822j(r3, r4, r7)
            int r8 = r7.f21191a
            if (r2 == r8) goto L_0x0267
            goto L_0x0272
        L_0x0267:
            int r4 = com.onedelhi.secure.y06.m31825m(r3, r6, r7)
            long r8 = r7.f21192a
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0258
            goto L_0x0256
        L_0x0272:
            return r4
        L_0x0273:
            if (r6 != r14) goto L_0x0293
            com.onedelhi.secure.h56 r12 = (com.onedelhi.secure.h56) r12
            int r1 = com.onedelhi.secure.y06.m31822j(r3, r4, r7)
            int r2 = r7.f21191a
            int r2 = r2 + r1
        L_0x027e:
            if (r1 >= r2) goto L_0x028a
            int r4 = com.onedelhi.secure.y06.m31814b(r3, r1)
            r12.mo17067e(r4)
            int r1 = r1 + 4
            goto L_0x027e
        L_0x028a:
            if (r1 != r2) goto L_0x028e
            goto L_0x03ec
        L_0x028e:
            com.onedelhi.secure.t66 r1 = com.onedelhi.secure.t66.m28138f()
            throw r1
        L_0x0293:
            if (r6 != r9) goto L_0x03eb
            com.onedelhi.secure.h56 r12 = (com.onedelhi.secure.h56) r12
            int r1 = com.onedelhi.secure.y06.m31814b(r17, r18)
        L_0x029b:
            r12.mo17067e(r1)
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02b0
            int r4 = com.onedelhi.secure.y06.m31822j(r3, r1, r7)
            int r6 = r7.f21191a
            if (r2 == r6) goto L_0x02ab
            goto L_0x02b0
        L_0x02ab:
            int r1 = com.onedelhi.secure.y06.m31814b(r3, r4)
            goto L_0x029b
        L_0x02b0:
            return r1
        L_0x02b1:
            if (r6 != r14) goto L_0x02d1
            com.onedelhi.secure.a86 r12 = (com.onedelhi.secure.a86) r12
            int r1 = com.onedelhi.secure.y06.m31822j(r3, r4, r7)
            int r2 = r7.f21191a
            int r2 = r2 + r1
        L_0x02bc:
            if (r1 >= r2) goto L_0x02c8
            long r4 = com.onedelhi.secure.y06.m31826n(r3, r1)
            r12.mo12850e(r4)
            int r1 = r1 + 8
            goto L_0x02bc
        L_0x02c8:
            if (r1 != r2) goto L_0x02cc
            goto L_0x03ec
        L_0x02cc:
            com.onedelhi.secure.t66 r1 = com.onedelhi.secure.t66.m28138f()
            throw r1
        L_0x02d1:
            if (r6 != r13) goto L_0x03eb
            com.onedelhi.secure.a86 r12 = (com.onedelhi.secure.a86) r12
            long r8 = com.onedelhi.secure.y06.m31826n(r17, r18)
        L_0x02d9:
            r12.mo12850e(r8)
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x02ee
            int r4 = com.onedelhi.secure.y06.m31822j(r3, r1, r7)
            int r6 = r7.f21191a
            if (r2 == r6) goto L_0x02e9
            goto L_0x02ee
        L_0x02e9:
            long r8 = com.onedelhi.secure.y06.m31826n(r3, r4)
            goto L_0x02d9
        L_0x02ee:
            return r1
        L_0x02ef:
            if (r6 != r14) goto L_0x02f7
            int r1 = com.onedelhi.secure.y06.m31818f(r3, r4, r12, r7)
            goto L_0x03ec
        L_0x02f7:
            if (r6 == 0) goto L_0x02fb
            goto L_0x03eb
        L_0x02fb:
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.onedelhi.secure.y06.m31824l(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x030a:
            if (r6 != r14) goto L_0x032a
            com.onedelhi.secure.a86 r12 = (com.onedelhi.secure.a86) r12
            int r1 = com.onedelhi.secure.y06.m31822j(r3, r4, r7)
            int r2 = r7.f21191a
            int r2 = r2 + r1
        L_0x0315:
            if (r1 >= r2) goto L_0x0321
            int r1 = com.onedelhi.secure.y06.m31825m(r3, r1, r7)
            long r4 = r7.f21192a
            r12.mo12850e(r4)
            goto L_0x0315
        L_0x0321:
            if (r1 != r2) goto L_0x0325
            goto L_0x03ec
        L_0x0325:
            com.onedelhi.secure.t66 r1 = com.onedelhi.secure.t66.m28138f()
            throw r1
        L_0x032a:
            if (r6 != 0) goto L_0x03eb
            com.onedelhi.secure.a86 r12 = (com.onedelhi.secure.a86) r12
        L_0x032e:
            int r1 = com.onedelhi.secure.y06.m31825m(r3, r4, r7)
            long r8 = r7.f21192a
            r12.mo12850e(r8)
            if (r1 >= r5) goto L_0x0341
            int r4 = com.onedelhi.secure.y06.m31822j(r3, r1, r7)
            int r6 = r7.f21191a
            if (r2 == r6) goto L_0x032e
        L_0x0341:
            return r1
        L_0x0342:
            if (r6 != r14) goto L_0x0366
            com.onedelhi.secure.s46 r12 = (com.onedelhi.secure.s46) r12
            int r1 = com.onedelhi.secure.y06.m31822j(r3, r4, r7)
            int r2 = r7.f21191a
            int r2 = r2 + r1
        L_0x034d:
            if (r1 >= r2) goto L_0x035d
            int r4 = com.onedelhi.secure.y06.m31814b(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.mo24204e(r4)
            int r1 = r1 + 4
            goto L_0x034d
        L_0x035d:
            if (r1 != r2) goto L_0x0361
            goto L_0x03ec
        L_0x0361:
            com.onedelhi.secure.t66 r1 = com.onedelhi.secure.t66.m28138f()
            throw r1
        L_0x0366:
            if (r6 != r9) goto L_0x03eb
            com.onedelhi.secure.s46 r12 = (com.onedelhi.secure.s46) r12
            int r1 = com.onedelhi.secure.y06.m31814b(r17, r18)
        L_0x036e:
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo24204e(r1)
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0387
            int r4 = com.onedelhi.secure.y06.m31822j(r3, r1, r7)
            int r6 = r7.f21191a
            if (r2 == r6) goto L_0x0382
            goto L_0x0387
        L_0x0382:
            int r1 = com.onedelhi.secure.y06.m31814b(r3, r4)
            goto L_0x036e
        L_0x0387:
            return r1
        L_0x0388:
            if (r6 != r14) goto L_0x03ab
            com.onedelhi.secure.x36 r12 = (com.onedelhi.secure.x36) r12
            int r1 = com.onedelhi.secure.y06.m31822j(r3, r4, r7)
            int r2 = r7.f21191a
            int r2 = r2 + r1
        L_0x0393:
            if (r1 >= r2) goto L_0x03a3
            long r4 = com.onedelhi.secure.y06.m31826n(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.mo26765e(r4)
            int r1 = r1 + 8
            goto L_0x0393
        L_0x03a3:
            if (r1 != r2) goto L_0x03a6
            goto L_0x03ec
        L_0x03a6:
            com.onedelhi.secure.t66 r1 = com.onedelhi.secure.t66.m28138f()
            throw r1
        L_0x03ab:
            if (r6 != r13) goto L_0x03eb
            com.onedelhi.secure.x36 r12 = (com.onedelhi.secure.x36) r12
            long r8 = com.onedelhi.secure.y06.m31826n(r17, r18)
        L_0x03b3:
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo26765e(r8)
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x03cc
            int r4 = com.onedelhi.secure.y06.m31822j(r3, r1, r7)
            int r6 = r7.f21191a
            if (r2 == r6) goto L_0x03c7
            goto L_0x03cc
        L_0x03c7:
            long r8 = com.onedelhi.secure.y06.m31826n(r3, r4)
            goto L_0x03b3
        L_0x03cc:
            return r1
        L_0x03cd:
            if (r4 >= r5) goto L_0x03ea
            int r8 = com.onedelhi.secure.y06.m31822j(r3, r4, r7)
            int r9 = r7.f21191a
            if (r2 == r9) goto L_0x03d8
            goto L_0x03ea
        L_0x03d8:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.onedelhi.secure.y06.m31815c(r21, r22, r23, r24, r25, r26)
            goto L_0x0055
        L_0x03ea:
            return r4
        L_0x03eb:
            r1 = r4
        L_0x03ec:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.r96.mo23747z(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.onedelhi.secure.u06):int");
    }
}
