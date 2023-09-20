package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.C0435e;
import com.onedelhi.secure.a81;
import com.onedelhi.secure.ri1;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.ve0;
import com.onedelhi.secure.yg1;
import com.onedelhi.secure.za3;

public class MotionLabel extends View implements a81 {

    /* renamed from: A */
    public static final int f2388A = 3;

    /* renamed from: d */
    public static String f2389d = "MotionLabel";

    /* renamed from: y */
    public static final int f2390y = 1;

    /* renamed from: z */
    public static final int f2391z = 2;

    /* renamed from: a */
    public float f2392a = 0.0f;

    /* renamed from: a */
    public Bitmap f2393a;

    /* renamed from: a */
    public BitmapShader f2394a;

    /* renamed from: a */
    public Matrix f2395a;

    /* renamed from: a */
    public Paint f2396a = new Paint();

    /* renamed from: a */
    public Path f2397a = new Path();

    /* renamed from: a */
    public Rect f2398a = new Rect();

    /* renamed from: a */
    public RectF f2399a;

    /* renamed from: a */
    public Drawable f2400a;

    /* renamed from: a */
    public Layout f2401a;

    /* renamed from: a */
    public TextPaint f2402a = new TextPaint();

    /* renamed from: a */
    public ViewOutlineProvider f2403a;

    /* renamed from: a */
    public CharSequence f2404a;

    /* renamed from: b */
    public float f2405b = Float.NaN;

    /* renamed from: b */
    public Matrix f2406b;

    /* renamed from: b */
    public Paint f2407b;

    /* renamed from: b */
    public Rect f2408b;

    /* renamed from: b */
    public String f2409b = "Hello World";

    /* renamed from: b */
    public boolean f2410b = false;

    /* renamed from: c */
    public float f2411c = 48.0f;

    /* renamed from: c */
    public String f2412c;

    /* renamed from: c */
    public boolean f2413c = true;

    /* renamed from: d */
    public float f2414d = Float.NaN;

    /* renamed from: d */
    public boolean f2415d = false;

    /* renamed from: e */
    public float f2416e = 0.0f;

    /* renamed from: f */
    public float f2417f;

    /* renamed from: g */
    public float f2418g;

    /* renamed from: h */
    public float f2419h;

    /* renamed from: i */
    public float f2420i = Float.NaN;

    /* renamed from: j */
    public float f2421j = Float.NaN;

    /* renamed from: k */
    public float f2422k = 0.0f;

    /* renamed from: l */
    public float f2423l = 0.0f;

    /* renamed from: m */
    public float f2424m;

    /* renamed from: n */
    public float f2425n = Float.NaN;

    /* renamed from: n */
    public int f2426n = 65535;

    /* renamed from: o */
    public float f2427o = Float.NaN;

    /* renamed from: o */
    public int f2428o = 65535;

    /* renamed from: p */
    public float f2429p = Float.NaN;

    /* renamed from: p */
    public int f2430p;

    /* renamed from: q */
    public float f2431q = Float.NaN;

    /* renamed from: q */
    public int f2432q;

    /* renamed from: r */
    public int f2433r = 1;

    /* renamed from: s */
    public int f2434s = 1;

    /* renamed from: t */
    public int f2435t = 1;

    /* renamed from: u */
    public int f2436u = 1;

    /* renamed from: v */
    public int f2437v = 8388659;

    /* renamed from: w */
    public int f2438w = 0;

    /* renamed from: x */
    public int f2439x = 0;

    /* renamed from: androidx.constraintlayout.utils.widget.MotionLabel$a */
    public class C0414a extends ViewOutlineProvider {
        public C0414a() {
        }

