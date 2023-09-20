package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.za3;

@hl3({hl3.C2354a.f13188c})
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: o */
    public static final int f1415o = 16;

    /* renamed from: b */
    public boolean f1416b;

    /* renamed from: c */
    public boolean f1417c;

    /* renamed from: n */
    public int f1418n = -1;

    public ButtonBarLayout(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = za3.C4068m.ButtonBarLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        jt4.m19033z1(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f1416b = obtainStyledAttributes.getBoolean(za3.C4068m.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1416b);
        }
    }

    private void setStacked(boolean z) {
        if (this.f1417c == z) {
            return;
        }
        if (!z || this.f1416b) {
            this.f1417c = z;
            setOrientation(z ? 1 : 0);
            setGravity(z ? 8388613 : 80);
            View findViewById = findViewById(za3.C4062g.spacer);
            if (findViewById != null) {
                findViewById.setVisibility(z ? 8 : 4);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    /* renamed from: a */
    public final int mo1957a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public final boolean mo1958b() {
        return this.f1417c;
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f1416b) {
            if (size > this.f1418n && mo1958b()) {
                setStacked(false);
            }
            this.f1418n = size;
        }
        if (mo1958b() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f1416b && !mo1958b()) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int a = mo1957a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (mo1958b()) {
                int a2 = mo1957a(a + 1);
                if (a2 >= 0) {
                    paddingTop += getChildAt(a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i4 = paddingTop;
            } else {
                i4 = paddingTop + getPaddingBottom();
            }
        }
        if (jt4.m18948e0(this) != i4) {
            setMinimumHeight(i4);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f1416b != z) {
            this.f1416b = z;
            if (!z && mo1958b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
