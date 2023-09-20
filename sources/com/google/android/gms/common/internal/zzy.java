package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.onedelhi.secure.tn1;
import com.onedelhi.secure.x95;

public final class zzy extends x95 implements zzaa {
    public zzy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final int zzc() throws RemoteException {
        Parcel zzB = zzB(2, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final tn1 zzd() throws RemoteException {
        Parcel zzB = zzB(1, zza());
        tn1 j8 = tn1.C3647a.m28820j8(zzB.readStrongBinder());
        zzB.recycle();
        return j8;
    }
}
