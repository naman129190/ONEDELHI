package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.C0435e;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.sj3;

public class ImageFilterView extends AppCompatImageView {

    /* renamed from: a */
    public float f2345a = 0.0f;

    /* renamed from: a */
    public Path f2346a;

    /* renamed from: a */
    public RectF f2347a;

    /* renamed from: a */
    public Drawable f2348a = null;

    /* renamed from: a */
    public LayerDrawable f2349a;

    /* renamed from: a */
    public ViewOutlineProvider f2350a;

    /* renamed from: a */
    public C0411c f2351a = new C0411c();

    /* renamed from: a */
    public Drawable[] f2352a = new Drawable[2];

    /* renamed from: b */
    public float f2353b = 0.0f;

    /* renamed from: b */
    public Drawable f2354b = null;

    /* renamed from: c */
    public float f2355c = Float.NaN;

    /* renamed from: c */
    public boolean f2356c = true;

    /* renamed from: d */
    public float f2357d = Float.NaN;

    /* renamed from: e */
    public float f2358e = Float.NaN;

    /* renamed from: f */
    public float f2359f = Float.NaN;

    /* renamed from: g */
    public float f2360g = Float.NaN;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$a */
    public class C0409a extends ViewOutlineProvider {
        public C0409a() {
        }

        public void getOutline(View view, Outline outline) {
            int width = ImageFilterView.this.getWidth();
            int height = ImageFilterView.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterView.this.f2353b) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$b */
    public class C0410b extends ViewOutlineProvider {
        public C0410b() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f2355c);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$c */
    public static class C0411c {

        /* renamed from: a */
        public float f2363a = 1.0f;

        /* renamed from: a */
        public ColorMatrix f2364a = new ColorMatrix();

        /* renamed from: a */
        public float[] f2365a = new float[20];

        /* renamed from: b */
        public float f2366b = 1.0f;

        /* renamed from: b */
        public ColorMatrix f2367b = new ColorMatrix();

        /* renamed from: c */
        public float f2368c = 1.0f;

        /* renamed from: d */
        public float f2369d = 1.0f;

        /* renamed from: a */
        public final void mo3121a(float f) {
            float[] fArr = this.f2365a;
            fArr[0] = f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* renamed from: b */
        public final void mo3122b(float f) {
            float f2 = 1.0f - f;
            float f3 = 0.2999f * f2;
            float f4 = 0.587f * f2;
            float f5 = f2 * 0.114f;
            float[] fArr = this.f2365a;
            fArr[0] = f3 + f;
            fArr[1] = f4;
            fArr[2] = f5;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f3;
            fArr[6] = f4 + f;
            fArr[7] = f5;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f3;
            fArr[11] = f4;
            fArr[12] = f5 + f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* renamed from: c */
        public void mo3123c(ImageView imageView) {
            boolean z;
            this.f2364a.reset();
            float f = this.f2366b;
            boolean z2 = true;
            if (f != 1.0f) {
                mo3122b(f);
                this.f2364a.set(this.f2365a);
                z = true;
            } else {
                z = false;
            }
            float f2 = this.f2368c;
            if (f2 != 1.0f) {
                this.f2367b.setScale(f2, f2, f2, 1.0f);
                this.f2364a.postConcat(this.f2367b);
                z = true;
            }
            float f3 = this.f2369d;
            if (f3 != 1.0f) {
                mo3124d(f3);
                this.f2367b.set(this.f2365a);
                this.f2364a.postConcat(this.f2367b);
                z = true;
            }
            float f4 = this.f2363a;
            if (f4 != 1.0f) {
                mo3121a(f4);
                this.f2367b.set(this.f2365a);
                this.f2364a.postConcat(this.f2367b);
            } else {
                z2 = z;
            }
            if (z2) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f2364a));
            } else {
                imageView.clearColorFilter();
            }
        }

