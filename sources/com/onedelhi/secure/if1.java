package com.onedelhi.secure;

import java.util.List;

public class if1 implements bf1 {

    /* renamed from: a */
    public static final String f30297a = "MultiPolygon";

    /* renamed from: a */
    public final List<mf1> f30298a;

    public if1(List<mf1> list) {
        if (list != null) {
            this.f30298a = list;
            return;
        }
        throw new IllegalArgumentException("GeoJsonPolygons cannot be null");
    }

    /* renamed from: a */
    public List<mf1> mo38056a() {
        return this.f30298a;
    }

    /* renamed from: h */
    public String mo31558h() {
        return "MultiPolygon";
    }

    public String toString() {
        return "MultiPolygon" + to1.f35745h + "\n Polygons=" + this.f30298a + "\n}\n";
    }
}
