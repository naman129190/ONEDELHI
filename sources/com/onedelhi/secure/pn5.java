package com.onedelhi.secure;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;

public final /* synthetic */ class pn5 implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ PendingIntent f18619a;

    public /* synthetic */ pn5(PendingIntent pendingIntent) {
        this.f18619a = pendingIntent;
    }

    public final void accept(Object obj, Object obj2) {
        Api api = mp5.f16269a;
        ((xx5) obj).mo27127g(this.f18619a, (x94) obj2, (Object) null);
    }
}
