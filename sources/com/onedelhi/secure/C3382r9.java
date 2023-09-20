package com.onedelhi.secure;

import java.util.Arrays;

/* renamed from: com.onedelhi.secure.r9 */
public class C3382r9 extends dc0 {

    /* renamed from: d */
    public static final int f19688d = 1;

    /* renamed from: e */
    public static final int f19689e = 2;

    /* renamed from: f */
    public static final int f19690f = 3;

    /* renamed from: g */
    public static final int f19691g = 0;

    /* renamed from: h */
    public static final int f19692h = 1;

    /* renamed from: i */
    public static final int f19693i = 2;

    /* renamed from: j */
    public static final int f19694j = 3;

    /* renamed from: a */
    public boolean f19695a = true;

    /* renamed from: a */
    public final double[] f19696a;

    /* renamed from: a */
    public C3383a[] f19697a;

    /* renamed from: com.onedelhi.secure.r9$a */
    public static class C3383a {

        /* renamed from: a */
        public static final String f19698a = "Arc";

        /* renamed from: b */
        public static double[] f19699b = new double[91];

        /* renamed from: p */
        public static final double f19700p = 0.001d;

        /* renamed from: a */
        public double f19701a;

        /* renamed from: a */
        public boolean f19702a;

        /* renamed from: a */
        public double[] f19703a;

        /* renamed from: b */
        public double f19704b;

        /* renamed from: b */
        public boolean f19705b = false;

        /* renamed from: c */
        public double f19706c;

        /* renamed from: d */
        public double f19707d;

        /* renamed from: e */
        public double f19708e;

        /* renamed from: f */
        public double f19709f;

        /* renamed from: g */
        public double f19710g;

        /* renamed from: h */
        public double f19711h;

        /* renamed from: i */
        public double f19712i;

        /* renamed from: j */
        public double f19713j;

        /* renamed from: k */
        public double f19714k;

        /* renamed from: l */
        public double f19715l;

        /* renamed from: m */
        public double f19716m;

        /* renamed from: n */
        public double f19717n;

        /* renamed from: o */
        public double f19718o;

        public C3383a(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            int i2 = i;
            double d7 = d;
            double d8 = d2;
            double d9 = d3;
            double d10 = d4;
            double d11 = d5;
            double d12 = d6;
            boolean z = false;
            int i3 = 1;
            this.f19702a = i2 == 1 ? true : z;
            this.f19704b = d7;
            this.f19706c = d8;
            this.f19711h = 1.0d / (d8 - d7);
            if (3 == i2) {
                this.f19705b = true;
            }
            double d13 = d11 - d9;
            double d14 = d12 - d10;
            if (this.f19705b || Math.abs(d13) < 0.001d || Math.abs(d14) < 0.001d) {
                this.f19705b = true;
                this.f19707d = d9;
                this.f19708e = d11;
                this.f19709f = d10;
                this.f19710g = d6;
                double hypot = Math.hypot(d14, d13);
                this.f19701a = hypot;
                this.f19716m = hypot * this.f19711h;
                double d15 = this.f19706c;
                double d16 = this.f19704b;
                this.f19714k = d13 / (d15 - d16);
                this.f19715l = d14 / (d15 - d16);
                return;
            }
            this.f19703a = new double[101];
            boolean z2 = this.f19702a;
            this.f19712i = d13 * ((double) (z2 ? -1 : 1));
            this.f19713j = d14 * ((double) (!z2 ? -1 : i3));
            this.f19714k = z2 ? d11 : d9;
            this.f19715l = z2 ? d10 : d6;
            mo23716a(d3, d4, d5, d6);
            this.f19716m = this.f19701a * this.f19711h;
        }

