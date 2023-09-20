package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import androidx.emoji2.text.C0552c;
import com.onedelhi.secure.hl3;

@sj3(19)
@hl3({hl3.C2354a.LIBRARY_GROUP})
public final class qk4 extends ys0 {
    @ts2

    /* renamed from: a */
    public static Paint f19205a;

    public qk4(@mr2 xs0 xs0) {
        super(xs0);
    }

    @mr2
    /* renamed from: f */
    public static Paint m25780f() {
        if (f19205a == null) {
            TextPaint textPaint = new TextPaint();
            f19205a = textPaint;
            textPaint.setColor(C0552c.m4105b().mo4169e());
            f19205a.setStyle(Paint.Style.FILL);
        }
        return f19205a;
    }

    public void draw(@mr2 Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, @js1(from = 0) int i, @js1(from = 0) int i2, float f, int i3, int i4, int i5, @mr2 Paint paint) {
        if (C0552c.m4105b().mo4173o()) {
            canvas.drawRect(f, (float) i3, f + ((float) mo27679e()), (float) i5, m25780f());
        }
        mo27677c().mo27066a(canvas, f, (float) i4, paint);
    }
}