        public void getOutline(View view, Outline outline) {
            int width = MotionLabel.this.getWidth();
            int height = MotionLabel.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * MotionLabel.this.f2392a) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.MotionLabel$b */
    public class C0415b extends ViewOutlineProvider {
        public C0415b() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.f2405b);
        }
    }

    public MotionLabel(Context context) {
        super(context);
        mo3139g(context, (AttributeSet) null);
    }

    public MotionLabel(Context context, @ts2 AttributeSet attributeSet) {
        super(context, attributeSet);
        mo3139g(context, attributeSet);
    }

    public MotionLabel(Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo3139g(context, attributeSet);
    }

    private float getHorizontalOffset() {
        float f = Float.isNaN(this.f2414d) ? 1.0f : this.f2411c / this.f2414d;
        TextPaint textPaint = this.f2402a;
        String str = this.f2409b;
        return (((((Float.isNaN(this.f2418g) ? (float) getMeasuredWidth() : this.f2418g) - ((float) getPaddingLeft())) - ((float) getPaddingRight())) - (f * textPaint.measureText(str, 0, str.length()))) * (this.f2422k + 1.0f)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f = Float.isNaN(this.f2414d) ? 1.0f : this.f2411c / this.f2414d;
        Paint.FontMetrics fontMetrics = this.f2402a.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.f2419h) ? (float) getMeasuredHeight() : this.f2419h) - ((float) getPaddingTop())) - ((float) getPaddingBottom());
        float f2 = fontMetrics.descent;
        float f3 = fontMetrics.ascent;
        return (((measuredHeight - ((f2 - f3) * f)) * (1.0f - this.f2423l)) / 2.0f) - (f * f3);
    }

    /* renamed from: a */
    public void mo3135a(float f, float f2, float f3, float f4) {
        int i = (int) (f + 0.5f);
        this.f2417f = f - ((float) i);
        int i2 = (int) (f3 + 0.5f);
        int i3 = i2 - i;
        int i4 = (int) (f4 + 0.5f);
        int i5 = (int) (0.5f + f2);
        int i6 = i4 - i5;
        float f5 = f3 - f;
        this.f2418g = f5;
        float f6 = f4 - f2;
        this.f2419h = f6;
        mo3136d(f, f2, f3, f4);
        if (!(getMeasuredHeight() == i6 && getMeasuredWidth() == i3)) {
            measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
        }
        super.layout(i, i5, i2, i4);
        if (this.f2415d) {
            if (this.f2408b == null) {
                this.f2407b = new Paint();
                this.f2408b = new Rect();
                this.f2407b.set(this.f2402a);
                this.f2424m = this.f2407b.getTextSize();
            }
            this.f2418g = f5;
            this.f2419h = f6;
            Paint paint = this.f2407b;
            String str = this.f2409b;
            paint.getTextBounds(str, 0, str.length(), this.f2408b);
            int width = this.f2408b.width();
            float height = ((float) this.f2408b.height()) * 1.3f;
            float f7 = (f5 - ((float) this.f2434s)) - ((float) this.f2433r);
            float f8 = (f6 - ((float) this.f2436u)) - ((float) this.f2435t);
            float f9 = (float) width;
            if (f9 * f8 > height * f7) {
                this.f2402a.setTextSize((this.f2424m * f7) / f9);
            } else {
                this.f2402a.setTextSize((this.f2424m * f8) / height);
            }
            if (this.f2410b || !Float.isNaN(this.f2414d)) {
                mo3138f(Float.isNaN(this.f2414d) ? 1.0f : this.f2411c / this.f2414d);
            }
        }
    }

    /* renamed from: d */
    public final void mo3136d(float f, float f2, float f3, float f4) {
        if (this.f2406b != null) {
            this.f2418g = f3 - f;
            this.f2419h = f4 - f2;
            mo3157l();
        }
    }

    /* renamed from: e */
    public Bitmap mo3137e(Bitmap bitmap, int i) {
        System.nanoTime();
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        for (int i2 = 0; i2 < i && width >= 32 && height >= 32; i2++) {
            width /= 2;
            height /= 2;
            createScaledBitmap = Bitmap.createScaledBitmap(createScaledBitmap, width, height, true);
        }
        return createScaledBitmap;
    }

    /* renamed from: f */
    public void mo3138f(float f) {
        if (this.f2410b || f != 1.0f) {
            this.f2397a.reset();
            String str = this.f2409b;
            int length = str.length();
            this.f2402a.getTextBounds(str, 0, length, this.f2398a);
            this.f2402a.getTextPath(str, 0, length, 0.0f, 0.0f, this.f2397a);
            if (f != 1.0f) {
                Log.v(f2389d, ve0.m30007f() + " scale " + f);
                Matrix matrix = new Matrix();
                matrix.postScale(f, f);
                this.f2397a.transform(matrix);
            }
            Rect rect = this.f2398a;
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = (float) getHeight();
            rectF.right = (float) getWidth();
            this.f2413c = false;
        }
    }

    /* renamed from: g */
    public final void mo3139g(Context context, AttributeSet attributeSet) {
        mo3154i(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0435e.C0448m.MotionLabel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0435e.C0448m.MotionLabel_android_text) {
                    setText(obtainStyledAttributes.getText(index));
                } else if (index == C0435e.C0448m.MotionLabel_android_fontFamily) {
                    this.f2412c = obtainStyledAttributes.getString(index);
                } else if (index == C0435e.C0448m.MotionLabel_scaleFromTextSize) {
                    this.f2414d = (float) obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f2414d);
                } else if (index == C0435e.C0448m.MotionLabel_android_textSize) {
                    this.f2411c = (float) obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f2411c);
                } else if (index == C0435e.C0448m.MotionLabel_android_textStyle) {
                    this.f2430p = obtainStyledAttributes.getInt(index, this.f2430p);
                } else if (index == C0435e.C0448m.MotionLabel_android_typeface) {
                    this.f2432q = obtainStyledAttributes.getInt(index, this.f2432q);
                } else if (index == C0435e.C0448m.MotionLabel_android_textColor) {
                    this.f2426n = obtainStyledAttributes.getColor(index, this.f2426n);
                } else if (index == C0435e.C0448m.MotionLabel_borderRound) {
                    float dimension = obtainStyledAttributes.getDimension(index, this.f2405b);
                    this.f2405b = dimension;
                    setRound(dimension);
                } else if (index == C0435e.C0448m.MotionLabel_borderRoundPercent) {
                    float f = obtainStyledAttributes.getFloat(index, this.f2392a);
                    this.f2392a = f;
                    setRoundPercent(f);
                } else if (index == C0435e.C0448m.MotionLabel_android_gravity) {
                    setGravity(obtainStyledAttributes.getInt(index, -1));
                } else if (index == C0435e.C0448m.MotionLabel_android_autoSizeTextType) {
                    this.f2438w = obtainStyledAttributes.getInt(index, 0);
                } else {
                    if (index == C0435e.C0448m.MotionLabel_textOutlineColor) {
                        this.f2428o = obtainStyledAttributes.getInt(index, this.f2428o);
                    } else if (index == C0435e.C0448m.MotionLabel_textOutlineThickness) {
                        this.f2416e = obtainStyledAttributes.getDimension(index, this.f2416e);
                    } else if (index == C0435e.C0448m.MotionLabel_textBackground) {
                        this.f2400a = obtainStyledAttributes.getDrawable(index);
                    } else if (index == C0435e.C0448m.MotionLabel_textBackgroundPanX) {
                        this.f2425n = obtainStyledAttributes.getFloat(index, this.f2425n);
                    } else if (index == C0435e.C0448m.MotionLabel_textBackgroundPanY) {
                        this.f2427o = obtainStyledAttributes.getFloat(index, this.f2427o);
                    } else if (index == C0435e.C0448m.MotionLabel_textPanX) {
                        this.f2422k = obtainStyledAttributes.getFloat(index, this.f2422k);
                    } else if (index == C0435e.C0448m.MotionLabel_textPanY) {
                        this.f2423l = obtainStyledAttributes.getFloat(index, this.f2423l);
                    } else if (index == C0435e.C0448m.MotionLabel_textBackgroundRotate) {
                        this.f2431q = obtainStyledAttributes.getFloat(index, this.f2431q);
                    } else if (index == C0435e.C0448m.MotionLabel_textBackgroundZoom) {
                        this.f2429p = obtainStyledAttributes.getFloat(index, this.f2429p);
                    } else if (index == C0435e.C0448m.MotionLabel_textureHeight) {
                        this.f2420i = obtainStyledAttributes.getDimension(index, this.f2420i);
                    } else if (index == C0435e.C0448m.MotionLabel_textureWidth) {
                        this.f2421j = obtainStyledAttributes.getDimension(index, this.f2421j);
                    } else if (index == C0435e.C0448m.MotionLabel_textureEffect) {
                        this.f2439x = obtainStyledAttributes.getInt(index, this.f2439x);
                    }
                    this.f2410b = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
        mo3156k();
        mo3155j();
    }

    public float getRound() {
        return this.f2405b;
    }

    public float getRoundPercent() {
        return this.f2392a;
    }

    public float getScaleFromTextSize() {
        return this.f2414d;
    }

    public float getTextBackgroundPanX() {
        return this.f2425n;
    }

    public float getTextBackgroundPanY() {
        return this.f2427o;
    }

    public float getTextBackgroundRotate() {
        return this.f2431q;
    }

    public float getTextBackgroundZoom() {
        return this.f2429p;
    }

    public int getTextOutlineColor() {
        return this.f2428o;
    }

    public float getTextPanX() {
        return this.f2422k;
    }

    public float getTextPanY() {
        return this.f2423l;
    }

    public float getTextureHeight() {
        return this.f2420i;
    }

    public float getTextureWidth() {
        return this.f2421j;
    }

    public Typeface getTypeface() {
        return this.f2402a.getTypeface();
    }

    /* renamed from: h */
    public final void mo3153h(String str, int i, int i2) {
        Typeface typeface;
        if (str != null) {
            typeface = Typeface.create(str, i2);
            if (typeface != null) {
                setTypeface(typeface);
                return;
            }
        } else {
            typeface = null;
        }
        boolean z = true;
        if (i == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i == 2) {
            typeface = Typeface.SERIF;
        } else if (i == 3) {
            typeface = Typeface.MONOSPACE;
        }
        float f = 0.0f;
        if (i2 > 0) {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typeface, i2);
            setTypeface(defaultFromStyle);
            int i3 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i2;
            TextPaint textPaint = this.f2402a;
            if ((i3 & 1) == 0) {
                z = false;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f2402a;
            if ((i3 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f2402a.setFakeBoldText(false);
        this.f2402a.setTextSkewX(0.0f);
        setTypeface(typeface);
    }

    /* renamed from: i */
    public final void mo3154i(Context context, @ts2 AttributeSet attributeSet) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(za3.C4057b.colorPrimary, typedValue, true);
        TextPaint textPaint = this.f2402a;
        int i = typedValue.data;
        this.f2426n = i;
        textPaint.setColor(i);
    }

    /* renamed from: j */
    public void mo3155j() {
        this.f2433r = getPaddingLeft();
        this.f2434s = getPaddingRight();
        this.f2435t = getPaddingTop();
        this.f2436u = getPaddingBottom();
        mo3153h(this.f2412c, this.f2432q, this.f2430p);
        this.f2402a.setColor(this.f2426n);
        this.f2402a.setStrokeWidth(this.f2416e);
        this.f2402a.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f2402a.setFlags(128);
        setTextSize(this.f2411c);
        this.f2402a.setAntiAlias(true);
    }

    /* renamed from: k */
    public final void mo3156k() {
        if (this.f2400a != null) {
            this.f2406b = new Matrix();
            int intrinsicWidth = this.f2400a.getIntrinsicWidth();
            int intrinsicHeight = this.f2400a.getIntrinsicHeight();
            int i = 128;
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.f2421j) ? 128 : (int) this.f2421j;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                if (!Float.isNaN(this.f2420i)) {
                    i = (int) this.f2420i;
                }
                intrinsicHeight = i;
            }
            if (this.f2439x != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.f2393a = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f2393a);
            this.f2400a.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.f2400a.setFilterBitmap(true);
            this.f2400a.draw(canvas);
            if (this.f2439x != 0) {
                this.f2393a = mo3137e(this.f2393a, 4);
            }
            Bitmap bitmap = this.f2393a;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f2394a = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    /* renamed from: l */
    public final void mo3157l() {
        float f = 0.0f;
        float f2 = Float.isNaN(this.f2425n) ? 0.0f : this.f2425n;
        float f3 = Float.isNaN(this.f2427o) ? 0.0f : this.f2427o;
        float f4 = Float.isNaN(this.f2429p) ? 1.0f : this.f2429p;
        if (!Float.isNaN(this.f2431q)) {
            f = this.f2431q;
        }
        this.f2406b.reset();
        float width = (float) this.f2393a.getWidth();
        float height = (float) this.f2393a.getHeight();
        float f5 = Float.isNaN(this.f2421j) ? this.f2418g : this.f2421j;
        float f6 = Float.isNaN(this.f2420i) ? this.f2419h : this.f2420i;
        float f7 = f4 * (width * f6 < height * f5 ? f5 / width : f6 / height);
        this.f2406b.postScale(f7, f7);
        float f8 = width * f7;
        float f9 = f5 - f8;
        float f10 = f7 * height;
        float f11 = f6 - f10;
        if (!Float.isNaN(this.f2420i)) {
            f11 = this.f2420i / 2.0f;
        }
        if (!Float.isNaN(this.f2421j)) {
            f9 = this.f2421j / 2.0f;
        }
        this.f2406b.postTranslate((((f2 * f9) + f5) - f8) * 0.5f, (((f3 * f11) + f6) - f10) * 0.5f);
        this.f2406b.postRotate(f, f5 / 2.0f, f6 / 2.0f);
        this.f2394a.setLocalMatrix(this.f2406b);
    }

    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        boolean isNaN = Float.isNaN(this.f2414d);
        float f = isNaN ? 1.0f : this.f2411c / this.f2414d;
        this.f2418g = (float) (i3 - i);
        this.f2419h = (float) (i4 - i2);
        if (this.f2415d) {
            if (this.f2408b == null) {
                this.f2407b = new Paint();
                this.f2408b = new Rect();
                this.f2407b.set(this.f2402a);
                this.f2424m = this.f2407b.getTextSize();
            }
            Paint paint = this.f2407b;
            String str = this.f2409b;
            paint.getTextBounds(str, 0, str.length(), this.f2408b);
            int width = this.f2408b.width();
            int height = (int) (((float) this.f2408b.height()) * 1.3f);
            float f2 = (this.f2418g - ((float) this.f2434s)) - ((float) this.f2433r);
            float f3 = (this.f2419h - ((float) this.f2436u)) - ((float) this.f2435t);
            if (isNaN) {
                float f4 = (float) width;
                float f5 = (float) height;
                if (f4 * f3 > f5 * f2) {
                    this.f2402a.setTextSize((this.f2424m * f2) / f4);
                } else {
                    this.f2402a.setTextSize((this.f2424m * f3) / f5);
                }
            } else {
                float f6 = (float) width;
                float f7 = (float) height;
                f = f6 * f3 > f7 * f2 ? f2 / f6 : f3 / f7;
            }
        }
        if (this.f2410b || !isNaN) {
            mo3136d((float) i, (float) i2, (float) i3, (float) i4);
            mo3138f(f);
        }
    }

    public void onDraw(Canvas canvas) {
        float f = Float.isNaN(this.f2414d) ? 1.0f : this.f2411c / this.f2414d;
        super.onDraw(canvas);
        if (this.f2410b || f != 1.0f) {
            if (this.f2413c) {
                mo3138f(f);
            }
            if (this.f2395a == null) {
                this.f2395a = new Matrix();
            }
            if (this.f2410b) {
                this.f2396a.set(this.f2402a);
                this.f2395a.reset();
                float horizontalOffset = ((float) this.f2433r) + getHorizontalOffset();
                float verticalOffset = ((float) this.f2435t) + getVerticalOffset();
                this.f2395a.postTranslate(horizontalOffset, verticalOffset);
                this.f2395a.preScale(f, f);
                this.f2397a.transform(this.f2395a);
                if (this.f2394a != null) {
                    this.f2402a.setFilterBitmap(true);
                    this.f2402a.setShader(this.f2394a);
                } else {
                    this.f2402a.setColor(this.f2426n);
                }
                this.f2402a.setStyle(Paint.Style.FILL);
                this.f2402a.setStrokeWidth(this.f2416e);
                canvas.drawPath(this.f2397a, this.f2402a);
                if (this.f2394a != null) {
                    this.f2402a.setShader((Shader) null);
                }
                this.f2402a.setColor(this.f2428o);
                this.f2402a.setStyle(Paint.Style.STROKE);
                this.f2402a.setStrokeWidth(this.f2416e);
                canvas.drawPath(this.f2397a, this.f2402a);
                this.f2395a.reset();
                this.f2395a.postTranslate(-horizontalOffset, -verticalOffset);
                this.f2397a.transform(this.f2395a);
                this.f2402a.set(this.f2396a);
                return;
            }
            float horizontalOffset2 = ((float) this.f2433r) + getHorizontalOffset();
            float verticalOffset2 = ((float) this.f2435t) + getVerticalOffset();
            this.f2395a.reset();
            this.f2395a.preTranslate(horizontalOffset2, verticalOffset2);
            this.f2397a.transform(this.f2395a);
            this.f2402a.setColor(this.f2426n);
            this.f2402a.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f2402a.setStrokeWidth(this.f2416e);
            canvas.drawPath(this.f2397a, this.f2402a);
            this.f2395a.reset();
            this.f2395a.preTranslate(-horizontalOffset2, -verticalOffset2);
            this.f2397a.transform(this.f2395a);
            return;
        }
        canvas.drawText(this.f2409b, this.f2417f + ((float) this.f2433r) + getHorizontalOffset(), ((float) this.f2435t) + getVerticalOffset(), this.f2402a);
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f2415d = false;
        this.f2433r = getPaddingLeft();
        this.f2434s = getPaddingRight();
        this.f2435t = getPaddingTop();
        this.f2436u = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            TextPaint textPaint = this.f2402a;
            String str = this.f2409b;
            textPaint.getTextBounds(str, 0, str.length(), this.f2398a);
            if (mode != 1073741824) {
                size = (int) (((float) this.f2398a.width()) + 0.99999f);
            }
            size += this.f2433r + this.f2434s;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (((float) this.f2402a.getFontMetricsInt((Paint.FontMetricsInt) null)) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f2435t + this.f2436u + fontMetricsInt;
            }
        } else if (this.f2438w != 0) {
            this.f2415d = true;
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i) {
        if ((i & ri1.f19871d) == 0) {
            i |= ri1.f19869b;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        if (i != this.f2437v) {
            invalidate();
        }
        this.f2437v = i;
        int i2 = i & 112;
        if (i2 == 48) {
            this.f2423l = -1.0f;
        } else if (i2 != 80) {
            this.f2423l = 0.0f;
        } else {
            this.f2423l = 1.0f;
        }
        int i3 = i & ri1.f19871d;
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 8388611) {
                    if (i3 != 8388613) {
                        this.f2422k = 0.0f;
                        return;
                    }
                }
            }
            this.f2422k = 1.0f;
            return;
        }
        this.f2422k = -1.0f;
    }

    @sj3(21)
    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f2405b = f;
            float f2 = this.f2392a;
            this.f2392a = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f2405b != f;
        this.f2405b = f;
        if (f != 0.0f) {
            if (this.f2397a == null) {
                this.f2397a = new Path();
            }
            if (this.f2399a == null) {
                this.f2399a = new RectF();
            }
            if (this.f2403a == null) {
                C0415b bVar = new C0415b();
                this.f2403a = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f2399a.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f2397a.reset();
            Path path = this.f2397a;
            RectF rectF = this.f2399a;
            float f3 = this.f2405b;
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
        boolean z = this.f2392a != f;
        this.f2392a = f;
        if (f != 0.0f) {
            if (this.f2397a == null) {
                this.f2397a = new Path();
            }
            if (this.f2399a == null) {
                this.f2399a = new RectF();
            }
            if (this.f2403a == null) {
                C0414a aVar = new C0414a();
                this.f2403a = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f2392a) / 2.0f;
            this.f2399a.set(0.0f, 0.0f, (float) width, (float) height);
            this.f2397a.reset();
            this.f2397a.addRoundRect(this.f2399a, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f) {
        this.f2414d = f;
    }

    public void setText(CharSequence charSequence) {
        this.f2409b = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f) {
        this.f2425n = f;
        mo3157l();
        invalidate();
    }

    public void setTextBackgroundPanY(float f) {
        this.f2427o = f;
        mo3157l();
        invalidate();
    }

    public void setTextBackgroundRotate(float f) {
        this.f2431q = f;
        mo3157l();
        invalidate();
    }

    public void setTextBackgroundZoom(float f) {
        this.f2429p = f;
        mo3157l();
        invalidate();
    }

    public void setTextFillColor(int i) {
        this.f2426n = i;
        invalidate();
    }

    public void setTextOutlineColor(int i) {
        this.f2428o = i;
        this.f2410b = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f) {
        this.f2416e = f;
        this.f2410b = true;
        if (Float.isNaN(f)) {
            this.f2416e = 1.0f;
            this.f2410b = false;
        }
        invalidate();
    }

    public void setTextPanX(float f) {
        this.f2422k = f;
        invalidate();
    }

    public void setTextPanY(float f) {
        this.f2423l = f;
        invalidate();
    }

    public void setTextSize(float f) {
        this.f2411c = f;
        String str = f2389d;
        Log.v(str, ve0.m30007f() + yg1.C3999a.f23084c + f + " / " + this.f2414d);
        TextPaint textPaint = this.f2402a;
        if (!Float.isNaN(this.f2414d)) {
            f = this.f2414d;
        }
        textPaint.setTextSize(f);
        mo3138f(Float.isNaN(this.f2414d) ? 1.0f : this.f2411c / this.f2414d);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f) {
        this.f2420i = f;
        mo3157l();
        invalidate();
    }

    public void setTextureWidth(float f) {
        this.f2421j = f;
        mo3157l();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (this.f2402a.getTypeface() != typeface) {
            this.f2402a.setTypeface(typeface);
            if (this.f2401a != null) {
                this.f2401a = null;
                requestLayout();
                invalidate();
            }
        }
    }
}
