package com.onedelhi.secure;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.uw3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class le2 {

    /* renamed from: a */
    public static final double f15305a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a */
    public static final float f15306a = 1.5f;

    /* renamed from: d */
    public static final Drawable f15307d = (Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null);

    /* renamed from: e */
    public static final int f15308e = -1;

    /* renamed from: f */
    public static final int f15309f = 2;
    @zk0

    /* renamed from: a */
    public int f15310a;
    @ts2

    /* renamed from: a */
    public ColorStateList f15311a;
    @mr2

    /* renamed from: a */
    public final Rect f15312a = new Rect();
    @ts2

    /* renamed from: a */
    public Drawable f15313a;
    @ts2

    /* renamed from: a */
    public LayerDrawable f15314a;
    @mr2

    /* renamed from: a */
    public final MaterialCardView f15315a;
    @mr2

    /* renamed from: a */
    public final bf2 f15316a;
    @ts2

    /* renamed from: a */
    public uw3 f15317a;

    /* renamed from: a */
    public boolean f15318a = false;
    @zk0

    /* renamed from: b */
    public int f15319b;
    @ts2

    /* renamed from: b */
    public ColorStateList f15320b;
    @ts2

    /* renamed from: b */
    public Drawable f15321b;
    @mr2

    /* renamed from: b */
    public final bf2 f15322b;

    /* renamed from: b */
    public boolean f15323b;

    /* renamed from: c */
    public int f15324c;
    @ts2

    /* renamed from: c */
    public ColorStateList f15325c;
    @ts2

    /* renamed from: c */
    public Drawable f15326c;
    @ts2

    /* renamed from: c */
    public bf2 f15327c;
    @zk0

    /* renamed from: d */
    public int f15328d;
    @ts2

    /* renamed from: d */
    public bf2 f15329d;

    /* renamed from: com.onedelhi.secure.le2$a */
    public class C2733a extends InsetDrawable {
        public C2733a(Drawable drawable, int i, int i2, int i3, int i4) {
            super(drawable, i, i2, i3, i4);
        }

        public int getMinimumHeight() {
            return -1;
        }

        public int getMinimumWidth() {
            return -1;
        }

        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    public le2(@mr2 MaterialCardView materialCardView, AttributeSet attributeSet, int i, @e64 int i2) {
        this.f15315a = materialCardView;
        bf2 bf2 = new bf2(materialCardView.getContext(), attributeSet, i, i2);
        this.f15316a = bf2;
        bf2.mo31599Z(materialCardView.getContext());
        bf2.mo31641v0(-12303292);
        uw3.C6982b v = bf2.getShapeAppearanceModel().mo45824v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, fd3.C2165o.CardView, i, fd3.C2164n.CardView);
        int i3 = fd3.C2165o.CardView_cardCornerRadius;
        if (obtainStyledAttributes.hasValue(i3)) {
            v.mo45846o(obtainStyledAttributes.getDimension(i3, 0.0f));
        }
        this.f15322b = new bf2();
        mo19493V(v.mo45845m());
        obtainStyledAttributes.recycle();
    }

    @mr2
    /* renamed from: A */
    public Rect mo19472A() {
        return this.f15312a;
    }

    @mr2
    /* renamed from: B */
    public final Drawable mo19473B(Drawable drawable) {
        int i;
        int i2;
        if (this.f15315a.getUseCompatPadding()) {
            int ceil = (int) Math.ceil((double) mo19504d());
            i2 = (int) Math.ceil((double) mo19502c());
            i = ceil;
        } else {
            i2 = 0;
            i = 0;
        }
        return new C2733a(drawable, i2, i, i2, i);
    }

    /* renamed from: C */
    public boolean mo19474C() {
        return this.f15318a;
    }

    /* renamed from: D */
    public boolean mo19475D() {
        return this.f15323b;
    }

    /* renamed from: E */
    public final boolean mo19476E() {
        return (this.f15324c & 80) == 80;
    }

    /* renamed from: F */
    public final boolean mo19477F() {
        return (this.f15324c & 8388613) == 8388613;
    }

    /* renamed from: G */
    public void mo19478G(@mr2 TypedArray typedArray) {
        ColorStateList a = af2.m38610a(this.f15315a.getContext(), typedArray, fd3.C2165o.MaterialCardView_strokeColor);
        this.f15325c = a;
        if (a == null) {
            this.f15325c = ColorStateList.valueOf(-1);
        }
        this.f15328d = typedArray.getDimensionPixelSize(fd3.C2165o.MaterialCardView_strokeWidth, 0);
        boolean z = typedArray.getBoolean(fd3.C2165o.MaterialCardView_android_checkable, false);
        this.f15323b = z;
        this.f15315a.setLongClickable(z);
        this.f15320b = af2.m38610a(this.f15315a.getContext(), typedArray, fd3.C2165o.MaterialCardView_checkedIconTint);
        mo19485N(af2.m38614e(this.f15315a.getContext(), typedArray, fd3.C2165o.MaterialCardView_checkedIcon));
        mo19488Q(typedArray.getDimensionPixelSize(fd3.C2165o.MaterialCardView_checkedIconSize, 0));
        mo19487P(typedArray.getDimensionPixelSize(fd3.C2165o.MaterialCardView_checkedIconMargin, 0));
        this.f15324c = typedArray.getInteger(fd3.C2165o.MaterialCardView_checkedIconGravity, 8388661);
        ColorStateList a2 = af2.m38610a(this.f15315a.getContext(), typedArray, fd3.C2165o.MaterialCardView_rippleColor);
        this.f15311a = a2;
        if (a2 == null) {
            this.f15311a = ColorStateList.valueOf(oe2.m23718d(this.f15315a, fd3.C2153c.colorControlHighlight));
        }
        mo19482K(af2.m38610a(this.f15315a.getContext(), typedArray, fd3.C2165o.MaterialCardView_cardForegroundColor));
        mo19511g0();
        mo19505d0();
        mo19513h0();
        this.f15315a.setBackgroundInternal(mo19473B(this.f15316a));
        Drawable r = this.f15315a.isClickable() ? mo19523r() : this.f15322b;
        this.f15313a = r;
        this.f15315a.setForeground(mo19473B(r));
    }

    /* renamed from: H */
    public void mo19479H(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f15314a != null) {
            int i6 = 0;
            if (this.f15315a.getUseCompatPadding()) {
                i3 = (int) Math.ceil((double) (mo19504d() * 2.0f));
                i6 = (int) Math.ceil((double) (mo19502c() * 2.0f));
            } else {
                i3 = 0;
            }
            int i7 = mo19477F() ? ((i - this.f15310a) - this.f15319b) - i6 : this.f15310a;
            int i8 = mo19476E() ? this.f15310a : ((i2 - this.f15310a) - this.f15319b) - i3;
            int i9 = mo19477F() ? this.f15310a : ((i - this.f15310a) - this.f15319b) - i6;
            int i10 = mo19476E() ? ((i2 - this.f15310a) - this.f15319b) - i3 : this.f15310a;
            if (jt4.m18928Z(this.f15315a) == 1) {
                i5 = i9;
                i4 = i7;
            } else {
                i4 = i9;
                i5 = i7;
            }
            this.f15314a.setLayerInset(2, i5, i10, i4, i8);
        }
    }

    /* renamed from: I */
    public void mo19480I(boolean z) {
        this.f15318a = z;
    }

    /* renamed from: J */
    public void mo19481J(ColorStateList colorStateList) {
        this.f15316a.mo31626o0(colorStateList);
    }

    /* renamed from: K */
    public void mo19482K(@ts2 ColorStateList colorStateList) {
        bf2 bf2 = this.f15322b;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        bf2.mo31626o0(colorStateList);
    }

    /* renamed from: L */
    public void mo19483L(boolean z) {
        this.f15323b = z;
    }

    /* renamed from: M */
    public void mo19484M(boolean z) {
        Drawable drawable = this.f15321b;
        if (drawable != null) {
            drawable.setAlpha(z ? 255 : 0);
        }
    }

    /* renamed from: N */
    public void mo19485N(@ts2 Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = wo0.m30989r(drawable).mutate();
            this.f15321b = mutate;
            wo0.m30986o(mutate, this.f15320b);
            mo19484M(this.f15315a.isChecked());
        } else {
            this.f15321b = f15307d;
        }
        LayerDrawable layerDrawable = this.f15314a;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(fd3.C2158h.mtrl_card_checked_layer_id, this.f15321b);
        }
    }

    /* renamed from: O */
    public void mo19486O(int i) {
        this.f15324c = i;
        mo19479H(this.f15315a.getMeasuredWidth(), this.f15315a.getMeasuredHeight());
    }

    /* renamed from: P */
    public void mo19487P(@zk0 int i) {
        this.f15310a = i;
    }

    /* renamed from: Q */
    public void mo19488Q(@zk0 int i) {
        this.f15319b = i;
    }

    /* renamed from: R */
    public void mo19489R(@ts2 ColorStateList colorStateList) {
        this.f15320b = colorStateList;
        Drawable drawable = this.f15321b;
        if (drawable != null) {
            wo0.m30986o(drawable, colorStateList);
        }
    }

    /* renamed from: S */
    public void mo19490S(float f) {
        mo19493V(this.f15317a.mo45825w(f));
        this.f15313a.invalidateSelf();
        if (mo19499a0() || mo19497Z()) {
            mo19503c0();
        }
        if (mo19499a0()) {
            mo19509f0();
        }
    }

    /* renamed from: T */
    public void mo19491T(@d81(from = 0.0d, mo14561to = 1.0d) float f) {
        this.f15316a.mo31629p0(f);
        bf2 bf2 = this.f15322b;
        if (bf2 != null) {
            bf2.mo31629p0(f);
        }
        bf2 bf22 = this.f15329d;
        if (bf22 != null) {
            bf22.mo31629p0(f);
        }
    }

    /* renamed from: U */
    public void mo19492U(@ts2 ColorStateList colorStateList) {
        this.f15311a = colorStateList;
        mo19511g0();
    }

    /* renamed from: V */
    public void mo19493V(@mr2 uw3 uw3) {
        this.f15317a = uw3;
        this.f15316a.setShapeAppearanceModel(uw3);
        bf2 bf2 = this.f15316a;
        bf2.mo31639u0(!bf2.mo31604e0());
        bf2 bf22 = this.f15322b;
        if (bf22 != null) {
            bf22.setShapeAppearanceModel(uw3);
        }
        bf2 bf23 = this.f15329d;
        if (bf23 != null) {
            bf23.setShapeAppearanceModel(uw3);
        }
        bf2 bf24 = this.f15327c;
        if (bf24 != null) {
            bf24.setShapeAppearanceModel(uw3);
        }
    }

    /* renamed from: W */
    public void mo19494W(ColorStateList colorStateList) {
        if (this.f15325c != colorStateList) {
            this.f15325c = colorStateList;
            mo19513h0();
        }
    }

    /* renamed from: X */
    public void mo19495X(@zk0 int i) {
        if (i != this.f15328d) {
            this.f15328d = i;
            mo19513h0();
        }
    }

    /* renamed from: Y */
    public void mo19496Y(int i, int i2, int i3, int i4) {
        this.f15312a.set(i, i2, i3, i4);
        mo19503c0();
    }

    /* renamed from: Z */
    public final boolean mo19497Z() {
        return this.f15315a.getPreventCornerOverlap() && !mo19506e();
    }

    /* renamed from: a */
    public final float mo19498a() {
        return Math.max(Math.max(mo19500b(this.f15317a.mo45819q(), this.f15316a.mo31592S()), mo19500b(this.f15317a.mo45821s(), this.f15316a.mo31593T())), Math.max(mo19500b(this.f15317a.mo45814k(), this.f15316a.mo31638u()), mo19500b(this.f15317a.mo45812i(), this.f15316a.mo31636t())));
    }

    /* renamed from: a0 */
    public final boolean mo19499a0() {
        return this.f15315a.getPreventCornerOverlap() && mo19506e() && this.f15315a.getUseCompatPadding();
    }

    /* renamed from: b */
    public final float mo19500b(a90 a90, float f) {
        if (a90 instanceof nn3) {
            return (float) ((1.0d - f15305a) * ((double) f));
        }
        if (a90 instanceof sc0) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    /* renamed from: b0 */
    public void mo19501b0() {
        Drawable drawable = this.f15313a;
        Drawable r = this.f15315a.isClickable() ? mo19523r() : this.f15322b;
        this.f15313a = r;
        if (drawable != r) {
            mo19507e0(r);
        }
    }

    /* renamed from: c */
    public final float mo19502c() {
        return this.f15315a.getMaxCardElevation() + (mo19499a0() ? mo19498a() : 0.0f);
    }

    /* renamed from: c0 */
    public void mo19503c0() {
        int a = (int) ((mo19497Z() || mo19499a0() ? mo19498a() : 0.0f) - mo19525t());
        MaterialCardView materialCardView = this.f15315a;
        Rect rect = this.f15312a;
        materialCardView.mo11461l(rect.left + a, rect.top + a, rect.right + a, rect.bottom + a);
    }

    /* renamed from: d */
    public final float mo19504d() {
        return (this.f15315a.getMaxCardElevation() * 1.5f) + (mo19499a0() ? mo19498a() : 0.0f);
    }

    /* renamed from: d0 */
    public void mo19505d0() {
        this.f15316a.mo31624n0(this.f15315a.getCardElevation());
    }

    /* renamed from: e */
    public final boolean mo19506e() {
        return this.f15316a.mo31604e0();
    }

    /* renamed from: e0 */
    public final void mo19507e0(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 23 || !(this.f15315a.getForeground() instanceof InsetDrawable)) {
            this.f15315a.setForeground(mo19473B(drawable));
        } else {
            ((InsetDrawable) this.f15315a.getForeground()).setDrawable(drawable);
        }
    }

    @mr2
    /* renamed from: f */
    public final Drawable mo19508f() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        bf2 h = mo19512h();
        this.f15327c = h;
        h.mo31626o0(this.f15311a);
        stateListDrawable.addState(new int[]{16842919}, this.f15327c);
        return stateListDrawable;
    }

    /* renamed from: f0 */
    public void mo19509f0() {
        if (!mo19474C()) {
            this.f15315a.setBackgroundInternal(mo19473B(this.f15316a));
        }
        this.f15315a.setForeground(mo19473B(this.f15313a));
    }

    @mr2
    /* renamed from: g */
    public final Drawable mo19510g() {
        if (!um3.f36190a) {
            return mo19508f();
        }
        this.f15329d = mo19512h();
        return new RippleDrawable(this.f15311a, (Drawable) null, this.f15329d);
    }

    /* renamed from: g0 */
    public final void mo19511g0() {
        Drawable drawable;
        if (!um3.f36190a || (drawable = this.f15326c) == null) {
            bf2 bf2 = this.f15327c;
            if (bf2 != null) {
                bf2.mo31626o0(this.f15311a);
                return;
            }
            return;
        }
        ((RippleDrawable) drawable).setColor(this.f15311a);
    }

    @mr2
    /* renamed from: h */
    public final bf2 mo19512h() {
        return new bf2(this.f15317a);
    }

    /* renamed from: h0 */
    public void mo19513h0() {
        this.f15322b.mo31568E0((float) this.f15328d, this.f15325c);
    }

    @sj3(api = 23)
    /* renamed from: i */
    public void mo19514i() {
        Drawable drawable = this.f15326c;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i = bounds.bottom;
            this.f15326c.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            this.f15326c.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    @mr2
    /* renamed from: j */
    public bf2 mo19515j() {
        return this.f15316a;
    }

    /* renamed from: k */
    public ColorStateList mo19516k() {
        return this.f15316a.mo31646y();
    }

    /* renamed from: l */
    public ColorStateList mo19517l() {
        return this.f15322b.mo31646y();
    }

    @ts2
    /* renamed from: m */
    public Drawable mo19518m() {
        return this.f15321b;
    }

    /* renamed from: n */
    public int mo19519n() {
        return this.f15324c;
    }

    @zk0
    /* renamed from: o */
    public int mo19520o() {
        return this.f15310a;
    }

    @zk0
    /* renamed from: p */
    public int mo19521p() {
        return this.f15319b;
    }

    @ts2
    /* renamed from: q */
    public ColorStateList mo19522q() {
        return this.f15320b;
    }

    @mr2
    /* renamed from: r */
    public final Drawable mo19523r() {
        if (this.f15326c == null) {
            this.f15326c = mo19510g();
        }
        if (this.f15314a == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f15326c, this.f15322b, this.f15321b});
            this.f15314a = layerDrawable;
            layerDrawable.setId(2, fd3.C2158h.mtrl_card_checked_layer_id);
        }
        return this.f15314a;
    }

    /* renamed from: s */
    public float mo19524s() {
        return this.f15316a.mo31592S();
    }

    /* renamed from: t */
    public final float mo19525t() {
        if (!this.f15315a.getPreventCornerOverlap() || !this.f15315a.getUseCompatPadding()) {
            return 0.0f;
        }
        return (float) ((1.0d - f15305a) * ((double) this.f15315a.getCardViewRadius()));
    }

    @d81(from = 0.0d, mo14561to = 1.0d)
    /* renamed from: u */
    public float mo19526u() {
        return this.f15316a.mo31648z();
    }

    @ts2
    /* renamed from: v */
    public ColorStateList mo19527v() {
        return this.f15311a;
    }

    /* renamed from: w */
    public uw3 mo19528w() {
        return this.f15317a;
    }

    @d10
    /* renamed from: x */
    public int mo19529x() {
        ColorStateList colorStateList = this.f15325c;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    @ts2
    /* renamed from: y */
    public ColorStateList mo19530y() {
        return this.f15325c;
    }

    @zk0
    /* renamed from: z */
    public int mo19531z() {
        return this.f15328d;
    }
}
