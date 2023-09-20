package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.rf2;
import com.onedelhi.secure.ri1;
import com.onedelhi.secure.sx4;
import com.onedelhi.secure.ts2;
import java.util.List;

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* renamed from: a */
    public final Rect f7717a = new Rect();

    /* renamed from: b */
    public final Rect f7718b = new Rect();

    /* renamed from: c */
    public int f7719c = 0;

    /* renamed from: d */
    public int f7720d;

    public HeaderScrollingViewBehavior() {
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: V */
    public static int m9388V(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* renamed from: K */
    public void mo11060K(@mr2 CoordinatorLayout coordinatorLayout, @mr2 View view, int i) {
        int i2;
        View P = mo10941P(coordinatorLayout.mo3633w(view));
        if (P != null) {
            CoordinatorLayout.C0459f fVar = (CoordinatorLayout.C0459f) view.getLayoutParams();
            Rect rect = this.f7717a;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, P.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((coordinatorLayout.getHeight() + P.getBottom()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            sx4 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && jt4.m18913U(coordinatorLayout) && !jt4.m18913U(view)) {
                rect.left += lastWindowInsets.mo24603p();
                rect.right -= lastWindowInsets.mo24604q();
            }
            Rect rect2 = this.f7718b;
            ri1.m26760b(m9388V(fVar.f3216a), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int Q = mo11061Q(P);
            view.layout(rect2.left, rect2.top - Q, rect2.right, rect2.bottom - Q);
            i2 = rect2.top - P.getBottom();
        } else {
            super.mo11060K(coordinatorLayout, view, i);
            i2 = 0;
        }
        this.f7719c = i2;
    }

    @ts2
    /* renamed from: P */
    public abstract View mo10941P(List<View> list);

    /* renamed from: Q */
    public final int mo11061Q(View view) {
        if (this.f7720d == 0) {
            return 0;
        }
        float R = mo10942R(view);
        int i = this.f7720d;
        return rf2.m26699e((int) (R * ((float) i)), 0, i);
    }

    /* renamed from: R */
    public float mo10942R(View view) {
        return 1.0f;
    }

    /* renamed from: S */
    public final int mo11062S() {
        return this.f7720d;
    }

    /* renamed from: T */
    public int mo10943T(@mr2 View view) {
        return view.getMeasuredHeight();
    }

    /* renamed from: U */
    public final int mo11063U() {
        return this.f7719c;
    }

    /* renamed from: W */
    public final void mo11064W(int i) {
        this.f7720d = i;
    }

    /* renamed from: X */
    public boolean mo11065X() {
        return false;
    }

    /* renamed from: n */
    public boolean mo3654n(@mr2 CoordinatorLayout coordinatorLayout, @mr2 View view, int i, int i2, int i3, int i4) {
        View P;
        sx4 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (P = mo10941P(coordinatorLayout.mo3633w(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (jt4.m18913U(P) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.mo24605r() + lastWindowInsets.mo24602o();
        }
        int T = size + mo10943T(P);
        int measuredHeight = P.getMeasuredHeight();
        if (mo11065X()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            view.setTranslationY(0.0f);
            T -= measuredHeight;
        }
        coordinatorLayout.mo3584O(view, i, i2, View.MeasureSpec.makeMeasureSpec(T, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }
}
