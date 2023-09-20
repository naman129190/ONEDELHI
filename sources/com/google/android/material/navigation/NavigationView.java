package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0248e;
import androidx.appcompat.view.menu.C0253h;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.onedelhi.secure.C2015e0;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.a80;
import com.onedelhi.secure.af2;
import com.onedelhi.secure.af4;
import com.onedelhi.secure.bf2;
import com.onedelhi.secure.cf2;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.h74;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mo1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nn2;
import com.onedelhi.secure.on2;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.ri1;
import com.onedelhi.secure.s12;
import com.onedelhi.secure.sx4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.uw3;
import com.onedelhi.secure.vw3;
import com.onedelhi.secure.yk0;
import com.onedelhi.secure.za3;
import com.onedelhi.secure.zk0;

public class NavigationView extends ScrimInsetsFrameLayout {

    /* renamed from: b */
    public static final int[] f24154b = {16842912};

    /* renamed from: c */
    public static final int[] f24155c = {-16842910};

    /* renamed from: q */
    public static final int f24156q = fd3.C2164n.Widget_Design_NavigationView;

    /* renamed from: r */
    public static final int f24157r = 1;
    @ts2

    /* renamed from: a */
    public Path f24158a;

    /* renamed from: a */
    public final RectF f24159a;

    /* renamed from: a */
    public MenuInflater f24160a;

    /* renamed from: a */
    public ViewTreeObserver.OnGlobalLayoutListener f24161a;

    /* renamed from: a */
    public C4165c f24162a;
    @mr2

    /* renamed from: a */
    public final nn2 f24163a;

    /* renamed from: a */
    public final on2 f24164a;

    /* renamed from: a */
    public final int[] f24165a;

    /* renamed from: d */
    public boolean f24166d;

    /* renamed from: e */
    public boolean f24167e;

    /* renamed from: n */
    public final int f24168n;

    /* renamed from: o */
    public int f24169o;
    @e83

    /* renamed from: p */
    public int f24170p;

    /* renamed from: com.google.android.material.navigation.NavigationView$a */
    public class C4163a implements C0248e.C0249a {
        public C4163a() {
        }

        /* renamed from: a */
        public void mo1031a(C0248e eVar) {
        }

