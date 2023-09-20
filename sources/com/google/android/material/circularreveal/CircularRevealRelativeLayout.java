package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.google.android.material.circularreveal.C1556c;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

public class CircularRevealRelativeLayout extends RelativeLayout implements C1556c {
    @mr2

    /* renamed from: a */
    public final C1553b f8177a;

    public CircularRevealRelativeLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public CircularRevealRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8177a = new C1553b(this);
    }

    /* renamed from: a */
    public boolean mo11932a() {
        return super.isOpaque();
    }

    /* renamed from: c */
    public void mo11933c() {
        this.f8177a.mo11946a();
    }

    /* renamed from: d */
    public void mo11934d() {
        this.f8177a.mo11947b();
    }

    public void draw(@mr2 Canvas canvas) {
        C1553b bVar = this.f8177a;
        if (bVar != null) {
            bVar.mo11948c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    /* renamed from: e */
    public void mo11936e(Canvas canvas) {
        super.draw(canvas);
    }

    @ts2
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f8177a.mo11952g();
    }

    public int getCircularRevealScrimColor() {
        return this.f8177a.mo11953h();
    }

    @ts2
    public C1556c.C1561e getRevealInfo() {
        return this.f8177a.mo11955j();
    }

    public boolean isOpaque() {
        C1553b bVar = this.f8177a;
        return bVar != null ? bVar.mo11957l() : super.isOpaque();
    }

    public void setCircularRevealOverlayDrawable(@ts2 Drawable drawable) {
        this.f8177a.mo11958m(drawable);
    }

    public void setCircularRevealScrimColor(@d10 int i) {
        this.f8177a.mo11959n(i);
    }

    public void setRevealInfo(@ts2 C1556c.C1561e eVar) {
        this.f8177a.mo11960o(eVar);
    }
}
