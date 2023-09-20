package com.onedelhi.secure;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.messaging.C4311b;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;

public final class za6 implements kd6 {

    /* renamed from: a */
    public static volatile za6 f23526a;

    /* renamed from: a */
    public int f23527a;

    /* renamed from: a */
    public long f23528a;

    /* renamed from: a */
    public final Context f23529a;

    /* renamed from: a */
    public final Clock f23530a;

    /* renamed from: a */
    public final a56 f23531a;

    /* renamed from: a */
    public bi5 f23532a;

    /* renamed from: a */
    public final ce5 f23533a;

    /* renamed from: a */
    public f46 f23534a;

    /* renamed from: a */
    public final gr6 f23535a;

    /* renamed from: a */
    public final jx5 f23536a;

    /* renamed from: a */
    public final l46 f23537a;

    /* renamed from: a */
    public final no6 f23538a;

    /* renamed from: a */
    public om6 f23539a;

    /* renamed from: a */
    public final q76 f23540a;

    /* renamed from: a */
    public final qa6 f23541a;

    /* renamed from: a */
    public final rb5 f23542a;

    /* renamed from: a */
    public final ri6 f23543a;

    /* renamed from: a */
    public final vj6 f23544a;

    /* renamed from: a */
    public z36 f23545a;

    /* renamed from: a */
    public final zi6 f23546a;

    /* renamed from: a */
    public Boolean f23547a;

    /* renamed from: a */
    public final String f23548a;

    /* renamed from: a */
    public final AtomicInteger f23549a = new AtomicInteger(0);

    /* renamed from: a */
    public final boolean f23550a;
    @VisibleForTesting

    /* renamed from: b */
    public final long f23551b;

    /* renamed from: b */
    public volatile Boolean f23552b;

    /* renamed from: b */
    public final String f23553b;

    /* renamed from: b */
    public boolean f23554b = false;
    @VisibleForTesting

    /* renamed from: c */
    public Boolean f23555c;

    /* renamed from: c */
    public final String f23556c;

    /* renamed from: c */
    public volatile boolean f23557c;
    @VisibleForTesting

    /* renamed from: d */
    public Boolean f23558d;

    /* renamed from: d */
    public final String f23559d;

