package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class ek5 extends fl5 implements mk5 {
    public ek5() {
        super("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean b = mo20464b();
        parcel2.writeNoException();
        vr5.m30280d(parcel2, b);
        return true;
    }
}
