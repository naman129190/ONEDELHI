package com.onedelhi.secure;

public interface bo2 {
    boolean dispatchNestedFling(float f, float f2, boolean z);

    boolean dispatchNestedPreFling(float f, float f2);

    boolean dispatchNestedPreScroll(int i, int i2, @ts2 int[] iArr, @ts2 int[] iArr2);

    boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @ts2 int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z);

    boolean startNestedScroll(int i);

    void stopNestedScroll();
}
