package com.onedelhi.secure;

import android.view.View;

public interface fo2 {
    int getNestedScrollAxes();

    boolean onNestedFling(@mr2 View view, float f, float f2, boolean z);

    boolean onNestedPreFling(@mr2 View view, float f, float f2);

    void onNestedPreScroll(@mr2 View view, int i, int i2, @mr2 int[] iArr);

    void onNestedScroll(@mr2 View view, int i, int i2, int i3, int i4);

    void onNestedScrollAccepted(@mr2 View view, @mr2 View view2, int i);

    boolean onStartNestedScroll(@mr2 View view, @mr2 View view2, int i);

    void onStopNestedScroll(@mr2 View view);
}
