package com.onedelhi.secure;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface vn1 extends IInterface {

    /* renamed from: com.onedelhi.secure.vn1$a */
    public static class C3800a implements vn1 {
        /* renamed from: F6 */
        public void mo25668F6(int i, Bundle bundle) throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }
    }

    /* renamed from: com.onedelhi.secure.vn1$b */
    public static abstract class C3801b extends Binder implements vn1 {

        /* renamed from: b */
        public static final int f21890b = 1;

        /* renamed from: b */
        public static final String f21891b = "android.support.v4.os.IResultReceiver";

        /* renamed from: com.onedelhi.secure.vn1$b$a */
        public static class C3802a implements vn1 {

            /* renamed from: a */
            public static vn1 f21892a;

            /* renamed from: a */
            public IBinder f21893a;

            public C3802a(IBinder iBinder) {
                this.f21893a = iBinder;
            }

            /* renamed from: F6 */
            public void mo25668F6(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C3801b.f21891b);
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f21893a.transact(1, obtain, (Parcel) null, 1) || C3801b.m30234k8() == null) {
                        obtain.recycle();
                    } else {
                        C3801b.m30234k8().mo25668F6(i, bundle);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f21893a;
            }

            /* renamed from: j8 */
            public String mo26173j8() {
                return C3801b.f21891b;
            }
        }

        public C3801b() {
            attachInterface(this, f21891b);
        }

        /* renamed from: j8 */
        public static vn1 m30233j8(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f21891b);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof vn1)) ? new C3802a(iBinder) : (vn1) queryLocalInterface;
        }

        /* renamed from: k8 */
        public static vn1 m30234k8() {
            return C3802a.f21892a;
        }

        /* renamed from: l8 */
        public static boolean m30235l8(vn1 vn1) {
            if (C3802a.f21892a != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (vn1 == null) {
                return false;
            } else {
                C3802a.f21892a = vn1;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(f21891b);
                mo25668F6(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(f21891b);
                return true;
            }
        }
    }

    /* renamed from: F6 */
    void mo25668F6(int i, Bundle bundle) throws RemoteException;
}
