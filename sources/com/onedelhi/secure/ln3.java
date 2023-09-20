package com.onedelhi.secure;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;

public abstract class ln3 extends Drawable {

    /* renamed from: e */
    public static final int f15509e = 3;

    /* renamed from: a */
    public float f15510a;

    /* renamed from: a */
    public int f15511a = 160;

    /* renamed from: a */
    public final Bitmap f15512a;

    /* renamed from: a */
    public final BitmapShader f15513a;

    /* renamed from: a */
    public final Matrix f15514a = new Matrix();

    /* renamed from: a */
    public final Paint f15515a = new Paint(3);

    /* renamed from: a */
    public final Rect f15516a = new Rect();

    /* renamed from: a */
    public final RectF f15517a = new RectF();

    /* renamed from: a */
    public boolean f15518a = true;

    /* renamed from: b */
    public int f15519b = 119;

    /* renamed from: b */
    public boolean f15520b;

    /* renamed from: c */
    public int f15521c;

    /* renamed from: d */
    public int f15522d;

    public ln3(Resources resources, Bitmap bitmap) {
        BitmapShader bitmapShader;
        if (resources != null) {
            this.f15511a = resources.getDisplayMetrics().densityDpi;
        }
        this.f15512a = bitmap;
        if (bitmap != null) {
            mo19716a();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        } else {
            this.f15522d = -1;
            this.f15521c = -1;
            bitmapShader = null;
        }
        this.f15513a = bitmapShader;
    }

    /* renamed from: j */
    public static boolean m20868j(float f) {
        return f > 0.05f;
    }

    /* renamed from: a */
    public final void mo19716a() {
        this.f15521c = this.f15512a.getScaledWidth(this.f15511a);
        this.f15522d = this.f15512a.getScaledHeight(this.f15511a);
    }

    @ts2
    /* renamed from: b */
    public final Bitmap mo19717b() {
        return this.f15512a;
    }

    /* renamed from: c */
    public float mo19718c() {
        return this.f15510a;
    }

    /* renamed from: d */
    public int mo19719d() {
        return this.f15519b;
    }

    public void draw(@mr2 Canvas canvas) {
        Bitmap bitmap = this.f15512a;
        if (bitmap != null) {
            mo19742t();
            if (this.f15515a.getShader() == null) {
                canvas.drawBitmap(bitmap, (Rect) null, this.f15516a, this.f15515a);
                return;
            }
            RectF rectF = this.f15517a;
            float f = this.f15510a;
            canvas.drawRoundRect(rectF, f, f, this.f15515a);
        }
    }

    @mr2
    /* renamed from: e */
    public final Paint mo19721e() {
        return this.f15515a;
    }

    /* renamed from: f */
    public void mo19169f(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    public boolean mo19722g() {
        return this.f15515a.isAntiAlias();
    }

    public int getAlpha() {
        return this.f15515a.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f15515a.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.f15522d;
    }

    public int getIntrinsicWidth() {
        return this.f15521c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r3.f15512a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getOpacity() {
        /*
            r3 = this;
            int r0 = r3.f15519b
            r1 = -3
            r2 = 119(0x77, float:1.67E-43)
            if (r0 != r2) goto L_0x002a
            boolean r0 = r3.f15520b
            if (r0 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            android.graphics.Bitmap r0 = r3.f15512a
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.hasAlpha()
            if (r0 != 0) goto L_0x002a
            android.graphics.Paint r0 = r3.f15515a
            int r0 = r0.getAlpha()
            r2 = 255(0xff, float:3.57E-43)
            if (r0 < r2) goto L_0x002a
            float r0 = r3.f15510a
            boolean r0 = m20868j(r0)
            if (r0 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r1 = -1
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.ln3.getOpacity():int");
    }

    /* renamed from: h */
    public boolean mo19171h() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: i */
    public boolean mo19728i() {
        return this.f15520b;
    }

    /* renamed from: k */
    public void mo19729k(boolean z) {
        this.f15515a.setAntiAlias(z);
        invalidateSelf();
    }

    /* renamed from: l */
    public void mo19730l(boolean z) {
        this.f15520b = z;
        this.f15518a = true;
        if (z) {
            mo19737s();
            this.f15515a.setShader(this.f15513a);
            invalidateSelf();
            return;
        }
        mo19731m(0.0f);
    }

    /* renamed from: m */
    public void mo19731m(float f) {
        BitmapShader bitmapShader;
        Paint paint;
        if (this.f15510a != f) {
            this.f15520b = false;
            if (m20868j(f)) {
                paint = this.f15515a;
                bitmapShader = this.f15513a;
            } else {
                paint = this.f15515a;
                bitmapShader = null;
            }
            paint.setShader(bitmapShader);
            this.f15510a = f;
            invalidateSelf();
        }
    }

    /* renamed from: n */
    public void mo19732n(int i) {
        if (this.f15519b != i) {
            this.f15519b = i;
            this.f15518a = true;
            invalidateSelf();
        }
    }

    /* renamed from: o */
    public void mo19172o(boolean z) {
        throw new UnsupportedOperationException();
    }

    public void onBoundsChange(@mr2 Rect rect) {
        super.onBoundsChange(rect);
        if (this.f15520b) {
            mo19737s();
        }
        this.f15518a = true;
    }

    /* renamed from: p */
    public void mo19734p(int i) {
        if (this.f15511a != i) {
            if (i == 0) {
                i = 160;
            }
            this.f15511a = i;
            if (this.f15512a != null) {
                mo19716a();
            }
            invalidateSelf();
        }
    }

    /* renamed from: q */
    public void mo19735q(@mr2 Canvas canvas) {
        mo19734p(canvas.getDensity());
    }

    /* renamed from: r */
    public void mo19736r(@mr2 DisplayMetrics displayMetrics) {
        mo19734p(displayMetrics.densityDpi);
    }

    /* renamed from: s */
    public final void mo19737s() {
        this.f15510a = (float) (Math.min(this.f15522d, this.f15521c) / 2);
    }

    public void setAlpha(int i) {
        if (i != this.f15515a.getAlpha()) {
            this.f15515a.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f15515a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDither(boolean z) {
        this.f15515a.setDither(z);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z) {
        this.f15515a.setFilterBitmap(z);
        invalidateSelf();
    }

    /* renamed from: t */
    public void mo19742t() {
        if (this.f15518a) {
            if (this.f15520b) {
                int min = Math.min(this.f15521c, this.f15522d);
                mo19169f(this.f15519b, min, min, getBounds(), this.f15516a);
                int min2 = Math.min(this.f15516a.width(), this.f15516a.height());
                this.f15516a.inset(Math.max(0, (this.f15516a.width() - min2) / 2), Math.max(0, (this.f15516a.height() - min2) / 2));
                this.f15510a = ((float) min2) * 0.5f;
            } else {
                mo19169f(this.f15519b, this.f15521c, this.f15522d, getBounds(), this.f15516a);
            }
            this.f15517a.set(this.f15516a);
            if (this.f15513a != null) {
                Matrix matrix = this.f15514a;
                RectF rectF = this.f15517a;
                matrix.setTranslate(rectF.left, rectF.top);
                this.f15514a.preScale(this.f15517a.width() / ((float) this.f15512a.getWidth()), this.f15517a.height() / ((float) this.f15512a.getHeight()));
                this.f15513a.setLocalMatrix(this.f15514a);
                this.f15515a.setShader(this.f15513a);
            }
            this.f15518a = false;
        }
    }
}
