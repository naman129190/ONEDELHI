package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class bk6 extends el5 implements um6 {
    public bk6() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    /* renamed from: j8 */
    public final boolean mo13751j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ur5.m29548b(parcel);
            mo14398k6((u96) ur5.m29547a(parcel, u96.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo14399x();
        }
        return true;
    }
}
