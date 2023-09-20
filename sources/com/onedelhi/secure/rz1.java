package com.onedelhi.secure;

import java.util.ArrayList;

public class rz1 implements nz1<ArrayList<nz1>> {

    /* renamed from: a */
    public static final String f34809a = "MultiGeometry";

    /* renamed from: a */
    public ArrayList<nz1> f34810a = new ArrayList<>();

    public rz1(ArrayList<nz1> arrayList) {
        if (arrayList != null) {
            this.f34810a = arrayList;
            return;
        }
        throw new IllegalArgumentException("Geometries cannot be null");
    }

    /* renamed from: a */
    public String mo41500a() {
        return f34809a;
    }

    /* renamed from: c */
    public ArrayList<nz1> mo41501b() {
        return this.f34810a;
    }

    public String toString() {
        return f34809a + to1.f35745h + "\n geometries=" + this.f34810a + "\n}\n";
    }
}
