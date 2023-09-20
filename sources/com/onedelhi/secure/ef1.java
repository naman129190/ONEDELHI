package com.onedelhi.secure;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public class ef1 implements bf1 {

    /* renamed from: a */
    public static final String f27878a = "LineString";

    /* renamed from: a */
    public final List<LatLng> f27879a;

    public ef1(List<LatLng> list) {
        if (list != null) {
            this.f27879a = list;
            return;
        }
        throw new IllegalArgumentException("Coordinates cannot be null");
    }

    /* renamed from: a */
    public List<LatLng> mo35211a() {
        return this.f27879a;
    }

    /* renamed from: h */
    public String mo31558h() {
        return "LineString";
    }

    public String toString() {
        return "LineString" + to1.f35745h + "\n coordinates=" + this.f27879a + "\n}\n";
    }
}
