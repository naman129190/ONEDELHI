package com.onedelhi.secure;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

public final class ys6<T> implements gt6<T> {

    /* renamed from: a */
    public static final Unsafe f23318a = zu6.m33465l();

    /* renamed from: c */
    public static final int[] f23319c = new int[0];

    /* renamed from: a */
    public final int f23320a;

    /* renamed from: a */
    public final at6 f23321a;

    /* renamed from: a */
    public final pu6 f23322a;

    /* renamed from: a */
    public final qo6 f23323a;

    /* renamed from: a */
    public final qr6 f23324a;

    /* renamed from: a */
    public final qs6 f23325a;

    /* renamed from: a */
    public final vs6 f23326a;

    /* renamed from: a */
    public final boolean f23327a;

    /* renamed from: a */
    public final int[] f23328a;

    /* renamed from: a */
    public final Object[] f23329a;

    /* renamed from: b */
    public final int f23330b;

    /* renamed from: b */
    public final boolean f23331b;

    /* renamed from: b */
    public final int[] f23332b;

    /* renamed from: c */
    public final int f23333c;

    /* renamed from: d */
    public final int f23334d;

    public ys6(int[] iArr, Object[] objArr, int i, int i2, vs6 vs6, boolean z, boolean z2, int[] iArr2, int i3, int i4, at6 at6, qr6 qr6, pu6 pu6, qo6 qo6, qs6 qs6) {
        this.f23328a = iArr;
        this.f23329a = objArr;
        this.f23320a = i;
        this.f23330b = i2;
        this.f23331b = z;
        boolean z3 = false;
        if (qo6 != null && qo6.mo23277c(vs6)) {
            z3 = true;
        }
        this.f23327a = z3;
        this.f23332b = iArr2;
        this.f23333c = i3;
        this.f23334d = i4;
        this.f23321a = at6;
        this.f23324a = qr6;
        this.f23322a = pu6;
        this.f23323a = qo6;
        this.f23326a = vs6;
        this.f23325a = qs6;
    }

    /* renamed from: A */
    public static boolean m32631A(Object obj, int i, gt6 gt6) {
        return gt6.mo16908b(zu6.m33464k(obj, (long) (i & 1048575)));
    }

