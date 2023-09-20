package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

public abstract class sh5 extends fl5 implements ai5 {
    public sh5() {
        super("com.google.android.gms.maps.internal.IOnMapLongClickListener");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        vr5.m30279c(parcel);
        mo13109j0((LatLng) vr5.m30277a(parcel, LatLng.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
