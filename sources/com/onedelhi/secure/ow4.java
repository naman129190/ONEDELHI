package com.onedelhi.secure;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;

@ShowFirstParty
@KeepForSdk
@ThreadSafe
public class ow4 {

    /* renamed from: a */
    public static volatile kx5 f18144a = new pl5();

    /* renamed from: b */
    public static final long f18145b = TimeUnit.DAYS.toMillis(366);

    /* renamed from: b */
    public static final Object f18146b = new Object();

    /* renamed from: b */
    public static volatile ScheduledExecutorService f18147b = null;
    @mj1("acquireReleaseLock")

    /* renamed from: a */
    public int f18148a = 0;
    @mj1("acquireReleaseLock")

    /* renamed from: a */
    public long f18149a;

    /* renamed from: a */
    public final Context f18150a;
    @mj1("acquireReleaseLock")

    /* renamed from: a */
    public final PowerManager.WakeLock f18151a;

    /* renamed from: a */
    public WorkSource f18152a;

    /* renamed from: a */
    public Clock f18153a = DefaultClock.getInstance();
    @mj1("acquireReleaseLock")

    /* renamed from: a */
    public il5 f18154a;

    /* renamed from: a */
    public final Object f18155a = new Object();

    /* renamed from: a */
    public final String f18156a;
    @mj1("acquireReleaseLock")

    /* renamed from: a */
    public final Map<String, fs5> f18157a = new HashMap();
    @mj1("acquireReleaseLock")

    /* renamed from: a */
    public final Set<i26> f18158a = new HashSet();
    @mj1("acquireReleaseLock")

    /* renamed from: a */
    public Future<?> f18159a;

    /* renamed from: a */
    public final ScheduledExecutorService f18160a;

    /* renamed from: a */
    public AtomicInteger f18161a = new AtomicInteger(0);
    @mj1("acquireReleaseLock")

    /* renamed from: a */
    public boolean f18162a = true;
    @mj1("acquireReleaseLock")

    /* renamed from: b */
    public int f18163b;

    /* renamed from: b */
    public final String f18164b;

