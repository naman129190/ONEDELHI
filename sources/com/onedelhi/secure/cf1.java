package com.onedelhi.secure;

import java.util.List;

public class cf1 implements bf1 {

    /* renamed from: a */
    public static final String f26722a = "GeometryCollection";

    /* renamed from: a */
    public final List<bf1> f26723a;

    public cf1(List<bf1> list) {
        if (list != null) {
            this.f26723a = list;
            return;
        }
        throw new IllegalArgumentException("Geometries cannot be null");
    }

    /* renamed from: a */
    public List<bf1> mo32334a() {
        return this.f26723a;
    }

    /* renamed from: h */
    public String mo31558h() {
        return "GeometryCollection";
    }

    public String toString() {
        return "GeometryCollection" + to1.f35745h + "\n Geometries=" + this.f26723a + "\n}\n";
    }
}
