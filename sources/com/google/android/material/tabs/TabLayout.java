package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C1947d7;
import com.onedelhi.secure.C2530jn;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.C3516si;
import com.onedelhi.secure.C3711ui;
import com.onedelhi.secure.ay2;
import com.onedelhi.secure.b33;
import com.onedelhi.secure.cf2;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.e54;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.gs0;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jb4;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.k10;
import com.onedelhi.secure.kp0;
import com.onedelhi.secure.ld2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.n33;
import com.onedelhi.secure.of4;
import com.onedelhi.secure.pv4;
import com.onedelhi.secure.ri1;
import com.onedelhi.secure.s12;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.vz0;
import com.onedelhi.secure.wo0;
import com.onedelhi.secure.zk0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.C1105e
public class TabLayout extends HorizontalScrollView {

    /* renamed from: F */
    public static final int f24433F = fd3.C2164n.Widget_Design_TabLayout;
    @zk0(unit = 0)

    /* renamed from: G */
    public static final int f24434G = 72;
    @zk0(unit = 0)

    /* renamed from: H */
    public static final int f24435H = 8;
    @zk0(unit = 0)

    /* renamed from: I */
    public static final int f24436I = 48;
    @zk0(unit = 0)

    /* renamed from: J */
    public static final int f24437J = 56;
    @zk0(unit = 0)

    /* renamed from: K */
    public static final int f24438K = 16;

    /* renamed from: L */
    public static final int f24439L = -1;

    /* renamed from: M */
    public static final int f24440M = 300;

    /* renamed from: N */
    public static final int f24441N = -1;

    /* renamed from: O */
    public static final int f24442O = 0;

    /* renamed from: P */
    public static final int f24443P = 1;

    /* renamed from: Q */
    public static final int f24444Q = 2;

    /* renamed from: R */
    public static final int f24445R = 0;

    /* renamed from: S */
    public static final int f24446S = 1;

    /* renamed from: T */
    public static final int f24447T = 0;

    /* renamed from: U */
    public static final int f24448U = 1;

    /* renamed from: V */
    public static final int f24449V = 2;

    /* renamed from: W */
    public static final int f24450W = 0;

    /* renamed from: X */
    public static final int f24451X = 1;

    /* renamed from: Y */
    public static final int f24452Y = 2;

    /* renamed from: Z */
    public static final int f24453Z = 3;

    /* renamed from: a0 */
    public static final int f24454a0 = 0;

    /* renamed from: b */
    public static final n33.C2922a<C4232i> f24455b = new n33.C2924c(16);

    /* renamed from: b */
    public static final String f24456b = "TabLayout";

    /* renamed from: b0 */
    public static final int f24457b0 = 1;

    /* renamed from: c0 */
    public static final int f24458c0 = 2;

    /* renamed from: A */
    public int f24459A;

    /* renamed from: B */
    public int f24460B;

    /* renamed from: C */
    public int f24461C;

    /* renamed from: D */
    public int f24462D;

    /* renamed from: E */
    public int f24463E;

    /* renamed from: a */
    public float f24464a;

    /* renamed from: a */
    public ValueAnimator f24465a;

    /* renamed from: a */
    public ColorStateList f24466a;

    /* renamed from: a */
    public DataSetObserver f24467a;

    /* renamed from: a */
    public PorterDuff.Mode f24468a;
    @mr2

    /* renamed from: a */
    public Drawable f24469a;
    @ts2

    /* renamed from: a */
    public ViewPager f24470a;

    /* renamed from: a */
    public C4224b f24471a;
    @ts2

    /* renamed from: a */
    public C4225c f24472a;
    @mr2

    /* renamed from: a */
    public final C4230h f24473a;
    @ts2

    /* renamed from: a */
    public C4232i f24474a;

    /* renamed from: a */
    public C4236m f24475a;

    /* renamed from: a */
    public C4238a f24476a;
    @ts2

    /* renamed from: a */
    public ay2 f24477a;

    /* renamed from: a */
    public final n33.C2922a<TabView> f24478a;

    /* renamed from: a */
    public final ArrayList<C4232i> f24479a;

    /* renamed from: b */
    public float f24480b;

    /* renamed from: b */
    public ColorStateList f24481b;
    @ts2

    /* renamed from: b */
    public C4225c f24482b;

    /* renamed from: b */
    public final ArrayList<C4225c> f24483b;

    /* renamed from: b */
    public boolean f24484b;

    /* renamed from: c */
    public ColorStateList f24485c;

    /* renamed from: c */
    public boolean f24486c;

    /* renamed from: d */
    public boolean f24487d;

    /* renamed from: e */
    public boolean f24488e;

    /* renamed from: n */
    public int f24489n;

    /* renamed from: o */
    public int f24490o;

    /* renamed from: p */
    public int f24491p;

    /* renamed from: q */
    public int f24492q;

    /* renamed from: r */
    public int f24493r;

    /* renamed from: s */
    public int f24494s;

    /* renamed from: t */
    public final int f24495t;

    /* renamed from: u */
    public int f24496u;

    /* renamed from: v */
    public final int f24497v;

    /* renamed from: w */
    public final int f24498w;

    /* renamed from: x */
    public final int f24499x;

    /* renamed from: y */
    public int f24500y;

    /* renamed from: z */
    public int f24501z;

    public final class TabView extends LinearLayout {
        @ts2

        /* renamed from: a */
        public Drawable f24502a;
        @ts2

        /* renamed from: a */
        public View f24503a;

        /* renamed from: a */
        public ImageView f24504a;

        /* renamed from: a */
        public TextView f24505a;

        /* renamed from: a */
        public C4232i f24506a;
        @ts2

        /* renamed from: a */
        public C3516si f24508a;
        @ts2

        /* renamed from: b */
        public View f24509b;
        @ts2

        /* renamed from: b */
        public ImageView f24510b;
        @ts2

        /* renamed from: b */
        public TextView f24511b;

        /* renamed from: n */
        public int f24512n = 2;

        /* renamed from: com.google.android.material.tabs.TabLayout$TabView$a */
        public class C4222a implements View.OnLayoutChangeListener {

            /* renamed from: a */
            public final /* synthetic */ View f24513a;

            public C4222a(View view) {
                this.f24513a = view;
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (this.f24513a.getVisibility() == 0) {
                    TabView.this.mo29061w(this.f24513a);
                }
            }
        }

        public TabView(@mr2 Context context) {
            super(context);
            mo29063y(context);
            jt4.m18946d2(this, TabLayout.this.f24489n, TabLayout.this.f24490o, TabLayout.this.f24491p, TabLayout.this.f24492q);
            setGravity(17);
            setOrientation(TabLayout.this.f24484b ^ true ? 1 : 0);
            setClickable(true);
            jt4.m18958g2(this, b33.m11544c(getContext(), 1002));
        }

        /* access modifiers changed from: private */
        @ts2
        public C3516si getBadge() {
            return this.f24508a;
        }

