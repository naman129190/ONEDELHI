package com.onedelhi.secure;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

public final class py4 extends Drawable.ConstantState {

    /* renamed from: a */
    public int f18837a;

    /* renamed from: a */
    public ColorStateList f18838a = null;

    /* renamed from: a */
    public PorterDuff.Mode f18839a = ny4.f17622b;

    /* renamed from: a */
    public Drawable.ConstantState f18840a;

    public py4(@ts2 py4 py4) {
        if (py4 != null) {
            this.f18837a = py4.f18837a;
            this.f18840a = py4.f18840a;
            this.f18838a = py4.f18838a;
            this.f18839a = py4.f18839a;
        }
    }

    /* renamed from: a */
    public boolean mo22783a() {
        return this.f18840a != null;
    }

    public int getChangingConfigurations() {
        int i = this.f18837a;
        Drawable.ConstantState constantState = this.f18840a;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @mr2
    public Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    @mr2
    public Drawable newDrawable(@ts2 Resources resources) {
        return new oy4(this, resources);
    }
}