        /* renamed from: a */
        public final void mo23716a(double d, double d2, double d3, double d4) {
            double d5;
            double d6 = d3 - d;
            double d7 = d2 - d4;
            int i = 0;
            double d8 = 0.0d;
            double d9 = 0.0d;
            double d10 = 0.0d;
            while (true) {
                double[] dArr = f19699b;
                if (i >= dArr.length) {
                    break;
                }
                double d11 = d8;
                double radians = Math.toRadians((((double) i) * 90.0d) / ((double) (dArr.length - 1)));
                double sin = Math.sin(radians) * d6;
                double cos = Math.cos(radians) * d7;
                if (i > 0) {
                    d5 = Math.hypot(sin - d9, cos - d10) + d11;
                    f19699b[i] = d5;
                } else {
                    d5 = d11;
                }
                i++;
                d10 = cos;
                double d12 = sin;
                d8 = d5;
                d9 = d12;
            }
            double d13 = d8;
            this.f19701a = d13;
            int i2 = 0;
            while (true) {
                double[] dArr2 = f19699b;
                if (i2 >= dArr2.length) {
                    break;
                }
                dArr2[i2] = dArr2[i2] / d13;
                i2++;
            }
            int i3 = 0;
            while (true) {
                double[] dArr3 = this.f19703a;
                if (i3 < dArr3.length) {
                    double length = ((double) i3) / ((double) (dArr3.length - 1));
                    int binarySearch = Arrays.binarySearch(f19699b, length);
                    if (binarySearch >= 0) {
                        this.f19703a[i3] = ((double) binarySearch) / ((double) (f19699b.length - 1));
                    } else if (binarySearch == -1) {
                        this.f19703a[i3] = 0.0d;
                    } else {
                        int i4 = -binarySearch;
                        int i5 = i4 - 2;
                        double[] dArr4 = f19699b;
                        this.f19703a[i3] = (((double) i5) + ((length - dArr4[i5]) / (dArr4[i4 - 1] - dArr4[i5]))) / ((double) (dArr4.length - 1));
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public double mo23717b() {
            double d = this.f19712i * this.f19718o;
            double hypot = this.f19716m / Math.hypot(d, (-this.f19713j) * this.f19717n);
            if (this.f19702a) {
                d = -d;
            }
            return d * hypot;
        }

        /* renamed from: c */
        public double mo23718c() {
            double d = this.f19712i * this.f19718o;
            double d2 = (-this.f19713j) * this.f19717n;
            double hypot = this.f19716m / Math.hypot(d, d2);
            return this.f19702a ? (-d2) * hypot : d2 * hypot;
        }

        /* renamed from: d */
        public double mo23719d(double d) {
            return this.f19714k;
        }

        /* renamed from: e */
        public double mo23720e(double d) {
            return this.f19715l;
        }

        /* renamed from: f */
        public double mo23721f(double d) {
            double d2 = (d - this.f19704b) * this.f19711h;
            double d3 = this.f19707d;
            return d3 + (d2 * (this.f19708e - d3));
        }

        /* renamed from: g */
        public double mo23722g(double d) {
            double d2 = (d - this.f19704b) * this.f19711h;
            double d3 = this.f19709f;
            return d3 + (d2 * (this.f19710g - d3));
        }

        /* renamed from: h */
        public double mo23723h() {
            return this.f19714k + (this.f19712i * this.f19717n);
        }

        /* renamed from: i */
        public double mo23724i() {
            return this.f19715l + (this.f19713j * this.f19718o);
        }

        /* renamed from: j */
        public double mo23725j(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f19703a;
            double length = d * ((double) (dArr.length - 1));
            int i = (int) length;
            return dArr[i] + ((length - ((double) i)) * (dArr[i + 1] - dArr[i]));
        }

        /* renamed from: k */
        public void mo23726k(double d) {
            double j = mo23725j((this.f19702a ? this.f19706c - d : d - this.f19704b) * this.f19711h) * 1.5707963267948966d;
            this.f19717n = Math.sin(j);
            this.f19718o = Math.cos(j);
        }
    }

    public C3382r9(int[] iArr, double[] dArr, double[][] dArr2) {
        double[] dArr3 = dArr;
        this.f19696a = dArr3;
        this.f19697a = new C3383a[(dArr3.length - 1)];
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (true) {
            C3383a[] aVarArr = this.f19697a;
            if (i < aVarArr.length) {
                int i4 = iArr[i];
                if (i4 == 0) {
                    i3 = 3;
                } else if (i4 == 1) {
                    i2 = 1;
                    i3 = 1;
                } else if (i4 == 2) {
                    i2 = 2;
                    i3 = 2;
                } else if (i4 == 3) {
                    i2 = i2 == 1 ? 2 : 1;
                    i3 = i2;
                }
                int i5 = i + 1;
                aVarArr[i] = new C3383a(i3, dArr3[i], dArr3[i5], dArr2[i][0], dArr2[i][1], dArr2[i5][0], dArr2[i5][1]);
                i = i5;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public double mo14610c(double d, int i) {
        double d2;
        double g;
        double e;
        double i2;
        double c;
        int i3 = 0;
        if (this.f19695a) {
            C3383a[] aVarArr = this.f19697a;
            if (d < aVarArr[0].f19704b) {
                double d3 = aVarArr[0].f19704b;
                d2 = d - aVarArr[0].f19704b;
                if (!aVarArr[0].f19705b) {
                    aVarArr[0].mo23726k(d3);
                    if (i == 0) {
                        i2 = this.f19697a[0].mo23723h();
                        c = this.f19697a[0].mo23717b();
                    } else {
                        i2 = this.f19697a[0].mo23724i();
                        c = this.f19697a[0].mo23718c();
                    }
                    return i2 + (d2 * c);
                } else if (i == 0) {
                    g = aVarArr[0].mo23721f(d3);
                    e = this.f19697a[0].mo23719d(d3);
                } else {
                    g = aVarArr[0].mo23722g(d3);
                    e = this.f19697a[0].mo23720e(d3);
                }
            } else if (d > aVarArr[aVarArr.length - 1].f19706c) {
                double d4 = aVarArr[aVarArr.length - 1].f19706c;
                d2 = d - d4;
                int length = aVarArr.length - 1;
                if (i == 0) {
                    g = aVarArr[length].mo23721f(d4);
                    e = this.f19697a[length].mo23719d(d4);
                } else {
                    g = aVarArr[length].mo23722g(d4);
                    e = this.f19697a[length].mo23720e(d4);
                }
            }
            return g + (d2 * e);
        }
        C3383a[] aVarArr2 = this.f19697a;
        if (d < aVarArr2[0].f19704b) {
            d = aVarArr2[0].f19704b;
        } else if (d > aVarArr2[aVarArr2.length - 1].f19706c) {
            d = aVarArr2[aVarArr2.length - 1].f19706c;
        }
        while (true) {
            C3383a[] aVarArr3 = this.f19697a;
            if (i3 >= aVarArr3.length) {
                return Double.NaN;
            }
            if (d > aVarArr3[i3].f19706c) {
                i3++;
            } else if (aVarArr3[i3].f19705b) {
                return i == 0 ? aVarArr3[i3].mo23721f(d) : aVarArr3[i3].mo23722g(d);
            } else {
                aVarArr3[i3].mo23726k(d);
                C3383a[] aVarArr4 = this.f19697a;
                return i == 0 ? aVarArr4[i3].mo23723h() : aVarArr4[i3].mo23724i();
            }
        }
    }

    /* renamed from: d */
    public void mo14611d(double d, double[] dArr) {
        if (this.f19695a) {
            C3383a[] aVarArr = this.f19697a;
            if (d < aVarArr[0].f19704b) {
                double d2 = aVarArr[0].f19704b;
                double d3 = d - aVarArr[0].f19704b;
                if (aVarArr[0].f19705b) {
                    dArr[0] = aVarArr[0].mo23721f(d2) + (this.f19697a[0].mo23719d(d2) * d3);
                    dArr[1] = this.f19697a[0].mo23722g(d2) + (d3 * this.f19697a[0].mo23720e(d2));
                    return;
                }
                aVarArr[0].mo23726k(d2);
                dArr[0] = this.f19697a[0].mo23723h() + (this.f19697a[0].mo23717b() * d3);
                dArr[1] = this.f19697a[0].mo23724i() + (d3 * this.f19697a[0].mo23718c());
                return;
            } else if (d > aVarArr[aVarArr.length - 1].f19706c) {
                double d4 = aVarArr[aVarArr.length - 1].f19706c;
                double d5 = d - d4;
                int length = aVarArr.length - 1;
                if (aVarArr[length].f19705b) {
                    dArr[0] = aVarArr[length].mo23721f(d4) + (this.f19697a[length].mo23719d(d4) * d5);
                    dArr[1] = this.f19697a[length].mo23722g(d4) + (d5 * this.f19697a[length].mo23720e(d4));
                    return;
                }
                aVarArr[length].mo23726k(d);
                dArr[0] = this.f19697a[length].mo23723h() + (this.f19697a[length].mo23717b() * d5);
                dArr[1] = this.f19697a[length].mo23724i() + (d5 * this.f19697a[length].mo23718c());
                return;
            }
        } else {
            C3383a[] aVarArr2 = this.f19697a;
            if (d < aVarArr2[0].f19704b) {
                d = aVarArr2[0].f19704b;
            }
            if (d > aVarArr2[aVarArr2.length - 1].f19706c) {
                d = aVarArr2[aVarArr2.length - 1].f19706c;
            }
        }
        int i = 0;
        while (true) {
            C3383a[] aVarArr3 = this.f19697a;
            if (i >= aVarArr3.length) {
                return;
            }
            if (d > aVarArr3[i].f19706c) {
                i++;
            } else if (aVarArr3[i].f19705b) {
                dArr[0] = aVarArr3[i].mo23721f(d);
                dArr[1] = this.f19697a[i].mo23722g(d);
                return;
            } else {
                aVarArr3[i].mo23726k(d);
                dArr[0] = this.f19697a[i].mo23723h();
                dArr[1] = this.f19697a[i].mo23724i();
                return;
            }
        }
    }

    /* renamed from: e */
    public void mo14612e(double d, float[] fArr) {
        if (this.f19695a) {
            C3383a[] aVarArr = this.f19697a;
            if (d < aVarArr[0].f19704b) {
                double d2 = aVarArr[0].f19704b;
                double d3 = d - aVarArr[0].f19704b;
                if (aVarArr[0].f19705b) {
                    fArr[0] = (float) (aVarArr[0].mo23721f(d2) + (this.f19697a[0].mo23719d(d2) * d3));
                    fArr[1] = (float) (this.f19697a[0].mo23722g(d2) + (d3 * this.f19697a[0].mo23720e(d2)));
                    return;
                }
                aVarArr[0].mo23726k(d2);
                fArr[0] = (float) (this.f19697a[0].mo23723h() + (this.f19697a[0].mo23717b() * d3));
                fArr[1] = (float) (this.f19697a[0].mo23724i() + (d3 * this.f19697a[0].mo23718c()));
                return;
            } else if (d > aVarArr[aVarArr.length - 1].f19706c) {
                double d4 = aVarArr[aVarArr.length - 1].f19706c;
                double d5 = d - d4;
                int length = aVarArr.length - 1;
                if (aVarArr[length].f19705b) {
                    fArr[0] = (float) (aVarArr[length].mo23721f(d4) + (this.f19697a[length].mo23719d(d4) * d5));
                    fArr[1] = (float) (this.f19697a[length].mo23722g(d4) + (d5 * this.f19697a[length].mo23720e(d4)));
                    return;
                }
                aVarArr[length].mo23726k(d);
                fArr[0] = (float) this.f19697a[length].mo23723h();
                fArr[1] = (float) this.f19697a[length].mo23724i();
                return;
            }
        } else {
            C3383a[] aVarArr2 = this.f19697a;
            if (d < aVarArr2[0].f19704b) {
                d = aVarArr2[0].f19704b;
            } else if (d > aVarArr2[aVarArr2.length - 1].f19706c) {
                d = aVarArr2[aVarArr2.length - 1].f19706c;
            }
        }
        int i = 0;
        while (true) {
            C3383a[] aVarArr3 = this.f19697a;
            if (i >= aVarArr3.length) {
                return;
            }
            if (d > aVarArr3[i].f19706c) {
                i++;
            } else if (aVarArr3[i].f19705b) {
                fArr[0] = (float) aVarArr3[i].mo23721f(d);
                fArr[1] = (float) this.f19697a[i].mo23722g(d);
                return;
            } else {
                aVarArr3[i].mo23726k(d);
                fArr[0] = (float) this.f19697a[i].mo23723h();
                fArr[1] = (float) this.f19697a[i].mo23724i();
                return;
            }
        }
    }

    /* renamed from: f */
    public double mo14613f(double d, int i) {
        C3383a[] aVarArr = this.f19697a;
        int i2 = 0;
        if (d < aVarArr[0].f19704b) {
            d = aVarArr[0].f19704b;
        }
        if (d > aVarArr[aVarArr.length - 1].f19706c) {
            d = aVarArr[aVarArr.length - 1].f19706c;
        }
        while (true) {
            C3383a[] aVarArr2 = this.f19697a;
            if (i2 >= aVarArr2.length) {
                return Double.NaN;
            }
            if (d > aVarArr2[i2].f19706c) {
                i2++;
            } else if (aVarArr2[i2].f19705b) {
                return i == 0 ? aVarArr2[i2].mo23719d(d) : aVarArr2[i2].mo23720e(d);
            } else {
                aVarArr2[i2].mo23726k(d);
                C3383a[] aVarArr3 = this.f19697a;
                return i == 0 ? aVarArr3[i2].mo23717b() : aVarArr3[i2].mo23718c();
            }
        }
    }

    /* renamed from: g */
    public void mo14614g(double d, double[] dArr) {
        C3383a[] aVarArr = this.f19697a;
        if (d < aVarArr[0].f19704b) {
            d = aVarArr[0].f19704b;
        } else if (d > aVarArr[aVarArr.length - 1].f19706c) {
            d = aVarArr[aVarArr.length - 1].f19706c;
        }
        int i = 0;
        while (true) {
            C3383a[] aVarArr2 = this.f19697a;
            if (i >= aVarArr2.length) {
                return;
            }
            if (d > aVarArr2[i].f19706c) {
                i++;
            } else if (aVarArr2[i].f19705b) {
                dArr[0] = aVarArr2[i].mo23719d(d);
                dArr[1] = this.f19697a[i].mo23720e(d);
                return;
            } else {
                aVarArr2[i].mo23726k(d);
                dArr[0] = this.f19697a[i].mo23717b();
                dArr[1] = this.f19697a[i].mo23718c();
                return;
            }
        }
    }

    /* renamed from: h */
    public double[] mo14615h() {
        return this.f19696a;
    }
}
