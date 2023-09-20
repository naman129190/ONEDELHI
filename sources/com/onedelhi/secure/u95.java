package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class u95 implements IInterface {

    /* renamed from: a */
    public final IBinder f21276a;

    /* renamed from: b */
    public final String f21277b;

    public u95(IBinder iBinder, String str) {
        this.f21276a = iBinder;
        this.f21277b = str;
    }

    public final IBinder asBinder() {
        return this.f21276a;
    }

    /* renamed from: j8 */
    public final Parcel mo25467j8() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f21277b);
        return obtain;
    }

    /* renamed from: k8 */
    public final Parcel mo25468k8(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f21276a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: l8 */
    public final void mo25469l8(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f21276a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
