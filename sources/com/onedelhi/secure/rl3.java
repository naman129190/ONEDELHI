package com.onedelhi.secure;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public abstract class rl3 {

    /* renamed from: a */
    public static final String f34672a = "﻿";

    /* renamed from: a */
    public static final Pattern f34673a = Pattern.compile("\\d+");

    /* renamed from: a */
    public static final rl3[] f34674a = {new C5735in(), new C4472a4(), new ns0(), new C7429z3(), new hr4(), new C6706rm(), new ir4(), new ms0(), new wo3(), new ka4(), new to3(), new vo3(), new rf1(), new ix4(), new qm4(), new om4(), new xn1(), new r53(), new wx0(), new kr4()};

    /* renamed from: a */
    public static final String[] f34675a = new String[0];

    /* renamed from: b */
    public static final Pattern f34676b = Pattern.compile(a13.f25714b);

    /* renamed from: c */
    public static final Pattern f34677c = Pattern.compile(a13.f25713a);

    /* renamed from: a */
    public static void m63721a(CharSequence charSequence, Map<String, String> map) {
        String[] split = f34677c.split(charSequence, 2);
        if (split.length == 2) {
            try {
                map.put(split[0], m63735p(split[1]));
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* renamed from: b */
    public static int m63722b(CharSequence charSequence, int i) {
        int i2 = i - 1;
        int i3 = 0;
        while (i2 >= 0 && charSequence.charAt(i2) == '\\') {
            i3++;
            i2--;
        }
        return i3;
    }

    /* renamed from: c */
    public static String m63723c(ol3 ol3) {
        String g = ol3.mo41829g();
        return g.startsWith(f34672a) ? g.substring(1) : g;
    }

    /* renamed from: d */
    public static boolean m63724d(CharSequence charSequence, int i) {
        return charSequence != null && i > 0 && i == charSequence.length() && f34673a.matcher(charSequence).matches();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = r4 + r3;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m63725e(java.lang.CharSequence r2, int r3, int r4) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x001f
            if (r4 > 0) goto L_0x0006
            goto L_0x001f
        L_0x0006:
            int r4 = r4 + r3
            int r1 = r2.length()
            if (r1 < r4) goto L_0x001f
            java.util.regex.Pattern r1 = f34673a
            java.lang.CharSequence r2 = r2.subSequence(r3, r4)
            java.util.regex.Matcher r2 = r1.matcher(r2)
            boolean r2 = r2.matches()
            if (r2 == 0) goto L_0x001f
            r2 = 1
            return r2
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.rl3.m63725e(java.lang.CharSequence, int, int):boolean");
    }

    /* renamed from: f */
    public static String[] m63726f(String str, String str2, char c, boolean z) {
        int length = str2.length();
        ArrayList arrayList = null;
        int i = 0;
        while (i < length) {
            int indexOf = str2.indexOf(str, i);
            if (indexOf < 0) {
                break;
            }
            int length2 = indexOf + str.length();
            ArrayList arrayList2 = arrayList;
            boolean z2 = true;
            int i2 = length2;
            while (z2) {
                int indexOf2 = str2.indexOf(c, i2);
                if (indexOf2 < 0) {
                    i2 = str2.length();
                } else if (m63722b(str2, indexOf2) % 2 != 0) {
                    i2 = indexOf2 + 1;
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(3);
                    }
                    String o = m63734o(str2.substring(length2, indexOf2));
                    if (z) {
                        o = o.trim();
                    }
                    if (!o.isEmpty()) {
                        arrayList2.add(o);
                    }
                    i2 = indexOf2 + 1;
                }
                z2 = false;
            }
            i = i2;
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(f34675a);
    }

    /* renamed from: g */
    public static String m63727g(String str, String str2, char c, boolean z) {
        String[] f = m63726f(str, str2, c, z);
        if (f == null) {
            return null;
        }
        return f[0];
    }

    /* renamed from: h */
    public static void m63728h(String str, StringBuilder sb) {
        if (str != null) {
            sb.append(10);
            sb.append(str);
        }
    }

    /* renamed from: i */
    public static void m63729i(String[] strArr, StringBuilder sb) {
        if (strArr != null) {
            for (String append : strArr) {
                sb.append(10);
                sb.append(append);
            }
        }
    }

    /* renamed from: j */
    public static String[] m63730j(String str) {
        if (str == null) {
            return null;
        }
        return new String[]{str};
    }

    /* renamed from: l */
    public static int m63731l(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: m */
    public static Map<String, String> m63732m(String str) {
        int indexOf = str.indexOf(63);
        if (indexOf < 0) {
            return null;
        }
        HashMap hashMap = new HashMap(3);
        for (String a : f34676b.split(str.substring(indexOf + 1))) {
            m63721a(a, hashMap);
        }
        return hashMap;
    }

    /* renamed from: n */
    public static az2 m63733n(ol3 ol3) {
        for (rl3 k : f34674a) {
            az2 k2 = k.mo30463k(ol3);
            if (k2 != null) {
                return k2;
            }
        }
        return new eb4(ol3.mo41829g(), (String) null);
    }

    /* renamed from: o */
    public static String m63734o(String str) {
        int indexOf = str.indexOf(92);
        if (indexOf < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length - 1);
        sb.append(str.toCharArray(), 0, indexOf);
        boolean z = false;
        while (indexOf < length) {
            char charAt = str.charAt(indexOf);
            if (z || charAt != '\\') {
                sb.append(charAt);
                z = false;
            } else {
                z = true;
            }
            indexOf++;
        }
        return sb.toString();
    }

    /* renamed from: p */
    public static String m63735p(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: k */
    public abstract az2 mo30463k(ol3 ol3);
}
