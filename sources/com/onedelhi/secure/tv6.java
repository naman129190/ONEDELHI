package com.onedelhi.secure;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;

public interface tv6 extends IInterface {
    /* renamed from: B6 */
    void mo14861B6(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException;

    /* renamed from: B7 */
    void mo14862B7(C3354r3 r3Var, PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException;

    @Deprecated
    /* renamed from: C2 */
    ICancelToken mo14863C2(ub0 ub0, ez6 ez6) throws RemoteException;

    @Deprecated
    /* renamed from: C6 */
    void mo14864C6(f12 f12, ez6 ez6) throws RemoteException;

    /* renamed from: D5 */
    void mo14865D5(PendingIntent pendingIntent, ur6 ur6, String str) throws RemoteException;

    @Deprecated
    /* renamed from: E2 */
    Location mo14866E2() throws RemoteException;

    /* renamed from: F1 */
    void mo14867F1(jl5 jl5, PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException;

    @Deprecated
    /* renamed from: F4 */
    LocationAvailability mo14868F4(String str) throws RemoteException;

    /* renamed from: I1 */
    void mo14869I1(xf1 xf1, PendingIntent pendingIntent, ur6 ur6) throws RemoteException;

    /* renamed from: I3 */
    void mo14870I3(by5 by5, LocationRequest locationRequest, IStatusCallback iStatusCallback) throws RemoteException;

    /* renamed from: L3 */
    void mo14871L3(String[] strArr, ur6 ur6, String str) throws RemoteException;

    @Deprecated
    /* renamed from: N0 */
    void mo14872N0(boolean z) throws RemoteException;

    /* renamed from: P1 */
    void mo14873P1(um6 um6) throws RemoteException;

    /* renamed from: S1 */
    void mo14874S1(PendingIntent pendingIntent, b04 b04, IStatusCallback iStatusCallback) throws RemoteException;

    /* renamed from: V7 */
    void mo14875V7(c82 c82, b27 b27, String str) throws RemoteException;

    /* renamed from: e3 */
    void mo14876e3(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException;

    /* renamed from: g6 */
    void mo14877g6(long j, boolean z, PendingIntent pendingIntent) throws RemoteException;

    /* renamed from: h3 */
    void mo14878h3(Location location, IStatusCallback iStatusCallback) throws RemoteException;

    @Deprecated
    /* renamed from: h6 */
    void mo14879h6(ry5 ry5) throws RemoteException;

    /* renamed from: h7 */
    void mo14880h7(PendingIntent pendingIntent) throws RemoteException;

    @Deprecated
    /* renamed from: i3 */
    void mo14881i3(Location location) throws RemoteException;

    /* renamed from: l2 */
    void mo14882l2(boolean z, IStatusCallback iStatusCallback) throws RemoteException;

    /* renamed from: l5 */
    void mo14883l5(by5 by5, IStatusCallback iStatusCallback) throws RemoteException;
}
