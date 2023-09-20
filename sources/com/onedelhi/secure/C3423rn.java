package com.onedelhi.secure;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.onedelhi.secure.hl3;

@hl3({hl3.C2354a.LIBRARY_GROUP})
/* renamed from: com.onedelhi.secure.rn */
public class C3423rn extends Drawable {

    /* renamed from: b */
    public static final float f19926b = 1.3333f;
    @zk0

    /* renamed from: a */
    public float f19927a;
    @d10

    /* renamed from: a */
    public int f19928a;
    @ts2

    /* renamed from: a */
    public ColorStateList f19929a;
    @mr2

    /* renamed from: a */
    public final Paint f19930a;

    /* renamed from: a */
    public final Path f19931a = new Path();

    /* renamed from: a */
    public final Rect f19932a = new Rect();

    /* renamed from: a */
    public final RectF f19933a = new RectF();

    /* renamed from: a */
    public final C3425b f19934a = new C3425b();

    /* renamed from: a */
    public uw3 f19935a;

    /* renamed from: a */
    public final vw3 f19936a = vw3.m68560k();

    /* renamed from: a */
    public boolean f19937a = true;
    @d10

    /* renamed from: b */
    public int f19938b;

    /* renamed from: b */
    public final RectF f19939b = new RectF();
    @d10

    /* renamed from: c */
    public int f19940c;
    @d10

    /* renamed from: d */
    public int f19941d;
    @d10

    /* renamed from: e */
    public int f19942e;

    /* renamed from: com.onedelhi.secure.rn$b */
    public class C3425b extends Drawable.ConstantState {
        public C3425b() {
        }

        public int getChangingConfigurations() {
            return 0;
        }

        @mr2
        public Drawable newDrawable() {
            return C3423rn.this;
        }
    }

    public C3423rn(uw3 uw3) {
        this.f19935a = uw3;
        Paint paint = new Paint(1);
        this.f19930a = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @mr2
    /* renamed from: a */
    public final Shader mo23940a() {
        Rect rect = this.f19932a;
        copyBounds(rect);
        float height = this.f19927a / ((float) rect.height());
        return new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{p10.m24319t(this.f19928a, this.f19942e), p10.m24319t(this.f19938b, this.f19942e), p10.m24319t(p10.m24299B(this.f19938b, 0), this.f19942e), p10.m24319t(p10.m24299B(this.f19941d, 0), this.f19942e), p10.m24319t(this.f19941d, this.f19942e), p10.m24319t(this.f19940c, this.f19942e)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    @mr2
    /* renamed from: b */
    public RectF mo23941b() {
        this.f19939b.set(getBounds());
        return this.f19939b;
    }

    /* renamed from: c */
    public uw3 mo23942c() {
        return this.f19935a;
    }

    /* renamed from: d */
    public void mo23943d(@ts2 ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f19942e = colorStateList.getColorForState(getState(), this.f19942e);
        }
        this.f19929a = colorStateList;
        this.f19937a = true;
        invalidateSelf();
    }

    public void draw(@mr2 Canvas canvas) {
        if (this.f19937a) {
            this.f19930a.setShader(mo23940a());
            this.f19937a = false;
        }
        float strokeWidth = this.f19930a.getStrokeWidth() / 2.0f;
        copyBounds(this.f19932a);
        this.f19933a.set(this.f19932a);
        float min = Math.min(this.f19935a.mo45820r().mo32234a(mo23941b()), this.f19933a.width() / 2.0f);
        if (this.f19935a.mo45823u(mo23941b())) {
            this.f19933a.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f19933a, min, min, this.f19930a);
        }
    }

    /* renamed from: e */
    public void mo23945e(@zk0 float f) {
        if (this.f19927a != f) {
            this.f19927a = f;
            this.f19930a.setStrokeWidth(f * 1.3333f);
            this.f19937a = true;
            invalidateSelf();
        }
    }

    /* renamed from: f */
    public void mo23946f(@d10 int i, @d10 int i2, @d10 int i3, @d10 int i4) {
        this.f19928a = i;
        this.f19938b = i2;
        this.f19940c = i3;
        this.f19941d = i4;
    }

    /* renamed from: g */
    public void mo23947g(uw3 uw3) {
        this.f19935a = uw3;
        invalidateSelf();
    }

    @ts2
    public Drawable.ConstantState getConstantState() {
        return this.f19934a;
    }

    public int getOpacity() {
        return this.f19927a > 0.0f ? -3 : -2;
    }

    @TargetApi(21)
    public void getOutline(@mr2 Outline outline) {
        if (this.f19935a.mo45823u(mo23941b())) {
            outline.setRoundRect(getBounds(), this.f19935a.mo45820r().mo32234a(mo23941b()));
            return;
        }
        copyBounds(this.f19932a);
        this.f19933a.set(this.f19932a);
        this.f19936a.mo46402d(this.f19935a, 1.0f, this.f19933a, this.f19931a);
        if (this.f19931a.isConvex()) {
            outline.setConvexPath(this.f19931a);
        }
    }

    public boolean getPadding(@mr2 Rect rect) {
        if (!this.f19935a.mo45823u(mo23941b())) {
            return true;
        }
        int round = Math.round(this.f19927a);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f19929a;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    public void onBoundsChange(Rect rect) {
        this.f19937a = true;
    }

    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f19929a;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f19942e)) == this.f19942e)) {
            this.f19937a = true;
            this.f19942e = colorForState;
        }
        if (this.f19937a) {
            invalidateSelf();
        }
        return this.f19937a;
    }

    public void setAlpha(@js1(from = 0, mo18580to = 255) int i) {
        this.f19930a.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(@ts2 ColorFilter colorFilter) {
        this.f19930a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
