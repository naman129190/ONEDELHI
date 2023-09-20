package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.C1622a;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.onedelhi.secure.C2402i7;
import com.onedelhi.secure.C2416i8;
import com.onedelhi.secure.C2837m8;
import com.onedelhi.secure.bf4;
import com.onedelhi.secure.bk0;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.ff4;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.k43;
import com.onedelhi.secure.k81;
import com.onedelhi.secure.mo1;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nl2;
import com.onedelhi.secure.nx3;
import com.onedelhi.secure.rx0;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.tg4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.tw3;
import com.onedelhi.secure.tx0;
import com.onedelhi.secure.uw3;
import com.onedelhi.secure.vy0;
import com.onedelhi.secure.wo0;
import com.onedelhi.secure.yk0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public class FloatingActionButton extends VisibilityAwareImageButton implements bf4, ff4, rx0, nx3, CoordinatorLayout.C0455b {

    /* renamed from: b */
    public static final String f8410b = "FloatingActionButton";

    /* renamed from: c */
    public static final String f8411c = "expandableWidgetHelper";

    /* renamed from: t */
    public static final int f8412t = fd3.C2164n.Widget_Design_FloatingActionButton;

    /* renamed from: u */
    public static final int f8413u = 1;

    /* renamed from: v */
    public static final int f8414v = 0;

    /* renamed from: w */
    public static final int f8415w = -1;

    /* renamed from: x */
    public static final int f8416x = 0;

    /* renamed from: y */
    public static final int f8417y = 470;
    @ts2

    /* renamed from: a */
    public ColorStateList f8418a;
    @ts2

    /* renamed from: a */
    public PorterDuff.Mode f8419a;

    /* renamed from: a */
    public final Rect f8420a;

    /* renamed from: a */
    public C1622a f8421a;
    @mr2

    /* renamed from: a */
    public final C2837m8 f8422a;
    @mr2

    /* renamed from: a */
    public final tx0 f8423a;
    @ts2

    /* renamed from: b */
    public ColorStateList f8424b;
    @ts2

    /* renamed from: b */
    public PorterDuff.Mode f8425b;

    /* renamed from: b */
    public final Rect f8426b;

    /* renamed from: b */
    public boolean f8427b;
    @ts2

    /* renamed from: c */
    public ColorStateList f8428c;

    /* renamed from: o */
    public int f8429o;

    /* renamed from: p */
    public int f8430p;

    /* renamed from: q */
    public int f8431q;

    /* renamed from: r */
    public int f8432r;

    /* renamed from: s */
    public int f8433s;

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: b */
        public static final boolean f8434b = true;

        /* renamed from: a */
        public Rect f8435a;

        /* renamed from: a */
        public C1618b f8436a;

        /* renamed from: a */
        public boolean f8437a;

        public BaseBehavior() {
            this.f8437a = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fd3.C2165o.FloatingActionButton_Behavior_Layout);
            this.f8437a = obtainStyledAttributes.getBoolean(fd3.C2165o.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: I */
        public static boolean m10400I(@mr2 View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0459f) {
                return ((CoordinatorLayout.C0459f) layoutParams).mo3676f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: G */
        public boolean mo3643b(@mr2 CoordinatorLayout coordinatorLayout, @mr2 FloatingActionButton floatingActionButton, @mr2 Rect rect) {
            Rect rect2 = floatingActionButton.f8420a;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: H */
        public boolean mo12340H() {
            return this.f8437a;
        }

        /* renamed from: J */
        public final void mo12341J(@mr2 CoordinatorLayout coordinatorLayout, @mr2 FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f8420a;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.C0459f fVar = (CoordinatorLayout.C0459f) floatingActionButton.getLayoutParams();
                int i = 0;
                int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= fVar.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                    i = rect.bottom;
                } else if (floatingActionButton.getTop() <= fVar.topMargin) {
                    i = -rect.top;
                }
                if (i != 0) {
                    jt4.m18953f1(floatingActionButton, i);
                }
                if (i2 != 0) {
                    jt4.m18949e1(floatingActionButton, i2);
                }
            }
        }

        /* renamed from: K */
        public boolean mo3649i(CoordinatorLayout coordinatorLayout, @mr2 FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                mo12347P(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!m10400I(view)) {
                return false;
            } else {
                mo12348Q(view, floatingActionButton);
                return false;
            }
        }

        /* renamed from: L */
        public boolean mo3653m(@mr2 CoordinatorLayout coordinatorLayout, @mr2 FloatingActionButton floatingActionButton, int i) {
            List<View> w = coordinatorLayout.mo3633w(floatingActionButton);
            int size = w.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = w.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m10400I(view) && mo12348Q(view, floatingActionButton)) {
                        break;
                    }
                } else if (mo12347P(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo3583N(floatingActionButton, i);
            mo12341J(coordinatorLayout, floatingActionButton);
            return true;
        }

        /* renamed from: M */
        public void mo12344M(boolean z) {
            this.f8437a = z;
        }

        @hw4
        /* renamed from: N */
        public void mo12345N(C1618b bVar) {
            this.f8436a = bVar;
        }

        /* renamed from: O */
        public final boolean mo12346O(@mr2 View view, @mr2 FloatingActionButton floatingActionButton) {
            return this.f8437a && ((CoordinatorLayout.C0459f) floatingActionButton.getLayoutParams()).mo3675e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        /* renamed from: P */
        public final boolean mo12347P(CoordinatorLayout coordinatorLayout, @mr2 AppBarLayout appBarLayout, @mr2 FloatingActionButton floatingActionButton) {
            if (!mo12346O(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f8435a == null) {
                this.f8435a = new Rect();
            }
            Rect rect = this.f8435a;
            bk0.m40127a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.mo12296p(this.f8436a, false);
                return true;
            }
            floatingActionButton.mo12259B(this.f8436a, false);
            return true;
        }

        /* renamed from: Q */
        public final boolean mo12348Q(@mr2 View view, @mr2 FloatingActionButton floatingActionButton) {
            if (!mo12346O(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0459f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.mo12296p(this.f8436a, false);
                return true;
            }
            floatingActionButton.mo12259B(this.f8436a, false);
            return true;
        }

        /* renamed from: h */
        public void mo3648h(@mr2 CoordinatorLayout.C0459f fVar) {
            if (fVar.f3231f == 0) {
                fVar.f3231f = 80;
            }
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: G */
        public /* bridge */ /* synthetic */ boolean mo12339G(@mr2 CoordinatorLayout coordinatorLayout, @mr2 FloatingActionButton floatingActionButton, @mr2 Rect rect) {
            return super.mo3643b(coordinatorLayout, floatingActionButton, rect);
        }

        /* renamed from: H */
        public /* bridge */ /* synthetic */ boolean mo12340H() {
            return super.mo12340H();
        }

        /* renamed from: K */
        public /* bridge */ /* synthetic */ boolean mo12342K(CoordinatorLayout coordinatorLayout, @mr2 FloatingActionButton floatingActionButton, View view) {
            return super.mo3649i(coordinatorLayout, floatingActionButton, view);
        }

        /* renamed from: L */
        public /* bridge */ /* synthetic */ boolean mo12343L(@mr2 CoordinatorLayout coordinatorLayout, @mr2 FloatingActionButton floatingActionButton, int i) {
            return super.mo3653m(coordinatorLayout, floatingActionButton, i);
        }

        /* renamed from: M */
        public /* bridge */ /* synthetic */ void mo12344M(boolean z) {
            super.mo12344M(z);
        }

        @hw4
        /* renamed from: N */
        public /* bridge */ /* synthetic */ void mo12345N(C1618b bVar) {
            super.mo12345N(bVar);
        }

        /* renamed from: h */
        public /* bridge */ /* synthetic */ void mo3648h(@mr2 CoordinatorLayout.C0459f fVar) {
            super.mo3648h(fVar);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$a */
    public class C1617a implements C1622a.C1633k {

        /* renamed from: a */
        public final /* synthetic */ C1618b f8438a;

        public C1617a(C1618b bVar) {
            this.f8438a = bVar;
        }

        /* renamed from: a */
        public void mo12349a() {
            this.f8438a.mo11182a(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo12350b() {
            this.f8438a.mo11183b(FloatingActionButton.this);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$b */
    public static abstract class C1618b {
        /* renamed from: a */
        public void mo11182a(FloatingActionButton floatingActionButton) {
        }

        /* renamed from: b */
        public void mo11183b(FloatingActionButton floatingActionButton) {
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$c */
    public class C1619c implements tw3 {
        public C1619c() {
        }

        /* renamed from: a */
        public void mo12351a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.f8420a.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.f8432r, i2 + FloatingActionButton.this.f8432r, i3 + FloatingActionButton.this.f8432r, i4 + FloatingActionButton.this.f8432r);
        }

        /* renamed from: b */
        public void mo12352b(@ts2 Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        /* renamed from: c */
        public boolean mo12353c() {
            return FloatingActionButton.this.f8427b;
        }

        /* renamed from: p0 */
        public float mo12354p0() {
            return ((float) FloatingActionButton.this.getSizeDimension()) / 2.0f;
        }
    }

    @hl3({hl3.C2354a.f13187b})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$d */
    public @interface C1620d {
    }

    /* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$e */
    public class C1621e<T extends FloatingActionButton> implements C1622a.C1632j {
        @mr2

        /* renamed from: a */
        public final tg4<T> f8442a;

        public C1621e(@mr2 tg4<T> tg4) {
            this.f8442a = tg4;
        }

        /* renamed from: a */
        public void mo12355a() {
            this.f8442a.mo11176b(FloatingActionButton.this);
        }

        /* renamed from: b */
        public void mo12356b() {
            this.f8442a.mo11175a(FloatingActionButton.this);
        }

        public boolean equals(@ts2 Object obj) {
            return (obj instanceof C1621e) && ((C1621e) obj).f8442a.equals(this.f8442a);
        }

        public int hashCode() {
            return this.f8442a.hashCode();
        }
    }

    public FloatingActionButton(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public FloatingActionButton(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.floatingActionButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FloatingActionButton(@com.onedelhi.secure.mr2 android.content.Context r11, @com.onedelhi.secure.ts2 android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = f8412t
            android.content.Context r11 = com.onedelhi.secure.hf2.m50488c(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f8420a = r11
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.f8426b = r11
            android.content.Context r11 = r10.getContext()
            int[] r2 = com.onedelhi.secure.fd3.C2165o.FloatingActionButton
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r11
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = com.onedelhi.secure.ob4.m59195k(r0, r1, r2, r3, r4, r5)
            int r1 = com.onedelhi.secure.fd3.C2165o.FloatingActionButton_backgroundTint
            android.content.res.ColorStateList r1 = com.onedelhi.secure.af2.m38610a(r11, r0, r1)
            r10.f8418a = r1
            int r1 = com.onedelhi.secure.fd3.C2165o.FloatingActionButton_backgroundTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            r3 = 0
            android.graphics.PorterDuff$Mode r1 = com.onedelhi.secure.pv4.m61673m(r1, r3)
            r10.f8419a = r1
            int r1 = com.onedelhi.secure.fd3.C2165o.FloatingActionButton_rippleColor
            android.content.res.ColorStateList r1 = com.onedelhi.secure.af2.m38610a(r11, r0, r1)
            r10.f8428c = r1
            int r1 = com.onedelhi.secure.fd3.C2165o.FloatingActionButton_fabSize
            int r1 = r0.getInt(r1, r2)
            r10.f8430p = r1
            int r1 = com.onedelhi.secure.fd3.C2165o.FloatingActionButton_fabCustomSize
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r10.f8431q = r1
            int r1 = com.onedelhi.secure.fd3.C2165o.FloatingActionButton_borderWidth
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r10.f8429o = r1
            int r1 = com.onedelhi.secure.fd3.C2165o.FloatingActionButton_elevation
            r2 = 0
            float r1 = r0.getDimension(r1, r2)
            int r3 = com.onedelhi.secure.fd3.C2165o.FloatingActionButton_hoveredFocusedTranslationZ
            float r3 = r0.getDimension(r3, r2)
            int r4 = com.onedelhi.secure.fd3.C2165o.FloatingActionButton_pressedTranslationZ
            float r2 = r0.getDimension(r4, r2)
            int r4 = com.onedelhi.secure.fd3.C2165o.FloatingActionButton_useCompatPadding
            boolean r4 = r0.getBoolean(r4, r7)
            r10.f8427b = r4
            android.content.res.Resources r4 = r10.getResources()
            int r5 = com.onedelhi.secure.fd3.C2156f.mtrl_fab_min_touch_target
            int r4 = r4.getDimensionPixelSize(r5)
            int r5 = com.onedelhi.secure.fd3.C2165o.FloatingActionButton_maxImageSize
            int r5 = r0.getDimensionPixelSize(r5, r7)
            r10.setMaxImageSize(r5)
            int r5 = com.onedelhi.secure.fd3.C2165o.FloatingActionButton_showMotionSpec
            com.onedelhi.secure.nl2 r5 = com.onedelhi.secure.nl2.m22934c(r11, r0, r5)
            int r8 = com.onedelhi.secure.fd3.C2165o.FloatingActionButton_hideMotionSpec
            com.onedelhi.secure.nl2 r8 = com.onedelhi.secure.nl2.m22934c(r11, r0, r8)
            com.onedelhi.secure.z80 r9 = com.onedelhi.secure.uw3.f36304e
            com.onedelhi.secure.uw3$b r11 = com.onedelhi.secure.uw3.m67449g(r11, r12, r13, r6, r9)
            com.onedelhi.secure.uw3 r11 = r11.mo45845m()
            int r6 = com.onedelhi.secure.fd3.C2165o.FloatingActionButton_ensureMinTouchTargetSize
            boolean r6 = r0.getBoolean(r6, r7)
            int r7 = com.onedelhi.secure.fd3.C2165o.FloatingActionButton_android_enabled
            r9 = 1
            boolean r7 = r0.getBoolean(r7, r9)
            r10.setEnabled(r7)
            r0.recycle()
            com.onedelhi.secure.m8 r0 = new com.onedelhi.secure.m8
            r0.<init>(r10)
            r10.f8422a = r0
            r0.mo20175g(r12, r13)
            com.onedelhi.secure.tx0 r12 = new com.onedelhi.secure.tx0
            r12.<init>(r10)
            r10.f8423a = r12
            com.google.android.material.floatingactionbutton.a r12 = r10.getImpl()
            r12.mo12385a0(r11)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            android.content.res.ColorStateList r12 = r10.f8418a
            android.graphics.PorterDuff$Mode r13 = r10.f8419a
            android.content.res.ColorStateList r0 = r10.f8428c
            int r7 = r10.f8429o
            r11.mo12415x(r12, r13, r0, r7)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            r11.mo12381W(r4)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            r11.mo12375Q(r1)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            r11.mo12378T(r3)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            r11.mo12382X(r2)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            r11.mo12386b0(r5)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            r11.mo12377S(r8)
            com.google.android.material.floatingactionbutton.a r11 = r10.getImpl()
            r11.mo12376R(r6)
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.MATRIX
            r10.setScaleType(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.FloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private C1622a getImpl() {
        if (this.f8421a == null) {
            this.f8421a = mo12283j();
        }
        return this.f8421a;
    }

    /* renamed from: x */
    public static int m10374x(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: A */
    public void mo12258A(@ts2 C1618b bVar) {
        mo12259B(bVar, true);
    }

    /* renamed from: B */
    public void mo12259B(@ts2 C1618b bVar, boolean z) {
        getImpl().mo12392f0(mo12260C(bVar), z);
    }

    @ts2
    /* renamed from: C */
    public final C1622a.C1633k mo12260C(@ts2 C1618b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C1617a(bVar);
    }

    /* renamed from: a */
    public boolean mo12261a(boolean z) {
        return this.f8423a.mo25335f(z);
    }

    /* renamed from: b */
    public boolean mo12262b() {
        return this.f8423a.mo25332c();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().mo12363E(getDrawableState());
    }

    /* renamed from: f */
    public void mo12264f(@mr2 Animator.AnimatorListener animatorListener) {
        getImpl().mo12389e(animatorListener);
    }

    /* renamed from: g */
    public void mo12265g(@mr2 Animator.AnimatorListener animatorListener) {
        getImpl().mo12391f(animatorListener);
    }

    @ts2
    public ColorStateList getBackgroundTintList() {
        return this.f8418a;
    }

    @ts2
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f8419a;
    }

    @mr2
    public CoordinatorLayout.Behavior<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().mo12405n();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().mo12408q();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().mo12411t();
    }

    @ts2
    public Drawable getContentBackground() {
        return getImpl().mo12404m();
    }

    @e83
    public int getCustomSize() {
        return this.f8431q;
    }

    public int getExpandedComponentIdHint() {
        return this.f8423a.mo25331b();
    }

    @ts2
    public nl2 getHideMotionSpec() {
        return getImpl().mo12407p();
    }

    @Deprecated
    @d10
    public int getRippleColor() {
        ColorStateList colorStateList = this.f8428c;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @ts2
    public ColorStateList getRippleColorStateList() {
        return this.f8428c;
    }

    @mr2
    public uw3 getShapeAppearanceModel() {
        return (uw3) k43.m19455l(getImpl().mo12412u());
    }

    @ts2
    public nl2 getShowMotionSpec() {
        return getImpl().mo12413v();
    }

    public int getSize() {
        return this.f8430p;
    }

    public int getSizeDimension() {
        return mo12287m(this.f8430p);
    }

    @ts2
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @ts2
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @ts2
    public ColorStateList getSupportImageTintList() {
        return this.f8424b;
    }

    @ts2
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f8425b;
    }

    public boolean getUseCompatPadding() {
        return this.f8427b;
    }

    /* renamed from: h */
    public void mo12281h(@mr2 tg4<? extends FloatingActionButton> tg4) {
        getImpl().mo12393g(new C1621e(tg4));
    }

    /* renamed from: i */
    public void mo12282i() {
        setCustomSize(0);
    }

    @mr2
    /* renamed from: j */
    public final C1622a mo12283j() {
        return new k81(this, new C1619c());
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().mo12359A();
    }

    @Deprecated
    /* renamed from: k */
    public boolean mo12285k(@mr2 Rect rect) {
        if (!jt4.m18914U0(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        mo12299s(rect);
        return true;
    }

    /* renamed from: l */
    public void mo12286l(@mr2 Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        mo12299s(rect);
    }

    /* renamed from: m */
    public final int mo12287m(int i) {
        int i2 = this.f8431q;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? mo12287m(1) : mo12287m(0);
        }
        return resources.getDimensionPixelSize(i != 1 ? fd3.C2156f.design_fab_size_normal : fd3.C2156f.design_fab_size_mini);
    }

    /* renamed from: n */
    public void mo12288n() {
        mo12289o((C1618b) null);
    }

    /* renamed from: o */
    public void mo12289o(@ts2 C1618b bVar) {
        mo12296p(bVar, true);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().mo12360B();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().mo12362D();
    }

    public void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.f8432r = (sizeDimension - this.f8433s) / 2;
        getImpl().mo12398i0();
        int min = Math.min(m10374x(sizeDimension, i), m10374x(sizeDimension, i2));
        Rect rect = this.f8420a;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof vy0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        vy0 vy0 = (vy0) parcelable;
        super.onRestoreInstanceState(vy0.mo14959a());
        this.f8423a.mo25333d((Bundle) k43.m19455l(vy0.f36780a.get(f8411c)));
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        vy0 vy0 = new vy0(onSaveInstanceState);
        vy0.f36780a.put(f8411c, this.f8423a.mo25334e());
        return vy0;
    }

    public boolean onTouchEvent(@mr2 MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !mo12285k(this.f8426b) || this.f8426b.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: p */
    public void mo12296p(@ts2 C1618b bVar, boolean z) {
        getImpl().mo12414w(mo12260C(bVar), z);
    }

    /* renamed from: q */
    public boolean mo12297q() {
        return getImpl().mo12416y();
    }

    /* renamed from: r */
    public boolean mo12298r() {
        return getImpl().mo12417z();
    }

    /* renamed from: s */
    public final void mo12299s(@mr2 Rect rect) {
        int i = rect.left;
        Rect rect2 = this.f8420a;
        rect.left = i + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public void setBackgroundColor(int i) {
        Log.i(f8410b, "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i(f8410b, "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i(f8410b, "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(@ts2 ColorStateList colorStateList) {
        if (this.f8418a != colorStateList) {
            this.f8418a = colorStateList;
            getImpl().mo12373O(colorStateList);
        }
    }

    public void setBackgroundTintMode(@ts2 PorterDuff.Mode mode) {
        if (this.f8419a != mode) {
            this.f8419a = mode;
            getImpl().mo12374P(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().mo12375Q(f);
    }

    public void setCompatElevationResource(@yk0 int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        getImpl().mo12378T(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(@yk0 int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        getImpl().mo12382X(f);
    }

    public void setCompatPressedTranslationZResource(@yk0 int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(@e83 int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.f8431q) {
            this.f8431q = i;
            requestLayout();
        }
    }

    @sj3(21)
    public void setElevation(float f) {
        super.setElevation(f);
        getImpl().mo12400j0(f);
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().mo12406o()) {
            getImpl().mo12376R(z);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(@mo1 int i) {
        this.f8423a.mo25336g(i);
    }

    public void setHideMotionSpec(@ts2 nl2 nl2) {
        getImpl().mo12377S(nl2);
    }

    public void setHideMotionSpecResource(@C2402i7 int i) {
        setHideMotionSpec(nl2.m22935d(getContext(), i));
    }

    public void setImageDrawable(@ts2 Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().mo12396h0();
            if (this.f8424b != null) {
                mo12333t();
            }
        }
    }

    public void setImageResource(@dp0 int i) {
        this.f8422a.mo20177i(i);
        mo12333t();
    }

    public void setMaxImageSize(int i) {
        this.f8433s = i;
        getImpl().mo12380V(i);
    }

    public void setRippleColor(@d10 int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(@ts2 ColorStateList colorStateList) {
        if (this.f8428c != colorStateList) {
            this.f8428c = colorStateList;
            getImpl().mo12383Y(this.f8428c);
        }
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().mo12367I();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().mo12367I();
    }

    @hw4
    @hl3({hl3.C2354a.f13187b})
    public void setShadowPaddingEnabled(boolean z) {
        getImpl().mo12384Z(z);
    }

    public void setShapeAppearanceModel(@mr2 uw3 uw3) {
        getImpl().mo12385a0(uw3);
    }

    public void setShowMotionSpec(@ts2 nl2 nl2) {
        getImpl().mo12386b0(nl2);
    }

    public void setShowMotionSpecResource(@C2402i7 int i) {
        setShowMotionSpec(nl2.m22935d(getContext(), i));
    }

    public void setSize(int i) {
        this.f8431q = 0;
        if (i != this.f8430p) {
            this.f8430p = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(@ts2 ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(@ts2 PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(@ts2 ColorStateList colorStateList) {
        if (this.f8424b != colorStateList) {
            this.f8424b = colorStateList;
            mo12333t();
        }
    }

    public void setSupportImageTintMode(@ts2 PorterDuff.Mode mode) {
        if (this.f8425b != mode) {
            this.f8425b = mode;
            mo12333t();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().mo12368J();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().mo12368J();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().mo12368J();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f8427b != z) {
            this.f8427b = z;
            getImpl().mo12361C();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* renamed from: t */
    public final void mo12333t() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f8424b;
            if (colorStateList == null) {
                wo0.m30974c(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f8425b;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C2416i8.m17331e(colorForState, mode));
        }
    }

    /* renamed from: u */
    public void mo12334u(@mr2 Animator.AnimatorListener animatorListener) {
        getImpl().mo12369K(animatorListener);
    }

    /* renamed from: v */
    public void mo12335v(@mr2 Animator.AnimatorListener animatorListener) {
        getImpl().mo12370L(animatorListener);
    }

    /* renamed from: w */
    public void mo12336w(@mr2 tg4<? extends FloatingActionButton> tg4) {
        getImpl().mo12371M(new C1621e(tg4));
    }

    /* renamed from: y */
    public boolean mo12337y() {
        return getImpl().mo12406o();
    }

    /* renamed from: z */
    public void mo12338z() {
        mo12258A((C1618b) null);
    }
}
