package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.onedelhi.secure.C2479j7;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ol2;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: a */
    public static final long f24868a = 75;

    /* renamed from: b */
    public static final long f24869b = 150;

    /* renamed from: c */
    public static final long f24870c = 0;

    /* renamed from: d */
    public static final long f24871d = 150;

    /* renamed from: a */
    public final ol2 f24872a = new ol2(75, 150);

    /* renamed from: b */
    public final ol2 f24873b = new ol2(0, 150);

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    public class C4301a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f24874a;

        /* renamed from: a */
        public final /* synthetic */ boolean f24876a;

        public C4301a(boolean z, View view) {
            this.f24876a = z;
            this.f24874a = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f24876a) {
                this.f24874a.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f24876a) {
                this.f24874a.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: E */
    public boolean mo3641E(@mr2 CoordinatorLayout coordinatorLayout, @mr2 View view, @mr2 MotionEvent motionEvent) {
        return super.mo3641E(coordinatorLayout, view, motionEvent);
    }

    @mr2
    /* renamed from: M */
    public AnimatorSet mo29630M(@mr2 View view, @mr2 View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        mo29660N(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C2479j7.m18186a(animatorSet, arrayList);
        animatorSet.addListener(new C4301a(z, view2));
        return animatorSet;
    }

    /* renamed from: N */
    public final void mo29660N(@mr2 View view, boolean z, boolean z2, @mr2 List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        ol2 ol2 = z ? this.f24872a : this.f24873b;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        }
        ol2.mo21979a(objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: f */
    public boolean mo3646f(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }
}
