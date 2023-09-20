package com.onedelhi.secure;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

public class og3 implements TypeEvaluator<Rect> {

    /* renamed from: a */
    public Rect f17943a;

    public og3() {
    }

    public og3(Rect rect) {
        this.f17943a = rect;
    }

    /* renamed from: a */
    public Rect evaluate(float f, Rect rect, Rect rect2) {
        int i = rect.left;
        int i2 = i + ((int) (((float) (rect2.left - i)) * f));
        int i3 = rect.top;
        int i4 = i3 + ((int) (((float) (rect2.top - i3)) * f));
        int i5 = rect.right;
        int i6 = i5 + ((int) (((float) (rect2.right - i5)) * f));
        int i7 = rect.bottom;
        int i8 = i7 + ((int) (((float) (rect2.bottom - i7)) * f));
        Rect rect3 = this.f17943a;
        if (rect3 == null) {
            return new Rect(i2, i4, i6, i8);
        }
        rect3.set(i2, i4, i6, i8);
        return this.f17943a;
    }
}
