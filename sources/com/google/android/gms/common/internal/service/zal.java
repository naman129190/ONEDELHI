package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.onedelhi.secure.k35;
import com.onedelhi.secure.u35;

public final class zal extends k35 implements IInterface {
    public zal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void zae(zak zak) throws RemoteException {
        Parcel zaa = zaa();
        u35.m29073e(zaa, zak);
        zad(1, zaa);
    }
}
