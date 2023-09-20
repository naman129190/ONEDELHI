package com.onedelhi.secure;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class sy5 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ lr5 f20605a;

    /* renamed from: b */
    public final /* synthetic */ j36 f20606b;

    /* renamed from: b */
    public final /* synthetic */ String f20607b;

    /* renamed from: c */
    public final /* synthetic */ String f20608c;

    /* renamed from: c */
    public final /* synthetic */ boolean f20609c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sy5(j36 j36, String str, String str2, boolean z, lr5 lr5) {
        super(j36, true);
        this.f20606b = j36;
        this.f20607b = str;
        this.f20608c = str2;
        this.f20609c = z;
        this.f20605a = lr5;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f20606b.f14000a)).getUserProperties(this.f20607b, this.f20608c, this.f20609c, this.f20605a);
    }

    /* renamed from: b */
    public final void mo12480b() {
        this.f20605a.mo17408W6((Bundle) null);
    }
}
