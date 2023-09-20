package com.onedelhi.secure;

import android.graphics.Color;
import java.util.Objects;

public final class p10 {

    /* renamed from: a */
    public static final double f18272a = 95.047d;

    /* renamed from: a */
    public static final int f18273a = 10;

    /* renamed from: a */
    public static final ThreadLocal<double[]> f18274a = new ThreadLocal<>();

    /* renamed from: b */
    public static final double f18275b = 100.0d;

    /* renamed from: b */
    public static final int f18276b = 1;

    /* renamed from: c */
    public static final double f18277c = 108.883d;

    /* renamed from: d */
    public static final double f18278d = 0.008856d;

    /* renamed from: e */
    public static final double f18279e = 903.3d;

    @sj3(26)
    /* renamed from: com.onedelhi.secure.p10$a */
    public static class C3109a {
        @pn0
        /* renamed from: a */
        public static Color m24326a(Color color, Color color2) {
            if (Objects.equals(color.getModel(), color2.getModel())) {
                if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                    color = color.convert(color2.getColorSpace());
                }
                float[] components = color.getComponents();
                float[] components2 = color2.getComponents();
                float alpha = color.alpha();
                float alpha2 = color2.alpha() * (1.0f - alpha);
                int componentCount = color2.getComponentCount() - 1;
                components2[componentCount] = alpha + alpha2;
                if (components2[componentCount] > 0.0f) {
                    alpha /= components2[componentCount];
                    alpha2 /= components2[componentCount];
                }
                for (int i = 0; i < componentCount; i++) {
                    components2[i] = (components[i] * alpha) + (components2[i] * alpha2);
                }
                return Color.valueOf(components2, color2.getColorSpace());
            }
            throw new IllegalArgumentException("Color models must match (" + color.getModel() + " vs. " + color2.getModel() + pl2.f33727d);
        }
    }

    /* renamed from: A */
    public static double m24298A(double d) {
        return d > 0.008856d ? Math.pow(d, 0.3333333333333333d) : ((d * 903.3d) + 16.0d) / 116.0d;
    }

    @d10
    /* renamed from: B */
    public static int m24299B(@d10 int i, @js1(from = 0, mo18580to = 255) int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & jt4.f14542r) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0099, code lost:
        r6 = java.lang.Math.round(r6 * 255.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00b1, code lost:
        return android.graphics.Color.rgb(m24323x(r1, 0, 255), m24323x(r3, 0, 255), m24323x(r6, 0, 255));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x005f, code lost:
        r6 = java.lang.Math.round((r4 + r6) * 255.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0074, code lost:
        r6 = java.lang.Math.round((r5 + r6) * 255.0f);
     */
    @com.onedelhi.secure.d10
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m24300a(@com.onedelhi.secure.mr2 float[] r6) {
        /*
            r0 = 0
            r1 = r6[r0]
            r2 = 1
            r2 = r6[r2]
            r3 = 2
            r6 = r6[r3]
            r3 = 1073741824(0x40000000, float:2.0)
            float r4 = r6 * r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            float r4 = java.lang.Math.abs(r4)
            float r4 = r5 - r4
            float r4 = r4 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r4
            float r6 = r6 - r2
            r2 = 1114636288(0x42700000, float:60.0)
            float r2 = r1 / r2
            float r2 = r2 % r3
            float r2 = r2 - r5
            float r2 = java.lang.Math.abs(r2)
            float r5 = r5 - r2
            float r5 = r5 * r4
            int r1 = (int) r1
            int r1 = r1 / 60
            r2 = 1132396544(0x437f0000, float:255.0)
            switch(r1) {
                case 0: goto L_0x008b;
                case 1: goto L_0x007c;
                case 2: goto L_0x0067;
                case 3: goto L_0x0052;
                case 4: goto L_0x0044;
                case 5: goto L_0x0036;
                case 6: goto L_0x0036;
                default: goto L_0x0032;
            }
        L_0x0032:
            r6 = 0
            r1 = 0
            r3 = 0
            goto L_0x009f
        L_0x0036:
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r1 = java.lang.Math.round(r4)
            float r3 = r6 * r2
            int r3 = java.lang.Math.round(r3)
            goto L_0x0074
        L_0x0044:
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r1 = java.lang.Math.round(r5)
            float r3 = r6 * r2
            int r3 = java.lang.Math.round(r3)
            goto L_0x005f
        L_0x0052:
            float r1 = r6 * r2
            int r1 = java.lang.Math.round(r1)
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r3 = java.lang.Math.round(r5)
        L_0x005f:
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r6 = java.lang.Math.round(r4)
            goto L_0x009f
        L_0x0067:
            float r1 = r6 * r2
            int r1 = java.lang.Math.round(r1)
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r3 = java.lang.Math.round(r4)
        L_0x0074:
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r6 = java.lang.Math.round(r5)
            goto L_0x009f
        L_0x007c:
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r1 = java.lang.Math.round(r5)
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r3 = java.lang.Math.round(r4)
            goto L_0x0099
        L_0x008b:
            float r4 = r4 + r6
            float r4 = r4 * r2
            int r1 = java.lang.Math.round(r4)
            float r5 = r5 + r6
            float r5 = r5 * r2
            int r3 = java.lang.Math.round(r5)
        L_0x0099:
            float r6 = r6 * r2
            int r6 = java.lang.Math.round(r6)
        L_0x009f:
            r2 = 255(0xff, float:3.57E-43)
            int r1 = m24323x(r1, r0, r2)
            int r3 = m24323x(r3, r0, r2)
            int r6 = m24323x(r6, r0, r2)
            int r6 = android.graphics.Color.rgb(r1, r3, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.p10.m24300a(float[]):int");
    }

    @d10
    /* renamed from: b */
    public static int m24301b(@d81(from = 0.0d, mo14561to = 100.0d) double d, @d81(from = -128.0d, mo14561to = 127.0d) double d2, @d81(from = -128.0d, mo14561to = 127.0d) double d3) {
        double[] z = m24325z();
        m24302c(d, d2, d3, z);
        return m24306g(z[0], z[1], z[2]);
    }

    /* renamed from: c */
    public static void m24302c(@d81(from = 0.0d, mo14561to = 100.0d) double d, @d81(from = -128.0d, mo14561to = 127.0d) double d2, @d81(from = -128.0d, mo14561to = 127.0d) double d3, @mr2 double[] dArr) {
        double d4 = (d + 16.0d) / 116.0d;
        double d5 = (d2 / 500.0d) + d4;
        double d6 = d4 - (d3 / 200.0d);
        double pow = Math.pow(d5, 3.0d);
        if (pow <= 0.008856d) {
            pow = ((d5 * 116.0d) - 16.0d) / 903.3d;
        }
        double pow2 = d > 7.9996247999999985d ? Math.pow(d4, 3.0d) : d / 903.3d;
        double pow3 = Math.pow(d6, 3.0d);
        if (pow3 <= 0.008856d) {
            pow3 = ((d6 * 116.0d) - 16.0d) / 903.3d;
        }
        dArr[0] = pow * 95.047d;
        dArr[1] = pow2 * 100.0d;
        dArr[2] = pow3 * 108.883d;
    }

    /* renamed from: d */
    public static void m24303d(@js1(from = 0, mo18580to = 255) int i, @js1(from = 0, mo18580to = 255) int i2, @js1(from = 0, mo18580to = 255) int i3, @mr2 float[] fArr) {
        float f;
        float f2;
        float f3 = ((float) i) / 255.0f;
        float f4 = ((float) i2) / 255.0f;
        float f5 = ((float) i3) / 255.0f;
        float max = Math.max(f3, Math.max(f4, f5));
        float min = Math.min(f3, Math.min(f4, f5));
        float f6 = max - min;
        float f7 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            f2 = 0.0f;
        } else {
            f = max == f3 ? ((f4 - f5) / f6) % 6.0f : max == f4 ? ((f5 - f3) / f6) + 2.0f : 4.0f + ((f3 - f4) / f6);
            f2 = f6 / (1.0f - Math.abs((2.0f * f7) - 1.0f));
        }
        float f8 = (f * 60.0f) % 360.0f;
        if (f8 < 0.0f) {
            f8 += 360.0f;
        }
        fArr[0] = m24322w(f8, 0.0f, 360.0f);
        fArr[1] = m24322w(f2, 0.0f, 1.0f);
        fArr[2] = m24322w(f7, 0.0f, 1.0f);
    }

    /* renamed from: e */
    public static void m24304e(@js1(from = 0, mo18580to = 255) int i, @js1(from = 0, mo18580to = 255) int i2, @js1(from = 0, mo18580to = 255) int i3, @mr2 double[] dArr) {
        m24305f(i, i2, i3, dArr);
        m24307h(dArr[0], dArr[1], dArr[2], dArr);
    }

    /* renamed from: f */
    public static void m24305f(@js1(from = 0, mo18580to = 255) int i, @js1(from = 0, mo18580to = 255) int i2, @js1(from = 0, mo18580to = 255) int i3, @mr2 double[] dArr) {
        double[] dArr2 = dArr;
        if (dArr2.length == 3) {
            double d = ((double) i) / 255.0d;
            double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
            double d2 = ((double) i2) / 255.0d;
            double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = ((double) i3) / 255.0d;
            double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            dArr2[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
            dArr2[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
            dArr2[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    @d10
    /* renamed from: g */
    public static int m24306g(@d81(from = 0.0d, mo14561to = 95.047d) double d, @d81(from = 0.0d, mo14561to = 100.0d) double d2, @d81(from = 0.0d, mo14561to = 108.883d) double d3) {
        double d4 = (((3.2406d * d) + (-1.5372d * d2)) + (-0.4986d * d3)) / 100.0d;
        double d5 = (((-0.9689d * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d6 = (((0.0557d * d) + (-0.204d * d2)) + (1.057d * d3)) / 100.0d;
        return Color.rgb(m24323x((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d), 0, 255), m24323x((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d), 0, 255), m24323x((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d), 0, 255));
    }

    /* renamed from: h */
    public static void m24307h(@d81(from = 0.0d, mo14561to = 95.047d) double d, @d81(from = 0.0d, mo14561to = 100.0d) double d2, @d81(from = 0.0d, mo14561to = 108.883d) double d3, @mr2 double[] dArr) {
        if (dArr.length == 3) {
            double A = m24298A(d / 95.047d);
            double A2 = m24298A(d2 / 100.0d);
            double A3 = m24298A(d3 / 108.883d);
            dArr[0] = Math.max(0.0d, (116.0d * A2) - 16.0d);
            dArr[1] = (A - A2) * 500.0d;
            dArr[2] = (A2 - A3) * 200.0d;
            return;
        }
        throw new IllegalArgumentException("outLab must have a length of 3.");
    }

    @d10
    /* renamed from: i */
    public static int m24308i(@d10 int i, @d10 int i2, @d81(from = 0.0d, mo14561to = 1.0d) float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((((float) Color.blue(i)) * f2) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: j */
    public static void m24309j(@mr2 float[] fArr, @mr2 float[] fArr2, @d81(from = 0.0d, mo14561to = 1.0d) float f, @mr2 float[] fArr3) {
        if (fArr3.length == 3) {
            float f2 = 1.0f - f;
            fArr3[0] = m24314o(fArr[0], fArr2[0], f);
            fArr3[1] = (fArr[1] * f2) + (fArr2[1] * f);
            fArr3[2] = (fArr[2] * f2) + (fArr2[2] * f);
            return;
        }
        throw new IllegalArgumentException("result must have a length of 3.");
    }

    /* renamed from: k */
    public static void m24310k(@mr2 double[] dArr, @mr2 double[] dArr2, @d81(from = 0.0d, mo14561to = 1.0d) double d, @mr2 double[] dArr3) {
        if (dArr3.length == 3) {
            double d2 = 1.0d - d;
            dArr3[0] = (dArr[0] * d2) + (dArr2[0] * d);
            dArr3[1] = (dArr[1] * d2) + (dArr2[1] * d);
            dArr3[2] = (dArr[2] * d2) + (dArr2[2] * d);
            return;
        }
        throw new IllegalArgumentException("outResult must have a length of 3.");
    }

    /* renamed from: l */
    public static double m24311l(@d10 int i, @d10 int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = m24319t(i, i2);
            }
            double m = m24312m(i) + 0.05d;
            double m2 = m24312m(i2) + 0.05d;
            return Math.max(m, m2) / Math.min(m, m2);
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    @d81(from = 0.0d, mo14561to = 1.0d)
    /* renamed from: m */
    public static double m24312m(@d10 int i) {
        double[] z = m24325z();
        m24317r(i, z);
        return z[1] / 100.0d;
    }

    /* renamed from: n */
    public static int m24313n(@d10 int i, @d10 int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) == 255) {
            double d = (double) f;
            if (m24311l(m24299B(i, 255), i2) < d) {
                return -1;
            }
            int i4 = 0;
            for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
                int i6 = (i4 + i3) / 2;
                if (m24311l(m24299B(i, i6), i2) < d) {
                    i4 = i6;
                } else {
                    i3 = i6;
                }
            }
            return i3;
        }
        throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
    }

    @hw4
    /* renamed from: o */
    public static float m24314o(float f, float f2, float f3) {
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > f) {
                f += 360.0f;
            } else {
                f2 += 360.0f;
            }
        }
        return (f + ((f2 - f) * f3)) % 360.0f;
    }

    /* renamed from: p */
    public static void m24315p(@d10 int i, @mr2 float[] fArr) {
        m24303d(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    /* renamed from: q */
    public static void m24316q(@d10 int i, @mr2 double[] dArr) {
        m24304e(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    /* renamed from: r */
    public static void m24317r(@d10 int i, @mr2 double[] dArr) {
        m24305f(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    /* renamed from: s */
    public static int m24318s(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    /* renamed from: t */
    public static int m24319t(@d10 int i, @d10 int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int s = m24318s(alpha2, alpha);
        return Color.argb(s, m24321v(Color.red(i), alpha2, Color.red(i2), alpha, s), m24321v(Color.green(i), alpha2, Color.green(i2), alpha, s), m24321v(Color.blue(i), alpha2, Color.blue(i2), alpha, s));
    }

    @mr2
    @sj3(26)
    /* renamed from: u */
    public static Color m24320u(@mr2 Color color, @mr2 Color color2) {
        return C3109a.m24326a(color, color2);
    }

    /* renamed from: v */
    public static int m24321v(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    /* renamed from: w */
    public static float m24322w(float f, float f2, float f3) {
        return f < f2 ? f2 : Math.min(f, f3);
    }

    /* renamed from: x */
    public static int m24323x(int i, int i2, int i3) {
        return i < i2 ? i2 : Math.min(i, i3);
    }

    /* renamed from: y */
    public static double m24324y(@mr2 double[] dArr, @mr2 double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[0] - dArr2[0], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[2] - dArr2[2], 2.0d));
    }

    /* renamed from: z */
    public static double[] m24325z() {
        ThreadLocal<double[]> threadLocal = f18274a;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }
}
