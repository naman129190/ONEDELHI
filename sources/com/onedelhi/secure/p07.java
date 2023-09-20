package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.onedelhi.secure.tn1;

public final class p07 extends x95 implements IInterface {
    public p07(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: j8 */
    public final tn1 mo22190j8(tn1 tn1, String str, int i, tn1 tn12) throws RemoteException {
        Parcel zza = zza();
        sr5.m27805e(zza, tn1);
        zza.writeString(str);
        zza.writeInt(i);
        sr5.m27805e(zza, tn12);
        Parcel zzB = zzB(2, zza);
        tn1 j8 = tn1.C3647a.m28820j8(zzB.readStrongBinder());
        zzB.recycle();
        return j8;
    }

    /* renamed from: k8 */
    public final tn1 mo22191k8(tn1 tn1, String str, int i, tn1 tn12) throws RemoteException {
        Parcel zza = zza();
        sr5.m27805e(zza, tn1);
        zza.writeString(str);
        zza.writeInt(i);
        sr5.m27805e(zza, tn12);
        Parcel zzB = zzB(3, zza);
        tn1 j8 = tn1.C3647a.m28820j8(zzB.readStrongBinder());
        zzB.recycle();
        return j8;
    }
}
