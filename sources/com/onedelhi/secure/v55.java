package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class v55 extends t65 implements w55 {
    public v55() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    /* renamed from: j8 */
    public final boolean mo17694j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        b75.m11658b(parcel);
        mo14019N3((Status) b75.m11657a(parcel, Status.CREATOR), (tq3) b75.m11657a(parcel, tq3.CREATOR));
        return true;
    }
}
