package com.onedelhi.secure;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class xv5 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ Bundle f22781a;

    /* renamed from: b */
    public final /* synthetic */ j36 f22782b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xv5(j36 j36, Bundle bundle) {
        super(j36, true);
        this.f22782b = j36;
        this.f22781a = bundle;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f22782b.f14000a)).setConsentThirdParty(this.f22781a, this.f8559b);
    }
}
