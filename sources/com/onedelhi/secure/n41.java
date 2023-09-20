package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.p41;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class n41 implements o41 {

    /* renamed from: a */
    public static final int f32383a = 0;

    /* renamed from: a */
    public static final long f32384a = 30;

    /* renamed from: a */
    public static final ThreadFactory f32385a = new C6169a();

    /* renamed from: b */
    public static final int f32386b = 1;

    /* renamed from: b */
    public static final Object f32387b = new Object();

    /* renamed from: b */
    public static final String f32388b = "generatefid.lock";

    /* renamed from: c */
    public static final String f32389c = "CHIME_ANDROID_SDK";

    /* renamed from: d */
    public static final String f32390d = "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.";

    /* renamed from: e */
    public static final String f32391e = "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";

    /* renamed from: f */
    public static final String f32392f = "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";

    /* renamed from: g */
    public static final String f32393g = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.";

    /* renamed from: a */
    public final ar4 f32394a;

    /* renamed from: a */
    public final h41 f32395a;

    /* renamed from: a */
    public final ne3 f32396a;

    /* renamed from: a */
    public final q13 f32397a;

    /* renamed from: a */
    public final u12<to1> f32398a;

    /* renamed from: a */
    public final w31 f32399a;

    /* renamed from: a */
    public final Object f32400a;
    @mj1("this")

    /* renamed from: a */
    public String f32401a;
    @mj1("lock")

    /* renamed from: a */
    public final List<j34> f32402a;
    @mj1("FirebaseInstallations.this")

    /* renamed from: a */
    public Set<i11> f32403a;

    /* renamed from: a */
    public final Executor f32404a;

    /* renamed from: a */
    public final ExecutorService f32405a;

    /* renamed from: com.onedelhi.secure.n41$a */
    public class C6169a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f32406a = new AtomicInteger(1);

        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f32406a.getAndIncrement())}));
        }
    }

    /* renamed from: com.onedelhi.secure.n41$b */
    public class C6170b implements j11 {

        /* renamed from: a */
        public final /* synthetic */ i11 f32407a;

        public C6170b(i11 i11) {
            this.f32407a = i11;
        }

        /* renamed from: a */
        public void mo38381a() {
            synchronized (n41.this) {
                n41.this.f32403a.remove(this.f32407a);
            }
        }
    }

    /* renamed from: com.onedelhi.secure.n41$c */
    public static /* synthetic */ class C6171c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32409a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f32410b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.onedelhi.secure.kf4$b[] r0 = com.onedelhi.secure.kf4.C5899b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32410b = r0
                r1 = 1
                com.onedelhi.secure.kf4$b r2 = com.onedelhi.secure.kf4.C5899b.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f32410b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onedelhi.secure.kf4$b r3 = com.onedelhi.secure.kf4.C5899b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f32410b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onedelhi.secure.kf4$b r3 = com.onedelhi.secure.kf4.C5899b.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.onedelhi.secure.jr1$b[] r2 = com.onedelhi.secure.jr1.C5843b.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f32409a = r2
                com.onedelhi.secure.jr1$b r3 = com.onedelhi.secure.jr1.C5843b.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f32409a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.onedelhi.secure.jr1$b r2 = com.onedelhi.secure.jr1.C5843b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.n41.C6171c.<clinit>():void");
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public n41(w31 w31, @mr2 b73<al1> b73, @mr2 ExecutorService executorService, @mr2 Executor executor) {
        this(executorService, executor, w31, new h41(w31.mo46527n(), b73), new q13(w31), ar4.m39019c(), new u12(new i41(w31)), new ne3());
    }

    @SuppressLint({"ThreadPoolCreation"})
    public n41(ExecutorService executorService, Executor executor, w31 w31, h41 h41, q13 q13, ar4 ar4, u12<to1> u12, ne3 ne3) {
        this.f32400a = new Object();
        this.f32403a = new HashSet();
        this.f32402a = new ArrayList();
        this.f32399a = w31;
        this.f32395a = h41;
        this.f32397a = q13;
        this.f32394a = ar4;
        this.f32398a = u12;
        this.f32396a = ne3;
        this.f32405a = executorService;
        this.f32404a = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m57851D() {
        m57852E(false);
    }

    /* renamed from: F */
    public static /* synthetic */ to1 m57853F(w31 w31) {
        return new to1(w31);
    }

    @mr2
    /* renamed from: v */
    public static n41 m57860v() {
        return m57861w(w31.m68755p());
    }

    @mr2
    /* renamed from: w */
    public static n41 m57861w(@mr2 w31 w31) {
        Preconditions.checkArgument(w31 != null, "Null is not a valid value of FirebaseApp.");
        return (n41) w31.mo46526l(o41.class);
    }

    @ts2
    /* renamed from: A */
    public String mo40931A() {
        return this.f32399a.mo46529s().mo37196n();
    }

    /* renamed from: B */
    public final void mo40932B(r13 r13) {
        synchronized (f32387b) {
            rb0 a = rb0.m63459a(this.f32399a.mo46527n(), f32388b);
            try {
                this.f32397a.mo43077c(r13);
                if (a != null) {
                    a.mo43835b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo43835b();
                }
                throw th;
            }
        }
    }

    /* renamed from: G */
    public final void mo40933G() {
        Preconditions.checkNotEmpty(mo40952s(), f32391e);
        Preconditions.checkNotEmpty(mo40931A(), f32392f);
        Preconditions.checkNotEmpty(mo40951r(), f32390d);
        Preconditions.checkArgument(ar4.m39022h(mo40952s()), f32391e);
        Preconditions.checkArgument(ar4.m39021g(mo40951r()), f32390d);
    }

    /* renamed from: H */
    public final String mo40934H(r13 r13) {
        if ((!this.f32399a.mo46528r().equals(f32389c) && !this.f32399a.mo46512B()) || !r13.mo43787m()) {
            return this.f32396a.mo41020a();
        }
        String f = mo40954u().mo45203f();
        return TextUtils.isEmpty(f) ? this.f32396a.mo41020a() : f;
    }

    /* renamed from: I */
    public final r13 mo40935I(r13 r13) throws p41 {
        jr1 d = this.f32395a.mo37175d(mo40951r(), r13.mo35943d(), mo40931A(), mo40952s(), (r13.mo35943d() == null || r13.mo35943d().length() != 11) ? null : mo40954u().mo45206i());
        int i = C6171c.f32409a[d.mo38816e().ordinal()];
        if (i == 1) {
            return r13.mo43792s(d.mo38814c(), d.mo38815d(), this.f32394a.mo31119b(), d.mo38813b().mo39235c(), d.mo38813b().mo39236d());
        } else if (i == 2) {
            return r13.mo43790q("BAD CONFIG");
        } else {
            throw new p41("Firebase Installations Service is unavailable. Please try again later.", p41.C6364a.UNAVAILABLE);
        }
    }

    /* renamed from: J */
    public final void mo40936J(Exception exc) {
        synchronized (this.f32400a) {
            Iterator<j34> it = this.f32402a.iterator();
            while (it.hasNext()) {
                if (it.next().mo31667b(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: K */
    public final void mo40937K(r13 r13) {
        synchronized (this.f32400a) {
            Iterator<j34> it = this.f32402a.iterator();
            while (it.hasNext()) {
                if (it.next().mo31666a(r13)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: L */
    public final synchronized void mo40938L(String str) {
        this.f32401a = str;
    }

    /* renamed from: M */
    public final synchronized void mo40939M(r13 r13, r13 r132) {
        if (this.f32403a.size() != 0 && !TextUtils.equals(r13.mo35943d(), r132.mo35943d())) {
            for (i11 a : this.f32403a) {
                a.mo37812a(r132.mo35943d());
            }
        }
    }

    @mr2
    /* renamed from: a */
    public w94<Void> mo40940a() {
        return ha4.m16569d(this.f32405a, new m41(this));
    }

    @mr2
    /* renamed from: b */
    public synchronized j11 mo40941b(@mr2 i11 i11) {
        this.f32403a.add(i11);
        return new C6170b(i11);
    }

    @mr2
    /* renamed from: c */
    public w94<kr1> mo40942c(boolean z) {
        mo40933G();
        w94<kr1> k = mo40944k();
        this.f32405a.execute(new l41(this, z));
        return k;
    }

    @mr2
    /* renamed from: d */
    public w94<String> mo40943d() {
        mo40933G();
        String t = mo40953t();
        if (t != null) {
            return ha4.m16572g(t);
        }
        w94<String> l = mo40945l();
        this.f32405a.execute(new j41(this));
        return l;
    }

    /* renamed from: k */
    public final w94<kr1> mo40944k() {
        x94 x94 = new x94();
        mo40946m(new zf1(this.f32394a, x94));
        return x94.mo26835a();
    }

    /* renamed from: l */
    public final w94<String> mo40945l() {
        x94 x94 = new x94();
        mo40946m(new bg1(x94));
        return x94.mo26835a();
    }

    /* renamed from: m */
    public final void mo40946m(j34 j34) {
        synchronized (this.f32400a) {
            this.f32402a.add(j34);
        }
    }

    /* renamed from: n */
    public final Void mo40947n() throws p41 {
        mo40938L((String) null);
        r13 x = mo40955x();
        if (x.mo43785k()) {
            this.f32395a.mo37176e(mo40951r(), x.mo35943d(), mo40931A(), x.mo35946f());
        }
        mo40932B(x.mo43791r());
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m57850C(boolean r3) {
        /*
            r2 = this;
            com.onedelhi.secure.r13 r0 = r2.mo40955x()
            boolean r1 = r0.mo43783i()     // Catch:{ p41 -> 0x005c }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0.mo43786l()     // Catch:{ p41 -> 0x005c }
            if (r1 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            if (r3 != 0) goto L_0x001d
            com.onedelhi.secure.ar4 r3 = r2.f32394a     // Catch:{ p41 -> 0x005c }
            boolean r3 = r3.mo31121f(r0)     // Catch:{ p41 -> 0x005c }
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            com.onedelhi.secure.r13 r3 = r2.mo40950q(r0)     // Catch:{ p41 -> 0x005c }
            goto L_0x0026
        L_0x0022:
            com.onedelhi.secure.r13 r3 = r2.mo40935I(r0)     // Catch:{ p41 -> 0x005c }
        L_0x0026:
            r2.mo40932B(r3)
            r2.mo40939M(r0, r3)
            boolean r0 = r3.mo43785k()
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r3.mo35943d()
            r2.mo40938L(r0)
        L_0x0039:
            boolean r0 = r3.mo43783i()
            if (r0 == 0) goto L_0x004a
            com.onedelhi.secure.p41 r3 = new com.onedelhi.secure.p41
            com.onedelhi.secure.p41$a r0 = com.onedelhi.secure.p41.C6364a.BAD_CONFIG
            r3.<init>(r0)
        L_0x0046:
            r2.mo40936J(r3)
            goto L_0x005b
        L_0x004a:
            boolean r0 = r3.mo43784j()
            if (r0 == 0) goto L_0x0058
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            goto L_0x0046
        L_0x0058:
            r2.mo40937K(r3)
        L_0x005b:
            return
        L_0x005c:
            r3 = move-exception
            r2.mo40936J(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.n41.m57850C(boolean):void");
    }

    /* renamed from: p */
    public final void m57852E(boolean z) {
        r13 z2 = mo40957z();
        if (z) {
            z2 = z2.mo43789p();
        }
        mo40937K(z2);
        this.f32404a.execute(new k41(this, z));
    }

    /* renamed from: q */
    public final r13 mo40950q(@mr2 r13 r13) throws p41 {
        kf4 f = this.f32395a.mo37177f(mo40951r(), r13.mo35943d(), mo40931A(), r13.mo35946f());
        int i = C6171c.f32410b[f.mo39234b().ordinal()];
        if (i == 1) {
            return r13.mo43788o(f.mo39235c(), f.mo39236d(), this.f32394a.mo31119b());
        } else if (i == 2) {
            return r13.mo43790q("BAD CONFIG");
        } else {
            if (i == 3) {
                mo40938L((String) null);
                return r13.mo43791r();
            }
            throw new p41("Firebase Installations Service is unavailable. Please try again later.", p41.C6364a.UNAVAILABLE);
        }
    }

    @ts2
    /* renamed from: r */
    public String mo40951r() {
        return this.f32399a.mo46529s().mo37191i();
    }

    @hw4
    /* renamed from: s */
    public String mo40952s() {
        return this.f32399a.mo46529s().mo37192j();
    }

    /* renamed from: t */
    public final synchronized String mo40953t() {
        return this.f32401a;
    }

    /* renamed from: u */
    public final to1 mo40954u() {
        return this.f32398a.get();
    }

    /* renamed from: x */
    public final r13 mo40955x() {
        r13 e;
        synchronized (f32387b) {
            rb0 a = rb0.m63459a(this.f32399a.mo46527n(), f32388b);
            try {
                e = this.f32397a.mo43079e();
                if (a != null) {
                    a.mo43835b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo43835b();
                }
                throw th;
            }
        }
        return e;
    }

    @hw4
    /* renamed from: y */
    public String mo40956y() {
        return this.f32399a.mo46528r();
    }

    /* renamed from: z */
    public final r13 mo40957z() {
        r13 e;
        synchronized (f32387b) {
            rb0 a = rb0.m63459a(this.f32399a.mo46527n(), f32388b);
            try {
                e = this.f32397a.mo43079e();
                if (e.mo43784j()) {
                    e = this.f32397a.mo43077c(e.mo43793t(mo40934H(e)));
                }
                if (a != null) {
                    a.mo43835b();
                }
            } catch (Throwable th) {
                if (a != null) {
                    a.mo43835b();
                }
                throw th;
            }
        }
        return e;
    }
}
