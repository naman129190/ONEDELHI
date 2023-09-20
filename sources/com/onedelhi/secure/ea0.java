package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import androidx.appcompat.widget.C0358b;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onedelhi.secure.fb0;
import com.onedelhi.secure.p34;
import com.onedelhi.secure.pa0;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public class ea0 {

    /* renamed from: a */
    public static final int f27756a = 1;

    /* renamed from: a */
    public static final FilenameFilter f27757a = da0.f27355a;

    /* renamed from: a */
    public static final String f27758a = "fatal";

    /* renamed from: b */
    public static final String f27759b = "timestamp";

    /* renamed from: c */
    public static final String f27760c = "_ae";

    /* renamed from: d */
    public static final String f27761d = ".ae";

    /* renamed from: e */
    public static final String f27762e = "native-sessions";

    /* renamed from: f */
    public static final String f27763f = "Crashlytics Android SDK/%s";

    /* renamed from: a */
    public final Context f27764a;

    /* renamed from: a */
    public final b92 f27765a;

    /* renamed from: a */
    public final bq4 f27766a;

    /* renamed from: a */
    public final ca0 f27767a;

    /* renamed from: a */
    public fb0 f27768a;

    /* renamed from: a */
    public final C5479h5 f27769a;

    /* renamed from: a */
    public final ha0 f27770a;

    /* renamed from: a */
    public final ja0 f27771a;

    /* renamed from: a */
    public final ld0 f27772a;

    /* renamed from: a */
    public final lo1 f27773a;

    /* renamed from: a */
    public mw3 f27774a = null;

    /* renamed from: a */
    public final t21 f27775a;

    /* renamed from: a */
    public final C7225x8 f27776a;

    /* renamed from: a */
    public final x94<Boolean> f27777a = new x94<>();

    /* renamed from: a */
    public final yu3 f27778a;

    /* renamed from: a */
    public final AtomicBoolean f27779a = new AtomicBoolean(false);

    /* renamed from: b */
    public final x94<Boolean> f27780b = new x94<>();

    /* renamed from: c */
    public final x94<Void> f27781c = new x94<>();

    /* renamed from: com.onedelhi.secure.ea0$a */
    public class C5099a implements fb0.C5236a {
        public C5099a() {
        }

        /* renamed from: a */
        public void mo34945a(@mr2 mw3 mw3, @mr2 Thread thread, @mr2 Throwable th) {
            ea0.this.mo34919J(mw3, thread, th);
        }
    }

    /* renamed from: com.onedelhi.secure.ea0$b */
    public class C5100b implements Callable<w94<Void>> {

        /* renamed from: a */
        public final /* synthetic */ long f27783a;

        /* renamed from: a */
        public final /* synthetic */ mw3 f27785a;

        /* renamed from: a */
        public final /* synthetic */ Thread f27786a;

        /* renamed from: a */
        public final /* synthetic */ Throwable f27787a;

        /* renamed from: a */
        public final /* synthetic */ boolean f27788a;

        /* renamed from: com.onedelhi.secure.ea0$b$a */
        public class C5101a implements r64<jv3, Void> {

            /* renamed from: a */
            public final /* synthetic */ String f27790a;

            /* renamed from: a */
            public final /* synthetic */ Executor f27791a;

            public C5101a(Executor executor, String str) {
                this.f27791a = executor;
                this.f27790a = str;
            }

            @mr2
            /* renamed from: a */
            public w94<Void> then(@ts2 jv3 jv3) throws Exception {
                String str = null;
                if (jv3 == null) {
                    o92.m59120f().mo41623m("Received null app settings, cannot send reports at crash time.");
                    return ha4.m16572g(null);
                }
                w94[] w94Arr = new w94[2];
                w94Arr[0] = ea0.this.mo34924P();
                yu3 h = ea0.this.f27778a;
                Executor executor = this.f27791a;
                if (C5100b.this.f27788a) {
                    str = this.f27790a;
                }
                w94Arr[1] = h.mo48008z(executor, str);
                return ha4.m16574i(w94Arr);
            }
        }

        public C5100b(long j, Throwable th, Thread thread, mw3 mw3, boolean z) {
            this.f27783a = j;
            this.f27787a = th;
            this.f27786a = thread;
            this.f27785a = mw3;
            this.f27788a = z;
        }

        /* renamed from: a */
        public w94<Void> call() throws Exception {
            long b = ea0.m46127H(this.f27783a);
            String c = ea0.this.mo34917E();
            if (c == null) {
                o92.m59120f().mo41615d("Tried to write a fatal exception while no session was open.");
                return ha4.m16572g(null);
            }
            ea0.this.f27770a.mo37227a();
            ea0.this.f27778a.mo48003u(this.f27787a, this.f27786a, c, b);
            ea0.this.mo34943y(this.f27783a);
            ea0.this.mo34940v(this.f27785a);
            ea0.this.mo34942x(new C7177wr(ea0.this.f27773a).toString());
            if (!ea0.this.f27772a.mo39785d()) {
                return ha4.m16572g(null);
            }
            Executor c2 = ea0.this.f27767a.mo32269c();
            return this.f27785a.mo40841b().mo17592x(c2, new C5101a(c2, c));
        }
    }

    /* renamed from: com.onedelhi.secure.ea0$c */
    public class C5102c implements r64<Void, Boolean> {
        public C5102c() {
        }

        @mr2
        /* renamed from: a */
        public w94<Boolean> then(@ts2 Void voidR) throws Exception {
            return ha4.m16572g(Boolean.TRUE);
        }
    }

    /* renamed from: com.onedelhi.secure.ea0$d */
    public class C5103d implements r64<Boolean, Void> {

        /* renamed from: a */
        public final /* synthetic */ w94 f27794a;

        /* renamed from: com.onedelhi.secure.ea0$d$a */
        public class C5104a implements Callable<w94<Void>> {

            /* renamed from: a */
            public final /* synthetic */ Boolean f27796a;

            /* renamed from: com.onedelhi.secure.ea0$d$a$a */
            public class C5105a implements r64<jv3, Void> {

                /* renamed from: a */
                public final /* synthetic */ Executor f27798a;

                public C5105a(Executor executor) {
                    this.f27798a = executor;
                }

                @mr2
                /* renamed from: a */
                public w94<Void> then(@ts2 jv3 jv3) throws Exception {
                    if (jv3 == null) {
                        o92.m59120f().mo41623m("Received null app settings at app startup. Cannot send cached reports");
                    } else {
                        w94 unused = ea0.this.mo34924P();
                        ea0.this.f27778a.mo48007y(this.f27798a);
                        ea0.this.f27781c.mo26839e(null);
                    }
                    return ha4.m16572g(null);
                }
            }

            public C5104a(Boolean bool) {
                this.f27796a = bool;
            }

            /* renamed from: a */
            public w94<Void> call() throws Exception {
                if (!this.f27796a.booleanValue()) {
                    o92.m59120f().mo41621k("Deleting cached crash reports...");
                    ea0.m46148s(ea0.this.mo34922N());
                    ea0.this.f27778a.mo48006x();
                    ea0.this.f27781c.mo26839e(null);
                    return ha4.m16572g(null);
                }
                o92.m59120f().mo41613b("Sending cached crash reports...");
                ea0.this.f27772a.mo39784c(this.f27796a.booleanValue());
                Executor c = ea0.this.f27767a.mo32269c();
                return C5103d.this.f27794a.mo17592x(c, new C5105a(c));
            }
        }

        public C5103d(w94 w94) {
            this.f27794a = w94;
        }

        @mr2
        /* renamed from: a */
        public w94<Void> then(@ts2 Boolean bool) throws Exception {
            return ea0.this.f27767a.mo32275i(new C5104a(bool));
        }
    }

    /* renamed from: com.onedelhi.secure.ea0$e */
    public class C5106e implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ long f27799a;

        /* renamed from: a */
        public final /* synthetic */ String f27801a;

        public C5106e(long j, String str) {
            this.f27799a = j;
            this.f27801a = str;
        }

        /* renamed from: a */
        public Void call() throws Exception {
            if (ea0.this.mo34921L()) {
                return null;
            }
            ea0.this.f27765a.mo31464g(this.f27799a, this.f27801a);
            return null;
        }
    }

    /* renamed from: com.onedelhi.secure.ea0$f */
    public class C5107f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Thread f27803a;

        /* renamed from: a */
        public final /* synthetic */ Throwable f27804a;

        /* renamed from: b */
        public final /* synthetic */ long f27805b;

        public C5107f(long j, Throwable th, Thread thread) {
            this.f27805b = j;
            this.f27804a = th;
            this.f27803a = thread;
        }

        public void run() {
            if (!ea0.this.mo34921L()) {
                long b = ea0.m46127H(this.f27805b);
                String c = ea0.this.mo34917E();
                if (c == null) {
                    o92.m59120f().mo41623m("Tried to write a non-fatal exception while no session was open.");
                } else {
                    ea0.this.f27778a.mo48004v(this.f27804a, this.f27803a, c, b);
                }
            }
        }
    }

    /* renamed from: com.onedelhi.secure.ea0$g */
    public class C5108g implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ String f27807a;

        public C5108g(String str) {
            this.f27807a = str;
        }

        /* renamed from: a */
        public Void call() throws Exception {
            ea0.this.mo34942x(this.f27807a);
            return null;
        }
    }

    /* renamed from: com.onedelhi.secure.ea0$h */
    public class C5109h implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ long f27808a;

        public C5109h(long j) {
            this.f27808a = j;
        }

        /* renamed from: a */
        public Void call() throws Exception {
            Bundle bundle = new Bundle();
            bundle.putInt(ea0.f27758a, 1);
            bundle.putLong("timestamp", this.f27808a);
            ea0.this.f27769a.mo34224a("_ae", bundle);
            return null;
        }
    }

    public ea0(Context context, ca0 ca0, lo1 lo1, ld0 ld0, t21 t21, ha0 ha0, C7225x8 x8Var, bq4 bq4, b92 b92, yu3 yu3, ja0 ja0, C5479h5 h5Var) {
        this.f27764a = context;
        this.f27767a = ca0;
        this.f27773a = lo1;
        this.f27772a = ld0;
        this.f27775a = t21;
        this.f27770a = ha0;
        this.f27776a = x8Var;
        this.f27766a = bq4;
        this.f27765a = b92;
        this.f27771a = ja0;
        this.f27769a = h5Var;
        this.f27778a = yu3;
    }

    /* renamed from: C */
    public static boolean m46124C() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: F */
    public static long m46125F() {
        return m46127H(System.currentTimeMillis());
    }

    @mr2
    /* renamed from: G */
    public static List<gn2> m46126G(in2 in2, String str, t21 t21, byte[] bArr) {
        File p = t21.mo44770p(str, bq4.f26503b);
        File p2 = t21.mo44770p(str, "keys");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C5740ir("logs_file", "logs", bArr));
        arrayList.add(new i21("crash_meta_file", "metadata", in2.mo38165b()));
        arrayList.add(new i21("session_meta_file", jw3.f30975b, in2.mo38167d()));
        arrayList.add(new i21("app_meta_file", FirebaseMessaging.f25020d, in2.mo38164a()));
        arrayList.add(new i21("device_meta_file", C2889mv.f16368m, in2.mo38168e()));
        arrayList.add(new i21("os_meta_file", "os", in2.mo38166c()));
        arrayList.add(m46130S(in2));
        arrayList.add(new i21("user_meta_file", "user", p));
        arrayList.add(new i21("keys_file", "keys", p2));
        return arrayList;
    }

    /* renamed from: H */
    public static long m46127H(long j) {
        return j / 1000;
    }

    /* renamed from: R */
    public static boolean m46129R(String str, File file, pa0.C6371a aVar) {
        if (file == null || !file.exists()) {
            o92 f = o92.m59120f();
            f.mo41623m("No minidump data found for session " + str);
        }
        if (aVar == null) {
            o92 f2 = o92.m59120f();
            f2.mo41617g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    /* renamed from: S */
    public static gn2 m46130S(in2 in2) {
        File f = in2.mo38169f();
        if (f != null && f.exists()) {
            return new i21("minidump_file", "minidump", f);
        }
        return new C5740ir("minidump_file", "minidump", new byte[]{0});
    }

    /* renamed from: p */
    public static p34.C6361a m46145p(lo1 lo1, C7225x8 x8Var) {
        return p34.C6361a.m60410b(lo1.mo40146f(), x8Var.f37367e, x8Var.f37368f, lo1.mo38197a(), fj0.m47925a(x8Var.f37365c).mo35993b(), x8Var.f37361a);
    }

    /* renamed from: q */
    public static p34.C6362b m46146q() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return p34.C6362b.m60417c(u10.m66366m(), Build.MODEL, Runtime.getRuntime().availableProcessors(), u10.m66375v(), ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()), u10.m66347B(), u10.m66367n(), Build.MANUFACTURER, Build.PRODUCT);
    }

    /* renamed from: r */
    public static p34.C6363c m46147r() {
        return p34.C6363c.m60427a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, u10.m66349D());
    }

    /* renamed from: s */
    public static void m46148s(List<File> list) {
        for (File delete : list) {
            delete.delete();
        }
    }

    /* renamed from: A */
    public final void mo34914A(String str) {
        o92 f = o92.m59120f();
        f.mo41621k("Finalizing native report for session " + str);
        in2 a = this.f27771a.mo38511a(str);
        File f2 = a.mo38169f();
        pa0.C6371a g = a.mo38170g();
        if (m46129R(str, f2, g)) {
            o92.m59120f().mo41623m("No native core present");
            return;
        }
        long lastModified = f2.lastModified();
        b92 b92 = new b92(this.f27775a, str);
        File j = this.f27775a.mo44764j(str);
        if (!j.isDirectory()) {
            o92.m59120f().mo41623m("Couldn't create directory to store native session files, aborting.");
            return;
        }
        mo34943y(lastModified);
        List<gn2> G = m46126G(a, str, this.f27775a, b92.mo31459b());
        hn2.m50681b(j, G);
        o92.m59120f().mo41613b("CrashlyticsController#finalizePreviousNativeSession");
        this.f27778a.mo47996l(str, G, g);
        b92.mo31458a();
    }

    /* renamed from: B */
    public boolean mo34915B(mw3 mw3) {
        this.f27767a.mo32268b();
        if (mo34921L()) {
            o92.m59120f().mo41623m("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        o92.m59120f().mo41621k("Finalizing previously open sessions.");
        try {
            mo34941w(true, mw3);
            o92.m59120f().mo41621k("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            o92.m59120f().mo41616e("Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    /* renamed from: D */
    public final Context mo34916D() {
        return this.f27764a;
    }

    @ts2
    /* renamed from: E */
    public final String mo34917E() {
        SortedSet<String> r = this.f27778a.mo48000r();
        if (!r.isEmpty()) {
            return r.first();
        }
        return null;
    }

    /* renamed from: I */
    public bq4 mo34918I() {
        return this.f27766a;
    }

    /* renamed from: J */
    public void mo34919J(@mr2 mw3 mw3, @mr2 Thread thread, @mr2 Throwable th) {
        mo34920K(mw3, thread, th, false);
    }

    /* renamed from: K */
    public synchronized void mo34920K(@mr2 mw3 mw3, @mr2 Thread thread, @mr2 Throwable th, boolean z) {
        o92 f = o92.m59120f();
        f.mo41613b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            zq4.m74242f(this.f27767a.mo32275i(new C5100b(System.currentTimeMillis(), th, thread, mw3, z)));
        } catch (TimeoutException unused) {
            o92.m59120f().mo41615d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e) {
            o92.m59120f().mo41616e("Error handling uncaught exception", e);
        }
    }

    /* renamed from: L */
    public boolean mo34921L() {
        fb0 fb0 = this.f27768a;
        return fb0 != null && fb0.mo35839a();
    }

    /* renamed from: N */
    public List<File> mo34922N() {
        return this.f27775a.mo44761g(f27757a);
    }

    /* renamed from: O */
    public final w94<Void> mo34923O(long j) {
        if (m46124C()) {
            o92.m59120f().mo41623m("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return ha4.m16572g(null);
        }
        o92.m59120f().mo41613b("Logging app exception event to Firebase Analytics");
        return ha4.m16569d(new ScheduledThreadPoolExecutor(1), new C5109h(j));
    }

    /* renamed from: P */
    public final w94<Void> mo34924P() {
        ArrayList arrayList = new ArrayList();
        for (File next : mo34922N()) {
            try {
                arrayList.add(mo34923O(Long.parseLong(next.getName().substring(3))));
            } catch (NumberFormatException unused) {
                o92 f = o92.m59120f();
                f.mo41623m("Could not parse app exception timestamp from file " + next.getName());
            }
            next.delete();
        }
        return ha4.m16573h(arrayList);
    }

    /* renamed from: Q */
    public void mo34925Q(Thread thread, Throwable th) {
        mw3 mw3 = this.f27774a;
        if (mw3 == null) {
            o92.m59120f().mo41623m("settingsProvider not set");
        } else {
            mo34920K(mw3, thread, th, true);
        }
    }

    /* renamed from: T */
    public void mo34926T(String str) {
        this.f27767a.mo32274h(new C5108g(str));
    }

    /* renamed from: U */
    public w94<Void> mo34927U() {
        this.f27780b.mo26839e(Boolean.TRUE);
        return this.f27781c.mo26835a();
    }

    /* renamed from: V */
    public void mo34928V(String str, String str2) {
        try {
            this.f27766a.mo32005l(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.f27764a;
            if (context == null || !u10.m66379z(context)) {
                o92.m59120f().mo41615d("Attempting to set custom attribute with null key, ignoring.");
                return;
            }
            throw e;
        }
    }

    /* renamed from: W */
    public void mo34929W(Map<String, String> map) {
        this.f27766a.mo32006m(map);
    }

    /* renamed from: X */
    public void mo34930X(String str, String str2) {
        try {
            this.f27766a.mo32007n(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.f27764a;
            if (context == null || !u10.m66379z(context)) {
                o92.m59120f().mo41615d("Attempting to set custom attribute with null key, ignoring.");
                return;
            }
            throw e;
        }
    }

    /* renamed from: Y */
    public void mo34931Y(String str) {
        this.f27766a.mo32008o(str);
    }

    @SuppressLint({"TaskMainThread"})
    /* renamed from: Z */
    public w94<Void> mo34932Z(w94<jv3> w94) {
        if (!this.f27778a.mo47999p()) {
            o92.m59120f().mo41621k("No crash reports are available to be sent.");
            this.f27777a.mo26839e(Boolean.FALSE);
            return ha4.m16572g(null);
        }
        o92.m59120f().mo41621k("Crash reports are available to be sent.");
        return mo34933a0().mo17591w(new C5103d(w94));
    }

    /* renamed from: a0 */
    public final w94<Boolean> mo34933a0() {
        if (this.f27772a.mo39785d()) {
            o92.m59120f().mo41613b("Automatic data collection is enabled. Allowing upload.");
            this.f27777a.mo26839e(Boolean.FALSE);
            return ha4.m16572g(Boolean.TRUE);
        }
        o92.m59120f().mo41613b("Automatic data collection is disabled.");
        o92.m59120f().mo41621k("Notifying that unsent reports are available.");
        this.f27777a.mo26839e(Boolean.TRUE);
        w94<TContinuationResult> w = this.f27772a.mo39788i().mo17591w(new C5102c());
        o92.m59120f().mo41613b("Waiting for send/deleteUnsentReports to be called.");
        return zq4.m74250n(w, this.f27780b.mo26835a());
    }

    /* renamed from: b0 */
    public final void mo34934b0(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            List historicalProcessExitReasons = ((ActivityManager) this.f27764a.getSystemService(C0358b.f1779e)).getHistoricalProcessExitReasons((String) null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                this.f27778a.mo48005w(str, historicalProcessExitReasons, new b92(this.f27775a, str), bq4.m40299i(str, this.f27775a, this.f27767a));
                return;
            }
            o92 f = o92.m59120f();
            f.mo41621k("No ApplicationExitInfo available. Session: " + str);
            return;
        }
        o92 f2 = o92.m59120f();
        f2.mo41621k("ANR feature enabled, but device is API " + i);
    }

    /* renamed from: c0 */
    public void mo34935c0(@mr2 Thread thread, @mr2 Throwable th) {
        this.f27767a.mo32273g(new C5107f(System.currentTimeMillis(), th, thread));
    }

    /* renamed from: d0 */
    public void mo34936d0(long j, String str) {
        this.f27767a.mo32274h(new C5106e(j, str));
    }

    @mr2
    /* renamed from: o */
    public w94<Boolean> mo34937o() {
        if (this.f27779a.compareAndSet(false, true)) {
            return this.f27777a.mo26835a();
        }
        o92.m59120f().mo41623m("checkForUnsentReports should only be called once per execution.");
        return ha4.m16572g(Boolean.FALSE);
    }

    /* renamed from: t */
    public w94<Void> mo34938t() {
        this.f27780b.mo26839e(Boolean.FALSE);
        return this.f27781c.mo26835a();
    }

    /* renamed from: u */
    public boolean mo34939u() {
        if (!this.f27770a.mo37229c()) {
            String E = mo34917E();
            return E != null && this.f27771a.mo38513c(E);
        }
        o92.m59120f().mo41621k("Found previous crash marker.");
        this.f27770a.mo37230d();
        return true;
    }

    /* renamed from: v */
    public void mo34940v(mw3 mw3) {
        mo34941w(false, mw3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34941w(boolean r4, com.onedelhi.secure.mw3 r5) {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            com.onedelhi.secure.yu3 r1 = r3.f27778a
            java.util.SortedSet r1 = r1.mo48000r()
            r0.<init>(r1)
            int r1 = r0.size()
            if (r1 > r4) goto L_0x001b
            com.onedelhi.secure.o92 r4 = com.onedelhi.secure.o92.m59120f()
            java.lang.String r5 = "No open sessions to be closed."
            r4.mo41621k(r5)
            return
        L_0x001b:
            java.lang.Object r1 = r0.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            com.onedelhi.secure.jv3 r5 = r5.mo40840a()
            com.onedelhi.secure.jv3$a r5 = r5.f30953a
            boolean r5 = r5.f30959b
            if (r5 == 0) goto L_0x002f
            r3.mo34934b0(r1)
            goto L_0x0038
        L_0x002f:
            com.onedelhi.secure.o92 r5 = com.onedelhi.secure.o92.m59120f()
            java.lang.String r2 = "ANR feature disabled."
            r5.mo41621k(r2)
        L_0x0038:
            com.onedelhi.secure.ja0 r5 = r3.f27771a
            boolean r5 = r5.mo38513c(r1)
            if (r5 == 0) goto L_0x0043
            r3.mo34914A(r1)
        L_0x0043:
            r5 = 0
            if (r4 == 0) goto L_0x004e
            r4 = 0
            java.lang.Object r4 = r0.get(r4)
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
        L_0x004e:
            com.onedelhi.secure.yu3 r4 = r3.f27778a
            long r0 = m46125F()
            r4.mo47997m(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ea0.mo34941w(boolean, com.onedelhi.secure.mw3):void");
    }

    /* renamed from: x */
    public final void mo34942x(String str) {
        long F = m46125F();
        o92 f = o92.m59120f();
        f.mo41613b("Opening a new session with ID " + str);
        String format = String.format(Locale.US, f27763f, new Object[]{ga0.m49193m()});
        p34.C6361a p = m46145p(this.f27773a, this.f27776a);
        p34.C6363c r = m46147r();
        p34.C6362b q = m46146q();
        this.f27771a.mo38512b(str, format, F, p34.m60406b(p, r, q));
        this.f27765a.mo31462e(str);
        this.f27778a.mo37921a(str, F);
    }

    /* renamed from: y */
    public final void mo34943y(long j) {
        try {
            t21 t21 = this.f27775a;
            if (!t21.mo44760f(f27761d + j).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e) {
            o92.m59120f().mo41624n("Could not create app exception marker file.", e);
        }
    }

    /* renamed from: z */
    public void mo34944z(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, mw3 mw3) {
        this.f27774a = mw3;
        mo34926T(str);
        fb0 fb0 = new fb0(new C5099a(), mw3, uncaughtExceptionHandler, this.f27771a);
        this.f27768a = fb0;
        Thread.setDefaultUncaughtExceptionHandler(fb0);
    }
}
