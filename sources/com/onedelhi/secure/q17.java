package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class q17 extends fl5 implements h27 {
    public q17() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo17048a();
        parcel2.writeNoException();
        return true;
    }
}
