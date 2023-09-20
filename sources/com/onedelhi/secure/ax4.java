package com.onedelhi.secure;

import com.google.android.gms.maps.model.LatLng;
import com.onedelhi.secure.a33;

public class ax4 implements a33.C4471a {

    /* renamed from: a */
    public static final q14 f26045a = new q14(1.0d);

    /* renamed from: b */
    public static final double f26046b = 1.0d;

    /* renamed from: a */
    public double f26047a;

    /* renamed from: a */
    public v23 f26048a;

    public ax4(LatLng latLng) {
        this(latLng, 1.0d);
    }

    public ax4(LatLng latLng, double d) {
        this.f26048a = f26045a.mo43081b(latLng);
        if (d >= 0.0d) {
            this.f26047a = d;
        } else {
            this.f26047a = 1.0d;
        }
    }

    /* renamed from: a */
    public double mo31253a() {
        return this.f26047a;
    }

    /* renamed from: d */
    public v23 mo30451d() {
        return this.f26048a;
    }
}
