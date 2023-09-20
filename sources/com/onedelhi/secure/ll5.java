package com.onedelhi.secure;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.onedelhi.secure.tn1;

public final class ll5 extends ba5 implements ln1 {
    public ll5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    /* renamed from: E5 */
    public final tn1 mo19697E5(float f, float f2) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        k8.writeFloat(f2);
        Parcel j8 = mo13608j8(3, k8);
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }

    /* renamed from: H2 */
    public final tn1 mo19698H2(LatLng latLng, float f) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, latLng);
        k8.writeFloat(f);
        Parcel j8 = mo13608j8(9, k8);
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }

    /* renamed from: Q0 */
    public final tn1 mo19699Q0(float f) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        Parcel j8 = mo13608j8(5, k8);
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }

    /* renamed from: Y1 */
    public final tn1 mo19700Y1(LatLng latLng) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, latLng);
        Parcel j8 = mo13608j8(8, k8);
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }

    /* renamed from: Y2 */
    public final tn1 mo19701Y2(float f) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        Parcel j8 = mo13608j8(4, k8);
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }

    /* renamed from: Y5 */
    public final tn1 mo19702Y5(LatLngBounds latLngBounds, int i, int i2, int i3) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, latLngBounds);
        k8.writeInt(i);
        k8.writeInt(i2);
        k8.writeInt(i3);
        Parcel j8 = mo13608j8(11, k8);
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }

    /* renamed from: Z2 */
    public final tn1 mo19703Z2() throws RemoteException {
        Parcel j8 = mo13608j8(1, mo13609k8());
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }

    /* renamed from: a6 */
    public final tn1 mo19704a6(LatLngBounds latLngBounds, int i) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, latLngBounds);
        k8.writeInt(i);
        Parcel j8 = mo13608j8(10, k8);
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }

    /* renamed from: h4 */
    public final tn1 mo19705h4(float f, int i, int i2) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        k8.writeInt(i);
        k8.writeInt(i2);
        Parcel j8 = mo13608j8(6, k8);
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }

    /* renamed from: s4 */
    public final tn1 mo19706s4(CameraPosition cameraPosition) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, cameraPosition);
        Parcel j8 = mo13608j8(7, k8);
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }

    /* renamed from: u7 */
    public final tn1 mo19707u7() throws RemoteException {
        Parcel j8 = mo13608j8(2, mo13609k8());
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }
}
