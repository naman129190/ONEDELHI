package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.q */
public final class C6490q extends C6912u {

    /* renamed from: b */
    public static final int f33852b = 8;

    /* renamed from: c */
    public static final int f33853c = 20;

    /* renamed from: d */
    public static final int f33854d = 16;

    /* renamed from: a */
    public final String f33855a;

    /* renamed from: b */
    public final String f33856b;

    public C6490q(C6014ll llVar, String str, String str2) {
        super(llVar);
        this.f33855a = str2;
        this.f33856b = str;
    }

    /* renamed from: d */
    public String mo41503d() throws tr2 {
        if (mo42996c().mo39935l() == 84) {
            StringBuilder sb = new StringBuilder();
            mo44658f(sb, 8);
            mo45345j(sb, 48, 20);
            mo42994k(sb, 68);
            return sb.toString();
        }
        throw tr2.m66179a();
    }

    /* renamed from: h */
    public void mo40309h(StringBuilder sb, int i) {
        sb.append('(');
        sb.append(this.f33856b);
        sb.append(i / BZip2Constants.BASEBLOCKSIZE);
        sb.append(')');
    }

    /* renamed from: i */
    public int mo40310i(int i) {
        return i % BZip2Constants.BASEBLOCKSIZE;
    }

    /* renamed from: k */
    public final void mo42994k(StringBuilder sb, int i) {
        int f = mo42995b().mo34329f(i, 16);
        if (f != 38400) {
            sb.append('(');
            sb.append(this.f33855a);
            sb.append(')');
            int i2 = f % 32;
            int i3 = f / 32;
            int i4 = (i3 % 12) + 1;
            int i5 = i3 / 12;
            if (i5 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i5);
            if (i4 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i4);
            if (i2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i2);
        }
    }
}
