package com.onedelhi.secure;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.onedelhi.secure.fo1;

public interface go1 extends IInterface {

    /* renamed from: com.onedelhi.secure.go1$a */
    public static class C2257a implements go1 {
        /* renamed from: G3 */
        public void mo3772G3(fo1 fo1) throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }
    }

    /* renamed from: com.onedelhi.secure.go1$b */
    public static abstract class C2258b extends Binder implements go1 {

        /* renamed from: b */
        public static final int f12671b = 1;

        /* renamed from: b */
        public static final String f12672b = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService";

        /* renamed from: com.onedelhi.secure.go1$b$a */
        public static class C2259a implements go1 {

            /* renamed from: a */
            public static go1 f12673a;

            /* renamed from: a */
            public IBinder f12674a;

            public C2259a(IBinder iBinder) {
                this.f12674a = iBinder;
            }

            /* renamed from: G3 */
            public void mo3772G3(fo1 fo1) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C2258b.f12672b);
                    obtain.writeStrongBinder(fo1 != null ? fo1.asBinder() : null);
                    if (this.f12674a.transact(1, obtain, (Parcel) null, 1) || C2258b.m15947k8() == null) {
                        obtain.recycle();
                    } else {
                        C2258b.m15947k8().mo3772G3(fo1);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f12674a;
            }

            /* renamed from: j8 */
            public String mo16723j8() {
                return C2258b.f12672b;
            }
        }

        public C2258b() {
            attachInterface(this, f12672b);
        }

        /* renamed from: j8 */
        public static go1 m15946j8(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f12672b);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof go1)) ? new C2259a(iBinder) : (go1) queryLocalInterface;
        }

        /* renamed from: k8 */
        public static go1 m15947k8() {
            return C2259a.f12673a;
        }

        /* renamed from: l8 */
        public static boolean m15948l8(go1 go1) {
            if (C2259a.f12673a != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (go1 == null) {
                return false;
            } else {
                C2259a.f12673a = go1;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(f12672b);
                mo3772G3(fo1.C2186b.m15142j8(parcel.readStrongBinder()));
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(f12672b);
                return true;
            }
        }
    }

    /* renamed from: G3 */
    void mo3772G3(fo1 fo1) throws RemoteException;
}
