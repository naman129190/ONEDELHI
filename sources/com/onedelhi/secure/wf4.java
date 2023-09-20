package com.onedelhi.secure;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

public final /* synthetic */ class wf4 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f36978a;

    /* renamed from: a */
    public final /* synthetic */ FirebaseMessaging f36979a;

    /* renamed from: a */
    public final /* synthetic */ ji2 f36980a;

    /* renamed from: a */
    public final /* synthetic */ nh1 f36981a;

    /* renamed from: a */
    public final /* synthetic */ ScheduledExecutorService f36982a;

    public /* synthetic */ wf4(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, ji2 ji2, nh1 nh1) {
        this.f36978a = context;
        this.f36982a = scheduledExecutorService;
        this.f36979a = firebaseMessaging;
        this.f36980a = ji2;
        this.f36981a = nh1;
    }

    public final Object call() {
        return xf4.m70222k(this.f36978a, this.f36982a, this.f36979a, this.f36980a, this.f36981a);
    }
}
