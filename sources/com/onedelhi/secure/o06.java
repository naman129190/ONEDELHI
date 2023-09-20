package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class o06 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ i16 f17638a;

    /* renamed from: b */
    public final /* synthetic */ j36 f17639b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o06(j36 j36, i16 i16) {
        super(j36, true);
        this.f17639b = j36;
        this.f17638a = i16;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f17639b.f14000a)).unregisterOnMeasurementEventListener(this.f17638a);
    }
}
