package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.C0258j;
import com.onedelhi.secure.do2;
import com.onedelhi.secure.eo2;
import com.onedelhi.secure.fo2;
import com.onedelhi.secure.go2;
import com.onedelhi.secure.gr1;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.kg0;
import com.onedelhi.secure.lg0;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.sx4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.za3;

@SuppressLint({"UnknownNullness"})
@hl3({hl3.C2354a.f13188c})
public class ActionBarOverlayLayout extends ViewGroup implements kg0, fo2, do2, eo2 {

    /* renamed from: a */
    public static final int[] f1239a = {za3.C4057b.actionBarSize, 16842841};

    /* renamed from: b */
    public static final String f1240b = "ActionBarOverlayLayout";

    /* renamed from: r */
    public static final int f1241r = 600;

    /* renamed from: a */
    public final AnimatorListenerAdapter f1242a;

    /* renamed from: a */
    public final Rect f1243a;

    /* renamed from: a */
    public Drawable f1244a;

    /* renamed from: a */
    public ViewPropertyAnimator f1245a;

    /* renamed from: a */
    public OverScroller f1246a;

    /* renamed from: a */
    public ActionBarContainer f1247a;

    /* renamed from: a */
    public C0271d f1248a;

    /* renamed from: a */
    public ContentFrameLayout f1249a;

    /* renamed from: a */
    public final go2 f1250a;

    /* renamed from: a */
    public lg0 f1251a;
    @mr2

    /* renamed from: a */
    public sx4 f1252a;

    /* renamed from: a */
    public final Runnable f1253a;

    /* renamed from: b */
    public final Rect f1254b;
    @mr2

    /* renamed from: b */
    public sx4 f1255b;

    /* renamed from: b */
    public final Runnable f1256b;

    /* renamed from: b */
    public boolean f1257b;

    /* renamed from: c */
    public final Rect f1258c;
    @mr2

    /* renamed from: c */
    public sx4 f1259c;

    /* renamed from: c */
    public boolean f1260c;

    /* renamed from: d */
    public final Rect f1261d;
    @mr2

    /* renamed from: d */
    public sx4 f1262d;

    /* renamed from: d */
    public boolean f1263d;

    /* renamed from: e */
    public final Rect f1264e;

    /* renamed from: e */
    public boolean f1265e;

    /* renamed from: f */
    public final Rect f1266f;

    /* renamed from: f */
    public boolean f1267f;

    /* renamed from: g */
    public final Rect f1268g;

    /* renamed from: n */
    public int f1269n;

    /* renamed from: o */
    public int f1270o;

    /* renamed from: p */
    public int f1271p;

