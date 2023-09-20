package com.onedelhi.secure;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.C1173a;
import com.onedelhi.secure.C2218g6;
import com.onedelhi.secure.tg1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class ng1 extends Drawable implements tg1.C3603b, Animatable, C2218g6 {

    /* renamed from: p */
    public static final int f17405p = -1;

    /* renamed from: q */
    public static final int f17406q = 0;

    /* renamed from: r */
    public static final int f17407r = 119;

    /* renamed from: a */
    public Paint f17408a;

    /* renamed from: a */
    public Rect f17409a;

    /* renamed from: a */
    public final C2978a f17410a;

    /* renamed from: a */
    public List<C2218g6.C2219a> f17411a;

    /* renamed from: b */
    public boolean f17412b;

    /* renamed from: c */
    public boolean f17413c;

    /* renamed from: d */
    public boolean f17414d;

    /* renamed from: e */
    public boolean f17415e;

    /* renamed from: f */
    public boolean f17416f;

    /* renamed from: n */
    public int f17417n;

    /* renamed from: o */
    public int f17418o;

    /* renamed from: com.onedelhi.secure.ng1$a */
    public static final class C2978a extends Drawable.ConstantState {
        @hw4

        /* renamed from: a */
        public final tg1 f17419a;

        public C2978a(tg1 tg1) {
            this.f17419a = tg1;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @mr2
        public Drawable newDrawable() {
            return new ng1(this);
        }

        @mr2
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    @Deprecated
    public ng1(Context context, mg1 mg1, C2355hm hmVar, sg4<Bitmap> sg4, int i, int i2, Bitmap bitmap) {
        this(context, mg1, sg4, i, i2, bitmap);
    }

    public ng1(Context context, mg1 mg1, sg4<Bitmap> sg4, int i, int i2, Bitmap bitmap) {
        this(new C2978a(new tg1(C1173a.m7529e(context), mg1, i, i2, sg4, bitmap)));
    }

    public ng1(C2978a aVar) {
        this.f17415e = true;
        this.f17418o = -1;
        this.f17410a = (C2978a) g43.m15509d(aVar);
    }

    @hw4
    public ng1(tg1 tg1, Paint paint) {
        this(new C2978a(tg1));
        this.f17408a = paint;
    }

    /* renamed from: a */
    public void mo21230a() {
        if (mo21232e() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (mo21242j() == mo21240i() - 1) {
            this.f17417n++;
        }
        int i = this.f17418o;
        if (i != -1 && this.f17417n >= i) {
            mo21247o();
            stop();
        }
    }

    /* renamed from: b */
    public void mo13425b() {
        List<C2218g6.C2219a> list = this.f17411a;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: c */
    public void mo13426c(@mr2 C2218g6.C2219a aVar) {
        if (aVar != null) {
            if (this.f17411a == null) {
                this.f17411a = new ArrayList();
            }
            this.f17411a.add(aVar);
        }
    }

    /* renamed from: d */
    public boolean mo13429d(@mr2 C2218g6.C2219a aVar) {
        List<C2218g6.C2219a> list = this.f17411a;
        if (list == null || aVar == null) {
            return false;
        }
        return list.remove(aVar);
    }

    public void draw(@mr2 Canvas canvas) {
        if (!this.f17414d) {
            if (this.f17416f) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), mo21234g());
                this.f17416f = false;
            }
            canvas.drawBitmap(this.f17410a.f17419a.mo24906c(), (Rect) null, mo21234g(), mo21244l());
        }
    }

    /* renamed from: e */
    public final Drawable.Callback mo21232e() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: f */
    public ByteBuffer mo21233f() {
        return this.f17410a.f17419a.mo24905b();
    }

    /* renamed from: g */
    public final Rect mo21234g() {
        if (this.f17409a == null) {
            this.f17409a = new Rect();
        }
        return this.f17409a;
    }

    public Drawable.ConstantState getConstantState() {
        return this.f17410a;
    }

    public int getIntrinsicHeight() {
        return this.f17410a.f17419a.mo24911i();
    }

    public int getIntrinsicWidth() {
        return this.f17410a.f17419a.mo24914m();
    }

    public int getOpacity() {
        return -2;
    }

    /* renamed from: h */
    public Bitmap mo21239h() {
        return this.f17410a.f17419a.mo24908e();
    }

    /* renamed from: i */
    public int mo21240i() {
        return this.f17410a.f17419a.mo24909f();
    }

    public boolean isRunning() {
        return this.f17412b;
    }

    /* renamed from: j */
    public int mo21242j() {
        return this.f17410a.f17419a.mo24907d();
    }

    /* renamed from: k */
    public sg4<Bitmap> mo21243k() {
        return this.f17410a.f17419a.mo24910h();
    }

    /* renamed from: l */
    public final Paint mo21244l() {
        if (this.f17408a == null) {
            this.f17408a = new Paint(2);
        }
        return this.f17408a;
    }

    /* renamed from: m */
    public int mo21245m() {
        return this.f17410a.f17419a.mo24913l();
    }

    /* renamed from: n */
    public boolean mo21246n() {
        return this.f17414d;
    }

    /* renamed from: o */
    public final void mo21247o() {
        List<C2218g6.C2219a> list = this.f17411a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f17411a.get(i).mo11537b(this);
            }
        }
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f17416f = true;
    }

    /* renamed from: p */
    public void mo21249p() {
        this.f17414d = true;
        this.f17410a.f17419a.mo24904a();
    }

    /* renamed from: q */
    public final void mo21250q() {
        this.f17417n = 0;
    }

    /* renamed from: r */
    public void mo21251r(sg4<Bitmap> sg4, Bitmap bitmap) {
        this.f17410a.f17419a.mo24918q(sg4, bitmap);
    }

    /* renamed from: s */
    public void mo21252s(boolean z) {
        this.f17412b = z;
    }

    public void setAlpha(int i) {
        mo21244l().setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        mo21244l().setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        g43.m15506a(!this.f17414d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f17415e = z;
        if (!z) {
            mo21261w();
        } else if (this.f17413c) {
            mo21260v();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f17413c = true;
        mo21250q();
        if (this.f17415e) {
            mo21260v();
        }
    }

    public void stop() {
        this.f17413c = false;
        mo21261w();
    }

    /* renamed from: t */
    public void mo21258t(int i) {
        int i2 = -1;
        if (i <= 0 && i != -1 && i != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        } else if (i == 0) {
            int j = this.f17410a.f17419a.mo24912j();
            if (j != 0) {
                i2 = j;
            }
            this.f17418o = i2;
        } else {
            this.f17418o = i;
        }
    }

    /* renamed from: u */
    public void mo21259u() {
        g43.m15506a(!this.f17412b, "You cannot restart a currently running animation.");
        this.f17410a.f17419a.mo24919r();
        start();
    }

    /* renamed from: v */
    public final void mo21260v() {
        g43.m15506a(!this.f17414d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f17410a.f17419a.mo24909f() != 1) {
            if (!this.f17412b) {
                this.f17412b = true;
                this.f17410a.f17419a.mo24923v(this);
            } else {
                return;
            }
        }
        invalidateSelf();
    }

    /* renamed from: w */
    public final void mo21261w() {
        this.f17412b = false;
        this.f17410a.f17419a.mo24924w(this);
    }
}
