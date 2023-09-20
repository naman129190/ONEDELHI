package com.onedelhi.secure;

import android.graphics.RectF;
import java.util.Arrays;

public final class ph3 implements z80 {

    /* renamed from: a */
    public final float f33683a;

    public ph3(@d81(from = 0.0d, mo14561to = 1.0d) float f) {
        this.f33683a = f;
    }

    /* renamed from: a */
    public float mo32234a(@mr2 RectF rectF) {
        return this.f33683a * rectF.height();
    }

    @d81(from = 0.0d, mo14561to = 1.0d)
    /* renamed from: b */
    public float mo42621b() {
        return this.f33683a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ph3) && this.f33683a == ((ph3) obj).f33683a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f33683a)});
    }
}
