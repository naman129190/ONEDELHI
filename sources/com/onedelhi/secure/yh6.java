package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class yh6 extends al5 implements qk6 {
    public yh6() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    /* renamed from: j8 */
    public final boolean mo13174j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo16366Z3((Status) qr5.m26139a(parcel, Status.CREATOR));
        return true;
    }
}
