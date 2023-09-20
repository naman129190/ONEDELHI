package com.onedelhi.secure;

public abstract class az2 {

    /* renamed from: a */
    public final bz2 f26057a;

    public az2(bz2 bz2) {
        this.f26057a = bz2;
    }

    /* renamed from: c */
    public static void m39207c(String str, StringBuilder sb) {
        if (str != null && !str.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(10);
            }
            sb.append(str);
        }
    }

    /* renamed from: d */
    public static void m39208d(String[] strArr, StringBuilder sb) {
        if (strArr != null) {
            for (String c : strArr) {
                m39207c(c, sb);
            }
        }
    }

    /* renamed from: a */
    public abstract String mo31271a();

    /* renamed from: b */
    public final bz2 mo31272b() {
        return this.f26057a;
    }

    public final String toString() {
        return mo31271a();
    }
}
