package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class i95 extends t65 implements j95 {
    public i95() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    /* renamed from: j8 */
    public final boolean mo17694j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        b75.m11658b(parcel);
        mo18155C7((Status) b75.m11657a(parcel, Status.CREATOR), (C2767lk) b75.m11657a(parcel, C2767lk.CREATOR));
        return true;
    }
}
