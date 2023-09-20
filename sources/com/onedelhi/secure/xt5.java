package com.onedelhi.secure;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class xt5 extends dp5 implements bu5 {
    public xt5() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: j8 */
    public final boolean mo14807j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            long readLong = parcel.readLong();
            ip5.m17765c(parcel);
            mo13820n3(parcel.readString(), parcel.readString(), (Bundle) ip5.m17763a(parcel, Bundle.CREATOR), readLong);
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            int o = mo13821o();
            parcel2.writeNoException();
            parcel2.writeInt(o);
        }
        return true;
    }
}
