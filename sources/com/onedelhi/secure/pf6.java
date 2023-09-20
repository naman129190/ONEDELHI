package com.onedelhi.secure;

public final /* synthetic */ class pf6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ri6 f18523a;

    public /* synthetic */ pf6(ri6 ri6) {
        this.f18523a = ri6;
    }

    public final void run() {
        ri6 ri6 = this.f18523a;
        ri6.mo15139h();
        if (!ri6.f11205a.mo27864F().f18958d.mo27238b()) {
            long a = ri6.f11205a.mo27864F().f18960f.mo15075a();
            ri6.f11205a.mo27864F().f18960f.mo15076b(1 + a);
            ri6.f11205a.mo27891z();
            if (a >= 5) {
                ri6.f11205a.mo15136e().mo12731w().mo25379a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                ri6.f11205a.mo27864F().f18958d.mo27237a(true);
                return;
            }
            ri6.f11205a.mo27879j();
            return;
        }
        ri6.f11205a.mo15136e().mo12725q().mo25379a("Deferred Deep Link already retrieved. Not fetching again.");
    }
}