        /* renamed from: d */
        public final void mo3124d(float f) {
            float f2;
            float f3;
            if (f <= 0.0f) {
                f = 0.01f;
            }
            float f4 = (5000.0f / f) / 100.0f;
            if (f4 > 66.0f) {
                double d = (double) (f4 - 60.0f);
                f3 = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                f2 = ((float) Math.pow(d, 0.07551484555006027d)) * 288.12216f;
            } else {
                f2 = (((float) Math.log((double) f4)) * 99.4708f) - 161.11957f;
                f3 = 255.0f;
            }
            float log = f4 < 66.0f ? f4 > 19.0f ? (((float) Math.log((double) (f4 - 10.0f))) * 138.51773f) - 305.0448f : 0.0f : 255.0f;
            float min = Math.min(255.0f, Math.max(f3, 0.0f));
            float min2 = Math.min(255.0f, Math.max(f2, 0.0f));
            float min3 = Math.min(255.0f, Math.max(log, 0.0f));
            float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float min5 = Math.min(255.0f, Math.max((((float) Math.log((double) 50.0f)) * 99.4708f) - 161.11957f, 0.0f));
            float min6 = min3 / Math.min(255.0f, Math.max((((float) Math.log((double) 40.0f)) * 138.51773f) - 305.0448f, 0.0f));
            float[] fArr = this.f2365a;
            fArr[0] = min / min4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = min2 / min5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = min6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }
    }

