package com.onedelhi.secure;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import javax.annotation.Nullable;

public interface c66 extends IInterface {
    /* renamed from: D3 */
    qn1 mo14020D3(tn1 tn1, @Nullable GoogleMapOptions googleMapOptions) throws RemoteException;

    /* renamed from: N5 */
    void mo14021N5(tn1 tn1, int i) throws RemoteException;

    /* renamed from: O5 */
    ln1 mo14022O5() throws RemoteException;

    /* renamed from: R7 */
    ao1 mo14023R7(tn1 tn1) throws RemoteException;

    /* renamed from: b7 */
    void mo14024b7(tn1 tn1, int i) throws RemoteException;

    /* renamed from: e7 */
    pn1 mo14025e7(tn1 tn1) throws RemoteException;

    /* renamed from: k1 */
    ih6 mo14026k1() throws RemoteException;

    /* renamed from: l6 */
    bo1 mo14027l6(tn1 tn1, @Nullable StreetViewPanoramaOptions streetViewPanoramaOptions) throws RemoteException;

    /* renamed from: o */
    int mo14028o() throws RemoteException;
}
