package com.onedelhi.secure;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class mz5 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ lr5 f16962a;

    /* renamed from: b */
    public final /* synthetic */ j36 f16963b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mz5(j36 j36, lr5 lr5) {
        super(j36, true);
        this.f16963b = j36;
        this.f16962a = lr5;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f16963b.f14000a)).getAppInstanceId(this.f16962a);
    }

    /* renamed from: b */
    public final void mo12480b() {
        this.f16962a.mo17408W6((Bundle) null);
    }
}
