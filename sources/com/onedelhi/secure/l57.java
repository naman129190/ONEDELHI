package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class l57 extends fl5 implements a67 {
    public l57() {
        super("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        uv6 k8 = nt6.m23171k8(parcel.readStrongBinder());
        vr5.m30279c(parcel);
        mo12745e6(k8);
        parcel2.writeNoException();
        return true;
    }
}
