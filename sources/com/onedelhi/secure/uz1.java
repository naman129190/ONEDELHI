package com.onedelhi.secure;

import com.google.android.gms.maps.model.LatLng;

public class uz1 implements nz1<LatLng> {

    /* renamed from: a */
    public static final String f36356a = "Point";

    /* renamed from: a */
    public final LatLng f36357a;

    public uz1(LatLng latLng) {
        if (latLng != null) {
            this.f36357a = latLng;
            return;
        }
        throw new IllegalArgumentException("Coordinates cannot be null");
    }

    /* renamed from: a */
    public String mo41500a() {
        return "Point";
    }

    /* renamed from: c */
    public LatLng mo41501b() {
        return this.f36357a;
    }

    public String toString() {
        return "Point" + to1.f35745h + "\n coordinates=" + this.f36357a + "\n}\n";
    }
}
