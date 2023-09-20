package com.onedelhi.secure;

public final class hz6 implements gz6 {

    /* renamed from: a */
    public static final ei6 f13385a;

    /* renamed from: b */
    public static final ei6 f13386b;

    /* renamed from: c */
    public static final ei6 f13387c;

    /* renamed from: d */
    public static final ei6 f13388d;

    /* renamed from: e */
    public static final ei6 f13389e;

    static {
        dh6 a = new dh6(gg6.m15836a("com.google.android.gms.measurement")).mo14667a();
        f13385a = a.mo14672f("measurement.test.boolean_flag", false);
        f13386b = a.mo14669c("measurement.test.double_flag", -3.0d);
        f13387c = a.mo14670d("measurement.test.int_flag", -2);
        f13388d = a.mo14670d("measurement.test.long_flag", -1);
        f13389e = a.mo14671e("measurement.test.string_flag", "---");
    }

    /* renamed from: a */
    public final long mo17028a() {
        return ((Long) f13387c.mo15196b()).longValue();
    }

    /* renamed from: b */
    public final String mo17029b() {
        return (String) f13389e.mo15196b();
    }

    /* renamed from: c */
    public final long mo17030c() {
        return ((Long) f13388d.mo15196b()).longValue();
    }

    /* renamed from: d */
    public final double mo17031d() {
        return ((Double) f13386b.mo15196b()).doubleValue();
    }

    /* renamed from: e */
    public final boolean mo17032e() {
        return ((Boolean) f13385a.mo15196b()).booleanValue();
    }
}
