package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class nw5 extends a16 {

    /* renamed from: b */
    public final /* synthetic */ j36 f17612b;

    /* renamed from: b */
    public final /* synthetic */ String f17613b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nw5(j36 j36, String str) {
        super(j36, true);
        this.f17612b = j36;
        this.f17613b = str;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f17612b.f14000a)).beginAdUnitExposure(this.f17613b, this.f8561c);
    }
}
