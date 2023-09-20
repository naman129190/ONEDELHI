package com.onedelhi.secure;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public interface x85 extends IInterface {
    /* renamed from: C5 */
    void mo20099C5(Status status) throws RemoteException;

    /* renamed from: e2 */
    void mo20100e2(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException;

    /* renamed from: m0 */
    void mo20101m0(Status status) throws RemoteException;
}
