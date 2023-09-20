package com.onedelhi.secure;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.onedelhi.secure.tn1;
import java.util.ArrayList;
import java.util.List;

public final class ck6 extends ba5 implements op6 {
    public ck6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    /* renamed from: B1 */
    public final double mo14172B1() throws RemoteException {
        Parcel j8 = mo13608j8(6, mo13609k8());
        double readDouble = j8.readDouble();
        j8.recycle();
        return readDouble;
    }

    /* renamed from: E */
    public final List mo14173E() throws RemoteException {
        Parcel j8 = mo13608j8(22, mo13609k8());
        ArrayList<h03> createTypedArrayList = j8.createTypedArrayList(h03.CREATOR);
        j8.recycle();
        return createTypedArrayList;
    }

    /* renamed from: E0 */
    public final void mo14174E0(int i) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeInt(i);
        mo13610l8(11, k8);
    }

    /* renamed from: G */
    public final String mo14175G() throws RemoteException {
        Parcel j8 = mo13608j8(2, mo13609k8());
        String readString = j8.readString();
        j8.recycle();
        return readString;
    }

    /* renamed from: H */
    public final tn1 mo14176H() throws RemoteException {
        Parcel j8 = mo13608j8(24, mo13609k8());
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }

    /* renamed from: J6 */
    public final void mo14177J6(float f) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        mo13610l8(7, k8);
    }

    /* renamed from: K0 */
    public final boolean mo14178K0() throws RemoteException {
        Parcel j8 = mo13608j8(20, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: N */
    public final void mo14179N(tn1 tn1) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, tn1);
        mo13610l8(23, k8);
    }

    /* renamed from: N0 */
    public final void mo14180N0(boolean z) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30280d(k8, z);
        mo13610l8(15, k8);
    }

    /* renamed from: S7 */
    public final void mo14181S7(LatLng latLng) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, latLng);
        mo13610l8(3, k8);
    }

    /* renamed from: U5 */
    public final void mo14182U5(double d) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeDouble(d);
        mo13610l8(5, k8);
    }

    /* renamed from: e8 */
    public final void mo14183e8(int i) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeInt(i);
        mo13610l8(9, k8);
    }

    /* renamed from: g0 */
    public final void mo14184g0(List list) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeTypedList(list);
        mo13610l8(21, k8);
    }

    /* renamed from: i */
    public final float mo14185i() throws RemoteException {
        Parcel j8 = mo13608j8(8, mo13609k8());
        float readFloat = j8.readFloat();
        j8.recycle();
        return readFloat;
    }

    /* renamed from: k0 */
    public final LatLng mo14186k0() throws RemoteException {
        Parcel j8 = mo13608j8(4, mo13609k8());
        LatLng latLng = (LatLng) vr5.m30277a(j8, LatLng.CREATOR);
        j8.recycle();
        return latLng;
    }

    /* renamed from: l */
    public final int mo14187l() throws RemoteException {
        Parcel j8 = mo13608j8(12, mo13609k8());
        int readInt = j8.readInt();
        j8.recycle();
        return readInt;
    }

    /* renamed from: p */
    public final int mo14188p() throws RemoteException {
        Parcel j8 = mo13608j8(18, mo13609k8());
        int readInt = j8.readInt();
        j8.recycle();
        return readInt;
    }

    /* renamed from: r0 */
    public final void mo14189r0(float f) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        mo13610l8(13, k8);
    }

    /* renamed from: t */
    public final int mo14190t() throws RemoteException {
        Parcel j8 = mo13608j8(10, mo13609k8());
        int readInt = j8.readInt();
        j8.recycle();
        return readInt;
    }

    /* renamed from: t5 */
    public final boolean mo14191t5(op6 op6) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, op6);
        Parcel j8 = mo13608j8(17, k8);
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: u */
    public final float mo14192u() throws RemoteException {
        Parcel j8 = mo13608j8(14, mo13609k8());
        float readFloat = j8.readFloat();
        j8.recycle();
        return readFloat;
    }

    /* renamed from: w */
    public final void mo14193w(boolean z) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30280d(k8, z);
        mo13610l8(19, k8);
    }

    /* renamed from: y */
    public final void mo14194y() throws RemoteException {
        mo13610l8(1, mo13609k8());
    }

    /* renamed from: z */
    public final boolean mo14195z() throws RemoteException {
        Parcel j8 = mo13608j8(16, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }
}
