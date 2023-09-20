package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public final class m75 extends m55 {

    /* renamed from: a */
    public final /* synthetic */ p75 f15943a;

    public m75(p75 p75) {
        this.f15943a = p75;
    }

    /* renamed from: e2 */
    public final void mo20100e2(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException {
        if (googleSignInAccount != null) {
            k85.m19555c(this.f15943a.f18407a).mo18959e(this.f15943a.f18408a, googleSignInAccount);
        }
        this.f15943a.setResult(new zh1(googleSignInAccount, status));
    }
}
