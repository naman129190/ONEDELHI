package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import com.onedelhi.secure.C1824by;
import com.onedelhi.secure.C2582jy;
import com.onedelhi.secure.bo2;
import com.onedelhi.secure.co2;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.fo2;
import com.onedelhi.secure.go2;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.k10;
import com.onedelhi.secure.l42;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.ts2;

public class SwipeRefreshLayout extends ViewGroup implements fo2, bo2 {
    @hw4

    /* renamed from: A */
    public static final int f5359A = 40;
    @hw4

    /* renamed from: B */
    public static final int f5360B = 56;

    /* renamed from: C */
    public static final int f5361C = 255;

    /* renamed from: D */
    public static final int f5362D = 76;

    /* renamed from: E */
    public static final int f5363E = -1;

    /* renamed from: F */
    public static final int f5364F = 150;

    /* renamed from: G */
    public static final int f5365G = 300;

    /* renamed from: H */
    public static final int f5366H = 200;

    /* renamed from: I */
    public static final int f5367I = 200;

    /* renamed from: J */
    public static final int f5368J = -328966;

    /* renamed from: K */
    public static final int f5369K = 64;

    /* renamed from: b */
    public static final String f5370b = SwipeRefreshLayout.class.getSimpleName();

    /* renamed from: c */
    public static final int[] f5371c = {16842766};

    /* renamed from: f */
    public static final float f5372f = 2.0f;

    /* renamed from: g */
    public static final float f5373g = 0.5f;

    /* renamed from: h */
    public static final float f5374h = 0.8f;

    /* renamed from: x */
    public static final int f5375x = 0;

    /* renamed from: y */
    public static final int f5376y = 1;

    /* renamed from: z */
    public static final int f5377z = -1;

    /* renamed from: a */
    public float f5378a;

    /* renamed from: a */
    public View f5379a;

    /* renamed from: a */
    public Animation.AnimationListener f5380a;

    /* renamed from: a */
    public Animation f5381a;

    /* renamed from: a */
    public final DecelerateInterpolator f5382a;

    /* renamed from: a */
    public C1001i f5383a;

    /* renamed from: a */
    public C1002j f5384a;

    /* renamed from: a */
    public C1824by f5385a;

    /* renamed from: a */
    public final co2 f5386a;

    /* renamed from: a */
    public final go2 f5387a;

    /* renamed from: a */
    public C2582jy f5388a;

    /* renamed from: a */
    public final int[] f5389a;

    /* renamed from: b */
    public float f5390b;

    /* renamed from: b */
    public Animation f5391b;

    /* renamed from: b */
    public boolean f5392b;

    /* renamed from: b */
    public final int[] f5393b;

    /* renamed from: c */
    public float f5394c;

    /* renamed from: c */
    public Animation f5395c;

    /* renamed from: c */
    public boolean f5396c;

    /* renamed from: d */
    public float f5397d;

    /* renamed from: d */
    public Animation f5398d;

    /* renamed from: d */
    public boolean f5399d;

    /* renamed from: e */
    public float f5400e;

    /* renamed from: e */
    public Animation f5401e;

    /* renamed from: e */
    public boolean f5402e;

    /* renamed from: f */
    public final Animation f5403f;

    /* renamed from: f */
    public boolean f5404f;

    /* renamed from: g */
    public final Animation f5405g;

    /* renamed from: g */
    public boolean f5406g;

    /* renamed from: h */
    public boolean f5407h;

    /* renamed from: n */
    public int f5408n;

    /* renamed from: o */
    public int f5409o;

    /* renamed from: p */
    public int f5410p;

    /* renamed from: q */
    public int f5411q;

    /* renamed from: r */
    public int f5412r;

    /* renamed from: s */
    public int f5413s;

    /* renamed from: t */
    public int f5414t;

    /* renamed from: u */
    public int f5415u;

    /* renamed from: v */
    public int f5416v;

    /* renamed from: w */
    public int f5417w;

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a */
    public class C0993a implements Animation.AnimationListener {
        public C0993a() {
        }

