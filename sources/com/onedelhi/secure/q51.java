package com.onedelhi.secure;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.C4336a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@nz3
public class q51 implements r51 {

    /* renamed from: a */
    public static final C7012v5 f33985a = C7012v5.m67717e();

    /* renamed from: n */
    public static final int f33986n = 5;

    /* renamed from: o */
    public static final int f33987o = 40;

    /* renamed from: p */
    public static final int f33988p = 100;

    /* renamed from: q */
    public static final int f33989q = 100;

    /* renamed from: a */
    public final C4336a f33990a;

    /* renamed from: a */
    public final b73<uh3> f33991a;

    /* renamed from: a */
    public final kp1 f33992a;

    /* renamed from: a */
    public final o41 f33993a;

    /* renamed from: a */
    public final w31 f33994a;
    @ts2

    /* renamed from: a */
    public Boolean f33995a = null;

    /* renamed from: a */
    public final Map<String, String> f33996a = new ConcurrentHashMap();

    /* renamed from: b */
    public final b73<yh4> f33997b;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.q51$a */
    public @interface C6513a {

        /* renamed from: A */
        public static final String f33998A = "TRACE";

        /* renamed from: B */
        public static final String f33999B = "CONNECT";

        /* renamed from: t */
        public static final String f34000t = "GET";

        /* renamed from: u */
        public static final String f34001u = "PUT";

        /* renamed from: v */
        public static final String f34002v = "POST";

        /* renamed from: w */
        public static final String f34003w = "DELETE";

        /* renamed from: x */
        public static final String f34004x = "HEAD";

        /* renamed from: y */
        public static final String f34005y = "PATCH";

        /* renamed from: z */
        public static final String f34006z = "OPTIONS";
    }

    @qq1
    @hw4
    public q51(w31 w31, b73<uh3> b73, o41 o41, b73<yh4> b732, RemoteConfigManager remoteConfigManager, C4336a aVar, SessionManager sessionManager) {
        this.f33994a = w31;
        this.f33991a = b73;
        this.f33993a = o41;
        this.f33997b = b732;
        if (w31 == null) {
            this.f33995a = Boolean.FALSE;
            this.f33990a = aVar;
            this.f33992a = new kp1(new Bundle());
            return;
        }
        li4.m55636l().mo39886t(w31, o41, b732);
        Context n = w31.mo46527n();
        kp1 b = m62122b(n);
        this.f33992a = b;
        remoteConfigManager.setFirebaseRemoteConfigProvider(b73);
        this.f33990a = aVar;
        aVar.mo29869U(b);
        aVar.mo29865Q(n);
        sessionManager.setApplicationContext(n);
        this.f33995a = aVar.mo29878k();
        C7012v5 v5Var = f33985a;
        if (v5Var.mo46006h() && mo43156e()) {
            v5Var.mo46004f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", new Object[]{e60.m46046b(w31.mo46529s().mo37196n(), n.getPackageName())}));
        }
    }

    /* renamed from: b */
    public static kp1 m62122b(Context context) {
        Bundle bundle;
        kp1 kp1;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            Log.d(g60.f28960b, "No perf enable meta data found " + e.getMessage());
            bundle = null;
        }
        if (bundle == null) {
            kp1 = new kp1();
        }
        return kp1;
    }

    @mr2
    /* renamed from: c */
    public static q51 m62123c() {
        return (q51) w31.m68755p().mo46526l(q51.class);
    }

    @mr2
    /* renamed from: k */
    public static Trace m62124k(@mr2 String str) {
        Trace c = Trace.m35091c(str);
        c.start();
        return c;
    }

    /* renamed from: a */
    public final void mo43154a(@ts2 String str, @ts2 String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("Attribute must not have null key or value.");
        } else if (this.f33996a.containsKey(str) || this.f33996a.size() < 5) {
            f13.m47449d(str, str2);
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "Exceeds max limit of number of attributes - %d", new Object[]{5}));
        }
    }

    @hw4
    /* renamed from: d */
    public Boolean mo43155d() {
        return this.f33995a;
    }

    /* renamed from: e */
    public boolean mo43156e() {
        Boolean bool = this.f33995a;
        return bool != null ? bool.booleanValue() : w31.m68755p().mo46511A();
    }

    @mr2
    /* renamed from: f */
    public rm1 mo43157f(@mr2 String str, @mr2 String str2) {
        return new rm1(str, str2, li4.m55636l(), new qe4());
    }

    @mr2
    /* renamed from: g */
    public rm1 mo43158g(@mr2 URL url, @mr2 String str) {
        return new rm1(url, str, li4.m55636l(), new qe4());
    }

    @ts2
    public String getAttribute(@mr2 String str) {
        return this.f33996a.get(str);
    }

    @mr2
    public Map<String, String> getAttributes() {
        return new HashMap(this.f33996a);
    }

    @mr2
    /* renamed from: h */
    public Trace mo43159h(@mr2 String str) {
        return Trace.m35091c(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo43160i(@com.onedelhi.secure.ts2 java.lang.Boolean r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.onedelhi.secure.w31.m68755p()     // Catch:{ IllegalStateException -> 0x0050 }
            com.google.firebase.perf.config.a r0 = r1.f33990a     // Catch:{ all -> 0x004d }
            java.lang.Boolean r0 = r0.mo29877j()     // Catch:{ all -> 0x004d }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0019
            com.onedelhi.secure.v5 r2 = f33985a     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "Firebase Performance is permanently disabled"
            r2.mo46004f(r0)     // Catch:{ all -> 0x004d }
            monitor-exit(r1)
            return
        L_0x0019:
            com.google.firebase.perf.config.a r0 = r1.f33990a     // Catch:{ all -> 0x004d }
            r0.mo29868T(r2)     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x0023
        L_0x0020:
            r1.f33995a = r2     // Catch:{ all -> 0x004d }
            goto L_0x002a
        L_0x0023:
            com.google.firebase.perf.config.a r2 = r1.f33990a     // Catch:{ all -> 0x004d }
            java.lang.Boolean r2 = r2.mo29878k()     // Catch:{ all -> 0x004d }
            goto L_0x0020
        L_0x002a:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x004d }
            java.lang.Boolean r0 = r1.f33995a     // Catch:{ all -> 0x004d }
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x003c
            com.onedelhi.secure.v5 r2 = f33985a     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "Firebase Performance is Enabled"
        L_0x0038:
            r2.mo46004f(r0)     // Catch:{ all -> 0x004d }
            goto L_0x004b
        L_0x003c:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x004d }
            java.lang.Boolean r0 = r1.f33995a     // Catch:{ all -> 0x004d }
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x004b
            com.onedelhi.secure.v5 r2 = f33985a     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "Firebase Performance is Disabled"
            goto L_0x0038
        L_0x004b:
            monitor-exit(r1)
            return
        L_0x004d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0050:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.q51.mo43160i(java.lang.Boolean):void");
    }

    /* renamed from: j */
    public void mo43161j(boolean z) {
        mo43160i(Boolean.valueOf(z));
    }

    public void putAttribute(@mr2 String str, @mr2 String str2) {
        boolean z = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            mo43154a(str, str2);
            z = true;
        } catch (Exception e) {
            f33985a.mo46003d("Can not set attribute %s with value %s (%s)", str, str2, e.getMessage());
        }
        if (z) {
            this.f33996a.put(str, str2);
        }
    }

    public void removeAttribute(@mr2 String str) {
        this.f33996a.remove(str);
    }
}
