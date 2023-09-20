package com.onedelhi.secure;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.onedelhi.secure.fd3;

/* renamed from: com.onedelhi.secure.sj */
public abstract class C6774sj {
    @e83

    /* renamed from: a */
    public int f35099a;
    @mr2

    /* renamed from: a */
    public int[] f35100a = new int[0];
    @e83

    /* renamed from: b */
    public int f35101b;
    @d10

    /* renamed from: c */
    public int f35102c;

    /* renamed from: d */
    public int f35103d;

    /* renamed from: e */
    public int f35104e;

    public C6774sj(@mr2 Context context, @ts2 AttributeSet attributeSet, @C3982yb int i, @e64 int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(fd3.C2156f.mtrl_progress_track_thickness);
        TypedArray k = ob4.m59195k(context, attributeSet, fd3.C2165o.BaseProgressIndicator, i, i2, new int[0]);
        this.f35099a = af2.m38613d(context, k, fd3.C2165o.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.f35101b = Math.min(af2.m38613d(context, k, fd3.C2165o.BaseProgressIndicator_trackCornerRadius, 0), this.f35099a / 2);
        this.f35103d = k.getInt(fd3.C2165o.BaseProgressIndicator_showAnimationBehavior, 0);
        this.f35104e = k.getInt(fd3.C2165o.BaseProgressIndicator_hideAnimationBehavior, 0);
        mo44381c(context, k);
        mo44382d(context, k);
        k.recycle();
    }

    /* renamed from: a */
    public boolean mo44379a() {
        return this.f35104e != 0;
    }

    /* renamed from: b */
    public boolean mo44380b() {
        return this.f35103d != 0;
    }

    /* renamed from: c */
    public final void mo44381c(@mr2 Context context, @mr2 TypedArray typedArray) {
        int i = fd3.C2165o.BaseProgressIndicator_indicatorColor;
        if (!typedArray.hasValue(i)) {
            this.f35100a = new int[]{oe2.m23716b(context, fd3.C2153c.colorPrimary, -1)};
        } else if (typedArray.peekValue(i).type != 1) {
            this.f35100a = new int[]{typedArray.getColor(i, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i, -1));
            this.f35100a = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
    }

    /* renamed from: d */
    public final void mo44382d(@mr2 Context context, @mr2 TypedArray typedArray) {
        int a;
        int i = fd3.C2165o.BaseProgressIndicator_trackColor;
        if (typedArray.hasValue(i)) {
            a = typedArray.getColor(i, -1);
        } else {
            this.f35102c = this.f35100a[0];
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
            float f = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            a = oe2.m23715a(this.f35102c, (int) (f * 255.0f));
        }
        this.f35102c = a;
    }

    /* renamed from: e */
    public abstract void mo28604e();
}
