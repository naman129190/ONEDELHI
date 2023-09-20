package com.onedelhi.secure;

import android.app.job.JobInfo;
import com.google.auto.value.AutoValue;
import com.onedelhi.secure.C2341hh;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@AutoValue
public abstract class pr3 {

    /* renamed from: a */
    public static final long f18684a = 86400000;

    /* renamed from: b */
    public static final long f18685b = 30000;

    /* renamed from: c */
    public static final long f18686c = 1000;

    /* renamed from: d */
    public static final long f18687d = 10000;

    /* renamed from: com.onedelhi.secure.pr3$a */
    public static class C3183a {

        /* renamed from: a */
        public C2106ez f18688a;

        /* renamed from: a */
        public Map<d53, C3184b> f18689a = new HashMap();

        /* renamed from: a */
        public C3183a mo22615a(d53 d53, C3184b bVar) {
            this.f18689a.put(d53, bVar);
            return this;
        }

        /* renamed from: b */
        public pr3 mo22616b() {
            Objects.requireNonNull(this.f18688a, "missing required property: clock");
            if (this.f18689a.keySet().size() >= d53.values().length) {
                Map<d53, C3184b> map = this.f18689a;
                this.f18689a = new HashMap();
                return pr3.m24972d(this.f18688a, map);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }

        /* renamed from: c */
        public C3183a mo22617c(C2106ez ezVar) {
            this.f18688a = ezVar;
            return this;
        }
    }

    @AutoValue
    /* renamed from: com.onedelhi.secure.pr3$b */
    public static abstract class C3184b {

        @AutoValue.Builder
        /* renamed from: com.onedelhi.secure.pr3$b$a */
        public static abstract class C3185a {
            /* renamed from: a */
            public abstract C3184b mo17263a();

            /* renamed from: b */
            public abstract C3185a mo17264b(long j);

            /* renamed from: c */
            public abstract C3185a mo17265c(Set<C3186c> set);

            /* renamed from: d */
            public abstract C3185a mo17266d(long j);
        }

        /* renamed from: a */
        public static C3185a m24985a() {
            return new C2341hh.C2343b().mo17265c(Collections.emptySet());
        }

        /* renamed from: b */
        public abstract long mo17257b();

        /* renamed from: c */
        public abstract Set<C3186c> mo17258c();

        /* renamed from: d */
        public abstract long mo17259d();
    }

    /* renamed from: com.onedelhi.secure.pr3$c */
    public enum C3186c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: b */
    public static C3183a m24971b() {
        return new C3183a();
    }

    /* renamed from: d */
    public static pr3 m24972d(C2106ez ezVar, Map<d53, C3184b> map) {
        return new C2247gh(ezVar, map);
    }

    /* renamed from: f */
    public static pr3 m24973f(C2106ez ezVar) {
        return m24971b().mo22615a(d53.DEFAULT, C3184b.m24985a().mo17264b(30000).mo17266d(f18684a).mo17263a()).mo22615a(d53.HIGHEST, C3184b.m24985a().mo17264b(1000).mo17266d(f18684a).mo17263a()).mo22615a(d53.VERY_LOW, C3184b.m24985a().mo17264b(f18684a).mo17266d(f18684a).mo17265c(m24974j(C3186c.DEVICE_IDLE)).mo17263a()).mo22617c(ezVar).mo22616b();
    }

    /* renamed from: j */
    public static <T> Set<T> m24974j(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    /* renamed from: a */
    public final long mo22610a(int i, long j) {
        int i2 = i - 1;
        return (long) (Math.pow(3.0d, (double) i2) * ((double) j) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) ((j > 1 ? j : 2) * ((long) i2)))));
    }

    @sj3(api = 21)
    /* renamed from: c */
    public JobInfo.Builder mo22611c(JobInfo.Builder builder, d53 d53, long j, int i) {
        builder.setMinimumLatency(mo22613h(d53, j, i));
        mo22614k(builder, mo16573i().get(d53).mo17258c());
        return builder;
    }

    /* renamed from: e */
    public abstract C2106ez mo16570e();

    /* renamed from: g */
    public Set<C3186c> mo22612g(d53 d53) {
        return mo16573i().get(d53).mo17258c();
    }

    /* renamed from: h */
    public long mo22613h(d53 d53, long j, int i) {
        long a = j - mo16570e().mo15656a();
        C3184b bVar = mo16573i().get(d53);
        return Math.min(Math.max(mo22610a(i, bVar.mo17257b()), a), bVar.mo17259d());
    }

    /* renamed from: i */
    public abstract Map<d53, C3184b> mo16573i();

    @sj3(api = 21)
    /* renamed from: k */
    public final void mo22614k(JobInfo.Builder builder, Set<C3186c> set) {
        if (set.contains(C3186c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(C3186c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(C3186c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