        public void onAnimationEnd(Animation animation) {
            C1002j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f5392b) {
                swipeRefreshLayout.f5388a.setAlpha(255);
                SwipeRefreshLayout.this.f5388a.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.f5406g && (jVar = swipeRefreshLayout2.f5384a) != null) {
                    jVar.mo6786a();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f5410p = swipeRefreshLayout3.f5385a.getTop();
                return;
            }
            swipeRefreshLayout.mo6770x();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    public class C0994b extends Animation {
        public C0994b() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    public class C0995c extends Animation {
        public C0995c() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    public class C0996d extends Animation {

        /* renamed from: n */
        public final /* synthetic */ int f5422n;

        /* renamed from: o */
        public final /* synthetic */ int f5423o;

        public C0996d(int i, int i2) {
            this.f5422n = i;
            this.f5423o = i2;
        }

        public void applyTransformation(float f, Transformation transformation) {
            C2582jy jyVar = SwipeRefreshLayout.this.f5388a;
            int i = this.f5422n;
            jyVar.setAlpha((int) (((float) i) + (((float) (this.f5423o - i)) * f)));
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e */
    public class C0997e implements Animation.AnimationListener {
        public C0997e() {
        }

        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f5402e) {
                swipeRefreshLayout.mo6729D((Animation.AnimationListener) null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    public class C0998f extends Animation {
        public C0998f() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int abs = !swipeRefreshLayout.f5407h ? swipeRefreshLayout.f5415u - Math.abs(swipeRefreshLayout.f5414t) : swipeRefreshLayout.f5415u;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i = swipeRefreshLayout2.f5413s;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i + ((int) (((float) (abs - i)) * f))) - swipeRefreshLayout2.f5385a.getTop());
            SwipeRefreshLayout.this.f5388a.mo18753v(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g */
    public class C0999g extends Animation {
        public C0999g() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.mo6768v(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h */
    public class C1000h extends Animation {
        public C1000h() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f2 = swipeRefreshLayout.f5400e;
            swipeRefreshLayout.setAnimationProgress(f2 + ((-f2) * f));
            SwipeRefreshLayout.this.mo6768v(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i */
    public interface C1001i {
        /* renamed from: a */
        boolean mo6785a(@mr2 SwipeRefreshLayout swipeRefreshLayout, @ts2 View view);
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j */
    public interface C1002j {
        /* renamed from: a */
        void mo6786a();
    }

    public SwipeRefreshLayout(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public SwipeRefreshLayout(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5392b = false;
        this.f5378a = -1.0f;
        this.f5389a = new int[2];
        this.f5393b = new int[2];
        this.f5411q = -1;
        this.f5412r = -1;
        this.f5380a = new C0993a();
        this.f5403f = new C0998f();
        this.f5405g = new C0999g();
        this.f5408n = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f5409o = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f5382a = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f5417w = (int) (displayMetrics.density * 40.0f);
        mo6739m();
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f5415u = i;
        this.f5378a = (float) i;
        this.f5387a = new go2(this);
        this.f5386a = new co2(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f5417w;
        this.f5410p = i2;
        this.f5414t = i2;
        mo6768v(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5371c);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i) {
        this.f5385a.getBackground().setAlpha(i);
        this.f5388a.setAlpha(i);
    }

    /* renamed from: A */
    public final void mo6726A(float f) {
        float f2 = this.f5397d;
        int i = this.f5408n;
        if (f - f2 > ((float) i) && !this.f5399d) {
            this.f5394c = f2 + ((float) i);
            this.f5399d = true;
            this.f5388a.setAlpha(76);
        }
    }

    /* renamed from: B */
    public final void mo6727B() {
        this.f5398d = mo6772z(this.f5388a.getAlpha(), 255);
    }

    /* renamed from: C */
    public final void mo6728C() {
        this.f5395c = mo6772z(this.f5388a.getAlpha(), 76);
    }

    /* renamed from: D */
    public void mo6729D(Animation.AnimationListener animationListener) {
        C0995c cVar = new C0995c();
        this.f5391b = cVar;
        cVar.setDuration(150);
        this.f5385a.mo13858b(animationListener);
        this.f5385a.clearAnimation();
        this.f5385a.startAnimation(this.f5391b);
    }

    /* renamed from: E */
    public final void mo6730E(int i, Animation.AnimationListener animationListener) {
        this.f5413s = i;
        this.f5400e = this.f5385a.getScaleX();
        C1000h hVar = new C1000h();
        this.f5401e = hVar;
        hVar.setDuration(150);
        if (animationListener != null) {
            this.f5385a.mo13858b(animationListener);
        }
        this.f5385a.clearAnimation();
        this.f5385a.startAnimation(this.f5401e);
    }

    /* renamed from: F */
    public final void mo6731F(Animation.AnimationListener animationListener) {
        this.f5385a.setVisibility(0);
        this.f5388a.setAlpha(255);
        C0994b bVar = new C0994b();
        this.f5381a = bVar;
        bVar.setDuration((long) this.f5409o);
        if (animationListener != null) {
            this.f5385a.mo13858b(animationListener);
        }
        this.f5385a.clearAnimation();
        this.f5385a.startAnimation(this.f5381a);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f5386a.mo14288a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f5386a.mo14289b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f5386a.mo14290c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f5386a.mo14293f(i, i2, i3, i4, iArr);
    }

    /* renamed from: g */
    public final void mo6732g(int i, Animation.AnimationListener animationListener) {
        this.f5413s = i;
        this.f5403f.reset();
        this.f5403f.setDuration(200);
        this.f5403f.setInterpolator(this.f5382a);
        if (animationListener != null) {
            this.f5385a.mo13858b(animationListener);
        }
        this.f5385a.clearAnimation();
        this.f5385a.startAnimation(this.f5403f);
    }

    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f5412r;
        return i3 < 0 ? i2 : i2 == i + -1 ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    public int getNestedScrollAxes() {
        return this.f5387a.mo16724a();
    }

    public int getProgressCircleDiameter() {
        return this.f5417w;
    }

    public int getProgressViewEndOffset() {
        return this.f5415u;
    }

    public int getProgressViewStartOffset() {
        return this.f5414t;
    }

    public boolean hasNestedScrollingParent() {
        return this.f5386a.mo14298k();
    }

    /* renamed from: i */
    public final void mo6737i(int i, Animation.AnimationListener animationListener) {
        if (this.f5402e) {
            mo6730E(i, animationListener);
            return;
        }
        this.f5413s = i;
        this.f5405g.reset();
        this.f5405g.setDuration(200);
        this.f5405g.setInterpolator(this.f5382a);
        if (animationListener != null) {
            this.f5385a.mo13858b(animationListener);
        }
        this.f5385a.clearAnimation();
        this.f5385a.startAnimation(this.f5405g);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f5386a.mo14300m();
    }

    /* renamed from: j */
    public boolean mo6738j() {
        C1001i iVar = this.f5383a;
        if (iVar != null) {
            return iVar.mo6785a(this, this.f5379a);
        }
        View view = this.f5379a;
        return view instanceof ListView ? l42.m20215a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    /* renamed from: m */
    public final void mo6739m() {
        this.f5385a = new C1824by(getContext(), f5368J);
        C2582jy jyVar = new C2582jy(getContext());
        this.f5388a = jyVar;
        jyVar.mo18724F(1);
        this.f5385a.setImageDrawable(this.f5388a);
        this.f5385a.setVisibility(8);
        addView(this.f5385a);
    }

    /* renamed from: o */
    public final void mo6740o() {
        if (this.f5379a == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f5385a)) {
                    this.f5379a = childAt;
                    return;
                }
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo6770x();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        mo6740o();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5404f && actionMasked == 0) {
            this.f5404f = false;
        }
        if (!isEnabled() || this.f5404f || mo6738j() || this.f5392b || this.f5396c) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f5411q;
                    if (i == -1) {
                        Log.e(f5370b, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    mo6726A(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        mo6769w(motionEvent);
                    }
                }
            }
            this.f5399d = false;
            this.f5411q = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f5414t - this.f5385a.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f5411q = pointerId;
            this.f5399d = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f5397d = motionEvent.getY(findPointerIndex2);
        }
        return this.f5399d;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f5379a == null) {
                mo6740o();
            }
            View view = this.f5379a;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f5385a.getMeasuredWidth();
                int measuredHeight2 = this.f5385a.getMeasuredHeight();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.f5410p;
                this.f5385a.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f5379a == null) {
            mo6740o();
        }
        View view = this.f5379a;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f5385a.measure(View.MeasureSpec.makeMeasureSpec(this.f5417w, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f5417w, 1073741824));
            this.f5412r = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.f5385a) {
                    this.f5412r = i3;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f5390b;
            if (f > 0.0f) {
                float f2 = (float) i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f5390b = 0.0f;
                } else {
                    this.f5390b = f - f2;
                    iArr[1] = i2;
                }
                mo6767u(this.f5390b);
            }
        }
        if (this.f5407h && i2 > 0 && this.f5390b == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f5385a.setVisibility(8);
        }
        int[] iArr2 = this.f5389a;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f5393b);
        int i5 = i4 + this.f5393b[1];
        if (i5 < 0 && !mo6738j()) {
            float abs = this.f5390b + ((float) Math.abs(i5));
            this.f5390b = abs;
            mo6767u(abs);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f5387a.mo16725b(view, view2, i);
        startNestedScroll(i & 2);
        this.f5390b = 0.0f;
        this.f5396c = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.f5404f && !this.f5392b && (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f5387a.mo16727d(view);
        this.f5396c = false;
        float f = this.f5390b;
        if (f > 0.0f) {
            mo6746q(f);
            this.f5390b = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5404f && actionMasked == 0) {
            this.f5404f = false;
        }
        if (!isEnabled() || this.f5404f || mo6738j() || this.f5392b || this.f5396c) {
            return false;
        }
        if (actionMasked == 0) {
            this.f5411q = motionEvent.getPointerId(0);
            this.f5399d = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f5411q);
            if (findPointerIndex < 0) {
                Log.e(f5370b, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f5399d) {
                this.f5399d = false;
                mo6746q((motionEvent.getY(findPointerIndex) - this.f5394c) * 0.5f);
            }
            this.f5411q = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f5411q);
            if (findPointerIndex2 < 0) {
                Log.e(f5370b, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y = motionEvent.getY(findPointerIndex2);
            mo6726A(y);
            if (this.f5399d) {
                float f = (y - this.f5394c) * 0.5f;
                if (f <= 0.0f) {
                    return false;
                }
                mo6767u(f);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(f5370b, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f5411q = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                mo6769w(motionEvent);
            }
        }
        return true;
    }

    /* renamed from: q */
    public final void mo6746q(float f) {
        if (f > this.f5378a) {
            mo6771y(true, true);
            return;
        }
        this.f5392b = false;
        this.f5388a.mo18721C(0.0f, 0.0f);
        C0997e eVar = null;
        if (!this.f5402e) {
            eVar = new C0997e();
        }
        mo6737i(this.f5410p, eVar);
        this.f5388a.mo18752u(false);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        View view = this.f5379a;
        if (view == null || jt4.m18920W0(view)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: s */
    public final boolean mo6748s(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    public void setAnimationProgress(float f) {
        this.f5385a.setScaleX(f);
        this.f5385a.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(@k10 int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@d10 int... iArr) {
        mo6740o();
        this.f5388a.mo18756y(iArr);
    }

    public void setColorSchemeResources(@k10 int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = r70.m26353f(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f5378a = (float) i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo6770x();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f5386a.mo14303p(z);
    }

    public void setOnChildScrollUpCallback(@ts2 C1001i iVar) {
        this.f5383a = iVar;
    }

    public void setOnRefreshListener(@ts2 C1002j jVar) {
        this.f5384a = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(@d10 int i) {
        this.f5385a.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(@k10 int i) {
        setProgressBackgroundColorSchemeColor(r70.m26353f(getContext(), i));
    }

    public void setProgressViewEndTarget(boolean z, int i) {
        this.f5415u = i;
        this.f5402e = z;
        this.f5385a.invalidate();
    }

    public void setProgressViewOffset(boolean z, int i, int i2) {
        this.f5402e = z;
        this.f5414t = i;
        this.f5415u = i2;
        this.f5407h = true;
        mo6770x();
        this.f5392b = false;
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f5392b == z) {
            mo6771y(z, false);
            return;
        }
        this.f5392b = z;
        setTargetOffsetTopAndBottom((!this.f5407h ? this.f5415u + this.f5414t : this.f5415u) - this.f5410p);
        this.f5406g = false;
        mo6731F(this.f5380a);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            this.f5417w = (int) (getResources().getDisplayMetrics().density * (i == 0 ? 56.0f : 40.0f));
            this.f5385a.setImageDrawable((Drawable) null);
            this.f5388a.mo18724F(i);
            this.f5385a.setImageDrawable(this.f5388a);
        }
    }

    public void setSlingshotDistance(@e83 int i) {
        this.f5416v = i;
    }

    public void setTargetOffsetTopAndBottom(int i) {
        this.f5385a.bringToFront();
        jt4.m18953f1(this.f5385a, i);
        this.f5410p = this.f5385a.getTop();
    }

    public boolean startNestedScroll(int i) {
        return this.f5386a.mo14305r(i);
    }

    public void stopNestedScroll() {
        this.f5386a.mo14307t();
    }

    /* renamed from: t */
    public boolean mo6766t() {
        return this.f5392b;
    }

    /* renamed from: u */
    public final void mo6767u(float f) {
        this.f5388a.mo18752u(true);
        float min = Math.min(1.0f, Math.abs(f / this.f5378a));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f5378a;
        int i = this.f5416v;
        if (i <= 0) {
            i = this.f5407h ? this.f5415u - this.f5414t : this.f5415u;
        }
        float f2 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.f5414t + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        if (this.f5385a.getVisibility() != 0) {
            this.f5385a.setVisibility(0);
        }
        if (!this.f5402e) {
            this.f5385a.setScaleX(1.0f);
            this.f5385a.setScaleY(1.0f);
        }
        if (this.f5402e) {
            setAnimationProgress(Math.min(1.0f, f / this.f5378a));
        }
        if (f < this.f5378a) {
            if (this.f5388a.getAlpha() > 76 && !mo6748s(this.f5395c)) {
                mo6728C();
            }
        } else if (this.f5388a.getAlpha() < 255 && !mo6748s(this.f5398d)) {
            mo6727B();
        }
        this.f5388a.mo18721C(0.0f, Math.min(0.8f, max * 0.8f));
        this.f5388a.mo18753v(Math.min(1.0f, max));
        this.f5388a.mo18757z((((max * 0.4f) - 16.0f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i2 - this.f5410p);
    }

    /* renamed from: v */
    public void mo6768v(float f) {
        int i = this.f5413s;
        setTargetOffsetTopAndBottom((i + ((int) (((float) (this.f5414t - i)) * f))) - this.f5385a.getTop());
    }

    /* renamed from: w */
    public final void mo6769w(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5411q) {
            this.f5411q = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* renamed from: x */
    public void mo6770x() {
        this.f5385a.clearAnimation();
        this.f5388a.stop();
        this.f5385a.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f5402e) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f5414t - this.f5410p);
        }
        this.f5410p = this.f5385a.getTop();
    }

    /* renamed from: y */
    public final void mo6771y(boolean z, boolean z2) {
        if (this.f5392b != z) {
            this.f5406g = z2;
            mo6740o();
            this.f5392b = z;
            if (z) {
                mo6732g(this.f5410p, this.f5380a);
            } else {
                mo6729D(this.f5380a);
            }
        }
    }

    /* renamed from: z */
    public final Animation mo6772z(int i, int i2) {
        C0996d dVar = new C0996d(i, i2);
        dVar.setDuration(300);
        this.f5385a.mo13858b((Animation.AnimationListener) null);
        this.f5385a.clearAnimation();
        this.f5385a.startAnimation(dVar);
        return dVar;
    }
}
