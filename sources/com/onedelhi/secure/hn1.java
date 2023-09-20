package com.onedelhi.secure;

import java.lang.reflect.Array;

public class hn1 {

    /* renamed from: a */
    public double f13194a;

    /* renamed from: a */
    public int f13195a;

    /* renamed from: a */
    public double[] f13196a;

    /* renamed from: a */
    public double[][] f13197a;

    /* renamed from: a */
    public C2356a[][] f13198a;

    /* renamed from: b */
    public int f13199b;

    /* renamed from: com.onedelhi.secure.hn1$a */
    public static class C2356a {

        /* renamed from: a */
        public double f13200a;

        /* renamed from: b */
        public double f13201b;

        /* renamed from: c */
        public double f13202c;

        /* renamed from: d */
        public double f13203d;

        public C2356a(double d, double d2, double d3, double d4) {
            this.f13200a = d;
            this.f13201b = d2;
            this.f13202c = d3;
            this.f13203d = d4;
        }

        /* renamed from: a */
        public double mo17358a(double d) {
            return (((((this.f13203d * d) + this.f13202c) * d) + this.f13201b) * d) + this.f13200a;
        }

        /* renamed from: b */
        public double mo17359b(double d) {
            return (((this.f13203d * 3.0d * d) + (this.f13202c * 2.0d)) * d) + this.f13201b;
        }
    }

    public hn1() {
    }

    public hn1(double[][] dArr) {
        mo17357g(dArr);
    }

    /* renamed from: b */
    public static C2356a[] m16862b(int i, double[] dArr) {
        int i2 = i;
        double[] dArr2 = new double[i2];
        double[] dArr3 = new double[i2];
        double[] dArr4 = new double[i2];
        int i3 = i2 - 1;
        int i4 = 0;
        dArr2[0] = 0.5d;
        int i5 = 1;
        for (int i6 = 1; i6 < i3; i6++) {
            dArr2[i6] = 1.0d / (4.0d - dArr2[i6 - 1]);
        }
        int i7 = i3 - 1;
        dArr2[i3] = 1.0d / (2.0d - dArr2[i7]);
        dArr3[0] = (dArr[1] - dArr[0]) * 3.0d * dArr2[0];
        while (i5 < i3) {
            int i8 = i5 + 1;
            int i9 = i5 - 1;
            dArr3[i5] = (((dArr[i8] - dArr[i9]) * 3.0d) - dArr3[i9]) * dArr2[i5];
            i5 = i8;
        }
        dArr3[i3] = (((dArr[i3] - dArr[i7]) * 3.0d) - dArr3[i7]) * dArr2[i3];
        dArr4[i3] = dArr3[i3];
        while (i7 >= 0) {
            dArr4[i7] = dArr3[i7] - (dArr2[i7] * dArr4[i7 + 1]);
            i7--;
        }
        C2356a[] aVarArr = new C2356a[i3];
        while (i4 < i3) {
            int i10 = i4 + 1;
            aVarArr[i4] = new C2356a((double) ((float) dArr[i4]), dArr4[i4], (((dArr[i10] - dArr[i4]) * 3.0d) - (dArr4[i4] * 2.0d)) - dArr4[i10], ((dArr[i4] - dArr[i10]) * 2.0d) + dArr4[i4] + dArr4[i10]);
            i4 = i10;
        }
        return aVarArr;
    }

    /* renamed from: a */
    public double mo17352a(C2356a[] aVarArr) {
        int i;
        int length = aVarArr.length;
        double[] dArr = new double[aVarArr.length];
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        while (true) {
            i = 0;
            if (d2 >= 1.0d) {
                break;
            }
            double d4 = 0.0d;
            while (i < aVarArr.length) {
                double d5 = dArr[i];
                double a = aVarArr[i].mo17358a(d2);
                dArr[i] = a;
                double d6 = d5 - a;
                d4 += d6 * d6;
                i++;
            }
            if (d2 > 0.0d) {
                d3 += Math.sqrt(d4);
            }
            d2 += 0.1d;
        }
        while (i < aVarArr.length) {
            double d7 = dArr[i];
            double a2 = aVarArr[i].mo17358a(1.0d);
            dArr[i] = a2;
            double d8 = d7 - a2;
            d += d8 * d8;
            i++;
        }
        return d3 + Math.sqrt(d);
    }

    /* renamed from: c */
    public double mo17353c(double d, int i) {
        double[] dArr;
        double d2 = d * this.f13194a;
        int i2 = 0;
        while (true) {
            dArr = this.f13196a;
            if (i2 < dArr.length - 1 && dArr[i2] < d2) {
                d2 -= dArr[i2];
                i2++;
            }
        }
        return this.f13198a[i][i2].mo17358a(d2 / dArr[i2]);
    }

    /* renamed from: d */
    public void mo17354d(double d, double[] dArr) {
        double d2 = d * this.f13194a;
        int i = 0;
        while (true) {
            double[] dArr2 = this.f13196a;
            if (i < dArr2.length - 1 && dArr2[i] < d2) {
                d2 -= dArr2[i];
                i++;
            }
        }
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr[i2] = this.f13198a[i2][i].mo17358a(d2 / this.f13196a[i]);
        }
    }

    /* renamed from: e */
    public void mo17355e(double d, float[] fArr) {
        double d2 = d * this.f13194a;
        int i = 0;
        while (true) {
            double[] dArr = this.f13196a;
            if (i < dArr.length - 1 && dArr[i] < d2) {
                d2 -= dArr[i];
                i++;
            }
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = (float) this.f13198a[i2][i].mo17358a(d2 / this.f13196a[i]);
        }
    }

    /* renamed from: f */
    public void mo17356f(double d, double[] dArr) {
        double d2 = d * this.f13194a;
        int i = 0;
        while (true) {
            double[] dArr2 = this.f13196a;
            if (i < dArr2.length - 1 && dArr2[i] < d2) {
                d2 -= dArr2[i];
                i++;
            }
        }
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr[i2] = this.f13198a[i2][i].mo17359b(d2 / this.f13196a[i]);
        }
    }

    /* renamed from: g */
    public void mo17357g(double[][] dArr) {
        int i;
        int length = dArr[0].length;
        this.f13199b = length;
        int length2 = dArr.length;
        this.f13195a = length2;
        int[] iArr = new int[2];
        iArr[1] = length2;
        iArr[0] = length;
        this.f13197a = (double[][]) Array.newInstance(double.class, iArr);
        this.f13198a = new C2356a[this.f13199b][];
        for (int i2 = 0; i2 < this.f13199b; i2++) {
            for (int i3 = 0; i3 < this.f13195a; i3++) {
                this.f13197a[i2][i3] = dArr[i3][i2];
            }
        }
        int i4 = 0;
        while (true) {
            i = this.f13199b;
            if (i4 >= i) {
                break;
            }
            C2356a[][] aVarArr = this.f13198a;
            double[][] dArr2 = this.f13197a;
            aVarArr[i4] = m16862b(dArr2[i4].length, dArr2[i4]);
            i4++;
        }
        this.f13196a = new double[(this.f13195a - 1)];
        this.f13194a = 0.0d;
        C2356a[] aVarArr2 = new C2356a[i];
        for (int i5 = 0; i5 < this.f13196a.length; i5++) {
            for (int i6 = 0; i6 < this.f13199b; i6++) {
                aVarArr2[i6] = this.f13198a[i6][i5];
            }
            double d = this.f13194a;
            double[] dArr3 = this.f13196a;
            double a = mo17352a(aVarArr2);
            dArr3[i5] = a;
            this.f13194a = d + a;
        }
    }
}
