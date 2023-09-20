package com.onedelhi.secure;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

public interface i07 extends IInterface {
    /* renamed from: c2 */
    void mo15618c2(LocationResult locationResult) throws RemoteException;

    /* renamed from: f6 */
    void mo15619f6() throws RemoteException;

    /* renamed from: r4 */
    void mo15622r4(LocationAvailability locationAvailability) throws RemoteException;
}
