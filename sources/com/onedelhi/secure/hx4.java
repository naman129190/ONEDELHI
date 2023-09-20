package com.onedelhi.secure;

public final class hx4 extends az2 {

    /* renamed from: a */
    public final String f29898a;

    /* renamed from: a */
    public final boolean f29899a;

    /* renamed from: b */
    public final String f29900b;

    /* renamed from: c */
    public final String f29901c;

    /* renamed from: d */
    public final String f29902d;

    /* renamed from: e */
    public final String f29903e;

    /* renamed from: f */
    public final String f29904f;

    /* renamed from: g */
    public final String f29905g;

    public hx4(String str, String str2, String str3) {
        this(str, str2, str3, false);
    }

    public hx4(String str, String str2, String str3, boolean z) {
        this(str, str2, str3, z, (String) null, (String) null, (String) null, (String) null);
    }

    public hx4(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7) {
        super(bz2.WIFI);
        this.f29898a = str2;
        this.f29900b = str;
        this.f29901c = str3;
        this.f29899a = z;
        this.f29902d = str4;
        this.f29903e = str5;
        this.f29904f = str6;
        this.f29905g = str7;
    }

    /* renamed from: a */
    public String mo31271a() {
        StringBuilder sb = new StringBuilder(80);
        az2.m39207c(this.f29898a, sb);
        az2.m39207c(this.f29900b, sb);
        az2.m39207c(this.f29901c, sb);
        az2.m39207c(Boolean.toString(this.f29899a), sb);
        return sb.toString();
    }

    /* renamed from: e */
    public String mo37637e() {
        return this.f29903e;
    }

    /* renamed from: f */
    public String mo37638f() {
        return this.f29904f;
    }

    /* renamed from: g */
    public String mo37639g() {
        return this.f29902d;
    }

    /* renamed from: h */
    public String mo37640h() {
        return this.f29900b;
    }

    /* renamed from: i */
    public String mo37641i() {
        return this.f29901c;
    }

    /* renamed from: j */
    public String mo37642j() {
        return this.f29905g;
    }

    /* renamed from: k */
    public String mo37643k() {
        return this.f29898a;
    }

    /* renamed from: l */
    public boolean mo37644l() {
        return this.f29899a;
    }
}
