package com.onedelhi.secure;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public class mf1 implements bf1 {

    /* renamed from: a */
    public static final String f32125a = "Polygon";

    /* renamed from: a */
    public final List<? extends List<LatLng>> f32126a;

    public mf1(List<? extends List<LatLng>> list) {
        if (list != null) {
            this.f32126a = list;
            return;
        }
        throw new IllegalArgumentException("Coordinates cannot be null");
    }

    /* renamed from: a */
    public List<? extends List<LatLng>> mo40569a() {
        return this.f32126a;
    }

    /* renamed from: h */
    public String mo31558h() {
        return "Polygon";
    }

    public String toString() {
        return "Polygon" + to1.f35745h + "\n coordinates=" + this.f32126a + "\n}\n";
    }
}
