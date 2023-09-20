package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class y27 extends fl5 implements p37 {
    public y27() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        vr5.m30279c(parcel);
        mo22308K4(readInt);
        parcel2.writeNoException();
        return true;
    }
}
