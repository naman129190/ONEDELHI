package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.C4330i;
import com.onedelhi.secure.a51;
import com.onedelhi.secure.b51;
import com.onedelhi.secure.b73;
import com.onedelhi.secure.bl1;
import com.onedelhi.secure.c51;
import com.onedelhi.secure.d51;
import com.onedelhi.secure.e51;
import com.onedelhi.secure.ha4;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.j01;
import com.onedelhi.secure.ji2;
import com.onedelhi.secure.k01;
import com.onedelhi.secure.l73;
import com.onedelhi.secure.mj1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.n64;
import com.onedelhi.secure.nd0;
import com.onedelhi.secure.nh1;
import com.onedelhi.secure.o41;
import com.onedelhi.secure.o84;
import com.onedelhi.secure.pv0;
import com.onedelhi.secure.r41;
import com.onedelhi.secure.t41;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.tv0;
import com.onedelhi.secure.u41;
import com.onedelhi.secure.v41;
import com.onedelhi.secure.w31;
import com.onedelhi.secure.w41;
import com.onedelhi.secure.w94;
import com.onedelhi.secure.wp4;
import com.onedelhi.secure.x41;
import com.onedelhi.secure.x94;
import com.onedelhi.secure.xf4;
import com.onedelhi.secure.y41;
import com.onedelhi.secure.yh4;
import com.onedelhi.secure.z41;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FirebaseMessaging {

    /* renamed from: a */
    public static final long f25012a = 30;
    @mj1("FirebaseMessaging.class")

    /* renamed from: a */
    public static C4330i f25013a = null;
    @hw4
    @SuppressLint({"FirebaseUnknownNullness"})
    @ts2

    /* renamed from: a */
    public static yh4 f25014a = null;

    /* renamed from: a */
    public static final String f25015a = "FirebaseMessaging";
    @mj1("FirebaseMessaging.class")
    @hw4

    /* renamed from: a */
    public static ScheduledExecutorService f25016a = null;

    /* renamed from: b */
    public static final long f25017b = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: b */
    public static final String f25018b = "com.google.android.gms";

    /* renamed from: c */
    public static final String f25019c = "com.google.android.gcm.intent.SEND";

    /* renamed from: d */
    public static final String f25020d = "app";
    @Deprecated

    /* renamed from: e */
    public static final String f25021e = "FCM";

    /* renamed from: f */
    public static final String f25022f = "";

    /* renamed from: a */
    public final Application.ActivityLifecycleCallbacks f25023a;

    /* renamed from: a */
    public final Context f25024a;

    /* renamed from: a */
    public final C4308a f25025a;

    /* renamed from: a */
    public final C4328h f25026a;

    /* renamed from: a */
    public final ji2 f25027a;

    /* renamed from: a */
    public final nh1 f25028a;

    /* renamed from: a */
    public final o41 f25029a;
    @ts2

    /* renamed from: a */
    public final r41 f25030a;

    /* renamed from: a */
    public final w31 f25031a;

    /* renamed from: a */
    public final w94<xf4> f25032a;

    /* renamed from: a */
    public final Executor f25033a;
    @mj1("this")

    /* renamed from: a */
    public boolean f25034a;

    /* renamed from: b */
    public final Executor f25035b;

    /* renamed from: c */
    public final Executor f25036c;

    /* renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    public class C4308a {

        /* renamed from: a */
        public static final String f25037a = "firebase_messaging_auto_init_enabled";

        /* renamed from: b */
        public static final String f25038b = "com.google.firebase.messaging";

        /* renamed from: c */
        public static final String f25039c = "auto_init";

        /* renamed from: a */
        public final n64 f25041a;
        @mj1("this")
        @ts2

        /* renamed from: a */
        public tv0<nd0> f25042a;
        @mj1("this")
        @ts2

        /* renamed from: a */
        public Boolean f25043a;
        @mj1("this")

        /* renamed from: a */
        public boolean f25044a;

        public C4308a(n64 n64) {
            this.f25041a = n64;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m34710d(pv0 pv0) {
            if (mo29715c()) {
                FirebaseMessaging.this.mo29700W();
            }
        }

        /* renamed from: b */
        public synchronized void mo29714b() {
            if (!this.f25044a) {
                Boolean e = mo29716e();
                this.f25043a = e;
                if (e == null) {
                    e51 e51 = new e51(this);
                    this.f25042a = e51;
                    this.f25041a.mo40985a(nd0.class, e51);
                }
                this.f25044a = true;
            }
        }

        /* renamed from: c */
        public synchronized boolean mo29715c() {
            Boolean bool;
            mo29714b();
            bool = this.f25043a;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f25031a.mo46511A();
        }

        @ts2
        /* renamed from: e */
        public final Boolean mo29716e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context n = FirebaseMessaging.this.f25031a.mo46527n();
            SharedPreferences sharedPreferences = n.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains(f25039c)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(f25039c, false));
            }
            try {
                PackageManager packageManager = n.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(n.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(f25037a)) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean(f25037a));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: f */
        public synchronized void mo29717f(boolean z) {
            mo29714b();
            tv0<nd0> tv0 = this.f25042a;
            if (tv0 != null) {
                this.f25041a.mo40987d(nd0.class, tv0);
                this.f25042a = null;
            }
            SharedPreferences.Editor edit = FirebaseMessaging.this.f25031a.mo46527n().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean(f25039c, z);
            edit.apply();
            if (z) {
                FirebaseMessaging.this.mo29700W();
            }
            this.f25043a = Boolean.valueOf(z);
        }
    }

    public FirebaseMessaging(w31 w31, @ts2 r41 r41, b73<wp4> b73, b73<bl1> b732, o41 o41, @ts2 yh4 yh4, n64 n64) {
        this(w31, r41, b73, b732, o41, yh4, n64, new ji2(w31.mo46527n()));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FirebaseMessaging(com.onedelhi.secure.w31 r12, @com.onedelhi.secure.ts2 com.onedelhi.secure.r41 r13, com.onedelhi.secure.b73<com.onedelhi.secure.wp4> r14, com.onedelhi.secure.b73<com.onedelhi.secure.bl1> r15, com.onedelhi.secure.o41 r16, @com.onedelhi.secure.ts2 com.onedelhi.secure.yh4 r17, com.onedelhi.secure.n64 r18, com.onedelhi.secure.ji2 r19) {
        /*
            r11 = this;
            com.onedelhi.secure.nh1 r7 = new com.onedelhi.secure.nh1
            r0 = r7
            r1 = r12
            r2 = r19
            r3 = r14
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ExecutorService r8 = com.onedelhi.secure.k01.m53922h()
            java.util.concurrent.ScheduledExecutorService r9 = com.onedelhi.secure.k01.m53918d()
            java.util.concurrent.Executor r10 = com.onedelhi.secure.k01.m53917c()
            r0 = r11
            r2 = r13
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.<init>(com.onedelhi.secure.w31, com.onedelhi.secure.r41, com.onedelhi.secure.b73, com.onedelhi.secure.b73, com.onedelhi.secure.o41, com.onedelhi.secure.yh4, com.onedelhi.secure.n64, com.onedelhi.secure.ji2):void");
    }

    public FirebaseMessaging(w31 w31, @ts2 r41 r41, o41 o41, @ts2 yh4 yh4, n64 n64, ji2 ji2, nh1 nh1, Executor executor, Executor executor2, Executor executor3) {
        this.f25034a = false;
        f25014a = yh4;
        this.f25031a = w31;
        this.f25030a = r41;
        this.f25029a = o41;
        this.f25025a = new C4308a(n64);
        Context n = w31.mo46527n();
        this.f25024a = n;
        C4320d dVar = new C4320d();
        this.f25023a = dVar;
        this.f25027a = ji2;
        this.f25035b = executor;
        this.f25028a = nh1;
        this.f25026a = new C4328h(executor);
        this.f25033a = executor2;
        this.f25036c = executor3;
        Context n2 = w31.mo46527n();
        if (n2 instanceof Application) {
            ((Application) n2).registerActivityLifecycleCallbacks(dVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + n2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (r41 != null) {
            r41.mo43813b(new v41(this));
        }
        executor2.execute(new b51(this));
        w94<xf4> f = xf4.m70220f(this, ji2, nh1, n, k01.m53923i());
        this.f25032a = f;
        f.mo17580l(executor2, new w41(this));
        executor2.execute(new a51(this));
    }

    @ts2
    /* renamed from: A */
    public static yh4 m34656A() {
        return f25014a;
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ w94 m34657F(String str, C4330i.C4331a aVar) {
        return this.f25028a.mo41069f().mo17592x(this.f25036c, new x41(this, str, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ w94 m34658G(String str, C4330i.C4331a aVar, String str2) throws Exception {
        m34684v(this.f25024a).mo29827g(mo29710w(), str, str2, this.f25027a.mo38672a());
        if (aVar == null || !str2.equals(aVar.f25213a)) {
            m34662K(str2);
        }
        return ha4.m16572g(str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m34659H(x94 x94) {
        try {
            this.f25030a.mo43812a(ji2.m53387c(this.f25031a), f25021e);
            x94.mo26837c(null);
        } catch (Exception e) {
            x94.mo26836b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ void m34660I(x94 x94) {
        try {
            ha4.m16566a(this.f25028a.mo41066c());
            m34684v(this.f25024a).mo29824d(mo29710w(), ji2.m53387c(this.f25031a));
            x94.mo26837c(null);
        } catch (Exception e) {
            x94.mo26836b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m34661J(x94 x94) {
        try {
            x94.mo26837c(mo29705n());
        } catch (Exception e) {
            x94.mo26836b(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m34663L() {
        if (mo29691C()) {
            mo29700W();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m34664M(xf4 xf4) {
        if (mo29691C()) {
            xf4.mo47159r();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m34665N() {
        l73.m55314c(this.f25024a);
    }

    @mr2
    @Keep
    public static synchronized FirebaseMessaging getInstance(@mr2 w31 w31) {
        FirebaseMessaging firebaseMessaging;
        Class cls = FirebaseMessaging.class;
        synchronized (cls) {
            firebaseMessaging = (FirebaseMessaging) w31.mo46526l(cls);
            Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    @hw4
    /* renamed from: o */
    public static synchronized void m34681o() {
        synchronized (FirebaseMessaging.class) {
            f25013a = null;
        }
    }

    /* renamed from: p */
    public static void m34682p() {
        f25014a = null;
    }

    @mr2
    /* renamed from: u */
    public static synchronized FirebaseMessaging m34683u() {
        FirebaseMessaging instance;
        synchronized (FirebaseMessaging.class) {
            instance = getInstance(w31.m68755p());
        }
        return instance;
    }

    @mr2
    /* renamed from: v */
    public static synchronized C4330i m34684v(Context context) {
        C4330i iVar;
        synchronized (FirebaseMessaging.class) {
            if (f25013a == null) {
                f25013a = new C4330i(context);
            }
            iVar = f25013a;
        }
        return iVar;
    }

    /* renamed from: B */
    public final void m34662K(String str) {
        if (w31.f36872c.equals(this.f25031a.mo46528r())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f25031a.mo46528r());
            }
            Intent intent = new Intent(FirebaseMessagingService.f25048e);
            intent.putExtra("token", str);
            new j01(this.f25024a).mo38366i(intent);
        }
    }

    /* renamed from: C */
    public boolean mo29691C() {
        return this.f25025a.mo29715c();
    }

    @hw4
    /* renamed from: D */
    public boolean mo29692D() {
        return this.f25027a.mo38677g();
    }

    /* renamed from: E */
    public boolean mo29693E() {
        return l73.m55315d(this.f25024a);
    }

    /* renamed from: Q */
    public void mo29694Q(@mr2 C4323g gVar) {
        if (!TextUtils.isEmpty(gVar.mo29774W2())) {
            Intent intent = new Intent(f25019c);
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            intent.putExtra(f25020d, PendingIntent.getBroadcast(this.f25024a, 0, intent2, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
            intent.setPackage("com.google.android.gms");
            gVar.mo29776Y2(intent);
            this.f25024a.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }

    /* renamed from: R */
    public void mo29695R(boolean z) {
        this.f25025a.mo29717f(z);
    }

    /* renamed from: S */
    public void mo29696S(boolean z) {
        C4321e.m34756B(z);
    }

    @mr2
    /* renamed from: T */
    public w94<Void> mo29697T(boolean z) {
        return l73.m55317f(this.f25033a, this.f25024a, z);
    }

    /* renamed from: U */
    public synchronized void mo29698U(boolean z) {
        this.f25034a = z;
    }

    /* renamed from: V */
    public final synchronized void mo29699V() {
        if (!this.f25034a) {
            mo29702Y(0);
        }
    }

    /* renamed from: W */
    public final void mo29700W() {
        r41 r41 = this.f25030a;
        if (r41 != null) {
            r41.mo43815d();
        } else if (mo29703Z(mo29712y())) {
            mo29699V();
        }
    }

    @mr2
    @SuppressLint({"TaskMainThread"})
    /* renamed from: X */
    public w94<Void> mo29701X(@mr2 String str) {
        return this.f25032a.mo17591w(new z41(str));
    }

    /* renamed from: Y */
    public synchronized void mo29702Y(long j) {
        mo29708s(new o84(this, Math.min(Math.max(30, 2 * j), f25017b)), j);
        this.f25034a = true;
    }

    @hw4
    /* renamed from: Z */
    public boolean mo29703Z(@ts2 C4330i.C4331a aVar) {
        return aVar == null || aVar.mo29828b(this.f25027a.mo38672a());
    }

    @mr2
    @SuppressLint({"TaskMainThread"})
    /* renamed from: a0 */
    public w94<Void> mo29704a0(@mr2 String str) {
        return this.f25032a.mo17591w(new y41(str));
    }

    /* renamed from: n */
    public String mo29705n() throws IOException {
        r41 r41 = this.f25030a;
        if (r41 != null) {
            try {
                return (String) ha4.m16566a(r41.mo43814c());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        } else {
            C4330i.C4331a y = mo29712y();
            if (!mo29703Z(y)) {
                return y.f25213a;
            }
            String c = ji2.m53387c(this.f25031a);
            try {
                return (String) ha4.m16566a(this.f25026a.mo29819b(c, new t41(this, c, y)));
            } catch (InterruptedException | ExecutionException e2) {
                throw new IOException(e2);
            }
        }
    }

    @mr2
    /* renamed from: q */
    public w94<Void> mo29706q() {
        if (this.f25030a != null) {
            x94 x94 = new x94();
            this.f25033a.execute(new c51(this, x94));
            return x94.mo26835a();
        } else if (mo29712y() == null) {
            return ha4.m16572g(null);
        } else {
            x94 x942 = new x94();
            k01.m53920f().execute(new u41(this, x942));
            return x942.mo26835a();
        }
    }

    @mr2
    /* renamed from: r */
    public boolean mo29707r() {
        return C4321e.m34761a();
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: s */
    public void mo29708s(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            if (f25016a == null) {
                f25016a = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            f25016a.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* renamed from: t */
    public Context mo29709t() {
        return this.f25024a;
    }

    /* renamed from: w */
    public final String mo29710w() {
        return w31.f36872c.equals(this.f25031a.mo46528r()) ? "" : this.f25031a.mo46530t();
    }

    @mr2
    /* renamed from: x */
    public w94<String> mo29711x() {
        r41 r41 = this.f25030a;
        if (r41 != null) {
            return r41.mo43814c();
        }
        x94 x94 = new x94();
        this.f25033a.execute(new d51(this, x94));
        return x94.mo26835a();
    }

    @hw4
    @ts2
    /* renamed from: y */
    public C4330i.C4331a mo29712y() {
        return m34684v(this.f25024a).mo29825e(mo29710w(), ji2.m53387c(this.f25031a));
    }

    /* renamed from: z */
    public w94<xf4> mo29713z() {
        return this.f25032a;
    }
}
