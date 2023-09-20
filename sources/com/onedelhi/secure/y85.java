package com.onedelhi.secure;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

public interface y85 extends IInterface {
    /* renamed from: T6 */
    void mo15877T6(Status status, String str) throws RemoteException;

    /* renamed from: k2 */
    void mo15878k2(Status status, Credential credential) throws RemoteException;

    /* renamed from: m0 */
    void mo14070m0(Status status) throws RemoteException;
}
