package com.onedelhi.secure;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

public final class es6 implements ServiceConnection {

    /* renamed from: a */
    public final Messenger f11696a = new Messenger(new p66(Looper.getMainLooper(), new j66(this)));
    @GuardedBy("this")

    /* renamed from: a */
    public final SparseArray<ex6<?>> f11697a = new SparseArray<>();

    /* renamed from: a */
    public final /* synthetic */ u17 f11698a;

    /* renamed from: a */
    public vt6 f11699a;
    @GuardedBy("this")

    /* renamed from: a */
    public final Queue<ex6<?>> f11700a = new ArrayDeque();
    @GuardedBy("this")

    /* renamed from: n */
    public int f11701n = 0;

    public /* synthetic */ es6(u17 u17, xp6 xp6) {
        this.f11698a = u17;
    }

    /* renamed from: a */
    public final synchronized void mo15569a(int i, @ts2 String str) {
        mo15570b(i, str, (Throwable) null);
    }

    /* renamed from: b */
    public final synchronized void mo15570b(int i, @ts2 String str, @ts2 Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i2 = this.f11701n;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f11701n = 4;
            ConnectionTracker.getInstance().unbindService(this.f11698a.f21197a, this);
            wy6 wy6 = new wy6(i, str, th);
            for (ex6 c : this.f11700a) {
                c.mo15652c(wy6);
            }
            this.f11700a.clear();
            for (int i3 = 0; i3 < this.f11697a.size(); i3++) {
                this.f11697a.valueAt(i3).mo15652c(wy6);
            }
            this.f11697a.clear();
        } else if (i2 == 3) {
            this.f11701n = 4;
        }
    }

    /* renamed from: c */
    public final void mo15571c() {
        this.f11698a.f21199a.execute(new be6(this));
    }

    /* renamed from: d */
    public final synchronized void mo15572d() {
        if (this.f11701n == 1) {
            mo15569a(1, "Timed out while binding");
        }
    }

    /* renamed from: e */
    public final synchronized void mo15573e(int i) {
        ex6 ex6 = this.f11697a.get(i);
        if (ex6 != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.f11697a.remove(i);
            ex6.mo15652c(new wy6(3, "Timed out waiting for response", (Throwable) null));
            mo15574f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo15574f() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f11701n     // Catch:{ all -> 0x0039 }
            r1 = 2
            if (r0 != r1) goto L_0x0037
            java.util.Queue<com.onedelhi.secure.ex6<?>> r0 = r2.f11700a     // Catch:{ all -> 0x0039 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0037
            android.util.SparseArray<com.onedelhi.secure.ex6<?>> r0 = r2.f11697a     // Catch:{ all -> 0x0039 }
            int r0 = r0.size()     // Catch:{ all -> 0x0039 }
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "MessengerIpcClient"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = "MessengerIpcClient"
            java.lang.String r1 = "Finished handling requests, unbinding"
            android.util.Log.v(r0, r1)     // Catch:{ all -> 0x0039 }
        L_0x0025:
            r0 = 3
            r2.f11701n = r0     // Catch:{ all -> 0x0039 }
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch:{ all -> 0x0039 }
            com.onedelhi.secure.u17 r1 = r2.f11698a     // Catch:{ all -> 0x0039 }
            android.content.Context r1 = r1.f21197a     // Catch:{ all -> 0x0039 }
            r0.unbindService(r1, r2)     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return
        L_0x0037:
            monitor-exit(r2)
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.es6.mo15574f():void");
    }

    /* renamed from: g */
    public final synchronized boolean mo15575g(ex6<?> ex6) {
        int i = this.f11701n;
        if (i == 0) {
            this.f11700a.add(ex6);
            Preconditions.checkState(this.f11701n == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f11701n = 1;
            Intent intent = new Intent(ji2.f30831f);
            intent.setPackage("com.google.android.gms");
            try {
                if (!ConnectionTracker.getInstance().bindService(this.f11698a.f21197a, intent, this, 1)) {
                    mo15569a(0, "Unable to bind to service");
                } else {
                    this.f11698a.f21199a.schedule(new sh6(this), 30, TimeUnit.SECONDS);
                }
            } catch (SecurityException e) {
                mo15570b(0, "Unable to bind to service", e);
            }
        } else if (i == 1) {
            this.f11700a.add(ex6);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.f11700a.add(ex6);
            mo15571c();
            return true;
        }
        return true;
    }

    @bc2
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f11698a.f21199a.execute(new lk6(this, iBinder));
    }

    @bc2
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f11698a.f21199a.execute(new ha6(this));
    }
}
