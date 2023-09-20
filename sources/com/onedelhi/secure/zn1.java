package com.onedelhi.secure;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.model.C1444a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import javax.annotation.Nullable;

public interface zn1 extends IInterface {
    /* renamed from: E6 */
    void mo27044E6(@Nullable jp5 jp5) throws RemoteException;

    /* renamed from: H5 */
    void mo27045H5(@mr2 StreetViewPanoramaCamera streetViewPanoramaCamera, long j) throws RemoteException;

    /* renamed from: O2 */
    void mo27046O2(boolean z) throws RemoteException;

    /* renamed from: O4 */
    void mo27047O4(boolean z) throws RemoteException;

    @mr2
    /* renamed from: O7 */
    StreetViewPanoramaCamera mo27048O7() throws RemoteException;

    /* renamed from: R2 */
    void mo27049R2(@Nullable zo5 zo5) throws RemoteException;

    /* renamed from: S3 */
    void mo27050S3(@mr2 LatLng latLng, @Nullable u44 u44) throws RemoteException;

    /* renamed from: S5 */
    boolean mo27051S5() throws RemoteException;

    @mr2
    /* renamed from: T4 */
    t44 mo27052T4() throws RemoteException;

    @mr2
    /* renamed from: U4 */
    C1444a mo27053U4(@mr2 tn1 tn1) throws RemoteException;

    /* renamed from: W2 */
    boolean mo27054W2() throws RemoteException;

    /* renamed from: c3 */
    void mo27055c3(@Nullable po5 po5) throws RemoteException;

    /* renamed from: d4 */
    void mo27056d4(@mr2 LatLng latLng) throws RemoteException;

    /* renamed from: i0 */
    boolean mo27057i0() throws RemoteException;

    /* renamed from: i1 */
    void mo27058i1(@mr2 LatLng latLng, int i) throws RemoteException;

    @ts2
    /* renamed from: i2 */
    tn1 mo27059i2(@mr2 C1444a aVar) throws RemoteException;

    /* renamed from: k4 */
    void mo27060k4(boolean z) throws RemoteException;

    /* renamed from: n6 */
    void mo27061n6(@mr2 LatLng latLng, int i, @Nullable u44 u44) throws RemoteException;

    /* renamed from: t3 */
    void mo27062t3(boolean z) throws RemoteException;

    /* renamed from: w3 */
    boolean mo27063w3() throws RemoteException;

    /* renamed from: z4 */
    void mo27064z4(@Nullable tp5 tp5) throws RemoteException;

    /* renamed from: z6 */
    void mo27065z6(@mr2 String str) throws RemoteException;
}
