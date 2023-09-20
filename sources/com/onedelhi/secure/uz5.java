package com.onedelhi.secure;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class uz5 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ lr5 f21584a;

    /* renamed from: b */
    public final /* synthetic */ j36 f21585b;

    /* renamed from: n */
    public final /* synthetic */ int f21586n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uz5(j36 j36, lr5 lr5, int i) {
        super(j36, true);
        this.f21585b = j36;
        this.f21584a = lr5;
        this.f21586n = i;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f21585b.f14000a)).getTestFlag(this.f21584a, this.f21586n);
    }

    /* renamed from: b */
    public final void mo12480b() {
        this.f21584a.mo17408W6((Bundle) null);
    }
}