    @KeepForSdk
    public ow4(@mr2 Context context, int i, @mr2 String str) {
        String packageName = context.getPackageName();
        Preconditions.checkNotNull(context, "WakeLock: context must not be null");
        Preconditions.checkNotEmpty(str, "WakeLock: wakeLockName must not be empty");
        this.f18150a = context.getApplicationContext();
        this.f18164b = str;
        this.f18154a = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            this.f18156a = valueOf.length() != 0 ? "*gcore*:".concat(valueOf) : new String("*gcore*:");
        } else {
            this.f18156a = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i, str);
            this.f18151a = newWakeLock;
            if (WorkSourceUtil.hasWorkSourcePermission(context)) {
                WorkSource fromPackage = WorkSourceUtil.fromPackage(context, Strings.isEmptyOrWhitespace(packageName) ? context.getPackageName() : packageName);
                this.f18152a = fromPackage;
                if (fromPackage != null) {
                    m24142i(newWakeLock, fromPackage);
                }
            }
            ScheduledExecutorService scheduledExecutorService = f18147b;
            if (scheduledExecutorService == null) {
                synchronized (f18146b) {
                    scheduledExecutorService = f18147b;
                    if (scheduledExecutorService == null) {
                        td6.m28363a();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f18147b = scheduledExecutorService;
                    }
                }
            }
            this.f18160a = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("expected a non-null reference", 0, 29);
        throw new kh6(sb.toString());
    }

    /* renamed from: e */
    public static /* synthetic */ void m24141e(@mr2 ow4 ow4) {
        synchronized (ow4.f18155a) {
            if (ow4.mo22117b()) {
                Log.e("WakeLock", String.valueOf(ow4.f18156a).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                ow4.mo22121g();
                if (ow4.mo22117b()) {
                    ow4.f18148a = 1;
                    ow4.mo22122h(0);
                }
            }
        }
    }

    /* renamed from: i */
    public static void m24142i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo22116a(long j) {
        this.f18161a.incrementAndGet();
        long j2 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f18145b), 1);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.f18155a) {
            if (!mo22117b()) {
                this.f18154a = il5.m17684a(false, (xr5) null);
                this.f18151a.acquire();
                this.f18153a.elapsedRealtime();
            }
            this.f18148a++;
            this.f18163b++;
            mo22120f((String) null);
            fs5 fs5 = this.f18157a.get((Object) null);
            if (fs5 == null) {
                fs5 = new fs5((pl5) null);
                this.f18157a.put((Object) null, fs5);
            }
            fs5.f12313a++;
            long elapsedRealtime = this.f18153a.elapsedRealtime();
            if (Long.MAX_VALUE - elapsedRealtime > max) {
                j2 = elapsedRealtime + max;
            }
            if (j2 > this.f18149a) {
                this.f18149a = j2;
                Future<?> future = this.f18159a;
                if (future != null) {
                    future.cancel(false);
                }
                this.f18159a = this.f18160a.schedule(new na5(this), max, TimeUnit.MILLISECONDS);
            }
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public boolean mo22117b() {
        boolean z;
        synchronized (this.f18155a) {
            z = this.f18148a > 0;
        }
        return z;
    }

    @KeepForSdk
    /* renamed from: c */
    public void mo22118c() {
        if (this.f18161a.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f18156a).concat(" release without a matched acquire!"));
        }
        synchronized (this.f18155a) {
            mo22120f((String) null);
            if (this.f18157a.containsKey((Object) null)) {
                fs5 fs5 = this.f18157a.get((Object) null);
                if (fs5 != null) {
                    int i = fs5.f12313a - 1;
                    fs5.f12313a = i;
                    if (i == 0) {
                        this.f18157a.remove((Object) null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f18156a).concat(" counter does not exist"));
            }
            mo22122h(0);
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public void mo22119d(boolean z) {
        synchronized (this.f18155a) {
            this.f18162a = z;
        }
    }

    @mj1("acquireReleaseLock")
    /* renamed from: f */
    public final String mo22120f(String str) {
        if (this.f18162a) {
            TextUtils.isEmpty((CharSequence) null);
        }
        return null;
    }

    @mj1("acquireReleaseLock")
    /* renamed from: g */
    public final void mo22121g() {
        if (!this.f18158a.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f18158a);
            this.f18158a.clear();
            if (arrayList.size() > 0) {
                i26 i26 = (i26) arrayList.get(0);
                throw null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        if (r5.f18154a != null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        r5.f18154a = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0084, code lost:
        if (r5.f18154a != null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a1, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22122h(int r6) {
        /*
            r5 = this;
            java.lang.Object r6 = r5.f18155a
            monitor-enter(r6)
            boolean r0 = r5.mo22117b()     // Catch:{ all -> 0x00a2 }
            if (r0 != 0) goto L_0x000b
            monitor-exit(r6)     // Catch:{ all -> 0x00a2 }
            return
        L_0x000b:
            boolean r0 = r5.f18162a     // Catch:{ all -> 0x00a2 }
            r1 = 0
            if (r0 == 0) goto L_0x001b
            int r0 = r5.f18148a     // Catch:{ all -> 0x00a2 }
            int r0 = r0 + -1
            r5.f18148a = r0     // Catch:{ all -> 0x00a2 }
            if (r0 > 0) goto L_0x0019
            goto L_0x001d
        L_0x0019:
            monitor-exit(r6)     // Catch:{ all -> 0x00a2 }
            return
        L_0x001b:
            r5.f18148a = r1     // Catch:{ all -> 0x00a2 }
        L_0x001d:
            r5.mo22121g()     // Catch:{ all -> 0x00a2 }
            java.util.Map<java.lang.String, com.onedelhi.secure.fs5> r0 = r5.f18157a     // Catch:{ all -> 0x00a2 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x00a2 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00a2 }
        L_0x002a:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x00a2 }
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x00a2 }
            com.onedelhi.secure.fs5 r2 = (com.onedelhi.secure.fs5) r2     // Catch:{ all -> 0x00a2 }
            r2.f12313a = r1     // Catch:{ all -> 0x00a2 }
            goto L_0x002a
        L_0x0039:
            java.util.Map<java.lang.String, com.onedelhi.secure.fs5> r0 = r5.f18157a     // Catch:{ all -> 0x00a2 }
            r0.clear()     // Catch:{ all -> 0x00a2 }
            java.util.concurrent.Future<?> r0 = r5.f18159a     // Catch:{ all -> 0x00a2 }
            r2 = 0
            if (r0 == 0) goto L_0x004c
            r0.cancel(r1)     // Catch:{ all -> 0x00a2 }
            r5.f18159a = r2     // Catch:{ all -> 0x00a2 }
            r3 = 0
            r5.f18149a = r3     // Catch:{ all -> 0x00a2 }
        L_0x004c:
            r5.f18163b = r1     // Catch:{ all -> 0x00a2 }
            android.os.PowerManager$WakeLock r0 = r5.f18151a     // Catch:{ all -> 0x00a2 }
            boolean r0 = r0.isHeld()     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x008f
            android.os.PowerManager$WakeLock r0 = r5.f18151a     // Catch:{ RuntimeException -> 0x0064 }
            r0.release()     // Catch:{ RuntimeException -> 0x0064 }
            com.onedelhi.secure.il5 r0 = r5.f18154a     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x00a0
        L_0x005f:
            r5.f18154a = r2     // Catch:{ all -> 0x00a2 }
            goto L_0x00a0
        L_0x0062:
            r0 = move-exception
            goto L_0x0088
        L_0x0064:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()     // Catch:{ all -> 0x0062 }
            java.lang.Class<java.lang.RuntimeException> r3 = java.lang.RuntimeException.class
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0087
            java.lang.String r1 = "WakeLock"
            java.lang.String r3 = r5.f18156a     // Catch:{ all -> 0x0062 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0062 }
            java.lang.String r4 = " failed to release!"
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x0062 }
            android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x0062 }
            com.onedelhi.secure.il5 r0 = r5.f18154a     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x00a0
            goto L_0x005f
        L_0x0087:
            throw r0     // Catch:{ all -> 0x0062 }
        L_0x0088:
            com.onedelhi.secure.il5 r1 = r5.f18154a     // Catch:{ all -> 0x00a2 }
            if (r1 == 0) goto L_0x008e
            r5.f18154a = r2     // Catch:{ all -> 0x00a2 }
        L_0x008e:
            throw r0     // Catch:{ all -> 0x00a2 }
        L_0x008f:
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r5.f18156a     // Catch:{ all -> 0x00a2 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00a2 }
            java.lang.String r2 = " should be held!"
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x00a2 }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x00a2 }
        L_0x00a0:
            monitor-exit(r6)     // Catch:{ all -> 0x00a2 }
            return
        L_0x00a2:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00a2 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ow4.mo22122h(int):void");
    }
}
