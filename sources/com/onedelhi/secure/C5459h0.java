package com.onedelhi.secure;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: com.onedelhi.secure.h0 */
public final class C5459h0 implements z80 {

    /* renamed from: a */
    public final float f29347a;

    public C5459h0(float f) {
        this.f29347a = f;
    }

    /* renamed from: a */
    public float mo32234a(@mr2 RectF rectF) {
        return this.f29347a;
    }

    /* renamed from: b */
    public float mo36989b() {
        return this.f29347a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5459h0) && this.f29347a == ((C5459h0) obj).f29347a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f29347a)});
    }
}
