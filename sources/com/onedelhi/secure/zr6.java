package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;

public abstract class zr6 extends fl5 implements rt6 {
    public zr6() {
        super("com.google.android.gms.maps.internal.IOnCameraChangeListener");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        vr5.m30279c(parcel);
        mo16281v6((CameraPosition) vr5.m30277a(parcel, CameraPosition.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
