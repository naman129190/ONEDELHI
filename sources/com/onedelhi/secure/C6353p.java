package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.p */
public final class C6353p extends C6808t {

    /* renamed from: b */
    public static final int f33396b = 8;

    /* renamed from: c */
    public static final int f33397c = 2;

    /* renamed from: d */
    public static final int f33398d = 10;

    public C6353p(C6014ll llVar) {
        super(llVar);
    }

    /* renamed from: d */
    public String mo41503d() throws tr2, ha1 {
        if (mo42996c().mo39935l() >= 48) {
            StringBuilder sb = new StringBuilder();
            mo44658f(sb, 8);
            int f = mo42995b().mo34329f(48, 2);
            sb.append("(393");
            sb.append(f);
            sb.append(')');
            int f2 = mo42995b().mo34329f(50, 10);
            if (f2 / 100 == 0) {
                sb.append('0');
            }
            if (f2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(f2);
            sb.append(mo42995b().mo34326c(60, (String) null).mo47144b());
            return sb.toString();
        }
        throw tr2.m66179a();
    }
}
