package com.onedelhi.secure;

import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class tb2 {

    /* renamed from: a */
    public static final String f20728a = "mailto:";

    /* renamed from: b */
    public static final String f20729b = "mailto";

    /* renamed from: c */
    public static final String f20730c = "to";

    /* renamed from: d */
    public static final String f20731d = "body";

    /* renamed from: e */
    public static final String f20732e = "cc";

    /* renamed from: f */
    public static final String f20733f = "bcc";

    /* renamed from: g */
    public static final String f20734g = "subject";

    /* renamed from: a */
    public HashMap<String, String> f20735a = new HashMap<>();

    /* renamed from: g */
    public static boolean m28298g(@ts2 Uri uri) {
        return uri != null && f20729b.equals(uri.getScheme());
    }

    /* renamed from: h */
    public static boolean m28299h(@ts2 String str) {
        return str != null && str.startsWith(f20728a);
    }

    @mr2
    /* renamed from: i */
    public static tb2 m28300i(@mr2 Uri uri) throws zy2 {
        return m28301j(uri.toString());
    }

    @mr2
    /* renamed from: j */
    public static tb2 m28301j(@mr2 String str) throws zy2 {
        String str2;
        String str3;
        k43.m19455l(str);
        if (m28299h(str)) {
            int indexOf = str.indexOf(35);
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            int indexOf2 = str.indexOf(63);
            if (indexOf2 == -1) {
                str3 = Uri.decode(str.substring(7));
                str2 = null;
            } else {
                str3 = Uri.decode(str.substring(7, indexOf2));
                str2 = str.substring(indexOf2 + 1);
            }
            tb2 tb2 = new tb2();
            if (str2 != null) {
                for (String split : str2.split(a13.f25714b)) {
                    String[] split2 = split.split(a13.f25713a, 2);
                    if (split2.length != 0) {
                        tb2.f20735a.put(Uri.decode(split2[0]).toLowerCase(Locale.ROOT), split2.length > 1 ? Uri.decode(split2[1]) : null);
                    }
                }
            }
            String f = tb2.mo24831f();
            if (f != null) {
                str3 = str3 + ", " + f;
            }
            tb2.f20735a.put("to", str3);
            return tb2;
        }
        throw new zy2("Not a mailto scheme");
    }

    @ts2
    /* renamed from: a */
    public String mo24826a() {
        return this.f20735a.get(f20733f);
    }

    @ts2
    /* renamed from: b */
    public String mo24827b() {
        return this.f20735a.get("body");
    }

    @ts2
    /* renamed from: c */
    public String mo24828c() {
        return this.f20735a.get(f20732e);
    }

    @ts2
    /* renamed from: d */
    public Map<String, String> mo24829d() {
        return this.f20735a;
    }

    @ts2
    /* renamed from: e */
    public String mo24830e() {
        return this.f20735a.get(f20734g);
    }

    @ts2
    /* renamed from: f */
    public String mo24831f() {
        return this.f20735a.get("to");
    }

    @mr2
    public String toString() {
        StringBuilder sb = new StringBuilder(f20728a);
        sb.append('?');
        for (Map.Entry next : this.f20735a.entrySet()) {
            sb.append(Uri.encode((String) next.getKey()));
            sb.append('=');
            sb.append(Uri.encode((String) next.getValue()));
            sb.append(tk4.f35696c);
        }
        return sb.toString();
    }
}
