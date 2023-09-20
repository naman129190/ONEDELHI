package com.onedelhi.secure;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public interface ln1 extends IInterface {
    @mr2
    /* renamed from: E5 */
    tn1 mo19697E5(float f, float f2) throws RemoteException;

    @mr2
    /* renamed from: H2 */
    tn1 mo19698H2(@mr2 LatLng latLng, float f) throws RemoteException;

    @mr2
    /* renamed from: Q0 */
    tn1 mo19699Q0(float f) throws RemoteException;

    @mr2
    /* renamed from: Y1 */
    tn1 mo19700Y1(@mr2 LatLng latLng) throws RemoteException;

    @mr2
    /* renamed from: Y2 */
    tn1 mo19701Y2(float f) throws RemoteException;

    @mr2
    /* renamed from: Y5 */
    tn1 mo19702Y5(@mr2 LatLngBounds latLngBounds, int i, int i2, int i3) throws RemoteException;

    @mr2
    /* renamed from: Z2 */
    tn1 mo19703Z2() throws RemoteException;

    @mr2
    /* renamed from: a6 */
    tn1 mo19704a6(@mr2 LatLngBounds latLngBounds, int i) throws RemoteException;

    @mr2
    /* renamed from: h4 */
    tn1 mo19705h4(float f, int i, int i2) throws RemoteException;

    @mr2
    /* renamed from: s4 */
    tn1 mo19706s4(@mr2 CameraPosition cameraPosition) throws RemoteException;

    @mr2
    /* renamed from: u7 */
    tn1 mo19707u7() throws RemoteException;
}
