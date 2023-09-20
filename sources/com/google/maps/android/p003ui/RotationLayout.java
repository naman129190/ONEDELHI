package com.google.maps.android.p003ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: com.google.maps.android.ui.RotationLayout */
public class RotationLayout extends FrameLayout {

    /* renamed from: n */
    public int f25581n;

    public RotationLayout(Context context) {
        super(context);
    }

    public RotationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RotationLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void dispatchDraw(Canvas canvas) {
        float height;
        int i;
        int i2 = this.f25581n;
        if (i2 == 0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (i2 == 1) {
            canvas.translate((float) getWidth(), 0.0f);
            canvas.rotate(90.0f, (float) (getWidth() / 2), 0.0f);
            height = (float) (getHeight() / 2);
            i = getWidth();
        } else if (i2 == 2) {
            canvas.rotate(180.0f, (float) (getWidth() / 2), (float) (getHeight() / 2));
            super.dispatchDraw(canvas);
        } else {
            canvas.translate(0.0f, (float) getHeight());
            canvas.rotate(270.0f, (float) (getWidth() / 2), 0.0f);
            height = (float) (getHeight() / 2);
            i = -getWidth();
        }
        canvas.translate(height, (float) (i / 2));
        super.dispatchDraw(canvas);
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.f25581n;
        if (i3 == 1 || i3 == 3) {
            super.onMeasure(i, i2);
            setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setViewRotation(int i) {
        this.f25581n = ((i + 360) % 360) / 90;
    }
}
