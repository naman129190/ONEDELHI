package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.C0435e;
import com.onedelhi.secure.sj3;

public class MotionButton extends AppCompatButton {

    /* renamed from: a */
    public float f2381a = 0.0f;

    /* renamed from: a */
    public Path f2382a;

    /* renamed from: a */
    public RectF f2383a;

    /* renamed from: a */
    public ViewOutlineProvider f2384a;

    /* renamed from: b */
    public float f2385b = Float.NaN;

    /* renamed from: androidx.constraintlayout.utils.widget.MotionButton$a */
    public class C0412a extends ViewOutlineProvider {
        public C0412a() {
        }

        public void getOutline(View view, Outline outline) {
            int width = MotionButton.this.getWidth();
            int height = MotionButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * MotionButton.this.f2381a) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.MotionButton$b */
    public class C0413b extends ViewOutlineProvider {
        public C0413b() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), MotionButton.this.f2385b);
        }
    }

    public MotionButton(Context context) {
        super(context);
        mo3127d(context, (AttributeSet) null);
    }

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo3127d(context, attributeSet);
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo3127d(context, attributeSet);
    }

    /* renamed from: d */
    public final void mo3127d(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0435e.C0448m.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0435e.C0448m.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C0435e.C0448m.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getRound() {
        return this.f2385b;
    }

    public float getRoundPercent() {
        return this.f2381a;
    }

    @sj3(21)
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f2385b = f;
            float f2 = this.f2381a;
            this.f2381a = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f2385b != f;
        this.f2385b = f;
        if (f != 0.0f) {
            if (this.f2382a == null) {
                this.f2382a = new Path();
            }
            if (this.f2383a == null) {
                this.f2383a = new RectF();
            }
            if (this.f2384a == null) {
                C0413b bVar = new C0413b();
                this.f2384a = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f2383a.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f2382a.reset();
            Path path = this.f2382a;
            RectF rectF = this.f2383a;
            float f3 = this.f2385b;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    @sj3(21)
    public void setRoundPercent(float f) {
        boolean z = this.f2381a != f;
        this.f2381a = f;
        if (f != 0.0f) {
            if (this.f2382a == null) {
                this.f2382a = new Path();
            }
            if (this.f2383a == null) {
                this.f2383a = new RectF();
            }
            if (this.f2384a == null) {
                C0412a aVar = new C0412a();
                this.f2384a = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f2381a) / 2.0f;
            this.f2383a.set(0.0f, 0.0f, (float) width, (float) height);
            this.f2382a.reset();
            this.f2382a.addRoundRect(this.f2383a, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }
}
