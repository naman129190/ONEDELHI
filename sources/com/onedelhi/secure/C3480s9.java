package com.onedelhi.secure;

import com.onedelhi.secure.hl3;
import java.util.concurrent.Executor;

@hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
/* renamed from: com.onedelhi.secure.s9 */
public class C3480s9 extends aa4 {

    /* renamed from: a */
    public static volatile C3480s9 f20257a;
    @mr2

    /* renamed from: a */
    public static final Executor f20258a = new C3481a();
    @mr2

    /* renamed from: b */
    public static final Executor f20259b = new C3482b();
    @mr2

    /* renamed from: a */
    public aa4 f20260a;
    @mr2

    /* renamed from: b */
    public aa4 f20261b;

    /* renamed from: com.onedelhi.secure.s9$a */
    public static class C3481a implements Executor {
        public void execute(Runnable runnable) {
            C3480s9.m27323f().mo12887d(runnable);
        }
    }

    /* renamed from: com.onedelhi.secure.s9$b */
    public static class C3482b implements Executor {
        public void execute(Runnable runnable) {
            C3480s9.m27323f().mo12884a(runnable);
        }
    }

    public C3480s9() {
        th0 th0 = new th0();
        this.f20261b = th0;
        this.f20260a = th0;
    }

    @mr2
    /* renamed from: e */
    public static Executor m27322e() {
        return f20259b;
    }

    @mr2
    /* renamed from: f */
    public static C3480s9 m27323f() {
        if (f20257a != null) {
            return f20257a;
        }
        synchronized (C3480s9.class) {
            if (f20257a == null) {
                f20257a = new C3480s9();
            }
        }
        return f20257a;
    }

    @mr2
    /* renamed from: g */
    public static Executor m27324g() {
        return f20258a;
    }

    /* renamed from: a */
    public void mo12884a(Runnable runnable) {
        this.f20260a.mo12884a(runnable);
    }

    /* renamed from: c */
    public boolean mo12886c() {
        return this.f20260a.mo12886c();
    }

    /* renamed from: d */
    public void mo12887d(Runnable runnable) {
        this.f20260a.mo12887d(runnable);
    }

    /* renamed from: h */
    public void mo24267h(@ts2 aa4 aa4) {
        if (aa4 == null) {
            aa4 = this.f20261b;
        }
        this.f20260a = aa4;
    }
}
