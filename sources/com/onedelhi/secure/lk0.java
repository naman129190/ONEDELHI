package com.onedelhi.secure;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class lk0 {

    /* renamed from: a */
    public static final float f31700a = 0.42f;

    /* renamed from: a */
    public static final int f31701a = 3;

    /* renamed from: a */
    public static final int[] f31702a = {0, 4, 1, 5};

    /* renamed from: b */
    public static final float f31703b = 0.8f;

    /* renamed from: b */
    public static final int f31704b = 5;

    /* renamed from: b */
    public static final int[] f31705b = {6, 2, 7, 3};

    /* renamed from: c */
    public static final int f31706c = 25;

    /* renamed from: c */
    public static final int[] f31707c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d */
    public static final int f31708d = 5;

    /* renamed from: d */
    public static final int[] f31709d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    /* renamed from: e */
    public static final int f31710e = 10;

    /* renamed from: a */
    public static void m55713a(sl3[] sl3Arr, sl3[] sl3Arr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            sl3Arr[iArr[i]] = sl3Arr2[i];
        }
    }

    /* renamed from: b */
    public static lx2 m55714b(C6969uk ukVar, Map<pf0, ?> map, boolean z) throws tr2 {
        C6190nl b = ukVar.mo45634b();
        List<sl3[]> c = m55715c(z, b);
        if (c.isEmpty()) {
            b = b.clone();
            b.mo41095o();
            c = m55715c(z, b);
        }
        return new lx2(b, c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r4.hasNext() == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r5 = (com.onedelhi.secure.sl3[]) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r5[1] == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r3 = (int) java.lang.Math.max((float) r3, r5[1].mo44404d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r5[3] == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        r3 = java.lang.Math.max(r3, (int) r5[3].mo44404d());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r5 == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r4 = r0.iterator();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.onedelhi.secure.sl3[]> m55715c(boolean r8, com.onedelhi.secure.C6190nl r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = 0
        L_0x0008:
            r4 = 0
            r5 = 0
        L_0x000a:
            int r6 = r9.mo41089h()
            if (r3 >= r6) goto L_0x0078
            com.onedelhi.secure.sl3[] r4 = m55718f(r9, r3, r4)
            r6 = r4[r2]
            if (r6 != 0) goto L_0x0052
            r6 = 3
            r7 = r4[r6]
            if (r7 != 0) goto L_0x0052
            if (r5 == 0) goto L_0x0078
            java.util.Iterator r4 = r0.iterator()
        L_0x0023:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004f
            java.lang.Object r5 = r4.next()
            com.onedelhi.secure.sl3[] r5 = (com.onedelhi.secure.sl3[]) r5
            r7 = r5[r1]
            if (r7 == 0) goto L_0x003f
            float r3 = (float) r3
            r7 = r5[r1]
            float r7 = r7.mo44404d()
            float r3 = java.lang.Math.max(r3, r7)
            int r3 = (int) r3
        L_0x003f:
            r7 = r5[r6]
            if (r7 == 0) goto L_0x0023
            r5 = r5[r6]
            float r5 = r5.mo44404d()
            int r5 = (int) r5
            int r3 = java.lang.Math.max(r3, r5)
            goto L_0x0023
        L_0x004f:
            int r3 = r3 + 5
            goto L_0x0008
        L_0x0052:
            r0.add(r4)
            if (r8 == 0) goto L_0x0078
            r3 = 2
            r5 = r4[r3]
            if (r5 == 0) goto L_0x0066
            r5 = r4[r3]
            float r5 = r5.mo44403c()
            int r5 = (int) r5
            r3 = r4[r3]
            goto L_0x0070
        L_0x0066:
            r3 = 4
            r5 = r4[r3]
            float r5 = r5.mo44403c()
            int r5 = (int) r5
            r3 = r4[r3]
        L_0x0070:
            float r3 = r3.mo44404d()
            int r3 = (int) r3
            r4 = r5
            r5 = 1
            goto L_0x000a
        L_0x0078:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.lk0.m55715c(boolean, com.onedelhi.secure.nl):java.util.List");
    }

    /* renamed from: d */
    public static int[] m55716d(C6190nl nlVar, int i, int i2, int i3, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i4 = 0;
        while (nlVar.mo41085e(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        int length = iArr.length;
        int i6 = i;
        int i7 = 0;
        boolean z = false;
        while (i < i3) {
            if (nlVar.mo41085e(i, i2) != z) {
                iArr2[i7] = iArr2[i7] + 1;
            } else {
                if (i7 != length - 1) {
                    i7++;
                } else if (m55719g(iArr2, iArr) < 0.42f) {
                    return new int[]{i6, i};
                } else {
                    i6 += iArr2[0] + iArr2[1];
                    int i8 = i7 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i8);
                    iArr2[i8] = 0;
                    iArr2[i7] = 0;
                    i7--;
                }
                iArr2[i7] = 1;
                z = !z;
            }
            i++;
        }
        if (i7 != length - 1 || m55719g(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i6, i - 1};
    }

    /* renamed from: e */
    public static sl3[] m55717e(C6190nl nlVar, int i, int i2, int i3, int i4, int[] iArr) {
        boolean z;
        int i5;
        int i6;
        int i7 = i;
        sl3[] sl3Arr = new sl3[4];
        int[] iArr2 = new int[iArr.length];
        int i8 = i3;
        while (true) {
            if (i8 >= i7) {
                z = false;
                break;
            }
            int[] d = m55716d(nlVar, i4, i8, i2, iArr, iArr2);
            if (d != null) {
                int i9 = i8;
                int[] iArr3 = d;
                int i10 = i9;
                while (true) {
                    if (i10 <= 0) {
                        i6 = i10;
                        break;
                    }
                    int i11 = i10 - 1;
                    int[] d2 = m55716d(nlVar, i4, i11, i2, iArr, iArr2);
                    if (d2 == null) {
                        i6 = i11 + 1;
                        break;
                    }
                    iArr3 = d2;
                    i10 = i11;
                }
                float f = (float) i6;
                sl3Arr[0] = new sl3((float) iArr3[0], f);
                sl3Arr[1] = new sl3((float) iArr3[1], f);
                i8 = i6;
                z = true;
            } else {
                i8 += 5;
            }
        }
        int i12 = i8 + 1;
        if (z) {
            int[] iArr4 = {(int) sl3Arr[0].mo44403c(), (int) sl3Arr[1].mo44403c()};
            int i13 = i12;
            int i14 = 0;
            while (true) {
                if (i13 >= i7) {
                    i5 = i14;
                    break;
                }
                i5 = i14;
                int[] d3 = m55716d(nlVar, iArr4[0], i13, i2, iArr, iArr2);
                if (d3 == null || Math.abs(iArr4[0] - d3[0]) >= 5 || Math.abs(iArr4[1] - d3[1]) >= 5) {
                    if (i5 > 25) {
                        break;
                    }
                    i14 = i5 + 1;
                } else {
                    iArr4 = d3;
                    i14 = 0;
                }
                i13++;
            }
            i12 = i13 - (i5 + 1);
            float f2 = (float) i12;
            sl3Arr[2] = new sl3((float) iArr4[0], f2);
            sl3Arr[3] = new sl3((float) iArr4[1], f2);
        }
        if (i12 - i8 < 10) {
            Arrays.fill(sl3Arr, (Object) null);
        }
        return sl3Arr;
    }

    /* renamed from: f */
    public static sl3[] m55718f(C6190nl nlVar, int i, int i2) {
        int h = nlVar.mo41089h();
        int l = nlVar.mo41094l();
        sl3[] sl3Arr = new sl3[8];
        m55713a(sl3Arr, m55717e(nlVar, h, l, i, i2, f31707c), f31702a);
        if (sl3Arr[4] != null) {
            i2 = (int) sl3Arr[4].mo44403c();
            i = (int) sl3Arr[4].mo44404d();
        }
        m55713a(sl3Arr, m55717e(nlVar, h, l, i, i2, f31709d), f31705b);
        return sl3Arr;
    }

    /* renamed from: g */
    public static float m55719g(int[] iArr, int[] iArr2) {
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
        float f = (float) i;
        float f2 = f / ((float) i2);
        float f3 = 0.8f * f2;
        float f4 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f5 = ((float) iArr2[i4]) * f2;
            float f6 = (float) i5;
            float f7 = f6 > f5 ? f6 - f5 : f5 - f6;
            if (f7 > f3) {
                return Float.POSITIVE_INFINITY;
            }
            f4 += f7;
        }
        return f4 / f;
    }
}
