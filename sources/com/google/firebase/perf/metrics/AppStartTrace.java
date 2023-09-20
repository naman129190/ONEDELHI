package com.google.firebase.perf.metrics;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.Process;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.appcompat.widget.C0358b;
import androidx.lifecycle.C0690e;
import androidx.lifecycle.C0697h;
import androidx.lifecycle.C0698i;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.config.C4336a;
import com.onedelhi.secure.C5068dz;
import com.onedelhi.secure.C5486h9;
import com.onedelhi.secure.C6256o9;
import com.onedelhi.secure.ar4;
import com.onedelhi.secure.eg4;
import com.onedelhi.secure.g13;
import com.onedelhi.secure.g60;
import com.onedelhi.secure.h60;
import com.onedelhi.secure.li4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.qe4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.w31;
import com.onedelhi.secure.y24;
import com.onedelhi.secure.z22;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AppStartTrace implements Application.ActivityLifecycleCallbacks, z22 {

    /* renamed from: a */
    public static volatile AppStartTrace f25251a = null;

    /* renamed from: a */
    public static ExecutorService f25252a = null;

    /* renamed from: b */
    public static final long f25253b = TimeUnit.MINUTES.toMicros(1);
    @mr2

    /* renamed from: k */
    public static final qe4 f25254k = new C5068dz().mo34720a();

    /* renamed from: o */
    public static final int f25255o = 0;

    /* renamed from: p */
    public static final int f25256p = 1;

    /* renamed from: a */
    public Context f25257a;

    /* renamed from: a */
    public final C4336a f25258a;

    /* renamed from: a */
    public final C4360b f25259a;

    /* renamed from: a */
    public final C5068dz f25260a;

    /* renamed from: a */
    public final eg4.C5143b f25261a;

    /* renamed from: a */
    public g13 f25262a;

    /* renamed from: a */
    public final li4 f25263a;
    @ts2

    /* renamed from: a */
    public final qe4 f25264a;

    /* renamed from: a */
    public WeakReference<Activity> f25265a;
    @ts2

    /* renamed from: b */
    public final qe4 f25266b;

    /* renamed from: b */
    public WeakReference<Activity> f25267b;

    /* renamed from: b */
    public boolean f25268b = false;

    /* renamed from: c */
    public qe4 f25269c;

    /* renamed from: c */
    public boolean f25270c = false;

    /* renamed from: d */
    public qe4 f25271d;

    /* renamed from: d */
    public boolean f25272d;

    /* renamed from: e */
    public qe4 f25273e;

    /* renamed from: e */
    public boolean f25274e;

    /* renamed from: f */
    public qe4 f25275f;
    @ts2

    /* renamed from: g */
    public qe4 f25276g;

    /* renamed from: h */
    public qe4 f25277h;

    /* renamed from: i */
    public qe4 f25278i;

    /* renamed from: j */
    public qe4 f25279j;

    /* renamed from: n */
    public int f25280n;

    /* renamed from: com.google.firebase.perf.metrics.AppStartTrace$b */
    public final class C4360b implements ViewTreeObserver.OnDrawListener {
        public C4360b() {
        }

        public void onDraw() {
            AppStartTrace.m35071o(AppStartTrace.this);
        }
    }

    /* renamed from: com.google.firebase.perf.metrics.AppStartTrace$c */
    public static class C4361c implements Runnable {

        /* renamed from: a */
        public final AppStartTrace f25282a;

        public C4361c(AppStartTrace appStartTrace) {
            this.f25282a = appStartTrace;
        }

        public void run() {
            if (this.f25282a.f25269c == null) {
                boolean unused = this.f25282a.f25272d = true;
            }
        }
    }

    public AppStartTrace(@mr2 li4 li4, @mr2 C5068dz dzVar, @mr2 C4336a aVar, @mr2 ExecutorService executorService) {
        qe4 qe4 = null;
        this.f25269c = null;
        this.f25271d = null;
        this.f25273e = null;
        this.f25275f = null;
        this.f25276g = null;
        this.f25277h = null;
        this.f25278i = null;
        this.f25279j = null;
        this.f25272d = false;
        this.f25280n = 0;
        this.f25259a = new C4360b();
        this.f25274e = false;
        this.f25263a = li4;
        this.f25260a = dzVar;
        this.f25258a = aVar;
        f25252a = executorService;
        this.f25261a = eg4.m46646cl().mo35365jk("_experiment_app_start_ttid");
        this.f25264a = Build.VERSION.SDK_INT >= 24 ? qe4.m62716f(Process.getStartElapsedRealtime()) : null;
        y24 y24 = (y24) w31.m68755p().mo46526l(y24.class);
        this.f25266b = y24 != null ? qe4.m62716f(y24.mo39258b()) : qe4;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m35063A(eg4.C5143b bVar) {
        this.f25263a.mo39872I((eg4) bVar.mo43381ab(), C6256o9.FOREGROUND_BACKGROUND);
    }

    /* renamed from: o */
    public static /* synthetic */ int m35071o(AppStartTrace appStartTrace) {
        int i = appStartTrace.f25280n;
        appStartTrace.f25280n = i + 1;
        return i;
    }

    /* renamed from: r */
    public static AppStartTrace m35072r() {
        return f25251a != null ? f25251a : m35073s(li4.m55636l(), new C5068dz());
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: s */
    public static AppStartTrace m35073s(li4 li4, C5068dz dzVar) {
        if (f25251a == null) {
            synchronized (AppStartTrace.class) {
                if (f25251a == null) {
                    f25251a = new AppStartTrace(li4, dzVar, C4336a.m34908h(), new ThreadPoolExecutor(0, 1, f25253b + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                }
            }
        }
        return f25251a;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    /* renamed from: y */
    public static boolean m35074y(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(C0358b.f1779e);
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = context.getPackageName();
        String str = packageName + ar4.f25981a;
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.importance == 100 && (next.processName.equals(packageName) || next.processName.startsWith(str))) {
                if (Build.VERSION.SDK_INT < 23 ? m35075z(context) : true) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: z */
    public static boolean m35075z(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return true;
        }
        return powerManager.isInteractive();
    }

    /* renamed from: B */
    public final void mo29918B() {
        eg4.C5143b hk = eg4.m46646cl().mo35365jk(g60.C5363b.APP_START_TRACE_NAME.toString()).mo35362gk(mo29936q().mo43511e()).mo35363hk(mo29936q().mo43509d(this.f25273e));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add((eg4) eg4.m46646cl().mo35365jk(g60.C5363b.ON_CREATE_TRACE_NAME.toString()).mo35362gk(mo29936q().mo43511e()).mo35363hk(mo29936q().mo43509d(this.f25269c)).mo43381ab());
        eg4.C5143b cl = eg4.m46646cl();
        cl.mo35365jk(g60.C5363b.ON_START_TRACE_NAME.toString()).mo35362gk(this.f25269c.mo43511e()).mo35363hk(this.f25269c.mo43509d(this.f25271d));
        arrayList.add((eg4) cl.mo43381ab());
        eg4.C5143b cl2 = eg4.m46646cl();
        cl2.mo35365jk(g60.C5363b.ON_RESUME_TRACE_NAME.toString()).mo35362gk(this.f25271d.mo43511e()).mo35363hk(this.f25271d.mo43509d(this.f25273e));
        arrayList.add((eg4) cl2.mo43381ab());
        hk.mo35337Hj(arrayList).mo35341Lj(this.f25262a.mo36515a());
        this.f25263a.mo39872I((eg4) hk.mo43381ab(), C6256o9.FOREGROUND_BACKGROUND);
    }

    /* renamed from: C */
    public final void mo29919C(eg4.C5143b bVar) {
        if (this.f25277h != null && this.f25278i != null && this.f25279j != null) {
            f25252a.execute(new C5486h9(this, bVar));
            mo29925I();
        }
    }

    /* renamed from: D */
    public final void mo29920D() {
        if (this.f25279j == null) {
            this.f25279j = this.f25260a.mo34720a();
            this.f25261a.mo35345Pj((eg4) eg4.m46646cl().mo35365jk("_experiment_onDrawFoQ").mo35362gk(mo29941x().mo43511e()).mo35363hk(mo29941x().mo43509d(this.f25279j)).mo43381ab());
            if (this.f25264a != null) {
                this.f25261a.mo35345Pj((eg4) eg4.m46646cl().mo35365jk("_experiment_procStart_to_classLoad").mo35362gk(mo29941x().mo43511e()).mo35363hk(mo29941x().mo43509d(mo29936q())).mo43381ab());
            }
            this.f25261a.mo35357bk("systemDeterminedForeground", this.f25274e ? h60.f29487F : h60.f29488G);
            this.f25261a.mo35356ak("onDrawCount", (long) this.f25280n);
            this.f25261a.mo35341Lj(this.f25262a.mo36515a());
            mo29919C(this.f25261a);
        }
    }

    /* renamed from: E */
    public final void mo29921E() {
        if (this.f25277h == null) {
            this.f25277h = this.f25260a.mo34720a();
            this.f25261a.mo35362gk(mo29941x().mo43511e()).mo35363hk(mo29941x().mo43509d(this.f25277h));
            mo29919C(this.f25261a);
        }
    }

    /* renamed from: F */
    public final void mo29922F() {
        if (this.f25278i == null) {
            this.f25278i = this.f25260a.mo34720a();
            this.f25261a.mo35345Pj((eg4) eg4.m46646cl().mo35365jk("_experiment_preDrawFoQ").mo35362gk(mo29941x().mo43511e()).mo35363hk(mo29941x().mo43509d(this.f25278i)).mo43381ab());
            mo29919C(this.f25261a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        return;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo29923G(@com.onedelhi.secure.mr2 android.content.Context r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f25268b     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            com.onedelhi.secure.a32 r0 = androidx.lifecycle.C0698i.m4817h()     // Catch:{ all -> 0x0037 }
            androidx.lifecycle.e r0 = r0.getLifecycle()     // Catch:{ all -> 0x0037 }
            r0.mo4958a(r2)     // Catch:{ all -> 0x0037 }
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0037 }
            boolean r0 = r3 instanceof android.app.Application     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0035
            r0 = r3
            android.app.Application r0 = (android.app.Application) r0     // Catch:{ all -> 0x0037 }
            r0.registerActivityLifecycleCallbacks(r2)     // Catch:{ all -> 0x0037 }
            boolean r0 = r2.f25274e     // Catch:{ all -> 0x0037 }
            r1 = 1
            if (r0 != 0) goto L_0x002e
            boolean r0 = m35074y(r3)     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r0 = 0
            goto L_0x002f
        L_0x002e:
            r0 = 1
        L_0x002f:
            r2.f25274e = r0     // Catch:{ all -> 0x0037 }
            r2.f25268b = r1     // Catch:{ all -> 0x0037 }
            r2.f25257a = r3     // Catch:{ all -> 0x0037 }
        L_0x0035:
            monitor-exit(r2)
            return
        L_0x0037:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.mo29923G(android.content.Context):void");
    }

    @VisibleForTesting
    /* renamed from: H */
    public void mo29924H() {
        this.f25272d = true;
    }

    /* renamed from: I */
    public synchronized void mo29925I() {
        if (this.f25268b) {
            C0698i.m4817h().getLifecycle().mo4960c(this);
            ((Application) this.f25257a).unregisterActivityLifecycleCallbacks(this);
            this.f25268b = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityCreated(android.app.Activity r5, android.os.Bundle r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r6 = r4.f25272d     // Catch:{ all -> 0x0042 }
            if (r6 != 0) goto L_0x0040
            com.onedelhi.secure.qe4 r6 = r4.f25269c     // Catch:{ all -> 0x0042 }
            if (r6 == 0) goto L_0x000a
            goto L_0x0040
        L_0x000a:
            boolean r6 = r4.f25274e     // Catch:{ all -> 0x0042 }
            r0 = 1
            if (r6 != 0) goto L_0x001a
            android.content.Context r6 = r4.f25257a     // Catch:{ all -> 0x0042 }
            boolean r6 = m35074y(r6)     // Catch:{ all -> 0x0042 }
            if (r6 == 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r6 = 0
            goto L_0x001b
        L_0x001a:
            r6 = 1
        L_0x001b:
            r4.f25274e = r6     // Catch:{ all -> 0x0042 }
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0042 }
            r6.<init>(r5)     // Catch:{ all -> 0x0042 }
            r4.f25265a = r6     // Catch:{ all -> 0x0042 }
            com.onedelhi.secure.dz r5 = r4.f25260a     // Catch:{ all -> 0x0042 }
            com.onedelhi.secure.qe4 r5 = r5.mo34720a()     // Catch:{ all -> 0x0042 }
            r4.f25269c = r5     // Catch:{ all -> 0x0042 }
            com.onedelhi.secure.qe4 r5 = r4.mo29941x()     // Catch:{ all -> 0x0042 }
            com.onedelhi.secure.qe4 r6 = r4.f25269c     // Catch:{ all -> 0x0042 }
            long r5 = r5.mo43509d(r6)     // Catch:{ all -> 0x0042 }
            long r1 = f25253b     // Catch:{ all -> 0x0042 }
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x003e
            r4.f25270c = r0     // Catch:{ all -> 0x0042 }
        L_0x003e:
            monitor-exit(r4)
            return
        L_0x0040:
            monitor-exit(r4)
            return
        L_0x0042:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        if (!this.f25272d && !this.f25270c && this.f25258a.mo29876i()) {
            activity.findViewById(16908290).getViewTreeObserver().removeOnDrawListener(this.f25259a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a0, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityResumed(android.app.Activity r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f25272d     // Catch:{ all -> 0x00a1 }
            if (r0 != 0) goto L_0x009f
            boolean r0 = r5.f25270c     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x000b
            goto L_0x009f
        L_0x000b:
            com.google.firebase.perf.config.a r0 = r5.f25258a     // Catch:{ all -> 0x00a1 }
            boolean r0 = r0.mo29876i()     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x0038
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r6.findViewById(r1)     // Catch:{ all -> 0x00a1 }
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()     // Catch:{ all -> 0x00a1 }
            com.google.firebase.perf.metrics.AppStartTrace$b r3 = r5.f25259a     // Catch:{ all -> 0x00a1 }
            r2.addOnDrawListener(r3)     // Catch:{ all -> 0x00a1 }
            com.onedelhi.secure.e9 r2 = new com.onedelhi.secure.e9     // Catch:{ all -> 0x00a1 }
            r2.<init>(r5)     // Catch:{ all -> 0x00a1 }
            com.onedelhi.secure.z61.m72595e(r1, r2)     // Catch:{ all -> 0x00a1 }
            com.onedelhi.secure.f9 r2 = new com.onedelhi.secure.f9     // Catch:{ all -> 0x00a1 }
            r2.<init>(r5)     // Catch:{ all -> 0x00a1 }
            com.onedelhi.secure.d9 r3 = new com.onedelhi.secure.d9     // Catch:{ all -> 0x00a1 }
            r3.<init>(r5)     // Catch:{ all -> 0x00a1 }
            com.onedelhi.secure.z33.m72545a(r1, r2, r3)     // Catch:{ all -> 0x00a1 }
        L_0x0038:
            com.onedelhi.secure.qe4 r1 = r5.f25273e     // Catch:{ all -> 0x00a1 }
            if (r1 == 0) goto L_0x003e
            monitor-exit(r5)
            return
        L_0x003e:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x00a1 }
            r1.<init>(r6)     // Catch:{ all -> 0x00a1 }
            r5.f25267b = r1     // Catch:{ all -> 0x00a1 }
            com.onedelhi.secure.dz r1 = r5.f25260a     // Catch:{ all -> 0x00a1 }
            com.onedelhi.secure.qe4 r1 = r1.mo34720a()     // Catch:{ all -> 0x00a1 }
            r5.f25273e = r1     // Catch:{ all -> 0x00a1 }
            com.google.firebase.perf.session.SessionManager r1 = com.google.firebase.perf.session.SessionManager.getInstance()     // Catch:{ all -> 0x00a1 }
            com.onedelhi.secure.g13 r1 = r1.perfSession()     // Catch:{ all -> 0x00a1 }
            r5.f25262a = r1     // Catch:{ all -> 0x00a1 }
            com.onedelhi.secure.v5 r1 = com.onedelhi.secure.C7012v5.m67717e()     // Catch:{ all -> 0x00a1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a1 }
            r2.<init>()     // Catch:{ all -> 0x00a1 }
            java.lang.String r3 = "onResume(): "
            r2.append(r3)     // Catch:{ all -> 0x00a1 }
            java.lang.Class r6 = r6.getClass()     // Catch:{ all -> 0x00a1 }
            java.lang.String r6 = r6.getName()     // Catch:{ all -> 0x00a1 }
            r2.append(r6)     // Catch:{ all -> 0x00a1 }
            java.lang.String r6 = ": "
            r2.append(r6)     // Catch:{ all -> 0x00a1 }
            com.onedelhi.secure.qe4 r6 = r5.mo29936q()     // Catch:{ all -> 0x00a1 }
            com.onedelhi.secure.qe4 r3 = r5.f25273e     // Catch:{ all -> 0x00a1 }
            long r3 = r6.mo43509d(r3)     // Catch:{ all -> 0x00a1 }
            r2.append(r3)     // Catch:{ all -> 0x00a1 }
            java.lang.String r6 = " microseconds"
            r2.append(r6)     // Catch:{ all -> 0x00a1 }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x00a1 }
            r1.mo46000a(r6)     // Catch:{ all -> 0x00a1 }
            java.util.concurrent.ExecutorService r6 = f25252a     // Catch:{ all -> 0x00a1 }
            com.onedelhi.secure.g9 r1 = new com.onedelhi.secure.g9     // Catch:{ all -> 0x00a1 }
            r1.<init>(r5)     // Catch:{ all -> 0x00a1 }
            r6.execute(r1)     // Catch:{ all -> 0x00a1 }
            if (r0 != 0) goto L_0x009d
            r5.mo29925I()     // Catch:{ all -> 0x00a1 }
        L_0x009d:
            monitor-exit(r5)
            return
        L_0x009f:
            monitor-exit(r5)
            return
        L_0x00a1:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityResumed(android.app.Activity):void");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onActivityStarted(android.app.Activity r1) {
        /*
            r0 = this;
            monitor-enter(r0)
            boolean r1 = r0.f25272d     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            com.onedelhi.secure.qe4 r1 = r0.f25271d     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            boolean r1 = r0.f25270c     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x000e
            goto L_0x0018
        L_0x000e:
            com.onedelhi.secure.dz r1 = r0.f25260a     // Catch:{ all -> 0x001a }
            com.onedelhi.secure.qe4 r1 = r1.mo34720a()     // Catch:{ all -> 0x001a }
            r0.f25271d = r1     // Catch:{ all -> 0x001a }
            monitor-exit(r0)
            return
        L_0x0018:
            monitor-exit(r0)
            return
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityStarted(android.app.Activity):void");
    }

    public void onActivityStopped(Activity activity) {
    }

    @C0697h(C0690e.C0692b.ON_STOP)
    @Keep
    public void onAppEnteredBackground() {
        if (!this.f25272d && !this.f25270c && this.f25276g == null) {
            this.f25276g = this.f25260a.mo34720a();
            this.f25261a.mo35345Pj((eg4) eg4.m46646cl().mo35365jk("_experiment_firstBackgrounding").mo35362gk(mo29941x().mo43511e()).mo35363hk(mo29941x().mo43509d(this.f25276g)).mo43381ab());
        }
    }

    @C0697h(C0690e.C0692b.ON_START)
    @Keep
    public void onAppEnteredForeground() {
        if (!this.f25272d && !this.f25270c && this.f25275f == null) {
            this.f25275f = this.f25260a.mo34720a();
            this.f25261a.mo35345Pj((eg4) eg4.m46646cl().mo35365jk("_experiment_firstForegrounding").mo35362gk(mo29941x().mo43511e()).mo35363hk(mo29941x().mo43509d(this.f25275f)).mo43381ab());
        }
    }

    @ts2
    @VisibleForTesting
    /* renamed from: p */
    public Activity mo29935p() {
        return (Activity) this.f25267b.get();
    }

    @mr2
    /* renamed from: q */
    public final qe4 mo29936q() {
        qe4 qe4 = this.f25266b;
        return qe4 != null ? qe4 : f25254k;
    }

    @ts2
    @VisibleForTesting
    /* renamed from: t */
    public Activity mo29937t() {
        return (Activity) this.f25265a.get();
    }

    @VisibleForTesting
    /* renamed from: u */
    public qe4 mo29938u() {
        return this.f25269c;
    }

    @VisibleForTesting
    /* renamed from: v */
    public qe4 mo29939v() {
        return this.f25273e;
    }

    @VisibleForTesting
    /* renamed from: w */
    public qe4 mo29940w() {
        return this.f25271d;
    }

    @mr2
    /* renamed from: x */
    public final qe4 mo29941x() {
        qe4 qe4 = this.f25264a;
        return qe4 != null ? qe4 : mo29936q();
    }
}
