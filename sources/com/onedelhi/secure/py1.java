package com.onedelhi.secure;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public abstract class py1 {

    /* renamed from: c */
    public static final String f18796c = "KeyCycleOscillator";

    /* renamed from: a */
    public int f18797a = 0;

    /* renamed from: a */
    public dc0 f18798a;

    /* renamed from: a */
    public C3214c f18799a;

    /* renamed from: a */
    public String f18800a;

    /* renamed from: a */
    public ArrayList<C3218g> f18801a = new ArrayList<>();

    /* renamed from: b */
    public int f18802b = 0;

    /* renamed from: b */
    public String f18803b = null;

    /* renamed from: com.onedelhi.secure.py1$a */
    public class C3212a implements Comparator<C3218g> {
        public C3212a() {
        }

        /* renamed from: a */
        public int compare(C3218g gVar, C3218g gVar2) {
            return Integer.compare(gVar.f18828a, gVar2.f18828a);
        }
    }

    /* renamed from: com.onedelhi.secure.py1$b */
    public static class C3213b extends py1 {

        /* renamed from: c */
        public int f18805c;

        /* renamed from: d */
        public String f18806d;

        public C3213b(String str) {
            this.f18806d = str;
            this.f18805c = ck4.m12518a(str);
        }

        /* renamed from: h */
        public void mo22768h(ql2 ql2, float f) {
            ql2.mo13122c(this.f18805c, mo22763a(f));
        }
    }

    /* renamed from: com.onedelhi.secure.py1$c */
    public static class C3214c {

        /* renamed from: a */
        public static final String f18807a = "CycleOscillator";

        /* renamed from: f */
        public static final int f18808f = -1;

        /* renamed from: a */
        public float f18809a;

        /* renamed from: a */
        public final int f18810a;

        /* renamed from: a */
        public ax2 f18811a;

        /* renamed from: a */
        public dc0 f18812a;

        /* renamed from: a */
        public double[] f18813a;

        /* renamed from: a */
        public float[] f18814a;

        /* renamed from: b */
        public final int f18815b = 0;

        /* renamed from: b */
        public double[] f18816b;

        /* renamed from: b */
        public float[] f18817b;

        /* renamed from: c */
        public final int f18818c = 1;

        /* renamed from: c */
        public double[] f18819c;

        /* renamed from: c */
        public float[] f18820c;

        /* renamed from: d */
        public final int f18821d = 2;

        /* renamed from: d */
        public float[] f18822d;

        /* renamed from: e */
        public int f18823e;

        /* renamed from: e */
        public float[] f18824e;

        public C3214c(int i, String str, int i2, int i3) {
            ax2 ax2 = new ax2();
            this.f18811a = ax2;
            this.f18823e = i;
            this.f18810a = i2;
            ax2.mo13308g(i, str);
            this.f18814a = new float[i3];
            this.f18813a = new double[i3];
            this.f18817b = new float[i3];
            this.f18820c = new float[i3];
            this.f18822d = new float[i3];
            this.f18824e = new float[i3];
        }

        /* renamed from: a */
        public double mo22775a() {
            return this.f18816b[1];
        }

        /* renamed from: b */
        public double mo22776b(float f) {
            dc0 dc0 = this.f18812a;
            if (dc0 != null) {
                double d = (double) f;
                dc0.mo14614g(d, this.f18819c);
                this.f18812a.mo14611d(d, this.f18816b);
            } else {
                double[] dArr = this.f18819c;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d2 = (double) f;
            double e = this.f18811a.mo13306e(d2, this.f18816b[1]);
            double d3 = this.f18811a.mo13305d(d2, this.f18816b[1], this.f18819c[1]);
            double[] dArr2 = this.f18819c;
            return dArr2[0] + (e * dArr2[2]) + (d3 * this.f18816b[2]);
        }

        /* renamed from: c */
        public double mo22777c(float f) {
            dc0 dc0 = this.f18812a;
            if (dc0 != null) {
                dc0.mo14611d((double) f, this.f18816b);
            } else {
                double[] dArr = this.f18816b;
                dArr[0] = (double) this.f18820c[0];
                dArr[1] = (double) this.f18822d[0];
                dArr[2] = (double) this.f18814a[0];
            }
            double[] dArr2 = this.f18816b;
            return dArr2[0] + (this.f18811a.mo13306e((double) f, dArr2[1]) * this.f18816b[2]);
        }

        /* renamed from: d */
        public void mo22778d(int i, int i2, float f, float f2, float f3, float f4) {
            this.f18813a[i] = ((double) i2) / 100.0d;
            this.f18817b[i] = f;
            this.f18820c[i] = f2;
            this.f18822d[i] = f3;
            this.f18814a[i] = f4;
        }

        /* renamed from: e */
        public void mo22779e(float f) {
            this.f18809a = f;
            int length = this.f18813a.length;
            int[] iArr = new int[2];
            iArr[1] = 3;
            iArr[0] = length;
            double[][] dArr = (double[][]) Array.newInstance(double.class, iArr);
            float[] fArr = this.f18814a;
            this.f18816b = new double[(fArr.length + 2)];
            this.f18819c = new double[(fArr.length + 2)];
            if (this.f18813a[0] > 0.0d) {
                this.f18811a.mo13302a(0.0d, this.f18817b[0]);
            }
            double[] dArr2 = this.f18813a;
            int length2 = dArr2.length - 1;
            if (dArr2[length2] < 1.0d) {
                this.f18811a.mo13302a(1.0d, this.f18817b[length2]);
            }
            for (int i = 0; i < dArr.length; i++) {
                dArr[i][0] = (double) this.f18820c[i];
                dArr[i][1] = (double) this.f18822d[i];
                dArr[i][2] = (double) this.f18814a[i];
                this.f18811a.mo13302a(this.f18813a[i], this.f18817b[i]);
            }
            this.f18811a.mo13307f();
            double[] dArr3 = this.f18813a;
            this.f18812a = dArr3.length > 1 ? dc0.m13061a(0, dArr3, dArr) : null;
        }
    }

    /* renamed from: com.onedelhi.secure.py1$d */
    public static class C3215d {
        /* renamed from: a */
        public static int m25200a(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m25202c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m25202c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: b */
        public static void m25201b(int[] iArr, float[] fArr, int i, int i2) {
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
                    int a = m25200a(iArr, fArr, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = a - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = a + 1;
                }
            }
        }

        /* renamed from: c */
        public static void m25202c(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }

    /* renamed from: com.onedelhi.secure.py1$e */
    public static class C3216e {
        /* renamed from: a */
        public static int m25203a(int[] iArr, float[] fArr, float[] fArr2, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m25205c(iArr, fArr, fArr2, i4, i);
                    i4++;
                }
                i++;
            }
            m25205c(iArr, fArr, fArr2, i4, i2);
            return i4;
        }

        /* renamed from: b */
        public static void m25204b(int[] iArr, float[] fArr, float[] fArr2, int i, int i2) {
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
                    int a = m25203a(iArr, fArr, fArr2, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = a - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = a + 1;
                }
            }
        }

        /* renamed from: c */
        public static void m25205c(int[] iArr, float[] fArr, float[] fArr2, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
            float f2 = fArr2[i];
            fArr2[i] = fArr2[i2];
            fArr2[i2] = f2;
        }
    }

    /* renamed from: com.onedelhi.secure.py1$f */
    public static class C3217f extends py1 {

        /* renamed from: c */
        public int f18825c;

        /* renamed from: d */
        public String f18826d;

        public C3217f(String str) {
            this.f18826d = str;
            this.f18825c = ck4.m12518a(str);
        }

        /* renamed from: h */
        public void mo22768h(ql2 ql2, float f) {
            ql2.mo13122c(this.f18825c, mo22763a(f));
        }

        /* renamed from: l */
        public void mo22780l(ql2 ql2, float f, double d, double d2) {
            ql2.mo23218R(mo22763a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* renamed from: com.onedelhi.secure.py1$g */
    public static class C3218g {

        /* renamed from: a */
        public float f18827a;

        /* renamed from: a */
        public int f18828a;

        /* renamed from: b */
        public float f18829b;

        /* renamed from: c */
        public float f18830c;

        /* renamed from: d */
        public float f18831d;

        public C3218g(int i, float f, float f2, float f3, float f4) {
            this.f18828a = i;
            this.f18827a = f4;
            this.f18829b = f2;
            this.f18830c = f;
            this.f18831d = f3;
        }
    }

    /* renamed from: d */
    public static py1 m25182d(String str) {
        return str.equals("pathRotate") ? new C3217f(str) : new C3213b(str);
    }

    /* renamed from: a */
    public float mo22763a(float f) {
        return (float) this.f18799a.mo22777c(f);
    }

    /* renamed from: b */
    public dc0 mo22764b() {
        return this.f18798a;
    }

    /* renamed from: c */
    public float mo22765c(float f) {
        return (float) this.f18799a.mo22776b(f);
    }

    /* renamed from: e */
    public void mo19202e(Object obj) {
    }

    /* renamed from: f */
    public void mo22766f(int i, int i2, String str, int i3, float f, float f2, float f3, float f4) {
        int i4 = i3;
        this.f18801a.add(new C3218g(i, f, f2, f3, f4));
        if (i4 != -1) {
            this.f18802b = i4;
        }
        this.f18797a = i2;
        this.f18803b = str;
    }

    /* renamed from: g */
    public void mo22767g(int i, int i2, String str, int i3, float f, float f2, float f3, float f4, Object obj) {
        int i4 = i3;
        this.f18801a.add(new C3218g(i, f, f2, f3, f4));
        if (i4 != -1) {
            this.f18802b = i4;
        }
        this.f18797a = i2;
        mo19202e(obj);
        this.f18803b = str;
    }

    /* renamed from: h */
    public void mo22768h(ql2 ql2, float f) {
    }

    /* renamed from: i */
    public void mo22769i(String str) {
        this.f18800a = str;
    }

    /* renamed from: j */
    public void mo22770j(float f) {
        int size = this.f18801a.size();
        if (size != 0) {
            Collections.sort(this.f18801a, new C3212a());
            double[] dArr = new double[size];
            int[] iArr = new int[2];
            iArr[1] = 3;
            char c = 0;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, iArr);
            this.f18799a = new C3214c(this.f18797a, this.f18803b, this.f18802b, size);
            Iterator<C3218g> it = this.f18801a.iterator();
            int i = 0;
            while (it.hasNext()) {
                C3218g next = it.next();
                float f2 = next.f18830c;
                dArr[i] = ((double) f2) * 0.01d;
                double[] dArr3 = dArr2[i];
                float f3 = next.f18827a;
                dArr3[c] = (double) f3;
                double[] dArr4 = dArr2[i];
                float f4 = next.f18829b;
                dArr4[1] = (double) f4;
                double[] dArr5 = dArr2[i];
                float f5 = next.f18831d;
                dArr5[2] = (double) f5;
                this.f18799a.mo22778d(i, next.f18828a, f2, f4, f5, f3);
                i++;
                c = 0;
            }
            this.f18799a.mo22779e(f);
            this.f18798a = dc0.m13061a(0, dArr, dArr2);
        }
    }

    /* renamed from: k */
    public boolean mo22771k() {
        return this.f18802b == 1;
    }

    public String toString() {
        String str = this.f18800a;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<C3218g> it = this.f18801a.iterator();
        while (it.hasNext()) {
            C3218g next = it.next();
            str = str + "[" + next.f18828a + " , " + decimalFormat.format((double) next.f18827a) + "] ";
        }
        return str;
    }
}
