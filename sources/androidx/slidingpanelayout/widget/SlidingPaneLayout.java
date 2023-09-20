package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C2015e0;
import com.onedelhi.secure.C3884x1;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.mt4;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.ts2;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class SlidingPaneLayout extends ViewGroup {

    /* renamed from: b */
    public static final String f5321b = "SlidingPaneLayout";

    /* renamed from: s */
    public static final int f5322s = 32;

    /* renamed from: t */
    public static final int f5323t = -858993460;

    /* renamed from: u */
    public static final int f5324u = 400;

    /* renamed from: a */
    public float f5325a;

    /* renamed from: a */
    public final Rect f5326a;

    /* renamed from: a */
    public Drawable f5327a;

    /* renamed from: a */
    public View f5328a;

    /* renamed from: a */
    public C0989d f5329a;

    /* renamed from: a */
    public final mt4 f5330a;

    /* renamed from: a */
    public Field f5331a;

    /* renamed from: a */
    public Method f5332a;

    /* renamed from: a */
    public final ArrayList<C0987b> f5333a;

    /* renamed from: b */
    public float f5334b;

    /* renamed from: b */
    public Drawable f5335b;

    /* renamed from: b */
    public boolean f5336b;

    /* renamed from: c */
    public float f5337c;

    /* renamed from: c */
    public boolean f5338c;

    /* renamed from: d */
    public float f5339d;

    /* renamed from: d */
    public boolean f5340d;

    /* renamed from: e */
    public boolean f5341e;

    /* renamed from: f */
    public boolean f5342f;

    /* renamed from: n */
    public int f5343n;

    /* renamed from: o */
    public int f5344o;

    /* renamed from: p */
    public final int f5345p;

    /* renamed from: q */
    public int f5346q;

    /* renamed from: r */
    public int f5347r;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public static final int[] f5348a = {16843137};

        /* renamed from: a */
        public float f5349a = 0.0f;

        /* renamed from: a */
        public Paint f5350a;

        /* renamed from: a */
        public boolean f5351a;

        /* renamed from: b */
        public boolean f5352b;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(@mr2 Context context, @ts2 AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5348a);
            this.f5349a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(@mr2 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(@mr2 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(@mr2 LayoutParams layoutParams) {
            super(layoutParams);
            this.f5349a = layoutParams.f5349a;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$a */
    public class C0986a extends C3884x1 {

        /* renamed from: a */
        public final Rect f5353a = new Rect();

        public C0986a() {
        }

        /* renamed from: f */
        public void mo3892f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3892f(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        /* renamed from: g */
        public void mo3893g(View view, C1638a2 a2Var) {
            C1638a2 F0 = C1638a2.m10546F0(a2Var);
            super.mo3893g(view, F0);
            mo6708n(a2Var, F0);
            F0.mo12506I0();
            a2Var.mo12548W0(SlidingPaneLayout.class.getName());
            a2Var.mo12507I1(view);
            ViewParent l0 = jt4.m18976l0(view);
            if (l0 instanceof View) {
                a2Var.mo12634z1((View) l0);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!mo6709o(childAt) && childAt.getVisibility() == 0) {
                    jt4.m18906R1(childAt, 1);
                    a2Var.mo12562c(childAt);
                }
            }
        }

        /* renamed from: i */
        public boolean mo4113i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!mo6709o(view)) {
                return super.mo4113i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* renamed from: n */
        public final void mo6708n(C1638a2 a2Var, C1638a2 a2Var2) {
            Rect rect = this.f5353a;
            a2Var2.mo12611s(rect);
            a2Var.mo12533R0(rect);
            a2Var2.mo12614t(rect);
            a2Var.mo12536S0(rect);
            a2Var.mo12546V1(a2Var2.mo12489B0());
            a2Var.mo12628x1(a2Var2.mo12520N());
            a2Var.mo12548W0(a2Var2.mo12624w());
            a2Var.mo12558a1(a2Var2.mo12485A());
            a2Var.mo12577g1(a2Var2.mo12600o0());
            a2Var.mo12551X0(a2Var2.mo12586j0());
            a2Var.mo12584i1(a2Var2.mo12603p0());
            a2Var.mo12587j1(a2Var2.mo12606q0());
            a2Var.mo12524O0(a2Var2.mo12576g0());
            a2Var.mo12501G1(a2Var2.mo12630y0());
            a2Var.mo12616t1(a2Var2.mo12615t0());
            a2Var.mo12556a(a2Var2.mo12602p());
            a2Var.mo12623v1(a2Var2.mo12514L());
        }

        /* renamed from: o */
        public boolean mo6709o(View view) {
            return SlidingPaneLayout.this.mo6675j(view);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$b */
    public class C0987b implements Runnable {

        /* renamed from: a */
        public final View f5355a;

        public C0987b(View view) {
            this.f5355a = view;
        }

        public void run() {
            if (this.f5355a.getParent() == SlidingPaneLayout.this) {
                this.f5355a.setLayerType(0, (Paint) null);
                SlidingPaneLayout.this.mo6674i(this.f5355a);
            }
            SlidingPaneLayout.this.f5333a.remove(this);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$c */
    public class C0988c extends mt4.C2888c {
        public C0988c() {
        }

        /* renamed from: a */
        public int mo4122a(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.f5328a.getLayoutParams();
            if (SlidingPaneLayout.this.mo6676k()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin) + SlidingPaneLayout.this.f5328a.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.f5346q);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + layoutParams.leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.f5346q + paddingLeft);
        }

        /* renamed from: b */
        public int mo4123b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: d */
        public int mo4124d(View view) {
            return SlidingPaneLayout.this.f5346q;
        }

        /* renamed from: f */
        public void mo4125f(int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.f5330a.mo20652d(slidingPaneLayout.f5328a, i2);
        }

        /* renamed from: i */
        public void mo4128i(View view, int i) {
            SlidingPaneLayout.this.mo6692r();
        }

        /* renamed from: j */
        public void mo4129j(int i) {
            SlidingPaneLayout slidingPaneLayout;
            boolean z;
            if (SlidingPaneLayout.this.f5330a.mo20629F() == 0) {
                SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                if (slidingPaneLayout2.f5325a == 0.0f) {
                    slidingPaneLayout2.mo6707v(slidingPaneLayout2.f5328a);
                    SlidingPaneLayout slidingPaneLayout3 = SlidingPaneLayout.this;
                    slidingPaneLayout3.mo6665f(slidingPaneLayout3.f5328a);
                    slidingPaneLayout = SlidingPaneLayout.this;
                    z = false;
                } else {
                    slidingPaneLayout2.mo6666g(slidingPaneLayout2.f5328a);
                    slidingPaneLayout = SlidingPaneLayout.this;
                    z = true;
                }
                slidingPaneLayout.f5340d = z;
            }
        }

        /* renamed from: k */
        public void mo4130k(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout.this.mo6679n(i);
            SlidingPaneLayout.this.invalidate();
        }

        /* renamed from: l */
        public void mo4131l(View view, float f, float f2) {
            int i;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.mo6676k()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + layoutParams.rightMargin;
                if (f < 0.0f || (f == 0.0f && SlidingPaneLayout.this.f5325a > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f5346q;
                }
                i = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f5328a.getWidth();
            } else {
                i = layoutParams.leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 > 0 || (i2 == 0 && SlidingPaneLayout.this.f5325a > 0.5f)) {
                    i += SlidingPaneLayout.this.f5346q;
                }
            }
            SlidingPaneLayout.this.f5330a.mo20645V(i, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        /* renamed from: m */
        public boolean mo4132m(View view, int i) {
            if (SlidingPaneLayout.this.f5338c) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).f5351a;
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$d */
    public interface C0989d {
        /* renamed from: a */
        void mo6711a(@mr2 View view);

        /* renamed from: b */
        void mo6712b(@mr2 View view);

        /* renamed from: c */
        void mo6713c(@mr2 View view, float f);
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$e */
    public static class C0990e extends C2015e0 {
        public static final Parcelable.Creator<C0990e> CREATOR = new C0991a();

        /* renamed from: b */
        public boolean f5358b;

        /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$e$a */
        public static class C0991a implements Parcelable.ClassLoaderCreator<C0990e> {
            /* renamed from: a */
            public C0990e createFromParcel(Parcel parcel) {
                return new C0990e(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C0990e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0990e(parcel, (ClassLoader) null);
            }

            /* renamed from: c */
            public C0990e[] newArray(int i) {
                return new C0990e[i];
            }
        }

        public C0990e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5358b = parcel.readInt() != 0;
        }

        public C0990e(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5358b ? 1 : 0);
        }
    }

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$f */
    public static class C0992f implements C0989d {
        /* renamed from: a */
        public void mo6711a(View view) {
        }

        /* renamed from: b */
        public void mo6712b(View view) {
        }

        /* renamed from: c */
        public void mo6713c(View view, float f) {
        }
    }

    public SlidingPaneLayout(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public SlidingPaneLayout(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5343n = f5323t;
        this.f5341e = true;
        this.f5326a = new Rect();
        this.f5333a = new ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.f5345p = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        jt4.m18849B1(this, new C0986a());
        jt4.m18906R1(this, 1);
        mt4 p = mt4.m21949p(this, 0.5f, new C0988c());
        this.f5330a = p;
        p.mo20644U(f * 400.0f);
    }

    /* renamed from: w */
    public static boolean m6759w(View view) {
        return view.isOpaque();
    }

    /* renamed from: a */
    public boolean mo6656a(View view, boolean z, int i, int i2, int i3) {
        int i4;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom()) {
                    if (mo6656a(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (z) {
            if (view.canScrollHorizontally(mo6676k() ? i : -i)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    /* renamed from: b */
    public boolean mo6657b() {
        return this.f5336b;
    }

    /* renamed from: c */
    public boolean mo6658c() {
        return mo6661d(this.f5328a, 0);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (!this.f5330a.mo20663o(true)) {
            return;
        }
        if (!this.f5336b) {
            this.f5330a.mo20649a();
        } else {
            jt4.m18985n1(this);
        }
    }

    /* renamed from: d */
    public final boolean mo6661d(View view, int i) {
        if (!this.f5341e && !mo6706u(0.0f, i)) {
            return false;
        }
        this.f5340d = false;
        return true;
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        super.draw(canvas);
        Drawable drawable = mo6676k() ? this.f5335b : this.f5327a;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (mo6676k()) {
                i2 = childAt.getRight();
                i = intrinsicWidth + i2;
            } else {
                int left = childAt.getLeft();
                int i3 = left - intrinsicWidth;
                i = left;
                i2 = i3;
            }
            drawable.setBounds(i2, top, i, bottom);
            drawable.draw(canvas);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f5336b && !layoutParams.f5351a && this.f5328a != null) {
            canvas.getClipBounds(this.f5326a);
            if (mo6676k()) {
                Rect rect = this.f5326a;
                rect.left = Math.max(rect.left, this.f5328a.getRight());
            } else {
                Rect rect2 = this.f5326a;
                rect2.right = Math.min(rect2.right, this.f5328a.getLeft());
            }
            canvas.clipRect(this.f5326a);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* renamed from: e */
    public final void mo6664e(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (i & jt4.f14542r);
            if (layoutParams.f5350a == null) {
                layoutParams.f5350a = new Paint();
            }
            layoutParams.f5350a.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, layoutParams.f5350a);
            }
            mo6674i(view);
        } else if (view.getLayerType() != 0) {
            Paint paint = layoutParams.f5350a;
            if (paint != null) {
                paint.setColorFilter((ColorFilter) null);
            }
            C0987b bVar = new C0987b(view);
            this.f5333a.add(bVar);
            jt4.m18993p1(this, bVar);
        }
    }

    /* renamed from: f */
    public void mo6665f(View view) {
        C0989d dVar = this.f5329a;
        if (dVar != null) {
            dVar.mo6711a(view);
        }
        sendAccessibilityEvent(32);
    }

    /* renamed from: g */
    public void mo6666g(View view) {
        C0989d dVar = this.f5329a;
        if (dVar != null) {
            dVar.mo6712b(view);
        }
        sendAccessibilityEvent(32);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @d10
    public int getCoveredFadeColor() {
        return this.f5344o;
    }

    @e83
    public int getParallaxDistance() {
        return this.f5347r;
    }

    @d10
    public int getSliderFadeColor() {
        return this.f5343n;
    }

    /* renamed from: h */
    public void mo6673h(View view) {
        C0989d dVar = this.f5329a;
        if (dVar != null) {
            dVar.mo6713c(view, this.f5325a);
        }
    }

    /* renamed from: i */
    public void mo6674i(View view) {
        jt4.m18918V1(view, ((LayoutParams) view.getLayoutParams()).f5350a);
    }

    /* renamed from: j */
    public boolean mo6675j(View view) {
        if (view == null) {
            return false;
        }
        return this.f5336b && ((LayoutParams) view.getLayoutParams()).f5352b && this.f5325a > 0.0f;
    }

    /* renamed from: k */
    public boolean mo6676k() {
        return jt4.m18928Z(this) == 1;
    }

    /* renamed from: l */
    public boolean mo6677l() {
        return !this.f5336b || this.f5325a == 1.0f;
    }

    /* renamed from: m */
    public boolean mo6678m() {
        return this.f5336b;
    }

    /* renamed from: n */
    public void mo6679n(int i) {
        if (this.f5328a == null) {
            this.f5325a = 0.0f;
            return;
        }
        boolean k = mo6676k();
        LayoutParams layoutParams = (LayoutParams) this.f5328a.getLayoutParams();
        int width = this.f5328a.getWidth();
        if (k) {
            i = (getWidth() - i) - width;
        }
        float paddingRight = ((float) (i - ((k ? getPaddingRight() : getPaddingLeft()) + (k ? layoutParams.rightMargin : layoutParams.leftMargin)))) / ((float) this.f5346q);
        this.f5325a = paddingRight;
        if (this.f5347r != 0) {
            mo6691q(paddingRight);
        }
        if (layoutParams.f5352b) {
            mo6664e(this.f5328a, this.f5325a, this.f5343n);
        }
        mo6673h(this.f5328a);
    }

    /* renamed from: o */
    public boolean mo6680o() {
        return mo6690p(this.f5328a, 0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5341e = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5341e = true;
        int size = this.f5333a.size();
        for (int i = 0; i < size; i++) {
            this.f5333a.get(i).run();
        }
        this.f5333a.clear();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f5336b && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f5340d = !this.f5330a.mo20635L(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f5336b || (this.f5338c && actionMasked != 0)) {
            this.f5330a.mo20651c();
            return super.onInterceptTouchEvent(motionEvent);
        } else if (actionMasked == 3 || actionMasked == 1) {
            this.f5330a.mo20651c();
            return false;
        } else {
            if (actionMasked == 0) {
                this.f5338c = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f5337c = x;
                this.f5339d = y;
                if (this.f5330a.mo20635L(this.f5328a, (int) x, (int) y) && mo6675j(this.f5328a)) {
                    z = true;
                    return this.f5330a.mo20646W(motionEvent) || z;
                }
            } else if (actionMasked == 2) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float abs = Math.abs(x2 - this.f5337c);
                float abs2 = Math.abs(y2 - this.f5339d);
                if (abs > ((float) this.f5330a.mo20628E()) && abs2 > abs) {
                    this.f5330a.mo20651c();
                    this.f5338c = true;
                    return false;
                }
            }
            z = false;
            if (this.f5330a.mo20646W(motionEvent)) {
                return true;
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean k = mo6676k();
        mt4 mt4 = this.f5330a;
        if (k) {
            mt4.mo20643T(2);
        } else {
            mt4.mo20643T(1);
        }
        int i9 = i3 - i;
        int paddingRight = k ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = k ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f5341e) {
            this.f5325a = (!this.f5336b || !this.f5340d) ? 0.0f : 1.0f;
        }
        int i10 = paddingRight;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f5351a) {
                    int i12 = i9 - paddingLeft;
                    int min = (Math.min(paddingRight, i12 - this.f5345p) - i10) - (layoutParams.leftMargin + layoutParams.rightMargin);
                    this.f5346q = min;
                    int i13 = k ? layoutParams.rightMargin : layoutParams.leftMargin;
                    layoutParams.f5352b = ((i10 + i13) + min) + (measuredWidth / 2) > i12;
                    int i14 = (int) (((float) min) * this.f5325a);
                    i10 += i13 + i14;
                    this.f5325a = ((float) i14) / ((float) min);
                    i5 = 0;
                } else if (!this.f5336b || (i8 = this.f5347r) == 0) {
                    i10 = paddingRight;
                    i5 = 0;
                } else {
                    i5 = (int) ((1.0f - this.f5325a) * ((float) i8));
                    i10 = paddingRight;
                }
                if (k) {
                    i6 = (i9 - i10) + i5;
                    i7 = i6 - measuredWidth;
                } else {
                    i7 = i10 - i5;
                    i6 = i7 + measuredWidth;
                }
                childAt.layout(i7, paddingTop, i6, childAt.getMeasuredHeight() + paddingTop);
                paddingRight += childAt.getWidth();
            }
        }
        if (this.f5341e) {
            if (this.f5336b) {
                if (this.f5347r != 0) {
                    mo6691q(this.f5325a);
                }
                if (((LayoutParams) this.f5328a.getLayoutParams()).f5352b) {
                    mo6664e(this.f5328a, this.f5325a, this.f5343n);
                }
            } else {
                for (int i15 = 0; i15 < childCount; i15++) {
                    mo6664e(getChildAt(i15), 0.0f, this.f5343n);
                }
            }
            mo6707v(this.f5328a);
        }
        this.f5341e = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            int r1 = android.view.View.MeasureSpec.getMode(r21)
            int r2 = android.view.View.MeasureSpec.getSize(r21)
            int r3 = android.view.View.MeasureSpec.getMode(r22)
            int r4 = android.view.View.MeasureSpec.getSize(r22)
            r5 = 300(0x12c, float:4.2E-43)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1073741824(0x40000000, float:2.0)
            if (r1 == r7) goto L_0x0030
            boolean r8 = r20.isInEditMode()
            if (r8 == 0) goto L_0x0028
            if (r1 != r6) goto L_0x0023
            goto L_0x0047
        L_0x0023:
            if (r1 != 0) goto L_0x0047
            r2 = 300(0x12c, float:4.2E-43)
            goto L_0x0047
        L_0x0028:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Width must have an exact value or MATCH_PARENT"
            r1.<init>(r2)
            throw r1
        L_0x0030:
            if (r3 != 0) goto L_0x0047
            boolean r1 = r20.isInEditMode()
            if (r1 == 0) goto L_0x003f
            if (r3 != 0) goto L_0x0047
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 300(0x12c, float:4.2E-43)
            goto L_0x0047
        L_0x003f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Height must not be UNSPECIFIED"
            r1.<init>(r2)
            throw r1
        L_0x0047:
            r1 = 0
            if (r3 == r6) goto L_0x005b
            if (r3 == r7) goto L_0x004f
            r4 = 0
            r5 = 0
            goto L_0x0067
        L_0x004f:
            int r5 = r20.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r20.getPaddingBottom()
            int r4 = r4 - r5
            r5 = r4
            goto L_0x0067
        L_0x005b:
            int r5 = r20.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r20.getPaddingBottom()
            int r4 = r4 - r5
            r5 = r4
            r4 = 0
        L_0x0067:
            int r8 = r20.getPaddingLeft()
            int r8 = r2 - r8
            int r9 = r20.getPaddingRight()
            int r8 = r8 - r9
            int r9 = r20.getChildCount()
            r10 = 2
            if (r9 <= r10) goto L_0x0080
            java.lang.String r10 = "SlidingPaneLayout"
            java.lang.String r11 = "onMeasure: More than two child views are not supported."
            android.util.Log.e(r10, r11)
        L_0x0080:
            r10 = 0
            r0.f5328a = r10
            r14 = r8
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0087:
            r15 = 8
            r16 = 1
            if (r11 >= r9) goto L_0x0127
            android.view.View r6 = r0.getChildAt(r11)
            android.view.ViewGroup$LayoutParams r17 = r6.getLayoutParams()
            r7 = r17
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r7 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r7
            int r10 = r6.getVisibility()
            if (r10 != r15) goto L_0x00a3
            r7.f5352b = r1
            goto L_0x011e
        L_0x00a3:
            float r10 = r7.f5349a
            r15 = 0
            int r18 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r18 <= 0) goto L_0x00b1
            float r13 = r13 + r10
            int r10 = r7.width
            if (r10 != 0) goto L_0x00b1
            goto L_0x011e
        L_0x00b1:
            int r10 = r7.leftMargin
            int r15 = r7.rightMargin
            int r10 = r10 + r15
            int r15 = r7.width
            r1 = -2
            if (r15 != r1) goto L_0x00ca
            int r10 = r8 - r10
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r15)
            r15 = r10
            r22 = r13
            r1 = -1
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x00e1
        L_0x00ca:
            r22 = r13
            r1 = -1
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r15 != r1) goto L_0x00db
            int r10 = r8 - r10
            r15 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r15)
            r15 = r10
            goto L_0x00e1
        L_0x00db:
            r10 = 1073741824(0x40000000, float:2.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
        L_0x00e1:
            int r10 = r7.height
            r1 = -2
            if (r10 != r1) goto L_0x00eb
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r13)
            goto L_0x00fc
        L_0x00eb:
            r1 = -1
            if (r10 != r1) goto L_0x00f5
            r1 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
            goto L_0x00fb
        L_0x00f5:
            r1 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r1)
        L_0x00fb:
            r1 = r10
        L_0x00fc:
            r6.measure(r15, r1)
            int r1 = r6.getMeasuredWidth()
            int r10 = r6.getMeasuredHeight()
            if (r3 != r13) goto L_0x010f
            if (r10 <= r4) goto L_0x010f
            int r4 = java.lang.Math.min(r10, r5)
        L_0x010f:
            int r14 = r14 - r1
            if (r14 >= 0) goto L_0x0114
            r1 = 1
            goto L_0x0115
        L_0x0114:
            r1 = 0
        L_0x0115:
            r7.f5351a = r1
            r12 = r12 | r1
            if (r1 == 0) goto L_0x011c
            r0.f5328a = r6
        L_0x011c:
            r13 = r22
        L_0x011e:
            int r11 = r11 + 1
            r1 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x0087
        L_0x0127:
            if (r12 != 0) goto L_0x012e
            r1 = 0
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0213
        L_0x012e:
            int r1 = r0.f5345p
            int r1 = r8 - r1
            r3 = 0
        L_0x0133:
            if (r3 >= r9) goto L_0x0213
            android.view.View r6 = r0.getChildAt(r3)
            int r7 = r6.getVisibility()
            if (r7 != r15) goto L_0x0146
        L_0x013f:
            r19 = r1
        L_0x0141:
            r1 = 0
            r7 = 1073741824(0x40000000, float:2.0)
            goto L_0x020b
        L_0x0146:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r7 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r7
            int r10 = r6.getVisibility()
            if (r10 != r15) goto L_0x0153
            goto L_0x013f
        L_0x0153:
            int r10 = r7.width
            if (r10 != 0) goto L_0x0160
            float r10 = r7.f5349a
            r11 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x0160
            r10 = 1
            goto L_0x0161
        L_0x0160:
            r10 = 0
        L_0x0161:
            if (r10 == 0) goto L_0x0165
            r11 = 0
            goto L_0x0169
        L_0x0165:
            int r11 = r6.getMeasuredWidth()
        L_0x0169:
            if (r12 == 0) goto L_0x01ab
            android.view.View r15 = r0.f5328a
            if (r6 == r15) goto L_0x01ab
            int r15 = r7.width
            if (r15 >= 0) goto L_0x013f
            if (r11 > r1) goto L_0x017c
            float r11 = r7.f5349a
            r15 = 0
            int r11 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r11 <= 0) goto L_0x013f
        L_0x017c:
            if (r10 == 0) goto L_0x0199
            int r7 = r7.height
            r10 = -2
            if (r7 != r10) goto L_0x018c
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x01a3
        L_0x018c:
            r10 = -1
            if (r7 != r10) goto L_0x0196
            r10 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r10)
            goto L_0x01a3
        L_0x0196:
            r10 = 1073741824(0x40000000, float:2.0)
            goto L_0x019f
        L_0x0199:
            r10 = 1073741824(0x40000000, float:2.0)
            int r7 = r6.getMeasuredHeight()
        L_0x019f:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r10)
        L_0x01a3:
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10)
            r6.measure(r11, r7)
            goto L_0x013f
        L_0x01ab:
            float r10 = r7.f5349a
            r15 = 0
            int r10 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x013f
            int r10 = r7.width
            if (r10 != 0) goto L_0x01d1
            int r10 = r7.height
            r15 = -2
            if (r10 != r15) goto L_0x01c4
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r15)
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x01db
        L_0x01c4:
            r15 = -1
            if (r10 != r15) goto L_0x01ce
            r15 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r15)
            goto L_0x01db
        L_0x01ce:
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x01d7
        L_0x01d1:
            r15 = 1073741824(0x40000000, float:2.0)
            int r10 = r6.getMeasuredHeight()
        L_0x01d7:
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r15)
        L_0x01db:
            if (r12 == 0) goto L_0x01f3
            int r15 = r7.leftMargin
            int r7 = r7.rightMargin
            int r15 = r15 + r7
            int r7 = r8 - r15
            r19 = r1
            r15 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r15)
            if (r11 == r7) goto L_0x0141
            r6.measure(r1, r10)
            goto L_0x0141
        L_0x01f3:
            r19 = r1
            r1 = 0
            int r15 = java.lang.Math.max(r1, r14)
            float r7 = r7.f5349a
            float r15 = (float) r15
            float r7 = r7 * r15
            float r7 = r7 / r13
            int r7 = (int) r7
            int r11 = r11 + r7
            r7 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r7)
            r6.measure(r11, r10)
        L_0x020b:
            int r3 = r3 + 1
            r1 = r19
            r15 = 8
            goto L_0x0133
        L_0x0213:
            int r1 = r20.getPaddingTop()
            int r4 = r4 + r1
            int r1 = r20.getPaddingBottom()
            int r4 = r4 + r1
            r0.setMeasuredDimension(r2, r4)
            r0.f5336b = r12
            com.onedelhi.secure.mt4 r1 = r0.f5330a
            int r1 = r1.mo20629F()
            if (r1 == 0) goto L_0x0231
            if (r12 != 0) goto L_0x0231
            com.onedelhi.secure.mt4 r1 = r0.f5330a
            r1.mo20649a()
        L_0x0231:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0990e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0990e eVar = (C0990e) parcelable;
        super.onRestoreInstanceState(eVar.mo14959a());
        if (eVar.f5358b) {
            mo6680o();
        } else {
            mo6658c();
        }
        this.f5340d = eVar.f5358b;
    }

    public Parcelable onSaveInstanceState() {
        C0990e eVar = new C0990e(super.onSaveInstanceState());
        eVar.f5358b = mo6678m() ? mo6677l() : this.f5340d;
        return eVar;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f5341e = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f5336b) {
            return super.onTouchEvent(motionEvent);
        }
        this.f5330a.mo20636M(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.f5337c = x;
            this.f5339d = y;
        } else if (actionMasked == 1 && mo6675j(this.f5328a)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.f5337c;
            float f2 = y2 - this.f5339d;
            int E = this.f5330a.mo20628E();
            if ((f * f) + (f2 * f2) < ((float) (E * E)) && this.f5330a.mo20635L(this.f5328a, (int) x2, (int) y2)) {
                mo6661d(this.f5328a, 0);
            }
        }
        return true;
    }

    /* renamed from: p */
    public final boolean mo6690p(View view, int i) {
        if (!this.f5341e && !mo6706u(1.0f, i)) {
            return false;
        }
        this.f5340d = true;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6691q(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.mo6676k()
            android.view.View r1 = r9.f5328a
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r1
            boolean r2 = r1.f5352b
            r3 = 0
            if (r2 == 0) goto L_0x001c
            if (r0 == 0) goto L_0x0016
            int r1 = r1.rightMargin
            goto L_0x0018
        L_0x0016:
            int r1 = r1.leftMargin
        L_0x0018:
            if (r1 > 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            int r2 = r9.getChildCount()
        L_0x0021:
            if (r3 >= r2) goto L_0x0059
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.f5328a
            if (r4 != r5) goto L_0x002c
            goto L_0x0056
        L_0x002c:
            float r5 = r9.f5334b
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            int r7 = r9.f5347r
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r9.f5334b = r10
            float r8 = r6 - r10
            float r7 = (float) r7
            float r8 = r8 * r7
            int r7 = (int) r8
            int r5 = r5 - r7
            if (r0 == 0) goto L_0x0044
            int r5 = -r5
        L_0x0044:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L_0x0056
            float r5 = r9.f5334b
            if (r0 == 0) goto L_0x004f
            float r5 = r5 - r6
            goto L_0x0051
        L_0x004f:
            float r5 = r6 - r5
        L_0x0051:
            int r6 = r9.f5344o
            r9.mo6664e(r4, r5, r6)
        L_0x0056:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.mo6691q(float):void");
    }

    /* renamed from: r */
    public void mo6692r() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f5336b) {
            this.f5340d = view == this.f5328a;
        }
    }

    @Deprecated
    /* renamed from: s */
    public void mo6694s() {
        mo6658c();
    }

    public void setCoveredFadeColor(@d10 int i) {
        this.f5344o = i;
    }

    public void setPanelSlideListener(@ts2 C0989d dVar) {
        this.f5329a = dVar;
    }

    public void setParallaxDistance(@e83 int i) {
        this.f5347r = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@ts2 Drawable drawable) {
        this.f5327a = drawable;
    }

    public void setShadowDrawableRight(@ts2 Drawable drawable) {
        this.f5335b = drawable;
    }

    @Deprecated
    public void setShadowResource(@dp0 int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(r70.m26356i(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(r70.m26356i(getContext(), i));
    }

    public void setSliderFadeColor(@d10 int i) {
        this.f5343n = i;
    }

    @Deprecated
    /* renamed from: t */
    public void mo6705t() {
        mo6680o();
    }

    /* renamed from: u */
    public boolean mo6706u(float f, int i) {
        int i2;
        if (!this.f5336b) {
            return false;
        }
        boolean k = mo6676k();
        LayoutParams layoutParams = (LayoutParams) this.f5328a.getLayoutParams();
        if (k) {
            i2 = (int) (((float) getWidth()) - ((((float) (getPaddingRight() + layoutParams.rightMargin)) + (f * ((float) this.f5346q))) + ((float) this.f5328a.getWidth())));
        } else {
            i2 = (int) (((float) (getPaddingLeft() + layoutParams.leftMargin)) + (f * ((float) this.f5346q)));
        }
        mt4 mt4 = this.f5330a;
        View view = this.f5328a;
        if (!mt4.mo20647X(view, i2, view.getTop())) {
            return false;
        }
        mo6692r();
        jt4.m18985n1(this);
        return true;
    }

    /* renamed from: v */
    public void mo6707v(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        View childAt;
        boolean z;
        View view2 = view;
        boolean k = mo6676k();
        int width = k ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = k ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !m6759w(view)) {
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
        } else {
            i4 = view.getLeft();
            i3 = view.getRight();
            i2 = view.getTop();
            i = view.getBottom();
        }
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 < childCount && (childAt = getChildAt(i5)) != view2) {
                if (childAt.getVisibility() == 8) {
                    z = k;
                } else {
                    z = k;
                    childAt.setVisibility((Math.max(k ? paddingLeft : width, childAt.getLeft()) < i4 || Math.max(paddingTop, childAt.getTop()) < i2 || Math.min(k ? width : paddingLeft, childAt.getRight()) > i3 || Math.min(height, childAt.getBottom()) > i) ? 0 : 4);
                }
                i5++;
                view2 = view;
                k = z;
            } else {
                return;
            }
        }
    }
}
