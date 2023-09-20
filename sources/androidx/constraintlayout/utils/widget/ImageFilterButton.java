package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
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
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.C0435e;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.sj3;

public class ImageFilterButton extends AppCompatImageButton {

    /* renamed from: a */
    public float f2327a = 0.0f;

    /* renamed from: a */
    public Path f2328a;

    /* renamed from: a */
    public RectF f2329a;

    /* renamed from: a */
    public Drawable f2330a = null;

    /* renamed from: a */
    public LayerDrawable f2331a;

    /* renamed from: a */
    public ViewOutlineProvider f2332a;

    /* renamed from: a */
    public ImageFilterView.C0411c f2333a = new ImageFilterView.C0411c();

    /* renamed from: a */
    public Drawable[] f2334a = new Drawable[2];

    /* renamed from: b */
    public float f2335b = 0.0f;

    /* renamed from: b */
    public Drawable f2336b = null;

    /* renamed from: c */
    public float f2337c = Float.NaN;

    /* renamed from: c */
    public boolean f2338c = true;

    /* renamed from: d */
    public float f2339d = Float.NaN;

    /* renamed from: e */
    public float f2340e = Float.NaN;

    /* renamed from: f */
    public float f2341f = Float.NaN;

    /* renamed from: g */
    public float f2342g = Float.NaN;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$a */
    public class C0407a extends ViewOutlineProvider {
        public C0407a() {
        }

