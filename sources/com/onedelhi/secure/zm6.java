package com.onedelhi.secure;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;
import com.onedelhi.secure.tn1;

public final class zm6 extends ba5 implements pn1 {
    public zm6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate");
    }

    /* renamed from: B */
    public final void mo22510B() throws RemoteException {
        mo13610l8(14, mo13609k8());
    }

    /* renamed from: C */
    public final void mo22511C(Bundle bundle) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, bundle);
        mo13610l8(13, k8);
    }

    /* renamed from: D1 */
    public final void mo22512D1(tn1 tn1, GoogleMapOptions googleMapOptions, Bundle bundle) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, tn1);
        vr5.m30281e(k8, googleMapOptions);
        vr5.m30281e(k8, bundle);
        mo13610l8(2, k8);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.nn1 mo22513L0() throws android.os.RemoteException {
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
            java.lang.String r2 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.onedelhi.secure.nn1
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.onedelhi.secure.nn1 r1 = (com.onedelhi.secure.nn1) r1
            goto L_0x0025
        L_0x001f:
            com.onedelhi.secure.aa6 r2 = new com.onedelhi.secure.aa6
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.zm6.mo22513L0():com.onedelhi.secure.nn1");
    }

    /* renamed from: Y */
    public final tn1 mo22514Y(tn1 tn1, tn1 tn12, Bundle bundle) throws RemoteException {
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
    public final void mo22515c() throws RemoteException {
        mo13610l8(16, mo13609k8());
    }

    /* renamed from: d */
    public final void mo22516d() throws RemoteException {
        mo13610l8(15, mo13609k8());
    }

    /* renamed from: e */
    public final void mo22517e() throws RemoteException {
        mo13610l8(6, mo13609k8());
    }

    /* renamed from: f */
    public final void mo22518f() throws RemoteException {
        mo13610l8(5, mo13609k8());
    }

    /* renamed from: g */
    public final void mo22519g() throws RemoteException {
        mo13610l8(8, mo13609k8());
    }

    /* renamed from: h */
    public final void mo22520h(Bundle bundle) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, bundle);
        mo13610l8(3, k8);
    }

    /* renamed from: j */
    public final void mo22521j(Bundle bundle) throws RemoteException {
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
    public final boolean mo22523p0() throws RemoteException {
        Parcel j8 = mo13608j8(11, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: r */
    public final void mo22524r(qi5 qi5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, qi5);
        mo13610l8(12, k8);
    }

    /* renamed from: v */
    public final void mo22525v() throws RemoteException {
        mo13610l8(7, mo13609k8());
    }
}
