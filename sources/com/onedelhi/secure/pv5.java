package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class pv5 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ Boolean f18720a;

    /* renamed from: b */
    public final /* synthetic */ j36 f18721b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pv5(j36 j36, Boolean bool) {
        super(j36, true);
        this.f18721b = j36;
        this.f18720a = bool;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        if (this.f18720a != null) {
            ((dt5) Preconditions.checkNotNull(this.f18721b.f14000a)).setMeasurementEnabled(this.f18720a.booleanValue(), this.f8559b);
        } else {
            ((dt5) Preconditions.checkNotNull(this.f18721b.f14000a)).clearMeasurementEnabled(this.f8559b);
        }
    }
}