        public void getOutline(View view, Outline outline) {
            int width = ImageFilterButton.this.getWidth();
            int height = ImageFilterButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterButton.this.f2335b) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$b */
    public class C0408b extends ViewOutlineProvider {
        public C0408b() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f2337c);
        }
    }

    public ImageFilterButton(Context context) {
        super(context);
        mo3062c(context, (AttributeSet) null);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo3062c(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo3062c(context, attributeSet);
    }

    private void setOverlay(boolean z) {
        this.f2338c = z;
    }

    /* renamed from: c */
    public final void mo3062c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0435e.C0448m.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f2330a = obtainStyledAttributes.getDrawable(C0435e.C0448m.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0435e.C0448m.ImageFilterView_crossfade) {
                    this.f2327a = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == C0435e.C0448m.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0435e.C0448m.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0435e.C0448m.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0435e.C0448m.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C0435e.C0448m.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0435e.C0448m.ImageFilterView_overlay) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f2338c));
                } else if (index == C0435e.C0448m.ImageFilterView_imagePanX) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f2339d));
                } else if (index == C0435e.C0448m.ImageFilterView_imagePanY) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f2340e));
                } else if (index == C0435e.C0448m.ImageFilterView_imageRotate) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f2342g));
                } else if (index == C0435e.C0448m.ImageFilterView_imageZoom) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f2341f));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f2336b = drawable;
            if (this.f2330a == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f2336b = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f2334a;
                    Drawable mutate = drawable2.mutate();
                    this.f2336b = mutate;
                    drawableArr[0] = mutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f2334a;
            Drawable mutate2 = getDrawable().mutate();
            this.f2336b = mutate2;
            drawableArr2[0] = mutate2;
            this.f2334a[1] = this.f2330a.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f2334a);
            this.f2331a = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f2327a * 255.0f));
            if (!this.f2338c) {
                this.f2331a.getDrawable(0).setAlpha((int) ((1.0f - this.f2327a) * 255.0f));
            }
            super.setImageDrawable(this.f2331a);
        }
    }

    /* renamed from: d */
    public final void mo3063d() {
        if (!Float.isNaN(this.f2339d) || !Float.isNaN(this.f2340e) || !Float.isNaN(this.f2341f) || !Float.isNaN(this.f2342g)) {
            float f = 0.0f;
            float f2 = Float.isNaN(this.f2339d) ? 0.0f : this.f2339d;
            float f3 = Float.isNaN(this.f2340e) ? 0.0f : this.f2340e;
            float f4 = Float.isNaN(this.f2341f) ? 1.0f : this.f2341f;
            if (!Float.isNaN(this.f2342g)) {
                f = this.f2342g;
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

    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: e */
    public final void mo3065e() {
        if (!Float.isNaN(this.f2339d) || !Float.isNaN(this.f2340e) || !Float.isNaN(this.f2341f) || !Float.isNaN(this.f2342g)) {
            mo3063d();
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    public float getContrast() {
        return this.f2333a.f2368c;
    }

    public float getCrossfade() {
        return this.f2327a;
    }

    public float getImagePanX() {
        return this.f2339d;
    }

    public float getImagePanY() {
        return this.f2340e;
    }

    public float getImageRotate() {
        return this.f2342g;
    }

    public float getImageZoom() {
        return this.f2341f;
    }

    public float getRound() {
        return this.f2337c;
    }

    public float getRoundPercent() {
        return this.f2335b;
    }

    public float getSaturation() {
        return this.f2333a.f2366b;
    }

    public float getWarmth() {
        return this.f2333a.f2369d;
    }

    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        mo3063d();
    }

    public void setAltImageResource(int i) {
        Drawable mutate = C3129p8.m24529b(getContext(), i).mutate();
        this.f2330a = mutate;
        Drawable[] drawableArr = this.f2334a;
        drawableArr[0] = this.f2336b;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2334a);
        this.f2331a = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2327a);
    }

    public void setBrightness(float f) {
        ImageFilterView.C0411c cVar = this.f2333a;
        cVar.f2363a = f;
        cVar.mo3123c(this);
    }

    public void setContrast(float f) {
        ImageFilterView.C0411c cVar = this.f2333a;
        cVar.f2368c = f;
        cVar.mo3123c(this);
    }

    public void setCrossfade(float f) {
        this.f2327a = f;
        if (this.f2334a != null) {
            if (!this.f2338c) {
                this.f2331a.getDrawable(0).setAlpha((int) ((1.0f - this.f2327a) * 255.0f));
            }
            this.f2331a.getDrawable(1).setAlpha((int) (this.f2327a * 255.0f));
            super.setImageDrawable(this.f2331a);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        if (this.f2330a == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable mutate = drawable.mutate();
        this.f2336b = mutate;
        Drawable[] drawableArr = this.f2334a;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f2330a;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2334a);
        this.f2331a = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2327a);
    }

    public void setImagePanX(float f) {
        this.f2339d = f;
        mo3065e();
    }

    public void setImagePanY(float f) {
        this.f2340e = f;
        mo3065e();
    }

    public void setImageResource(int i) {
        if (this.f2330a != null) {
            Drawable mutate = C3129p8.m24529b(getContext(), i).mutate();
            this.f2336b = mutate;
            Drawable[] drawableArr = this.f2334a;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f2330a;
            LayerDrawable layerDrawable = new LayerDrawable(this.f2334a);
            this.f2331a = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f2327a);
            return;
        }
        super.setImageResource(i);
    }

    public void setImageRotate(float f) {
        this.f2342g = f;
        mo3065e();
    }

    public void setImageZoom(float f) {
        this.f2341f = f;
        mo3065e();
    }

    @sj3(21)
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f2337c = f;
            float f2 = this.f2335b;
            this.f2335b = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f2337c != f;
        this.f2337c = f;
        if (f != 0.0f) {
            if (this.f2328a == null) {
                this.f2328a = new Path();
            }
            if (this.f2329a == null) {
                this.f2329a = new RectF();
            }
            if (this.f2332a == null) {
                C0408b bVar = new C0408b();
                this.f2332a = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f2329a.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f2328a.reset();
            Path path = this.f2328a;
            RectF rectF = this.f2329a;
            float f3 = this.f2337c;
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
        boolean z = this.f2335b != f;
        this.f2335b = f;
        if (f != 0.0f) {
            if (this.f2328a == null) {
                this.f2328a = new Path();
            }
            if (this.f2329a == null) {
                this.f2329a = new RectF();
            }
            if (this.f2332a == null) {
                C0407a aVar = new C0407a();
                this.f2332a = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f2335b) / 2.0f;
            this.f2329a.set(0.0f, 0.0f, (float) width, (float) height);
            this.f2328a.reset();
            this.f2328a.addRoundRect(this.f2329a, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        ImageFilterView.C0411c cVar = this.f2333a;
        cVar.f2366b = f;
        cVar.mo3123c(this);
    }

    public void setWarmth(float f) {
        ImageFilterView.C0411c cVar = this.f2333a;
        cVar.f2369d = f;
        cVar.mo3123c(this);
    }
}
