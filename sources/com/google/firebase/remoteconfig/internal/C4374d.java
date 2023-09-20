package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.ly4;
import com.onedelhi.secure.r61;
import com.onedelhi.secure.t61;
import com.onedelhi.secure.ts2;
import java.util.Date;

/* renamed from: com.google.firebase.remoteconfig.internal.d */
public class C4374d {

    /* renamed from: a */
    public static final int f25374a = 0;
    @hw4

    /* renamed from: a */
    public static final long f25375a = -1;

    /* renamed from: a */
    public static final String f25376a = "fetch_timeout_in_seconds";

    /* renamed from: a */
    public static final Date f25377a = new Date(-1);
    @hw4

    /* renamed from: b */
    public static final int f25378b = 0;

    /* renamed from: b */
    public static final long f25379b = -1;

    /* renamed from: b */
    public static final String f25380b = "minimum_fetch_interval_in_seconds";
    @hw4

    /* renamed from: b */
    public static final Date f25381b = new Date(-1);

    /* renamed from: c */
    public static final String f25382c = "last_fetch_status";

    /* renamed from: d */
    public static final String f25383d = "last_fetch_time_in_millis";

    /* renamed from: e */
    public static final String f25384e = "last_fetch_etag";

    /* renamed from: f */
    public static final String f25385f = "backoff_end_time_in_millis";

    /* renamed from: g */
    public static final String f25386g = "num_failed_fetches";

    /* renamed from: h */
    public static final String f25387h = "last_template_version";

    /* renamed from: i */
    public static final String f25388i = "num_failed_realtime_streams";

    /* renamed from: j */
    public static final String f25389j = "realtime_backoff_end_time_in_millis";

    /* renamed from: a */
    public final SharedPreferences f25390a;

    /* renamed from: a */
    public final Object f25391a = new Object();

    /* renamed from: b */
    public final Object f25392b = new Object();

    /* renamed from: c */
    public final Object f25393c = new Object();

    /* renamed from: com.google.firebase.remoteconfig.internal.d$a */
    public static class C4375a {

        /* renamed from: a */
        public int f25394a;

        /* renamed from: a */
        public Date f25395a;

        public C4375a(int i, Date date) {
            this.f25394a = i;
            this.f25395a = date;
        }

        /* renamed from: a */
        public Date mo30086a() {
            return this.f25395a;
        }

        /* renamed from: b */
        public int mo30087b() {
            return this.f25394a;
        }
    }

    /* renamed from: com.google.firebase.remoteconfig.internal.d$b */
    public static class C4376b {

        /* renamed from: a */
        public int f25396a;

        /* renamed from: a */
        public Date f25397a;

        public C4376b(int i, Date date) {
            this.f25396a = i;
            this.f25397a = date;
        }

        /* renamed from: a */
        public Date mo30088a() {
            return this.f25397a;
        }

        /* renamed from: b */
        public int mo30089b() {
            return this.f25396a;
        }
    }

    public C4374d(SharedPreferences sharedPreferences) {
        this.f25390a = sharedPreferences;
    }

    @ly4
    /* renamed from: a */
    public void mo30065a() {
        synchronized (this.f25391a) {
            this.f25390a.edit().clear().commit();
        }
    }

    /* renamed from: b */
    public C4375a mo30066b() {
        C4375a aVar;
        synchronized (this.f25392b) {
            aVar = new C4375a(this.f25390a.getInt(f25386g, 0), new Date(this.f25390a.getLong(f25385f, -1)));
        }
        return aVar;
    }

    /* renamed from: c */
    public long mo30067c() {
        return this.f25390a.getLong(f25376a, 60);
    }

    /* renamed from: d */
    public r61 mo30068d() {
        C4380f a;
        synchronized (this.f25391a) {
            long j = this.f25390a.getLong(f25383d, -1);
            int i = this.f25390a.getInt(f25382c, 0);
            a = C4380f.m35276d().mo30124c(i).mo30125d(j).mo30123b(new t61.C6839b().mo44930f(this.f25390a.getLong(f25376a, 60)).mo44931g(this.f25390a.getLong(f25380b, C4370c.f25350a)).mo44927c()).mo30122a();
        }
        return a;
    }

    @ts2
    /* renamed from: e */
    public String mo30069e() {
        return this.f25390a.getString(f25384e, (String) null);
    }

    /* renamed from: f */
    public int mo30070f() {
        return this.f25390a.getInt(f25382c, 0);
    }

    /* renamed from: g */
    public Date mo30071g() {
        return new Date(this.f25390a.getLong(f25383d, -1));
    }

    /* renamed from: h */
    public long mo30072h() {
        return this.f25390a.getLong(f25387h, 0);
    }

    /* renamed from: i */
    public long mo30073i() {
        return this.f25390a.getLong(f25380b, C4370c.f25350a);
    }

    /* renamed from: j */
    public C4376b mo30074j() {
        C4376b bVar;
        synchronized (this.f25393c) {
            bVar = new C4376b(this.f25390a.getInt(f25388i, 0), new Date(this.f25390a.getLong(f25389j, -1)));
        }
        return bVar;
    }

    /* renamed from: k */
    public void mo30075k() {
        mo30077m(0, f25381b);
    }

    /* renamed from: l */
    public void mo30076l() {
        mo30082r(0, f25381b);
    }

    /* renamed from: m */
    public void mo30077m(int i, Date date) {
        synchronized (this.f25392b) {
            this.f25390a.edit().putInt(f25386g, i).putLong(f25385f, date.getTime()).apply();
        }
    }

    @ly4
    /* renamed from: n */
    public void mo30078n(t61 t61) {
        synchronized (this.f25391a) {
            this.f25390a.edit().putLong(f25376a, t61.mo44924a()).putLong(f25380b, t61.mo44925b()).commit();
        }
    }

    /* renamed from: o */
    public void mo30079o(t61 t61) {
        synchronized (this.f25391a) {
            this.f25390a.edit().putLong(f25376a, t61.mo44924a()).putLong(f25380b, t61.mo44925b()).apply();
        }
    }

    /* renamed from: p */
    public void mo30080p(String str) {
        synchronized (this.f25391a) {
            this.f25390a.edit().putString(f25384e, str).apply();
        }
    }

    /* renamed from: q */
    public void mo30081q(long j) {
        synchronized (this.f25391a) {
            this.f25390a.edit().putLong(f25387h, j).apply();
        }
    }

    /* renamed from: r */
    public void mo30082r(int i, Date date) {
        synchronized (this.f25393c) {
            this.f25390a.edit().putInt(f25388i, i).putLong(f25389j, date.getTime()).apply();
        }
    }

    /* renamed from: s */
    public void mo30083s() {
        synchronized (this.f25391a) {
            this.f25390a.edit().putInt(f25382c, 1).apply();
        }
    }

    /* renamed from: t */
    public void mo30084t(Date date) {
        synchronized (this.f25391a) {
            this.f25390a.edit().putInt(f25382c, -1).putLong(f25383d, date.getTime()).apply();
        }
    }

    /* renamed from: u */
    public void mo30085u() {
        synchronized (this.f25391a) {
            this.f25390a.edit().putInt(f25382c, 2).apply();
        }
    }
}
