package com.onedelhi.secure;

/* renamed from: com.onedelhi.secure.b4 */
public final class C4620b4 extends az2 {

    /* renamed from: a */
    public final String f26124a;

    /* renamed from: a */
    public final String[] f26125a;

    /* renamed from: b */
    public final String f26126b;

    /* renamed from: b */
    public final String[] f26127b;

    /* renamed from: c */
    public final String f26128c;

    /* renamed from: c */
    public final String[] f26129c;

    /* renamed from: d */
    public final String f26130d;

    /* renamed from: d */
    public final String[] f26131d;

    /* renamed from: e */
    public final String f26132e;

    /* renamed from: e */
    public final String[] f26133e;

    /* renamed from: f */
    public final String f26134f;

    /* renamed from: f */
    public final String[] f26135f;

    /* renamed from: g */
    public final String[] f26136g;

    /* renamed from: h */
    public final String[] f26137h;

    /* renamed from: i */
    public final String[] f26138i;

    /* renamed from: j */
    public final String[] f26139j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4620b4(String[] strArr, String[] strArr2, String str, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String str2, String str3, String[] strArr7, String[] strArr8, String str4, String str5, String str6, String[] strArr9, String[] strArr10) {
        super(bz2.ADDRESSBOOK);
        String[] strArr11 = strArr3;
        String[] strArr12 = strArr4;
        String[] strArr13 = strArr5;
        String[] strArr14 = strArr6;
        String[] strArr15 = strArr7;
        String[] strArr16 = strArr8;
        if (strArr11 != null && strArr12 != null && strArr11.length != strArr12.length) {
            throw new IllegalArgumentException("Phone numbers and types lengths differ");
        } else if (strArr13 != null && strArr14 != null && strArr13.length != strArr14.length) {
            throw new IllegalArgumentException("Emails and types lengths differ");
        } else if (strArr15 == null || strArr16 == null || strArr15.length == strArr16.length) {
            this.f26125a = strArr;
            this.f26127b = strArr2;
            this.f26124a = str;
            this.f26129c = strArr11;
            this.f26131d = strArr12;
            this.f26133e = strArr13;
            this.f26135f = strArr14;
            this.f26126b = str2;
            this.f26128c = str3;
            this.f26136g = strArr15;
            this.f26137h = strArr16;
            this.f26130d = str4;
            this.f26132e = str5;
            this.f26134f = str6;
            this.f26138i = strArr9;
            this.f26139j = strArr10;
        } else {
            throw new IllegalArgumentException("Addresses and types lengths differ");
        }
    }

    public C4620b4(String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String[] strArr7) {
        this(strArr, (String[]) null, (String) null, strArr2, strArr3, strArr4, strArr5, (String) null, (String) null, strArr6, strArr7, (String) null, (String) null, (String) null, (String[]) null, (String[]) null);
    }

    /* renamed from: a */
    public String mo31271a() {
        StringBuilder sb = new StringBuilder(100);
        az2.m39208d(this.f26125a, sb);
        az2.m39208d(this.f26127b, sb);
        az2.m39207c(this.f26124a, sb);
        az2.m39207c(this.f26134f, sb);
        az2.m39207c(this.f26130d, sb);
        az2.m39208d(this.f26136g, sb);
        az2.m39208d(this.f26129c, sb);
        az2.m39208d(this.f26133e, sb);
        az2.m39207c(this.f26126b, sb);
        az2.m39208d(this.f26138i, sb);
        az2.m39207c(this.f26132e, sb);
        az2.m39208d(this.f26139j, sb);
        az2.m39207c(this.f26128c, sb);
        return sb.toString();
    }

    /* renamed from: e */
    public String[] mo31352e() {
        return this.f26137h;
    }

    /* renamed from: f */
    public String[] mo31353f() {
        return this.f26136g;
    }

    /* renamed from: g */
    public String mo31354g() {
        return this.f26132e;
    }

    /* renamed from: h */
    public String[] mo31355h() {
        return this.f26135f;
    }

    /* renamed from: i */
    public String[] mo31356i() {
        return this.f26133e;
    }

    /* renamed from: j */
    public String[] mo31357j() {
        return this.f26139j;
    }

    /* renamed from: k */
    public String mo31358k() {
        return this.f26126b;
    }

    /* renamed from: l */
    public String[] mo31359l() {
        return this.f26125a;
    }

    /* renamed from: m */
    public String[] mo31360m() {
        return this.f26127b;
    }

    /* renamed from: n */
    public String mo31361n() {
        return this.f26128c;
    }

    /* renamed from: o */
    public String mo31362o() {
        return this.f26130d;
    }

    /* renamed from: p */
    public String[] mo31363p() {
        return this.f26129c;
    }

    /* renamed from: q */
    public String[] mo31364q() {
        return this.f26131d;
    }

    /* renamed from: r */
    public String mo31365r() {
        return this.f26124a;
    }

    /* renamed from: s */
    public String mo31366s() {
        return this.f26134f;
    }

    /* renamed from: t */
    public String[] mo31367t() {
        return this.f26138i;
    }
}
