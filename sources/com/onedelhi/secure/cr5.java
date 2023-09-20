package com.onedelhi.secure;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.onedelhi.secure.tn1;

public final class cr5 extends ba5 implements ao1 {
    public cr5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.zn1 mo13209Q() throws android.os.RemoteException {
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
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.cr5.mo13209Q():com.onedelhi.secure.zn1");
    }

    /* renamed from: S2 */
    public final void mo13210S2(tn1 tn1, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, tn1);
        vr5.m30281e(k8, streetViewPanoramaOptions);
        vr5.m30281e(k8, bundle);
        mo13610l8(2, k8);
    }

    /* renamed from: Y */
    public final tn1 mo13211Y(tn1 tn1, tn1 tn12, Bundle bundle) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, tn1);
        vr5.m30283g(k8, tn12);
        vr5.m30281e(k8, bundle);
        Parcel j8 = mo13608j8(4, k8);
        tn1 j82 = tn1.C3647a.m28820j8(j8.readStrongBinder());
        j8.recycle();
        return j82;
    }

    /* renamed from: c */
    public final void mo13212c() throws RemoteException {
        mo13610l8(14, mo13609k8());
    }

    /* renamed from: d */
    public final void mo13213d() throws RemoteException {
        mo13610l8(13, mo13609k8());
    }

    /* renamed from: e */
    public final void mo13214e() throws RemoteException {
        mo13610l8(6, mo13609k8());
    }

    /* renamed from: f */
    public final void mo13215f() throws RemoteException {
        mo13610l8(5, mo13609k8());
    }

    /* renamed from: f0 */
    public final void mo13216f0(dq5 dq5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, dq5);
        mo13610l8(12, k8);
    }

    /* renamed from: g */
    public final void mo13217g() throws RemoteException {
        mo13610l8(8, mo13609k8());
    }

    /* renamed from: h */
    public final void mo13218h(Bundle bundle) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, bundle);
        mo13610l8(3, k8);
    }

    /* renamed from: j */
    public final void mo13219j(Bundle bundle) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, bundle);
        Parcel j8 = mo13608j8(10, k8);
        if (j8.readInt() != 0) {
            bundle.readFromParcel(j8);
        }
        j8.recycle();
    }

    public final void onLowMemory() throws RemoteException {
        mo13610l8(9, mo13609k8());
    }

    /* renamed from: p0 */
    public final boolean mo13221p0() throws RemoteException {
        Parcel j8 = mo13608j8(11, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: v */
    public final void mo13222v() throws RemoteException {
        mo13610l8(7, mo13609k8());
    }
}
