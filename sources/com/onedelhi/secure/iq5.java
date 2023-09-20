package com.onedelhi.secure;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.onedelhi.secure.tn1;

public final class iq5 extends ba5 implements un1 {
    public iq5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    /* renamed from: A5 */
    public final tn1 mo17943A5(LatLng latLng) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, latLng);
        Parcel j8 = mo13608j8(2, k8);
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }

    /* renamed from: L4 */
    public final iw4 mo17944L4() throws RemoteException {
        Parcel j8 = mo13608j8(3, mo13609k8());
        iw4 iw4 = (iw4) vr5.m30277a(j8, iw4.CREATOR);
        j8.recycle();
        return iw4;
    }

    /* renamed from: i4 */
    public final LatLng mo17945i4(tn1 tn1) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, tn1);
        Parcel j8 = mo13608j8(1, k8);
        LatLng latLng = (LatLng) vr5.m30277a(j8, LatLng.CREATOR);
        j8.recycle();
        return latLng;
    }
}
