package com.onedelhi.secure;

import androidx.recyclerview.widget.C0918m;
import java.util.Arrays;

public final class q10 {

    /* renamed from: a */
    public static final float[] f18849a = {95.047f, 100.0f, 108.883f};

    /* renamed from: a */
    public static int m25235a(int i) {
        return i & 255;
    }

    /* renamed from: b */
    public static float m25236b(float f) {
        return f <= 0.0031308f ? f * 12.92f : (((float) Math.pow((double) f, 0.4166666567325592d)) * 1.055f) - 0.055f;
    }

    /* renamed from: c */
    public static int m25237c(int i) {
        return (i & 65280) >> 8;
    }

    /* renamed from: d */
    public static String m25238d(int i) {
        int m = m25247m(i);
        int a = m25235a(i);
        return String.format("#%02x%02x%02x", new Object[]{Integer.valueOf(m), Integer.valueOf(m25237c(i)), Integer.valueOf(a)});
    }

    /* renamed from: e */
    public static int m25239e(double d, double d2, double d3) {
        double d4 = (d + 16.0d) / 116.0d;
        double d5 = (d2 / 500.0d) + d4;
        double d6 = d4 - (d3 / 200.0d);
        double d7 = d5 * d5 * d5;
        if (d7 <= 0.008856451679035631d) {
            d7 = ((d5 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        double d8 = d > 8.0d ? d4 * d4 * d4 : d / 903.2962962962963d;
        double d9 = d6 * d6 * d6;
        if (d9 <= 0.008856451679035631d) {
            d9 = ((d6 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        float[] fArr = f18849a;
        return m25243i((float) (d7 * ((double) fArr[0])), (float) (d8 * ((double) fArr[1])), (float) (d9 * ((double) fArr[2])));
    }

    /* renamed from: f */
    public static int m25240f(float f) {
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f2 * f2 * f2;
        boolean z = f3 > 0.008856452f;
        float f4 = (f > 8.0f ? 1 : (f == 8.0f ? 0 : -1)) > 0 ? f3 : f / 903.2963f;
        float f5 = z ? f3 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f3 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f18849a;
        return m25242h(new float[]{f5 * fArr[0], f4 * fArr[1], f3 * fArr[2]});
    }

    /* renamed from: g */
    public static int m25241g(int i, int i2, int i3) {
        return (((((i & 255) << 16) | -16777216) | ((i2 & 255) << 8)) | (i3 & 255)) >>> 0;
    }

    /* renamed from: h */
    public static int m25242h(float[] fArr) {
        return m25243i(fArr[0], fArr[1], fArr[2]);
    }

    /* renamed from: i */
    public static int m25243i(float f, float f2, float f3) {
        float f4 = f / 100.0f;
        float f5 = f2 / 100.0f;
        float f6 = f3 / 100.0f;
        float f7 = (3.2406f * f4) + (-1.5372f * f5) + (-0.4986f * f6);
        float f8 = (f4 * 0.0557f) + (f5 * -0.204f) + (f6 * 1.057f);
        return m25241g(Math.max(Math.min(255, Math.round(m25236b(f7) * 255.0f)), 0), Math.max(Math.min(255, Math.round(m25236b((-0.9689f * f4) + (1.8758f * f5) + (0.0415f * f6)) * 255.0f)), 0), Math.max(Math.min(255, Math.round(m25236b(f8) * 255.0f)), 0));
    }

    /* renamed from: j */
    public static double[] m25244j(int i) {
        float[] o = m25249o(i);
        float f = o[1];
        float[] fArr = f18849a;
        double d = (double) (f / fArr[1]);
        double cbrt = d > 0.008856451679035631d ? Math.cbrt(d) : ((d * 903.2962962962963d) + 16.0d) / 116.0d;
        double d2 = (double) (o[0] / fArr[0]);
        double cbrt2 = d2 > 0.008856451679035631d ? Math.cbrt(d2) : ((d2 * 903.2962962962963d) + 16.0d) / 116.0d;
        double d3 = (double) (o[2] / fArr[2]);
        return new double[]{(116.0d * cbrt) - 16.0d, (cbrt2 - cbrt) * 500.0d, (cbrt - (d3 > 0.008856451679035631d ? Math.cbrt(d3) : ((d3 * 903.2962962962963d) + 16.0d) / 116.0d)) * 200.0d};
    }

    /* renamed from: k */
    public static float m25245k(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    /* renamed from: l */
    public static float m25246l(int i) {
        return (float) m25244j(i)[0];
    }

    /* renamed from: m */
    public static int m25247m(int i) {
        return (i & C0918m.f5080v) >> 16;
    }

    /* renamed from: n */
    public static final float[] m25248n() {
        return Arrays.copyOf(f18849a, 3);
    }

    /* renamed from: o */
    public static float[] m25249o(int i) {
        float k = m25245k(((float) m25247m(i)) / 255.0f) * 100.0f;
        float k2 = m25245k(((float) m25237c(i)) / 255.0f) * 100.0f;
        float k3 = m25245k(((float) m25235a(i)) / 255.0f) * 100.0f;
        return new float[]{(0.41233894f * k) + (0.35762063f * k2) + (0.18051042f * k3), (0.2126f * k) + (0.7152f * k2) + (0.0722f * k3), (k * 0.01932141f) + (k2 * 0.11916382f) + (k3 * 0.9503448f)};
    }

    /* renamed from: p */
    public static float m25250p(float f) {
        return (f > 8.0f ? (float) Math.pow((((double) f) + 16.0d) / 116.0d, 3.0d) : f / 903.2963f) * 100.0f;
    }
}
