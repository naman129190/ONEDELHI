package com.onedelhi.secure;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.config.C4336a;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.onedelhi.secure.eg4;
import com.onedelhi.secure.g60;
import com.onedelhi.secure.nb1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.onedelhi.secure.i9 */
public class C5665i9 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public static volatile C5665i9 f30103a;

    /* renamed from: a */
    public static final C7012v5 f30104a = C7012v5.m67717e();

    /* renamed from: a */
    public final C4336a f30105a;

    /* renamed from: a */
    public final C5068dz f30106a;

    /* renamed from: a */
    public final li4 f30107a;

    /* renamed from: a */
    public C6256o9 f30108a;

    /* renamed from: a */
    public qe4 f30109a;

    /* renamed from: a */
    public final Map<String, Long> f30110a;

    /* renamed from: a */
    public final Set<WeakReference<C5667b>> f30111a;

    /* renamed from: a */
    public final WeakHashMap<Activity, Boolean> f30112a;

    /* renamed from: a */
    public final AtomicInteger f30113a;

    /* renamed from: b */
    public qe4 f30114b;

    /* renamed from: b */
    public Set<C5666a> f30115b;

    /* renamed from: b */
    public final WeakHashMap<Activity, ob1> f30116b;

    /* renamed from: b */
    public final boolean f30117b;

    /* renamed from: c */
    public final WeakHashMap<Activity, eb1> f30118c;

    /* renamed from: c */
    public boolean f30119c;

    /* renamed from: d */
    public final WeakHashMap<Activity, Trace> f30120d;

    /* renamed from: d */
    public boolean f30121d;

    /* renamed from: com.onedelhi.secure.i9$a */
    public interface C5666a {
        /* renamed from: a */
        void mo37899a();
    }

    /* renamed from: com.onedelhi.secure.i9$b */
    public interface C5667b {
        void onUpdateAppState(C6256o9 o9Var);
    }

    public C5665i9(li4 li4, C5068dz dzVar) {
        this(li4, dzVar, C4336a.m34908h(), m51866l());
    }

    @VisibleForTesting
    public C5665i9(li4 li4, C5068dz dzVar, C4336a aVar, boolean z) {
        this.f30112a = new WeakHashMap<>();
        this.f30116b = new WeakHashMap<>();
        this.f30118c = new WeakHashMap<>();
        this.f30120d = new WeakHashMap<>();
        this.f30110a = new HashMap();
        this.f30111a = new HashSet();
        this.f30115b = new HashSet();
        this.f30113a = new AtomicInteger(0);
        this.f30108a = C6256o9.BACKGROUND;
        this.f30119c = false;
        this.f30121d = true;
        this.f30107a = li4;
        this.f30106a = dzVar;
        this.f30105a = aVar;
        this.f30117b = z;
    }

    /* renamed from: c */
    public static C5665i9 m51864c() {
        if (f30103a == null) {
            synchronized (C5665i9.class) {
                if (f30103a == null) {
                    f30103a = new C5665i9(li4.m55636l(), new C5068dz());
                }
            }
        }
        return f30103a;
    }

    /* renamed from: g */
    public static String m51865g(Activity activity) {
        return g60.f28962c + activity.getClass().getSimpleName();
    }

    /* renamed from: l */
    public static boolean m51866l() {
        return ob1.m59179a();
    }

    @VisibleForTesting
    /* renamed from: a */
    public WeakHashMap<Activity, Trace> mo37870a() {
        return this.f30120d;
    }

    /* renamed from: b */
    public C6256o9 mo37871b() {
        return this.f30108a;
    }

    @VisibleForTesting
    /* renamed from: d */
    public qe4 mo37872d() {
        return this.f30114b;
    }

    @VisibleForTesting
    /* renamed from: e */
    public qe4 mo37873e() {
        return this.f30109a;
    }

    @VisibleForTesting
    /* renamed from: f */
    public WeakHashMap<Activity, Boolean> mo37874f() {
        return this.f30112a;
    }

    /* renamed from: h */
    public void mo37875h(@mr2 String str, long j) {
        synchronized (this.f30110a) {
            Long l = this.f30110a.get(str);
            if (l == null) {
                this.f30110a.put(str, Long.valueOf(j));
            } else {
                this.f30110a.put(str, Long.valueOf(l.longValue() + j));
            }
        }
    }

    /* renamed from: i */
    public void mo37876i(int i) {
        this.f30113a.addAndGet(i);
    }

    /* renamed from: j */
    public boolean mo37877j() {
        return this.f30121d;
    }

    /* renamed from: k */
    public boolean mo37878k() {
        return this.f30108a == C6256o9.FOREGROUND;
    }

    /* renamed from: m */
    public boolean mo37879m() {
        return this.f30117b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo37880n(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f30119c     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0019 }
            boolean r0 = r2 instanceof android.app.Application     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0017
            android.app.Application r2 = (android.app.Application) r2     // Catch:{ all -> 0x0019 }
            r2.registerActivityLifecycleCallbacks(r1)     // Catch:{ all -> 0x0019 }
            r2 = 1
            r1.f30119c = r2     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C5665i9.mo37880n(android.content.Context):void");
    }

    /* renamed from: o */
    public void mo37881o(C5666a aVar) {
        synchronized (this.f30115b) {
            this.f30115b.add(aVar);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        mo37895v(activity);
    }

    public void onActivityDestroyed(Activity activity) {
        this.f30116b.remove(activity);
        if (this.f30118c.containsKey(activity)) {
            ((FragmentActivity) activity).mo4464v0().mo4553T1(this.f30118c.remove(activity));
        }
    }

    public void onActivityPaused(Activity activity) {
    }

    public synchronized void onActivityResumed(Activity activity) {
        if (this.f30112a.isEmpty()) {
            this.f30109a = this.f30106a.mo34720a();
            this.f30112a.put(activity, Boolean.TRUE);
            if (this.f30121d) {
                mo37898y(C6256o9.FOREGROUND);
                mo37890q();
                this.f30121d = false;
            } else {
                mo37892s(g60.C5363b.BACKGROUND_TRACE_NAME.toString(), this.f30114b, this.f30109a);
                mo37898y(C6256o9.FOREGROUND);
            }
        } else {
            this.f30112a.put(activity, Boolean.TRUE);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public synchronized void onActivityStarted(Activity activity) {
        if (mo37879m() && this.f30105a.mo29861M()) {
            if (!this.f30116b.containsKey(activity)) {
                mo37895v(activity);
            }
            this.f30116b.get(activity).mo41649c();
            Trace trace = new Trace(m51865g(activity), this.f30107a, this.f30106a, this);
            trace.start();
            this.f30120d.put(activity, trace);
        }
    }

    public synchronized void onActivityStopped(Activity activity) {
        if (mo37879m()) {
            mo37891r(activity);
        }
        if (this.f30112a.containsKey(activity)) {
            this.f30112a.remove(activity);
            if (this.f30112a.isEmpty()) {
                this.f30114b = this.f30106a.mo34720a();
                mo37892s(g60.C5363b.FOREGROUND_TRACE_NAME.toString(), this.f30109a, this.f30114b);
                mo37898y(C6256o9.BACKGROUND);
            }
        }
    }

    /* renamed from: p */
    public void mo37889p(WeakReference<C5667b> weakReference) {
        synchronized (this.f30111a) {
            this.f30111a.add(weakReference);
        }
    }

    /* renamed from: q */
    public final void mo37890q() {
        synchronized (this.f30115b) {
            for (C5666a next : this.f30115b) {
                if (next != null) {
                    next.mo37899a();
                }
            }
        }
    }

    /* renamed from: r */
    public final void mo37891r(Activity activity) {
        Trace trace = this.f30120d.get(activity);
        if (trace != null) {
            this.f30120d.remove(activity);
            rw2<nb1.C6180a> e = this.f30116b.get(activity).mo41651e();
            if (!e.mo44068d()) {
                f30104a.mo46011m("Failed to record frame data for %s.", activity.getClass().getSimpleName());
                return;
            }
            ls3.m56478a(trace, e.mo44067c());
            trace.stop();
        }
    }

    /* renamed from: s */
    public final void mo37892s(String str, qe4 qe4, qe4 qe42) {
        if (this.f30105a.mo29861M()) {
            eg4.C5143b Lj = eg4.m46646cl().mo35365jk(str).mo35362gk(qe4.mo43511e()).mo35363hk(qe4.mo43509d(qe42)).mo35341Lj(SessionManager.getInstance().perfSession().mo36515a());
            int andSet = this.f30113a.getAndSet(0);
            synchronized (this.f30110a) {
                Lj.mo35354Yj(this.f30110a);
                if (andSet != 0) {
                    Lj.mo35356ak(g60.C5362a.TRACE_STARTED_NOT_STOPPED.toString(), (long) andSet);
                }
                this.f30110a.clear();
            }
            this.f30107a.mo39872I((eg4) Lj.mo43381ab(), C6256o9.FOREGROUND_BACKGROUND);
        }
    }

    @VisibleForTesting
    /* renamed from: t */
    public void mo37893t(boolean z) {
        this.f30121d = z;
    }

    @VisibleForTesting
    /* renamed from: u */
    public void mo37894u(qe4 qe4) {
        this.f30114b = qe4;
    }

    /* renamed from: v */
    public final void mo37895v(Activity activity) {
        if (mo37879m() && this.f30105a.mo29861M()) {
            ob1 ob1 = new ob1(activity);
            this.f30116b.put(activity, ob1);
            if (activity instanceof FragmentActivity) {
                eb1 eb1 = new eb1(this.f30106a, this.f30107a, this, ob1);
                this.f30118c.put(activity, eb1);
                ((FragmentActivity) activity).mo4464v0().mo4624v1(eb1, true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        return;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo37896w(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f30119c     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0019 }
            boolean r0 = r2 instanceof android.app.Application     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0017
            android.app.Application r2 = (android.app.Application) r2     // Catch:{ all -> 0x0019 }
            r2.unregisterActivityLifecycleCallbacks(r1)     // Catch:{ all -> 0x0019 }
            r2 = 0
            r1.f30119c = r2     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r1)
            return
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.C5665i9.mo37896w(android.content.Context):void");
    }

    /* renamed from: x */
    public void mo37897x(WeakReference<C5667b> weakReference) {
        synchronized (this.f30111a) {
            this.f30111a.remove(weakReference);
        }
    }

    /* renamed from: y */
    public final void mo37898y(C6256o9 o9Var) {
        this.f30108a = o9Var;
        synchronized (this.f30111a) {
            Iterator<WeakReference<C5667b>> it = this.f30111a.iterator();
            while (it.hasNext()) {
                C5667b bVar = (C5667b) it.next().get();
                if (bVar != null) {
                    bVar.onUpdateAppState(this.f30108a);
                } else {
                    it.remove();
                }
            }
        }
    }
}
