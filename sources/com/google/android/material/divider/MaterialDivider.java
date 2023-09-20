package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.onedelhi.secure.bf2;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.k10;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.yk0;

public class MaterialDivider extends View {

    /* renamed from: r */
    public static final int f8352r = fd3.C2164n.Widget_MaterialComponents_MaterialDivider;
    @mr2

    /* renamed from: a */
    public final bf2 f8353a;

    /* renamed from: n */
    public int f8354n;
    @d10

    /* renamed from: o */
    public int f8355o;

    /* renamed from: p */
    public int f8356p;

    /* renamed from: q */
    public int f8357q;

    public MaterialDivider(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialDivider(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.materialDividerStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialDivider(@com.onedelhi.secure.mr2 android.content.Context r8, @com.onedelhi.secure.ts2 android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f8352r
            android.content.Context r8 = com.onedelhi.secure.hf2.m50488c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            com.onedelhi.secure.bf2 r0 = new com.onedelhi.secure.bf2
            r0.<init>()
            r7.f8353a = r0
            int[] r2 = com.onedelhi.secure.fd3.C2165o.MaterialDivider
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.onedelhi.secure.ob4.m59195k(r0, r1, r2, r3, r4, r5)
            int r10 = com.onedelhi.secure.fd3.C2165o.MaterialDivider_dividerThickness
            android.content.res.Resources r0 = r7.getResources()
            int r1 = com.onedelhi.secure.fd3.C2156f.material_divider_thickness
            int r0 = r0.getDimensionPixelSize(r1)
            int r10 = r9.getDimensionPixelSize(r10, r0)
            r7.f8354n = r10
            int r10 = com.onedelhi.secure.fd3.C2165o.MaterialDivider_dividerInsetStart
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            r7.f8356p = r10
            int r10 = com.onedelhi.secure.fd3.C2165o.MaterialDivider_dividerInsetEnd
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            r7.f8357q = r10
            int r10 = com.onedelhi.secure.fd3.C2165o.MaterialDivider_dividerColor
            android.content.res.ColorStateList r8 = com.onedelhi.secure.af2.m38610a(r8, r9, r10)
            int r8 = r8.getDefaultColor()
            r7.setDividerColor(r8)
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.divider.MaterialDivider.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public int getDividerColor() {
        return this.f8355o;
    }

    @e83
    public int getDividerInsetEnd() {
        return this.f8357q;
    }

    @e83
    public int getDividerInsetStart() {
        return this.f8356p;
    }

    public int getDividerThickness() {
        return this.f8354n;
    }

    public void onDraw(@mr2 Canvas canvas) {
        int i;
        int i2;
        super.onDraw(canvas);
        boolean z = true;
        if (jt4.m18928Z(this) != 1) {
            z = false;
        }
        int i3 = z ? this.f8357q : this.f8356p;
        if (z) {
            i2 = getWidth();
            i = this.f8356p;
        } else {
            i2 = getWidth();
            i = this.f8357q;
        }
        this.f8353a.setBounds(i3, 0, i2 - i, getBottom() - getTop());
        this.f8353a.draw(canvas);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.f8354n;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(@d10 int i) {
        if (this.f8355o != i) {
            this.f8355o = i;
            this.f8353a.mo31626o0(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(@k10 int i) {
        setDividerColor(r70.m26353f(getContext(), i));
    }

    public void setDividerInsetEnd(@e83 int i) {
        this.f8357q = i;
    }

    public void setDividerInsetEndResource(@yk0 int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(@e83 int i) {
        this.f8356p = i;
    }

    public void setDividerInsetStartResource(@yk0 int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(@e83 int i) {
        if (this.f8354n != i) {
            this.f8354n = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@yk0 int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }
}
