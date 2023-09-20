package com.onedelhi.secure;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;

public final class du6 extends aa5 implements tv6 {
    public du6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    /* renamed from: B6 */
    public final void mo14861B6(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel j8 = mo12889j8();
        ur5.m29550d(j8, pendingIntent);
        ur5.m29551e(j8, iStatusCallback);
        mo12891l8(69, j8);
    }

    /* renamed from: B7 */
    public final void mo14862B7(C3354r3 r3Var, PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel j8 = mo12889j8();
        ur5.m29550d(j8, r3Var);
        ur5.m29550d(j8, pendingIntent);
        ur5.m29551e(j8, iStatusCallback);
        mo12891l8(72, j8);
    }

    /* renamed from: C2 */
    public final ICancelToken mo14863C2(ub0 ub0, ez6 ez6) throws RemoteException {
        Parcel j8 = mo12889j8();
        ur5.m29550d(j8, ub0);
        ur5.m29551e(j8, ez6);
        Parcel k8 = mo12890k8(87, j8);
        ICancelToken asInterface = ICancelToken.Stub.asInterface(k8.readStrongBinder());
        k8.recycle();
        return asInterface;
    }

    /* renamed from: C6 */
    public final void mo14864C6(f12 f12, ez6 ez6) throws RemoteException {
        Parcel j8 = mo12889j8();
        ur5.m29550d(j8, f12);
        ur5.m29551e(j8, ez6);
        mo12891l8(82, j8);
    }

    /* renamed from: D5 */
    public final void mo14865D5(PendingIntent pendingIntent, ur6 ur6, String str) throws RemoteException {
        Parcel j8 = mo12889j8();
        ur5.m29550d(j8, pendingIntent);
        ur5.m29551e(j8, ur6);
        j8.writeString(str);
        mo12891l8(2, j8);
    }

    /* renamed from: E2 */
    public final Location mo14866E2() throws RemoteException {
        Parcel k8 = mo12890k8(7, mo12889j8());
        Location location = (Location) ur5.m29547a(k8, Location.CREATOR);
        k8.recycle();
        return location;
    }

    /* renamed from: F1 */
    public final void mo14867F1(jl5 jl5, PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel j8 = mo12889j8();
        ur5.m29550d(j8, jl5);
        ur5.m29550d(j8, pendingIntent);
        ur5.m29551e(j8, iStatusCallback);
        mo12891l8(70, j8);
    }

    /* renamed from: F4 */
    public final LocationAvailability mo14868F4(String str) throws RemoteException {
        Parcel j8 = mo12889j8();
        j8.writeString(str);
        Parcel k8 = mo12890k8(34, j8);
        LocationAvailability locationAvailability = (LocationAvailability) ur5.m29547a(k8, LocationAvailability.CREATOR);
        k8.recycle();
        return locationAvailability;
    }

    /* renamed from: I1 */
    public final void mo14869I1(xf1 xf1, PendingIntent pendingIntent, ur6 ur6) throws RemoteException {
        Parcel j8 = mo12889j8();
        ur5.m29550d(j8, xf1);
        ur5.m29550d(j8, pendingIntent);
        ur5.m29551e(j8, ur6);
        mo12891l8(57, j8);
    }

    /* renamed from: I3 */
    public final void mo14870I3(by5 by5, LocationRequest locationRequest, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel j8 = mo12889j8();
        ur5.m29550d(j8, by5);
        ur5.m29550d(j8, locationRequest);
        ur5.m29551e(j8, iStatusCallback);
        mo12891l8(88, j8);
    }

    /* renamed from: L3 */
    public final void mo14871L3(String[] strArr, ur6 ur6, String str) throws RemoteException {
        Parcel j8 = mo12889j8();
        j8.writeStringArray(strArr);
        ur5.m29551e(j8, ur6);
        j8.writeString(str);
        mo12891l8(3, j8);
    }

    /* renamed from: N0 */
    public final void mo14872N0(boolean z) throws RemoteException {
        Parcel j8 = mo12889j8();
        ur5.m29549c(j8, z);
        mo12891l8(12, j8);
    }

    /* renamed from: P1 */
    public final void mo14873P1(um6 um6) throws RemoteException {
        Parcel j8 = mo12889j8();
        ur5.m29551e(j8, um6);
        mo12891l8(67, j8);
    }

    /* renamed from: S1 */
    public final void mo14874S1(PendingIntent pendingIntent, b04 b04, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel j8 = mo12889j8();
        ur5.m29550d(j8, pendingIntent);
        ur5.m29550d(j8, b04);
        ur5.m29551e(j8, iStatusCallback);
        mo12891l8(79, j8);
    }

    /* renamed from: V7 */
    public final void mo14875V7(c82 c82, b27 b27, String str) throws RemoteException {
        Parcel j8 = mo12889j8();
        ur5.m29550d(j8, c82);
        ur5.m29551e(j8, b27);
        j8.writeString((String) null);
        mo12891l8(63, j8);
    }

    /* renamed from: e3 */
    public final void mo14876e3(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel j8 = mo12889j8();
        ur5.m29550d(j8, pendingIntent);
        ur5.m29551e(j8, iStatusCallback);
        mo12891l8(73, j8);
    }

    /* renamed from: g6 */
    public final void mo14877g6(long j, boolean z, PendingIntent pendingIntent) throws RemoteException {
        Parcel j8 = mo12889j8();
        j8.writeLong(j);
        ur5.m29549c(j8, true);
        ur5.m29550d(j8, pendingIntent);
        mo12891l8(5, j8);
    }

    /* renamed from: h3 */
    public final void mo14878h3(Location location, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel j8 = mo12889j8();
        ur5.m29550d(j8, location);
        ur5.m29551e(j8, iStatusCallback);
        mo12891l8(85, j8);
    }

    /* renamed from: h6 */
    public final void mo14879h6(ry5 ry5) throws RemoteException {
        Parcel j8 = mo12889j8();
        ur5.m29550d(j8, ry5);
        mo12891l8(59, j8);
    }

    /* renamed from: h7 */
    public final void mo14880h7(PendingIntent pendingIntent) throws RemoteException {
        Parcel j8 = mo12889j8();
        ur5.m29550d(j8, pendingIntent);
        mo12891l8(6, j8);
    }

    /* renamed from: i3 */
    public final void mo14881i3(Location location) throws RemoteException {
        Parcel j8 = mo12889j8();
        ur5.m29550d(j8, location);
        mo12891l8(13, j8);
    }

    /* renamed from: l2 */
    public final void mo14882l2(boolean z, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel j8 = mo12889j8();
        ur5.m29549c(j8, z);
        ur5.m29551e(j8, iStatusCallback);
        mo12891l8(84, j8);
    }

    /* renamed from: l5 */
    public final void mo14883l5(by5 by5, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel j8 = mo12889j8();
        ur5.m29550d(j8, by5);
        ur5.m29551e(j8, iStatusCallback);
        mo12891l8(89, j8);
    }
}
