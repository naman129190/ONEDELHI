package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class o66 extends al5 implements na6 {
    public o66() {
        super("com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
    }

    /* renamed from: j8 */
    public final boolean mo13174j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo13870d7((Status) qr5.m26139a(parcel, Status.CREATOR), qr5.m26141c(parcel));
        return true;
    }
}
