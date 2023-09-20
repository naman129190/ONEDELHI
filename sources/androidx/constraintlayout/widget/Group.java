package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Group extends ConstraintHelper {
    public Group(Context context) {
        super(context);
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: D */
    public void mo2702D(ConstraintLayout constraintLayout) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f2550a.mo21691c2(0);
        layoutParams.f2550a.mo21758y1(0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo3203p();
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
        this.f2465b = false;
    }
}
