package com.onedelhi.secure;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class az5 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ Bundle f9585a;

    /* renamed from: a */
    public final /* synthetic */ lr5 f9586a;

    /* renamed from: b */
    public final /* synthetic */ j36 f9587b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public az5(j36 j36, Bundle bundle, lr5 lr5) {
        super(j36, true);
        this.f9587b = j36;
        this.f9585a = bundle;
        this.f9586a = lr5;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f9587b.f14000a)).performAction(this.f9585a, this.f9586a, this.f8559b);
    }

    /* renamed from: b */
    public final void mo12480b() {
        this.f9586a.mo17408W6((Bundle) null);
    }
}
