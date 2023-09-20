package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class n85 extends t65 implements q85 {
    public n85() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    /* renamed from: j8 */
    public final boolean mo17694j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo13566r1();
        } else if (i != 2) {
            return false;
        } else {
            mo13564e4();
        }
        return true;
    }
}
