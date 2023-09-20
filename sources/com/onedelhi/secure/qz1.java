package com.onedelhi.secure;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

public class qz1 implements nz1<List<LatLng>> {

    /* renamed from: a */
    public static final String f34404a = "LineString";

    /* renamed from: a */
    public final ArrayList<LatLng> f34405a;

    public qz1(ArrayList<LatLng> arrayList) {
        if (arrayList != null) {
            this.f34405a = arrayList;
            return;
        }
        throw new IllegalArgumentException("Coordinates cannot be null");
    }

    /* renamed from: a */
    public String mo41500a() {
        return "LineString";
    }

    /* renamed from: c */
    public ArrayList<LatLng> mo41501b() {
        return this.f34405a;
    }

    public String toString() {
        return "LineString" + to1.f35745h + "\n coordinates=" + this.f34405a + "\n}\n";
    }
}
