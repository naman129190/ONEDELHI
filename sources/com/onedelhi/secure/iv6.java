package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class iv6 extends fl5 implements ax6 {
    public iv6() {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo13310a();
        parcel2.writeNoException();
        return true;
    }
}
