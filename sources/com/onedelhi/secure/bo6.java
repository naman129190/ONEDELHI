package com.onedelhi.secure;

import android.os.Bundle;

public final /* synthetic */ class bo6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ do6 f9916a;

    public /* synthetic */ bo6(do6 do6) {
        this.f9916a = do6;
    }

    public final void run() {
        do6 do6 = this.f9916a;
        fo6 fo6 = do6.f10870a;
        long j = do6.f10871b;
        long j2 = do6.f10872c;
        fo6.f12249a.mo15139h();
        fo6.f12249a.f11205a.mo15136e().mo12725q().mo25379a("Application going to the background");
        fo6.f12249a.f11205a.mo27864F().f18954c.mo27237a(true);
        Bundle bundle = new Bundle();
        if (!fo6.f12249a.f11205a.mo27891z().mo14112D()) {
            fo6.f12249a.f17507a.mo18531b(j2);
            fo6.f12249a.f17507a.mo18533d(false, false, j2);
        }
        fo6.f12249a.f11205a.mo27866I().mo23911v(bf0.f26274c, "_ab", j, bundle);
    }
}
