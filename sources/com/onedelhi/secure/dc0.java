package com.onedelhi.secure;

public abstract class dc0 {

    /* renamed from: a */
    public static final int f10705a = 0;

    /* renamed from: b */
    public static final int f10706b = 1;

    /* renamed from: c */
    public static final int f10707c = 2;

    /* renamed from: com.onedelhi.secure.dc0$a */
    public static class C1966a extends dc0 {

        /* renamed from: a */
        public double f10708a;

        /* renamed from: a */
        public double[] f10709a;

        public C1966a(double d, double[] dArr) {
            this.f10708a = d;
            this.f10709a = dArr;
        }

        /* renamed from: c */
        public double mo14610c(double d, int i) {
            return this.f10709a[i];
        }

        /* renamed from: d */
        public void mo14611d(double d, double[] dArr) {
            double[] dArr2 = this.f10709a;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        /* renamed from: e */
        public void mo14612e(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.f10709a;
                if (i < dArr.length) {
                    fArr[i] = (float) dArr[i];
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: f */
        public double mo14613f(double d, int i) {
            return 0.0d;
        }

        /* renamed from: g */
        public void mo14614g(double d, double[] dArr) {
            for (int i = 0; i < this.f10709a.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        /* renamed from: h */
        public double[] mo14615h() {
            return new double[]{this.f10708a};
        }
    }

    /* renamed from: a */
    public static dc0 m13061a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        return i != 0 ? i != 2 ? new j32(dArr, dArr2) : new C1966a(dArr[0], dArr2[0]) : new vk2(dArr, dArr2);
    }

    /* renamed from: b */
    public static dc0 m13062b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new C3382r9(iArr, dArr, dArr2);
    }

    /* renamed from: c */
    public abstract double mo14610c(double d, int i);

    /* renamed from: d */
    public abstract void mo14611d(double d, double[] dArr);

    /* renamed from: e */
    public abstract void mo14612e(double d, float[] fArr);

    /* renamed from: f */
    public abstract double mo14613f(double d, int i);

    /* renamed from: g */
    public abstract void mo14614g(double d, double[] dArr);

    /* renamed from: h */
    public abstract double[] mo14615h();
}
