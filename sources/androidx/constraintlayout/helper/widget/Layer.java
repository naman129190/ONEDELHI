package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C0435e;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.onedelhi.secure.o60;

public class Layer extends ConstraintHelper {

    /* renamed from: d */
    public static final String f1910d = "Layer";

    /* renamed from: a */
    public float f1911a = Float.NaN;

    /* renamed from: a */
    public ConstraintLayout f1912a;

    /* renamed from: b */
    public float f1913b = Float.NaN;

    /* renamed from: b */
    public View[] f1914b = null;

    /* renamed from: c */
    public float f1915c = Float.NaN;

    /* renamed from: c */
    public boolean f1916c = true;

    /* renamed from: d */
    public float f1917d = 1.0f;

    /* renamed from: d */
    public boolean f1918d;

    /* renamed from: e */
    public float f1919e = 1.0f;

    /* renamed from: e */
    public boolean f1920e;

    /* renamed from: f */
    public float f1921f = Float.NaN;

    /* renamed from: g */
    public float f1922g = Float.NaN;

    /* renamed from: h */
    public float f1923h = Float.NaN;

    /* renamed from: i */
    public float f1924i = Float.NaN;

    /* renamed from: j */
    public float f1925j = Float.NaN;

    /* renamed from: k */
    public float f1926k = Float.NaN;

    /* renamed from: l */
    public float f1927l = 0.0f;

    /* renamed from: m */
    public float f1928m = 0.0f;

    public Layer(Context context) {
        super(context);
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Layer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: D */
    public void mo2702D(ConstraintLayout constraintLayout) {
        mo2705K();
        this.f1921f = Float.NaN;
        this.f1922g = Float.NaN;
        o60 b = ((ConstraintLayout.LayoutParams) getLayoutParams()).mo3254b();
        b.mo21691c2(0);
        b.mo21758y1(0);
        mo2704J();
        layout(((int) this.f1925j) - getPaddingLeft(), ((int) this.f1926k) - getPaddingTop(), ((int) this.f1923h) + getPaddingRight(), ((int) this.f1924i) + getPaddingBottom());
        mo2706L();
    }

    /* renamed from: F */
    public void mo2703F(ConstraintLayout constraintLayout) {
        this.f1912a = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f || !Float.isNaN(this.f1915c)) {
            this.f1915c = rotation;
        }
    }

    /* renamed from: J */
    public void mo2704J() {
        if (this.f1912a != null) {
            if (!this.f1916c && !Float.isNaN(this.f1921f) && !Float.isNaN(this.f1922g)) {
                return;
            }
            if (Float.isNaN(this.f1911a) || Float.isNaN(this.f1913b)) {
                View[] w = mo3213w(this.f1912a);
                int left = w[0].getLeft();
                int top = w[0].getTop();
                int right = w[0].getRight();
                int bottom = w[0].getBottom();
                for (int i = 0; i < this.f2467n; i++) {
                    View view = w[i];
                    left = Math.min(left, view.getLeft());
                    top = Math.min(top, view.getTop());
                    right = Math.max(right, view.getRight());
                    bottom = Math.max(bottom, view.getBottom());
                }
                this.f1923h = (float) right;
                this.f1924i = (float) bottom;
                this.f1925j = (float) left;
                this.f1926k = (float) top;
                this.f1921f = Float.isNaN(this.f1911a) ? (float) ((left + right) / 2) : this.f1911a;
                this.f1922g = Float.isNaN(this.f1913b) ? (float) ((top + bottom) / 2) : this.f1913b;
                return;
            }
            this.f1922g = this.f1913b;
            this.f1921f = this.f1911a;
        }
    }

    /* renamed from: K */
    public final void mo2705K() {
        int i;
        if (this.f1912a != null && (i = this.f2467n) != 0) {
            View[] viewArr = this.f1914b;
            if (viewArr == null || viewArr.length != i) {
                this.f1914b = new View[i];
            }
            for (int i2 = 0; i2 < this.f2467n; i2++) {
                this.f1914b[i2] = this.f1912a.mo3248t(this.f2462a[i2]);
            }
        }
    }

    /* renamed from: L */
    public final void mo2706L() {
        if (this.f1912a != null) {
            if (this.f1914b == null) {
                mo2705K();
            }
            mo2704J();
            double radians = Float.isNaN(this.f1915c) ? 0.0d : Math.toRadians((double) this.f1915c);
            float sin = (float) Math.sin(radians);
            float cos = (float) Math.cos(radians);
            float f = this.f1917d;
            float f2 = f * cos;
            float f3 = this.f1919e;
            float f4 = (-f3) * sin;
            float f5 = f * sin;
            float f6 = f3 * cos;
            for (int i = 0; i < this.f2467n; i++) {
                View view = this.f1914b[i];
                float left = ((float) ((view.getLeft() + view.getRight()) / 2)) - this.f1921f;
                float top = ((float) ((view.getTop() + view.getBottom()) / 2)) - this.f1922g;
                view.setTranslationX((((f2 * left) + (f4 * top)) - left) + this.f1927l);
                view.setTranslationY((((left * f5) + (f6 * top)) - top) + this.f1928m);
                view.setScaleY(this.f1919e);
                view.setScaleX(this.f1917d);
                if (!Float.isNaN(this.f1915c)) {
                    view.setRotation(this.f1915c);
                }
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1912a = (ConstraintLayout) getParent();
        if (this.f1918d || this.f1920e) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f2467n; i++) {
                View t = this.f1912a.mo3248t(this.f2462a[i]);
                if (t != null) {
                    if (this.f1918d) {
                        t.setVisibility(visibility);
                    }
                    if (this.f1920e && elevation > 0.0f) {
                        t.setTranslationZ(t.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public void mo2707r(ConstraintLayout constraintLayout) {
        mo3204q(constraintLayout);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo3203p();
    }

    public void setPivotX(float f) {
        this.f1911a = f;
        mo2706L();
    }

    public void setPivotY(float f) {
        this.f1913b = f;
        mo2706L();
    }

    public void setRotation(float f) {
        this.f1915c = f;
        mo2706L();
    }

    public void setScaleX(float f) {
        this.f1917d = f;
        mo2706L();
    }

    public void setScaleY(float f) {
        this.f1919e = f;
        mo2706L();
    }

    public void setTranslationX(float f) {
        this.f1927l = f;
        mo2706L();
    }

    public void setTranslationY(float f) {
        this.f1928m = f;
        mo2706L();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo3203p();
    }

    /* renamed from: y */
    public void mo2673y(AttributeSet attributeSet) {
        super.mo2673y(attributeSet);
        this.f2465b = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0435e.C0448m.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0435e.C0448m.ConstraintLayout_Layout_android_visibility) {
                    this.f1918d = true;
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_android_elevation) {
                    this.f1920e = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
