package com.onedelhi.secure;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class j36 {

    /* renamed from: a */
    public static volatile j36 f13996a;

    /* renamed from: a */
    public int f13997a;

    /* renamed from: a */
    public final Clock f13998a;

    /* renamed from: a */
    public final C1767b9 f13999a;

    /* renamed from: a */
    public volatile dt5 f14000a;

    /* renamed from: a */
    public final String f14001a;
    @mj1("listenerList")

    /* renamed from: a */
    public final List f14002a;

    /* renamed from: a */
    public final ExecutorService f14003a;

    /* renamed from: a */
    public boolean f14004a;

    /* renamed from: b */
    public final String f14005b;

    public j36(Context context, String str, String str2, String str3, Bundle bundle) {
        this.f14001a = (str == null || !mo18133w(str2, str3)) ? "FA" : str;
        this.f13998a = DefaultClock.getInstance();
        br5.m12053a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ez5(this));
        boolean z = true;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f14003a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f13999a = new C1767b9(this);
        this.f14002a = new ArrayList();
        try {
            if (dj6.m13169c(context, h51.f29460i, e96.m13645a(context)) != null && !mo18129s()) {
                this.f14005b = null;
                this.f14004a = true;
                Log.w(this.f14001a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (!mo18133w(str2, str3)) {
            this.f14005b = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 != null ? false : z)) {
                    Log.w(this.f14001a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f14001a, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            }
        } else {
            this.f14005b = str2;
        }
        mo18132v(new jw5(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f14001a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new g36(this));
        }
    }

    /* renamed from: D */
    public static j36 m18100D(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (f13996a == null) {
            synchronized (j36.class) {
                if (f13996a == null) {
                    f13996a = new j36(context, str, str2, str3, bundle);
                }
            }
        }
        return f13996a;
    }

    /* renamed from: A */
    public final C1767b9 mo18096A() {
        return this.f13999a;
    }

    /* renamed from: C */
    public final dt5 mo18097C(Context context, boolean z) {
        try {
            return ys5.asInterface(DynamiteModule.m8891e(context, DynamiteModule.f7392d, ModuleDescriptor.MODULE_ID).mo10408d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.C1414a e) {
            mo18130t(e, true, false);
            return null;
        }
    }

    @ly4
    /* renamed from: E */
    public final Long mo18098E() {
        lr5 lr5 = new lr5();
        mo18132v(new qz5(this, lr5));
        return lr5.mo19766l8(120000);
    }

    /* renamed from: F */
    public final Object mo18099F(int i) {
        lr5 lr5 = new lr5();
        mo18132v(new uz5(this, lr5, i));
        return lr5.m20915n8(lr5.mo19765k8(rf4.f19824c), Object.class);
    }

    /* renamed from: H */
    public final String mo18100H() {
        return this.f14005b;
    }

    @ly4
    /* renamed from: I */
    public final String mo18101I() {
        lr5 lr5 = new lr5();
        mo18132v(new mz5(this, lr5));
        return lr5.mo19767m8(120000);
    }

    /* renamed from: J */
    public final String mo18102J() {
        lr5 lr5 = new lr5();
        mo18132v(new cy5(this, lr5));
        return lr5.mo19767m8(50);
    }

    /* renamed from: K */
    public final String mo18103K() {
        lr5 lr5 = new lr5();
        mo18132v(new oy5(this, lr5));
        return lr5.mo19767m8(500);
    }

    /* renamed from: L */
    public final String mo18104L() {
        lr5 lr5 = new lr5();
        mo18132v(new ky5(this, lr5));
        return lr5.mo19767m8(500);
    }

    /* renamed from: M */
    public final String mo18105M() {
        lr5 lr5 = new lr5();
        mo18132v(new yx5(this, lr5));
        return lr5.mo19767m8(500);
    }

    /* renamed from: N */
    public final List mo18106N(String str, String str2) {
        lr5 lr5 = new lr5();
        mo18132v(new dv5(this, str, str2, lr5));
        List list = (List) lr5.m20915n8(lr5.mo19765k8(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: O */
    public final Map mo18107O(String str, String str2, boolean z) {
        lr5 lr5 = new lr5();
        mo18132v(new sy5(this, str, str2, z, lr5));
        Bundle k8 = lr5.mo19765k8(5000);
        if (k8 == null || k8.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(k8.size());
        for (String str3 : k8.keySet()) {
            Object obj = k8.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: S */
    public final void mo18108S(String str) {
        mo18132v(new nw5(this, str));
    }

    /* renamed from: T */
    public final void mo18109T(String str, String str2, Bundle bundle) {
        mo18132v(new zu5(this, str, str2, bundle));
    }

    /* renamed from: U */
    public final void mo18110U(String str) {
        mo18132v(new rw5(this, str));
    }

    /* renamed from: V */
    public final void mo18111V(@mr2 String str, Bundle bundle) {
        mo18131u((String) null, str, bundle, false, true, (Long) null);
    }

    /* renamed from: W */
    public final void mo18112W(String str, String str2, Bundle bundle) {
        mo18131u(str, str2, bundle, true, true, (Long) null);
    }

    /* renamed from: a */
    public final void mo18113a(String str, String str2, Bundle bundle, long j) {
        mo18131u(str, str2, bundle, true, false, Long.valueOf(j));
    }

    /* renamed from: b */
    public final void mo18114b(int i, String str, Object obj, Object obj2, Object obj3) {
        mo18132v(new wy5(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r4.f14000a == null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.f14000a.registerOnMeasurementEventListener(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        android.util.Log.w(r4.f14001a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        mo18132v(new com.onedelhi.secure.k06(r4, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18115c(com.onedelhi.secure.xe6 r5) {
        /*
            r4 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            java.util.List r0 = r4.f14002a
            monitor-enter(r0)
            r1 = 0
        L_0x0007:
            java.util.List r2 = r4.f14002a     // Catch:{ all -> 0x0055 }
            int r2 = r2.size()     // Catch:{ all -> 0x0055 }
            if (r1 >= r2) goto L_0x002b
            java.util.List r2 = r4.f14002a     // Catch:{ all -> 0x0055 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0055 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x0055 }
            java.lang.Object r2 = r2.first     // Catch:{ all -> 0x0055 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x0028
            java.lang.String r5 = r4.f14001a     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = "OnEventListener already registered."
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x0055 }
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return
        L_0x0028:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x002b:
            com.onedelhi.secure.i16 r1 = new com.onedelhi.secure.i16     // Catch:{ all -> 0x0055 }
            r1.<init>(r5)     // Catch:{ all -> 0x0055 }
            java.util.List r2 = r4.f14002a     // Catch:{ all -> 0x0055 }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x0055 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0055 }
            r2.add(r3)     // Catch:{ all -> 0x0055 }
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            com.onedelhi.secure.dt5 r5 = r4.f14000a
            if (r5 == 0) goto L_0x004c
            com.onedelhi.secure.dt5 r5 = r4.f14000a     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0045 }
            r5.registerOnMeasurementEventListener(r1)     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0045 }
            return
        L_0x0045:
            java.lang.String r5 = r4.f14001a
            java.lang.String r0 = "Failed to register event listener on calling thread. Trying again on the dynamite thread."
            android.util.Log.w(r5, r0)
        L_0x004c:
            com.onedelhi.secure.k06 r5 = new com.onedelhi.secure.k06
            r5.<init>(r4, r1)
            r4.mo18132v(r5)
            return
        L_0x0055:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.j36.mo18115c(com.onedelhi.secure.xe6):void");
    }

    /* renamed from: d */
    public final void mo18116d() {
        mo18132v(new bw5(this));
    }

    /* renamed from: e */
    public final void mo18117e(Bundle bundle) {
        mo18132v(new vu5(this, bundle));
    }

    /* renamed from: f */
    public final void mo18118f(Bundle bundle) {
        mo18132v(new tv5(this, bundle));
    }

    /* renamed from: g */
    public final void mo18119g(Bundle bundle) {
        mo18132v(new xv5(this, bundle));
    }

    /* renamed from: h */
    public final void mo18120h(Activity activity, String str, String str2) {
        mo18132v(new lv5(this, activity, str, str2));
    }

    /* renamed from: i */
    public final void mo18121i(boolean z) {
        mo18132v(new yz5(this, z));
    }

    /* renamed from: j */
    public final void mo18122j(Bundle bundle) {
        mo18132v(new c06(this, bundle));
    }

    /* renamed from: k */
    public final void mo18123k(ue6 ue6) {
        e16 e16 = new e16(ue6);
        if (this.f14000a != null) {
            try {
                this.f14000a.setEventInterceptor(e16);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w(this.f14001a, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        mo18132v(new g06(this, e16));
    }

    /* renamed from: l */
    public final void mo18124l(Boolean bool) {
        mo18132v(new pv5(this, bool));
    }

    /* renamed from: m */
    public final void mo18125m(long j) {
        mo18132v(new fw5(this, j));
    }

    /* renamed from: n */
    public final void mo18126n(String str) {
        mo18132v(new hv5(this, str));
    }

    /* renamed from: o */
    public final void mo18127o(String str, String str2, Object obj, boolean z) {
        mo18132v(new w06(this, str, str2, obj, z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r3.f14000a == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.f14000a.unregisterOnMeasurementEventListener(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        android.util.Log.w(r3.f14001a, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        mo18132v(new com.onedelhi.secure.o06(r3, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        return;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18128p(com.onedelhi.secure.xe6 r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.util.List r0 = r3.f14002a
            monitor-enter(r0)
            r1 = 0
        L_0x0007:
            java.util.List r2 = r3.f14002a     // Catch:{ all -> 0x005b }
            int r2 = r2.size()     // Catch:{ all -> 0x005b }
            if (r1 >= r2) goto L_0x002b
            java.util.List r2 = r3.f14002a     // Catch:{ all -> 0x005b }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x005b }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x005b }
            java.lang.Object r2 = r2.first     // Catch:{ all -> 0x005b }
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x005b }
            if (r2 == 0) goto L_0x0028
            java.util.List r4 = r3.f14002a     // Catch:{ all -> 0x005b }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x005b }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x005b }
            goto L_0x002c
        L_0x0028:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x002b:
            r4 = 0
        L_0x002c:
            if (r4 != 0) goto L_0x0037
            java.lang.String r4 = r3.f14001a     // Catch:{ all -> 0x005b }
            java.lang.String r1 = "OnEventListener had not been registered."
            android.util.Log.w(r4, r1)     // Catch:{ all -> 0x005b }
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x0037:
            java.util.List r1 = r3.f14002a     // Catch:{ all -> 0x005b }
            r1.remove(r4)     // Catch:{ all -> 0x005b }
            java.lang.Object r4 = r4.second     // Catch:{ all -> 0x005b }
            com.onedelhi.secure.i16 r4 = (com.onedelhi.secure.i16) r4     // Catch:{ all -> 0x005b }
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            com.onedelhi.secure.dt5 r0 = r3.f14000a
            if (r0 == 0) goto L_0x0052
            com.onedelhi.secure.dt5 r0 = r3.f14000a     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x004b }
            r0.unregisterOnMeasurementEventListener(r4)     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x004b }
            return
        L_0x004b:
            java.lang.String r0 = r3.f14001a
            java.lang.String r1 = "Failed to unregister event listener on calling thread. Trying again on the dynamite thread."
            android.util.Log.w(r0, r1)
        L_0x0052:
            com.onedelhi.secure.o06 r0 = new com.onedelhi.secure.o06
            r0.<init>(r3, r4)
            r3.mo18132v(r0)
            return
        L_0x005b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.j36.mo18128p(com.onedelhi.secure.xe6):void");
    }

    /* renamed from: s */
    public final boolean mo18129s() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, j36.class.getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: t */
    public final void mo18130t(Exception exc, boolean z, boolean z2) {
        this.f14004a |= z;
        if (z) {
            Log.w(this.f14001a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            mo18114b(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.f14001a, "Error with data collection. Data lost.", exc);
    }

    /* renamed from: u */
    public final void mo18131u(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        mo18132v(new s06(this, l, str, str2, bundle, z, z2));
    }

    /* renamed from: v */
    public final void mo18132v(a16 a16) {
        this.f14003a.execute(a16);
    }

    /* renamed from: w */
    public final boolean mo18133w(String str, String str2) {
        return (str2 == null || str == null || mo18129s()) ? false : true;
    }

    /* renamed from: x */
    public final int mo18134x(String str) {
        lr5 lr5 = new lr5();
        mo18132v(new iz5(this, str, lr5));
        Integer num = (Integer) lr5.m20915n8(lr5.mo19765k8(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* renamed from: y */
    public final long mo18135y() {
        lr5 lr5 = new lr5();
        mo18132v(new gy5(this, lr5));
        Long l8 = lr5.mo19766l8(500);
        if (l8 != null) {
            return l8.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f13998a.currentTimeMillis()).nextLong();
        int i = this.f13997a + 1;
        this.f13997a = i;
        return nextLong + ((long) i);
    }

    /* renamed from: z */
    public final Bundle mo18136z(Bundle bundle, boolean z) {
        lr5 lr5 = new lr5();
        mo18132v(new az5(this, bundle, lr5));
        if (z) {
            return lr5.mo19765k8(5000);
        }
        return null;
    }
}
