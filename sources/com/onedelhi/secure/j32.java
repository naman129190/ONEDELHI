package com.onedelhi.secure;

public class j32 extends dc0 {

    /* renamed from: a */
    public static final String f13988a = "LinearCurveFit";

    /* renamed from: a */
    public double f13989a = Double.NaN;

    /* renamed from: a */
    public boolean f13990a = true;

    /* renamed from: a */
    public double[] f13991a;

    /* renamed from: a */
    public double[][] f13992a;

    /* renamed from: b */
    public double[] f13993b;

    public j32(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f13993b = new double[length2];
        this.f13991a = dArr;
        this.f13992a = dArr2;
        if (length2 > 2) {
            double d = 0.0d;
            double d2 = 0.0d;
            int i = 0;
            while (i < dArr.length) {
                double d3 = dArr2[i][0];
                double d4 = dArr2[i][0];
                if (i > 0) {
                    Math.hypot(d3 - d, d4 - d2);
                }
                i++;
                d = d3;
                d2 = d4;
            }
            this.f13989a = 0.0d;
        }
    }

    /* renamed from: c */
    public double mo14610c(double d, int i) {
        double[] dArr = this.f13991a;
        int length = dArr.length;
        int i2 = 0;
        if (this.f13990a) {
            if (d <= dArr[0]) {
                return this.f13992a[0][i] + ((d - dArr[0]) * mo14613f(dArr[0], i));
            }
            int i3 = length - 1;
            if (d >= dArr[i3]) {
                return this.f13992a[i3][i] + ((d - dArr[i3]) * mo14613f(dArr[i3], i));
            }
        } else if (d <= dArr[0]) {
            return this.f13992a[0][i];
        } else {
            int i4 = length - 1;
            if (d >= dArr[i4]) {
                return this.f13992a[i4][i];
            }
        }
        while (i2 < length - 1) {
            double[] dArr2 = this.f13991a;
            if (d == dArr2[i2]) {
                return this.f13992a[i2][i];
            }
            int i5 = i2 + 1;
            if (d < dArr2[i5]) {
                double d2 = (d - dArr2[i2]) / (dArr2[i5] - dArr2[i2]);
                double[][] dArr3 = this.f13992a;
                return (dArr3[i2][i] * (1.0d - d2)) + (dArr3[i5][i] * d2);
            }
            i2 = i5;
        }
        return 0.0d;
    }

