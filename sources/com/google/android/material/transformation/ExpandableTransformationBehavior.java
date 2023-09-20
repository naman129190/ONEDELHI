package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.onedelhi.secure.C3740us;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    @ts2

    /* renamed from: a */
    public AnimatorSet f24847a;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    public class C4295a extends AnimatorListenerAdapter {
        public C4295a() {
        }

        public void onAnimationEnd(Animator animator) {
            AnimatorSet unused = ExpandableTransformationBehavior.this.f24847a = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @C3740us
    /* renamed from: K */
    public boolean mo29628K(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f24847a;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet M = mo29630M(view, view2, z, z3);
        this.f24847a = M;
        M.addListener(new C4295a());
        this.f24847a.start();
        if (!z2) {
            this.f24847a.end();
        }
        return true;
    }

    @mr2
    /* renamed from: M */
    public abstract AnimatorSet mo29630M(View view, View view2, boolean z, boolean z2);
}
