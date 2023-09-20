package com.onedelhi.secure;

import com.onedelhi.secure.ry1;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

public abstract class x14 {

    /* renamed from: b */
    public static final String f22376b = "SplineSet";

    /* renamed from: a */
    public int f22377a;

    /* renamed from: a */
    public dc0 f22378a;

    /* renamed from: a */
    public String f22379a;

    /* renamed from: a */
    public float[] f22380a = new float[10];

    /* renamed from: a */
    public int[] f22381a = new int[10];

    /* renamed from: com.onedelhi.secure.x14$a */
    public static class C3887a extends x14 {

        /* renamed from: a */
        public long f22382a;

        /* renamed from: c */
        public String f22383c;

        public C3887a(String str, long j) {
            this.f22383c = str;
            this.f22382a = j;
        }

        /* renamed from: h */
        public void mo26751h(ak4 ak4, float f) {
            ak4.mo13122c(ak4.mo13121b(this.f22383c), mo26748a(f));
        }
    }

    /* renamed from: com.onedelhi.secure.x14$b */
    public static class C3888b extends x14 {

        /* renamed from: a */
        public ry1.C3458a f22384a;

        /* renamed from: b */
        public float[] f22385b;

        /* renamed from: c */
        public String f22386c;

        public C3888b(String str, ry1.C3458a aVar) {
            this.f22386c = str.split(vf4.f36537c)[1];
            this.f22384a = aVar;
        }

        /* renamed from: g */
        public void mo13827g(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        /* renamed from: j */
        public void mo13828j(int i) {
            int f = this.f22384a.mo24118f();
            int h = this.f22384a.mo24119g(0).mo15112h();
            double[] dArr = new double[f];
            this.f22385b = new float[h];
            int[] iArr = new int[2];
            iArr[1] = h;
            iArr[0] = f;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            for (int i2 = 0; i2 < f; i2++) {
                int d = this.f22384a.mo24116d(i2);
                ec0 g = this.f22384a.mo24119g(i2);
                dArr[i2] = ((double) d) * 0.01d;
                g.mo15110e(this.f22385b);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.f22385b;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    dArr2[i2][i3] = (double) fArr[i3];
                    i3++;
                }
            }
            this.f22378a = dc0.m13061a(i, dArr, dArr2);
        }

        /* renamed from: k */
        public void mo26754k(int i, ec0 ec0) {
            this.f22384a.mo24113a(i, ec0);
        }

        /* renamed from: l */
        public void mo26755l(ex4 ex4, float f) {
            this.f22378a.mo14612e((double) f, this.f22385b);
            ex4.mo15649z(this.f22384a.mo24119g(0), this.f22385b);
        }
    }

    /* renamed from: com.onedelhi.secure.x14$c */
    public static class C3889c extends x14 {

        /* renamed from: a */
        public ry1.C3459b f22387a;

        /* renamed from: b */
        public float[] f22388b;

        /* renamed from: c */
        public String f22389c;

        public C3889c(String str, ry1.C3459b bVar) {
            this.f22389c = str.split(vf4.f36537c)[1];
            this.f22387a = bVar;
        }

        /* renamed from: g */
        public void mo13827g(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        /* renamed from: h */
        public void mo26751h(ak4 ak4, float f) {
            mo26757l((ql2) ak4, f);
        }

        /* renamed from: j */
        public void mo13828j(int i) {
            int f = this.f22387a.mo24125f();
            int r = this.f22387a.mo24126g(0).mo23089r();
            double[] dArr = new double[f];
            this.f22388b = new float[r];
            int[] iArr = new int[2];
            iArr[1] = r;
            iArr[0] = f;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            for (int i2 = 0; i2 < f; i2++) {
                int d = this.f22387a.mo24123d(i2);
                qc0 g = this.f22387a.mo24126g(i2);
                dArr[i2] = ((double) d) * 0.01d;
                g.mo23087o(this.f22388b);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.f22388b;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    dArr2[i2][i3] = (double) fArr[i3];
                    i3++;
                }
            }
            this.f22378a = dc0.m13061a(i, dArr, dArr2);
        }

        /* renamed from: k */
        public void mo26756k(int i, qc0 qc0) {
            this.f22387a.mo24120a(i, qc0);
        }

        /* renamed from: l */
        public void mo26757l(ql2 ql2, float f) {
            this.f22378a.mo14612e((double) f, this.f22388b);
            this.f22387a.mo24126g(0).mo23094w(ql2, this.f22388b);
        }
    }

    /* renamed from: com.onedelhi.secure.x14$d */
    public static class C3890d {
        /* renamed from: a */
        public static void m31237a(int[] iArr, float[] fArr, int i, int i2) {
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
                    int b = m31238b(iArr, fArr, i5, i6);
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
        public static int m31238b(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m31239c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m31239c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: c */
        public static void m31239c(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }

    /* renamed from: d */
    public static x14 m31217d(String str, ry1.C3458a aVar) {
        return new C3888b(str, aVar);
    }

    /* renamed from: e */
    public static x14 m31218e(String str, ry1.C3459b bVar) {
        return new C3889c(str, bVar);
    }

    /* renamed from: f */
    public static x14 m31219f(String str, long j) {
        return new C3887a(str, j);
    }

    /* renamed from: a */
    public float mo26748a(float f) {
        return (float) this.f22378a.mo14610c((double) f, 0);
    }

    /* renamed from: b */
    public dc0 mo26749b() {
        return this.f22378a;
    }

    /* renamed from: c */
    public float mo26750c(float f) {
        return (float) this.f22378a.mo14613f((double) f, 0);
    }

    /* renamed from: g */
    public void mo13827g(int i, float f) {
        int[] iArr = this.f22381a;
        if (iArr.length < this.f22377a + 1) {
            this.f22381a = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f22380a;
            this.f22380a = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f22381a;
        int i2 = this.f22377a;
        iArr2[i2] = i;
        this.f22380a[i2] = f;
        this.f22377a = i2 + 1;
    }

    /* renamed from: h */
    public void mo26751h(ak4 ak4, float f) {
        ak4.mo13122c(zj4.m33181a(this.f22379a), mo26748a(f));
    }

    /* renamed from: i */
    public void mo26752i(String str) {
        this.f22379a = str;
    }

    /* renamed from: j */
    public void mo13828j(int i) {
        int i2 = this.f22377a;
        if (i2 != 0) {
            C3890d.m31237a(this.f22381a, this.f22380a, 0, i2 - 1);
            int i3 = 1;
            for (int i4 = 1; i4 < this.f22377a; i4++) {
                int[] iArr = this.f22381a;
                if (iArr[i4 - 1] != iArr[i4]) {
                    i3++;
                }
            }
            double[] dArr = new double[i3];
            int[] iArr2 = new int[2];
            iArr2[1] = 1;
            iArr2[0] = i3;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr2);
            int i5 = 0;
            for (int i6 = 0; i6 < this.f22377a; i6++) {
                if (i6 > 0) {
                    int[] iArr3 = this.f22381a;
                    if (iArr3[i6] == iArr3[i6 - 1]) {
                    }
                }
                dArr[i5] = ((double) this.f22381a[i6]) * 0.01d;
                dArr2[i5][0] = (double) this.f22380a[i6];
                i5++;
            }
            this.f22378a = dc0.m13061a(i, dArr, dArr2);
        }
    }

    public String toString() {
        String str = this.f22379a;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f22377a; i++) {
            str = str + "[" + this.f22381a[i] + " , " + decimalFormat.format((double) this.f22380a[i]) + "] ";
        }
        return str;
    }
}
