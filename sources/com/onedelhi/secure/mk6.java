package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

public final class mk6 extends yw5 {

    /* renamed from: a */
    public final /* synthetic */ x94 f16178a;

    public mk6(k11 k11, x94 x94) {
        this.f16178a = x94;
    }

    /* renamed from: Z */
    public final void mo14489Z(Status status) throws RemoteException {
        this.f16178a.mo26838d(new ApiException(status));
    }

    /* renamed from: m4 */
    public final void mo14490m4(boolean z) throws RemoteException {
        this.f16178a.mo26837c(Boolean.valueOf(z));
    }
}
