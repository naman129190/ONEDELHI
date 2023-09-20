package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class t95 implements IInterface {

    /* renamed from: a */
    public final IBinder f20713a;

    /* renamed from: b */
    public final String f20714b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public t95(IBinder iBinder, String str) {
        this.f20713a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f20713a;
    }

    /* renamed from: j8 */
    public final Parcel mo24785j8() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f20714b);
        return obtain;
    }

    /* renamed from: k8 */
    public final Parcel mo24786k8(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f20713a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
