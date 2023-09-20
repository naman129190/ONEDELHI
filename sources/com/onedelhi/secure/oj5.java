package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class oj5 extends fl5 implements wj5 {
    public oj5() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            lb5 k8 = k67.m19509k8(parcel.readStrongBinder());
            vr5.m30279c(parcel);
            mo19152A6(k8);
        } else if (i == 2) {
            lb5 k82 = k67.m19509k8(parcel.readStrongBinder());
            vr5.m30279c(parcel);
            mo19154m(k82);
        } else if (i != 3) {
            return false;
        } else {
            lb5 k83 = k67.m19509k8(parcel.readStrongBinder());
            vr5.m30279c(parcel);
            mo19153T5(k83);
        }
        parcel2.writeNoException();
        return true;
    }
}
