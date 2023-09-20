package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.onedelhi.secure.C1947d7;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.zk0;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: d */
    public static final int f7731d = 225;

    /* renamed from: e */
    public static final int f7732e = 175;

    /* renamed from: f */
    public static final int f7733f = 1;

    /* renamed from: g */
    public static final int f7734g = 2;

    /* renamed from: a */
    public int f7735a = 0;
    @ts2

    /* renamed from: a */
    public ViewPropertyAnimator f7736a;
    @mr2

    /* renamed from: a */
    public final LinkedHashSet<C1471b> f7737a = new LinkedHashSet<>();
    @C1472c

    /* renamed from: b */
    public int f7738b = 2;

    /* renamed from: c */
    public int f7739c = 0;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    public class C1470a extends AnimatorListenerAdapter {
        public C1470a() {
        }

        public void onAnimationEnd(Animator animator) {
            ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f7736a = null;
        }
    }

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$b */
    public interface C1471b {
        /* renamed from: a */
        void mo11098a(@mr2 View view, @C1472c int i);
    }

    @hl3({hl3.C2354a.f13187b})
    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$c */
    public @interface C1472c {
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: B */
    public boolean mo3638B(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 View view, @mr2 View view2, int i, int i2) {
        return i == 2;
    }

    /* renamed from: H */
    public void mo11085H(@mr2 C1471b bVar) {
        this.f7737a.add(bVar);
    }

    /* renamed from: I */
    public final void mo11086I(@mr2 V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f7736a = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C1470a());
    }

    /* renamed from: J */
    public void mo11087J() {
        this.f7737a.clear();
    }

    /* renamed from: K */
    public boolean mo11088K() {
        return this.f7738b == 1;
    }

    /* renamed from: L */
    public boolean mo11089L() {
        return this.f7738b == 2;
    }

    /* renamed from: M */
    public void mo11090M(@mr2 C1471b bVar) {
        this.f7737a.remove(bVar);
    }

    /* renamed from: N */
    public void mo11091N(@mr2 V v, @zk0 int i) {
        this.f7739c = i;
        if (this.f7738b == 1) {
            v.setTranslationY((float) (this.f7735a + i));
        }
    }

    /* renamed from: O */
    public void mo11092O(@mr2 V v) {
        mo11093P(v, true);
    }

    /* renamed from: P */
    public void mo11093P(@mr2 V v, boolean z) {
        if (!mo11088K()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f7736a;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            mo11096S(v, 1);
            int i = this.f7735a + this.f7739c;
            if (z) {
                mo11086I(v, i, 175, C1947d7.f10651c);
                return;
            }
            v.setTranslationY((float) i);
        }
    }

    /* renamed from: Q */
    public void mo11094Q(@mr2 V v) {
        mo11095R(v, true);
    }

    /* renamed from: R */
    public void mo11095R(@mr2 V v, boolean z) {
        if (!mo11089L()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f7736a;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            mo11096S(v, 2);
            if (z) {
                mo11086I(v, 0, 225, C1947d7.f10652d);
                return;
            }
            v.setTranslationY((float) 0);
        }
    }

    /* renamed from: S */
    public final void mo11096S(@mr2 V v, @C1472c int i) {
        this.f7738b = i;
        Iterator it = this.f7737a.iterator();
        while (it.hasNext()) {
            ((C1471b) it.next()).mo11098a(v, this.f7738b);
        }
    }

    /* renamed from: m */
    public boolean mo3653m(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, int i) {
        this.f7735a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.mo3653m(coordinatorLayout, v, i);
    }

    /* renamed from: u */
    public void mo3661u(CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 View view, int i, int i2, int i3, int i4, int i5, @mr2 int[] iArr) {
        if (i2 > 0) {
            mo11092O(v);
        } else if (i2 < 0) {
            mo11094Q(v);
        }
    }
}
