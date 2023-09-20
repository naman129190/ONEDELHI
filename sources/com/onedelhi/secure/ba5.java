package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class ba5 implements IInterface {

    /* renamed from: a */
    public final IBinder f9786a;

    /* renamed from: b */
    public final String f9787b;

    public ba5(IBinder iBinder, String str) {
        this.f9786a = iBinder;
        this.f9787b = str;
    }

    public final IBinder asBinder() {
        return this.f9786a;
    }

    /* renamed from: j8 */
    public final Parcel mo13608j8(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f9786a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: k8 */
    public final Parcel mo13609k8() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f9787b);
        return obtain;
    }

    /* renamed from: l8 */
    public final void mo13610l8(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f9786a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
