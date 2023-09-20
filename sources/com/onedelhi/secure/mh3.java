package com.onedelhi.secure;

import java.util.HashMap;
import java.util.Set;

public class mh3 {

    /* renamed from: a */
    public static final mh3 f16097a = new mh3();

    /* renamed from: a */
    public HashMap<String, nh3> f16098a = new HashMap<>();

    /* renamed from: c */
    public static mh3 m21545c() {
        return f16097a;
    }

    /* renamed from: a */
    public String mo20384a(String str) {
        nh3 nh3 = this.f16098a.get(str);
        if (nh3 != null) {
            return nh3.mo21275b();
        }
        return null;
    }

    /* renamed from: b */
    public String mo20385b(String str) {
        nh3 nh3 = this.f16098a.get(str);
        if (nh3 != null) {
            return nh3.mo21278e();
        }
        return null;
    }

    /* renamed from: d */
    public long mo20386d(String str) {
        nh3 nh3 = this.f16098a.get(str);
        if (nh3 != null) {
            return nh3.mo21281h();
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: e */
    public Set<String> mo20387e() {
        return this.f16098a.keySet();
    }

    /* renamed from: f */
    public void mo20388f(String str, nh3 nh3) {
        this.f16098a.put(str, nh3);
    }

    /* renamed from: g */
    public void mo20389g(String str, int i) {
        nh3 nh3 = this.f16098a.get(str);
        if (nh3 != null) {
            nh3.mo21274a(i);
        }
    }

    /* renamed from: h */
    public void mo20390h(String str, int i) {
        nh3 nh3 = this.f16098a.get(str);
        if (nh3 != null) {
            nh3.mo21277d(i);
        }
    }

    /* renamed from: i */
    public void mo20391i(String str, nh3 nh3) {
        this.f16098a.remove(str);
    }

    /* renamed from: j */
    public void mo20392j(String str, String str2) {
        nh3 nh3 = this.f16098a.get(str);
        if (nh3 != null) {
            nh3.mo21280g(str2);
        }
    }

    /* renamed from: k */
    public void mo20393k(String str, int i, int i2) {
        nh3 nh3 = this.f16098a.get(str);
        if (nh3 != null) {
            nh3.mo21279f(i, i2);
        }
    }

    /* renamed from: l */
    public void mo20394l(String str, float f) {
        nh3 nh3 = this.f16098a.get(str);
        if (nh3 != null) {
            nh3.mo21276c(f);
        }
    }
}
