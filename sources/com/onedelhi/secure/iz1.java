package com.onedelhi.secure;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class iz1 {

    /* renamed from: a */
    public final int f30507a;

    /* renamed from: a */
    public final Map<String, String> f30508a = new HashMap();

    /* renamed from: b */
    public final int f30509b;

    public iz1(int i, int i2) {
        this.f30507a = i;
        this.f30509b = i2;
    }

    /* renamed from: c */
    public static String m52766c(String str, int i) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > i ? trim.substring(0, i) : trim;
    }

    @mr2
    /* renamed from: a */
    public synchronized Map<String, String> mo38298a() {
        return Collections.unmodifiableMap(new HashMap(this.f30508a));
    }

    /* renamed from: b */
    public final String mo38299b(String str) {
        if (str != null) {
            return m52766c(str, this.f30509b);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    /* renamed from: d */
    public synchronized boolean mo38300d(String str, String str2) {
        String b = mo38299b(str);
        if (this.f30508a.size() >= this.f30507a) {
            if (!this.f30508a.containsKey(b)) {
                o92 f = o92.m59120f();
                f.mo41623m("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f30507a);
                return false;
            }
        }
        String c = m52766c(str2, this.f30509b);
        if (u10.m66350E(this.f30508a.get(b), c)) {
            return false;
        }
        Map<String, String> map = this.f30508a;
        if (str2 == null) {
            c = "";
        }
        map.put(b, c);
        return true;
    }

    /* renamed from: e */
    public synchronized void mo38301e(Map<String, String> map) {
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            String b = mo38299b((String) next.getKey());
            if (this.f30508a.size() >= this.f30507a) {
                if (!this.f30508a.containsKey(b)) {
                    i++;
                }
            }
            String str = (String) next.getValue();
            this.f30508a.put(b, str == null ? "" : m52766c(str, this.f30509b));
        }
        if (i > 0) {
            o92 f = o92.m59120f();
            f.mo41623m("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f30507a);
        }
    }
}
