package com.onedelhi.secure;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class tt5 extends yo5 implements bu5 {
    public tt5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    /* renamed from: n3 */
    public final void mo13820n3(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel j8 = mo27654j8();
        j8.writeString(str);
        j8.writeString(str2);
        ip5.m17766d(j8, bundle);
        j8.writeLong(j);
        mo27656l8(1, j8);
    }

    /* renamed from: o */
    public final int mo13821o() throws RemoteException {
        Parcel k8 = mo27655k8(2, mo27654j8());
        int readInt = k8.readInt();
        k8.recycle();
        return readInt;
    }
}
