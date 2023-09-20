package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class aa5 implements IInterface {

    /* renamed from: a */
    public final IBinder f8952a;

    /* renamed from: b */
    public final String f8953b;

    public aa5(IBinder iBinder, String str) {
        this.f8952a = iBinder;
        this.f8953b = str;
    }

    public final IBinder asBinder() {
        return this.f8952a;
    }

    /* renamed from: j8 */
    public final Parcel mo12889j8() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f8953b);
        return obtain;
    }

    /* renamed from: k8 */
    public final Parcel mo12890k8(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f8952a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: l8 */
    public final void mo12891l8(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f8952a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
