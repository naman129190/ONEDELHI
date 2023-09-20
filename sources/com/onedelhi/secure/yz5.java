package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class yz5 extends a16 {

    /* renamed from: b */
    public final /* synthetic */ j36 f23373b;

    /* renamed from: c */
    public final /* synthetic */ boolean f23374c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yz5(j36 j36, boolean z) {
        super(j36, true);
        this.f23373b = j36;
        this.f23374c = z;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f23373b.f14000a)).setDataCollectionEnabled(this.f23374c);
    }
}
