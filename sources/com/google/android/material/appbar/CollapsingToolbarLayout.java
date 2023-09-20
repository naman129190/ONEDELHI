package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.onedelhi.secure.C1947d7;
import com.onedelhi.secure.bk0;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.d81;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.js0;
import com.onedelhi.secure.js1;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.ju2;
import com.onedelhi.secure.ju4;
import com.onedelhi.secure.m00;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.o34;
import com.onedelhi.secure.ot2;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.rf2;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.sx4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wo0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CollapsingToolbarLayout extends FrameLayout {

    /* renamed from: A */
    public static final int f7664A = 0;

    /* renamed from: B */
    public static final int f7665B = 1;

    /* renamed from: y */
    public static final int f7666y = fd3.C2164n.Widget_Design_CollapsingToolbar;

    /* renamed from: z */
    public static final int f7667z = 600;

    /* renamed from: a */
    public ValueAnimator f7668a;

    /* renamed from: a */
    public final Rect f7669a;
    @ts2

    /* renamed from: a */
    public Drawable f7670a;
    @ts2

    /* renamed from: a */
    public View f7671a;
    @ts2

    /* renamed from: a */
    public ViewGroup f7672a;

    /* renamed from: a */
    public AppBarLayout.C1463g f7673a;
    @mr2

    /* renamed from: a */
    public final js0 f7674a;
    @mr2

    /* renamed from: a */
    public final m00 f7675a;
    @ts2

    /* renamed from: a */
    public sx4 f7676a;

    /* renamed from: b */
    public long f7677b;
    @ts2

    /* renamed from: b */
    public Drawable f7678b;

    /* renamed from: b */
    public View f7679b;

    /* renamed from: b */
    public boolean f7680b;

    /* renamed from: c */
    public boolean f7681c;

    /* renamed from: d */
    public boolean f7682d;

    /* renamed from: e */
    public boolean f7683e;

    /* renamed from: f */
    public boolean f7684f;

    /* renamed from: g */
    public boolean f7685g;

    /* renamed from: n */
    public int f7686n;

    /* renamed from: o */
    public int f7687o;

    /* renamed from: p */
    public int f7688p;

    /* renamed from: q */
    public int f7689q;

    /* renamed from: r */
    public int f7690r;

    /* renamed from: s */
    public int f7691s;

    /* renamed from: t */
    public int f7692t;

    /* renamed from: u */
    public int f7693u;

    /* renamed from: v */
    public int f7694v;

    /* renamed from: w */
    public int f7695w;

    /* renamed from: x */
    public int f7696x;

    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* renamed from: b */
        public static final float f7697b = 0.5f;

        /* renamed from: b */
        public static final int f7698b = 0;

        /* renamed from: c */
        public static final int f7699c = 1;

        /* renamed from: d */
        public static final int f7700d = 2;

        /* renamed from: a */
        public float f7701a = 0.5f;

        /* renamed from: a */
        public int f7702a = 0;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fd3.C2165o.CollapsingToolbarLayout_Layout);
            this.f7702a = obtainStyledAttributes.getInt(fd3.C2165o.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            mo11053d(obtainStyledAttributes.getFloat(fd3.C2165o.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(@mr2 ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(@mr2 ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        @sj3(19)
        public LayoutParams(@mr2 FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        @sj3(19)
        public LayoutParams(@mr2 LayoutParams layoutParams) {
            super(layoutParams);
            this.f7702a = layoutParams.f7702a;
            this.f7701a = layoutParams.f7701a;
        }

        /* renamed from: a */
        public int mo11050a() {
            return this.f7702a;
        }

        /* renamed from: b */
        public float mo11051b() {
            return this.f7701a;
        }

        /* renamed from: c */
        public void mo11052c(int i) {
            this.f7702a = i;
        }

        /* renamed from: d */
        public void mo11053d(float f) {
            this.f7701a = f;
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$a */
    public class C1464a implements ju2 {
        public C1464a() {
        }

        /* renamed from: a */
        public sx4 mo1063a(View view, @mr2 sx4 sx4) {
            return CollapsingToolbarLayout.this.mo11001s(sx4);
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$b */
    public class C1465b implements ValueAnimator.AnimatorUpdateListener {
        public C1465b() {
        }

        public void onAnimationUpdate(@mr2 ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$c */
    public class C1466c implements AppBarLayout.C1463g {
        public C1466c() {
        }

        /* renamed from: a */
        public void mo10948a(AppBarLayout appBarLayout, int i) {
            int i2;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f7693u = i;
            sx4 sx4 = collapsingToolbarLayout.f7676a;
            int r = sx4 != null ? sx4.mo24605r() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                ju4 k = CollapsingToolbarLayout.m9345k(childAt);
                int i4 = layoutParams.f7702a;
                if (i4 == 1) {
                    i2 = rf2.m26699e(-i, 0, CollapsingToolbarLayout.this.mo10988i(childAt));
                } else if (i4 != 2) {
                } else {
                    i2 = Math.round(((float) (-i)) * layoutParams.f7701a);
                }
                k.mo18677k(i2);
            }
            CollapsingToolbarLayout.this.mo11048y();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f7678b != null && r > 0) {
                jt4.m18985n1(collapsingToolbarLayout2);
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            int e0 = (height - jt4.m18948e0(CollapsingToolbarLayout.this)) - r;
            float f = (float) e0;
            CollapsingToolbarLayout.this.f7675a.mo40314B0(Math.min(1.0f, ((float) (height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger())) / f));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.f7675a.mo40378o0(collapsingToolbarLayout3.f7693u + e0);
            CollapsingToolbarLayout.this.f7675a.mo40400z0(((float) Math.abs(i)) / f);
        }
    }

    @sj3(23)
    @hl3({hl3.C2354a.f13187b})
    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$d */
    public interface C1467d extends o34 {
    }

    @hl3({hl3.C2354a.f13187b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$e */
    public @interface C1468e {
    }

    public CollapsingToolbarLayout(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public CollapsingToolbarLayout(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.collapsingToolbarLayoutStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CollapsingToolbarLayout(@com.onedelhi.secure.mr2 android.content.Context r11, @com.onedelhi.secure.ts2 android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r4 = f7666y
            android.content.Context r11 = com.onedelhi.secure.hf2.m50488c(r11, r12, r13, r4)
            r10.<init>(r11, r12, r13)
            r11 = 1
            r10.f7680b = r11
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.f7669a = r0
            r6 = -1
            r10.f7692t = r6
            r7 = 0
            r10.f7695w = r7
            r10.f7696x = r7
            android.content.Context r8 = r10.getContext()
            com.onedelhi.secure.m00 r9 = new com.onedelhi.secure.m00
            r9.<init>(r10)
            r10.f7675a = r9
            android.animation.TimeInterpolator r0 = com.onedelhi.secure.C1947d7.f10653e
            r9.mo40336M0(r0)
            r9.mo40328I0(r7)
            com.onedelhi.secure.js0 r0 = new com.onedelhi.secure.js0
            r0.<init>(r8)
            r10.f7674a = r0
            int[] r2 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout
            int[] r5 = new int[r7]
            r0 = r8
            r1 = r12
            r3 = r13
            android.content.res.TypedArray r12 = com.onedelhi.secure.ob4.m59195k(r0, r1, r2, r3, r4, r5)
            int r13 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout_expandedTitleGravity
            r0 = 8388691(0x800053, float:1.175506E-38)
            int r13 = r12.getInt(r13, r0)
            r9.mo40392v0(r13)
            int r13 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout_collapsedTitleGravity
            r0 = 8388627(0x800013, float:1.175497E-38)
            int r13 = r12.getInt(r13, r0)
            r9.mo40370k0(r13)
            int r13 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout_expandedTitleMargin
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f7690r = r13
            r10.f7689q = r13
            r10.f7688p = r13
            r10.f7687o = r13
            int r13 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout_expandedTitleMarginStart
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0074
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f7687o = r13
        L_0x0074:
            int r13 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout_expandedTitleMarginEnd
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0082
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f7689q = r13
        L_0x0082:
            int r13 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout_expandedTitleMarginTop
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0090
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f7688p = r13
        L_0x0090:
            int r13 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout_expandedTitleMarginBottom
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x009e
            int r13 = r12.getDimensionPixelSize(r13, r7)
            r10.f7690r = r13
        L_0x009e:
            int r13 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout_titleEnabled
            boolean r13 = r12.getBoolean(r13, r11)
            r10.f7681c = r13
            int r13 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout_title
            java.lang.CharSequence r13 = r12.getText(r13)
            r10.setTitle(r13)
            int r13 = com.onedelhi.secure.fd3.C2164n.TextAppearance_Design_CollapsingToolbar_Expanded
            r9.mo40386s0(r13)
            int r13 = com.onedelhi.secure.za3.C4067l.TextAppearance_AppCompat_Widget_ActionBar_Title
            r9.mo40364h0(r13)
            int r13 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout_expandedTitleTextAppearance
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00c8
            int r13 = r12.getResourceId(r13, r7)
            r9.mo40386s0(r13)
        L_0x00c8:
            int r13 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout_collapsedTitleTextAppearance
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00d7
            int r13 = r12.getResourceId(r13, r7)
            r9.mo40364h0(r13)
        L_0x00d7:
            int r13 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout_titleTextEllipsize
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00ea
            int r13 = r12.getInt(r13, r6)
            android.text.TextUtils$TruncateAt r13 = r10.mo10953b(r13)
            r10.setTitleEllipsize(r13)
        L_0x00ea:
            int r13 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout_expandedTitleTextColor
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x00f9
            android.content.res.ColorStateList r13 = com.onedelhi.secure.af2.m38610a(r8, r12, r13)
            r9.mo40390u0(r13)
        L_0x00f9:
            int r13 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout_collapsedTitleTextColor
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x0108
            android.content.res.ColorStateList r13 = com.onedelhi.secure.af2.m38610a(r8, r12, r13)
            r9.mo40368j0(r13)
        L_0x0108:
            int r13 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout_scrimVisibleHeightTrigger
            int r13 = r12.getDimensionPixelSize(r13, r6)
            r10.f7692t = r13
            int r13 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout_maxLines
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L_0x011f
            int r11 = r12.getInt(r13, r11)
            r9.mo40324G0(r11)
        L_0x011f:
            int r11 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout_titlePositionInterpolator
            boolean r13 = r12.hasValue(r11)
            if (r13 == 0) goto L_0x0132
            int r11 = r12.getResourceId(r11, r7)
            android.view.animation.Interpolator r11 = android.view.animation.AnimationUtils.loadInterpolator(r8, r11)
            r9.mo40326H0(r11)
        L_0x0132:
            int r11 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout_scrimAnimationDuration
            r13 = 600(0x258, float:8.41E-43)
            int r11 = r12.getInt(r11, r13)
            long r0 = (long) r11
            r10.f7677b = r0
            int r11 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout_contentScrim
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setContentScrim(r11)
            int r11 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout_statusBarScrim
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setStatusBarScrim(r11)
            int r11 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout_titleCollapseMode
            int r11 = r12.getInt(r11, r7)
            r10.setTitleCollapseMode(r11)
            int r11 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout_toolbarId
            int r11 = r12.getResourceId(r11, r6)
            r10.f7686n = r11
            int r11 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout_forceApplySystemWindowInsetTop
            boolean r11 = r12.getBoolean(r11, r7)
            r10.f7684f = r11
            int r11 = com.onedelhi.secure.fd3.C2165o.CollapsingToolbarLayout_extraMultilineHeightEnabled
            boolean r11 = r12.getBoolean(r11, r7)
            r10.f7685g = r11
            r12.recycle()
            r10.setWillNotDraw(r7)
            com.google.android.material.appbar.CollapsingToolbarLayout$a r11 = new com.google.android.material.appbar.CollapsingToolbarLayout$a
            r11.<init>()
            com.onedelhi.secure.jt4.m18934a2(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: h */
    public static int m9343h(@mr2 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: j */
    public static CharSequence m9344j(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    @mr2
    /* renamed from: k */
    public static ju4 m9345k(@mr2 View view) {
        int i = fd3.C2158h.view_offset_helper;
        ju4 ju4 = (ju4) view.getTag(i);
        if (ju4 != null) {
            return ju4;
        }
        ju4 ju42 = new ju4(view);
        view.setTag(i, ju42);
        return ju42;
    }

    /* renamed from: q */
    public static boolean m9346q(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    /* renamed from: A */
    public final void mo10951A() {
        if (this.f7672a != null && this.f7681c && TextUtils.isEmpty(this.f7675a.mo40341P())) {
            setTitle(m9344j(this.f7672a));
        }
    }

    /* renamed from: a */
    public final void mo10952a(int i) {
        mo10956d();
        ValueAnimator valueAnimator = this.f7668a;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f7668a = valueAnimator2;
            valueAnimator2.setInterpolator(i > this.f7691s ? C1947d7.f10651c : C1947d7.f10652d);
            this.f7668a.addUpdateListener(new C1465b());
        } else if (valueAnimator.isRunning()) {
            this.f7668a.cancel();
        }
        this.f7668a.setDuration(this.f7677b);
        this.f7668a.setIntValues(new int[]{this.f7691s, i});
        this.f7668a.start();
    }

    /* renamed from: b */
    public final TextUtils.TruncateAt mo10953b(int i) {
        return i != 0 ? i != 1 ? i != 3 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE : TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.START;
    }

    /* renamed from: c */
    public final void mo10954c(AppBarLayout appBarLayout) {
        if (mo10992o()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.view.ViewGroup} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10956d() {
        /*
            r6 = this;
            boolean r0 = r6.f7680b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r6.f7672a = r0
            r6.f7671a = r0
            int r1 = r6.f7686n
            r2 = -1
            if (r1 == r2) goto L_0x001f
            android.view.View r1 = r6.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r6.f7672a = r1
            if (r1 == 0) goto L_0x001f
            android.view.View r1 = r6.mo10960e(r1)
            r6.f7671a = r1
        L_0x001f:
            android.view.ViewGroup r1 = r6.f7672a
            r2 = 0
            if (r1 != 0) goto L_0x003e
            int r1 = r6.getChildCount()
            r3 = 0
        L_0x0029:
            if (r3 >= r1) goto L_0x003c
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = m9346q(r4)
            if (r5 == 0) goto L_0x0039
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x003c
        L_0x0039:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x003c:
            r6.f7672a = r0
        L_0x003e:
            r6.mo11047x()
            r6.f7680b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.mo10956d():void");
    }

    public void draw(@mr2 Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        mo10956d();
        if (this.f7672a == null && (drawable = this.f7670a) != null && this.f7691s > 0) {
            drawable.mutate().setAlpha(this.f7691s);
            this.f7670a.draw(canvas);
        }
        if (this.f7681c && this.f7682d) {
            if (this.f7672a == null || this.f7670a == null || this.f7691s <= 0 || !mo10992o() || this.f7675a.mo40323G() >= this.f7675a.mo40325H()) {
                this.f7675a.mo40371l(canvas);
            } else {
                int save = canvas.save();
                canvas.clipRect(this.f7670a.getBounds(), Region.Op.DIFFERENCE);
                this.f7675a.mo40371l(canvas);
                canvas.restoreToCount(save);
            }
        }
        if (this.f7678b != null && this.f7691s > 0) {
            sx4 sx4 = this.f7676a;
            int r = sx4 != null ? sx4.mo24605r() : 0;
            if (r > 0) {
                this.f7678b.setBounds(0, -this.f7693u, getWidth(), r - this.f7693u);
                this.f7678b.mutate().setAlpha(this.f7691s);
                this.f7678b.draw(canvas);
            }
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.f7670a == null || this.f7691s <= 0 || !mo11000r(view)) {
            z = false;
        } else {
            mo11046w(this.f7670a, view, getWidth(), getHeight());
            this.f7670a.mutate().setAlpha(this.f7691s);
            this.f7670a.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f7678b;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f7670a;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        m00 m00 = this.f7675a;
        if (m00 != null) {
            z |= m00.mo40330J0(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @mr2
    /* renamed from: e */
    public final View mo10960e(@mr2 View view) {
        ViewParent parent = view.getParent();
        while (parent != this && parent != null) {
            if (parent instanceof View) {
                view = (View) parent;
            }
            parent = parent.getParent();
        }
        return view;
    }

    /* renamed from: f */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* renamed from: g */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getCollapsedTitleGravity() {
        return this.f7675a.mo40381q();
    }

    @mr2
    public Typeface getCollapsedTitleTypeface() {
        return this.f7675a.mo40391v();
    }

    @ts2
    public Drawable getContentScrim() {
        return this.f7670a;
    }

    public int getExpandedTitleGravity() {
        return this.f7675a.mo40315C();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f7690r;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f7689q;
    }

    public int getExpandedTitleMarginStart() {
        return this.f7687o;
    }

    public int getExpandedTitleMarginTop() {
        return this.f7688p;
    }

    @mr2
    public Typeface getExpandedTitleTypeface() {
        return this.f7675a.mo40321F();
    }

    @sj3(23)
    @hl3({hl3.C2354a.f13187b})
    public int getHyphenationFrequency() {
        return this.f7675a.mo40327I();
    }

    @hl3({hl3.C2354a.f13187b})
    public int getLineCount() {
        return this.f7675a.mo40329J();
    }

    @sj3(23)
    @hl3({hl3.C2354a.f13187b})
    public float getLineSpacingAdd() {
        return this.f7675a.mo40331K();
    }

    @sj3(23)
    @hl3({hl3.C2354a.f13187b})
    public float getLineSpacingMultiplier() {
        return this.f7675a.mo40333L();
    }

    @hl3({hl3.C2354a.f13187b})
    public int getMaxLines() {
        return this.f7675a.mo40335M();
    }

    public int getScrimAlpha() {
        return this.f7691s;
    }

    public long getScrimAnimationDuration() {
        return this.f7677b;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.f7692t;
        if (i >= 0) {
            return i + this.f7695w + this.f7696x;
        }
        sx4 sx4 = this.f7676a;
        int r = sx4 != null ? sx4.mo24605r() : 0;
        int e0 = jt4.m18948e0(this);
        return e0 > 0 ? Math.min((e0 * 2) + r, getHeight()) : getHeight() / 3;
    }

    @ts2
    public Drawable getStatusBarScrim() {
        return this.f7678b;
    }

    @ts2
    public CharSequence getTitle() {
        if (this.f7681c) {
            return this.f7675a.mo40341P();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f7694v;
    }

    @ts2
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f7675a.mo40339O();
    }

    @mr2
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f7675a.mo40345S();
    }

    /* renamed from: i */
    public final int mo10988i(@mr2 View view) {
        return ((getHeight() - m9345k(view).mo18669c()) - view.getHeight()) - ((LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    @hl3({hl3.C2354a.f13187b})
    /* renamed from: l */
    public boolean mo10989l() {
        return this.f7685g;
    }

    @hl3({hl3.C2354a.f13187b})
    /* renamed from: m */
    public boolean mo10990m() {
        return this.f7684f;
    }

    @hl3({hl3.C2354a.f13187b})
    /* renamed from: n */
    public boolean mo10991n() {
        return this.f7675a.mo40348W();
    }

    /* renamed from: o */
    public final boolean mo10992o() {
        return this.f7694v == 1;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            mo10954c(appBarLayout);
            jt4.m18897O1(this, jt4.m18913U(appBarLayout));
            if (this.f7673a == null) {
                this.f7673a = new C1466c();
            }
            appBarLayout.mo10825e(this.f7673a);
            jt4.m19017v1(this);
        }
    }

    public void onConfigurationChanged(@mr2 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f7675a.mo40351a0(configuration);
    }

    public void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.C1463g gVar = this.f7673a;
        if (gVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).mo10873v(gVar);
        }
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        sx4 sx4 = this.f7676a;
        if (sx4 != null) {
            int r = sx4.mo24605r();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!jt4.m18913U(childAt) && childAt.getTop() < r) {
                    jt4.m18953f1(childAt, r);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            m9345k(getChildAt(i6)).mo18674h();
        }
        mo11049z(i, i2, i3, i4, false);
        mo10951A();
        mo11048y();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            m9345k(getChildAt(i7)).mo18667a();
        }
    }

    public void onMeasure(int i, int i2) {
        mo10956d();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        sx4 sx4 = this.f7676a;
        int r = sx4 != null ? sx4.mo24605r() : 0;
        if ((mode == 0 || this.f7684f) && r > 0) {
            this.f7695w = r;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + r, 1073741824));
        }
        if (this.f7685g && this.f7675a.mo40335M() > 1) {
            mo10951A();
            mo11049z(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int z = this.f7675a.mo40399z();
            if (z > 1) {
                this.f7696x = Math.round(this.f7675a.mo40313B()) * (z - 1);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f7696x, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f7672a;
        if (viewGroup != null) {
            View view = this.f7671a;
            setMinimumHeight((view == null || view == this) ? m9343h(viewGroup) : m9343h(view));
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.f7670a;
        if (drawable != null) {
            mo11044v(drawable, i, i2);
        }
    }

    /* renamed from: p */
    public boolean mo10999p() {
        return this.f7681c;
    }

    /* renamed from: r */
    public final boolean mo11000r(View view) {
        View view2 = this.f7671a;
        if (view2 == null || view2 == this) {
            if (view == this.f7672a) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public sx4 mo11001s(@mr2 sx4 sx4) {
        sx4 sx42 = jt4.m18913U(this) ? sx4 : null;
        if (!ot2.m24056a(this.f7676a, sx42)) {
            this.f7676a = sx42;
            requestLayout();
        }
        return sx4.mo24588c();
    }

    public void setCollapsedTitleGravity(int i) {
        this.f7675a.mo40370k0(i);
    }

    public void setCollapsedTitleTextAppearance(@e64 int i) {
        this.f7675a.mo40364h0(i);
    }

    public void setCollapsedTitleTextColor(@d10 int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextColor(@mr2 ColorStateList colorStateList) {
        this.f7675a.mo40368j0(colorStateList);
    }

    public void setCollapsedTitleTypeface(@ts2 Typeface typeface) {
        this.f7675a.mo40374m0(typeface);
    }

    public void setContentScrim(@ts2 Drawable drawable) {
        Drawable drawable2 = this.f7670a;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f7670a = drawable3;
            if (drawable3 != null) {
                mo11044v(drawable3, getWidth(), getHeight());
                this.f7670a.setCallback(this);
                this.f7670a.setAlpha(this.f7691s);
            }
            jt4.m18985n1(this);
        }
    }

    public void setContentScrimColor(@d10 int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(@dp0 int i) {
        setContentScrim(r70.m26356i(getContext(), i));
    }

    public void setExpandedTitleColor(@d10 int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.f7675a.mo40392v0(i);
    }

    public void setExpandedTitleMargin(int i, int i2, int i3, int i4) {
        this.f7687o = i;
        this.f7688p = i2;
        this.f7689q = i3;
        this.f7690r = i4;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.f7690r = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.f7689q = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f7687o = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.f7688p = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@e64 int i) {
        this.f7675a.mo40386s0(i);
    }

    public void setExpandedTitleTextColor(@mr2 ColorStateList colorStateList) {
        this.f7675a.mo40390u0(colorStateList);
    }

    public void setExpandedTitleTypeface(@ts2 Typeface typeface) {
        this.f7675a.mo40396x0(typeface);
    }

    @hl3({hl3.C2354a.f13187b})
    public void setExtraMultilineHeightEnabled(boolean z) {
        this.f7685g = z;
    }

    @hl3({hl3.C2354a.f13187b})
    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.f7684f = z;
    }

    @sj3(23)
    @hl3({hl3.C2354a.f13187b})
    public void setHyphenationFrequency(int i) {
        this.f7675a.mo40316C0(i);
    }

    @sj3(23)
    @hl3({hl3.C2354a.f13187b})
    public void setLineSpacingAdd(float f) {
        this.f7675a.mo40320E0(f);
    }

    @sj3(23)
    @hl3({hl3.C2354a.f13187b})
    public void setLineSpacingMultiplier(@d81(from = 0.0d) float f) {
        this.f7675a.mo40322F0(f);
    }

    @hl3({hl3.C2354a.f13187b})
    public void setMaxLines(int i) {
        this.f7675a.mo40324G0(i);
    }

    @hl3({hl3.C2354a.f13187b})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.f7675a.mo40328I0(z);
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.f7691s) {
            if (!(this.f7670a == null || (viewGroup = this.f7672a) == null)) {
                jt4.m18985n1(viewGroup);
            }
            this.f7691s = i;
            jt4.m18985n1(this);
        }
    }

    public void setScrimAnimationDuration(@js1(from = 0) long j) {
        this.f7677b = j;
    }

    public void setScrimVisibleHeightTrigger(@js1(from = 0) int i) {
        if (this.f7692t != i) {
            this.f7692t = i;
            mo11048y();
        }
    }

    public void setScrimsShown(boolean z) {
        setScrimsShown(z, jt4.m18914U0(this) && !isInEditMode());
    }

    public void setScrimsShown(boolean z, boolean z2) {
        if (this.f7683e != z) {
            int i = 255;
            if (z2) {
                if (!z) {
                    i = 0;
                }
                mo10952a(i);
            } else {
                if (!z) {
                    i = 0;
                }
                setScrimAlpha(i);
            }
            this.f7683e = z;
        }
    }

    @sj3(23)
    @hl3({hl3.C2354a.f13187b})
    public void setStaticLayoutBuilderConfigurer(@ts2 C1467d dVar) {
        this.f7675a.mo40332K0(dVar);
    }

    public void setStatusBarScrim(@ts2 Drawable drawable) {
        Drawable drawable2 = this.f7678b;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f7678b = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f7678b.setState(getDrawableState());
                }
                wo0.m30984m(this.f7678b, jt4.m18928Z(this));
                this.f7678b.setVisible(getVisibility() == 0, false);
                this.f7678b.setCallback(this);
                this.f7678b.setAlpha(this.f7691s);
            }
            jt4.m18985n1(this);
        }
    }

    public void setStatusBarScrimColor(@d10 int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(@dp0 int i) {
        setStatusBarScrim(r70.m26356i(getContext(), i));
    }

    public void setTitle(@ts2 CharSequence charSequence) {
        this.f7675a.mo40334L0(charSequence);
        mo11043u();
    }

    public void setTitleCollapseMode(int i) {
        this.f7694v = i;
        boolean o = mo10992o();
        this.f7675a.mo40312A0(o);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            mo10954c((AppBarLayout) parent);
        }
        if (o && this.f7670a == null) {
            setContentScrimColor(this.f7674a.mo18572g(getResources().getDimension(fd3.C2156f.design_appbar_elevation)));
        }
    }

    public void setTitleEllipsize(@mr2 TextUtils.TruncateAt truncateAt) {
        this.f7675a.mo40338N0(truncateAt);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.f7681c) {
            this.f7681c = z;
            mo11043u();
            mo11047x();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@ts2 TimeInterpolator timeInterpolator) {
        this.f7675a.mo40326H0(timeInterpolator);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f7678b;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.f7678b.setVisible(z, false);
        }
        Drawable drawable2 = this.f7670a;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.f7670a.setVisible(z, false);
        }
    }

    /* renamed from: t */
    public final void mo11042t(boolean z) {
        int i;
        int i2;
        int i3;
        View view = this.f7671a;
        if (view == null) {
            view = this.f7672a;
        }
        int i4 = mo10988i(view);
        bk0.m40127a(this, this.f7679b, this.f7669a);
        ViewGroup viewGroup = this.f7672a;
        int i5 = 0;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            i5 = toolbar.getTitleMarginStart();
            i2 = toolbar.getTitleMarginEnd();
            i = toolbar.getTitleMarginTop();
            i3 = toolbar.getTitleMarginBottom();
        } else if (Build.VERSION.SDK_INT < 24 || !(viewGroup instanceof android.widget.Toolbar)) {
            i3 = 0;
            i2 = 0;
            i = 0;
        } else {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            i5 = toolbar2.getTitleMarginStart();
            i2 = toolbar2.getTitleMarginEnd();
            i = toolbar2.getTitleMarginTop();
            i3 = toolbar2.getTitleMarginBottom();
        }
        m00 m00 = this.f7675a;
        Rect rect = this.f7669a;
        int i6 = rect.left + (z ? i2 : i5);
        int i7 = rect.top + i4 + i;
        int i8 = rect.right;
        if (!z) {
            i5 = i2;
        }
        m00.mo40360f0(i6, i7, i8 - i5, (rect.bottom + i4) - i3);
    }

    /* renamed from: u */
    public final void mo11043u() {
        setContentDescription(getTitle());
    }

    /* renamed from: v */
    public final void mo11044v(@mr2 Drawable drawable, int i, int i2) {
        mo11046w(drawable, this.f7672a, i, i2);
    }

    public boolean verifyDrawable(@mr2 Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7670a || drawable == this.f7678b;
    }

    /* renamed from: w */
    public final void mo11046w(@mr2 Drawable drawable, @ts2 View view, int i, int i2) {
        if (mo10992o() && view != null && this.f7681c) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    /* renamed from: x */
    public final void mo11047x() {
        View view;
        if (!this.f7681c && (view = this.f7679b) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f7679b);
            }
        }
        if (this.f7681c && this.f7672a != null) {
            if (this.f7679b == null) {
                this.f7679b = new View(getContext());
            }
            if (this.f7679b.getParent() == null) {
                this.f7672a.addView(this.f7679b, -1, -1);
            }
        }
    }

    /* renamed from: y */
    public final void mo11048y() {
        if (this.f7670a != null || this.f7678b != null) {
            setScrimsShown(getHeight() + this.f7693u < getScrimVisibleHeightTrigger());
        }
    }

    /* renamed from: z */
    public final void mo11049z(int i, int i2, int i3, int i4, boolean z) {
        View view;
        if (this.f7681c && (view = this.f7679b) != null) {
            boolean z2 = false;
            boolean z3 = jt4.m18896O0(view) && this.f7679b.getVisibility() == 0;
            this.f7682d = z3;
            if (z3 || z) {
                if (jt4.m18928Z(this) == 1) {
                    z2 = true;
                }
                mo11042t(z2);
                this.f7675a.mo40380p0(z2 ? this.f7689q : this.f7687o, this.f7669a.top + this.f7688p, (i3 - i) - (z2 ? this.f7687o : this.f7689q), (i4 - i2) - this.f7690r);
                this.f7675a.mo40357d0(z);
            }
        }
    }
}
