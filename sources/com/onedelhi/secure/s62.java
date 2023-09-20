package com.onedelhi.secure;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

public final class s62 {

    /* renamed from: a */
    public static final s62 f20216a = m27259a(new Locale[0]);

    /* renamed from: a */
    public final u62 f20217a;

    @sj3(21)
    /* renamed from: com.onedelhi.secure.s62$a */
    public static class C3473a {
        @pn0
        /* renamed from: a */
        public static Locale m27274a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    @sj3(24)
    /* renamed from: com.onedelhi.secure.s62$b */
    public static class C3474b {
        @pn0
        /* renamed from: a */
        public static LocaleList m27275a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        @pn0
        /* renamed from: b */
        public static LocaleList m27276b() {
            return LocaleList.getAdjustedDefault();
        }

        @pn0
        /* renamed from: c */
        public static LocaleList m27277c() {
            return LocaleList.getDefault();
        }
    }

    public s62(u62 u62) {
        this.f20217a = u62;
    }

    @mr2
    /* renamed from: a */
    public static s62 m27259a(@mr2 Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? m27265n(C3474b.m27275a(localeArr)) : new s62(new t62(localeArr));
    }

    /* renamed from: b */
    public static Locale m27260b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains(db0.f27369e)) {
            return new Locale(str);
        } else {
            String[] split2 = str.split(db0.f27369e, -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    @mr2
    /* renamed from: c */
    public static s62 m27261c(@ts2 String str) {
        if (str == null || str.isEmpty()) {
            return m27264g();
        }
        String[] split = str.split(vf4.f36537c, -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = C3473a.m27274a(split[i]);
        }
        return m27259a(localeArr);
    }

    @mr2
    @qz3(min = 1)
    /* renamed from: e */
    public static s62 m27262e() {
        if (Build.VERSION.SDK_INT >= 24) {
            return m27265n(C3474b.m27276b());
        }
        return m27259a(Locale.getDefault());
    }

    @mr2
    @qz3(min = 1)
    /* renamed from: f */
    public static s62 m27263f() {
        if (Build.VERSION.SDK_INT >= 24) {
            return m27265n(C3474b.m27277c());
        }
        return m27259a(Locale.getDefault());
    }

    @mr2
    /* renamed from: g */
    public static s62 m27264g() {
        return f20216a;
    }

    @mr2
    @sj3(24)
    /* renamed from: n */
    public static s62 m27265n(@mr2 LocaleList localeList) {
        return new s62(new v62(localeList));
    }

    @sj3(24)
    @Deprecated
    /* renamed from: o */
    public static s62 m27266o(Object obj) {
        return m27265n((LocaleList) obj);
    }

    @ts2
    /* renamed from: d */
    public Locale mo24214d(int i) {
        return this.f20217a.mo24719c(i);
    }

    public boolean equals(Object obj) {
        return (obj instanceof s62) && this.f20217a.equals(((s62) obj).f20217a);
    }

    @ts2
    /* renamed from: h */
    public Locale mo24216h(@mr2 String[] strArr) {
        return this.f20217a.mo24718b(strArr);
    }

    public int hashCode() {
        return this.f20217a.hashCode();
    }

    @js1(from = -1)
    /* renamed from: i */
    public int mo24218i(@ts2 Locale locale) {
        return this.f20217a.mo24721e(locale);
    }

    /* renamed from: j */
    public boolean mo24219j() {
        return this.f20217a.isEmpty();
    }

    @js1(from = 0)
    /* renamed from: k */
    public int mo24220k() {
        return this.f20217a.size();
    }

    @mr2
    /* renamed from: l */
    public String mo24221l() {
        return this.f20217a.mo24720d();
    }

    @ts2
    /* renamed from: m */
    public Object mo24222m() {
        return this.f20217a.mo24717a();
    }

    @mr2
    public String toString() {
        return this.f20217a.toString();
    }
}
