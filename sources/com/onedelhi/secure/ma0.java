package com.onedelhi.secure;

import com.onedelhi.secure.pa0;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

public final class ma0 implements ja0 {

    /* renamed from: a */
    public static final in2 f32071a = new C6100b();

    /* renamed from: a */
    public final xh0<ja0> f32072a;

    /* renamed from: a */
    public final AtomicReference<ja0> f32073a = new AtomicReference<>((Object) null);

    /* renamed from: com.onedelhi.secure.ma0$b */
    public static final class C6100b implements in2 {
        public C6100b() {
        }

        /* renamed from: a */
        public File mo38164a() {
            return null;
        }

        /* renamed from: b */
        public File mo38165b() {
            return null;
        }

        /* renamed from: c */
        public File mo38166c() {
            return null;
        }

        /* renamed from: d */
        public File mo38167d() {
            return null;
        }

        /* renamed from: e */
        public File mo38168e() {
            return null;
        }

        /* renamed from: f */
        public File mo38169f() {
            return null;
        }

        /* renamed from: g */
        public pa0.C6371a mo38170g() {
            return null;
        }

        /* renamed from: h */
        public File mo38171h() {
            return null;
        }
    }

    public ma0(xh0<ja0> xh0) {
        this.f32072a = xh0;
        xh0.mo47184a(new ka0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m57007g(b73 b73) {
        o92.m59120f().mo41613b("Crashlytics native component now available.");
        this.f32073a.set((ja0) b73.get());
    }

    @mr2
    /* renamed from: a */
    public in2 mo38511a(@mr2 String str) {
        ja0 ja0 = this.f32073a.get();
        return ja0 == null ? f32071a : ja0.mo38511a(str);
    }

    /* renamed from: b */
    public void mo38512b(@mr2 String str, @mr2 String str2, long j, @mr2 p34 p34) {
        o92 f = o92.m59120f();
        f.mo41621k("Deferring native open session: " + str);
        this.f32072a.mo47184a(new la0(str, str2, j, p34));
    }

    /* renamed from: c */
    public boolean mo38513c(@mr2 String str) {
        ja0 ja0 = this.f32073a.get();
        return ja0 != null && ja0.mo38513c(str);
    }

    /* renamed from: d */
    public boolean mo38514d() {
        ja0 ja0 = this.f32073a.get();
        return ja0 != null && ja0.mo38514d();
    }
}
