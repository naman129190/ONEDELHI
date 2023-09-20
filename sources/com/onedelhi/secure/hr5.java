package com.onedelhi.secure;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.onedelhi.secure.tn1;

public final class hr5 extends ba5 implements bo1 {
    public hr5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.zn1 mo13777Q() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo13609k8()
            r1 = 1
            android.os.Parcel r0 = r4.mo13608j8(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.onedelhi.secure.zn1
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.onedelhi.secure.zn1 r1 = (com.onedelhi.secure.zn1) r1
            goto L_0x0025
        L_0x001f:
            com.onedelhi.secure.xq5 r2 = new com.onedelhi.secure.xq5
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.hr5.mo13777Q():com.onedelhi.secure.zn1");
    }

    /* renamed from: b0 */
    public final tn1 mo13778b0() throws RemoteException {
        Parcel j8 = mo13608j8(8, mo13609k8());
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }

    /* renamed from: c */
    public final void mo13779c() throws RemoteException {
        mo13610l8(11, mo13609k8());
    }

    /* renamed from: d */
    public final void mo13780d() throws RemoteException {
        mo13610l8(10, mo13609k8());
    }

    /* renamed from: e */
    public final void mo13781e() throws RemoteException {
        mo13610l8(4, mo13609k8());
    }

    /* renamed from: f */
    public final void mo13782f() throws RemoteException {
        mo13610l8(3, mo13609k8());
    }

    /* renamed from: f0 */
    public final void mo13783f0(dq5 dq5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, dq5);
        mo13610l8(9, k8);
    }

    /* renamed from: g */
    public final void mo13784g() throws RemoteException {
        mo13610l8(5, mo13609k8());
    }

    /* renamed from: h */
    public final void mo13785h(Bundle bundle) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, bundle);
        mo13610l8(2, k8);
    }

    /* renamed from: j */
    public final void mo13786j(Bundle bundle) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, bundle);
        Parcel j8 = mo13608j8(7, k8);
        if (j8.readInt() != 0) {
            bundle.readFromParcel(j8);
        }
        j8.recycle();
    }

    public final void onLowMemory() throws RemoteException {
        mo13610l8(6, mo13609k8());
    }
}
