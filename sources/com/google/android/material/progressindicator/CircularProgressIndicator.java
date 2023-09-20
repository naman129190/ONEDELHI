package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.onedelhi.secure.C3982yb;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ok0;
import com.onedelhi.secure.tp1;
import com.onedelhi.secure.ts2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {

    /* renamed from: A */
    public static final int f24213A = fd3.C2164n.Widget_MaterialComponents_CircularProgressIndicator;

    /* renamed from: B */
    public static final int f24214B = 0;

    /* renamed from: C */
    public static final int f24215C = 1;

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.progressindicator.CircularProgressIndicator$a */
    public @interface C4175a {
    }

    public CircularProgressIndicator(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public CircularProgressIndicator(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(@mr2 Context context, @ts2 AttributeSet attributeSet, @C3982yb int i) {
        super(context, attributeSet, i, f24213A);
        mo28603t();
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f24197a).f24218h;
    }

    @e83
    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f24197a).f24217g;
    }

    @e83
    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f24197a).f24216f;
    }

    /* renamed from: s */
    public CircularProgressIndicatorSpec mo28564i(@mr2 Context context, @mr2 AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public void setIndicatorDirection(int i) {
        ((CircularProgressIndicatorSpec) this.f24197a).f24218h = i;
        invalidate();
    }

    public void setIndicatorInset(@e83 int i) {
        S s = this.f24197a;
        if (((CircularProgressIndicatorSpec) s).f24217g != i) {
            ((CircularProgressIndicatorSpec) s).f24217g = i;
            invalidate();
        }
    }

    public void setIndicatorSize(@e83 int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        S s = this.f24197a;
        if (((CircularProgressIndicatorSpec) s).f24216f != max) {
            ((CircularProgressIndicatorSpec) s).f24216f = max;
            ((CircularProgressIndicatorSpec) s).mo28604e();
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((CircularProgressIndicatorSpec) this.f24197a).mo28604e();
    }

    /* renamed from: t */
    public final void mo28603t() {
        setIndeterminateDrawable(tp1.m66092x(getContext(), (CircularProgressIndicatorSpec) this.f24197a));
        setProgressDrawable(ok0.m59435A(getContext(), (CircularProgressIndicatorSpec) this.f24197a));
    }
}
