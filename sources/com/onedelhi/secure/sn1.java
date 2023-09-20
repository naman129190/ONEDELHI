package com.onedelhi.secure;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface sn1 extends IInterface {

    /* renamed from: com.onedelhi.secure.sn1$a */
    public static class C3529a implements sn1 {
        /* renamed from: R6 */
        public void mo3747R6(String str, int i, String str2, Notification notification) throws RemoteException {
        }

        public IBinder asBinder() {
            return null;
        }

        /* renamed from: q5 */
        public void mo3748q5(String str) throws RemoteException {
        }

        /* renamed from: z7 */
        public void mo3749z7(String str, int i, String str2) throws RemoteException {
        }
    }

    /* renamed from: com.onedelhi.secure.sn1$b */
    public static abstract class C3530b extends Binder implements sn1 {

        /* renamed from: b */
        public static final int f20464b = 1;

        /* renamed from: b */
        public static final String f20465b = "android.support.v4.app.INotificationSideChannel";

        /* renamed from: c */
        public static final int f20466c = 2;

        /* renamed from: d */
        public static final int f20467d = 3;

        /* renamed from: com.onedelhi.secure.sn1$b$a */
        public static class C3531a implements sn1 {

            /* renamed from: a */
            public static sn1 f20468a;

            /* renamed from: a */
            public IBinder f20469a;

            public C3531a(IBinder iBinder) {
                this.f20469a = iBinder;
            }

            /* renamed from: R6 */
            public void mo3747R6(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C3530b.f20465b);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f20469a.transact(1, obtain, (Parcel) null, 1) || C3530b.m27738k8() == null) {
                        obtain.recycle();
                    } else {
                        C3530b.m27738k8().mo3747R6(str, i, str2, notification);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f20469a;
            }

            /* renamed from: j8 */
            public String mo24503j8() {
                return C3530b.f20465b;
            }

            /* renamed from: q5 */
            public void mo3748q5(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C3530b.f20465b);
                    obtain.writeString(str);
                    if (this.f20469a.transact(3, obtain, (Parcel) null, 1) || C3530b.m27738k8() == null) {
                        obtain.recycle();
                    } else {
                        C3530b.m27738k8().mo3748q5(str);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: z7 */
            public void mo3749z7(String str, int i, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C3530b.f20465b);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (this.f20469a.transact(2, obtain, (Parcel) null, 1) || C3530b.m27738k8() == null) {
                        obtain.recycle();
                    } else {
                        C3530b.m27738k8().mo3749z7(str, i, str2);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C3530b() {
            attachInterface(this, f20465b);
        }

        /* renamed from: j8 */
        public static sn1 m27737j8(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f20465b);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof sn1)) ? new C3531a(iBinder) : (sn1) queryLocalInterface;
        }

        /* renamed from: k8 */
        public static sn1 m27738k8() {
            return C3531a.f20468a;
        }

        /* renamed from: l8 */
        public static boolean m27739l8(sn1 sn1) {
            if (C3531a.f20468a != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (sn1 == null) {
                return false;
            } else {
                C3531a.f20468a = sn1;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(f20465b);
                mo3747R6(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(f20465b);
                mo3749z7(parcel.readString(), parcel.readInt(), parcel.readString());
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(f20465b);
                mo3748q5(parcel.readString());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(f20465b);
                return true;
            }
        }
    }

    /* renamed from: R6 */
    void mo3747R6(String str, int i, String str2, Notification notification) throws RemoteException;

    /* renamed from: q5 */
    void mo3748q5(String str) throws RemoteException;

    /* renamed from: z7 */
    void mo3749z7(String str, int i, String str2) throws RemoteException;
}
