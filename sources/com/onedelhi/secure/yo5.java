package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class yo5 implements IInterface {

    /* renamed from: a */
    public final IBinder f23270a;

    /* renamed from: b */
    public final String f23271b;

    public yo5(IBinder iBinder, String str) {
        this.f23270a = iBinder;
        this.f23271b = str;
    }

    public final IBinder asBinder() {
        return this.f23270a;
    }

    /* renamed from: j8 */
    public final Parcel mo27654j8() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f23271b);
        return obtain;
    }

    /* renamed from: k8 */
    public final Parcel mo27655k8(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f23270a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    /* renamed from: l8 */
    public final void mo27656l8(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f23270a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
