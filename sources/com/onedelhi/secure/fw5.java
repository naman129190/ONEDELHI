package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class fw5 extends a16 {

    /* renamed from: b */
    public final /* synthetic */ j36 f12360b;

    /* renamed from: d */
    public final /* synthetic */ long f12361d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fw5(j36 j36, long j) {
        super(j36, true);
        this.f12360b = j36;
        this.f12361d = j;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f12360b.f14000a)).setSessionTimeoutDuration(this.f12361d);
    }
}
