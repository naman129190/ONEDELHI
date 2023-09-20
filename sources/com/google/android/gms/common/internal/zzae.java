package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.onedelhi.secure.sr5;
import com.onedelhi.secure.tn1;
import com.onedelhi.secure.x95;

public final class zzae extends x95 implements zzag {
    public zzae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final zzq zze(zzo zzo) throws RemoteException {
        Parcel zza = zza();
        sr5.m27803c(zza, zzo);
        Parcel zzB = zzB(6, zza);
        zzq zzq = (zzq) sr5.m27801a(zzB, zzq.CREATOR);
        zzB.recycle();
        return zzq;
    }

    public final zzq zzf(zzo zzo) throws RemoteException {
        Parcel zza = zza();
        sr5.m27803c(zza, zzo);
        Parcel zzB = zzB(8, zza);
        zzq zzq = (zzq) sr5.m27801a(zzB, zzq.CREATOR);
        zzB.recycle();
        return zzq;
    }

    public final boolean zzg() throws RemoteException {
        Parcel zzB = zzB(9, zza());
        boolean f = sr5.m27806f(zzB);
        zzB.recycle();
        return f;
    }

    public final boolean zzh(zzs zzs, tn1 tn1) throws RemoteException {
        Parcel zza = zza();
        sr5.m27803c(zza, zzs);
        sr5.m27805e(zza, tn1);
        Parcel zzB = zzB(5, zza);
        boolean f = sr5.m27806f(zzB);
        zzB.recycle();
        return f;
    }

    public final boolean zzi() throws RemoteException {
        Parcel zzB = zzB(7, zza());
        boolean f = sr5.m27806f(zzB);
        zzB.recycle();
        return f;
    }
}
