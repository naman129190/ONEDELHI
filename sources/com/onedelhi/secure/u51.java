package com.onedelhi.secure;

import com.google.firebase.perf.config.C4336a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;

@zj2
public class u51 {

    /* renamed from: a */
    public final b73<uh3> f35971a;

    /* renamed from: a */
    public final o41 f35972a;

    /* renamed from: a */
    public final w31 f35973a;

    /* renamed from: b */
    public final b73<yh4> f35974b;

    public u51(@mr2 w31 w31, @mr2 o41 o41, @mr2 b73<uh3> b73, @mr2 b73<yh4> b732) {
        this.f35973a = w31;
        this.f35972a = o41;
        this.f35971a = b73;
        this.f35974b = b732;
    }

    @f73
    /* renamed from: a */
    public C4336a mo45394a() {
        return C4336a.m34908h();
    }

    @f73
    /* renamed from: b */
    public w31 mo45395b() {
        return this.f35973a;
    }

    @f73
    /* renamed from: c */
    public o41 mo45396c() {
        return this.f35972a;
    }

    @f73
    /* renamed from: d */
    public b73<uh3> mo45397d() {
        return this.f35971a;
    }

    @f73
    /* renamed from: e */
    public RemoteConfigManager mo45398e() {
        return RemoteConfigManager.getInstance();
    }

    @f73
    /* renamed from: f */
    public SessionManager mo45399f() {
        return SessionManager.getInstance();
    }

    @f73
    /* renamed from: g */
    public b73<yh4> mo45400g() {
        return this.f35974b;
    }
}
