package com.onedelhi.secure;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zf5 extends ba5 implements rg5 {
    public zf5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    /* renamed from: V6 */
    public final kd4 mo23072V6(int i, int i2, int i3) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeInt(i);
        k8.writeInt(i2);
        k8.writeInt(i3);
        Parcel j8 = mo13608j8(1, k8);
        kd4 kd4 = (kd4) vr5.m30277a(j8, kd4.CREATOR);
        j8.recycle();
        return kd4;
    }
}
