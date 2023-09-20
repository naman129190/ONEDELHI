package com.onedelhi.secure;

import android.graphics.drawable.Drawable;

public final class v45 extends Drawable.ConstantState {

    /* renamed from: a */
    public int f21663a;

    /* renamed from: b */
    public int f21664b;

    public v45(@ts2 v45 v45) {
        if (v45 != null) {
            this.f21663a = v45.f21663a;
            this.f21664b = v45.f21664b;
        }
    }

    public final int getChangingConfigurations() {
        return this.f21663a;
    }

    public final Drawable newDrawable() {
        return new x45(this);
    }
}
