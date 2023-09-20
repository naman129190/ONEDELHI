package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.C1444a;

public abstract class op5 extends fl5 implements tp5 {
    public op5() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaLongClickListener");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        vr5.m30279c(parcel);
        mo19063C0((C1444a) vr5.m30277a(parcel, C1444a.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
