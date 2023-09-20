package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.onedelhi.secure.C3982yb;
import com.onedelhi.secure.C6774sj;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ob4;
import com.onedelhi.secure.ts2;

public final class LinearProgressIndicatorSpec extends C6774sj {

    /* renamed from: a */
    public boolean f24226a;

    /* renamed from: f */
    public int f24227f;

    /* renamed from: g */
    public int f24228g;

    public LinearProgressIndicatorSpec(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicatorSpec(@mr2 Context context, @ts2 AttributeSet attributeSet, @C3982yb int i) {
        this(context, attributeSet, i, LinearProgressIndicator.f24219A);
    }

    public LinearProgressIndicatorSpec(@mr2 Context context, @ts2 AttributeSet attributeSet, @C3982yb int i, @e64 int i2) {
        super(context, attributeSet, i, i2);
        boolean z = false;
        TypedArray k = ob4.m59195k(context, attributeSet, fd3.C2165o.LinearProgressIndicator, fd3.C2153c.linearProgressIndicatorStyle, LinearProgressIndicator.f24219A, new int[0]);
        this.f24227f = k.getInt(fd3.C2165o.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.f24228g = k.getInt(fd3.C2165o.LinearProgressIndicator_indicatorDirectionLinear, 0);
        k.recycle();
        mo28604e();
        this.f24226a = this.f24228g == 1 ? true : z;
    }

    /* renamed from: e */
    public void mo28604e() {
        if (this.f24227f != 0) {
            return;
        }
        if (this.f35101b > 0) {
            throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
        } else if (this.f35100a.length < 3) {
            throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
        }
    }
}
