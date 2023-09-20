package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.onedelhi.secure.C3982yb;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.l32;
import com.onedelhi.secure.m32;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ok0;
import com.onedelhi.secure.sp1;
import com.onedelhi.secure.tp1;
import com.onedelhi.secure.ts2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {

    /* renamed from: A */
    public static final int f24219A = fd3.C2164n.Widget_MaterialComponents_LinearProgressIndicator;

    /* renamed from: B */
    public static final int f24220B = 0;

    /* renamed from: C */
    public static final int f24221C = 1;

    /* renamed from: D */
    public static final int f24222D = 0;

    /* renamed from: E */
    public static final int f24223E = 1;

    /* renamed from: F */
    public static final int f24224F = 2;

    /* renamed from: G */
    public static final int f24225G = 3;

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.progressindicator.LinearProgressIndicator$a */
    public @interface C4176a {
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.progressindicator.LinearProgressIndicator$b */
    public @interface C4177b {
    }

    public LinearProgressIndicator(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public LinearProgressIndicator(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(@mr2 Context context, @ts2 AttributeSet attributeSet, @C3982yb int i) {
        super(context, attributeSet, i, f24219A);
        mo28612t();
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.f24197a).f24227f;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.f24197a).f24228g;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S s = this.f24197a;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s;
        boolean z2 = true;
        if (!(((LinearProgressIndicatorSpec) s).f24228g == 1 || ((jt4.m18928Z(this) == 1 && ((LinearProgressIndicatorSpec) this.f24197a).f24228g == 2) || (jt4.m18928Z(this) == 0 && ((LinearProgressIndicatorSpec) this.f24197a).f24228g == 3)))) {
            z2 = false;
        }
        linearProgressIndicatorSpec.f24226a = z2;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        tp1 indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        ok0 progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    /* renamed from: s */
    public LinearProgressIndicatorSpec mo28564i(@mr2 Context context, @mr2 AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    public void setIndeterminateAnimationType(int i) {
        tp1 tp1;
        sp1 sp1;
        if (((LinearProgressIndicatorSpec) this.f24197a).f24227f != i) {
            if (!mo28580r() || !isIndeterminate()) {
                S s = this.f24197a;
                ((LinearProgressIndicatorSpec) s).f24227f = i;
                ((LinearProgressIndicatorSpec) s).mo28604e();
                if (i == 0) {
                    tp1 = getIndeterminateDrawable();
                    sp1 = new l32((LinearProgressIndicatorSpec) this.f24197a);
                } else {
                    tp1 = getIndeterminateDrawable();
                    sp1 = new m32(getContext(), (LinearProgressIndicatorSpec) this.f24197a);
                }
                tp1.mo45219B(sp1);
                invalidate();
                return;
            }
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
    }

    public void setIndicatorColor(@mr2 int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f24197a).mo28604e();
    }

    public void setIndicatorDirection(int i) {
        S s = this.f24197a;
        ((LinearProgressIndicatorSpec) s).f24228g = i;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s;
        boolean z = true;
        if (!(i == 1 || ((jt4.m18928Z(this) == 1 && ((LinearProgressIndicatorSpec) this.f24197a).f24228g == 2) || (jt4.m18928Z(this) == 0 && i == 3)))) {
            z = false;
        }
        linearProgressIndicatorSpec.f24226a = z;
        invalidate();
    }

    public void setProgressCompat(int i, boolean z) {
        S s = this.f24197a;
        if (s == null || ((LinearProgressIndicatorSpec) s).f24227f != 0 || !isIndeterminate()) {
            super.setProgressCompat(i, z);
        }
    }

    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((LinearProgressIndicatorSpec) this.f24197a).mo28604e();
        invalidate();
    }

    /* renamed from: t */
    public final void mo28612t() {
        setIndeterminateDrawable(tp1.m66093y(getContext(), (LinearProgressIndicatorSpec) this.f24197a));
        setProgressDrawable(ok0.m59436B(getContext(), (LinearProgressIndicatorSpec) this.f24197a));
    }
}
