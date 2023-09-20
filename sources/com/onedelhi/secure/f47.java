package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class f47 extends fl5 implements v47 {
    public f47() {
        super("com.google.android.gms.maps.internal.IOnCircleClickListener");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        op6 k8 = vm6.m30230k8(parcel.readStrongBinder());
        vr5.m30279c(parcel);
        mo23438U3(k8);
        parcel2.writeNoException();
        return true;
    }
}
