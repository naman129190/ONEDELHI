package com.onedelhi.secure;

public class hs3 extends ur0 {

    /* renamed from: a */
    public static final boolean f13248a = false;

    /* renamed from: a */
    public double f13249a;

    /* renamed from: b */
    public double f13250b;

    /* renamed from: c */
    public double f13251c;

    public hs3(String str) {
        this.f21506a = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.f13249a = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i = indexOf2 + 1;
        this.f13250b = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    /* renamed from: a */
    public double mo17398a(double d) {
        return mo17401e(d);
    }

    /* renamed from: b */
    public double mo17399b(double d) {
        return mo17400d(d);
    }

    /* renamed from: d */
    public final double mo17400d(double d) {
        double d2 = this.f13250b;
        if (d < d2) {
            double d3 = this.f13249a;
            return ((d3 * d2) * d2) / ((((d2 - d) * d3) + d) * ((d3 * (d2 - d)) + d));
        }
        double d4 = this.f13249a;
        return (((d2 - 1.0d) * d4) * (d2 - 1.0d)) / (((((-d4) * (d2 - d)) - d) + 1.0d) * ((((-d4) * (d2 - d)) - d) + 1.0d));
    }

    /* renamed from: e */
    public final double mo17401e(double d) {
        double d2 = this.f13250b;
        return d < d2 ? (d2 * d) / (d + (this.f13249a * (d2 - d))) : ((1.0d - d2) * (d - 1.0d)) / ((1.0d - d) - (this.f13249a * (d2 - d)));
    }
}
