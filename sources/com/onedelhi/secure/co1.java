package com.onedelhi.secure;

import java.util.Map;

public final class co1 extends rv2 {

    /* renamed from: a */
    public static final float f27008a = 0.38f;

    /* renamed from: a */
    public static final int[] f27009a = {6, 8, 10, 12, 14};

    /* renamed from: a */
    public static final int[][] f27010a = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: b */
    public static final float f27011b = 0.5f;

    /* renamed from: b */
    public static final int f27012b = 3;

    /* renamed from: b */
    public static final int[] f27013b = {1, 1, 1, 1};

    /* renamed from: b */
    public static final int[][] f27014b = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: c */
    public static final int f27015c = 2;

    /* renamed from: d */
    public static final int f27016d = 1;

    /* renamed from: a */
    public int f27017a = -1;

    /* renamed from: h */
    public static int m44163h(int[] iArr) throws tr2 {
        int length = f27014b.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float e = rv2.m63922e(iArr, f27014b[i2], 0.5f);
            if (e < f) {
                i = i2;
                f = e;
            } else if (e == f) {
                i = -1;
            }
        }
        if (i >= 0) {
            return i % 10;
        }
        throw tr2.m66179a();
    }

    /* renamed from: j */
    public static void m44164j(C6014ll llVar, int i, int i2, StringBuilder sb) throws tr2 {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            rv2.m63923f(llVar, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb.append((char) (m44163h(iArr2) + 48));
            sb.append((char) (m44163h(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    /* renamed from: l */
    public static int[] m44165l(C6014ll llVar, int i, int[] iArr) throws tr2 {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int l = llVar.mo39935l();
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < l) {
            if (llVar.mo39930h(i) != z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 != length - 1) {
                    i3++;
                } else if (rv2.m63922e(iArr2, iArr, 0.5f) < 0.38f) {
                    return new int[]{i2, i};
                } else {
                    i2 += iArr2[0] + iArr2[1];
                    int i4 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i3] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z = !z;
            }
            i++;
        }
        throw tr2.m66179a();
    }

    /* renamed from: m */
    public static int m44166m(C6014ll llVar) throws tr2 {
        int l = llVar.mo39935l();
        int j = llVar.mo39933j(0);
        if (j != l) {
            return j;
        }
        throw tr2.m66179a();
    }

    /* renamed from: c */
    public ol3 mo31296c(int i, C6014ll llVar, Map<pf0, ?> map) throws ha1, tr2 {
        boolean z;
        int[] k = mo33894k(llVar);
        int[] i2 = mo33893i(llVar);
        StringBuilder sb = new StringBuilder(20);
        m44164j(llVar, k[1], i2[0], sb);
        String sb2 = sb.toString();
        int[] iArr = map != null ? (int[]) map.get(pf0.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f27009a;
        }
        int length = sb2.length();
        int length2 = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= length2) {
                z = false;
                break;
            }
            int i5 = iArr[i3];
            if (length == i5) {
                z = true;
                break;
            }
            if (i5 > i4) {
                i4 = i5;
            }
            i3++;
        }
        if (!z && length > i4) {
            z = true;
        }
        if (z) {
            float f = (float) i;
            return new ol3(sb2, (byte[]) null, new sl3[]{new sl3((float) k[1], f), new sl3((float) i2[0], f)}, C7363yi.ITF);
        }
        throw ha1.m50341a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r0 = m44165l(r7, r0, f27010a[1]);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0012 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] mo33893i(com.onedelhi.secure.C6014ll r7) throws com.onedelhi.secure.tr2 {
        /*
            r6 = this;
            r7.mo39938p()
            int r0 = m44166m(r7)     // Catch:{ all -> 0x0035 }
            r1 = 1
            r2 = 0
            int[][] r3 = f27010a     // Catch:{ tr2 -> 0x0012 }
            r3 = r3[r2]     // Catch:{ tr2 -> 0x0012 }
            int[] r0 = m44165l(r7, r0, r3)     // Catch:{ tr2 -> 0x0012 }
            goto L_0x001a
        L_0x0012:
            int[][] r3 = f27010a     // Catch:{ all -> 0x0035 }
            r3 = r3[r1]     // Catch:{ all -> 0x0035 }
            int[] r0 = m44165l(r7, r0, r3)     // Catch:{ all -> 0x0035 }
        L_0x001a:
            r3 = r0[r2]     // Catch:{ all -> 0x0035 }
            r6.mo33895n(r7, r3)     // Catch:{ all -> 0x0035 }
            r3 = r0[r2]     // Catch:{ all -> 0x0035 }
            int r4 = r7.mo39935l()     // Catch:{ all -> 0x0035 }
            r5 = r0[r1]     // Catch:{ all -> 0x0035 }
            int r4 = r4 - r5
            r0[r2] = r4     // Catch:{ all -> 0x0035 }
            int r2 = r7.mo39935l()     // Catch:{ all -> 0x0035 }
            int r2 = r2 - r3
            r0[r1] = r2     // Catch:{ all -> 0x0035 }
            r7.mo39938p()
            return r0
        L_0x0035:
            r0 = move-exception
            r7.mo39938p()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.co1.mo33893i(com.onedelhi.secure.ll):int[]");
    }

    /* renamed from: k */
    public final int[] mo33894k(C6014ll llVar) throws tr2 {
        int[] l = m44165l(llVar, m44166m(llVar), f27013b);
        this.f27017a = (l[1] - l[0]) / 4;
        mo33895n(llVar, l[0]);
        return l;
    }

    /* renamed from: n */
    public final void mo33895n(C6014ll llVar, int i) throws tr2 {
        int min = Math.min(this.f27017a * 10, i);
        int i2 = i - 1;
        while (min > 0 && i2 >= 0 && !llVar.mo39930h(i2)) {
            min--;
            i2--;
        }
        if (min != 0) {
            throw tr2.m66179a();
        }
    }
}
