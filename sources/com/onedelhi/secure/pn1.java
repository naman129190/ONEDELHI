package com.onedelhi.secure;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;
import javax.annotation.Nullable;

public interface pn1 extends IInterface {
    /* renamed from: B */
    void mo22510B() throws RemoteException;

    /* renamed from: C */
    void mo22511C(@mr2 Bundle bundle) throws RemoteException;

    /* renamed from: D1 */
    void mo22512D1(@mr2 tn1 tn1, @Nullable GoogleMapOptions googleMapOptions, @mr2 Bundle bundle) throws RemoteException;

    @mr2
    /* renamed from: L0 */
    nn1 mo22513L0() throws RemoteException;

    @mr2
    /* renamed from: Y */
    tn1 mo22514Y(@mr2 tn1 tn1, @mr2 tn1 tn12, @mr2 Bundle bundle) throws RemoteException;

    /* renamed from: c */
    void mo22515c() throws RemoteException;

    /* renamed from: d */
    void mo22516d() throws RemoteException;

    /* renamed from: e */
    void mo22517e() throws RemoteException;

    /* renamed from: f */
    void mo22518f() throws RemoteException;

    /* renamed from: g */
    void mo22519g() throws RemoteException;

    /* renamed from: h */
    void mo22520h(@mr2 Bundle bundle) throws RemoteException;

    /* renamed from: j */
    void mo22521j(@mr2 Bundle bundle) throws RemoteException;

    void onLowMemory() throws RemoteException;

    /* renamed from: p0 */
    boolean mo22523p0() throws RemoteException;

    /* renamed from: r */
    void mo22524r(qi5 qi5) throws RemoteException;

    /* renamed from: v */
    void mo22525v() throws RemoteException;
}