    /* renamed from: q */
    public int f1272q;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public class C0268a extends AnimatorListenerAdapter {
        public C0268a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1245a = null;
            actionBarOverlayLayout.f1267f = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1245a = null;
            actionBarOverlayLayout.f1267f = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    public class C0269b implements Runnable {
        public C0269b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1621w();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1245a = actionBarOverlayLayout.f1247a.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f1242a);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    public class C0270c implements Runnable {
        public C0270c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.mo1621w();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f1245a = actionBarOverlayLayout.f1247a.animate().translationY((float) (-ActionBarOverlayLayout.this.f1247a.getHeight())).setListener(ActionBarOverlayLayout.this.f1242a);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    public interface C0271d {
        /* renamed from: a */
        void mo1143a();

        /* renamed from: b */
        void mo1144b(int i);

        /* renamed from: c */
        void mo1145c(boolean z);

        /* renamed from: d */
        void mo1146d();

        /* renamed from: e */
        void mo1147e();

        /* renamed from: f */
        void mo1148f();
    }

    public ActionBarOverlayLayout(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarOverlayLayout(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1270o = 0;
        this.f1243a = new Rect();
        this.f1254b = new Rect();
        this.f1258c = new Rect();
        this.f1261d = new Rect();
        this.f1264e = new Rect();
        this.f1266f = new Rect();
        this.f1268g = new Rect();
        sx4 sx4 = sx4.f20549a;
        this.f1252a = sx4;
        this.f1255b = sx4;
        this.f1259c = sx4;
        this.f1262d = sx4;
        this.f1242a = new C0268a();
        this.f1253a = new C0269b();
        this.f1256b = new C0270c();
        mo1622x(context);
        this.f1250a = new go2(this);
    }

    /* renamed from: A */
    public final void mo1556A() {
        mo1621w();
        postDelayed(this.f1256b, 600);
    }

    /* renamed from: B */
    public final void mo1557B() {
        mo1621w();
        postDelayed(this.f1253a, 600);
    }

    /* renamed from: C */
    public void mo1558C() {
        if (this.f1249a == null) {
            this.f1249a = (ContentFrameLayout) findViewById(za3.C4062g.action_bar_activity_content);
            this.f1247a = (ActionBarContainer) findViewById(za3.C4062g.action_bar_container);
            this.f1251a = mo1620v(findViewById(za3.C4062g.action_bar));
        }
    }

    /* renamed from: D */
    public final void mo1559D() {
        mo1621w();
        this.f1253a.run();
    }

    /* renamed from: E */
    public final boolean mo1560E(float f) {
        this.f1246a.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f1246a.getFinalY() > this.f1247a.getHeight();
    }

    /* renamed from: a */
    public final void mo1561a() {
        mo1621w();
        this.f1256b.run();
    }

    /* renamed from: b */
    public void mo1562b(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    /* renamed from: c */
    public boolean mo1563c() {
        mo1558C();
        return this.f1251a.mo2571c();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public boolean mo1565d() {
        mo1558C();
        return this.f1251a.mo2572d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1244a != null && !this.f1257b) {
            int bottom = this.f1247a.getVisibility() == 0 ? (int) (((float) this.f1247a.getBottom()) + this.f1247a.getTranslationY() + 0.5f) : 0;
            this.f1244a.setBounds(0, bottom, getWidth(), this.f1244a.getIntrinsicHeight() + bottom);
            this.f1244a.draw(canvas);
        }
    }

    /* renamed from: e */
    public boolean mo1567e() {
        mo1558C();
        return this.f1251a.mo2573e();
    }

    /* renamed from: f */
    public boolean mo1568f() {
        mo1558C();
        return this.f1251a.mo2574f();
    }

    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    /* renamed from: g */
    public boolean mo1570g() {
        mo1558C();
        return this.f1251a.mo2575g();
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1247a;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f1250a.mo16724a();
    }

    public CharSequence getTitle() {
        mo1558C();
        return this.f1251a.getTitle();
    }

    /* renamed from: h */
    public boolean mo1577h() {
        mo1558C();
        return this.f1251a.mo2578h();
    }

    /* renamed from: i */
    public boolean mo1578i() {
        mo1558C();
        return this.f1251a.mo2579i();
    }

    /* renamed from: j */
    public void mo1579j() {
        mo1558C();
        this.f1251a.mo2586p();
    }

    /* renamed from: k */
    public void mo1580k(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: l */
    public void mo1581l(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo1583n(view, i, i2, i3, i4, i5);
    }

    /* renamed from: m */
    public void mo1582m(SparseArray<Parcelable> sparseArray) {
        mo1558C();
        this.f1251a.mo2554L(sparseArray);
    }

    /* renamed from: n */
    public void mo1583n(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: o */
    public void mo1584o(SparseArray<Parcelable> sparseArray) {
        mo1558C();
        this.f1251a.mo2545C(sparseArray);
    }

    @sj3(21)
    public WindowInsets onApplyWindowInsets(@mr2 WindowInsets windowInsets) {
        mo1558C();
        sx4 L = sx4.m27880L(windowInsets, this);
        boolean s = mo1602s(this.f1247a, new Rect(L.mo24603p(), L.mo24605r(), L.mo24604q(), L.mo24602o()), true, true, false, true);
        jt4.m18987o(this, L, this.f1243a);
        Rect rect = this.f1243a;
        sx4 x = L.mo24611x(rect.left, rect.top, rect.right, rect.bottom);
        this.f1252a = x;
        boolean z = true;
        if (!this.f1255b.equals(x)) {
            this.f1255b = this.f1252a;
            s = true;
        }
        if (!this.f1254b.equals(this.f1243a)) {
            this.f1254b.set(this.f1243a);
        } else {
            z = s;
        }
        if (z) {
            requestLayout();
        }
        return L.mo24586a().mo24588c().mo24587b().mo24585J();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo1622x(getContext());
        jt4.m19017v1(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1621w();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = layoutParams.leftMargin + paddingLeft;
                int i7 = layoutParams.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        sx4 sx4;
        mo1558C();
        measureChildWithMargins(this.f1247a, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.f1247a.getLayoutParams();
        int max = Math.max(0, this.f1247a.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
        int max2 = Math.max(0, this.f1247a.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1247a.getMeasuredState());
        boolean z = (jt4.m18852C0(this) & 256) != 0;
        if (z) {
            i3 = this.f1269n;
            if (this.f1263d && this.f1247a.getTabContainer() != null) {
                i3 += this.f1269n;
            }
        } else {
            i3 = this.f1247a.getVisibility() != 8 ? this.f1247a.getMeasuredHeight() : 0;
        }
        this.f1258c.set(this.f1243a);
        sx4 sx42 = this.f1252a;
        this.f1259c = sx42;
        if (this.f1260c || z) {
            sx4 = new sx4.C3548b(this.f1259c).mo24620h(gr1.m16159d(sx42.mo24603p(), this.f1259c.mo24605r() + i3, this.f1259c.mo24604q(), this.f1259c.mo24602o() + 0)).mo24613a();
        } else {
            Rect rect = this.f1258c;
            rect.top += i3;
            rect.bottom += 0;
            sx4 = sx42.mo24611x(0, i3, 0, 0);
        }
        this.f1259c = sx4;
        mo1602s(this.f1249a, this.f1258c, true, true, true, true);
        if (!this.f1262d.equals(this.f1259c)) {
            sx4 sx43 = this.f1259c;
            this.f1262d = sx43;
            jt4.m18991p(this.f1249a, sx43);
        }
        measureChildWithMargins(this.f1249a, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f1249a.getLayoutParams();
        int max3 = Math.max(max, this.f1249a.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
        int max4 = Math.max(max2, this.f1249a.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1249a.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f1265e || !z) {
            return false;
        }
        if (mo1560E(f2)) {
            mo1561a();
        } else {
            mo1559D();
        }
        this.f1267f = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f1271p + i2;
        this.f1271p = i5;
        setActionBarHideOffset(i5);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1250a.mo16725b(view, view2, i);
        this.f1271p = getActionBarHideOffset();
        mo1621w();
        C0271d dVar = this.f1248a;
        if (dVar != null) {
            dVar.mo1146d();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1247a.getVisibility() != 0) {
            return false;
        }
        return this.f1265e;
    }

    public void onStopNestedScroll(View view) {
        if (this.f1265e && !this.f1267f) {
            if (this.f1271p <= this.f1247a.getHeight()) {
                mo1557B();
            } else {
                mo1556A();
            }
        }
        C0271d dVar = this.f1248a;
        if (dVar != null) {
            dVar.mo1143a();
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        mo1558C();
        int i2 = this.f1272q ^ i;
        this.f1272q = i;
        boolean z = false;
        boolean z2 = (i & 4) == 0;
        if ((i & 256) != 0) {
            z = true;
        }
        C0271d dVar = this.f1248a;
        if (dVar != null) {
            dVar.mo1145c(!z);
            if (z2 || !z) {
                this.f1248a.mo1148f();
            } else {
                this.f1248a.mo1147e();
            }
        }
        if ((i2 & 256) != 0 && this.f1248a != null) {
            jt4.m19017v1(this);
        }
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1270o = i;
        C0271d dVar = this.f1248a;
        if (dVar != null) {
            dVar.mo1144b(i);
        }
    }

    /* renamed from: p */
    public void mo1599p(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* renamed from: q */
    public void mo1600q(int i) {
        mo1558C();
        if (i == 2) {
            this.f1251a.mo2557O();
        } else if (i == 5) {
            this.f1251a.mo2584n();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    /* renamed from: r */
    public boolean mo1601r(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    /* renamed from: s */
    public final boolean mo1602s(@mr2 View view, @mr2 Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        int i2;
        int i3;
        int i4;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!z || layoutParams.leftMargin == (i4 = rect.left)) {
            z5 = false;
        } else {
            layoutParams.leftMargin = i4;
            z5 = true;
        }
        if (z2 && layoutParams.topMargin != (i3 = rect.top)) {
            layoutParams.topMargin = i3;
            z5 = true;
        }
        if (z4 && layoutParams.rightMargin != (i2 = rect.right)) {
            layoutParams.rightMargin = i2;
            z5 = true;
        }
        if (!z3 || layoutParams.bottomMargin == (i = rect.bottom)) {
            return z5;
        }
        layoutParams.bottomMargin = i;
        return true;
    }

    public void setActionBarHideOffset(int i) {
        mo1621w();
        this.f1247a.setTranslationY((float) (-Math.max(0, Math.min(i, this.f1247a.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C0271d dVar) {
        this.f1248a = dVar;
        if (getWindowToken() != null) {
            this.f1248a.mo1144b(this.f1270o);
            int i = this.f1272q;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                jt4.m19017v1(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1263d = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1265e) {
            this.f1265e = z;
            if (!z) {
                mo1621w();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo1558C();
        this.f1251a.setIcon(i);
    }

    public void setIcon(Drawable drawable) {
        mo1558C();
        this.f1251a.setIcon(drawable);
    }

    public void setLogo(int i) {
        mo1558C();
        this.f1251a.setLogo(i);
    }

    public void setMenu(Menu menu, C0258j.C0259a aVar) {
        mo1558C();
        this.f1251a.setMenu(menu, aVar);
    }

    public void setMenuPrepared() {
        mo1558C();
        this.f1251a.setMenuPrepared();
    }

    public void setOverlayMode(boolean z) {
        this.f1260c = z;
        this.f1257b = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        mo1558C();
        this.f1251a.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo1558C();
        this.f1251a.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    /* renamed from: u */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: v */
    public final lg0 mo1620v(View view) {
        if (view instanceof lg0) {
            return (lg0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: w */
    public void mo1621w() {
        removeCallbacks(this.f1253a);
        removeCallbacks(this.f1256b);
        ViewPropertyAnimator viewPropertyAnimator = this.f1245a;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* renamed from: x */
    public final void mo1622x(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1239a);
        boolean z = false;
        this.f1269n = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1244a = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.f1257b = z;
        this.f1246a = new OverScroller(context);
    }

    /* renamed from: y */
    public boolean mo1623y() {
        return this.f1265e;
    }

    /* renamed from: z */
    public boolean mo1624z() {
        return this.f1260c;
    }
}
