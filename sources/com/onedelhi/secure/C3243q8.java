package com.onedelhi.secure;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.onedelhi.secure.za3;

/* renamed from: com.onedelhi.secure.q8 */
public class C3243q8 extends C2934n8 {

    /* renamed from: a */
    public ColorStateList f18962a = null;

    /* renamed from: a */
    public PorterDuff.Mode f18963a = null;

    /* renamed from: a */
    public Drawable f18964a;

    /* renamed from: a */
    public final SeekBar f18965a;

    /* renamed from: a */
    public boolean f18966a = false;

    /* renamed from: b */
    public boolean f18967b = false;

    public C3243q8(SeekBar seekBar) {
        super(seekBar);
        this.f18965a = seekBar;
    }

    /* renamed from: c */
    public void mo20993c(AttributeSet attributeSet, int i) {
        super.mo20993c(attributeSet, i);
        Context context = this.f18965a.getContext();
        int[] iArr = za3.C4068m.AppCompatSeekBar;
        af4 G = af4.m11110G(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f18965a;
        jt4.m19033z1(seekBar, seekBar.getContext(), iArr, attributeSet, G.mo13025B(), i, 0);
        Drawable i2 = G.mo13038i(za3.C4068m.AppCompatSeekBar_android_thumb);
        if (i2 != null) {
            this.f18965a.setThumb(i2);
        }
        mo22940m(G.mo13037h(za3.C4068m.AppCompatSeekBar_tickMark));
        int i3 = za3.C4068m.AppCompatSeekBar_tickMarkTintMode;
        if (G.mo13026C(i3)) {
            this.f18963a = jp0.m18734e(G.mo13044o(i3, -1), this.f18963a);
            this.f18967b = true;
        }
        int i4 = za3.C4068m.AppCompatSeekBar_tickMarkTint;
        if (G.mo13026C(i4)) {
            this.f18962a = G.mo13033d(i4);
            this.f18966a = true;
        }
        G.mo13029I();
        mo22933f();
    }

    /* renamed from: f */
    public final void mo22933f() {
        Drawable drawable = this.f18964a;
        if (drawable == null) {
            return;
        }
        if (this.f18966a || this.f18967b) {
            Drawable r = wo0.m30989r(drawable.mutate());
            this.f18964a = r;
            if (this.f18966a) {
                wo0.m30986o(r, this.f18962a);
            }
            if (this.f18967b) {
                wo0.m30987p(this.f18964a, this.f18963a);
            }
            if (this.f18964a.isStateful()) {
                this.f18964a.setState(this.f18965a.getDrawableState());
            }
        }
    }

    /* renamed from: g */
    public void mo22934g(Canvas canvas) {
        if (this.f18964a != null) {
            int max = this.f18965a.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f18964a.getIntrinsicWidth();
                int intrinsicHeight = this.f18964a.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f18964a.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f18965a.getWidth() - this.f18965a.getPaddingLeft()) - this.f18965a.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f18965a.getPaddingLeft(), (float) (this.f18965a.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f18964a.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: h */
    public void mo22935h() {
        Drawable drawable = this.f18964a;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f18965a.getDrawableState())) {
            this.f18965a.invalidateDrawable(drawable);
        }
    }

    @ts2
    /* renamed from: i */
    public Drawable mo22936i() {
        return this.f18964a;
    }

    @ts2
    /* renamed from: j */
    public ColorStateList mo22937j() {
        return this.f18962a;
    }

    @ts2
    /* renamed from: k */
    public PorterDuff.Mode mo22938k() {
        return this.f18963a;
    }

    /* renamed from: l */
    public void mo22939l() {
        Drawable drawable = this.f18964a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: m */
    public void mo22940m(@ts2 Drawable drawable) {
        Drawable drawable2 = this.f18964a;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f18964a = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f18965a);
            wo0.m30984m(drawable, jt4.m18928Z(this.f18965a));
            if (drawable.isStateful()) {
                drawable.setState(this.f18965a.getDrawableState());
            }
            mo22933f();
        }
        this.f18965a.invalidate();
    }

    /* renamed from: n */
    public void mo22941n(@ts2 ColorStateList colorStateList) {
        this.f18962a = colorStateList;
        this.f18966a = true;
        mo22933f();
    }

    /* renamed from: o */
    public void mo22942o(@ts2 PorterDuff.Mode mode) {
        this.f18963a = mode;
        this.f18967b = true;
        mo22933f();
    }
}
