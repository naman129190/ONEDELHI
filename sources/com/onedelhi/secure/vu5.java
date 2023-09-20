package com.onedelhi.secure;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class vu5 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ Bundle f21978a;

    /* renamed from: b */
    public final /* synthetic */ j36 f21979b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vu5(j36 j36, Bundle bundle) {
        super(j36, true);
        this.f21979b = j36;
        this.f21978a = bundle;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f21979b.f14000a)).setConditionalUserProperty(this.f21978a, this.f8559b);
    }
}
