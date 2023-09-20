package com.onedelhi.secure;

import com.onedelhi.secure.ry1;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

public abstract class pd4 {

    /* renamed from: b */
    public static float f18441b = 6.2831855f;

    /* renamed from: b */
    public static final String f18442b = "SplineSet";

    /* renamed from: c */
    public static final int f18443c = 0;

    /* renamed from: d */
    public static final int f18444d = 1;

    /* renamed from: e */
    public static final int f18445e = 2;

    /* renamed from: a */
    public float f18446a = Float.NaN;

    /* renamed from: a */
    public int f18447a = 0;

    /* renamed from: a */
    public long f18448a;

    /* renamed from: a */
    public dc0 f18449a;

    /* renamed from: a */
    public String f18450a;

    /* renamed from: a */
    public boolean f18451a = false;

    /* renamed from: a */
    public float[] f18452a = new float[3];

    /* renamed from: a */
    public int[] f18453a = new int[10];

    /* renamed from: a */
    public float[][] f18454a = ((float[][]) Array.newInstance(float.class, new int[]{10, 3}));

    /* renamed from: b */
    public int f18455b;

    /* renamed from: com.onedelhi.secure.pd4$a */
    public static class C3145a extends pd4 {

        /* renamed from: a */
        public ry1.C3458a f18456a;

        /* renamed from: a */
        public ry1.C3460c f18457a = new ry1.C3460c();

        /* renamed from: b */
        public float[] f18458b;

        /* renamed from: c */
        public String f18459c;

        /* renamed from: c */
        public float[] f18460c;

        public C3145a(String str, ry1.C3458a aVar) {
            this.f18459c = str.split(vf4.f36537c)[1];
            this.f18456a = aVar;
        }

        /* renamed from: c */
        public void mo17458c(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        /* renamed from: f */
        public void mo17459f(int i) {
            int f = this.f18456a.mo24118f();
            int h = this.f18456a.mo24119g(0).mo15112h();
            double[] dArr = new double[f];
            int i2 = h + 2;
            this.f18458b = new float[i2];
            this.f18460c = new float[h];
            int[] iArr = new int[2];
            iArr[1] = i2;
            iArr[0] = f;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            for (int i3 = 0; i3 < f; i3++) {
                int d = this.f18456a.mo24116d(i3);
                ec0 g = this.f18456a.mo24119g(i3);
                float[] g2 = this.f18457a.mo24133g(i3);
                dArr[i3] = ((double) d) * 0.01d;
                g.mo15110e(this.f18458b);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.f18458b;
                    if (i4 >= fArr.length) {
                        break;
                    }
                    dArr2[i3][i4] = (double) fArr[i4];
                    i4++;
                }
                dArr2[i3][h] = (double) g2[0];
                dArr2[i3][h + 1] = (double) g2[1];
            }
            this.f18449a = dc0.m13061a(i, dArr, dArr2);
        }

        /* renamed from: g */
        public void mo22397g(int i, ec0 ec0, float f, int i2, float f2) {
            this.f18456a.mo24113a(i, ec0);
            this.f18457a.mo24127a(i, new float[]{f, f2});
            this.f18447a = Math.max(this.f18447a, i2);
        }

