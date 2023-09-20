package com.onedelhi.secure;

public final class jr4 extends az2 {

    /* renamed from: a */
    public final char f30915a;

    /* renamed from: a */
    public final int f30916a;

    /* renamed from: a */
    public final String f30917a;

    /* renamed from: b */
    public final String f30918b;

    /* renamed from: c */
    public final String f30919c;

    /* renamed from: d */
    public final String f30920d;

    /* renamed from: e */
    public final String f30921e;

    /* renamed from: f */
    public final String f30922f;

    /* renamed from: g */
    public final String f30923g;

    public jr4(String str, String str2, String str3, String str4, String str5, String str6, int i, char c, String str7) {
        super(bz2.VIN);
        this.f30917a = str;
        this.f30918b = str2;
        this.f30919c = str3;
        this.f30920d = str4;
        this.f30921e = str5;
        this.f30922f = str6;
        this.f30916a = i;
        this.f30915a = c;
        this.f30923g = str7;
    }

    /* renamed from: a */
    public String mo31271a() {
        StringBuilder sb = new StringBuilder(50);
        sb.append(this.f30918b);
        sb.append(' ');
        sb.append(this.f30919c);
        sb.append(' ');
        sb.append(this.f30920d);
        sb.append(10);
        String str = this.f30921e;
        if (str != null) {
            sb.append(str);
            sb.append(' ');
        }
        sb.append(this.f30916a);
        sb.append(' ');
        sb.append(this.f30915a);
        sb.append(' ');
        sb.append(this.f30923g);
        sb.append(10);
        return sb.toString();
    }

    /* renamed from: e */
    public String mo38828e() {
        return this.f30921e;
    }

    /* renamed from: f */
    public int mo38829f() {
        return this.f30916a;
    }

    /* renamed from: g */
    public char mo38830g() {
        return this.f30915a;
    }

    /* renamed from: h */
    public String mo38831h() {
        return this.f30923g;
    }

    /* renamed from: i */
    public String mo38832i() {
        return this.f30917a;
    }

    /* renamed from: j */
    public String mo38833j() {
        return this.f30922f;
    }

    /* renamed from: k */
    public String mo38834k() {
        return this.f30919c;
    }

    /* renamed from: l */
    public String mo38835l() {
        return this.f30920d;
    }

    /* renamed from: m */
    public String mo38836m() {
        return this.f30918b;
    }
}
