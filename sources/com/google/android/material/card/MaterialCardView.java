package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.cf2;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.d81;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.k10;
import com.onedelhi.secure.le2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nx3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.uw3;
import com.onedelhi.secure.yk0;
import com.onedelhi.secure.zk0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class MaterialCardView extends CardView implements Checkable, nx3 {

    /* renamed from: b */
    public static final String f8016b = "MaterialCardView";

    /* renamed from: b */
    public static final int[] f8017b = {16842911};

    /* renamed from: c */
    public static final String f8018c = "androidx.cardview.widget.CardView";

    /* renamed from: c */
    public static final int[] f8019c = {16842912};

    /* renamed from: d */
    public static final int[] f8020d = {fd3.C2153c.state_dragged};

    /* renamed from: p */
    public static final int f8021p = fd3.C2164n.Widget_MaterialComponents_CardView;

    /* renamed from: q */
    public static final int f8022q = 8388659;

    /* renamed from: r */
    public static final int f8023r = 8388691;

    /* renamed from: s */
    public static final int f8024s = 8388661;

    /* renamed from: t */
    public static final int f8025t = 8388693;

    /* renamed from: a */
    public C1534b f8026a;
    @mr2

    /* renamed from: a */
    public final le2 f8027a;

    /* renamed from: d */
    public boolean f8028d;

    /* renamed from: e */
    public boolean f8029e;

    /* renamed from: f */
    public boolean f8030f;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.card.MaterialCardView$a */
    public @interface C1533a {
    }

    /* renamed from: com.google.android.material.card.MaterialCardView$b */
    public interface C1534b {
        /* renamed from: a */
        void mo11490a(MaterialCardView materialCardView, boolean z);
    }

    public MaterialCardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.materialCardViewStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = f8021p
            android.content.Context r8 = com.onedelhi.secure.hf2.m50488c(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.f8029e = r8
            r7.f8030f = r8
            r0 = 1
            r7.f8028d = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = com.onedelhi.secure.fd3.C2165o.MaterialCardView
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = com.onedelhi.secure.ob4.m59195k(r0, r1, r2, r3, r4, r5)
            com.onedelhi.secure.le2 r0 = new com.onedelhi.secure.le2
            r0.<init>(r7, r9, r10, r6)
            r7.f8027a = r0
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r0.mo19481J(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r0.mo19496Y(r9, r10, r1, r2)
            r0.mo19478G(r8)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @mr2
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f8027a.mo19515j().getBounds());
        return rectF;
    }

    @mr2
    public ColorStateList getCardBackgroundColor() {
        return this.f8027a.mo19516k();
    }

    @mr2
    public ColorStateList getCardForegroundColor() {
        return this.f8027a.mo19517l();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @ts2
    public Drawable getCheckedIcon() {
        return this.f8027a.mo19518m();
    }

    public int getCheckedIconGravity() {
        return this.f8027a.mo19519n();
    }

    @zk0
    public int getCheckedIconMargin() {
        return this.f8027a.mo19520o();
    }

    @zk0
    public int getCheckedIconSize() {
        return this.f8027a.mo19521p();
    }

    @ts2
    public ColorStateList getCheckedIconTint() {
        return this.f8027a.mo19522q();
    }

    public int getContentPaddingBottom() {
        return this.f8027a.mo19472A().bottom;
    }

    public int getContentPaddingLeft() {
        return this.f8027a.mo19472A().left;
    }

    public int getContentPaddingRight() {
        return this.f8027a.mo19472A().right;
    }

    public int getContentPaddingTop() {
        return this.f8027a.mo19472A().top;
    }

    @d81(from = 0.0d, mo14561to = 1.0d)
    public float getProgress() {
        return this.f8027a.mo19526u();
    }

    public float getRadius() {
        return this.f8027a.mo19524s();
    }

    public ColorStateList getRippleColor() {
        return this.f8027a.mo19527v();
    }

    @mr2
    public uw3 getShapeAppearanceModel() {
        return this.f8027a.mo19528w();
    }

    @Deprecated
    @d10
    public int getStrokeColor() {
        return this.f8027a.mo19529x();
    }

    @ts2
    public ColorStateList getStrokeColorStateList() {
        return this.f8027a.mo19530y();
    }

    @zk0
    public int getStrokeWidth() {
        return this.f8027a.mo19531z();
    }

    /* renamed from: i */
    public final void mo11457i() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f8027a.mo19514i();
        }
    }

    public boolean isChecked() {
        return this.f8029e;
    }

    /* renamed from: j */
    public boolean mo11459j() {
        le2 le2 = this.f8027a;
        return le2 != null && le2.mo19475D();
    }

    /* renamed from: k */
    public boolean mo11460k() {
        return this.f8030f;
    }

    /* renamed from: l */
    public void mo11461l(int i, int i2, int i3, int i4) {
        super.setContentPadding(i, i2, i3, i4);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cf2.m40865f(this, this.f8027a.mo19515j());
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (mo11459j()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f8017b);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f8019c);
        }
        if (mo11460k()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f8020d);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(@mr2 AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f8018c);
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(@mr2 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f8018c);
        accessibilityNodeInfo.setCheckable(mo11459j());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f8027a.mo19479H(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f8028d) {
            if (!this.f8027a.mo19474C()) {
                Log.i(f8016b, "Setting a custom background is not supported.");
                this.f8027a.mo19480I(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(@d10 int i) {
        this.f8027a.mo19481J(ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(@ts2 ColorStateList colorStateList) {
        this.f8027a.mo19481J(colorStateList);
    }

    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.f8027a.mo19505d0();
    }

    public void setCardForegroundColor(@ts2 ColorStateList colorStateList) {
        this.f8027a.mo19482K(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f8027a.mo19483L(z);
    }

    public void setChecked(boolean z) {
        if (this.f8029e != z) {
            toggle();
        }
    }

    public void setCheckedIcon(@ts2 Drawable drawable) {
        this.f8027a.mo19485N(drawable);
    }

    public void setCheckedIconGravity(int i) {
        if (this.f8027a.mo19519n() != i) {
            this.f8027a.mo19486O(i);
        }
    }

    public void setCheckedIconMargin(@zk0 int i) {
        this.f8027a.mo19487P(i);
    }

    public void setCheckedIconMarginResource(@yk0 int i) {
        if (i != -1) {
            this.f8027a.mo19487P(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconResource(@dp0 int i) {
        this.f8027a.mo19485N(C3129p8.m24529b(getContext(), i));
    }

    public void setCheckedIconSize(@zk0 int i) {
        this.f8027a.mo19488Q(i);
    }

    public void setCheckedIconSizeResource(@yk0 int i) {
        if (i != 0) {
            this.f8027a.mo19488Q(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconTint(@ts2 ColorStateList colorStateList) {
        this.f8027a.mo19489R(colorStateList);
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        le2 le2 = this.f8027a;
        if (le2 != null) {
            le2.mo19501b0();
        }
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.f8027a.mo19496Y(i, i2, i3, i4);
    }

    public void setDragged(boolean z) {
        if (this.f8030f != z) {
            this.f8030f = z;
            refreshDrawableState();
            mo11457i();
            invalidate();
        }
    }

    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f8027a.mo19509f0();
    }

    public void setOnCheckedChangeListener(@ts2 C1534b bVar) {
        this.f8026a = bVar;
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f8027a.mo19509f0();
        this.f8027a.mo19503c0();
    }

    public void setProgress(@d81(from = 0.0d, mo14561to = 1.0d) float f) {
        this.f8027a.mo19491T(f);
    }

    public void setRadius(float f) {
        super.setRadius(f);
        this.f8027a.mo19490S(f);
    }

    public void setRippleColor(@ts2 ColorStateList colorStateList) {
        this.f8027a.mo19492U(colorStateList);
    }

    public void setRippleColorResource(@k10 int i) {
        this.f8027a.mo19492U(C3129p8.m24528a(getContext(), i));
    }

    public void setShapeAppearanceModel(@mr2 uw3 uw3) {
        setClipToOutline(uw3.mo45823u(getBoundsAsRectF()));
        this.f8027a.mo19493V(uw3);
    }

    public void setStrokeColor(@d10 int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f8027a.mo19494W(colorStateList);
        invalidate();
    }

    public void setStrokeWidth(@zk0 int i) {
        this.f8027a.mo19495X(i);
        invalidate();
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f8027a.mo19509f0();
        this.f8027a.mo19503c0();
    }

    public void toggle() {
        if (mo11459j() && isEnabled()) {
            this.f8029e = !this.f8029e;
            refreshDrawableState();
            mo11457i();
            this.f8027a.mo19484M(this.f8029e);
            C1534b bVar = this.f8026a;
            if (bVar != null) {
                bVar.mo11490a(this, this.f8029e);
            }
        }
    }
}
