package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.ICancelToken;

public final /* synthetic */ class ot5 implements ov2 {

    /* renamed from: a */
    public final /* synthetic */ ICancelToken f18096a;

    public /* synthetic */ ot5(ICancelToken iCancelToken) {
        this.f18096a = iCancelToken;
    }

    /* renamed from: b */
    public final void mo22063b() {
        ICancelToken iCancelToken = this.f18096a;
        int i = xx5.f22799n;
        try {
            iCancelToken.cancel();
        } catch (RemoteException unused) {
        }
    }
}
