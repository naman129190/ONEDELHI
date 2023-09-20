package com.google.maps.android.p003ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: com.google.maps.android.ui.SquareTextView */
public class SquareTextView extends TextView {

    /* renamed from: n */
    public int f25582n = 0;

    /* renamed from: o */
    public int f25583o = 0;

    public SquareTextView(Context context) {
        super(context);
    }

    public SquareTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void draw(Canvas canvas) {
        canvas.translate((float) (this.f25583o / 2), (float) (this.f25582n / 2));
        super.draw(canvas);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int max = Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.f25582n = measuredWidth - measuredHeight;
            this.f25583o = 0;
        } else {
            this.f25582n = 0;
            this.f25583o = measuredHeight - measuredWidth;
        }
        setMeasuredDimension(max, max);
    }
}
