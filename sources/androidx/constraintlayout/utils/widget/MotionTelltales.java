package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0435e;

public class MotionTelltales extends MockView {

    /* renamed from: c */
    public static final String f2442c = "MotionTelltales";

    /* renamed from: a */
    public float f2443a = 0.25f;

    /* renamed from: a */
    public Matrix f2444a = new Matrix();

    /* renamed from: a */
    public MotionLayout f2445a;

    /* renamed from: a */
    public float[] f2446a = new float[2];

    /* renamed from: d */
    public Paint f2447d = new Paint();

    /* renamed from: r */
    public int f2448r = 0;

    /* renamed from: s */
    public int f2449s = -65281;

    public MotionTelltales(Context context) {
        super(context);
        m3074a(context, (AttributeSet) null);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3074a(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3074a(context, attributeSet);
    }

    /* renamed from: a */
    private void m3074a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0435e.C0448m.MotionTelltales);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0435e.C0448m.MotionTelltales_telltales_tailColor) {
                    this.f2449s = obtainStyledAttributes.getColor(index, this.f2449s);
                } else if (index == C0435e.C0448m.MotionTelltales_telltales_velocityMode) {
                    this.f2448r = obtainStyledAttributes.getInt(index, this.f2448r);
                } else if (index == C0435e.C0448m.MotionTelltales_telltales_tailScale) {
                    this.f2443a = obtainStyledAttributes.getFloat(index, this.f2443a);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2447d.setColor(this.f2449s);
        this.f2447d.setStrokeWidth(5.0f);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f2444a);
        if (this.f2445a == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f2445a = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i = 0; i < 5; i++) {
            float f = fArr[i];
            for (int i2 = 0; i2 < 5; i2++) {
                float f2 = fArr[i2];
                this.f2445a.mo2735E0(this, f2, f, this.f2446a, this.f2448r);
                this.f2444a.mapVectors(this.f2446a);
                float f3 = ((float) width) * f2;
                float f4 = ((float) height) * f;
                float[] fArr2 = this.f2446a;
                float f5 = fArr2[0];
                float f6 = this.f2443a;
                float f7 = f4 - (fArr2[1] * f6);
                this.f2444a.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f7, this.f2447d);
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f2373b = charSequence.toString();
        requestLayout();
    }
}
