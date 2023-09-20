package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.firebase.perf.config.C4336a;
import com.google.firebase.perf.session.SessionManager;
import com.onedelhi.secure.C5665i9;
import com.onedelhi.secure.C5978l9;
import com.onedelhi.secure.d13;
import com.onedelhi.secure.g60;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public class li4 implements C5665i9.C5667b {

    /* renamed from: a */
    public static final li4 f31670a = new li4();

    /* renamed from: a */
    public static final C7012v5 f31671a = C7012v5.m67717e();

    /* renamed from: d */
    public static final String f31672d = "KEY_AVAILABLE_TRACES_FOR_CACHING";

    /* renamed from: e */
    public static final String f31673e = "KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING";

    /* renamed from: f */
    public static final String f31674f = "KEY_AVAILABLE_GAUGES_FOR_CACHING";

    /* renamed from: n */
    public static final int f31675n = 0;

    /* renamed from: o */
    public static final int f31676o = 1;

    /* renamed from: p */
    public static final int f31677p = 50;

    /* renamed from: q */
    public static final int f31678q = 50;

    /* renamed from: r */
    public static final int f31679r = 50;

    /* renamed from: a */
    public Context f31680a;

    /* renamed from: a */
    public C4336a f31681a;

    /* renamed from: a */
    public b73<yh4> f31682a;

    /* renamed from: a */
    public ff3 f31683a;

    /* renamed from: a */
    public C5665i9 f31684a;

    /* renamed from: a */
    public C5978l9.C5980b f31685a;

    /* renamed from: a */
    public o41 f31686a;
    @ts2

    /* renamed from: a */
    public q51 f31687a;

    /* renamed from: a */
    public t71 f31688a;

    /* renamed from: a */
    public w31 f31689a;

    /* renamed from: a */
    public final Map<String, Integer> f31690a;

    /* renamed from: a */
    public final ConcurrentLinkedQueue<c13> f31691a = new ConcurrentLinkedQueue<>();

    /* renamed from: a */
    public ExecutorService f31692a = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: a */
    public final AtomicBoolean f31693a = new AtomicBoolean(false);

    /* renamed from: b */
    public String f31694b;

    /* renamed from: b */
    public boolean f31695b = false;

    /* renamed from: c */
    public String f31696c;

    @SuppressLint({"ThreadPoolCreation"})
    public li4() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f31690a = concurrentHashMap;
        concurrentHashMap.put(f31672d, 50);
        concurrentHashMap.put(f31673e, 50);
        concurrentHashMap.put(f31674f, 50);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m55627A(no2 no2, C6256o9 o9Var) {
        mo39876M(d13.m44437Gk().mo34105Vj(no2), o9Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m55628B(yd1 yd1, C6256o9 o9Var) {
        mo39876M(d13.m44437Gk().mo34103Tj(yd1), o9Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m55629C() {
        this.f31683a.mo35896a(this.f31695b);
    }

    /* renamed from: l */
    public static li4 m55636l() {
        return f31670a;
    }

    /* renamed from: m */
    public static String m55637m(yd1 yd1) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", new Object[]{Boolean.valueOf(yd1.mo47733P4()), Integer.valueOf(yd1.mo47747mc()), Integer.valueOf(yd1.mo47749ra())});
    }

    /* renamed from: n */
    public static String m55638n(no2 no2) {
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", new Object[]{no2.mo41374t0(), no2.mo41379yc() ? String.valueOf(no2.mo41373md()) : "UNKNOWN", new DecimalFormat("#.####").format(((double) (no2.mo41372lc() ? no2.mo41376x6() : 0)) / 1000.0d)});
    }

    /* renamed from: o */
    public static String m55639o(e13 e13) {
        return e13.mo34076bd() ? m55640p(e13.mo34077f5()) : e13.mo34082r5() ? m55638n(e13.mo34080ng()) : e13.mo34070R7() ? m55637m(e13.mo34078h8()) : "log";
    }

    /* renamed from: p */
    public static String m55640p(eg4 eg4) {
        long ci = eg4.mo35315ci();
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", new Object[]{eg4.getName(), new DecimalFormat("#.####").format(((double) ci) / 1000.0d)});
    }

    /* renamed from: r */
    public static String m55641r(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m55642y(c13 c13) {
        mo39876M(c13.f26612a, c13.f26613a);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m55643z(eg4 eg4, C6256o9 o9Var) {
        mo39876M(d13.m44437Gk().mo34107Xj(eg4), o9Var);
    }

    /* renamed from: D */
    public void mo39867D(yd1 yd1) {
        mo39868E(yd1, C6256o9.APPLICATION_PROCESS_STATE_UNKNOWN);
    }

    /* renamed from: E */
    public void mo39868E(yd1 yd1, C6256o9 o9Var) {
        this.f31692a.execute(new hi4(this, yd1, o9Var));
    }

    /* renamed from: F */
    public void mo39869F(no2 no2) {
        mo39870G(no2, C6256o9.APPLICATION_PROCESS_STATE_UNKNOWN);
    }

    /* renamed from: G */
    public void mo39870G(no2 no2, C6256o9 o9Var) {
        this.f31692a.execute(new ii4(this, no2, o9Var));
    }

    /* renamed from: H */
    public void mo39871H(eg4 eg4) {
        mo39872I(eg4, C6256o9.APPLICATION_PROCESS_STATE_UNKNOWN);
    }

    /* renamed from: I */
    public void mo39872I(eg4 eg4, C6256o9 o9Var) {
        this.f31692a.execute(new ki4(this, eg4, o9Var));
    }

    /* renamed from: J */
    public final d13 mo39873J(d13.C4947b bVar, C6256o9 o9Var) {
        mo39877N();
        C5978l9.C5980b Tj = this.f31685a.mo39759Tj(o9Var);
        if (bVar.mo34076bd() || bVar.mo34082r5()) {
            Tj = ((C5978l9.C5980b) Tj.mo43383ej()).mo39752Mj(mo39883k());
        }
        return (d13) bVar.mo34100Qj(Tj).mo43381ab();
    }

    @hw4
    /* renamed from: K */
    public void mo39874K(boolean z) {
        this.f31693a.set(z);
    }

    @ly4
    /* renamed from: L */
    public final void mo39875L() {
        Context n = this.f31689a.mo46527n();
        this.f31680a = n;
        this.f31694b = n.getPackageName();
        this.f31681a = C4336a.m34908h();
        this.f31683a = new ff3(this.f31680a, new ef3(100, 1, TimeUnit.MINUTES), 500);
        this.f31684a = C5665i9.m51864c();
        this.f31688a = new t71(this.f31682a, this.f31681a.mo29870b());
        mo39881i();
    }

    @ly4
    /* renamed from: M */
    public final void mo39876M(d13.C4947b bVar, C6256o9 o9Var) {
        if (mo39890x()) {
            d13 J = mo39873J(bVar, o9Var);
            if (mo39889w(J)) {
                mo39880h(J);
                SessionManager.getInstance().updatePerfSessionIfExpired();
            }
        } else if (mo39888v(bVar)) {
            f31671a.mo46001b("Transport is not initialized yet, %s will be queued for to be dispatched later", m55639o(bVar));
            this.f31691a.add(new c13(bVar, o9Var));
        }
    }

    @ly4
    /* renamed from: N */
    public final void mo39877N() {
        if (!this.f31681a.mo29861M()) {
            return;
        }
        if (!this.f31685a.mo39719L5() || this.f31695b) {
            String str = null;
            try {
                str = (String) ha4.m16567b(this.f31686a.mo40943d(), jg3.f30769e, TimeUnit.MILLISECONDS);
            } catch (ExecutionException e) {
                f31671a.mo46003d("Unable to retrieve Installation Id: %s", e.getMessage());
            } catch (InterruptedException e2) {
                f31671a.mo46003d("Task to retrieve Installation Id is interrupted: %s", e2.getMessage());
            } catch (TimeoutException e3) {
                f31671a.mo46003d("Task to retrieve Installation Id is timed out: %s", e3.getMessage());
            }
            if (!TextUtils.isEmpty(str)) {
                this.f31685a.mo39757Rj(str);
            } else {
                f31671a.mo46010l("Firebase Installation Id is empty, contact Firebase Support for debugging.");
            }
        }
    }

    /* renamed from: O */
    public final void mo39878O() {
        if (this.f31687a == null && mo39890x()) {
            this.f31687a = q51.m62123c();
        }
    }

    @hw4
    /* renamed from: g */
    public void mo39879g() {
        this.f31685a.mo39747Hj();
    }

    @ly4
    /* renamed from: h */
    public final void mo39880h(d13 d13) {
        if (d13.mo34076bd()) {
            f31671a.mo46005g("Logging %s. In a minute, visit the Firebase console to view your data: %s", m55639o(d13), mo39882j(d13.mo34077f5()));
        } else {
            f31671a.mo46005g("Logging %s", m55639o(d13));
        }
        this.f31688a.mo44933b(d13);
    }

    /* renamed from: i */
    public final void mo39881i() {
        this.f31684a.mo37889p(new WeakReference(f31670a));
        C5978l9.C5980b Bk = C5978l9.m55386Bk();
        this.f31685a = Bk;
        Bk.mo39760Uj(this.f31689a.mo46529s().mo37192j()).mo39755Pj(C6244o5.m58940tk().mo41540Jj(this.f31694b).mo41542Lj(C4898cp.f27022c).mo41544Nj(m55641r(this.f31680a)));
        this.f31693a.set(true);
        while (!this.f31691a.isEmpty()) {
            c13 poll = this.f31691a.poll();
            if (poll != null) {
                this.f31692a.execute(new ji4(this, poll));
            }
        }
    }

    /* renamed from: j */
    public final String mo39882j(eg4 eg4) {
        String name = eg4.getName();
        return name.startsWith(g60.f28962c) ? e60.m46047c(this.f31696c, this.f31694b, name) : e60.m46045a(this.f31696c, this.f31694b, name);
    }

    /* renamed from: k */
    public final Map<String, String> mo39883k() {
        mo39878O();
        q51 q51 = this.f31687a;
        return q51 != null ? q51.getAttributes() : Collections.emptyMap();
    }

    public void onUpdateAppState(C6256o9 o9Var) {
        this.f31695b = o9Var == C6256o9.FOREGROUND;
        if (mo39890x()) {
            this.f31692a.execute(new gi4(this));
        }
    }

    @hw4
    /* renamed from: q */
    public ConcurrentLinkedQueue<c13> mo39884q() {
        return new ConcurrentLinkedQueue<>(this.f31691a);
    }

    /* renamed from: s */
    public final void mo39885s(d13 d13) {
        C5665i9 i9Var;
        g60.C5362a aVar;
        if (d13.mo34076bd()) {
            i9Var = this.f31684a;
            aVar = g60.C5362a.TRACE_EVENT_RATE_LIMITED;
        } else if (d13.mo34082r5()) {
            i9Var = this.f31684a;
            aVar = g60.C5362a.NETWORK_TRACE_EVENT_RATE_LIMITED;
        } else {
            return;
        }
        i9Var.mo37875h(aVar.toString(), 1);
    }

    /* renamed from: t */
    public void mo39886t(@mr2 w31 w31, @mr2 o41 o41, @mr2 b73<yh4> b73) {
        this.f31689a = w31;
        this.f31696c = w31.mo46529s().mo37196n();
        this.f31686a = o41;
        this.f31682a = b73;
        this.f31692a.execute(new fi4(this));
    }

    @hw4(otherwise = 5)
    /* renamed from: u */
    public void mo39887u(w31 w31, q51 q51, o41 o41, b73<yh4> b73, C4336a aVar, ff3 ff3, C5665i9 i9Var, t71 t71, ExecutorService executorService) {
        this.f31689a = w31;
        this.f31696c = w31.mo46529s().mo37196n();
        this.f31680a = w31.mo46527n();
        this.f31687a = q51;
        this.f31686a = o41;
        this.f31682a = b73;
        this.f31681a = aVar;
        this.f31683a = ff3;
        this.f31684a = i9Var;
        this.f31688a = t71;
        this.f31692a = executorService;
        this.f31690a.put(f31672d, 50);
        this.f31690a.put(f31673e, 50);
        this.f31690a.put(f31674f, 50);
        mo39881i();
    }

    @ly4
    /* renamed from: v */
    public final boolean mo39888v(e13 e13) {
        int intValue = this.f31690a.get(f31672d).intValue();
        int intValue2 = this.f31690a.get(f31673e).intValue();
        int intValue3 = this.f31690a.get(f31674f).intValue();
        if (e13.mo34076bd() && intValue > 0) {
            this.f31690a.put(f31672d, Integer.valueOf(intValue - 1));
            return true;
        } else if (e13.mo34082r5() && intValue2 > 0) {
            this.f31690a.put(f31673e, Integer.valueOf(intValue2 - 1));
            return true;
        } else if (!e13.mo34070R7() || intValue3 <= 0) {
            f31671a.mo46001b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", m55639o(e13), Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(intValue3));
            return false;
        } else {
            this.f31690a.put(f31674f, Integer.valueOf(intValue3 - 1));
            return true;
        }
    }

    @ly4
    /* renamed from: w */
    public final boolean mo39889w(d13 d13) {
        if (!this.f31681a.mo29861M()) {
            f31671a.mo46005g("Performance collection is not enabled, dropping %s", m55639o(d13));
            return false;
        } else if (!d13.mo34086xb().mo39719L5()) {
            f31671a.mo46011m("App Instance ID is null or empty, dropping %s", m55639o(d13));
            return false;
        } else if (!f13.m47448b(d13, this.f31680a)) {
            f31671a.mo46011m("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", m55639o(d13));
            return false;
        } else if (!this.f31683a.mo35905k(d13)) {
            mo39885s(d13);
            f31671a.mo46005g("Event dropped due to device sampling - %s", m55639o(d13));
            return false;
        } else if (!this.f31683a.mo35904j(d13)) {
            return true;
        } else {
            mo39885s(d13);
            f31671a.mo46005g("Rate limited (per device) - %s", m55639o(d13));
            return false;
        }
    }

    /* renamed from: x */
    public boolean mo39890x() {
        return this.f31693a.get();
    }
}
