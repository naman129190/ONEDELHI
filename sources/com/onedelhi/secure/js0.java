package com.onedelhi.secure;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.onedelhi.secure.fd3;

public class js0 {

    /* renamed from: b */
    public static final float f14443b = 4.5f;

    /* renamed from: c */
    public static final float f14444c = 2.0f;

    /* renamed from: d */
    public static final int f14445d = ((int) Math.round(5.1000000000000005d));

    /* renamed from: a */
    public final float f14446a;

    /* renamed from: a */
    public final int f14447a;

    /* renamed from: a */
    public final boolean f14448a;

    /* renamed from: b */
    public final int f14449b;

    /* renamed from: c */
    public final int f14450c;

    public js0(@mr2 Context context) {
        this(je2.m53273b(context, fd3.C2153c.elevationOverlayEnabled, false), oe2.m23716b(context, fd3.C2153c.elevationOverlayColor, 0), oe2.m23716b(context, fd3.C2153c.elevationOverlayAccentColor, 0), oe2.m23716b(context, fd3.C2153c.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    public js0(boolean z, @d10 int i, @d10 int i2, @d10 int i3, float f) {
        this.f14448a = z;
        this.f14447a = i;
        this.f14449b = i2;
        this.f14450c = i3;
        this.f14446a = f;
    }

    /* renamed from: a */
    public int mo18566a(float f) {
        return Math.round(mo18567b(f) * 255.0f);
    }

    /* renamed from: b */
    public float mo18567b(float f) {
        float f2 = this.f14446a;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    @d10
    /* renamed from: c */
    public int mo18568c(@d10 int i, float f) {
        int i2;
        float b = mo18567b(f);
        int alpha = Color.alpha(i);
        int n = oe2.m23728n(p10.m24299B(i, 255), this.f14447a, b);
        if (b > 0.0f && (i2 = this.f14449b) != 0) {
            n = oe2.m23727m(n, p10.m24299B(i2, f14445d));
        }
        return p10.m24299B(n, alpha);
    }

    @d10
    /* renamed from: d */
    public int mo18569d(@d10 int i, float f, @mr2 View view) {
        return mo18568c(i, f + mo18574i(view));
    }

    @d10
    /* renamed from: e */
    public int mo18570e(@d10 int i, float f) {
        return (!this.f14448a || !mo18578m(i)) ? i : mo18568c(i, f);
    }

    @d10
    /* renamed from: f */
    public int mo18571f(@d10 int i, float f, @mr2 View view) {
        return mo18570e(i, f + mo18574i(view));
    }

    @d10
    /* renamed from: g */
    public int mo18572g(float f) {
        return mo18570e(this.f14450c, f);
    }

    @d10
    /* renamed from: h */
    public int mo18573h(float f, @mr2 View view) {
        return mo18572g(f + mo18574i(view));
    }

    /* renamed from: i */
    public float mo18574i(@mr2 View view) {
        return pv4.m61670j(view);
    }

    @d10
    /* renamed from: j */
    public int mo18575j() {
        return this.f14447a;
    }

    @d10
    /* renamed from: k */
    public int mo18576k() {
        return this.f14450c;
    }

    /* renamed from: l */
    public boolean mo18577l() {
        return this.f14448a;
    }

    /* renamed from: m */
    public final boolean mo18578m(@d10 int i) {
        return p10.m24299B(i, 255) == this.f14450c;
    }
}
