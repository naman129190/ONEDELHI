package com.onedelhi.secure;

public final class qf1 extends az2 {

    /* renamed from: a */
    public final double f34205a;

    /* renamed from: a */
    public final String f34206a;

    /* renamed from: b */
    public final double f34207b;

    /* renamed from: c */
    public final double f34208c;

    public qf1(double d, double d2, double d3, String str) {
        super(bz2.GEO);
        this.f34205a = d;
        this.f34207b = d2;
        this.f34208c = d3;
        this.f34206a = str;
    }

    /* renamed from: a */
    public String mo31271a() {
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.f34205a);
        sb.append(", ");
        sb.append(this.f34207b);
        if (this.f34208c > 0.0d) {
            sb.append(", ");
            sb.append(this.f34208c);
            sb.append('m');
        }
        if (this.f34206a != null) {
            sb.append(" (");
            sb.append(this.f34206a);
            sb.append(')');
        }
        return sb.toString();
    }

    /* renamed from: e */
    public double mo43518e() {
        return this.f34208c;
    }

    /* renamed from: f */
    public String mo43519f() {
        StringBuilder sb = new StringBuilder();
        sb.append("geo:");
        sb.append(this.f34205a);
        sb.append(',');
        sb.append(this.f34207b);
        if (this.f34208c > 0.0d) {
            sb.append(',');
            sb.append(this.f34208c);
        }
        if (this.f34206a != null) {
            sb.append('?');
            sb.append(this.f34206a);
        }
        return sb.toString();
    }

    /* renamed from: g */
    public double mo43520g() {
        return this.f34205a;
    }

    /* renamed from: h */
    public double mo43521h() {
        return this.f34207b;
    }

    /* renamed from: i */
    public String mo43522i() {
        return this.f34206a;
    }
}
