package com.onedelhi.secure;

import java.util.concurrent.Executor;

public class gy4 {

    /* renamed from: a */
    public final aw0 f12819a;

    /* renamed from: a */
    public final ky4 f12820a;

    /* renamed from: a */
    public final q84 f12821a;

    /* renamed from: a */
    public final Executor f12822a;

    @qq1
    public gy4(Executor executor, aw0 aw0, ky4 ky4, q84 q84) {
        this.f12822a = executor;
        this.f12819a = aw0;
        this.f12820a = ky4;
        this.f12821a = q84;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m16396d() {
        for (xh4 a : this.f12819a.mo13296T0()) {
            this.f12820a.mo18889a(a, 1);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m16397e() {
        this.f12821a.mo16818b(new ey4(this));
    }

    /* renamed from: c */
    public void mo17022c() {
        this.f12822a.execute(new fy4(this));
    }
}
