package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class wy5 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ Object f22362a;

    /* renamed from: b */
    public final /* synthetic */ j36 f22363b;

    /* renamed from: b */
    public final /* synthetic */ String f22364b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wy5(j36 j36, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(j36, false);
        this.f22363b = j36;
        this.f22364b = str;
        this.f22362a = obj;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f22363b.f14000a)).logHealthData(5, this.f22364b, nt2.m23166l8(this.f22362a), nt2.m23166l8(null), nt2.m23166l8(null));
    }
}
