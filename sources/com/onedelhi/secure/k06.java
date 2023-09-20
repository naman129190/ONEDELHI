package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class k06 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ i16 f14670a;

    /* renamed from: b */
    public final /* synthetic */ j36 f14671b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k06(j36 j36, i16 i16) {
        super(j36, true);
        this.f14671b = j36;
        this.f14670a = i16;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f14671b.f14000a)).registerOnMeasurementEventListener(this.f14670a);
    }
}
