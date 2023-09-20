package com.onedelhi.secure;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import javax.annotation.Nullable;

public interface ao1 extends IInterface {
    @mr2
    /* renamed from: Q */
    zn1 mo13209Q() throws RemoteException;

    /* renamed from: S2 */
    void mo13210S2(@mr2 tn1 tn1, @Nullable StreetViewPanoramaOptions streetViewPanoramaOptions, @Nullable Bundle bundle) throws RemoteException;

    @mr2
    /* renamed from: Y */
    tn1 mo13211Y(@mr2 tn1 tn1, @mr2 tn1 tn12, @mr2 Bundle bundle) throws RemoteException;

    /* renamed from: c */
    void mo13212c() throws RemoteException;

    /* renamed from: d */
    void mo13213d() throws RemoteException;

    /* renamed from: e */
    void mo13214e() throws RemoteException;

    /* renamed from: f */
    void mo13215f() throws RemoteException;

    /* renamed from: f0 */
    void mo13216f0(dq5 dq5) throws RemoteException;

    /* renamed from: g */
    void mo13217g() throws RemoteException;

    /* renamed from: h */
    void mo13218h(@mr2 Bundle bundle) throws RemoteException;

    /* renamed from: j */
    void mo13219j(@mr2 Bundle bundle) throws RemoteException;

    void onLowMemory() throws RemoteException;

    /* renamed from: p0 */
    boolean mo13221p0() throws RemoteException;

    /* renamed from: v */
    void mo13222v() throws RemoteException;
}
