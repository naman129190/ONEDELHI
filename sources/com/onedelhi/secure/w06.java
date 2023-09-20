package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class w06 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ Object f22019a;

    /* renamed from: b */
    public final /* synthetic */ j36 f22020b;

    /* renamed from: b */
    public final /* synthetic */ String f22021b;

    /* renamed from: c */
    public final /* synthetic */ String f22022c;

    /* renamed from: c */
    public final /* synthetic */ boolean f22023c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w06(j36 j36, String str, String str2, Object obj, boolean z) {
        super(j36, true);
        this.f22020b = j36;
        this.f22021b = str;
        this.f22022c = str2;
        this.f22019a = obj;
        this.f22023c = z;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        ((dt5) Preconditions.checkNotNull(this.f22020b.f14000a)).setUserProperty(this.f22021b, this.f22022c, nt2.m23166l8(this.f22019a), this.f22023c, this.f8559b);
    }
}
