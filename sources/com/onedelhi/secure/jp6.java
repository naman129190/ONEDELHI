package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

public final class jp6 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ qq6 f14372a;

    /* renamed from: a */
    public final /* synthetic */ uy6 f14373a;

    public jp6(qq6 qq6, uy6 uy6) {
        this.f14372a = qq6;
        this.f14373a = uy6;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        ye5 V = this.f14372a.mo23369V((String) Preconditions.checkNotNull(this.f14373a.f21557b));
        ne5 ne5 = ne5.ANALYTICS_STORAGE;
        if (V.mo27438i(ne5) && ye5.m32305b(this.f14373a.f21576j).mo27438i(ne5)) {
            return this.f14372a.mo23366S(this.f14373a).mo27401j0();
        }
        this.f14372a.mo15136e().mo12730v().mo25379a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
