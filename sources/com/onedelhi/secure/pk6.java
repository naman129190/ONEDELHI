package com.onedelhi.secure;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class pk6 extends zk5 implements in6 {
    public pk6() {
        super("com.google.android.gms.auth.account.data.IBundleCallback");
    }

    /* renamed from: j8 */
    public final boolean mo13795j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        pr5.m24994b(parcel);
        mo16503I0((Status) pr5.m24993a(parcel, Status.CREATOR), (Bundle) pr5.m24993a(parcel, Bundle.CREATOR));
        return true;
    }
}
