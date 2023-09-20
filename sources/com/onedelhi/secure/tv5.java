package com.onedelhi.secure;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class tv5 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ Bundle f21149a;

    /* renamed from: b */
    public final /* synthetic */ j36 f21150b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tv5(j36 j36, Bundle bundle) {
        super(j36, true);
        this.f21150b = j36;
        this.f21149a = bundle;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f21150b.f14000a)).setConsent(this.f21149a, this.f8559b);
    }
}
