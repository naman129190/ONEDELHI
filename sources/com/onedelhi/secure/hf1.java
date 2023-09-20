package com.onedelhi.secure;

import java.util.List;

public class hf1 implements bf1 {

    /* renamed from: a */
    public static final String f29590a = "MultiPoint";

    /* renamed from: a */
    public final List<kf1> f29591a;

    public hf1(List<kf1> list) {
        if (list != null) {
            this.f29591a = list;
            return;
        }
        throw new IllegalArgumentException("GeoJsonPoints cannot be null");
    }

    /* renamed from: a */
    public List<kf1> mo37284a() {
        return this.f29591a;
    }

    /* renamed from: h */
    public String mo31558h() {
        return "MultiPoint";
    }

    public String toString() {
        return "MultiPoint" + to1.f35745h + "\n points=" + this.f29591a + "\n}\n";
    }
}