    public za6(df6 df6) {
        String str;
        u46 u46;
        Bundle bundle;
        boolean z = false;
        Preconditions.checkNotNull(df6);
        Context context = df6.f10727a;
        rb5 rb5 = new rb5(context);
        this.f23542a = rb5;
        e36.f11108a = rb5;
        this.f23529a = context;
        this.f23548a = df6.f10731a;
        this.f23553b = df6.f10733b;
        this.f23556c = df6.f10734c;
        this.f23550a = df6.f10732a;
        this.f23552b = df6.f10729a;
        this.f23559d = df6.f10735d;
        this.f23557c = true;
        nu5 nu5 = df6.f10728a;
        if (!(nu5 == null || (bundle = nu5.f17599a) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f23555c = (Boolean) obj;
            }
            Object obj2 = nu5.f17599a.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f23558d = (Boolean) obj2;
            }
        }
        ei6.m13801d(context);
        Clock instance = DefaultClock.getInstance();
        this.f23530a = instance;
        Long l = df6.f10730a;
        this.f23551b = l != null ? l.longValue() : instance.currentTimeMillis();
        this.f23533a = new ce5(this);
        q76 q76 = new q76(this);
        q76.mo17202l();
        this.f23540a = q76;
        a56 a56 = new a56(this);
        a56.mo17202l();
        this.f23531a = a56;
        gr6 gr6 = new gr6(this);
        gr6.mo17202l();
        this.f23535a = gr6;
        this.f23537a = new l46(new af6(df6, this));
        this.f23536a = new jx5(this);
        vj6 vj6 = new vj6(this);
        vj6.mo15846j();
        this.f23544a = vj6;
        ri6 ri6 = new ri6(this);
        ri6.mo15846j();
        this.f23543a = ri6;
        no6 no6 = new no6(this);
        no6.mo15846j();
        this.f23538a = no6;
        zi6 zi6 = new zi6(this);
        zi6.mo17202l();
        this.f23546a = zi6;
        qa6 qa6 = new qa6(this);
        qa6.mo17202l();
        this.f23541a = qa6;
        nu5 nu52 = df6.f10728a;
        z = (nu52 == null || nu52.f17603c == 0) ? true : z;
        if (context.getApplicationContext() instanceof Application) {
            ri6 I = mo27866I();
            if (I.f11205a.f23529a.getApplicationContext() instanceof Application) {
                Application application = (Application) I.f11205a.f23529a.getApplicationContext();
                if (I.f19888a == null) {
                    I.f19888a = new pi6(I);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(I.f19888a);
                    application.registerActivityLifecycleCallbacks(I.f19888a);
                    u46 = I.f11205a.mo15136e().mo12730v();
                    str = "Registered activity lifecycle callback";
                }
            }
            qa6.mo23065z(new wa6(this, df6));
        }
        u46 = mo15136e().mo12731w();
        str = "Application context is not an Application";
        u46.mo25379a(str);
        qa6.mo23065z(new wa6(this, df6));
    }

    /* renamed from: H */
    public static za6 m32969H(Context context, nu5 nu5, Long l) {
        Bundle bundle;
        if (nu5 != null && (nu5.f17604c == null || nu5.f17605d == null)) {
            nu5 = new nu5(nu5.f17600b, nu5.f17603c, nu5.f17602b, nu5.f17601b, (String) null, (String) null, nu5.f17599a, (String) null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f23526a == null) {
            synchronized (za6.class) {
                if (f23526a == null) {
                    f23526a = new za6(new df6(context, nu5, l));
                }
            }
        } else if (!(nu5 == null || (bundle = nu5.f17599a) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            Preconditions.checkNotNull(f23526a);
            f23526a.f23552b = Boolean.valueOf(nu5.f17599a.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(f23526a);
        return f23526a;
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m32970b(za6 za6, df6 df6) {
        za6.mo15135d().mo15139h();
        za6.f23533a.mo14130w();
        bi5 bi5 = new bi5(za6);
        bi5.mo17202l();
        za6.f23532a = bi5;
        z36 z36 = new z36(za6, df6.f10726a);
        z36.mo15846j();
        za6.f23545a = z36;
        f46 f46 = new f46(za6);
        f46.mo15846j();
        za6.f23534a = f46;
        om6 om6 = new om6(za6);
        om6.mo15846j();
        za6.f23539a = om6;
        za6.f23535a.mo17203m();
        za6.f23540a.mo17203m();
        za6.f23545a.mo15847k();
        u46 u = za6.mo15136e().mo12729u();
        za6.f23533a.mo14124q();
        u.mo25380b("App measurement initialized, version", 76003L);
        za6.mo15136e().mo12729u().mo25379a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String s = z36.mo27795s();
        if (TextUtils.isEmpty(za6.f23548a)) {
            if (za6.mo27871N().mo16870U(s)) {
                za6.mo15136e().mo12729u().mo25379a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                za6.mo15136e().mo12729u().mo25379a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(s)));
            }
        }
        za6.mo15136e().mo12725q().mo25379a("Debug-level message logging enabled");
        if (za6.f23527a != za6.f23549a.get()) {
            za6.mo15136e().mo12726r().mo25381c("Not all components initialized", Integer.valueOf(za6.f23527a), Integer.valueOf(za6.f23549a.get()));
        }
        za6.f23554b = true;
    }

    /* renamed from: t */
    public static final void m32971t() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: u */
    public static final void m32972u(ed6 ed6) {
        if (ed6 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: v */
    public static final void m32973v(f66 f66) {
        if (f66 == null) {
            throw new IllegalStateException("Component not created");
        } else if (!f66.mo15849m()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(f66.getClass())));
        }
    }

    /* renamed from: w */
    public static final void m32974w(hd6 hd6) {
        if (hd6 == null) {
            throw new IllegalStateException("Component not created");
        } else if (!hd6.mo17204n()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(hd6.getClass())));
        }
    }

    @Pure
    /* renamed from: A */
    public final bi5 mo27859A() {
        m32974w(this.f23532a);
        return this.f23532a;
    }

    @Pure
    /* renamed from: B */
    public final z36 mo27860B() {
        m32973v(this.f23545a);
        return this.f23545a;
    }

    @Pure
    /* renamed from: C */
    public final f46 mo27861C() {
        m32973v(this.f23534a);
        return this.f23534a;
    }

    @Pure
    /* renamed from: D */
    public final l46 mo27862D() {
        return this.f23537a;
    }

    /* renamed from: E */
    public final a56 mo27863E() {
        a56 a56 = this.f23531a;
        if (a56 == null || !a56.mo17204n()) {
            return null;
        }
        return a56;
    }

    @Pure
    /* renamed from: F */
    public final q76 mo27864F() {
        m32972u(this.f23540a);
        return this.f23540a;
    }

    @SideEffectFree
    /* renamed from: G */
    public final qa6 mo27865G() {
        return this.f23541a;
    }

    @Pure
    /* renamed from: I */
    public final ri6 mo27866I() {
        m32973v(this.f23543a);
        return this.f23543a;
    }

    @Pure
    /* renamed from: J */
    public final zi6 mo27867J() {
        m32974w(this.f23546a);
        return this.f23546a;
    }

    @Pure
    /* renamed from: K */
    public final vj6 mo27868K() {
        m32973v(this.f23544a);
        return this.f23544a;
    }

    @Pure
    /* renamed from: L */
    public final om6 mo27869L() {
        m32973v(this.f23539a);
        return this.f23539a;
    }

    @Pure
    /* renamed from: M */
    public final no6 mo27870M() {
        m32973v(this.f23538a);
        return this.f23538a;
    }

    @Pure
    /* renamed from: N */
    public final gr6 mo27871N() {
        m32972u(this.f23535a);
        return this.f23535a;
    }

    @Pure
    /* renamed from: O */
    public final String mo27872O() {
        return this.f23548a;
    }

    @Pure
    /* renamed from: P */
    public final String mo27873P() {
        return this.f23553b;
    }

    @Pure
    /* renamed from: Q */
    public final String mo27874Q() {
        return this.f23556c;
    }

    @Pure
    /* renamed from: R */
    public final String mo27875R() {
        return this.f23559d;
    }

    @Pure
    /* renamed from: a */
    public final Clock mo15133a() {
        return this.f23530a;
    }

    @Pure
    /* renamed from: c */
    public final rb5 mo15134c() {
        return this.f23542a;
    }

    @Pure
    /* renamed from: d */
    public final qa6 mo15135d() {
        m32974w(this.f23541a);
        return this.f23541a;
    }

    @Pure
    /* renamed from: e */
    public final a56 mo15136e() {
        m32974w(this.f23531a);
        return this.f23531a;
    }

    @Pure
    /* renamed from: f */
    public final Context mo15137f() {
        return this.f23529a;
    }

    /* renamed from: g */
    public final void mo27876g() {
        this.f23549a.incrementAndGet();
    }

    /* renamed from: h */
    public final /* synthetic */ void mo27877h(String str, int i, Throwable th, byte[] bArr, Map map) {
        if (!(i == 200 || i == 204)) {
            if (i == 304) {
                i = 304;
            }
            mo15136e().mo12731w().mo25381c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
        }
        if (th == null) {
            mo27864F().f18958d.mo27237a(true);
            if (bArr == null || bArr.length == 0) {
                mo15136e().mo12725q().mo25379a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    mo15136e().mo12725q().mo25379a("Deferred Deep Link is empty.");
                    return;
                }
                gr6 N = mo27871N();
                za6 za6 = N.f11205a;
                if (!TextUtils.isEmpty(optString)) {
                    List<ResolveInfo> queryIntentActivities = N.f11205a.f23529a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.f23543a.mo23910u(bf0.f26274c, C4311b.C4317f.f25142l, bundle);
                        gr6 N2 = mo27871N();
                        if (!TextUtils.isEmpty(optString)) {
                            try {
                                SharedPreferences.Editor edit = N2.f11205a.f23529a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                edit.putString("deeplink", optString);
                                edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                                if (edit.commit()) {
                                    N2.f11205a.f23529a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                    return;
                                }
                                return;
                            } catch (RuntimeException e) {
                                N2.f11205a.mo15136e().mo12726r().mo25380b("Failed to persist Deferred Deep Link. exception", e);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                mo15136e().mo12731w().mo25381c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e2) {
                mo15136e().mo12726r().mo25380b("Failed to parse the Deferred Deep Link response. exception", e2);
                return;
            }
        }
        mo15136e().mo12731w().mo25381c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
    }

    /* renamed from: i */
    public final void mo27878i() {
        this.f23527a++;
    }

    @ly4
    /* renamed from: j */
    public final void mo27879j() {
        mo15135d().mo15139h();
        m32974w(mo27867J());
        String s = mo27860B().mo27795s();
        Pair p = mo27864F().mo22925p(s);
        if (!this.f23533a.mo14109A() || ((Boolean) p.second).booleanValue() || TextUtils.isEmpty((CharSequence) p.first)) {
            mo15136e().mo12725q().mo25379a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        zi6 J = mo27867J();
        J.mo17201k();
        ConnectivityManager connectivityManager = (ConnectivityManager) J.f11205a.f23529a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            mo15136e().mo12731w().mo25379a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        gr6 N = mo27871N();
        mo27860B().f11205a.f23533a.mo14124q();
        URL s2 = N.mo16890s(76003, s, (String) p.first, mo27864F().f18960f.mo15075a() - 1);
        if (s2 != null) {
            zi6 J2 = mo27867J();
            ta6 ta6 = new ta6(this);
            J2.mo15139h();
            J2.mo17201k();
            Preconditions.checkNotNull(s2);
            Preconditions.checkNotNull(ta6);
            J2.f11205a.mo15135d().mo23064y(new xi6(J2, s, s2, (byte[]) null, (Map) null, ta6));
        }
    }

    @ly4
    /* renamed from: k */
    public final void mo27880k(boolean z) {
        this.f23552b = Boolean.valueOf(z);
    }

    @ly4
    /* renamed from: l */
    public final void mo27881l(boolean z) {
        mo15135d().mo15139h();
        this.f23557c = z;
    }

    @ly4
    /* renamed from: m */
    public final void mo27882m(nu5 nu5) {
        ye5 ye5;
        mo15135d().mo15139h();
        ye5 q = mo27864F().mo22926q();
        q76 F = mo27864F();
        za6 za6 = F.f11205a;
        F.mo15139h();
        int i = 100;
        int i2 = F.mo22924o().getInt("consent_source", 100);
        ce5 ce5 = this.f23533a;
        za6 za62 = ce5.f11205a;
        Boolean t = ce5.mo14127t("google_analytics_default_allow_ad_storage");
        ce5 ce52 = this.f23533a;
        za6 za63 = ce52.f11205a;
        Boolean t2 = ce52.mo14127t("google_analytics_default_allow_analytics_storage");
        if (!(t == null && t2 == null) && mo27864F().mo22932w(-10)) {
            ye5 = new ye5(t, t2);
            i = -10;
        } else {
            if (!TextUtils.isEmpty(mo27860B().mo27796t()) && (i2 == 0 || i2 == 30 || i2 == 10 || i2 == 30 || i2 == 30 || i2 == 40)) {
                mo27866I().mo23881G(ye5.f23033a, -10, this.f23551b);
            } else if (TextUtils.isEmpty(mo27860B().mo27796t()) && nu5 != null && nu5.f17599a != null && mo27864F().mo22932w(30)) {
                ye5 = ye5.m32304a(nu5.f17599a);
                if (!ye5.equals(ye5.f23033a)) {
                    i = 30;
                }
            }
            ye5 = null;
        }
        if (ye5 != null) {
            mo27866I().mo23881G(ye5, i, this.f23551b);
            q = ye5;
        }
        mo27866I().mo23884J(q);
        if (mo27864F().f18943a.mo15075a() == 0) {
            mo15136e().mo12730v().mo25380b("Persisting first open", Long.valueOf(this.f23551b));
            mo27864F().f18943a.mo15076b(this.f23551b);
        }
        mo27866I().f19889a.mo24170c();
        if (mo27887r()) {
            if (!TextUtils.isEmpty(mo27860B().mo27796t()) || !TextUtils.isEmpty(mo27860B().mo27794r())) {
                gr6 N = mo27871N();
                String t3 = mo27860B().mo27796t();
                q76 F2 = mo27864F();
                F2.mo15139h();
                String string = F2.mo22924o().getString(nh1.f32548u, (String) null);
                String r = mo27860B().mo27794r();
                q76 F3 = mo27864F();
                F3.mo15139h();
                if (N.mo16874d0(t3, string, r, F3.mo22924o().getString("admob_app_id", (String) null))) {
                    mo15136e().mo12729u().mo25379a("Rechecking which service to use due to a GMP App Id change");
                    q76 F4 = mo27864F();
                    F4.mo15139h();
                    Boolean r2 = F4.mo22927r();
                    SharedPreferences.Editor edit = F4.mo22924o().edit();
                    edit.clear();
                    edit.apply();
                    if (r2 != null) {
                        F4.mo22928s(r2);
                    }
                    mo27861C().mo15782q();
                    this.f23539a.mo22002Q();
                    this.f23539a.mo22001P();
                    mo27864F().f18943a.mo15076b(this.f23551b);
                    mo27864F().f18945a.mo20990b((String) null);
                }
                q76 F5 = mo27864F();
                String t4 = mo27860B().mo27796t();
                F5.mo15139h();
                SharedPreferences.Editor edit2 = F5.mo22924o().edit();
                edit2.putString(nh1.f32548u, t4);
                edit2.apply();
                q76 F6 = mo27864F();
                String r3 = mo27860B().mo27794r();
                F6.mo15139h();
                SharedPreferences.Editor edit3 = F6.mo22924o().edit();
                edit3.putString("admob_app_id", r3);
                edit3.apply();
            }
            if (!mo27864F().mo22926q().mo27438i(ne5.ANALYTICS_STORAGE)) {
                mo27864F().f18945a.mo20990b((String) null);
            }
            mo27866I().mo23877C(mo27864F().f18945a.mo20989a());
            ow6.m24151c();
            if (this.f23533a.mo14110B((String) null, n36.f17054e0)) {
                try {
                    mo27871N().f11205a.f23529a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(mo27864F().f18953c.mo20989a())) {
                        mo15136e().mo12731w().mo25379a("Remote config removed with active feature rollouts");
                        mo27864F().f18953c.mo20990b((String) null);
                    }
                }
            }
            if (!TextUtils.isEmpty(mo27860B().mo27796t()) || !TextUtils.isEmpty(mo27860B().mo27794r())) {
                boolean o = mo27884o();
                if (!mo27864F().mo22930u() && !this.f23533a.mo14113E()) {
                    mo27864F().mo22929t(!o);
                }
                if (o) {
                    mo27866I().mo23903g0();
                }
                mo27870M().f17508a.mo19745a();
                mo27869L().mo22004S(new AtomicReference());
                mo27869L().mo22017v(mo27864F().f18942a.mo13517a());
            }
        } else if (mo27884o()) {
            if (!mo27871N().mo16869T("android.permission.INTERNET")) {
                mo15136e().mo12726r().mo25379a("App is missing INTERNET permission");
            }
            if (!mo27871N().mo16869T(vg0.f21757b)) {
                mo15136e().mo12726r().mo25379a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!Wrappers.packageManager(this.f23529a).isCallerInstantApp() && !this.f23533a.mo14115G()) {
                if (!gr6.m16177a0(this.f23529a)) {
                    mo15136e().mo12726r().mo25379a("AppMeasurementReceiver not registered/enabled");
                }
                if (!gr6.m16178b0(this.f23529a, false)) {
                    mo15136e().mo12726r().mo25379a("AppMeasurementService not registered/enabled");
                }
            }
            mo15136e().mo12726r().mo25379a("Uploading is not possible. App measurement disabled");
        }
        mo27864F().f18950b.mo27237a(true);
    }

    @ly4
    /* renamed from: n */
    public final boolean mo27883n() {
        return this.f23552b != null && this.f23552b.booleanValue();
    }

    @ly4
    /* renamed from: o */
    public final boolean mo27884o() {
        return mo27889x() == 0;
    }

    @ly4
    /* renamed from: p */
    public final boolean mo27885p() {
        mo15135d().mo15139h();
        return this.f23557c;
    }

    @Pure
    /* renamed from: q */
    public final boolean mo27886q() {
        return TextUtils.isEmpty(this.f23548a);
    }

    @ly4
    /* renamed from: r */
    public final boolean mo27887r() {
        if (this.f23554b) {
            mo15135d().mo15139h();
            Boolean bool = this.f23547a;
            if (bool == null || this.f23528a == 0 || (!bool.booleanValue() && Math.abs(this.f23530a.elapsedRealtime() - this.f23528a) > 1000)) {
                this.f23528a = this.f23530a.elapsedRealtime();
                boolean z = true;
                Boolean valueOf = Boolean.valueOf(mo27871N().mo16869T("android.permission.INTERNET") && mo27871N().mo16869T(vg0.f21757b) && (Wrappers.packageManager(this.f23529a).isCallerInstantApp() || this.f23533a.mo14115G() || (gr6.m16177a0(this.f23529a) && gr6.m16178b0(this.f23529a, false))));
                this.f23547a = valueOf;
                if (valueOf.booleanValue()) {
                    if (!mo27871N().mo16862M(mo27860B().mo27796t(), mo27860B().mo27794r()) && TextUtils.isEmpty(mo27860B().mo27794r())) {
                        z = false;
                    }
                    this.f23547a = Boolean.valueOf(z);
                }
            }
            return this.f23547a.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    @Pure
    /* renamed from: s */
    public final boolean mo27888s() {
        return this.f23550a;
    }

    @ly4
    /* renamed from: x */
    public final int mo27889x() {
        mo15135d().mo15139h();
        if (this.f23533a.mo14113E()) {
            return 1;
        }
        Boolean bool = this.f23558d;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        mo15135d().mo15139h();
        if (!this.f23557c) {
            return 8;
        }
        Boolean r = mo27864F().mo22927r();
        if (r != null) {
            return r.booleanValue() ? 0 : 3;
        }
        ce5 ce5 = this.f23533a;
        rb5 rb5 = ce5.f11205a.f23542a;
        Boolean t = ce5.mo14127t("firebase_analytics_collection_enabled");
        if (t != null) {
            return t.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f23555c;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.f23552b == null || this.f23552b.booleanValue()) ? 0 : 7;
    }

    @Pure
    /* renamed from: y */
    public final jx5 mo27890y() {
        jx5 jx5 = this.f23536a;
        if (jx5 != null) {
            return jx5;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    /* renamed from: z */
    public final ce5 mo27891z() {
        return this.f23533a;
    }
}
