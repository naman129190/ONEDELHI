package com.onedelhi.secure;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class iz5 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ lr5 f13967a;

    /* renamed from: b */
    public final /* synthetic */ j36 f13968b;

    /* renamed from: b */
    public final /* synthetic */ String f13969b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iz5(j36 j36, String str, lr5 lr5) {
        super(j36, true);
        this.f13968b = j36;
        this.f13969b = str;
        this.f13967a = lr5;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f13968b.f14000a)).getMaxUserProperties(this.f13969b, this.f13967a);
    }

    /* renamed from: b */
    public final void mo12480b() {
        this.f13967a.mo17408W6((Bundle) null);
    }
}
