package com.onedelhi.secure;

import java.util.Arrays;
import java.util.Map;

public abstract class rv2 implements uf3 {
    /* renamed from: e */
    public static float m63922e(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = ((float) iArr2[i4]) * f3;
            float f7 = (float) i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    /* renamed from: f */
    public static void m63923f(C6014ll llVar, int i, int[] iArr) throws tr2 {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int l = llVar.mo39935l();
        if (i < l) {
            boolean z = !llVar.mo39930h(i);
            while (i < l) {
                if (llVar.mo39930h(i) == z) {
                    i2++;
                    if (i2 == length) {
                        break;
                    }
                    iArr[i2] = 1;
                    z = !z;
                } else {
                    iArr[i2] = iArr[i2] + 1;
                }
                i++;
            }
            if (i2 == length) {
                return;
            }
            if (i2 != length - 1 || i != l) {
                throw tr2.m66179a();
            }
            return;
        }
        throw tr2.m66179a();
    }

    /* renamed from: g */
    public static void m63924g(C6014ll llVar, int i, int[] iArr) throws tr2 {
        int length = iArr.length;
        boolean h = llVar.mo39930h(i);
        while (i > 0 && length >= 0) {
            i--;
            if (llVar.mo39930h(i) != h) {
                length--;
                h = !h;
            }
        }
        if (length < 0) {
            m63923f(llVar, i + 1, iArr);
            return;
        }
        throw tr2.m66179a();
    }

    /* renamed from: a */
    public ol3 mo34501a(C6969uk ukVar) throws tr2, ha1 {
        return mo34502b(ukVar, (Map<pf0, ?>) null);
    }

    /* renamed from: b */
    public ol3 mo34502b(C6969uk ukVar, Map<pf0, ?> map) throws tr2, ha1 {
        try {
            return mo44065d(ukVar, map);
        } catch (tr2 e) {
            if (!(map != null && map.containsKey(pf0.TRY_HARDER)) || !ukVar.mo45639g()) {
                throw e;
            }
            C6969uk h = ukVar.mo45640h();
            ol3 d = mo44065d(h, map);
            Map<ql3, Object> e2 = d.mo41827e();
            int i = C3527sn.f20441p;
            if (e2 != null) {
                ql3 ql3 = ql3.ORIENTATION;
                if (e2.containsKey(ql3)) {
                    i = (((Integer) e2.get(ql3)).intValue() + C3527sn.f20441p) % 360;
                }
            }
            d.mo41832j(ql3.ORIENTATION, Integer.valueOf(i));
            sl3[] f = d.mo41828f();
            if (f != null) {
                int d2 = h.mo45636d();
                for (int i2 = 0; i2 < f.length; i2++) {
                    f[i2] = new sl3((((float) d2) - f[i2].mo44404d()) - 1.0f, f[i2].mo44403c());
                }
            }
            return d;
        }
    }

    /* renamed from: c */
    public abstract ol3 mo31296c(int i, C6014ll llVar, Map<pf0, ?> map) throws tr2, C6619qx, ha1;

    /* JADX WARNING: Removed duplicated region for block: B:40:0x007d A[Catch:{ wf3 -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c5 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.ol3 mo44065d(com.onedelhi.secure.C6969uk r22, java.util.Map<com.onedelhi.secure.pf0, ?> r23) throws com.onedelhi.secure.tr2 {
        /*
            r21 = this;
            r0 = r23
            int r1 = r22.mo45637e()
            int r2 = r22.mo45636d()
            com.onedelhi.secure.ll r3 = new com.onedelhi.secure.ll
            r3.<init>(r1)
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x001d
            com.onedelhi.secure.pf0 r6 = com.onedelhi.secure.pf0.TRY_HARDER
            boolean r6 = r0.containsKey(r6)
            if (r6 == 0) goto L_0x001d
            r6 = 1
            goto L_0x001e
        L_0x001d:
            r6 = 0
        L_0x001e:
            if (r6 == 0) goto L_0x0023
            r7 = 8
            goto L_0x0024
        L_0x0023:
            r7 = 5
        L_0x0024:
            int r7 = r2 >> r7
            int r7 = java.lang.Math.max(r5, r7)
            if (r6 == 0) goto L_0x002e
            r6 = r2
            goto L_0x0030
        L_0x002e:
            r6 = 15
        L_0x0030:
            int r8 = r2 / 2
            r9 = 0
        L_0x0033:
            if (r9 >= r6) goto L_0x00e1
            int r10 = r9 + 1
            int r11 = r10 / 2
            r9 = r9 & 1
            if (r9 != 0) goto L_0x003f
            r9 = 1
            goto L_0x0040
        L_0x003f:
            r9 = 0
        L_0x0040:
            if (r9 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            int r11 = -r11
        L_0x0044:
            int r11 = r11 * r7
            int r11 = r11 + r8
            if (r11 < 0) goto L_0x00e1
            if (r11 >= r2) goto L_0x00e1
            r9 = r22
            com.onedelhi.secure.ll r3 = r9.mo45635c(r11, r3)     // Catch:{ tr2 -> 0x00d5 }
            r12 = 0
        L_0x0052:
            r13 = 2
            if (r12 >= r13) goto L_0x00d5
            if (r12 != r5) goto L_0x0075
            r3.mo39938p()
            if (r0 == 0) goto L_0x0075
            com.onedelhi.secure.pf0 r13 = com.onedelhi.secure.pf0.NEED_RESULT_POINT_CALLBACK
            boolean r14 = r0.containsKey(r13)
            if (r14 == 0) goto L_0x0075
            java.util.EnumMap r14 = new java.util.EnumMap
            java.lang.Class<com.onedelhi.secure.pf0> r15 = com.onedelhi.secure.pf0.class
            r14.<init>(r15)
            r14.putAll(r0)
            r14.remove(r13)
            r13 = r21
            r0 = r14
            goto L_0x0077
        L_0x0075:
            r13 = r21
        L_0x0077:
            com.onedelhi.secure.ol3 r14 = r13.mo31296c(r11, r3, r0)     // Catch:{ wf3 -> 0x00c6 }
            if (r12 != r5) goto L_0x00c5
            com.onedelhi.secure.ql3 r15 = com.onedelhi.secure.ql3.ORIENTATION     // Catch:{ wf3 -> 0x00c6 }
            r16 = 180(0xb4, float:2.52E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)     // Catch:{ wf3 -> 0x00c6 }
            r14.mo41832j(r15, r5)     // Catch:{ wf3 -> 0x00c6 }
            com.onedelhi.secure.sl3[] r5 = r14.mo41828f()     // Catch:{ wf3 -> 0x00c6 }
            if (r5 == 0) goto L_0x00c5
            com.onedelhi.secure.sl3 r15 = new com.onedelhi.secure.sl3     // Catch:{ wf3 -> 0x00c6 }
            r16 = r0
            float r0 = (float) r1
            r18 = r5[r4]     // Catch:{ wf3 -> 0x00c8 }
            float r18 = r18.mo44403c()     // Catch:{ wf3 -> 0x00c8 }
            float r18 = r0 - r18
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = r1
            float r1 = r18 - r19
            r18 = r5[r4]     // Catch:{ wf3 -> 0x00ca }
            float r4 = r18.mo44404d()     // Catch:{ wf3 -> 0x00ca }
            r15.<init>(r1, r4)     // Catch:{ wf3 -> 0x00ca }
            r1 = 0
            r5[r1] = r15     // Catch:{ wf3 -> 0x00ca }
            com.onedelhi.secure.sl3 r4 = new com.onedelhi.secure.sl3     // Catch:{ wf3 -> 0x00ca }
            r15 = 1
            r17 = r5[r15]     // Catch:{ wf3 -> 0x00cb }
            float r17 = r17.mo44403c()     // Catch:{ wf3 -> 0x00cb }
            float r0 = r0 - r17
            float r0 = r0 - r19
            r17 = r5[r15]     // Catch:{ wf3 -> 0x00cb }
            float r1 = r17.mo44404d()     // Catch:{ wf3 -> 0x00cb }
            r4.<init>(r0, r1)     // Catch:{ wf3 -> 0x00cb }
            r5[r15] = r4     // Catch:{ wf3 -> 0x00cb }
        L_0x00c5:
            return r14
        L_0x00c6:
            r16 = r0
        L_0x00c8:
            r20 = r1
        L_0x00ca:
            r15 = 1
        L_0x00cb:
            int r12 = r12 + 1
            r0 = r16
            r1 = r20
            r4 = 0
            r5 = 1
            goto L_0x0052
        L_0x00d5:
            r13 = r21
            r20 = r1
            r15 = 1
            r9 = r10
            r1 = r20
            r4 = 0
            r5 = 1
            goto L_0x0033
        L_0x00e1:
            r13 = r21
            com.onedelhi.secure.tr2 r0 = com.onedelhi.secure.tr2.m66179a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.rv2.mo44065d(com.onedelhi.secure.uk, java.util.Map):com.onedelhi.secure.ol3");
    }

    public void reset() {
    }
}
