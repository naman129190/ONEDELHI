package com.onedelhi.secure;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class c27 extends ba5 implements k37 {
    public c27(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
    }

    /* renamed from: J2 */
    public final String mo13963J2() throws RemoteException {
        Parcel j8 = mo13608j8(2, mo13609k8());
        String readString = j8.readString();
        j8.recycle();
        return readString;
    }

    /* renamed from: K6 */
    public final boolean mo13964K6(k37 k37) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, k37);
        Parcel j8 = mo13608j8(4, k8);
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: O1 */
    public final String mo13965O1() throws RemoteException {
        Parcel j8 = mo13608j8(1, mo13609k8());
        String readString = j8.readString();
        j8.recycle();
        return readString;
    }

    /* renamed from: o */
    public final int mo13966o() throws RemoteException {
        Parcel j8 = mo13608j8(5, mo13609k8());
        int readInt = j8.readInt();
        j8.recycle();
        return readInt;
    }

    /* renamed from: q3 */
    public final void mo13967q3() throws RemoteException {
        mo13610l8(3, mo13609k8());
    }
}
