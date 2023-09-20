package com.onedelhi.secure;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

public final class aa6 extends ba5 implements nn1 {
    public aa6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    /* renamed from: B */
    public final void mo12892B() throws RemoteException {
        mo13610l8(82, mo13609k8());
    }

    /* renamed from: C */
    public final void mo12893C(Bundle bundle) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, bundle);
        mo13610l8(81, k8);
    }

    /* renamed from: E7 */
    public final boolean mo12894E7() throws RemoteException {
        Parcel j8 = mo13608j8(19, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: G2 */
    public final void mo12895G2(boolean z) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30280d(k8, z);
        mo13610l8(22, k8);
    }

    /* renamed from: G4 */
    public final void mo12896G4(dg5 dg5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, dg5);
        mo13610l8(111, k8);
    }

    /* renamed from: H6 */
    public final void mo12897H6(tm5 tm5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, tm5);
        mo13610l8(107, k8);
    }

    /* renamed from: I5 */
    public final void mo12898I5(h27 h27) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, h27);
        mo13610l8(97, k8);
    }

    /* renamed from: I6 */
    public final void mo12899I6(float f) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        mo13610l8(92, k8);
    }

    /* renamed from: I7 */
    public final void mo12900I7(boolean z) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30280d(k8, z);
        mo13610l8(41, k8);
    }

    /* renamed from: J3 */
    public final uv6 mo12901J3(xi1 xi1) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, xi1);
        Parcel j8 = mo13608j8(12, k8);
        uv6 k82 = nt6.m23171k8(j8.readStrongBinder());
        j8.recycle();
        return k82;
    }

    /* renamed from: K7 */
    public final void mo12902K7() throws RemoteException {
        mo13610l8(8, mo13609k8());
    }

    /* renamed from: L1 */
    public final void mo12903L1(ax6 ax6) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, ax6);
        mo13610l8(99, k8);
    }

    /* renamed from: L2 */
    public final g57 mo12904L2() throws RemoteException {
        Parcel j8 = mo13608j8(109, mo13609k8());
        g57 k8 = q47.m25326k8(j8.readStrongBinder());
        j8.recycle();
        return k8;
    }

    /* renamed from: L5 */
    public final void mo12905L5() throws RemoteException {
        mo13610l8(94, mo13609k8());
    }

    /* renamed from: M6 */
    public final lb5 mo12906M6(sd2 sd2) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, sd2);
        Parcel j8 = mo13608j8(11, k8);
        lb5 k82 = k67.m19509k8(j8.readStrongBinder());
        j8.recycle();
        return k82;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: N1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.eo1 mo12907N1() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo13609k8()
            r1 = 25
            android.os.Parcel r0 = r4.mo13608j8(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IUiSettingsDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.onedelhi.secure.eo1
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.onedelhi.secure.eo1 r1 = (com.onedelhi.secure.eo1) r1
            goto L_0x0026
        L_0x0020:
            com.onedelhi.secure.mr5 r2 = new com.onedelhi.secure.mr5
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.aa6.mo12907N1():com.onedelhi.secure.eo1");
    }

    /* renamed from: N4 */
    public final void mo12908N4(on1 on1) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, on1);
        mo13610l8(24, k8);
    }

    /* renamed from: P4 */
    public final void mo12909P4(p37 p37) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, p37);
        mo13610l8(96, k8);
    }

    /* renamed from: Q1 */
    public final int mo12910Q1() throws RemoteException {
        Parcel j8 = mo13608j8(15, mo13609k8());
        int readInt = j8.readInt();
        j8.recycle();
        return readInt;
    }

    /* renamed from: Q7 */
    public final void mo12911Q7(ai5 ai5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, ai5);
        mo13610l8(29, k8);
    }

    /* renamed from: R5 */
    public final boolean mo12912R5(bd2 bd2) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, bd2);
        Parcel j8 = mo13608j8(91, k8);
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: T7 */
    public final void mo12913T7(mk5 mk5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, mk5);
        mo13610l8(37, k8);
    }

    /* renamed from: U2 */
    public final void mo12914U2(int i) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeInt(i);
        mo13610l8(16, k8);
    }

    /* renamed from: U6 */
    public final void mo12915U6(boolean z) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30280d(k8, z);
        mo13610l8(51, k8);
    }

    /* renamed from: W0 */
    public final boolean mo12916W0() throws RemoteException {
        Parcel j8 = mo13608j8(17, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: W5 */
    public final void mo12917W5(wj5 wj5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, wj5);
        mo13610l8(31, k8);
    }

    /* renamed from: W7 */
    public final void mo12918W7(ae5 ae5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, ae5);
        mo13610l8(86, k8);
    }

    /* renamed from: X0 */
    public final void mo12919X0(cd5 cd5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, cd5);
        mo13610l8(32, k8);
    }

    /* renamed from: X5 */
    public final void mo12920X5(nh6 nh6) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, nh6);
        mo13610l8(33, k8);
    }

    /* renamed from: Y0 */
    public final void mo12921Y0(LatLngBounds latLngBounds) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, latLngBounds);
        mo13610l8(95, k8);
    }

    /* renamed from: Z7 */
    public final void mo12922Z7(tn1 tn1) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, tn1);
        mo13610l8(5, k8);
    }

    /* renamed from: a2 */
    public final void mo12923a2(hm5 hm5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, hm5);
        mo13610l8(36, k8);
    }

    /* renamed from: b3 */
    public final void mo12924b3(pb5 pb5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, pb5);
        mo13610l8(45, k8);
    }

    /* renamed from: c */
    public final void mo12925c() throws RemoteException {
        mo13610l8(102, mo13609k8());
    }

    /* renamed from: c1 */
    public final void mo12926c1(int i, int i2, int i3, int i4) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeInt(i);
        k8.writeInt(i2);
        k8.writeInt(i3);
        k8.writeInt(i4);
        mo13610l8(39, k8);
    }

    public final void clear() throws RemoteException {
        mo13610l8(14, mo13609k8());
    }

    /* renamed from: d */
    public final void mo12928d() throws RemoteException {
        mo13610l8(101, mo13609k8());
    }

    /* renamed from: d6 */
    public final float mo12929d6() throws RemoteException {
        Parcel j8 = mo13608j8(3, mo13609k8());
        float readFloat = j8.readFloat();
        j8.recycle();
        return readFloat;
    }

    /* renamed from: e */
    public final void mo12930e() throws RemoteException {
        mo13610l8(56, mo13609k8());
    }

    /* renamed from: f */
    public final void mo12931f() throws RemoteException {
        mo13610l8(55, mo13609k8());
    }

    /* renamed from: f1 */
    public final void mo12932f1(rn5 rn5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, rn5);
        mo13610l8(85, k8);
    }

    /* renamed from: f4 */
    public final boolean mo12933f4(boolean z) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30280d(k8, z);
        Parcel j8 = mo13608j8(20, k8);
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: f5 */
    public final g07 mo12934f5() throws RemoteException {
        Parcel j8 = mo13608j8(44, mo13609k8());
        g07 k8 = oy6.m24281k8(j8.readStrongBinder());
        j8.recycle();
        return k8;
    }

    /* renamed from: g */
    public final void mo12935g() throws RemoteException {
        mo13610l8(57, mo13609k8());
    }

    /* renamed from: g5 */
    public final yc5 mo12936g5(e33 e33) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, e33);
        Parcel j8 = mo13608j8(10, k8);
        yc5 k82 = mc5.m21485k8(j8.readStrongBinder());
        j8.recycle();
        return k82;
    }

    /* renamed from: h */
    public final void mo12937h(Bundle bundle) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, bundle);
        mo13610l8(54, k8);
    }

    /* renamed from: h5 */
    public final void mo12938h5(dg5 dg5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, dg5);
        mo13610l8(110, k8);
    }

    /* renamed from: j */
    public final void mo12939j(Bundle bundle) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, bundle);
        Parcel j8 = mo13608j8(60, k8);
        if (j8.readInt() != 0) {
            bundle.readFromParcel(j8);
        }
        j8.recycle();
    }

    /* renamed from: j3 */
    public final void mo12940j3(gj5 gj5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, gj5);
        mo13610l8(30, k8);
    }

    /* renamed from: j5 */
    public final void mo12941j5(String str) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeString(str);
        mo13610l8(61, k8);
    }

    /* renamed from: k3 */
    public final void mo12942k3(boolean z) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30280d(k8, z);
        mo13610l8(18, k8);
    }

    /* renamed from: l1 */
    public final void mo12943l1(fn5 fn5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, fn5);
        mo13610l8(80, k8);
    }

    /* renamed from: l3 */
    public final void mo12944l3(sq5 sq5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, sq5);
        mo13610l8(71, k8);
    }

    /* renamed from: l4 */
    public final void mo12945l4(v47 v47) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, v47);
        mo13610l8(89, k8);
    }

    /* renamed from: m3 */
    public final void mo12946m3(kh5 kh5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, kh5);
        mo13610l8(42, k8);
    }

    /* renamed from: m6 */
    public final void mo12947m6(rt6 rt6) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, rt6);
        mo13610l8(27, k8);
    }

    /* renamed from: m7 */
    public final void mo12948m7(a67 a67) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, a67);
        mo13610l8(83, k8);
    }

    /* renamed from: n5 */
    public final Location mo12949n5() throws RemoteException {
        Parcel j8 = mo13608j8(23, mo13609k8());
        Location location = (Location) vr5.m30277a(j8, Location.CREATOR);
        j8.recycle();
        return location;
    }

    /* renamed from: o1 */
    public final float mo12950o1() throws RemoteException {
        Parcel j8 = mo13608j8(2, mo13609k8());
        float readFloat = j8.readFloat();
        j8.recycle();
        return readFloat;
    }

    /* renamed from: o4 */
    public final CameraPosition mo12951o4() throws RemoteException {
        Parcel j8 = mo13608j8(1, mo13609k8());
        CameraPosition cameraPosition = (CameraPosition) vr5.m30277a(j8, CameraPosition.CREATOR);
        j8.recycle();
        return cameraPosition;
    }

    /* renamed from: o5 */
    public final void mo12952o5(tn1 tn1) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, tn1);
        mo13610l8(4, k8);
    }

    /* renamed from: o6 */
    public final void mo12953o6(do5 do5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, do5);
        mo13610l8(87, k8);
    }

    public final void onLowMemory() throws RemoteException {
        mo13610l8(58, mo13609k8());
    }

    /* renamed from: p4 */
    public final he5 mo12955p4(g33 g33) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, g33);
        Parcel j8 = mo13608j8(9, k8);
        he5 k82 = wd5.m30795k8(j8.readStrongBinder());
        j8.recycle();
        return k82;
    }

    /* renamed from: p7 */
    public final boolean mo12956p7() throws RemoteException {
        Parcel j8 = mo13608j8(21, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: q2 */
    public final op6 mo12957q2(C1927cy cyVar) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, cyVar);
        Parcel j8 = mo13608j8(35, k8);
        op6 k82 = vm6.m30230k8(j8.readStrongBinder());
        j8.recycle();
        return k82;
    }

    /* renamed from: q4 */
    public final void mo12958q4(ug5 ug5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, ug5);
        mo13610l8(28, k8);
    }

    /* renamed from: q6 */
    public final boolean mo12959q6() throws RemoteException {
        Parcel j8 = mo13608j8(59, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: r */
    public final void mo12960r(qi5 qi5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, qi5);
        mo13610l8(53, k8);
    }

    /* renamed from: s7 */
    public final void mo12961s7(tn1 tn1, int i, gx5 gx5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, tn1);
        k8.writeInt(i);
        vr5.m30283g(k8, gx5);
        mo13610l8(7, k8);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: t2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.onedelhi.secure.un1 mo12962t2() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.mo13609k8()
            r1 = 26
            android.os.Parcel r0 = r4.mo13608j8(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.maps.internal.IProjectionDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.onedelhi.secure.un1
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.onedelhi.secure.un1 r1 = (com.onedelhi.secure.un1) r1
            goto L_0x0026
        L_0x0020:
            com.onedelhi.secure.iq5 r2 = new com.onedelhi.secure.iq5
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.aa6.mo12962t2():com.onedelhi.secure.un1");
    }

    /* renamed from: u5 */
    public final void mo12963u5(tn1 tn1, gx5 gx5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, tn1);
        vr5.m30283g(k8, gx5);
        mo13610l8(6, k8);
    }

    /* renamed from: v5 */
    public final boolean mo12964v5() throws RemoteException {
        Parcel j8 = mo13608j8(40, mo13609k8());
        boolean h = vr5.m30284h(j8);
        j8.recycle();
        return h;
    }

    /* renamed from: w6 */
    public final void mo12965w6(float f) throws RemoteException {
        Parcel k8 = mo13609k8();
        k8.writeFloat(f);
        mo13610l8(93, k8);
    }

    /* renamed from: x5 */
    public final void mo12966x5(k07 k07) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, k07);
        mo13610l8(98, k8);
    }

    /* renamed from: x6 */
    public final void mo12967x6(sq5 sq5, tn1 tn1) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, sq5);
        vr5.m30283g(k8, tn1);
        mo13610l8(38, k8);
    }

    /* renamed from: y7 */
    public final of5 mo12968y7(nd4 nd4) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30281e(k8, nd4);
        Parcel j8 = mo13608j8(13, k8);
        of5 k82 = df5.m13090k8(j8.readStrongBinder());
        j8.recycle();
        return k82;
    }

    /* renamed from: z1 */
    public final void mo12969z1(we5 we5) throws RemoteException {
        Parcel k8 = mo13609k8();
        vr5.m30283g(k8, we5);
        mo13610l8(84, k8);
    }
}
