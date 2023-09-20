package com.onedelhi.secure;

import java.lang.reflect.Array;
import java.util.Arrays;

public class u34 extends ur0 {

    /* renamed from: a */
    public static final boolean f21206a = false;

    /* renamed from: a */
    public vk2 f21207a;

    public u34(String str) {
        this.f21506a = str;
        double[] dArr = new double[(str.length() / 2)];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i = 0;
        while (indexOf2 != -1) {
            dArr[i] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i++;
        }
        dArr[i] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        this.f21207a = m29066e(Arrays.copyOf(dArr, i + 1));
    }

    /* renamed from: d */
    public static vk2 m29065d(String str) {
        String[] split = str.split("\\s+");
        int length = split.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = Double.parseDouble(split[i]);
        }
        return m29066e(dArr);
    }

    /* renamed from: e */
    public static vk2 m29066e(double[] dArr) {
        double[] dArr2 = dArr;
        int length = (dArr2.length * 3) - 2;
        int length2 = dArr2.length - 1;
        double d = 1.0d / ((double) length2);
        int[] iArr = new int[2];
        iArr[1] = 1;
        iArr[0] = length;
        double[][] dArr3 = (double[][]) Array.newInstance(double.class, iArr);
        double[] dArr4 = new double[length];
        for (int i = 0; i < dArr2.length; i++) {
            double d2 = dArr2[i];
            int i2 = i + length2;
            dArr3[i2][0] = d2;
            double d3 = ((double) i) * d;
            dArr4[i2] = d3;
            if (i > 0) {
                int i3 = (length2 * 2) + i;
                dArr3[i3][0] = d2 + 1.0d;
                dArr4[i3] = d3 + 1.0d;
                int i4 = i - 1;
                dArr3[i4][0] = (d2 - 1.0d) - d;
                dArr4[i4] = (d3 - 4.0d) - d;
            }
        }
        vk2 vk2 = new vk2(dArr4, dArr3);
        System.out.println(" 0 " + vk2.mo14610c(0.0d, 0));
        System.out.println(" 1 " + vk2.mo14610c(1.0d, 0));
        return vk2;
    }

    /* renamed from: a */
    public double mo17398a(double d) {
        return this.f21207a.mo14610c(d, 0);
    }

    /* renamed from: b */
    public double mo17399b(double d) {
        return this.f21207a.mo14613f(d, 0);
    }
}
