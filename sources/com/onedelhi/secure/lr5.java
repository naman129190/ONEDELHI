package com.onedelhi.secure;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

public final class lr5 extends lt5 {

    /* renamed from: a */
    public final AtomicReference f15537a = new AtomicReference();

    /* renamed from: a */
    public boolean f15538a;

    /* renamed from: n8 */
    public static final Object m20915n8(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", new Object[]{cls.getCanonicalName(), obj.getClass().getCanonicalName()}), e);
            throw e;
        }
    }

    /* renamed from: W6 */
    public final void mo17408W6(Bundle bundle) {
        synchronized (this.f15537a) {
            try {
                this.f15537a.set(bundle);
                this.f15538a = true;
                this.f15537a.notify();
            } catch (Throwable th) {
                this.f15537a.notify();
                throw th;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
    /* renamed from: k8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo19765k8(long r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.f15537a
            monitor-enter(r0)
            boolean r1 = r2.f15538a     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0010
            java.util.concurrent.atomic.AtomicReference r1 = r2.f15537a     // Catch:{ InterruptedException -> 0x000d }
            r1.wait(r3)     // Catch:{ InterruptedException -> 0x000d }
            goto L_0x0010
        L_0x000d:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            r3 = 0
            return r3
        L_0x0010:
            java.util.concurrent.atomic.AtomicReference r3 = r2.f15537a     // Catch:{ all -> 0x001a }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x001a }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x001a }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r3
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.lr5.mo19765k8(long):android.os.Bundle");
    }

    /* renamed from: l8 */
    public final Long mo19766l8(long j) {
        return (Long) m20915n8(mo19765k8(j), Long.class);
    }

    /* renamed from: m8 */
    public final String mo19767m8(long j) {
        return (String) m20915n8(mo19765k8(j), String.class);
    }
}
