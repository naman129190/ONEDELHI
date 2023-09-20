package com.onedelhi.secure;

import java.util.List;

public class gf1 implements bf1 {

    /* renamed from: a */
    public static final String f29159a = "MultiLineString";

    /* renamed from: a */
    public final List<ef1> f29160a;

    public gf1(List<ef1> list) {
        if (list != null) {
            this.f29160a = list;
            return;
        }
        throw new IllegalArgumentException("GeoJsonLineStrings cannot be null");
    }

    /* renamed from: a */
    public List<ef1> mo36697a() {
        return this.f29160a;
    }

    /* renamed from: h */
    public String mo31558h() {
        return "MultiLineString";
    }

    public String toString() {
        return "MultiLineString" + to1.f35745h + "\n LineStrings=" + this.f29160a + "\n}\n";
    }
}
