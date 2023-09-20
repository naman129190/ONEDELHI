package com.onedelhi.secure;

public final class ls0 extends az2 {

    /* renamed from: a */
    public final String f31827a;

    /* renamed from: a */
    public final String[] f31828a;

    /* renamed from: b */
    public final String f31829b;

    /* renamed from: b */
    public final String[] f31830b;

    /* renamed from: c */
    public final String[] f31831c;

    public ls0(String str) {
        this(new String[]{str}, (String[]) null, (String[]) null, (String) null, (String) null);
    }

    public ls0(String[] strArr, String[] strArr2, String[] strArr3, String str, String str2) {
        super(bz2.EMAIL_ADDRESS);
        this.f31828a = strArr;
        this.f31830b = strArr2;
        this.f31831c = strArr3;
        this.f31827a = str;
        this.f31829b = str2;
    }

    /* renamed from: a */
    public String mo31271a() {
        StringBuilder sb = new StringBuilder(30);
        az2.m39208d(this.f31828a, sb);
        az2.m39208d(this.f31830b, sb);
        az2.m39208d(this.f31831c, sb);
        az2.m39207c(this.f31827a, sb);
        az2.m39207c(this.f31829b, sb);
        return sb.toString();
    }

    /* renamed from: e */
    public String[] mo40269e() {
        return this.f31831c;
    }

    /* renamed from: f */
    public String mo40270f() {
        return this.f31829b;
    }

    /* renamed from: g */
    public String[] mo40271g() {
        return this.f31830b;
    }

    @Deprecated
    /* renamed from: h */
    public String mo40272h() {
        String[] strArr = this.f31828a;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return strArr[0];
    }

    @Deprecated
    /* renamed from: i */
    public String mo40273i() {
        return tb2.f20728a;
    }

    /* renamed from: j */
    public String mo40274j() {
        return this.f31827a;
    }

    /* renamed from: k */
    public String[] mo40275k() {
        return this.f31828a;
    }
}