    /* renamed from: d */
    public void mo14611d(double d, double[] dArr) {
        double[] dArr2 = this.f13991a;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.f13992a[0].length;
        if (this.f13990a) {
            if (d <= dArr2[0]) {
                mo14614g(dArr2[0], this.f13993b);
                for (int i2 = 0; i2 < length2; i2++) {
                    dArr[i2] = this.f13992a[0][i2] + ((d - this.f13991a[0]) * this.f13993b[i2]);
                }
                return;
            }
            int i3 = length - 1;
            if (d >= dArr2[i3]) {
                mo14614g(dArr2[i3], this.f13993b);
                while (i < length2) {
                    dArr[i] = this.f13992a[i3][i] + ((d - this.f13991a[i3]) * this.f13993b[i]);
                    i++;
                }
                return;
            }
        } else if (d <= dArr2[0]) {
            for (int i4 = 0; i4 < length2; i4++) {
                dArr[i4] = this.f13992a[0][i4];
            }
            return;
        } else {
            int i5 = length - 1;
            if (d >= dArr2[i5]) {
                while (i < length2) {
                    dArr[i] = this.f13992a[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.f13991a[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = this.f13992a[i6][i7];
                }
            }
            double[] dArr3 = this.f13991a;
            int i8 = i6 + 1;
            if (d < dArr3[i8]) {
                double d2 = (d - dArr3[i6]) / (dArr3[i8] - dArr3[i6]);
                while (i < length2) {
                    double[][] dArr4 = this.f13992a;
                    dArr[i] = (dArr4[i6][i] * (1.0d - d2)) + (dArr4[i8][i] * d2);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    /* renamed from: e */
    public void mo14612e(double d, float[] fArr) {
        double[] dArr = this.f13991a;
        int length = dArr.length;
        int i = 0;
        int length2 = this.f13992a[0].length;
        if (this.f13990a) {
            if (d <= dArr[0]) {
                mo14614g(dArr[0], this.f13993b);
                for (int i2 = 0; i2 < length2; i2++) {
                    fArr[i2] = (float) (this.f13992a[0][i2] + ((d - this.f13991a[0]) * this.f13993b[i2]));
                }
                return;
            }
            int i3 = length - 1;
            if (d >= dArr[i3]) {
                mo14614g(dArr[i3], this.f13993b);
                while (i < length2) {
                    fArr[i] = (float) (this.f13992a[i3][i] + ((d - this.f13991a[i3]) * this.f13993b[i]));
                    i++;
                }
                return;
            }
        } else if (d <= dArr[0]) {
            for (int i4 = 0; i4 < length2; i4++) {
                fArr[i4] = (float) this.f13992a[0][i4];
            }
            return;
        } else {
            int i5 = length - 1;
            if (d >= dArr[i5]) {
                while (i < length2) {
                    fArr[i] = (float) this.f13992a[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.f13991a[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) this.f13992a[i6][i7];
                }
            }
            double[] dArr2 = this.f13991a;
            int i8 = i6 + 1;
            if (d < dArr2[i8]) {
                double d2 = (d - dArr2[i6]) / (dArr2[i8] - dArr2[i6]);
                while (i < length2) {
                    double[][] dArr3 = this.f13992a;
                    fArr[i] = (float) ((dArr3[i6][i] * (1.0d - d2)) + (dArr3[i8][i] * d2));
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    /* renamed from: f */
    public double mo14613f(double d, int i) {
        double[] dArr = this.f13991a;
        int length = dArr.length;
        int i2 = 0;
        if (d < dArr[0]) {
            d = dArr[0];
        } else {
            int i3 = length - 1;
            if (d >= dArr[i3]) {
                d = dArr[i3];
            }
        }
        while (i2 < length - 1) {
            double[] dArr2 = this.f13991a;
            int i4 = i2 + 1;
            if (d <= dArr2[i4]) {
                double d2 = dArr2[i4] - dArr2[i2];
                double d3 = dArr2[i2];
                double[][] dArr3 = this.f13992a;
                return (dArr3[i4][i] - dArr3[i2][i]) / d2;
            }
            i2 = i4;
        }
        return 0.0d;
    }

    /* renamed from: g */
    public void mo14614g(double d, double[] dArr) {
        double[] dArr2 = this.f13991a;
        int length = dArr2.length;
        int length2 = this.f13992a[0].length;
        if (d <= dArr2[0]) {
            d = dArr2[0];
        } else {
            int i = length - 1;
            if (d >= dArr2[i]) {
                d = dArr2[i];
            }
        }
        int i2 = 0;
        while (i2 < length - 1) {
            double[] dArr3 = this.f13991a;
            int i3 = i2 + 1;
            if (d <= dArr3[i3]) {
                double d2 = dArr3[i3] - dArr3[i2];
                double d3 = dArr3[i2];
                for (int i4 = 0; i4 < length2; i4++) {
                    double[][] dArr4 = this.f13992a;
                    dArr[i4] = (dArr4[i3][i4] - dArr4[i2][i4]) / d2;
                }
                return;
            }
            i2 = i3;
        }
    }

    /* renamed from: h */
    public double[] mo14615h() {
        return this.f13991a;
    }

    /* renamed from: i */
    public final double mo18094i(double d) {
        if (Double.isNaN(this.f13989a)) {
            return 0.0d;
        }
        double[] dArr = this.f13991a;
        int length = dArr.length;
        if (d <= dArr[0]) {
            return 0.0d;
        }
        int i = length - 1;
        if (d >= dArr[i]) {
            return this.f13989a;
        }
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        int i2 = 0;
        while (i2 < i) {
            double[][] dArr2 = this.f13992a;
            double d5 = dArr2[i2][0];
            double d6 = dArr2[i2][1];
            if (i2 > 0) {
                d2 += Math.hypot(d5 - d3, d6 - d4);
            }
            double[] dArr3 = this.f13991a;
            if (d == dArr3[i2]) {
                return d2;
            }
            int i3 = i2 + 1;
            if (d < dArr3[i3]) {
                double d7 = (d - dArr3[i2]) / (dArr3[i3] - dArr3[i2]);
                double[][] dArr4 = this.f13992a;
                double d8 = 1.0d - d7;
                return d2 + Math.hypot(d6 - ((dArr4[i2][1] * d8) + (dArr4[i3][1] * d7)), d5 - ((dArr4[i2][0] * d8) + (dArr4[i3][0] * d7)));
            }
            i2 = i3;
            d3 = d5;
            d4 = d6;
        }
        return 0.0d;
    }
}
