package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;

public final class t62 implements u62 {

    /* renamed from: a */
    public static final Locale f20666a = new Locale("en", "XA");

    /* renamed from: b */
    public static final Locale f20667b = new Locale(ArchiveStreamFactory.f38863AR, "XB");

    /* renamed from: b */
    public static final Locale[] f20668b = new Locale[0];

    /* renamed from: c */
    public static final Locale f20669c = s62.m27260b("en-Latn");
    @mr2

    /* renamed from: a */
    public final String f20670a;

    /* renamed from: a */
    public final Locale[] f20671a;

    @sj3(21)
    /* renamed from: com.onedelhi.secure.t62$a */
    public static class C3567a {
        @pn0
        /* renamed from: a */
        public static String m28132a(Locale locale) {
            return locale.getScript();
        }
    }

    public t62(@mr2 Locale... localeArr) {
        String sb;
        if (localeArr.length == 0) {
            this.f20671a = f20668b;
            sb = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb2 = new StringBuilder();
            int i = 0;
            while (i < localeArr.length) {
                Locale locale = localeArr[i];
                if (locale != null) {
                    if (!hashSet.contains(locale)) {
                        Locale locale2 = (Locale) locale.clone();
                        arrayList.add(locale2);
                        m28123l(sb2, locale2);
                        if (i < localeArr.length - 1) {
                            sb2.append(',');
                        }
                        hashSet.add(locale2);
                    }
                    i++;
                } else {
                    throw new NullPointerException("list[" + i + "] is null");
                }
            }
            this.f20671a = (Locale[]) arrayList.toArray(new Locale[0]);
            sb = sb2.toString();
        }
        this.f20670a = sb;
    }

    /* renamed from: i */
    public static String m28120i(Locale locale) {
        String a = C3567a.m28132a(locale);
        return !a.isEmpty() ? a : "";
    }

    /* renamed from: j */
    public static boolean m28121j(Locale locale) {
        return f20666a.equals(locale) || f20667b.equals(locale);
    }

    @js1(from = 0, mo18580to = 1)
    /* renamed from: k */
    public static int m28122k(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || m28121j(locale) || m28121j(locale2)) {
            return 0;
        }
        String i = m28120i(locale);
        if (!i.isEmpty()) {
            return i.equals(m28120i(locale2)) ? 1 : 0;
        }
        String country = locale.getCountry();
        return (country.isEmpty() || country.equals(locale2.getCountry())) ? 1 : 0;
    }

    @hw4
    /* renamed from: l */
    public static void m28123l(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }

    @ts2
    /* renamed from: a */
    public Object mo24717a() {
        return null;
    }

    /* renamed from: b */
    public Locale mo24718b(@mr2 String[] strArr) {
        return mo24723f(Arrays.asList(strArr), false);
    }

    /* renamed from: c */
    public Locale mo24719c(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f20671a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    /* renamed from: d */
    public String mo24720d() {
        return this.f20670a;
    }

    /* renamed from: e */
    public int mo24721e(Locale locale) {
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f20671a;
            if (i >= localeArr.length) {
                return -1;
            }
            if (localeArr[i].equals(locale)) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t62)) {
            return false;
        }
        Locale[] localeArr = ((t62) obj).f20671a;
        if (this.f20671a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f20671a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: f */
    public final Locale mo24723f(Collection<String> collection, boolean z) {
        int g = mo24724g(collection, z);
        if (g == -1) {
            return null;
        }
        return this.f20671a[g];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r6 < Integer.MAX_VALUE) goto L_0x0021;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo24724g(java.util.Collection<java.lang.String> r5, boolean r6) {
        /*
            r4 = this;
            java.util.Locale[] r0 = r4.f20671a
            int r1 = r0.length
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x0008
            return r2
        L_0x0008:
            int r0 = r0.length
            if (r0 != 0) goto L_0x000d
            r5 = -1
            return r5
        L_0x000d:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == 0) goto L_0x001e
            java.util.Locale r6 = f20669c
            int r6 = r4.mo24725h(r6)
            if (r6 != 0) goto L_0x001b
            return r2
        L_0x001b:
            if (r6 >= r0) goto L_0x001e
            goto L_0x0021
        L_0x001e:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x0021:
            java.util.Iterator r5 = r5.iterator()
        L_0x0025:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0040
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r1 = com.onedelhi.secure.s62.m27260b(r1)
            int r1 = r4.mo24725h(r1)
            if (r1 != 0) goto L_0x003c
            return r2
        L_0x003c:
            if (r1 >= r6) goto L_0x0025
            r6 = r1
            goto L_0x0025
        L_0x0040:
            if (r6 != r0) goto L_0x0043
            return r2
        L_0x0043:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.t62.mo24724g(java.util.Collection, boolean):int");
    }

    /* renamed from: h */
    public final int mo24725h(Locale locale) {
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f20671a;
            if (i >= localeArr.length) {
                return Integer.MAX_VALUE;
            }
            if (m28122k(locale, localeArr[i]) > 0) {
                return i;
            }
            i++;
        }
    }

    public int hashCode() {
        int i = 1;
        for (Locale hashCode : this.f20671a) {
            i = (i * 31) + hashCode.hashCode();
        }
        return i;
    }

    public boolean isEmpty() {
        return this.f20671a.length == 0;
    }

    public int size() {
        return this.f20671a.length;
    }

    @mr2
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f20671a;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.f20671a.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
