package com.onedelhi.secure;

import android.content.Context;
import com.google.firebase.perf.session.SessionManager;

public final /* synthetic */ class vu3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f36707a;

    /* renamed from: a */
    public final /* synthetic */ SessionManager f36708a;

    /* renamed from: a */
    public final /* synthetic */ g13 f36709a;

    public /* synthetic */ vu3(SessionManager sessionManager, Context context, g13 g13) {
        this.f36708a = sessionManager;
        this.f36707a = context;
        this.f36709a = g13;
    }

    public final void run() {
        this.f36708a.lambda$setApplicationContext$0(this.f36707a, this.f36709a);
    }
}