        /* renamed from: h */
        public boolean mo22398h(ql2 ql2, float f, long j, ny1 ny1) {
            ql2 ql22 = ql2;
            long j2 = j;
            this.f18449a.mo14612e((double) f, this.f18458b);
            float[] fArr = this.f18458b;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j3 = j2 - this.f18448a;
            if (Float.isNaN(this.f18446a)) {
                float a = ny1.mo21502a(ql22, this.f18459c, 0);
                this.f18446a = a;
                if (Float.isNaN(a)) {
                    this.f18446a = 0.0f;
                }
            }
            float f4 = (float) ((((double) this.f18446a) + ((((double) j3) * 1.0E-9d) * ((double) f2))) % 1.0d);
            this.f18446a = f4;
            this.f18448a = j2;
            float a2 = mo22392a(f4);
            this.f18451a = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.f18460c;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.f18451a;
                float[] fArr3 = this.f18458b;
                this.f18451a = z | (((double) fArr3[i]) != 0.0d);
                fArr2[i] = (fArr3[i] * a2) + f3;
                i++;
            }
            ql22.mo23213M(this.f18456a.mo24119g(0), this.f18460c);
            if (f2 != 0.0f) {
                this.f18451a = true;
            }
            return this.f18451a;
        }
    }

    /* renamed from: com.onedelhi.secure.pd4$b */
    public static class C3146b extends pd4 {

        /* renamed from: a */
        public ry1.C3459b f18461a;

        /* renamed from: a */
        public ry1.C3460c f18462a = new ry1.C3460c();

        /* renamed from: b */
        public float[] f18463b;

        /* renamed from: c */
        public String f18464c;

        /* renamed from: c */
        public float[] f18465c;

        public C3146b(String str, ry1.C3459b bVar) {
            this.f18464c = str.split(vf4.f36537c)[1];
            this.f18461a = bVar;
        }

        /* renamed from: c */
        public void mo17458c(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        /* renamed from: f */
        public void mo17459f(int i) {
            int f = this.f18461a.mo24125f();
            int r = this.f18461a.mo24126g(0).mo23089r();
            double[] dArr = new double[f];
            int i2 = r + 2;
            this.f18463b = new float[i2];
            this.f18465c = new float[r];
            int[] iArr = new int[2];
            iArr[1] = i2;
            iArr[0] = f;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            for (int i3 = 0; i3 < f; i3++) {
                int d = this.f18461a.mo24123d(i3);
                qc0 g = this.f18461a.mo24126g(i3);
                float[] g2 = this.f18462a.mo24133g(i3);
                dArr[i3] = ((double) d) * 0.01d;
                g.mo23087o(this.f18463b);
                int i4 = 0;
                while (true) {
                    float[] fArr = this.f18463b;
                    if (i4 >= fArr.length) {
                        break;
                    }
                    dArr2[i3][i4] = (double) fArr[i4];
                    i4++;
                }
                dArr2[i3][r] = (double) g2[0];
                dArr2[i3][r + 1] = (double) g2[1];
            }
            this.f18449a = dc0.m13061a(i, dArr, dArr2);
        }

        /* renamed from: g */
        public void mo22399g(int i, qc0 qc0, float f, int i2, float f2) {
            this.f18461a.mo24120a(i, qc0);
            this.f18462a.mo24127a(i, new float[]{f, f2});
            this.f18447a = Math.max(this.f18447a, i2);
        }

        /* renamed from: h */
        public boolean mo22400h(ql2 ql2, float f, long j, ny1 ny1) {
            ql2 ql22 = ql2;
            long j2 = j;
            this.f18449a.mo14612e((double) f, this.f18463b);
            float[] fArr = this.f18463b;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j3 = j2 - this.f18448a;
            if (Float.isNaN(this.f18446a)) {
                float a = ny1.mo21502a(ql22, this.f18464c, 0);
                this.f18446a = a;
                if (Float.isNaN(a)) {
                    this.f18446a = 0.0f;
                }
            }
            float f4 = (float) ((((double) this.f18446a) + ((((double) j3) * 1.0E-9d) * ((double) f2))) % 1.0d);
            this.f18446a = f4;
            this.f18448a = j2;
            float a2 = mo22392a(f4);
            this.f18451a = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.f18465c;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z = this.f18451a;
                float[] fArr3 = this.f18463b;
                this.f18451a = z | (((double) fArr3[i]) != 0.0d);
                fArr2[i] = (fArr3[i] * a2) + f3;
                i++;
            }
            this.f18461a.mo24126g(0).mo23094w(ql22, this.f18465c);
            if (f2 != 0.0f) {
                this.f18451a = true;
            }
            return this.f18451a;
        }
    }

    /* renamed from: com.onedelhi.secure.pd4$c */
    public static class C3147c {
        /* renamed from: a */
        public static void m24623a(int[] iArr, float[][] fArr, int i, int i2) {
            int[] iArr2 = new int[(iArr.length + 10)];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int b = m24624b(iArr, fArr, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = b - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = b + 1;
                }
            }
        }

        /* renamed from: b */
        public static int m24624b(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m24625c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m24625c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: c */
        public static void m24625c(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }

    /* renamed from: a */
    public float mo22392a(float f) {
        float abs;
        switch (this.f18447a) {
            case 1:
                return Math.signum(f * f18441b);
            case 2:
                abs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos((double) (f * f18441b));
            case 6:
                float abs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin((double) (f * f18441b));
        }
        return 1.0f - abs;
    }

    /* renamed from: b */
    public dc0 mo22393b() {
        return this.f18449a;
    }

    /* renamed from: c */
    public void mo17458c(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.f18453a;
        int i3 = this.f18455b;
        iArr[i3] = i;
        float[][] fArr = this.f18454a;
        fArr[i3][0] = f;
        fArr[i3][1] = f2;
        fArr[i3][2] = f3;
        this.f18447a = Math.max(this.f18447a, i2);
        this.f18455b++;
    }

    /* renamed from: d */
    public void mo22394d(long j) {
        this.f18448a = j;
    }

    /* renamed from: e */
    public void mo22395e(String str) {
        this.f18450a = str;
    }

    /* renamed from: f */
    public void mo17459f(int i) {
        int i2 = this.f18455b;
        if (i2 == 0) {
            PrintStream printStream = System.err;
            printStream.println("Error no points added to " + this.f18450a);
            return;
        }
        C3147c.m24623a(this.f18453a, this.f18454a, 0, i2 - 1);
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f18453a;
            if (i3 >= iArr.length) {
                break;
            }
            if (iArr[i3] != iArr[i3 - 1]) {
                i4++;
            }
            i3++;
        }
        if (i4 == 0) {
            i4 = 1;
        }
        double[] dArr = new double[i4];
        int[] iArr2 = new int[2];
        iArr2[1] = 3;
        iArr2[0] = i4;
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr2);
        int i5 = 0;
        for (int i6 = 0; i6 < this.f18455b; i6++) {
            if (i6 > 0) {
                int[] iArr3 = this.f18453a;
                if (iArr3[i6] == iArr3[i6 - 1]) {
                }
            }
            dArr[i5] = ((double) this.f18453a[i6]) * 0.01d;
            double[] dArr3 = dArr2[i5];
            float[][] fArr = this.f18454a;
            dArr3[0] = (double) fArr[i6][0];
            dArr2[i5][1] = (double) fArr[i6][1];
            dArr2[i5][2] = (double) fArr[i6][2];
            i5++;
        }
        this.f18449a = dc0.m13061a(i, dArr, dArr2);
    }

    public String toString() {
        String str = this.f18450a;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f18455b; i++) {
            str = str + "[" + this.f18453a[i] + " , " + decimalFormat.format(this.f18454a[i]) + "] ";
        }
        return str;
    }
}
