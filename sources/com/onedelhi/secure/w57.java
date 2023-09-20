package com.onedelhi.secure;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.onedelhi.secure.tn1;

public final class w57 extends ba5 implements lb5 {
    public w57(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    /* renamed from: A */
    public final String mo19412A() throws RemoteException {
        Parcel j8 = mo13608j8(2, mo13609k8());
        String readString = j8.readString();
        j8.recycle();
        return readString;
    }

    /* renamed from: D */
    public final String mo19413D() throws RemoteException {
        Parcel j8 = mo13608j8(8, mo13609k8());
        String readString = j8.readString();
        j8.recycle();
        return readString;
    }

    /* renamed from: D0 */
    public final boolean mo19414D0() throws RemoteException {
        Parcel j8 = mo13608j8(13, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: G */
    public final String mo19415G() throws RemoteException {
        Parcel j8 = mo13608j8(6, mo13609k8());
        String readString = j8.readString();
        j8.recycle();
        return readString;
    }

    /* renamed from: J7 */
    public final void mo19416J7(float f) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        mo13610l8(22, k8);
    }

    /* renamed from: M */
    public final boolean mo19417M() throws RemoteException {
        Parcel j8 = mo13608j8(10, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: M0 */
    public final boolean mo19418M0() throws RemoteException {
        Parcel j8 = mo13608j8(15, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: P3 */
    public final boolean mo19419P3(lb5 lb5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, lb5);
        Parcel j8 = mo13608j8(16, k8);
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: Q4 */
    public final void mo19420Q4(float f, float f2) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        k8.writeFloat(f2);
        mo13610l8(24, k8);
    }

    /* renamed from: Q6 */
    public final void mo19421Q6(tn1 tn1) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, tn1);
        mo13610l8(29, k8);
    }

    /* renamed from: V */
    public final void mo19422V(float f) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        mo13610l8(27, k8);
    }

    /* renamed from: X */
    public final void mo19423X(boolean z) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30280d(k8, z);
        mo13610l8(14, k8);
    }

    /* renamed from: X1 */
    public final LatLng mo19424X1() throws RemoteException {
        Parcel j8 = mo13608j8(4, mo13609k8());
        LatLng latLng = (LatLng) vr5.m30277a(j8, LatLng.CREATOR);
        j8.recycle();
        return latLng;
    }

    /* renamed from: X2 */
    public final void mo19425X2(LatLng latLng) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, latLng);
        mo13610l8(3, k8);
    }

    /* renamed from: Y4 */
    public final void mo19426Y4() throws RemoteException {
        mo13610l8(12, mo13609k8());
    }

    /* renamed from: Y7 */
    public final void mo19427Y7() throws RemoteException {
        mo13610l8(11, mo13609k8());
    }

    /* renamed from: c8 */
    public final void mo19428c8(String str) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeString(str);
        mo13610l8(7, k8);
    }

    /* renamed from: d0 */
    public final void mo19429d0(boolean z) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30280d(k8, z);
        mo13610l8(20, k8);
    }

    /* renamed from: h0 */
    public final void mo19430h0(tn1 tn1) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, tn1);
        mo13610l8(18, k8);
    }

    /* renamed from: i */
    public final float mo19431i() throws RemoteException {
        Parcel j8 = mo13608j8(23, mo13609k8());
        float readFloat = j8.readFloat();
        j8.recycle();
        return readFloat;
    }

    /* renamed from: i6 */
    public final void mo19432i6(String str) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeString(str);
        mo13610l8(5, k8);
    }

    /* renamed from: k */
    public final float mo19433k() throws RemoteException {
        Parcel j8 = mo13608j8(26, mo13609k8());
        float readFloat = j8.readFloat();
        j8.recycle();
        return readFloat;
    }

    /* renamed from: l */
    public final int mo19434l() throws RemoteException {
        Parcel j8 = mo13608j8(17, mo13609k8());
        int readInt = j8.readInt();
        j8.recycle();
        return readInt;
    }

    /* renamed from: o2 */
    public final void mo19435o2(float f, float f2) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        k8.writeFloat(f2);
        mo13610l8(19, k8);
    }

    /* renamed from: q */
    public final boolean mo19436q() throws RemoteException {
        Parcel j8 = mo13608j8(21, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: q0 */
    public final void mo19437q0(float f) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        mo13610l8(25, k8);
    }

    /* renamed from: u */
    public final float mo19438u() throws RemoteException {
        Parcel j8 = mo13608j8(28, mo13609k8());
        float readFloat = j8.readFloat();
        j8.recycle();
        return readFloat;
    }

    /* renamed from: w0 */
    public final void mo19439w0(boolean z) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30280d(k8, z);
        mo13610l8(9, k8);
    }

    /* renamed from: y */
    public final void mo19440y() throws RemoteException {
        mo13610l8(1, mo13609k8());
    }

    /* renamed from: z0 */
    public final tn1 mo19441z0() throws RemoteException {
        Parcel j8 = mo13608j8(30, mo13609k8());
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }
}
