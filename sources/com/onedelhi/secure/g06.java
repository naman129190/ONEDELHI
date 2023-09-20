package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class g06 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ e16 f12388a;

    /* renamed from: b */
    public final /* synthetic */ j36 f12389b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g06(j36 j36, e16 e16) {
        super(j36, true);
        this.f12389b = j36;
        this.f12388a = e16;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f12389b.f14000a)).setEventInterceptor(this.f12388a);
    }
}
