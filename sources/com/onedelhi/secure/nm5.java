package com.onedelhi.secure;

import android.location.Location;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class nm5 extends fl5 implements tm5 {
    public nm5() {
        super("com.google.android.gms.maps.internal.IOnMyLocationClickListener");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        vr5.m30279c(parcel);
        mo20397u1((Location) vr5.m30277a(parcel, Location.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
