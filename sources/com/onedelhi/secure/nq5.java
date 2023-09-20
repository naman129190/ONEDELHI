package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import com.onedelhi.secure.tn1;

public abstract class nq5 extends fl5 implements sq5 {
    public nq5() {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            vr5.m30279c(parcel);
            mo24138u6((Bitmap) vr5.m30277a(parcel, Bitmap.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            tn1 j8 = tn1.C3647a.m28820j8(parcel.readStrongBinder());
            vr5.m30279c(parcel);
            mo24137V2(j8);
        }
        parcel2.writeNoException();
        return true;
    }
}
