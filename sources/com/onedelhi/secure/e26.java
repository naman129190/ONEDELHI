package com.onedelhi.secure;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class e26 extends ba5 implements c66 {
    public e26(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: D3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.qn1 mo14020D3(com.onedelhi.secure.tn1 r3, com.google.android.gms.maps.GoogleMapOptions r4) throws android.os.RemoteException {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.mo13609k8()
            com.onedelhi.secure.vr5.m30283g(r0, r3)
            com.onedelhi.secure.vr5.m30281e(r0, r4)
            r3 = 3
            android.os.Parcel r3 = r2.mo13608j8(r3, r0)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0017
            r4 = 0
            goto L_0x002b
        L_0x0017:
            java.lang.String r0 = "com.google.android.gms.maps.internal.IMapViewDelegate"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.onedelhi.secure.qn1
            if (r1 == 0) goto L_0x0025
            r4 = r0
            com.onedelhi.secure.qn1 r4 = (com.onedelhi.secure.qn1) r4
            goto L_0x002b
        L_0x0025:
            com.onedelhi.secure.sp6 r0 = new com.onedelhi.secure.sp6
            r0.<init>(r4)
            r4 = r0
        L_0x002b:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.e26.mo14020D3(com.onedelhi.secure.tn1, com.google.android.gms.maps.GoogleMapOptions):com.onedelhi.secure.qn1");
    }

    /* renamed from: N5 */
    public final void mo14021N5(tn1 tn1, int i) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, tn1);
        k8.writeInt(i);
        mo13610l8(10, k8);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: O5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.ln1 mo14022O5() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo13609k8()
            r1 = 4
            android.os.Parcel r0 = r4.mo13608j8(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.onedelhi.secure.ln1
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.onedelhi.secure.ln1 r1 = (com.onedelhi.secure.ln1) r1
            goto L_0x0025
        L_0x001f:
            com.onedelhi.secure.ll5 r2 = new com.onedelhi.secure.ll5
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.e26.mo14022O5():com.onedelhi.secure.ln1");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: R7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.ao1 mo14023R7(com.onedelhi.secure.tn1 r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.mo13609k8()
            com.onedelhi.secure.vr5.m30283g(r0, r4)
            r4 = 8
            android.os.Parcel r4 = r3.mo13608j8(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0015
            r0 = 0
            goto L_0x0029
        L_0x0015:
            java.lang.String r1 = "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.onedelhi.secure.ao1
            if (r2 == 0) goto L_0x0023
            r0 = r1
            com.onedelhi.secure.ao1 r0 = (com.onedelhi.secure.ao1) r0
            goto L_0x0029
        L_0x0023:
            com.onedelhi.secure.cr5 r1 = new com.onedelhi.secure.cr5
            r1.<init>(r0)
            r0 = r1
        L_0x0029:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.e26.mo14023R7(com.onedelhi.secure.tn1):com.onedelhi.secure.ao1");
    }

    /* renamed from: b7 */
    public final void mo14024b7(tn1 tn1, int i) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, tn1);
        k8.writeInt(i);
        mo13610l8(6, k8);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.pn1 mo14025e7(com.onedelhi.secure.tn1 r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.mo13609k8()
            com.onedelhi.secure.vr5.m30283g(r0, r4)
            r4 = 2
            android.os.Parcel r4 = r3.mo13608j8(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.maps.internal.IMapFragmentDelegate"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.onedelhi.secure.pn1
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.onedelhi.secure.pn1 r0 = (com.onedelhi.secure.pn1) r0
            goto L_0x0028
        L_0x0022:
            com.onedelhi.secure.zm6 r1 = new com.onedelhi.secure.zm6
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.e26.mo14025e7(com.onedelhi.secure.tn1):com.onedelhi.secure.pn1");
    }

    /* renamed from: k1 */
    public final ih6 mo14026k1() throws RemoteException {
        Parcel j8 = mo13608j8(5, mo13609k8());
        ih6 k8 = rd6.m26660k8(j8.readStrongBinder());
        j8.recycle();
        return k8;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: l6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.bo1 mo14027l6(com.onedelhi.secure.tn1 r3, com.google.android.gms.maps.StreetViewPanoramaOptions r4) throws android.os.RemoteException {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.mo13609k8()
            com.onedelhi.secure.vr5.m30283g(r0, r3)
            com.onedelhi.secure.vr5.m30281e(r0, r4)
            r3 = 7
            android.os.Parcel r3 = r2.mo13608j8(r3, r0)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0017
            r4 = 0
            goto L_0x002b
        L_0x0017:
            java.lang.String r0 = "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.onedelhi.secure.bo1
            if (r1 == 0) goto L_0x0025
            r4 = r0
            com.onedelhi.secure.bo1 r4 = (com.onedelhi.secure.bo1) r4
            goto L_0x002b
        L_0x0025:
            com.onedelhi.secure.hr5 r0 = new com.onedelhi.secure.hr5
            r0.<init>(r4)
            r4 = r0
        L_0x002b:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.e26.mo14027l6(com.onedelhi.secure.tn1, com.google.android.gms.maps.StreetViewPanoramaOptions):com.onedelhi.secure.bo1");
    }

    /* renamed from: o */
    public final int mo14028o() throws RemoteException {
        Parcel j8 = mo13608j8(9, mo13609k8());
        int readInt = j8.readInt();
        j8.recycle();
        return readInt;
    }
}
