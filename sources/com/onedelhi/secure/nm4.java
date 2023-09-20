package com.onedelhi.secure;

public final class nm4 extends az2 {

    /* renamed from: a */
    public final String f32645a;

    /* renamed from: b */
    public final String f32646b;

    public nm4(String str, String str2) {
        super(bz2.URI);
        this.f32645a = m58304i(str);
        this.f32646b = str2;
    }

    /* renamed from: g */
    public static boolean m58303g(String str, int i) {
        int i2 = i + 1;
        int indexOf = str.indexOf(47, i2);
        if (indexOf < 0) {
            indexOf = str.length();
        }
        return rl3.m63725e(str, i2, indexOf - i2);
    }

    /* renamed from: i */
    public static String m58304i(String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(58);
        return (indexOf < 0 || m58303g(trim, indexOf)) ? "http://".concat(trim) : trim;
    }

    /* renamed from: a */
    public String mo31271a() {
        StringBuilder sb = new StringBuilder(30);
        az2.m39207c(this.f32646b, sb);
        az2.m39207c(this.f32645a, sb);
        return sb.toString();
    }

    /* renamed from: e */
    public String mo41209e() {
        return this.f32646b;
    }

    /* renamed from: f */
    public String mo41210f() {
        return this.f32645a;
    }

    @Deprecated
    /* renamed from: h */
    public boolean mo41211h() {
        return om4.m59489r(this.f32645a);
    }
}
