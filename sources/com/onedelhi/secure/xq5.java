package com.onedelhi.secure;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.C1444a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.onedelhi.secure.tn1;

public final class xq5 extends ba5 implements zn1 {
    public xq5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
    }

    /* renamed from: E6 */
    public final void mo27044E6(jp5 jp5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, jp5);
        mo13610l8(17, k8);
    }

    /* renamed from: H5 */
    public final void mo27045H5(StreetViewPanoramaCamera streetViewPanoramaCamera, long j) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, streetViewPanoramaCamera);
        k8.writeLong(j);
        mo13610l8(9, k8);
    }

    /* renamed from: O2 */
    public final void mo27046O2(boolean z) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30280d(k8, z);
        mo13610l8(2, k8);
    }

    /* renamed from: O4 */
    public final void mo27047O4(boolean z) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30280d(k8, z);
        mo13610l8(3, k8);
    }

    /* renamed from: O7 */
    public final StreetViewPanoramaCamera mo27048O7() throws RemoteException {
        Parcel j8 = mo13608j8(10, mo13609k8());
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) vr5.m30277a(j8, StreetViewPanoramaCamera.CREATOR);
        j8.recycle();
        return streetViewPanoramaCamera;
    }

    /* renamed from: R2 */
    public final void mo27049R2(zo5 zo5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, zo5);
        mo13610l8(15, k8);
    }

    /* renamed from: S3 */
    public final void mo27050S3(LatLng latLng, u44 u44) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, latLng);
        vr5.m30281e(k8, u44);
        mo13610l8(21, k8);
    }

    /* renamed from: S5 */
    public final boolean mo27051S5() throws RemoteException {
        Parcel j8 = mo13608j8(6, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: T4 */
    public final t44 mo27052T4() throws RemoteException {
        Parcel j8 = mo13608j8(14, mo13609k8());
        t44 t44 = (t44) vr5.m30277a(j8, t44.CREATOR);
        j8.recycle();
        return t44;
    }

    /* renamed from: U4 */
    public final C1444a mo27053U4(tn1 tn1) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, tn1);
        Parcel j8 = mo13608j8(18, k8);
        C1444a aVar = (C1444a) vr5.m30277a(j8, C1444a.CREATOR);
        j8.recycle();
        return aVar;
    }

    /* renamed from: W2 */
    public final boolean mo27054W2() throws RemoteException {
        Parcel j8 = mo13608j8(7, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: c3 */
    public final void mo27055c3(po5 po5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, po5);
        mo13610l8(16, k8);
    }

    /* renamed from: d4 */
    public final void mo27056d4(LatLng latLng) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, latLng);
        mo13610l8(12, k8);
    }

    /* renamed from: i0 */
    public final boolean mo27057i0() throws RemoteException {
        Parcel j8 = mo13608j8(5, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: i1 */
    public final void mo27058i1(LatLng latLng, int i) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, latLng);
        k8.writeInt(i);
        mo13610l8(13, k8);
    }

    /* renamed from: i2 */
    public final tn1 mo27059i2(C1444a aVar) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, aVar);
        Parcel j8 = mo13608j8(19, k8);
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }

    /* renamed from: k4 */
    public final void mo27060k4(boolean z) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30280d(k8, z);
        mo13610l8(4, k8);
    }

    /* renamed from: n6 */
    public final void mo27061n6(LatLng latLng, int i, u44 u44) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, latLng);
        k8.writeInt(i);
        vr5.m30281e(k8, u44);
        mo13610l8(22, k8);
    }

    /* renamed from: t3 */
    public final void mo27062t3(boolean z) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30280d(k8, z);
        mo13610l8(1, k8);
    }

    /* renamed from: w3 */
    public final boolean mo27063w3() throws RemoteException {
        Parcel j8 = mo13608j8(8, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: z4 */
    public final void mo27064z4(tp5 tp5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, tp5);
        mo13610l8(20, k8);
    }

    /* renamed from: z6 */
    public final void mo27065z6(String str) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeString(str);
        mo13610l8(11, k8);
    }
}
