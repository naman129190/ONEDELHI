package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C0435e;

public class MockView extends View {

    /* renamed from: a */
    public Paint f2370a = new Paint();

    /* renamed from: a */
    public Rect f2371a = new Rect();

    /* renamed from: b */
    public Paint f2372b = new Paint();

    /* renamed from: b */
    public String f2373b = null;

    /* renamed from: b */
    public boolean f2374b = true;

    /* renamed from: c */
    public Paint f2375c = new Paint();

    /* renamed from: c */
    public boolean f2376c = true;

    /* renamed from: n */
    public int f2377n = Color.argb(255, 0, 0, 0);

    /* renamed from: o */
    public int f2378o = Color.argb(255, 200, 200, 200);

    /* renamed from: p */
    public int f2379p = Color.argb(255, 50, 50, 50);

    /* renamed from: q */
    public int f2380q = 4;

    public MockView(Context context) {
        super(context);
        mo3125a(context, (AttributeSet) null);
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo3125a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo3125a(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo3125a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0435e.C0448m.MockView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0435e.C0448m.MockView_mock_label) {
                    this.f2373b = obtainStyledAttributes.getString(index);
                } else if (index == C0435e.C0448m.MockView_mock_showDiagonals) {
                    this.f2374b = obtainStyledAttributes.getBoolean(index, this.f2374b);
                } else if (index == C0435e.C0448m.MockView_mock_diagonalsColor) {
                    this.f2377n = obtainStyledAttributes.getColor(index, this.f2377n);
                } else if (index == C0435e.C0448m.MockView_mock_labelBackgroundColor) {
                    this.f2379p = obtainStyledAttributes.getColor(index, this.f2379p);
                } else if (index == C0435e.C0448m.MockView_mock_labelColor) {
                    this.f2378o = obtainStyledAttributes.getColor(index, this.f2378o);
                } else if (index == C0435e.C0448m.MockView_mock_showLabel) {
                    this.f2376c = obtainStyledAttributes.getBoolean(index, this.f2376c);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f2373b == null) {
            try {
                this.f2373b = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f2370a.setColor(this.f2377n);
        this.f2370a.setAntiAlias(true);
        this.f2372b.setColor(this.f2378o);
        this.f2372b.setAntiAlias(true);
        this.f2375c.setColor(this.f2379p);
        this.f2380q = Math.round(((float) this.f2380q) * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f2374b) {
            width--;
            height--;
            float f = (float) width;
            float f2 = (float) height;
            canvas.drawLine(0.0f, 0.0f, f, f2, this.f2370a);
            Canvas canvas2 = canvas;
            float f3 = f;
            canvas2.drawLine(0.0f, f2, f3, 0.0f, this.f2370a);
            canvas2.drawLine(0.0f, 0.0f, f3, 0.0f, this.f2370a);
            float f4 = f;
            float f5 = f2;
            canvas2.drawLine(f4, 0.0f, f3, f5, this.f2370a);
            float f6 = f2;
            canvas2.drawLine(f4, f6, 0.0f, f5, this.f2370a);
            canvas2.drawLine(0.0f, f6, 0.0f, 0.0f, this.f2370a);
        }
        String str = this.f2373b;
        if (str != null && this.f2376c) {
            this.f2372b.getTextBounds(str, 0, str.length(), this.f2371a);
            float width2 = ((float) (width - this.f2371a.width())) / 2.0f;
            float height2 = (((float) (height - this.f2371a.height())) / 2.0f) + ((float) this.f2371a.height());
            this.f2371a.offset((int) width2, (int) height2);
            Rect rect = this.f2371a;
            int i = rect.left;
            int i2 = this.f2380q;
            rect.set(i - i2, rect.top - i2, rect.right + i2, rect.bottom + i2);
            canvas.drawRect(this.f2371a, this.f2375c);
            canvas.drawText(this.f2373b, width2, height2, this.f2372b);
        }
    }
}