        /* access modifiers changed from: private */
        @mr2
        public C3516si getOrCreateBadge() {
            if (this.f24508a == null) {
                this.f24508a = C3516si.m27588d(getContext());
            }
            mo29060v();
            C3516si siVar = this.f24508a;
            if (siVar != null) {
                return siVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* renamed from: A */
        public final void mo29037A(@ts2 TextView textView, @ts2 ImageView imageView) {
            C4232i iVar = this.f24506a;
            CharSequence charSequence = null;
            Drawable mutate = (iVar == null || iVar.mo29090h() == null) ? null : wo0.m30989r(this.f24506a.mo29090h()).mutate();
            if (mutate != null) {
                wo0.m30986o(mutate, TabLayout.this.f24481b);
                PorterDuff.Mode mode = TabLayout.this.f24468a;
                if (mode != null) {
                    wo0.m30987p(mutate, mode);
                }
            }
            C4232i iVar2 = this.f24506a;
            CharSequence n = iVar2 != null ? iVar2.mo29096n() : null;
            if (imageView != null) {
                if (mutate != null) {
                    imageView.setImageDrawable(mutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable((Drawable) null);
                }
            }
            boolean z = !TextUtils.isEmpty(n);
            if (textView != null) {
                if (z) {
                    textView.setText(n);
                    if (this.f24506a.f24533b == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int e = (!z || imageView.getVisibility() != 0) ? 0 : (int) pv4.m61665e(getContext(), 8);
                if (TabLayout.this.f24484b) {
                    if (e != ld2.m20478b(marginLayoutParams)) {
                        ld2.m20483g(marginLayoutParams, e);
                        marginLayoutParams.bottomMargin = 0;
                    }
                } else if (e != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = e;
                    ld2.m20483g(marginLayoutParams, 0);
                }
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
            C4232i iVar3 = this.f24506a;
            if (iVar3 != null) {
                charSequence = iVar3.f24534b;
            }
            if (Build.VERSION.SDK_INT > 23) {
                if (!z) {
                    n = charSequence;
                }
                of4.m23742a(this, n);
            }
        }

        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f24502a;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.f24502a.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.f24505a, this.f24504a, this.f24509b};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getTop()) : view.getTop();
                    i = z ? Math.max(i, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return i - i2;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f24505a, this.f24504a, this.f24509b};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        @ts2
        public C4232i getTab() {
            return this.f24506a;
        }

        /* renamed from: i */
        public final void mo29042i(@ts2 View view) {
            if (view != null) {
                view.addOnLayoutChangeListener(new C4222a(view));
            }
        }

        /* renamed from: j */
        public final float mo29043j(@mr2 Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        /* renamed from: k */
        public final void mo29044k(boolean z) {
            setClipChildren(z);
            setClipToPadding(z);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z);
                viewGroup.setClipToPadding(z);
            }
        }

        @mr2
        /* renamed from: l */
        public final FrameLayout mo29045l() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* renamed from: m */
        public final void mo29046m(@mr2 Canvas canvas) {
            Drawable drawable = this.f24502a;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f24502a.draw(canvas);
            }
        }

        @ts2
        /* renamed from: n */
        public final FrameLayout mo29047n(@mr2 View view) {
            if ((view == this.f24504a || view == this.f24505a) && C3711ui.f21382a) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* renamed from: o */
        public final boolean mo29048o() {
            return this.f24508a != null;
        }

        public void onInitializeAccessibilityNodeInfo(@mr2 AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            C3516si siVar = this.f24508a;
            if (siVar != null && siVar.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(contentDescription + ", " + this.f24508a.mo24431o());
            }
            C1638a2 X1 = C1638a2.m10547X1(accessibilityNodeInfo);
            X1.mo12555Z0(C1638a2.C1641c.m10709h(0, 1, this.f24506a.mo29093k(), 1, false, isSelected()));
            if (isSelected()) {
                X1.mo12551X0(false);
                X1.mo12512K0(C1638a2.C1639a.f8642e);
            }
            X1.mo12494D1(getResources().getString(fd3.C2163m.item_view_role_description));
        }

        public void onMeasure(int i, int i2) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f24496u, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f24505a != null) {
                float f = TabLayout.this.f24464a;
                int i3 = this.f24512n;
                ImageView imageView = this.f24504a;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f24505a;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f24480b;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f24505a.getTextSize();
                int lineCount = this.f24505a.getLineCount();
                int k = jb4.m18324k(this.f24505a);
                int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
                if (i4 != 0 || (k >= 0 && i3 != k)) {
                    if (TabLayout.this.f24461C == 1 && i4 > 0 && lineCount == 1 && ((layout = this.f24505a.getLayout()) == null || mo29043j(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                        z = false;
                    }
                    if (z) {
                        this.f24505a.setTextSize(0, f);
                        this.f24505a.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        /* renamed from: p */
        public final void mo29051p() {
            ViewGroup viewGroup;
            if (C3711ui.f21382a) {
                viewGroup = mo29045l();
                addView(viewGroup, 0);
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(fd3.C2161k.design_layout_tab_icon, viewGroup, false);
            this.f24504a = imageView;
            viewGroup.addView(imageView, 0);
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f24506a == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.f24506a.mo29100r();
            return true;
        }

        /* renamed from: q */
        public final void mo29053q() {
            ViewGroup viewGroup;
            if (C3711ui.f21382a) {
                viewGroup = mo29045l();
                addView(viewGroup);
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(fd3.C2161k.design_layout_tab_text, viewGroup, false);
            this.f24505a = textView;
            viewGroup.addView(textView);
        }

        /* renamed from: r */
        public final void mo29054r() {
            if (this.f24503a != null) {
                mo29059u();
            }
            this.f24508a = null;
        }

        /* renamed from: s */
        public void mo29055s() {
            setTab((C4232i) null);
            setSelected(false);
        }

        public void setSelected(boolean z) {
            if (isSelected() != z) {
            }
            super.setSelected(z);
            TextView textView = this.f24505a;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f24504a;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f24509b;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(@ts2 C4232i iVar) {
            if (iVar != this.f24506a) {
                this.f24506a = iVar;
                mo29062x();
            }
        }

        /* renamed from: t */
        public final void mo29058t(@ts2 View view) {
            if (mo29048o() && view != null) {
                mo29044k(false);
                C3711ui.m29357d(this.f24508a, view, mo29047n(view));
                this.f24503a = view;
            }
        }

        /* renamed from: u */
        public final void mo29059u() {
            if (mo29048o()) {
                mo29044k(true);
                View view = this.f24503a;
                if (view != null) {
                    C3711ui.m29363j(this.f24508a, view);
                    this.f24503a = null;
                }
            }
        }

        /* renamed from: v */
        public final void mo29060v() {
            C4232i iVar;
            View view;
            View view2;
            C4232i iVar2;
            if (mo29048o()) {
                if (this.f24509b == null) {
                    if (this.f24504a != null && (iVar2 = this.f24506a) != null && iVar2.mo29090h() != null) {
                        View view3 = this.f24503a;
                        view = this.f24504a;
                        if (view3 != view) {
                            mo29059u();
                            view2 = this.f24504a;
                        }
                        mo29061w(view);
                        return;
                    } else if (!(this.f24505a == null || (iVar = this.f24506a) == null || iVar.mo29094l() != 1)) {
                        View view4 = this.f24503a;
                        view = this.f24505a;
                        if (view4 != view) {
                            mo29059u();
                            view2 = this.f24505a;
                        }
                        mo29061w(view);
                        return;
                    }
                    mo29058t(view2);
                    return;
                }
                mo29059u();
            }
        }

        /* renamed from: w */
        public final void mo29061w(@mr2 View view) {
            if (mo29048o() && view == this.f24503a) {
                C3711ui.m29366m(this.f24508a, view, mo29047n(view));
            }
        }

        /* renamed from: x */
        public final void mo29062x() {
            C4232i iVar = this.f24506a;
            ImageView imageView = null;
            View g = iVar != null ? iVar.mo29089g() : null;
            if (g != null) {
                ViewParent parent = g.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(g);
                    }
                    addView(g);
                }
                this.f24509b = g;
                TextView textView = this.f24505a;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView2 = this.f24504a;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f24504a.setImageDrawable((Drawable) null);
                }
                TextView textView2 = (TextView) g.findViewById(16908308);
                this.f24511b = textView2;
                if (textView2 != null) {
                    this.f24512n = jb4.m18324k(textView2);
                }
                imageView = (ImageView) g.findViewById(16908294);
            } else {
                View view = this.f24509b;
                if (view != null) {
                    removeView(view);
                    this.f24509b = null;
                }
                this.f24511b = null;
            }
            this.f24510b = imageView;
            if (this.f24509b == null) {
                if (this.f24504a == null) {
                    mo29051p();
                }
                if (this.f24505a == null) {
                    mo29053q();
                    this.f24512n = jb4.m18324k(this.f24505a);
                }
                jb4.m18310E(this.f24505a, TabLayout.this.f24493r);
                ColorStateList colorStateList = TabLayout.this.f24466a;
                if (colorStateList != null) {
                    this.f24505a.setTextColor(colorStateList);
                }
                mo29037A(this.f24505a, this.f24504a);
                mo29060v();
                mo29042i(this.f24504a);
                mo29042i(this.f24505a);
            } else {
                TextView textView3 = this.f24511b;
                if (!(textView3 == null && this.f24510b == null)) {
                    mo29037A(textView3, this.f24510b);
                }
            }
            if (iVar != null && !TextUtils.isEmpty(iVar.f24534b)) {
                setContentDescription(iVar.f24534b);
            }
            setSelected(iVar != null && iVar.mo29097o());
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: y */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo29063y(android.content.Context r6) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.f24495t
                r1 = 0
                if (r0 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r6 = com.onedelhi.secure.C3129p8.m24529b(r6, r0)
                r5.f24502a = r6
                if (r6 == 0) goto L_0x0021
                boolean r6 = r6.isStateful()
                if (r6 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r6 = r5.f24502a
                int[] r0 = r5.getDrawableState()
                r6.setState(r0)
                goto L_0x0021
            L_0x001f:
                r5.f24502a = r1
            L_0x0021:
                android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
                r6.<init>()
                r0 = 0
                r6.setColor(r0)
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r0 = r0.f24485c
                if (r0 == 0) goto L_0x0058
                android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
                r0.<init>()
                r2 = 925353388(0x3727c5ac, float:1.0E-5)
                r0.setCornerRadius(r2)
                r2 = -1
                r0.setColor(r2)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f24485c
                android.content.res.ColorStateList r2 = com.onedelhi.secure.um3.m67323a(r2)
                android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.f24487d
                if (r4 == 0) goto L_0x0050
                r6 = r1
            L_0x0050:
                if (r4 == 0) goto L_0x0053
                goto L_0x0054
            L_0x0053:
                r1 = r0
            L_0x0054:
                r3.<init>(r2, r6, r1)
                r6 = r3
            L_0x0058:
                com.onedelhi.secure.jt4.m18877I1(r5, r6)
                com.google.android.material.tabs.TabLayout r6 = com.google.android.material.tabs.TabLayout.this
                r6.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.mo29063y(android.content.Context):void");
        }

        /* renamed from: z */
        public final void mo29064z() {
            ImageView imageView;
            setOrientation(TabLayout.this.f24484b ^ true ? 1 : 0);
            TextView textView = this.f24511b;
            if (textView == null && this.f24510b == null) {
                textView = this.f24505a;
                imageView = this.f24504a;
            } else {
                imageView = this.f24510b;
            }
            mo29037A(textView, imageView);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$a */
    public class C4223a implements ValueAnimator.AnimatorUpdateListener {
        public C4223a() {
        }

        public void onAnimationUpdate(@mr2 ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$b */
    public class C4224b implements ViewPager.C1108h {

        /* renamed from: a */
        public boolean f24517a;

        public C4224b() {
        }

        /* renamed from: a */
        public void mo7103a(@mr2 ViewPager viewPager, @ts2 ay2 ay2, @ts2 ay2 ay22) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f24470a == viewPager) {
                tabLayout.mo28956O(ay22, this.f24517a);
            }
        }

        /* renamed from: b */
        public void mo29067b(boolean z) {
            this.f24517a = z;
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.tabs.TabLayout$c */
    public interface C4225c<T extends C4232i> {
        /* renamed from: a */
        void mo15067a(T t);

        /* renamed from: b */
        void mo15068b(T t);

        /* renamed from: c */
        void mo15069c(T t);
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$d */
    public @interface C4226d {
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.tabs.TabLayout$e */
    public @interface C4227e {
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$f */
    public interface C4228f extends C4225c<C4232i> {
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$g */
    public class C4229g extends DataSetObserver {
        public C4229g() {
        }

        public void onChanged() {
            TabLayout.this.mo28946E();
        }

        public void onInvalidated() {
            TabLayout.this.mo28946E();
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$h */
    public class C4230h extends LinearLayout {

        /* renamed from: a */
        public ValueAnimator f24519a;

        /* renamed from: n */
        public int f24521n = -1;

        /* renamed from: com.google.android.material.tabs.TabLayout$h$a */
        public class C4231a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            public final /* synthetic */ View f24522a;

            /* renamed from: b */
            public final /* synthetic */ View f24524b;

            public C4231a(View view, View view2) {
                this.f24522a = view;
                this.f24524b = view2;
            }

            public void onAnimationUpdate(@mr2 ValueAnimator valueAnimator) {
                C4230h.this.mo29076h(this.f24522a, this.f24524b, valueAnimator.getAnimatedFraction());
            }
        }

        public C4230h(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        /* renamed from: c */
        public void mo29070c(int i, int i2) {
            ValueAnimator valueAnimator = this.f24519a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f24519a.cancel();
            }
            mo29077i(true, i, i2);
        }

        /* renamed from: d */
        public boolean mo29071d() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void draw(@com.onedelhi.secure.mr2 android.graphics.Canvas r6) {
            /*
                r5 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r0 = r0.f24469a
                android.graphics.Rect r0 = r0.getBounds()
                int r0 = r0.height()
                if (r0 >= 0) goto L_0x0016
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r0 = r0.f24469a
                int r0 = r0.getIntrinsicHeight()
            L_0x0016:
                com.google.android.material.tabs.TabLayout r1 = com.google.android.material.tabs.TabLayout.this
                int r1 = r1.f24460B
                r2 = 0
                if (r1 == 0) goto L_0x0037
                r3 = 1
                r4 = 2
                if (r1 == r3) goto L_0x0028
                if (r1 == r4) goto L_0x0041
                r0 = 3
                if (r1 == r0) goto L_0x003d
                r0 = 0
                goto L_0x0041
            L_0x0028:
                int r1 = r5.getHeight()
                int r1 = r1 - r0
                int r2 = r1 / 2
                int r1 = r5.getHeight()
                int r1 = r1 + r0
                int r0 = r1 / 2
                goto L_0x0041
            L_0x0037:
                int r1 = r5.getHeight()
                int r2 = r1 - r0
            L_0x003d:
                int r0 = r5.getHeight()
            L_0x0041:
                com.google.android.material.tabs.TabLayout r1 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r1 = r1.f24469a
                android.graphics.Rect r1 = r1.getBounds()
                int r1 = r1.width()
                if (r1 <= 0) goto L_0x0069
                com.google.android.material.tabs.TabLayout r1 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r1 = r1.f24469a
                android.graphics.Rect r1 = r1.getBounds()
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r3 = r3.f24469a
                int r4 = r1.left
                int r1 = r1.right
                r3.setBounds(r4, r2, r1, r0)
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                android.graphics.drawable.Drawable r0 = r0.f24469a
                r0.draw(r6)
            L_0x0069:
                super.draw(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.C4230h.draw(android.graphics.Canvas):void");
        }

        /* renamed from: e */
        public final void mo29073e() {
            View childAt = getChildAt(TabLayout.this.getSelectedTabPosition());
            C4238a a = TabLayout.this.f24476a;
            TabLayout tabLayout = TabLayout.this;
            a.mo29110c(tabLayout, childAt, tabLayout.f24469a);
        }

        /* renamed from: f */
        public void mo29074f(int i, float f) {
            ValueAnimator valueAnimator = this.f24519a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f24519a.cancel();
            }
            mo29076h(getChildAt(i), getChildAt(i + 1), f);
        }

        /* renamed from: g */
        public void mo29075g(int i) {
            Rect bounds = TabLayout.this.f24469a.getBounds();
            TabLayout.this.f24469a.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        /* renamed from: h */
        public final void mo29076h(View view, View view2, float f) {
            if (view != null && view.getWidth() > 0) {
                C4238a a = TabLayout.this.f24476a;
                TabLayout tabLayout = TabLayout.this;
                a.mo29111d(tabLayout, view, view2, f, tabLayout.f24469a);
            } else {
                Drawable drawable = TabLayout.this.f24469a;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f24469a.getBounds().bottom);
            }
            jt4.m18985n1(this);
        }

        /* renamed from: i */
        public final void mo29077i(boolean z, int i, int i2) {
            View childAt = getChildAt(TabLayout.this.getSelectedTabPosition());
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                mo29073e();
                return;
            }
            C4231a aVar = new C4231a(childAt, childAt2);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f24519a = valueAnimator;
                valueAnimator.setInterpolator(C1947d7.f10650b);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                valueAnimator.addUpdateListener(aVar);
                valueAnimator.start();
                return;
            }
            this.f24519a.removeAllUpdateListeners();
            this.f24519a.addUpdateListener(aVar);
        }

        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f24519a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                mo29073e();
            } else {
                mo29077i(false, TabLayout.this.getSelectedTabPosition(), -1);
            }
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.f24501z == 1 || tabLayout.f24461C == 2) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (((int) pv4.m61665e(getContext(), 16)) * 2)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.f24501z = 0;
                            tabLayout2.mo28960S(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT < 23 && this.f24521n != i) {
                requestLayout();
                this.f24521n = i;
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$i */
    public static class C4232i {

        /* renamed from: d */
        public static final int f24525d = -1;

        /* renamed from: a */
        public int f24526a = -1;
        @ts2

        /* renamed from: a */
        public Drawable f24527a;
        @ts2

        /* renamed from: a */
        public View f24528a;
        @mr2

        /* renamed from: a */
        public TabView f24529a;
        @ts2

        /* renamed from: a */
        public TabLayout f24530a;
        @ts2

        /* renamed from: a */
        public CharSequence f24531a;
        @ts2

        /* renamed from: a */
        public Object f24532a;
        @C4226d

        /* renamed from: b */
        public int f24533b = 1;
        @ts2

        /* renamed from: b */
        public CharSequence f24534b;

        /* renamed from: c */
        public int f24535c = -1;

        @mr2
        /* renamed from: A */
        public C4232i mo29082A(@C4226d int i) {
            this.f24533b = i;
            TabLayout tabLayout = this.f24530a;
            if (tabLayout.f24501z == 1 || tabLayout.f24461C == 2) {
                tabLayout.mo28960S(true);
            }
            mo29086E();
            if (C3711ui.f21382a && this.f24529a.mo29048o() && this.f24529a.f24508a.isVisible()) {
                this.f24529a.invalidate();
            }
            return this;
        }

        @mr2
        /* renamed from: B */
        public C4232i mo29083B(@ts2 Object obj) {
            this.f24532a = obj;
            return this;
        }

        @mr2
        /* renamed from: C */
        public C4232i mo29084C(@e54 int i) {
            TabLayout tabLayout = this.f24530a;
            if (tabLayout != null) {
                return mo29085D(tabLayout.getResources().getText(i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @mr2
        /* renamed from: D */
        public C4232i mo29085D(@ts2 CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f24534b) && !TextUtils.isEmpty(charSequence)) {
                this.f24529a.setContentDescription(charSequence);
            }
            this.f24531a = charSequence;
            mo29086E();
            return this;
        }

        /* renamed from: E */
        public void mo29086E() {
            TabView tabView = this.f24529a;
            if (tabView != null) {
                tabView.mo29062x();
            }
        }

        @ts2
        /* renamed from: e */
        public C3516si mo29087e() {
            return this.f24529a.getBadge();
        }

        @ts2
        /* renamed from: f */
        public CharSequence mo29088f() {
            TabView tabView = this.f24529a;
            if (tabView == null) {
                return null;
            }
            return tabView.getContentDescription();
        }

        @ts2
        /* renamed from: g */
        public View mo29089g() {
            return this.f24528a;
        }

        @ts2
        /* renamed from: h */
        public Drawable mo29090h() {
            return this.f24527a;
        }

        /* renamed from: i */
        public int mo29091i() {
            return this.f24535c;
        }

        @mr2
        /* renamed from: j */
        public C3516si mo29092j() {
            return this.f24529a.getOrCreateBadge();
        }

        /* renamed from: k */
        public int mo29093k() {
            return this.f24526a;
        }

        @C4226d
        /* renamed from: l */
        public int mo29094l() {
            return this.f24533b;
        }

        @ts2
        /* renamed from: m */
        public Object mo29095m() {
            return this.f24532a;
        }

        @ts2
        /* renamed from: n */
        public CharSequence mo29096n() {
            return this.f24531a;
        }

        /* renamed from: o */
        public boolean mo29097o() {
            TabLayout tabLayout = this.f24530a;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                return selectedTabPosition != -1 && selectedTabPosition == this.f24526a;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: p */
        public void mo29098p() {
            this.f24529a.mo29054r();
        }

        /* renamed from: q */
        public void mo29099q() {
            this.f24530a = null;
            this.f24529a = null;
            this.f24532a = null;
            this.f24527a = null;
            this.f24535c = -1;
            this.f24531a = null;
            this.f24534b = null;
            this.f24526a = -1;
            this.f24528a = null;
        }

        /* renamed from: r */
        public void mo29100r() {
            TabLayout tabLayout = this.f24530a;
            if (tabLayout != null) {
                tabLayout.mo28954M(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @mr2
        /* renamed from: s */
        public C4232i mo29101s(@e54 int i) {
            TabLayout tabLayout = this.f24530a;
            if (tabLayout != null) {
                return mo29102t(tabLayout.getResources().getText(i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @mr2
        /* renamed from: t */
        public C4232i mo29102t(@ts2 CharSequence charSequence) {
            this.f24534b = charSequence;
            mo29086E();
            return this;
        }

        @mr2
        /* renamed from: u */
        public C4232i mo29103u(@s12 int i) {
            return mo29104v(LayoutInflater.from(this.f24529a.getContext()).inflate(i, this.f24529a, false));
        }

        @mr2
        /* renamed from: v */
        public C4232i mo29104v(@ts2 View view) {
            this.f24528a = view;
            mo29086E();
            return this;
        }

        @mr2
        /* renamed from: w */
        public C4232i mo29105w(@dp0 int i) {
            TabLayout tabLayout = this.f24530a;
            if (tabLayout != null) {
                return mo29106x(C3129p8.m24529b(tabLayout.getContext(), i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @mr2
        /* renamed from: x */
        public C4232i mo29106x(@ts2 Drawable drawable) {
            this.f24527a = drawable;
            TabLayout tabLayout = this.f24530a;
            if (tabLayout.f24501z == 1 || tabLayout.f24461C == 2) {
                tabLayout.mo28960S(true);
            }
            mo29086E();
            if (C3711ui.f21382a && this.f24529a.mo29048o() && this.f24529a.f24508a.isVisible()) {
                this.f24529a.invalidate();
            }
            return this;
        }

        @mr2
        /* renamed from: y */
        public C4232i mo29107y(int i) {
            this.f24535c = i;
            TabView tabView = this.f24529a;
            if (tabView != null) {
                tabView.setId(i);
            }
            return this;
        }

        /* renamed from: z */
        public void mo29108z(int i) {
            this.f24526a = i;
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.tabs.TabLayout$j */
    public @interface C4233j {
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.tabs.TabLayout$k */
    public @interface C4234k {
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.tabs.TabLayout$l */
    public @interface C4235l {
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$m */
    public static class C4236m implements ViewPager.C1109i {

        /* renamed from: a */
        public int f24536a;
        @mr2

        /* renamed from: a */
        public final WeakReference<TabLayout> f24537a;

        /* renamed from: b */
        public int f24538b;

        public C4236m(TabLayout tabLayout) {
            this.f24537a = new WeakReference<>(tabLayout);
        }

        /* renamed from: a */
        public void mo29109a() {
            this.f24538b = 0;
            this.f24536a = 0;
        }

        /* renamed from: b */
        public void mo7104b(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.f24537a.get();
            if (tabLayout != null) {
                int i3 = this.f24538b;
                boolean z = false;
                boolean z2 = i3 != 2 || this.f24536a == 1;
                if (!(i3 == 2 && this.f24536a == 0)) {
                    z = true;
                }
                tabLayout.setScrollPosition(i, f, z2, z);
            }
        }

        /* renamed from: c */
        public void mo7105c(int i) {
            this.f24536a = this.f24538b;
            this.f24538b = i;
        }

        /* renamed from: d */
        public void mo7106d(int i) {
            TabLayout tabLayout = (TabLayout) this.f24537a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f24538b;
                tabLayout.mo28955N(tabLayout.mo29035y(i), i2 == 0 || (i2 == 2 && this.f24536a == 0));
            }
        }
    }

    /* renamed from: com.google.android.material.tabs.TabLayout$n */
    public static class C4237n implements C4228f {

        /* renamed from: a */
        public final ViewPager f24539a;

        public C4237n(ViewPager viewPager) {
            this.f24539a = viewPager;
        }

        /* renamed from: a */
        public void mo15067a(C4232i iVar) {
        }

        /* renamed from: b */
        public void mo15068b(C4232i iVar) {
        }

        /* renamed from: c */
        public void mo15069c(@mr2 C4232i iVar) {
            this.f24539a.setCurrentItem(iVar.mo29093k());
        }
    }

    public TabLayout(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public TabLayout(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.tabStyle);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TabLayout(@com.onedelhi.secure.mr2 android.content.Context r12, @com.onedelhi.secure.ts2 android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            int r4 = f24433F
            android.content.Context r12 = com.onedelhi.secure.hf2.m50488c(r12, r13, r14, r4)
            r11.<init>(r12, r13, r14)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r11.f24479a = r12
            r12 = 0
            r11.f24494s = r12
            r0 = 2147483647(0x7fffffff, float:NaN)
            r11.f24496u = r0
            r6 = -1
            r11.f24462D = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.f24483b = r0
            com.onedelhi.secure.n33$b r0 = new com.onedelhi.secure.n33$b
            r1 = 12
            r0.<init>(r1)
            r11.f24478a = r0
            android.content.Context r7 = r11.getContext()
            r11.setHorizontalScrollBarEnabled(r12)
            com.google.android.material.tabs.TabLayout$h r8 = new com.google.android.material.tabs.TabLayout$h
            r8.<init>(r7)
            r11.f24473a = r8
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r6)
            super.addView(r8, r12, r0)
            int[] r2 = com.onedelhi.secure.fd3.C2165o.TabLayout
            r9 = 1
            int[] r5 = new int[r9]
            int r10 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabTextAppearance
            r5[r12] = r10
            r0 = r7
            r1 = r13
            r3 = r14
            android.content.res.TypedArray r13 = com.onedelhi.secure.ob4.m59195k(r0, r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            boolean r14 = r14 instanceof android.graphics.drawable.ColorDrawable
            if (r14 == 0) goto L_0x007d
            android.graphics.drawable.Drawable r14 = r11.getBackground()
            android.graphics.drawable.ColorDrawable r14 = (android.graphics.drawable.ColorDrawable) r14
            com.onedelhi.secure.bf2 r0 = new com.onedelhi.secure.bf2
            r0.<init>()
            int r14 = r14.getColor()
            android.content.res.ColorStateList r14 = android.content.res.ColorStateList.valueOf(r14)
            r0.mo31626o0(r14)
            r0.mo31599Z(r7)
            float r14 = com.onedelhi.secure.jt4.m18904R(r11)
            r0.mo31624n0(r14)
            com.onedelhi.secure.jt4.m18877I1(r11, r0)
        L_0x007d:
            int r14 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabIndicator
            android.graphics.drawable.Drawable r14 = com.onedelhi.secure.af2.m38614e(r7, r13, r14)
            r11.setSelectedTabIndicator((android.graphics.drawable.Drawable) r14)
            int r14 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabIndicatorColor
            int r14 = r13.getColor(r14, r12)
            r11.setSelectedTabIndicatorColor(r14)
            int r14 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabIndicatorHeight
            int r14 = r13.getDimensionPixelSize(r14, r6)
            r8.mo29075g(r14)
            int r14 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabIndicatorGravity
            int r14 = r13.getInt(r14, r12)
            r11.setSelectedTabIndicatorGravity(r14)
            int r14 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabIndicatorAnimationMode
            int r14 = r13.getInt(r14, r12)
            r11.setTabIndicatorAnimationMode(r14)
            int r14 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabIndicatorFullWidth
            boolean r14 = r13.getBoolean(r14, r9)
            r11.setTabIndicatorFullWidth(r14)
            int r14 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabPadding
            int r14 = r13.getDimensionPixelSize(r14, r12)
            r11.f24492q = r14
            r11.f24491p = r14
            r11.f24490o = r14
            r11.f24489n = r14
            int r0 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabPaddingStart
            int r14 = r13.getDimensionPixelSize(r0, r14)
            r11.f24489n = r14
            int r14 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabPaddingTop
            int r0 = r11.f24490o
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f24490o = r14
            int r14 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabPaddingEnd
            int r0 = r11.f24491p
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f24491p = r14
            int r14 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabPaddingBottom
            int r0 = r11.f24492q
            int r14 = r13.getDimensionPixelSize(r14, r0)
            r11.f24492q = r14
            int r14 = com.onedelhi.secure.fd3.C2164n.TextAppearance_Design_Tab
            int r14 = r13.getResourceId(r10, r14)
            r11.f24493r = r14
            int[] r0 = com.onedelhi.secure.za3.C4068m.TextAppearance
            android.content.res.TypedArray r14 = r7.obtainStyledAttributes(r14, r0)
            int r0 = com.onedelhi.secure.za3.C4068m.TextAppearance_android_textSize     // Catch:{ all -> 0x01b2 }
            int r0 = r14.getDimensionPixelSize(r0, r12)     // Catch:{ all -> 0x01b2 }
            float r0 = (float) r0     // Catch:{ all -> 0x01b2 }
            r11.f24464a = r0     // Catch:{ all -> 0x01b2 }
            int r0 = com.onedelhi.secure.za3.C4068m.TextAppearance_android_textColor     // Catch:{ all -> 0x01b2 }
            android.content.res.ColorStateList r0 = com.onedelhi.secure.af2.m38610a(r7, r14, r0)     // Catch:{ all -> 0x01b2 }
            r11.f24466a = r0     // Catch:{ all -> 0x01b2 }
            r14.recycle()
            int r14 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabTextColor
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x0117
            android.content.res.ColorStateList r14 = com.onedelhi.secure.af2.m38610a(r7, r13, r14)
            r11.f24466a = r14
        L_0x0117:
            int r14 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabSelectedTextColor
            boolean r0 = r13.hasValue(r14)
            if (r0 == 0) goto L_0x012f
            int r14 = r13.getColor(r14, r12)
            android.content.res.ColorStateList r0 = r11.f24466a
            int r0 = r0.getDefaultColor()
            android.content.res.ColorStateList r14 = m34029q(r0, r14)
            r11.f24466a = r14
        L_0x012f:
            int r14 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabIconTint
            android.content.res.ColorStateList r14 = com.onedelhi.secure.af2.m38610a(r7, r13, r14)
            r11.f24481b = r14
            int r14 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabIconTintMode
            int r14 = r13.getInt(r14, r6)
            r0 = 0
            android.graphics.PorterDuff$Mode r14 = com.onedelhi.secure.pv4.m61673m(r14, r0)
            r11.f24468a = r14
            int r14 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabRippleColor
            android.content.res.ColorStateList r14 = com.onedelhi.secure.af2.m38610a(r7, r13, r14)
            r11.f24485c = r14
            int r14 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabIndicatorAnimationDuration
            r0 = 300(0x12c, float:4.2E-43)
            int r14 = r13.getInt(r14, r0)
            r11.f24459A = r14
            int r14 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabMinWidth
            int r14 = r13.getDimensionPixelSize(r14, r6)
            r11.f24497v = r14
            int r14 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabMaxWidth
            int r14 = r13.getDimensionPixelSize(r14, r6)
            r11.f24498w = r14
            int r14 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabBackground
            int r14 = r13.getResourceId(r14, r12)
            r11.f24495t = r14
            int r14 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabContentStart
            int r14 = r13.getDimensionPixelSize(r14, r12)
            r11.f24500y = r14
            int r14 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabMode
            int r14 = r13.getInt(r14, r9)
            r11.f24461C = r14
            int r14 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabGravity
            int r14 = r13.getInt(r14, r12)
            r11.f24501z = r14
            int r14 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabInlineLabel
            boolean r14 = r13.getBoolean(r14, r12)
            r11.f24484b = r14
            int r14 = com.onedelhi.secure.fd3.C2165o.TabLayout_tabUnboundedRipple
            boolean r12 = r13.getBoolean(r14, r12)
            r11.f24487d = r12
            r13.recycle()
            android.content.res.Resources r12 = r11.getResources()
            int r13 = com.onedelhi.secure.fd3.C2156f.design_tab_text_size_2line
            int r13 = r12.getDimensionPixelSize(r13)
            float r13 = (float) r13
            r11.f24480b = r13
            int r13 = com.onedelhi.secure.fd3.C2156f.design_tab_scrollable_min_width
            int r12 = r12.getDimensionPixelSize(r13)
            r11.f24499x = r12
            r11.mo28988m()
            return
        L_0x01b2:
            r12 = move-exception
            r14.recycle()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @zk0(unit = 0)
    private int getDefaultHeight() {
        int size = this.f24479a.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                C4232i iVar = this.f24479a.get(i);
                if (iVar != null && iVar.mo29090h() != null && !TextUtils.isEmpty(iVar.mo29096n())) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return (!z || this.f24484b) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.f24497v;
        if (i != -1) {
            return i;
        }
        int i2 = this.f24461C;
        if (i2 == 0 || i2 == 2) {
            return this.f24499x;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f24473a.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    @mr2
    /* renamed from: q */
    public static ColorStateList m34029q(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f24473a.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f24473a.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    /* renamed from: A */
    public boolean mo28942A() {
        return this.f24484b;
    }

    /* renamed from: B */
    public final boolean mo28943B() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    /* renamed from: C */
    public boolean mo28944C() {
        return this.f24486c;
    }

    @mr2
    /* renamed from: D */
    public C4232i mo28945D() {
        C4232i s = mo29000s();
        s.f24530a = this;
        s.f24529a = mo29030t(s);
        if (s.f24535c != -1) {
            s.f24529a.setId(s.f24535c);
        }
        return s;
    }

    /* renamed from: E */
    public void mo28946E() {
        int currentItem;
        mo28948G();
        ay2 ay2 = this.f24477a;
        if (ay2 != null) {
            int e = ay2.mo13317e();
            for (int i = 0; i < e; i++) {
                mo28970g(mo28945D().mo29085D(this.f24477a.mo13319g(i)), false);
            }
            ViewPager viewPager = this.f24470a;
            if (viewPager != null && e > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                mo28954M(mo29035y(currentItem));
            }
        }
    }

    /* renamed from: F */
    public boolean mo28947F(C4232i iVar) {
        return f24455b.mo20817a(iVar);
    }

    /* renamed from: G */
    public void mo28948G() {
        for (int childCount = this.f24473a.getChildCount() - 1; childCount >= 0; childCount--) {
            mo28953L(childCount);
        }
        Iterator<C4232i> it = this.f24479a.iterator();
        while (it.hasNext()) {
            C4232i next = it.next();
            it.remove();
            next.mo29099q();
            mo28947F(next);
        }
        this.f24474a = null;
    }

    @Deprecated
    /* renamed from: H */
    public void mo28949H(@ts2 C4225c cVar) {
        this.f24483b.remove(cVar);
    }

    /* renamed from: I */
    public void mo28950I(@mr2 C4228f fVar) {
        mo28949H(fVar);
    }

    /* renamed from: J */
    public void mo28951J(@mr2 C4232i iVar) {
        if (iVar.f24530a == this) {
            mo28952K(iVar.mo29093k());
            return;
        }
        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }

    /* renamed from: K */
    public void mo28952K(int i) {
        C4232i iVar = this.f24474a;
        int k = iVar != null ? iVar.mo29093k() : 0;
        mo28953L(i);
        C4232i remove = this.f24479a.remove(i);
        if (remove != null) {
            remove.mo29099q();
            mo28947F(remove);
        }
        int size = this.f24479a.size();
        for (int i2 = i; i2 < size; i2++) {
            this.f24479a.get(i2).mo29108z(i2);
        }
        if (k == i) {
            mo28954M(this.f24479a.isEmpty() ? null : this.f24479a.get(Math.max(0, i - 1)));
        }
    }

    /* renamed from: L */
    public final void mo28953L(int i) {
        TabView tabView = (TabView) this.f24473a.getChildAt(i);
        this.f24473a.removeViewAt(i);
        if (tabView != null) {
            tabView.mo29055s();
            this.f24478a.mo20817a(tabView);
        }
        requestLayout();
    }

    /* renamed from: M */
    public void mo28954M(@ts2 C4232i iVar) {
        mo28955N(iVar, true);
    }

    /* renamed from: N */
    public void mo28955N(@ts2 C4232i iVar, boolean z) {
        C4232i iVar2 = this.f24474a;
        if (iVar2 != iVar) {
            int k = iVar != null ? iVar.mo29093k() : -1;
            if (z) {
                if ((iVar2 == null || iVar2.mo29093k() == -1) && k != -1) {
                    setScrollPosition(k, 0.0f, true);
                } else {
                    mo28986k(k);
                }
                if (k != -1) {
                    setSelectedTabView(k);
                }
            }
            this.f24474a = iVar;
            if (iVar2 != null) {
                mo29033w(iVar2);
            }
            if (iVar != null) {
                mo29032v(iVar);
            }
        } else if (iVar2 != null) {
            mo29031u(iVar);
            mo28986k(iVar.mo29093k());
        }
    }

    /* renamed from: O */
    public void mo28956O(@ts2 ay2 ay2, boolean z) {
        DataSetObserver dataSetObserver;
        ay2 ay22 = this.f24477a;
        if (!(ay22 == null || (dataSetObserver = this.f24467a) == null)) {
            ay22.mo13327u(dataSetObserver);
        }
        this.f24477a = ay2;
        if (z && ay2 != null) {
            if (this.f24467a == null) {
                this.f24467a = new C4229g();
            }
            ay2.mo13323m(this.f24467a);
        }
        mo28946E();
    }

    /* renamed from: P */
    public final void mo28957P(@ts2 ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.f24470a;
        if (viewPager2 != null) {
            C4236m mVar = this.f24475a;
            if (mVar != null) {
                viewPager2.mo7122O(mVar);
            }
            C4224b bVar = this.f24471a;
            if (bVar != null) {
                this.f24470a.mo7121N(bVar);
            }
        }
        C4225c cVar = this.f24482b;
        if (cVar != null) {
            mo28949H(cVar);
            this.f24482b = null;
        }
        if (viewPager != null) {
            this.f24470a = viewPager;
            if (this.f24475a == null) {
                this.f24475a = new C4236m(this);
            }
            this.f24475a.mo29109a();
            viewPager.mo7137c(this.f24475a);
            C4237n nVar = new C4237n(viewPager);
            this.f24482b = nVar;
            mo28965b(nVar);
            ay2 adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo28956O(adapter, z);
            }
            if (this.f24471a == null) {
                this.f24471a = new C4224b();
            }
            this.f24471a.mo29067b(z);
            viewPager.mo7136b(this.f24471a);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f24470a = null;
            mo28956O((ay2) null, false);
        }
        this.f24488e = z2;
    }

    /* renamed from: Q */
    public final void mo28958Q() {
        int size = this.f24479a.size();
        for (int i = 0; i < size; i++) {
            this.f24479a.get(i).mo29086E();
        }
    }

    /* renamed from: R */
    public final void mo28959R(@mr2 LinearLayout.LayoutParams layoutParams) {
        float f;
        if (this.f24461C == 1 && this.f24501z == 0) {
            layoutParams.width = 0;
            f = 1.0f;
        } else {
            layoutParams.width = -2;
            f = 0.0f;
        }
        layoutParams.weight = f;
    }

    /* renamed from: S */
    public void mo28960S(boolean z) {
        for (int i = 0; i < this.f24473a.getChildCount(); i++) {
            View childAt = this.f24473a.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            mo28959R((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public void addView(View view) {
        mo28985j(view);
    }

    public void addView(View view, int i) {
        mo28985j(view);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        mo28985j(view);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        mo28985j(view);
    }

    @Deprecated
    /* renamed from: b */
    public void mo28965b(@ts2 C4225c cVar) {
        if (!this.f24483b.contains(cVar)) {
            this.f24483b.add(cVar);
        }
    }

    /* renamed from: c */
    public void mo28966c(@mr2 C4228f fVar) {
        mo28965b(fVar);
    }

    /* renamed from: d */
    public void mo28967d(@mr2 C4232i iVar) {
        mo28970g(iVar, this.f24479a.isEmpty());
    }

    /* renamed from: e */
    public void mo28968e(@mr2 C4232i iVar, int i) {
        mo28969f(iVar, i, this.f24479a.isEmpty());
    }

    /* renamed from: f */
    public void mo28969f(@mr2 C4232i iVar, int i, boolean z) {
        if (iVar.f24530a == this) {
            mo28998p(iVar, i);
            mo28984i(iVar);
            if (z) {
                iVar.mo29100r();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* renamed from: g */
    public void mo28970g(@mr2 C4232i iVar, boolean z) {
        mo28969f(iVar, this.f24479a.size(), z);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        C4232i iVar = this.f24474a;
        if (iVar != null) {
            return iVar.mo29093k();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f24479a.size();
    }

    public int getTabGravity() {
        return this.f24501z;
    }

    @ts2
    public ColorStateList getTabIconTint() {
        return this.f24481b;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f24463E;
    }

    public int getTabIndicatorGravity() {
        return this.f24460B;
    }

    public int getTabMaxWidth() {
        return this.f24496u;
    }

    public int getTabMode() {
        return this.f24461C;
    }

    @ts2
    public ColorStateList getTabRippleColor() {
        return this.f24485c;
    }

    @mr2
    public Drawable getTabSelectedIndicator() {
        return this.f24469a;
    }

    @ts2
    public ColorStateList getTabTextColors() {
        return this.f24466a;
    }

    /* renamed from: h */
    public final void mo28983h(@mr2 TabItem tabItem) {
        C4232i D = mo28945D();
        CharSequence charSequence = tabItem.f24431a;
        if (charSequence != null) {
            D.mo29085D(charSequence);
        }
        Drawable drawable = tabItem.f24430a;
        if (drawable != null) {
            D.mo29106x(drawable);
        }
        int i = tabItem.f24432n;
        if (i != 0) {
            D.mo29103u(i);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            D.mo29102t(tabItem.getContentDescription());
        }
        mo28967d(D);
    }

    /* renamed from: i */
    public final void mo28984i(@mr2 C4232i iVar) {
        TabView tabView = iVar.f24529a;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.f24473a.addView(tabView, iVar.mo29093k(), mo28999r());
    }

    /* renamed from: j */
    public final void mo28985j(View view) {
        if (view instanceof TabItem) {
            mo28983h((TabItem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: k */
    public final void mo28986k(int i) {
        if (i != -1) {
            if (getWindowToken() == null || !jt4.m18914U0(this) || this.f24473a.mo29071d()) {
                setScrollPosition(i, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int n = mo28989n(i, 0.0f);
            if (scrollX != n) {
                mo29034x();
                this.f24465a.setIntValues(new int[]{scrollX, n});
                this.f24465a.start();
            }
            this.f24473a.mo29070c(i, this.f24459A);
        }
    }

    /* renamed from: l */
    public final void mo28987l(int i) {
        C4230h hVar;
        int i2;
        if (i != 0) {
            i2 = 1;
            if (i == 1) {
                hVar = this.f24473a;
                hVar.setGravity(i2);
            } else if (i != 2) {
                return;
            }
        } else {
            Log.w(f24456b, "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        }
        hVar = this.f24473a;
        i2 = ri1.f19869b;
        hVar.setGravity(i2);
    }

    /* renamed from: m */
    public final void mo28988m() {
        int i = this.f24461C;
        jt4.m18946d2(this.f24473a, (i == 0 || i == 2) ? Math.max(0, this.f24500y - this.f24489n) : 0, 0, 0, 0);
        int i2 = this.f24461C;
        if (i2 == 0) {
            mo28987l(this.f24501z);
        } else if (i2 == 1 || i2 == 2) {
            if (this.f24501z == 2) {
                Log.w(f24456b, "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f24473a.setGravity(1);
        }
        mo28960S(true);
    }

    /* renamed from: n */
    public final int mo28989n(int i, float f) {
        View childAt;
        int i2 = this.f24461C;
        int i3 = 0;
        if ((i2 != 0 && i2 != 2) || (childAt = this.f24473a.getChildAt(i)) == null) {
            return 0;
        }
        int i4 = i + 1;
        View childAt2 = i4 < this.f24473a.getChildCount() ? this.f24473a.getChildAt(i4) : null;
        int width = childAt.getWidth();
        if (childAt2 != null) {
            i3 = childAt2.getWidth();
        }
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) (((float) (width + i3)) * 0.5f * f);
        return jt4.m18928Z(this) == 0 ? left + i5 : left - i5;
    }

    /* renamed from: o */
    public void mo28990o() {
        this.f24483b.clear();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cf2.m40864e(this);
        if (this.f24470a == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                mo28957P((ViewPager) parent, true, true);
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f24488e) {
            setupWithViewPager((ViewPager) null);
            this.f24488e = false;
        }
    }

    public void onDraw(@mr2 Canvas canvas) {
        for (int i = 0; i < this.f24473a.getChildCount(); i++) {
            View childAt = this.f24473a.getChildAt(i);
            if (childAt instanceof TabView) {
                ((TabView) childAt).mo29046m(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public void onInitializeAccessibilityNodeInfo(@mr2 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1638a2.m10547X1(accessibilityNodeInfo).mo12553Y0(C1638a2.C1640b.m10703f(1, getTabCount(), false, 1));
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return mo28943B() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r0 != 2) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.onedelhi.secure.pv4.m61665e(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002e
            if (r1 == 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0041
        L_0x002e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L_0x0041
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L_0x0041
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L_0x0041:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L_0x005f
            int r1 = r6.f24498w
            if (r1 <= 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.onedelhi.secure.pv4.m61665e(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x005d:
            r6.f24496u = r1
        L_0x005f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto L_0x00ad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f24461C
            if (r0 == 0) goto L_0x0082
            if (r0 == r5) goto L_0x0076
            r1 = 2
            if (r0 == r1) goto L_0x0082
            goto L_0x008d
        L_0x0076:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L_0x008d
        L_0x0080:
            r4 = 1
            goto L_0x008d
        L_0x0082:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L_0x008d
            goto L_0x0080
        L_0x008d:
            if (r4 == 0) goto L_0x00ad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || mo28943B()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: p */
    public final void mo28998p(@mr2 C4232i iVar, int i) {
        iVar.mo29108z(i);
        this.f24479a.add(i, iVar);
        int size = this.f24479a.size();
        while (true) {
            i++;
            if (i < size) {
                this.f24479a.get(i).mo29108z(i);
            } else {
                return;
            }
        }
    }

    @mr2
    /* renamed from: r */
    public final LinearLayout.LayoutParams mo28999r() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        mo28959R(layoutParams);
        return layoutParams;
    }

    /* renamed from: s */
    public C4232i mo29000s() {
        C4232i b = f24455b.mo20818b();
        return b == null ? new C4232i() : b;
    }

    @sj3(21)
    public void setElevation(float f) {
        super.setElevation(f);
        cf2.m40863d(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f24484b != z) {
            this.f24484b = z;
            for (int i = 0; i < this.f24473a.getChildCount(); i++) {
                View childAt = this.f24473a.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).mo29064z();
                }
            }
            mo28988m();
        }
    }

    public void setInlineLabelResource(@C2530jn int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(@ts2 C4225c cVar) {
        C4225c cVar2 = this.f24472a;
        if (cVar2 != null) {
            mo28949H(cVar2);
        }
        this.f24472a = cVar;
        if (cVar != null) {
            mo28965b(cVar);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(@ts2 C4228f fVar) {
        setOnTabSelectedListener((C4225c) fVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        mo29034x();
        this.f24465a.addListener(animatorListener);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f24473a.getChildCount()) {
            if (z2) {
                this.f24473a.mo29074f(i, f);
            }
            ValueAnimator valueAnimator = this.f24465a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f24465a.cancel();
            }
            scrollTo(i < 0 ? 0 : mo28989n(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public void setSelectedTabIndicator(@dp0 int i) {
        setSelectedTabIndicator(i != 0 ? C3129p8.m24529b(getContext(), i) : null);
    }

    public void setSelectedTabIndicator(@ts2 Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = wo0.m30989r(drawable).mutate();
        this.f24469a = mutate;
        kp0.m19974i(mutate, this.f24494s);
        int i = this.f24462D;
        if (i == -1) {
            i = this.f24469a.getIntrinsicHeight();
        }
        this.f24473a.mo29075g(i);
    }

    public void setSelectedTabIndicatorColor(@d10 int i) {
        this.f24494s = i;
        kp0.m19974i(this.f24469a, i);
        mo28960S(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f24460B != i) {
            this.f24460B = i;
            jt4.m18985n1(this.f24473a);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f24462D = i;
        this.f24473a.mo29075g(i);
    }

    public void setTabGravity(int i) {
        if (this.f24501z != i) {
            this.f24501z = i;
            mo28988m();
        }
    }

    public void setTabIconTint(@ts2 ColorStateList colorStateList) {
        if (this.f24481b != colorStateList) {
            this.f24481b = colorStateList;
            mo28958Q();
        }
    }

    public void setTabIconTintResource(@k10 int i) {
        setTabIconTint(C3129p8.m24528a(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        C4238a aVar;
        this.f24463E = i;
        if (i == 0) {
            aVar = new C4238a();
        } else if (i == 1) {
            aVar = new gs0();
        } else if (i == 2) {
            aVar = new vz0();
        } else {
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
        this.f24476a = aVar;
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f24486c = z;
        this.f24473a.mo29073e();
        jt4.m18985n1(this.f24473a);
    }

    public void setTabMode(int i) {
        if (i != this.f24461C) {
            this.f24461C = i;
            mo28988m();
        }
    }

    public void setTabRippleColor(@ts2 ColorStateList colorStateList) {
        if (this.f24485c != colorStateList) {
            this.f24485c = colorStateList;
            for (int i = 0; i < this.f24473a.getChildCount(); i++) {
                View childAt = this.f24473a.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).mo29063y(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@k10 int i) {
        setTabRippleColor(C3129p8.m24528a(getContext(), i));
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(m34029q(i, i2));
    }

    public void setTabTextColors(@ts2 ColorStateList colorStateList) {
        if (this.f24466a != colorStateList) {
            this.f24466a = colorStateList;
            mo28958Q();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@ts2 ay2 ay2) {
        mo28956O(ay2, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f24487d != z) {
            this.f24487d = z;
            for (int i = 0; i < this.f24473a.getChildCount(); i++) {
                View childAt = this.f24473a.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).mo29063y(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@C2530jn int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(@ts2 ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    public void setupWithViewPager(@ts2 ViewPager viewPager, boolean z) {
        mo28957P(viewPager, z, false);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @mr2
    /* renamed from: t */
    public final TabView mo29030t(@mr2 C4232i iVar) {
        n33.C2922a<TabView> aVar = this.f24478a;
        TabView b = aVar != null ? aVar.mo20818b() : null;
        if (b == null) {
            b = new TabView(getContext());
        }
        b.setTab(iVar);
        b.setFocusable(true);
        b.setMinimumWidth(getTabMinWidth());
        b.setContentDescription(TextUtils.isEmpty(iVar.f24534b) ? iVar.f24531a : iVar.f24534b);
        return b;
    }

    /* renamed from: u */
    public final void mo29031u(@mr2 C4232i iVar) {
        for (int size = this.f24483b.size() - 1; size >= 0; size--) {
            this.f24483b.get(size).mo15067a(iVar);
        }
    }

    /* renamed from: v */
    public final void mo29032v(@mr2 C4232i iVar) {
        for (int size = this.f24483b.size() - 1; size >= 0; size--) {
            this.f24483b.get(size).mo15069c(iVar);
        }
    }

    /* renamed from: w */
    public final void mo29033w(@mr2 C4232i iVar) {
        for (int size = this.f24483b.size() - 1; size >= 0; size--) {
            this.f24483b.get(size).mo15068b(iVar);
        }
    }

    /* renamed from: x */
    public final void mo29034x() {
        if (this.f24465a == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f24465a = valueAnimator;
            valueAnimator.setInterpolator(C1947d7.f10650b);
            this.f24465a.setDuration((long) this.f24459A);
            this.f24465a.addUpdateListener(new C4223a());
        }
    }

    @ts2
    /* renamed from: y */
    public C4232i mo29035y(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f24479a.get(i);
    }

    /* renamed from: z */
    public boolean mo29036z() {
        return this.f24487d;
    }
}
