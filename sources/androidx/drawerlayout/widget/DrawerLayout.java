package androidx.drawerlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C2015e0;
import com.onedelhi.secure.C2018e2;
import com.onedelhi.secure.C3884x1;
import com.onedelhi.secure.cw2;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.el1;
import com.onedelhi.secure.gr1;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.mt4;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.ri1;
import com.onedelhi.secure.sx4;
import com.onedelhi.secure.ta3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wo0;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout extends ViewGroup implements cw2 {

    /* renamed from: A */
    public static final int f3446A = 3;

    /* renamed from: B */
    public static final int f3447B = 64;

    /* renamed from: C */
    public static final int f3448C = -1728053248;

    /* renamed from: D */
    public static final int f3449D = 160;

    /* renamed from: E */
    public static final int f3450E = 400;

    /* renamed from: a */
    public static final int[] f3451a = {16843828};

    /* renamed from: b */
    public static final String f3452b = "DrawerLayout";

    /* renamed from: b */
    public static final int[] f3453b = {16842931};

    /* renamed from: c */
    public static final String f3454c = "androidx.drawerlayout.widget.DrawerLayout";

    /* renamed from: e */
    public static final float f3455e = 1.0f;

    /* renamed from: f */
    public static final boolean f3456f = false;

    /* renamed from: g */
    public static final boolean f3457g = true;

    /* renamed from: h */
    public static final boolean f3458h = true;

    /* renamed from: i */
    public static final boolean f3459i = true;

    /* renamed from: j */
    public static boolean f3460j = false;

    /* renamed from: u */
    public static final int f3461u = 0;

    /* renamed from: v */
    public static final int f3462v = 1;

    /* renamed from: w */
    public static final int f3463w = 2;

    /* renamed from: x */
    public static final int f3464x = 0;

    /* renamed from: y */
    public static final int f3465y = 1;

    /* renamed from: z */
    public static final int f3466z = 2;

    /* renamed from: a */
    public float f3467a;

    /* renamed from: a */
    public Matrix f3468a;

    /* renamed from: a */
    public Paint f3469a;

    /* renamed from: a */
    public Rect f3470a;

    /* renamed from: a */
    public Drawable f3471a;

    /* renamed from: a */
    public final C0534d f3472a;
    @ts2

    /* renamed from: a */
    public C0535e f3473a;

    /* renamed from: a */
    public final C0539h f3474a;

    /* renamed from: a */
    public final C2018e2 f3475a;

    /* renamed from: a */
    public final mt4 f3476a;

    /* renamed from: a */
    public CharSequence f3477a;

    /* renamed from: a */
    public Object f3478a;

    /* renamed from: a */
    public final ArrayList<View> f3479a;

    /* renamed from: a */
    public List<C0535e> f3480a;

    /* renamed from: b */
    public float f3481b;

    /* renamed from: b */
    public Drawable f3482b;

    /* renamed from: b */
    public final C0539h f3483b;

    /* renamed from: b */
    public final mt4 f3484b;

    /* renamed from: b */
    public CharSequence f3485b;

    /* renamed from: b */
    public boolean f3486b;

    /* renamed from: c */
    public float f3487c;

    /* renamed from: c */
    public Drawable f3488c;

    /* renamed from: c */
    public boolean f3489c;

    /* renamed from: d */
    public float f3490d;

    /* renamed from: d */
    public Drawable f3491d;

    /* renamed from: d */
    public boolean f3492d;

    /* renamed from: e */
    public Drawable f3493e;

    /* renamed from: e */
    public boolean f3494e;

    /* renamed from: f */
    public Drawable f3495f;

    /* renamed from: g */
    public Drawable f3496g;

    /* renamed from: n */
    public int f3497n;

    /* renamed from: o */
    public int f3498o;

    /* renamed from: p */
    public int f3499p;

    /* renamed from: q */
    public int f3500q;

    /* renamed from: r */
    public int f3501r;

    /* renamed from: s */
    public int f3502s;

    /* renamed from: t */
    public int f3503t;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: c */
        public static final int f3504c = 1;

        /* renamed from: d */
        public static final int f3505d = 2;

        /* renamed from: e */
        public static final int f3506e = 4;

        /* renamed from: a */
        public float f3507a;

        /* renamed from: a */
        public int f3508a;

        /* renamed from: a */
        public boolean f3509a;

        /* renamed from: b */
        public int f3510b;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f3508a = 0;
        }

        public LayoutParams(int i, int i2, int i3) {
            this(i, i2);
            this.f3508a = i3;
        }

        public LayoutParams(@mr2 Context context, @ts2 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3508a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f3453b);
            this.f3508a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(@mr2 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3508a = 0;
        }

        public LayoutParams(@mr2 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3508a = 0;
        }

        public LayoutParams(@mr2 LayoutParams layoutParams) {
            super(layoutParams);
            this.f3508a = 0;
            this.f3508a = layoutParams.f3508a;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    public class C0531a implements C2018e2 {
        public C0531a() {
        }

        /* renamed from: a */
        public boolean mo4110a(@mr2 View view, @ts2 C2018e2.C2019a aVar) {
            if (!DrawerLayout.this.mo4027E(view) || DrawerLayout.this.mo4091s(view) == 2) {
                return false;
            }
            DrawerLayout.this.mo4059g(view);
            return true;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    public class C0532b implements View.OnApplyWindowInsetsListener {
        public C0532b() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).setChildInsets(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    public class C0533c extends C3884x1 {

        /* renamed from: a */
        public final Rect f3513a = new Rect();

        public C0533c() {
        }

        /* renamed from: a */
        public boolean mo4112a(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence t;
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo4112a(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View q = DrawerLayout.this.mo4087q();
            if (q == null || (t = DrawerLayout.this.mo4105t(DrawerLayout.this.mo4106u(q))) == null) {
                return true;
            }
            text.add(t);
            return true;
        }

        /* renamed from: f */
        public void mo3892f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3892f(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.f3454c);
        }

        /* renamed from: g */
        public void mo3893g(View view, C1638a2 a2Var) {
            if (DrawerLayout.f3458h) {
                super.mo3893g(view, a2Var);
            } else {
                C1638a2 F0 = C1638a2.m10546F0(a2Var);
                super.mo3893g(view, F0);
                a2Var.mo12507I1(view);
                ViewParent l0 = jt4.m18976l0(view);
                if (l0 instanceof View) {
                    a2Var.mo12634z1((View) l0);
                }
                mo4115o(a2Var, F0);
                F0.mo12506I0();
                mo4114n(a2Var, (ViewGroup) view);
            }
            a2Var.mo12548W0(DrawerLayout.f3454c);
            a2Var.mo12584i1(false);
            a2Var.mo12587j1(false);
            a2Var.mo12512K0(C1638a2.C1639a.f8637a);
            a2Var.mo12512K0(C1638a2.C1639a.f8639b);
        }

        /* renamed from: i */
        public boolean mo4113i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f3458h || DrawerLayout.m3985B(view)) {
                return super.mo4113i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* renamed from: n */
        public final void mo4114n(C1638a2 a2Var, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.m3985B(childAt)) {
                    a2Var.mo12562c(childAt);
                }
            }
        }

        /* renamed from: o */
        public final void mo4115o(C1638a2 a2Var, C1638a2 a2Var2) {
            Rect rect = this.f3513a;
            a2Var2.mo12614t(rect);
            a2Var.mo12536S0(rect);
            a2Var.mo12546V1(a2Var2.mo12489B0());
            a2Var.mo12628x1(a2Var2.mo12520N());
            a2Var.mo12548W0(a2Var2.mo12624w());
            a2Var.mo12558a1(a2Var2.mo12485A());
            a2Var.mo12577g1(a2Var2.mo12600o0());
            a2Var.mo12587j1(a2Var2.mo12606q0());
            a2Var.mo12524O0(a2Var2.mo12576g0());
            a2Var.mo12501G1(a2Var2.mo12630y0());
            a2Var.mo12556a(a2Var2.mo12602p());
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    public static final class C0534d extends C3884x1 {
        /* renamed from: g */
        public void mo3893g(View view, C1638a2 a2Var) {
            super.mo3893g(view, a2Var);
            if (!DrawerLayout.m3985B(view)) {
                a2Var.mo12634z1((View) null);
            }
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    public interface C0535e {
        /* renamed from: a */
        void mo881a(@mr2 View view, float f);

        /* renamed from: b */
        void mo882b(int i);

        /* renamed from: c */
        void mo883c(@mr2 View view);

        /* renamed from: d */
        void mo884d(@mr2 View view);
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f */
    public static class C0536f extends C2015e0 {
        public static final Parcelable.Creator<C0536f> CREATOR = new C0537a();

        /* renamed from: n */
        public int f3515n = 0;

        /* renamed from: o */
        public int f3516o;

        /* renamed from: p */
        public int f3517p;

        /* renamed from: q */
        public int f3518q;

        /* renamed from: r */
        public int f3519r;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f$a */
        public class C0537a implements Parcelable.ClassLoaderCreator<C0536f> {
            /* renamed from: a */
            public C0536f createFromParcel(Parcel parcel) {
                return new C0536f(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public C0536f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0536f(parcel, classLoader);
            }

            /* renamed from: c */
            public C0536f[] newArray(int i) {
                return new C0536f[i];
            }
        }

        public C0536f(@mr2 Parcel parcel, @ts2 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3515n = parcel.readInt();
            this.f3516o = parcel.readInt();
            this.f3517p = parcel.readInt();
            this.f3518q = parcel.readInt();
            this.f3519r = parcel.readInt();
        }

        public C0536f(@mr2 Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3515n);
            parcel.writeInt(this.f3516o);
            parcel.writeInt(this.f3517p);
            parcel.writeInt(this.f3518q);
            parcel.writeInt(this.f3519r);
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$g */
    public static abstract class C0538g implements C0535e {
        /* renamed from: a */
        public void mo881a(View view, float f) {
        }

        /* renamed from: b */
        public void mo882b(int i) {
        }

        /* renamed from: c */
        public void mo883c(View view) {
        }

        /* renamed from: d */
        public void mo884d(View view) {
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$h */
    public class C0539h extends mt4.C2888c {

        /* renamed from: a */
        public final int f3520a;

        /* renamed from: a */
        public mt4 f3522a;

        /* renamed from: a */
        public final Runnable f3523a = new C0540a();

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$h$a */
        public class C0540a implements Runnable {
            public C0540a() {
            }

            public void run() {
                C0539h.this.mo4134o();
            }
        }

        public C0539h(int i) {
            this.f3520a = i;
        }

        /* renamed from: a */
        public int mo4122a(View view, int i, int i2) {
            int width;
            int width2;
            if (DrawerLayout.this.mo4054d(view, 3)) {
                width2 = -view.getWidth();
                width = 0;
            } else {
                width = DrawerLayout.this.getWidth();
                width2 = width - view.getWidth();
            }
            return Math.max(width2, Math.min(i, width));
        }

        /* renamed from: b */
        public int mo4123b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: d */
        public int mo4124d(View view) {
            if (DrawerLayout.this.mo4028F(view)) {
                return view.getWidth();
            }
            return 0;
        }

        /* renamed from: f */
        public void mo4125f(int i, int i2) {
            DrawerLayout drawerLayout;
            int i3;
            if ((i & 1) == 1) {
                drawerLayout = DrawerLayout.this;
                i3 = 3;
            } else {
                drawerLayout = DrawerLayout.this;
                i3 = 5;
            }
            View o = drawerLayout.mo4073o(i3);
            if (o != null && DrawerLayout.this.mo4091s(o) == 0) {
                this.f3522a.mo20652d(o, i2);
            }
        }

        /* renamed from: g */
        public boolean mo4126g(int i) {
            return false;
        }

        /* renamed from: h */
        public void mo4127h(int i, int i2) {
            DrawerLayout.this.postDelayed(this.f3523a, 160);
        }

        /* renamed from: i */
        public void mo4128i(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).f3509a = false;
            mo4133n();
        }

        /* renamed from: j */
        public void mo4129j(int i) {
            DrawerLayout.this.mo4045W(i, this.f3522a.mo20672z());
        }

        /* renamed from: k */
        public void mo4130k(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.mo4054d(view, 3) ? (float) (i + width) : (float) (DrawerLayout.this.getWidth() - i)) / ((float) width);
            DrawerLayout.this.mo4042T(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        /* renamed from: l */
        public void mo4131l(View view, float f, float f2) {
            int i;
            float v = DrawerLayout.this.mo4107v(view);
            int width = view.getWidth();
            if (DrawerLayout.this.mo4054d(view, 3)) {
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                i = (i2 > 0 || (i2 == 0 && v > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && v > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f3522a.mo20645V(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        /* renamed from: m */
        public boolean mo4132m(View view, int i) {
            return DrawerLayout.this.mo4028F(view) && DrawerLayout.this.mo4054d(view, this.f3520a) && DrawerLayout.this.mo4091s(view) == 0;
        }

        /* renamed from: n */
        public final void mo4133n() {
            int i = 3;
            if (this.f3520a == 3) {
                i = 5;
            }
            View o = DrawerLayout.this.mo4073o(i);
            if (o != null) {
                DrawerLayout.this.mo4059g(o);
            }
        }

        /* renamed from: o */
        public void mo4134o() {
            View view;
            int i;
            int B = this.f3522a.mo20625B();
            int i2 = 0;
            boolean z = this.f3520a == 3;
            if (z) {
                view = DrawerLayout.this.mo4073o(3);
                if (view != null) {
                    i2 = -view.getWidth();
                }
                i = i2 + B;
            } else {
                view = DrawerLayout.this.mo4073o(5);
                i = DrawerLayout.this.getWidth() - B;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.mo4091s(view) == 0) {
                this.f3522a.mo20647X(view, i, view.getTop());
                ((LayoutParams) view.getLayoutParams()).f3509a = true;
                DrawerLayout.this.invalidate();
                mo4133n();
                DrawerLayout.this.mo4050c();
            }
        }

        /* renamed from: p */
        public void mo4135p() {
            DrawerLayout.this.removeCallbacks(this.f3523a);
        }

        /* renamed from: q */
        public void mo4136q(mt4 mt4) {
            this.f3522a = mt4;
        }
    }

    static {
        boolean z = true;
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            z = false;
        }
        f3460j = z;
    }

    public DrawerLayout(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public DrawerLayout(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, ta3.C3582a.drawerLayoutStyle);
    }

    /* JADX INFO: finally extract failed */
    public DrawerLayout(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3472a = new C0534d();
        this.f3498o = f3448C;
        this.f3469a = new Paint();
        this.f3489c = true;
        this.f3500q = 3;
        this.f3501r = 3;
        this.f3502s = 3;
        this.f3503t = 3;
        this.f3491d = null;
        this.f3493e = null;
        this.f3495f = null;
        this.f3496g = null;
        this.f3475a = new C0531a();
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f3497n = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        C0539h hVar = new C0539h(3);
        this.f3474a = hVar;
        C0539h hVar2 = new C0539h(5);
        this.f3483b = hVar2;
        mt4 p = mt4.m21949p(this, 1.0f, hVar);
        this.f3476a = p;
        p.mo20643T(1);
        p.mo20644U(f2);
        hVar.mo4136q(p);
        mt4 p2 = mt4.m21949p(this, 1.0f, hVar2);
        this.f3484b = p2;
        p2.mo20643T(2);
        p2.mo20644U(f2);
        hVar2.mo4136q(p2);
        setFocusableInTouchMode(true);
        jt4.m18906R1(this, 1);
        jt4.m18849B1(this, new C0533c());
        setMotionEventSplittingEnabled(false);
        if (jt4.m18913U(this)) {
            setOnApplyWindowInsetsListener(new C0532b());
            setSystemUiVisibility(el1.f27973d);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f3451a);
            try {
                this.f3471a = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, ta3.C3591j.DrawerLayout, i, 0);
        try {
            int i2 = ta3.C3591j.DrawerLayout_elevation;
            this.f3467a = obtainStyledAttributes2.hasValue(i2) ? obtainStyledAttributes2.getDimension(i2, 0.0f) : getResources().getDimension(ta3.C3584c.def_drawer_elevation);
            obtainStyledAttributes2.recycle();
            this.f3479a = new ArrayList<>();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    /* renamed from: B */
    public static boolean m3985B(View view) {
        return (jt4.m18916V(view) == 4 || jt4.m18916V(view) == 2) ? false : true;
    }

    /* renamed from: x */
    public static String m3986x(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* renamed from: y */
    public static boolean m3987y(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    /* renamed from: A */
    public final boolean mo4024A() {
        return mo4087q() != null;
    }

    /* renamed from: C */
    public boolean mo4025C(View view) {
        return ((LayoutParams) view.getLayoutParams()).f3508a == 0;
    }

    /* renamed from: D */
    public boolean mo4026D(int i) {
        View o = mo4073o(i);
        if (o != null) {
            return mo4027E(o);
        }
        return false;
    }

    /* renamed from: E */
    public boolean mo4027E(@mr2 View view) {
        if (mo4028F(view)) {
            return (((LayoutParams) view.getLayoutParams()).f3510b & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: F */
    public boolean mo4028F(View view) {
        int d = ri1.m26762d(((LayoutParams) view.getLayoutParams()).f3508a, jt4.m18928Z(view));
        return ((d & 3) == 0 && (d & 5) == 0) ? false : true;
    }

    /* renamed from: G */
    public boolean mo4029G(int i) {
        View o = mo4073o(i);
        if (o != null) {
            return mo4030H(o);
        }
        return false;
    }

    /* renamed from: H */
    public boolean mo4030H(@mr2 View view) {
        if (mo4028F(view)) {
            return ((LayoutParams) view.getLayoutParams()).f3507a > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* renamed from: I */
    public final boolean mo4031I(float f, float f2, View view) {
        if (this.f3470a == null) {
            this.f3470a = new Rect();
        }
        view.getHitRect(this.f3470a);
        return this.f3470a.contains((int) f, (int) f2);
    }

    /* renamed from: J */
    public final void mo4032J(Drawable drawable, int i) {
        if (drawable != null && wo0.m30979h(drawable)) {
            wo0.m30984m(drawable, i);
        }
    }

    /* renamed from: K */
    public void mo4033K(View view, float f) {
        float v = mo4107v(view);
        float width = (float) view.getWidth();
        int i = ((int) (width * f)) - ((int) (v * width));
        if (!mo4054d(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        mo4042T(view, f);
    }

    /* renamed from: L */
    public void mo4034L(int i) {
        mo4035M(i, true);
    }

    /* renamed from: M */
    public void mo4035M(int i, boolean z) {
        View o = mo4073o(i);
        if (o != null) {
            mo4037O(o, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m3986x(i));
    }

    /* renamed from: N */
    public void mo4036N(@mr2 View view) {
        mo4037O(view, true);
    }

    /* renamed from: O */
    public void mo4037O(@mr2 View view, boolean z) {
        if (mo4028F(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f3489c) {
                layoutParams.f3507a = 1.0f;
                layoutParams.f3510b = 1;
                mo4044V(view, true);
                mo4043U(view);
            } else if (z) {
                layoutParams.f3510b |= 2;
                if (mo4054d(view, 3)) {
                    this.f3476a.mo20647X(view, 0, view.getTop());
                } else {
                    this.f3484b.mo20647X(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                mo4033K(view, 1.0f);
                mo4045W(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: P */
    public void mo4038P(@mr2 C0535e eVar) {
        List<C0535e> list;
        if (eVar != null && (list = this.f3480a) != null) {
            list.remove(eVar);
        }
    }

    /* renamed from: Q */
    public final Drawable mo4039Q() {
        int Z = jt4.m18928Z(this);
        if (Z == 0) {
            Drawable drawable = this.f3491d;
            if (drawable != null) {
                mo4032J(drawable, Z);
                return this.f3491d;
            }
        } else {
            Drawable drawable2 = this.f3493e;
            if (drawable2 != null) {
                mo4032J(drawable2, Z);
                return this.f3493e;
            }
        }
        return this.f3495f;
    }

    /* renamed from: R */
    public final Drawable mo4040R() {
        int Z = jt4.m18928Z(this);
        if (Z == 0) {
            Drawable drawable = this.f3493e;
            if (drawable != null) {
                mo4032J(drawable, Z);
                return this.f3493e;
            }
        } else {
            Drawable drawable2 = this.f3491d;
            if (drawable2 != null) {
                mo4032J(drawable2, Z);
                return this.f3491d;
            }
        }
        return this.f3496g;
    }

    /* renamed from: S */
    public final void mo4041S() {
        if (!f3459i) {
            this.f3482b = mo4039Q();
            this.f3488c = mo4040R();
        }
    }

    /* renamed from: T */
    public void mo4042T(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f != layoutParams.f3507a) {
            layoutParams.f3507a = f;
            mo4071m(view, f);
        }
    }

    /* renamed from: U */
    public final void mo4043U(View view) {
        C1638a2.C1639a aVar = C1638a2.C1639a.f8658u;
        jt4.m19001r1(view, aVar.mo12636b());
        if (mo4027E(view) && mo4091s(view) != 2) {
            jt4.m19013u1(view, aVar, (CharSequence) null, this.f3475a);
        }
    }

    /* renamed from: V */
    public final void mo4044V(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            jt4.m18906R1(childAt, ((z || mo4028F(childAt)) && (!z || childAt != view)) ? 4 : 1);
        }
    }

    /* renamed from: W */
    public void mo4045W(int i, View view) {
        int F = this.f3476a.mo20629F();
        int F2 = this.f3484b.mo20629F();
        int i2 = 2;
        if (F == 1 || F2 == 1) {
            i2 = 1;
        } else if (!(F == 2 || F2 == 2)) {
            i2 = 0;
        }
        if (view != null && i == 0) {
            float f = ((LayoutParams) view.getLayoutParams()).f3507a;
            if (f == 0.0f) {
                mo4069k(view);
            } else if (f == 1.0f) {
                mo4070l(view);
            }
        }
        if (i2 != this.f3499p) {
            this.f3499p = i2;
            List<C0535e> list = this.f3480a;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f3480a.get(size).mo882b(i2);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4046a() {
        mo4034L(ri1.f19869b);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!mo4028F(childAt)) {
                    this.f3479a.add(childAt);
                } else if (mo4027E(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.f3479a.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.f3479a.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f3479a.clear();
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        jt4.m18906R1(view, (mo4086p() != null || mo4028F(view)) ? 4 : 1);
        if (!f3458h) {
            jt4.m18849B1(view, this.f3472a);
        }
    }

    /* renamed from: b */
    public void mo4049b(@mr2 C0535e eVar) {
        if (eVar != null) {
            if (this.f3480a == null) {
                this.f3480a = new ArrayList();
            }
            this.f3480a.add(eVar);
        }
    }

    /* renamed from: c */
    public void mo4050c() {
        if (!this.f3492d) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f3492d = true;
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void close() {
        mo4057e(ri1.f19869b);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((LayoutParams) getChildAt(i).getLayoutParams()).f3507a);
        }
        this.f3481b = f;
        boolean o = this.f3476a.mo20663o(true);
        boolean o2 = this.f3484b.mo20663o(true);
        if (o || o2) {
            jt4.m18985n1(this);
        }
    }

    /* renamed from: d */
    public boolean mo4054d(View view, int i) {
        return (mo4106u(view) & i) == i;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f3481b <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (mo4031I(x, y, childAt) && !mo4025C(childAt) && mo4072n(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        Drawable drawable;
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean C = mo4025C(view2);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (C) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view2 && childAt.getVisibility() == 0 && m3987y(childAt) && mo4028F(childAt) && childAt.getHeight() >= height) {
                    if (mo4054d(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.f3481b;
        if (f <= 0.0f || !C) {
            if (this.f3482b != null && mo4054d(view2, 3)) {
                int intrinsicWidth = this.f3482b.getIntrinsicWidth();
                int right2 = view.getRight();
                float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f3476a.mo20625B()), 1.0f));
                this.f3482b.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.f3482b.setAlpha((int) (max * 255.0f));
                drawable = this.f3482b;
            } else if (this.f3488c != null && mo4054d(view2, 5)) {
                int intrinsicWidth2 = this.f3488c.getIntrinsicWidth();
                int left2 = view.getLeft();
                float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.f3484b.mo20625B()), 1.0f));
                this.f3488c.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.f3488c.setAlpha((int) (max2 * 255.0f));
                drawable = this.f3488c;
            }
            drawable.draw(canvas);
        } else {
            int i4 = this.f3498o;
            this.f3469a.setColor((i4 & jt4.f14542r) | (((int) (((float) ((-16777216 & i4) >>> 24)) * f)) << 24));
            canvas.drawRect((float) i, 0.0f, (float) width, (float) getHeight(), this.f3469a);
        }
        return drawChild;
    }

    /* renamed from: e */
    public void mo4057e(int i) {
        mo4058f(i, true);
    }

    /* renamed from: f */
    public void mo4058f(int i, boolean z) {
        View o = mo4073o(i);
        if (o != null) {
            mo4065h(o, z);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + m3986x(i));
    }

    /* renamed from: g */
    public void mo4059g(@mr2 View view) {
        mo4065h(view, true);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        if (f3459i) {
            return this.f3467a;
        }
        return 0.0f;
    }

    @ts2
    public Drawable getStatusBarBackgroundDrawable() {
        return this.f3471a;
    }

    /* renamed from: h */
    public void mo4065h(@mr2 View view, boolean z) {
        mt4 mt4;
        int i;
        if (mo4028F(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f3489c) {
                layoutParams.f3507a = 0.0f;
                layoutParams.f3510b = 0;
            } else if (z) {
                layoutParams.f3510b |= 4;
                if (mo4054d(view, 3)) {
                    mt4 = this.f3476a;
                    i = -view.getWidth();
                } else {
                    mt4 = this.f3484b;
                    i = getWidth();
                }
                mt4.mo20647X(view, i, view.getTop());
            } else {
                mo4033K(view, 0.0f);
                mo4045W(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* renamed from: i */
    public void mo4066i() {
        mo4068j(false);
    }

    public boolean isOpen() {
        return mo4026D(ri1.f19869b);
    }

    /* renamed from: j */
    public void mo4068j(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (mo4028F(childAt) && (!z || layoutParams.f3509a)) {
                z2 |= mo4054d(childAt, 3) ? this.f3476a.mo20647X(childAt, -childAt.getWidth(), childAt.getTop()) : this.f3484b.mo20647X(childAt, getWidth(), childAt.getTop());
                layoutParams.f3509a = false;
            }
        }
        this.f3474a.mo4135p();
        this.f3483b.mo4135p();
        if (z2) {
            invalidate();
        }
    }

    /* renamed from: k */
    public void mo4069k(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f3510b & 1) == 1) {
            layoutParams.f3510b = 0;
            List<C0535e> list = this.f3480a;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f3480a.get(size).mo884d(view);
                }
            }
            mo4044V(view, false);
            mo4043U(view);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: l */
    public void mo4070l(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.f3510b & 1) == 0) {
            layoutParams.f3510b = 1;
            List<C0535e> list = this.f3480a;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f3480a.get(size).mo883c(view);
                }
            }
            mo4044V(view, true);
            mo4043U(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* renamed from: m */
    public void mo4071m(View view, float f) {
        List<C0535e> list = this.f3480a;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3480a.get(size).mo881a(view, f);
            }
        }
    }

    /* renamed from: n */
    public final boolean mo4072n(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent w = mo4108w(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(w);
            w.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    /* renamed from: o */
    public View mo4073o(int i) {
        int d = ri1.m26762d(i, jt4.m18928Z(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((mo4106u(childAt) & 7) == d) {
                return childAt;
            }
        }
        return null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3489c = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3489c = true;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f3494e && this.f3471a != null) {
            Object obj = this.f3478a;
            int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
            if (systemWindowInsetTop > 0) {
                this.f3471a.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.f3471a.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        r7 = r6.f3476a.mo20668v((int) r0, (int) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != 3) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            com.onedelhi.secure.mt4 r1 = r6.f3476a
            boolean r1 = r1.mo20646W(r7)
            com.onedelhi.secure.mt4 r2 = r6.f3484b
            boolean r2 = r2.mo20646W(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0038
            if (r0 == r2) goto L_0x0031
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L_0x001e
            if (r0 == r4) goto L_0x0031
            goto L_0x0036
        L_0x001e:
            com.onedelhi.secure.mt4 r7 = r6.f3476a
            boolean r7 = r7.mo20654f(r4)
            if (r7 == 0) goto L_0x0036
            androidx.drawerlayout.widget.DrawerLayout$h r7 = r6.f3474a
            r7.mo4135p()
            androidx.drawerlayout.widget.DrawerLayout$h r7 = r6.f3483b
            r7.mo4135p()
            goto L_0x0036
        L_0x0031:
            r6.mo4068j(r2)
            r6.f3492d = r3
        L_0x0036:
            r7 = 0
            goto L_0x0060
        L_0x0038:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f3487c = r0
            r6.f3490d = r7
            float r4 = r6.f3481b
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x005d
            com.onedelhi.secure.mt4 r4 = r6.f3476a
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.mo20668v(r0, r7)
            if (r7 == 0) goto L_0x005d
            boolean r7 = r6.mo4025C(r7)
            if (r7 == 0) goto L_0x005d
            r7 = 1
            goto L_0x005e
        L_0x005d:
            r7 = 0
        L_0x005e:
            r6.f3492d = r3
        L_0x0060:
            if (r1 != 0) goto L_0x0070
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.mo4109z()
            if (r7 != 0) goto L_0x0070
            boolean r7 = r6.f3492d
            if (r7 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = 0
        L_0x0070:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !mo4024A()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View q = mo4087q();
        if (q != null && mo4091s(q) == 0) {
            mo4066i();
        }
        return q != null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        int measuredHeight;
        int i6;
        int i7;
        this.f3486b = true;
        int i8 = i3 - i;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (mo4025C(childAt)) {
                    int i10 = layoutParams.leftMargin;
                    childAt.layout(i10, layoutParams.topMargin, childAt.getMeasuredWidth() + i10, layoutParams.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    if (mo4054d(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.f3507a * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i11 = i8 - ((int) (layoutParams.f3507a * f3));
                        f = ((float) (i8 - i11)) / f3;
                        i5 = i11;
                    }
                    boolean z2 = f != layoutParams.f3507a;
                    int i12 = layoutParams.f3508a & 112;
                    if (i12 != 16) {
                        if (i12 != 80) {
                            measuredHeight = layoutParams.topMargin;
                            i6 = measuredWidth + i5;
                            i7 = measuredHeight2 + measuredHeight;
                        } else {
                            int i13 = i4 - i2;
                            measuredHeight = (i13 - layoutParams.bottomMargin) - childAt.getMeasuredHeight();
                            i6 = measuredWidth + i5;
                            i7 = i13 - layoutParams.bottomMargin;
                        }
                        childAt.layout(i5, measuredHeight, i6, i7);
                    } else {
                        int i14 = i4 - i2;
                        int i15 = (i14 - measuredHeight2) / 2;
                        int i16 = layoutParams.topMargin;
                        if (i15 < i16) {
                            i15 = i16;
                        } else {
                            int i17 = i15 + measuredHeight2;
                            int i18 = layoutParams.bottomMargin;
                            if (i17 > i14 - i18) {
                                i15 = (i14 - i18) - measuredHeight2;
                            }
                        }
                        childAt.layout(i5, i15, measuredWidth + i5, measuredHeight2 + i15);
                    }
                    if (z2) {
                        mo4042T(childAt, f);
                    }
                    int i19 = layoutParams.f3507a > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i19) {
                        childAt.setVisibility(i19);
                    }
                }
            }
        }
        if (f3460j && (rootWindowInsets = getRootWindowInsets()) != null) {
            gr1 n = sx4.m27879K(rootWindowInsets).mo24601n();
            mt4 mt4 = this.f3476a;
            mt4.mo20642S(Math.max(mt4.mo20624A(), n.f12722a));
            mt4 mt42 = this.f3484b;
            mt42.mo20642S(Math.max(mt42.mo20624A(), n.f12724c));
        }
        this.f3486b = false;
        this.f3489c = false;
    }

    @SuppressLint({"WrongConstant"})
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == 1073741824 && mode2 == 1073741824)) {
            if (isInEditMode()) {
                if (mode == 0) {
                    size = 300;
                }
                if (mode2 == 0) {
                    size2 = 300;
                }
            } else {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.f3478a != null && jt4.m18913U(this);
        int Z = jt4.m18928Z(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z) {
                    int d = ri1.m26762d(layoutParams.f3508a, Z);
                    boolean U = jt4.m18913U(childAt);
                    WindowInsets windowInsets = (WindowInsets) this.f3478a;
                    if (U) {
                        if (d == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                        } else if (d == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsets);
                    } else {
                        if (d == 3) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                        } else if (d == 5) {
                            windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                        }
                        layoutParams.leftMargin = windowInsets.getSystemWindowInsetLeft();
                        layoutParams.topMargin = windowInsets.getSystemWindowInsetTop();
                        layoutParams.rightMargin = windowInsets.getSystemWindowInsetRight();
                        layoutParams.bottomMargin = windowInsets.getSystemWindowInsetBottom();
                    }
                }
                if (mo4025C(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - layoutParams.leftMargin) - layoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - layoutParams.topMargin) - layoutParams.bottomMargin, 1073741824));
                } else if (mo4028F(childAt)) {
                    if (f3459i) {
                        float R = jt4.m18904R(childAt);
                        float f = this.f3467a;
                        if (R != f) {
                            jt4.m18894N1(childAt, f);
                        }
                    }
                    int u = mo4106u(childAt) & 7;
                    boolean z4 = u == 3;
                    if ((!z4 || !z2) && (z4 || !z3)) {
                        if (z4) {
                            z2 = true;
                        } else {
                            z3 = true;
                        }
                        childAt.measure(ViewGroup.getChildMeasureSpec(i, this.f3497n + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), ViewGroup.getChildMeasureSpec(i2, layoutParams.topMargin + layoutParams.bottomMargin, layoutParams.height));
                        i4++;
                        i3 = 0;
                    } else {
                        throw new IllegalStateException("Child drawer has absolute gravity " + m3986x(u) + " but this " + f3452b + " already has a drawer view along that edge");
                    }
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            int i5 = i;
            int i6 = i2;
            i4++;
            i3 = 0;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        View o;
        if (!(parcelable instanceof C0536f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0536f fVar = (C0536f) parcelable;
        super.onRestoreInstanceState(fVar.mo14959a());
        int i = fVar.f3515n;
        if (!(i == 0 || (o = mo4073o(i)) == null)) {
            mo4036N(o);
        }
        int i2 = fVar.f3516o;
        if (i2 != 3) {
            setDrawerLockMode(i2, 3);
        }
        int i3 = fVar.f3517p;
        if (i3 != 3) {
            setDrawerLockMode(i3, 5);
        }
        int i4 = fVar.f3518q;
        if (i4 != 3) {
            setDrawerLockMode(i4, (int) ri1.f19869b);
        }
        int i5 = fVar.f3519r;
        if (i5 != 3) {
            setDrawerLockMode(i5, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        mo4041S();
    }

    public Parcelable onSaveInstanceState() {
        C0536f fVar = new C0536f(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int i2 = layoutParams.f3510b;
            boolean z = true;
            boolean z2 = i2 == 1;
            if (i2 != 2) {
                z = false;
            }
            if (z2 || z) {
                fVar.f3515n = layoutParams.f3508a;
            } else {
                i++;
            }
        }
        fVar.f3516o = this.f3500q;
        fVar.f3517p = this.f3501r;
        fVar.f3518q = this.f3502s;
        fVar.f3519r = this.f3503t;
        return fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        if (mo4091s(r7) != 2) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            com.onedelhi.secure.mt4 r0 = r6.f3476a
            r0.mo20636M(r7)
            com.onedelhi.secure.mt4 r0 = r6.f3484b
            r0.mo20636M(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0060
            if (r0 == r2) goto L_0x001e
            r7 = 3
            if (r0 == r7) goto L_0x001a
            goto L_0x006e
        L_0x001a:
            r6.mo4068j(r2)
            goto L_0x006c
        L_0x001e:
            float r0 = r7.getX()
            float r7 = r7.getY()
            com.onedelhi.secure.mt4 r3 = r6.f3476a
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.mo20668v(r4, r5)
            if (r3 == 0) goto L_0x005b
            boolean r3 = r6.mo4025C(r3)
            if (r3 == 0) goto L_0x005b
            float r3 = r6.f3487c
            float r0 = r0 - r3
            float r3 = r6.f3490d
            float r7 = r7 - r3
            com.onedelhi.secure.mt4 r3 = r6.f3476a
            int r3 = r3.mo20628E()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L_0x005b
            android.view.View r7 = r6.mo4086p()
            if (r7 == 0) goto L_0x005b
            int r7 = r6.mo4091s(r7)
            r0 = 2
            if (r7 != r0) goto L_0x005c
        L_0x005b:
            r1 = 1
        L_0x005c:
            r6.mo4068j(r1)
            goto L_0x006e
        L_0x0060:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f3487c = r0
            r6.f3490d = r7
        L_0x006c:
            r6.f3492d = r1
        L_0x006e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public View mo4086p() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).f3510b & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: q */
    public View mo4087q() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (mo4028F(childAt) && mo4030H(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: r */
    public int mo4088r(int i) {
        int Z = jt4.m18928Z(this);
        if (i == 3) {
            int i2 = this.f3500q;
            if (i2 != 3) {
                return i2;
            }
            int i3 = Z == 0 ? this.f3502s : this.f3503t;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i == 5) {
            int i4 = this.f3501r;
            if (i4 != 3) {
                return i4;
            }
            int i5 = Z == 0 ? this.f3503t : this.f3502s;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        } else if (i == 8388611) {
            int i6 = this.f3502s;
            if (i6 != 3) {
                return i6;
            }
            int i7 = Z == 0 ? this.f3500q : this.f3501r;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i8 = this.f3503t;
            if (i8 != 3) {
                return i8;
            }
            int i9 = Z == 0 ? this.f3501r : this.f3500q;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            mo4068j(true);
        }
    }

    public void requestLayout() {
        if (!this.f3486b) {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public int mo4091s(@mr2 View view) {
        if (mo4028F(view)) {
            return mo4088r(((LayoutParams) view.getLayoutParams()).f3508a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @hl3({hl3.C2354a.f13188c})
    public void setChildInsets(Object obj, boolean z) {
        this.f3478a = obj;
        this.f3494e = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.f3467a = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (mo4028F(childAt)) {
                jt4.m18894N1(childAt, this.f3467a);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(C0535e eVar) {
        C0535e eVar2 = this.f3473a;
        if (eVar2 != null) {
            mo4038P(eVar2);
        }
        if (eVar != null) {
            mo4049b(eVar);
        }
        this.f3473a = eVar;
    }

    public void setDrawerLockMode(int i) {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }

    public void setDrawerLockMode(int i, int i2) {
        View o;
        int d = ri1.m26762d(i2, jt4.m18928Z(this));
        if (i2 == 3) {
            this.f3500q = i;
        } else if (i2 == 5) {
            this.f3501r = i;
        } else if (i2 == 8388611) {
            this.f3502s = i;
        } else if (i2 == 8388613) {
            this.f3503t = i;
        }
        if (i != 0) {
            (d == 3 ? this.f3476a : this.f3484b).mo20651c();
        }
        if (i == 1) {
            View o2 = mo4073o(d);
            if (o2 != null) {
                mo4059g(o2);
            }
        } else if (i == 2 && (o = mo4073o(d)) != null) {
            mo4036N(o);
        }
    }

    public void setDrawerLockMode(int i, @mr2 View view) {
        if (mo4028F(view)) {
            setDrawerLockMode(i, ((LayoutParams) view.getLayoutParams()).f3508a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    public void setDrawerShadow(@dp0 int i, int i2) {
        setDrawerShadow(r70.m26356i(getContext(), i), i2);
    }

    public void setDrawerShadow(Drawable drawable, int i) {
        if (!f3459i) {
            if ((i & ri1.f19869b) == 8388611) {
                this.f3491d = drawable;
            } else if ((i & 8388613) == 8388613) {
                this.f3493e = drawable;
            } else if ((i & 3) == 3) {
                this.f3495f = drawable;
            } else if ((i & 5) == 5) {
                this.f3496g = drawable;
            } else {
                return;
            }
            mo4041S();
            invalidate();
        }
    }

    public void setDrawerTitle(int i, @ts2 CharSequence charSequence) {
        int d = ri1.m26762d(i, jt4.m18928Z(this));
        if (d == 3) {
            this.f3477a = charSequence;
        } else if (d == 5) {
            this.f3485b = charSequence;
        }
    }

    public void setScrimColor(@d10 int i) {
        this.f3498o = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f3471a = i != 0 ? r70.m26356i(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackground(@ts2 Drawable drawable) {
        this.f3471a = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@d10 int i) {
        this.f3471a = new ColorDrawable(i);
        invalidate();
    }

    @ts2
    /* renamed from: t */
    public CharSequence mo4105t(int i) {
        int d = ri1.m26762d(i, jt4.m18928Z(this));
        if (d == 3) {
            return this.f3477a;
        }
        if (d == 5) {
            return this.f3485b;
        }
        return null;
    }

    /* renamed from: u */
    public int mo4106u(View view) {
        return ri1.m26762d(((LayoutParams) view.getLayoutParams()).f3508a, jt4.m18928Z(this));
    }

    /* renamed from: v */
    public float mo4107v(View view) {
        return ((LayoutParams) view.getLayoutParams()).f3507a;
    }

    /* renamed from: w */
    public final MotionEvent mo4108w(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f3468a == null) {
                this.f3468a = new Matrix();
            }
            matrix.invert(this.f3468a);
            obtain.transform(this.f3468a);
        }
        return obtain;
    }

    /* renamed from: z */
    public final boolean mo4109z() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).f3509a) {
                return true;
            }
        }
        return false;
    }
}
