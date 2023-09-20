package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0435e;
import androidx.constraintlayout.widget.C0449f;
import androidx.constraintlayout.widget.ConstraintLayout;

public class ReactiveGuide extends View implements C0449f.C0450a {

    /* renamed from: b */
    public boolean f2690b = false;

    /* renamed from: c */
    public boolean f2691c = true;

    /* renamed from: n */
    public int f2692n = -1;

    /* renamed from: o */
    public int f2693o = 0;

    public ReactiveGuide(Context context) {
        super(context);
        super.setVisibility(8);
        mo3289c((AttributeSet) null);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
        mo3289c(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
        mo3289c(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        super.setVisibility(8);
        mo3289c(attributeSet);
    }

    /* renamed from: a */
    public void mo3061a(int i, int i2, int i3) {
        setGuidelineBegin(i2);
        int id = getId();
        if (id > 0 && (getParent() instanceof MotionLayout)) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            int currentState = motionLayout.getCurrentState();
            int i4 = this.f2693o;
            if (i4 != 0) {
                currentState = i4;
            }
            int i5 = 0;
            if (this.f2690b) {
                if (this.f2691c) {
                    int[] constraintSetIds = motionLayout.getConstraintSetIds();
                    while (i5 < constraintSetIds.length) {
                        int i6 = constraintSetIds[i5];
                        if (i6 != currentState) {
                            mo3288b(i2, id, motionLayout, i6);
                        }
                        i5++;
                    }
                }
                C0426d l0 = motionLayout.mo2789l0(currentState);
                l0.mo3438d1(id, i2);
                motionLayout.mo2784i1(currentState, l0, 1000);
            } else if (this.f2691c) {
                int[] constraintSetIds2 = motionLayout.getConstraintSetIds();
                while (i5 < constraintSetIds2.length) {
                    mo3288b(i2, id, motionLayout, constraintSetIds2[i5]);
                    i5++;
                }
            } else {
                mo3288b(i2, id, motionLayout, currentState);
            }
        }
    }

    /* renamed from: b */
    public final void mo3288b(int i, int i2, MotionLayout motionLayout, int i3) {
        C0426d z0 = motionLayout.mo2833z0(i3);
        z0.mo3438d1(i2, i);
        motionLayout.mo2782h1(i3, z0);
    }

    /* renamed from: c */
    public final void mo3289c(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0435e.C0448m.ConstraintLayout_ReactiveGuide);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0435e.C0448m.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.f2692n = obtainStyledAttributes.getResourceId(index, this.f2692n);
                } else if (index == C0435e.C0448m.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.f2690b = obtainStyledAttributes.getBoolean(index, this.f2690b);
                } else if (index == C0435e.C0448m.f3159x2694048c) {
                    this.f2693o = obtainStyledAttributes.getResourceId(index, this.f2693o);
                } else if (index == C0435e.C0448m.f3158xfdeff96) {
                    this.f2691c = obtainStyledAttributes.getBoolean(index, this.f2691c);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f2692n != -1) {
            ConstraintLayout.getSharedValues().mo3555a(this.f2692n, this);
        }
    }

    /* renamed from: d */
    public boolean mo3290d() {
        return this.f2690b;
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.f2693o;
    }

    public int getAttributeId() {
        return this.f2692n;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z) {
        this.f2690b = z;
    }

    public void setApplyToConstraintSetId(int i) {
        this.f2693o = i;
    }

    public void setAttributeId(int i) {
        C0449f sharedValues = ConstraintLayout.getSharedValues();
        int i2 = this.f2692n;
        if (i2 != -1) {
            sharedValues.mo3559e(i2, this);
        }
        this.f2692n = i;
        if (i != -1) {
            sharedValues.mo3555a(i, this);
        }
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f2549a = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f2554b = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f2548a = f;
        setLayoutParams(layoutParams);
    }

    public void setVisibility(int i) {
    }
}
