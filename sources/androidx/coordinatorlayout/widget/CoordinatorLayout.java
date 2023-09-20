package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.onedelhi.secure.C2015e0;
import com.onedelhi.secure.C3982yb;
import com.onedelhi.secure.cd3;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.d81;
import com.onedelhi.secure.do2;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.el1;
import com.onedelhi.secure.eo2;
import com.onedelhi.secure.gl0;
import com.onedelhi.secure.go2;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.ju2;
import com.onedelhi.secure.mo1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.n33;
import com.onedelhi.secure.ot2;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.ri1;
import com.onedelhi.secure.sx4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wo0;
import com.onedelhi.secure.xt4;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements do2, eo2 {

    /* renamed from: a */
    public static final n33.C2922a<Rect> f3183a = new n33.C2924c(12);

    /* renamed from: a */
    public static final ThreadLocal<Map<String, Constructor<Behavior>>> f3184a = new ThreadLocal<>();

    /* renamed from: a */
    public static final Comparator<View> f3185a = new C0463i();

    /* renamed from: a */
    public static final Class<?>[] f3186a = {Context.class, AttributeSet.class};

    /* renamed from: b */
    public static final String f3187b = "CoordinatorLayout";

    /* renamed from: c */
    public static final String f3188c;

    /* renamed from: n */
    public static final int f3189n = 0;

    /* renamed from: o */
    public static final int f3190o = 1;

    /* renamed from: p */
    public static final int f3191p = 0;

    /* renamed from: q */
    public static final int f3192q = 1;

    /* renamed from: r */
    public static final int f3193r = 2;

    /* renamed from: a */
    public Paint f3194a;

    /* renamed from: a */
    public Drawable f3195a;

    /* renamed from: a */
    public View f3196a;

    /* renamed from: a */
    public ViewGroup.OnHierarchyChangeListener f3197a;

    /* renamed from: a */
    public C0460g f3198a;

    /* renamed from: a */
    public final gl0<View> f3199a;

    /* renamed from: a */
    public final go2 f3200a;

    /* renamed from: a */
    public ju2 f3201a;

    /* renamed from: a */
    public sx4 f3202a;

    /* renamed from: a */
    public final List<View> f3203a;

    /* renamed from: a */
    public final int[] f3204a;

    /* renamed from: b */
    public View f3205b;

    /* renamed from: b */
    public final List<View> f3206b;

    /* renamed from: b */
    public boolean f3207b;

    /* renamed from: b */
    public final int[] f3208b;

    /* renamed from: c */
    public final List<View> f3209c;

    /* renamed from: c */
    public boolean f3210c;

    /* renamed from: c */
    public int[] f3211c;

    /* renamed from: d */
    public boolean f3212d;

    /* renamed from: e */
    public boolean f3213e;

    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: F */
        public static void m3499F(@mr2 View view, @ts2 Object obj) {
            ((C0459f) view.getLayoutParams()).f3220a = obj;
        }

        @ts2
        /* renamed from: e */
        public static Object m3500e(@mr2 View view) {
            return ((C0459f) view.getLayoutParams()).f3220a;
        }

        @Deprecated
        /* renamed from: A */
        public boolean mo3637A(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 View view, @mr2 View view2, int i) {
            return false;
        }

        /* renamed from: B */
        public boolean mo3638B(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 View view, @mr2 View view2, int i, int i2) {
            if (i2 == 0) {
                return mo3637A(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        /* renamed from: C */
        public void mo3639C(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 View view) {
        }

        /* renamed from: D */
        public void mo3640D(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 View view, int i) {
            if (i == 0) {
                mo3639C(coordinatorLayout, v, view);
            }
        }

        /* renamed from: E */
        public boolean mo3641E(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3642a(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v) {
            return mo3645d(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: b */
        public boolean mo3643b(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 Rect rect) {
            return false;
        }

        @d10
        /* renamed from: c */
        public int mo3644c(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v) {
            return -16777216;
        }

        @d81(from = 0.0d, mo14561to = 1.0d)
        /* renamed from: d */
        public float mo3645d(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v) {
            return 0.0f;
        }

        /* renamed from: f */
        public boolean mo3646f(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 View view) {
            return false;
        }

        @mr2
        /* renamed from: g */
        public sx4 mo3647g(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 sx4 sx4) {
            return sx4;
        }

        /* renamed from: h */
        public void mo3648h(@mr2 C0459f fVar) {
        }

        /* renamed from: i */
        public boolean mo3649i(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 View view) {
            return false;
        }

        /* renamed from: j */
        public void mo3650j(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 View view) {
        }

        /* renamed from: k */
        public void mo3651k() {
        }

        /* renamed from: l */
        public boolean mo3652l(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: m */
        public boolean mo3653m(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, int i) {
            return false;
        }

        /* renamed from: n */
        public boolean mo3654n(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: o */
        public boolean mo3655o(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 View view, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: p */
        public boolean mo3656p(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 View view, float f, float f2) {
            return false;
        }

        @Deprecated
        /* renamed from: q */
        public void mo3657q(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 View view, int i, int i2, @mr2 int[] iArr) {
        }

        /* renamed from: r */
        public void mo3658r(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 View view, int i, int i2, @mr2 int[] iArr, int i3) {
            if (i3 == 0) {
                mo3657q(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        /* renamed from: s */
        public void mo3659s(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: t */
        public void mo3660t(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo3659s(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: u */
        public void mo3661u(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 View view, int i, int i2, int i3, int i4, int i5, @mr2 int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            mo3660t(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        /* renamed from: v */
        public void mo3662v(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 View view, @mr2 View view2, int i) {
        }

        /* renamed from: w */
        public void mo3663w(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 View view, @mr2 View view2, int i, int i2) {
            if (i2 == 0) {
                mo3662v(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: x */
        public boolean mo3664x(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 Rect rect, boolean z) {
            return false;
        }

        /* renamed from: y */
        public void mo3665y(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v, @mr2 Parcelable parcelable) {
        }

        @ts2
        /* renamed from: z */
        public Parcelable mo3666z(@mr2 CoordinatorLayout coordinatorLayout, @mr2 V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    public class C0454a implements ju2 {
        public C0454a() {
        }

        /* renamed from: a */
        public sx4 mo1063a(View view, sx4 sx4) {
            return CoordinatorLayout.this.mo3592b0(sx4);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface C0455b {
        @mr2
        Behavior getBehavior();
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public @interface C0456c {
        Class<? extends Behavior> value();
    }

    @hl3({hl3.C2354a.f13188c})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public @interface C0457d {
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    public class C0458e implements ViewGroup.OnHierarchyChangeListener {
        public C0458e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3197a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo3582M(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3197a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0459f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f3216a = 0;

        /* renamed from: a */
        public final Rect f3217a = new Rect();

        /* renamed from: a */
        public View f3218a;

        /* renamed from: a */
        public Behavior f3219a;

        /* renamed from: a */
        public Object f3220a;

        /* renamed from: a */
        public boolean f3221a = false;

        /* renamed from: b */
        public int f3222b = 0;

        /* renamed from: b */
        public View f3223b;

        /* renamed from: b */
        public boolean f3224b;

        /* renamed from: c */
        public int f3225c = -1;

        /* renamed from: c */
        public boolean f3226c;

        /* renamed from: d */
        public int f3227d = -1;

        /* renamed from: d */
        public boolean f3228d;

        /* renamed from: e */
        public int f3229e = 0;

        /* renamed from: e */
        public boolean f3230e;

        /* renamed from: f */
        public int f3231f = 0;

        /* renamed from: g */
        public int f3232g;

        /* renamed from: h */
        public int f3233h;

        public C0459f(int i, int i2) {
            super(i, i2);
        }

        public C0459f(@mr2 Context context, @ts2 AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cd3.C1903j.CoordinatorLayout_Layout);
            this.f3216a = obtainStyledAttributes.getInteger(cd3.C1903j.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f3227d = obtainStyledAttributes.getResourceId(cd3.C1903j.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f3222b = obtainStyledAttributes.getInteger(cd3.C1903j.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f3225c = obtainStyledAttributes.getInteger(cd3.C1903j.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f3229e = obtainStyledAttributes.getInt(cd3.C1903j.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f3231f = obtainStyledAttributes.getInt(cd3.C1903j.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            int i = cd3.C1903j.CoordinatorLayout_Layout_layout_behavior;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.f3221a = hasValue;
            if (hasValue) {
                this.f3219a = CoordinatorLayout.m3448P(context, attributeSet, obtainStyledAttributes.getString(i));
            }
            obtainStyledAttributes.recycle();
            Behavior behavior = this.f3219a;
            if (behavior != null) {
                behavior.mo3648h(this);
            }
        }

        public C0459f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0459f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0459f(C0459f fVar) {
            super(fVar);
        }

        /* renamed from: a */
        public boolean mo3671a() {
            return this.f3218a == null && this.f3227d != -1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r0 = r1.f3219a;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo3672b(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            /*
                r1 = this;
                android.view.View r0 = r1.f3223b
                if (r4 == r0) goto L_0x001b
                int r0 = com.onedelhi.secure.jt4.m18928Z(r2)
                boolean r0 = r1.mo3691u(r4, r0)
                if (r0 != 0) goto L_0x001b
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.f3219a
                if (r0 == 0) goto L_0x0019
                boolean r2 = r0.mo3646f(r2, r3, r4)
                if (r2 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r2 = 0
                goto L_0x001c
            L_0x001b:
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.C0459f.mo3672b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
        }

        /* renamed from: c */
        public boolean mo3673c() {
            if (this.f3219a == null) {
                this.f3224b = false;
            }
            return this.f3224b;
        }

        /* renamed from: d */
        public View mo3674d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f3227d == -1) {
                this.f3223b = null;
                this.f3218a = null;
                return null;
            }
            if (this.f3218a == null || !mo3692v(view, coordinatorLayout)) {
                mo3685o(view, coordinatorLayout);
            }
            return this.f3218a;
        }

        @mo1
        /* renamed from: e */
        public int mo3675e() {
            return this.f3227d;
        }

        @ts2
        /* renamed from: f */
        public Behavior mo3676f() {
            return this.f3219a;
        }

        /* renamed from: g */
        public boolean mo3677g() {
            return this.f3230e;
        }

        /* renamed from: h */
        public Rect mo3678h() {
            return this.f3217a;
        }

        /* renamed from: i */
        public void mo3679i() {
            this.f3223b = null;
            this.f3218a = null;
        }

        /* renamed from: j */
        public boolean mo3680j(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f3224b;
            if (z) {
                return true;
            }
            Behavior behavior = this.f3219a;
            boolean a = (behavior != null ? behavior.mo3642a(coordinatorLayout, view) : false) | z;
            this.f3224b = a;
            return a;
        }

        /* renamed from: k */
        public boolean mo3681k(int i) {
            if (i == 0) {
                return this.f3226c;
            }
            if (i != 1) {
                return false;
            }
            return this.f3228d;
        }

        /* renamed from: l */
        public void mo3682l() {
            this.f3230e = false;
        }

        /* renamed from: m */
        public void mo3683m(int i) {
            mo3690t(i, false);
        }

        /* renamed from: n */
        public void mo3684n() {
            this.f3224b = false;
        }

        /* renamed from: o */
        public final void mo3685o(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f3227d);
            this.f3218a = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f3223b = findViewById;
                    return;
                } else if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f3227d) + " to anchor view " + view);
            }
            this.f3223b = null;
            this.f3218a = null;
        }

        /* renamed from: p */
        public void mo3686p(@mo1 int i) {
            mo3679i();
            this.f3227d = i;
        }

        /* renamed from: q */
        public void mo3687q(@ts2 Behavior behavior) {
            Behavior behavior2 = this.f3219a;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.mo3651k();
                }
                this.f3219a = behavior;
                this.f3220a = null;
                this.f3221a = true;
                if (behavior != null) {
                    behavior.mo3648h(this);
                }
            }
        }

        /* renamed from: r */
        public void mo3688r(boolean z) {
            this.f3230e = z;
        }

        /* renamed from: s */
        public void mo3689s(Rect rect) {
            this.f3217a.set(rect);
        }

        /* renamed from: t */
        public void mo3690t(int i, boolean z) {
            if (i == 0) {
                this.f3226c = z;
            } else if (i == 1) {
                this.f3228d = z;
            }
        }

        /* renamed from: u */
        public final boolean mo3691u(View view, int i) {
            int d = ri1.m26762d(((C0459f) view.getLayoutParams()).f3229e, i);
            return d != 0 && (ri1.m26762d(this.f3231f, i) & d) == d;
        }

        /* renamed from: v */
        public final boolean mo3692v(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f3218a.getId() != this.f3227d) {
                return false;
            }
            View view2 = this.f3218a;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f3223b = null;
                    this.f3218a = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f3223b = view2;
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    public class C0460g implements ViewTreeObserver.OnPreDrawListener {
        public C0460g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo3582M(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    public static class C0461h extends C2015e0 {
        public static final Parcelable.Creator<C0461h> CREATOR = new C0462a();

        /* renamed from: a */
        public SparseArray<Parcelable> f3235a;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        public static class C0462a implements Parcelable.ClassLoaderCreator<C0461h> {
            /* renamed from: a */
            public C0461h createFromParcel(Parcel parcel) {
                return new C0461h(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C0461h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0461h(parcel, classLoader);
            }

            /* renamed from: c */
            public C0461h[] newArray(int i) {
                return new C0461h[i];
            }
        }

        public C0461h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f3235a = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f3235a.append(iArr[i], readParcelableArray[i]);
            }
        }

        public C0461h(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f3235a;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f3235a.keyAt(i2);
                parcelableArr[i2] = this.f3235a.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    public static class C0463i implements Comparator<View> {
        /* renamed from: a */
        public int compare(View view, View view2) {
            float F0 = jt4.m18864F0(view);
            float F02 = jt4.m18864F0(view2);
            if (F0 > F02) {
                return -1;
            }
            return F0 < F02 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.getName()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            f3188c = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            f3185a = r0
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f3186a = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f3184a = r0
            com.onedelhi.secure.n33$c r0 = new com.onedelhi.secure.n33$c
            r1 = 12
            r0.<init>(r1)
            f3183a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public CoordinatorLayout(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, cd3.C1894a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(@mr2 Context context, @ts2 AttributeSet attributeSet, @C3982yb int i) {
        super(context, attributeSet, i);
        this.f3203a = new ArrayList();
        this.f3199a = new gl0<>();
        this.f3206b = new ArrayList();
        this.f3209c = new ArrayList();
        this.f3204a = new int[2];
        this.f3208b = new int[2];
        this.f3200a = new go2(this);
        int[] iArr = cd3.C1903j.CoordinatorLayout;
        TypedArray obtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, cd3.C1902i.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            int[] iArr2 = cd3.C1903j.CoordinatorLayout;
            if (i == 0) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, 0, cd3.C1902i.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, i, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(cd3.C1903j.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f3211c = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f3211c.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr3 = this.f3211c;
                iArr3[i2] = (int) (((float) iArr3[i2]) * f);
            }
        }
        this.f3195a = obtainStyledAttributes.getDrawable(cd3.C1903j.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        mo3593c0();
        super.setOnHierarchyChangeListener(new C0458e());
        if (jt4.m18916V(this) == 0) {
            jt4.m18906R1(this, 1);
        }
    }

    /* renamed from: P */
    public static Behavior m3448P(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f3188c;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = f3184a;
            Map map = threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f3186a);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (Behavior) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: T */
    public static void m3449T(@mr2 Rect rect) {
        rect.setEmpty();
        f3183a.mo20817a(rect);
    }

    /* renamed from: W */
    public static int m3450W(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: X */
    public static int m3451X(int i) {
        if ((i & 7) == 0) {
            i |= ri1.f19869b;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: Y */
    public static int m3452Y(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    @mr2
    /* renamed from: f */
    public static Rect m3453f() {
        Rect b = f3183a.mo20818b();
        return b == null ? new Rect() : b;
    }

    /* renamed from: h */
    public static int m3454h(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: A */
    public final void mo3570A(View view, int i, Rect rect, Rect rect2, C0459f fVar, int i2, int i3) {
        int d = ri1.m26762d(m3450W(fVar.f3216a), i);
        int d2 = ri1.m26762d(m3451X(fVar.f3222b), i);
        int i4 = d & 7;
        int i5 = d & 112;
        int i6 = d2 & 7;
        int i7 = d2 & 112;
        int width = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i7 != 16 ? i7 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i4 == 1) {
            width -= i2 / 2;
        } else if (i4 != 5) {
            width -= i2;
        }
        if (i5 == 16) {
            height -= i3 / 2;
        } else if (i5 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* renamed from: B */
    public final int mo3571B(int i) {
        StringBuilder sb;
        int[] iArr = this.f3211c;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e(f3187b, sb.toString());
        return 0;
    }

    /* renamed from: C */
    public void mo3572C(View view, Rect rect) {
        rect.set(((C0459f) view.getLayoutParams()).mo3678h());
    }

    /* renamed from: D */
    public C0459f mo3573D(View view) {
        C0459f fVar = (C0459f) view.getLayoutParams();
        if (!fVar.f3221a) {
            if (view instanceof C0455b) {
                Behavior behavior = ((C0455b) view).getBehavior();
                if (behavior == null) {
                    Log.e(f3187b, "Attached behavior class is null");
                }
                fVar.mo3687q(behavior);
            } else {
                C0456c cVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    cVar = (C0456c) cls.getAnnotation(C0456c.class);
                    if (cVar != null) {
                        break;
                    }
                }
                if (cVar != null) {
                    try {
                        fVar.mo3687q((Behavior) cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e(f3187b, "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
            }
            fVar.f3221a = true;
        }
        return fVar;
    }

    /* renamed from: E */
    public final void mo3574E(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = f3185a;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: F */
    public final boolean mo3575F(View view) {
        return this.f3199a.mo16705j(view);
    }

    /* renamed from: G */
    public boolean mo3576G(@mr2 View view, int i, int i2) {
        Rect f = m3453f();
        mo3635y(view, f);
        try {
            return f.contains(i, i2);
        } finally {
            m3449T(f);
        }
    }

    /* renamed from: H */
    public final void mo3577H(View view, int i) {
        C0459f fVar = (C0459f) view.getLayoutParams();
        Rect f = m3453f();
        f.set(getPaddingLeft() + fVar.leftMargin, getPaddingTop() + fVar.topMargin, (getWidth() - getPaddingRight()) - fVar.rightMargin, (getHeight() - getPaddingBottom()) - fVar.bottomMargin);
        if (this.f3202a != null && jt4.m18913U(this) && !jt4.m18913U(view)) {
            f.left += this.f3202a.mo24603p();
            f.top += this.f3202a.mo24605r();
            f.right -= this.f3202a.mo24604q();
            f.bottom -= this.f3202a.mo24602o();
        }
        Rect f2 = m3453f();
        ri1.m26760b(m3451X(fVar.f3216a), view.getMeasuredWidth(), view.getMeasuredHeight(), f, f2, i);
        view.layout(f2.left, f2.top, f2.right, f2.bottom);
        m3449T(f);
        m3449T(f2);
    }

    /* renamed from: I */
    public final void mo3578I(View view, View view2, int i) {
        Rect f = m3453f();
        Rect f2 = m3453f();
        try {
            mo3635y(view2, f);
            mo3636z(view, i, f, f2);
            view.layout(f2.left, f2.top, f2.right, f2.bottom);
        } finally {
            m3449T(f);
            m3449T(f2);
        }
    }

    /* renamed from: J */
    public final void mo3579J(View view, int i, int i2) {
        C0459f fVar = (C0459f) view.getLayoutParams();
        int d = ri1.m26762d(m3452Y(fVar.f3216a), i2);
        int i3 = d & 7;
        int i4 = d & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int B = mo3571B(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            B += measuredWidth / 2;
        } else if (i3 == 5) {
            B += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(B, ((width - getPaddingRight()) - measuredWidth) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - fVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: K */
    public final void mo3580K(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (jt4.m18914U0(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0459f fVar = (C0459f) view.getLayoutParams();
            Behavior f = fVar.mo3676f();
            Rect f2 = m3453f();
            Rect f3 = m3453f();
            f3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f == null || !f.mo3643b(this, view, f2)) {
                f2.set(f3);
            } else if (!f3.contains(f2)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + f2.toShortString() + " | Bounds:" + f3.toShortString());
            }
            m3449T(f3);
            if (f2.isEmpty()) {
                m3449T(f2);
                return;
            }
            int d = ri1.m26762d(fVar.f3231f, i);
            boolean z3 = true;
            if ((d & 48) != 48 || (i6 = (f2.top - fVar.topMargin) - fVar.f3233h) >= (i7 = rect.top)) {
                z = false;
            } else {
                mo3591a0(view, i7 - i6);
                z = true;
            }
            if ((d & 80) == 80 && (height = ((getHeight() - f2.bottom) - fVar.bottomMargin) + fVar.f3233h) < (i5 = rect.bottom)) {
                mo3591a0(view, height - i5);
                z = true;
            }
            if (!z) {
                mo3591a0(view, 0);
            }
            if ((d & 3) != 3 || (i3 = (f2.left - fVar.leftMargin) - fVar.f3232g) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                mo3590Z(view, i4 - i3);
                z2 = true;
            }
            if ((d & 5) != 5 || (width = ((getWidth() - f2.right) - fVar.rightMargin) + fVar.f3232g) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                mo3590Z(view, width - i2);
            }
            if (!z3) {
                mo3590Z(view, 0);
            }
            m3449T(f2);
        }
    }

    /* renamed from: L */
    public void mo3581L(View view, int i) {
        Behavior f;
        View view2 = view;
        C0459f fVar = (C0459f) view.getLayoutParams();
        if (fVar.f3218a != null) {
            Rect f2 = m3453f();
            Rect f3 = m3453f();
            Rect f4 = m3453f();
            mo3635y(fVar.f3218a, f2);
            boolean z = false;
            mo3631v(view2, false, f3);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = measuredHeight;
            mo3570A(view, i, f2, f4, fVar, measuredWidth, measuredHeight);
            if (!(f4.left == f3.left && f4.top == f3.top)) {
                z = true;
            }
            mo3606i(fVar, f4, measuredWidth, i2);
            int i3 = f4.left - f3.left;
            int i4 = f4.top - f3.top;
            if (i3 != 0) {
                jt4.m18949e1(view2, i3);
            }
            if (i4 != 0) {
                jt4.m18953f1(view2, i4);
            }
            if (z && (f = fVar.mo3676f()) != null) {
                f.mo3649i(this, view2, fVar.f3218a);
            }
            m3449T(f2);
            m3449T(f3);
            m3449T(f4);
        }
    }

    /* renamed from: M */
    public final void mo3582M(int i) {
        boolean z;
        int i2 = i;
        int Z = jt4.m18928Z(this);
        int size = this.f3203a.size();
        Rect f = m3453f();
        Rect f2 = m3453f();
        Rect f3 = m3453f();
        for (int i3 = 0; i3 < size; i3++) {
            View view = this.f3203a.get(i3);
            C0459f fVar = (C0459f) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (fVar.f3223b == this.f3203a.get(i4)) {
                        mo3581L(view, Z);
                    }
                }
                mo3631v(view, true, f2);
                if (fVar.f3229e != 0 && !f2.isEmpty()) {
                    int d = ri1.m26762d(fVar.f3229e, Z);
                    int i5 = d & 112;
                    if (i5 == 48) {
                        f.top = Math.max(f.top, f2.bottom);
                    } else if (i5 == 80) {
                        f.bottom = Math.max(f.bottom, getHeight() - f2.top);
                    }
                    int i6 = d & 7;
                    if (i6 == 3) {
                        f.left = Math.max(f.left, f2.right);
                    } else if (i6 == 5) {
                        f.right = Math.max(f.right, getWidth() - f2.left);
                    }
                }
                if (fVar.f3231f != 0 && view.getVisibility() == 0) {
                    mo3580K(view, f, Z);
                }
                if (i2 != 2) {
                    mo3572C(view, f3);
                    if (!f3.equals(f2)) {
                        mo3587S(view, f2);
                    }
                }
                for (int i7 = i3 + 1; i7 < size; i7++) {
                    View view2 = this.f3203a.get(i7);
                    C0459f fVar2 = (C0459f) view2.getLayoutParams();
                    Behavior f4 = fVar2.mo3676f();
                    if (f4 != null && f4.mo3646f(this, view2, view)) {
                        if (i2 != 0 || !fVar2.mo3677g()) {
                            if (i2 != 2) {
                                z = f4.mo3649i(this, view2, view);
                            } else {
                                f4.mo3650j(this, view2, view);
                                z = true;
                            }
                            if (i2 == 1) {
                                fVar2.mo3688r(z);
                            }
                        } else {
                            fVar2.mo3682l();
                        }
                    }
                }
            }
        }
        m3449T(f);
        m3449T(f2);
        m3449T(f3);
    }

    /* renamed from: N */
    public void mo3583N(@mr2 View view, int i) {
        C0459f fVar = (C0459f) view.getLayoutParams();
        if (!fVar.mo3671a()) {
            View view2 = fVar.f3218a;
            if (view2 != null) {
                mo3578I(view, view2, i);
                return;
            }
            int i2 = fVar.f3225c;
            if (i2 >= 0) {
                mo3579J(view, i2, i);
            } else {
                mo3577H(view, i);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    /* renamed from: O */
    public void mo3584O(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* renamed from: Q */
    public final boolean mo3585Q(MotionEvent motionEvent, int i) {
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f3206b;
        mo3574E(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            C0459f fVar = (C0459f) view.getLayoutParams();
            Behavior f = fVar.mo3676f();
            if ((!z && !z2) || actionMasked == 0) {
                if (!z && f != null) {
                    if (i2 == 0) {
                        z = f.mo3652l(this, view, motionEvent2);
                    } else if (i2 == 1) {
                        z = f.mo3641E(this, view, motionEvent2);
                    }
                    if (z) {
                        this.f3196a = view;
                    }
                }
                boolean c = fVar.mo3673c();
                boolean j = fVar.mo3680j(this, view);
                z2 = j && !c;
                if (j && !z2) {
                    break;
                }
            } else if (f != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    f.mo3652l(this, view, motionEvent3);
                } else if (i2 == 1) {
                    f.mo3641E(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: R */
    public final void mo3586R() {
        this.f3203a.clear();
        this.f3199a.mo16698c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0459f D = mo3573D(childAt);
            D.mo3674d(this, childAt);
            this.f3199a.mo16697b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (D.mo3672b(this, childAt, childAt2)) {
                        if (!this.f3199a.mo16699d(childAt2)) {
                            this.f3199a.mo16697b(childAt2);
                        }
                        this.f3199a.mo16696a(childAt2, childAt);
                    }
                }
            }
        }
        this.f3203a.addAll(this.f3199a.mo16704i());
        Collections.reverse(this.f3203a);
    }

    /* renamed from: S */
    public void mo3587S(View view, Rect rect) {
        ((C0459f) view.getLayoutParams()).mo3689s(rect);
    }

    /* renamed from: U */
    public void mo3588U() {
        if (this.f3210c && this.f3198a != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3198a);
        }
        this.f3212d = false;
    }

    /* renamed from: V */
    public final void mo3589V(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior f = ((C0459f) childAt.getLayoutParams()).mo3676f();
            if (f != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    f.mo3652l(this, childAt, obtain);
                } else {
                    f.mo3641E(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0459f) getChildAt(i2).getLayoutParams()).mo3684n();
        }
        this.f3196a = null;
        this.f3207b = false;
    }

    /* renamed from: Z */
    public final void mo3590Z(View view, int i) {
        C0459f fVar = (C0459f) view.getLayoutParams();
        int i2 = fVar.f3232g;
        if (i2 != i) {
            jt4.m18949e1(view, i - i2);
            fVar.f3232g = i;
        }
    }

    /* renamed from: a0 */
    public final void mo3591a0(View view, int i) {
        C0459f fVar = (C0459f) view.getLayoutParams();
        int i2 = fVar.f3233h;
        if (i2 != i) {
            jt4.m18953f1(view, i - i2);
            fVar.f3233h = i;
        }
    }

    /* renamed from: b */
    public void mo1562b(View view, int i, int i2, int[] iArr, int i3) {
        Behavior f;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                int i7 = i3;
            } else {
                C0459f fVar = (C0459f) childAt.getLayoutParams();
                if (fVar.mo3681k(i3) && (f = fVar.mo3676f()) != null) {
                    int[] iArr2 = this.f3204a;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f.mo3658r(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f3204a;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.f3204a;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            mo3582M(1);
        }
    }

    /* renamed from: b0 */
    public final sx4 mo3592b0(sx4 sx4) {
        if (ot2.m24056a(this.f3202a, sx4)) {
            return sx4;
        }
        this.f3202a = sx4;
        boolean z = true;
        boolean z2 = sx4 != null && sx4.mo24605r() > 0;
        this.f3213e = z2;
        if (z2 || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        sx4 j = mo3607j(sx4);
        requestLayout();
        return j;
    }

    /* renamed from: c0 */
    public final void mo3593c0() {
        if (jt4.m18913U(this)) {
            if (this.f3201a == null) {
                this.f3201a = new C0454a();
            }
            jt4.m18934a2(this, this.f3201a);
            setSystemUiVisibility(el1.f27973d);
            return;
        }
        jt4.m18934a2(this, (ju2) null);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0459f) && super.checkLayoutParams(layoutParams);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        C0459f fVar = (C0459f) view.getLayoutParams();
        Behavior behavior = fVar.f3219a;
        if (behavior != null) {
            float d = behavior.mo3645d(this, view);
            if (d > 0.0f) {
                if (this.f3194a == null) {
                    this.f3194a = new Paint();
                }
                this.f3194a.setColor(fVar.f3219a.mo3644c(this, view));
                this.f3194a.setAlpha(m3454h(Math.round(d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f3194a);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3195a;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: g */
    public void mo3597g() {
        if (this.f3210c) {
            if (this.f3198a == null) {
                this.f3198a = new C0460g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3198a);
        }
        this.f3212d = true;
    }

    @hw4
    public final List<View> getDependencySortedChildren() {
        mo3586R();
        return Collections.unmodifiableList(this.f3203a);
    }

    @hl3({hl3.C2354a.f13188c})
    public final sx4 getLastWindowInsets() {
        return this.f3202a;
    }

    public int getNestedScrollAxes() {
        return this.f3200a.mo16724a();
    }

    @ts2
    public Drawable getStatusBarBackground() {
        return this.f3195a;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* renamed from: i */
    public final void mo3606i(C0459f fVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - fVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: j */
    public final sx4 mo3607j(sx4 sx4) {
        Behavior f;
        if (sx4.mo24576A()) {
            return sx4;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (jt4.m18913U(childAt) && (f = ((C0459f) childAt.getLayoutParams()).mo3676f()) != null) {
                sx4 = f.mo3647g(this, childAt, sx4);
                if (sx4.mo24576A()) {
                    break;
                }
            }
        }
        return sx4;
    }

    /* renamed from: k */
    public void mo1580k(View view, int i) {
        this.f3200a.mo16728e(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0459f fVar = (C0459f) childAt.getLayoutParams();
            if (fVar.mo3681k(i)) {
                Behavior f = fVar.mo3676f();
                if (f != null) {
                    f.mo3640D(this, childAt, view, i);
                }
                fVar.mo3683m(i);
                fVar.mo3682l();
            }
        }
        this.f3205b = null;
    }

    /* renamed from: l */
    public void mo1581l(@mr2 View view, int i, int i2, int i3, int i4, int i5, @mr2 int[] iArr) {
        Behavior f;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0459f fVar = (C0459f) childAt.getLayoutParams();
                if (fVar.mo3681k(i5) && (f = fVar.mo3676f()) != null) {
                    int[] iArr2 = this.f3204a;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f.mo3661u(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f3204a;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    i7 = i4 > 0 ? Math.max(i7, this.f3204a[1]) : Math.min(i7, this.f3204a[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            mo3582M(1);
        }
    }

    /* renamed from: m */
    public void mo3608m(@mr2 View view) {
        List g = this.f3199a.mo16702g(view);
        if (g != null && !g.isEmpty()) {
            for (int i = 0; i < g.size(); i++) {
                View view2 = (View) g.get(i);
                Behavior f = ((C0459f) view2.getLayoutParams()).mo3676f();
                if (f != null) {
                    f.mo3649i(this, view2, view);
                }
            }
        }
    }

    /* renamed from: n */
    public void mo1583n(View view, int i, int i2, int i3, int i4, int i5) {
        mo1581l(view, i, i2, i3, i4, 0, this.f3208b);
    }

    /* renamed from: o */
    public boolean mo3609o(@mr2 View view, @mr2 View view2) {
        boolean z = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect f = m3453f();
        mo3631v(view, view.getParent() != this, f);
        Rect f2 = m3453f();
        mo3631v(view2, view2.getParent() != this, f2);
        try {
            if (f.left <= f2.right && f.top <= f2.bottom && f.right >= f2.left && f.bottom >= f2.top) {
                z = true;
            }
            return z;
        } finally {
            m3449T(f);
            m3449T(f2);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo3589V(false);
        if (this.f3212d) {
            if (this.f3198a == null) {
                this.f3198a = new C0460g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3198a);
        }
        if (this.f3202a == null && jt4.m18913U(this)) {
            jt4.m19017v1(this);
        }
        this.f3210c = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo3589V(false);
        if (this.f3212d && this.f3198a != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3198a);
        }
        View view = this.f3205b;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f3210c = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f3213e && this.f3195a != null) {
            sx4 sx4 = this.f3202a;
            int r = sx4 != null ? sx4.mo24605r() : 0;
            if (r > 0) {
                this.f3195a.setBounds(0, 0, getWidth(), r);
                this.f3195a.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            mo3589V(true);
        }
        boolean Q = mo3585Q(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            mo3589V(true);
        }
        return Q;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Behavior f;
        int Z = jt4.m18928Z(this);
        int size = this.f3203a.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f3203a.get(i5);
            if (view.getVisibility() != 8 && ((f = ((C0459f) view.getLayoutParams()).mo3676f()) == null || !f.mo3653m(this, view, Z))) {
                mo3583N(view, Z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        if (r0.mo3654n(r30, r20, r11, r21, r23, 0) == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.mo3586R()
            r30.mo3619q()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = com.onedelhi.secure.jt4.m18928Z(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = 1
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            com.onedelhi.secure.sx4 r3 = r7.f3202a
            if (r3 == 0) goto L_0x004b
            boolean r3 = com.onedelhi.secure.jt4.m18913U(r30)
            if (r3 == 0) goto L_0x004b
            r19 = 1
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List<android.view.View> r2 = r7.f3203a
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x0057:
            if (r3 >= r6) goto L_0x016f
            java.util.List<android.view.View> r0 = r7.f3203a
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0073
            r22 = r3
            r29 = r6
            r28 = r8
            goto L_0x0167
        L_0x0073:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0459f) r1
            int r0 = r1.f3225c
            if (r0 < 0) goto L_0x00ba
            if (r13 == 0) goto L_0x00ba
            int r0 = r7.mo3571B(r0)
            int r11 = r1.f3216a
            int r11 = m3452Y(r11)
            int r11 = com.onedelhi.secure.ri1.m26762d(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r11 = 0
            goto L_0x00bf
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00bc
            if (r12 == 0) goto L_0x00bc
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00bf
        L_0x00ba:
            r22 = r2
        L_0x00bc:
            r11 = 0
            r21 = 0
        L_0x00bf:
            if (r19 == 0) goto L_0x00f1
            boolean r0 = com.onedelhi.secure.jt4.m18913U(r20)
            if (r0 != 0) goto L_0x00f1
            com.onedelhi.secure.sx4 r0 = r7.f3202a
            int r0 = r0.mo24603p()
            com.onedelhi.secure.sx4 r2 = r7.f3202a
            int r2 = r2.mo24604q()
            int r0 = r0 + r2
            com.onedelhi.secure.sx4 r2 = r7.f3202a
            int r2 = r2.mo24605r()
            com.onedelhi.secure.sx4 r11 = r7.f3202a
            int r11 = r11.mo24602o()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f5
        L_0x00f1:
            r11 = r31
            r23 = r32
        L_0x00f5:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.mo3676f()
            if (r0 == 0) goto L_0x011d
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.mo3654n(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0137
            goto L_0x012a
        L_0x011d:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L_0x012a:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.mo3584O(r1, r2, r3, r4, r5)
        L_0x0137:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
        L_0x0167:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L_0x0057
        L_0x016f:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        Behavior f3;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0459f fVar = (C0459f) childAt.getLayoutParams();
                if (fVar.mo3681k(0) && (f3 = fVar.mo3676f()) != null) {
                    z2 |= f3.mo3655o(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            mo3582M(1);
        }
        return z2;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        Behavior f3;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0459f fVar = (C0459f) childAt.getLayoutParams();
                if (fVar.mo3681k(0) && (f3 = fVar.mo3676f()) != null) {
                    z |= f3.mo3656p(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo1562b(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1583n(view, i, i2, i3, i4, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo1599p(view, view2, i, 0);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0461h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0461h hVar = (C0461h) parcelable;
        super.onRestoreInstanceState(hVar.mo14959a());
        SparseArray<Parcelable> sparseArray = hVar.f3235a;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior f = mo3573D(childAt).mo3676f();
            if (!(id == -1 || f == null || (parcelable2 = sparseArray.get(id)) == null)) {
                f.mo3665y(this, childAt, parcelable2);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable z;
        C0461h hVar = new C0461h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior f = ((C0459f) childAt.getLayoutParams()).mo3676f();
            if (!(id == -1 || f == null || (z = f.mo3666z(this, childAt)) == null)) {
                sparseArray.append(id, z);
            }
        }
        hVar.f3235a = sparseArray;
        return hVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo1601r(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        mo1580k(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f3196a
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.mo3585Q(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f3196a
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0459f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.mo3676f()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f3196a
            boolean r6 = r6.mo3641E(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.f3196a
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.mo3589V(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public void mo1599p(View view, View view2, int i, int i2) {
        Behavior f;
        this.f3200a.mo16726c(view, view2, i, i2);
        this.f3205b = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0459f fVar = (C0459f) childAt.getLayoutParams();
            if (fVar.mo3681k(i2) && (f = fVar.mo3676f()) != null) {
                f.mo3663w(this, childAt, view, view2, i, i2);
            }
        }
    }

    /* renamed from: q */
    public void mo3619q() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (mo3575F(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f3212d) {
            return;
        }
        if (z) {
            mo3597g();
        } else {
            mo3588U();
        }
    }

    /* renamed from: r */
    public boolean mo1601r(View view, View view2, int i, int i2) {
        int i3 = i2;
        int childCount = getChildCount();
        int i4 = 0;
        boolean z = false;
        while (true) {
            if (i4 >= childCount) {
                return z;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                C0459f fVar = (C0459f) childAt.getLayoutParams();
                Behavior f = fVar.mo3676f();
                if (f != null) {
                    boolean B = f.mo3638B(this, childAt, view, view2, i, i2);
                    z |= B;
                    fVar.mo3690t(i3, B);
                } else {
                    fVar.mo3690t(i3, false);
                }
            }
            i4++;
        }
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior f = ((C0459f) view.getLayoutParams()).mo3676f();
        if (f == null || !f.mo3664x(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f3207b) {
            mo3589V(false);
            this.f3207b = true;
        }
    }

    /* renamed from: s */
    public C0459f generateDefaultLayoutParams() {
        return new C0459f(-2, -2);
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        mo3593c0();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f3197a = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@ts2 Drawable drawable) {
        Drawable drawable2 = this.f3195a;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f3195a = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f3195a.setState(getDrawableState());
                }
                wo0.m30984m(this.f3195a, jt4.m18928Z(this));
                this.f3195a.setVisible(getVisibility() == 0, false);
                this.f3195a.setCallback(this);
            }
            jt4.m18985n1(this);
        }
    }

    public void setStatusBarBackgroundColor(@d10 int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(@dp0 int i) {
        setStatusBarBackground(i != 0 ? r70.m26356i(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f3195a;
        if (drawable != null && drawable.isVisible() != z) {
            this.f3195a.setVisible(z, false);
        }
    }

    /* renamed from: t */
    public C0459f generateLayoutParams(AttributeSet attributeSet) {
        return new C0459f(getContext(), attributeSet);
    }

    /* renamed from: u */
    public C0459f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0459f ? new C0459f((C0459f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0459f((ViewGroup.MarginLayoutParams) layoutParams) : new C0459f(layoutParams);
    }

    /* renamed from: v */
    public void mo3631v(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            mo3635y(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3195a;
    }

    @mr2
    /* renamed from: w */
    public List<View> mo3633w(@mr2 View view) {
        List<View> h = this.f3199a.mo16703h(view);
        this.f3209c.clear();
        if (h != null) {
            this.f3209c.addAll(h);
        }
        return this.f3209c;
    }

    @mr2
    /* renamed from: x */
    public List<View> mo3634x(@mr2 View view) {
        List g = this.f3199a.mo16702g(view);
        this.f3209c.clear();
        if (g != null) {
            this.f3209c.addAll(g);
        }
        return this.f3209c;
    }

    /* renamed from: y */
    public void mo3635y(View view, Rect rect) {
        xt4.m31725a(this, view, rect);
    }

    /* renamed from: z */
    public void mo3636z(View view, int i, Rect rect, Rect rect2) {
        C0459f fVar = (C0459f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        mo3570A(view, i, rect, rect2, fVar, measuredWidth, measuredHeight);
        mo3606i(fVar, rect2, measuredWidth, measuredHeight);
    }
}
