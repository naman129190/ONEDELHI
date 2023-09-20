package com.onedelhi.secure;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class vx5 extends t95 implements m66 {
    public vx5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    /* renamed from: P2 */
    public final boolean mo20134P2(boolean z) throws RemoteException {
        Parcel j8 = mo24785j8();
        qs5.m26151a(j8, true);
        Parcel k8 = mo24786k8(2, j8);
        boolean b = qs5.m26152b(k8);
        k8.recycle();
        return b;
    }

    /* renamed from: s */
    public final boolean mo20135s() throws RemoteException {
        Parcel k8 = mo24786k8(6, mo24785j8());
        boolean b = qs5.m26152b(k8);
        k8.recycle();
        return b;
    }

    /* renamed from: w7 */
    public final String mo20136w7() throws RemoteException {
        Parcel k8 = mo24786k8(1, mo24785j8());
        String readString = k8.readString();
        k8.recycle();
        return readString;
    }
}
