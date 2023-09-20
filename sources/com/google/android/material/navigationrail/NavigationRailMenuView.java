package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pn2;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class NavigationRailMenuView extends NavigationBarMenuView {
    @e83

    /* renamed from: B */
    public int f24174B = -1;

    /* renamed from: a */
    public final FrameLayout.LayoutParams f24175a;

    public NavigationRailMenuView(@mr2 Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.f24175a = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    @mr2
    /* renamed from: f */
    public NavigationBarItemView mo11200f(@mr2 Context context) {
        return new pn2(context);
    }

    @e83
    public int getItemMinimumHeight() {
        return this.f24174B;
    }

    public int getMenuGravity() {
        return this.f24175a.gravity;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                childAt.layout(0, i6, i5, measuredHeight);
                i6 = measuredHeight;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = getMenu().mo1291H().size();
        setMeasuredDimension(View.resolveSizeAndState(View.MeasureSpec.getSize(i), i, 0), View.resolveSizeAndState((size2 <= 1 || !mo28373l(getLabelVisibilityMode(), size2)) ? mo28537w(i, size, size2, (View) null) : mo28538x(i, size, size2), i2, 0));
    }

    public void setItemMinimumHeight(@e83 int i) {
        if (this.f24174B != i) {
            this.f24174B = i;
            requestLayout();
        }
    }

    public void setMenuGravity(int i) {
        FrameLayout.LayoutParams layoutParams = this.f24175a;
        if (layoutParams.gravity != i) {
            layoutParams.gravity = i;
            setLayoutParams(layoutParams);
        }
    }

    /* renamed from: t */
    public boolean mo28534t() {
        return (this.f24175a.gravity & 112) == 48;
    }

    /* renamed from: u */
    public final int mo28535u(int i, int i2, int i3) {
        int max = i2 / Math.max(1, i3);
        int i4 = this.f24174B;
        if (i4 == -1) {
            i4 = View.MeasureSpec.getSize(i);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(i4, max), 0);
    }

    /* renamed from: v */
    public final int mo28536v(View view, int i, int i2) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        view.measure(i, i2);
        return view.getMeasuredHeight();
    }

    /* renamed from: w */
    public final int mo28537w(int i, int i2, int i3, View view) {
        mo28535u(i, i2, i3);
        int u = view == null ? mo28535u(i, i2, i3) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        int childCount = getChildCount();
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != view) {
                i4 += mo28536v(childAt, i, u);
            }
        }
        return i4;
    }

    /* renamed from: x */
    public final int mo28538x(int i, int i2, int i3) {
        int i4;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            i4 = mo28536v(childAt, i, mo28535u(i, i2, i3));
            i2 -= i4;
            i3--;
        } else {
            i4 = 0;
        }
        return i4 + mo28537w(i, i2, i3, childAt);
    }
}
