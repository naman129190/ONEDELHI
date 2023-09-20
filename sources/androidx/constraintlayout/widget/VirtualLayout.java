package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.C0435e;
import com.onedelhi.secure.dw4;

public abstract class VirtualLayout extends ConstraintHelper {

    /* renamed from: c */
    public boolean f2694c;

    /* renamed from: d */
    public boolean f2695d;

    public VirtualLayout(Context context) {
        super(context);
    }

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: J */
    public void mo2675J(dw4 dw4, int i, int i2) {
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2694c || this.f2695d) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f2467n; i++) {
                    View t = constraintLayout.mo3248t(this.f2462a[i]);
                    if (t != null) {
                        if (this.f2694c) {
                            t.setVisibility(visibility);
                        }
                        if (this.f2695d && elevation > 0.0f) {
                            t.setTranslationZ(t.getTranslationZ() + elevation);
                        }
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

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo3203p();
    }

    /* renamed from: y */
    public void mo2673y(AttributeSet attributeSet) {
        super.mo2673y(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0435e.C0448m.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0435e.C0448m.ConstraintLayout_Layout_android_visibility) {
                    this.f2694c = true;
                } else if (index == C0435e.C0448m.ConstraintLayout_Layout_android_elevation) {
                    this.f2695d = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
