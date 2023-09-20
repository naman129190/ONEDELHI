package com.onedelhi.secure;

import com.google.android.gms.maps.model.LatLngBounds;
import java.util.HashMap;
import java.util.Map;

public class oz1 {

    /* renamed from: a */
    public LatLngBounds f33388a;

    /* renamed from: a */
    public final xi1 f33389a;

    /* renamed from: a */
    public String f33390a;

    /* renamed from: a */
    public final Map<String, String> f33391a;

    public oz1(String str, LatLngBounds latLngBounds, float f, int i, HashMap<String, String> hashMap, float f2) {
        xi1 xi1 = new xi1();
        this.f33389a = xi1;
        this.f33390a = str;
        this.f33391a = hashMap;
        if (latLngBounds != null) {
            this.f33388a = latLngBounds;
            xi1.mo26944c3(latLngBounds);
            xi1.mo26927L2(f2);
            xi1.mo26947f3(f);
            xi1.mo26946e3(i != 0);
            return;
        }
        throw new IllegalArgumentException("No LatLonBox given");
    }

    /* renamed from: a */
    public xi1 mo42310a() {
        return this.f33389a;
    }

    /* renamed from: b */
    public String mo42311b() {
        return this.f33390a;
    }

    /* renamed from: c */
    public LatLngBounds mo42312c() {
        return this.f33388a;
    }

    /* renamed from: d */
    public Iterable<String> mo42313d() {
        return this.f33391a.keySet();
    }

    /* renamed from: e */
    public String mo42314e(String str) {
        return this.f33391a.get(str);
    }

    /* renamed from: f */
    public boolean mo42315f(String str) {
        return this.f33391a.get(str) != null;
    }

    public String toString() {
        return "GroundOverlay" + to1.f35745h + "\n properties=" + this.f33391a + ",\n image url=" + this.f33390a + ",\n LatLngBox=" + this.f33388a + "\n}\n";
    }
}
