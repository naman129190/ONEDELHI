package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class ig5 extends fl5 implements rg5 {
    public ig5() {
        super("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    /* renamed from: k8 */
    public static rg5 m17523k8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        return queryLocalInterface instanceof rg5 ? (rg5) queryLocalInterface : new zf5(iBinder);
    }

    /* renamed from: j8 */
    public final boolean mo13615j8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        vr5.m30279c(parcel);
        kd4 V6 = mo23072V6(readInt, readInt2, readInt3);
        parcel2.writeNoException();
        vr5.m30282f(parcel2, V6);
        return true;
    }
}
