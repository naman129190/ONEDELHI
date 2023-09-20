package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C0435e;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.onedelhi.secure.o60;

public class Placeholder extends View {

    /* renamed from: a */
    public View f2687a = null;

    /* renamed from: n */
    public int f2688n = -1;

    /* renamed from: o */
    public int f2689o = 4;

    public Placeholder(Context context) {
        super(context);
        mo3280a((AttributeSet) null);
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo3280a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo3280a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        mo3280a(attributeSet);
    }

    /* renamed from: a */
    public final void mo3280a(AttributeSet attributeSet) {
        super.setVisibility(this.f2689o);
        this.f2688n = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0435e.C0448m.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0435e.C0448m.ConstraintLayout_placeholder_content) {
                    this.f2688n = obtainStyledAttributes.getResourceId(index, this.f2688n);
                } else if (index == C0435e.C0448m.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.f2689o = obtainStyledAttributes.getInt(index, this.f2689o);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public void mo3281b(ConstraintLayout constraintLayout) {
        if (this.f2687a != null) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f2687a.getLayoutParams();
            layoutParams2.f2550a.mo21688b2(0);
            o60.C3032b H = layoutParams.f2550a.mo21630H();
            o60.C3032b bVar = o60.C3032b.FIXED;
            if (H != bVar) {
                layoutParams.f2550a.mo21691c2(layoutParams2.f2550a.mo21723m0());
            }
            if (layoutParams.f2550a.mo21714j0() != bVar) {
                layoutParams.f2550a.mo21758y1(layoutParams2.f2550a.mo21619D());
            }
            layoutParams2.f2550a.mo21688b2(8);
        }
    }

    /* renamed from: c */
    public void mo3282c(ConstraintLayout constraintLayout) {
        if (this.f2688n == -1 && !isInEditMode()) {
            setVisibility(this.f2689o);
        }
        View findViewById = constraintLayout.findViewById(this.f2688n);
        this.f2687a = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.LayoutParams) findViewById.getLayoutParams()).f2583k = true;
            this.f2687a.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f2687a;
    }

    public int getEmptyVisibility() {
        return this.f2689o;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f2688n != i) {
            View view = this.f2687a;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.LayoutParams) this.f2687a.getLayoutParams()).f2583k = false;
                this.f2687a = null;
            }
            this.f2688n = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f2689o = i;
    }
}
