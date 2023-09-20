package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0435e;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Constraints extends ViewGroup {

    /* renamed from: b */
    public static final String f2671b = "Constraints";

    /* renamed from: a */
    public C0426d f2672a;

    public static class LayoutParams extends ConstraintLayout.LayoutParams {

        /* renamed from: l */
        public float f2673l;

        /* renamed from: m */
        public float f2674m;

        /* renamed from: n */
        public float f2675n;

        /* renamed from: n */
        public boolean f2676n;

        /* renamed from: o */
        public float f2677o;

        /* renamed from: p */
        public float f2678p;

        /* renamed from: q */
        public float f2679q;

        /* renamed from: r */
        public float f2680r;

        /* renamed from: s */
        public float f2681s;

        /* renamed from: t */
        public float f2682t;

        /* renamed from: u */
        public float f2683u;

        /* renamed from: v */
        public float f2684v;

        /* renamed from: w */
        public float f2685w;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f2673l = 1.0f;
            this.f2676n = false;
            this.f2674m = 0.0f;
            this.f2675n = 0.0f;
            this.f2677o = 0.0f;
            this.f2678p = 0.0f;
            this.f2679q = 1.0f;
            this.f2680r = 1.0f;
            this.f2681s = 0.0f;
            this.f2682t = 0.0f;
            this.f2683u = 0.0f;
            this.f2684v = 0.0f;
            this.f2685w = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2673l = 1.0f;
            this.f2676n = false;
            this.f2674m = 0.0f;
            this.f2675n = 0.0f;
            this.f2677o = 0.0f;
            this.f2678p = 0.0f;
            this.f2679q = 1.0f;
            this.f2680r = 1.0f;
            this.f2681s = 0.0f;
            this.f2682t = 0.0f;
            this.f2683u = 0.0f;
            this.f2684v = 0.0f;
            this.f2685w = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0435e.C0448m.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0435e.C0448m.ConstraintSet_android_alpha) {
                    this.f2673l = obtainStyledAttributes.getFloat(index, this.f2673l);
                } else if (index == C0435e.C0448m.ConstraintSet_android_elevation) {
                    this.f2674m = obtainStyledAttributes.getFloat(index, this.f2674m);
                    this.f2676n = true;
                } else if (index == C0435e.C0448m.ConstraintSet_android_rotationX) {
                    this.f2677o = obtainStyledAttributes.getFloat(index, this.f2677o);
                } else if (index == C0435e.C0448m.ConstraintSet_android_rotationY) {
                    this.f2678p = obtainStyledAttributes.getFloat(index, this.f2678p);
                } else if (index == C0435e.C0448m.ConstraintSet_android_rotation) {
                    this.f2675n = obtainStyledAttributes.getFloat(index, this.f2675n);
                } else if (index == C0435e.C0448m.ConstraintSet_android_scaleX) {
                    this.f2679q = obtainStyledAttributes.getFloat(index, this.f2679q);
                } else if (index == C0435e.C0448m.ConstraintSet_android_scaleY) {
                    this.f2680r = obtainStyledAttributes.getFloat(index, this.f2680r);
                } else if (index == C0435e.C0448m.ConstraintSet_android_transformPivotX) {
                    this.f2681s = obtainStyledAttributes.getFloat(index, this.f2681s);
                } else if (index == C0435e.C0448m.ConstraintSet_android_transformPivotY) {
                    this.f2682t = obtainStyledAttributes.getFloat(index, this.f2682t);
                } else if (index == C0435e.C0448m.ConstraintSet_android_translationX) {
                    this.f2683u = obtainStyledAttributes.getFloat(index, this.f2683u);
                } else if (index == C0435e.C0448m.ConstraintSet_android_translationY) {
                    this.f2684v = obtainStyledAttributes.getFloat(index, this.f2684v);
                } else if (index == C0435e.C0448m.ConstraintSet_android_translationZ) {
                    this.f2685w = obtainStyledAttributes.getFloat(index, this.f2685w);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ConstraintLayout.LayoutParams) layoutParams);
            this.f2673l = 1.0f;
            this.f2676n = false;
            this.f2674m = 0.0f;
            this.f2675n = 0.0f;
            this.f2677o = 0.0f;
            this.f2678p = 0.0f;
            this.f2679q = 1.0f;
            this.f2680r = 1.0f;
            this.f2681s = 0.0f;
            this.f2682t = 0.0f;
            this.f2683u = 0.0f;
            this.f2684v = 0.0f;
            this.f2685w = 0.0f;
        }
    }

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo3265c(attributeSet);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo3265c(attributeSet);
        super.setVisibility(8);
    }

    /* renamed from: a */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: b */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: c */
    public final void mo3265c(AttributeSet attributeSet) {
        Log.v(f2671b, " ################# init");
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public C0426d getConstraintSet() {
        if (this.f2672a == null) {
            this.f2672a = new C0426d();
        }
        this.f2672a.mo3401J(this);
        return this.f2672a;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
