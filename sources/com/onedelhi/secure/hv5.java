package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class hv5 extends a16 {

    /* renamed from: b */
    public final /* synthetic */ j36 f13319b;

    /* renamed from: b */
    public final /* synthetic */ String f13320b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hv5(j36 j36, String str) {
        super(j36, true);
        this.f13319b = j36;
        this.f13320b = str;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f13319b.f14000a)).setUserId(this.f13320b, this.f8559b);
    }
}
