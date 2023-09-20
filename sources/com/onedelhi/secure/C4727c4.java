package com.onedelhi.secure;

import android.graphics.RectF;
import com.onedelhi.secure.hl3;
import java.util.Arrays;

@hl3({hl3.C2354a.LIBRARY_GROUP})
/* renamed from: com.onedelhi.secure.c4 */
public final class C4727c4 implements z80 {

    /* renamed from: a */
    public final float f26636a;

    /* renamed from: a */
    public final z80 f26637a;

    public C4727c4(float f, @mr2 z80 z80) {
        while (z80 instanceof C4727c4) {
            z80 = ((C4727c4) z80).f26637a;
            f += ((C4727c4) z80).f26636a;
        }
        this.f26637a = z80;
        this.f26636a = f;
    }

    /* renamed from: a */
    public float mo32234a(@mr2 RectF rectF) {
        return Math.max(0.0f, this.f26637a.mo32234a(rectF) + this.f26636a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4727c4)) {
            return false;
        }
        C4727c4 c4Var = (C4727c4) obj;
        return this.f26637a.equals(c4Var.f26637a) && this.f26636a == c4Var.f26636a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26637a, Float.valueOf(this.f26636a)});
    }
}
