package com.onedelhi.secure;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ga0 {

    /* renamed from: a */
    public static final int f29098a = 1024;

    /* renamed from: a */
    public static final String f29099a = "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin";

    /* renamed from: b */
    public static final int f29100b = 10;

    /* renamed from: b */
    public static final String f29101b = "com.crashlytics.RequireBuildId";

    /* renamed from: b */
    public static final boolean f29102b = true;

    /* renamed from: c */
    public static final int f29103c = 3;

    /* renamed from: c */
    public static final String f29104c = "com.crashlytics.on-demand.recorded-exceptions";

    /* renamed from: d */
    public static final String f29105d = "com.crashlytics.on-demand.dropped-exceptions";

    /* renamed from: e */
    public static final String f29106e = "initialization_marker";

    /* renamed from: f */
    public static final String f29107f = "crash_marker";

    /* renamed from: a */
    public final long f29108a = System.currentTimeMillis();

    /* renamed from: a */
    public final Context f29109a;
    @hw4

    /* renamed from: a */
    public final C4688bo f29110a;

    /* renamed from: a */
    public final ca0 f29111a;

    /* renamed from: a */
    public ea0 f29112a;

    /* renamed from: a */
    public final C5479h5 f29113a;

    /* renamed from: a */
    public ha0 f29114a;

    /* renamed from: a */
    public final ja0 f29115a;

    /* renamed from: a */
    public final ld0 f29116a;

    /* renamed from: a */
    public final lo1 f29117a;

    /* renamed from: a */
    public final t21 f29118a;

    /* renamed from: a */
    public final tu2 f29119a = new tu2();

    /* renamed from: a */
    public final w31 f29120a;

    /* renamed from: a */
    public final ExecutorService f29121a;

    /* renamed from: a */
    public boolean f29122a;

    /* renamed from: b */
    public ha0 f29123b;

    /* renamed from: com.onedelhi.secure.ga0$a */
    public class C5397a implements Callable<w94<Void>> {

        /* renamed from: a */
        public final /* synthetic */ mw3 f29125a;

        public C5397a(mw3 mw3) {
            this.f29125a = mw3;
        }

        /* renamed from: a */
        public w94<Void> call() throws Exception {
            return ga0.this.mo36592i(this.f29125a);
        }
    }

    /* renamed from: com.onedelhi.secure.ga0$b */
    public class C5398b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ mw3 f29127a;

        public C5398b(mw3 mw3) {
            this.f29127a = mw3;
        }

        public void run() {
            w94 unused = ga0.this.mo36592i(this.f29127a);
        }
    }

    /* renamed from: com.onedelhi.secure.ga0$c */
    public class C5399c implements Callable<Boolean> {
        public C5399c() {
        }

        /* renamed from: a */
        public Boolean call() throws Exception {
            try {
                boolean d = ga0.this.f29114a.mo37230d();
                if (!d) {
                    o92.m59120f().mo41623m("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d);
            } catch (Exception e) {
                o92.m59120f().mo41616e("Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }
    }

    /* renamed from: com.onedelhi.secure.ga0$d */
    public class C5400d implements Callable<Boolean> {
        public C5400d() {
        }

        /* renamed from: a */
        public Boolean call() throws Exception {
            return Boolean.valueOf(ga0.this.f29112a.mo34939u());
        }
    }

    public ga0(w31 w31, lo1 lo1, ja0 ja0, ld0 ld0, C4688bo boVar, C5479h5 h5Var, t21 t21, ExecutorService executorService) {
        this.f29120a = w31;
        this.f29116a = ld0;
        this.f29109a = w31.mo46527n();
        this.f29117a = lo1;
        this.f29115a = ja0;
        this.f29110a = boVar;
        this.f29113a = h5Var;
        this.f29121a = executorService;
        this.f29118a = t21;
        this.f29111a = new ca0(executorService);
    }

    /* renamed from: m */
    public static String m49193m() {
        return C7174wo.f37061c;
    }

    /* renamed from: n */
    public static boolean m49194n(String str, boolean z) {
        if (!z) {
            o92.m59120f().mo41621k("Configured not to require a build ID.");
            return true;
        } else if (!TextUtils.isEmpty(str)) {
            return true;
        } else {
            Log.e(o92.f32945b, ".");
            Log.e(o92.f32945b, ".     |  | ");
            Log.e(o92.f32945b, ".     |  |");
            Log.e(o92.f32945b, ".     |  |");
            Log.e(o92.f32945b, ".   \\ |  | /");
            Log.e(o92.f32945b, ".    \\    /");
            Log.e(o92.f32945b, ".     \\  /");
            Log.e(o92.f32945b, ".      \\/");
            Log.e(o92.f32945b, ".");
            Log.e(o92.f32945b, f29099a);
            Log.e(o92.f32945b, ".");
            Log.e(o92.f32945b, ".      /\\");
            Log.e(o92.f32945b, ".     /  \\");
            Log.e(o92.f32945b, ".    /    \\");
            Log.e(o92.f32945b, ".   / |  | \\");
            Log.e(o92.f32945b, ".     |  |");
            Log.e(o92.f32945b, ".     |  |");
            Log.e(o92.f32945b, ".     |  |");
            Log.e(o92.f32945b, ".");
            return false;
        }
    }

    /* renamed from: d */
    public final void mo36587d() {
        boolean z;
        try {
            z = Boolean.TRUE.equals((Boolean) zq4.m74242f(this.f29111a.mo32274h(new C5400d())));
        } catch (Exception unused) {
            z = false;
        }
        this.f29122a = z;
    }

    @mr2
    /* renamed from: e */
    public w94<Boolean> mo36588e() {
        return this.f29112a.mo34937o();
    }

    /* renamed from: f */
    public w94<Void> mo36589f() {
        return this.f29112a.mo34938t();
    }

    /* renamed from: g */
    public boolean mo36590g() {
        return this.f29122a;
    }

    /* renamed from: h */
    public boolean mo36591h() {
        return this.f29114a.mo37229c();
    }

    /* renamed from: i */
    public final w94<Void> mo36592i(mw3 mw3) {
        mo36600s();
        try {
            this.f29110a.mo31956a(new fa0(this));
            if (!mw3.mo40840a().f30953a.f30958a) {
                o92.m59120f().mo41613b("Collection of crash reports disabled in Crashlytics settings.");
                return ha4.m16571f(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f29112a.mo34915B(mw3)) {
                o92.m59120f().mo41623m("Previous sessions could not be finalized.");
            }
            w94<Void> Z = this.f29112a.mo34932Z(mw3.mo40841b());
            mo36599r();
            return Z;
        } catch (Exception e) {
            o92.m59120f().mo41616e("Crashlytics encountered a problem during asynchronous initialization.", e);
            return ha4.m16571f(e);
        } finally {
            mo36599r();
        }
    }

    /* renamed from: j */
    public w94<Void> mo36593j(mw3 mw3) {
        return zq4.m74244h(this.f29121a, new C5397a(mw3));
    }

    /* renamed from: k */
    public final void mo36594k(mw3 mw3) {
        String str;
        o92 o92;
        Future<?> submit = this.f29121a.submit(new C5398b(mw3));
        o92.m59120f().mo41613b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(3, TimeUnit.SECONDS);
            return;
        } catch (InterruptedException e) {
            e = e;
            o92 = o92.m59120f();
            str = "Crashlytics was interrupted during initialization.";
        } catch (ExecutionException e2) {
            e = e2;
            o92 = o92.m59120f();
            str = "Crashlytics encountered a problem during initialization.";
        } catch (TimeoutException e3) {
            e = e3;
            o92 = o92.m59120f();
            str = "Crashlytics timed out during initialization.";
        }
        o92.mo41616e(str, e);
    }

    /* renamed from: l */
    public ea0 mo36595l() {
        return this.f29112a;
    }

    /* renamed from: o */
    public void mo36596o(String str) {
        this.f29112a.mo34936d0(System.currentTimeMillis() - this.f29108a, str);
    }

    /* renamed from: p */
    public void mo36597p(@mr2 Throwable th) {
        this.f29112a.mo34935c0(Thread.currentThread(), th);
    }

    /* renamed from: q */
    public void mo36598q(Throwable th) {
        o92 f = o92.m59120f();
        f.mo41613b("Recorded on-demand fatal events: " + this.f29119a.mo45312b());
        o92 f2 = o92.m59120f();
        f2.mo41613b("Dropped on-demand fatal events: " + this.f29119a.mo45311a());
        this.f29112a.mo34930X(f29104c, Integer.toString(this.f29119a.mo45312b()));
        this.f29112a.mo34930X(f29105d, Integer.toString(this.f29119a.mo45311a()));
        this.f29112a.mo34925Q(Thread.currentThread(), th);
    }

    /* renamed from: r */
    public void mo36599r() {
        this.f29111a.mo32274h(new C5399c());
    }

    /* renamed from: s */
    public void mo36600s() {
        this.f29111a.mo32268b();
        this.f29114a.mo37227a();
        o92.m59120f().mo41621k("Initialization marker file was created.");
    }

    /* renamed from: t */
    public boolean mo36601t(C7225x8 x8Var, mw3 mw3) {
        mw3 mw32 = mw3;
        if (m49194n(x8Var.f37364b, u10.m66364k(this.f29109a, f29101b, true))) {
            String wrVar = new C7177wr(this.f29117a).toString();
            try {
                this.f29123b = new ha0(f29107f, this.f29118a);
                this.f29114a = new ha0(f29106e, this.f29118a);
                bq4 bq4 = new bq4(wrVar, this.f29118a, this.f29111a);
                b92 b92 = new b92(this.f29118a);
                C7225x8 x8Var2 = x8Var;
                b92 b922 = b92;
                bq4 bq42 = bq4;
                yu3 k = yu3.m72208k(this.f29109a, this.f29117a, this.f29118a, x8Var2, b922, bq42, new dj2(1024, new di3(10)), mw3, this.f29119a);
                Context context = this.f29109a;
                ca0 ca0 = this.f29111a;
                lo1 lo1 = this.f29117a;
                ld0 ld0 = this.f29116a;
                t21 t21 = this.f29118a;
                ha0 ha0 = this.f29123b;
                bq4 bq43 = bq4;
                Context context2 = context;
                String str = wrVar;
                ca0 ca02 = ca0;
                lo1 lo12 = lo1;
                ld0 ld02 = ld0;
                t21 t212 = t21;
                ha0 ha02 = ha0;
                C7225x8 x8Var3 = x8Var;
                this.f29112a = new ea0(context2, ca02, lo12, ld02, t212, ha02, x8Var3, bq43, b92, k, this.f29115a, this.f29113a);
                boolean h = mo36591h();
                mo36587d();
                this.f29112a.mo34944z(str, Thread.getDefaultUncaughtExceptionHandler(), mw32);
                if (!h || !u10.m66356c(this.f29109a)) {
                    o92.m59120f().mo41613b("Successfully configured exception handler.");
                    return true;
                }
                o92.m59120f().mo41613b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                mo36594k(mw32);
                return false;
            } catch (Exception e) {
                o92.m59120f().mo41616e("Crashlytics was not started due to an exception during initialization", e);
                this.f29112a = null;
                return false;
            }
        } else {
            throw new IllegalStateException(f29099a);
        }
    }

    /* renamed from: u */
    public w94<Void> mo36602u() {
        return this.f29112a.mo34927U();
    }

    /* renamed from: v */
    public void mo36603v(@ts2 Boolean bool) {
        this.f29116a.mo39787g(bool);
    }

    /* renamed from: w */
    public void mo36604w(String str, String str2) {
        this.f29112a.mo34928V(str, str2);
    }

    /* renamed from: x */
    public void mo36605x(Map<String, String> map) {
        this.f29112a.mo34929W(map);
    }

    /* renamed from: y */
    public void mo36606y(String str, String str2) {
        this.f29112a.mo34930X(str, str2);
    }

    /* renamed from: z */
    public void mo36607z(String str) {
        this.f29112a.mo34931Y(str);
    }
}
