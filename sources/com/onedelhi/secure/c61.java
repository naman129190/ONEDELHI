package com.onedelhi.secure;

import com.google.firebase.perf.config.C4336a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

public final class c61 implements kz0<q51> {

    /* renamed from: a */
    public final a73<w31> f26656a;

    /* renamed from: b */
    public final a73<b73<uh3>> f26657b;

    /* renamed from: c */
    public final a73<o41> f26658c;

    /* renamed from: d */
    public final a73<b73<yh4>> f26659d;

    /* renamed from: e */
    public final a73<RemoteConfigManager> f26660e;

    /* renamed from: f */
    public final a73<C4336a> f26661f;

    /* renamed from: g */
    public final a73<SessionManager> f26662g;

    public c61(a73<w31> a73, a73<b73<uh3>> a732, a73<o41> a733, a73<b73<yh4>> a734, a73<RemoteConfigManager> a735, a73<C4336a> a736, a73<SessionManager> a737) {
        this.f26656a = a73;
        this.f26657b = a732;
        this.f26658c = a733;
        this.f26659d = a734;
        this.f26660e = a735;
        this.f26661f = a736;
        this.f26662g = a737;
    }

    /* renamed from: a */
    public static c61 m40758a(a73<w31> a73, a73<b73<uh3>> a732, a73<o41> a733, a73<b73<yh4>> a734, a73<RemoteConfigManager> a735, a73<C4336a> a736, a73<SessionManager> a737) {
        return new c61(a73, a732, a733, a734, a735, a736, a737);
    }

    /* renamed from: c */
    public static q51 m40759c(w31 w31, b73<uh3> b73, o41 o41, b73<yh4> b732, RemoteConfigManager remoteConfigManager, C4336a aVar, SessionManager sessionManager) {
        return new q51(w31, b73, o41, b732, remoteConfigManager, aVar, sessionManager);
    }

    /* renamed from: b */
    public q51 get() {
        return m40759c(this.f26656a.get(), this.f26657b.get(), this.f26658c.get(), this.f26659d.get(), this.f26660e.get(), this.f26661f.get(), this.f26662g.get());
    }
}
