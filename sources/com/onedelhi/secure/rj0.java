package com.onedelhi.secure;

public final class rj0 {

    /* renamed from: a */
    public final int f34657a;

    /* renamed from: a */
    public final z83<?> f34658a;

    /* renamed from: b */
    public final int f34659b;

    public rj0(z83<?> z83, int i, int i2) {
        this.f34658a = (z83) i43.m51839c(z83, "Null dependency anInterface.");
        this.f34657a = i;
        this.f34659b = i2;
    }

    public rj0(Class<?> cls, int i, int i2) {
        this(z83.m72650b(cls), i, i2);
    }

    /* renamed from: a */
    public static rj0 m63672a(z83<?> z83) {
        return new rj0(z83, 0, 2);
    }

    /* renamed from: b */
    public static rj0 m63673b(Class<?> cls) {
        return new rj0(cls, 0, 2);
    }

    /* renamed from: c */
    public static String m63674c(int i) {
        if (i == 0) {
            return tk0.f20958q;
        }
        if (i == 1) {
            return "provider";
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i);
    }

    @Deprecated
    /* renamed from: i */
    public static rj0 m63675i(Class<?> cls) {
        return new rj0(cls, 0, 0);
    }

    /* renamed from: j */
    public static rj0 m63676j(z83<?> z83) {
        return new rj0(z83, 0, 1);
    }

    /* renamed from: k */
    public static rj0 m63677k(Class<?> cls) {
        return new rj0(cls, 0, 1);
    }

    /* renamed from: l */
    public static rj0 m63678l(z83<?> z83) {
        return new rj0(z83, 1, 0);
    }

    /* renamed from: m */
    public static rj0 m63679m(Class<?> cls) {
        return new rj0(cls, 1, 0);
    }

    /* renamed from: n */
    public static rj0 m63680n(z83<?> z83) {
        return new rj0(z83, 1, 1);
    }

    /* renamed from: o */
    public static rj0 m63681o(Class<?> cls) {
        return new rj0(cls, 1, 1);
    }

    /* renamed from: p */
    public static rj0 m63682p(z83<?> z83) {
        return new rj0(z83, 2, 0);
    }

    /* renamed from: q */
    public static rj0 m63683q(Class<?> cls) {
        return new rj0(cls, 2, 0);
    }

    /* renamed from: r */
    public static rj0 m63684r(z83<?> z83) {
        return new rj0(z83, 2, 1);
    }

    /* renamed from: s */
    public static rj0 m63685s(Class<?> cls) {
        return new rj0(cls, 2, 1);
    }

    /* renamed from: d */
    public z83<?> mo43913d() {
        return this.f34658a;
    }

    /* renamed from: e */
    public boolean mo43914e() {
        return this.f34659b == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof rj0)) {
            return false;
        }
        rj0 rj0 = (rj0) obj;
        return this.f34658a.equals(rj0.f34658a) && this.f34657a == rj0.f34657a && this.f34659b == rj0.f34659b;
    }

    /* renamed from: f */
    public boolean mo43916f() {
        return this.f34659b == 0;
    }

    /* renamed from: g */
    public boolean mo43917g() {
        return this.f34657a == 1;
    }

    /* renamed from: h */
    public boolean mo43918h() {
        return this.f34657a == 2;
    }

    public int hashCode() {
        return ((((this.f34658a.hashCode() ^ 1000003) * 1000003) ^ this.f34657a) * 1000003) ^ this.f34659b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f34658a);
        sb.append(", type=");
        int i = this.f34657a;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(m63674c(this.f34659b));
        sb.append("}");
        return sb.toString();
    }
}
