package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0248e;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;

@hl3({hl3.C2354a.f13187b})
public class BottomNavigationMenuView extends NavigationBarMenuView {

    /* renamed from: B */
    public final int f7834B;

    /* renamed from: C */
    public final int f7835C;

    /* renamed from: D */
    public final int f7836D;

    /* renamed from: E */
    public final int f7837E;

    /* renamed from: c */
    public int[] f7838c = new int[5];

    /* renamed from: d */
    public boolean f7839d;

    public BottomNavigationMenuView(@mr2 Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f7834B = resources.getDimensionPixelSize(fd3.C2156f.design_bottom_navigation_item_max_width);
        this.f7835C = resources.getDimensionPixelSize(fd3.C2156f.design_bottom_navigation_item_min_width);
        this.f7836D = resources.getDimensionPixelSize(fd3.C2156f.design_bottom_navigation_active_item_max_width);
        this.f7837E = resources.getDimensionPixelSize(fd3.C2156f.design_bottom_navigation_active_item_min_width);
    }

    @mr2
    /* renamed from: f */
    public NavigationBarItemView mo11200f(@mr2 Context context) {
        return new BottomNavigationItemView(context);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (jt4.m18928Z(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    public void onMeasure(int i, int i2) {
        C0248e menu = getMenu();
        int size = View.MeasureSpec.getSize(i);
        int size2 = menu.mo1291H().size();
        int childCount = getChildCount();
        int size3 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        if (!mo28373l(getLabelVisibilityMode(), size2) || !mo11204t()) {
            int min = Math.min(size / (size2 == 0 ? 1 : size2), this.f7836D);
            int i3 = size - (size2 * min);
            for (int i4 = 0; i4 < childCount; i4++) {
                if (getChildAt(i4).getVisibility() != 8) {
                    int[] iArr = this.f7838c;
                    iArr[i4] = min;
                    if (i3 > 0) {
                        iArr[i4] = iArr[i4] + 1;
                        i3--;
                    }
                } else {
                    this.f7838c[i4] = 0;
                }
            }
        } else {
            View childAt = getChildAt(getSelectedItemPosition());
            int i5 = this.f7837E;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f7836D, Integer.MIN_VALUE), makeMeasureSpec);
                i5 = Math.max(i5, childAt.getMeasuredWidth());
            }
            int i6 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min2 = Math.min(size - (this.f7835C * i6), Math.min(i5, this.f7836D));
            int i7 = size - min2;
            int min3 = Math.min(i7 / (i6 == 0 ? 1 : i6), this.f7834B);
            int i8 = i7 - (i6 * min3);
            int i9 = 0;
            while (i9 < childCount) {
                if (getChildAt(i9).getVisibility() != 8) {
                    this.f7838c[i9] = i9 == getSelectedItemPosition() ? min2 : min3;
                    if (i8 > 0) {
                        int[] iArr2 = this.f7838c;
                        iArr2[i9] = iArr2[i9] + 1;
                        i8--;
                    }
                } else {
                    this.f7838c[i9] = 0;
                }
                i9++;
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f7838c[i11], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i10 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i10, View.MeasureSpec.makeMeasureSpec(i10, 1073741824), 0), View.resolveSizeAndState(size3, i2, 0));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f7839d = z;
    }

    /* renamed from: t */
    public boolean mo11204t() {
        return this.f7839d;
    }
}
