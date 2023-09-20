package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.onedelhi.secure.C3740us;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sx0;
import com.onedelhi.secure.ts2;
import java.util.List;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: b */
    public static final int f24839b = 0;

    /* renamed from: c */
    public static final int f24840c = 1;

    /* renamed from: d */
    public static final int f24841d = 2;

    /* renamed from: a */
    public int f24842a = 0;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    public class C4294a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        public final /* synthetic */ View f24843a;

        /* renamed from: a */
        public final /* synthetic */ sx0 f24845a;

        /* renamed from: n */
        public final /* synthetic */ int f24846n;

        public C4294a(View view, int i, sx0 sx0) {
            this.f24843a = view;
            this.f24846n = i;
            this.f24845a = sx0;
        }

        public boolean onPreDraw() {
            this.f24843a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f24842a == this.f24846n) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                sx0 sx0 = this.f24845a;
                expandableBehavior.mo29628K((View) sx0, this.f24843a, sx0.mo12262b(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @ts2
    /* renamed from: J */
    public static <T extends ExpandableBehavior> T m34552J(@mr2 View view, @mr2 Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.C0459f) {
            CoordinatorLayout.Behavior f = ((CoordinatorLayout.C0459f) layoutParams).mo3676f();
            if (f instanceof ExpandableBehavior) {
                return (ExpandableBehavior) cls.cast(f);
            }
            throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: H */
    public final boolean mo29626H(boolean z) {
        if (!z) {
            return this.f24842a == 1;
        }
        int i = this.f24842a;
        return i == 0 || i == 2;
    }

    @ts2
    /* renamed from: I */
    public sx0 mo29627I(@mr2 CoordinatorLayout coordinatorLayout, @mr2 View view) {
        List<View> w = coordinatorLayout.mo3633w(view);
        int size = w.size();
        for (int i = 0; i < size; i++) {
            View view2 = w.get(i);
            if (mo3646f(coordinatorLayout, view, view2)) {
                return (sx0) view2;
            }
        }
        return null;
    }

    /* renamed from: K */
    public abstract boolean mo29628K(View view, View view2, boolean z, boolean z2);

    /* renamed from: f */
    public abstract boolean mo3646f(CoordinatorLayout coordinatorLayout, View view, View view2);

    @C3740us
    /* renamed from: i */
    public boolean mo3649i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        sx0 sx0 = (sx0) view2;
        if (!mo29626H(sx0.mo12262b())) {
            return false;
        }
        this.f24842a = sx0.mo12262b() ? 1 : 2;
        return mo29628K((View) sx0, view, sx0.mo12262b(), true);
    }

    @C3740us
    /* renamed from: m */
    public boolean mo3653m(@mr2 CoordinatorLayout coordinatorLayout, @mr2 View view, int i) {
        sx0 I;
        if (jt4.m18914U0(view) || (I = mo29627I(coordinatorLayout, view)) == null || !mo29626H(I.mo12262b())) {
            return false;
        }
        int i2 = I.mo12262b() ? 1 : 2;
        this.f24842a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new C4294a(view, i2, I));
        return false;
    }
}
