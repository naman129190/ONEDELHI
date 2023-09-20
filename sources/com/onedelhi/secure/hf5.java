package com.onedelhi.secure;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class hf5 extends ba5 implements sf5 {
    public hf5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IOnLocationChangeListener");
    }

    /* renamed from: c0 */
    public final void mo17246c0(Location location) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, location);
        mo13610l8(2, k8);
    }
}
