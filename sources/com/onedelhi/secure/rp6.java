package com.onedelhi.secure;

import android.location.Location;
import android.os.RemoteException;
import com.onedelhi.secure.h82;

public final class rp6 implements h82.C2319a {

    /* renamed from: a */
    public final /* synthetic */ sf5 f19967a;

    public rp6(p17 p17, sf5 sf5) {
        this.f19967a = sf5;
    }

    public final void onLocationChanged(Location location) {
        try {
            this.f19967a.mo17246c0(location);
        } catch (RemoteException e) {
            throw new qo3(e);
        }
    }
}
