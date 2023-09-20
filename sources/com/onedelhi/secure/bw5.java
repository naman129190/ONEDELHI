package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class bw5 extends a16 {

    /* renamed from: b */
    public final /* synthetic */ j36 f9996b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bw5(j36 j36) {
        super(j36, true);
        this.f9996b = j36;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f9996b.f14000a)).resetAnalyticsData(this.f8559b);
    }
}