    public ImageFilterView(Context context) {
        super(context);
        mo3091d(context, (AttributeSet) null);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo3091d(context, attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo3091d(context, attributeSet);
    }

    private void setOverlay(boolean z) {
        this.f2356c = z;
    }

    /* renamed from: d */
    public final void mo3091d(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0435e.C0448m.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f2348a = obtainStyledAttributes.getDrawable(C0435e.C0448m.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0435e.C0448m.ImageFilterView_crossfade) {
                    this.f2345a = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == C0435e.C0448m.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0435e.C0448m.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0435e.C0448m.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0435e.C0448m.ImageFilterView_brightness) {
                    setBrightness(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0435e.C0448m.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C0435e.C0448m.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0435e.C0448m.ImageFilterView_overlay) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f2356c));
                } else if (index == C0435e.C0448m.ImageFilterView_imagePanX) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f2357d));
                } else if (index == C0435e.C0448m.ImageFilterView_imagePanY) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f2358e));
                } else if (index == C0435e.C0448m.ImageFilterView_imageRotate) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f2360g));
                } else if (index == C0435e.C0448m.ImageFilterView_imageZoom) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f2359f));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f2354b = drawable;
            if (this.f2348a == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f2354b = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f2352a;
                    Drawable mutate = drawable2.mutate();
                    this.f2354b = mutate;
                    drawableArr[0] = mutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f2352a;
            Drawable mutate2 = getDrawable().mutate();
            this.f2354b = mutate2;
            drawableArr2[0] = mutate2;
            this.f2352a[1] = this.f2348a.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f2352a);
            this.f2349a = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f2345a * 255.0f));
            if (!this.f2356c) {
                this.f2349a.getDrawable(0).setAlpha((int) ((1.0f - this.f2345a) * 255.0f));
            }
            super.setImageDrawable(this.f2349a);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: f */
    public final void mo3093f() {
        if (!Float.isNaN(this.f2357d) || !Float.isNaN(this.f2358e) || !Float.isNaN(this.f2359f) || !Float.isNaN(this.f2360g)) {
            float f = 0.0f;
            float f2 = Float.isNaN(this.f2357d) ? 0.0f : this.f2357d;
            float f3 = Float.isNaN(this.f2358e) ? 0.0f : this.f2358e;
            float f4 = Float.isNaN(this.f2359f) ? 1.0f : this.f2359f;
            if (!Float.isNaN(this.f2360g)) {
                f = this.f2360g;
            }
            Matrix matrix = new Matrix();
            matrix.reset();
            float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
            float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
            float width = (float) getWidth();
            float height = (float) getHeight();
            float f5 = f4 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
            matrix.postScale(f5, f5);
            float f6 = intrinsicWidth * f5;
            float f7 = f5 * intrinsicHeight;
            matrix.postTranslate((((f2 * (width - f6)) + width) - f6) * 0.5f, (((f3 * (height - f7)) + height) - f7) * 0.5f);
            matrix.postRotate(f, width / 2.0f, height / 2.0f);
            setImageMatrix(matrix);
            setScaleType(ImageView.ScaleType.MATRIX);
        }
    }

    /* renamed from: g */
    public final void mo3094g() {
        if (!Float.isNaN(this.f2357d) || !Float.isNaN(this.f2358e) || !Float.isNaN(this.f2359f) || !Float.isNaN(this.f2360g)) {
            mo3093f();
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    public float getBrightness() {
        return this.f2351a.f2363a;
    }

    public float getContrast() {
        return this.f2351a.f2368c;
    }

    public float getCrossfade() {
        return this.f2345a;
    }

    public float getImagePanX() {
        return this.f2357d;
    }

    public float getImagePanY() {
        return this.f2358e;
    }

    public float getImageRotate() {
        return this.f2360g;
    }

    public float getImageZoom() {
        return this.f2359f;
    }

    public float getRound() {
        return this.f2355c;
    }

    public float getRoundPercent() {
        return this.f2353b;
    }

    public float getSaturation() {
        return this.f2351a.f2366b;
    }

    public float getWarmth() {
        return this.f2351a.f2369d;
    }

    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        mo3093f();
    }

    public void setAltImageResource(int i) {
        Drawable mutate = C3129p8.m24529b(getContext(), i).mutate();
        this.f2348a = mutate;
        Drawable[] drawableArr = this.f2352a;
        drawableArr[0] = this.f2354b;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2352a);
        this.f2349a = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2345a);
    }

    public void setBrightness(float f) {
        C0411c cVar = this.f2351a;
        cVar.f2363a = f;
        cVar.mo3123c(this);
    }

    public void setContrast(float f) {
        C0411c cVar = this.f2351a;
        cVar.f2368c = f;
        cVar.mo3123c(this);
    }

    public void setCrossfade(float f) {
        this.f2345a = f;
        if (this.f2352a != null) {
            if (!this.f2356c) {
                this.f2349a.getDrawable(0).setAlpha((int) ((1.0f - this.f2345a) * 255.0f));
            }
            this.f2349a.getDrawable(1).setAlpha((int) (this.f2345a * 255.0f));
            super.setImageDrawable(this.f2349a);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        if (this.f2348a == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable mutate = drawable.mutate();
        this.f2354b = mutate;
        Drawable[] drawableArr = this.f2352a;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f2348a;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2352a);
        this.f2349a = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2345a);
    }

    public void setImagePanX(float f) {
        this.f2357d = f;
        mo3094g();
    }

    public void setImagePanY(float f) {
        this.f2358e = f;
        mo3094g();
    }

    public void setImageResource(int i) {
        if (this.f2348a != null) {
            Drawable mutate = C3129p8.m24529b(getContext(), i).mutate();
            this.f2354b = mutate;
            Drawable[] drawableArr = this.f2352a;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f2348a;
            LayerDrawable layerDrawable = new LayerDrawable(this.f2352a);
            this.f2349a = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f2345a);
            return;
        }
        super.setImageResource(i);
    }

    public void setImageRotate(float f) {
        this.f2360g = f;
        mo3094g();
    }

    public void setImageZoom(float f) {
        this.f2359f = f;
        mo3094g();
    }

    @sj3(21)
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f2355c = f;
            float f2 = this.f2353b;
            this.f2353b = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f2355c != f;
        this.f2355c = f;
        if (f != 0.0f) {
            if (this.f2346a == null) {
                this.f2346a = new Path();
            }
            if (this.f2347a == null) {
                this.f2347a = new RectF();
            }
            if (this.f2350a == null) {
                C0410b bVar = new C0410b();
                this.f2350a = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f2347a.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f2346a.reset();
            Path path = this.f2346a;
            RectF rectF = this.f2347a;
            float f3 = this.f2355c;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    @sj3(21)
    public void setRoundPercent(float f) {
        boolean z = this.f2353b != f;
        this.f2353b = f;
        if (f != 0.0f) {
            if (this.f2346a == null) {
                this.f2346a = new Path();
            }
            if (this.f2347a == null) {
                this.f2347a = new RectF();
            }
            if (this.f2350a == null) {
                C0409a aVar = new C0409a();
                this.f2350a = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f2353b) / 2.0f;
            this.f2347a.set(0.0f, 0.0f, (float) width, (float) height);
            this.f2346a.reset();
            this.f2346a.addRoundRect(this.f2347a, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        C0411c cVar = this.f2351a;
        cVar.f2366b = f;
        cVar.mo3123c(this);
    }

    public void setWarmth(float f) {
        C0411c cVar = this.f2351a;
        cVar.f2369d = f;
        cVar.mo3123c(this);
    }
}
