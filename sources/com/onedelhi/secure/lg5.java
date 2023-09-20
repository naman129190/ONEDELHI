package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

public abstract class lg5 extends fl5 implements ug5 {
    public lg5() {
        super("com.google.android.gms.maps.internal.IOnMapClickListener");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        vr5.m30279c(parcel);
        mo18902j0((LatLng) vr5.m30277a(parcel, LatLng.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
