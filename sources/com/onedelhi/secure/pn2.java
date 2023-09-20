package com.onedelhi.secure;

import android.content.Context;
import android.view.View;
import com.google.android.material.navigation.NavigationBarItemView;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public final class pn2 extends NavigationBarItemView {
    public pn2(@mr2 Context context) {
        super(context);
    }

    @yk0
    public int getItemDefaultMarginResId() {
        return fd3.C2156f.mtrl_navigation_rail_icon_margin;
    }

    @s12
    public int getItemLayoutResId() {
        return fd3.C2161k.mtrl_navigation_rail_item;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), View.resolveSizeAndState(Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)), i2, 0));
        }
    }
}
