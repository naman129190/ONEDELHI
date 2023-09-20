package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.h1 */
public abstract class C5470h1 extends rv2 {

    /* renamed from: a */
    public static final float f29379a = 0.2f;

    /* renamed from: b */
    public static final float f29380b = 0.45f;

    /* renamed from: c */
    public static final float f29381c = 0.7916667f;

    /* renamed from: d */
    public static final float f29382d = 0.89285713f;

    /* renamed from: a */
    public final float[] f29383a;

    /* renamed from: a */
    public final int[] f29384a = new int[4];

    /* renamed from: b */
    public final float[] f29385b;

    /* renamed from: b */
    public final int[] f29386b;

    /* renamed from: c */
    public final int[] f29387c;

    /* renamed from: d */
    public final int[] f29388d;

    public C5470h1() {
        int[] iArr = new int[8];
        this.f29386b = iArr;
        this.f29383a = new float[4];
        this.f29385b = new float[4];
        this.f29387c = new int[(iArr.length / 2)];
        this.f29388d = new int[(iArr.length / 2)];
    }

    @Deprecated
    /* renamed from: h */
    public static int m50093h(int[] iArr) {
        return qf2.m62734d(iArr);
    }

    /* renamed from: i */
    public static void m50094i(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] < f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    /* renamed from: p */
    public static void m50095p(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] > f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    /* renamed from: q */
    public static boolean m50096q(int[] iArr) {
        int i = iArr[0] + iArr[1];
        float f = ((float) i) / ((float) ((iArr[2] + i) + iArr[3]));
        if (f >= 0.7916667f && f <= 0.89285713f) {
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            for (int i4 : iArr) {
                if (i4 > i3) {
                    i3 = i4;
                }
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i3 < i2 * 10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    public static int m50097r(int[] iArr, int[][] iArr2) throws tr2 {
        for (int i = 0; i < iArr2.length; i++) {
            if (rv2.m63922e(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw tr2.m66179a();
    }

    /* renamed from: j */
    public final int[] mo37110j() {
        return this.f29386b;
    }

    /* renamed from: k */
    public final int[] mo37111k() {
        return this.f29384a;
    }

    /* renamed from: l */
    public final int[] mo37112l() {
        return this.f29388d;
    }

    /* renamed from: m */
    public final float[] mo37113m() {
        return this.f29385b;
    }

    /* renamed from: n */
    public final int[] mo37114n() {
        return this.f29387c;
    }

    /* renamed from: o */
    public final float[] mo37115o() {
        return this.f29383a;
    }
}
