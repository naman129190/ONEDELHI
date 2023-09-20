package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;

public final class ux4 {

    /* renamed from: a */
    public static final int f21537a = 0;

    /* renamed from: b */
    public static final int f21538b = 1;

    /* renamed from: c */
    public static final int f21539c = 2;

    /* renamed from: a */
    public final C3756e f21540a;

    @sj3(20)
    /* renamed from: com.onedelhi.secure.ux4$a */
    public static class C3751a extends C3756e {
        @mr2

        /* renamed from: a */
        public final View f21541a;
        @mr2

        /* renamed from: a */
        public final Window f21542a;

        public C3751a(@mr2 Window window, @mr2 View view) {
            this.f21542a = window;
            this.f21541a = view;
        }

        /* renamed from: a */
        public void mo25790a(C3757f fVar) {
        }

        /* renamed from: b */
        public void mo25791b(int i, long j, Interpolator interpolator, CancellationSignal cancellationSignal, qx4 qx4) {
        }

        /* renamed from: c */
        public int mo25792c() {
            return 0;
        }

        /* renamed from: d */
        public void mo25793d(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    mo25797m(i2);
                }
            }
        }

        /* renamed from: g */
        public void mo25794g(@mr2 C3757f fVar) {
        }

        /* renamed from: j */
        public void mo25795j(int i) {
            if (i == 0) {
                mo25801r(6144);
            } else if (i == 1) {
                mo25801r(4096);
                mo25798o(2048);
            } else if (i == 2) {
                mo25801r(2048);
                mo25798o(4096);
            }
        }

        /* renamed from: k */
        public void mo25796k(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    mo25800q(i2);
                }
            }
        }

        /* renamed from: m */
        public final void mo25797m(int i) {
            if (i == 1) {
                mo25798o(4);
            } else if (i == 2) {
                mo25798o(2);
            } else if (i == 8) {
                ((InputMethodManager) this.f21542a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f21542a.getDecorView().getWindowToken(), 0);
            }
        }

        /* renamed from: o */
        public void mo25798o(int i) {
            View decorView = this.f21542a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* renamed from: p */
        public void mo25799p(int i) {
            this.f21542a.addFlags(i);
        }

        /* renamed from: q */
        public final void mo25800q(int i) {
            if (i == 1) {
                mo25801r(4);
                mo25802s(1024);
            } else if (i == 2) {
                mo25801r(2);
            } else if (i == 8) {
                View view = this.f21541a;
                if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                    view.requestFocus();
                } else {
                    view = this.f21542a.getCurrentFocus();
                }
                if (view == null) {
                    view = this.f21542a.findViewById(16908290);
                }
                if (view != null && view.hasWindowFocus()) {
                    view.post(new tx4(view));
                }
            }
        }

        /* renamed from: r */
        public void mo25801r(int i) {
            View decorView = this.f21542a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        /* renamed from: s */
        public void mo25802s(int i) {
            this.f21542a.clearFlags(i);
        }
    }

    @sj3(23)
    /* renamed from: com.onedelhi.secure.ux4$b */
    public static class C3752b extends C3751a {
        public C3752b(@mr2 Window window, @ts2 View view) {
            super(window, view);
        }

        /* renamed from: f */
        public boolean mo25803f() {
            return (this.f21542a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        /* renamed from: i */
        public void mo25804i(boolean z) {
            if (z) {
                mo25802s(67108864);
                mo25799p(Integer.MIN_VALUE);
                mo25798o(8192);
                return;
            }
            mo25801r(8192);
        }
    }

    @sj3(26)
    /* renamed from: com.onedelhi.secure.ux4$c */
    public static class C3753c extends C3752b {
        public C3753c(@mr2 Window window, @ts2 View view) {
            super(window, view);
        }

        /* renamed from: e */
        public boolean mo25805e() {
            return (this.f21542a.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        /* renamed from: h */
        public void mo25806h(boolean z) {
            if (z) {
                mo25802s(134217728);
                mo25799p(Integer.MIN_VALUE);
                mo25798o(16);
                return;
            }
            mo25801r(16);
        }
    }

    @sj3(30)
    /* renamed from: com.onedelhi.secure.ux4$d */
    public static class C3754d extends C3756e {

        /* renamed from: a */
        public Window f21543a;

        /* renamed from: a */
        public final WindowInsetsController f21544a;

        /* renamed from: a */
        public final ty3<C3757f, WindowInsetsController.OnControllableInsetsChangedListener> f21545a;

        /* renamed from: a */
        public final ux4 f21546a;

        /* renamed from: com.onedelhi.secure.ux4$d$a */
        public class C3755a implements WindowInsetsAnimationControlListener {

            /* renamed from: a */
            public final /* synthetic */ qx4 f21547a;

            /* renamed from: a */
            public rx4 f21548a = null;

            public C3755a(qx4 qx4) {
                this.f21547a = qx4;
            }

            public void onCancelled(@ts2 WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f21547a.mo23472c(windowInsetsAnimationController == null ? null : this.f21548a);
            }

            public void onFinished(@mr2 WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f21547a.mo23471b(this.f21548a);
            }

            public void onReady(@mr2 WindowInsetsAnimationController windowInsetsAnimationController, int i) {
                rx4 rx4 = new rx4(windowInsetsAnimationController);
                this.f21548a = rx4;
                this.f21547a.mo23470a(rx4, i);
            }
        }

        public C3754d(@mr2 Window window, @mr2 ux4 ux4) {
            this(window.getInsetsController(), ux4);
            this.f21543a = window;
        }

        public C3754d(@mr2 WindowInsetsController windowInsetsController, @mr2 ux4 ux4) {
            this.f21545a = new ty3<>();
            this.f21544a = windowInsetsController;
            this.f21546a = ux4;
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m29714m(C3757f fVar, WindowInsetsController windowInsetsController, int i) {
            if (this.f21544a == windowInsetsController) {
                fVar.mo25812a(this.f21546a, i);
            }
        }

        /* renamed from: a */
        public void mo25790a(@mr2 C3757f fVar) {
            if (!this.f21545a.containsKey(fVar)) {
                vx4 vx4 = new vx4(this, fVar);
                this.f21545a.put(fVar, vx4);
                this.f21544a.addOnControllableInsetsChangedListener(vx4);
            }
        }

        /* renamed from: b */
        public void mo25791b(int i, long j, @ts2 Interpolator interpolator, @ts2 CancellationSignal cancellationSignal, @mr2 qx4 qx4) {
            this.f21544a.controlWindowInsetsAnimation(i, j, interpolator, cancellationSignal, new C3755a(qx4));
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: c */
        public int mo25792c() {
            return this.f21544a.getSystemBarsBehavior();
        }

        /* renamed from: d */
        public void mo25793d(int i) {
            this.f21544a.hide(i);
        }

        /* renamed from: e */
        public boolean mo25805e() {
            return (this.f21544a.getSystemBarsAppearance() & 16) != 0;
        }

        /* renamed from: f */
        public boolean mo25803f() {
            return (this.f21544a.getSystemBarsAppearance() & 8) != 0;
        }

        /* renamed from: g */
        public void mo25794g(@mr2 C3757f fVar) {
            WindowInsetsController.OnControllableInsetsChangedListener remove = this.f21545a.remove(fVar);
            if (remove != null) {
                this.f21544a.removeOnControllableInsetsChangedListener(remove);
            }
        }

        /* renamed from: h */
        public void mo25806h(boolean z) {
            if (z) {
                if (this.f21543a != null) {
                    mo25807n(16);
                }
                this.f21544a.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f21543a != null) {
                mo25808o(16);
            }
            this.f21544a.setSystemBarsAppearance(0, 16);
        }

        /* renamed from: i */
        public void mo25804i(boolean z) {
            if (z) {
                if (this.f21543a != null) {
                    mo25807n(8192);
                }
                this.f21544a.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f21543a != null) {
                mo25808o(8192);
            }
            this.f21544a.setSystemBarsAppearance(0, 8);
        }

        /* renamed from: j */
        public void mo25795j(int i) {
            this.f21544a.setSystemBarsBehavior(i);
        }

        /* renamed from: k */
        public void mo25796k(int i) {
            Window window = this.f21543a;
            if (!(window == null || (i & 8) == 0 || Build.VERSION.SDK_INT >= 32)) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f21544a.show(i);
        }

        /* renamed from: n */
        public void mo25807n(int i) {
            View decorView = this.f21543a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* renamed from: o */
        public void mo25808o(int i) {
            View decorView = this.f21543a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }
    }

    /* renamed from: com.onedelhi.secure.ux4$e */
    public static class C3756e {
        /* renamed from: a */
        public void mo25790a(C3757f fVar) {
        }

        /* renamed from: b */
        public void mo25791b(int i, long j, Interpolator interpolator, CancellationSignal cancellationSignal, qx4 qx4) {
        }

        /* renamed from: c */
        public int mo25792c() {
            return 0;
        }

        /* renamed from: d */
        public void mo25793d(int i) {
        }

        /* renamed from: e */
        public boolean mo25805e() {
            return false;
        }

        /* renamed from: f */
        public boolean mo25803f() {
            return false;
        }

        /* renamed from: g */
        public void mo25794g(@mr2 C3757f fVar) {
        }

        /* renamed from: h */
        public void mo25806h(boolean z) {
        }

        /* renamed from: i */
        public void mo25804i(boolean z) {
        }

        /* renamed from: j */
        public void mo25795j(int i) {
        }

        /* renamed from: k */
        public void mo25796k(int i) {
        }
    }

    /* renamed from: com.onedelhi.secure.ux4$f */
    public interface C3757f {
        /* renamed from: a */
        void mo25812a(@mr2 ux4 ux4, int i);
    }

    public ux4(@mr2 Window window, @mr2 View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f21540a = new C3754d(window, this);
        } else {
            this.f21540a = i >= 26 ? new C3753c(window, view) : i >= 23 ? new C3752b(window, view) : new C3751a(window, view);
        }
    }

    @sj3(30)
    @Deprecated
    public ux4(@mr2 WindowInsetsController windowInsetsController) {
        this.f21540a = new C3754d(windowInsetsController, this);
    }

    @mr2
    @sj3(30)
    @Deprecated
    /* renamed from: l */
    public static ux4 m29682l(@mr2 WindowInsetsController windowInsetsController) {
        return new ux4(windowInsetsController);
    }

    /* renamed from: a */
    public void mo25779a(@mr2 C3757f fVar) {
        this.f21540a.mo25790a(fVar);
    }

    /* renamed from: b */
    public void mo25780b(int i, long j, @ts2 Interpolator interpolator, @ts2 CancellationSignal cancellationSignal, @mr2 qx4 qx4) {
        this.f21540a.mo25791b(i, j, interpolator, cancellationSignal, qx4);
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: c */
    public int mo25781c() {
        return this.f21540a.mo25792c();
    }

    /* renamed from: d */
    public void mo25782d(int i) {
        this.f21540a.mo25793d(i);
    }

    /* renamed from: e */
    public boolean mo25783e() {
        return this.f21540a.mo25805e();
    }

    /* renamed from: f */
    public boolean mo25784f() {
        return this.f21540a.mo25803f();
    }

    /* renamed from: g */
    public void mo25785g(@mr2 C3757f fVar) {
        this.f21540a.mo25794g(fVar);
    }

    /* renamed from: h */
    public void mo25786h(boolean z) {
        this.f21540a.mo25806h(z);
    }

    /* renamed from: i */
    public void mo25787i(boolean z) {
        this.f21540a.mo25804i(z);
    }

    /* renamed from: j */
    public void mo25788j(int i) {
        this.f21540a.mo25795j(i);
    }

    /* renamed from: k */
    public void mo25789k(int i) {
        this.f21540a.mo25796k(i);
    }
}
