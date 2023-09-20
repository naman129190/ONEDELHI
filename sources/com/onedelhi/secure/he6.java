package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;

public final class he6 extends v95 implements IInterface {
    public he6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    /* renamed from: l8 */
    public final void mo17240l8(s26 s26) throws RemoteException {
        Parcel j8 = mo25910j8();
        qr5.m26140b(j8, s26);
        mo25911k8(4, j8);
    }

    /* renamed from: m8 */
    public final void mo17241m8(String str, na6 na6) throws RemoteException {
        Parcel j8 = mo25910j8();
        j8.writeString(str);
        qr5.m26140b(j8, na6);
        mo25911k8(5, j8);
    }

    /* renamed from: n8 */
    public final void mo17242n8(IStatusCallback iStatusCallback) throws RemoteException {
        Parcel j8 = mo25910j8();
        qr5.m26140b(j8, iStatusCallback);
        mo25911k8(3, j8);
    }

    /* renamed from: o8 */
    public final void mo17243o8(IStatusCallback iStatusCallback) throws RemoteException {
        Parcel j8 = mo25910j8();
        qr5.m26140b(j8, iStatusCallback);
        mo25911k8(6, j8);
    }

    /* renamed from: p8 */
    public final void mo17244p8(qk6 qk6) throws RemoteException {
        Parcel j8 = mo25910j8();
        qr5.m26140b(j8, qk6);
        mo25911k8(1, j8);
    }

    /* renamed from: q8 */
    public final void mo17245q8(String str, qk6 qk6) throws RemoteException {
        Parcel j8 = mo25910j8();
        j8.writeString(str);
        qr5.m26140b(j8, qk6);
        mo25911k8(2, j8);
    }
}
