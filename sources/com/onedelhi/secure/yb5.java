package com.onedelhi.secure;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.onedelhi.secure.tn1;
import java.util.ArrayList;
import java.util.List;

public final class yb5 extends ba5 implements yc5 {
    public yb5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolygonDelegate");
    }

    /* renamed from: A0 */
    public final List mo27317A0() throws RemoteException {
        Parcel j8 = mo13608j8(26, mo13609k8());
        ArrayList<h03> createTypedArrayList = j8.createTypedArrayList(h03.CREATOR);
        j8.recycle();
        return createTypedArrayList;
    }

    /* renamed from: B0 */
    public final void mo27318B0(int i) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeInt(i);
        mo13610l8(9, k8);
    }

    /* renamed from: D */
    public final String mo27319D() throws RemoteException {
        Parcel j8 = mo13608j8(2, mo13609k8());
        String readString = j8.readString();
        j8.recycle();
        return readString;
    }

    /* renamed from: E */
    public final List mo27320E() throws RemoteException {
        Parcel j8 = mo13608j8(4, mo13609k8());
        ArrayList<LatLng> createTypedArrayList = j8.createTypedArrayList(LatLng.CREATOR);
        j8.recycle();
        return createTypedArrayList;
    }

    /* renamed from: E0 */
    public final void mo27321E0(int i) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeInt(i);
        mo13610l8(11, k8);
    }

    /* renamed from: E3 */
    public final void mo27322E3(int i) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeInt(i);
        mo13610l8(23, k8);
    }

    /* renamed from: H */
    public final tn1 mo27323H() throws RemoteException {
        Parcel j8 = mo13608j8(28, mo13609k8());
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }

    /* renamed from: K2 */
    public final void mo27324K2() throws RemoteException {
        mo13610l8(1, mo13609k8());
    }

    /* renamed from: M */
    public final boolean mo27325M() throws RemoteException {
        Parcel j8 = mo13608j8(18, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: M5 */
    public final void mo27326M5(tn1 tn1) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, tn1);
        mo13610l8(27, k8);
    }

    /* renamed from: V */
    public final void mo27327V(float f) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        mo13610l8(13, k8);
    }

    /* renamed from: W3 */
    public final boolean mo27328W3() throws RemoteException {
        Parcel j8 = mo13608j8(22, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: X */
    public final void mo27329X(boolean z) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30280d(k8, z);
        mo13610l8(15, k8);
    }

    /* renamed from: a1 */
    public final void mo27330a1(List list) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeList(list);
        mo13610l8(5, k8);
    }

    /* renamed from: a8 */
    public final List mo27331a8() throws RemoteException {
        Parcel j8 = mo13608j8(6, mo13609k8());
        ArrayList b = vr5.m30278b(j8);
        j8.recycle();
        return b;
    }

    /* renamed from: d0 */
    public final void mo27332d0(boolean z) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30280d(k8, z);
        mo13610l8(17, k8);
    }

    /* renamed from: g0 */
    public final void mo27333g0(List list) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeTypedList(list);
        mo13610l8(3, k8);
    }

    /* renamed from: i */
    public final float mo27334i() throws RemoteException {
        Parcel j8 = mo13608j8(14, mo13609k8());
        float readFloat = j8.readFloat();
        j8.recycle();
        return readFloat;
    }

    /* renamed from: k */
    public final float mo27335k() throws RemoteException {
        Parcel j8 = mo13608j8(8, mo13609k8());
        float readFloat = j8.readFloat();
        j8.recycle();
        return readFloat;
    }

    /* renamed from: l */
    public final int mo27336l() throws RemoteException {
        Parcel j8 = mo13608j8(10, mo13609k8());
        int readInt = j8.readInt();
        j8.recycle();
        return readInt;
    }

    /* renamed from: n */
    public final int mo27337n() throws RemoteException {
        Parcel j8 = mo13608j8(12, mo13609k8());
        int readInt = j8.readInt();
        j8.recycle();
        return readInt;
    }

    /* renamed from: o0 */
    public final void mo27338o0(List list) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeTypedList(list);
        mo13610l8(25, k8);
    }

    /* renamed from: p */
    public final int mo27339p() throws RemoteException {
        Parcel j8 = mo13608j8(20, mo13609k8());
        int readInt = j8.readInt();
        j8.recycle();
        return readInt;
    }

    /* renamed from: q */
    public final boolean mo27340q() throws RemoteException {
        Parcel j8 = mo13608j8(16, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: r0 */
    public final void mo27341r0(float f) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        mo13610l8(7, k8);
    }

    /* renamed from: r2 */
    public final boolean mo27342r2(yc5 yc5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, yc5);
        Parcel j8 = mo13608j8(19, k8);
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: t */
    public final int mo27343t() throws RemoteException {
        Parcel j8 = mo13608j8(24, mo13609k8());
        int readInt = j8.readInt();
        j8.recycle();
        return readInt;
    }

    /* renamed from: w */
    public final void mo27344w(boolean z) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30280d(k8, z);
        mo13610l8(21, k8);
    }
}
