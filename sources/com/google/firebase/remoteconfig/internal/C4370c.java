package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.remoteconfig.internal.C4374d;
import com.onedelhi.secure.C4623b5;
import com.onedelhi.secure.a50;
import com.onedelhi.secure.ak4;
import com.onedelhi.secure.b50;
import com.onedelhi.secure.b73;
import com.onedelhi.secure.c50;
import com.onedelhi.secure.ha4;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.kr1;
import com.onedelhi.secure.ly4;
import com.onedelhi.secure.o41;
import com.onedelhi.secure.o61;
import com.onedelhi.secure.p61;
import com.onedelhi.secure.q61;
import com.onedelhi.secure.s61;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.u40;
import com.onedelhi.secure.w94;
import com.onedelhi.secure.y40;
import com.onedelhi.secure.z40;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.remoteconfig.internal.c */
public class C4370c {
    @hw4

    /* renamed from: a */
    public static final int f25349a = 429;

    /* renamed from: a */
    public static final long f25350a = TimeUnit.HOURS.toSeconds(12);
    @hw4

    /* renamed from: a */
    public static final String f25351a = "_fot";
    @hw4

    /* renamed from: a */
    public static final int[] f25352a = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: b */
    public static final String f25353b = "X-Firebase-RC-Fetch-Type";

    /* renamed from: a */
    public final Clock f25354a;

    /* renamed from: a */
    public final ConfigFetchHttpClient f25355a;

    /* renamed from: a */
    public final C4374d f25356a;

    /* renamed from: a */
    public final b73<C4623b5> f25357a;

    /* renamed from: a */
    public final o41 f25358a;

    /* renamed from: a */
    public final u40 f25359a;

    /* renamed from: a */
    public final Map<String, String> f25360a;

    /* renamed from: a */
    public final Random f25361a;

    /* renamed from: a */
    public final Executor f25362a;

    /* renamed from: com.google.firebase.remoteconfig.internal.c$a */
    public static class C4371a {

        /* renamed from: a */
        public final int f25363a;

        /* renamed from: a */
        public final C4367b f25364a;
        @ts2

        /* renamed from: a */
        public final String f25365a;

        /* renamed from: a */
        public final Date f25366a;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.google.firebase.remoteconfig.internal.c$a$a */
        public @interface C4372a {

            /* renamed from: d */
            public static final int f25367d = 0;

            /* renamed from: e */
            public static final int f25368e = 1;

            /* renamed from: f */
            public static final int f25369f = 2;
        }

        public C4371a(Date date, int i, C4367b bVar, @ts2 String str) {
            this.f25366a = date;
            this.f25363a = i;
            this.f25364a = bVar;
            this.f25365a = str;
        }

        /* renamed from: a */
        public static C4371a m35210a(Date date, C4367b bVar) {
            return new C4371a(date, 1, bVar, (String) null);
        }

        /* renamed from: b */
        public static C4371a m35211b(C4367b bVar, String str) {
            return new C4371a(bVar.mo30028g(), 0, bVar, str);
        }

        /* renamed from: c */
        public static C4371a m35212c(Date date) {
            return new C4371a(date, 2, (C4367b) null, (String) null);
        }

        /* renamed from: d */
        public Date mo30060d() {
            return this.f25366a;
        }

        /* renamed from: e */
        public C4367b mo30061e() {
            return this.f25364a;
        }

        @ts2
        /* renamed from: f */
        public String mo30062f() {
            return this.f25365a;
        }

        /* renamed from: g */
        public int mo30063g() {
            return this.f25363a;
        }
    }

    /* renamed from: com.google.firebase.remoteconfig.internal.c$b */
    public enum C4373b {
        BASE("BASE"),
        REALTIME("REALTIME");
        

        /* renamed from: b */
        public final String f25373b;

        /* access modifiers changed from: public */
        C4373b(String str) {
            this.f25373b = str;
        }

        /* renamed from: a */
        public String mo30064a() {
            return this.f25373b;
        }
    }

