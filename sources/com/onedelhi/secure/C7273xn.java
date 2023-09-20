package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.xn */
public class C7273xn {

    /* renamed from: a */
    public final double f37551a;

    /* renamed from: b */
    public final double f37552b;

    /* renamed from: c */
    public final double f37553c;

    /* renamed from: d */
    public final double f37554d;

    /* renamed from: e */
    public final double f37555e;

    /* renamed from: f */
    public final double f37556f;

    public C7273xn(double d, double d2, double d3, double d4) {
        this.f37551a = d;
        this.f37552b = d3;
        this.f37553c = d2;
        this.f37554d = d4;
        this.f37555e = (d + d2) / 2.0d;
        this.f37556f = (d3 + d4) / 2.0d;
    }

    /* renamed from: a */
    public boolean mo47365a(double d, double d2) {
        return this.f37551a <= d && d <= this.f37553c && this.f37552b <= d2 && d2 <= this.f37554d;
    }

    /* renamed from: b */
    public boolean mo47366b(C7273xn xnVar) {
        return xnVar.f37551a >= this.f37551a && xnVar.f37553c <= this.f37553c && xnVar.f37552b >= this.f37552b && xnVar.f37554d <= this.f37554d;
    }

    /* renamed from: c */
    public boolean mo47367c(v23 v23) {
        return mo47365a(v23.f36408a, v23.f36409b);
    }

    /* renamed from: d */
    public boolean mo47368d(double d, double d2, double d3, double d4) {
        return d < this.f37553c && this.f37551a < d2 && d3 < this.f37554d && this.f37552b < d4;
    }

    /* renamed from: e */
    public boolean mo47369e(C7273xn xnVar) {
        return mo47368d(xnVar.f37551a, xnVar.f37553c, xnVar.f37552b, xnVar.f37554d);
    }
}
