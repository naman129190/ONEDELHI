package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.C0659m;
import com.onedelhi.secure.C2118f6;
import com.onedelhi.secure.C3345qu;
import com.onedelhi.secure.ab3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.tv2;

/* renamed from: androidx.fragment.app.d */
public class C0638d {

    /* renamed from: androidx.fragment.app.d$a */
    public class C0639a implements C3345qu.C3347b {

        /* renamed from: a */
        public final /* synthetic */ Fragment f3838a;

        public C0639a(Fragment fragment) {
            this.f3838a = fragment;
        }

        public void onCancel() {
            if (this.f3838a.getAnimatingAway() != null) {
                View animatingAway = this.f3838a.getAnimatingAway();
                this.f3838a.setAnimatingAway((View) null);
                animatingAway.clearAnimation();
            }
            this.f3838a.setAnimator((Animator) null);
        }
    }

    /* renamed from: androidx.fragment.app.d$b */
    public class C0640b implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f3839a;

        /* renamed from: a */
        public final /* synthetic */ Fragment f3840a;

        /* renamed from: a */
        public final /* synthetic */ C0659m.C0666g f3841a;

        /* renamed from: a */
        public final /* synthetic */ C3345qu f3842a;

        /* renamed from: androidx.fragment.app.d$b$a */
        public class C0641a implements Runnable {
            public C0641a() {
            }

            public void run() {
                if (C0640b.this.f3840a.getAnimatingAway() != null) {
                    C0640b.this.f3840a.setAnimatingAway((View) null);
                    C0640b bVar = C0640b.this;
                    bVar.f3841a.mo4642b(bVar.f3840a, bVar.f3842a);
                }
            }
        }

        public C0640b(ViewGroup viewGroup, Fragment fragment, C0659m.C0666g gVar, C3345qu quVar) {
            this.f3839a = viewGroup;
            this.f3840a = fragment;
            this.f3841a = gVar;
            this.f3842a = quVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f3839a.post(new C0641a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.d$c */
    public class C0642c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f3844a;

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f3845a;

        /* renamed from: a */
        public final /* synthetic */ Fragment f3846a;

        /* renamed from: a */
        public final /* synthetic */ C0659m.C0666g f3847a;

        /* renamed from: a */
        public final /* synthetic */ C3345qu f3848a;

        public C0642c(ViewGroup viewGroup, View view, Fragment fragment, C0659m.C0666g gVar, C3345qu quVar) {
            this.f3845a = viewGroup;
            this.f3844a = view;
            this.f3846a = fragment;
            this.f3847a = gVar;
            this.f3848a = quVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3845a.endViewTransition(this.f3844a);
            Animator animator2 = this.f3846a.getAnimator();
            this.f3846a.setAnimator((Animator) null);
            if (animator2 != null && this.f3845a.indexOfChild(this.f3844a) < 0) {
                this.f3847a.mo4642b(this.f3846a, this.f3848a);
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d */
    public static class C0643d {

        /* renamed from: a */
        public final Animator f3849a;

        /* renamed from: a */
        public final Animation f3850a;

        public C0643d(Animator animator) {
            this.f3850a = null;
            this.f3849a = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        public C0643d(Animation animation) {
            this.f3850a = animation;
            this.f3849a = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$e */
    public static class C0644e extends AnimationSet implements Runnable {

        /* renamed from: a */
        public final View f3851a;

        /* renamed from: a */
        public final ViewGroup f3852a;

        /* renamed from: b */
        public boolean f3853b;

        /* renamed from: c */
        public boolean f3854c;

        /* renamed from: d */
        public boolean f3855d = true;

        public C0644e(@mr2 Animation animation, @mr2 ViewGroup viewGroup, @mr2 View view) {
            super(false);
            this.f3852a = viewGroup;
            this.f3851a = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j, @mr2 Transformation transformation) {
            this.f3855d = true;
            if (this.f3853b) {
                return !this.f3854c;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f3853b = true;
                tv2.m28961a(this.f3852a, this);
            }
            return true;
        }

        public boolean getTransformation(long j, @mr2 Transformation transformation, float f) {
            this.f3855d = true;
            if (this.f3853b) {
                return !this.f3854c;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f3853b = true;
                tv2.m28961a(this.f3852a, this);
            }
            return true;
        }

        public void run() {
            if (this.f3853b || !this.f3855d) {
                this.f3852a.endViewTransition(this.f3851a);
                this.f3854c = true;
                return;
            }
            this.f3855d = false;
            this.f3852a.post(this);
        }
    }

    /* renamed from: a */
    public static void m4536a(@mr2 Fragment fragment, @mr2 C0643d dVar, @mr2 C0659m.C0666g gVar) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        C3345qu quVar = new C3345qu();
        quVar.mo23442d(new C0639a(fragment));
        gVar.mo4641a(fragment, quVar);
        if (dVar.f3850a != null) {
            C0644e eVar = new C0644e(dVar.f3850a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            eVar.setAnimationListener(new C0640b(viewGroup, fragment, gVar, quVar));
            fragment.mView.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f3849a;
        fragment.setAnimator(animator);
        animator.addListener(new C0642c(viewGroup, view, fragment, gVar, quVar));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    /* renamed from: b */
    public static int m4537b(Fragment fragment, boolean z, boolean z2) {
        return z2 ? z ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    /* renamed from: c */
    public static C0643d m4538c(@mr2 Context context, @mr2 Fragment fragment, boolean z, boolean z2) {
        int nextTransition = fragment.getNextTransition();
        int b = m4537b(fragment, z, z2);
        boolean z3 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i = ab3.C1684g.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i) != null) {
                fragment.mContainer.setTag(i, (Object) null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, b);
        if (onCreateAnimation != null) {
            return new C0643d(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, b);
        if (onCreateAnimator != null) {
            return new C0643d(onCreateAnimator);
        }
        if (b == 0 && nextTransition != 0) {
            b = m4539d(nextTransition, z);
        }
        if (b != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(b));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, b);
                    if (loadAnimation != null) {
                        return new C0643d(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, b);
                    if (loadAnimator != null) {
                        return new C0643d(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, b);
                        if (loadAnimation2 != null) {
                            return new C0643d(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        return null;
    }

    @C2118f6
    /* renamed from: d */
    public static int m4539d(int i, boolean z) {
        if (i == 4097) {
            return z ? ab3.C1679b.fragment_open_enter : ab3.C1679b.fragment_open_exit;
        }
        if (i == 4099) {
            return z ? ab3.C1679b.fragment_fade_enter : ab3.C1679b.fragment_fade_exit;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? ab3.C1679b.fragment_close_enter : ab3.C1679b.fragment_close_exit;
    }
}
