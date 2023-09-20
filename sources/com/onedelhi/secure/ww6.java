package com.onedelhi.secure;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

public final class ww6 extends ba5 implements g07 {
    public ww6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
    }

    /* renamed from: e0 */
    public final List mo16239e0() throws RemoteException {
        Parcel j8 = mo13608j8(3, mo13609k8());
        ArrayList<IBinder> createBinderArrayList = j8.createBinderArrayList();
        j8.recycle();
        return createBinderArrayList;
    }

    /* renamed from: n */
    public final int mo16240n() throws RemoteException {
        Parcel j8 = mo13608j8(6, mo13609k8());
        int readInt = j8.readInt();
        j8.recycle();
        return readInt;
    }

    /* renamed from: o */
    public final int mo16241o() throws RemoteException {
        Parcel j8 = mo13608j8(1, mo13609k8());
        int readInt = j8.readInt();
        j8.recycle();
        return readInt;
    }

    /* renamed from: s5 */
    public final int mo16242s5() throws RemoteException {
        Parcel j8 = mo13608j8(2, mo13609k8());
        int readInt = j8.readInt();
        j8.recycle();
        return readInt;
    }

    /* renamed from: y6 */
    public final boolean mo16243y6(g07 g07) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, g07);
        Parcel j8 = mo13608j8(5, k8);
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    public final boolean zzi() throws RemoteException {
        Parcel j8 = mo13608j8(4, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }
}
