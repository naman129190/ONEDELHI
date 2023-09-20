package com.onedelhi.secure;

import com.google.android.gms.maps.model.LatLng;

public class kf1 implements bf1 {

    /* renamed from: a */
    public static final String f31200a = "Point";

    /* renamed from: a */
    public final LatLng f31201a;

    public kf1(LatLng latLng) {
        if (latLng != null) {
            this.f31201a = latLng;
            return;
        }
        throw new IllegalArgumentException("Coordinate cannot be null");
    }

    /* renamed from: a */
    public LatLng mo39230a() {
        return this.f31201a;
    }

    /* renamed from: h */
    public String mo31558h() {
        return "Point";
    }

    public String toString() {
        return "Point" + to1.f35745h + "\n coordinates=" + this.f31201a + "\n}\n";
    }
}
