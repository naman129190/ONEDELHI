package com.onedelhi.secure;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class ky5 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ lr5 f15123a;

    /* renamed from: b */
    public final /* synthetic */ j36 f15124b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ky5(j36 j36, lr5 lr5) {
        super(j36, true);
        this.f15124b = j36;
        this.f15123a = lr5;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f15124b.f14000a)).getCurrentScreenName(this.f15123a);
    }

    /* renamed from: b */
    public final void mo12480b() {
        this.f15123a.mo17408W6((Bundle) null);
    }
}
