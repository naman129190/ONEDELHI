package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C2015e0;
import com.onedelhi.secure.C3884x1;
import com.onedelhi.secure.ay2;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.ju2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.sx4;
import com.onedelhi.secure.ts2;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {

    /* renamed from: I */
    public static final int f5803I = 1;

    /* renamed from: J */
    public static final int f5804J = 600;

    /* renamed from: K */
    public static final int f5805K = 25;

    /* renamed from: L */
    public static final int f5806L = 16;

    /* renamed from: M */
    public static final int f5807M = 400;

    /* renamed from: N */
    public static final int f5808N = -1;

    /* renamed from: O */
    public static final int f5809O = 2;

    /* renamed from: P */
    public static final int f5810P = 0;

    /* renamed from: Q */
    public static final int f5811Q = 1;

    /* renamed from: R */
    public static final int f5812R = 2;

    /* renamed from: S */
    public static final int f5813S = 0;

    /* renamed from: T */
    public static final int f5814T = 1;

    /* renamed from: U */
    public static final int f5815U = 2;

    /* renamed from: a */
    public static final Interpolator f5816a = new C1102b();

    /* renamed from: a */
    public static final C1115n f5817a = new C1115n();

    /* renamed from: a */
    public static final Comparator<C1106f> f5818a = new C1101a();

    /* renamed from: a */
    public static final int[] f5819a = {16842931};

    /* renamed from: b */
    public static final String f5820b = "ViewPager";

    /* renamed from: l */
    public static final boolean f5821l = false;

    /* renamed from: m */
    public static final boolean f5822m = false;

    /* renamed from: A */
    public int f5823A;

    /* renamed from: B */
    public int f5824B;

    /* renamed from: C */
    public int f5825C;

    /* renamed from: D */
    public int f5826D;

    /* renamed from: E */
    public int f5827E;

    /* renamed from: F */
    public int f5828F;

    /* renamed from: G */
    public int f5829G;

    /* renamed from: H */
    public int f5830H = 0;

    /* renamed from: a */
    public float f5831a = -3.4028235E38f;

    /* renamed from: a */
    public final Rect f5832a = new Rect();

    /* renamed from: a */
    public Drawable f5833a;

    /* renamed from: a */
    public Parcelable f5834a = null;

    /* renamed from: a */
    public VelocityTracker f5835a;

    /* renamed from: a */
    public EdgeEffect f5836a;

    /* renamed from: a */
    public Scroller f5837a;

    /* renamed from: a */
    public final C1106f f5838a = new C1106f();

    /* renamed from: a */
    public C1109i f5839a;

    /* renamed from: a */
    public C1110j f5840a;

    /* renamed from: a */
    public C1111k f5841a;

    /* renamed from: a */
    public ay2 f5842a;

    /* renamed from: a */
    public ClassLoader f5843a = null;

    /* renamed from: a */
    public final Runnable f5844a = new C1103c();

    /* renamed from: a */
    public final ArrayList<C1106f> f5845a = new ArrayList<>();

    /* renamed from: a */
    public List<C1109i> f5846a;

    /* renamed from: b */
    public float f5847b = Float.MAX_VALUE;

    /* renamed from: b */
    public long f5848b;

    /* renamed from: b */
    public EdgeEffect f5849b;

    /* renamed from: b */
    public C1109i f5850b;

    /* renamed from: b */
    public ArrayList<View> f5851b;

    /* renamed from: b */
    public List<C1108h> f5852b;

    /* renamed from: b */
    public boolean f5853b;

    /* renamed from: c */
    public float f5854c;

    /* renamed from: c */
    public boolean f5855c;

    /* renamed from: d */
    public float f5856d;

    /* renamed from: d */
    public boolean f5857d;

    /* renamed from: e */
    public float f5858e;

    /* renamed from: e */
    public boolean f5859e;

    /* renamed from: f */
    public float f5860f;

    /* renamed from: f */
    public boolean f5861f;

    /* renamed from: g */
    public boolean f5862g;

    /* renamed from: h */
    public boolean f5863h;

    /* renamed from: i */
    public boolean f5864i = true;

    /* renamed from: j */
    public boolean f5865j = false;

    /* renamed from: k */
    public boolean f5866k;

    /* renamed from: n */
    public int f5867n;

    /* renamed from: o */
    public int f5868o;

    /* renamed from: p */
    public int f5869p = -1;

    /* renamed from: q */
    public int f5870q;

    /* renamed from: r */
    public int f5871r;

    /* renamed from: s */
    public int f5872s;

    /* renamed from: t */
    public int f5873t;

    /* renamed from: u */
    public int f5874u;

    /* renamed from: v */
    public int f5875v = 1;

    /* renamed from: w */
    public int f5876w;

    /* renamed from: x */
    public int f5877x;

    /* renamed from: y */
    public int f5878y;

    /* renamed from: z */
    public int f5879z = -1;

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public float f5880a = 0.0f;

        /* renamed from: a */
        public int f5881a;

        /* renamed from: a */
        public boolean f5882a;

        /* renamed from: b */
        public int f5883b;

        /* renamed from: b */
        public boolean f5884b;

        /* renamed from: c */
        public int f5885c;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f5819a);
            this.f5881a = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    public static class C1101a implements Comparator<C1106f> {
        /* renamed from: a */
        public int compare(C1106f fVar, C1106f fVar2) {
            return fVar.f5890a - fVar2.f5890a;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$b */
    public static class C1102b implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    public class C1103c implements Runnable {
        public C1103c() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.mo7117J();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    public class C1104d implements ju2 {

        /* renamed from: a */
        public final Rect f5887a = new Rect();

        public C1104d() {
        }

        /* renamed from: a */
        public sx4 mo1063a(View view, sx4 sx4) {
            sx4 g1 = jt4.m18957g1(view, sx4);
            if (g1.mo24576A()) {
                return g1;
            }
            Rect rect = this.f5887a;
            rect.left = g1.mo24603p();
            rect.top = g1.mo24605r();
            rect.right = g1.mo24604q();
            rect.bottom = g1.mo24602o();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                sx4 p = jt4.m18991p(ViewPager.this.getChildAt(i), g1);
                rect.left = Math.min(p.mo24603p(), rect.left);
                rect.top = Math.min(p.mo24605r(), rect.top);
                rect.right = Math.min(p.mo24604q(), rect.right);
                rect.bottom = Math.min(p.mo24602o(), rect.bottom);
            }
            return g1.mo24579D(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    public @interface C1105e {
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    public static class C1106f {

        /* renamed from: a */
        public float f5889a;

        /* renamed from: a */
        public int f5890a;

        /* renamed from: a */
        public Object f5891a;

        /* renamed from: a */
        public boolean f5892a;

        /* renamed from: b */
        public float f5893b;
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    public class C1107g extends C3884x1 {
        public C1107g() {
        }

        /* renamed from: f */
        public void mo3892f(View view, AccessibilityEvent accessibilityEvent) {
            ay2 ay2;
            super.mo3892f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(mo7204n());
            if (accessibilityEvent.getEventType() == 4096 && (ay2 = ViewPager.this.f5842a) != null) {
                accessibilityEvent.setItemCount(ay2.mo13317e());
                accessibilityEvent.setFromIndex(ViewPager.this.f5868o);
                accessibilityEvent.setToIndex(ViewPager.this.f5868o);
            }
        }

        /* renamed from: g */
        public void mo3893g(View view, C1638a2 a2Var) {
            super.mo3893g(view, a2Var);
            a2Var.mo12548W0(ViewPager.class.getName());
            a2Var.mo12498F1(mo7204n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                a2Var.mo12556a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                a2Var.mo12556a(8192);
            }
        }

        /* renamed from: j */
        public boolean mo3894j(View view, int i, Bundle bundle) {
            ViewPager viewPager;
            int i2;
            if (super.mo3894j(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i2 = viewPager.f5868o - 1;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                viewPager = ViewPager.this;
                i2 = viewPager.f5868o + 1;
            }
            viewPager.setCurrentItem(i2);
            return true;
        }

        /* renamed from: n */
        public final boolean mo7204n() {
            ay2 ay2 = ViewPager.this.f5842a;
            return ay2 != null && ay2.mo13317e() > 1;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    public interface C1108h {
        /* renamed from: a */
        void mo7103a(@mr2 ViewPager viewPager, @ts2 ay2 ay2, @ts2 ay2 ay22);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$i */
    public interface C1109i {
        /* renamed from: b */
        void mo7104b(int i, float f, @e83 int i2);

        /* renamed from: c */
        void mo7105c(int i);

        /* renamed from: d */
        void mo7106d(int i);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$j */
    public interface C1110j {
        /* renamed from: a */
        void mo7205a(@mr2 View view, float f);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$k */
    public class C1111k extends DataSetObserver {
        public C1111k() {
        }

        public void onChanged() {
            ViewPager.this.mo7159j();
        }

        public void onInvalidated() {
            ViewPager.this.mo7159j();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$l */
    public static class C1112l extends C2015e0 {
        public static final Parcelable.Creator<C1112l> CREATOR = new C1113a();

        /* renamed from: a */
        public ClassLoader f5896a;

        /* renamed from: b */
        public Parcelable f5897b;

        /* renamed from: n */
        public int f5898n;

        /* renamed from: androidx.viewpager.widget.ViewPager$l$a */
        public static class C1113a implements Parcelable.ClassLoaderCreator<C1112l> {
            /* renamed from: a */
            public C1112l createFromParcel(Parcel parcel) {
                return new C1112l(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C1112l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1112l(parcel, classLoader);
            }

            /* renamed from: c */
            public C1112l[] newArray(int i) {
                return new C1112l[i];
            }
        }

        public C1112l(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f5898n = parcel.readInt();
            this.f5897b = parcel.readParcelable(classLoader);
            this.f5896a = classLoader;
        }

        public C1112l(@mr2 Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f5898n + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5898n);
            parcel.writeParcelable(this.f5897b, i);
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$m */
    public static class C1114m implements C1109i {
        /* renamed from: b */
        public void mo7104b(int i, float f, int i2) {
        }

        /* renamed from: c */
        public void mo7105c(int i) {
        }

        /* renamed from: d */
        public void mo7106d(int i) {
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$n */
    public static class C1115n implements Comparator<View> {
        /* renamed from: a */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z = layoutParams.f5882a;
            return z != layoutParams2.f5882a ? z ? 1 : -1 : layoutParams.f5883b - layoutParams2.f5883b;
        }
    }

    public ViewPager(@mr2 Context context) {
        super(context);
        mo7199z();
    }

    public ViewPager(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        super(context, attributeSet);
        mo7199z();
    }

    /* renamed from: A */
    public static boolean m7234A(@mr2 View view) {
        return view.getClass().getAnnotation(C1105e.class) != null;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f5857d != z) {
            this.f5857d = z;
        }
    }

    /* renamed from: B */
    public boolean mo7109B() {
        return this.f5863h;
    }

    /* renamed from: C */
    public final boolean mo7110C(float f, float f2) {
        return (f < ((float) this.f5877x) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f5877x)) && f2 < 0.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    @com.onedelhi.secure.C3740us
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7111D(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f5827E
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L_0x001b:
            if (r7 >= r6) goto L_0x006b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.f5882a
            if (r10 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r9 = r9.f5881a
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004d
            r10 = 3
            if (r9 == r10) goto L_0x0047
            r10 = 5
            if (r9 == r10) goto L_0x003a
            r9 = r3
            goto L_0x005c
        L_0x003a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L_0x0059
        L_0x0047:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005c
        L_0x004d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L_0x0059:
            r11 = r9
            r9 = r3
            r3 = r11
        L_0x005c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0067
            r8.offsetLeftAndRight(r3)
        L_0x0067:
            r3 = r9
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006b:
            r12.mo7161l(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$j r13 = r12.f5840a
            if (r13 == 0) goto L_0x009f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007a:
            if (r1 >= r14) goto L_0x009f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = (androidx.viewpager.widget.ViewPager.LayoutParams) r0
            boolean r0 = r0.f5882a
            if (r0 == 0) goto L_0x008b
            goto L_0x009c
        L_0x008b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$j r3 = r12.f5840a
            r3.mo7205a(r15, r0)
        L_0x009c:
            int r1 = r1 + 1
            goto L_0x007a
        L_0x009f:
            r12.f5866k = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo7111D(int, float, int):void");
    }

    /* renamed from: E */
    public final void mo7112E(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5879z) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f5854c = motionEvent.getX(i);
            this.f5879z = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f5835a;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: F */
    public boolean mo7113F() {
        int i = this.f5868o;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    /* renamed from: G */
    public boolean mo7114G() {
        ay2 ay2 = this.f5842a;
        if (ay2 == null || this.f5868o >= ay2.mo13317e() - 1) {
            return false;
        }
        setCurrentItem(this.f5868o + 1, true);
        return true;
    }

    /* renamed from: H */
    public final boolean mo7115H(int i) {
        if (this.f5845a.size() != 0) {
            C1106f x = mo7197x();
            int clientWidth = getClientWidth();
            int i2 = this.f5870q;
            int i3 = clientWidth + i2;
            float f = (float) clientWidth;
            int i4 = x.f5890a;
            float f2 = ((((float) i) / f) - x.f5893b) / (x.f5889a + (((float) i2) / f));
            this.f5866k = false;
            mo7111D(i4, f2, (int) (((float) i3) * f2));
            if (this.f5866k) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f5864i) {
            return false;
        } else {
            this.f5866k = false;
            mo7111D(0, 0.0f, 0);
            if (this.f5866k) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* renamed from: I */
    public final boolean mo7116I(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f5854c - f;
        this.f5854c = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.f5831a * clientWidth;
        float f4 = this.f5847b * clientWidth;
        boolean z3 = false;
        C1106f fVar = this.f5845a.get(0);
        ArrayList<C1106f> arrayList = this.f5845a;
        C1106f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f5890a != 0) {
            f3 = fVar.f5893b * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.f5890a != this.f5842a.mo13317e() - 1) {
            f4 = fVar2.f5893b * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f5836a.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f5849b.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f5854c += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        mo7115H(i);
        return z3;
    }

    /* renamed from: J */
    public void mo7117J() {
        mo7118K(this.f5868o);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c0, code lost:
        if (r10 >= 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ce, code lost:
        if (r10 >= 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00dc, code lost:
        if (r10 >= 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e7, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013c, code lost:
        if (r4 < r0.f5845a.size()) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0147, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015a, code lost:
        if (r4 < r0.f5845a.size()) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016c, code lost:
        if (r4 < r0.f5845a.size()) goto L_0x013e;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7118K(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f5868o
            if (r2 == r1) goto L_0x000f
            androidx.viewpager.widget.ViewPager$f r2 = r0.mo7198y(r2)
            r0.f5868o = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            com.onedelhi.secure.ay2 r1 = r0.f5842a
            if (r1 != 0) goto L_0x0018
            r17.mo7131X()
            return
        L_0x0018:
            boolean r1 = r0.f5859e
            if (r1 == 0) goto L_0x0020
            r17.mo7131X()
            return
        L_0x0020:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0027
            return
        L_0x0027:
            com.onedelhi.secure.ay2 r1 = r0.f5842a
            r1.mo4843t(r0)
            int r1 = r0.f5875v
            int r4 = r0.f5868o
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            com.onedelhi.secure.ay2 r6 = r0.f5842a
            int r6 = r6.mo13317e()
            int r7 = r6 + -1
            int r8 = r0.f5868o
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f5867n
            if (r6 != r7) goto L_0x01ef
            r7 = 0
        L_0x004a:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f5845a
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0066
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f5845a
            java.lang.Object r8 = r8.get(r7)
            androidx.viewpager.widget.ViewPager$f r8 = (androidx.viewpager.widget.ViewPager.C1106f) r8
            int r9 = r8.f5890a
            int r10 = r0.f5868o
            if (r9 < r10) goto L_0x0063
            if (r9 != r10) goto L_0x0066
            goto L_0x0067
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 != 0) goto L_0x0071
            if (r6 <= 0) goto L_0x0071
            int r8 = r0.f5868o
            androidx.viewpager.widget.ViewPager$f r8 = r0.mo7132a(r8, r7)
        L_0x0071:
            r9 = 0
            if (r8 == 0) goto L_0x017c
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0081
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r11 = r0.f5845a
            java.lang.Object r11 = r11.get(r10)
            androidx.viewpager.widget.ViewPager$f r11 = (androidx.viewpager.widget.ViewPager.C1106f) r11
            goto L_0x0082
        L_0x0081:
            r11 = 0
        L_0x0082:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x008c
            r14 = 0
            goto L_0x0098
        L_0x008c:
            float r14 = r8.f5889a
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r14 = r14 + r15
        L_0x0098:
            int r3 = r0.f5868o
            int r3 = r3 + -1
            r15 = 0
        L_0x009d:
            if (r3 < 0) goto L_0x00ed
            int r16 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x00c3
            if (r3 >= r4) goto L_0x00c3
            if (r11 != 0) goto L_0x00a8
            goto L_0x00ed
        L_0x00a8:
            int r5 = r11.f5890a
            if (r3 != r5) goto L_0x00e9
            boolean r5 = r11.f5892a
            if (r5 != 0) goto L_0x00e9
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f5845a
            r5.remove(r10)
            com.onedelhi.secure.ay2 r5 = r0.f5842a
            java.lang.Object r11 = r11.f5891a
            r5.mo4836b(r0, r3, r11)
            int r10 = r10 + -1
            int r7 = r7 + -1
            if (r10 < 0) goto L_0x00e7
            goto L_0x00de
        L_0x00c3:
            if (r11 == 0) goto L_0x00d1
            int r5 = r11.f5890a
            if (r3 != r5) goto L_0x00d1
            float r5 = r11.f5889a
            float r15 = r15 + r5
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x00e7
            goto L_0x00de
        L_0x00d1:
            int r5 = r10 + 1
            androidx.viewpager.widget.ViewPager$f r5 = r0.mo7132a(r3, r5)
            float r5 = r5.f5889a
            float r15 = r15 + r5
            int r7 = r7 + 1
            if (r10 < 0) goto L_0x00e7
        L_0x00de:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f5845a
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1106f) r5
            goto L_0x00e8
        L_0x00e7:
            r5 = 0
        L_0x00e8:
            r11 = r5
        L_0x00e9:
            int r3 = r3 + -1
            r5 = 0
            goto L_0x009d
        L_0x00ed:
            float r3 = r8.f5889a
            int r4 = r7 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0170
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f5845a
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0106
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f5845a
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1106f) r5
            goto L_0x0107
        L_0x0106:
            r5 = 0
        L_0x0107:
            if (r12 > 0) goto L_0x010b
            r10 = 0
            goto L_0x0113
        L_0x010b:
            int r10 = r17.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r12
            float r10 = r10 / r11
            float r10 = r10 + r13
        L_0x0113:
            int r11 = r0.f5868o
        L_0x0115:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x0170
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0149
            if (r11 <= r1) goto L_0x0149
            if (r5 != 0) goto L_0x0122
            goto L_0x0170
        L_0x0122:
            int r12 = r5.f5890a
            if (r11 != r12) goto L_0x016f
            boolean r12 = r5.f5892a
            if (r12 != 0) goto L_0x016f
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r12 = r0.f5845a
            r12.remove(r4)
            com.onedelhi.secure.ay2 r12 = r0.f5842a
            java.lang.Object r5 = r5.f5891a
            r12.mo4836b(r0, r11, r5)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f5845a
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0147
        L_0x013e:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f5845a
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1106f) r5
            goto L_0x016f
        L_0x0147:
            r5 = 0
            goto L_0x016f
        L_0x0149:
            if (r5 == 0) goto L_0x015d
            int r12 = r5.f5890a
            if (r11 != r12) goto L_0x015d
            float r5 = r5.f5889a
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f5845a
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0147
            goto L_0x013e
        L_0x015d:
            androidx.viewpager.widget.ViewPager$f r5 = r0.mo7132a(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.f5889a
            float r3 = r3 + r5
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f5845a
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0147
            goto L_0x013e
        L_0x016f:
            goto L_0x0115
        L_0x0170:
            r0.mo7147f(r8, r7, r2)
            com.onedelhi.secure.ay2 r1 = r0.f5842a
            int r2 = r0.f5868o
            java.lang.Object r3 = r8.f5891a
            r1.mo4842q(r0, r2, r3)
        L_0x017c:
            com.onedelhi.secure.ay2 r1 = r0.f5842a
            r1.mo4837d(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x0186:
            if (r2 >= r1) goto L_0x01af
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r4 = (androidx.viewpager.widget.ViewPager.LayoutParams) r4
            r4.f5885c = r2
            boolean r5 = r4.f5882a
            if (r5 != 0) goto L_0x01ac
            float r5 = r4.f5880a
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01ac
            androidx.viewpager.widget.ViewPager$f r3 = r0.mo7196w(r3)
            if (r3 == 0) goto L_0x01ac
            float r5 = r3.f5889a
            r4.f5880a = r5
            int r3 = r3.f5890a
            r4.f5883b = r3
        L_0x01ac:
            int r2 = r2 + 1
            goto L_0x0186
        L_0x01af:
            r17.mo7131X()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x01ee
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01c3
            androidx.viewpager.widget.ViewPager$f r3 = r0.mo7194v(r1)
            goto L_0x01c4
        L_0x01c3:
            r3 = 0
        L_0x01c4:
            if (r3 == 0) goto L_0x01cc
            int r1 = r3.f5890a
            int r2 = r0.f5868o
            if (r1 == r2) goto L_0x01ee
        L_0x01cc:
            r5 = 0
        L_0x01cd:
            int r1 = r17.getChildCount()
            if (r5 >= r1) goto L_0x01ee
            android.view.View r1 = r0.getChildAt(r5)
            androidx.viewpager.widget.ViewPager$f r2 = r0.mo7196w(r1)
            if (r2 == 0) goto L_0x01eb
            int r2 = r2.f5890a
            int r3 = r0.f5868o
            if (r2 != r3) goto L_0x01eb
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 == 0) goto L_0x01eb
            goto L_0x01ee
        L_0x01eb:
            int r5 = r5 + 1
            goto L_0x01cd
        L_0x01ee:
            return
        L_0x01ef:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x01fc }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x01fc }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x01fc }
            goto L_0x0204
        L_0x01fc:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0204:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.f5867n
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            com.onedelhi.secure.ay2 r1 = r0.f5842a
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo7118K(int):void");
    }

    /* renamed from: L */
    public final void mo7119L(int i, int i2, int i3, int i4) {
        int min;
        if (i2 <= 0 || this.f5845a.isEmpty()) {
            C1106f y = mo7198y(this.f5868o);
            min = (int) ((y != null ? Math.min(y.f5893b, this.f5847b) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                mo7158i(false);
            } else {
                return;
            }
        } else if (!this.f5837a.isFinished()) {
            this.f5837a.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)));
        }
        scrollTo(min, getScrollY());
    }

    /* renamed from: M */
    public final void mo7120M() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).f5882a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: N */
    public void mo7121N(@mr2 C1108h hVar) {
        List<C1108h> list = this.f5852b;
        if (list != null) {
            list.remove(hVar);
        }
    }

    /* renamed from: O */
    public void mo7122O(@mr2 C1109i iVar) {
        List<C1109i> list = this.f5846a;
        if (list != null) {
            list.remove(iVar);
        }
    }

    /* renamed from: P */
    public final void mo7123P(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: Q */
    public final boolean mo7124Q() {
        this.f5879z = -1;
        mo7177q();
        this.f5836a.onRelease();
        this.f5849b.onRelease();
        return this.f5836a.isFinished() || this.f5849b.isFinished();
    }

    /* renamed from: R */
    public final void mo7125R(int i, boolean z, int i2, boolean z2) {
        C1106f y = mo7198y(i);
        int clientWidth = y != null ? (int) (((float) getClientWidth()) * Math.max(this.f5831a, Math.min(y.f5893b, this.f5847b))) : 0;
        if (z) {
            mo7130W(clientWidth, 0, i2);
            if (z2) {
                mo7162m(i);
                return;
            }
            return;
        }
        if (z2) {
            mo7162m(i);
        }
        mo7158i(false);
        scrollTo(clientWidth, 0);
        mo7115H(clientWidth);
    }

    /* renamed from: S */
    public void mo7126S(int i, boolean z, boolean z2) {
        mo7127T(i, z, z2, 0);
    }

    /* renamed from: T */
    public void mo7127T(int i, boolean z, boolean z2, int i2) {
        ay2 ay2 = this.f5842a;
        boolean z3 = false;
        if (ay2 == null || ay2.mo13317e() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f5868o != i || this.f5845a.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f5842a.mo13317e()) {
                i = this.f5842a.mo13317e() - 1;
            }
            int i3 = this.f5875v;
            int i4 = this.f5868o;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f5845a.size(); i5++) {
                    this.f5845a.get(i5).f5892a = true;
                }
            }
            if (this.f5868o != i) {
                z3 = true;
            }
            if (this.f5864i) {
                this.f5868o = i;
                if (z3) {
                    mo7162m(i);
                }
                requestLayout();
                return;
            }
            mo7118K(i);
            mo7125R(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: U */
    public C1109i mo7128U(C1109i iVar) {
        C1109i iVar2 = this.f5850b;
        this.f5850b = iVar;
        return iVar2;
    }

    /* renamed from: V */
    public void mo7129V(int i, int i2) {
        mo7130W(i, i2, 0);
    }

    /* renamed from: W */
    public void mo7130W(int i, int i2, int i3) {
        int i4;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f5837a;
        if (scroller != null && !scroller.isFinished()) {
            i4 = this.f5853b ? this.f5837a.getCurrX() : this.f5837a.getStartX();
            this.f5837a.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollX();
        }
        int i5 = i4;
        int scrollY = getScrollY();
        int i6 = i - i5;
        int i7 = i2 - scrollY;
        if (i6 == 0 && i7 == 0) {
            mo7158i(false);
            mo7117J();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i8;
        float o = f2 + (mo7164o(Math.min(1.0f, (((float) Math.abs(i6)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(o / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i6)) / ((f * this.f5842a.mo13320h(this.f5868o)) + ((float) this.f5870q))) + 1.0f) * 100.0f), 600);
        this.f5853b = false;
        this.f5837a.startScroll(i5, scrollY, i6, i7, min);
        jt4.m18985n1(this);
    }

    /* renamed from: X */
    public final void mo7131X() {
        if (this.f5829G != 0) {
            ArrayList<View> arrayList = this.f5851b;
            if (arrayList == null) {
                this.f5851b = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f5851b.add(getChildAt(i));
            }
            Collections.sort(this.f5851b, f5817a);
        }
    }

    /* renamed from: a */
    public C1106f mo7132a(int i, int i2) {
        C1106f fVar = new C1106f();
        fVar.f5890a = i;
        fVar.f5891a = this.f5842a.mo4838j(this, i);
        fVar.f5889a = this.f5842a.mo13320h(i);
        if (i2 < 0 || i2 >= this.f5845a.size()) {
            this.f5845a.add(fVar);
        } else {
            this.f5845a.add(i2, fVar);
        }
        return fVar;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C1106f w;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (w = mo7196w(childAt)) != null && w.f5890a == this.f5868o) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        C1106f w;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (w = mo7196w(childAt)) != null && w.f5890a == this.f5868o) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean A = layoutParams2.f5882a | m7234A(view);
        layoutParams2.f5882a = A;
        if (!this.f5855c) {
            super.addView(view, i, layoutParams);
        } else if (!A) {
            layoutParams2.f5884b = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* renamed from: b */
    public void mo7136b(@mr2 C1108h hVar) {
        if (this.f5852b == null) {
            this.f5852b = new ArrayList();
        }
        this.f5852b.add(hVar);
    }

    /* renamed from: c */
    public void mo7137c(@mr2 C1109i iVar) {
        if (this.f5846a == null) {
            this.f5846a = new ArrayList();
        }
        this.f5846a.add(iVar);
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f5842a == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f5831a)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.f5847b));
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f5853b = true;
        if (this.f5837a.isFinished() || !this.f5837a.computeScrollOffset()) {
            mo7158i(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f5837a.getCurrX();
        int currY = this.f5837a.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!mo7115H(currX)) {
                this.f5837a.abortAnimation();
                scrollTo(0, currY);
            }
        }
        jt4.m18985n1(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ca  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7141d(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto L_0x000b
        L_0x0009:
            r0 = r3
            goto L_0x0069
        L_0x000b:
            if (r0 == 0) goto L_0x0069
            android.view.ViewParent r4 = r0.getParent()
        L_0x0011:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x001e
            if (r4 != r6) goto L_0x0019
            r4 = 1
            goto L_0x001f
        L_0x0019:
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0011
        L_0x001e:
            r4 = 0
        L_0x001f:
            if (r4 != 0) goto L_0x0069
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0035:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x004e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0035
        L_0x004e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L_0x0009
        L_0x0069:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x00b5
            if (r3 == r0) goto L_0x00b5
            if (r7 != r5) goto L_0x009a
            android.graphics.Rect r1 = r6.f5832a
            android.graphics.Rect r1 = r6.mo7193u(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f5832a
            android.graphics.Rect r2 = r6.mo7193u(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x0094
            if (r1 < r2) goto L_0x0094
            boolean r0 = r6.mo7113F()
            goto L_0x0098
        L_0x0094:
            boolean r0 = r3.requestFocus()
        L_0x0098:
            r2 = r0
            goto L_0x00c8
        L_0x009a:
            if (r7 != r4) goto L_0x00c8
            android.graphics.Rect r1 = r6.f5832a
            android.graphics.Rect r1 = r6.mo7193u(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f5832a
            android.graphics.Rect r2 = r6.mo7193u(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x0094
            if (r1 > r2) goto L_0x0094
            boolean r0 = r6.mo7114G()
            goto L_0x0098
        L_0x00b5:
            if (r7 == r5) goto L_0x00c4
            if (r7 != r1) goto L_0x00ba
            goto L_0x00c4
        L_0x00ba:
            if (r7 == r4) goto L_0x00bf
            r0 = 2
            if (r7 != r0) goto L_0x00c8
        L_0x00bf:
            boolean r2 = r6.mo7114G()
            goto L_0x00c8
        L_0x00c4:
            boolean r2 = r6.mo7113F()
        L_0x00c8:
            if (r2 == 0) goto L_0x00d1
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00d1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo7141d(int):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo7180s(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C1106f w;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (w = mo7196w(childAt)) != null && w.f5890a == this.f5868o && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        ay2 ay2;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (ay2 = this.f5842a) != null && ay2.mo13317e() > 1)) {
            if (!this.f5836a.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f5831a * ((float) width));
                this.f5836a.setSize(height, width);
                z = false | this.f5836a.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f5849b.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f5847b + 1.0f)) * ((float) width2));
                this.f5849b.setSize(height2, width2);
                z |= this.f5849b.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f5836a.finish();
            this.f5849b.finish();
        }
        if (z) {
            jt4.m18985n1(this);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5833a;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* renamed from: e */
    public boolean mo7146e() {
        if (this.f5861f) {
            return false;
        }
        this.f5863h = true;
        setScrollState(1);
        this.f5854c = 0.0f;
        this.f5858e = 0.0f;
        VelocityTracker velocityTracker = this.f5835a;
        if (velocityTracker == null) {
            this.f5835a = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f5835a.addMovement(obtain);
        obtain.recycle();
        this.f5848b = uptimeMillis;
        return true;
    }

    /* renamed from: f */
    public final void mo7147f(C1106f fVar, int i, C1106f fVar2) {
        int i2;
        int i3;
        C1106f fVar3;
        C1106f fVar4;
        int e = this.f5842a.mo13317e();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.f5870q) / ((float) clientWidth) : 0.0f;
        if (fVar2 != null) {
            int i4 = fVar2.f5890a;
            int i5 = fVar.f5890a;
            if (i4 < i5) {
                float f2 = fVar2.f5893b + fVar2.f5889a + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= fVar.f5890a && i7 < this.f5845a.size()) {
                    while (true) {
                        fVar4 = this.f5845a.get(i7);
                        if (i6 > fVar4.f5890a && i7 < this.f5845a.size() - 1) {
                            i7++;
                        }
                    }
                    while (i6 < fVar4.f5890a) {
                        f2 += this.f5842a.mo13320h(i6) + f;
                        i6++;
                    }
                    fVar4.f5893b = f2;
                    f2 += fVar4.f5889a + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.f5845a.size() - 1;
                float f3 = fVar2.f5893b;
                while (true) {
                    i4--;
                    if (i4 < fVar.f5890a || size < 0) {
                        break;
                    }
                    while (true) {
                        fVar3 = this.f5845a.get(size);
                        if (i4 < fVar3.f5890a && size > 0) {
                            size--;
                        }
                    }
                    while (i4 > fVar3.f5890a) {
                        f3 -= this.f5842a.mo13320h(i4) + f;
                        i4--;
                    }
                    f3 -= fVar3.f5889a + f;
                    fVar3.f5893b = f3;
                }
            }
        }
        int size2 = this.f5845a.size();
        float f4 = fVar.f5893b;
        int i8 = fVar.f5890a;
        int i9 = i8 - 1;
        this.f5831a = i8 == 0 ? f4 : -3.4028235E38f;
        int i10 = e - 1;
        this.f5847b = i8 == i10 ? (fVar.f5889a + f4) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            C1106f fVar5 = this.f5845a.get(i11);
            while (true) {
                i3 = fVar5.f5890a;
                if (i9 <= i3) {
                    break;
                }
                f4 -= this.f5842a.mo13320h(i9) + f;
                i9--;
            }
            f4 -= fVar5.f5889a + f;
            fVar5.f5893b = f4;
            if (i3 == 0) {
                this.f5831a = f4;
            }
            i11--;
            i9--;
        }
        float f5 = fVar.f5893b + fVar.f5889a + f;
        int i12 = fVar.f5890a + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            C1106f fVar6 = this.f5845a.get(i13);
            while (true) {
                i2 = fVar6.f5890a;
                if (i12 >= i2) {
                    break;
                }
                f5 += this.f5842a.mo13320h(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.f5847b = (fVar6.f5889a + f5) - 1.0f;
            }
            fVar6.f5893b = f5;
            f5 += fVar6.f5889a + f;
            i13++;
            i12++;
        }
        this.f5865j = false;
    }

    /* renamed from: g */
    public boolean mo7148g(View view, boolean z, int i, int i2, int i3) {
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
                    if (mo7148g(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @ts2
    public ay2 getAdapter() {
        return this.f5842a;
    }

    public int getChildDrawingOrder(int i, int i2) {
        if (this.f5829G == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) this.f5851b.get(i2).getLayoutParams()).f5885c;
    }

    public int getCurrentItem() {
        return this.f5868o;
    }

    public int getOffscreenPageLimit() {
        return this.f5875v;
    }

    public int getPageMargin() {
        return this.f5870q;
    }

    /* renamed from: h */
    public void mo7157h() {
        List<C1109i> list = this.f5846a;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: i */
    public final void mo7158i(boolean z) {
        boolean z2 = this.f5830H == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f5837a.isFinished()) {
                this.f5837a.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f5837a.getCurrX();
                int currY = this.f5837a.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        mo7115H(currX);
                    }
                }
            }
        }
        this.f5859e = false;
        for (int i = 0; i < this.f5845a.size(); i++) {
            C1106f fVar = this.f5845a.get(i);
            if (fVar.f5892a) {
                fVar.f5892a = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            jt4.m18993p1(this, this.f5844a);
        } else {
            this.f5844a.run();
        }
    }

    /* renamed from: j */
    public void mo7159j() {
        int e = this.f5842a.mo13317e();
        this.f5867n = e;
        boolean z = this.f5845a.size() < (this.f5875v * 2) + 1 && this.f5845a.size() < e;
        int i = this.f5868o;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f5845a.size()) {
            C1106f fVar = this.f5845a.get(i2);
            int f = this.f5842a.mo13318f(fVar.f5891a);
            if (f != -1) {
                if (f == -2) {
                    this.f5845a.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f5842a.mo4843t(this);
                        z2 = true;
                    }
                    this.f5842a.mo4836b(this, fVar.f5890a, fVar.f5891a);
                    int i3 = this.f5868o;
                    if (i3 == fVar.f5890a) {
                        i = Math.max(0, Math.min(i3, e - 1));
                    }
                } else {
                    int i4 = fVar.f5890a;
                    if (i4 != f) {
                        if (i4 == this.f5868o) {
                            i = f;
                        }
                        fVar.f5890a = f;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f5842a.mo4837d(this);
        }
        Collections.sort(this.f5845a, f5818a);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                if (!layoutParams.f5882a) {
                    layoutParams.f5880a = 0.0f;
                }
            }
            mo7126S(i, false, true);
            requestLayout();
        }
    }

    /* renamed from: k */
    public final int mo7160k(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f5825C || Math.abs(i2) <= this.f5823A) {
            i += (int) (f + (i >= this.f5868o ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f5845a.size() <= 0) {
            return i;
        }
        ArrayList<C1106f> arrayList = this.f5845a;
        return Math.max(this.f5845a.get(0).f5890a, Math.min(i, arrayList.get(arrayList.size() - 1).f5890a));
    }

    /* renamed from: l */
    public final void mo7161l(int i, float f, int i2) {
        C1109i iVar = this.f5839a;
        if (iVar != null) {
            iVar.mo7104b(i, f, i2);
        }
        List<C1109i> list = this.f5846a;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1109i iVar2 = this.f5846a.get(i3);
                if (iVar2 != null) {
                    iVar2.mo7104b(i, f, i2);
                }
            }
        }
        C1109i iVar3 = this.f5850b;
        if (iVar3 != null) {
            iVar3.mo7104b(i, f, i2);
        }
    }

    /* renamed from: m */
    public final void mo7162m(int i) {
        C1109i iVar = this.f5839a;
        if (iVar != null) {
            iVar.mo7106d(i);
        }
        List<C1109i> list = this.f5846a;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1109i iVar2 = this.f5846a.get(i2);
                if (iVar2 != null) {
                    iVar2.mo7106d(i);
                }
            }
        }
        C1109i iVar3 = this.f5850b;
        if (iVar3 != null) {
            iVar3.mo7106d(i);
        }
    }

    /* renamed from: n */
    public final void mo7163n(int i) {
        C1109i iVar = this.f5839a;
        if (iVar != null) {
            iVar.mo7105c(i);
        }
        List<C1109i> list = this.f5846a;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1109i iVar2 = this.f5846a.get(i2);
                if (iVar2 != null) {
                    iVar2.mo7105c(i);
                }
            }
        }
        C1109i iVar3 = this.f5850b;
        if (iVar3 != null) {
            iVar3.mo7105c(i);
        }
    }

    /* renamed from: o */
    public float mo7164o(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5864i = true;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.f5844a);
        Scroller scroller = this.f5837a;
        if (scroller != null && !scroller.isFinished()) {
            this.f5837a.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            super.onDraw(r18)
            int r1 = r0.f5870q
            if (r1 <= 0) goto L_0x00aa
            android.graphics.drawable.Drawable r1 = r0.f5833a
            if (r1 == 0) goto L_0x00aa
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r1 = r0.f5845a
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00aa
            com.onedelhi.secure.ay2 r1 = r0.f5842a
            if (r1 == 0) goto L_0x00aa
            int r1 = r17.getScrollX()
            int r2 = r17.getWidth()
            int r3 = r0.f5870q
            float r3 = (float) r3
            float r4 = (float) r2
            float r3 = r3 / r4
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f5845a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1106f) r5
            float r7 = r5.f5893b
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f5845a
            int r8 = r8.size()
            int r9 = r5.f5890a
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r10 = r0.f5845a
            int r11 = r8 + -1
            java.lang.Object r10 = r10.get(r11)
            androidx.viewpager.widget.ViewPager$f r10 = (androidx.viewpager.widget.ViewPager.C1106f) r10
            int r10 = r10.f5890a
        L_0x0045:
            if (r9 >= r10) goto L_0x00aa
        L_0x0047:
            int r11 = r5.f5890a
            if (r9 <= r11) goto L_0x0058
            if (r6 >= r8) goto L_0x0058
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f5845a
            int r6 = r6 + 1
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1106f) r5
            goto L_0x0047
        L_0x0058:
            if (r9 != r11) goto L_0x0065
            float r7 = r5.f5893b
            float r11 = r5.f5889a
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r7 = r7 + r11
            float r7 = r7 + r3
            goto L_0x0071
        L_0x0065:
            com.onedelhi.secure.ay2 r11 = r0.f5842a
            float r11 = r11.mo13320h(r9)
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r11 = r11 + r3
            float r7 = r7 + r11
        L_0x0071:
            int r11 = r0.f5870q
            float r11 = (float) r11
            float r11 = r11 + r12
            float r13 = (float) r1
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0099
            android.graphics.drawable.Drawable r11 = r0.f5833a
            int r13 = java.lang.Math.round(r12)
            int r14 = r0.f5871r
            int r15 = r0.f5870q
            float r15 = (float) r15
            float r15 = r15 + r12
            int r15 = java.lang.Math.round(r15)
            r16 = r3
            int r3 = r0.f5872s
            r11.setBounds(r13, r14, r15, r3)
            android.graphics.drawable.Drawable r3 = r0.f5833a
            r11 = r18
            r3.draw(r11)
            goto L_0x009d
        L_0x0099:
            r11 = r18
            r16 = r3
        L_0x009d:
            int r3 = r1 + r2
            float r3 = (float) r3
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a5
            goto L_0x00aa
        L_0x00a5:
            int r9 = r9 + 1
            r3 = r16
            goto L_0x0045
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            mo7124Q();
            return false;
        }
        if (action != 0) {
            if (this.f5861f) {
                return true;
            }
            if (this.f5862g) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f5858e = x;
            this.f5854c = x;
            float y = motionEvent.getY();
            this.f5860f = y;
            this.f5856d = y;
            this.f5879z = motionEvent2.getPointerId(0);
            this.f5862g = false;
            this.f5853b = true;
            this.f5837a.computeScrollOffset();
            if (this.f5830H != 2 || Math.abs(this.f5837a.getFinalX() - this.f5837a.getCurrX()) <= this.f5826D) {
                mo7158i(false);
                this.f5861f = false;
            } else {
                this.f5837a.abortAnimation();
                this.f5859e = false;
                mo7117J();
                this.f5861f = true;
                mo7123P(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f5879z;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f = x2 - this.f5854c;
                float abs = Math.abs(f);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f5860f);
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 != 0 && !mo7110C(this.f5854c, f)) {
                    if (mo7148g(this, false, (int) f, (int) x2, (int) y2)) {
                        this.f5854c = x2;
                        this.f5856d = y2;
                        this.f5862g = true;
                        return false;
                    }
                }
                int i3 = this.f5878y;
                if (abs > ((float) i3) && abs * 0.5f > abs2) {
                    this.f5861f = true;
                    mo7123P(true);
                    setScrollState(1);
                    float f2 = this.f5858e;
                    float f3 = (float) this.f5878y;
                    this.f5854c = i2 > 0 ? f2 + f3 : f2 - f3;
                    this.f5856d = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) i3)) {
                    this.f5862g = true;
                }
                if (this.f5861f && mo7116I(x2)) {
                    jt4.m18985n1(this);
                }
            }
        } else if (action == 6) {
            mo7112E(motionEvent);
        }
        if (this.f5835a == null) {
            this.f5835a = VelocityTracker.obtain();
        }
        this.f5835a.addMovement(motionEvent2);
        return this.f5861f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r12 = (androidx.viewpager.widget.ViewPager.LayoutParams) r12
            boolean r14 = r12.f5882a
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.f5881a
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x005c
            r15 = 3
            if (r14 == r15) goto L_0x0056
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006d
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x0068
        L_0x0056:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006d
        L_0x005c:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L_0x0068:
            r17 = r14
            r14 = r4
            r4 = r17
        L_0x006d:
            r15 = 16
            if (r12 == r15) goto L_0x008e
            r15 = 48
            if (r12 == r15) goto L_0x0088
            r15 = 80
            if (r12 == r15) goto L_0x007b
            r12 = r5
            goto L_0x009f
        L_0x007b:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009a
        L_0x0088:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x009f
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L_0x009a:
            r17 = r12
            r12 = r5
            r5 = r17
        L_0x009f:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r5 + r16
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b2:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b6:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00b9:
            if (r6 >= r1) goto L_0x0108
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0105
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.f5882a
            if (r10 != 0) goto L_0x0105
            androidx.viewpager.widget.ViewPager$f r10 = r0.mo7196w(r8)
            if (r10 == 0) goto L_0x0105
            float r13 = (float) r2
            float r10 = r10.f5893b
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f5884b
            if (r14 == 0) goto L_0x00f8
            r14 = 0
            r9.f5884b = r14
            float r9 = r9.f5880a
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f8:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0105:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x0108:
            r0.f5871r = r5
            int r3 = r3 - r7
            r0.f5872s = r3
            r0.f5827E = r11
            boolean r1 = r0.f5864i
            if (r1 == 0) goto L_0x011a
            int r1 = r0.f5868o
            r2 = 0
            r0.mo7125R(r1, r2, r2, r2)
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            r0.f5864i = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            int r14 = android.view.ViewGroup.getDefaultSize(r0, r14)
            int r15 = android.view.ViewGroup.getDefaultSize(r0, r15)
            r13.setMeasuredDimension(r14, r15)
            int r14 = r13.getMeasuredWidth()
            int r15 = r14 / 10
            int r1 = r13.f5876w
            int r15 = java.lang.Math.min(r15, r1)
            r13.f5877x = r15
            int r15 = r13.getPaddingLeft()
            int r14 = r14 - r15
            int r15 = r13.getPaddingRight()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredHeight()
            int r1 = r13.getPaddingTop()
            int r15 = r15 - r1
            int r1 = r13.getPaddingBottom()
            int r15 = r15 - r1
            int r1 = r13.getChildCount()
            r2 = 0
        L_0x0037:
            r3 = 8
            r4 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r1) goto L_0x00b2
            android.view.View r6 = r13.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 == r3) goto L_0x00af
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r3 = (androidx.viewpager.widget.ViewPager.LayoutParams) r3
            if (r3 == 0) goto L_0x00af
            boolean r7 = r3.f5882a
            if (r7 == 0) goto L_0x00af
            int r7 = r3.f5881a
            r8 = r7 & 7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r9 = 48
            if (r7 == r9) goto L_0x0065
            r9 = 80
            if (r7 != r9) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r7 = 0
            goto L_0x0066
        L_0x0065:
            r7 = 1
        L_0x0066:
            r9 = 3
            if (r8 == r9) goto L_0x006e
            r9 = 5
            if (r8 != r9) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r4 = 0
        L_0x006e:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L_0x0075
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x007a
        L_0x0075:
            if (r4 == 0) goto L_0x007a
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x007c
        L_0x007a:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x007c:
            int r10 = r3.width
            r11 = -1
            r12 = -2
            if (r10 == r12) goto L_0x0089
            if (r10 == r11) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r10 = r14
        L_0x0086:
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x008a
        L_0x0089:
            r10 = r14
        L_0x008a:
            int r3 = r3.height
            if (r3 == r12) goto L_0x0093
            if (r3 == r11) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            r3 = r15
            goto L_0x0095
        L_0x0093:
            r3 = r15
            r5 = r9
        L_0x0095:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r6.measure(r8, r3)
            if (r7 == 0) goto L_0x00a8
            int r3 = r6.getMeasuredHeight()
            int r15 = r15 - r3
            goto L_0x00af
        L_0x00a8:
            if (r4 == 0) goto L_0x00af
            int r3 = r6.getMeasuredWidth()
            int r14 = r14 - r3
        L_0x00af:
            int r2 = r2 + 1
            goto L_0x0037
        L_0x00b2:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            r13.f5873t = r1
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r5)
            r13.f5874u = r15
            r13.f5855c = r4
            r13.mo7117J()
            r13.f5855c = r0
            int r15 = r13.getChildCount()
        L_0x00c9:
            if (r0 >= r15) goto L_0x00f3
            android.view.View r1 = r13.getChildAt(r0)
            int r2 = r1.getVisibility()
            if (r2 == r3) goto L_0x00f0
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r2 = (androidx.viewpager.widget.ViewPager.LayoutParams) r2
            if (r2 == 0) goto L_0x00e1
            boolean r4 = r2.f5882a
            if (r4 != 0) goto L_0x00f0
        L_0x00e1:
            float r4 = (float) r14
            float r2 = r2.f5880a
            float r4 = r4 * r2
            int r2 = (int) r4
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            int r4 = r13.f5874u
            r1.measure(r2, r4)
        L_0x00f0:
            int r0 = r0 + 1
            goto L_0x00c9
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C1106f w;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (w = mo7196w(childAt)) != null && w.f5890a == this.f5868o && childAt.requestFocus(i, rect)) {
                return true;
            }
            i3 += i2;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1112l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1112l lVar = (C1112l) parcelable;
        super.onRestoreInstanceState(lVar.mo14959a());
        ay2 ay2 = this.f5842a;
        if (ay2 != null) {
            ay2.mo4840n(lVar.f5897b, lVar.f5896a);
            mo7126S(lVar.f5898n, false, true);
            return;
        }
        this.f5869p = lVar.f5898n;
        this.f5834a = lVar.f5897b;
        this.f5843a = lVar.f5896a;
    }

    public Parcelable onSaveInstanceState() {
        C1112l lVar = new C1112l(super.onSaveInstanceState());
        lVar.f5898n = this.f5868o;
        ay2 ay2 = this.f5842a;
        if (ay2 != null) {
            lVar.f5897b = ay2.mo4841o();
        }
        return lVar;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f5870q;
            mo7119L(i, i3, i5, i5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.f5863h
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r8.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0014
            int r0 = r8.getEdgeFlags()
            if (r0 == 0) goto L_0x0014
            return r2
        L_0x0014:
            com.onedelhi.secure.ay2 r0 = r7.f5842a
            if (r0 == 0) goto L_0x0155
            int r0 = r0.mo13317e()
            if (r0 != 0) goto L_0x0020
            goto L_0x0155
        L_0x0020:
            android.view.VelocityTracker r0 = r7.f5835a
            if (r0 != 0) goto L_0x002a
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r7.f5835a = r0
        L_0x002a:
            android.view.VelocityTracker r0 = r7.f5835a
            r0.addMovement(r8)
            int r0 = r8.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x012f
            if (r0 == r1) goto L_0x00e2
            r3 = 2
            if (r0 == r3) goto L_0x0073
            r3 = 3
            if (r0 == r3) goto L_0x0068
            r3 = 5
            if (r0 == r3) goto L_0x0058
            r3 = 6
            if (r0 == r3) goto L_0x0047
            goto L_0x014f
        L_0x0047:
            r7.mo7112E(r8)
            int r0 = r7.f5879z
            int r0 = r8.findPointerIndex(r0)
            float r8 = r8.getX(r0)
            r7.f5854c = r8
            goto L_0x014f
        L_0x0058:
            int r0 = r8.getActionIndex()
            float r3 = r8.getX(r0)
            r7.f5854c = r3
            int r8 = r8.getPointerId(r0)
            goto L_0x014d
        L_0x0068:
            boolean r8 = r7.f5861f
            if (r8 == 0) goto L_0x014f
            int r8 = r7.f5868o
            r7.mo7125R(r8, r1, r2, r2)
            goto L_0x012a
        L_0x0073:
            boolean r0 = r7.f5861f
            if (r0 != 0) goto L_0x00ce
            int r0 = r7.f5879z
            int r0 = r8.findPointerIndex(r0)
            r3 = -1
            if (r0 != r3) goto L_0x0082
            goto L_0x012a
        L_0x0082:
            float r3 = r8.getX(r0)
            float r4 = r7.f5854c
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            float r0 = r8.getY(r0)
            float r5 = r7.f5856d
            float r5 = r0 - r5
            float r5 = java.lang.Math.abs(r5)
            int r6 = r7.f5878y
            float r6 = (float) r6
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x00ce
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ce
            r7.f5861f = r1
            r7.mo7123P(r1)
            float r4 = r7.f5858e
            float r3 = r3 - r4
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b7
            int r3 = r7.f5878y
            float r3 = (float) r3
            float r4 = r4 + r3
            goto L_0x00bb
        L_0x00b7:
            int r3 = r7.f5878y
            float r3 = (float) r3
            float r4 = r4 - r3
        L_0x00bb:
            r7.f5854c = r4
            r7.f5856d = r0
            r7.setScrollState(r1)
            r7.setScrollingCacheEnabled(r1)
            android.view.ViewParent r0 = r7.getParent()
            if (r0 == 0) goto L_0x00ce
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x00ce:
            boolean r0 = r7.f5861f
            if (r0 == 0) goto L_0x014f
            int r0 = r7.f5879z
            int r0 = r8.findPointerIndex(r0)
            float r8 = r8.getX(r0)
            boolean r8 = r7.mo7116I(r8)
            r2 = r2 | r8
            goto L_0x014f
        L_0x00e2:
            boolean r0 = r7.f5861f
            if (r0 == 0) goto L_0x014f
            android.view.VelocityTracker r0 = r7.f5835a
            r2 = 1000(0x3e8, float:1.401E-42)
            int r3 = r7.f5824B
            float r3 = (float) r3
            r0.computeCurrentVelocity(r2, r3)
            int r2 = r7.f5879z
            float r0 = r0.getXVelocity(r2)
            int r0 = (int) r0
            r7.f5859e = r1
            int r2 = r7.getClientWidth()
            int r3 = r7.getScrollX()
            androidx.viewpager.widget.ViewPager$f r4 = r7.mo7197x()
            int r5 = r7.f5870q
            float r5 = (float) r5
            float r2 = (float) r2
            float r5 = r5 / r2
            int r6 = r4.f5890a
            float r3 = (float) r3
            float r3 = r3 / r2
            float r2 = r4.f5893b
            float r3 = r3 - r2
            float r2 = r4.f5889a
            float r2 = r2 + r5
            float r3 = r3 / r2
            int r2 = r7.f5879z
            int r2 = r8.findPointerIndex(r2)
            float r8 = r8.getX(r2)
            float r2 = r7.f5858e
            float r8 = r8 - r2
            int r8 = (int) r8
            int r8 = r7.mo7160k(r6, r3, r0, r8)
            r7.mo7127T(r8, r1, r1, r0)
        L_0x012a:
            boolean r2 = r7.mo7124Q()
            goto L_0x014f
        L_0x012f:
            android.widget.Scroller r0 = r7.f5837a
            r0.abortAnimation()
            r7.f5859e = r2
            r7.mo7117J()
            float r0 = r8.getX()
            r7.f5858e = r0
            r7.f5854c = r0
            float r0 = r8.getY()
            r7.f5860f = r0
            r7.f5856d = r0
            int r8 = r8.getPointerId(r2)
        L_0x014d:
            r7.f5879z = r8
        L_0x014f:
            if (r2 == 0) goto L_0x0154
            com.onedelhi.secure.jt4.m18985n1(r7)
        L_0x0154:
            return r1
        L_0x0155:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void mo7176p(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.f5828F : 0, (Paint) null);
        }
    }

    /* renamed from: q */
    public final void mo7177q() {
        this.f5861f = false;
        this.f5862g = false;
        VelocityTracker velocityTracker = this.f5835a;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5835a = null;
        }
    }

    /* renamed from: r */
    public void mo7178r() {
        if (this.f5863h) {
            if (this.f5842a != null) {
                VelocityTracker velocityTracker = this.f5835a;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f5824B);
                int xVelocity = (int) velocityTracker.getXVelocity(this.f5879z);
                this.f5859e = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C1106f x = mo7197x();
                mo7127T(mo7160k(x.f5890a, ((((float) scrollX) / ((float) clientWidth)) - x.f5893b) / x.f5889a, xVelocity, (int) (this.f5854c - this.f5858e)), true, true, xVelocity);
            }
            mo7177q();
            this.f5863h = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public void removeView(View view) {
        if (this.f5855c) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* renamed from: s */
    public boolean mo7180s(@mr2 KeyEvent keyEvent) {
        int i;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return mo7141d(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return mo7141d(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return mo7114G();
                } else {
                    i = 66;
                }
            } else if (keyEvent.hasModifiers(2)) {
                return mo7113F();
            } else {
                i = 17;
            }
            return mo7141d(i);
        }
        return false;
    }

    public void setAdapter(@ts2 ay2 ay2) {
        ay2 ay22 = this.f5842a;
        if (ay22 != null) {
            ay22.mo13325r((DataSetObserver) null);
            this.f5842a.mo4843t(this);
            for (int i = 0; i < this.f5845a.size(); i++) {
                C1106f fVar = this.f5845a.get(i);
                this.f5842a.mo4836b(this, fVar.f5890a, fVar.f5891a);
            }
            this.f5842a.mo4837d(this);
            this.f5845a.clear();
            mo7120M();
            this.f5868o = 0;
            scrollTo(0, 0);
        }
        ay2 ay23 = this.f5842a;
        this.f5842a = ay2;
        this.f5867n = 0;
        if (ay2 != null) {
            if (this.f5841a == null) {
                this.f5841a = new C1111k();
            }
            this.f5842a.mo13325r(this.f5841a);
            this.f5859e = false;
            boolean z = this.f5864i;
            this.f5864i = true;
            this.f5867n = this.f5842a.mo13317e();
            if (this.f5869p >= 0) {
                this.f5842a.mo4840n(this.f5834a, this.f5843a);
                mo7126S(this.f5869p, false, true);
                this.f5869p = -1;
                this.f5834a = null;
                this.f5843a = null;
            } else if (!z) {
                mo7117J();
            } else {
                requestLayout();
            }
        }
        List<C1108h> list = this.f5852b;
        if (list != null && !list.isEmpty()) {
            int size = this.f5852b.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f5852b.get(i2).mo7103a(this, ay23, ay2);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f5859e = false;
        mo7126S(i, !this.f5864i, false);
    }

    public void setCurrentItem(int i, boolean z) {
        this.f5859e = false;
        mo7126S(i, z, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w(f5820b, "Requested offscreen page limit " + i + " too small; defaulting to " + 1);
            i = 1;
        }
        if (i != this.f5875v) {
            this.f5875v = i;
            mo7117J();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C1109i iVar) {
        this.f5839a = iVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.f5870q;
        this.f5870q = i;
        int width = getWidth();
        mo7119L(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(@dp0 int i) {
        setPageMarginDrawable(r70.m26356i(getContext(), i));
    }

    public void setPageMarginDrawable(@ts2 Drawable drawable) {
        this.f5833a = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z, @ts2 C1110j jVar) {
        setPageTransformer(z, jVar, 2);
    }

    public void setPageTransformer(boolean z, @ts2 C1110j jVar, int i) {
        int i2 = 1;
        boolean z2 = jVar != null;
        boolean z3 = z2 != (this.f5840a != null);
        this.f5840a = jVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i2 = 2;
            }
            this.f5829G = i2;
            this.f5828F = i;
        } else {
            this.f5829G = 0;
        }
        if (z3) {
            mo7117J();
        }
    }

    public void setScrollState(int i) {
        if (this.f5830H != i) {
            this.f5830H = i;
            if (this.f5840a != null) {
                mo7176p(i != 0);
            }
            mo7163n(i);
        }
    }

    /* renamed from: t */
    public void mo7192t(float f) {
        if (!this.f5863h) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.f5842a != null) {
            this.f5854c += f;
            float scrollX = ((float) getScrollX()) - f;
            float clientWidth = (float) getClientWidth();
            float f2 = this.f5831a * clientWidth;
            float f3 = this.f5847b * clientWidth;
            C1106f fVar = this.f5845a.get(0);
            ArrayList<C1106f> arrayList = this.f5845a;
            C1106f fVar2 = arrayList.get(arrayList.size() - 1);
            if (fVar.f5890a != 0) {
                f2 = fVar.f5893b * clientWidth;
            }
            if (fVar2.f5890a != this.f5842a.mo13317e() - 1) {
                f3 = fVar2.f5893b * clientWidth;
            }
            if (scrollX < f2) {
                scrollX = f2;
            } else if (scrollX > f3) {
                scrollX = f3;
            }
            int i = (int) scrollX;
            this.f5854c += scrollX - ((float) i);
            scrollTo(i, getScrollY());
            mo7115H(i);
            MotionEvent obtain = MotionEvent.obtain(this.f5848b, SystemClock.uptimeMillis(), 2, this.f5854c, 0.0f, 0);
            this.f5835a.addMovement(obtain);
            obtain.recycle();
        }
    }

    /* renamed from: u */
    public final Rect mo7193u(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: v */
    public C1106f mo7194v(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return mo7196w(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5833a;
    }

    /* renamed from: w */
    public C1106f mo7196w(View view) {
        for (int i = 0; i < this.f5845a.size(); i++) {
            C1106f fVar = this.f5845a.get(i);
            if (this.f5842a.mo4839k(view, fVar.f5891a)) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: x */
    public final C1106f mo7197x() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f2 = clientWidth > 0 ? ((float) this.f5870q) / ((float) clientWidth) : 0.0f;
        C1106f fVar = null;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.f5845a.size()) {
            C1106f fVar2 = this.f5845a.get(i3);
            if (!z && fVar2.f5890a != (i = i2 + 1)) {
                fVar2 = this.f5838a;
                fVar2.f5893b = f + f3 + f2;
                fVar2.f5890a = i;
                fVar2.f5889a = this.f5842a.mo13320h(i);
                i3--;
            }
            f = fVar2.f5893b;
            float f4 = fVar2.f5889a + f + f2;
            if (!z && scrollX < f) {
                return fVar;
            }
            if (scrollX < f4 || i3 == this.f5845a.size() - 1) {
                return fVar2;
            }
            i2 = fVar2.f5890a;
            f3 = fVar2.f5889a;
            i3++;
            fVar = fVar2;
            z = false;
        }
        return fVar;
    }

    /* renamed from: y */
    public C1106f mo7198y(int i) {
        for (int i2 = 0; i2 < this.f5845a.size(); i2++) {
            C1106f fVar = this.f5845a.get(i2);
            if (fVar.f5890a == i) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: z */
    public void mo7199z() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f5837a = new Scroller(context, f5816a);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f5878y = viewConfiguration.getScaledPagingTouchSlop();
        this.f5823A = (int) (400.0f * f);
        this.f5824B = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f5836a = new EdgeEffect(context);
        this.f5849b = new EdgeEffect(context);
        this.f5825C = (int) (25.0f * f);
        this.f5826D = (int) (2.0f * f);
        this.f5876w = (int) (f * 16.0f);
        jt4.m18849B1(this, new C1107g());
        if (jt4.m18916V(this) == 0) {
            jt4.m18906R1(this, 1);
        }
        jt4.m18934a2(this, new C1104d());
    }
}
