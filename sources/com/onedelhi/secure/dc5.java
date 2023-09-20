package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class dc5 extends fl5 implements cd5 {
    public dc5() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        lb5 k8 = k67.m19509k8(parcel.readStrongBinder());
        vr5.m30279c(parcel);
        mo13254m(k8);
        parcel2.writeNoException();
        return true;
    }
}
