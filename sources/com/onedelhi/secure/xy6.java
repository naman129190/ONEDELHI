package com.onedelhi.secure;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.onedelhi.secure.tn1;

public final class xy6 extends x95 implements IInterface {
    public xy6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: j8 */
    public final int mo27150j8(tn1 tn1, String str, boolean z) throws RemoteException {
        Parcel zza = zza();
        sr5.m27805e(zza, tn1);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        Parcel zzB = zzB(3, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    /* renamed from: k8 */
    public final int mo27151k8(tn1 tn1, String str, boolean z) throws RemoteException {
        Parcel zza = zza();
        sr5.m27805e(zza, tn1);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        Parcel zzB = zzB(5, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    /* renamed from: l8 */
    public final tn1 mo27152l8(tn1 tn1, String str, int i) throws RemoteException {
        Parcel zza = zza();
        sr5.m27805e(zza, tn1);
        zza.writeString(str);
        zza.writeInt(i);
        Parcel zzB = zzB(2, zza);
        tn1 j8 = tn1.C3647a.m28820j8(zzB.readStrongBinder());
        zzB.recycle();
        return j8;
    }

    /* renamed from: m8 */
    public final tn1 mo27153m8(tn1 tn1, String str, int i, tn1 tn12) throws RemoteException {
        Parcel zza = zza();
        sr5.m27805e(zza, tn1);
        zza.writeString(str);
        zza.writeInt(i);
        sr5.m27805e(zza, tn12);
        Parcel zzB = zzB(8, zza);
        tn1 j8 = tn1.C3647a.m28820j8(zzB.readStrongBinder());
        zzB.recycle();
        return j8;
    }

    /* renamed from: n8 */
    public final tn1 mo27154n8(tn1 tn1, String str, int i) throws RemoteException {
        Parcel zza = zza();
        sr5.m27805e(zza, tn1);
        zza.writeString(str);
        zza.writeInt(i);
        Parcel zzB = zzB(4, zza);
        tn1 j8 = tn1.C3647a.m28820j8(zzB.readStrongBinder());
        zzB.recycle();
        return j8;
    }

    /* renamed from: o8 */
    public final tn1 mo27155o8(tn1 tn1, String str, boolean z, long j) throws RemoteException {
        Parcel zza = zza();
        sr5.m27805e(zza, tn1);
        zza.writeString(str);
        zza.writeInt(z ? 1 : 0);
        zza.writeLong(j);
        Parcel zzB = zzB(7, zza);
        tn1 j8 = tn1.C3647a.m28820j8(zzB.readStrongBinder());
        zzB.recycle();
        return j8;
    }

    /* renamed from: s5 */
    public final int mo27156s5() throws RemoteException {
        Parcel zzB = zzB(6, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }
}
