package com.onedelhi.secure;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.onedelhi.secure.tn1;
import java.util.ArrayList;
import java.util.List;

public final class kd5 extends ba5 implements he5 {
    public kd5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }

    /* renamed from: A0 */
    public final List mo17210A0() throws RemoteException {
        Parcel j8 = mo13608j8(4, mo13609k8());
        ArrayList<LatLng> createTypedArrayList = j8.createTypedArrayList(LatLng.CREATOR);
        j8.recycle();
        return createTypedArrayList;
    }

    /* renamed from: B0 */
    public final void mo17211B0(int i) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeInt(i);
        mo13610l8(23, k8);
    }

    /* renamed from: B3 */
    public final void mo17212B3(C3952xu xuVar) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, xuVar);
        mo13610l8(19, k8);
    }

    /* renamed from: D0 */
    public final boolean mo17213D0() throws RemoteException {
        Parcel j8 = mo13608j8(14, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: D6 */
    public final C3952xu mo17214D6() throws RemoteException {
        Parcel j8 = mo13608j8(20, mo13609k8());
        C3952xu xuVar = (C3952xu) vr5.m30277a(j8, C3952xu.CREATOR);
        j8.recycle();
        return xuVar;
    }

    /* renamed from: D7 */
    public final void mo17215D7(float f) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        mo13610l8(9, k8);
    }

    /* renamed from: E */
    public final List mo17216E() throws RemoteException {
        Parcel j8 = mo13608j8(26, mo13609k8());
        ArrayList<h03> createTypedArrayList = j8.createTypedArrayList(h03.CREATOR);
        j8.recycle();
        return createTypedArrayList;
    }

    /* renamed from: F7 */
    public final void mo17217F7(List list) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeTypedList(list);
        mo13610l8(29, k8);
    }

    /* renamed from: G */
    public final String mo17218G() throws RemoteException {
        Parcel j8 = mo13608j8(2, mo13609k8());
        String readString = j8.readString();
        j8.recycle();
        return readString;
    }

    /* renamed from: J0 */
    public final tn1 mo17219J0() throws RemoteException {
        Parcel j8 = mo13608j8(28, mo13609k8());
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }

    /* renamed from: K5 */
    public final void mo17220K5(List list) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeTypedList(list);
        mo13610l8(25, k8);
    }

    /* renamed from: M0 */
    public final boolean mo17221M0() throws RemoteException {
        Parcel j8 = mo13608j8(12, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: O3 */
    public final void mo17222O3() throws RemoteException {
        mo13610l8(1, mo13609k8());
    }

    /* renamed from: Q5 */
    public final boolean mo17223Q5(he5 he5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, he5);
        Parcel j8 = mo13608j8(15, k8);
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: S4 */
    public final void mo17224S4(tn1 tn1) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, tn1);
        mo13610l8(27, k8);
    }

    /* renamed from: W1 */
    public final C3952xu mo17225W1() throws RemoteException {
        Parcel j8 = mo13608j8(22, mo13609k8());
        C3952xu xuVar = (C3952xu) vr5.m30277a(j8, C3952xu.CREATOR);
        j8.recycle();
        return xuVar;
    }

    /* renamed from: Y6 */
    public final void mo17226Y6(float f) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        mo13610l8(5, k8);
    }

    /* renamed from: h1 */
    public final void mo17227h1(boolean z) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30280d(k8, z);
        mo13610l8(13, k8);
    }

    /* renamed from: i */
    public final float mo17228i() throws RemoteException {
        Parcel j8 = mo13608j8(10, mo13609k8());
        float readFloat = j8.readFloat();
        j8.recycle();
        return readFloat;
    }

    /* renamed from: k */
    public final float mo17229k() throws RemoteException {
        Parcel j8 = mo13608j8(6, mo13609k8());
        float readFloat = j8.readFloat();
        j8.recycle();
        return readFloat;
    }

    /* renamed from: l */
    public final int mo17230l() throws RemoteException {
        Parcel j8 = mo13608j8(24, mo13609k8());
        int readInt = j8.readInt();
        j8.recycle();
        return readInt;
    }

    /* renamed from: n */
    public final int mo17231n() throws RemoteException {
        Parcel j8 = mo13608j8(8, mo13609k8());
        int readInt = j8.readInt();
        j8.recycle();
        return readInt;
    }

    /* renamed from: o0 */
    public final void mo17232o0(List list) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeTypedList(list);
        mo13610l8(3, k8);
    }

    /* renamed from: q */
    public final boolean mo17233q() throws RemoteException {
        Parcel j8 = mo13608j8(18, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: t */
    public final int mo17234t() throws RemoteException {
        Parcel j8 = mo13608j8(16, mo13609k8());
        int readInt = j8.readInt();
        j8.recycle();
        return readInt;
    }

    /* renamed from: v7 */
    public final void mo17235v7(int i) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeInt(i);
        mo13610l8(7, k8);
    }

    /* renamed from: w0 */
    public final void mo17236w0(boolean z) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30280d(k8, z);
        mo13610l8(17, k8);
    }

    /* renamed from: x7 */
    public final void mo17237x7(C3952xu xuVar) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, xuVar);
        mo13610l8(21, k8);
    }

    /* renamed from: y1 */
    public final void mo17238y1(boolean z) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30280d(k8, z);
        mo13610l8(11, k8);
    }

    /* renamed from: y5 */
    public final List mo17239y5() throws RemoteException {
        Parcel j8 = mo13608j8(30, mo13609k8());
        ArrayList<f64> createTypedArrayList = j8.createTypedArrayList(f64.CREATOR);
        j8.recycle();
        return createTypedArrayList;
    }
}
