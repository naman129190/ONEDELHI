package com.google.android.material.navigation;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0253h;
import androidx.appcompat.view.menu.C0260k;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C1947d7;
import com.onedelhi.secure.C3516si;
import com.onedelhi.secure.C3711ui;
import com.onedelhi.secure.af2;
import com.onedelhi.secure.b33;
import com.onedelhi.secure.d81;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jb4;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.of4;
import com.onedelhi.secure.pl2;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.s12;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.um3;
import com.onedelhi.secure.wo0;
import com.onedelhi.secure.yk0;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public abstract class NavigationBarItemView extends FrameLayout implements C0260k.C0261a {

    /* renamed from: a */
    public static final int[] f24065a = {16842912};

    /* renamed from: b */
    public static final C4154d f24066b = new C4154d((C4151a) null);

    /* renamed from: c */
    public static final C4154d f24067c = new C4155e((C4151a) null);

    /* renamed from: u */
    public static final int f24068u = -1;

    /* renamed from: a */
    public float f24069a;

    /* renamed from: a */
    public ValueAnimator f24070a;

    /* renamed from: a */
    public ColorStateList f24071a;
    @ts2

    /* renamed from: a */
    public Drawable f24072a;
    @ts2

    /* renamed from: a */
    public final View f24073a;

    /* renamed from: a */
    public final ViewGroup f24074a;
    @ts2

    /* renamed from: a */
    public final FrameLayout f24075a;

    /* renamed from: a */
    public final ImageView f24076a;

    /* renamed from: a */
    public final TextView f24077a;
    @ts2

    /* renamed from: a */
    public C0253h f24078a;

    /* renamed from: a */
    public C4154d f24079a = f24066b;
    @ts2

    /* renamed from: a */
    public C3516si f24080a;

    /* renamed from: b */
    public float f24081b;
    @ts2

    /* renamed from: b */
    public ColorStateList f24082b;
    @ts2

    /* renamed from: b */
    public Drawable f24083b;

    /* renamed from: b */
    public final TextView f24084b;

    /* renamed from: b */
    public boolean f24085b = false;

    /* renamed from: c */
    public float f24086c;
    @ts2

    /* renamed from: c */
    public Drawable f24087c;

    /* renamed from: c */
    public boolean f24088c;

    /* renamed from: d */
    public float f24089d = 0.0f;

    /* renamed from: d */
    public boolean f24090d = false;

    /* renamed from: e */
    public boolean f24091e = false;

    /* renamed from: n */
    public int f24092n;

    /* renamed from: o */
    public int f24093o;

    /* renamed from: p */
    public int f24094p;

    /* renamed from: q */
    public int f24095q = -1;

    /* renamed from: r */
    public int f24096r = 0;

    /* renamed from: s */
    public int f24097s = 0;

    /* renamed from: t */
    public int f24098t = 0;

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$a */
    public class C4151a implements View.OnLayoutChangeListener {
        public C4151a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (NavigationBarItemView.this.f24076a.getVisibility() == 0) {
                NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                navigationBarItemView.mo28335x(navigationBarItemView.f24076a);
            }
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$b */
    public class C4152b implements Runnable {

        /* renamed from: n */
        public final /* synthetic */ int f24101n;

        public C4152b(int i) {
            this.f24101n = i;
        }

        public void run() {
            NavigationBarItemView.this.mo28336y(this.f24101n);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$c */
    public class C4153c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ float f24102a;

        public C4153c(float f) {
            this.f24102a = f;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            NavigationBarItemView.this.mo28312r(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f24102a);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$d */
    public static class C4154d {

        /* renamed from: a */
        public static final float f24104a = 0.4f;

        /* renamed from: b */
        public static final float f24105b = 1.0f;

        /* renamed from: c */
        public static final float f24106c = 0.2f;

        public C4154d() {
        }

        public /* synthetic */ C4154d(C4151a aVar) {
            this();
        }

        /* renamed from: a */
        public float mo28341a(@d81(from = 0.0d, mo14561to = 1.0d) float f, @d81(from = 0.0d, mo14561to = 1.0d) float f2) {
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            return C1947d7.m12986b(0.0f, 1.0f, i == 0 ? 0.8f : 0.0f, i == 0 ? 1.0f : 0.2f, f);
        }

        /* renamed from: b */
        public float mo28342b(@d81(from = 0.0d, mo14561to = 1.0d) float f, @d81(from = 0.0d, mo14561to = 1.0d) float f2) {
            return C1947d7.m12985a(0.4f, 1.0f, f);
        }

        /* renamed from: c */
        public float mo28343c(@d81(from = 0.0d, mo14561to = 1.0d) float f, @d81(from = 0.0d, mo14561to = 1.0d) float f2) {
            return 1.0f;
        }

        /* renamed from: d */
        public void mo28344d(@d81(from = 0.0d, mo14561to = 1.0d) float f, @d81(from = 0.0d, mo14561to = 1.0d) float f2, @mr2 View view) {
            view.setScaleX(mo28342b(f, f2));
            view.setScaleY(mo28343c(f, f2));
            view.setAlpha(mo28341a(f, f2));
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationBarItemView$e */
    public static class C4155e extends C4154d {
        public C4155e() {
            super((C4151a) null);
        }

        public /* synthetic */ C4155e(C4151a aVar) {
            this();
        }

        /* renamed from: c */
        public float mo28343c(float f, float f2) {
            return mo28342b(f, f2);
        }
    }

    public NavigationBarItemView(@mr2 Context context) {
        super(context);
        LayoutInflater.from(context).inflate(getItemLayoutResId(), this, true);
        this.f24075a = (FrameLayout) findViewById(fd3.C2158h.navigation_bar_item_icon_container);
        this.f24073a = findViewById(fd3.C2158h.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(fd3.C2158h.navigation_bar_item_icon_view);
        this.f24076a = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(fd3.C2158h.navigation_bar_item_labels_group);
        this.f24074a = viewGroup;
        TextView textView = (TextView) findViewById(fd3.C2158h.navigation_bar_item_small_label_view);
        this.f24077a = textView;
        TextView textView2 = (TextView) findViewById(fd3.C2158h.navigation_bar_item_large_label_view);
        this.f24084b = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f24092n = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f24093o = viewGroup.getPaddingBottom();
        jt4.m18906R1(textView, 2);
        jt4.m18906R1(textView2, 2);
        setFocusable(true);
        mo28300h(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new C4151a());
        }
    }

    /* renamed from: A */
    public static void m33606A(@mr2 View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f24075a;
        return frameLayout != null ? frameLayout : this.f24076a;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconHeight() {
        C3516si siVar = this.f24080a;
        int minimumHeight = siVar != null ? siVar.getMinimumHeight() / 2 : 0;
        return Math.max(minimumHeight, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + this.f24076a.getMeasuredWidth() + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        C3516si siVar = this.f24080a;
        int minimumWidth = siVar == null ? 0 : siVar.getMinimumWidth() - this.f24080a.mo24433q();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.f24076a.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    /* renamed from: j */
    public static Drawable m33611j(@mr2 ColorStateList colorStateList) {
        return new RippleDrawable(um3.m67323a(colorStateList), (Drawable) null, (Drawable) null);
    }

    /* renamed from: s */
    public static void m33612s(TextView textView, @e64 int i) {
        jb4.m18310E(textView, i);
        int h = af2.m38617h(textView.getContext(), i, 0);
        if (h != 0) {
            textView.setTextSize(0, (float) h);
        }
    }

    /* renamed from: t */
    public static void m33613t(@mr2 View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    /* renamed from: u */
    public static void m33614u(@mr2 View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    public void mo1171b(@mr2 C0253h hVar, int i) {
        this.f24078a = hVar;
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setIcon(hVar.getIcon());
        setTitle(hVar.getTitle());
        setId(hVar.getItemId());
        if (!TextUtils.isEmpty(hVar.getContentDescription())) {
            setContentDescription(hVar.getContentDescription());
        }
        CharSequence tooltipText = !TextUtils.isEmpty(hVar.getTooltipText()) ? hVar.getTooltipText() : hVar.getTitle();
        if (Build.VERSION.SDK_INT > 23) {
            of4.m23742a(this, tooltipText);
        }
        setVisibility(hVar.isVisible() ? 0 : 8);
        this.f24085b = true;
    }

    /* renamed from: d */
    public boolean mo1172d() {
        return false;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f24075a;
        if (frameLayout != null && this.f24090d) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: f */
    public boolean mo1174f() {
        return true;
    }

    @ts2
    public Drawable getActiveIndicatorDrawable() {
        View view = this.f24073a;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    @ts2
    public C3516si getBadge() {
        return this.f24080a;
    }

    @dp0
    public int getItemBackgroundResId() {
        return fd3.C2157g.mtrl_navigation_bar_item_background;
    }

    @ts2
    public C0253h getItemData() {
        return this.f24078a;
    }

    @yk0
    public int getItemDefaultMarginResId() {
        return fd3.C2156f.mtrl_navigation_bar_item_default_margin;
    }

    @s12
    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f24095q;
    }

    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24074a.getLayoutParams();
        return getSuggestedIconHeight() + layoutParams.topMargin + this.f24074a.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24074a.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.f24074a.getMeasuredWidth() + layoutParams.rightMargin);
    }

    /* renamed from: h */
    public final void mo28300h(float f, float f2) {
        this.f24069a = f - f2;
        this.f24081b = (f2 * 1.0f) / f;
        this.f24086c = (f * 1.0f) / f2;
    }

    /* renamed from: i */
    public void mo28301i() {
        mo28311q();
        this.f24078a = null;
        this.f24089d = 0.0f;
        this.f24085b = false;
    }

    @ts2
    /* renamed from: k */
    public final FrameLayout mo28302k(View view) {
        ImageView imageView = this.f24076a;
        if (view != imageView || !C3711ui.f21382a) {
            return null;
        }
        return (FrameLayout) imageView.getParent();
    }

    /* renamed from: l */
    public final boolean mo28303l() {
        return this.f24080a != null;
    }

    /* renamed from: m */
    public final boolean mo28304m() {
        return this.f24091e && this.f24094p == 2;
    }

    /* renamed from: n */
    public final void mo28305n(@d81(from = 0.0d, mo14561to = 1.0d) float f) {
        if (!this.f24090d || !this.f24085b || !jt4.m18896O0(this)) {
            mo28312r(f, f);
            return;
        }
        ValueAnimator valueAnimator = this.f24070a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f24070a = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f24089d, f});
        this.f24070a = ofFloat;
        ofFloat.addUpdateListener(new C4153c(f));
        this.f24070a.setInterpolator(pl2.m61422g(getContext(), fd3.C2153c.motionEasingEmphasizedInterpolator, C1947d7.f10650b));
        this.f24070a.setDuration((long) pl2.m61421f(getContext(), fd3.C2153c.motionDurationLong2, getResources().getInteger(fd3.C2159i.material_motion_duration_long_1)));
        this.f24070a.start();
    }

    /* renamed from: o */
    public final void mo28306o() {
        C0253h hVar = this.f24078a;
        if (hVar != null) {
            setChecked(hVar.isChecked());
        }
    }

    @mr2
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0253h hVar = this.f24078a;
        if (hVar != null && hVar.isCheckable() && this.f24078a.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f24065a);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityNodeInfo(@mr2 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3516si siVar = this.f24080a;
        if (siVar != null && siVar.isVisible()) {
            CharSequence title = this.f24078a.getTitle();
            if (!TextUtils.isEmpty(this.f24078a.getContentDescription())) {
                title = this.f24078a.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(title + ", " + this.f24080a.mo24431o());
        }
        C1638a2 X1 = C1638a2.m10547X1(accessibilityNodeInfo);
        X1.mo12555Z0(C1638a2.C1641c.m10709h(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            X1.mo12551X0(false);
            X1.mo12512K0(C1638a2.C1639a.f8642e);
        }
        X1.mo12494D1(getResources().getString(fd3.C2163m.item_view_role_description));
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new C4152b(i));
    }

    /* renamed from: p */
    public final void mo28310p() {
        Drawable drawable = this.f24072a;
        RippleDrawable rippleDrawable = null;
        boolean z = true;
        if (this.f24071a != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.f24090d && getActiveIndicatorDrawable() != null && this.f24075a != null && activeIndicatorDrawable != null) {
                z = false;
                rippleDrawable = new RippleDrawable(um3.m67327e(this.f24071a), (Drawable) null, activeIndicatorDrawable);
            } else if (drawable == null) {
                drawable = m33611j(this.f24071a);
            }
        }
        FrameLayout frameLayout = this.f24075a;
        if (frameLayout != null) {
            jt4.m18877I1(frameLayout, rippleDrawable);
        }
        jt4.m18877I1(this, drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    /* renamed from: q */
    public void mo28311q() {
        mo28334w(this.f24076a);
    }

    /* renamed from: r */
    public final void mo28312r(@d81(from = 0.0d, mo14561to = 1.0d) float f, float f2) {
        View view = this.f24073a;
        if (view != null) {
            this.f24079a.mo28344d(f, f2, view);
        }
        this.f24089d = f;
    }

    public void setActiveIndicatorDrawable(@ts2 Drawable drawable) {
        View view = this.f24073a;
        if (view != null) {
            view.setBackgroundDrawable(drawable);
            mo28310p();
        }
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.f24090d = z;
        mo28310p();
        View view = this.f24073a;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i) {
        this.f24097s = i;
        mo28336y(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(@e83 int i) {
        this.f24098t = i;
        mo28336y(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.f24091e = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.f24096r = i;
        mo28336y(getWidth());
    }

    public void setBadge(@mr2 C3516si siVar) {
        if (this.f24080a != siVar) {
            if (mo28303l() && this.f24076a != null) {
                Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
                mo28334w(this.f24076a);
            }
            this.f24080a = siVar;
            ImageView imageView = this.f24076a;
            if (imageView != null) {
                mo28333v(imageView);
            }
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0068, code lost:
        if (r9 != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0085, code lost:
        m33614u(getIconOrContainer(), r8.f24092n, 49);
        r1 = r8.f24084b;
        r2 = r8.f24086c;
        m33613t(r1, r2, r2, 4);
        m33613t(r8.f24077a, 1.0f, 1.0f, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a1, code lost:
        if (r9 != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a3, code lost:
        m33614u(r0, r1, 49);
        m33606A(r8.f24074a, r8.f24093o);
        r8.f24084b.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b3, code lost:
        m33614u(r0, r1, 17);
        m33606A(r8.f24074a, 0);
        r8.f24084b.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c0, code lost:
        r8.f24077a.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d0, code lost:
        if (r9 != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00da, code lost:
        if (r9 != false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChecked(boolean r9) {
        /*
            r8 = this;
            android.widget.TextView r0 = r8.f24084b
            int r1 = r0.getWidth()
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r8.f24084b
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            android.widget.TextView r0 = r8.f24077a
            int r1 = r0.getWidth()
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r8.f24077a
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L_0x0032
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            r8.mo28305n(r1)
            int r1 = r8.f24094p
            r3 = -1
            r4 = 17
            r5 = 49
            r6 = 4
            r7 = 0
            if (r1 == r3) goto L_0x00c6
            if (r1 == 0) goto L_0x009b
            r3 = 1
            if (r1 == r3) goto L_0x0061
            if (r1 == r2) goto L_0x004a
            goto L_0x00dd
        L_0x004a:
            android.view.View r0 = r8.getIconOrContainer()
            int r1 = r8.f24092n
            m33614u(r0, r1, r4)
            android.widget.TextView r0 = r8.f24084b
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r8.f24077a
            r0.setVisibility(r1)
            goto L_0x00dd
        L_0x0061:
            android.view.ViewGroup r1 = r8.f24074a
            int r2 = r8.f24093o
            m33606A(r1, r2)
            if (r9 == 0) goto L_0x0085
        L_0x006a:
            android.view.View r1 = r8.getIconOrContainer()
            int r2 = r8.f24092n
            float r2 = (float) r2
            float r3 = r8.f24069a
            float r2 = r2 + r3
            int r2 = (int) r2
            m33614u(r1, r2, r5)
            android.widget.TextView r1 = r8.f24084b
            m33613t(r1, r0, r0, r7)
            android.widget.TextView r0 = r8.f24077a
            float r1 = r8.f24081b
            m33613t(r0, r1, r1, r6)
            goto L_0x00dd
        L_0x0085:
            android.view.View r1 = r8.getIconOrContainer()
            int r2 = r8.f24092n
            m33614u(r1, r2, r5)
            android.widget.TextView r1 = r8.f24084b
            float r2 = r8.f24086c
            m33613t(r1, r2, r2, r6)
            android.widget.TextView r1 = r8.f24077a
            m33613t(r1, r0, r0, r7)
            goto L_0x00dd
        L_0x009b:
            android.view.View r0 = r8.getIconOrContainer()
            int r1 = r8.f24092n
            if (r9 == 0) goto L_0x00b3
        L_0x00a3:
            m33614u(r0, r1, r5)
            android.view.ViewGroup r0 = r8.f24074a
            int r1 = r8.f24093o
            m33606A(r0, r1)
            android.widget.TextView r0 = r8.f24084b
            r0.setVisibility(r7)
            goto L_0x00c0
        L_0x00b3:
            m33614u(r0, r1, r4)
            android.view.ViewGroup r0 = r8.f24074a
            m33606A(r0, r7)
            android.widget.TextView r0 = r8.f24084b
            r0.setVisibility(r6)
        L_0x00c0:
            android.widget.TextView r0 = r8.f24077a
            r0.setVisibility(r6)
            goto L_0x00dd
        L_0x00c6:
            boolean r1 = r8.f24088c
            if (r1 == 0) goto L_0x00d3
            android.view.View r0 = r8.getIconOrContainer()
            int r1 = r8.f24092n
            if (r9 == 0) goto L_0x00b3
            goto L_0x00a3
        L_0x00d3:
            android.view.ViewGroup r1 = r8.f24074a
            int r2 = r8.f24093o
            m33606A(r1, r2)
            if (r9 == 0) goto L_0x0085
            goto L_0x006a
        L_0x00dd:
            r8.refreshDrawableState()
            r8.setSelected(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationBarItemView.setChecked(boolean):void");
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f24077a.setEnabled(z);
        this.f24084b.setEnabled(z);
        this.f24076a.setEnabled(z);
        jt4.m18958g2(this, z ? b33.m11544c(getContext(), 1002) : null);
    }

    public void setIcon(@ts2 Drawable drawable) {
        if (drawable != this.f24083b) {
            this.f24083b = drawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = wo0.m30989r(drawable).mutate();
                this.f24087c = drawable;
                ColorStateList colorStateList = this.f24082b;
                if (colorStateList != null) {
                    wo0.m30986o(drawable, colorStateList);
                }
            }
            this.f24076a.setImageDrawable(drawable);
        }
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24076a.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f24076a.setLayoutParams(layoutParams);
    }

    public void setIconTintList(@ts2 ColorStateList colorStateList) {
        Drawable drawable;
        this.f24082b = colorStateList;
        if (this.f24078a != null && (drawable = this.f24087c) != null) {
            wo0.m30986o(drawable, colorStateList);
            this.f24087c.invalidateSelf();
        }
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : r70.m26356i(getContext(), i));
    }

    public void setItemBackground(@ts2 Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.f24072a = drawable;
        mo28310p();
    }

    public void setItemPaddingBottom(int i) {
        if (this.f24093o != i) {
            this.f24093o = i;
            mo28306o();
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.f24092n != i) {
            this.f24092n = i;
            mo28306o();
        }
    }

    public void setItemPosition(int i) {
        this.f24095q = i;
    }

    public void setItemRippleColor(@ts2 ColorStateList colorStateList) {
        this.f24071a = colorStateList;
        mo28310p();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f24094p != i) {
            this.f24094p = i;
            mo28337z();
            mo28336y(getWidth());
            mo28306o();
        }
    }

    public void setShifting(boolean z) {
        if (this.f24088c != z) {
            this.f24088c = z;
            mo28306o();
        }
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearanceActive(@e64 int i) {
        m33612s(this.f24084b, i);
        mo28300h(this.f24077a.getTextSize(), this.f24084b.getTextSize());
    }

    public void setTextAppearanceInactive(@e64 int i) {
        m33612s(this.f24077a, i);
        mo28300h(this.f24077a.getTextSize(), this.f24084b.getTextSize());
    }

    public void setTextColor(@ts2 ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f24077a.setTextColor(colorStateList);
            this.f24084b.setTextColor(colorStateList);
        }
    }

    public void setTitle(@ts2 CharSequence charSequence) {
        this.f24077a.setText(charSequence);
        this.f24084b.setText(charSequence);
        C0253h hVar = this.f24078a;
        if (hVar == null || TextUtils.isEmpty(hVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        C0253h hVar2 = this.f24078a;
        if (hVar2 != null && !TextUtils.isEmpty(hVar2.getTooltipText())) {
            charSequence = this.f24078a.getTooltipText();
        }
        if (Build.VERSION.SDK_INT > 23) {
            of4.m23742a(this, charSequence);
        }
    }

    /* renamed from: v */
    public final void mo28333v(@ts2 View view) {
        if (mo28303l() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            C3711ui.m29357d(this.f24080a, view, mo28302k(view));
        }
    }

    /* renamed from: w */
    public final void mo28334w(@ts2 View view) {
        if (mo28303l()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C3711ui.m29363j(this.f24080a, view);
            }
            this.f24080a = null;
        }
    }

    /* renamed from: x */
    public final void mo28335x(View view) {
        if (mo28303l()) {
            C3711ui.m29366m(this.f24080a, view, mo28302k(view));
        }
    }

    /* renamed from: y */
    public final void mo28336y(int i) {
        if (this.f24073a != null) {
            int min = Math.min(this.f24096r, i - (this.f24098t * 2));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24073a.getLayoutParams();
            layoutParams.height = mo28304m() ? min : this.f24097s;
            layoutParams.width = min;
            this.f24073a.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: z */
    public final void mo28337z() {
        this.f24079a = mo28304m() ? f24067c : f24066b;
    }
}