    public C4370c(o41 o41, b73<C4623b5> b73, Executor executor, Clock clock, Random random, u40 u40, ConfigFetchHttpClient configFetchHttpClient, C4374d dVar, Map<String, String> map) {
        this.f25358a = o41;
        this.f25357a = b73;
        this.f25362a = executor;
        this.f25354a = clock;
        this.f25361a = random;
        this.f25359a = u40;
        this.f25355a = configFetchHttpClient;
        this.f25356a = dVar;
        this.f25360a = map;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ w94 m35187x(w94 w94, w94 w942, Date date, Map map, w94 w943) throws Exception {
        return !w94.mo17590v() ? ha4.m16571f(new o61("Firebase Installations failed to get installation ID for fetch.", (Throwable) w94.mo17585q())) : !w942.mo17590v() ? ha4.m16571f(new o61("Firebase Installations failed to get installation auth token for fetch.", (Throwable) w942.mo17585q())) : mo30050l((String) w94.mo17586r(), ((kr1) w942.mo17586r()).mo39411b(), date, map);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ w94 m35188y(Date date, w94 w94) throws Exception {
        mo30043D(w94, date);
        return w94;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ w94 m35189z(Map map, w94 w94) throws Exception {
        return m35185v(w94, 0, map);
    }

    /* renamed from: A */
    public final boolean mo30040A(C4374d.C4375a aVar, int i) {
        return aVar.mo30087b() > 1 || i == 429;
    }

    /* renamed from: B */
    public final C4374d.C4375a mo30041B(int i, Date date) {
        if (mo30059u(i)) {
            mo30042C(date);
        }
        return this.f25356a.mo30066b();
    }

    /* renamed from: C */
    public final void mo30042C(Date date) {
        int b = this.f25356a.mo30066b().mo30087b() + 1;
        this.f25356a.mo30077m(b, new Date(date.getTime() + mo30056r(b)));
    }

    /* renamed from: D */
    public final void mo30043D(w94<C4371a> w94, Date date) {
        if (w94.mo17590v()) {
            this.f25356a.mo30084t(date);
            return;
        }
        Exception q = w94.mo17585q();
        if (q != null) {
            if (q instanceof q61) {
                this.f25356a.mo30085u();
            } else {
                this.f25356a.mo30083s();
            }
        }
    }

    /* renamed from: f */
    public final boolean mo30044f(long j, Date date) {
        Date g = this.f25356a.mo30071g();
        if (g.equals(C4374d.f25377a)) {
            return false;
        }
        return date.before(new Date(g.getTime() + TimeUnit.SECONDS.toMillis(j)));
    }

    /* renamed from: g */
    public final s61 mo30045g(s61 s61) throws o61 {
        String str;
        int b = s61.mo44206b();
        if (b == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (b == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else if (b == 429) {
            throw new o61("The throttled response from the server was not handled correctly by the FRC SDK.");
        } else if (b != 500) {
            switch (b) {
                case ak4.C1714g.f9279b:
                case ak4.C1714g.f9281c:
                case 504:
                    str = "The server is unavailable. Please try again later.";
                    break;
                default:
                    str = "The server returned an unexpected error.";
                    break;
            }
        } else {
            str = "There was an internal server error.";
        }
        int b2 = s61.mo44206b();
        return new s61(b2, "Fetch failed: " + str, (Throwable) s61);
    }

    /* renamed from: h */
    public final String mo30046h(long j) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", new Object[]{DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j))});
    }

    /* renamed from: i */
    public w94<C4371a> mo30047i() {
        return mo30048j(this.f25356a.mo30073i());
    }

    /* renamed from: j */
    public w94<C4371a> mo30048j(long j) {
        HashMap hashMap = new HashMap(this.f25360a);
        hashMap.put(f25353b, C4373b.BASE.mo30064a() + "/" + 1);
        return this.f25359a.mo45384f().mo17584p(this.f25362a, new y40(this, j, hashMap));
    }

    @ly4
    /* renamed from: k */
    public final C4371a mo30049k(String str, String str2, Date date, Map<String, String> map) throws p61 {
        try {
            C4371a fetch = this.f25355a.fetch(this.f25355a.mo30004d(), str, str2, mo30058t(), this.f25356a.mo30069e(), map, mo30055q(), date);
            if (fetch.mo30061e() != null) {
                this.f25356a.mo30081q(fetch.mo30061e().mo30031i());
            }
            if (fetch.mo30062f() != null) {
                this.f25356a.mo30080p(fetch.mo30062f());
            }
            this.f25356a.mo30075k();
            return fetch;
        } catch (s61 e) {
            C4374d.C4375a B = mo30041B(e.mo44206b(), date);
            if (mo30040A(B, e.mo44206b())) {
                throw new q61(B.mo30086a().getTime());
            }
            throw mo30045g(e);
        }
    }

    /* renamed from: l */
    public final w94<C4371a> mo30050l(String str, String str2, Date date, Map<String, String> map) {
        try {
            C4371a k = mo30049k(str, str2, date, map);
            return k.mo30063g() != 0 ? ha4.m16572g(k) : this.f25359a.mo45388m(k.mo30061e()).mo17592x(this.f25362a, new c50(k));
        } catch (p61 e) {
            return ha4.m16571f(e);
        }
    }

    /* renamed from: m */
    public final w94<C4371a> m35185v(w94<C4367b> w94, long j, Map<String, String> map) {
        w94<TContinuationResult> w942;
        Date date = new Date(this.f25354a.currentTimeMillis());
        if (w94.mo17590v() && mo30044f(j, date)) {
            return ha4.m16572g(C4371a.m35212c(date));
        }
        Date p = mo30054p(date);
        if (p != null) {
            w942 = ha4.m16571f(new q61(mo30046h(p.getTime() - date.getTime()), p.getTime()));
        } else {
            w94<String> d = this.f25358a.mo40943d();
            w94<kr1> c = this.f25358a.mo40942c(false);
            w942 = ha4.m16576k(d, c).mo17584p(this.f25362a, new z40(this, d, c, date, map));
        }
        return w942.mo17584p(this.f25362a, new a50(this, date));
    }

    /* renamed from: n */
    public w94<C4371a> mo30052n(C4373b bVar, int i) {
        HashMap hashMap = new HashMap(this.f25360a);
        hashMap.put(f25353b, bVar.mo30064a() + "/" + i);
        return this.f25359a.mo45384f().mo17584p(this.f25362a, new b50(this, hashMap));
    }

    @hw4
    /* renamed from: o */
    public b73<C4623b5> mo30053o() {
        return this.f25357a;
    }

    @ts2
    /* renamed from: p */
    public final Date mo30054p(Date date) {
        Date a = this.f25356a.mo30066b().mo30086a();
        if (date.before(a)) {
            return a;
        }
        return null;
    }

    @ly4
    /* renamed from: q */
    public final Long mo30055q() {
        C4623b5 b5Var = this.f25357a.get();
        if (b5Var == null) {
            return null;
        }
        return (Long) b5Var.mo31404g(true).get(f25351a);
    }

    /* renamed from: r */
    public final long mo30056r(int i) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f25352a;
        long millis = timeUnit.toMillis((long) iArr[Math.min(i, iArr.length) - 1]);
        return (millis / 2) + ((long) this.f25361a.nextInt((int) millis));
    }

    /* renamed from: s */
    public long mo30057s() {
        return this.f25356a.mo30072h();
    }

    @ly4
    /* renamed from: t */
    public final Map<String, String> mo30058t() {
        HashMap hashMap = new HashMap();
        C4623b5 b5Var = this.f25357a.get();
        if (b5Var == null) {
            return hashMap;
        }
        for (Map.Entry next : b5Var.mo31404g(false).entrySet()) {
            hashMap.put((String) next.getKey(), next.getValue().toString());
        }
        return hashMap;
    }

    /* renamed from: u */
    public final boolean mo30059u(int i) {
        return i == 429 || i == 502 || i == 503 || i == 504;
    }
}
