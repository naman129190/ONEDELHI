package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.onedelhi.secure.C3982yb;
import com.onedelhi.secure.C6774sj;
import com.onedelhi.secure.af2;
import com.onedelhi.secure.e64;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ob4;
import com.onedelhi.secure.ts2;

public final class CircularProgressIndicatorSpec extends C6774sj {
    @e83

    /* renamed from: f */
    public int f24216f;
    @e83

    /* renamed from: g */
    public int f24217g;

    /* renamed from: h */
    public int f24218h;

    public CircularProgressIndicatorSpec(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicatorSpec(@mr2 Context context, @ts2 AttributeSet attributeSet, @C3982yb int i) {
        this(context, attributeSet, i, CircularProgressIndicator.f24213A);
    }

    public CircularProgressIndicatorSpec(@mr2 Context context, @ts2 AttributeSet attributeSet, @C3982yb int i, @e64 int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(fd3.C2156f.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(fd3.C2156f.mtrl_progress_circular_inset_medium);
        TypedArray k = ob4.m59195k(context, attributeSet, fd3.C2165o.CircularProgressIndicator, i, i2, new int[0]);
        this.f24216f = Math.max(af2.m38613d(context, k, fd3.C2165o.CircularProgressIndicator_indicatorSize, dimensionPixelSize), this.f35099a * 2);
        this.f24217g = af2.m38613d(context, k, fd3.C2165o.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.f24218h = k.getInt(fd3.C2165o.CircularProgressIndicator_indicatorDirectionCircular, 0);
        k.recycle();
        mo28604e();
    }

    /* renamed from: e */
    public void mo28604e() {
    }
}
