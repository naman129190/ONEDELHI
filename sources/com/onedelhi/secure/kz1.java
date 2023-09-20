package com.onedelhi.secure;

import java.util.ArrayList;
import java.util.HashMap;

public class kz1 {

    /* renamed from: a */
    public String f31496a;

    /* renamed from: a */
    public final ArrayList<kz1> f31497a;

    /* renamed from: a */
    public final HashMap<String, String> f31498a;

    /* renamed from: b */
    public final HashMap<tz1, Object> f31499b;

    /* renamed from: c */
    public final HashMap<oz1, wi1> f31500c;

    /* renamed from: d */
    public final HashMap<String, String> f31501d;

    /* renamed from: e */
    public HashMap<String, xz1> f31502e;

    public kz1(HashMap<String, String> hashMap, HashMap<String, xz1> hashMap2, HashMap<tz1, Object> hashMap3, HashMap<String, String> hashMap4, ArrayList<kz1> arrayList, HashMap<oz1, wi1> hashMap5, String str) {
        this.f31498a = hashMap;
        this.f31499b = hashMap3;
        this.f31502e = hashMap2;
        this.f31501d = hashMap4;
        this.f31497a = arrayList;
        this.f31500c = hashMap5;
        this.f31496a = str;
    }

    /* renamed from: a */
    public String mo39593a() {
        return this.f31496a;
    }

    /* renamed from: b */
    public Iterable<kz1> mo39594b() {
        return this.f31497a;
    }

    /* renamed from: c */
    public HashMap<oz1, wi1> mo39595c() {
        return this.f31500c;
    }

    /* renamed from: d */
    public Iterable<oz1> mo39596d() {
        return this.f31500c.keySet();
    }

    /* renamed from: e */
    public Iterable<tz1> mo39597e() {
        return this.f31499b.keySet();
    }

    /* renamed from: f */
    public HashMap<tz1, Object> mo39598f() {
        return this.f31499b;
    }

    /* renamed from: g */
    public Iterable<String> mo39599g() {
        return this.f31498a.keySet();
    }

    /* renamed from: h */
    public String mo39600h(String str) {
        return this.f31498a.get(str);
    }

    /* renamed from: i */
    public xz1 mo39601i(String str) {
        return this.f31502e.get(str);
    }

    /* renamed from: j */
    public HashMap<String, String> mo39602j() {
        return this.f31501d;
    }

    /* renamed from: k */
    public HashMap<String, xz1> mo39603k() {
        return this.f31502e;
    }

    /* renamed from: l */
    public boolean mo39604l() {
        return this.f31497a.size() > 0;
    }

    /* renamed from: m */
    public boolean mo39605m() {
        return this.f31499b.size() > 0;
    }

    /* renamed from: n */
    public boolean mo39606n() {
        return this.f31498a.size() > 0;
    }

    /* renamed from: o */
    public boolean mo39607o(String str) {
        return this.f31498a.containsKey(str);
    }

    /* renamed from: p */
    public void mo39608p(tz1 tz1, Object obj) {
        this.f31499b.put(tz1, obj);
    }

    public String toString() {
        return "Container" + to1.f35745h + "\n properties=" + this.f31498a + ",\n placemarks=" + this.f31499b + ",\n containers=" + this.f31497a + ",\n ground overlays=" + this.f31500c + ",\n style maps=" + this.f31501d + ",\n styles=" + this.f31502e + "\n}\n";
    }
}
