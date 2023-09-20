package com.onedelhi.secure;

import java.util.HashMap;

public class tz1 {

    /* renamed from: a */
    public final nz1 f35850a;

    /* renamed from: a */
    public final xz1 f35851a;

    /* renamed from: a */
    public final String f35852a;

    /* renamed from: a */
    public HashMap<String, String> f35853a;

    public tz1(nz1 nz1, String str, xz1 xz1, HashMap<String, String> hashMap) {
        new HashMap();
        this.f35850a = nz1;
        this.f35852a = str;
        this.f35851a = xz1;
        this.f35853a = hashMap;
    }

    /* renamed from: a */
    public nz1 mo45337a() {
        return this.f35850a;
    }

    /* renamed from: b */
    public xz1 mo45338b() {
        return this.f35851a;
    }

    /* renamed from: c */
    public Iterable mo45339c() {
        return this.f35853a.entrySet();
    }

    /* renamed from: d */
    public String mo45340d(String str) {
        return this.f35853a.get(str);
    }

    /* renamed from: e */
    public String mo45341e() {
        return this.f35852a;
    }

    /* renamed from: f */
    public boolean mo45342f() {
        return this.f35853a.size() > 0;
    }

    /* renamed from: g */
    public boolean mo45343g(String str) {
        return this.f35853a.containsKey(str);
    }

    public String toString() {
        return "Placemark" + to1.f35745h + "\n style id=" + this.f35852a + ",\n inline style=" + this.f35851a + ",\n properties=" + this.f35853a + ",\n geometry=" + this.f35850a + "\n}\n";
    }
}
