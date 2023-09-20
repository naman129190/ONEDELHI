package com.onedelhi.secure;

import android.graphics.Matrix;
import android.view.View;

@sj3(29)
public class wv4 extends vv4 {
    /* renamed from: c */
    public float mo7060c(@mr2 View view) {
        return view.getTransitionAlpha();
    }

    /* renamed from: e */
    public void mo7062e(@mr2 View view, @ts2 Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    /* renamed from: f */
    public void mo7063f(@mr2 View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* renamed from: g */
    public void mo7064g(@mr2 View view, float f) {
        view.setTransitionAlpha(f);
    }

    /* renamed from: h */
    public void mo7065h(@mr2 View view, int i) {
        view.setTransitionVisibility(i);
    }

    /* renamed from: i */
    public void mo7066i(@mr2 View view, @mr2 Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: j */
    public void mo7067j(@mr2 View view, @mr2 Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
