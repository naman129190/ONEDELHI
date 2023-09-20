package com.onedelhi.secure;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

public final class u17 {
    @GuardedBy("MessengerIpcClient.class")
    @ts2

    /* renamed from: a */
    public static u17 f21195a;
    @GuardedBy("this")

    /* renamed from: a */
    public int f21196a = 1;

    /* renamed from: a */
    public final Context f21197a;
    @GuardedBy("this")

    /* renamed from: a */
    public es6 f21198a = new es6(this, (xp6) null);

    /* renamed from: a */
    public final ScheduledExecutorService f21199a;

    @hw4
    public u17(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f21199a = scheduledExecutorService;
        this.f21197a = context.getApplicationContext();
    }

    /* renamed from: b */
    public static synchronized u17 m29044b(Context context) {
        u17 u17;
        synchronized (u17.class) {
            if (f21195a == null) {
                v16.m29773a();
                f21195a = new u17(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
            }
            u17 = f21195a;
        }
        return u17;
    }

    /* renamed from: c */
    public final w94<Void> mo25363c(int i, Bundle bundle) {
        return mo25366g(new mv6(mo25365f(), 2, bundle));
    }

    /* renamed from: d */
    public final w94<Bundle> mo25364d(int i, Bundle bundle) {
        return mo25366g(new o07(mo25365f(), 1, bundle));
    }

    /* renamed from: f */
    public final synchronized int mo25365f() {
        int i;
        i = this.f21196a;
        this.f21196a = i + 1;
        return i;
    }

    /* renamed from: g */
    public final synchronized <T> w94<T> mo25366g(ex6<T> ex6) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(ex6);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f21198a.mo15575g(ex6)) {
            es6 es6 = new es6(this, (xp6) null);
            this.f21198a = es6;
            es6.mo15575g(ex6);
        }
        return ex6.f11760a.mo26835a();
    }
}
