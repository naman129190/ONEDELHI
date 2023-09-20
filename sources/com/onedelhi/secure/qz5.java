package com.onedelhi.secure;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class qz5 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ lr5 f19510a;

    /* renamed from: b */
    public final /* synthetic */ j36 f19511b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qz5(j36 j36, lr5 lr5) {
        super(j36, true);
        this.f19511b = j36;
        this.f19510a = lr5;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f19511b.f14000a)).getSessionId(this.f19510a);
    }

    /* renamed from: b */
    public final void mo12480b() {
        this.f19510a.mo17408W6((Bundle) null);
    }
}
