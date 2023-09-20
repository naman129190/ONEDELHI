package com.onedelhi.secure;

import java.io.PrintStream;
import java.util.Arrays;

public class ur0 {

    /* renamed from: a */
    public static ur0 f21492a = new ur0();

    /* renamed from: a */
    public static String[] f21493a = {f21502j, f21501i, f21500h, f21503k};

    /* renamed from: b */
    public static final String f21494b = "cubic(0.4, 0.0, 0.2, 1)";

    /* renamed from: c */
    public static final String f21495c = "cubic(0.4, 0.05, 0.8, 0.7)";

    /* renamed from: d */
    public static final String f21496d = "cubic(0.0, 0.0, 0.2, 0.95)";

    /* renamed from: e */
    public static final String f21497e = "cubic(1, 1, 0, 0)";

    /* renamed from: f */
    public static final String f21498f = "cubic(0.36, 0, 0.66, -0.56)";

    /* renamed from: g */
    public static final String f21499g = "cubic(0.34, 1.56, 0.64, 1)";

    /* renamed from: h */
    public static final String f21500h = "decelerate";

    /* renamed from: i */
    public static final String f21501i = "accelerate";

    /* renamed from: j */
    public static final String f21502j = "standard";

    /* renamed from: k */
    public static final String f21503k = "linear";

    /* renamed from: l */
    public static final String f21504l = "anticipate";

    /* renamed from: m */
    public static final String f21505m = "overshoot";

    /* renamed from: a */
    public String f21506a = "identity";

    /* renamed from: com.onedelhi.secure.ur0$a */
    public static class C3739a extends ur0 {

        /* renamed from: e */
        public static double f21507e = 0.01d;

        /* renamed from: f */
        public static double f21508f = 1.0E-4d;

        /* renamed from: a */
        public double f21509a;

        /* renamed from: b */
        public double f21510b;

        /* renamed from: c */
        public double f21511c;

        /* renamed from: d */
        public double f21512d;

        public C3739a(double d, double d2, double d3, double d4) {
            mo25716h(d, d2, d3, d4);
        }

        public C3739a(String str) {
            this.f21506a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.f21509a = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i);
            this.f21510b = Double.parseDouble(str.substring(i, indexOf3).trim());
            int i2 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i2);
            this.f21511c = Double.parseDouble(str.substring(i2, indexOf4).trim());
            int i3 = indexOf4 + 1;
            this.f21512d = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        /* renamed from: a */
        public double mo17398a(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f21507e) {
                d2 *= 0.5d;
                d3 = mo25714f(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double f = mo25714f(d4);
            double d5 = d3 + d2;
            double f2 = mo25714f(d5);
            double g = mo25715g(d4);
            return (((mo25715g(d5) - g) * (d - f)) / (f2 - f)) + g;
        }

        /* renamed from: b */
        public double mo17399b(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f21508f) {
                d2 *= 0.5d;
                d3 = mo25714f(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double d5 = d3 + d2;
            return (mo25715g(d5) - mo25715g(d4)) / (mo25714f(d5) - mo25714f(d4));
        }

        /* renamed from: d */
        public final double mo25712d(double d) {
            double d2 = 1.0d - d;
            double d3 = this.f21509a;
            double d4 = this.f21511c;
            return (d2 * 3.0d * d2 * d3) + (d2 * 6.0d * d * (d4 - d3)) + (3.0d * d * d * (1.0d - d4));
        }

        /* renamed from: e */
        public final double mo25713e(double d) {
            double d2 = 1.0d - d;
            double d3 = this.f21510b;
            double d4 = this.f21512d;
            return (d2 * 3.0d * d2 * d3) + (d2 * 6.0d * d * (d4 - d3)) + (3.0d * d * d * (1.0d - d4));
        }

        /* renamed from: f */
        public final double mo25714f(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f21509a * d2 * d3 * d) + (this.f21511c * d3 * d * d) + (d * d * d);
        }

        /* renamed from: g */
        public final double mo25715g(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f21510b * d2 * d3 * d) + (this.f21512d * d3 * d * d) + (d * d * d);
        }

        /* renamed from: h */
        public void mo25716h(double d, double d2, double d3, double d4) {
            this.f21509a = d;
            this.f21510b = d2;
            this.f21511c = d3;
            this.f21512d = d4;
        }
    }

    /* renamed from: c */
    public static ur0 m29534c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new C3739a(str);
        }
        if (str.startsWith("spline")) {
            return new u34(str);
        }
        if (str.startsWith("Schlick")) {
            return new hs3(str);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals(f21501i)) {
                    c = 0;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals(f21500h)) {
                    c = 1;
                    break;
                }
                break;
            case -1197605014:
                if (str.equals(f21504l)) {
                    c = 2;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals(f21503k)) {
                    c = 3;
                    break;
                }
                break;
            case -749065269:
                if (str.equals(f21505m)) {
                    c = 4;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals(f21502j)) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C3739a(f21495c);
            case 1:
                return new C3739a(f21496d);
            case 2:
                return new C3739a(f21498f);
            case 3:
                return new C3739a(f21497e);
            case 4:
                return new C3739a(f21499g);
            case 5:
                return new C3739a(f21494b);
            default:
                PrintStream printStream = System.err;
                printStream.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f21493a));
                return f21492a;
        }
    }

    /* renamed from: a */
    public double mo17398a(double d) {
        return d;
    }

    /* renamed from: b */
    public double mo17399b(double d) {
        return 1.0d;
    }

    public String toString() {
        return this.f21506a;
    }
}
