package com.onedelhi.secure;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;

public class tc0 extends bf2 {
    @mr2

    /* renamed from: d */
    public final RectF f35520d;

    public tc0() {
        this((uw3) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tc0(@ts2 uw3 uw3) {
        super(uw3 == null ? new uw3() : uw3);
        this.f35520d = new RectF();
    }

    /* renamed from: P0 */
    public boolean mo44958P0() {
        return !this.f35520d.isEmpty();
    }

    /* renamed from: Q0 */
    public void mo44959Q0() {
        mo44960R0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: R0 */
    public void mo44960R0(float f, float f2, float f3, float f4) {
        RectF rectF = this.f35520d;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* renamed from: S0 */
    public void mo44961S0(@mr2 RectF rectF) {
        mo44960R0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* renamed from: s */
    public void mo31634s(@mr2 Canvas canvas) {
        if (this.f35520d.isEmpty()) {
            super.mo31634s(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f35520d);
        } else {
            canvas.clipRect(this.f35520d, Region.Op.DIFFERENCE);
        }
        super.mo31634s(canvas);
        canvas.restore();
    }
}
