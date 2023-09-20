package com.onedelhi.secure;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class dv5 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ lr5 f10961a;

    /* renamed from: b */
    public final /* synthetic */ j36 f10962b;

    /* renamed from: b */
    public final /* synthetic */ String f10963b;

    /* renamed from: c */
    public final /* synthetic */ String f10964c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dv5(j36 j36, String str, String str2, lr5 lr5) {
        super(j36, true);
        this.f10962b = j36;
        this.f10963b = str;
        this.f10964c = str2;
        this.f10961a = lr5;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f10962b.f14000a)).getConditionalUserProperties(this.f10963b, this.f10964c, this.f10961a);
    }

    /* renamed from: b */
    public final void mo12480b() {
        this.f10961a.mo17408W6((Bundle) null);
    }
}
