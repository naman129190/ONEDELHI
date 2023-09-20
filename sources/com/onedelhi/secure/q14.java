package com.onedelhi.secure;

import com.google.android.gms.maps.model.LatLng;

public class q14 {

    /* renamed from: a */
    public final double f33955a;

    public q14(double d) {
        this.f33955a = d;
    }

    /* renamed from: a */
    public LatLng mo43080a(v23 v23) {
        double d = v23.f36408a;
        double d2 = this.f33955a;
        return new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (v23.f36409b / d2))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d / d2) - 0.5d) * 360.0d);
    }

    /* renamed from: b */
    public u23 mo43081b(LatLng latLng) {
        double sin = Math.sin(Math.toRadians(latLng.f7562a));
        double d = this.f33955a;
        return new u23(((latLng.f7563b / 360.0d) + 0.5d) * d, (((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / -6.283185307179586d) + 0.5d) * d);
    }
}