    /* renamed from: B */
    public static boolean m32632B(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof jq6) {
            return ((jq6) obj).mo18549y();
        }
        return true;
    }

    /* renamed from: D */
    public static boolean m32633D(Object obj, long j) {
        return ((Boolean) zu6.m33464k(obj, j)).booleanValue();
    }

    /* renamed from: E */
    public static final void m32634E(int i, Object obj, yv6 yv6) throws IOException {
        if (obj instanceof String) {
            yv6.mo16788q(i, (String) obj);
        } else {
            yv6.mo16766E(i, (on6) obj);
        }
    }

    /* renamed from: G */
    public static qu6 m32635G(Object obj) {
        jq6 jq6 = (jq6) obj;
        qu6 qu6 = jq6.zzc;
        if (qu6 != qu6.m26175c()) {
            return qu6;
        }
        qu6 f = qu6.m26177f();
        jq6.zzc = f;
        return f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x036e  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.onedelhi.secure.ys6 m32636H(java.lang.Class r31, com.onedelhi.secure.ss6 r32, com.onedelhi.secure.at6 r33, com.onedelhi.secure.qr6 r34, com.onedelhi.secure.pu6 r35, com.onedelhi.secure.qo6 r36, com.onedelhi.secure.qs6 r37) {
        /*
            r0 = r32
            boolean r1 = r0 instanceof com.onedelhi.secure.ft6
            if (r1 == 0) goto L_0x03d8
            com.onedelhi.secure.ft6 r0 = (com.onedelhi.secure.ft6) r0
            int r1 = r0.zzc()
            java.lang.String r2 = r0.mo16169c()
            int r3 = r2.length()
            r4 = 0
            char r5 = r2.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0029
            r5 = 1
        L_0x001f:
            int r8 = r5 + 1
            char r5 = r2.charAt(r5)
            if (r5 < r6) goto L_0x002a
            r5 = r8
            goto L_0x001f
        L_0x0029:
            r8 = 1
        L_0x002a:
            int r5 = r8 + 1
            char r8 = r2.charAt(r8)
            if (r8 < r6) goto L_0x0049
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0036:
            int r11 = r5 + 1
            char r5 = r2.charAt(r5)
            if (r5 < r6) goto L_0x0046
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r10
            r8 = r8 | r5
            int r10 = r10 + 13
            r5 = r11
            goto L_0x0036
        L_0x0046:
            int r5 = r5 << r10
            r8 = r8 | r5
            r5 = r11
        L_0x0049:
            if (r8 != 0) goto L_0x0058
            int[] r8 = f23319c
            r18 = r8
            r8 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r19 = 0
            goto L_0x016e
        L_0x0058:
            int r8 = r5 + 1
            char r5 = r2.charAt(r5)
            if (r5 < r6) goto L_0x0077
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0064:
            int r11 = r8 + 1
            char r8 = r2.charAt(r8)
            if (r8 < r6) goto L_0x0074
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r10
            r5 = r5 | r8
            int r10 = r10 + 13
            r8 = r11
            goto L_0x0064
        L_0x0074:
            int r8 = r8 << r10
            r5 = r5 | r8
            r8 = r11
        L_0x0077:
            int r10 = r8 + 1
            char r8 = r2.charAt(r8)
            if (r8 < r6) goto L_0x0096
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x0083:
            int r12 = r10 + 1
            char r10 = r2.charAt(r10)
            if (r10 < r6) goto L_0x0093
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r8 = r8 | r10
            int r11 = r11 + 13
            r10 = r12
            goto L_0x0083
        L_0x0093:
            int r10 = r10 << r11
            r8 = r8 | r10
            r10 = r12
        L_0x0096:
            int r11 = r10 + 1
            char r10 = r2.charAt(r10)
            if (r10 < r6) goto L_0x00b5
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00a2:
            int r13 = r11 + 1
            char r11 = r2.charAt(r11)
            if (r11 < r6) goto L_0x00b2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00a2
        L_0x00b2:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        L_0x00b5:
            int r12 = r11 + 1
            char r11 = r2.charAt(r11)
            if (r11 < r6) goto L_0x00d4
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00c1:
            int r14 = r12 + 1
            char r12 = r2.charAt(r12)
            if (r12 < r6) goto L_0x00d1
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00c1
        L_0x00d1:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00d4:
            int r13 = r12 + 1
            char r12 = r2.charAt(r12)
            if (r12 < r6) goto L_0x00f3
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e0:
            int r15 = r13 + 1
            char r13 = r2.charAt(r13)
            if (r13 < r6) goto L_0x00f0
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00e0
        L_0x00f0:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00f3:
            int r14 = r13 + 1
            char r13 = r2.charAt(r13)
            if (r13 < r6) goto L_0x0114
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x00ff:
            int r16 = r14 + 1
            char r14 = r2.charAt(r14)
            if (r14 < r6) goto L_0x0110
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x00ff
        L_0x0110:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0114:
            int r15 = r14 + 1
            char r14 = r2.charAt(r14)
            if (r14 < r6) goto L_0x0137
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0120:
            int r17 = r15 + 1
            char r15 = r2.charAt(r15)
            if (r15 < r6) goto L_0x0132
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0120
        L_0x0132:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0137:
            int r16 = r15 + 1
            char r15 = r2.charAt(r15)
            if (r15 < r6) goto L_0x015c
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r4 = r16
            r16 = 13
        L_0x0145:
            int r17 = r4 + 1
            char r4 = r2.charAt(r4)
            if (r4 < r6) goto L_0x0157
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r16
            r15 = r15 | r4
            int r16 = r16 + 13
            r4 = r17
            goto L_0x0145
        L_0x0157:
            int r4 = r4 << r16
            r15 = r15 | r4
            r16 = r17
        L_0x015c:
            int r4 = r15 + r13
            int r4 = r4 + r14
            int r14 = r5 + r5
            int r14 = r14 + r8
            int[] r8 = new int[r4]
            r4 = r5
            r18 = r8
            r8 = r10
            r10 = r14
            r19 = r15
            r5 = r16
            r14 = r11
        L_0x016e:
            sun.misc.Unsafe r11 = f23318a
            java.lang.Object[] r15 = r0.mo16170d()
            com.onedelhi.secure.vs6 r16 = r0.mo16167a()
            java.lang.Class r9 = r16.getClass()
            int r20 = r19 + r13
            int r13 = r12 + r12
            int r12 = r12 * 3
            int[] r12 = new int[r12]
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r21 = r19
            r22 = r20
            r16 = 0
            r17 = 0
        L_0x018e:
            r7 = 2
            if (r1 != r7) goto L_0x0193
            r7 = 1
            goto L_0x0194
        L_0x0193:
            r7 = 0
        L_0x0194:
            if (r5 >= r3) goto L_0x03b7
            int r24 = r5 + 1
            char r5 = r2.charAt(r5)
            if (r5 < r6) goto L_0x01c3
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r6 = r24
            r24 = 13
        L_0x01a4:
            int r26 = r6 + 1
            char r6 = r2.charAt(r6)
            r27 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r1) goto L_0x01bd
            r1 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r24
            r5 = r5 | r1
            int r24 = r24 + 13
            r6 = r26
            r1 = r27
            goto L_0x01a4
        L_0x01bd:
            int r1 = r6 << r24
            r5 = r5 | r1
            r1 = r26
            goto L_0x01c7
        L_0x01c3:
            r27 = r1
            r1 = r24
        L_0x01c7:
            int r6 = r1 + 1
            char r1 = r2.charAt(r1)
            r24 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r3) goto L_0x01f2
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x01d8:
            int r28 = r6 + 1
            char r6 = r2.charAt(r6)
            if (r6 < r3) goto L_0x01ed
            r3 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r26
            r1 = r1 | r3
            int r26 = r26 + 13
            r6 = r28
            r3 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01d8
        L_0x01ed:
            int r3 = r6 << r26
            r1 = r1 | r3
            r6 = r28
        L_0x01f2:
            r3 = r1 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x01fc
            int r3 = r16 + 1
            r18[r16] = r17
            r16 = r3
        L_0x01fc:
            r3 = r1 & 255(0xff, float:3.57E-43)
            r26 = r14
            r14 = 51
            if (r3 < r14) goto L_0x029b
            int r14 = r6 + 1
            char r6 = r2.charAt(r6)
            r28 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r14) goto L_0x0236
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r14 = r28
            r28 = 13
        L_0x0217:
            int r29 = r14 + 1
            char r14 = r2.charAt(r14)
            r30 = r8
            r8 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r8) goto L_0x0230
            r8 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r28
            r6 = r6 | r8
            int r28 = r28 + 13
            r14 = r29
            r8 = r30
            goto L_0x0217
        L_0x0230:
            int r8 = r14 << r28
            r6 = r6 | r8
            r14 = r29
            goto L_0x023a
        L_0x0236:
            r30 = r8
            r14 = r28
        L_0x023a:
            int r8 = r3 + -51
            r28 = r14
            r14 = 9
            if (r8 == r14) goto L_0x0259
            r14 = 17
            if (r8 != r14) goto L_0x0247
            goto L_0x0259
        L_0x0247:
            r14 = 12
            if (r8 != r14) goto L_0x0265
            if (r7 != 0) goto L_0x0265
            int r7 = r17 / 3
            int r7 = r7 + r7
            r8 = 1
            int r7 = r7 + r8
            int r8 = r10 + 1
            r10 = r15[r10]
            r13[r7] = r10
            goto L_0x0264
        L_0x0259:
            int r7 = r17 / 3
            int r7 = r7 + r7
            r8 = 1
            int r7 = r7 + r8
            int r8 = r10 + 1
            r10 = r15[r10]
            r13[r7] = r10
        L_0x0264:
            r10 = r8
        L_0x0265:
            int r6 = r6 + r6
            r7 = r15[r6]
            boolean r8 = r7 instanceof java.lang.reflect.Field
            if (r8 == 0) goto L_0x026f
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x0277
        L_0x026f:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = m32642o(r9, r7)
            r15[r6] = r7
        L_0x0277:
            long r7 = r11.objectFieldOffset(r7)
            int r8 = (int) r7
            int r6 = r6 + 1
            r7 = r15[r6]
            boolean r14 = r7 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0287
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x028f
        L_0x0287:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = m32642o(r9, r7)
            r15[r6] = r7
        L_0x028f:
            long r6 = r11.objectFieldOffset(r7)
            int r7 = (int) r6
            r23 = r15
            r25 = r28
            r6 = 0
            goto L_0x0382
        L_0x029b:
            r30 = r8
            int r8 = r10 + 1
            r10 = r15[r10]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = m32642o(r9, r10)
            r14 = 9
            if (r3 == r14) goto L_0x030b
            r14 = 17
            if (r3 != r14) goto L_0x02b0
            goto L_0x030b
        L_0x02b0:
            r14 = 27
            if (r3 == r14) goto L_0x02fd
            r14 = 49
            if (r3 != r14) goto L_0x02b9
            goto L_0x02fd
        L_0x02b9:
            r14 = 12
            if (r3 == r14) goto L_0x02ed
            r14 = 30
            if (r3 == r14) goto L_0x02ed
            r14 = 44
            if (r3 != r14) goto L_0x02c6
            goto L_0x02ed
        L_0x02c6:
            r7 = 50
            if (r3 != r7) goto L_0x02fb
            int r7 = r21 + 1
            r18[r21] = r17
            int r14 = r17 / 3
            int r21 = r8 + 1
            r8 = r15[r8]
            int r14 = r14 + r14
            r13[r14] = r8
            r8 = r1 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x02e6
            int r14 = r14 + 1
            int r8 = r21 + 1
            r21 = r15[r21]
            r13[r14] = r21
            r21 = r7
            goto L_0x0316
        L_0x02e6:
            r23 = r15
            r8 = r21
            r21 = r7
            goto L_0x0318
        L_0x02ed:
            if (r7 != 0) goto L_0x02fb
            int r7 = r17 / 3
            int r7 = r7 + r7
            r14 = 1
            int r7 = r7 + r14
            int r23 = r8 + 1
            r8 = r15[r8]
            r13[r7] = r8
            goto L_0x0308
        L_0x02fb:
            r14 = 1
            goto L_0x0316
        L_0x02fd:
            r14 = 1
            int r7 = r17 / 3
            int r7 = r7 + r7
            int r7 = r7 + r14
            int r23 = r8 + 1
            r8 = r15[r8]
            r13[r7] = r8
        L_0x0308:
            r8 = r23
            goto L_0x0316
        L_0x030b:
            r14 = 1
            int r7 = r17 / 3
            int r7 = r7 + r7
            int r7 = r7 + r14
            java.lang.Class r23 = r10.getType()
            r13[r7] = r23
        L_0x0316:
            r23 = r15
        L_0x0318:
            long r14 = r11.objectFieldOffset(r10)
            int r7 = (int) r14
            r10 = r1 & 4096(0x1000, float:5.74E-42)
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r15 = 4096(0x1000, float:5.74E-42)
            if (r10 != r15) goto L_0x036e
            r10 = 17
            if (r3 > r10) goto L_0x036e
            int r10 = r6 + 1
            char r6 = r2.charAt(r6)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r15) goto L_0x034d
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x0339:
            int r25 = r10 + 1
            char r10 = r2.charAt(r10)
            if (r10 < r15) goto L_0x034a
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r14
            r6 = r6 | r10
            int r14 = r14 + 13
            r10 = r25
            goto L_0x0339
        L_0x034a:
            int r10 = r10 << r14
            r6 = r6 | r10
            goto L_0x034f
        L_0x034d:
            r25 = r10
        L_0x034f:
            int r10 = r4 + r4
            int r14 = r6 / 32
            int r10 = r10 + r14
            r14 = r23[r10]
            boolean r15 = r14 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x035d
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            goto L_0x0365
        L_0x035d:
            java.lang.String r14 = (java.lang.String) r14
            java.lang.reflect.Field r14 = m32642o(r9, r14)
            r23[r10] = r14
        L_0x0365:
            long r14 = r11.objectFieldOffset(r14)
            int r10 = (int) r14
            int r6 = r6 % 32
            r14 = r10
            goto L_0x0371
        L_0x036e:
            r25 = r6
            r6 = 0
        L_0x0371:
            r10 = 18
            if (r3 < r10) goto L_0x037f
            r10 = 49
            if (r3 > r10) goto L_0x037f
            int r10 = r22 + 1
            r18[r22] = r7
            r22 = r10
        L_0x037f:
            r10 = r8
            r8 = r7
            r7 = r14
        L_0x0382:
            int r14 = r17 + 1
            r12[r17] = r5
            int r5 = r14 + 1
            r15 = r1 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L_0x038f
            r15 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0390
        L_0x038f:
            r15 = 0
        L_0x0390:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0397
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0398
        L_0x0397:
            r1 = 0
        L_0x0398:
            int r3 = r3 << 20
            r1 = r1 | r15
            r1 = r1 | r3
            r1 = r1 | r8
            r12[r14] = r1
            int r17 = r5 + 1
            int r1 = r6 << 20
            r1 = r1 | r7
            r12[r5] = r1
            r15 = r23
            r3 = r24
            r5 = r25
            r14 = r26
            r1 = r27
            r8 = r30
            r6 = 55296(0xd800, float:7.7486E-41)
            goto L_0x018e
        L_0x03b7:
            r30 = r8
            r26 = r14
            com.onedelhi.secure.ys6 r1 = new com.onedelhi.secure.ys6
            com.onedelhi.secure.vs6 r15 = r0.mo16167a()
            r17 = 0
            r10 = r1
            r11 = r12
            r12 = r13
            r13 = r30
            r16 = r7
            r21 = r33
            r22 = r34
            r23 = r35
            r24 = r36
            r25 = r37
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r1
        L_0x03d8:
            com.onedelhi.secure.mu6 r0 = (com.onedelhi.secure.mu6) r0
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ys6.m32636H(java.lang.Class, com.onedelhi.secure.ss6, com.onedelhi.secure.at6, com.onedelhi.secure.qr6, com.onedelhi.secure.pu6, com.onedelhi.secure.qo6, com.onedelhi.secure.qs6):com.onedelhi.secure.ys6");
    }

    /* renamed from: I */
    public static double m32637I(Object obj, long j) {
        return ((Double) zu6.m33464k(obj, j)).doubleValue();
    }

    /* renamed from: J */
    public static float m32638J(Object obj, long j) {
        return ((Float) zu6.m33464k(obj, j)).floatValue();
    }

    /* renamed from: L */
    public static int m32639L(Object obj, long j) {
        return ((Integer) zu6.m33464k(obj, j)).intValue();
    }

    /* renamed from: T */
    public static int m32640T(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: V */
    public static long m32641V(Object obj, long j) {
        return ((Long) zu6.m33464k(obj, j)).longValue();
    }

    /* renamed from: o */
    public static Field m32642o(Class cls, String str) {
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
    public static void m32643p(Object obj) {
        if (!m32632B(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    /* renamed from: C */
    public final boolean mo27681C(Object obj, int i, int i2) {
        return zu6.m33461h(obj, (long) (mo27689R(i2) & 1048575)) == i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v49, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v91, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0308, code lost:
        if (r0 != r15) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0325, code lost:
        r2 = r0;
        r7 = r21;
        r6 = r24;
        r0 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0359, code lost:
        if (r0 != r15) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x037f, code lost:
        if (r0 != r15) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010d, code lost:
        r10.putInt(r14, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014f, code lost:
        r5 = r7 | r8;
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0152, code lost:
        r1 = r11;
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0156, code lost:
        r12 = r6;
        r21 = r13;
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ea, code lost:
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x021d, code lost:
        r6 = r24;
        r8 = -1;
        r13 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x024b, code lost:
        r0 = r13 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x024d, code lost:
        r5 = r7 | r8;
        r13 = r32;
        r2 = r6;
        r1 = r11;
        r3 = r21;
        r6 = r24;
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0258, code lost:
        r11 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x025c, code lost:
        r12 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x025d, code lost:
        r0 = r33;
        r20 = r7;
        r27 = r10;
        r31 = r11;
        r22 = r12;
        r2 = r13;
        r7 = r21;
        r6 = r24;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo27682F(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.onedelhi.secure.vl6 r34) throws java.io.IOException {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            m32643p(r29)
            sun.misc.Unsafe r10 = f23318a
            r8 = -1
            r16 = 0
            r0 = r31
            r1 = -1
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001d:
            r17 = 0
            if (r0 >= r13) goto L_0x03ef
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0030
            int r0 = com.onedelhi.secure.xl6.m31544k(r0, r12, r3, r9)
            int r3 = r9.f21853a
            r4 = r3
            r3 = r0
            goto L_0x0031
        L_0x0030:
            r4 = r0
        L_0x0031:
            int r0 = r4 >>> 3
            r7 = 3
            if (r0 <= r1) goto L_0x003c
            int r2 = r2 / r7
            int r1 = r15.mo27688Q(r0, r2)
            goto L_0x0040
        L_0x003c:
            int r1 = r15.mo27687P(r0)
        L_0x0040:
            r2 = r1
            if (r2 != r8) goto L_0x0052
            r31 = r0
            r2 = r3
            r7 = r4
            r20 = r5
            r27 = r10
            r0 = r11
            r19 = -1
            r22 = 0
            goto L_0x0382
        L_0x0052:
            r1 = r4 & 7
            int[] r8 = r15.f23328a
            int r20 = r2 + 1
            r7 = r8[r20]
            int r11 = m32640T(r7)
            r20 = r0
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r7 & r18
            r22 = r3
            r21 = r4
            long r3 = (long) r0
            r0 = 17
            if (r11 > r0) goto L_0x0270
            int r0 = r2 + 2
            r0 = r8[r0]
            int r8 = r0 >>> 20
            r13 = 1
            int r8 = r13 << r8
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r13
            r18 = r7
            if (r0 == r6) goto L_0x008e
            if (r6 == r13) goto L_0x0085
            long r6 = (long) r6
            r10.putInt(r14, r6, r5)
        L_0x0085:
            long r5 = (long) r0
            int r5 = r10.getInt(r14, r5)
            r24 = r0
            r7 = r5
            goto L_0x0091
        L_0x008e:
            r7 = r5
            r24 = r6
        L_0x0091:
            r0 = 5
            switch(r11) {
                case 0: goto L_0x0238;
                case 1: goto L_0x0223;
                case 2: goto L_0x01fe;
                case 3: goto L_0x01fe;
                case 4: goto L_0x01ed;
                case 5: goto L_0x01d2;
                case 6: goto L_0x01c0;
                case 7: goto L_0x01a5;
                case 8: goto L_0x0187;
                case 9: goto L_0x015c;
                case 10: goto L_0x013c;
                case 11: goto L_0x01ed;
                case 12: goto L_0x0111;
                case 13: goto L_0x01c0;
                case 14: goto L_0x01d2;
                case 15: goto L_0x00fa;
                case 16: goto L_0x00cb;
                default: goto L_0x0095;
            }
        L_0x0095:
            r6 = r2
            r11 = r20
            r13 = r22
            r0 = 3
            if (r1 != r0) goto L_0x025c
            java.lang.Object r5 = r15.mo27695m(r14, r6)
            int r0 = r11 << 3
            r17 = r0 | 4
            com.onedelhi.secure.gt6 r1 = r15.mo27693k(r6)
            r0 = r5
            r2 = r30
            r3 = r13
            r4 = r32
            r13 = r5
            r5 = r17
            r12 = r6
            r6 = r34
            int r0 = com.onedelhi.secure.xl6.m31547n(r0, r1, r2, r3, r4, r5, r6)
            r15.mo27701u(r14, r12, r13)
            r5 = r7 | r8
            r13 = r32
            r1 = r11
            r2 = r12
            r3 = r21
            r6 = r24
            r8 = -1
            r12 = r30
            goto L_0x0258
        L_0x00cb:
            if (r1 != 0) goto L_0x00f3
            r5 = r22
            int r6 = com.onedelhi.secure.xl6.m31546m(r12, r5, r9)
            long r0 = r9.f21854a
            long r17 = com.onedelhi.secure.wn6.m30971b(r0)
            r11 = r20
            r0 = r10
            r1 = r29
            r5 = r2
            r2 = r3
            r20 = r6
            r13 = r21
            r6 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            r5 = r7 | r8
            r2 = r6
            r1 = r11
            r3 = r13
            r0 = r20
            goto L_0x021d
        L_0x00f3:
            r11 = r20
            r12 = r2
            r13 = r22
            goto L_0x025d
        L_0x00fa:
            r6 = r2
            r11 = r20
            r13 = r21
            r5 = r22
            if (r1 != 0) goto L_0x0156
            int r0 = com.onedelhi.secure.xl6.m31543j(r12, r5, r9)
            int r1 = r9.f21853a
            int r1 = com.onedelhi.secure.wn6.m30970a(r1)
        L_0x010d:
            r10.putInt(r14, r3, r1)
            goto L_0x014f
        L_0x0111:
            r6 = r2
            r11 = r20
            r13 = r21
            r5 = r22
            if (r1 != 0) goto L_0x0156
            int r0 = com.onedelhi.secure.xl6.m31543j(r12, r5, r9)
            int r1 = r9.f21853a
            com.onedelhi.secure.rq6 r2 = r15.mo27692j(r6)
            if (r2 == 0) goto L_0x010d
            boolean r2 = r2.mo14621a(r1)
            if (r2 == 0) goto L_0x012d
            goto L_0x010d
        L_0x012d:
            com.onedelhi.secure.qu6 r2 = m32635G(r29)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo23454j(r13, r1)
            r2 = r6
            r5 = r7
            goto L_0x0152
        L_0x013c:
            r6 = r2
            r11 = r20
            r13 = r21
            r5 = r22
            r0 = 2
            if (r1 != r0) goto L_0x0156
            int r0 = com.onedelhi.secure.xl6.m31534a(r12, r5, r9)
            java.lang.Object r1 = r9.f21856a
            r10.putObject(r14, r3, r1)
        L_0x014f:
            r5 = r7 | r8
            r2 = r6
        L_0x0152:
            r1 = r11
            r3 = r13
            goto L_0x021d
        L_0x0156:
            r12 = r6
            r21 = r13
            r13 = r5
            goto L_0x025d
        L_0x015c:
            r6 = r2
            r11 = r20
            r13 = r21
            r5 = r22
            r0 = 2
            if (r1 != r0) goto L_0x0183
            java.lang.Object r4 = r15.mo27695m(r14, r6)
            com.onedelhi.secure.gt6 r1 = r15.mo27693k(r6)
            r0 = r4
            r2 = r30
            r3 = r5
            r5 = r4
            r4 = r32
            r21 = r13
            r13 = r5
            r5 = r34
            int r0 = com.onedelhi.secure.xl6.m31548o(r0, r1, r2, r3, r4, r5)
            r15.mo27701u(r14, r6, r13)
            goto L_0x024d
        L_0x0183:
            r21 = r13
            goto L_0x01ea
        L_0x0187:
            r6 = r2
            r11 = r20
            r5 = r22
            r0 = 2
            if (r1 != r0) goto L_0x01ea
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r18 & r0
            if (r0 != 0) goto L_0x019a
            int r0 = com.onedelhi.secure.xl6.m31540g(r12, r5, r9)
            goto L_0x019e
        L_0x019a:
            int r0 = com.onedelhi.secure.xl6.m31541h(r12, r5, r9)
        L_0x019e:
            java.lang.Object r1 = r9.f21856a
            r10.putObject(r14, r3, r1)
            goto L_0x024d
        L_0x01a5:
            r6 = r2
            r11 = r20
            r5 = r22
            if (r1 != 0) goto L_0x01ea
            int r0 = com.onedelhi.secure.xl6.m31546m(r12, r5, r9)
            long r1 = r9.f21854a
            r17 = 0
            int r5 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r5 == 0) goto L_0x01ba
            r13 = 1
            goto L_0x01bb
        L_0x01ba:
            r13 = 0
        L_0x01bb:
            com.onedelhi.secure.zu6.m33471r(r14, r3, r13)
            goto L_0x024d
        L_0x01c0:
            r6 = r2
            r11 = r20
            r5 = r22
            if (r1 != r0) goto L_0x01ea
            int r0 = com.onedelhi.secure.xl6.m31535b(r12, r5)
            r10.putInt(r14, r3, r0)
            int r0 = r5 + 4
            goto L_0x024d
        L_0x01d2:
            r6 = r2
            r11 = r20
            r5 = r22
            r0 = 1
            if (r1 != r0) goto L_0x01ea
            long r17 = com.onedelhi.secure.xl6.m31549p(r12, r5)
            r0 = r10
            r1 = r29
            r13 = r5
            r2 = r3
            r4 = r17
            r0.putLong(r1, r2, r4)
            goto L_0x024b
        L_0x01ea:
            r13 = r5
            goto L_0x025c
        L_0x01ed:
            r6 = r2
            r11 = r20
            r13 = r22
            if (r1 != 0) goto L_0x025c
            int r0 = com.onedelhi.secure.xl6.m31543j(r12, r13, r9)
            int r1 = r9.f21853a
            r10.putInt(r14, r3, r1)
            goto L_0x024d
        L_0x01fe:
            r6 = r2
            r11 = r20
            r13 = r22
            if (r1 != 0) goto L_0x025c
            int r13 = com.onedelhi.secure.xl6.m31546m(r12, r13, r9)
            long r1 = r9.f21854a
            r0 = r10
            r17 = r1
            r1 = r29
            r2 = r3
            r4 = r17
            r0.putLong(r1, r2, r4)
            r5 = r7 | r8
            r2 = r6
            r1 = r11
            r0 = r13
            r3 = r21
        L_0x021d:
            r6 = r24
            r8 = -1
            r13 = r32
            goto L_0x0258
        L_0x0223:
            r6 = r2
            r11 = r20
            r13 = r22
            if (r1 != r0) goto L_0x025c
            int r0 = com.onedelhi.secure.xl6.m31535b(r12, r13)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.onedelhi.secure.zu6.m33474u(r14, r3, r0)
            int r0 = r13 + 4
            goto L_0x024d
        L_0x0238:
            r6 = r2
            r11 = r20
            r13 = r22
            r0 = 1
            if (r1 != r0) goto L_0x025c
            long r0 = com.onedelhi.secure.xl6.m31549p(r12, r13)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.onedelhi.secure.zu6.m33473t(r14, r3, r0)
        L_0x024b:
            int r0 = r13 + 8
        L_0x024d:
            r5 = r7 | r8
            r13 = r32
            r2 = r6
            r1 = r11
            r3 = r21
            r6 = r24
            r8 = -1
        L_0x0258:
            r11 = r33
            goto L_0x001d
        L_0x025c:
            r12 = r6
        L_0x025d:
            r0 = r33
            r20 = r7
            r27 = r10
            r31 = r11
            r22 = r12
            r2 = r13
            r7 = r21
            r6 = r24
            r19 = -1
            goto L_0x0382
        L_0x0270:
            r12 = r2
            r18 = r7
            r8 = r20
            r13 = r22
            r0 = 27
            if (r11 != r0) goto L_0x02d2
            r0 = 2
            if (r1 != r0) goto L_0x02c3
            java.lang.Object r0 = r10.getObject(r14, r3)
            com.onedelhi.secure.xq6 r0 = (com.onedelhi.secure.xq6) r0
            boolean r1 = r0.mo23936c()
            if (r1 != 0) goto L_0x029b
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0293
            r1 = 10
            goto L_0x0294
        L_0x0293:
            int r1 = r1 + r1
        L_0x0294:
            com.onedelhi.secure.xq6 r0 = r0.mo14324d2(r1)
            r10.putObject(r14, r3, r0)
        L_0x029b:
            r7 = r0
            com.onedelhi.secure.gt6 r0 = r15.mo27693k(r12)
            r1 = r21
            r2 = r30
            r3 = r13
            r4 = r32
            r20 = r5
            r5 = r7
            r24 = r6
            r6 = r34
            int r0 = com.onedelhi.secure.xl6.m31538e(r0, r1, r2, r3, r4, r5, r6)
            r13 = r32
            r11 = r33
            r1 = r8
            r2 = r12
            r5 = r20
            r3 = r21
            r6 = r24
            r8 = -1
            r12 = r30
            goto L_0x001d
        L_0x02c3:
            r20 = r5
            r24 = r6
            r31 = r8
            r27 = r10
            r22 = r12
            r15 = r13
            r19 = -1
            goto L_0x035c
        L_0x02d2:
            r20 = r5
            r24 = r6
            r0 = 49
            if (r11 > r0) goto L_0x032e
            r7 = r18
            long r6 = (long) r7
            r0 = r28
            r5 = r1
            r1 = r29
            r2 = r30
            r25 = r3
            r3 = r13
            r4 = r32
            r18 = r5
            r5 = r21
            r22 = r6
            r6 = r8
            r7 = r18
            r31 = r8
            r19 = -1
            r8 = r12
            r27 = r10
            r9 = r22
            r15 = r33
            r22 = r12
            r15 = r13
            r12 = r25
            r14 = r34
            int r0 = r0.mo27686O(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0325
        L_0x030a:
            r15 = r28
            r14 = r29
            r12 = r30
            r1 = r31
            r13 = r32
            r11 = r33
            r9 = r34
            r5 = r20
            r3 = r21
            r2 = r22
            r6 = r24
            r10 = r27
            r8 = -1
            goto L_0x001d
        L_0x0325:
            r2 = r0
            r7 = r21
            r6 = r24
            r0 = r33
            goto L_0x0382
        L_0x032e:
            r25 = r3
            r31 = r8
            r27 = r10
            r22 = r12
            r15 = r13
            r7 = r18
            r19 = -1
            r18 = r1
            r0 = 50
            r8 = r18
            if (r11 != r0) goto L_0x0364
            r0 = 2
            if (r8 != r0) goto L_0x035c
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r22
            r6 = r25
            r8 = r34
            int r0 = r0.mo27684M(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0325
            goto L_0x030a
        L_0x035c:
            r0 = r33
            r2 = r15
            r7 = r21
            r6 = r24
            goto L_0x0382
        L_0x0364:
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r21
            r6 = r31
            r9 = r7
            r7 = r8
            r8 = r9
            r9 = r11
            r10 = r25
            r12 = r22
            r13 = r34
            int r0 = r0.mo27685N(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0325
            goto L_0x030a
        L_0x0382:
            if (r7 != r0) goto L_0x0391
            if (r0 == 0) goto L_0x0391
            r8 = r28
            r12 = r29
            r9 = r0
            r0 = r2
            r3 = r7
            r5 = r20
            goto L_0x03f8
        L_0x0391:
            r8 = r28
            r9 = r0
            boolean r0 = r8.f23327a
            if (r0 == 0) goto L_0x03c7
            r10 = r34
            com.onedelhi.secure.oo6 r0 = r10.f21855a
            com.onedelhi.secure.oo6 r1 = com.onedelhi.secure.oo6.f18059b
            if (r0 == r1) goto L_0x03c2
            com.onedelhi.secure.vs6 r1 = r8.f23326a
            r11 = r31
            com.onedelhi.secure.mp6 r0 = r0.mo22047b(r1, r11)
            if (r0 != 0) goto L_0x03bc
            com.onedelhi.secure.qu6 r4 = m32635G(r29)
            r0 = r7
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.onedelhi.secure.xl6.m31542i(r0, r1, r2, r3, r4, r5)
            r12 = r29
            goto L_0x03dc
        L_0x03bc:
            r12 = r29
            r0 = r12
            com.onedelhi.secure.kp6 r0 = (com.onedelhi.secure.kp6) r0
            throw r17
        L_0x03c2:
            r12 = r29
            r11 = r31
            goto L_0x03cd
        L_0x03c7:
            r12 = r29
            r11 = r31
            r10 = r34
        L_0x03cd:
            com.onedelhi.secure.qu6 r4 = m32635G(r29)
            r0 = r7
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.onedelhi.secure.xl6.m31542i(r0, r1, r2, r3, r4, r5)
        L_0x03dc:
            r13 = r32
            r3 = r7
            r15 = r8
            r1 = r11
            r14 = r12
            r5 = r20
            r2 = r22
            r8 = -1
            r12 = r30
            r11 = r9
            r9 = r10
            r10 = r27
            goto L_0x001d
        L_0x03ef:
            r20 = r5
            r24 = r6
            r27 = r10
            r9 = r11
            r12 = r14
            r8 = r15
        L_0x03f8:
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r1) goto L_0x0403
            long r6 = (long) r6
            r2 = r27
            r2.putInt(r12, r6, r5)
        L_0x0403:
            int r2 = r8.f23333c
        L_0x0405:
            int r4 = r8.f23334d
            if (r2 >= r4) goto L_0x0430
            int[] r4 = r8.f23332b
            r4 = r4[r2]
            int[] r5 = r8.f23328a
            r5 = r5[r4]
            int r5 = r8.mo27691U(r4)
            r5 = r5 & r1
            long r5 = (long) r5
            java.lang.Object r5 = com.onedelhi.secure.zu6.m33464k(r12, r5)
            if (r5 != 0) goto L_0x041e
            goto L_0x0424
        L_0x041e:
            com.onedelhi.secure.rq6 r6 = r8.mo27692j(r4)
            if (r6 != 0) goto L_0x0427
        L_0x0424:
            int r2 = r2 + 1
            goto L_0x0405
        L_0x0427:
            com.onedelhi.secure.ps6 r5 = (com.onedelhi.secure.ps6) r5
            java.lang.Object r0 = r8.mo27694l(r4)
            com.onedelhi.secure.os6 r0 = (com.onedelhi.secure.os6) r0
            throw r17
        L_0x0430:
            r1 = r32
            if (r9 != 0) goto L_0x043c
            if (r0 != r1) goto L_0x0437
            goto L_0x0440
        L_0x0437:
            com.onedelhi.secure.dr6 r0 = com.onedelhi.secure.dr6.m13276e()
            throw r0
        L_0x043c:
            if (r0 > r1) goto L_0x0441
            if (r3 != r9) goto L_0x0441
        L_0x0440:
            return r0
        L_0x0441:
            com.onedelhi.secure.dr6 r0 = com.onedelhi.secure.dr6.m13276e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ys6.mo27682F(java.lang.Object, byte[], int, int, int, com.onedelhi.secure.vl6):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02ca, code lost:
        r6 = r6 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x038f, code lost:
        r9 = com.onedelhi.secure.eo6.f11310a;
        r3 = ((com.onedelhi.secure.on6) r3).mo18486f();
        r3 = com.onedelhi.secure.eo6.m13910y(r11 << 3) + (com.onedelhi.secure.eo6.m13910y(r3) + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03ee, code lost:
        r4 = r11 << 3;
        r3 = com.onedelhi.secure.eo6.m13907v(r2.getInt(r1, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03f8, code lost:
        r4 = com.onedelhi.secure.eo6.m13910y(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0408, code lost:
        r3 = com.onedelhi.secure.eo6.m13911z(r2.getLong(r1, r3));
        r4 = com.onedelhi.secure.eo6.m13910y(r11 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0416, code lost:
        r6 = r6 + (r4 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x041e, code lost:
        r3 = com.onedelhi.secure.eo6.m13910y(r11 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x042d, code lost:
        r3 = com.onedelhi.secure.eo6.m13910y(r11 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0437, code lost:
        r5 = r5 + 3;
        r3 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0093, code lost:
        if (mo27681C(r1, r11, r5) != false) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009b, code lost:
        if (mo27681C(r1, r11, r5) != false) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a3, code lost:
        if (mo27681C(r1, r11, r5) != false) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c3, code lost:
        r9 = com.onedelhi.secure.eo6.f11310a;
        r3 = ((com.onedelhi.secure.on6) r3).mo18486f();
        r3 = com.onedelhi.secure.eo6.m13910y(r11 << 3) + (com.onedelhi.secure.eo6.m13910y(r3) + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0118, code lost:
        if (mo27681C(r1, r11, r5) != false) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011f, code lost:
        if (mo27681C(r1, r11, r5) != false) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0126, code lost:
        if (mo27681C(r1, r11, r5) != false) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0128, code lost:
        r4 = r11 << 3;
        r3 = com.onedelhi.secure.eo6.m13907v(m32639L(r1, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0132, code lost:
        r4 = com.onedelhi.secure.eo6.m13910y(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x013c, code lost:
        if (mo27681C(r1, r11, r5) != false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0143, code lost:
        if (mo27681C(r1, r11, r5) != false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0145, code lost:
        r3 = com.onedelhi.secure.eo6.m13911z(m32641V(r1, r3));
        r4 = com.onedelhi.secure.eo6.m13910y(r11 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0159, code lost:
        if (mo27681C(r1, r11, r5) != false) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015b, code lost:
        r3 = com.onedelhi.secure.eo6.m13910y(r11 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0169, code lost:
        if (mo27681C(r1, r11, r5) != false) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016b, code lost:
        r3 = com.onedelhi.secure.eo6.m13910y(r11 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019c, code lost:
        if (r3 > 0) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01aa, code lost:
        if (r3 > 0) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b8, code lost:
        if (r3 > 0) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c6, code lost:
        if (r3 > 0) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d4, code lost:
        if (r3 > 0) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01e2, code lost:
        if (r3 > 0) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f2, code lost:
        if (r3 > 0) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ff, code lost:
        if (r3 > 0) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x020c, code lost:
        if (r3 > 0) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0219, code lost:
        if (r3 > 0) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0226, code lost:
        if (r3 > 0) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0233, code lost:
        if (r3 > 0) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0240, code lost:
        if (r3 > 0) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x024d, code lost:
        if (r3 > 0) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x024f, code lost:
        r4 = com.onedelhi.secure.eo6.m13910y(r11 << 3) + com.onedelhi.secure.eo6.m13910y(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x025a, code lost:
        r6 = r6 + (r4 + r3);
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo27683K(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f23318a
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 0
        L_0x000f:
            int[] r9 = r0.f23328a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x043e
            int r9 = r0.mo27691U(r5)
            int[] r10 = r0.f23328a
            r11 = r10[r5]
            int r12 = m32640T(r9)
            r13 = 17
            r14 = 1
            if (r12 > r13) goto L_0x0038
            int r13 = r5 + 2
            r10 = r10[r13]
            r13 = r10 & r3
            int r10 = r10 >>> 20
            if (r13 == r7) goto L_0x0035
            long r7 = (long) r13
            int r8 = r2.getInt(r1, r7)
            r7 = r13
        L_0x0035:
            int r10 = r14 << r10
            goto L_0x0039
        L_0x0038:
            r10 = 0
        L_0x0039:
            r9 = r9 & r3
            long r3 = (long) r9
            r9 = 63
            switch(r12) {
                case 0: goto L_0x0428;
                case 1: goto L_0x0419;
                case 2: goto L_0x0403;
                case 3: goto L_0x03fd;
                case 4: goto L_0x03e9;
                case 5: goto L_0x03e3;
                case 6: goto L_0x03dd;
                case 7: goto L_0x03cf;
                case 8: goto L_0x03b8;
                case 9: goto L_0x03a5;
                case 10: goto L_0x0386;
                case 11: goto L_0x0375;
                case 12: goto L_0x036e;
                case 13: goto L_0x0367;
                case 14: goto L_0x0360;
                case 15: goto L_0x0346;
                case 16: goto L_0x032c;
                case 17: goto L_0x0318;
                case 18: goto L_0x030a;
                case 19: goto L_0x02fe;
                case 20: goto L_0x02f2;
                case 21: goto L_0x02e6;
                case 22: goto L_0x02da;
                case 23: goto L_0x030a;
                case 24: goto L_0x02fe;
                case 25: goto L_0x02ce;
                case 26: goto L_0x02c0;
                case 27: goto L_0x02b1;
                case 28: goto L_0x02a6;
                case 29: goto L_0x029a;
                case 30: goto L_0x028e;
                case 31: goto L_0x0282;
                case 32: goto L_0x0276;
                case 33: goto L_0x026a;
                case 34: goto L_0x025e;
                case 35: goto L_0x0243;
                case 36: goto L_0x0236;
                case 37: goto L_0x0229;
                case 38: goto L_0x021c;
                case 39: goto L_0x020f;
                case 40: goto L_0x0202;
                case 41: goto L_0x01f5;
                case 42: goto L_0x01e6;
                case 43: goto L_0x01d8;
                case 44: goto L_0x01ca;
                case 45: goto L_0x01bc;
                case 46: goto L_0x01ae;
                case 47: goto L_0x01a0;
                case 48: goto L_0x0192;
                case 49: goto L_0x0182;
                case 50: goto L_0x0175;
                case 51: goto L_0x0165;
                case 52: goto L_0x0155;
                case 53: goto L_0x013f;
                case 54: goto L_0x0138;
                case 55: goto L_0x0122;
                case 56: goto L_0x011b;
                case 57: goto L_0x0114;
                case 58: goto L_0x0105;
                case 59: goto L_0x00ed;
                case 60: goto L_0x00d9;
                case 61: goto L_0x00b9;
                case 62: goto L_0x00a7;
                case 63: goto L_0x009f;
                case 64: goto L_0x0097;
                case 65: goto L_0x008f;
                case 66: goto L_0x0074;
                case 67: goto L_0x0058;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x02cb
        L_0x0042:
            boolean r9 = r0.mo27681C(r1, r11, r5)
            if (r9 == 0) goto L_0x02cb
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.onedelhi.secure.vs6 r3 = (com.onedelhi.secure.vs6) r3
            com.onedelhi.secure.gt6 r4 = r0.mo27693k(r5)
            int r3 = com.onedelhi.secure.eo6.m13906u(r11, r3, r4)
            goto L_0x02ca
        L_0x0058:
            boolean r10 = r0.mo27681C(r1, r11, r5)
            if (r10 == 0) goto L_0x02cb
            long r3 = m32641V(r1, r3)
            int r10 = r11 << 3
            long r11 = r3 + r3
            long r3 = r3 >> r9
            int r9 = com.onedelhi.secure.eo6.m13910y(r10)
            long r3 = r3 ^ r11
            int r3 = com.onedelhi.secure.eo6.m13911z(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x02cb
        L_0x0074:
            boolean r9 = r0.mo27681C(r1, r11, r5)
            if (r9 == 0) goto L_0x02cb
            int r3 = m32639L(r1, r3)
            int r4 = r11 << 3
            int r9 = r3 + r3
            int r3 = r3 >> 31
            int r4 = com.onedelhi.secure.eo6.m13910y(r4)
            r3 = r3 ^ r9
            int r3 = com.onedelhi.secure.eo6.m13910y(r3)
            goto L_0x025a
        L_0x008f:
            boolean r3 = r0.mo27681C(r1, r11, r5)
            if (r3 == 0) goto L_0x02cb
            goto L_0x016b
        L_0x0097:
            boolean r3 = r0.mo27681C(r1, r11, r5)
            if (r3 == 0) goto L_0x02cb
            goto L_0x015b
        L_0x009f:
            boolean r9 = r0.mo27681C(r1, r11, r5)
            if (r9 == 0) goto L_0x02cb
            goto L_0x0128
        L_0x00a7:
            boolean r9 = r0.mo27681C(r1, r11, r5)
            if (r9 == 0) goto L_0x02cb
            int r3 = m32639L(r1, r3)
            int r4 = r11 << 3
            int r3 = com.onedelhi.secure.eo6.m13910y(r3)
            goto L_0x0132
        L_0x00b9:
            boolean r9 = r0.mo27681C(r1, r11, r5)
            if (r9 == 0) goto L_0x02cb
            java.lang.Object r3 = r2.getObject(r1, r3)
        L_0x00c3:
            com.onedelhi.secure.on6 r3 = (com.onedelhi.secure.on6) r3
            int r4 = r11 << 3
            int r9 = com.onedelhi.secure.eo6.f11310a
            int r3 = r3.mo18486f()
            int r9 = com.onedelhi.secure.eo6.m13910y(r3)
            int r9 = r9 + r3
            int r3 = com.onedelhi.secure.eo6.m13910y(r4)
            int r3 = r3 + r9
            goto L_0x02ca
        L_0x00d9:
            boolean r9 = r0.mo27681C(r1, r11, r5)
            if (r9 == 0) goto L_0x02cb
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.onedelhi.secure.gt6 r4 = r0.mo27693k(r5)
            int r3 = com.onedelhi.secure.it6.m17846L(r11, r3, r4)
            goto L_0x02ca
        L_0x00ed:
            boolean r9 = r0.mo27681C(r1, r11, r5)
            if (r9 == 0) goto L_0x02cb
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.onedelhi.secure.on6
            if (r4 == 0) goto L_0x00fc
            goto L_0x00c3
        L_0x00fc:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r3 = com.onedelhi.secure.eo6.m13909x(r3)
            goto L_0x0132
        L_0x0105:
            boolean r3 = r0.mo27681C(r1, r11, r5)
            if (r3 == 0) goto L_0x02cb
            int r3 = r11 << 3
            int r3 = com.onedelhi.secure.eo6.m13910y(r3)
            int r3 = r3 + r14
            goto L_0x02ca
        L_0x0114:
            boolean r3 = r0.mo27681C(r1, r11, r5)
            if (r3 == 0) goto L_0x02cb
            goto L_0x015b
        L_0x011b:
            boolean r3 = r0.mo27681C(r1, r11, r5)
            if (r3 == 0) goto L_0x02cb
            goto L_0x016b
        L_0x0122:
            boolean r9 = r0.mo27681C(r1, r11, r5)
            if (r9 == 0) goto L_0x02cb
        L_0x0128:
            int r3 = m32639L(r1, r3)
            int r4 = r11 << 3
            int r3 = com.onedelhi.secure.eo6.m13907v(r3)
        L_0x0132:
            int r4 = com.onedelhi.secure.eo6.m13910y(r4)
            goto L_0x025a
        L_0x0138:
            boolean r9 = r0.mo27681C(r1, r11, r5)
            if (r9 == 0) goto L_0x02cb
            goto L_0x0145
        L_0x013f:
            boolean r9 = r0.mo27681C(r1, r11, r5)
            if (r9 == 0) goto L_0x02cb
        L_0x0145:
            long r3 = m32641V(r1, r3)
            int r9 = r11 << 3
            int r3 = com.onedelhi.secure.eo6.m13911z(r3)
            int r4 = com.onedelhi.secure.eo6.m13910y(r9)
            goto L_0x025a
        L_0x0155:
            boolean r3 = r0.mo27681C(r1, r11, r5)
            if (r3 == 0) goto L_0x02cb
        L_0x015b:
            int r3 = r11 << 3
            int r3 = com.onedelhi.secure.eo6.m13910y(r3)
            int r3 = r3 + 4
            goto L_0x02ca
        L_0x0165:
            boolean r3 = r0.mo27681C(r1, r11, r5)
            if (r3 == 0) goto L_0x02cb
        L_0x016b:
            int r3 = r11 << 3
            int r3 = com.onedelhi.secure.eo6.m13910y(r3)
            int r3 = r3 + 8
            goto L_0x02ca
        L_0x0175:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.lang.Object r4 = r0.mo27694l(r5)
            com.onedelhi.secure.qs6.m26153a(r11, r3, r4)
            goto L_0x02cb
        L_0x0182:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.onedelhi.secure.gt6 r4 = r0.mo27693k(r5)
            int r3 = com.onedelhi.secure.it6.m17841G(r11, r3, r4)
            goto L_0x02ca
        L_0x0192:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17851Q(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x024f
        L_0x01a0:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17849O(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x024f
        L_0x01ae:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17840F(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x024f
        L_0x01bc:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17838D(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x024f
        L_0x01ca:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17836B(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x024f
        L_0x01d8:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17854T(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x024f
        L_0x01e6:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r4 = com.onedelhi.secure.it6.f13838a
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x02cb
            goto L_0x024f
        L_0x01f5:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17838D(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x024f
        L_0x0202:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17840F(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x024f
        L_0x020f:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17843I(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x024f
        L_0x021c:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17856V(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x024f
        L_0x0229:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17845K(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x024f
        L_0x0236:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17838D(r3)
            if (r3 <= 0) goto L_0x02cb
            goto L_0x024f
        L_0x0243:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17840F(r3)
            if (r3 <= 0) goto L_0x02cb
        L_0x024f:
            int r4 = r11 << 3
            int r9 = com.onedelhi.secure.eo6.m13910y(r3)
            int r4 = com.onedelhi.secure.eo6.m13910y(r4)
            int r4 = r4 + r9
        L_0x025a:
            int r4 = r4 + r3
            int r6 = r6 + r4
            goto L_0x02cb
        L_0x025e:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r9 = 0
            int r3 = com.onedelhi.secure.it6.m17850P(r11, r3, r9)
            goto L_0x02ca
        L_0x026a:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17848N(r11, r3, r9)
            goto L_0x02ca
        L_0x0276:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17839E(r11, r3, r9)
            goto L_0x02ca
        L_0x0282:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17837C(r11, r3, r9)
            goto L_0x02ca
        L_0x028e:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17835A(r11, r3, r9)
            goto L_0x02ca
        L_0x029a:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17853S(r11, r3, r9)
            goto L_0x02ca
        L_0x02a6:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17884z(r11, r3)
            goto L_0x02ca
        L_0x02b1:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.onedelhi.secure.gt6 r4 = r0.mo27693k(r5)
            int r3 = com.onedelhi.secure.it6.m17847M(r11, r3, r4)
            goto L_0x02ca
        L_0x02c0:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17852R(r11, r3)
        L_0x02ca:
            int r6 = r6 + r3
        L_0x02cb:
            r12 = 0
            goto L_0x0437
        L_0x02ce:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r12 = 0
            int r3 = com.onedelhi.secure.it6.m17883y(r11, r3, r12)
            goto L_0x0315
        L_0x02da:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17842H(r11, r3, r12)
            goto L_0x0315
        L_0x02e6:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17855U(r11, r3, r12)
            goto L_0x0315
        L_0x02f2:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17844J(r11, r3, r12)
            goto L_0x0315
        L_0x02fe:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17837C(r11, r3, r12)
            goto L_0x0315
        L_0x030a:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.onedelhi.secure.it6.m17839E(r11, r3, r12)
        L_0x0315:
            int r6 = r6 + r3
            goto L_0x0437
        L_0x0318:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0437
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.onedelhi.secure.vs6 r3 = (com.onedelhi.secure.vs6) r3
            com.onedelhi.secure.gt6 r4 = r0.mo27693k(r5)
            int r3 = com.onedelhi.secure.eo6.m13906u(r11, r3, r4)
            goto L_0x0315
        L_0x032c:
            r12 = 0
            r10 = r10 & r8
            if (r10 == 0) goto L_0x0437
            long r3 = r2.getLong(r1, r3)
            int r10 = r11 << 3
            long r14 = r3 + r3
            long r3 = r3 >> r9
            int r9 = com.onedelhi.secure.eo6.m13910y(r10)
            long r3 = r3 ^ r14
            int r3 = com.onedelhi.secure.eo6.m13911z(r3)
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x0437
        L_0x0346:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0437
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r9 = r3 + r3
            int r3 = r3 >> 31
            int r4 = com.onedelhi.secure.eo6.m13910y(r4)
            r3 = r3 ^ r9
            int r3 = com.onedelhi.secure.eo6.m13910y(r3)
            goto L_0x0416
        L_0x0360:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0437
            goto L_0x042d
        L_0x0367:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0437
            goto L_0x041e
        L_0x036e:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0437
            goto L_0x03ee
        L_0x0375:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0437
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r3 = com.onedelhi.secure.eo6.m13910y(r3)
            goto L_0x03f8
        L_0x0386:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0437
            java.lang.Object r3 = r2.getObject(r1, r3)
        L_0x038f:
            com.onedelhi.secure.on6 r3 = (com.onedelhi.secure.on6) r3
            int r4 = r11 << 3
            int r9 = com.onedelhi.secure.eo6.f11310a
            int r3 = r3.mo18486f()
            int r9 = com.onedelhi.secure.eo6.m13910y(r3)
            int r9 = r9 + r3
            int r3 = com.onedelhi.secure.eo6.m13910y(r4)
            int r3 = r3 + r9
            goto L_0x0315
        L_0x03a5:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0437
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.onedelhi.secure.gt6 r4 = r0.mo27693k(r5)
            int r3 = com.onedelhi.secure.it6.m17846L(r11, r3, r4)
            goto L_0x0315
        L_0x03b8:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0437
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.onedelhi.secure.on6
            if (r4 == 0) goto L_0x03c6
            goto L_0x038f
        L_0x03c6:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r3 = com.onedelhi.secure.eo6.m13909x(r3)
            goto L_0x03f8
        L_0x03cf:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0437
            int r3 = r11 << 3
            int r3 = com.onedelhi.secure.eo6.m13910y(r3)
            int r3 = r3 + r14
            goto L_0x0315
        L_0x03dd:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0437
            goto L_0x041e
        L_0x03e3:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0437
            goto L_0x042d
        L_0x03e9:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0437
        L_0x03ee:
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r3 = com.onedelhi.secure.eo6.m13907v(r3)
        L_0x03f8:
            int r4 = com.onedelhi.secure.eo6.m13910y(r4)
            goto L_0x0416
        L_0x03fd:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0437
            goto L_0x0408
        L_0x0403:
            r12 = 0
            r9 = r8 & r10
            if (r9 == 0) goto L_0x0437
        L_0x0408:
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r3 = com.onedelhi.secure.eo6.m13911z(r3)
            int r4 = com.onedelhi.secure.eo6.m13910y(r9)
        L_0x0416:
            int r4 = r4 + r3
            int r6 = r6 + r4
            goto L_0x0437
        L_0x0419:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0437
        L_0x041e:
            int r3 = r11 << 3
            int r3 = com.onedelhi.secure.eo6.m13910y(r3)
            int r3 = r3 + 4
            goto L_0x0315
        L_0x0428:
            r12 = 0
            r3 = r8 & r10
            if (r3 == 0) goto L_0x0437
        L_0x042d:
            int r3 = r11 << 3
            int r3 = com.onedelhi.secure.eo6.m13910y(r3)
            int r3 = r3 + 8
            goto L_0x0315
        L_0x0437:
            int r5 = r5 + 3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000f
        L_0x043e:
            com.onedelhi.secure.pu6 r2 = r0.f23322a
            java.lang.Object r3 = r2.mo22656d(r1)
            int r2 = r2.mo22653a(r3)
            int r6 = r6 + r2
            boolean r2 = r0.f23327a
            if (r2 != 0) goto L_0x044e
            return r6
        L_0x044e:
            com.onedelhi.secure.qo6 r2 = r0.f23323a
            r2.mo23275a(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ys6.mo27683K(java.lang.Object):int");
    }

    /* renamed from: M */
    public final int mo27684M(Object obj, byte[] bArr, int i, int i2, int i3, long j, vl6 vl6) throws IOException {
        Unsafe unsafe = f23318a;
        Object l = mo27694l(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((ps6) object).mo22627h()) {
            ps6 d = ps6.m25002c().mo22622d();
            qs6.m26154b(d, object);
            unsafe.putObject(obj, j, d);
        }
        os6 os6 = (os6) l;
        throw null;
    }

    /* renamed from: N */
    public final int mo27685N(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, vl6 vl6) throws IOException {
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        vl6 vl62 = vl6;
        Unsafe unsafe = f23318a;
        long j3 = (long) (this.f23328a[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(xl6.m31549p(bArr, i))));
                    int i14 = i9 + 8;
                    unsafe.putInt(obj2, j3, i11);
                    return i14;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(xl6.m31535b(bArr, i))));
                    int i15 = i9 + 4;
                    unsafe.putInt(obj2, j3, i11);
                    return i15;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int m = xl6.m31546m(bArr2, i9, vl62);
                    unsafe.putObject(obj2, j2, Long.valueOf(vl62.f21854a));
                    unsafe.putInt(obj2, j3, i11);
                    return m;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int j4 = xl6.m31543j(bArr2, i9, vl62);
                    unsafe.putObject(obj2, j2, Integer.valueOf(vl62.f21853a));
                    unsafe.putInt(obj2, j3, i11);
                    return j4;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(obj2, j2, Long.valueOf(xl6.m31549p(bArr, i)));
                    int i16 = i9 + 8;
                    unsafe.putInt(obj2, j3, i11);
                    return i16;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(obj2, j2, Integer.valueOf(xl6.m31535b(bArr, i)));
                    int i17 = i9 + 4;
                    unsafe.putInt(obj2, j3, i11);
                    return i17;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int m2 = xl6.m31546m(bArr2, i9, vl62);
                    unsafe.putObject(obj2, j2, Boolean.valueOf(vl62.f21854a != 0));
                    unsafe.putInt(obj2, j3, i11);
                    return m2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int j5 = xl6.m31543j(bArr2, i9, vl62);
                    int i18 = vl62.f21853a;
                    if (i18 == 0) {
                        unsafe.putObject(obj2, j2, "");
                    } else if ((i6 & bi2.f26359j) == 0 || ev6.m14404e(bArr2, j5, j5 + i18)) {
                        unsafe.putObject(obj2, j2, new String(bArr2, j5, i18, zq6.f23859b));
                        j5 += i18;
                    } else {
                        throw dr6.m13274c();
                    }
                    unsafe.putInt(obj2, j3, i11);
                    return j5;
                }
                break;
            case 60:
                if (i12 == 2) {
                    Object n = mo27696n(obj2, i11, i13);
                    int o = xl6.m31548o(n, mo27693k(i13), bArr, i, i2, vl6);
                    mo27702v(obj2, i11, i13, n);
                    return o;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int a = xl6.m31534a(bArr2, i9, vl62);
                    unsafe.putObject(obj2, j2, vl62.f21856a);
                    unsafe.putInt(obj2, j3, i11);
                    return a;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int j6 = xl6.m31543j(bArr2, i9, vl62);
                    int i19 = vl62.f21853a;
                    rq6 j7 = mo27692j(i13);
                    if (j7 == null || j7.mo14621a(i19)) {
                        unsafe.putObject(obj2, j2, Integer.valueOf(i19));
                        unsafe.putInt(obj2, j3, i11);
                    } else {
                        m32635G(obj).mo23454j(i10, Long.valueOf((long) i19));
                    }
                    return j6;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int j8 = xl6.m31543j(bArr2, i9, vl62);
                    unsafe.putObject(obj2, j2, Integer.valueOf(wn6.m30970a(vl62.f21853a)));
                    unsafe.putInt(obj2, j3, i11);
                    return j8;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int m3 = xl6.m31546m(bArr2, i9, vl62);
                    unsafe.putObject(obj2, j2, Long.valueOf(wn6.m30971b(vl62.f21854a)));
                    unsafe.putInt(obj2, j3, i11);
                    return m3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    Object n2 = mo27696n(obj2, i11, i13);
                    int n3 = xl6.m31547n(n2, mo27693k(i13), bArr, i, i2, (i10 & -8) | 4, vl6);
                    mo27702v(obj2, i11, i13, n2);
                    return n3;
                }
                break;
        }
        return i9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:154:0x029c, code lost:
        if (r7.f21854a != 0) goto L_0x029e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x029e, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02a0, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02a1, code lost:
        r13.mo28041e(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02a4, code lost:
        if (r1 >= r5) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02a6, code lost:
        r4 = com.onedelhi.secure.xl6.m31543j(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02ac, code lost:
        if (r2 == r7.f21853a) goto L_0x02af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02af, code lost:
        r1 = com.onedelhi.secure.xl6.m31546m(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02b7, code lost:
        if (r7.f21854a == 0) goto L_0x02a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02ba, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016e, code lost:
        if (r4 == 0) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0170, code lost:
        r13.add(com.onedelhi.secure.on6.f18031a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0176, code lost:
        r13.add(com.onedelhi.secure.on6.m23919r(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x017e, code lost:
        if (r1 >= r5) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0180, code lost:
        r4 = com.onedelhi.secure.xl6.m31543j(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0186, code lost:
        if (r2 == r7.f21853a) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0189, code lost:
        r1 = com.onedelhi.secure.xl6.m31543j(r3, r4, r7);
        r4 = r7.f21853a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x018f, code lost:
        if (r4 < 0) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0193, code lost:
        if (r4 > (r3.length - r1)) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0195, code lost:
        if (r4 != 0) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x019c, code lost:
        throw com.onedelhi.secure.dr6.m13277f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a1, code lost:
        throw com.onedelhi.secure.dr6.m13275d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01a2, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0232  */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo27686O(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.onedelhi.secure.vl6 r30) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r8 = r22
            r6 = r23
            r9 = r24
            r10 = r28
            r7 = r30
            sun.misc.Unsafe r12 = f23318a
            java.lang.Object r13 = r12.getObject(r1, r10)
            com.onedelhi.secure.xq6 r13 = (com.onedelhi.secure.xq6) r13
            boolean r14 = r13.mo23936c()
            if (r14 != 0) goto L_0x0035
            int r14 = r13.size()
            if (r14 != 0) goto L_0x002d
            r14 = 10
            goto L_0x002e
        L_0x002d:
            int r14 = r14 + r14
        L_0x002e:
            com.onedelhi.secure.xq6 r13 = r13.mo14324d2(r14)
            r12.putObject(r1, r10, r13)
        L_0x0035:
            r10 = 5
            r11 = 0
            r15 = 1
            r14 = 2
            switch(r27) {
                case 18: goto L_0x03ce;
                case 19: goto L_0x0388;
                case 20: goto L_0x0350;
                case 21: goto L_0x0350;
                case 22: goto L_0x0337;
                case 23: goto L_0x02f9;
                case 24: goto L_0x02bb;
                case 25: goto L_0x0269;
                case 26: goto L_0x01c6;
                case 27: goto L_0x01ad;
                case 28: goto L_0x0160;
                case 29: goto L_0x0337;
                case 30: goto L_0x00df;
                case 31: goto L_0x02bb;
                case 32: goto L_0x02f9;
                case 33: goto L_0x009f;
                case 34: goto L_0x005f;
                case 35: goto L_0x03ce;
                case 36: goto L_0x0388;
                case 37: goto L_0x0350;
                case 38: goto L_0x0350;
                case 39: goto L_0x0337;
                case 40: goto L_0x02f9;
                case 41: goto L_0x02bb;
                case 42: goto L_0x0269;
                case 43: goto L_0x0337;
                case 44: goto L_0x00df;
                case 45: goto L_0x02bb;
                case 46: goto L_0x02f9;
                case 47: goto L_0x009f;
                case 48: goto L_0x005f;
                default: goto L_0x003d;
            }
        L_0x003d:
            r1 = 3
            if (r6 != r1) goto L_0x0431
            com.onedelhi.secure.gt6 r1 = r0.mo27693k(r9)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.onedelhi.secure.xl6.m31536c(r22, r23, r24, r25, r26, r27)
        L_0x0058:
            java.lang.Object r8 = r7.f21856a
            r13.add(r8)
            goto L_0x0413
        L_0x005f:
            if (r6 != r14) goto L_0x0083
            com.onedelhi.secure.rr6 r13 = (com.onedelhi.secure.rr6) r13
            int r1 = com.onedelhi.secure.xl6.m31543j(r3, r4, r7)
            int r2 = r7.f21853a
            int r2 = r2 + r1
        L_0x006a:
            if (r1 >= r2) goto L_0x007a
            int r1 = com.onedelhi.secure.xl6.m31546m(r3, r1, r7)
            long r4 = r7.f21854a
            long r4 = com.onedelhi.secure.wn6.m30971b(r4)
            r13.mo24062f(r4)
            goto L_0x006a
        L_0x007a:
            if (r1 != r2) goto L_0x007e
            goto L_0x0432
        L_0x007e:
            com.onedelhi.secure.dr6 r1 = com.onedelhi.secure.dr6.m13277f()
            throw r1
        L_0x0083:
            if (r6 != 0) goto L_0x0431
            com.onedelhi.secure.rr6 r13 = (com.onedelhi.secure.rr6) r13
        L_0x0087:
            int r1 = com.onedelhi.secure.xl6.m31546m(r3, r4, r7)
            long r8 = r7.f21854a
            long r8 = com.onedelhi.secure.wn6.m30971b(r8)
            r13.mo24062f(r8)
            if (r1 >= r5) goto L_0x009e
            int r4 = com.onedelhi.secure.xl6.m31543j(r3, r1, r7)
            int r6 = r7.f21853a
            if (r2 == r6) goto L_0x0087
        L_0x009e:
            return r1
        L_0x009f:
            if (r6 != r14) goto L_0x00c3
            com.onedelhi.secure.lq6 r13 = (com.onedelhi.secure.lq6) r13
            int r1 = com.onedelhi.secure.xl6.m31543j(r3, r4, r7)
            int r2 = r7.f21853a
            int r2 = r2 + r1
        L_0x00aa:
            if (r1 >= r2) goto L_0x00ba
            int r1 = com.onedelhi.secure.xl6.m31543j(r3, r1, r7)
            int r4 = r7.f21853a
            int r4 = com.onedelhi.secure.wn6.m30970a(r4)
            r13.mo19758g(r4)
            goto L_0x00aa
        L_0x00ba:
            if (r1 != r2) goto L_0x00be
            goto L_0x0432
        L_0x00be:
            com.onedelhi.secure.dr6 r1 = com.onedelhi.secure.dr6.m13277f()
            throw r1
        L_0x00c3:
            if (r6 != 0) goto L_0x0431
            com.onedelhi.secure.lq6 r13 = (com.onedelhi.secure.lq6) r13
        L_0x00c7:
            int r1 = com.onedelhi.secure.xl6.m31543j(r3, r4, r7)
            int r4 = r7.f21853a
            int r4 = com.onedelhi.secure.wn6.m30970a(r4)
            r13.mo19758g(r4)
            if (r1 >= r5) goto L_0x00de
            int r4 = com.onedelhi.secure.xl6.m31543j(r3, r1, r7)
            int r6 = r7.f21853a
            if (r2 == r6) goto L_0x00c7
        L_0x00de:
            return r1
        L_0x00df:
            if (r6 != r14) goto L_0x00e6
            int r2 = com.onedelhi.secure.xl6.m31539f(r3, r4, r13, r7)
            goto L_0x00f7
        L_0x00e6:
            if (r6 != 0) goto L_0x0431
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r13
            r7 = r30
            int r2 = com.onedelhi.secure.xl6.m31545l(r2, r3, r4, r5, r6, r7)
        L_0x00f7:
            com.onedelhi.secure.rq6 r3 = r0.mo27692j(r9)
            com.onedelhi.secure.pu6 r4 = r0.f23322a
            int r5 = com.onedelhi.secure.it6.f13838a
            if (r3 == 0) goto L_0x015d
            boolean r5 = r13 instanceof java.util.RandomAccess
            r6 = 0
            if (r5 == 0) goto L_0x013b
            int r5 = r13.size()
            r7 = 0
            r14 = 0
        L_0x010c:
            if (r14 >= r5) goto L_0x0131
            java.lang.Object r9 = r13.get(r14)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            boolean r10 = r3.mo14621a(r9)
            if (r10 == 0) goto L_0x012a
            if (r14 == r7) goto L_0x0127
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r13.set(r7, r9)
        L_0x0127:
            int r7 = r7 + 1
            goto L_0x012e
        L_0x012a:
            java.lang.Object r6 = com.onedelhi.secure.it6.m17860b(r1, r8, r9, r6, r4)
        L_0x012e:
            int r14 = r14 + 1
            goto L_0x010c
        L_0x0131:
            if (r7 == r5) goto L_0x015d
            java.util.List r1 = r13.subList(r7, r5)
            r1.clear()
            return r2
        L_0x013b:
            java.util.Iterator r5 = r13.iterator()
        L_0x013f:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x015d
            java.lang.Object r7 = r5.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            boolean r9 = r3.mo14621a(r7)
            if (r9 != 0) goto L_0x013f
            java.lang.Object r6 = com.onedelhi.secure.it6.m17860b(r1, r8, r7, r6, r4)
            r5.remove()
            goto L_0x013f
        L_0x015d:
            r1 = r2
            goto L_0x0432
        L_0x0160:
            if (r6 != r14) goto L_0x0431
            int r1 = com.onedelhi.secure.xl6.m31543j(r3, r4, r7)
            int r4 = r7.f21853a
            if (r4 < 0) goto L_0x01a8
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x01a3
            if (r4 != 0) goto L_0x0176
        L_0x0170:
            com.onedelhi.secure.on6 r4 = com.onedelhi.secure.on6.f18031a
            r13.add(r4)
            goto L_0x017e
        L_0x0176:
            com.onedelhi.secure.on6 r6 = com.onedelhi.secure.on6.m23919r(r3, r1, r4)
            r13.add(r6)
            int r1 = r1 + r4
        L_0x017e:
            if (r1 >= r5) goto L_0x01a2
            int r4 = com.onedelhi.secure.xl6.m31543j(r3, r1, r7)
            int r6 = r7.f21853a
            if (r2 == r6) goto L_0x0189
            goto L_0x01a2
        L_0x0189:
            int r1 = com.onedelhi.secure.xl6.m31543j(r3, r4, r7)
            int r4 = r7.f21853a
            if (r4 < 0) goto L_0x019d
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0198
            if (r4 != 0) goto L_0x0176
            goto L_0x0170
        L_0x0198:
            com.onedelhi.secure.dr6 r1 = com.onedelhi.secure.dr6.m13277f()
            throw r1
        L_0x019d:
            com.onedelhi.secure.dr6 r1 = com.onedelhi.secure.dr6.m13275d()
            throw r1
        L_0x01a2:
            return r1
        L_0x01a3:
            com.onedelhi.secure.dr6 r1 = com.onedelhi.secure.dr6.m13277f()
            throw r1
        L_0x01a8:
            com.onedelhi.secure.dr6 r1 = com.onedelhi.secure.dr6.m13275d()
            throw r1
        L_0x01ad:
            if (r6 != r14) goto L_0x0431
            com.onedelhi.secure.gt6 r1 = r0.mo27693k(r9)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r13
            r28 = r30
            int r1 = com.onedelhi.secure.xl6.m31538e(r22, r23, r24, r25, r26, r27, r28)
            return r1
        L_0x01c6:
            if (r6 != r14) goto L_0x0431
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            int r4 = com.onedelhi.secure.xl6.m31543j(r3, r4, r7)
            if (r6 != 0) goto L_0x0213
            int r6 = r7.f21853a
            if (r6 < 0) goto L_0x020e
            if (r6 != 0) goto L_0x01e1
        L_0x01dd:
            r13.add(r1)
            goto L_0x01ec
        L_0x01e1:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.onedelhi.secure.zq6.f23859b
            r8.<init>(r3, r4, r6, r9)
        L_0x01e8:
            r13.add(r8)
            int r4 = r4 + r6
        L_0x01ec:
            if (r4 >= r5) goto L_0x0431
            int r6 = com.onedelhi.secure.xl6.m31543j(r3, r4, r7)
            int r8 = r7.f21853a
            if (r2 != r8) goto L_0x0431
            int r4 = com.onedelhi.secure.xl6.m31543j(r3, r6, r7)
            int r6 = r7.f21853a
            if (r6 < 0) goto L_0x0209
            if (r6 != 0) goto L_0x0201
            goto L_0x01dd
        L_0x0201:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.onedelhi.secure.zq6.f23859b
            r8.<init>(r3, r4, r6, r9)
            goto L_0x01e8
        L_0x0209:
            com.onedelhi.secure.dr6 r1 = com.onedelhi.secure.dr6.m13275d()
            throw r1
        L_0x020e:
            com.onedelhi.secure.dr6 r1 = com.onedelhi.secure.dr6.m13275d()
            throw r1
        L_0x0213:
            int r6 = r7.f21853a
            if (r6 < 0) goto L_0x0264
            if (r6 != 0) goto L_0x021d
        L_0x0219:
            r13.add(r1)
            goto L_0x0230
        L_0x021d:
            int r8 = r4 + r6
            boolean r9 = com.onedelhi.secure.ev6.m14404e(r3, r4, r8)
            if (r9 == 0) goto L_0x025f
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.onedelhi.secure.zq6.f23859b
            r9.<init>(r3, r4, r6, r10)
        L_0x022c:
            r13.add(r9)
            r4 = r8
        L_0x0230:
            if (r4 >= r5) goto L_0x0431
            int r6 = com.onedelhi.secure.xl6.m31543j(r3, r4, r7)
            int r8 = r7.f21853a
            if (r2 != r8) goto L_0x0431
            int r4 = com.onedelhi.secure.xl6.m31543j(r3, r6, r7)
            int r6 = r7.f21853a
            if (r6 < 0) goto L_0x025a
            if (r6 != 0) goto L_0x0245
            goto L_0x0219
        L_0x0245:
            int r8 = r4 + r6
            boolean r9 = com.onedelhi.secure.ev6.m14404e(r3, r4, r8)
            if (r9 == 0) goto L_0x0255
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.onedelhi.secure.zq6.f23859b
            r9.<init>(r3, r4, r6, r10)
            goto L_0x022c
        L_0x0255:
            com.onedelhi.secure.dr6 r1 = com.onedelhi.secure.dr6.m13274c()
            throw r1
        L_0x025a:
            com.onedelhi.secure.dr6 r1 = com.onedelhi.secure.dr6.m13275d()
            throw r1
        L_0x025f:
            com.onedelhi.secure.dr6 r1 = com.onedelhi.secure.dr6.m13274c()
            throw r1
        L_0x0264:
            com.onedelhi.secure.dr6 r1 = com.onedelhi.secure.dr6.m13275d()
            throw r1
        L_0x0269:
            if (r6 != r14) goto L_0x0290
            com.onedelhi.secure.zl6 r13 = (com.onedelhi.secure.zl6) r13
            int r1 = com.onedelhi.secure.xl6.m31543j(r3, r4, r7)
            int r2 = r7.f21853a
            int r2 = r2 + r1
        L_0x0274:
            if (r1 >= r2) goto L_0x0287
            int r1 = com.onedelhi.secure.xl6.m31546m(r3, r1, r7)
            long r4 = r7.f21854a
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x0282
            r4 = 1
            goto L_0x0283
        L_0x0282:
            r4 = 0
        L_0x0283:
            r13.mo28041e(r4)
            goto L_0x0274
        L_0x0287:
            if (r1 != r2) goto L_0x028b
            goto L_0x0432
        L_0x028b:
            com.onedelhi.secure.dr6 r1 = com.onedelhi.secure.dr6.m13277f()
            throw r1
        L_0x0290:
            if (r6 != 0) goto L_0x0431
            com.onedelhi.secure.zl6 r13 = (com.onedelhi.secure.zl6) r13
            int r1 = com.onedelhi.secure.xl6.m31546m(r3, r4, r7)
            long r8 = r7.f21854a
            int r4 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x02a0
        L_0x029e:
            r4 = 1
            goto L_0x02a1
        L_0x02a0:
            r4 = 0
        L_0x02a1:
            r13.mo28041e(r4)
            if (r1 >= r5) goto L_0x02ba
            int r4 = com.onedelhi.secure.xl6.m31543j(r3, r1, r7)
            int r6 = r7.f21853a
            if (r2 == r6) goto L_0x02af
            goto L_0x02ba
        L_0x02af:
            int r1 = com.onedelhi.secure.xl6.m31546m(r3, r4, r7)
            long r8 = r7.f21854a
            int r4 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x02a0
            goto L_0x029e
        L_0x02ba:
            return r1
        L_0x02bb:
            if (r6 != r14) goto L_0x02db
            com.onedelhi.secure.lq6 r13 = (com.onedelhi.secure.lq6) r13
            int r1 = com.onedelhi.secure.xl6.m31543j(r3, r4, r7)
            int r2 = r7.f21853a
            int r2 = r2 + r1
        L_0x02c6:
            if (r1 >= r2) goto L_0x02d2
            int r4 = com.onedelhi.secure.xl6.m31535b(r3, r1)
            r13.mo19758g(r4)
            int r1 = r1 + 4
            goto L_0x02c6
        L_0x02d2:
            if (r1 != r2) goto L_0x02d6
            goto L_0x0432
        L_0x02d6:
            com.onedelhi.secure.dr6 r1 = com.onedelhi.secure.dr6.m13277f()
            throw r1
        L_0x02db:
            if (r6 != r10) goto L_0x0431
            com.onedelhi.secure.lq6 r13 = (com.onedelhi.secure.lq6) r13
            int r1 = com.onedelhi.secure.xl6.m31535b(r18, r19)
        L_0x02e3:
            r13.mo19758g(r1)
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02f8
            int r4 = com.onedelhi.secure.xl6.m31543j(r3, r1, r7)
            int r6 = r7.f21853a
            if (r2 == r6) goto L_0x02f3
            goto L_0x02f8
        L_0x02f3:
            int r1 = com.onedelhi.secure.xl6.m31535b(r3, r4)
            goto L_0x02e3
        L_0x02f8:
            return r1
        L_0x02f9:
            if (r6 != r14) goto L_0x0319
            com.onedelhi.secure.rr6 r13 = (com.onedelhi.secure.rr6) r13
            int r1 = com.onedelhi.secure.xl6.m31543j(r3, r4, r7)
            int r2 = r7.f21853a
            int r2 = r2 + r1
        L_0x0304:
            if (r1 >= r2) goto L_0x0310
            long r4 = com.onedelhi.secure.xl6.m31549p(r3, r1)
            r13.mo24062f(r4)
            int r1 = r1 + 8
            goto L_0x0304
        L_0x0310:
            if (r1 != r2) goto L_0x0314
            goto L_0x0432
        L_0x0314:
            com.onedelhi.secure.dr6 r1 = com.onedelhi.secure.dr6.m13277f()
            throw r1
        L_0x0319:
            if (r6 != r15) goto L_0x0431
            com.onedelhi.secure.rr6 r13 = (com.onedelhi.secure.rr6) r13
            long r8 = com.onedelhi.secure.xl6.m31549p(r18, r19)
        L_0x0321:
            r13.mo24062f(r8)
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0336
            int r4 = com.onedelhi.secure.xl6.m31543j(r3, r1, r7)
            int r6 = r7.f21853a
            if (r2 == r6) goto L_0x0331
            goto L_0x0336
        L_0x0331:
            long r8 = com.onedelhi.secure.xl6.m31549p(r3, r4)
            goto L_0x0321
        L_0x0336:
            return r1
        L_0x0337:
            if (r6 != r14) goto L_0x033f
            int r1 = com.onedelhi.secure.xl6.m31539f(r3, r4, r13, r7)
            goto L_0x0432
        L_0x033f:
            if (r6 != 0) goto L_0x0431
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r13
            r26 = r30
            int r1 = com.onedelhi.secure.xl6.m31545l(r21, r22, r23, r24, r25, r26)
            return r1
        L_0x0350:
            if (r6 != r14) goto L_0x0370
            com.onedelhi.secure.rr6 r13 = (com.onedelhi.secure.rr6) r13
            int r1 = com.onedelhi.secure.xl6.m31543j(r3, r4, r7)
            int r2 = r7.f21853a
            int r2 = r2 + r1
        L_0x035b:
            if (r1 >= r2) goto L_0x0367
            int r1 = com.onedelhi.secure.xl6.m31546m(r3, r1, r7)
            long r4 = r7.f21854a
            r13.mo24062f(r4)
            goto L_0x035b
        L_0x0367:
            if (r1 != r2) goto L_0x036b
            goto L_0x0432
        L_0x036b:
            com.onedelhi.secure.dr6 r1 = com.onedelhi.secure.dr6.m13277f()
            throw r1
        L_0x0370:
            if (r6 != 0) goto L_0x0431
            com.onedelhi.secure.rr6 r13 = (com.onedelhi.secure.rr6) r13
        L_0x0374:
            int r1 = com.onedelhi.secure.xl6.m31546m(r3, r4, r7)
            long r8 = r7.f21854a
            r13.mo24062f(r8)
            if (r1 >= r5) goto L_0x0387
            int r4 = com.onedelhi.secure.xl6.m31543j(r3, r1, r7)
            int r6 = r7.f21853a
            if (r2 == r6) goto L_0x0374
        L_0x0387:
            return r1
        L_0x0388:
            if (r6 != r14) goto L_0x03ac
            com.onedelhi.secure.cp6 r13 = (com.onedelhi.secure.cp6) r13
            int r1 = com.onedelhi.secure.xl6.m31543j(r3, r4, r7)
            int r2 = r7.f21853a
            int r2 = r2 + r1
        L_0x0393:
            if (r1 >= r2) goto L_0x03a3
            int r4 = com.onedelhi.secure.xl6.m31535b(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r13.mo14325e(r4)
            int r1 = r1 + 4
            goto L_0x0393
        L_0x03a3:
            if (r1 != r2) goto L_0x03a7
            goto L_0x0432
        L_0x03a7:
            com.onedelhi.secure.dr6 r1 = com.onedelhi.secure.dr6.m13277f()
            throw r1
        L_0x03ac:
            if (r6 != r10) goto L_0x0431
            com.onedelhi.secure.cp6 r13 = (com.onedelhi.secure.cp6) r13
            int r1 = com.onedelhi.secure.xl6.m31535b(r18, r19)
        L_0x03b4:
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r13.mo14325e(r1)
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03cd
            int r4 = com.onedelhi.secure.xl6.m31543j(r3, r1, r7)
            int r6 = r7.f21853a
            if (r2 == r6) goto L_0x03c8
            goto L_0x03cd
        L_0x03c8:
            int r1 = com.onedelhi.secure.xl6.m31535b(r3, r4)
            goto L_0x03b4
        L_0x03cd:
            return r1
        L_0x03ce:
            if (r6 != r14) goto L_0x03f1
            com.onedelhi.secure.io6 r13 = (com.onedelhi.secure.io6) r13
            int r1 = com.onedelhi.secure.xl6.m31543j(r3, r4, r7)
            int r2 = r7.f21853a
            int r2 = r2 + r1
        L_0x03d9:
            if (r1 >= r2) goto L_0x03e9
            long r4 = com.onedelhi.secure.xl6.m31549p(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r13.mo17902e(r4)
            int r1 = r1 + 8
            goto L_0x03d9
        L_0x03e9:
            if (r1 != r2) goto L_0x03ec
            goto L_0x0432
        L_0x03ec:
            com.onedelhi.secure.dr6 r1 = com.onedelhi.secure.dr6.m13277f()
            throw r1
        L_0x03f1:
            if (r6 != r15) goto L_0x0431
            com.onedelhi.secure.io6 r13 = (com.onedelhi.secure.io6) r13
            long r8 = com.onedelhi.secure.xl6.m31549p(r18, r19)
        L_0x03f9:
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r13.mo17902e(r8)
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0412
            int r4 = com.onedelhi.secure.xl6.m31543j(r3, r1, r7)
            int r6 = r7.f21853a
            if (r2 == r6) goto L_0x040d
            goto L_0x0412
        L_0x040d:
            long r8 = com.onedelhi.secure.xl6.m31549p(r3, r4)
            goto L_0x03f9
        L_0x0412:
            return r1
        L_0x0413:
            if (r4 >= r5) goto L_0x0430
            int r8 = com.onedelhi.secure.xl6.m31543j(r3, r4, r7)
            int r9 = r7.f21853a
            if (r2 == r9) goto L_0x041e
            goto L_0x0430
        L_0x041e:
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.onedelhi.secure.xl6.m31536c(r22, r23, r24, r25, r26, r27)
            goto L_0x0058
        L_0x0430:
            return r4
        L_0x0431:
            r1 = r4
        L_0x0432:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ys6.mo27686O(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.onedelhi.secure.vl6):int");
    }

    /* renamed from: P */
    public final int mo27687P(int i) {
        if (i < this.f23320a || i > this.f23330b) {
            return -1;
        }
        return mo27690S(i, 0);
    }

    /* renamed from: Q */
    public final int mo27688Q(int i, int i2) {
        if (i < this.f23320a || i > this.f23330b) {
            return -1;
        }
        return mo27690S(i, i2);
    }

    /* renamed from: R */
    public final int mo27689R(int i) {
        return this.f23328a[i + 2];
    }

    /* renamed from: S */
    public final int mo27690S(int i, int i2) {
        int length = (this.f23328a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f23328a[i4];
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

    /* renamed from: U */
    public final int mo27691U(int i) {
        return this.f23328a[i + 1];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x026b, code lost:
        r4 = com.onedelhi.secure.eo6.m13906u(r6, (com.onedelhi.secure.vs6) com.onedelhi.secure.zu6.m33464k(r12, r7), mo27693k(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0284, code lost:
        r4 = com.onedelhi.secure.eo6.m13910y(r6 << 3) + com.onedelhi.secure.eo6.m13911z((r7 + r7) ^ (r7 >> 63));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02a0, code lost:
        r5 = r6 << 3;
        r5 = com.onedelhi.secure.eo6.m13910y(r5);
        r4 = com.onedelhi.secure.eo6.m13910y((r4 >> 31) ^ (r4 + r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02d3, code lost:
        r5 = r6 << 3;
        r4 = com.onedelhi.secure.eo6.m13910y(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02e1, code lost:
        r4 = com.onedelhi.secure.zu6.m33464k(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02e5, code lost:
        r5 = r6 << 3;
        r6 = com.onedelhi.secure.eo6.f11310a;
        r4 = ((com.onedelhi.secure.on6) r4).mo18486f();
        r4 = com.onedelhi.secure.eo6.m13910y(r5) + (com.onedelhi.secure.eo6.m13910y(r4) + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0301, code lost:
        r4 = com.onedelhi.secure.it6.m17846L(r6, com.onedelhi.secure.zu6.m33464k(r12, r7), mo27693k(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x031b, code lost:
        if ((r4 instanceof com.onedelhi.secure.on6) != false) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x031e, code lost:
        r5 = r6 << 3;
        r4 = com.onedelhi.secure.eo6.m13909x((java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x032d, code lost:
        r4 = com.onedelhi.secure.eo6.m13910y(r6 << 3) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x034b, code lost:
        r4 = com.onedelhi.secure.zu6.m33461h(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x034f, code lost:
        r5 = r6 << 3;
        r4 = com.onedelhi.secure.eo6.m13907v(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0355, code lost:
        r5 = com.onedelhi.secure.eo6.m13910y(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0367, code lost:
        r4 = com.onedelhi.secure.zu6.m33462i(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x036b, code lost:
        r4 = com.onedelhi.secure.eo6.m13911z(r4);
        r5 = com.onedelhi.secure.eo6.m13910y(r6 << 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0375, code lost:
        r3 = r3 + (r5 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x037e, code lost:
        r4 = com.onedelhi.secure.eo6.m13910y(r6 << 3) + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x038e, code lost:
        r4 = com.onedelhi.secure.eo6.m13910y(r6 << 3) + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0398, code lost:
        r2 = r2 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009b, code lost:
        if ((r4 instanceof com.onedelhi.secure.on6) != false) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bd, code lost:
        r4 = m32639L(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d0, code lost:
        r4 = m32641V(r12, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c0, code lost:
        r5 = r6 << 3;
        r5 = com.onedelhi.secure.eo6.m13910y(r5) + com.onedelhi.secure.eo6.m13910y(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0262, code lost:
        r3 = r3 + r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16907a(java.lang.Object r12) {
        /*
            r11 = this;
            boolean r0 = r11.f23331b
            if (r0 == 0) goto L_0x03a8
            sun.misc.Unsafe r0 = f23318a
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0009:
            int[] r4 = r11.f23328a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x039c
            int r4 = r11.mo27691U(r2)
            int r5 = m32640T(r4)
            int[] r6 = r11.f23328a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            com.onedelhi.secure.ap6 r7 = com.onedelhi.secure.ap6.DOUBLE_LIST_PACKED
            int r7 = r7.mo13236d()
            if (r5 < r7) goto L_0x0034
            com.onedelhi.secure.ap6 r7 = com.onedelhi.secure.ap6.SINT64_LIST_PACKED
            int r7 = r7.mo13236d()
            if (r5 > r7) goto L_0x0034
            int[] r7 = r11.f23328a
            int r8 = r2 + 2
            r7 = r7[r8]
        L_0x0034:
            long r7 = (long) r4
            r4 = 63
            switch(r5) {
                case 0: goto L_0x0388;
                case 1: goto L_0x0378;
                case 2: goto L_0x0361;
                case 3: goto L_0x035a;
                case 4: goto L_0x0345;
                case 5: goto L_0x033e;
                case 6: goto L_0x0337;
                case 7: goto L_0x0327;
                case 8: goto L_0x030f;
                case 9: goto L_0x02fb;
                case 10: goto L_0x02db;
                case 11: goto L_0x02c9;
                case 12: goto L_0x02c1;
                case 13: goto L_0x02b9;
                case 14: goto L_0x02b1;
                case 15: goto L_0x0296;
                case 16: goto L_0x027a;
                case 17: goto L_0x0265;
                case 18: goto L_0x0258;
                case 19: goto L_0x024d;
                case 20: goto L_0x0242;
                case 21: goto L_0x0237;
                case 22: goto L_0x022c;
                case 23: goto L_0x0258;
                case 24: goto L_0x024d;
                case 25: goto L_0x0221;
                case 26: goto L_0x0216;
                case 27: goto L_0x0207;
                case 28: goto L_0x01fc;
                case 29: goto L_0x01f1;
                case 30: goto L_0x01e5;
                case 31: goto L_0x024d;
                case 32: goto L_0x0258;
                case 33: goto L_0x01d9;
                case 34: goto L_0x01cd;
                case 35: goto L_0x01b4;
                case 36: goto L_0x01a7;
                case 37: goto L_0x019a;
                case 38: goto L_0x018d;
                case 39: goto L_0x0180;
                case 40: goto L_0x0173;
                case 41: goto L_0x0166;
                case 42: goto L_0x0157;
                case 43: goto L_0x0149;
                case 44: goto L_0x013b;
                case 45: goto L_0x012d;
                case 46: goto L_0x011f;
                case 47: goto L_0x0111;
                case 48: goto L_0x0103;
                case 49: goto L_0x00f3;
                case 50: goto L_0x00e6;
                case 51: goto L_0x00de;
                case 52: goto L_0x00d6;
                case 53: goto L_0x00ca;
                case 54: goto L_0x00c3;
                case 55: goto L_0x00b7;
                case 56: goto L_0x00af;
                case 57: goto L_0x00a7;
                case 58: goto L_0x009f;
                case 59: goto L_0x008f;
                case 60: goto L_0x0087;
                case 61: goto L_0x007f;
                case 62: goto L_0x0073;
                case 63: goto L_0x006c;
                case 64: goto L_0x0064;
                case 65: goto L_0x005c;
                case 66: goto L_0x0050;
                case 67: goto L_0x0044;
                case 68: goto L_0x003c;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0398
        L_0x003c:
            boolean r4 = r11.mo27681C(r12, r6, r2)
            if (r4 == 0) goto L_0x0398
            goto L_0x026b
        L_0x0044:
            boolean r5 = r11.mo27681C(r12, r6, r2)
            if (r5 == 0) goto L_0x0398
            long r7 = m32641V(r12, r7)
            goto L_0x0284
        L_0x0050:
            boolean r4 = r11.mo27681C(r12, r6, r2)
            if (r4 == 0) goto L_0x0398
            int r4 = m32639L(r12, r7)
            goto L_0x02a0
        L_0x005c:
            boolean r4 = r11.mo27681C(r12, r6, r2)
            if (r4 == 0) goto L_0x0398
            goto L_0x038e
        L_0x0064:
            boolean r4 = r11.mo27681C(r12, r6, r2)
            if (r4 == 0) goto L_0x0398
            goto L_0x037e
        L_0x006c:
            boolean r4 = r11.mo27681C(r12, r6, r2)
            if (r4 == 0) goto L_0x0398
            goto L_0x00bd
        L_0x0073:
            boolean r4 = r11.mo27681C(r12, r6, r2)
            if (r4 == 0) goto L_0x0398
            int r4 = m32639L(r12, r7)
            goto L_0x02d3
        L_0x007f:
            boolean r4 = r11.mo27681C(r12, r6, r2)
            if (r4 == 0) goto L_0x0398
            goto L_0x02e1
        L_0x0087:
            boolean r4 = r11.mo27681C(r12, r6, r2)
            if (r4 == 0) goto L_0x0398
            goto L_0x0301
        L_0x008f:
            boolean r4 = r11.mo27681C(r12, r6, r2)
            if (r4 == 0) goto L_0x0398
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r12, r7)
            boolean r5 = r4 instanceof com.onedelhi.secure.on6
            if (r5 == 0) goto L_0x031e
            goto L_0x031d
        L_0x009f:
            boolean r4 = r11.mo27681C(r12, r6, r2)
            if (r4 == 0) goto L_0x0398
            goto L_0x032d
        L_0x00a7:
            boolean r4 = r11.mo27681C(r12, r6, r2)
            if (r4 == 0) goto L_0x0398
            goto L_0x037e
        L_0x00af:
            boolean r4 = r11.mo27681C(r12, r6, r2)
            if (r4 == 0) goto L_0x0398
            goto L_0x038e
        L_0x00b7:
            boolean r4 = r11.mo27681C(r12, r6, r2)
            if (r4 == 0) goto L_0x0398
        L_0x00bd:
            int r4 = m32639L(r12, r7)
            goto L_0x034f
        L_0x00c3:
            boolean r4 = r11.mo27681C(r12, r6, r2)
            if (r4 == 0) goto L_0x0398
            goto L_0x00d0
        L_0x00ca:
            boolean r4 = r11.mo27681C(r12, r6, r2)
            if (r4 == 0) goto L_0x0398
        L_0x00d0:
            long r4 = m32641V(r12, r7)
            goto L_0x036b
        L_0x00d6:
            boolean r4 = r11.mo27681C(r12, r6, r2)
            if (r4 == 0) goto L_0x0398
            goto L_0x037e
        L_0x00de:
            boolean r4 = r11.mo27681C(r12, r6, r2)
            if (r4 == 0) goto L_0x0398
            goto L_0x038e
        L_0x00e6:
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r12, r7)
            java.lang.Object r5 = r11.mo27694l(r2)
            com.onedelhi.secure.qs6.m26153a(r6, r4, r5)
            goto L_0x0398
        L_0x00f3:
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.onedelhi.secure.gt6 r5 = r11.mo27693k(r2)
            int r4 = com.onedelhi.secure.it6.m17841G(r6, r4, r5)
            goto L_0x0262
        L_0x0103:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17851Q(r4)
            if (r4 <= 0) goto L_0x0398
            goto L_0x01c0
        L_0x0111:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17849O(r4)
            if (r4 <= 0) goto L_0x0398
            goto L_0x01c0
        L_0x011f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17840F(r4)
            if (r4 <= 0) goto L_0x0398
            goto L_0x01c0
        L_0x012d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17838D(r4)
            if (r4 <= 0) goto L_0x0398
            goto L_0x01c0
        L_0x013b:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17836B(r4)
            if (r4 <= 0) goto L_0x0398
            goto L_0x01c0
        L_0x0149:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17854T(r4)
            if (r4 <= 0) goto L_0x0398
            goto L_0x01c0
        L_0x0157:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r5 = com.onedelhi.secure.it6.f13838a
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0398
            goto L_0x01c0
        L_0x0166:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17838D(r4)
            if (r4 <= 0) goto L_0x0398
            goto L_0x01c0
        L_0x0173:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17840F(r4)
            if (r4 <= 0) goto L_0x0398
            goto L_0x01c0
        L_0x0180:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17843I(r4)
            if (r4 <= 0) goto L_0x0398
            goto L_0x01c0
        L_0x018d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17856V(r4)
            if (r4 <= 0) goto L_0x0398
            goto L_0x01c0
        L_0x019a:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17845K(r4)
            if (r4 <= 0) goto L_0x0398
            goto L_0x01c0
        L_0x01a7:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17838D(r4)
            if (r4 <= 0) goto L_0x0398
            goto L_0x01c0
        L_0x01b4:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17840F(r4)
            if (r4 <= 0) goto L_0x0398
        L_0x01c0:
            int r5 = r6 << 3
            int r6 = com.onedelhi.secure.eo6.m13910y(r4)
            int r5 = com.onedelhi.secure.eo6.m13910y(r5)
            int r5 = r5 + r6
            goto L_0x0375
        L_0x01cd:
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17850P(r6, r4, r1)
            goto L_0x0262
        L_0x01d9:
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17848N(r6, r4, r1)
            goto L_0x0262
        L_0x01e5:
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17835A(r6, r4, r1)
            goto L_0x0262
        L_0x01f1:
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17853S(r6, r4, r1)
            goto L_0x0262
        L_0x01fc:
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17884z(r6, r4)
            goto L_0x0262
        L_0x0207:
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.onedelhi.secure.gt6 r5 = r11.mo27693k(r2)
            int r4 = com.onedelhi.secure.it6.m17847M(r6, r4, r5)
            goto L_0x0262
        L_0x0216:
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17852R(r6, r4)
            goto L_0x0262
        L_0x0221:
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17883y(r6, r4, r1)
            goto L_0x0262
        L_0x022c:
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17842H(r6, r4, r1)
            goto L_0x0262
        L_0x0237:
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17855U(r6, r4, r1)
            goto L_0x0262
        L_0x0242:
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17844J(r6, r4, r1)
            goto L_0x0262
        L_0x024d:
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17837C(r6, r4, r1)
            goto L_0x0262
        L_0x0258:
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.onedelhi.secure.it6.m17839E(r6, r4, r1)
        L_0x0262:
            int r3 = r3 + r4
            goto L_0x0398
        L_0x0265:
            boolean r4 = r11.mo27705y(r12, r2)
            if (r4 == 0) goto L_0x0398
        L_0x026b:
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r12, r7)
            com.onedelhi.secure.vs6 r4 = (com.onedelhi.secure.vs6) r4
            com.onedelhi.secure.gt6 r5 = r11.mo27693k(r2)
            int r4 = com.onedelhi.secure.eo6.m13906u(r6, r4, r5)
            goto L_0x0262
        L_0x027a:
            boolean r5 = r11.mo27705y(r12, r2)
            if (r5 == 0) goto L_0x0398
            long r7 = com.onedelhi.secure.zu6.m33462i(r12, r7)
        L_0x0284:
            int r5 = r6 << 3
            long r9 = r7 + r7
            long r6 = r7 >> r4
            int r4 = com.onedelhi.secure.eo6.m13910y(r5)
            long r5 = r9 ^ r6
            int r5 = com.onedelhi.secure.eo6.m13911z(r5)
            int r4 = r4 + r5
            goto L_0x0262
        L_0x0296:
            boolean r4 = r11.mo27705y(r12, r2)
            if (r4 == 0) goto L_0x0398
            int r4 = com.onedelhi.secure.zu6.m33461h(r12, r7)
        L_0x02a0:
            int r5 = r6 << 3
            int r6 = r4 + r4
            int r4 = r4 >> 31
            int r5 = com.onedelhi.secure.eo6.m13910y(r5)
            r4 = r4 ^ r6
            int r4 = com.onedelhi.secure.eo6.m13910y(r4)
            goto L_0x0375
        L_0x02b1:
            boolean r4 = r11.mo27705y(r12, r2)
            if (r4 == 0) goto L_0x0398
            goto L_0x038e
        L_0x02b9:
            boolean r4 = r11.mo27705y(r12, r2)
            if (r4 == 0) goto L_0x0398
            goto L_0x037e
        L_0x02c1:
            boolean r4 = r11.mo27705y(r12, r2)
            if (r4 == 0) goto L_0x0398
            goto L_0x034b
        L_0x02c9:
            boolean r4 = r11.mo27705y(r12, r2)
            if (r4 == 0) goto L_0x0398
            int r4 = com.onedelhi.secure.zu6.m33461h(r12, r7)
        L_0x02d3:
            int r5 = r6 << 3
            int r4 = com.onedelhi.secure.eo6.m13910y(r4)
            goto L_0x0355
        L_0x02db:
            boolean r4 = r11.mo27705y(r12, r2)
            if (r4 == 0) goto L_0x0398
        L_0x02e1:
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r12, r7)
        L_0x02e5:
            com.onedelhi.secure.on6 r4 = (com.onedelhi.secure.on6) r4
            int r5 = r6 << 3
            int r6 = com.onedelhi.secure.eo6.f11310a
            int r4 = r4.mo18486f()
            int r6 = com.onedelhi.secure.eo6.m13910y(r4)
            int r6 = r6 + r4
            int r4 = com.onedelhi.secure.eo6.m13910y(r5)
            int r4 = r4 + r6
            goto L_0x0262
        L_0x02fb:
            boolean r4 = r11.mo27705y(r12, r2)
            if (r4 == 0) goto L_0x0398
        L_0x0301:
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r12, r7)
            com.onedelhi.secure.gt6 r5 = r11.mo27693k(r2)
            int r4 = com.onedelhi.secure.it6.m17846L(r6, r4, r5)
            goto L_0x0262
        L_0x030f:
            boolean r4 = r11.mo27705y(r12, r2)
            if (r4 == 0) goto L_0x0398
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r12, r7)
            boolean r5 = r4 instanceof com.onedelhi.secure.on6
            if (r5 == 0) goto L_0x031e
        L_0x031d:
            goto L_0x02e5
        L_0x031e:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r4 = com.onedelhi.secure.eo6.m13909x(r4)
            goto L_0x0355
        L_0x0327:
            boolean r4 = r11.mo27705y(r12, r2)
            if (r4 == 0) goto L_0x0398
        L_0x032d:
            int r4 = r6 << 3
            int r4 = com.onedelhi.secure.eo6.m13910y(r4)
            int r4 = r4 + 1
            goto L_0x0262
        L_0x0337:
            boolean r4 = r11.mo27705y(r12, r2)
            if (r4 == 0) goto L_0x0398
            goto L_0x037e
        L_0x033e:
            boolean r4 = r11.mo27705y(r12, r2)
            if (r4 == 0) goto L_0x0398
            goto L_0x038e
        L_0x0345:
            boolean r4 = r11.mo27705y(r12, r2)
            if (r4 == 0) goto L_0x0398
        L_0x034b:
            int r4 = com.onedelhi.secure.zu6.m33461h(r12, r7)
        L_0x034f:
            int r5 = r6 << 3
            int r4 = com.onedelhi.secure.eo6.m13907v(r4)
        L_0x0355:
            int r5 = com.onedelhi.secure.eo6.m13910y(r5)
            goto L_0x0375
        L_0x035a:
            boolean r4 = r11.mo27705y(r12, r2)
            if (r4 == 0) goto L_0x0398
            goto L_0x0367
        L_0x0361:
            boolean r4 = r11.mo27705y(r12, r2)
            if (r4 == 0) goto L_0x0398
        L_0x0367:
            long r4 = com.onedelhi.secure.zu6.m33462i(r12, r7)
        L_0x036b:
            int r6 = r6 << 3
            int r4 = com.onedelhi.secure.eo6.m13911z(r4)
            int r5 = com.onedelhi.secure.eo6.m13910y(r6)
        L_0x0375:
            int r5 = r5 + r4
            int r3 = r3 + r5
            goto L_0x0398
        L_0x0378:
            boolean r4 = r11.mo27705y(r12, r2)
            if (r4 == 0) goto L_0x0398
        L_0x037e:
            int r4 = r6 << 3
            int r4 = com.onedelhi.secure.eo6.m13910y(r4)
            int r4 = r4 + 4
            goto L_0x0262
        L_0x0388:
            boolean r4 = r11.mo27705y(r12, r2)
            if (r4 == 0) goto L_0x0398
        L_0x038e:
            int r4 = r6 << 3
            int r4 = com.onedelhi.secure.eo6.m13910y(r4)
            int r4 = r4 + 8
            goto L_0x0262
        L_0x0398:
            int r2 = r2 + 3
            goto L_0x0009
        L_0x039c:
            com.onedelhi.secure.pu6 r0 = r11.f23322a
            java.lang.Object r12 = r0.mo22656d(r12)
            int r12 = r0.mo22653a(r12)
            int r3 = r3 + r12
            goto L_0x03ac
        L_0x03a8:
            int r3 = r11.mo27683K(r12)
        L_0x03ac:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ys6.mo16907a(java.lang.Object):int");
    }

    /* renamed from: b */
    public final boolean mo16908b(Object obj) {
        int i;
        int i2;
        Object obj2 = obj;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f23333c) {
            int i6 = this.f23332b[i5];
            int i7 = this.f23328a[i6];
            int U = mo27691U(i6);
            int i8 = this.f23328a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f23318a.getInt(obj2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & U) != 0 && !mo27706z(obj, i6, i2, i, i10)) {
                return false;
            }
            int T = m32640T(U);
            if (T != 9 && T != 17) {
                if (T != 27) {
                    if (T == 60 || T == 68) {
                        if (mo27681C(obj2, i7, i6) && !m32631A(obj2, U, mo27693k(i6))) {
                            return false;
                        }
                    } else if (T != 49) {
                        if (T == 50 && !((ps6) zu6.m33464k(obj2, (long) (U & 1048575))).isEmpty()) {
                            os6 os6 = (os6) mo27694l(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zu6.m33464k(obj2, (long) (U & 1048575));
                if (!list.isEmpty()) {
                    gt6 k = mo27693k(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!k.mo16908b(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (mo27706z(obj, i6, i2, i, i10) && !m32631A(obj2, U, mo27693k(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.f23327a) {
            return true;
        }
        this.f23323a.mo23275a(obj2);
        throw null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16909c(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = m32632B(r8)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = r8 instanceof com.onedelhi.secure.jq6
            r1 = 0
            if (r0 == 0) goto L_0x001a
            r0 = r8
            com.onedelhi.secure.jq6 r0 = (com.onedelhi.secure.jq6) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.mo18548x(r2)
            r0.zzb = r1
            r0.mo18547v()
        L_0x001a:
            int[] r0 = r7.f23328a
            int r0 = r0.length
        L_0x001d:
            if (r1 >= r0) goto L_0x0075
            int r2 = r7.mo27691U(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = m32640T(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L_0x005f
            r5 = 60
            if (r2 == r5) goto L_0x0054
            r5 = 68
            if (r2 == r5) goto L_0x0054
            switch(r2) {
                case 17: goto L_0x005f;
                case 18: goto L_0x004e;
                case 19: goto L_0x004e;
                case 20: goto L_0x004e;
                case 21: goto L_0x004e;
                case 22: goto L_0x004e;
                case 23: goto L_0x004e;
                case 24: goto L_0x004e;
                case 25: goto L_0x004e;
                case 26: goto L_0x004e;
                case 27: goto L_0x004e;
                case 28: goto L_0x004e;
                case 29: goto L_0x004e;
                case 30: goto L_0x004e;
                case 31: goto L_0x004e;
                case 32: goto L_0x004e;
                case 33: goto L_0x004e;
                case 34: goto L_0x004e;
                case 35: goto L_0x004e;
                case 36: goto L_0x004e;
                case 37: goto L_0x004e;
                case 38: goto L_0x004e;
                case 39: goto L_0x004e;
                case 40: goto L_0x004e;
                case 41: goto L_0x004e;
                case 42: goto L_0x004e;
                case 43: goto L_0x004e;
                case 44: goto L_0x004e;
                case 45: goto L_0x004e;
                case 46: goto L_0x004e;
                case 47: goto L_0x004e;
                case 48: goto L_0x004e;
                case 49: goto L_0x004e;
                case 50: goto L_0x003c;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x0072
        L_0x003c:
            sun.misc.Unsafe r2 = f23318a
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L_0x0072
            r6 = r5
            com.onedelhi.secure.ps6 r6 = (com.onedelhi.secure.ps6) r6
            r6.mo22625f()
            r2.putObject(r8, r3, r5)
            goto L_0x0072
        L_0x004e:
            com.onedelhi.secure.qr6 r2 = r7.f23324a
            r2.mo20589a(r8, r3)
            goto L_0x0072
        L_0x0054:
            int[] r2 = r7.f23328a
            r2 = r2[r1]
            boolean r2 = r7.mo27681C(r8, r2, r1)
            if (r2 == 0) goto L_0x0072
            goto L_0x0065
        L_0x005f:
            boolean r2 = r7.mo27705y(r8, r1)
            if (r2 == 0) goto L_0x0072
        L_0x0065:
            com.onedelhi.secure.gt6 r2 = r7.mo27693k(r1)
            sun.misc.Unsafe r5 = f23318a
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.mo16909c(r3)
        L_0x0072:
            int r1 = r1 + 3
            goto L_0x001d
        L_0x0075:
            com.onedelhi.secure.pu6 r0 = r7.f23322a
            r0.mo22659g(r8)
            boolean r0 = r7.f23327a
            if (r0 == 0) goto L_0x0083
            com.onedelhi.secure.qo6 r0 = r7.f23323a
            r0.mo23276b(r8)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ys6.mo16909c(java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02ea, code lost:
        if (r0 != r24) goto L_0x02ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02fd, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0329, code lost:
        if (r0 != r14) goto L_0x02ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x034a, code lost:
        if (r0 != r14) goto L_0x02ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fc, code lost:
        r7.putInt(r14, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0113, code lost:
        r6 = r6 | r10;
        r13 = r34;
        r9 = r7;
        r2 = r15;
        r7 = r20;
        r1 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0146, code lost:
        r13 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x021c, code lost:
        r0 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x023a, code lost:
        r6 = r6 | r10;
        r9 = r7;
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x023d, code lost:
        r7 = r20;
        r1 = r23;
        r8 = 1048575;
        r10 = -1;
        r15 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0246, code lost:
        r13 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x024a, code lost:
        r2 = r4;
        r29 = r7;
        r7 = r20;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16910d(java.lang.Object r31, byte[] r32, int r33, int r34, com.onedelhi.secure.vl6 r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            boolean r0 = r15.f23331b
            if (r0 == 0) goto L_0x038f
            m32643p(r31)
            sun.misc.Unsafe r9 = f23318a
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0021:
            if (r0 >= r13) goto L_0x0372
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0033
            int r0 = com.onedelhi.secure.xl6.m31544k(r0, r12, r3, r11)
            int r3 = r11.f21853a
            r4 = r0
            r17 = r3
            goto L_0x0036
        L_0x0033:
            r17 = r0
            r4 = r3
        L_0x0036:
            int r5 = r17 >>> 3
            if (r5 <= r1) goto L_0x0041
            int r2 = r2 / 3
            int r0 = r15.mo27688Q(r5, r2)
            goto L_0x0045
        L_0x0041:
            int r0 = r15.mo27687P(r5)
        L_0x0045:
            r2 = r0
            if (r2 != r10) goto L_0x0052
            r2 = r4
            r23 = r5
            r29 = r9
            r15 = 0
        L_0x004e:
            r18 = -1
            goto L_0x034d
        L_0x0052:
            r3 = r17 & 7
            int[] r0 = r15.f23328a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r13 = m32640T(r1)
            r10 = r1 & r8
            r19 = r9
            long r8 = (long) r10
            r10 = 17
            r33 = r5
            if (r13 > r10) goto L_0x0251
            int r10 = r2 + 2
            r0 = r0[r10]
            int r10 = r0 >>> 20
            r5 = 1
            int r10 = r5 << r10
            r15 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r15
            r22 = r1
            r20 = r2
            if (r0 == r7) goto L_0x0092
            if (r7 == r15) goto L_0x0085
            long r1 = (long) r7
            r7 = r19
            r7.putInt(r14, r1, r6)
            goto L_0x0087
        L_0x0085:
            r7 = r19
        L_0x0087:
            if (r0 == r15) goto L_0x008f
            long r1 = (long) r0
            int r1 = r7.getInt(r14, r1)
            r6 = r1
        L_0x008f:
            r2 = r7
            r7 = r0
            goto L_0x0094
        L_0x0092:
            r2 = r19
        L_0x0094:
            r0 = 5
            switch(r13) {
                case 0: goto L_0x021f;
                case 1: goto L_0x0203;
                case 2: goto L_0x01e2;
                case 3: goto L_0x01e2;
                case 4: goto L_0x01ca;
                case 5: goto L_0x01aa;
                case 6: goto L_0x0193;
                case 7: goto L_0x0172;
                case 8: goto L_0x014d;
                case 9: goto L_0x011e;
                case 10: goto L_0x0100;
                case 11: goto L_0x01ca;
                case 12: goto L_0x00ed;
                case 13: goto L_0x0193;
                case 14: goto L_0x01aa;
                case 15: goto L_0x00d9;
                case 16: goto L_0x00a6;
                default: goto L_0x0098;
            }
        L_0x0098:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            goto L_0x024a
        L_0x00a6:
            if (r3 != 0) goto L_0x00d0
            int r13 = com.onedelhi.secure.xl6.m31546m(r12, r4, r11)
            long r0 = r11.f21854a
            long r4 = com.onedelhi.secure.wn6.m30971b(r0)
            r0 = r2
            r1 = r31
            r15 = r20
            r20 = r7
            r7 = r2
            r2 = r8
            r23 = r33
            r0.putLong(r1, r2, r4)
            r6 = r6 | r10
            r9 = r7
            r0 = r13
            r2 = r15
            r7 = r20
            r1 = r23
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r15 = r30
            goto L_0x0246
        L_0x00d0:
            r23 = r33
            r15 = r20
            r20 = r7
            r7 = r2
            goto L_0x0146
        L_0x00d9:
            r23 = r33
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0146
            int r0 = com.onedelhi.secure.xl6.m31543j(r12, r4, r11)
            int r1 = r11.f21853a
            int r1 = com.onedelhi.secure.wn6.m30970a(r1)
            goto L_0x00fc
        L_0x00ed:
            r23 = r33
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0146
            int r0 = com.onedelhi.secure.xl6.m31543j(r12, r4, r11)
            int r1 = r11.f21853a
        L_0x00fc:
            r7.putInt(r14, r8, r1)
            goto L_0x0113
        L_0x0100:
            r23 = r33
            r15 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0146
            int r0 = com.onedelhi.secure.xl6.m31534a(r12, r4, r11)
            java.lang.Object r1 = r11.f21856a
            r7.putObject(r14, r8, r1)
        L_0x0113:
            r6 = r6 | r10
            r13 = r34
            r9 = r7
            r2 = r15
            r7 = r20
            r1 = r23
            goto L_0x036a
        L_0x011e:
            r23 = r33
            r15 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0146
            r13 = r30
            r19 = 1048575(0xfffff, float:1.469367E-39)
            java.lang.Object r8 = r13.mo27695m(r14, r15)
            com.onedelhi.secure.gt6 r1 = r13.mo27693k(r15)
            r0 = r8
            r2 = r32
            r3 = r4
            r4 = r34
            r5 = r35
            int r0 = com.onedelhi.secure.xl6.m31548o(r0, r1, r2, r3, r4, r5)
            r13.mo27701u(r14, r15, r8)
            goto L_0x023a
        L_0x0146:
            r13 = r30
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x024a
        L_0x014d:
            r13 = r30
            r23 = r33
            r15 = r20
            r0 = 2
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x024a
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r22 & r0
            if (r0 != 0) goto L_0x0167
            int r0 = com.onedelhi.secure.xl6.m31540g(r12, r4, r11)
            goto L_0x016b
        L_0x0167:
            int r0 = com.onedelhi.secure.xl6.m31541h(r12, r4, r11)
        L_0x016b:
            java.lang.Object r1 = r11.f21856a
            r7.putObject(r14, r8, r1)
            goto L_0x023a
        L_0x0172:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x024a
            int r0 = com.onedelhi.secure.xl6.m31546m(r12, r4, r11)
            long r1 = r11.f21854a
            r3 = 0
            int r17 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r17 == 0) goto L_0x018d
            goto L_0x018e
        L_0x018d:
            r5 = 0
        L_0x018e:
            com.onedelhi.secure.zu6.m33471r(r14, r8, r5)
            goto L_0x023a
        L_0x0193:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x024a
            int r0 = com.onedelhi.secure.xl6.m31535b(r12, r4)
            r7.putInt(r14, r8, r0)
            goto L_0x021c
        L_0x01aa:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r5) goto L_0x024a
            long r21 = com.onedelhi.secure.xl6.m31549p(r12, r4)
            r0 = r7
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x023a
        L_0x01ca:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x024a
            int r0 = com.onedelhi.secure.xl6.m31543j(r12, r4, r11)
            int r1 = r11.f21853a
            r7.putInt(r14, r8, r1)
            goto L_0x023a
        L_0x01e2:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x024a
            int r17 = com.onedelhi.secure.xl6.m31546m(r12, r4, r11)
            long r4 = r11.f21854a
            r0 = r7
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r10
            r9 = r7
            r2 = r15
            r0 = r17
            goto L_0x023d
        L_0x0203:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x024a
            int r0 = com.onedelhi.secure.xl6.m31535b(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.onedelhi.secure.zu6.m33474u(r14, r8, r0)
        L_0x021c:
            int r0 = r4 + 4
            goto L_0x023a
        L_0x021f:
            r13 = r30
            r23 = r33
            r15 = r20
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            r7 = r2
            if (r3 != r5) goto L_0x024a
            long r0 = com.onedelhi.secure.xl6.m31549p(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.onedelhi.secure.zu6.m33473t(r14, r8, r0)
            int r0 = r4 + 8
        L_0x023a:
            r6 = r6 | r10
            r9 = r7
            r2 = r15
        L_0x023d:
            r7 = r20
            r1 = r23
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r15 = r13
        L_0x0246:
            r13 = r34
            goto L_0x0021
        L_0x024a:
            r2 = r4
            r29 = r7
            r7 = r20
            goto L_0x004e
        L_0x0251:
            r23 = r33
            r22 = r1
            r20 = r7
            r10 = r15
            r7 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r15 = r2
            r0 = 27
            if (r13 != r0) goto L_0x02b0
            r0 = 2
            if (r3 != r0) goto L_0x02a5
            java.lang.Object r0 = r7.getObject(r14, r8)
            com.onedelhi.secure.xq6 r0 = (com.onedelhi.secure.xq6) r0
            boolean r1 = r0.mo23936c()
            if (r1 != 0) goto L_0x0282
            int r1 = r0.size()
            if (r1 != 0) goto L_0x027a
            r1 = 10
            goto L_0x027b
        L_0x027a:
            int r1 = r1 + r1
        L_0x027b:
            com.onedelhi.secure.xq6 r0 = r0.mo14324d2(r1)
            r7.putObject(r14, r8, r0)
        L_0x0282:
            r5 = r0
            com.onedelhi.secure.gt6 r0 = r10.mo27693k(r15)
            r1 = r17
            r2 = r32
            r3 = r4
            r4 = r34
            r8 = r6
            r6 = r35
            int r0 = com.onedelhi.secure.xl6.m31538e(r0, r1, r2, r3, r4, r5, r6)
            r13 = r34
            r9 = r7
            r6 = r8
            r2 = r15
            r7 = r20
            r1 = r23
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r15 = r10
            r10 = -1
            goto L_0x0021
        L_0x02a5:
            r14 = r4
            r25 = r6
            r29 = r7
            r26 = r20
            r18 = -1
            goto L_0x032c
        L_0x02b0:
            r0 = 49
            if (r13 > r0) goto L_0x02ff
            r1 = r22
            long r1 = (long) r1
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r5 = r3
            r3 = r4
            r24 = r4
            r4 = r34
            r33 = r5
            r5 = r17
            r25 = r6
            r6 = r23
            r26 = r20
            r20 = r7
            r7 = r33
            r27 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r15
            r29 = r20
            r18 = -1
            r9 = r21
            r11 = r13
            r12 = r27
            r14 = r35
            int r0 = r0.mo27686O(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r24
            if (r0 == r14) goto L_0x02fd
        L_0x02ec:
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r15
            r1 = r23
            r6 = r25
            r7 = r26
            goto L_0x0368
        L_0x02fd:
            r2 = r0
            goto L_0x032d
        L_0x02ff:
            r33 = r3
            r14 = r4
            r25 = r6
            r29 = r7
            r27 = r8
            r26 = r20
            r1 = r22
            r18 = -1
            r0 = 50
            r7 = r33
            if (r13 != r0) goto L_0x0332
            r0 = 2
            if (r7 != r0) goto L_0x032c
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r14
            r4 = r34
            r5 = r15
            r6 = r27
            r8 = r35
            int r0 = r0.mo27684M(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r14) goto L_0x02fd
            goto L_0x02ec
        L_0x032c:
            r2 = r14
        L_0x032d:
            r6 = r25
            r7 = r26
            goto L_0x034d
        L_0x0332:
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r14
            r4 = r34
            r5 = r17
            r6 = r23
            r9 = r13
            r10 = r27
            r12 = r15
            r13 = r35
            int r0 = r0.mo27685N(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r14) goto L_0x02fd
            goto L_0x02ec
        L_0x034d:
            com.onedelhi.secure.qu6 r4 = m32635G(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.onedelhi.secure.xl6.m31542i(r0, r1, r2, r3, r4, r5)
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r15
            r1 = r23
        L_0x0368:
            r9 = r29
        L_0x036a:
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r15 = r30
            goto L_0x0021
        L_0x0372:
            r25 = r6
            r29 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x0385
            long r1 = (long) r7
            r3 = r31
            r6 = r25
            r4 = r29
            r4.putInt(r3, r1, r6)
        L_0x0385:
            r4 = r34
            if (r0 != r4) goto L_0x038a
            return
        L_0x038a:
            com.onedelhi.secure.dr6 r0 = com.onedelhi.secure.dr6.m13276e()
            throw r0
        L_0x038f:
            r4 = r13
            r3 = r14
            r5 = 0
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r6 = r35
            r0.mo27682F(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ys6.mo16910d(java.lang.Object, byte[], int, int, com.onedelhi.secure.vl6):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b6, code lost:
        r2 = r2 + 3;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16911e(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            int[] r0 = r8.f23328a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r2 >= r0) goto L_0x01ba
            int r3 = r8.mo27691U(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r3 & r4
            int r3 = m32640T(r3)
            long r5 = (long) r5
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
            int r3 = r8.mo27689R(r2)
            r3 = r3 & r4
            long r3 = (long) r3
            int r7 = com.onedelhi.secure.zu6.m33461h(r9, r3)
            int r3 = com.onedelhi.secure.zu6.m33461h(r10, r3)
            if (r7 != r3) goto L_0x01b5
            java.lang.Object r3 = com.onedelhi.secure.zu6.m33464k(r9, r5)
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r10, r5)
            boolean r3 = com.onedelhi.secure.it6.m17881w(r3, r4)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x003a:
            java.lang.Object r3 = com.onedelhi.secure.zu6.m33464k(r9, r5)
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r10, r5)
            boolean r3 = com.onedelhi.secure.it6.m17881w(r3, r4)
            if (r3 != 0) goto L_0x01b6
            goto L_0x01b5
        L_0x004a:
            boolean r3 = r8.mo27704x(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = com.onedelhi.secure.zu6.m33464k(r9, r5)
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r10, r5)
            boolean r3 = com.onedelhi.secure.it6.m17881w(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0060:
            boolean r3 = r8.mo27704x(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.onedelhi.secure.zu6.m33462i(r9, r5)
            long r5 = com.onedelhi.secure.zu6.m33462i(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0074:
            boolean r3 = r8.mo27704x(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.onedelhi.secure.zu6.m33461h(r9, r5)
            int r4 = com.onedelhi.secure.zu6.m33461h(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0086:
            boolean r3 = r8.mo27704x(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.onedelhi.secure.zu6.m33462i(r9, r5)
            long r5 = com.onedelhi.secure.zu6.m33462i(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x009a:
            boolean r3 = r8.mo27704x(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.onedelhi.secure.zu6.m33461h(r9, r5)
            int r4 = com.onedelhi.secure.zu6.m33461h(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00ac:
            boolean r3 = r8.mo27704x(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.onedelhi.secure.zu6.m33461h(r9, r5)
            int r4 = com.onedelhi.secure.zu6.m33461h(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00be:
            boolean r3 = r8.mo27704x(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.onedelhi.secure.zu6.m33461h(r9, r5)
            int r4 = com.onedelhi.secure.zu6.m33461h(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x00d0:
            boolean r3 = r8.mo27704x(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = com.onedelhi.secure.zu6.m33464k(r9, r5)
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r10, r5)
            boolean r3 = com.onedelhi.secure.it6.m17881w(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00e6:
            boolean r3 = r8.mo27704x(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = com.onedelhi.secure.zu6.m33464k(r9, r5)
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r10, r5)
            boolean r3 = com.onedelhi.secure.it6.m17881w(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x00fc:
            boolean r3 = r8.mo27704x(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            java.lang.Object r3 = com.onedelhi.secure.zu6.m33464k(r9, r5)
            java.lang.Object r4 = com.onedelhi.secure.zu6.m33464k(r10, r5)
            boolean r3 = com.onedelhi.secure.it6.m17881w(r3, r4)
            if (r3 == 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0112:
            boolean r3 = r8.mo27704x(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            boolean r3 = com.onedelhi.secure.zu6.m33450B(r9, r5)
            boolean r4 = com.onedelhi.secure.zu6.m33450B(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0124:
            boolean r3 = r8.mo27704x(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.onedelhi.secure.zu6.m33461h(r9, r5)
            int r4 = com.onedelhi.secure.zu6.m33461h(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x0136:
            boolean r3 = r8.mo27704x(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.onedelhi.secure.zu6.m33462i(r9, r5)
            long r5 = com.onedelhi.secure.zu6.m33462i(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x014a:
            boolean r3 = r8.mo27704x(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            int r3 = com.onedelhi.secure.zu6.m33461h(r9, r5)
            int r4 = com.onedelhi.secure.zu6.m33461h(r10, r5)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x015b:
            boolean r3 = r8.mo27704x(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.onedelhi.secure.zu6.m33462i(r9, r5)
            long r5 = com.onedelhi.secure.zu6.m33462i(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x016e:
            boolean r3 = r8.mo27704x(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            long r3 = com.onedelhi.secure.zu6.m33462i(r9, r5)
            long r5 = com.onedelhi.secure.zu6.m33462i(r10, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x0181:
            boolean r3 = r8.mo27704x(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            float r3 = com.onedelhi.secure.zu6.m33460g(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            float r4 = com.onedelhi.secure.zu6.m33460g(r10, r5)
            int r4 = java.lang.Float.floatToIntBits(r4)
            if (r3 != r4) goto L_0x01b5
            goto L_0x01b6
        L_0x019a:
            boolean r3 = r8.mo27704x(r9, r10, r2)
            if (r3 == 0) goto L_0x01b5
            double r3 = com.onedelhi.secure.zu6.m33459f(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            double r5 = com.onedelhi.secure.zu6.m33459f(r10, r5)
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
            com.onedelhi.secure.pu6 r0 = r8.f23322a
            java.lang.Object r0 = r0.mo22656d(r9)
            com.onedelhi.secure.pu6 r2 = r8.f23322a
            java.lang.Object r2 = r2.mo22656d(r10)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01cd
            return r1
        L_0x01cd:
            boolean r0 = r8.f23327a
            if (r0 != 0) goto L_0x01d3
            r9 = 1
            return r9
        L_0x01d3:
            com.onedelhi.secure.qo6 r0 = r8.f23323a
            r0.mo23275a(r9)
            com.onedelhi.secure.qo6 r9 = r8.f23323a
            r9.mo23275a(r10)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ys6.mo16911e(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02f4, code lost:
        r2.mo16771J(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0305, code lost:
        r2.mo16781j(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0316, code lost:
        r2.mo16783l(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0327, code lost:
        r2.mo16773b(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0338, code lost:
        r2.mo16778g(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0343, code lost:
        r2.mo16766E(r9, (com.onedelhi.secure.on6) com.onedelhi.secure.zu6.m33464k(r1, (long) (r8 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0356, code lost:
        r2.mo16763B(r9, com.onedelhi.secure.zu6.m33464k(r1, (long) (r8 & 1048575)), mo27693k(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x036b, code lost:
        m32634E(r9, com.onedelhi.secure.zu6.m33464k(r1, (long) (r8 & 1048575)), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0382, code lost:
        r2.mo16796y(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0393, code lost:
        r2.mo16764C(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03a3, code lost:
        r2.mo16794w(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03b3, code lost:
        r2.mo16782k(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03c3, code lost:
        r2.mo16790s(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03d3, code lost:
        r2.mo16792u(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03e3, code lost:
        r2.mo16769H(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03f3, code lost:
        r2.mo16774c(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02c8, code lost:
        r2.mo16793v(r9, com.onedelhi.secure.zu6.m33464k(r1, (long) (r8 & 1048575)), mo27693k(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02e3, code lost:
        r2.mo16785n(r9, r10);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16912f(java.lang.Object r17, com.onedelhi.secure.yv6 r18) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f23331b
            r4 = 0
            r5 = 1
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            if (r3 == 0) goto L_0x040a
            boolean r3 = r0.f23327a
            if (r3 != 0) goto L_0x0404
            int[] r3 = r0.f23328a
            int r3 = r3.length
            r4 = 0
        L_0x0018:
            if (r4 >= r3) goto L_0x03fa
            int r8 = r0.mo27691U(r4)
            int[] r9 = r0.f23328a
            r9 = r9[r4]
            int r10 = m32640T(r8)
            switch(r10) {
                case 0: goto L_0x03e7;
                case 1: goto L_0x03d7;
                case 2: goto L_0x03c7;
                case 3: goto L_0x03b7;
                case 4: goto L_0x03a7;
                case 5: goto L_0x0397;
                case 6: goto L_0x0387;
                case 7: goto L_0x0376;
                case 8: goto L_0x0365;
                case 9: goto L_0x0350;
                case 10: goto L_0x033d;
                case 11: goto L_0x032c;
                case 12: goto L_0x031b;
                case 13: goto L_0x030a;
                case 14: goto L_0x02f9;
                case 15: goto L_0x02e8;
                case 16: goto L_0x02d7;
                case 17: goto L_0x02c2;
                case 18: goto L_0x02b5;
                case 19: goto L_0x02a8;
                case 20: goto L_0x029b;
                case 21: goto L_0x028e;
                case 22: goto L_0x0281;
                case 23: goto L_0x0274;
                case 24: goto L_0x0267;
                case 25: goto L_0x025a;
                case 26: goto L_0x024d;
                case 27: goto L_0x023c;
                case 28: goto L_0x022f;
                case 29: goto L_0x0222;
                case 30: goto L_0x0215;
                case 31: goto L_0x0208;
                case 32: goto L_0x01fb;
                case 33: goto L_0x01ee;
                case 34: goto L_0x01e1;
                case 35: goto L_0x01d4;
                case 36: goto L_0x01c7;
                case 37: goto L_0x01ba;
                case 38: goto L_0x01ad;
                case 39: goto L_0x01a0;
                case 40: goto L_0x0193;
                case 41: goto L_0x0186;
                case 42: goto L_0x0179;
                case 43: goto L_0x016c;
                case 44: goto L_0x015f;
                case 45: goto L_0x0152;
                case 46: goto L_0x0145;
                case 47: goto L_0x0138;
                case 48: goto L_0x012b;
                case 49: goto L_0x011a;
                case 50: goto L_0x010f;
                case 51: goto L_0x0101;
                case 52: goto L_0x00f3;
                case 53: goto L_0x00e5;
                case 54: goto L_0x00d7;
                case 55: goto L_0x00c9;
                case 56: goto L_0x00bb;
                case 57: goto L_0x00ad;
                case 58: goto L_0x009f;
                case 59: goto L_0x0097;
                case 60: goto L_0x008f;
                case 61: goto L_0x0087;
                case 62: goto L_0x0079;
                case 63: goto L_0x006b;
                case 64: goto L_0x005d;
                case 65: goto L_0x004f;
                case 66: goto L_0x0041;
                case 67: goto L_0x0033;
                case 68: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x03f6
        L_0x002b:
            boolean r10 = r0.mo27681C(r1, r9, r4)
            if (r10 == 0) goto L_0x03f6
            goto L_0x02c8
        L_0x0033:
            boolean r10 = r0.mo27681C(r1, r9, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = m32641V(r1, r10)
            goto L_0x02e3
        L_0x0041:
            boolean r10 = r0.mo27681C(r1, r9, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = m32639L(r1, r10)
            goto L_0x02f4
        L_0x004f:
            boolean r10 = r0.mo27681C(r1, r9, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = m32641V(r1, r10)
            goto L_0x0305
        L_0x005d:
            boolean r10 = r0.mo27681C(r1, r9, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = m32639L(r1, r10)
            goto L_0x0316
        L_0x006b:
            boolean r10 = r0.mo27681C(r1, r9, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = m32639L(r1, r10)
            goto L_0x0327
        L_0x0079:
            boolean r10 = r0.mo27681C(r1, r9, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = m32639L(r1, r10)
            goto L_0x0338
        L_0x0087:
            boolean r10 = r0.mo27681C(r1, r9, r4)
            if (r10 == 0) goto L_0x03f6
            goto L_0x0343
        L_0x008f:
            boolean r10 = r0.mo27681C(r1, r9, r4)
            if (r10 == 0) goto L_0x03f6
            goto L_0x0356
        L_0x0097:
            boolean r10 = r0.mo27681C(r1, r9, r4)
            if (r10 == 0) goto L_0x03f6
            goto L_0x036b
        L_0x009f:
            boolean r10 = r0.mo27681C(r1, r9, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            boolean r8 = m32633D(r1, r10)
            goto L_0x0382
        L_0x00ad:
            boolean r10 = r0.mo27681C(r1, r9, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = m32639L(r1, r10)
            goto L_0x0393
        L_0x00bb:
            boolean r10 = r0.mo27681C(r1, r9, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = m32641V(r1, r10)
            goto L_0x03a3
        L_0x00c9:
            boolean r10 = r0.mo27681C(r1, r9, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = m32639L(r1, r10)
            goto L_0x03b3
        L_0x00d7:
            boolean r10 = r0.mo27681C(r1, r9, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = m32641V(r1, r10)
            goto L_0x03c3
        L_0x00e5:
            boolean r10 = r0.mo27681C(r1, r9, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = m32641V(r1, r10)
            goto L_0x03d3
        L_0x00f3:
            boolean r10 = r0.mo27681C(r1, r9, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            float r8 = m32638J(r1, r10)
            goto L_0x03e3
        L_0x0101:
            boolean r10 = r0.mo27681C(r1, r9, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            double r10 = m32637I(r1, r10)
            goto L_0x03f3
        L_0x010f:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            r0.mo27703w(r2, r9, r8, r4)
            goto L_0x03f6
        L_0x011a:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.gt6 r10 = r0.mo27693k(r4)
            com.onedelhi.secure.it6.m17870l(r9, r8, r2, r10)
            goto L_0x03f6
        L_0x012b:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17877s(r9, r8, r2, r5)
            goto L_0x03f6
        L_0x0138:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17876r(r9, r8, r2, r5)
            goto L_0x03f6
        L_0x0145:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17875q(r9, r8, r2, r5)
            goto L_0x03f6
        L_0x0152:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17874p(r9, r8, r2, r5)
            goto L_0x03f6
        L_0x015f:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17866h(r9, r8, r2, r5)
            goto L_0x03f6
        L_0x016c:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17879u(r9, r8, r2, r5)
            goto L_0x03f6
        L_0x0179:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17863e(r9, r8, r2, r5)
            goto L_0x03f6
        L_0x0186:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17867i(r9, r8, r2, r5)
            goto L_0x03f6
        L_0x0193:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17868j(r9, r8, r2, r5)
            goto L_0x03f6
        L_0x01a0:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17871m(r9, r8, r2, r5)
            goto L_0x03f6
        L_0x01ad:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17880v(r9, r8, r2, r5)
            goto L_0x03f6
        L_0x01ba:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17872n(r9, r8, r2, r5)
            goto L_0x03f6
        L_0x01c7:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17869k(r9, r8, r2, r5)
            goto L_0x03f6
        L_0x01d4:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17865g(r9, r8, r2, r5)
            goto L_0x03f6
        L_0x01e1:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17877s(r9, r8, r2, r6)
            goto L_0x03f6
        L_0x01ee:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17876r(r9, r8, r2, r6)
            goto L_0x03f6
        L_0x01fb:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17875q(r9, r8, r2, r6)
            goto L_0x03f6
        L_0x0208:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17874p(r9, r8, r2, r6)
            goto L_0x03f6
        L_0x0215:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17866h(r9, r8, r2, r6)
            goto L_0x03f6
        L_0x0222:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17879u(r9, r8, r2, r6)
            goto L_0x03f6
        L_0x022f:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17864f(r9, r8, r2)
            goto L_0x03f6
        L_0x023c:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.gt6 r10 = r0.mo27693k(r4)
            com.onedelhi.secure.it6.m17873o(r9, r8, r2, r10)
            goto L_0x03f6
        L_0x024d:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17878t(r9, r8, r2)
            goto L_0x03f6
        L_0x025a:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17863e(r9, r8, r2, r6)
            goto L_0x03f6
        L_0x0267:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17867i(r9, r8, r2, r6)
            goto L_0x03f6
        L_0x0274:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17868j(r9, r8, r2, r6)
            goto L_0x03f6
        L_0x0281:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17871m(r9, r8, r2, r6)
            goto L_0x03f6
        L_0x028e:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17880v(r9, r8, r2, r6)
            goto L_0x03f6
        L_0x029b:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17872n(r9, r8, r2, r6)
            goto L_0x03f6
        L_0x02a8:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17869k(r9, r8, r2, r6)
            goto L_0x03f6
        L_0x02b5:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            java.util.List r8 = (java.util.List) r8
            com.onedelhi.secure.it6.m17865g(r9, r8, r2, r6)
            goto L_0x03f6
        L_0x02c2:
            boolean r10 = r0.mo27705y(r1, r4)
            if (r10 == 0) goto L_0x03f6
        L_0x02c8:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            com.onedelhi.secure.gt6 r10 = r0.mo27693k(r4)
            r2.mo16793v(r9, r8, r10)
            goto L_0x03f6
        L_0x02d7:
            boolean r10 = r0.mo27705y(r1, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = com.onedelhi.secure.zu6.m33462i(r1, r10)
        L_0x02e3:
            r2.mo16785n(r9, r10)
            goto L_0x03f6
        L_0x02e8:
            boolean r10 = r0.mo27705y(r1, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = com.onedelhi.secure.zu6.m33461h(r1, r10)
        L_0x02f4:
            r2.mo16771J(r9, r8)
            goto L_0x03f6
        L_0x02f9:
            boolean r10 = r0.mo27705y(r1, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = com.onedelhi.secure.zu6.m33462i(r1, r10)
        L_0x0305:
            r2.mo16781j(r9, r10)
            goto L_0x03f6
        L_0x030a:
            boolean r10 = r0.mo27705y(r1, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = com.onedelhi.secure.zu6.m33461h(r1, r10)
        L_0x0316:
            r2.mo16783l(r9, r8)
            goto L_0x03f6
        L_0x031b:
            boolean r10 = r0.mo27705y(r1, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = com.onedelhi.secure.zu6.m33461h(r1, r10)
        L_0x0327:
            r2.mo16773b(r9, r8)
            goto L_0x03f6
        L_0x032c:
            boolean r10 = r0.mo27705y(r1, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = com.onedelhi.secure.zu6.m33461h(r1, r10)
        L_0x0338:
            r2.mo16778g(r9, r8)
            goto L_0x03f6
        L_0x033d:
            boolean r10 = r0.mo27705y(r1, r4)
            if (r10 == 0) goto L_0x03f6
        L_0x0343:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            com.onedelhi.secure.on6 r8 = (com.onedelhi.secure.on6) r8
            r2.mo16766E(r9, r8)
            goto L_0x03f6
        L_0x0350:
            boolean r10 = r0.mo27705y(r1, r4)
            if (r10 == 0) goto L_0x03f6
        L_0x0356:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            com.onedelhi.secure.gt6 r10 = r0.mo27693k(r4)
            r2.mo16763B(r9, r8, r10)
            goto L_0x03f6
        L_0x0365:
            boolean r10 = r0.mo27705y(r1, r4)
            if (r10 == 0) goto L_0x03f6
        L_0x036b:
            r8 = r8 & r7
            long r10 = (long) r8
            java.lang.Object r8 = com.onedelhi.secure.zu6.m33464k(r1, r10)
            m32634E(r9, r8, r2)
            goto L_0x03f6
        L_0x0376:
            boolean r10 = r0.mo27705y(r1, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            boolean r8 = com.onedelhi.secure.zu6.m33450B(r1, r10)
        L_0x0382:
            r2.mo16796y(r9, r8)
            goto L_0x03f6
        L_0x0387:
            boolean r10 = r0.mo27705y(r1, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = com.onedelhi.secure.zu6.m33461h(r1, r10)
        L_0x0393:
            r2.mo16764C(r9, r8)
            goto L_0x03f6
        L_0x0397:
            boolean r10 = r0.mo27705y(r1, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = com.onedelhi.secure.zu6.m33462i(r1, r10)
        L_0x03a3:
            r2.mo16794w(r9, r10)
            goto L_0x03f6
        L_0x03a7:
            boolean r10 = r0.mo27705y(r1, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            int r8 = com.onedelhi.secure.zu6.m33461h(r1, r10)
        L_0x03b3:
            r2.mo16782k(r9, r8)
            goto L_0x03f6
        L_0x03b7:
            boolean r10 = r0.mo27705y(r1, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = com.onedelhi.secure.zu6.m33462i(r1, r10)
        L_0x03c3:
            r2.mo16790s(r9, r10)
            goto L_0x03f6
        L_0x03c7:
            boolean r10 = r0.mo27705y(r1, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            long r10 = com.onedelhi.secure.zu6.m33462i(r1, r10)
        L_0x03d3:
            r2.mo16792u(r9, r10)
            goto L_0x03f6
        L_0x03d7:
            boolean r10 = r0.mo27705y(r1, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            float r8 = com.onedelhi.secure.zu6.m33460g(r1, r10)
        L_0x03e3:
            r2.mo16769H(r9, r8)
            goto L_0x03f6
        L_0x03e7:
            boolean r10 = r0.mo27705y(r1, r4)
            if (r10 == 0) goto L_0x03f6
            r8 = r8 & r7
            long r10 = (long) r8
            double r10 = com.onedelhi.secure.zu6.m33459f(r1, r10)
        L_0x03f3:
            r2.mo16774c(r9, r10)
        L_0x03f6:
            int r4 = r4 + 3
            goto L_0x0018
        L_0x03fa:
            com.onedelhi.secure.pu6 r3 = r0.f23322a
            java.lang.Object r1 = r3.mo22656d(r1)
            r3.mo22661i(r1, r2)
            return
        L_0x0404:
            com.onedelhi.secure.qo6 r2 = r0.f23323a
            r2.mo23275a(r1)
            throw r4
        L_0x040a:
            boolean r3 = r0.f23327a
            if (r3 != 0) goto L_0x085a
            int[] r3 = r0.f23328a
            int r3 = r3.length
            sun.misc.Unsafe r4 = f23318a
            r8 = 0
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r10 = 0
        L_0x0418:
            if (r8 >= r3) goto L_0x03fa
            int r11 = r0.mo27691U(r8)
            int[] r12 = r0.f23328a
            r13 = r12[r8]
            int r14 = m32640T(r11)
            r15 = 17
            if (r14 > r15) goto L_0x043d
            int r15 = r8 + 2
            r12 = r12[r15]
            r15 = r12 & r7
            if (r15 == r9) goto L_0x0438
            long r9 = (long) r15
            int r10 = r4.getInt(r1, r9)
            r9 = r15
        L_0x0438:
            int r12 = r12 >>> 20
            int r12 = r5 << r12
            goto L_0x043e
        L_0x043d:
            r12 = 0
        L_0x043e:
            r11 = r11 & r7
            long r6 = (long) r11
            switch(r14) {
                case 0: goto L_0x0846;
                case 1: goto L_0x0839;
                case 2: goto L_0x082c;
                case 3: goto L_0x081f;
                case 4: goto L_0x0812;
                case 5: goto L_0x0805;
                case 6: goto L_0x07f8;
                case 7: goto L_0x07eb;
                case 8: goto L_0x07dd;
                case 9: goto L_0x07cb;
                case 10: goto L_0x07bb;
                case 11: goto L_0x07ad;
                case 12: goto L_0x079f;
                case 13: goto L_0x0791;
                case 14: goto L_0x0783;
                case 15: goto L_0x0775;
                case 16: goto L_0x0767;
                case 17: goto L_0x0755;
                case 18: goto L_0x0745;
                case 19: goto L_0x0735;
                case 20: goto L_0x0725;
                case 21: goto L_0x0715;
                case 22: goto L_0x0705;
                case 23: goto L_0x06f5;
                case 24: goto L_0x06e5;
                case 25: goto L_0x06d5;
                case 26: goto L_0x06c6;
                case 27: goto L_0x06b3;
                case 28: goto L_0x06a4;
                case 29: goto L_0x0694;
                case 30: goto L_0x0684;
                case 31: goto L_0x0674;
                case 32: goto L_0x0664;
                case 33: goto L_0x0654;
                case 34: goto L_0x0644;
                case 35: goto L_0x0635;
                case 36: goto L_0x0626;
                case 37: goto L_0x0617;
                case 38: goto L_0x0608;
                case 39: goto L_0x05f9;
                case 40: goto L_0x05ea;
                case 41: goto L_0x05db;
                case 42: goto L_0x05cc;
                case 43: goto L_0x05bd;
                case 44: goto L_0x05ae;
                case 45: goto L_0x059f;
                case 46: goto L_0x0590;
                case 47: goto L_0x0581;
                case 48: goto L_0x0572;
                case 49: goto L_0x055f;
                case 50: goto L_0x0556;
                case 51: goto L_0x0547;
                case 52: goto L_0x0538;
                case 53: goto L_0x0529;
                case 54: goto L_0x051a;
                case 55: goto L_0x050b;
                case 56: goto L_0x04fc;
                case 57: goto L_0x04ed;
                case 58: goto L_0x04de;
                case 59: goto L_0x04cf;
                case 60: goto L_0x04bc;
                case 61: goto L_0x04ac;
                case 62: goto L_0x049e;
                case 63: goto L_0x0490;
                case 64: goto L_0x0482;
                case 65: goto L_0x0474;
                case 66: goto L_0x0466;
                case 67: goto L_0x0458;
                case 68: goto L_0x0446;
                default: goto L_0x0443;
            }
        L_0x0443:
            r14 = 0
            goto L_0x0852
        L_0x0446:
            boolean r11 = r0.mo27681C(r1, r13, r8)
            if (r11 == 0) goto L_0x0443
            java.lang.Object r6 = r4.getObject(r1, r6)
            com.onedelhi.secure.gt6 r7 = r0.mo27693k(r8)
            r2.mo16793v(r13, r6, r7)
            goto L_0x0443
        L_0x0458:
            boolean r11 = r0.mo27681C(r1, r13, r8)
            if (r11 == 0) goto L_0x0443
            long r6 = m32641V(r1, r6)
            r2.mo16785n(r13, r6)
            goto L_0x0443
        L_0x0466:
            boolean r11 = r0.mo27681C(r1, r13, r8)
            if (r11 == 0) goto L_0x0443
            int r6 = m32639L(r1, r6)
            r2.mo16771J(r13, r6)
            goto L_0x0443
        L_0x0474:
            boolean r11 = r0.mo27681C(r1, r13, r8)
            if (r11 == 0) goto L_0x0443
            long r6 = m32641V(r1, r6)
            r2.mo16781j(r13, r6)
            goto L_0x0443
        L_0x0482:
            boolean r11 = r0.mo27681C(r1, r13, r8)
            if (r11 == 0) goto L_0x0443
            int r6 = m32639L(r1, r6)
            r2.mo16783l(r13, r6)
            goto L_0x0443
        L_0x0490:
            boolean r11 = r0.mo27681C(r1, r13, r8)
            if (r11 == 0) goto L_0x0443
            int r6 = m32639L(r1, r6)
            r2.mo16773b(r13, r6)
            goto L_0x0443
        L_0x049e:
            boolean r11 = r0.mo27681C(r1, r13, r8)
            if (r11 == 0) goto L_0x0443
            int r6 = m32639L(r1, r6)
            r2.mo16778g(r13, r6)
            goto L_0x0443
        L_0x04ac:
            boolean r11 = r0.mo27681C(r1, r13, r8)
            if (r11 == 0) goto L_0x0443
            java.lang.Object r6 = r4.getObject(r1, r6)
            com.onedelhi.secure.on6 r6 = (com.onedelhi.secure.on6) r6
            r2.mo16766E(r13, r6)
            goto L_0x0443
        L_0x04bc:
            boolean r11 = r0.mo27681C(r1, r13, r8)
            if (r11 == 0) goto L_0x0443
            java.lang.Object r6 = r4.getObject(r1, r6)
            com.onedelhi.secure.gt6 r7 = r0.mo27693k(r8)
            r2.mo16763B(r13, r6, r7)
            goto L_0x0443
        L_0x04cf:
            boolean r11 = r0.mo27681C(r1, r13, r8)
            if (r11 == 0) goto L_0x0443
            java.lang.Object r6 = r4.getObject(r1, r6)
            m32634E(r13, r6, r2)
            goto L_0x0443
        L_0x04de:
            boolean r11 = r0.mo27681C(r1, r13, r8)
            if (r11 == 0) goto L_0x0443
            boolean r6 = m32633D(r1, r6)
            r2.mo16796y(r13, r6)
            goto L_0x0443
        L_0x04ed:
            boolean r11 = r0.mo27681C(r1, r13, r8)
            if (r11 == 0) goto L_0x0443
            int r6 = m32639L(r1, r6)
            r2.mo16764C(r13, r6)
            goto L_0x0443
        L_0x04fc:
            boolean r11 = r0.mo27681C(r1, r13, r8)
            if (r11 == 0) goto L_0x0443
            long r6 = m32641V(r1, r6)
            r2.mo16794w(r13, r6)
            goto L_0x0443
        L_0x050b:
            boolean r11 = r0.mo27681C(r1, r13, r8)
            if (r11 == 0) goto L_0x0443
            int r6 = m32639L(r1, r6)
            r2.mo16782k(r13, r6)
            goto L_0x0443
        L_0x051a:
            boolean r11 = r0.mo27681C(r1, r13, r8)
            if (r11 == 0) goto L_0x0443
            long r6 = m32641V(r1, r6)
            r2.mo16790s(r13, r6)
            goto L_0x0443
        L_0x0529:
            boolean r11 = r0.mo27681C(r1, r13, r8)
            if (r11 == 0) goto L_0x0443
            long r6 = m32641V(r1, r6)
            r2.mo16792u(r13, r6)
            goto L_0x0443
        L_0x0538:
            boolean r11 = r0.mo27681C(r1, r13, r8)
            if (r11 == 0) goto L_0x0443
            float r6 = m32638J(r1, r6)
            r2.mo16769H(r13, r6)
            goto L_0x0443
        L_0x0547:
            boolean r11 = r0.mo27681C(r1, r13, r8)
            if (r11 == 0) goto L_0x0443
            double r6 = m32637I(r1, r6)
            r2.mo16774c(r13, r6)
            goto L_0x0443
        L_0x0556:
            java.lang.Object r6 = r4.getObject(r1, r6)
            r0.mo27703w(r2, r13, r6, r8)
            goto L_0x0443
        L_0x055f:
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.gt6 r7 = r0.mo27693k(r8)
            com.onedelhi.secure.it6.m17870l(r11, r6, r2, r7)
            goto L_0x0443
        L_0x0572:
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17877s(r11, r6, r2, r5)
            goto L_0x0443
        L_0x0581:
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17876r(r11, r6, r2, r5)
            goto L_0x0443
        L_0x0590:
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17875q(r11, r6, r2, r5)
            goto L_0x0443
        L_0x059f:
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17874p(r11, r6, r2, r5)
            goto L_0x0443
        L_0x05ae:
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17866h(r11, r6, r2, r5)
            goto L_0x0443
        L_0x05bd:
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17879u(r11, r6, r2, r5)
            goto L_0x0443
        L_0x05cc:
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17863e(r11, r6, r2, r5)
            goto L_0x0443
        L_0x05db:
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17867i(r11, r6, r2, r5)
            goto L_0x0443
        L_0x05ea:
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17868j(r11, r6, r2, r5)
            goto L_0x0443
        L_0x05f9:
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17871m(r11, r6, r2, r5)
            goto L_0x0443
        L_0x0608:
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17880v(r11, r6, r2, r5)
            goto L_0x0443
        L_0x0617:
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17872n(r11, r6, r2, r5)
            goto L_0x0443
        L_0x0626:
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17869k(r11, r6, r2, r5)
            goto L_0x0443
        L_0x0635:
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17865g(r11, r6, r2, r5)
            goto L_0x0443
        L_0x0644:
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r12 = 0
            com.onedelhi.secure.it6.m17877s(r11, r6, r2, r12)
            goto L_0x0443
        L_0x0654:
            r12 = 0
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17876r(r11, r6, r2, r12)
            goto L_0x0443
        L_0x0664:
            r12 = 0
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17875q(r11, r6, r2, r12)
            goto L_0x0443
        L_0x0674:
            r12 = 0
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17874p(r11, r6, r2, r12)
            goto L_0x0443
        L_0x0684:
            r12 = 0
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17866h(r11, r6, r2, r12)
            goto L_0x0443
        L_0x0694:
            r12 = 0
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17879u(r11, r6, r2, r12)
            goto L_0x0443
        L_0x06a4:
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17864f(r11, r6, r2)
            goto L_0x0443
        L_0x06b3:
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.gt6 r7 = r0.mo27693k(r8)
            com.onedelhi.secure.it6.m17873o(r11, r6, r2, r7)
            goto L_0x0443
        L_0x06c6:
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17878t(r11, r6, r2)
            goto L_0x0443
        L_0x06d5:
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            r14 = 0
            com.onedelhi.secure.it6.m17863e(r11, r6, r2, r14)
            goto L_0x0852
        L_0x06e5:
            r14 = 0
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17867i(r11, r6, r2, r14)
            goto L_0x0852
        L_0x06f5:
            r14 = 0
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17868j(r11, r6, r2, r14)
            goto L_0x0852
        L_0x0705:
            r14 = 0
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17871m(r11, r6, r2, r14)
            goto L_0x0852
        L_0x0715:
            r14 = 0
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17880v(r11, r6, r2, r14)
            goto L_0x0852
        L_0x0725:
            r14 = 0
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17872n(r11, r6, r2, r14)
            goto L_0x0852
        L_0x0735:
            r14 = 0
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17869k(r11, r6, r2, r14)
            goto L_0x0852
        L_0x0745:
            r14 = 0
            int[] r11 = r0.f23328a
            r11 = r11[r8]
            java.lang.Object r6 = r4.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            com.onedelhi.secure.it6.m17865g(r11, r6, r2, r14)
            goto L_0x0852
        L_0x0755:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0852
            java.lang.Object r6 = r4.getObject(r1, r6)
            com.onedelhi.secure.gt6 r7 = r0.mo27693k(r8)
            r2.mo16793v(r13, r6, r7)
            goto L_0x0852
        L_0x0767:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0852
            long r6 = r4.getLong(r1, r6)
            r2.mo16785n(r13, r6)
            goto L_0x0852
        L_0x0775:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0852
            int r6 = r4.getInt(r1, r6)
            r2.mo16771J(r13, r6)
            goto L_0x0852
        L_0x0783:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0852
            long r6 = r4.getLong(r1, r6)
            r2.mo16781j(r13, r6)
            goto L_0x0852
        L_0x0791:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0852
            int r6 = r4.getInt(r1, r6)
            r2.mo16783l(r13, r6)
            goto L_0x0852
        L_0x079f:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0852
            int r6 = r4.getInt(r1, r6)
            r2.mo16773b(r13, r6)
            goto L_0x0852
        L_0x07ad:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0852
            int r6 = r4.getInt(r1, r6)
            r2.mo16778g(r13, r6)
            goto L_0x0852
        L_0x07bb:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0852
            java.lang.Object r6 = r4.getObject(r1, r6)
            com.onedelhi.secure.on6 r6 = (com.onedelhi.secure.on6) r6
            r2.mo16766E(r13, r6)
            goto L_0x0852
        L_0x07cb:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0852
            java.lang.Object r6 = r4.getObject(r1, r6)
            com.onedelhi.secure.gt6 r7 = r0.mo27693k(r8)
            r2.mo16763B(r13, r6, r7)
            goto L_0x0852
        L_0x07dd:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0852
            java.lang.Object r6 = r4.getObject(r1, r6)
            m32634E(r13, r6, r2)
            goto L_0x0852
        L_0x07eb:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0852
            boolean r6 = com.onedelhi.secure.zu6.m33450B(r1, r6)
            r2.mo16796y(r13, r6)
            goto L_0x0852
        L_0x07f8:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0852
            int r6 = r4.getInt(r1, r6)
            r2.mo16764C(r13, r6)
            goto L_0x0852
        L_0x0805:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0852
            long r6 = r4.getLong(r1, r6)
            r2.mo16794w(r13, r6)
            goto L_0x0852
        L_0x0812:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0852
            int r6 = r4.getInt(r1, r6)
            r2.mo16782k(r13, r6)
            goto L_0x0852
        L_0x081f:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0852
            long r6 = r4.getLong(r1, r6)
            r2.mo16790s(r13, r6)
            goto L_0x0852
        L_0x082c:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0852
            long r6 = r4.getLong(r1, r6)
            r2.mo16792u(r13, r6)
            goto L_0x0852
        L_0x0839:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0852
            float r6 = com.onedelhi.secure.zu6.m33460g(r1, r6)
            r2.mo16769H(r13, r6)
            goto L_0x0852
        L_0x0846:
            r14 = 0
            r11 = r10 & r12
            if (r11 == 0) goto L_0x0852
            double r6 = com.onedelhi.secure.zu6.m33459f(r1, r6)
            r2.mo16774c(r13, r6)
        L_0x0852:
            int r8 = r8 + 3
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0418
        L_0x085a:
            com.onedelhi.secure.qo6 r2 = r0.f23323a
            r2.mo23275a(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ys6.mo16912f(java.lang.Object, com.onedelhi.secure.yv6):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        com.onedelhi.secure.zu6.m33477x(r7, r4, com.onedelhi.secure.zu6.m33464k(r8, r4));
        mo27700t(r7, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0098, code lost:
        com.onedelhi.secure.zu6.m33477x(r7, r4, com.onedelhi.secure.zu6.m33464k(r8, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c2, code lost:
        com.onedelhi.secure.zu6.m33475v(r7, r4, com.onedelhi.secure.zu6.m33461h(r8, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d7, code lost:
        com.onedelhi.secure.zu6.m33476w(r7, r4, com.onedelhi.secure.zu6.m33462i(r8, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fa, code lost:
        mo27699s(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fd, code lost:
        r0 = r0 + 3;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16913g(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            m32643p(r7)
            java.util.Objects.requireNonNull(r8)
            r0 = 0
        L_0x0007:
            int[] r1 = r6.f23328a
            int r1 = r1.length
            if (r0 >= r1) goto L_0x0101
            int r1 = r6.mo27691U(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            int[] r3 = r6.f23328a
            r3 = r3[r0]
            int r1 = m32640T(r1)
            long r4 = (long) r2
            switch(r1) {
                case 0: goto L_0x00ed;
                case 1: goto L_0x00df;
                case 2: goto L_0x00d1;
                case 3: goto L_0x00ca;
                case 4: goto L_0x00bc;
                case 5: goto L_0x00b5;
                case 6: goto L_0x00ae;
                case 7: goto L_0x00a0;
                case 8: goto L_0x0092;
                case 9: goto L_0x008d;
                case 10: goto L_0x0086;
                case 11: goto L_0x007f;
                case 12: goto L_0x0078;
                case 13: goto L_0x0071;
                case 14: goto L_0x0069;
                case 15: goto L_0x0062;
                case 16: goto L_0x005a;
                case 17: goto L_0x008d;
                case 18: goto L_0x0053;
                case 19: goto L_0x0053;
                case 20: goto L_0x0053;
                case 21: goto L_0x0053;
                case 22: goto L_0x0053;
                case 23: goto L_0x0053;
                case 24: goto L_0x0053;
                case 25: goto L_0x0053;
                case 26: goto L_0x0053;
                case 27: goto L_0x0053;
                case 28: goto L_0x0053;
                case 29: goto L_0x0053;
                case 30: goto L_0x0053;
                case 31: goto L_0x0053;
                case 32: goto L_0x0053;
                case 33: goto L_0x0053;
                case 34: goto L_0x0053;
                case 35: goto L_0x0053;
                case 36: goto L_0x0053;
                case 37: goto L_0x0053;
                case 38: goto L_0x0053;
                case 39: goto L_0x0053;
                case 40: goto L_0x0053;
                case 41: goto L_0x0053;
                case 42: goto L_0x0053;
                case 43: goto L_0x0053;
                case 44: goto L_0x0053;
                case 45: goto L_0x0053;
                case 46: goto L_0x0053;
                case 47: goto L_0x0053;
                case 48: goto L_0x0053;
                case 49: goto L_0x0053;
                case 50: goto L_0x0040;
                case 51: goto L_0x002e;
                case 52: goto L_0x002e;
                case 53: goto L_0x002e;
                case 54: goto L_0x002e;
                case 55: goto L_0x002e;
                case 56: goto L_0x002e;
                case 57: goto L_0x002e;
                case 58: goto L_0x002e;
                case 59: goto L_0x002e;
                case 60: goto L_0x0029;
                case 61: goto L_0x0022;
                case 62: goto L_0x0022;
                case 63: goto L_0x0022;
                case 64: goto L_0x0022;
                case 65: goto L_0x0022;
                case 66: goto L_0x0022;
                case 67: goto L_0x0022;
                case 68: goto L_0x0029;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x00fd
        L_0x0022:
            boolean r1 = r6.mo27681C(r8, r3, r0)
            if (r1 == 0) goto L_0x00fd
            goto L_0x0034
        L_0x0029:
            r6.mo27698r(r7, r8, r0)
            goto L_0x00fd
        L_0x002e:
            boolean r1 = r6.mo27681C(r8, r3, r0)
            if (r1 == 0) goto L_0x00fd
        L_0x0034:
            java.lang.Object r1 = com.onedelhi.secure.zu6.m33464k(r8, r4)
            com.onedelhi.secure.zu6.m33477x(r7, r4, r1)
            r6.mo27700t(r7, r3, r0)
            goto L_0x00fd
        L_0x0040:
            int r1 = com.onedelhi.secure.it6.f13838a
            java.lang.Object r1 = com.onedelhi.secure.zu6.m33464k(r7, r4)
            java.lang.Object r2 = com.onedelhi.secure.zu6.m33464k(r8, r4)
            java.lang.Object r1 = com.onedelhi.secure.qs6.m26154b(r1, r2)
            com.onedelhi.secure.zu6.m33477x(r7, r4, r1)
            goto L_0x00fd
        L_0x0053:
            com.onedelhi.secure.qr6 r1 = r6.f23324a
            r1.mo20590b(r7, r8, r4)
            goto L_0x00fd
        L_0x005a:
            boolean r1 = r6.mo27705y(r8, r0)
            if (r1 == 0) goto L_0x00fd
            goto L_0x00d7
        L_0x0062:
            boolean r1 = r6.mo27705y(r8, r0)
            if (r1 == 0) goto L_0x00fd
            goto L_0x007e
        L_0x0069:
            boolean r1 = r6.mo27705y(r8, r0)
            if (r1 == 0) goto L_0x00fd
            goto L_0x00d7
        L_0x0071:
            boolean r1 = r6.mo27705y(r8, r0)
            if (r1 == 0) goto L_0x00fd
            goto L_0x007e
        L_0x0078:
            boolean r1 = r6.mo27705y(r8, r0)
            if (r1 == 0) goto L_0x00fd
        L_0x007e:
            goto L_0x00c2
        L_0x007f:
            boolean r1 = r6.mo27705y(r8, r0)
            if (r1 == 0) goto L_0x00fd
            goto L_0x00c2
        L_0x0086:
            boolean r1 = r6.mo27705y(r8, r0)
            if (r1 == 0) goto L_0x00fd
            goto L_0x0098
        L_0x008d:
            r6.mo27697q(r7, r8, r0)
            goto L_0x00fd
        L_0x0092:
            boolean r1 = r6.mo27705y(r8, r0)
            if (r1 == 0) goto L_0x00fd
        L_0x0098:
            java.lang.Object r1 = com.onedelhi.secure.zu6.m33464k(r8, r4)
            com.onedelhi.secure.zu6.m33477x(r7, r4, r1)
            goto L_0x00fa
        L_0x00a0:
            boolean r1 = r6.mo27705y(r8, r0)
            if (r1 == 0) goto L_0x00fd
            boolean r1 = com.onedelhi.secure.zu6.m33450B(r8, r4)
            com.onedelhi.secure.zu6.m33471r(r7, r4, r1)
            goto L_0x00fa
        L_0x00ae:
            boolean r1 = r6.mo27705y(r8, r0)
            if (r1 == 0) goto L_0x00fd
            goto L_0x00c2
        L_0x00b5:
            boolean r1 = r6.mo27705y(r8, r0)
            if (r1 == 0) goto L_0x00fd
            goto L_0x00d7
        L_0x00bc:
            boolean r1 = r6.mo27705y(r8, r0)
            if (r1 == 0) goto L_0x00fd
        L_0x00c2:
            int r1 = com.onedelhi.secure.zu6.m33461h(r8, r4)
            com.onedelhi.secure.zu6.m33475v(r7, r4, r1)
            goto L_0x00fa
        L_0x00ca:
            boolean r1 = r6.mo27705y(r8, r0)
            if (r1 == 0) goto L_0x00fd
            goto L_0x00d7
        L_0x00d1:
            boolean r1 = r6.mo27705y(r8, r0)
            if (r1 == 0) goto L_0x00fd
        L_0x00d7:
            long r1 = com.onedelhi.secure.zu6.m33462i(r8, r4)
            com.onedelhi.secure.zu6.m33476w(r7, r4, r1)
            goto L_0x00fa
        L_0x00df:
            boolean r1 = r6.mo27705y(r8, r0)
            if (r1 == 0) goto L_0x00fd
            float r1 = com.onedelhi.secure.zu6.m33460g(r8, r4)
            com.onedelhi.secure.zu6.m33474u(r7, r4, r1)
            goto L_0x00fa
        L_0x00ed:
            boolean r1 = r6.mo27705y(r8, r0)
            if (r1 == 0) goto L_0x00fd
            double r1 = com.onedelhi.secure.zu6.m33459f(r8, r4)
            com.onedelhi.secure.zu6.m33473t(r7, r4, r1)
        L_0x00fa:
            r6.mo27699s(r7, r0)
        L_0x00fd:
            int r0 = r0 + 3
            goto L_0x0007
        L_0x0101:
            com.onedelhi.secure.pu6 r0 = r6.f23322a
            com.onedelhi.secure.it6.m17861c(r0, r7, r8)
            boolean r7 = r6.f23327a
            if (r7 != 0) goto L_0x010b
            return
        L_0x010b:
            com.onedelhi.secure.qo6 r7 = r6.f23323a
            r7.mo23275a(r8)
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ys6.mo16913g(java.lang.Object, java.lang.Object):void");
    }

    /* renamed from: h */
    public final Object mo16914h() {
        return ((jq6) this.f23326a).mo18544m();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        r3 = com.onedelhi.secure.zu6.m33464k(r10, r5);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0094, code lost:
        r2 = r2 * 53;
        r3 = m32639L(r10, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a9, code lost:
        r2 = r2 * 53;
        r3 = m32641V(r10, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cf, code lost:
        if (r3 != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d2, code lost:
        r2 = r2 * 53;
        r3 = com.onedelhi.secure.zu6.m33464k(r10, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d8, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e1, code lost:
        if (r3 != null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e3, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e7, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00eb, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) com.onedelhi.secure.zu6.m33464k(r10, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fe, code lost:
        r3 = com.onedelhi.secure.zq6.m33322a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0117, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011b, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0123, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0127, code lost:
        r5 = com.onedelhi.secure.zq6.f23858a;
        r2 = r2 + ((int) (r3 ^ (r3 >>> 32)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012e, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16915i(java.lang.Object r10) {
        /*
            r9 = this;
            int[] r0 = r9.f23328a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x0132
            int r3 = r9.mo27691U(r1)
            int[] r4 = r9.f23328a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            int r3 = m32640T(r3)
            long r5 = (long) r5
            r7 = 37
            r8 = 32
            switch(r3) {
                case 0: goto L_0x011d;
                case 1: goto L_0x0111;
                case 2: goto L_0x010a;
                case 3: goto L_0x010a;
                case 4: goto L_0x0103;
                case 5: goto L_0x010a;
                case 6: goto L_0x0103;
                case 7: goto L_0x00f8;
                case 8: goto L_0x00eb;
                case 9: goto L_0x00dd;
                case 10: goto L_0x00d2;
                case 11: goto L_0x0103;
                case 12: goto L_0x0103;
                case 13: goto L_0x0103;
                case 14: goto L_0x010a;
                case 15: goto L_0x0103;
                case 16: goto L_0x010a;
                case 17: goto L_0x00cb;
                case 18: goto L_0x00d2;
                case 19: goto L_0x00d2;
                case 20: goto L_0x00d2;
                case 21: goto L_0x00d2;
                case 22: goto L_0x00d2;
                case 23: goto L_0x00d2;
                case 24: goto L_0x00d2;
                case 25: goto L_0x00d2;
                case 26: goto L_0x00d2;
                case 27: goto L_0x00d2;
                case 28: goto L_0x00d2;
                case 29: goto L_0x00d2;
                case 30: goto L_0x00d2;
                case 31: goto L_0x00d2;
                case 32: goto L_0x00d2;
                case 33: goto L_0x00d2;
                case 34: goto L_0x00d2;
                case 35: goto L_0x00d2;
                case 36: goto L_0x00d2;
                case 37: goto L_0x00d2;
                case 38: goto L_0x00d2;
                case 39: goto L_0x00d2;
                case 40: goto L_0x00d2;
                case 41: goto L_0x00d2;
                case 42: goto L_0x00d2;
                case 43: goto L_0x00d2;
                case 44: goto L_0x00d2;
                case 45: goto L_0x00d2;
                case 46: goto L_0x00d2;
                case 47: goto L_0x00d2;
                case 48: goto L_0x00d2;
                case 49: goto L_0x00d2;
                case 50: goto L_0x00d2;
                case 51: goto L_0x00be;
                case 52: goto L_0x00b1;
                case 53: goto L_0x00a3;
                case 54: goto L_0x009c;
                case 55: goto L_0x008e;
                case 56: goto L_0x0087;
                case 57: goto L_0x0080;
                case 58: goto L_0x0072;
                case 59: goto L_0x006a;
                case 60: goto L_0x005c;
                case 61: goto L_0x0054;
                case 62: goto L_0x004d;
                case 63: goto L_0x0046;
                case 64: goto L_0x003f;
                case 65: goto L_0x0037;
                case 66: goto L_0x0030;
                case 67: goto L_0x0028;
                case 68: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x012e
        L_0x0021:
            boolean r3 = r9.mo27681C(r10, r4, r1)
            if (r3 == 0) goto L_0x012e
            goto L_0x0062
        L_0x0028:
            boolean r3 = r9.mo27681C(r10, r4, r1)
            if (r3 == 0) goto L_0x012e
            goto L_0x00a9
        L_0x0030:
            boolean r3 = r9.mo27681C(r10, r4, r1)
            if (r3 == 0) goto L_0x012e
            goto L_0x004c
        L_0x0037:
            boolean r3 = r9.mo27681C(r10, r4, r1)
            if (r3 == 0) goto L_0x012e
            goto L_0x00a9
        L_0x003f:
            boolean r3 = r9.mo27681C(r10, r4, r1)
            if (r3 == 0) goto L_0x012e
            goto L_0x004c
        L_0x0046:
            boolean r3 = r9.mo27681C(r10, r4, r1)
            if (r3 == 0) goto L_0x012e
        L_0x004c:
            goto L_0x0094
        L_0x004d:
            boolean r3 = r9.mo27681C(r10, r4, r1)
            if (r3 == 0) goto L_0x012e
            goto L_0x0094
        L_0x0054:
            boolean r3 = r9.mo27681C(r10, r4, r1)
            if (r3 == 0) goto L_0x012e
            goto L_0x00d2
        L_0x005c:
            boolean r3 = r9.mo27681C(r10, r4, r1)
            if (r3 == 0) goto L_0x012e
        L_0x0062:
            java.lang.Object r3 = com.onedelhi.secure.zu6.m33464k(r10, r5)
            int r2 = r2 * 53
            goto L_0x00d8
        L_0x006a:
            boolean r3 = r9.mo27681C(r10, r4, r1)
            if (r3 == 0) goto L_0x012e
            goto L_0x00eb
        L_0x0072:
            boolean r3 = r9.mo27681C(r10, r4, r1)
            if (r3 == 0) goto L_0x012e
            int r2 = r2 * 53
            boolean r3 = m32633D(r10, r5)
            goto L_0x00fe
        L_0x0080:
            boolean r3 = r9.mo27681C(r10, r4, r1)
            if (r3 == 0) goto L_0x012e
            goto L_0x0094
        L_0x0087:
            boolean r3 = r9.mo27681C(r10, r4, r1)
            if (r3 == 0) goto L_0x012e
            goto L_0x00a9
        L_0x008e:
            boolean r3 = r9.mo27681C(r10, r4, r1)
            if (r3 == 0) goto L_0x012e
        L_0x0094:
            int r2 = r2 * 53
            int r3 = m32639L(r10, r5)
            goto L_0x011b
        L_0x009c:
            boolean r3 = r9.mo27681C(r10, r4, r1)
            if (r3 == 0) goto L_0x012e
            goto L_0x00a9
        L_0x00a3:
            boolean r3 = r9.mo27681C(r10, r4, r1)
            if (r3 == 0) goto L_0x012e
        L_0x00a9:
            int r2 = r2 * 53
            long r3 = m32641V(r10, r5)
            goto L_0x0127
        L_0x00b1:
            boolean r3 = r9.mo27681C(r10, r4, r1)
            if (r3 == 0) goto L_0x012e
            int r2 = r2 * 53
            float r3 = m32638J(r10, r5)
            goto L_0x0117
        L_0x00be:
            boolean r3 = r9.mo27681C(r10, r4, r1)
            if (r3 == 0) goto L_0x012e
            int r2 = r2 * 53
            double r3 = m32637I(r10, r5)
            goto L_0x0123
        L_0x00cb:
            java.lang.Object r3 = com.onedelhi.secure.zu6.m33464k(r10, r5)
            if (r3 == 0) goto L_0x00e7
            goto L_0x00e3
        L_0x00d2:
            int r2 = r2 * 53
            java.lang.Object r3 = com.onedelhi.secure.zu6.m33464k(r10, r5)
        L_0x00d8:
            int r3 = r3.hashCode()
            goto L_0x011b
        L_0x00dd:
            java.lang.Object r3 = com.onedelhi.secure.zu6.m33464k(r10, r5)
            if (r3 == 0) goto L_0x00e7
        L_0x00e3:
            int r7 = r3.hashCode()
        L_0x00e7:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x012e
        L_0x00eb:
            int r2 = r2 * 53
            java.lang.Object r3 = com.onedelhi.secure.zu6.m33464k(r10, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x011b
        L_0x00f8:
            int r2 = r2 * 53
            boolean r3 = com.onedelhi.secure.zu6.m33450B(r10, r5)
        L_0x00fe:
            int r3 = com.onedelhi.secure.zq6.m33322a(r3)
            goto L_0x011b
        L_0x0103:
            int r2 = r2 * 53
            int r3 = com.onedelhi.secure.zu6.m33461h(r10, r5)
            goto L_0x011b
        L_0x010a:
            int r2 = r2 * 53
            long r3 = com.onedelhi.secure.zu6.m33462i(r10, r5)
            goto L_0x0127
        L_0x0111:
            int r2 = r2 * 53
            float r3 = com.onedelhi.secure.zu6.m33460g(r10, r5)
        L_0x0117:
            int r3 = java.lang.Float.floatToIntBits(r3)
        L_0x011b:
            int r2 = r2 + r3
            goto L_0x012e
        L_0x011d:
            int r2 = r2 * 53
            double r3 = com.onedelhi.secure.zu6.m33459f(r10, r5)
        L_0x0123:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x0127:
            byte[] r5 = com.onedelhi.secure.zq6.f23858a
            long r5 = r3 >>> r8
            long r3 = r3 ^ r5
            int r4 = (int) r3
            int r2 = r2 + r4
        L_0x012e:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0132:
            int r2 = r2 * 53
            com.onedelhi.secure.pu6 r0 = r9.f23322a
            java.lang.Object r0 = r0.mo22656d(r10)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r9.f23327a
            if (r0 != 0) goto L_0x0144
            return r2
        L_0x0144:
            com.onedelhi.secure.qo6 r0 = r9.f23323a
            r0.mo23275a(r10)
            r10 = 0
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ys6.mo16915i(java.lang.Object):int");
    }

    /* renamed from: j */
    public final rq6 mo27692j(int i) {
        int i2 = i / 3;
        return (rq6) this.f23329a[i2 + i2 + 1];
    }

    /* renamed from: k */
    public final gt6 mo27693k(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        gt6 gt6 = (gt6) this.f23329a[i3];
        if (gt6 != null) {
            return gt6;
        }
        gt6 b = dt6.m13329a().mo14854b((Class) this.f23329a[i3 + 1]);
        this.f23329a[i3] = b;
        return b;
    }

    /* renamed from: l */
    public final Object mo27694l(int i) {
        int i2 = i / 3;
        return this.f23329a[i2 + i2];
    }

    /* renamed from: m */
    public final Object mo27695m(Object obj, int i) {
        gt6 k = mo27693k(i);
        int U = mo27691U(i) & 1048575;
        if (!mo27705y(obj, i)) {
            return k.mo16914h();
        }
        Object object = f23318a.getObject(obj, (long) U);
        if (m32632B(object)) {
            return object;
        }
        Object h = k.mo16914h();
        if (object != null) {
            k.mo16913g(h, object);
        }
        return h;
    }

    /* renamed from: n */
    public final Object mo27696n(Object obj, int i, int i2) {
        gt6 k = mo27693k(i2);
        if (!mo27681C(obj, i, i2)) {
            return k.mo16914h();
        }
        Object object = f23318a.getObject(obj, (long) (mo27691U(i2) & 1048575));
        if (m32632B(object)) {
            return object;
        }
        Object h = k.mo16914h();
        if (object != null) {
            k.mo16913g(h, object);
        }
        return h;
    }

    /* renamed from: q */
    public final void mo27697q(Object obj, Object obj2, int i) {
        if (mo27705y(obj2, i)) {
            Unsafe unsafe = f23318a;
            long U = (long) (mo27691U(i) & 1048575);
            Object object = unsafe.getObject(obj2, U);
            if (object != null) {
                gt6 k = mo27693k(i);
                if (!mo27705y(obj, i)) {
                    if (!m32632B(object)) {
                        unsafe.putObject(obj, U, object);
                    } else {
                        Object h = k.mo16914h();
                        k.mo16913g(h, object);
                        unsafe.putObject(obj, U, h);
                    }
                    mo27699s(obj, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, U);
                if (!m32632B(object2)) {
                    Object h2 = k.mo16914h();
                    k.mo16913g(h2, object2);
                    unsafe.putObject(obj, U, h2);
                    object2 = h2;
                }
                k.mo16913g(object2, object);
                return;
            }
            int i2 = this.f23328a[i];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i2 + " is present but null: " + obj3);
        }
    }

    /* renamed from: r */
    public final void mo27698r(Object obj, Object obj2, int i) {
        int i2 = this.f23328a[i];
        if (mo27681C(obj2, i2, i)) {
            Unsafe unsafe = f23318a;
            long U = (long) (mo27691U(i) & 1048575);
            Object object = unsafe.getObject(obj2, U);
            if (object != null) {
                gt6 k = mo27693k(i);
                if (!mo27681C(obj, i2, i)) {
                    if (!m32632B(object)) {
                        unsafe.putObject(obj, U, object);
                    } else {
                        Object h = k.mo16914h();
                        k.mo16913g(h, object);
                        unsafe.putObject(obj, U, h);
                    }
                    mo27700t(obj, i2, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, U);
                if (!m32632B(object2)) {
                    Object h2 = k.mo16914h();
                    k.mo16913g(h2, object2);
                    unsafe.putObject(obj, U, h2);
                    object2 = h2;
                }
                k.mo16913g(object2, object);
                return;
            }
            int i3 = this.f23328a[i];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i3 + " is present but null: " + obj3);
        }
    }

    /* renamed from: s */
    public final void mo27699s(Object obj, int i) {
        int R = mo27689R(i);
        long j = (long) (1048575 & R);
        if (j != 1048575) {
            zu6.m33475v(obj, j, (1 << (R >>> 20)) | zu6.m33461h(obj, j));
        }
    }

    /* renamed from: t */
    public final void mo27700t(Object obj, int i, int i2) {
        zu6.m33475v(obj, (long) (mo27689R(i2) & 1048575), i);
    }

    /* renamed from: u */
    public final void mo27701u(Object obj, int i, Object obj2) {
        f23318a.putObject(obj, (long) (mo27691U(i) & 1048575), obj2);
        mo27699s(obj, i);
    }

    /* renamed from: v */
    public final void mo27702v(Object obj, int i, int i2, Object obj2) {
        f23318a.putObject(obj, (long) (mo27691U(i2) & 1048575), obj2);
        mo27700t(obj, i, i2);
    }

    /* renamed from: w */
    public final void mo27703w(yv6 yv6, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            os6 os6 = (os6) mo27694l(i2);
            throw null;
        }
    }

    /* renamed from: x */
    public final boolean mo27704x(Object obj, Object obj2, int i) {
        return mo27705y(obj, i) == mo27705y(obj2, i);
    }

    /* renamed from: y */
    public final boolean mo27705y(Object obj, int i) {
        int R = mo27689R(i);
        long j = (long) (R & 1048575);
        if (j == 1048575) {
            int U = mo27691U(i);
            long j2 = (long) (U & 1048575);
            switch (m32640T(U)) {
                case 0:
                    return Double.doubleToRawLongBits(zu6.m33459f(obj, j2)) != 0;
                case 1:
                    return Float.floatToRawIntBits(zu6.m33460g(obj, j2)) != 0;
                case 2:
                    return zu6.m33462i(obj, j2) != 0;
                case 3:
                    return zu6.m33462i(obj, j2) != 0;
                case 4:
                    return zu6.m33461h(obj, j2) != 0;
                case 5:
                    return zu6.m33462i(obj, j2) != 0;
                case 6:
                    return zu6.m33461h(obj, j2) != 0;
                case 7:
                    return zu6.m33450B(obj, j2);
                case 8:
                    Object k = zu6.m33464k(obj, j2);
                    if (k instanceof String) {
                        return !((String) k).isEmpty();
                    }
                    if (k instanceof on6) {
                        return !on6.f18031a.equals(k);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return zu6.m33464k(obj, j2) != null;
                case 10:
                    return !on6.f18031a.equals(zu6.m33464k(obj, j2));
                case 11:
                    return zu6.m33461h(obj, j2) != 0;
                case 12:
                    return zu6.m33461h(obj, j2) != 0;
                case 13:
                    return zu6.m33461h(obj, j2) != 0;
                case 14:
                    return zu6.m33462i(obj, j2) != 0;
                case 15:
                    return zu6.m33461h(obj, j2) != 0;
                case 16:
                    return zu6.m33462i(obj, j2) != 0;
                case 17:
                    return zu6.m33464k(obj, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (zu6.m33461h(obj, j) & (1 << (R >>> 20))) != 0;
        }
    }

    /* renamed from: z */
    public final boolean mo27706z(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? mo27705y(obj, i) : (i3 & i4) != 0;
    }
}
