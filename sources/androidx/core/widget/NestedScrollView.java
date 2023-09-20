package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C1833c2;
import com.onedelhi.secure.C3884x1;
import com.onedelhi.secure.ao2;
import com.onedelhi.secure.co2;
import com.onedelhi.secure.eo2;
import com.onedelhi.secure.go2;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nd3;
import com.onedelhi.secure.ns3;
import com.onedelhi.secure.pn0;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.zr0;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements eo2, ao2, ns3 {

    /* renamed from: a */
    public static final C0487a f3339a = new C0487a();

    /* renamed from: b */
    public static final float f3340b = 0.5f;

    /* renamed from: b */
    public static final String f3341b = "NestedScrollView";

    /* renamed from: c */
    public static final int[] f3342c = {16843130};

    /* renamed from: u */
    public static final int f3343u = 250;

    /* renamed from: v */
    public static final int f3344v = 250;

    /* renamed from: w */
    public static final int f3345w = -1;

    /* renamed from: a */
    public float f3346a;

    /* renamed from: a */
    public final Rect f3347a;

    /* renamed from: a */
    public VelocityTracker f3348a;

    /* renamed from: a */
    public View f3349a;
    @hw4
    @mr2
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: a */
    public EdgeEffect f3350a;

    /* renamed from: a */
    public OverScroller f3351a;

    /* renamed from: a */
    public C0489c f3352a;

    /* renamed from: a */
    public C0490d f3353a;

    /* renamed from: a */
    public final co2 f3354a;

    /* renamed from: a */
    public final go2 f3355a;

    /* renamed from: a */
    public final int[] f3356a;

    /* renamed from: b */
    public long f3357b;
    @hw4
    @mr2
    @hl3({hl3.C2354a.f13185a})

    /* renamed from: b */
    public EdgeEffect f3358b;

    /* renamed from: b */
    public boolean f3359b;

    /* renamed from: b */
    public final int[] f3360b;

    /* renamed from: c */
    public boolean f3361c;

    /* renamed from: d */
    public boolean f3362d;

    /* renamed from: e */
    public boolean f3363e;

    /* renamed from: f */
    public boolean f3364f;

    /* renamed from: n */
    public int f3365n;

    /* renamed from: o */
    public int f3366o;

    /* renamed from: p */
    public int f3367p;

    /* renamed from: q */
    public int f3368q;

    /* renamed from: r */
    public int f3369r;

    /* renamed from: s */
    public int f3370s;

    /* renamed from: t */
    public int f3371t;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    public static class C0487a extends C3884x1 {
        /* renamed from: f */
        public void mo3892f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3892f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C1833c2.m12207N(accessibilityEvent, nestedScrollView.getScrollX());
            C1833c2.m12208P(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        /* renamed from: g */
        public void mo3893g(View view, C1638a2 a2Var) {
            int scrollRange;
            super.mo3893g(view, a2Var);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            a2Var.mo12548W0(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                a2Var.mo12498F1(true);
                if (nestedScrollView.getScrollY() > 0) {
                    a2Var.mo12559b(C1638a2.C1639a.f8651n);
                    a2Var.mo12559b(C1638a2.C1639a.f8662y);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    a2Var.mo12559b(C1638a2.C1639a.f8650m);
                    a2Var.mo12559b(C1638a2.C1639a.f8624A);
                }
            }
        }

        /* renamed from: j */
        public boolean mo3894j(View view, int i, Bundle bundle) {
            if (super.mo3894j(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.mo3822Y(0, max, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.mo3822Y(0, min, true);
            return true;
        }
    }

    @sj3(21)
    /* renamed from: androidx.core.widget.NestedScrollView$b */
    public static class C0488b {
        @pn0
        /* renamed from: a */
        public static boolean m3754a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    public interface C0489c {
        /* renamed from: a */
        void mo821a(@mr2 NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* renamed from: androidx.core.widget.NestedScrollView$d */
    public static class C0490d extends View.BaseSavedState {
        public static final Parcelable.Creator<C0490d> CREATOR = new C0491a();

        /* renamed from: n */
        public int f3372n;

        /* renamed from: androidx.core.widget.NestedScrollView$d$a */
        public class C0491a implements Parcelable.Creator<C0490d> {
            /* renamed from: a */
            public C0490d createFromParcel(Parcel parcel) {
                return new C0490d(parcel);
            }

            /* renamed from: b */
            public C0490d[] newArray(int i) {
                return new C0490d[i];
            }
        }

        public C0490d(Parcel parcel) {
            super(parcel);
            this.f3372n = parcel.readInt();
        }

        public C0490d(Parcelable parcelable) {
            super(parcelable);
        }

        @mr2
        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f3372n + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3372n);
        }
    }

    public NestedScrollView(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public NestedScrollView(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, nd3.C2965a.nestedScrollViewStyle);
    }

    public NestedScrollView(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3347a = new Rect();
        this.f3359b = true;
        this.f3361c = false;
        this.f3349a = null;
        this.f3362d = false;
        this.f3364f = true;
        this.f3369r = -1;
        this.f3356a = new int[2];
        this.f3360b = new int[2];
        this.f3350a = zr0.m33328a(context, attributeSet);
        this.f3358b = zr0.m33328a(context, attributeSet);
        mo3800B();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3342c, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f3355a = new go2(this);
        this.f3354a = new co2(this);
        setNestedScrollingEnabled(true);
        jt4.m18849B1(this, f3339a);
    }

    /* renamed from: G */
    public static boolean m3699G(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m3699G((View) parent, view2);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f3346a == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f3346a = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f3346a;
    }

    /* renamed from: o */
    public static int m3700o(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: A */
    public final void mo3799A() {
        VelocityTracker velocityTracker = this.f3348a;
        if (velocityTracker == null) {
            this.f3348a = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: B */
    public final void mo3800B() {
        this.f3351a = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3366o = viewConfiguration.getScaledTouchSlop();
        this.f3367p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3368q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: C */
    public final void mo3801C() {
        if (this.f3348a == null) {
            this.f3348a = VelocityTracker.obtain();
        }
    }

    /* renamed from: D */
    public boolean mo3802D() {
        return this.f3363e;
    }

    /* renamed from: E */
    public final boolean mo3803E(View view) {
        return !mo3805H(view, 0, getHeight());
    }

    /* renamed from: F */
    public boolean mo3804F() {
        return this.f3364f;
    }

    /* renamed from: H */
    public final boolean mo3805H(View view, int i, int i2) {
        view.getDrawingRect(this.f3347a);
        offsetDescendantRectToMyCoords(view, this.f3347a);
        return this.f3347a.bottom + i >= getScrollY() && this.f3347a.top - i <= getScrollY() + i2;
    }

    /* renamed from: I */
    public final void mo3806I(int i, int i2, @ts2 int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3354a.mo14292e(0, scrollY2, 0, i - scrollY2, (int[]) null, i2, iArr);
    }

    /* renamed from: J */
    public final void mo3807J(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3369r) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3365n = (int) motionEvent.getY(i);
            this.f3369r = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f3348a;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3808K(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r3 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0054
            r3 = r7
            goto L_0x004e
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r7 = r12.mo3845f(r5)
            if (r7 != 0) goto L_0x007e
            android.widget.OverScroller r7 = r0.f3351a
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo3808K(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: L */
    public boolean mo3809L(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f3347a.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f3347a;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f3347a.top = getScrollY() - height;
            Rect rect2 = this.f3347a;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f3347a;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return mo3813P(i, i2, i3);
    }

    /* renamed from: M */
    public final void mo3810M() {
        VelocityTracker velocityTracker = this.f3348a;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3348a = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo3811N(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f3350a
            float r0 = com.onedelhi.secure.zr0.m33329d(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            android.widget.EdgeEffect r0 = r3.f3350a
            float r4 = -r4
            float r4 = com.onedelhi.secure.zr0.m33331j(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f3350a
            float r5 = com.onedelhi.secure.zr0.m33329d(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f3350a
        L_0x002c:
            r5.onRelease()
        L_0x002f:
            r1 = r4
            goto L_0x0051
        L_0x0031:
            android.widget.EdgeEffect r0 = r3.f3358b
            float r0 = com.onedelhi.secure.zr0.m33329d(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            android.widget.EdgeEffect r0 = r3.f3358b
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = com.onedelhi.secure.zr0.m33331j(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f3358b
            float r5 = com.onedelhi.secure.zr0.m33329d(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f3358b
            goto L_0x002c
        L_0x0051:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L_0x0061
            r3.invalidate()
        L_0x0061:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo3811N(int, float):int");
    }

    /* renamed from: O */
    public final void mo3812O(boolean z) {
        if (z) {
            mo3844e(2, 1);
        } else {
            mo3851h(1);
        }
        this.f3371t = getScrollY();
        jt4.m18985n1(this);
    }

    /* renamed from: P */
    public final boolean mo3813P(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View w = mo3888w(z2, i2, i3);
        if (w == null) {
            w = this;
        }
        if (i2 < scrollY || i3 > i4) {
            mo3876s(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (w != findFocus()) {
            w.requestFocus(i);
        }
        return z;
    }

    /* renamed from: Q */
    public final void mo3814Q(View view) {
        view.getDrawingRect(this.f3347a);
        offsetDescendantRectToMyCoords(view, this.f3347a);
        int q = mo3871q(this.f3347a);
        if (q != 0) {
            scrollBy(0, q);
        }
    }

    /* renamed from: R */
    public final boolean mo3815R(Rect rect, boolean z) {
        int q = mo3871q(rect);
        boolean z2 = q != 0;
        if (z2) {
            if (z) {
                scrollBy(0, q);
            } else {
                mo3816S(0, q);
            }
        }
        return z2;
    }

    /* renamed from: S */
    public final void mo3816S(int i, int i2) {
        mo3818U(i, i2, 250, false);
    }

    /* renamed from: T */
    public final void mo3817T(int i, int i2, int i3) {
        mo3818U(i, i2, i3, false);
    }

    /* renamed from: U */
    public final void mo3818U(int i, int i2, int i3, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f3357b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f3351a;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i3);
                mo3812O(z);
            } else {
                if (!this.f3351a.isFinished()) {
                    mo3846g();
                }
                scrollBy(i, i2);
            }
            this.f3357b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: V */
    public final void mo3819V(int i, int i2) {
        mo3821X(i, i2, 250, false);
    }

    /* renamed from: W */
    public final void mo3820W(int i, int i2, int i3) {
        mo3821X(i, i2, i3, false);
    }

    /* renamed from: X */
    public void mo3821X(int i, int i2, int i3, boolean z) {
        mo3818U(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    /* renamed from: Y */
    public void mo3822Y(int i, int i2, boolean z) {
        mo3821X(i, i2, 250, z);
    }

    /* renamed from: Z */
    public final boolean mo3823Z(MotionEvent motionEvent) {
        boolean z;
        if (zr0.m33329d(this.f3350a) != 0.0f) {
            zr0.m33331j(this.f3350a, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z = true;
        } else {
            z = false;
        }
        if (zr0.m33329d(this.f3358b) == 0.0f) {
            return z;
        }
        zr0.m33331j(this.f3358b, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    /* renamed from: a */
    public boolean mo3824a(int i, int i2, int i3, int i4, @ts2 int[] iArr, int i5) {
        return this.f3354a.mo14294g(i, i2, i3, i4, iArr, i5);
    }

    public void addView(@mr2 View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public void mo1562b(@mr2 View view, int i, int i2, @mr2 int[] iArr, int i3) {
        mo3837d(i, i2, iArr, (int[]) null, i3);
    }

    /* renamed from: c */
    public void mo3829c(int i, int i2, int i3, int i4, @ts2 int[] iArr, int i5, @mr2 int[] iArr2) {
        this.f3354a.mo14292e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @hl3({hl3.C2354a.f13188c})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @hl3({hl3.C2354a.f13188c})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @hl3({hl3.C2354a.f13188c})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.f3351a.isFinished()) {
            this.f3351a.computeScrollOffset();
            int currY = this.f3351a.getCurrY();
            int i = currY - this.f3371t;
            this.f3371t = currY;
            int[] iArr = this.f3360b;
            boolean z = false;
            iArr[1] = 0;
            mo3837d(0, i, iArr, (int[]) null, 1);
            int i2 = i - this.f3360b[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                mo3808K(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f3360b;
                iArr2[1] = 0;
                mo3829c(0, scrollY2, 0, i3, this.f3356a, 1, iArr2);
                i2 = i3 - this.f3360b[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    if (i2 < 0) {
                        if (this.f3350a.isFinished()) {
                            edgeEffect = this.f3350a;
                        }
                    } else if (this.f3358b.isFinished()) {
                        edgeEffect = this.f3358b;
                    }
                    edgeEffect.onAbsorb((int) this.f3351a.getCurrVelocity());
                }
                mo3846g();
            }
            if (!this.f3351a.isFinished()) {
                jt4.m18985n1(this);
            } else {
                mo3851h(1);
            }
        }
    }

    @hl3({hl3.C2354a.f13188c})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @hl3({hl3.C2354a.f13188c})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @hl3({hl3.C2354a.f13188c})
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    /* renamed from: d */
    public boolean mo3837d(int i, int i2, @ts2 int[] iArr, @ts2 int[] iArr2, int i3) {
        return this.f3354a.mo14291d(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo3887v(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f3354a.mo14288a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f3354a.mo14289b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, @ts2 int[] iArr, @ts2 int[] iArr2) {
        return mo3837d(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @ts2 int[] iArr) {
        return this.f3354a.mo14293f(i, i2, i3, i4, iArr);
    }

    public void draw(@mr2 Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i2 = 0;
        if (!this.f3350a.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (C0488b.m3754a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i = getPaddingLeft() + 0;
            } else {
                i = 0;
            }
            if (C0488b.m3754a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate((float) i, (float) min);
            this.f3350a.setSize(width, height);
            if (this.f3350a.draw(canvas)) {
                jt4.m18985n1(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f3358b.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (C0488b.m3754a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i2 = 0 + getPaddingLeft();
            }
            if (C0488b.m3754a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i2 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.f3358b.setSize(width2, height2);
            if (this.f3358b.draw(canvas)) {
                jt4.m18985n1(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* renamed from: e */
    public boolean mo3844e(int i, int i2) {
        return this.f3354a.mo14306s(i, i2);
    }

    /* renamed from: f */
    public boolean mo3845f(int i) {
        return this.f3354a.mo14299l(i);
    }

    /* renamed from: g */
    public final void mo3846g() {
        this.f3351a.abortAnimation();
        mo3851h(1);
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f3355a.mo16724a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    /* renamed from: h */
    public void mo3851h(int i) {
        this.f3354a.mo14308u(i);
    }

    public boolean hasNestedScrollingParent() {
        return mo3845f(0);
    }

    /* renamed from: i */
    public boolean mo3853i(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !mo3805H(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            mo3876s(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f3347a);
            offsetDescendantRectToMyCoords(findNextFocus, this.f3347a);
            mo3876s(mo3871q(this.f3347a));
            findNextFocus.requestFocus(i);
        }
        if (findFocus == null || !findFocus.isFocused() || !mo3803E(findFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public boolean isNestedScrollingEnabled() {
        return this.f3354a.mo14300m();
    }

    /* renamed from: j */
    public final boolean mo3855j() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    /* renamed from: k */
    public void mo1580k(@mr2 View view, int i) {
        this.f3355a.mo16728e(view, i);
        mo3851h(i);
    }

    /* renamed from: l */
    public void mo1581l(@mr2 View view, int i, int i2, int i3, int i4, int i5, @mr2 int[] iArr) {
        mo3806I(i4, i5, iArr);
    }

    /* renamed from: m */
    public final boolean mo3856m() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    public void measureChild(@mr2 View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public void mo1583n(@mr2 View view, int i, int i2, int i3, int i4, int i5) {
        mo3806I(i4, i5, (int[]) null);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3361c = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a4 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onGenericMotionEvent(@com.onedelhi.secure.mr2 android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 0
            r2 = 8
            if (r0 != r2) goto L_0x00a5
            boolean r0 = r8.f3362d
            if (r0 != 0) goto L_0x00a5
            r0 = 2
            boolean r0 = com.onedelhi.secure.dl2.m13234l(r9, r0)
            r2 = 0
            if (r0 == 0) goto L_0x001c
            r0 = 9
        L_0x0017:
            float r0 = r9.getAxisValue(r0)
            goto L_0x0028
        L_0x001c:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = com.onedelhi.secure.dl2.m13234l(r9, r0)
            if (r0 == 0) goto L_0x0027
            r0 = 26
            goto L_0x0017
        L_0x0027:
            r0 = 0
        L_0x0028:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00a5
            float r2 = r8.getVerticalScrollFactorCompat()
            float r0 = r0 * r2
            int r0 = (int) r0
            int r2 = r8.getScrollRange()
            int r3 = r8.getScrollY()
            int r0 = r3 - r0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 8194(0x2002, float:1.1482E-41)
            r6 = 1
            if (r0 >= 0) goto L_0x006c
            boolean r2 = r8.mo3855j()
            if (r2 == 0) goto L_0x0052
            boolean r9 = com.onedelhi.secure.dl2.m13234l(r9, r5)
            if (r9 != 0) goto L_0x0052
            r9 = 1
            goto L_0x0053
        L_0x0052:
            r9 = 0
        L_0x0053:
            if (r9 == 0) goto L_0x0099
            android.widget.EdgeEffect r9 = r8.f3350a
            float r0 = (float) r0
            float r0 = -r0
            int r2 = r8.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            com.onedelhi.secure.zr0.m33331j(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f3350a
            r9.onRelease()
            r8.invalidate()
            r9 = 1
            goto L_0x009a
        L_0x006c:
            if (r0 <= r2) goto L_0x0098
            boolean r7 = r8.mo3855j()
            if (r7 == 0) goto L_0x007c
            boolean r9 = com.onedelhi.secure.dl2.m13234l(r9, r5)
            if (r9 != 0) goto L_0x007c
            r9 = 1
            goto L_0x007d
        L_0x007c:
            r9 = 0
        L_0x007d:
            if (r9 == 0) goto L_0x0095
            android.widget.EdgeEffect r9 = r8.f3358b
            int r0 = r0 - r2
            float r0 = (float) r0
            int r1 = r8.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            com.onedelhi.secure.zr0.m33331j(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f3358b
            r9.onRelease()
            r8.invalidate()
            r1 = 1
        L_0x0095:
            r9 = r1
            r1 = r2
            goto L_0x009a
        L_0x0098:
            r1 = r0
        L_0x0099:
            r9 = 0
        L_0x009a:
            if (r1 == r3) goto L_0x00a4
            int r9 = r8.getScrollX()
            super.scrollTo(r9, r1)
            return r6
        L_0x00a4:
            return r9
        L_0x00a5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(@mr2 MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.f3362d) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f3369r;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            Log.e(f3341b, "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f3365n) > this.f3366o && (2 & getNestedScrollAxes()) == 0) {
                                this.f3362d = true;
                                this.f3365n = y;
                                mo3801C();
                                this.f3348a.addMovement(motionEvent);
                                this.f3370s = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        mo3807J(motionEvent);
                    }
                }
            }
            this.f3362d = false;
            this.f3369r = -1;
            mo3810M();
            if (this.f3351a.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                jt4.m18985n1(this);
            }
            mo3851h(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!mo3891z((int) motionEvent.getX(), y2)) {
                if (!mo3823Z(motionEvent) && this.f3351a.isFinished()) {
                    z = false;
                }
                this.f3362d = z;
                mo3810M();
            } else {
                this.f3365n = y2;
                this.f3369r = motionEvent.getPointerId(0);
                mo3799A();
                this.f3348a.addMovement(motionEvent);
                this.f3351a.computeScrollOffset();
                if (!mo3823Z(motionEvent) && this.f3351a.isFinished()) {
                    z = false;
                }
                this.f3362d = z;
                mo3844e(2, 0);
            }
        }
        return this.f3362d;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f3359b = false;
        View view = this.f3349a;
        if (view != null && m3699G(view, this)) {
            mo3814Q(this.f3349a);
        }
        this.f3349a = null;
        if (!this.f3361c) {
            if (this.f3353a != null) {
                scrollTo(getScrollX(), this.f3353a.f3372n);
                this.f3353a = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int o = m3700o(scrollY, paddingTop, i5);
            if (o != scrollY) {
                scrollTo(getScrollX(), o);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3361c = true;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3363e && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(@mr2 View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo3889x((int) f2);
        return true;
    }

    public boolean onNestedPreFling(@mr2 View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(@mr2 View view, int i, int i2, @mr2 int[] iArr) {
        mo1562b(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(@mr2 View view, int i, int i2, int i3, int i4) {
        mo3806I(i4, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(@mr2 View view, @mr2 View view2, int i) {
        mo1599p(view, view2, i, 0);
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, (View) null, i) : instance.findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && !mo3803E(findNextFocus)) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0490d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0490d dVar = (C0490d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f3353a = dVar;
        requestLayout();
    }

    @mr2
    public Parcelable onSaveInstanceState() {
        C0490d dVar = new C0490d(super.onSaveInstanceState());
        dVar.f3372n = getScrollY();
        return dVar;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        C0489c cVar = this.f3352a;
        if (cVar != null) {
            cVar.mo821a(this, i, i2, i3, i4);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && mo3805H(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f3347a);
            offsetDescendantRectToMyCoords(findFocus, this.f3347a);
            mo3876s(mo3871q(this.f3347a));
        }
    }

    public boolean onStartNestedScroll(@mr2 View view, @mr2 View view2, int i) {
        return mo1601r(view, view2, i, 0);
    }

    public void onStopNestedScroll(@mr2 View view) {
        mo1580k(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (r10.f3351a.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0222, code lost:
        if (r10.f3351a.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(@com.onedelhi.secure.mr2 android.view.MotionEvent r24) {
        /*
            r23 = this;
            r10 = r23
            r11 = r24
            r23.mo3801C()
            int r0 = r24.getActionMasked()
            r12 = 0
            if (r0 != 0) goto L_0x0010
            r10.f3370s = r12
        L_0x0010:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r24)
            int r1 = r10.f3370s
            float r1 = (float) r1
            r2 = 0
            r13.offsetLocation(r2, r1)
            r1 = 2
            r14 = 1
            if (r0 == 0) goto L_0x0226
            r3 = -1
            if (r0 == r14) goto L_0x01db
            if (r0 == r1) goto L_0x0082
            r1 = 3
            if (r0 == r1) goto L_0x0054
            r1 = 5
            if (r0 == r1) goto L_0x0041
            r1 = 6
            if (r0 == r1) goto L_0x002f
            goto L_0x0255
        L_0x002f:
            r23.mo3807J(r24)
            int r0 = r10.f3369r
            int r0 = r11.findPointerIndex(r0)
            float r0 = r11.getY(r0)
            int r0 = (int) r0
            r10.f3365n = r0
            goto L_0x0255
        L_0x0041:
            int r0 = r24.getActionIndex()
            float r1 = r11.getY(r0)
            int r1 = (int) r1
            r10.f3365n = r1
            int r0 = r11.getPointerId(r0)
            r10.f3369r = r0
            goto L_0x0255
        L_0x0054:
            boolean r0 = r10.f3362d
            if (r0 == 0) goto L_0x007b
            int r0 = r23.getChildCount()
            if (r0 <= 0) goto L_0x007b
            android.widget.OverScroller r15 = r10.f3351a
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x007b
        L_0x0078:
            com.onedelhi.secure.jt4.m18985n1(r23)
        L_0x007b:
            r10.f3369r = r3
            r23.mo3886u()
            goto L_0x0255
        L_0x0082:
            int r0 = r10.f3369r
            int r15 = r11.findPointerIndex(r0)
            if (r15 != r3) goto L_0x00a9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r0.append(r1)
            int r1 = r10.f3369r
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L_0x0255
        L_0x00a9:
            float r0 = r11.getY(r15)
            int r6 = (int) r0
            int r0 = r10.f3365n
            int r0 = r0 - r6
            float r1 = r11.getX(r15)
            int r1 = r10.mo3811N(r0, r1)
            int r0 = r0 - r1
            boolean r1 = r10.f3362d
            if (r1 != 0) goto L_0x00d8
            int r1 = java.lang.Math.abs(r0)
            int r2 = r10.f3366o
            if (r1 <= r2) goto L_0x00d8
            android.view.ViewParent r1 = r23.getParent()
            if (r1 == 0) goto L_0x00cf
            r1.requestDisallowInterceptTouchEvent(r14)
        L_0x00cf:
            r10.f3362d = r14
            int r1 = r10.f3366o
            if (r0 <= 0) goto L_0x00d7
            int r0 = r0 - r1
            goto L_0x00d8
        L_0x00d7:
            int r0 = r0 + r1
        L_0x00d8:
            r7 = r0
            boolean r0 = r10.f3362d
            if (r0 == 0) goto L_0x0255
            r1 = 0
            int[] r3 = r10.f3360b
            int[] r4 = r10.f3356a
            r5 = 0
            r0 = r23
            r2 = r7
            boolean r0 = r0.mo3837d(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00fa
            int[] r0 = r10.f3360b
            r0 = r0[r14]
            int r7 = r7 - r0
            int r0 = r10.f3370s
            int[] r1 = r10.f3356a
            r1 = r1[r14]
            int r0 = r0 + r1
            r10.f3370s = r0
        L_0x00fa:
            r16 = r7
            int[] r0 = r10.f3356a
            r0 = r0[r14]
            int r6 = r6 - r0
            r10.f3365n = r6
            int r17 = r23.getScrollY()
            int r9 = r23.getScrollRange()
            int r0 = r23.getOverScrollMode()
            if (r0 == 0) goto L_0x0119
            if (r0 != r14) goto L_0x0116
            if (r9 <= 0) goto L_0x0116
            goto L_0x0119
        L_0x0116:
            r18 = 0
            goto L_0x011b
        L_0x0119:
            r18 = 1
        L_0x011b:
            r1 = 0
            r3 = 0
            int r4 = r23.getScrollY()
            r5 = 0
            r7 = 0
            r8 = 0
            r19 = 1
            r0 = r23
            r2 = r16
            r6 = r9
            r22 = r9
            r9 = r19
            boolean r0 = r0.mo3808K(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x013d
            boolean r0 = r10.mo3845f(r12)
            if (r0 != 0) goto L_0x013d
            r8 = 1
            goto L_0x013e
        L_0x013d:
            r8 = 0
        L_0x013e:
            int r0 = r23.getScrollY()
            int r2 = r0 - r17
            int r4 = r16 - r2
            int[] r7 = r10.f3360b
            r7[r14] = r12
            r1 = 0
            r3 = 0
            int[] r5 = r10.f3356a
            r6 = 0
            r0 = r23
            r0.mo3829c(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r10.f3365n
            int[] r1 = r10.f3356a
            r2 = r1[r14]
            int r0 = r0 - r2
            r10.f3365n = r0
            int r0 = r10.f3370s
            r1 = r1[r14]
            int r0 = r0 + r1
            r10.f3370s = r0
            if (r18 == 0) goto L_0x01d1
            int[] r0 = r10.f3360b
            r0 = r0[r14]
            int r0 = r16 - r0
            int r1 = r17 + r0
            if (r1 >= 0) goto L_0x0195
            android.widget.EdgeEffect r1 = r10.f3350a
            int r0 = -r0
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            float r2 = r11.getX(r15)
            int r3 = r23.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            com.onedelhi.secure.zr0.m33331j(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.f3358b
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01bd
            android.widget.EdgeEffect r0 = r10.f3358b
        L_0x0191:
            r0.onRelease()
            goto L_0x01bd
        L_0x0195:
            r2 = r22
            if (r1 <= r2) goto L_0x01bd
            android.widget.EdgeEffect r1 = r10.f3358b
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = r11.getX(r15)
            int r4 = r23.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r2 = r2 - r3
            com.onedelhi.secure.zr0.m33331j(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.f3350a
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01bd
            android.widget.EdgeEffect r0 = r10.f3350a
            goto L_0x0191
        L_0x01bd:
            android.widget.EdgeEffect r0 = r10.f3350a
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x01cd
            android.widget.EdgeEffect r0 = r10.f3358b
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x01d1
        L_0x01cd:
            com.onedelhi.secure.jt4.m18985n1(r23)
            goto L_0x01d2
        L_0x01d1:
            r12 = r8
        L_0x01d2:
            if (r12 == 0) goto L_0x0255
            android.view.VelocityTracker r0 = r10.f3348a
            r0.clear()
            goto L_0x0255
        L_0x01db:
            android.view.VelocityTracker r0 = r10.f3348a
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r10.f3368q
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r10.f3369r
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r10.f3367p
            if (r1 < r4) goto L_0x020a
            boolean r1 = r10.mo3885t(r0)
            if (r1 != 0) goto L_0x007b
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r10.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x007b
            r10.dispatchNestedFling(r2, r1, r14)
            r10.mo3889x(r0)
            goto L_0x007b
        L_0x020a:
            android.widget.OverScroller r15 = r10.f3351a
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L_0x007b
            goto L_0x0078
        L_0x0226:
            int r0 = r23.getChildCount()
            if (r0 != 0) goto L_0x022d
            return r12
        L_0x022d:
            boolean r0 = r10.f3362d
            if (r0 == 0) goto L_0x023a
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L_0x023a
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x023a:
            android.widget.OverScroller r0 = r10.f3351a
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0245
            r23.mo3846g()
        L_0x0245:
            float r0 = r24.getY()
            int r0 = (int) r0
            r10.f3365n = r0
            int r0 = r11.getPointerId(r12)
            r10.f3369r = r0
            r10.mo3844e(r1, r12)
        L_0x0255:
            android.view.VelocityTracker r0 = r10.f3348a
            if (r0 == 0) goto L_0x025c
            r0.addMovement(r13)
        L_0x025c:
            r13.recycle()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void mo1599p(@mr2 View view, @mr2 View view2, int i, int i2) {
        this.f3355a.mo16726c(view, view2, i, i2);
        mo3844e(2, i2);
    }

    /* renamed from: q */
    public int mo3871q(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    /* renamed from: r */
    public boolean mo1601r(@mr2 View view, @mr2 View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f3359b) {
            mo3814Q(view2);
        } else {
            this.f3349a = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(@mr2 View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return mo3815R(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            mo3810M();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f3359b = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public final void mo3876s(int i) {
        if (i == 0) {
            return;
        }
        if (this.f3364f) {
            mo3816S(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int o = m3700o(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int o2 = m3700o(i2, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (o != getScrollX() || o2 != getScrollY()) {
                super.scrollTo(o, o2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f3363e) {
            this.f3363e = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f3354a.mo14303p(z);
    }

    public void setOnScrollChangeListener(@ts2 C0489c cVar) {
        this.f3352a = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f3364f = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return mo3844e(i, 0);
    }

    public void stopNestedScroll() {
        mo3851h(0);
    }

    /* renamed from: t */
    public final boolean mo3885t(int i) {
        EdgeEffect edgeEffect;
        if (zr0.m33329d(this.f3350a) != 0.0f) {
            edgeEffect = this.f3350a;
        } else if (zr0.m33329d(this.f3358b) == 0.0f) {
            return false;
        } else {
            edgeEffect = this.f3358b;
            i = -i;
        }
        edgeEffect.onAbsorb(i);
        return true;
    }

    /* renamed from: u */
    public final void mo3886u() {
        this.f3362d = false;
        mo3810M();
        mo3851h(0);
        this.f3350a.onRelease();
        this.f3358b.onRelease();
    }

    /* renamed from: v */
    public boolean mo3887v(@mr2 KeyEvent keyEvent) {
        this.f3347a.setEmpty();
        int i = 130;
        if (!mo3856m()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return !keyEvent.isAltPressed() ? mo3853i(33) : mo3890y(33);
            }
            if (keyCode == 20) {
                return !keyEvent.isAltPressed() ? mo3853i(130) : mo3890y(130);
            }
            if (keyCode != 62) {
                return false;
            }
            if (keyEvent.isShiftPressed()) {
                i = 33;
            }
            mo3809L(i);
            return false;
        }
    }

    /* renamed from: w */
    public final View mo3888w(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: x */
    public void mo3889x(int i) {
        if (getChildCount() > 0) {
            this.f3351a.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            mo3812O(true);
        }
    }

    /* renamed from: y */
    public boolean mo3890y(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f3347a;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f3347a.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f3347a;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f3347a;
        return mo3813P(i, rect3.top, rect3.bottom);
    }

    /* renamed from: z */
    public final boolean mo3891z(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }
}
