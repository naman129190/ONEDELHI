package com.onedelhi.secure;

import com.google.firebase.perf.config.C4336a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

public final class zc0 implements s51 {

    /* renamed from: a */
    public a73<w31> f38304a;

    /* renamed from: b */
    public a73<b73<uh3>> f38305b;

    /* renamed from: c */
    public a73<o41> f38306c;

    /* renamed from: d */
    public a73<b73<yh4>> f38307d;

    /* renamed from: e */
    public a73<RemoteConfigManager> f38308e;

    /* renamed from: f */
    public a73<C4336a> f38309f;

    /* renamed from: g */
    public a73<SessionManager> f38310g;

    /* renamed from: h */
    public a73<q51> f38311h;

    /* renamed from: com.onedelhi.secure.zc0$b */
    public static final class C7469b {

        /* renamed from: a */
        public u51 f38312a;

        public C7469b() {
        }

        /* renamed from: a */
        public s51 mo48218a() {
            j43.m52913a(this.f38312a, u51.class);
            return new zc0(this.f38312a);
        }

        /* renamed from: b */
        public C7469b mo48219b(u51 u51) {
            this.f38312a = (u51) j43.m52914b(u51);
            return this;
        }
    }

    public zc0(u51 u51) {
        mo48217c(u51);
    }

    /* renamed from: b */
    public static C7469b m73078b() {
        return new C7469b();
    }

    /* renamed from: a */
    public q51 mo44205a() {
        return this.f38311h.get();
    }

    /* renamed from: c */
    public final void mo48217c(u51 u51) {
        this.f38304a = w51.m68860a(u51);
        this.f38305b = y51.m71277a(u51);
        this.f38306c = x51.m69866a(u51);
        this.f38307d = b61.m39484a(u51);
        this.f38308e = z51.m72550a(u51);
        this.f38309f = v51.m67733a(u51);
        a61 a = a61.m36080a(u51);
        this.f38310g = a;
        this.f38311h = eo0.m47072b(c61.m40758a(this.f38304a, this.f38305b, this.f38306c, this.f38307d, this.f38308e, this.f38309f, a));
    }
}
