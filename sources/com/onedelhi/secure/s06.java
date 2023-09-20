package com.onedelhi.secure;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

public final class s06 extends a16 {

    /* renamed from: a */
    public final /* synthetic */ Bundle f20159a;

    /* renamed from: a */
    public final /* synthetic */ Long f20160a;

    /* renamed from: b */
    public final /* synthetic */ j36 f20161b;

    /* renamed from: b */
    public final /* synthetic */ String f20162b;

    /* renamed from: c */
    public final /* synthetic */ String f20163c;

    /* renamed from: c */
    public final /* synthetic */ boolean f20164c;

    /* renamed from: d */
    public final /* synthetic */ boolean f20165d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s06(j36 j36, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(j36, true);
        this.f20161b = j36;
        this.f20160a = l;
        this.f20162b = str;
        this.f20163c = str2;
        this.f20159a = bundle;
        this.f20164c = z;
        this.f20165d = z2;
    }

    /* renamed from: a */
    public final void mo12479a() throws RemoteException {
        Long l = this.f20160a;
        ((dt5) Preconditions.checkNotNull(this.f20161b.f14000a)).logEvent(this.f20162b, this.f20163c, this.f20159a, this.f20164c, this.f20165d, l == null ? this.f8559b : l.longValue());
    }
}
