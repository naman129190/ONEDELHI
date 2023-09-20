package com.onedelhi.secure;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface fo1 extends IInterface {

    /* renamed from: com.onedelhi.secure.fo1$a */
    public static class C2185a implements fo1 {
        public IBinder asBinder() {
            return null;
        }

        /* renamed from: e1 */
        public void mo16121e1(boolean z, boolean z2) throws RemoteException {
        }
    }

    /* renamed from: com.onedelhi.secure.fo1$b */
    public static abstract class C2186b extends Binder implements fo1 {

        /* renamed from: b */
        public static final int f12239b = 1;

        /* renamed from: b */
        public static final String f12240b = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback";

        /* renamed from: com.onedelhi.secure.fo1$b$a */
        public static class C2187a implements fo1 {

            /* renamed from: a */
            public static fo1 f12241a;

            /* renamed from: a */
            public IBinder f12242a;

            public C2187a(IBinder iBinder) {
                this.f12242a = iBinder;
            }

            public IBinder asBinder() {
                return this.f12242a;
            }

            /* renamed from: e1 */
            public void mo16121e1(boolean z, boolean z2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C2186b.f12240b);
                    int i = 0;
                    obtain.writeInt(z ? 1 : 0);
                    if (z2) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    if (this.f12242a.transact(1, obtain, (Parcel) null, 1) || C2186b.m15143k8() == null) {
                        obtain.recycle();
                    } else {
                        C2186b.m15143k8().mo16121e1(z, z2);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: j8 */
            public String mo16126j8() {
                return C2186b.f12240b;
            }
        }

        public C2186b() {
            attachInterface(this, f12240b);
        }

        /* renamed from: j8 */
        public static fo1 m15142j8(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f12240b);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof fo1)) ? new C2187a(iBinder) : (fo1) queryLocalInterface;
        }

        /* renamed from: k8 */
        public static fo1 m15143k8() {
            return C2187a.f12241a;
        }

        /* renamed from: l8 */
        public static boolean m15144l8(fo1 fo1) {
            if (C2187a.f12241a != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (fo1 == null) {
                return false;
            } else {
                C2187a.f12241a = fo1;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(f12240b);
                boolean z = false;
                boolean z2 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                mo16121e1(z2, z);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(f12240b);
                return true;
            }
        }
    }

    /* renamed from: e1 */
    void mo16121e1(boolean z, boolean z2) throws RemoteException;
}
