package com.onedelhi.secure;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class se5 extends ba5 implements of5 {
    public se5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
    }

    /* renamed from: A1 */
    public final boolean mo21903A1() throws RemoteException {
        Parcel j8 = mo13608j8(11, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: F3 */
    public final String mo21904F3() throws RemoteException {
        Parcel j8 = mo13608j8(3, mo13609k8());
        String readString = j8.readString();
        j8.recycle();
        return readString;
    }

    /* renamed from: N6 */
    public final boolean mo21905N6(of5 of5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, of5);
        Parcel j8 = mo13608j8(8, k8);
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: P */
    public final void mo21906P(boolean z) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30280d(k8, z);
        mo13610l8(6, k8);
    }

    /* renamed from: R3 */
    public final void mo21907R3(boolean z) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30280d(k8, z);
        mo13610l8(10, k8);
    }

    /* renamed from: T1 */
    public final void mo21908T1(float f) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        mo13610l8(12, k8);
    }

    /* renamed from: c7 */
    public final void mo21909c7(float f) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        mo13610l8(4, k8);
    }

    /* renamed from: i */
    public final float mo21910i() throws RemoteException {
        Parcel j8 = mo13608j8(5, mo13609k8());
        float readFloat = j8.readFloat();
        j8.recycle();
        return readFloat;
    }

    /* renamed from: k */
    public final float mo21911k() throws RemoteException {
        Parcel j8 = mo13608j8(13, mo13609k8());
        float readFloat = j8.readFloat();
        j8.recycle();
        return readFloat;
    }

    /* renamed from: n */
    public final int mo21912n() throws RemoteException {
        Parcel j8 = mo13608j8(9, mo13609k8());
        int readInt = j8.readInt();
        j8.recycle();
        return readInt;
    }

    /* renamed from: n4 */
    public final void mo21913n4() throws RemoteException {
        mo13610l8(2, mo13609k8());
    }

    /* renamed from: s2 */
    public final boolean mo21914s2() throws RemoteException {
        Parcel j8 = mo13608j8(7, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: w1 */
    public final void mo21915w1() throws RemoteException {
        mo13610l8(1, mo13609k8());
    }
}
