package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.google.android.material.circularreveal.C1556c;
import com.onedelhi.secure.mr2;

/* renamed from: com.google.android.material.circularreveal.a */
public final class C1551a {

    /* renamed from: com.google.android.material.circularreveal.a$a */
    public class C1552a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C1556c f8178a;

        public C1552a(C1556c cVar) {
            this.f8178a = cVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f8178a.mo11934d();
        }

        public void onAnimationStart(Animator animator) {
            this.f8178a.mo11933c();
        }
    }

    @mr2
    /* renamed from: a */
    public static Animator m10040a(@mr2 C1556c cVar, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cVar, C1556c.C1559c.f8196a, C1556c.C1558b.f8194a, new C1556c.C1561e[]{new C1556c.C1561e(f, f2, f3)});
        C1556c.C1561e revealInfo = cVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f, (int) f2, revealInfo.f8201c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    @mr2
    /* renamed from: b */
    public static Animator m10041b(C1556c cVar, float f, float f2, float f3, float f4) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(cVar, C1556c.C1559c.f8196a, C1556c.C1558b.f8194a, new C1556c.C1561e[]{new C1556c.C1561e(f, f2, f3), new C1556c.C1561e(f, f2, f4)});
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) cVar, (int) f, (int) f2, f3, f4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
        return animatorSet;
    }

    @mr2
    /* renamed from: c */
    public static Animator.AnimatorListener m10042c(@mr2 C1556c cVar) {
        return new C1552a(cVar);
    }
}
