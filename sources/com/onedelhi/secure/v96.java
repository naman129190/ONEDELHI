package com.onedelhi.secure;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.onedelhi.secure.tn1;

public final class v96 extends ba5 implements ih6 {
    public v96(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    /* renamed from: A3 */
    public final tn1 mo17806A3(String str) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeString(str);
        Parcel j8 = mo13608j8(2, k8);
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }

    /* renamed from: E4 */
    public final tn1 mo17807E4(String str) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeString(str);
        Parcel j8 = mo13608j8(7, k8);
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }

    /* renamed from: Q3 */
    public final tn1 mo17808Q3(String str) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeString(str);
        Parcel j8 = mo13608j8(3, k8);
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }

    /* renamed from: Z4 */
    public final tn1 mo17809Z4(Bitmap bitmap) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, bitmap);
        Parcel j8 = mo13608j8(6, k8);
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }

    /* renamed from: h2 */
    public final tn1 mo17810h2(int i) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeInt(i);
        Parcel j8 = mo13608j8(1, k8);
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }

    /* renamed from: p2 */
    public final tn1 mo17811p2(float f) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        Parcel j8 = mo13608j8(5, k8);
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }

    public final tn1 zzd() throws RemoteException {
        Parcel j8 = mo13608j8(4, mo13609k8());
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }
}
