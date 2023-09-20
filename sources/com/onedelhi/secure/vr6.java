package com.onedelhi.secure;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.onedelhi.secure.tn1;

public final class vr6 extends ba5 implements uv6 {
    public vr6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    /* renamed from: H */
    public final tn1 mo25751H() throws RemoteException {
        Parcel j8 = mo13608j8(25, mo13609k8());
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }

    /* renamed from: H4 */
    public final void mo25752H4(boolean z) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30280d(k8, z);
        mo13610l8(15, k8);
    }

    /* renamed from: M2 */
    public final void mo25753M2(float f) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        mo13610l8(13, k8);
    }

    /* renamed from: N */
    public final void mo25754N(tn1 tn1) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, tn1);
        mo13610l8(24, k8);
    }

    /* renamed from: O6 */
    public final void mo25755O6(float f, float f2) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        k8.writeFloat(f2);
        mo13610l8(6, k8);
    }

    /* renamed from: X4 */
    public final void mo25756X4(float f) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        mo13610l8(17, k8);
    }

    /* renamed from: a4 */
    public final void mo25757a4(LatLng latLng) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, latLng);
        mo13610l8(3, k8);
    }

    /* renamed from: b1 */
    public final boolean mo25758b1(uv6 uv6) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, uv6);
        Parcel j8 = mo13608j8(19, k8);
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: d5 */
    public final LatLngBounds mo25759d5() throws RemoteException {
        Parcel j8 = mo13608j8(10, mo13609k8());
        LatLngBounds latLngBounds = (LatLngBounds) vr5.m30277a(j8, LatLngBounds.CREATOR);
        j8.recycle();
        return latLngBounds;
    }

    /* renamed from: g3 */
    public final boolean mo25760g3() throws RemoteException {
        Parcel j8 = mo13608j8(16, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: h0 */
    public final void mo25761h0(tn1 tn1) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, tn1);
        mo13610l8(21, k8);
    }

    /* renamed from: i */
    public final float mo25762i() throws RemoteException {
        Parcel j8 = mo13608j8(8, mo13609k8());
        float readFloat = j8.readFloat();
        j8.recycle();
        return readFloat;
    }

    /* renamed from: k */
    public final float mo25763k() throws RemoteException {
        Parcel j8 = mo13608j8(12, mo13609k8());
        float readFloat = j8.readFloat();
        j8.recycle();
        return readFloat;
    }

    /* renamed from: k0 */
    public final LatLng mo25764k0() throws RemoteException {
        Parcel j8 = mo13608j8(4, mo13609k8());
        LatLng latLng = (LatLng) vr5.m30277a(j8, LatLng.CREATOR);
        j8.recycle();
        return latLng;
    }

    /* renamed from: p */
    public final int mo25765p() throws RemoteException {
        Parcel j8 = mo13608j8(20, mo13609k8());
        int readInt = j8.readInt();
        j8.recycle();
        return readInt;
    }

    /* renamed from: p3 */
    public final void mo25766p3(float f) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        mo13610l8(5, k8);
    }

    /* renamed from: p6 */
    public final float mo25767p6() throws RemoteException {
        Parcel j8 = mo13608j8(14, mo13609k8());
        float readFloat = j8.readFloat();
        j8.recycle();
        return readFloat;
    }

    /* renamed from: q0 */
    public final void mo25768q0(float f) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        mo13610l8(11, k8);
    }

    /* renamed from: q1 */
    public final String mo25769q1() throws RemoteException {
        Parcel j8 = mo13608j8(2, mo13609k8());
        String readString = j8.readString();
        j8.recycle();
        return readString;
    }

    /* renamed from: r7 */
    public final void mo25770r7(LatLngBounds latLngBounds) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, latLngBounds);
        mo13610l8(9, k8);
    }

    /* renamed from: u */
    public final float mo25771u() throws RemoteException {
        Parcel j8 = mo13608j8(18, mo13609k8());
        float readFloat = j8.readFloat();
        j8.recycle();
        return readFloat;
    }

    /* renamed from: w */
    public final void mo25772w(boolean z) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30280d(k8, z);
        mo13610l8(22, k8);
    }

    /* renamed from: w5 */
    public final float mo25773w5() throws RemoteException {
        Parcel j8 = mo13608j8(7, mo13609k8());
        float readFloat = j8.readFloat();
        j8.recycle();
        return readFloat;
    }

    /* renamed from: y */
    public final void mo25774y() throws RemoteException {
        mo13610l8(1, mo13609k8());
    }

    /* renamed from: z */
    public final boolean mo25775z() throws RemoteException {
        Parcel j8 = mo13608j8(23, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }
}
