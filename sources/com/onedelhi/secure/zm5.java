package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zm5 extends fl5 implements fn5 {
    public zm5() {
        super("com.google.android.gms.maps.internal.IOnPoiClickListener");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        vr5.m30279c(parcel);
        mo16120Z1((z23) vr5.m30277a(parcel, z23.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
