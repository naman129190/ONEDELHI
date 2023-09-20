package com.onedelhi.secure;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class c41 {

    /* renamed from: a */
    public static final int f26638a = 500;

    /* renamed from: a */
    public static final String f26639a = "clx";

    /* renamed from: b */
    public static final String f26640b = "crash";
    @hw4

    /* renamed from: a */
    public final ga0 f26641a;

    /* renamed from: com.onedelhi.secure.c41$a */
    public class C4728a implements c80<Void, Object> {
        public Object then(@mr2 w94<Void> w94) throws Exception {
            if (w94.mo17590v()) {
                return null;
            }
            o92.m59120f().mo41616e("Error fetching settings.", w94.mo17585q());
            return null;
        }
    }

    /* renamed from: com.onedelhi.secure.c41$b */
    public class C4729b implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ ga0 f26642a;

        /* renamed from: a */
        public final /* synthetic */ yv3 f26643a;

        /* renamed from: a */
        public final /* synthetic */ boolean f26644a;

        public C4729b(boolean z, ga0 ga0, yv3 yv3) {
            this.f26644a = z;
            this.f26642a = ga0;
            this.f26643a = yv3;
        }

        /* renamed from: a */
        public Void call() throws Exception {
            if (!this.f26644a) {
                return null;
            }
            this.f26642a.mo36593j(this.f26643a);
            return null;
        }
    }

    public c41(@mr2 ga0 ga0) {
        this.f26641a = ga0;
    }

    @mr2
    /* renamed from: d */
    public static c41 m40702d() {
        c41 c41 = (c41) w31.m68755p().mo46526l(c41.class);
        Objects.requireNonNull(c41, "FirebaseCrashlytics component is not present.");
        return c41;
    }

    @ts2
    /* renamed from: e */
    public static c41 m40703e(@mr2 w31 w31, @mr2 o41 o41, @mr2 xh0<ja0> xh0, @mr2 xh0<C4623b5> xh02) {
        Context n = w31.mo46527n();
        String packageName = n.getPackageName();
        o92 f = o92.m59120f();
        f.mo41617g("Initializing Firebase Crashlytics " + ga0.m49193m() + " for " + packageName);
        t21 t21 = new t21(n);
        ld0 ld0 = new ld0(w31);
        lo1 lo1 = new lo1(n, packageName, o41, ld0);
        ma0 ma0 = new ma0(xh0);
        C5361g5 g5Var = new C5361g5(xh02);
        w31 w312 = w31;
        lo1 lo12 = lo1;
        ld0 ld02 = ld0;
        ga0 ga0 = new ga0(w312, lo12, ma0, ld02, g5Var.mo36569e(), g5Var.mo36568d(), t21, bx0.m40609c("Crashlytics Exception Handler"));
        String j = w31.mo46529s().mo37192j();
        String p = u10.m66369p(n);
        List<C7275xp> l = u10.m66365l(n);
        o92 f2 = o92.m59120f();
        f2.mo41613b("Mapping file ID is: " + p);
        for (C7275xp next : l) {
            o92.m59120f().mo41613b(String.format("Build id for %s on %s: %s", new Object[]{next.mo47374c(), next.mo47372a(), next.mo47373b()}));
        }
        ga0 ga02 = ga0;
        try {
            C7225x8 a = C7225x8.m70010a(n, lo1, j, p, l, new pk0(n));
            o92 f3 = o92.m59120f();
            f3.mo41621k("Installer package name is: " + a.f37365c);
            ExecutorService c = bx0.m40609c("com.google.firebase.crashlytics.startup");
            yv3 l2 = yv3.m72264l(n, j, lo1, new vm1(), a.f37367e, a.f37368f, t21, ld0);
            l2.mo48015p(c).mo17582n(c, new C4728a());
            ha4.m16569d(c, new C4729b(ga02.mo36601t(a, l2), ga02, l2));
            return new c41(ga02);
        } catch (PackageManager.NameNotFoundException e) {
            o92.m59120f().mo41616e("Error retrieving app package info.", e);
            return null;
        }
    }

    @mr2
    /* renamed from: a */
    public w94<Boolean> mo32237a() {
        return this.f26641a.mo36588e();
    }

    /* renamed from: b */
    public void mo32238b() {
        this.f26641a.mo36589f();
    }

    /* renamed from: c */
    public boolean mo32239c() {
        return this.f26641a.mo36590g();
    }

    /* renamed from: f */
    public void mo32240f(@mr2 String str) {
        this.f26641a.mo36596o(str);
    }

    /* renamed from: g */
    public void mo32241g(@mr2 Throwable th) {
        if (th == null) {
            o92.m59120f().mo41623m("A null value was passed to recordException. Ignoring.");
        } else {
            this.f26641a.mo36597p(th);
        }
    }

    /* renamed from: h */
    public void mo32242h() {
        this.f26641a.mo36602u();
    }

    /* renamed from: i */
    public void mo32243i(@ts2 Boolean bool) {
        this.f26641a.mo36603v(bool);
    }

    /* renamed from: j */
    public void mo32244j(boolean z) {
        this.f26641a.mo36603v(Boolean.valueOf(z));
    }

    /* renamed from: k */
    public void mo32245k(@mr2 String str, double d) {
        this.f26641a.mo36604w(str, Double.toString(d));
    }

    /* renamed from: l */
    public void mo32246l(@mr2 String str, float f) {
        this.f26641a.mo36604w(str, Float.toString(f));
    }

    /* renamed from: m */
    public void mo32247m(@mr2 String str, int i) {
        this.f26641a.mo36604w(str, Integer.toString(i));
    }

    /* renamed from: n */
    public void mo32248n(@mr2 String str, long j) {
        this.f26641a.mo36604w(str, Long.toString(j));
    }

    /* renamed from: o */
    public void mo32249o(@mr2 String str, @mr2 String str2) {
        this.f26641a.mo36604w(str, str2);
    }

    /* renamed from: p */
    public void mo32250p(@mr2 String str, boolean z) {
        this.f26641a.mo36604w(str, Boolean.toString(z));
    }

    /* renamed from: q */
    public void mo32251q(@mr2 lc0 lc0) {
        this.f26641a.mo36605x(lc0.f31611a);
    }

    /* renamed from: r */
    public void mo32252r(@mr2 String str) {
        this.f26641a.mo36607z(str);
    }
}
