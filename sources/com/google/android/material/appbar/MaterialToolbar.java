package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.onedelhi.secure.bf2;
import com.onedelhi.secure.cf2;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.nf4;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.wo0;

public class MaterialToolbar extends Toolbar {

    /* renamed from: a */
    public static final ImageView.ScaleType[] f7721a = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: z */
    public static final int f7722z = fd3.C2164n.Widget_MaterialComponents_Toolbar;
    @ts2

    /* renamed from: a */
    public ImageView.ScaleType f7723a;
    @ts2

    /* renamed from: a */
    public Boolean f7724a;
    @ts2

    /* renamed from: a */
    public Integer f7725a;

    /* renamed from: e */
    public boolean f7726e;

    /* renamed from: f */
    public boolean f7727f;

    public MaterialToolbar(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialToolbar(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.toolbarStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialToolbar(@com.onedelhi.secure.mr2 android.content.Context r8, @com.onedelhi.secure.ts2 android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f7722z
            android.content.Context r8 = com.onedelhi.secure.hf2.m50488c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.onedelhi.secure.fd3.C2165o.MaterialToolbar
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.onedelhi.secure.ob4.m59195k(r0, r1, r2, r3, r4, r5)
            int r10 = com.onedelhi.secure.fd3.C2165o.MaterialToolbar_navigationIconTint
            boolean r0 = r9.hasValue(r10)
            r1 = -1
            if (r0 == 0) goto L_0x0029
            int r10 = r9.getColor(r10, r1)
            r7.setNavigationIconTint(r10)
        L_0x0029:
            int r10 = com.onedelhi.secure.fd3.C2165o.MaterialToolbar_titleCentered
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f7726e = r10
            int r10 = com.onedelhi.secure.fd3.C2165o.MaterialToolbar_subtitleCentered
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f7727f = r10
            int r10 = com.onedelhi.secure.fd3.C2165o.MaterialToolbar_logoScaleType
            int r10 = r9.getInt(r10, r1)
            if (r10 < 0) goto L_0x004a
            android.widget.ImageView$ScaleType[] r0 = f7721a
            int r1 = r0.length
            if (r10 >= r1) goto L_0x004a
            r10 = r0[r10]
            r7.f7723a = r10
        L_0x004a:
            int r10 = com.onedelhi.secure.fd3.C2165o.MaterialToolbar_logoAdjustViewBounds
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x005c
            boolean r10 = r9.getBoolean(r10, r6)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.f7724a = r10
        L_0x005c:
            r9.recycle()
            r7.mo11068R(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: N */
    public final Pair<Integer, Integer> mo11066N(@ts2 TextView textView, @ts2 TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                if (childAt.getRight() < i && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    /* renamed from: O */
    public void mo11067O() {
        this.f7725a = null;
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            wo0.m30986o(wo0.m30989r(navigationIcon.mutate()), (ColorStateList) null);
            setNavigationIcon(navigationIcon);
        }
    }

    /* renamed from: R */
    public final void mo11068R(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            bf2 bf2 = new bf2();
            bf2.mo31626o0(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            bf2.mo31599Z(context);
            bf2.mo31624n0(jt4.m18904R(this));
            jt4.m18877I1(this, bf2);
        }
    }

    /* renamed from: T */
    public boolean mo11069T() {
        Boolean bool = this.f7724a;
        return bool != null && bool.booleanValue();
    }

    /* renamed from: U */
    public boolean mo11070U() {
        return this.f7727f;
    }

    /* renamed from: V */
    public boolean mo11071V() {
        return this.f7726e;
    }

    /* renamed from: X */
    public final void mo11072X(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    /* renamed from: Y */
    public final void mo11073Y() {
        if (this.f7726e || this.f7727f) {
            TextView i = nf4.m58069i(this);
            TextView g = nf4.m58067g(this);
            if (i != null || g != null) {
                Pair<Integer, Integer> N = mo11066N(i, g);
                if (this.f7726e && i != null) {
                    mo11072X(i, N);
                }
                if (this.f7727f && g != null) {
                    mo11072X(g, N);
                }
            }
        }
    }

    @ts2
    /* renamed from: Z */
    public final Drawable mo11074Z(@ts2 Drawable drawable) {
        if (drawable == null || this.f7725a == null) {
            return drawable;
        }
        Drawable r = wo0.m30989r(drawable.mutate());
        wo0.m30985n(r, this.f7725a.intValue());
        return r;
    }

    /* renamed from: a0 */
    public final void mo11075a0() {
        ImageView d = nf4.m58064d(this);
        if (d != null) {
            Boolean bool = this.f7724a;
            if (bool != null) {
                d.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f7723a;
            if (scaleType != null) {
                d.setScaleType(scaleType);
            }
        }
    }

    @ts2
    public ImageView.ScaleType getLogoScaleType() {
        return this.f7723a;
    }

    @ts2
    @d10
    public Integer getNavigationIconTint() {
        return this.f7725a;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cf2.m40864e(this);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo11073Y();
        mo11075a0();
    }

    @sj3(21)
    public void setElevation(float f) {
        super.setElevation(f);
        cf2.m40863d(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f7724a;
        if (bool == null || bool.booleanValue() != z) {
            this.f7724a = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(@mr2 ImageView.ScaleType scaleType) {
        if (this.f7723a != scaleType) {
            this.f7723a = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIcon(@ts2 Drawable drawable) {
        super.setNavigationIcon(mo11074Z(drawable));
    }

    public void setNavigationIconTint(@d10 int i) {
        this.f7725a = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f7727f != z) {
            this.f7727f = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f7726e != z) {
            this.f7726e = z;
            requestLayout();
        }
    }
}
