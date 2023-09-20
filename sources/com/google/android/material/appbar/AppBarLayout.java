package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C1947d7;
import com.onedelhi.secure.C2015e0;
import com.onedelhi.secure.C2018e2;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.C3884x1;
import com.onedelhi.secure.bf2;
import com.onedelhi.secure.bo2;
import com.onedelhi.secure.cf2;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.ju2;
import com.onedelhi.secure.mo1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ot2;
import com.onedelhi.secure.rf2;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.sx4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wo0;
import com.onedelhi.secure.xv4;
import com.onedelhi.secure.zk0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.C0455b {

    /* renamed from: t */
    public static final int f7592t = 0;

    /* renamed from: u */
    public static final int f7593u = 1;

    /* renamed from: v */
    public static final int f7594v = 2;

    /* renamed from: w */
    public static final int f7595w = 4;

    /* renamed from: x */
    public static final int f7596x = 8;

    /* renamed from: y */
    public static final int f7597y = fd3.C2164n.Widget_Design_AppBarLayout;

    /* renamed from: z */
    public static final int f7598z = -1;
    @ts2

    /* renamed from: a */
    public ValueAnimator f7599a;
    @ts2

    /* renamed from: a */
    public Drawable f7600a;

    /* renamed from: a */
    public Behavior f7601a;
    @ts2

    /* renamed from: a */
    public sx4 f7602a;
    @ts2

    /* renamed from: a */
    public WeakReference<View> f7603a;

    /* renamed from: a */
    public List<C1459c> f7604a;

    /* renamed from: a */
    public int[] f7605a;

    /* renamed from: b */
    public final List<C1462f> f7606b;

    /* renamed from: b */
    public boolean f7607b;

    /* renamed from: c */
    public boolean f7608c;

    /* renamed from: d */
    public boolean f7609d;

    /* renamed from: e */
    public boolean f7610e;

    /* renamed from: f */
    public boolean f7611f;

    /* renamed from: n */
    public int f7612n;

    /* renamed from: o */
    public int f7613o;

    /* renamed from: p */
    public int f7614p;

    /* renamed from: q */
    public int f7615q;

    /* renamed from: r */
    public int f7616r;
    @mo1

    /* renamed from: s */
    public int f7617s;

    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {

        /* renamed from: i */
        public static final int f7618i = 600;

        /* renamed from: a */
        public ValueAnimator f7619a;

        /* renamed from: a */
        public C1452e f7620a;

        /* renamed from: a */
        public C1453f f7621a;
        @ts2

        /* renamed from: a */
        public WeakReference<View> f7622a;

        /* renamed from: b */
        public boolean f7623b;

        /* renamed from: g */
        public int f7624g;

        /* renamed from: h */
        public int f7625h;

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a */
        public class C1448a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            public final /* synthetic */ CoordinatorLayout f7626a;

            /* renamed from: a */
            public final /* synthetic */ AppBarLayout f7628a;

            public C1448a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f7626a = coordinatorLayout;
                this.f7628a = appBarLayout;
            }

            public void onAnimationUpdate(@mr2 ValueAnimator valueAnimator) {
                BaseBehavior.this.mo11058X(this.f7626a, this.f7628a, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$b */
        public class C1449b extends C3884x1 {
            public C1449b() {
            }

            /* renamed from: g */
            public void mo3893g(View view, @mr2 C1638a2 a2Var) {
                super.mo3893g(view, a2Var);
                a2Var.mo12498F1(BaseBehavior.this.f7623b);
                a2Var.mo12548W0(ScrollView.class.getName());
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$c */
        public class C1450c implements C2018e2 {

            /* renamed from: a */
            public final /* synthetic */ int f7630a;

            /* renamed from: a */
            public final /* synthetic */ View f7631a;

            /* renamed from: a */
            public final /* synthetic */ CoordinatorLayout f7632a;

            /* renamed from: a */
            public final /* synthetic */ AppBarLayout f7634a;

            public C1450c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
                this.f7632a = coordinatorLayout;
                this.f7634a = appBarLayout;
                this.f7631a = view;
                this.f7630a = i;
            }

            /* renamed from: a */
            public boolean mo4110a(@mr2 View view, @ts2 C2018e2.C2019a aVar) {
                BaseBehavior.this.mo3658r(this.f7632a, this.f7634a, this.f7631a, 0, this.f7630a, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$d */
        public class C1451d implements C2018e2 {

            /* renamed from: a */
            public final /* synthetic */ AppBarLayout f7636a;

            /* renamed from: a */
            public final /* synthetic */ boolean f7637a;

            public C1451d(AppBarLayout appBarLayout, boolean z) {
                this.f7636a = appBarLayout;
                this.f7637a = z;
            }

            /* renamed from: a */
            public boolean mo4110a(@mr2 View view, @ts2 C2018e2.C2019a aVar) {
                this.f7636a.setExpanded(this.f7637a);
                return true;
            }
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$e */
        public static abstract class C1452e<T extends AppBarLayout> {
            /* renamed from: a */
            public abstract boolean mo10918a(@mr2 T t);
        }

        /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$f */
        public static class C1453f extends C2015e0 {
            public static final Parcelable.Creator<C1453f> CREATOR = new C1454a();

            /* renamed from: a */
            public float f7638a;

            /* renamed from: b */
            public boolean f7639b;

            /* renamed from: c */
            public boolean f7640c;

            /* renamed from: d */
            public boolean f7641d;

            /* renamed from: n */
            public int f7642n;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$f$a */
            public class C1454a implements Parcelable.ClassLoaderCreator<C1453f> {
                @ts2
                /* renamed from: a */
                public C1453f createFromParcel(@mr2 Parcel parcel) {
                    return new C1453f(parcel, (ClassLoader) null);
                }

                @mr2
                /* renamed from: b */
                public C1453f createFromParcel(@mr2 Parcel parcel, ClassLoader classLoader) {
                    return new C1453f(parcel, classLoader);
                }

                @mr2
                /* renamed from: c */
                public C1453f[] newArray(int i) {
                    return new C1453f[i];
                }
            }

            public C1453f(@mr2 Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z = true;
                this.f7639b = parcel.readByte() != 0;
                this.f7640c = parcel.readByte() != 0;
                this.f7642n = parcel.readInt();
                this.f7638a = parcel.readFloat();
                this.f7641d = parcel.readByte() == 0 ? false : z;
            }

            public C1453f(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(@mr2 Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.f7639b ? (byte) 1 : 0);
                parcel.writeByte(this.f7640c ? (byte) 1 : 0);
                parcel.writeInt(this.f7642n);
                parcel.writeFloat(this.f7638a);
                parcel.writeByte(this.f7641d ? (byte) 1 : 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: i0 */
        public static boolean m9233i0(int i, int i2) {
            return (i & i2) == i2;
        }

        @ts2
        /* renamed from: l0 */
        public static View m9234l0(@mr2 AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: A0 */
        public void mo3640D(CoordinatorLayout coordinatorLayout, @mr2 T t, View view, int i) {
            if (this.f7625h == 0 || i == 1) {
                mo10885G0(coordinatorLayout, t);
                if (t.mo10854p()) {
                    t.mo10813B(t.mo10816E(view));
                }
            }
            this.f7622a = new WeakReference<>(view);
        }

        /* renamed from: B0 */
        public void mo10880B0(@ts2 C1453f fVar, boolean z) {
            if (this.f7621a == null || z) {
                this.f7621a = fVar;
            }
        }

        @ts2
        /* renamed from: C0 */
        public C1453f mo10881C0(@ts2 Parcelable parcelable, @mr2 T t) {
            int H = mo10926H();
            int childCount = t.getChildCount();
            boolean z = false;
            int i = 0;
            while (i < childCount) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + H;
                if (childAt.getTop() + H > 0 || bottom < 0) {
                    i++;
                } else {
                    if (parcelable == null) {
                        parcelable = C2015e0.f11060a;
                    }
                    C1453f fVar = new C1453f(parcelable);
                    boolean z2 = H == 0;
                    fVar.f7640c = z2;
                    fVar.f7639b = !z2 && (-H) >= t.getTotalScrollRange();
                    fVar.f7642n = i;
                    if (bottom == jt4.m18948e0(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    fVar.f7641d = z;
                    fVar.f7638a = ((float) bottom) / ((float) childAt.getHeight());
                    return fVar;
                }
            }
            return null;
        }

        /* renamed from: D0 */
        public void mo10882D0(@ts2 C1452e eVar) {
            this.f7620a = eVar;
        }

        /* renamed from: E0 */
        public int mo10893Y(@mr2 CoordinatorLayout coordinatorLayout, @mr2 T t, int i, int i2, int i3) {
            int U = mo10891U();
            int i4 = 0;
            if (i2 == 0 || U < i2 || U > i3) {
                this.f7624g = 0;
            } else {
                int e = rf2.m26699e(i, i2, i3);
                if (U != e) {
                    int q0 = t.mo10845l() ? mo10907q0(t, e) : e;
                    boolean N = mo10931N(q0);
                    int i5 = U - e;
                    this.f7624g = e - q0;
                    if (N) {
                        while (i4 < t.getChildCount()) {
                            LayoutParams layoutParams = (LayoutParams) t.getChildAt(i4).getLayoutParams();
                            C1460d b = layoutParams.mo10934b();
                            if (!(b == null || (layoutParams.mo10935c() & 1) == 0)) {
                                b.mo10949a(t, t.getChildAt(i4), (float) mo10926H());
                            }
                            i4++;
                        }
                    }
                    if (!N && t.mo10845l()) {
                        coordinatorLayout.mo3608m(t);
                    }
                    t.mo10856r(mo10926H());
                    mo10887I0(coordinatorLayout, t, e, e < U ? -1 : 1, false);
                    i4 = i5;
                }
            }
            mo10886H0(coordinatorLayout, t);
            return i4;
        }

        /* renamed from: F0 */
        public final boolean mo10884F0(@mr2 CoordinatorLayout coordinatorLayout, @mr2 T t) {
            List<View> x = coordinatorLayout.mo3634x(t);
            int size = x.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.Behavior f = ((CoordinatorLayout.C0459f) x.get(i).getLayoutParams()).mo3676f();
                if (f instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) f).mo11062S() != 0;
                }
            }
            return false;
        }

        /* renamed from: G0 */
        public final void mo10885G0(CoordinatorLayout coordinatorLayout, @mr2 T t) {
            int topInset = t.getTopInset() + t.getPaddingTop();
            int U = mo10891U() - topInset;
            int m0 = mo10903m0(t, U);
            if (m0 >= 0) {
                View childAt = t.getChildAt(m0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int c = layoutParams.mo10935c();
                if ((c & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (m0 == 0 && jt4.m18913U(t) && jt4.m18913U(childAt)) {
                        i -= t.getTopInset();
                    }
                    if (m9233i0(c, 2)) {
                        i2 += jt4.m18948e0(childAt);
                    } else if (m9233i0(c, 5)) {
                        int e0 = jt4.m18948e0(childAt) + i2;
                        if (U < e0) {
                            i = e0;
                        } else {
                            i2 = e0;
                        }
                    }
                    if (m9233i0(c, 32)) {
                        i += layoutParams.topMargin;
                        i2 -= layoutParams.bottomMargin;
                    }
                    mo10896d0(coordinatorLayout, t, rf2.m26699e(mo10898f0(U, i2, i) + topInset, -t.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        /* renamed from: H0 */
        public final void mo10886H0(CoordinatorLayout coordinatorLayout, @mr2 T t) {
            View n0;
            jt4.m19001r1(coordinatorLayout, C1638a2.C1639a.f8650m.mo12636b());
            jt4.m19001r1(coordinatorLayout, C1638a2.C1639a.f8651n.mo12636b());
            if (t.getTotalScrollRange() != 0 && (n0 = mo10904n0(coordinatorLayout)) != null && mo10901j0(t)) {
                if (!jt4.m18868G0(coordinatorLayout)) {
                    jt4.m18849B1(coordinatorLayout, new C1449b());
                }
                this.f7623b = mo10894b0(coordinatorLayout, t, n0);
            }
        }

        /* renamed from: I0 */
        public final void mo10887I0(@mr2 CoordinatorLayout coordinatorLayout, @mr2 T t, int i, int i2, boolean z) {
            View l0 = m9234l0(t, i);
            boolean z2 = false;
            if (l0 != null) {
                int c = ((LayoutParams) l0.getLayoutParams()).mo10935c();
                if ((c & 1) != 0) {
                    int e0 = jt4.m18948e0(l0);
                    if (i2 <= 0 || (c & 12) == 0 ? !((c & 2) == 0 || (-i) < (l0.getBottom() - e0) - t.getTopInset()) : (-i) >= (l0.getBottom() - e0) - t.getTopInset()) {
                        z2 = true;
                    }
                }
            }
            if (t.mo10854p()) {
                z2 = t.mo10816E(mo10902k0(coordinatorLayout));
            }
            boolean B = t.mo10813B(z2);
            if (z || (B && mo10884F0(coordinatorLayout, t))) {
                t.jumpDrawablesToCurrentState();
            }
        }

        /* renamed from: U */
        public int mo10891U() {
            return mo10926H() + this.f7624g;
        }

        /* renamed from: b0 */
        public final boolean mo10894b0(CoordinatorLayout coordinatorLayout, @mr2 T t, @mr2 View view) {
            boolean z = false;
            if (mo10891U() != (-t.getTotalScrollRange())) {
                mo10895c0(coordinatorLayout, t, C1638a2.C1639a.f8650m, false);
                z = true;
            }
            if (mo10891U() != 0) {
                if (view.canScrollVertically(-1)) {
                    int i = -t.getDownNestedPreScrollRange();
                    if (i != 0) {
                        jt4.m19013u1(coordinatorLayout, C1638a2.C1639a.f8651n, (CharSequence) null, new C1450c(coordinatorLayout, t, view, i));
                        return true;
                    }
                } else {
                    mo10895c0(coordinatorLayout, t, C1638a2.C1639a.f8651n, true);
                    return true;
                }
            }
            return z;
        }

        /* renamed from: c0 */
        public final void mo10895c0(CoordinatorLayout coordinatorLayout, @mr2 T t, @mr2 C1638a2.C1639a aVar, boolean z) {
            jt4.m19013u1(coordinatorLayout, aVar, (CharSequence) null, new C1451d(t, z));
        }

        /* renamed from: d0 */
        public final void mo10896d0(CoordinatorLayout coordinatorLayout, @mr2 T t, int i, float f) {
            int abs = Math.abs(mo10891U() - i);
            float abs2 = Math.abs(f);
            mo10897e0(coordinatorLayout, t, i, abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f));
        }

        /* renamed from: e0 */
        public final void mo10897e0(CoordinatorLayout coordinatorLayout, T t, int i, int i2) {
            int U = mo10891U();
            if (U == i) {
                ValueAnimator valueAnimator = this.f7619a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f7619a.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f7619a;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f7619a = valueAnimator3;
                valueAnimator3.setInterpolator(C1947d7.f10653e);
                this.f7619a.addUpdateListener(new C1448a(coordinatorLayout, t));
            } else {
                valueAnimator2.cancel();
            }
            this.f7619a.setDuration((long) Math.min(i2, 600));
            this.f7619a.setIntValues(new int[]{U, i});
            this.f7619a.start();
        }

        /* renamed from: f0 */
        public final int mo10898f0(int i, int i2, int i3) {
            return i < (i2 + i3) / 2 ? i2 : i3;
        }

        /* renamed from: g0 */
        public boolean mo10888P(T t) {
            C1452e eVar = this.f7620a;
            if (eVar != null) {
                return eVar.mo10918a(t);
            }
            WeakReference<View> weakReference = this.f7622a;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return view != null && view.isShown() && !view.canScrollVertically(-1);
        }

        /* renamed from: h0 */
        public final boolean mo10900h0(@mr2 CoordinatorLayout coordinatorLayout, @mr2 T t, @mr2 View view) {
            return t.mo10847n() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        /* renamed from: j0 */
        public final boolean mo10901j0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((LayoutParams) appBarLayout.getChildAt(i).getLayoutParams()).f7655a != 0) {
                    return true;
                }
            }
            return false;
        }

        @ts2
        /* renamed from: k0 */
        public final View mo10902k0(@mr2 CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof bo2) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: m0 */
        public final int mo10903m0(@mr2 T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (m9233i0(layoutParams.mo10935c(), 32)) {
                    top -= layoutParams.topMargin;
                    bottom += layoutParams.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        @ts2
        /* renamed from: n0 */
        public final View mo10904n0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.C0459f) childAt.getLayoutParams()).mo3676f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        /* renamed from: o0 */
        public int mo10889S(@mr2 T t) {
            return -t.getDownNestedScrollRange();
        }

        /* renamed from: p0 */
        public int mo10890T(@mr2 T t) {
            return t.getTotalScrollRange();
        }

        /* renamed from: q0 */
        public final int mo10907q0(@mr2 T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator d = layoutParams.mo10936d();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (d != null) {
                    int c = layoutParams.mo10935c();
                    if ((c & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                        if ((c & 2) != 0) {
                            i2 -= jt4.m18948e0(childAt);
                        }
                    }
                    if (jt4.m18913U(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * d.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        @hw4
        /* renamed from: r0 */
        public boolean mo10908r0() {
            ValueAnimator valueAnimator = this.f7619a;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        /* renamed from: s0 */
        public void mo10892V(@mr2 CoordinatorLayout coordinatorLayout, @mr2 T t) {
            mo10885G0(coordinatorLayout, t);
            if (t.mo10854p()) {
                t.mo10813B(t.mo10816E(mo10902k0(coordinatorLayout)));
            }
        }

        /* renamed from: t0 */
        public boolean mo3653m(@mr2 CoordinatorLayout coordinatorLayout, @mr2 T t, int i) {
            int i2;
            boolean m = super.mo3653m(coordinatorLayout, t, i);
            int pendingAction = t.getPendingAction();
            C1453f fVar = this.f7621a;
            if (fVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        i2 = -t.getUpNestedPreScrollRange();
                        if (z) {
                            mo10896d0(coordinatorLayout, t, i2, 0.0f);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z) {
                            mo10896d0(coordinatorLayout, t, 0, 0.0f);
                        }
                        mo11058X(coordinatorLayout, t, 0);
                    }
                }
                t.mo10875w();
                this.f7621a = null;
                mo10931N(rf2.m26699e(mo10926H(), -t.getTotalScrollRange(), 0));
                mo10887I0(coordinatorLayout, t, mo10926H(), 0, true);
                t.mo10856r(mo10926H());
                mo10886H0(coordinatorLayout, t);
                return m;
            } else if (fVar.f7639b) {
                i2 = -t.getTotalScrollRange();
            } else {
                if (!fVar.f7640c) {
                    View childAt = t.getChildAt(fVar.f7642n);
                    mo11058X(coordinatorLayout, t, (-childAt.getBottom()) + (this.f7621a.f7641d ? jt4.m18948e0(childAt) + t.getTopInset() : Math.round(((float) childAt.getHeight()) * this.f7621a.f7638a)));
                    t.mo10875w();
                    this.f7621a = null;
                    mo10931N(rf2.m26699e(mo10926H(), -t.getTotalScrollRange(), 0));
                    mo10887I0(coordinatorLayout, t, mo10926H(), 0, true);
                    t.mo10856r(mo10926H());
                    mo10886H0(coordinatorLayout, t);
                    return m;
                }
                mo11058X(coordinatorLayout, t, 0);
                t.mo10875w();
                this.f7621a = null;
                mo10931N(rf2.m26699e(mo10926H(), -t.getTotalScrollRange(), 0));
                mo10887I0(coordinatorLayout, t, mo10926H(), 0, true);
                t.mo10856r(mo10926H());
                mo10886H0(coordinatorLayout, t);
                return m;
            }
            mo11058X(coordinatorLayout, t, i2);
            t.mo10875w();
            this.f7621a = null;
            mo10931N(rf2.m26699e(mo10926H(), -t.getTotalScrollRange(), 0));
            mo10887I0(coordinatorLayout, t, mo10926H(), 0, true);
            t.mo10856r(mo10926H());
            mo10886H0(coordinatorLayout, t);
            return m;
        }

        /* renamed from: u0 */
        public boolean mo3654n(@mr2 CoordinatorLayout coordinatorLayout, @mr2 T t, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.C0459f) t.getLayoutParams()).height != -2) {
                return super.mo3654n(coordinatorLayout, t, i, i2, i3, i4);
            }
            coordinatorLayout.mo3584O(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        /* renamed from: v0 */
        public void mo3658r(CoordinatorLayout coordinatorLayout, @mr2 T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = mo11057W(coordinatorLayout, t, i2, i5, i4);
                }
            }
            if (t.mo10854p()) {
                t.mo10813B(t.mo10816E(view));
            }
        }

        /* renamed from: w0 */
        public void mo3661u(CoordinatorLayout coordinatorLayout, @mr2 T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = mo11057W(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                mo10886H0(coordinatorLayout, t);
            }
        }

        /* renamed from: x0 */
        public void mo3665y(@mr2 CoordinatorLayout coordinatorLayout, @mr2 T t, Parcelable parcelable) {
            if (parcelable instanceof C1453f) {
                mo10880B0((C1453f) parcelable, true);
                super.mo3665y(coordinatorLayout, t, this.f7621a.mo14959a());
                return;
            }
            super.mo3665y(coordinatorLayout, t, parcelable);
            this.f7621a = null;
        }

        /* renamed from: y0 */
        public Parcelable mo3666z(@mr2 CoordinatorLayout coordinatorLayout, @mr2 T t) {
            Parcelable z = super.mo3666z(coordinatorLayout, t);
            C1453f C0 = mo10881C0(z, t);
            return C0 == null ? z : C0;
        }

        /* renamed from: z0 */
        public boolean mo3638B(@mr2 CoordinatorLayout coordinatorLayout, @mr2 T t, @mr2 View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.mo10854p() || mo10900h0(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.f7619a) != null) {
                valueAnimator.cancel();
            }
            this.f7622a = null;
            this.f7625h = i2;
            return z;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        /* renamed from: com.google.android.material.appbar.AppBarLayout$Behavior$a */
        public static abstract class C1455a extends BaseBehavior.C1452e<AppBarLayout> {
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: A0 */
        public /* bridge */ /* synthetic */ void mo10879A0(CoordinatorLayout coordinatorLayout, @mr2 AppBarLayout appBarLayout, View view, int i) {
            super.mo3640D(coordinatorLayout, appBarLayout, view, i);
        }

        /* renamed from: D0 */
        public /* bridge */ /* synthetic */ void mo10882D0(@ts2 BaseBehavior.C1452e eVar) {
            super.mo10882D0(eVar);
        }

        /* renamed from: E */
        public /* bridge */ /* synthetic */ boolean mo3641E(@mr2 CoordinatorLayout coordinatorLayout, @mr2 View view, @mr2 MotionEvent motionEvent) {
            return super.mo3641E(coordinatorLayout, view, motionEvent);
        }

        /* renamed from: G */
        public /* bridge */ /* synthetic */ int mo10925G() {
            return super.mo10925G();
        }

        /* renamed from: H */
        public /* bridge */ /* synthetic */ int mo10926H() {
            return super.mo10926H();
        }

        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean mo10927I() {
            return super.mo10927I();
        }

        /* renamed from: J */
        public /* bridge */ /* synthetic */ boolean mo10928J() {
            return super.mo10928J();
        }

        /* renamed from: L */
        public /* bridge */ /* synthetic */ void mo10929L(boolean z) {
            super.mo10929L(z);
        }

        /* renamed from: M */
        public /* bridge */ /* synthetic */ boolean mo10930M(int i) {
            return super.mo10930M(i);
        }

        /* renamed from: N */
        public /* bridge */ /* synthetic */ boolean mo10931N(int i) {
            return super.mo10931N(i);
        }

        /* renamed from: O */
        public /* bridge */ /* synthetic */ void mo10932O(boolean z) {
            super.mo10932O(z);
        }

        /* renamed from: l */
        public /* bridge */ /* synthetic */ boolean mo3652l(@mr2 CoordinatorLayout coordinatorLayout, @mr2 View view, @mr2 MotionEvent motionEvent) {
            return super.mo3652l(coordinatorLayout, view, motionEvent);
        }

        /* renamed from: t0 */
        public /* bridge */ /* synthetic */ boolean mo10910t0(@mr2 CoordinatorLayout coordinatorLayout, @mr2 AppBarLayout appBarLayout, int i) {
            return super.mo3653m(coordinatorLayout, appBarLayout, i);
        }

        /* renamed from: u0 */
        public /* bridge */ /* synthetic */ boolean mo10911u0(@mr2 CoordinatorLayout coordinatorLayout, @mr2 AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.mo3654n(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        /* renamed from: v0 */
        public /* bridge */ /* synthetic */ void mo10912v0(CoordinatorLayout coordinatorLayout, @mr2 AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.mo3658r(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        /* renamed from: w0 */
        public /* bridge */ /* synthetic */ void mo10913w0(CoordinatorLayout coordinatorLayout, @mr2 AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.mo3661u(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        /* renamed from: x0 */
        public /* bridge */ /* synthetic */ void mo10914x0(@mr2 CoordinatorLayout coordinatorLayout, @mr2 AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo3665y(coordinatorLayout, appBarLayout, parcelable);
        }

        /* renamed from: y0 */
        public /* bridge */ /* synthetic */ Parcelable mo10915y0(@mr2 CoordinatorLayout coordinatorLayout, @mr2 AppBarLayout appBarLayout) {
            return super.mo3666z(coordinatorLayout, appBarLayout);
        }

        /* renamed from: z0 */
        public /* bridge */ /* synthetic */ boolean mo10916z0(@mr2 CoordinatorLayout coordinatorLayout, @mr2 AppBarLayout appBarLayout, @mr2 View view, View view2, int i, int i2) {
            return super.mo3638B(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* renamed from: b */
        public static final int f7643b = 0;

        /* renamed from: c */
        public static final int f7644c = 1;

        /* renamed from: d */
        public static final int f7645d = 2;

        /* renamed from: e */
        public static final int f7646e = 4;

        /* renamed from: f */
        public static final int f7647f = 8;

        /* renamed from: g */
        public static final int f7648g = 16;

        /* renamed from: h */
        public static final int f7649h = 32;

        /* renamed from: i */
        public static final int f7650i = 5;

        /* renamed from: j */
        public static final int f7651j = 17;

        /* renamed from: k */
        public static final int f7652k = 10;

        /* renamed from: l */
        public static final int f7653l = 0;

        /* renamed from: m */
        public static final int f7654m = 1;

        /* renamed from: a */
        public int f7655a = 1;

        /* renamed from: a */
        public Interpolator f7656a;

        /* renamed from: a */
        public C1460d f7657a;

        @hl3({hl3.C2354a.f13187b})
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.google.android.material.appbar.AppBarLayout$LayoutParams$a */
        public @interface C1456a {
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2, f);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fd3.C2165o.AppBarLayout_Layout);
            this.f7655a = obtainStyledAttributes.getInt(fd3.C2165o.AppBarLayout_Layout_layout_scrollFlags, 0);
            mo10938f(mo10933a(obtainStyledAttributes.getInt(fd3.C2165o.AppBarLayout_Layout_layout_scrollEffect, 0)));
            int i = fd3.C2165o.AppBarLayout_Layout_layout_scrollInterpolator;
            if (obtainStyledAttributes.hasValue(i)) {
                this.f7656a = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        @sj3(19)
        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        @sj3(19)
        public LayoutParams(@mr2 LayoutParams layoutParams) {
            super(layoutParams);
            this.f7655a = layoutParams.f7655a;
            this.f7657a = layoutParams.f7657a;
            this.f7656a = layoutParams.f7656a;
        }

        @ts2
        /* renamed from: a */
        public final C1460d mo10933a(int i) {
            if (i != 1) {
                return null;
            }
            return new C1461e();
        }

        @ts2
        /* renamed from: b */
        public C1460d mo10934b() {
            return this.f7657a;
        }

        /* renamed from: c */
        public int mo10935c() {
            return this.f7655a;
        }

        /* renamed from: d */
        public Interpolator mo10936d() {
            return this.f7656a;
        }

        /* renamed from: e */
        public boolean mo10937e() {
            int i = this.f7655a;
            return (i & 1) == 1 && (i & 10) != 0;
        }

        /* renamed from: f */
        public void mo10938f(@ts2 C1460d dVar) {
            this.f7657a = dVar;
        }

        /* renamed from: g */
        public void mo10939g(int i) {
            this.f7655a = i;
        }

        /* renamed from: h */
        public void mo10940h(Interpolator interpolator) {
            this.f7656a = interpolator;
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fd3.C2165o.ScrollingViewBehavior_Layout);
            mo11064W(obtainStyledAttributes.getDimensionPixelSize(fd3.C2165o.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: Z */
        public static int m9315Z(@mr2 AppBarLayout appBarLayout) {
            CoordinatorLayout.Behavior f = ((CoordinatorLayout.C0459f) appBarLayout.getLayoutParams()).mo3676f();
            if (f instanceof BaseBehavior) {
                return ((BaseBehavior) f).mo10891U();
            }
            return 0;
        }

        /* renamed from: G */
        public /* bridge */ /* synthetic */ int mo10925G() {
            return super.mo10925G();
        }

        /* renamed from: H */
        public /* bridge */ /* synthetic */ int mo10926H() {
            return super.mo10926H();
        }

        /* renamed from: I */
        public /* bridge */ /* synthetic */ boolean mo10927I() {
            return super.mo10927I();
        }

        /* renamed from: J */
        public /* bridge */ /* synthetic */ boolean mo10928J() {
            return super.mo10928J();
        }

        /* renamed from: L */
        public /* bridge */ /* synthetic */ void mo10929L(boolean z) {
            super.mo10929L(z);
        }

        /* renamed from: M */
        public /* bridge */ /* synthetic */ boolean mo10930M(int i) {
            return super.mo10930M(i);
        }

        /* renamed from: N */
        public /* bridge */ /* synthetic */ boolean mo10931N(int i) {
            return super.mo10931N(i);
        }

        /* renamed from: O */
        public /* bridge */ /* synthetic */ void mo10932O(boolean z) {
            super.mo10932O(z);
        }

        /* renamed from: R */
        public float mo10942R(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int Z = m9315Z(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + Z > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) Z) / ((float) i)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* renamed from: T */
        public int mo10943T(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.mo10943T(view);
        }

        @ts2
        /* renamed from: Y */
        public AppBarLayout mo10941P(@mr2 List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        /* renamed from: a0 */
        public final void mo10945a0(@mr2 View view, @mr2 View view2) {
            CoordinatorLayout.Behavior f = ((CoordinatorLayout.C0459f) view2.getLayoutParams()).mo3676f();
            if (f instanceof BaseBehavior) {
                jt4.m18953f1(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f).f7624g) + mo11063U()) - mo11061Q(view2));
            }
        }

        /* renamed from: b0 */
        public final void mo10946b0(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.mo10854p()) {
                    appBarLayout.mo10813B(appBarLayout.mo10816E(view));
                }
            }
        }

        /* renamed from: f */
        public boolean mo3646f(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        /* renamed from: i */
        public boolean mo3649i(@mr2 CoordinatorLayout coordinatorLayout, @mr2 View view, @mr2 View view2) {
            mo10945a0(view, view2);
            mo10946b0(view, view2);
            return false;
        }

        /* renamed from: j */
        public void mo3650j(@mr2 CoordinatorLayout coordinatorLayout, @mr2 View view, @mr2 View view2) {
            if (view2 instanceof AppBarLayout) {
                jt4.m19001r1(coordinatorLayout, C1638a2.C1639a.f8650m.mo12636b());
                jt4.m19001r1(coordinatorLayout, C1638a2.C1639a.f8651n.mo12636b());
                jt4.m18849B1(coordinatorLayout, (C3884x1) null);
            }
        }

        /* renamed from: m */
        public /* bridge */ /* synthetic */ boolean mo3653m(@mr2 CoordinatorLayout coordinatorLayout, @mr2 View view, int i) {
            return super.mo3653m(coordinatorLayout, view, i);
        }

        /* renamed from: n */
        public /* bridge */ /* synthetic */ boolean mo3654n(@mr2 CoordinatorLayout coordinatorLayout, @mr2 View view, int i, int i2, int i3, int i4) {
            return super.mo3654n(coordinatorLayout, view, i, i2, i3, i4);
        }

        /* renamed from: x */
        public boolean mo3664x(@mr2 CoordinatorLayout coordinatorLayout, @mr2 View view, @mr2 Rect rect, boolean z) {
            AppBarLayout Y = mo10941P(coordinatorLayout.mo3633w(view));
            if (Y != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f7717a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    Y.setExpanded(false, !z);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    public class C1457a implements ju2 {
        public C1457a() {
        }

        /* renamed from: a */
        public sx4 mo1063a(View view, sx4 sx4) {
            return AppBarLayout.this.mo10857s(sx4);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    public class C1458b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ bf2 f7660a;

        public C1458b(bf2 bf2) {
            this.f7660a = bf2;
        }

        public void onAnimationUpdate(@mr2 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f7660a.mo31624n0(floatValue);
            if (AppBarLayout.this.f7600a instanceof bf2) {
                ((bf2) AppBarLayout.this.f7600a).mo31624n0(floatValue);
            }
            for (C1462f a : AppBarLayout.this.f7606b) {
                a.mo10950a(floatValue, this.f7660a.mo31565D());
            }
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$c */
    public interface C1459c<T extends AppBarLayout> {
        /* renamed from: a */
        void mo10948a(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$d */
    public static abstract class C1460d {
        /* renamed from: a */
        public abstract void mo10949a(@mr2 AppBarLayout appBarLayout, @mr2 View view, float f);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$e */
    public static class C1461e extends C1460d {

        /* renamed from: a */
        public static final float f7661a = 0.3f;

        /* renamed from: a */
        public final Rect f7662a = new Rect();

        /* renamed from: b */
        public final Rect f7663b = new Rect();

        /* renamed from: b */
        public static void m9339b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        /* renamed from: a */
        public void mo10949a(@mr2 AppBarLayout appBarLayout, @mr2 View view, float f) {
            m9339b(this.f7662a, appBarLayout, view);
            float abs = ((float) this.f7662a.top) - Math.abs(f);
            if (abs <= 0.0f) {
                float d = 1.0f - rf2.m26698d(Math.abs(abs / ((float) this.f7662a.height())), 0.0f, 1.0f);
                float height = (-abs) - ((((float) this.f7662a.height()) * 0.3f) * (1.0f - (d * d)));
                view.setTranslationY(height);
                view.getDrawingRect(this.f7663b);
                this.f7663b.offset(0, (int) (-height));
                jt4.m18891M1(view, this.f7663b);
                return;
            }
            jt4.m18891M1(view, (Rect) null);
            view.setTranslationY(0.0f);
        }
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$f */
    public interface C1462f {
        /* renamed from: a */
        void mo10950a(@zk0 float f, @d10 int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$g */
    public interface C1463g extends C1459c<AppBarLayout> {
        /* renamed from: a */
        void mo10948a(AppBarLayout appBarLayout, int i);
    }

    public AppBarLayout(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public AppBarLayout(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.appBarLayoutStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(@com.onedelhi.secure.mr2 android.content.Context r10, @com.onedelhi.secure.ts2 android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r4 = f7597y
            android.content.Context r10 = com.onedelhi.secure.hf2.m50488c(r10, r11, r12, r4)
            r9.<init>(r10, r11, r12)
            r10 = -1
            r9.f7613o = r10
            r9.f7614p = r10
            r9.f7615q = r10
            r6 = 0
            r9.f7616r = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.f7606b = r0
            android.content.Context r7 = r9.getContext()
            r0 = 1
            r9.setOrientation(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            android.view.ViewOutlineProvider r0 = r9.getOutlineProvider()
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BACKGROUND
            if (r0 != r1) goto L_0x002f
            com.onedelhi.secure.xv4.m31742a(r9)
        L_0x002f:
            com.onedelhi.secure.xv4.m31744c(r9, r11, r12, r4)
            int[] r2 = com.onedelhi.secure.fd3.C2165o.AppBarLayout
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r11
            r3 = r12
            android.content.res.TypedArray r11 = com.onedelhi.secure.ob4.m59195k(r0, r1, r2, r3, r4, r5)
            int r12 = com.onedelhi.secure.fd3.C2165o.AppBarLayout_android_background
            android.graphics.drawable.Drawable r12 = r11.getDrawable(r12)
            com.onedelhi.secure.jt4.m18877I1(r9, r12)
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            boolean r12 = r12 instanceof android.graphics.drawable.ColorDrawable
            if (r12 == 0) goto L_0x006a
            android.graphics.drawable.Drawable r12 = r9.getBackground()
            android.graphics.drawable.ColorDrawable r12 = (android.graphics.drawable.ColorDrawable) r12
            com.onedelhi.secure.bf2 r0 = new com.onedelhi.secure.bf2
            r0.<init>()
            int r12 = r12.getColor()
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r12)
            r0.mo31626o0(r12)
            r0.mo31599Z(r7)
            com.onedelhi.secure.jt4.m18877I1(r9, r0)
        L_0x006a:
            int r12 = com.onedelhi.secure.fd3.C2165o.AppBarLayout_expanded
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x0079
            boolean r12 = r11.getBoolean(r12, r6)
            r9.mo10876x(r12, r6, r6)
        L_0x0079:
            int r12 = com.onedelhi.secure.fd3.C2165o.AppBarLayout_elevation
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x0089
            int r12 = r11.getDimensionPixelSize(r12, r6)
            float r12 = (float) r12
            com.onedelhi.secure.xv4.m31743b(r9, r12)
        L_0x0089:
            r12 = 26
            if (r8 < r12) goto L_0x00ab
            int r12 = com.onedelhi.secure.fd3.C2165o.AppBarLayout_android_keyboardNavigationCluster
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x009c
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setKeyboardNavigationCluster(r12)
        L_0x009c:
            int r12 = com.onedelhi.secure.fd3.C2165o.AppBarLayout_android_touchscreenBlocksFocus
            boolean r0 = r11.hasValue(r12)
            if (r0 == 0) goto L_0x00ab
            boolean r12 = r11.getBoolean(r12, r6)
            r9.setTouchscreenBlocksFocus(r12)
        L_0x00ab:
            int r12 = com.onedelhi.secure.fd3.C2165o.AppBarLayout_liftOnScroll
            boolean r12 = r11.getBoolean(r12, r6)
            r9.f7611f = r12
            int r12 = com.onedelhi.secure.fd3.C2165o.AppBarLayout_liftOnScrollTargetViewId
            int r10 = r11.getResourceId(r12, r10)
            r9.f7617s = r10
            int r10 = com.onedelhi.secure.fd3.C2165o.AppBarLayout_statusBarForeground
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            r9.setStatusBarForeground(r10)
            r11.recycle()
            com.google.android.material.appbar.AppBarLayout$a r10 = new com.google.android.material.appbar.AppBarLayout$a
            r10.<init>()
            com.onedelhi.secure.jt4.m18934a2(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: A */
    public boolean mo10812A(boolean z) {
        return mo10814C(z, true);
    }

    /* renamed from: B */
    public boolean mo10813B(boolean z) {
        return mo10814C(z, !this.f7608c);
    }

    /* renamed from: C */
    public boolean mo10814C(boolean z, boolean z2) {
        if (!z2 || this.f7610e == z) {
            return false;
        }
        this.f7610e = z;
        refreshDrawableState();
        if (!this.f7611f || !(getBackground() instanceof bf2)) {
            return true;
        }
        mo10818G((bf2) getBackground(), z);
        return true;
    }

    /* renamed from: D */
    public final boolean mo10815D() {
        return this.f7600a != null && getTopInset() > 0;
    }

    /* renamed from: E */
    public boolean mo10816E(@ts2 View view) {
        View h = mo10841h(view);
        if (h != null) {
            view = h;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    /* renamed from: F */
    public final boolean mo10817F() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return childAt.getVisibility() != 8 && !jt4.m18913U(childAt);
    }

    /* renamed from: G */
    public final void mo10818G(@mr2 bf2 bf2, boolean z) {
        float dimension = getResources().getDimension(fd3.C2156f.design_appbar_elevation);
        float f = z ? 0.0f : dimension;
        if (!z) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f7599a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, dimension});
        this.f7599a = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(fd3.C2159i.app_bar_elevation_anim_duration));
        this.f7599a.setInterpolator(C1947d7.f10649a);
        this.f7599a.addUpdateListener(new C1458b(bf2));
        this.f7599a.start();
    }

    /* renamed from: H */
    public final void mo10819H() {
        setWillNotDraw(!mo10815D());
    }

    /* renamed from: c */
    public void mo10820c(@mr2 C1462f fVar) {
        this.f7606b.add(fVar);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public void mo10822d(@ts2 C1459c cVar) {
        if (this.f7604a == null) {
            this.f7604a = new ArrayList();
        }
        if (cVar != null && !this.f7604a.contains(cVar)) {
            this.f7604a.add(cVar);
        }
    }

    public void draw(@mr2 Canvas canvas) {
        super.draw(canvas);
        if (mo10815D()) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f7612n));
            this.f7600a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f7600a;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* renamed from: e */
    public void mo10825e(C1463g gVar) {
        mo10822d(gVar);
    }

    /* renamed from: f */
    public void mo10826f() {
        this.f7606b.clear();
    }

    /* renamed from: g */
    public final void mo10827g() {
        WeakReference<View> weakReference = this.f7603a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f7603a = null;
    }

    @mr2
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f7601a = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int e0;
        int i2 = this.f7614p;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = layoutParams.f7655a;
                if ((i4 & 5) == 5) {
                    int i5 = layoutParams.topMargin + layoutParams.bottomMargin;
                    if ((i4 & 8) != 0) {
                        e0 = jt4.m18948e0(childAt);
                    } else if ((i4 & 2) != 0) {
                        e0 = measuredHeight - jt4.m18948e0(childAt);
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && jt4.m18913U(childAt)) {
                            i = Math.min(i, measuredHeight - getTopInset());
                        }
                        i3 += i;
                    }
                    i = i5 + e0;
                    i = Math.min(i, measuredHeight - getTopInset());
                    i3 += i;
                } else if (i3 > 0) {
                    break;
                }
            }
        }
        int max = Math.max(0, i3);
        this.f7614p = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i = this.f7615q;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int i4 = layoutParams.f7655a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    i3 -= jt4.m18948e0(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f7615q = max;
        return max;
    }

    @mo1
    public int getLiftOnScrollTargetViewId() {
        return this.f7617s;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int e0 = jt4.m18948e0(this);
        if (e0 == 0) {
            int childCount = getChildCount();
            e0 = childCount >= 1 ? jt4.m18948e0(getChildAt(childCount - 1)) : 0;
            if (e0 == 0) {
                return getHeight() / 3;
            }
        }
        return (e0 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f7616r;
    }

    @ts2
    public Drawable getStatusBarForeground() {
        return this.f7600a;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @hw4
    public final int getTopInset() {
        sx4 sx4 = this.f7602a;
        if (sx4 != null) {
            return sx4.mo24605r();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.f7613o;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = layoutParams.f7655a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin;
                if (i2 == 0 && jt4.m18913U(childAt)) {
                    i3 -= getTopInset();
                }
                if ((i4 & 2) != 0) {
                    i3 -= jt4.m18948e0(childAt);
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.f7613o = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @ts2
    /* renamed from: h */
    public final View mo10841h(@ts2 View view) {
        int i;
        if (this.f7603a == null && (i = this.f7617s) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f7617s);
            }
            if (findViewById != null) {
                this.f7603a = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f7603a;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: i */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    /* renamed from: j */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: k */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new LayoutParams((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* renamed from: l */
    public boolean mo10845l() {
        return this.f7607b;
    }

    /* renamed from: m */
    public final boolean mo10846m() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).mo10937e()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public boolean mo10847n() {
        return getTotalScrollRange() != 0;
    }

    /* renamed from: o */
    public final void mo10848o() {
        Behavior behavior = this.f7601a;
        BaseBehavior.C1453f C0 = (behavior == null || this.f7613o == -1 || this.f7616r != 0) ? null : behavior.mo10881C0(C2015e0.f11060a, this);
        this.f7613o = -1;
        this.f7614p = -1;
        this.f7615q = -1;
        if (C0 != null) {
            this.f7601a.mo10880B0(C0, false);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cf2.m40864e(this);
    }

    public int[] onCreateDrawableState(int i) {
        if (this.f7605a == null) {
            this.f7605a = new int[4];
        }
        int[] iArr = this.f7605a;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.f7609d;
        int i2 = fd3.C2153c.state_liftable;
        if (!z) {
            i2 = -i2;
        }
        iArr[0] = i2;
        iArr[1] = (!z || !this.f7610e) ? -fd3.C2153c.state_lifted : fd3.C2153c.state_lifted;
        int i3 = fd3.C2153c.state_collapsible;
        if (!z) {
            i3 = -i3;
        }
        iArr[2] = i3;
        iArr[3] = (!z || !this.f7610e) ? -fd3.C2153c.state_collapsed : fd3.C2153c.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo10827g();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (jt4.m18913U(this) && mo10817F()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                jt4.m18953f1(getChildAt(childCount), topInset);
            }
        }
        mo10848o();
        this.f7607b = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((LayoutParams) getChildAt(i5).getLayoutParams()).mo10936d() != null) {
                this.f7607b = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.f7600a;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f7608c) {
            if (!this.f7611f && !mo10846m()) {
                z2 = false;
            }
            mo10878z(z2);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && jt4.m18913U(this) && mo10817F()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = rf2.m26699e(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        mo10848o();
    }

    /* renamed from: p */
    public boolean mo10854p() {
        return this.f7611f;
    }

    /* renamed from: q */
    public boolean mo10855q() {
        return this.f7610e;
    }

    /* renamed from: r */
    public void mo10856r(int i) {
        this.f7612n = i;
        if (!willNotDraw()) {
            jt4.m18985n1(this);
        }
        List<C1459c> list = this.f7604a;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1459c cVar = this.f7604a.get(i2);
                if (cVar != null) {
                    cVar.mo10948a(this, i);
                }
            }
        }
    }

    /* renamed from: s */
    public sx4 mo10857s(sx4 sx4) {
        sx4 sx42 = jt4.m18913U(this) ? sx4 : null;
        if (!ot2.m24056a(this.f7602a, sx42)) {
            this.f7602a = sx42;
            mo10819H();
            requestLayout();
        }
        return sx4;
    }

    @sj3(21)
    public void setElevation(float f) {
        super.setElevation(f);
        cf2.m40863d(this, f);
    }

    public void setExpanded(boolean z) {
        setExpanded(z, jt4.m18914U0(this));
    }

    public void setExpanded(boolean z, boolean z2) {
        mo10876x(z, z2, true);
    }

    public void setLiftOnScroll(boolean z) {
        this.f7611f = z;
    }

    public void setLiftOnScrollTargetView(@ts2 View view) {
        this.f7617s = -1;
        if (view == null) {
            mo10827g();
        } else {
            this.f7603a = new WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(@mo1 int i) {
        this.f7617s = i;
        mo10827g();
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.f7608c = z;
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(@ts2 Drawable drawable) {
        Drawable drawable2 = this.f7600a;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f7600a = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f7600a.setState(getDrawableState());
                }
                wo0.m30984m(this.f7600a, jt4.m18928Z(this));
                this.f7600a.setVisible(getVisibility() == 0, false);
                this.f7600a.setCallback(this);
            }
            mo10819H();
            jt4.m18985n1(this);
        }
    }

    public void setStatusBarForegroundColor(@d10 int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(@dp0 int i) {
        setStatusBarForeground(C3129p8.m24529b(getContext(), i));
    }

    @Deprecated
    public void setTargetElevation(float f) {
        xv4.m31743b(this, f);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f7600a;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* renamed from: t */
    public boolean mo10871t(@mr2 C1462f fVar) {
        return this.f7606b.remove(fVar);
    }

    /* renamed from: u */
    public void mo10872u(@ts2 C1459c cVar) {
        List<C1459c> list = this.f7604a;
        if (list != null && cVar != null) {
            list.remove(cVar);
        }
    }

    /* renamed from: v */
    public void mo10873v(C1463g gVar) {
        mo10872u(gVar);
    }

    public boolean verifyDrawable(@mr2 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7600a;
    }

    /* renamed from: w */
    public void mo10875w() {
        this.f7616r = 0;
    }

    /* renamed from: x */
    public final void mo10876x(boolean z, boolean z2, boolean z3) {
        int i = 0;
        int i2 = (z ? 1 : 2) | (z2 ? 4 : 0);
        if (z3) {
            i = 8;
        }
        this.f7616r = i2 | i;
        requestLayout();
    }

    /* renamed from: y */
    public boolean mo10877y(boolean z) {
        this.f7608c = true;
        return mo10878z(z);
    }

    /* renamed from: z */
    public final boolean mo10878z(boolean z) {
        if (this.f7609d == z) {
            return false;
        }
        this.f7609d = z;
        refreshDrawableState();
        return true;
    }
}
