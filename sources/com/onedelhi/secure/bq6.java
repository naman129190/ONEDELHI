package com.onedelhi.secure;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class bq6 extends zk5 implements is6 {
    public bq6() {
        super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
    }

    /* renamed from: j8 */
    public final boolean mo13795j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        pr5.m24994b(parcel);
        mo15850H7((Status) pr5.m24993a(parcel, Status.CREATOR), (C2469j2) pr5.m24993a(parcel, C2469j2.CREATOR));
        return true;
    }
}
