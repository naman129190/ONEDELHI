package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class rw5 extends a16 {

    /* renamed from: b */
    public final /* synthetic */ j36 f20104b;

    /* renamed from: b */
    public final /* synthetic */ String f20105b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rw5(j36 j36, String str) {
        super(j36, true);
        this.f20104b = j36;
        this.f20105b = str;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f20104b.f14000a)).endAdUnitExposure(this.f20105b, this.f8561c);
    }
}
