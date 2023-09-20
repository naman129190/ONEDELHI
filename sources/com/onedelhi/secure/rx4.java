package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.view.WindowInsetsAnimationController;

public final class rx4 {

    /* renamed from: a */
    public final C3457b f20108a;

    @sj3(30)
    /* renamed from: com.onedelhi.secure.rx4$a */
    public static class C3456a extends C3457b {

        /* renamed from: a */
        public final WindowInsetsAnimationController f20109a;

        public C3456a(@mr2 WindowInsetsAnimationController windowInsetsAnimationController) {
            this.f20109a = windowInsetsAnimationController;
        }

        /* renamed from: a */
        public void mo24102a(boolean z) {
            this.f20109a.finish(z);
        }

        /* renamed from: b */
        public float mo24103b() {
            return this.f20109a.getCurrentAlpha();
        }

        /* renamed from: c */
        public float mo24104c() {
            return this.f20109a.getCurrentFraction();
        }

        @mr2
        /* renamed from: d */
        public gr1 mo24105d() {
            return gr1.m16162g(this.f20109a.getCurrentInsets());
        }

        @mr2
        /* renamed from: e */
        public gr1 mo24106e() {
            return gr1.m16162g(this.f20109a.getHiddenStateInsets());
        }

        @mr2
        /* renamed from: f */
        public gr1 mo24107f() {
            return gr1.m16162g(this.f20109a.getShownStateInsets());
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: g */
        public int mo24108g() {
            return this.f20109a.getTypes();
        }

        /* renamed from: h */
        public boolean mo24109h() {
            return this.f20109a.isCancelled();
        }

        /* renamed from: i */
        public boolean mo24110i() {
            return this.f20109a.isFinished();
        }

        /* renamed from: j */
        public boolean mo24111j() {
            return this.f20109a.isReady();
        }

        /* renamed from: k */
        public void mo24112k(@ts2 gr1 gr1, float f, float f2) {
            this.f20109a.setInsetsAndAlpha(gr1 == null ? null : gr1.mo16836h(), f, f2);
        }
    }

    /* renamed from: com.onedelhi.secure.rx4$b */
    public static class C3457b {
        /* renamed from: a */
        public void mo24102a(boolean z) {
        }

        /* renamed from: b */
        public float mo24103b() {
            return 0.0f;
        }

        @d81(from = 0.0d, mo14561to = 1.0d)
        /* renamed from: c */
        public float mo24104c() {
            return 0.0f;
        }

        @mr2
        /* renamed from: d */
        public gr1 mo24105d() {
            return gr1.f12721a;
        }

        @mr2
        /* renamed from: e */
        public gr1 mo24106e() {
            return gr1.f12721a;
        }

        @mr2
        /* renamed from: f */
        public gr1 mo24107f() {
            return gr1.f12721a;
        }

        /* renamed from: g */
        public int mo24108g() {
            return 0;
        }

        /* renamed from: h */
        public boolean mo24109h() {
            return true;
        }

        /* renamed from: i */
        public boolean mo24110i() {
            return false;
        }

        /* renamed from: j */
        public boolean mo24111j() {
            return false;
        }

        /* renamed from: k */
        public void mo24112k(@ts2 gr1 gr1, @d81(from = 0.0d, mo14561to = 1.0d) float f, @d81(from = 0.0d, mo14561to = 1.0d) float f2) {
        }
    }

    @sj3(30)
    public rx4(@mr2 WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f20108a = new C3456a(windowInsetsAnimationController);
    }

    /* renamed from: a */
    public void mo24091a(boolean z) {
        this.f20108a.mo24102a(z);
    }

    /* renamed from: b */
    public float mo24092b() {
        return this.f20108a.mo24103b();
    }

    @d81(from = 0.0d, mo14561to = 1.0d)
    /* renamed from: c */
    public float mo24093c() {
        return this.f20108a.mo24104c();
    }

    @mr2
    /* renamed from: d */
    public gr1 mo24094d() {
        return this.f20108a.mo24105d();
    }

    @mr2
    /* renamed from: e */
    public gr1 mo24095e() {
        return this.f20108a.mo24106e();
    }

    @mr2
    /* renamed from: f */
    public gr1 mo24096f() {
        return this.f20108a.mo24107f();
    }

    /* renamed from: g */
    public int mo24097g() {
        return this.f20108a.mo24108g();
    }

    /* renamed from: h */
    public boolean mo24098h() {
        return this.f20108a.mo24109h();
    }

    /* renamed from: i */
    public boolean mo24099i() {
        return this.f20108a.mo24110i();
    }

    /* renamed from: j */
    public boolean mo24100j() {
        return !mo24099i() && !mo24098h();
    }

    /* renamed from: k */
    public void mo24101k(@ts2 gr1 gr1, @d81(from = 0.0d, mo14561to = 1.0d) float f, @d81(from = 0.0d, mo14561to = 1.0d) float f2) {
        this.f20108a.mo24112k(gr1, f, f2);
    }
}
