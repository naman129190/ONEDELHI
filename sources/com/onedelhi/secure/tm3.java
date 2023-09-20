package com.onedelhi.secure;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
public class tm3 extends Drawable implements nx3, we4 {

    /* renamed from: a */
    public C6891b f35731a;

    /* renamed from: com.onedelhi.secure.tm3$b */
    public static final class C6891b extends Drawable.ConstantState {
        @mr2

        /* renamed from: a */
        public bf2 f35732a;

        /* renamed from: a */
        public boolean f35733a;

        public C6891b(bf2 bf2) {
            this.f35732a = bf2;
            this.f35733a = false;
        }

        public C6891b(@mr2 C6891b bVar) {
            this.f35732a = (bf2) bVar.f35732a.getConstantState().newDrawable();
            this.f35733a = bVar.f35733a;
        }

        @mr2
        /* renamed from: a */
        public tm3 newDrawable() {
            return new tm3(new C6891b(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }
    }

    public tm3(C6891b bVar) {
        this.f35731a = bVar;
    }

    public tm3(uw3 uw3) {
        this(new C6891b(new bf2(uw3)));
    }

    @mr2
    /* renamed from: a */
    public tm3 mutate() {
        this.f35731a = new C6891b(this.f35731a);
        return this;
    }

    public void draw(Canvas canvas) {
        C6891b bVar = this.f35731a;
        if (bVar.f35733a) {
            bVar.f35732a.draw(canvas);
        }
    }

    @ts2
    public Drawable.ConstantState getConstantState() {
        return this.f35731a;
    }

    public int getOpacity() {
        return this.f35731a.f35732a.getOpacity();
    }

    @mr2
    public uw3 getShapeAppearanceModel() {
        return this.f35731a.f35732a.getShapeAppearanceModel();
    }

    public boolean isStateful() {
        return true;
    }

    public void onBoundsChange(@mr2 Rect rect) {
        super.onBoundsChange(rect);
        this.f35731a.f35732a.setBounds(rect);
    }

    public boolean onStateChange(@mr2 int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f35731a.f35732a.setState(iArr)) {
            onStateChange = true;
        }
        boolean f = um3.m67328f(iArr);
        C6891b bVar = this.f35731a;
        if (bVar.f35733a == f) {
            return onStateChange;
        }
        bVar.f35733a = f;
        return true;
    }

    public void setAlpha(int i) {
        this.f35731a.f35732a.setAlpha(i);
    }

    public void setColorFilter(@ts2 ColorFilter colorFilter) {
        this.f35731a.f35732a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(@mr2 uw3 uw3) {
        this.f35731a.f35732a.setShapeAppearanceModel(uw3);
    }

    public void setTint(@d10 int i) {
        this.f35731a.f35732a.setTint(i);
    }

    public void setTintList(@ts2 ColorStateList colorStateList) {
        this.f35731a.f35732a.setTintList(colorStateList);
    }

    public void setTintMode(@ts2 PorterDuff.Mode mode) {
        this.f35731a.f35732a.setTintMode(mode);
    }
}
