package com.onedelhi.secure;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

public final class q36 extends yo5 implements w36 {
    public q36(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: B2 */
    public final void mo13642B2(wq6 wq6, uy6 uy6) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17766d(j8, wq6);
        ip5.m17766d(j8, uy6);
        mo27656l8(2, j8);
    }

    /* renamed from: C4 */
    public final void mo13643C4(fc5 fc5) throws RemoteException {
        throw null;
    }

    /* renamed from: D2 */
    public final List mo13644D2(String str, String str2, uy6 uy6) throws RemoteException {
        Parcel j8 = mo27654j8();
        j8.writeString(str);
        j8.writeString(str2);
        ip5.m17766d(j8, uy6);
        Parcel k8 = mo27655k8(16, j8);
        ArrayList<fc5> createTypedArrayList = k8.createTypedArrayList(fc5.CREATOR);
        k8.recycle();
        return createTypedArrayList;
    }

    /* renamed from: E1 */
    public final List mo13645E1(uy6 uy6, boolean z) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17766d(j8, uy6);
        j8.writeInt(z ? 1 : 0);
        Parcel k8 = mo27655k8(7, j8);
        ArrayList<wq6> createTypedArrayList = k8.createTypedArrayList(wq6.CREATOR);
        k8.recycle();
        return createTypedArrayList;
    }

    /* renamed from: I2 */
    public final void mo13646I2(uy6 uy6) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17766d(j8, uy6);
        mo27656l8(6, j8);
    }

    /* renamed from: I4 */
    public final List mo13647I4(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel j8 = mo27654j8();
        j8.writeString((String) null);
        j8.writeString(str2);
        j8.writeString(str3);
        int i = ip5.f13795a;
        j8.writeInt(z ? 1 : 0);
        Parcel k8 = mo27655k8(15, j8);
        ArrayList<wq6> createTypedArrayList = k8.createTypedArrayList(wq6.CREATOR);
        k8.recycle();
        return createTypedArrayList;
    }

    /* renamed from: R0 */
    public final String mo13648R0(uy6 uy6) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17766d(j8, uy6);
        Parcel k8 = mo27655k8(11, j8);
        String readString = k8.readString();
        k8.recycle();
        return readString;
    }

    /* renamed from: T0 */
    public final void mo13649T0(xj5 xj5, uy6 uy6) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17766d(j8, xj5);
        ip5.m17766d(j8, uy6);
        mo27656l8(1, j8);
    }

    /* renamed from: T3 */
    public final void mo13650T3(Bundle bundle, uy6 uy6) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17766d(j8, bundle);
        ip5.m17766d(j8, uy6);
        mo27656l8(19, j8);
    }

    /* renamed from: V4 */
    public final void mo13651V4(uy6 uy6) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17766d(j8, uy6);
        mo27656l8(18, j8);
    }

    /* renamed from: Z5 */
    public final void mo13652Z5(xj5 xj5, String str, String str2) throws RemoteException {
        throw null;
    }

    /* renamed from: f7 */
    public final List mo13653f7(String str, String str2, String str3) throws RemoteException {
        Parcel j8 = mo27654j8();
        j8.writeString((String) null);
        j8.writeString(str2);
        j8.writeString(str3);
        Parcel k8 = mo27655k8(17, j8);
        ArrayList<fc5> createTypedArrayList = k8.createTypedArrayList(fc5.CREATOR);
        k8.recycle();
        return createTypedArrayList;
    }

    /* renamed from: i7 */
    public final List mo13654i7(String str, String str2, boolean z, uy6 uy6) throws RemoteException {
        Parcel j8 = mo27654j8();
        j8.writeString(str);
        j8.writeString(str2);
        int i = ip5.f13795a;
        j8.writeInt(z ? 1 : 0);
        ip5.m17766d(j8, uy6);
        Parcel k8 = mo27655k8(14, j8);
        ArrayList<wq6> createTypedArrayList = k8.createTypedArrayList(wq6.CREATOR);
        k8.recycle();
        return createTypedArrayList;
    }

    /* renamed from: m2 */
    public final void mo13657m2(uy6 uy6) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17766d(j8, uy6);
        mo27656l8(4, j8);
    }

    /* renamed from: o3 */
    public final void mo13659o3(uy6 uy6) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17766d(j8, uy6);
        mo27656l8(20, j8);
    }

    /* renamed from: u3 */
    public final void mo13664u3(fc5 fc5, uy6 uy6) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17766d(j8, fc5);
        ip5.m17766d(j8, uy6);
        mo27656l8(12, j8);
    }

    /* renamed from: w4 */
    public final byte[] mo13665w4(xj5 xj5, String str) throws RemoteException {
        Parcel j8 = mo27654j8();
        ip5.m17766d(j8, xj5);
        j8.writeString(str);
        Parcel k8 = mo27655k8(9, j8);
        byte[] createByteArray = k8.createByteArray();
        k8.recycle();
        return createByteArray;
    }

    /* renamed from: y3 */
    public final void mo13666y3(long j, String str, String str2, String str3) throws RemoteException {
        Parcel j8 = mo27654j8();
        j8.writeLong(j);
        j8.writeString(str);
        j8.writeString(str2);
        j8.writeString(str3);
        mo27656l8(10, j8);
    }
}
