package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class nn5 extends zk5 implements tn5 {
    public nn5() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    /* renamed from: j8 */
    public final boolean mo13795j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            pr5.m24994b(parcel);
            mo13775y4((o73) pr5.m24993a(parcel, o73.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            String readString = parcel.readString();
            pr5.m24994b(parcel);
            mo13237R1(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
