package com.onedelhi.secure;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;

public final class dj5 implements id1 {
    /* renamed from: m */
    public static /* bridge */ /* synthetic */ x94 m13154m(BaseImplementation.ResultHolder resultHolder) {
        x94 x94 = new x94();
        x94.mo26835a().mo17573e(new re5(resultHolder));
        return x94;
    }

    /* renamed from: a */
    public final PendingResult<Status> mo14696a(GoogleApiClient googleApiClient, z62 z62) {
        return googleApiClient.execute(new ph5(this, googleApiClient, z62));
    }

    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: b */
    public final PendingResult<Status> mo14697b(GoogleApiClient googleApiClient, LocationRequest locationRequest, c72 c72, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return googleApiClient.execute(new yf5(this, googleApiClient, ListenerHolders.createListenerHolder(c72, looper, c72.class.getSimpleName()), locationRequest));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        r0 = true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0064 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    @com.onedelhi.secure.wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.location.Location mo14698c(com.google.android.gms.common.api.GoogleApiClient r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            if (r11 == 0) goto L_0x0006
            r2 = 1
            goto L_0x0007
        L_0x0006:
            r2 = 0
        L_0x0007:
            java.lang.String r3 = "GoogleApiClient parameter is required."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2, r3)
            com.google.android.gms.common.api.Api$ClientKey r2 = com.onedelhi.secure.mp5.f16268a
            com.google.android.gms.common.api.Api$Client r11 = r11.getClient(r2)
            com.onedelhi.secure.xx5 r11 = (com.onedelhi.secure.xx5) r11
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            java.util.concurrent.CountDownLatch r3 = new java.util.concurrent.CountDownLatch
            r3.<init>(r1)
            com.onedelhi.secure.x94 r4 = new com.onedelhi.secure.x94
            r4.<init>()
            r5 = 0
            com.onedelhi.secure.f12$a r6 = new com.onedelhi.secure.f12$a     // Catch:{ Exception -> 0x0078 }
            r6.<init>()     // Catch:{ Exception -> 0x0078 }
            com.onedelhi.secure.f12 r6 = r6.mo15694a()     // Catch:{ Exception -> 0x0078 }
            r11.mo27133m(r6, r4)     // Catch:{ Exception -> 0x0078 }
            com.onedelhi.secure.w94 r11 = r4.mo26835a()
            com.onedelhi.secure.cf5 r4 = new com.onedelhi.secure.cf5
            r4.<init>(r2, r3)
            r11.mo17573e(r4)
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            r6 = 30
            long r6 = r11.toNanos(r6)     // Catch:{ all -> 0x0062 }
            long r8 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0062 }
            long r8 = r8 + r6
        L_0x0049:
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ InterruptedException -> 0x0064 }
            boolean r11 = r3.await(r6, r11)     // Catch:{ InterruptedException -> 0x0064 }
            if (r0 == 0) goto L_0x0058
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0058:
            if (r11 == 0) goto L_0x0061
            java.lang.Object r11 = r2.get()
            android.location.Location r11 = (android.location.Location) r11
            return r11
        L_0x0061:
            return r5
        L_0x0062:
            r11 = move-exception
            goto L_0x006e
        L_0x0064:
            long r6 = java.lang.System.nanoTime()     // Catch:{ all -> 0x006c }
            long r6 = r8 - r6
            r0 = 1
            goto L_0x0049
        L_0x006c:
            r11 = move-exception
            r0 = 1
        L_0x006e:
            if (r0 == 0) goto L_0x0077
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0077:
            throw r11
        L_0x0078:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.dj5.mo14698c(com.google.android.gms.common.api.GoogleApiClient):android.location.Location");
    }

    /* renamed from: d */
    public final PendingResult<Status> mo14699d(GoogleApiClient googleApiClient, boolean z) {
        return googleApiClient.execute(new xh5(this, googleApiClient, z));
    }

    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: e */
    public final PendingResult<Status> mo14700e(GoogleApiClient googleApiClient, LocationRequest locationRequest, c72 c72) {
        Looper myLooper = Looper.myLooper();
        Preconditions.checkNotNull(myLooper, "invalid null looper");
        return googleApiClient.execute(new yf5(this, googleApiClient, ListenerHolders.createListenerHolder(c72, myLooper, c72.class.getSimpleName()), locationRequest));
    }

    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: f */
    public final LocationAvailability mo14701f(GoogleApiClient googleApiClient) {
        Preconditions.checkArgument(googleApiClient != null, "GoogleApiClient parameter is required.");
        try {
            return ((xx5) googleApiClient.getClient(mp5.f16268a)).mo27129i();
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public final PendingResult<Status> mo14702g(GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new nf5(this, googleApiClient));
    }

    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: h */
    public final PendingResult<Status> mo14703h(GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return googleApiClient.execute(new qg5(this, googleApiClient, pendingIntent, locationRequest));
    }

    /* renamed from: i */
    public final PendingResult<Status> mo14704i(GoogleApiClient googleApiClient, c72 c72) {
        return googleApiClient.execute(new zg5(this, googleApiClient, c72));
    }

    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: j */
    public final PendingResult<Status> mo14705j(GoogleApiClient googleApiClient, LocationRequest locationRequest, z62 z62, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return googleApiClient.execute(new hg5(this, googleApiClient, ListenerHolders.createListenerHolder(z62, looper, z62.class.getSimpleName()), locationRequest));
    }

    /* renamed from: k */
    public final PendingResult<Status> mo14706k(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return googleApiClient.execute(new hh5(this, googleApiClient, pendingIntent));
    }

    /* renamed from: l */
    public final PendingResult<Status> mo14707l(GoogleApiClient googleApiClient, Location location) {
        return googleApiClient.execute(new fi5(this, googleApiClient, location));
    }
}
