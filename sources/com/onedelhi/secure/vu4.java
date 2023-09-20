package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class vu4 {

    /* renamed from: b */
    public static final int f21968b = 2113929216;

    /* renamed from: a */
    public int f21969a = -1;

    /* renamed from: a */
    public Runnable f21970a = null;

    /* renamed from: a */
    public final WeakReference<View> f21971a;

    /* renamed from: b */
    public Runnable f21972b = null;

    /* renamed from: com.onedelhi.secure.vu4$a */
    public class C3811a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f21973a;

        /* renamed from: a */
        public final /* synthetic */ xu4 f21975a;

        public C3811a(xu4 xu4, View view) {
            this.f21975a = xu4;
            this.f21973a = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f21975a.mo2607c(this.f21973a);
        }

        public void onAnimationEnd(Animator animator) {
            this.f21975a.mo1068a(this.f21973a);
        }

        public void onAnimationStart(Animator animator) {
            this.f21975a.mo1069b(this.f21973a);
        }
    }

    @sj3(16)
    /* renamed from: com.onedelhi.secure.vu4$b */
    public static class C3812b {
        @pn0
        /* renamed from: a */
        public static ViewPropertyAnimator m30510a(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withEndAction(runnable);
        }

        @pn0
        /* renamed from: b */
        public static ViewPropertyAnimator m30511b(ViewPropertyAnimator viewPropertyAnimator) {
            return viewPropertyAnimator.withLayer();
        }

        @pn0
        /* renamed from: c */
        public static ViewPropertyAnimator m30512c(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withStartAction(runnable);
        }
    }

    @sj3(18)
    /* renamed from: com.onedelhi.secure.vu4$c */
    public static class C3813c {
        @pn0
        /* renamed from: a */
        public static Interpolator m30513a(ViewPropertyAnimator viewPropertyAnimator) {
            return (Interpolator) viewPropertyAnimator.getInterpolator();
        }
    }

    @sj3(19)
    /* renamed from: com.onedelhi.secure.vu4$d */
    public static class C3814d {
        @pn0
        /* renamed from: a */
        public static ViewPropertyAnimator m30514a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    @sj3(21)
    /* renamed from: com.onedelhi.secure.vu4$e */
    public static class C3815e {
        @pn0
        /* renamed from: a */
        public static ViewPropertyAnimator m30515a(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.translationZ(f);
        }

        @pn0
        /* renamed from: b */
        public static ViewPropertyAnimator m30516b(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.translationZBy(f);
        }

        @pn0
        /* renamed from: c */
        public static ViewPropertyAnimator m30517c(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.z(f);
        }

        @pn0
        /* renamed from: d */
        public static ViewPropertyAnimator m30518d(ViewPropertyAnimator viewPropertyAnimator, float f) {
            return viewPropertyAnimator.zBy(f);
        }
    }

    /* renamed from: com.onedelhi.secure.vu4$f */
    public static class C3816f implements xu4 {

        /* renamed from: a */
        public vu4 f21976a;

        /* renamed from: a */
        public boolean f21977a;

        public C3816f(vu4 vu4) {
            this.f21976a = vu4;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.onedelhi.secure.xu4} */
        /* JADX WARNING: Multi-variable type inference failed */
        @android.annotation.SuppressLint({"WrongConstant"})
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1068a(@com.onedelhi.secure.mr2 android.view.View r4) {
            /*
                r3 = this;
                com.onedelhi.secure.vu4 r0 = r3.f21976a
                int r0 = r0.f21969a
                r1 = -1
                r2 = 0
                if (r0 <= r1) goto L_0x000f
                r4.setLayerType(r0, r2)
                com.onedelhi.secure.vu4 r0 = r3.f21976a
                r0.f21969a = r1
            L_0x000f:
                com.onedelhi.secure.vu4 r0 = r3.f21976a
                java.lang.Runnable r1 = r0.f21972b
                if (r1 == 0) goto L_0x001a
                r0.f21972b = r2
                r1.run()
            L_0x001a:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r1 = r0 instanceof com.onedelhi.secure.xu4
                if (r1 == 0) goto L_0x0027
                r2 = r0
                com.onedelhi.secure.xu4 r2 = (com.onedelhi.secure.xu4) r2
            L_0x0027:
                if (r2 == 0) goto L_0x002c
                r2.mo1068a(r4)
            L_0x002c:
                r4 = 1
                r3.f21977a = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vu4.C3816f.mo1068a(android.view.View):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.onedelhi.secure.xu4} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1069b(@com.onedelhi.secure.mr2 android.view.View r4) {
            /*
                r3 = this;
                r0 = 0
                r3.f21977a = r0
                com.onedelhi.secure.vu4 r0 = r3.f21976a
                int r0 = r0.f21969a
                r1 = 0
                r2 = -1
                if (r0 <= r2) goto L_0x000f
                r0 = 2
                r4.setLayerType(r0, r1)
            L_0x000f:
                com.onedelhi.secure.vu4 r0 = r3.f21976a
                java.lang.Runnable r2 = r0.f21970a
                if (r2 == 0) goto L_0x001a
                r0.f21970a = r1
                r2.run()
            L_0x001a:
                r0 = 2113929216(0x7e000000, float:4.2535296E37)
                java.lang.Object r0 = r4.getTag(r0)
                boolean r2 = r0 instanceof com.onedelhi.secure.xu4
                if (r2 == 0) goto L_0x0027
                r1 = r0
                com.onedelhi.secure.xu4 r1 = (com.onedelhi.secure.xu4) r1
            L_0x0027:
                if (r1 == 0) goto L_0x002c
                r1.mo1069b(r4)
            L_0x002c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.vu4.C3816f.mo1069b(android.view.View):void");
        }

        /* renamed from: c */
        public void mo2607c(@mr2 View view) {
            Object tag = view.getTag(vu4.f21968b);
            xu4 xu4 = tag instanceof xu4 ? (xu4) tag : null;
            if (xu4 != null) {
                xu4.mo2607c(view);
            }
        }
    }

    public vu4(View view) {
        this.f21971a = new WeakReference<>(view);
    }

    @mr2
    /* renamed from: A */
    public vu4 mo26340A(float f) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().translationXBy(f);
        }
        return this;
    }

    @mr2
    /* renamed from: B */
    public vu4 mo26341B(float f) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    @mr2
    /* renamed from: C */
    public vu4 mo26342C(float f) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().translationYBy(f);
        }
        return this;
    }

    @mr2
    /* renamed from: D */
    public vu4 mo26343D(float f) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            C3815e.m30515a(view.animate(), f);
        }
        return this;
    }

    @mr2
    /* renamed from: E */
    public vu4 mo26344E(float f) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            C3815e.m30516b(view.animate(), f);
        }
        return this;
    }

    @mr2
    /* renamed from: F */
    public vu4 mo26345F(@mr2 Runnable runnable) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            C3812b.m30510a(view.animate(), runnable);
        }
        return this;
    }

    @mr2
    @SuppressLint({"WrongConstant"})
    /* renamed from: G */
    public vu4 mo26346G() {
        View view = (View) this.f21971a.get();
        if (view != null) {
            C3812b.m30511b(view.animate());
        }
        return this;
    }

    @mr2
    /* renamed from: H */
    public vu4 mo26347H(@mr2 Runnable runnable) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            C3812b.m30512c(view.animate(), runnable);
        }
        return this;
    }

    @mr2
    /* renamed from: I */
    public vu4 mo26348I(float f) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().x(f);
        }
        return this;
    }

    @mr2
    /* renamed from: J */
    public vu4 mo26349J(float f) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().xBy(f);
        }
        return this;
    }

    @mr2
    /* renamed from: K */
    public vu4 mo26350K(float f) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().y(f);
        }
        return this;
    }

    @mr2
    /* renamed from: L */
    public vu4 mo26351L(float f) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().yBy(f);
        }
        return this;
    }

    @mr2
    /* renamed from: M */
    public vu4 mo26352M(float f) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            C3815e.m30517c(view.animate(), f);
        }
        return this;
    }

    @mr2
    /* renamed from: N */
    public vu4 mo26353N(float f) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            C3815e.m30518d(view.animate(), f);
        }
        return this;
    }

    @mr2
    /* renamed from: b */
    public vu4 mo26354b(float f) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    @mr2
    /* renamed from: c */
    public vu4 mo26355c(float f) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().alphaBy(f);
        }
        return this;
    }

    /* renamed from: d */
    public void mo26356d() {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: e */
    public long mo26357e() {
        View view = (View) this.f21971a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    @ts2
    /* renamed from: f */
    public Interpolator mo26358f() {
        View view = (View) this.f21971a.get();
        if (view != null) {
            return C3813c.m30513a(view.animate());
        }
        return null;
    }

    /* renamed from: g */
    public long mo26359g() {
        View view = (View) this.f21971a.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0;
    }

    @mr2
    /* renamed from: i */
    public vu4 mo26360i(float f) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().rotation(f);
        }
        return this;
    }

    @mr2
    /* renamed from: j */
    public vu4 mo26361j(float f) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().rotationBy(f);
        }
        return this;
    }

    @mr2
    /* renamed from: k */
    public vu4 mo26362k(float f) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().rotationX(f);
        }
        return this;
    }

    @mr2
    /* renamed from: l */
    public vu4 mo26363l(float f) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().rotationXBy(f);
        }
        return this;
    }

    @mr2
    /* renamed from: m */
    public vu4 mo26364m(float f) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().rotationY(f);
        }
        return this;
    }

    @mr2
    /* renamed from: n */
    public vu4 mo26365n(float f) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().rotationYBy(f);
        }
        return this;
    }

    @mr2
    /* renamed from: o */
    public vu4 mo26366o(float f) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
        return this;
    }

    @mr2
    /* renamed from: p */
    public vu4 mo26367p(float f) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().scaleXBy(f);
        }
        return this;
    }

    @mr2
    /* renamed from: q */
    public vu4 mo26368q(float f) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
        return this;
    }

    @mr2
    /* renamed from: r */
    public vu4 mo26369r(float f) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().scaleYBy(f);
        }
        return this;
    }

    @mr2
    /* renamed from: s */
    public vu4 mo26370s(long j) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    @mr2
    /* renamed from: t */
    public vu4 mo26371t(@ts2 Interpolator interpolator) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    @mr2
    /* renamed from: u */
    public vu4 mo26372u(@ts2 xu4 xu4) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            mo26373v(view, xu4);
        }
        return this;
    }

    /* renamed from: v */
    public final void mo26373v(View view, xu4 xu4) {
        if (xu4 != null) {
            view.animate().setListener(new C3811a(xu4, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    @mr2
    /* renamed from: w */
    public vu4 mo26374w(long j) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    @mr2
    /* renamed from: x */
    public vu4 mo26375x(@ts2 zu4 zu4) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            uu4 uu4 = null;
            if (zu4 != null) {
                uu4 = new uu4(zu4, view);
            }
            C3814d.m30514a(view.animate(), uu4);
        }
        return this;
    }

    /* renamed from: y */
    public void mo26376y() {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    @mr2
    /* renamed from: z */
    public vu4 mo26377z(float f) {
        View view = (View) this.f21971a.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }
}
