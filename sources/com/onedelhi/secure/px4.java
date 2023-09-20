package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.nd3;
import com.onedelhi.secure.sx4;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class px4 {

    /* renamed from: a */
    public static final String f18739a = "WindowInsetsAnimCompat";

    /* renamed from: a */
    public static final boolean f18740a = false;

    /* renamed from: a */
    public C3208e f18741a;

    /* renamed from: com.onedelhi.secure.px4$a */
    public static final class C3198a {

        /* renamed from: a */
        public final gr1 f18742a;

        /* renamed from: b */
        public final gr1 f18743b;

        @sj3(30)
        public C3198a(@mr2 WindowInsetsAnimation.Bounds bounds) {
            this.f18742a = C3206d.m25108k(bounds);
            this.f18743b = C3206d.m25107j(bounds);
        }

        public C3198a(@mr2 gr1 gr1, @mr2 gr1 gr12) {
            this.f18742a = gr1;
            this.f18743b = gr12;
        }

        @mr2
        @sj3(30)
        /* renamed from: e */
        public static C3198a m25085e(@mr2 WindowInsetsAnimation.Bounds bounds) {
            return new C3198a(bounds);
        }

        @mr2
        /* renamed from: a */
        public gr1 mo22695a() {
            return this.f18742a;
        }

        @mr2
        /* renamed from: b */
        public gr1 mo22696b() {
            return this.f18743b;
        }

        @mr2
        /* renamed from: c */
        public C3198a mo22697c(@mr2 gr1 gr1) {
            return new C3198a(sx4.m27881z(this.f18742a, gr1.f12722a, gr1.f12723b, gr1.f12724c, gr1.f12725d), sx4.m27881z(this.f18743b, gr1.f12722a, gr1.f12723b, gr1.f12724c, gr1.f12725d));
        }

        @mr2
        @sj3(30)
        /* renamed from: d */
        public WindowInsetsAnimation.Bounds mo22698d() {
            return C3206d.m25106i(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f18742a + " upper=" + this.f18743b + "}";
        }
    }

    /* renamed from: com.onedelhi.secure.px4$b */
    public static abstract class C3199b {

        /* renamed from: b */
        public static final int f18744b = 0;

        /* renamed from: c */
        public static final int f18745c = 1;

        /* renamed from: a */
        public final int f18746a;

        /* renamed from: a */
        public WindowInsets f18747a;

        @hl3({hl3.C2354a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.onedelhi.secure.px4$b$a */
        public @interface C3200a {
        }

        public C3199b(int i) {
            this.f18746a = i;
        }

        /* renamed from: a */
        public final int mo22700a() {
            return this.f18746a;
        }

        /* renamed from: b */
        public void mo22701b(@mr2 px4 px4) {
        }

        /* renamed from: c */
        public void mo22702c(@mr2 px4 px4) {
        }

        @mr2
        /* renamed from: d */
        public abstract sx4 mo22703d(@mr2 sx4 sx4, @mr2 List<px4> list);

        @mr2
        /* renamed from: e */
        public C3198a mo22704e(@mr2 px4 px4, @mr2 C3198a aVar) {
            return aVar;
        }
    }

    @sj3(21)
    /* renamed from: com.onedelhi.secure.px4$c */
    public static class C3201c extends C3208e {

        @sj3(21)
        /* renamed from: com.onedelhi.secure.px4$c$a */
        public static class C3202a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public static final int f18748a = 160;

            /* renamed from: a */
            public final C3199b f18749a;

            /* renamed from: a */
            public sx4 f18750a;

            /* renamed from: com.onedelhi.secure.px4$c$a$a */
            public class C3203a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a */
                public final /* synthetic */ int f18751a;

                /* renamed from: a */
                public final /* synthetic */ View f18752a;

                /* renamed from: a */
                public final /* synthetic */ px4 f18754a;

                /* renamed from: a */
                public final /* synthetic */ sx4 f18755a;

                /* renamed from: b */
                public final /* synthetic */ sx4 f18756b;

                public C3203a(px4 px4, sx4 sx4, sx4 sx42, int i, View view) {
                    this.f18754a = px4;
                    this.f18755a = sx4;
                    this.f18756b = sx42;
                    this.f18751a = i;
                    this.f18752a = view;
                }

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f18754a.mo22694i(valueAnimator.getAnimatedFraction());
                    C3201c.m25100n(this.f18752a, C3201c.m25104r(this.f18755a, this.f18756b, this.f18754a.mo22690d(), this.f18751a), Collections.singletonList(this.f18754a));
                }
            }

            /* renamed from: com.onedelhi.secure.px4$c$a$b */
            public class C3204b extends AnimatorListenerAdapter {

                /* renamed from: a */
                public final /* synthetic */ View f18757a;

                /* renamed from: a */
                public final /* synthetic */ px4 f18759a;

                public C3204b(px4 px4, View view) {
                    this.f18759a = px4;
                    this.f18757a = view;
                }

                public void onAnimationEnd(Animator animator) {
                    this.f18759a.mo22694i(1.0f);
                    C3201c.m25098l(this.f18757a, this.f18759a);
                }
            }

            /* renamed from: com.onedelhi.secure.px4$c$a$c */
            public class C3205c implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ ValueAnimator f18760a;

                /* renamed from: a */
                public final /* synthetic */ View f18761a;

                /* renamed from: a */
                public final /* synthetic */ C3198a f18762a;

                /* renamed from: a */
                public final /* synthetic */ px4 f18764a;

                public C3205c(View view, px4 px4, C3198a aVar, ValueAnimator valueAnimator) {
                    this.f18761a = view;
                    this.f18764a = px4;
                    this.f18762a = aVar;
                    this.f18760a = valueAnimator;
                }

                public void run() {
                    C3201c.m25101o(this.f18761a, this.f18764a, this.f18762a);
                    this.f18760a.start();
                }
            }

            public C3202a(@mr2 View view, @mr2 C3199b bVar) {
                this.f18749a = bVar;
                sx4 o0 = jt4.m18988o0(view);
                this.f18750a = o0 != null ? new sx4.C3548b(o0).mo24613a() : null;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                View view2 = view;
                WindowInsets windowInsets2 = windowInsets;
                if (!view.isLaidOut()) {
                    this.f18750a = sx4.m27880L(windowInsets2, view2);
                } else {
                    sx4 L = sx4.m27880L(windowInsets2, view2);
                    if (this.f18750a == null) {
                        this.f18750a = jt4.m18988o0(view);
                    }
                    if (this.f18750a != null) {
                        C3199b q = C3201c.m25103q(view);
                        if (q != null && Objects.equals(q.f18747a, windowInsets2)) {
                            return C3201c.m25102p(view, windowInsets);
                        }
                        int i = C3201c.m25095i(L, this.f18750a);
                        if (i == 0) {
                            return C3201c.m25102p(view, windowInsets);
                        }
                        sx4 sx4 = this.f18750a;
                        px4 px4 = new px4(i, new DecelerateInterpolator(), 160);
                        px4.mo22694i(0.0f);
                        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(px4.mo22688b());
                        C3198a j = C3201c.m25096j(L, sx4, i);
                        C3201c.m25099m(view2, px4, windowInsets2, false);
                        duration.addUpdateListener(new C3203a(px4, L, sx4, i, view));
                        duration.addListener(new C3204b(px4, view2));
                        tv2.m28961a(view2, new C3205c(view, px4, j, duration));
                    }
                    this.f18750a = L;
                }
                return C3201c.m25102p(view, windowInsets);
            }
        }

        public C3201c(int i, @ts2 Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: i */
        public static int m25095i(@mr2 sx4 sx4, @mr2 sx4 sx42) {
            int i = 0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if (!sx4.mo24592f(i2).equals(sx42.mo24592f(i2))) {
                    i |= i2;
                }
            }
            return i;
        }

        @mr2
        /* renamed from: j */
        public static C3198a m25096j(@mr2 sx4 sx4, @mr2 sx4 sx42, int i) {
            gr1 f = sx4.mo24592f(i);
            gr1 f2 = sx42.mo24592f(i);
            return new C3198a(gr1.m16159d(Math.min(f.f12722a, f2.f12722a), Math.min(f.f12723b, f2.f12723b), Math.min(f.f12724c, f2.f12724c), Math.min(f.f12725d, f2.f12725d)), gr1.m16159d(Math.max(f.f12722a, f2.f12722a), Math.max(f.f12723b, f2.f12723b), Math.max(f.f12724c, f2.f12724c), Math.max(f.f12725d, f2.f12725d)));
        }

        @mr2
        /* renamed from: k */
        public static View.OnApplyWindowInsetsListener m25097k(@mr2 View view, @mr2 C3199b bVar) {
            return new C3202a(view, bVar);
        }

        /* renamed from: l */
        public static void m25098l(@mr2 View view, @mr2 px4 px4) {
            C3199b q = m25103q(view);
            if (q != null) {
                q.mo22701b(px4);
                if (q.mo22700a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m25098l(viewGroup.getChildAt(i), px4);
                }
            }
        }

        /* renamed from: m */
        public static void m25099m(View view, px4 px4, WindowInsets windowInsets, boolean z) {
            C3199b q = m25103q(view);
            if (q != null) {
                q.f18747a = windowInsets;
                if (!z) {
                    q.mo22702c(px4);
                    z = q.mo22700a() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m25099m(viewGroup.getChildAt(i), px4, windowInsets, z);
                }
            }
        }

        /* renamed from: n */
        public static void m25100n(@mr2 View view, @mr2 sx4 sx4, @mr2 List<px4> list) {
            C3199b q = m25103q(view);
            if (q != null) {
                sx4 = q.mo22703d(sx4, list);
                if (q.mo22700a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m25100n(viewGroup.getChildAt(i), sx4, list);
                }
            }
        }

        /* renamed from: o */
        public static void m25101o(View view, px4 px4, C3198a aVar) {
            C3199b q = m25103q(view);
            if (q != null) {
                q.mo22704e(px4, aVar);
                if (q.mo22700a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m25101o(viewGroup.getChildAt(i), px4, aVar);
                }
            }
        }

        @mr2
        /* renamed from: p */
        public static WindowInsets m25102p(@mr2 View view, @mr2 WindowInsets windowInsets) {
            return view.getTag(nd3.C2969e.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        @ts2
        /* renamed from: q */
        public static C3199b m25103q(View view) {
            Object tag = view.getTag(nd3.C2969e.tag_window_insets_animation_callback);
            if (tag instanceof C3202a) {
                return ((C3202a) tag).f18749a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: r */
        public static sx4 m25104r(sx4 sx4, sx4 sx42, float f, int i) {
            gr1 gr1;
            sx4.C3548b bVar = new sx4.C3548b(sx4);
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) == 0) {
                    gr1 = sx4.mo24592f(i2);
                } else {
                    gr1 f2 = sx4.mo24592f(i2);
                    gr1 f3 = sx42.mo24592f(i2);
                    float f4 = 1.0f - f;
                    gr1 = sx4.m27881z(f2, (int) (((double) (((float) (f2.f12722a - f3.f12722a)) * f4)) + 0.5d), (int) (((double) (((float) (f2.f12723b - f3.f12723b)) * f4)) + 0.5d), (int) (((double) (((float) (f2.f12724c - f3.f12724c)) * f4)) + 0.5d), (int) (((double) (((float) (f2.f12725d - f3.f12725d)) * f4)) + 0.5d));
                }
                bVar.mo24615c(i2, gr1);
            }
            return bVar.mo24613a();
        }

        /* renamed from: s */
        public static void m25105s(@mr2 View view, @ts2 C3199b bVar) {
            Object tag = view.getTag(nd3.C2969e.tag_on_apply_window_listener);
            if (bVar == null) {
                view.setTag(nd3.C2969e.tag_window_insets_animation_callback, (Object) null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener k = m25097k(view, bVar);
            view.setTag(nd3.C2969e.tag_window_insets_animation_callback, k);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(k);
            }
        }
    }

    @sj3(30)
    /* renamed from: com.onedelhi.secure.px4$d */
    public static class C3206d extends C3208e {
        @mr2

        /* renamed from: a */
        public final WindowInsetsAnimation f18765a;

        @sj3(30)
        /* renamed from: com.onedelhi.secure.px4$d$a */
        public static class C3207a extends WindowInsetsAnimation.Callback {

            /* renamed from: a */
            public final C3199b f18766a;

            /* renamed from: a */
            public ArrayList<px4> f18767a;

            /* renamed from: a */
            public final HashMap<WindowInsetsAnimation, px4> f18768a = new HashMap<>();

            /* renamed from: a */
            public List<px4> f18769a;

            public C3207a(@mr2 C3199b bVar) {
                super(bVar.mo22700a());
                this.f18766a = bVar;
            }

            @mr2
            /* renamed from: a */
            public final px4 mo22715a(@mr2 WindowInsetsAnimation windowInsetsAnimation) {
                px4 px4 = this.f18768a.get(windowInsetsAnimation);
                if (px4 != null) {
                    return px4;
                }
                px4 j = px4.m25076j(windowInsetsAnimation);
                this.f18768a.put(windowInsetsAnimation, j);
                return j;
            }

            public void onEnd(@mr2 WindowInsetsAnimation windowInsetsAnimation) {
                this.f18766a.mo22701b(mo22715a(windowInsetsAnimation));
                this.f18768a.remove(windowInsetsAnimation);
            }

            public void onPrepare(@mr2 WindowInsetsAnimation windowInsetsAnimation) {
                this.f18766a.mo22702c(mo22715a(windowInsetsAnimation));
            }

            @mr2
            public WindowInsets onProgress(@mr2 WindowInsets windowInsets, @mr2 List<WindowInsetsAnimation> list) {
                ArrayList<px4> arrayList = this.f18767a;
                if (arrayList == null) {
                    ArrayList<px4> arrayList2 = new ArrayList<>(list.size());
                    this.f18767a = arrayList2;
                    this.f18769a = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                    px4 a = mo22715a(windowInsetsAnimation);
                    a.mo22694i(windowInsetsAnimation.getFraction());
                    this.f18767a.add(a);
                }
                return this.f18766a.mo22703d(sx4.m27879K(windowInsets), this.f18769a).mo24585J();
            }

            @mr2
            public WindowInsetsAnimation.Bounds onStart(@mr2 WindowInsetsAnimation windowInsetsAnimation, @mr2 WindowInsetsAnimation.Bounds bounds) {
                return this.f18766a.mo22704e(mo22715a(windowInsetsAnimation), C3198a.m25085e(bounds)).mo22698d();
            }
        }

        public C3206d(int i, Interpolator interpolator, long j) {
            this(new WindowInsetsAnimation(i, interpolator, j));
        }

        public C3206d(@mr2 WindowInsetsAnimation windowInsetsAnimation) {
            super(0, (Interpolator) null, 0);
            this.f18765a = windowInsetsAnimation;
        }

        @mr2
        /* renamed from: i */
        public static WindowInsetsAnimation.Bounds m25106i(@mr2 C3198a aVar) {
            return new WindowInsetsAnimation.Bounds(aVar.mo22695a().mo16836h(), aVar.mo22696b().mo16836h());
        }

        @mr2
        /* renamed from: j */
        public static gr1 m25107j(@mr2 WindowInsetsAnimation.Bounds bounds) {
            return gr1.m16162g(bounds.getUpperBound());
        }

        @mr2
        /* renamed from: k */
        public static gr1 m25108k(@mr2 WindowInsetsAnimation.Bounds bounds) {
            return gr1.m16162g(bounds.getLowerBound());
        }

        /* renamed from: l */
        public static void m25109l(@mr2 View view, @ts2 C3199b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new C3207a(bVar) : null);
        }

        /* renamed from: b */
        public long mo22709b() {
            return this.f18765a.getDurationMillis();
        }

        /* renamed from: c */
        public float mo22710c() {
            return this.f18765a.getFraction();
        }

        /* renamed from: d */
        public float mo22711d() {
            return this.f18765a.getInterpolatedFraction();
        }

        @ts2
        /* renamed from: e */
        public Interpolator mo22712e() {
            return this.f18765a.getInterpolator();
        }

        /* renamed from: f */
        public int mo22713f() {
            return this.f18765a.getTypeMask();
        }

        /* renamed from: h */
        public void mo22714h(float f) {
            this.f18765a.setFraction(f);
        }
    }

    /* renamed from: com.onedelhi.secure.px4$e */
    public static class C3208e {

        /* renamed from: a */
        public float f18770a;

        /* renamed from: a */
        public final int f18771a;

        /* renamed from: a */
        public final long f18772a;
        @ts2

        /* renamed from: a */
        public final Interpolator f18773a;

        /* renamed from: b */
        public float f18774b;

        public C3208e(int i, @ts2 Interpolator interpolator, long j) {
            this.f18771a = i;
            this.f18773a = interpolator;
            this.f18772a = j;
        }

        /* renamed from: a */
        public float mo22720a() {
            return this.f18774b;
        }

        /* renamed from: b */
        public long mo22709b() {
            return this.f18772a;
        }

        /* renamed from: c */
        public float mo22710c() {
            return this.f18770a;
        }

        /* renamed from: d */
        public float mo22711d() {
            Interpolator interpolator = this.f18773a;
            return interpolator != null ? interpolator.getInterpolation(this.f18770a) : this.f18770a;
        }

        @ts2
        /* renamed from: e */
        public Interpolator mo22712e() {
            return this.f18773a;
        }

        /* renamed from: f */
        public int mo22713f() {
            return this.f18771a;
        }

        /* renamed from: g */
        public void mo22721g(float f) {
            this.f18774b = f;
        }

        /* renamed from: h */
        public void mo22714h(float f) {
            this.f18770a = f;
        }
    }

    public px4(int i, @ts2 Interpolator interpolator, long j) {
        this.f18741a = Build.VERSION.SDK_INT >= 30 ? new C3206d(i, interpolator, j) : new C3201c(i, interpolator, j);
    }

    @sj3(30)
    public px4(@mr2 WindowInsetsAnimation windowInsetsAnimation) {
        this(0, (Interpolator) null, 0);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f18741a = new C3206d(windowInsetsAnimation);
        }
    }

    /* renamed from: h */
    public static void m25075h(@mr2 View view, @ts2 C3199b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            C3206d.m25109l(view, bVar);
        } else {
            C3201c.m25105s(view, bVar);
        }
    }

    @sj3(30)
    /* renamed from: j */
    public static px4 m25076j(WindowInsetsAnimation windowInsetsAnimation) {
        return new px4(windowInsetsAnimation);
    }

    @d81(from = 0.0d, mo14561to = 1.0d)
    /* renamed from: a */
    public float mo22687a() {
        return this.f18741a.mo22720a();
    }

    /* renamed from: b */
    public long mo22688b() {
        return this.f18741a.mo22709b();
    }

    @d81(from = 0.0d, mo14561to = 1.0d)
    /* renamed from: c */
    public float mo22689c() {
        return this.f18741a.mo22710c();
    }

    /* renamed from: d */
    public float mo22690d() {
        return this.f18741a.mo22711d();
    }

    @ts2
    /* renamed from: e */
    public Interpolator mo22691e() {
        return this.f18741a.mo22712e();
    }

    /* renamed from: f */
    public int mo22692f() {
        return this.f18741a.mo22713f();
    }

    /* renamed from: g */
    public void mo22693g(@d81(from = 0.0d, mo14561to = 1.0d) float f) {
        this.f18741a.mo22721g(f);
    }

    /* renamed from: i */
    public void mo22694i(@d81(from = 0.0d, mo14561to = 1.0d) float f) {
        this.f18741a.mo22714h(f);
    }
}