        /* renamed from: b */
        public boolean mo1033b(C0248e eVar, MenuItem menuItem) {
            C4165c cVar = NavigationView.this.f24162a;
            return cVar != null && cVar.mo28521a(menuItem);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$b */
    public class C4164b implements ViewTreeObserver.OnGlobalLayoutListener {
        public C4164b() {
        }

        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f24165a);
            boolean z = true;
            boolean z2 = NavigationView.this.f24165a[1] == 0;
            NavigationView.this.f24164a.mo41866F(z2);
            NavigationView navigationView2 = NavigationView.this;
            navigationView2.setDrawTopInsetForeground(z2 && navigationView2.mo28488m());
            Activity a = a80.m36091a(NavigationView.this.getContext());
            if (a != null) {
                boolean z3 = a.findViewById(16908290).getHeight() == NavigationView.this.getHeight();
                boolean z4 = Color.alpha(a.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView3 = NavigationView.this;
                if (!z3 || !z4 || !navigationView3.mo28487l()) {
                    z = false;
                }
                navigationView3.setDrawBottomInsetForeground(z);
            }
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$c */
    public interface C4165c {
        /* renamed from: a */
        boolean mo28521a(@mr2 MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$d */
    public static class C4166d extends C2015e0 {
        public static final Parcelable.Creator<C4166d> CREATOR = new C4167a();
        @ts2

        /* renamed from: a */
        public Bundle f24173a;

        /* renamed from: com.google.android.material.navigation.NavigationView$d$a */
        public class C4167a implements Parcelable.ClassLoaderCreator<C4166d> {
            @ts2
            /* renamed from: a */
            public C4166d createFromParcel(@mr2 Parcel parcel) {
                return new C4166d(parcel, (ClassLoader) null);
            }

            @mr2
            /* renamed from: b */
            public C4166d createFromParcel(@mr2 Parcel parcel, ClassLoader classLoader) {
                return new C4166d(parcel, classLoader);
            }

            @mr2
            /* renamed from: c */
            public C4166d[] newArray(int i) {
                return new C4166d[i];
            }
        }

        public C4166d(@mr2 Parcel parcel, @ts2 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f24173a = parcel.readBundle(classLoader);
        }

        public C4166d(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(@mr2 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f24173a);
        }
    }

    public NavigationView(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public NavigationView(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.navigationViewStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavigationView(@com.onedelhi.secure.mr2 android.content.Context r17, @com.onedelhi.secure.ts2 android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = f24156q
            r1 = r17
            android.content.Context r1 = com.onedelhi.secure.hf2.m50488c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            com.onedelhi.secure.on2 r10 = new com.onedelhi.secure.on2
            r10.<init>()
            r0.f24164a = r10
            r1 = 2
            int[] r1 = new int[r1]
            r0.f24165a = r1
            r11 = 1
            r0.f24166d = r11
            r0.f24167e = r11
            r12 = 0
            r0.f24169o = r12
            r0.f24170p = r12
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f24159a = r1
            android.content.Context r13 = r16.getContext()
            com.onedelhi.secure.nn2 r14 = new com.onedelhi.secure.nn2
            r14.<init>(r13)
            r0.f24163a = r14
            int[] r3 = com.onedelhi.secure.fd3.C2165o.NavigationView
            int[] r6 = new int[r12]
            r1 = r13
            r2 = r18
            r4 = r19
            r5 = r9
            com.onedelhi.secure.af4 r1 = com.onedelhi.secure.ob4.m59196l(r1, r2, r3, r4, r5, r6)
            int r2 = com.onedelhi.secure.fd3.C2165o.NavigationView_android_background
            boolean r3 = r1.mo13026C(r2)
            if (r3 == 0) goto L_0x0056
            android.graphics.drawable.Drawable r2 = r1.mo13037h(r2)
            com.onedelhi.secure.jt4.m18877I1(r0, r2)
        L_0x0056:
            int r2 = com.onedelhi.secure.fd3.C2165o.NavigationView_drawerLayoutCornerSize
            int r2 = r1.mo13036g(r2, r12)
            r0.f24170p = r2
            int r2 = com.onedelhi.secure.fd3.C2165o.NavigationView_android_layout_gravity
            int r2 = r1.mo13044o(r2, r12)
            r0.f24169o = r2
            android.graphics.drawable.Drawable r2 = r16.getBackground()
            if (r2 == 0) goto L_0x0074
            android.graphics.drawable.Drawable r2 = r16.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L_0x009c
        L_0x0074:
            com.onedelhi.secure.uw3$b r2 = com.onedelhi.secure.uw3.m67447e(r13, r7, r8, r9)
            com.onedelhi.secure.uw3 r2 = r2.mo45845m()
            android.graphics.drawable.Drawable r3 = r16.getBackground()
            com.onedelhi.secure.bf2 r4 = new com.onedelhi.secure.bf2
            r4.<init>((com.onedelhi.secure.uw3) r2)
            boolean r2 = r3 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L_0x0096
            android.graphics.drawable.ColorDrawable r3 = (android.graphics.drawable.ColorDrawable) r3
            int r2 = r3.getColor()
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r4.mo31626o0(r2)
        L_0x0096:
            r4.mo31599Z(r13)
            com.onedelhi.secure.jt4.m18877I1(r0, r4)
        L_0x009c:
            int r2 = com.onedelhi.secure.fd3.C2165o.NavigationView_elevation
            boolean r3 = r1.mo13026C(r2)
            if (r3 == 0) goto L_0x00ac
            int r2 = r1.mo13036g(r2, r12)
            float r2 = (float) r2
            r0.setElevation(r2)
        L_0x00ac:
            int r2 = com.onedelhi.secure.fd3.C2165o.NavigationView_android_fitsSystemWindows
            boolean r2 = r1.mo13030a(r2, r12)
            r0.setFitsSystemWindows(r2)
            int r2 = com.onedelhi.secure.fd3.C2165o.NavigationView_android_maxWidth
            int r2 = r1.mo13036g(r2, r12)
            r0.f24168n = r2
            int r2 = com.onedelhi.secure.fd3.C2165o.NavigationView_subheaderColor
            boolean r3 = r1.mo13026C(r2)
            r4 = 0
            if (r3 == 0) goto L_0x00cb
            android.content.res.ColorStateList r2 = r1.mo13033d(r2)
            goto L_0x00cc
        L_0x00cb:
            r2 = r4
        L_0x00cc:
            int r3 = com.onedelhi.secure.fd3.C2165o.NavigationView_subheaderTextAppearance
            boolean r5 = r1.mo13026C(r3)
            if (r5 == 0) goto L_0x00d9
            int r3 = r1.mo13050u(r3, r12)
            goto L_0x00da
        L_0x00d9:
            r3 = 0
        L_0x00da:
            r5 = 16842808(0x1010038, float:2.3693715E-38)
            if (r3 != 0) goto L_0x00e5
            if (r2 != 0) goto L_0x00e5
            android.content.res.ColorStateList r2 = r0.mo28466e(r5)
        L_0x00e5:
            int r6 = com.onedelhi.secure.fd3.C2165o.NavigationView_itemIconTint
            boolean r7 = r1.mo13026C(r6)
            if (r7 == 0) goto L_0x00f2
            android.content.res.ColorStateList r5 = r1.mo13033d(r6)
            goto L_0x00f6
        L_0x00f2:
            android.content.res.ColorStateList r5 = r0.mo28466e(r5)
        L_0x00f6:
            int r6 = com.onedelhi.secure.fd3.C2165o.NavigationView_itemTextAppearance
            boolean r7 = r1.mo13026C(r6)
            if (r7 == 0) goto L_0x0103
            int r6 = r1.mo13050u(r6, r12)
            goto L_0x0104
        L_0x0103:
            r6 = 0
        L_0x0104:
            int r7 = com.onedelhi.secure.fd3.C2165o.NavigationView_itemIconSize
            boolean r8 = r1.mo13026C(r7)
            if (r8 == 0) goto L_0x0113
            int r7 = r1.mo13036g(r7, r12)
            r0.setItemIconSize(r7)
        L_0x0113:
            int r7 = com.onedelhi.secure.fd3.C2165o.NavigationView_itemTextColor
            boolean r8 = r1.mo13026C(r7)
            if (r8 == 0) goto L_0x0120
            android.content.res.ColorStateList r7 = r1.mo13033d(r7)
            goto L_0x0121
        L_0x0120:
            r7 = r4
        L_0x0121:
            if (r6 != 0) goto L_0x012c
            if (r7 != 0) goto L_0x012c
            r7 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r7 = r0.mo28466e(r7)
        L_0x012c:
            int r8 = com.onedelhi.secure.fd3.C2165o.NavigationView_itemBackground
            android.graphics.drawable.Drawable r8 = r1.mo13037h(r8)
            if (r8 != 0) goto L_0x0156
            boolean r9 = r0.mo28484i(r1)
            if (r9 == 0) goto L_0x0156
            android.graphics.drawable.Drawable r8 = r0.mo28467f(r1)
            int r9 = com.onedelhi.secure.fd3.C2165o.NavigationView_itemRippleColor
            android.content.res.ColorStateList r9 = com.onedelhi.secure.af2.m38611b(r13, r1, r9)
            if (r9 == 0) goto L_0x0156
            android.graphics.drawable.Drawable r15 = r0.mo28468g(r1, r4)
            android.graphics.drawable.RippleDrawable r11 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r9 = com.onedelhi.secure.um3.m67327e(r9)
            r11.<init>(r9, r4, r15)
            r10.mo41872L(r11)
        L_0x0156:
            int r4 = com.onedelhi.secure.fd3.C2165o.NavigationView_itemHorizontalPadding
            boolean r9 = r1.mo13026C(r4)
            if (r9 == 0) goto L_0x0165
            int r4 = r1.mo13036g(r4, r12)
            r0.setItemHorizontalPadding(r4)
        L_0x0165:
            int r4 = com.onedelhi.secure.fd3.C2165o.NavigationView_itemVerticalPadding
            boolean r9 = r1.mo13026C(r4)
            if (r9 == 0) goto L_0x0174
            int r4 = r1.mo13036g(r4, r12)
            r0.setItemVerticalPadding(r4)
        L_0x0174:
            int r4 = com.onedelhi.secure.fd3.C2165o.NavigationView_dividerInsetStart
            int r4 = r1.mo13036g(r4, r12)
            r0.setDividerInsetStart(r4)
            int r4 = com.onedelhi.secure.fd3.C2165o.NavigationView_dividerInsetEnd
            int r4 = r1.mo13036g(r4, r12)
            r0.setDividerInsetEnd(r4)
            int r4 = com.onedelhi.secure.fd3.C2165o.NavigationView_subheaderInsetStart
            int r4 = r1.mo13036g(r4, r12)
            r0.setSubheaderInsetStart(r4)
            int r4 = com.onedelhi.secure.fd3.C2165o.NavigationView_subheaderInsetEnd
            int r4 = r1.mo13036g(r4, r12)
            r0.setSubheaderInsetEnd(r4)
            int r4 = com.onedelhi.secure.fd3.C2165o.NavigationView_topInsetScrimEnabled
            boolean r9 = r0.f24166d
            boolean r4 = r1.mo13030a(r4, r9)
            r0.setTopInsetScrimEnabled(r4)
            int r4 = com.onedelhi.secure.fd3.C2165o.NavigationView_bottomInsetScrimEnabled
            boolean r9 = r0.f24167e
            boolean r4 = r1.mo13030a(r4, r9)
            r0.setBottomInsetScrimEnabled(r4)
            int r4 = com.onedelhi.secure.fd3.C2165o.NavigationView_itemIconPadding
            int r4 = r1.mo13036g(r4, r12)
            int r9 = com.onedelhi.secure.fd3.C2165o.NavigationView_itemMaxLines
            r11 = 1
            int r9 = r1.mo13044o(r9, r11)
            r0.setItemMaxLines(r9)
            com.google.android.material.navigation.NavigationView$a r9 = new com.google.android.material.navigation.NavigationView$a
            r9.<init>()
            r14.mo1307X(r9)
            r10.mo41870J(r11)
            r10.mo1217g(r13, r14)
            if (r3 == 0) goto L_0x01d1
            r10.mo41885Y(r3)
        L_0x01d1:
            r10.mo41882V(r2)
            r10.mo41876P(r5)
            int r2 = r16.getOverScrollMode()
            r10.mo41881U(r2)
            if (r6 == 0) goto L_0x01e3
            r10.mo41878R(r6)
        L_0x01e3:
            r10.mo41879S(r7)
            r10.mo41871K(r8)
            r10.mo41874N(r4)
            r14.mo1321b(r10)
            androidx.appcompat.view.menu.k r2 = r10.mo1216f(r0)
            android.view.View r2 = (android.view.View) r2
            r0.addView(r2)
            int r2 = com.onedelhi.secure.fd3.C2165o.NavigationView_menu
            boolean r3 = r1.mo13026C(r2)
            if (r3 == 0) goto L_0x0207
            int r2 = r1.mo13050u(r2, r12)
            r0.mo28486k(r2)
        L_0x0207:
            int r2 = com.onedelhi.secure.fd3.C2165o.NavigationView_headerLayout
            boolean r3 = r1.mo13026C(r2)
            if (r3 == 0) goto L_0x0216
            int r2 = r1.mo13050u(r2, r12)
            r0.mo28485j(r2)
        L_0x0216:
            r1.mo13029I()
            r16.mo28495p()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private MenuInflater getMenuInflater() {
        if (this.f24160a == null) {
            this.f24160a = new h74(getContext());
        }
        return this.f24160a;
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo28266a(@mr2 sx4 sx4) {
        this.f24164a.mo41889l(sx4);
    }

    /* renamed from: d */
    public void mo28464d(@mr2 View view) {
        this.f24164a.mo41888c(view);
    }

    public void dispatchDraw(@mr2 Canvas canvas) {
        if (this.f24158a == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.f24158a);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    @ts2
    /* renamed from: e */
    public final ColorStateList mo28466e(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList a = C3129p8.m24528a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(za3.C4057b.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = a.getDefaultColor();
        int[] iArr = f24155c;
        return new ColorStateList(new int[][]{iArr, f24154b, FrameLayout.EMPTY_STATE_SET}, new int[]{a.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    @mr2
    /* renamed from: f */
    public final Drawable mo28467f(@mr2 af4 af4) {
        return mo28468g(af4, af2.m38611b(getContext(), af4, fd3.C2165o.NavigationView_itemShapeFillColor));
    }

    @mr2
    /* renamed from: g */
    public final Drawable mo28468g(@mr2 af4 af4, @ts2 ColorStateList colorStateList) {
        bf2 bf2 = new bf2(uw3.m67444b(getContext(), af4.mo13050u(fd3.C2165o.NavigationView_itemShapeAppearance, 0), af4.mo13050u(fd3.C2165o.NavigationView_itemShapeAppearanceOverlay, 0)).mo45845m());
        bf2.mo31626o0(colorStateList);
        return new InsetDrawable(bf2, af4.mo13036g(fd3.C2165o.NavigationView_itemShapeInsetStart, 0), af4.mo13036g(fd3.C2165o.NavigationView_itemShapeInsetTop, 0), af4.mo13036g(fd3.C2165o.NavigationView_itemShapeInsetEnd, 0), af4.mo13036g(fd3.C2165o.NavigationView_itemShapeInsetBottom, 0));
    }

    @ts2
    public MenuItem getCheckedItem() {
        return this.f24164a.mo41890o();
    }

    @e83
    public int getDividerInsetEnd() {
        return this.f24164a.mo41891p();
    }

    @e83
    public int getDividerInsetStart() {
        return this.f24164a.mo41892q();
    }

    public int getHeaderCount() {
        return this.f24164a.mo41893r();
    }

    @ts2
    public Drawable getItemBackground() {
        return this.f24164a.mo41895t();
    }

    @zk0
    public int getItemHorizontalPadding() {
        return this.f24164a.mo41896u();
    }

    @zk0
    public int getItemIconPadding() {
        return this.f24164a.mo41897v();
    }

    @ts2
    public ColorStateList getItemIconTintList() {
        return this.f24164a.mo41900y();
    }

    public int getItemMaxLines() {
        return this.f24164a.mo41898w();
    }

    @ts2
    public ColorStateList getItemTextColor() {
        return this.f24164a.mo41899x();
    }

    @e83
    public int getItemVerticalPadding() {
        return this.f24164a.mo41901z();
    }

    @mr2
    public Menu getMenu() {
        return this.f24163a;
    }

    @e83
    public int getSubheaderInsetEnd() {
        return this.f24164a.mo41861A();
    }

    @e83
    public int getSubheaderInsetStart() {
        return this.f24164a.mo41862B();
    }

    /* renamed from: h */
    public View mo28483h(int i) {
        return this.f24164a.mo41894s(i);
    }

    /* renamed from: i */
    public final boolean mo28484i(@mr2 af4 af4) {
        return af4.mo13026C(fd3.C2165o.NavigationView_itemShapeAppearance) || af4.mo13026C(fd3.C2165o.NavigationView_itemShapeAppearanceOverlay);
    }

    /* renamed from: j */
    public View mo28485j(@s12 int i) {
        return this.f24164a.mo41863C(i);
    }

    /* renamed from: k */
    public void mo28486k(int i) {
        this.f24164a.mo41886Z(true);
        getMenuInflater().inflate(i, this.f24163a);
        this.f24164a.mo41886Z(false);
        this.f24164a.mo1214d(false);
    }

    /* renamed from: l */
    public boolean mo28487l() {
        return this.f24167e;
    }

    /* renamed from: m */
    public boolean mo28488m() {
        return this.f24166d;
    }

    /* renamed from: n */
    public final void mo28489n(@e83 int i, @e83 int i2) {
        if (!(getParent() instanceof DrawerLayout) || this.f24170p <= 0 || !(getBackground() instanceof bf2)) {
            this.f24158a = null;
            this.f24159a.setEmpty();
            return;
        }
        bf2 bf2 = (bf2) getBackground();
        uw3.C6982b v = bf2.getShapeAppearanceModel().mo45824v();
        if (ri1.m26762d(this.f24169o, jt4.m18928Z(this)) == 3) {
            v.mo45843P((float) this.f24170p);
            v.mo45830C((float) this.f24170p);
        } else {
            v.mo45838K((float) this.f24170p);
            v.mo45855x((float) this.f24170p);
        }
        bf2.setShapeAppearanceModel(v.mo45845m());
        if (this.f24158a == null) {
            this.f24158a = new Path();
        }
        this.f24158a.reset();
        this.f24159a.set(0.0f, 0.0f, (float) i, (float) i2);
        vw3.m68560k().mo46402d(bf2.getShapeAppearanceModel(), bf2.mo31648z(), this.f24159a, this.f24158a);
        invalidate();
    }

    /* renamed from: o */
    public void mo28490o(@mr2 View view) {
        this.f24164a.mo41865E(view);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cf2.m40864e(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f24161a);
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = this.f24168n;
            }
            super.onMeasure(i, i2);
        }
        i3 = Math.min(View.MeasureSpec.getSize(i), this.f24168n);
        i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        super.onMeasure(i, i2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4166d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4166d dVar = (C4166d) parcelable;
        super.onRestoreInstanceState(dVar.mo14959a());
        this.f24163a.mo1304U(dVar.f24173a);
    }

    public Parcelable onSaveInstanceState() {
        C4166d dVar = new C4166d(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        dVar.f24173a = bundle;
        this.f24163a.mo1306W(bundle);
        return dVar;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo28489n(i, i2);
    }

    /* renamed from: p */
    public final void mo28495p() {
        this.f24161a = new C4164b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f24161a);
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.f24167e = z;
    }

    public void setCheckedItem(@mo1 int i) {
        MenuItem findItem = this.f24163a.findItem(i);
        if (findItem != null) {
            this.f24164a.mo41867G((C0253h) findItem);
        }
    }

    public void setCheckedItem(@mr2 MenuItem menuItem) {
        MenuItem findItem = this.f24163a.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f24164a.mo41867G((C0253h) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    public void setDividerInsetEnd(@e83 int i) {
        this.f24164a.mo41868H(i);
    }

    public void setDividerInsetStart(@e83 int i) {
        this.f24164a.mo41869I(i);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        cf2.m40863d(this, f);
    }

    public void setItemBackground(@ts2 Drawable drawable) {
        this.f24164a.mo41871K(drawable);
    }

    public void setItemBackgroundResource(@dp0 int i) {
        setItemBackground(r70.m26356i(getContext(), i));
    }

    public void setItemHorizontalPadding(@zk0 int i) {
        this.f24164a.mo41873M(i);
    }

    public void setItemHorizontalPaddingResource(@yk0 int i) {
        this.f24164a.mo41873M(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(@zk0 int i) {
        this.f24164a.mo41874N(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.f24164a.mo41874N(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(@zk0 int i) {
        this.f24164a.mo41875O(i);
    }

    public void setItemIconTintList(@ts2 ColorStateList colorStateList) {
        this.f24164a.mo41876P(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.f24164a.mo41877Q(i);
    }

    public void setItemTextAppearance(@e64 int i) {
        this.f24164a.mo41878R(i);
    }

    public void setItemTextColor(@ts2 ColorStateList colorStateList) {
        this.f24164a.mo41879S(colorStateList);
    }

    public void setItemVerticalPadding(@e83 int i) {
        this.f24164a.mo41880T(i);
    }

    public void setItemVerticalPaddingResource(@yk0 int i) {
        this.f24164a.mo41880T(getResources().getDimensionPixelSize(i));
    }

    public void setNavigationItemSelectedListener(@ts2 C4165c cVar) {
        this.f24162a = cVar;
    }

    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        on2 on2 = this.f24164a;
        if (on2 != null) {
            on2.mo41881U(i);
        }
    }

    public void setSubheaderInsetEnd(@e83 int i) {
        this.f24164a.mo41884X(i);
    }

    public void setSubheaderInsetStart(@e83 int i) {
        this.f24164a.mo41884X(i);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.f24166d = z;
    }
}
