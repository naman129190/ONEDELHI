package com.onedelhi.secure;

public final class ja4 extends az2 {

    /* renamed from: a */
    public final String f30720a;

    /* renamed from: b */
    public final String f30721b;

    /* renamed from: c */
    public final String f30722c;

    public ja4(String str, String str2, String str3) {
        super(bz2.TEL);
        this.f30720a = str;
        this.f30721b = str2;
        this.f30722c = str3;
    }

    /* renamed from: a */
    public String mo31271a() {
        StringBuilder sb = new StringBuilder(20);
        az2.m39207c(this.f30720a, sb);
        az2.m39207c(this.f30722c, sb);
        return sb.toString();
    }

    /* renamed from: e */
    public String mo38591e() {
        return this.f30720a;
    }

    /* renamed from: f */
    public String mo38592f() {
        return this.f30721b;
    }

    /* renamed from: g */
    public String mo38593g() {
        return this.f30722c;
    }
}
