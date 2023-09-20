package com.onedelhi.secure;

import java.util.Arrays;

public class ax2 {

    /* renamed from: b */
    public static final int f9548b = 0;

    /* renamed from: b */
    public static String f9549b = "Oscillator";

    /* renamed from: c */
    public static final int f9550c = 1;

    /* renamed from: d */
    public static final int f9551d = 2;

    /* renamed from: e */
    public static final int f9552e = 3;

    /* renamed from: f */
    public static final int f9553f = 4;

    /* renamed from: g */
    public static final int f9554g = 5;

    /* renamed from: h */
    public static final int f9555h = 6;

    /* renamed from: i */
    public static final int f9556i = 7;

    /* renamed from: a */
    public double f9557a = 6.283185307179586d;

    /* renamed from: a */
    public int f9558a;

    /* renamed from: a */
    public vk2 f9559a;

    /* renamed from: a */
    public String f9560a;

    /* renamed from: a */
    public boolean f9561a = false;

    /* renamed from: a */
    public double[] f9562a = new double[0];

    /* renamed from: a */
    public float[] f9563a = new float[0];

    /* renamed from: b */
    public double[] f9564b;

    /* renamed from: a */
    public void mo13302a(double d, float f) {
        int length = this.f9563a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f9562a, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f9562a = Arrays.copyOf(this.f9562a, length);
        this.f9563a = Arrays.copyOf(this.f9563a, length);
        this.f9564b = new double[length];
        double[] dArr = this.f9562a;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f9562a[binarySearch] = d;
        this.f9563a[binarySearch] = f;
        this.f9561a = false;
    }

    /* renamed from: b */
    public double mo13303b(double d) {
        if (d <= 0.0d) {
            d = 1.0E-5d;
        } else if (d >= 1.0d) {
            d = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(this.f9562a, d);
        if (binarySearch > 0 || binarySearch == 0) {
            return 0.0d;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.f9563a;
        int i2 = i - 1;
        double d2 = (double) (fArr[i] - fArr[i2]);
        double[] dArr = this.f9562a;
        double d3 = d2 / (dArr[i] - dArr[i2]);
        return (((double) fArr[i2]) - (d3 * dArr[i2])) + (d * d3);
    }

    /* renamed from: c */
    public double mo13304c(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.f9562a, d);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return 0.0d;
        }
        int i = (-binarySearch) - 1;
        float[] fArr = this.f9563a;
        int i2 = i - 1;
        double d2 = (double) (fArr[i] - fArr[i2]);
        double[] dArr = this.f9562a;
        double d3 = d2 / (dArr[i] - dArr[i2]);
        return this.f9564b[i2] + ((((double) fArr[i2]) - (dArr[i2] * d3)) * (d - dArr[i2])) + ((d3 * ((d * d) - (dArr[i2] * dArr[i2]))) / 2.0d);
    }

    /* renamed from: d */
    public double mo13305d(double d, double d2, double d3) {
        double c = d2 + mo13304c(d);
        double b = mo13303b(d) + d3;
        switch (this.f9558a) {
            case 1:
                return 0.0d;
            case 2:
                return b * 4.0d * Math.signum((((c * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return b * 2.0d;
            case 4:
                return (-b) * 2.0d;
            case 5:
                double d4 = this.f9557a;
                return (-d4) * b * Math.sin(d4 * c);
            case 6:
                return b * 4.0d * ((((c * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.f9559a.mo14613f(c % 1.0d, 0);
            default:
                double d5 = this.f9557a;
                return b * d5 * Math.cos(d5 * c);
        }
    }

    /* renamed from: e */
    public double mo13306e(double d, double d2) {
        double abs;
        double c = mo13304c(d) + d2;
        switch (this.f9558a) {
            case 1:
                return Math.signum(0.5d - (c % 1.0d));
            case 2:
                abs = Math.abs((((c * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((c * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((c * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f9557a * (d2 + c));
            case 6:
                double abs2 = 1.0d - Math.abs(((c * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.f9559a.mo14610c(c % 1.0d, 0);
            default:
                return Math.sin(this.f9557a * c);
        }
        return 1.0d - abs;
    }

    /* renamed from: f */
    public void mo13307f() {
        double d = 0.0d;
        int i = 0;
        while (true) {
            float[] fArr = this.f9563a;
            if (i >= fArr.length) {
                break;
            }
            d += (double) fArr[i];
            i++;
        }
        double d2 = 0.0d;
        int i2 = 1;
        while (true) {
            float[] fArr2 = this.f9563a;
            if (i2 >= fArr2.length) {
                break;
            }
            int i3 = i2 - 1;
            double[] dArr = this.f9562a;
            d2 += (dArr[i2] - dArr[i3]) * ((double) ((fArr2[i3] + fArr2[i2]) / 2.0f));
            i2++;
        }
        int i4 = 0;
        while (true) {
            float[] fArr3 = this.f9563a;
            if (i4 >= fArr3.length) {
                break;
            }
            fArr3[i4] = (float) (((double) fArr3[i4]) * (d / d2));
            i4++;
        }
        this.f9564b[0] = 0.0d;
        int i5 = 1;
        while (true) {
            float[] fArr4 = this.f9563a;
            if (i5 < fArr4.length) {
                int i6 = i5 - 1;
                double[] dArr2 = this.f9562a;
                double d3 = dArr2[i5] - dArr2[i6];
                double[] dArr3 = this.f9564b;
                dArr3[i5] = dArr3[i6] + (d3 * ((double) ((fArr4[i6] + fArr4[i5]) / 2.0f)));
                i5++;
            } else {
                this.f9561a = true;
                return;
            }
        }
    }

    /* renamed from: g */
    public void mo13308g(int i, String str) {
        this.f9558a = i;
        this.f9560a = str;
        if (str != null) {
            this.f9559a = vk2.m30206i(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f9562a) + " period=" + Arrays.toString(this.f9563a);
    }
}
