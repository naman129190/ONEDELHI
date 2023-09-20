package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;

public final class k95 extends n55 implements IInterface {
    public k95(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    /* renamed from: l8 */
    public final void mo18964l8(u55 u55, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) throws RemoteException {
        Parcel j8 = mo20867j8();
        b75.m11660d(j8, u55);
        b75.m11659c(j8, saveAccountLinkingTokenRequest);
        mo20868k8(1, j8);
    }

    /* renamed from: m8 */
    public final void mo18965m8(w55 w55, sq3 sq3) throws RemoteException {
        Parcel j8 = mo20867j8();
        b75.m11660d(j8, w55);
        b75.m11659c(j8, sq3);
        mo20868k8(2, j8);
    }
}
