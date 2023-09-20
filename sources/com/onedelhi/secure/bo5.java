package com.onedelhi.secure;

import android.location.Location;
import com.google.android.gms.common.api.Api;

public final /* synthetic */ class bo5 implements c80 {

    /* renamed from: a */
    public final /* synthetic */ x94 f9915a;

    public /* synthetic */ bo5(x94 x94) {
        this.f9915a = x94;
    }

    public final Object then(w94 w94) {
        x94 x94 = this.f9915a;
        Api api = mp5.f16269a;
        if (w94.mo17590v()) {
            x94.mo26839e((Location) w94.mo17586r());
            return null;
        }
        Exception q = w94.mo17585q();
        q.getClass();
        x94.mo26838d(q);
        return null;
    }
}
