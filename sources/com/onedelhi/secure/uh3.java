package com.onedelhi.secure;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.remoteconfig.internal.C4370c;
import com.google.firebase.remoteconfig.internal.C4374d;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

@KeepForSdk
public class uh3 {

    /* renamed from: a */
    public static final long f36115a = 60;

    /* renamed from: a */
    public static final Clock f36116a = DefaultClock.getInstance();

    /* renamed from: a */
    public static final Random f36117a = new Random();

    /* renamed from: b */
    public static final String f36118b = "activate";

    /* renamed from: c */
    public static final String f36119c = "fetch";

    /* renamed from: c */
    public static final Map<String, n61> f36120c = new HashMap();

    /* renamed from: d */
    public static final String f36121d = "defaults";

    /* renamed from: e */
    public static final String f36122e = "frc";

    /* renamed from: f */
    public static final String f36123f = "settings";
    @hw4

    /* renamed from: g */
    public static final String f36124g = "firebase";

    /* renamed from: a */
    public final Context f36125a;
    @ts2

    /* renamed from: a */
    public final b73<C4623b5> f36126a;

    /* renamed from: a */
    public final o41 f36127a;

    /* renamed from: a */
    public final s31 f36128a;

    /* renamed from: a */
    public final w31 f36129a;

    /* renamed from: a */
    public final String f36130a;
    @mj1("this")

    /* renamed from: a */
    public final Map<String, n61> f36131a;

    /* renamed from: a */
    public final ScheduledExecutorService f36132a;
    @mj1("this")

    /* renamed from: b */
    public Map<String, String> f36133b;

    /* renamed from: com.onedelhi.secure.uh3$a */
    public static class C6967a implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a */
        public static final AtomicReference<C6967a> f36134a = new AtomicReference<>();

        /* renamed from: b */
        public static void m67046b(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<C6967a> atomicReference = f36134a;
            if (atomicReference.get() == null) {
                C6967a aVar = new C6967a();
                if (atomicReference.compareAndSet((Object) null, aVar)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(aVar);
                }
            }
        }

        public void onBackgroundStateChanged(boolean z) {
            uh3.m67035p(z);
        }
    }

    public uh3(Context context, @C4895cn ScheduledExecutorService scheduledExecutorService, w31 w31, o41 o41, s31 s31, b73<C4623b5> b73) {
        this(context, scheduledExecutorService, w31, o41, s31, b73, true);
    }

    @hw4
    public uh3(Context context, ScheduledExecutorService scheduledExecutorService, w31 w31, o41 o41, s31 s31, b73<C4623b5> b73, boolean z) {
        this.f36131a = new HashMap();
        this.f36133b = new HashMap();
        this.f36125a = context;
        this.f36132a = scheduledExecutorService;
        this.f36129a = w31;
        this.f36127a = o41;
        this.f36128a = s31;
        this.f36126a = b73;
        this.f36130a = w31.mo46529s().mo37192j();
        C6967a.m67046b(context);
        if (z) {
            ha4.m16569d(scheduledExecutorService, new th3(this));
        }
    }

    @hw4
    /* renamed from: j */
    public static C4374d m67030j(Context context, String str, String str2) {
        return new C4374d(context.getSharedPreferences(String.format("%s_%s_%s_%s", new Object[]{"frc", str, str2, f36123f}), 0));
    }

    @ts2
    /* renamed from: k */
    public static t13 m67031k(w31 w31, String str, b73<C4623b5> b73) {
        if (!m67033n(w31) || !str.equals(f36124g)) {
            return null;
        }
        return new t13(b73);
    }

    /* renamed from: m */
    public static boolean m67032m(w31 w31, String str) {
        return str.equals(f36124g) && m67033n(w31);
    }

    /* renamed from: n */
    public static boolean m67033n(w31 w31) {
        return w31.mo46528r().equals(w31.f36872c);
    }

    /* renamed from: o */
    public static /* synthetic */ C4623b5 m67034o() {
        return null;
    }

    /* renamed from: p */
    public static synchronized void m67035p(boolean z) {
        synchronized (uh3.class) {
            for (n61 L : f36120c.values()) {
                L.mo40965L(z);
            }
        }
    }

    @hw4
    /* renamed from: c */
    public synchronized n61 mo45598c(w31 w31, String str, o41 o41, s31 s31, Executor executor, u40 u40, u40 u402, u40 u403, C4370c cVar, e50 e50, C4374d dVar) {
        n61 n61;
        String str2 = str;
        synchronized (this) {
            if (!this.f36131a.containsKey(str2)) {
                Context context = this.f36125a;
                s31 s312 = m67032m(w31, str) ? s31 : null;
                n61 n612 = r10;
                n61 n613 = new n61(context, w31, o41, s312, executor, u40, u402, u403, cVar, e50, dVar, mo45605l(w31, o41, cVar, u402, this.f36125a, str, dVar));
                n612.mo40969P();
                this.f36131a.put(str2, n612);
                f36120c.put(str2, n612);
            }
            n61 = this.f36131a.get(str2);
        }
        return n61;
    }

    @hw4
    @KeepForSdk
    /* renamed from: d */
    public synchronized n61 mo45599d(String str) {
        u40 e;
        u40 e2;
        u40 e3;
        C4374d j;
        e50 i;
        e = mo45600e(str, f36119c);
        e2 = mo45600e(str, f36118b);
        e3 = mo45600e(str, f36121d);
        j = m67030j(this.f36125a, this.f36130a, str);
        i = mo45604i(e2, e3);
        t13 k = m67031k(this.f36129a, str, this.f36126a);
        if (k != null) {
            i.mo34844b(new rh3(k));
        }
        return mo45598c(this.f36129a, str, this.f36127a, this.f36128a, this.f36132a, e, e2, e3, mo45602g(str, e, j), i, j);
    }

    /* renamed from: e */
    public final u40 mo45600e(String str, String str2) {
        return u40.m66454j(this.f36132a, h50.m50227d(this.f36125a, String.format("%s_%s_%s_%s.json", new Object[]{"frc", this.f36130a, str, str2})));
    }

    /* renamed from: f */
    public n61 mo45601f() {
        return mo45599d(f36124g);
    }

    @hw4
    /* renamed from: g */
    public synchronized C4370c mo45602g(String str, u40 u40, C4374d dVar) {
        return new C4370c(this.f36127a, m67033n(this.f36129a) ? this.f36126a : sh3.f35080a, this.f36132a, f36116a, f36117a, u40, mo45603h(this.f36129a.mo46529s().mo37191i(), str, dVar), dVar, this.f36133b);
    }

    @hw4
    /* renamed from: h */
    public ConfigFetchHttpClient mo45603h(String str, String str2, C4374d dVar) {
        return new ConfigFetchHttpClient(this.f36125a, this.f36129a.mo46529s().mo37192j(), str, str2, dVar.mo30067c(), dVar.mo30067c());
    }

    /* renamed from: i */
    public final e50 mo45604i(u40 u40, u40 u402) {
        return new e50(this.f36132a, u40, u402);
    }

    /* renamed from: l */
    public synchronized f50 mo45605l(w31 w31, o41 o41, C4370c cVar, u40 u40, Context context, String str, C4374d dVar) {
        f50 f50;
        synchronized (this) {
            f50 = new f50(w31, o41, cVar, u40, context, str, dVar, this.f36132a);
        }
        return f50;
    }

    @hw4
    /* renamed from: q */
    public synchronized void mo45606q(Map<String, String> map) {
        this.f36133b = map;
    }
}
