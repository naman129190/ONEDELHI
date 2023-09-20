package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.ld2;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class FlowLayout extends ViewGroup {

    /* renamed from: b */
    public boolean f24022b;

    /* renamed from: n */
    public int f24023n;

    /* renamed from: o */
    public int f24024o;

    /* renamed from: p */
    public int f24025p;

    public FlowLayout(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public FlowLayout(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24022b = false;
        mo28235d(context, attributeSet);
    }

    @TargetApi(21)
    public FlowLayout(@mr2 Context context, @ts2 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f24022b = false;
        mo28235d(context, attributeSet);
    }

    /* renamed from: a */
    public static int m33586a(int i, int i2, int i3) {
        return i2 != Integer.MIN_VALUE ? i2 != 1073741824 ? i3 : i : Math.min(i3, i);
    }

    /* renamed from: b */
    public int mo28234b(@mr2 View view) {
        Object tag = view.getTag(fd3.C2158h.row_index_key);
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return ((Integer) tag).intValue();
    }

    /* renamed from: c */
    public boolean mo11719c() {
        return this.f24022b;
    }

    /* renamed from: d */
    public final void mo28235d(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, fd3.C2165o.FlowLayout, 0, 0);
        this.f24023n = obtainStyledAttributes.getDimensionPixelSize(fd3.C2165o.FlowLayout_lineSpacing, 0);
        this.f24024o = obtainStyledAttributes.getDimensionPixelSize(fd3.C2165o.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.f24024o;
    }

    public int getLineSpacing() {
        return this.f24023n;
    }

    public int getRowCount() {
        return this.f24025p;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() == 0) {
            this.f24025p = 0;
            return;
        }
        this.f24025p = 1;
        boolean z2 = jt4.m18928Z(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingLeft;
        int i8 = paddingRight;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(fd3.C2158h.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = ld2.m20479c(marginLayoutParams);
                    i6 = ld2.m20478b(marginLayoutParams);
                } else {
                    i6 = 0;
                    i5 = 0;
                }
                int measuredWidth = i8 + i5 + childAt.getMeasuredWidth();
                if (!this.f24022b && measuredWidth > i7) {
                    i9 = this.f24023n + paddingTop;
                    this.f24025p++;
                    i8 = paddingRight;
                }
                childAt.setTag(fd3.C2158h.row_index_key, Integer.valueOf(this.f24025p - 1));
                int i11 = i8 + i5;
                int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                if (z2) {
                    i11 = i7 - measuredWidth2;
                    measuredWidth2 = (i7 - i8) - i5;
                }
                childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                i8 += i5 + i6 + childAt.getMeasuredWidth() + this.f24024o;
                paddingTop = measuredHeight;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i10 = i;
                int i11 = i2;
            } else {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i3 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
                int i12 = paddingLeft;
                if (paddingLeft + i4 + childAt.getMeasuredWidth() <= paddingRight || mo11719c()) {
                    i5 = i12;
                } else {
                    i5 = getPaddingLeft();
                    i7 = this.f24023n + paddingTop;
                }
                int measuredWidth = i5 + i4 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = i5 + i4 + i3 + childAt.getMeasuredWidth() + this.f24024o;
                if (i9 == getChildCount() - 1) {
                    i8 += i3;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m33586a(size, mode, i8 + getPaddingRight()), m33586a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public void setItemSpacing(int i) {
        this.f24024o = i;
    }

    public void setLineSpacing(int i) {
        this.f24023n = i;
    }

    public void setSingleLine(boolean z) {
        this.f24022b = z;
    }
}
