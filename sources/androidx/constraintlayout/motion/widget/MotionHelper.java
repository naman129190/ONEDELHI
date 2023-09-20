package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0435e;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.onedelhi.secure.cl2;
import java.util.HashMap;

public class MotionHelper extends ConstraintHelper implements C0392a {

    /* renamed from: a */
    public float f1946a;

    /* renamed from: b */
    public View[] f1947b;

    /* renamed from: c */
    public boolean f1948c = false;

    /* renamed from: d */
    public boolean f1949d = false;

    public MotionHelper(Context context) {
        super(context);
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo2673y(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo2673y(attributeSet);
    }

    /* renamed from: a */
    public void mo2721a(Canvas canvas) {
    }

    /* renamed from: b */
    public void mo2722b(MotionLayout motionLayout) {
    }

    /* renamed from: c */
    public void mo2723c(MotionLayout motionLayout, int i, boolean z, float f) {
    }

    /* renamed from: d */
    public boolean mo2724d() {
        return this.f1948c;
    }

    /* renamed from: e */
    public void mo2718e(MotionLayout motionLayout, HashMap<View, cl2> hashMap) {
    }

    /* renamed from: f */
    public void mo2725f(Canvas canvas) {
    }

    /* renamed from: g */
    public void mo2726g(MotionLayout motionLayout, int i, int i2) {
    }

    public float getProgress() {
        return this.f1946a;
    }

    /* renamed from: h */
    public boolean mo2728h() {
        return this.f1949d;
    }

    /* renamed from: i */
    public void mo2649i(MotionLayout motionLayout, int i) {
    }

    /* renamed from: j */
    public void mo2650j(MotionLayout motionLayout, int i, int i2, float f) {
    }

    /* renamed from: k */
    public boolean mo2719k() {
        return false;
    }

    public void setProgress(float f) {
        this.f1946a = f;
        int i = 0;
        if (this.f2467n > 0) {
            this.f1947b = mo3213w((ConstraintLayout) getParent());
            while (i < this.f2467n) {
                setProgress(this.f1947b[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof MotionHelper)) {
                setProgress(childAt, f);
            }
            i++;
        }
    }

    public void setProgress(View view, float f) {
    }

    /* renamed from: y */
    public void mo2673y(AttributeSet attributeSet) {
        super.mo2673y(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0435e.C0448m.MotionHelper);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0435e.C0448m.MotionHelper_onShow) {
                    this.f1948c = obtainStyledAttributes.getBoolean(index, this.f1948c);
                } else if (index == C0435e.C0448m.MotionHelper_onHide) {
                    this.f1949d = obtainStyledAttributes.getBoolean(index, this.f1949d);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
