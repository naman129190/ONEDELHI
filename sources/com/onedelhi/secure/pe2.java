package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.rh4;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@sj3(21)
public final class pe2 extends Transition {

    /* renamed from: A */
    public static final int f33525A = 0;

    /* renamed from: B */
    public static final int f33526B = 1;

    /* renamed from: C */
    public static final int f33527C = 2;

    /* renamed from: D */
    public static final int f33528D = 3;

    /* renamed from: E */
    public static final int f33529E = 0;

    /* renamed from: F */
    public static final int f33530F = 1;

    /* renamed from: G */
    public static final int f33531G = 2;

    /* renamed from: a */
    public static final C6434g f33532a = new C6434g(new C6433f(0.0f, 0.25f), new C6433f(0.0f, 1.0f), new C6433f(0.0f, 1.0f), new C6433f(0.0f, 0.75f), (C6426a) null);

    /* renamed from: a */
    public static final String[] f33533a = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};

    /* renamed from: b */
    public static final C6434g f33534b = new C6434g(new C6433f(0.6f, 0.9f), new C6433f(0.0f, 1.0f), new C6433f(0.0f, 0.9f), new C6433f(0.3f, 0.9f), (C6426a) null);

    /* renamed from: b */
    public static final String f33535b = pe2.class.getSimpleName();

    /* renamed from: c */
    public static final float f33536c = -1.0f;

    /* renamed from: c */
    public static final C6434g f33537c = new C6434g(new C6433f(0.1f, 0.4f), new C6433f(0.1f, 1.0f), new C6433f(0.1f, 1.0f), new C6433f(0.1f, 0.9f), (C6426a) null);

    /* renamed from: c */
    public static final String f33538c = "materialContainerTransition:bounds";

    /* renamed from: d */
    public static final C6434g f33539d = new C6434g(new C6433f(0.6f, 0.9f), new C6433f(0.0f, 0.9f), new C6433f(0.0f, 0.9f), new C6433f(0.2f, 0.9f), (C6426a) null);

    /* renamed from: d */
    public static final String f33540d = "materialContainerTransition:shapeAppearance";

    /* renamed from: x */
    public static final int f33541x = 0;

    /* renamed from: y */
    public static final int f33542y = 1;

    /* renamed from: z */
    public static final int f33543z = 2;

    /* renamed from: a */
    public float f33544a;
    @ts2

    /* renamed from: a */
    public View f33545a;
    @ts2

    /* renamed from: a */
    public C6433f f33546a;
    @ts2

    /* renamed from: a */
    public uw3 f33547a;

    /* renamed from: b */
    public float f33548b;
    @ts2

    /* renamed from: b */
    public View f33549b;
    @ts2

    /* renamed from: b */
    public C6433f f33550b;
    @ts2

    /* renamed from: b */
    public uw3 f33551b;

    /* renamed from: b */
    public boolean f33552b = false;
    @ts2

    /* renamed from: c */
    public C6433f f33553c;

    /* renamed from: c */
    public boolean f33554c = false;
    @ts2

    /* renamed from: d */
    public C6433f f33555d;

    /* renamed from: d */
    public boolean f33556d = false;

    /* renamed from: e */
    public boolean f33557e = false;

    /* renamed from: f */
    public boolean f33558f;
    @mo1

    /* renamed from: n */
    public int f33559n = 16908290;
    @mo1

    /* renamed from: o */
    public int f33560o = -1;
    @mo1

    /* renamed from: p */
    public int f33561p = -1;
    @d10

    /* renamed from: q */
    public int f33562q = 0;
    @d10

    /* renamed from: r */
    public int f33563r = 0;
    @d10

    /* renamed from: s */
    public int f33564s = 0;
    @d10

    /* renamed from: t */
    public int f33565t = 1375731712;

    /* renamed from: u */
    public int f33566u = 0;

    /* renamed from: v */
    public int f33567v = 0;

    /* renamed from: w */
    public int f33568w = 0;

    /* renamed from: com.onedelhi.secure.pe2$a */
    public class C6426a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C6428c f33569a;

        public C6426a(C6428c cVar) {
            this.f33569a = cVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f33569a.mo42577o(valueAnimator.getAnimatedFraction());
        }
    }

    /* renamed from: com.onedelhi.secure.pe2$b */
    public class C6427b extends mh4 {

        /* renamed from: a */
        public final /* synthetic */ View f33571a;

        /* renamed from: a */
        public final /* synthetic */ C6428c f33572a;

        /* renamed from: b */
        public final /* synthetic */ View f33574b;

        /* renamed from: c */
        public final /* synthetic */ View f33575c;

        public C6427b(View view, C6428c cVar, View view2, View view3) {
            this.f33571a = view;
            this.f33572a = cVar;
            this.f33574b = view2;
            this.f33575c = view3;
        }

        public void onTransitionEnd(@mr2 Transition transition) {
            pe2.this.removeListener(this);
            if (!pe2.this.f33554c) {
                this.f33574b.setAlpha(1.0f);
                this.f33575c.setAlpha(1.0f);
                pv4.m61669i(this.f33571a).mo40793c(this.f33572a);
            }
        }

        public void onTransitionStart(@mr2 Transition transition) {
            pv4.m61669i(this.f33571a).mo40792b(this.f33572a);
            this.f33574b.setAlpha(0.0f);
            this.f33575c.setAlpha(0.0f);
        }
    }

    /* renamed from: com.onedelhi.secure.pe2$c */
    public static final class C6428c extends Drawable {

        /* renamed from: a */
        public static final int f33576a = 754974720;

        /* renamed from: b */
        public static final int f33577b = -7829368;

        /* renamed from: i */
        public static final float f33578i = 0.3f;

        /* renamed from: j */
        public static final float f33579j = 1.5f;

        /* renamed from: a */
        public final float f33580a;

        /* renamed from: a */
        public final Paint f33581a;

        /* renamed from: a */
        public final Path f33582a;

        /* renamed from: a */
        public final PathMeasure f33583a;

        /* renamed from: a */
        public final RectF f33584a;

        /* renamed from: a */
        public final View f33585a;

        /* renamed from: a */
        public final bf2 f33586a;

        /* renamed from: a */
        public final e71 f33587a;

        /* renamed from: a */
        public i71 f33588a;

        /* renamed from: a */
        public final nz0 f33589a;

        /* renamed from: a */
        public final C6434g f33590a;

        /* renamed from: a */
        public rz0 f33591a;

        /* renamed from: a */
        public final ud2 f33592a;

        /* renamed from: a */
        public final uw3 f33593a;

        /* renamed from: a */
        public final boolean f33594a;

        /* renamed from: a */
        public final float[] f33595a;

        /* renamed from: b */
        public final float f33596b;

        /* renamed from: b */
        public final Paint f33597b;

        /* renamed from: b */
        public final RectF f33598b;

        /* renamed from: b */
        public final View f33599b;

        /* renamed from: b */
        public final uw3 f33600b;

        /* renamed from: b */
        public final boolean f33601b;

        /* renamed from: c */
        public final float f33602c;

        /* renamed from: c */
        public final Paint f33603c;

        /* renamed from: c */
        public final RectF f33604c;

        /* renamed from: c */
        public final boolean f33605c;

        /* renamed from: d */
        public final float f33606d;

        /* renamed from: d */
        public final Paint f33607d;

        /* renamed from: d */
        public final RectF f33608d;

        /* renamed from: e */
        public final float f33609e;

        /* renamed from: e */
        public final Paint f33610e;

        /* renamed from: e */
        public final RectF f33611e;

        /* renamed from: f */
        public float f33612f;

        /* renamed from: f */
        public final Paint f33613f;

        /* renamed from: f */
        public final RectF f33614f;

        /* renamed from: g */
        public float f33615g;

        /* renamed from: g */
        public RectF f33616g;

        /* renamed from: h */
        public float f33617h;

        /* renamed from: com.onedelhi.secure.pe2$c$a */
        public class C6429a implements rh4.C6698c {
            public C6429a() {
            }

            /* renamed from: a */
            public void mo42581a(Canvas canvas) {
                C6428c.this.f33585a.draw(canvas);
            }
        }

        /* renamed from: com.onedelhi.secure.pe2$c$b */
        public class C6430b implements rh4.C6698c {
            public C6430b() {
            }

            /* renamed from: a */
            public void mo42581a(Canvas canvas) {
                C6428c.this.f33599b.draw(canvas);
            }
        }

        public C6428c(PathMotion pathMotion, View view, RectF rectF, uw3 uw3, float f, View view2, RectF rectF2, uw3 uw32, float f2, @d10 int i, @d10 int i2, @d10 int i3, int i4, boolean z, boolean z2, nz0 nz0, e71 e71, C6434g gVar, boolean z3) {
            RectF rectF3 = rectF;
            Paint paint = new Paint();
            this.f33581a = paint;
            Paint paint2 = new Paint();
            this.f33597b = paint2;
            Paint paint3 = new Paint();
            this.f33603c = paint3;
            this.f33607d = new Paint();
            Paint paint4 = new Paint();
            this.f33610e = paint4;
            this.f33592a = new ud2();
            float[] fArr = new float[2];
            this.f33595a = fArr;
            bf2 bf2 = new bf2();
            this.f33586a = bf2;
            Paint paint5 = new Paint();
            this.f33613f = paint5;
            this.f33582a = new Path();
            this.f33585a = view;
            this.f33584a = rectF3;
            this.f33593a = uw3;
            this.f33580a = f;
            this.f33599b = view2;
            this.f33598b = rectF2;
            this.f33600b = uw32;
            this.f33596b = f2;
            this.f33594a = z;
            this.f33601b = z2;
            this.f33589a = nz0;
            this.f33587a = e71;
            this.f33590a = gVar;
            this.f33605c = z3;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.f33606d = (float) displayMetrics.widthPixels;
            this.f33609e = (float) displayMetrics.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            bf2.mo31626o0(ColorStateList.valueOf(0));
            bf2.mo31645x0(2);
            bf2.mo31639u0(false);
            bf2.mo31641v0(-7829368);
            RectF rectF4 = new RectF(rectF3);
            this.f33604c = rectF4;
            this.f33608d = new RectF(rectF4);
            RectF rectF5 = new RectF(rectF4);
            this.f33611e = rectF5;
            this.f33614f = new RectF(rectF5);
            PointF m = m60946m(rectF);
            PointF m2 = m60946m(rectF2);
            PathMotion pathMotion2 = pathMotion;
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(m.x, m.y, m2.x, m2.y), false);
            this.f33583a = pathMeasure;
            this.f33602c = pathMeasure.getLength();
            fArr[0] = rectF.centerX();
            fArr[1] = rectF3.top;
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(rh4.m63612c(i4));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            mo42578p(0.0f);
        }

        public /* synthetic */ C6428c(PathMotion pathMotion, View view, RectF rectF, uw3 uw3, float f, View view2, RectF rectF2, uw3 uw32, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, nz0 nz0, e71 e71, C6434g gVar, boolean z3, C6426a aVar) {
            this(pathMotion, view, rectF, uw3, f, view2, rectF2, uw32, f2, i, i2, i3, i4, z, z2, nz0, e71, gVar, z3);
        }

        /* renamed from: d */
        public static float m60944d(RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * 0.3f;
        }

        /* renamed from: e */
        public static float m60945e(RectF rectF, float f) {
            return (rectF.centerY() / f) * 1.5f;
        }

        /* renamed from: m */
        public static PointF m60946m(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        public void draw(@mr2 Canvas canvas) {
            if (this.f33610e.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f33610e);
            }
            int save = this.f33605c ? canvas.save() : -1;
            if (this.f33601b && this.f33612f > 0.0f) {
                mo42571h(canvas);
            }
            this.f33592a.mo45560a(canvas);
            mo42576n(canvas, this.f33581a);
            if (this.f33591a.f34807a) {
                mo42575l(canvas);
                mo42574k(canvas);
            } else {
                mo42574k(canvas);
                mo42575l(canvas);
            }
            if (this.f33605c) {
                canvas.restoreToCount(save);
                mo42568f(canvas, this.f33604c, this.f33582a, -65281);
                mo42569g(canvas, this.f33608d, -256);
                mo42569g(canvas, this.f33604c, -16711936);
                mo42569g(canvas, this.f33614f, -16711681);
                mo42569g(canvas, this.f33611e, -16776961);
            }
        }

        /* renamed from: f */
        public final void mo42568f(Canvas canvas, RectF rectF, Path path, @d10 int i) {
            PointF m = m60946m(rectF);
            if (this.f33617h == 0.0f) {
                path.reset();
                path.moveTo(m.x, m.y);
                return;
            }
            path.lineTo(m.x, m.y);
            this.f33613f.setColor(i);
            canvas.drawPath(path, this.f33613f);
        }

        /* renamed from: g */
        public final void mo42569g(Canvas canvas, RectF rectF, @d10 int i) {
            this.f33613f.setColor(i);
            canvas.drawRect(rectF, this.f33613f);
        }

        public int getOpacity() {
            return -3;
        }

        /* renamed from: h */
        public final void mo42571h(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f33592a.mo45563d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                mo42573j(canvas);
            } else {
                mo42572i(canvas);
            }
            canvas.restore();
        }

        /* renamed from: i */
        public final void mo42572i(Canvas canvas) {
            bf2 bf2 = this.f33586a;
            RectF rectF = this.f33616g;
            bf2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f33586a.mo31624n0(this.f33612f);
            this.f33586a.mo31562B0((int) this.f33615g);
            this.f33586a.setShapeAppearanceModel(this.f33592a.mo45562c());
            this.f33586a.draw(canvas);
        }

        /* renamed from: j */
        public final void mo42573j(Canvas canvas) {
            uw3 c = this.f33592a.mo45562c();
            if (c.mo45823u(this.f33616g)) {
                float a = c.mo45820r().mo32234a(this.f33616g);
                canvas.drawRoundRect(this.f33616g, a, a, this.f33607d);
                return;
            }
            canvas.drawPath(this.f33592a.mo45563d(), this.f33607d);
        }

        /* renamed from: k */
        public final void mo42574k(Canvas canvas) {
            mo42576n(canvas, this.f33603c);
            Rect bounds = getBounds();
            RectF rectF = this.f33611e;
            rh4.m63632w(canvas, bounds, rectF.left, rectF.top, this.f33588a.f30096b, this.f33591a.f34808b, new C6430b());
        }

        /* renamed from: l */
        public final void mo42575l(Canvas canvas) {
            mo42576n(canvas, this.f33597b);
            Rect bounds = getBounds();
            RectF rectF = this.f33604c;
            rh4.m63632w(canvas, bounds, rectF.left, rectF.top, this.f33588a.f30095a, this.f33591a.f34806a, new C6429a());
        }

        /* renamed from: n */
        public final void mo42576n(Canvas canvas, Paint paint) {
            if (paint.getColor() != 0 && paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
        }

        /* renamed from: o */
        public final void mo42577o(float f) {
            if (this.f33617h != f) {
                mo42578p(f);
            }
        }

        /* renamed from: p */
        public final void mo42578p(float f) {
            float f2;
            float f3;
            this.f33617h = f;
            this.f33610e.setAlpha((int) (this.f33594a ? rh4.m63620k(0.0f, 255.0f, f) : rh4.m63620k(255.0f, 0.0f, f)));
            this.f33583a.getPosTan(this.f33602c * f, this.f33595a, (float[]) null);
            float[] fArr = this.f33595a;
            float f4 = fArr[0];
            float f5 = fArr[1];
            int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            if (i > 0 || f < 0.0f) {
                if (i > 0) {
                    f3 = 0.99f;
                    f2 = (f - 1.0f) / 0.00999999f;
                } else {
                    f3 = 0.01f;
                    f2 = (f / 0.01f) * -1.0f;
                }
                this.f33583a.getPosTan(this.f33602c * f3, fArr, (float[]) null);
                float[] fArr2 = this.f33595a;
                f4 += (f4 - fArr2[0]) * f2;
                f5 += (f5 - fArr2[1]) * f2;
            }
            float f6 = f4;
            float f7 = f5;
            i71 c = this.f33587a.mo34860c(f, ((Float) k43.m19455l(Float.valueOf(this.f33590a.f33623b.f33620a))).floatValue(), ((Float) k43.m19455l(Float.valueOf(this.f33590a.f33623b.f33621b))).floatValue(), this.f33584a.width(), this.f33584a.height(), this.f33598b.width(), this.f33598b.height());
            this.f33588a = c;
            RectF rectF = this.f33604c;
            float f8 = c.f30097c;
            rectF.set(f6 - (f8 / 2.0f), f7, (f8 / 2.0f) + f6, c.f30098d + f7);
            RectF rectF2 = this.f33611e;
            i71 i71 = this.f33588a;
            float f9 = i71.f30099e;
            rectF2.set(f6 - (f9 / 2.0f), f7, f6 + (f9 / 2.0f), i71.f30100f + f7);
            this.f33608d.set(this.f33604c);
            this.f33614f.set(this.f33611e);
            float floatValue = ((Float) k43.m19455l(Float.valueOf(this.f33590a.f33624c.f33620a))).floatValue();
            float floatValue2 = ((Float) k43.m19455l(Float.valueOf(this.f33590a.f33624c.f33621b))).floatValue();
            boolean b = this.f33587a.mo34859b(this.f33588a);
            RectF rectF3 = b ? this.f33608d : this.f33614f;
            float l = rh4.m63621l(0.0f, 1.0f, floatValue, floatValue2, f);
            if (!b) {
                l = 1.0f - l;
            }
            this.f33587a.mo34858a(rectF3, l, this.f33588a);
            this.f33616g = new RectF(Math.min(this.f33608d.left, this.f33614f.left), Math.min(this.f33608d.top, this.f33614f.top), Math.max(this.f33608d.right, this.f33614f.right), Math.max(this.f33608d.bottom, this.f33614f.bottom));
            this.f33592a.mo45561b(f, this.f33593a, this.f33600b, this.f33604c, this.f33608d, this.f33614f, this.f33590a.f33625d);
            this.f33612f = rh4.m63620k(this.f33580a, this.f33596b, f);
            float d = m60944d(this.f33616g, this.f33606d);
            float e = m60945e(this.f33616g, this.f33609e);
            float f10 = this.f33612f;
            float f11 = (float) ((int) (e * f10));
            this.f33615g = f11;
            this.f33607d.setShadowLayer(f10, (float) ((int) (d * f10)), f11, 754974720);
            this.f33591a = this.f33589a.mo41499a(f, ((Float) k43.m19455l(Float.valueOf(this.f33590a.f33622a.f33620a))).floatValue(), ((Float) k43.m19455l(Float.valueOf(this.f33590a.f33622a.f33621b))).floatValue(), 0.35f);
            if (this.f33597b.getColor() != 0) {
                this.f33597b.setAlpha(this.f33591a.f34806a);
            }
            if (this.f33603c.getColor() != 0) {
                this.f33603c.setAlpha(this.f33591a.f34808b);
            }
            invalidateSelf();
        }

        public void setAlpha(int i) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        public void setColorFilter(@ts2 ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.pe2$d */
    public @interface C6431d {
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.pe2$e */
    public @interface C6432e {
    }

    /* renamed from: com.onedelhi.secure.pe2$f */
    public static class C6433f {
        @d81(from = 0.0d, mo14561to = 1.0d)

        /* renamed from: a */
        public final float f33620a;
        @d81(from = 0.0d, mo14561to = 1.0d)

        /* renamed from: b */
        public final float f33621b;

        public C6433f(@d81(from = 0.0d, mo14561to = 1.0d) float f, @d81(from = 0.0d, mo14561to = 1.0d) float f2) {
            this.f33620a = f;
            this.f33621b = f2;
        }

        @d81(from = 0.0d, mo14561to = 1.0d)
        /* renamed from: c */
        public float mo42582c() {
            return this.f33621b;
        }

        @d81(from = 0.0d, mo14561to = 1.0d)
        /* renamed from: d */
        public float mo42583d() {
            return this.f33620a;
        }
    }

    /* renamed from: com.onedelhi.secure.pe2$g */
    public static class C6434g {
        @mr2

        /* renamed from: a */
        public final C6433f f33622a;
        @mr2

        /* renamed from: b */
        public final C6433f f33623b;
        @mr2

        /* renamed from: c */
        public final C6433f f33624c;
        @mr2

        /* renamed from: d */
        public final C6433f f33625d;

        public C6434g(@mr2 C6433f fVar, @mr2 C6433f fVar2, @mr2 C6433f fVar3, @mr2 C6433f fVar4) {
            this.f33622a = fVar;
            this.f33623b = fVar2;
            this.f33624c = fVar3;
            this.f33625d = fVar4;
        }

        public /* synthetic */ C6434g(C6433f fVar, C6433f fVar2, C6433f fVar3, C6433f fVar4, C6426a aVar) {
            this(fVar, fVar2, fVar3, fVar4);
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.pe2$h */
    public @interface C6435h {
    }

    public pe2() {
        boolean z = false;
        this.f33558f = Build.VERSION.SDK_INT >= 28 ? true : z;
        this.f33544a = -1.0f;
        this.f33548b = -1.0f;
    }

    public pe2(@mr2 Context context, boolean z) {
        boolean z2 = false;
        this.f33558f = Build.VERSION.SDK_INT >= 28 ? true : z2;
        this.f33544a = -1.0f;
        this.f33548b = -1.0f;
        mo42516H(context, z);
        this.f33557e = true;
    }

    @e64
    /* renamed from: C */
    public static int m60883C(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{fd3.C2153c.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: c */
    public static RectF m60885c(View view, @ts2 View view2, float f, float f2) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        }
        RectF g = rh4.m63616g(view2);
        g.offset(f, f2);
        return g;
    }

    /* renamed from: d */
    public static uw3 m60886d(@mr2 View view, @mr2 RectF rectF, @ts2 uw3 uw3) {
        return rh4.m63611b(m60889t(view, uw3), rectF);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m60887e(@com.onedelhi.secure.mr2 android.transition.TransitionValues r2, @com.onedelhi.secure.ts2 android.view.View r3, @com.onedelhi.secure.mo1 int r4, @com.onedelhi.secure.ts2 com.onedelhi.secure.uw3 r5) {
        /*
            r0 = -1
            if (r4 == r0) goto L_0x000c
            android.view.View r3 = r2.view
            android.view.View r3 = com.onedelhi.secure.rh4.m63615f(r3, r4)
        L_0x0009:
            r2.view = r3
            goto L_0x002a
        L_0x000c:
            if (r3 == 0) goto L_0x000f
            goto L_0x0009
        L_0x000f:
            android.view.View r3 = r2.view
            int r4 = com.onedelhi.secure.fd3.C2158h.mtrl_motion_snapshot_view
            java.lang.Object r3 = r3.getTag(r4)
            boolean r3 = r3 instanceof android.view.View
            if (r3 == 0) goto L_0x002a
            android.view.View r3 = r2.view
            java.lang.Object r3 = r3.getTag(r4)
            android.view.View r3 = (android.view.View) r3
            android.view.View r0 = r2.view
            r1 = 0
            r0.setTag(r4, r1)
            goto L_0x0009
        L_0x002a:
            android.view.View r3 = r2.view
            boolean r4 = com.onedelhi.secure.jt4.m18914U0(r3)
            if (r4 != 0) goto L_0x003e
            int r4 = r3.getWidth()
            if (r4 != 0) goto L_0x003e
            int r4 = r3.getHeight()
            if (r4 == 0) goto L_0x005f
        L_0x003e:
            android.view.ViewParent r4 = r3.getParent()
            if (r4 != 0) goto L_0x0049
            android.graphics.RectF r4 = com.onedelhi.secure.rh4.m63617h(r3)
            goto L_0x004d
        L_0x0049:
            android.graphics.RectF r4 = com.onedelhi.secure.rh4.m63616g(r3)
        L_0x004d:
            java.util.Map r0 = r2.values
            java.lang.String r1 = "materialContainerTransition:bounds"
            r0.put(r1, r4)
            java.util.Map r2 = r2.values
            com.onedelhi.secure.uw3 r3 = m60886d(r3, r4, r5)
            java.lang.String r4 = "materialContainerTransition:shapeAppearance"
            r2.put(r4, r3)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.pe2.m60887e(android.transition.TransitionValues, android.view.View, int, com.onedelhi.secure.uw3):void");
    }

    /* renamed from: h */
    public static float m60888h(float f, View view) {
        return f != -1.0f ? f : jt4.m18904R(view);
    }

    /* renamed from: t */
    public static uw3 m60889t(@mr2 View view, @ts2 uw3 uw3) {
        if (uw3 != null) {
            return uw3;
        }
        int i = fd3.C2158h.mtrl_motion_snapshot_view;
        if (view.getTag(i) instanceof uw3) {
            return (uw3) view.getTag(i);
        }
        Context context = view.getContext();
        int C = m60883C(context);
        return C != -1 ? uw3.m67444b(context, C, 0).mo45845m() : view instanceof nx3 ? ((nx3) view).getShapeAppearanceModel() : uw3.m67443a().mo45845m();
    }

    /* renamed from: A */
    public final C6434g mo42510A(boolean z, C6434g gVar, C6434g gVar2) {
        if (!z) {
            gVar = gVar2;
        }
        return new C6434g((C6433f) rh4.m63613d(this.f33546a, gVar.f33622a), (C6433f) rh4.m63613d(this.f33550b, gVar.f33623b), (C6433f) rh4.m63613d(this.f33553c, gVar.f33624c), (C6433f) rh4.m63613d(this.f33555d, gVar.f33625d), (C6426a) null);
    }

    /* renamed from: B */
    public int mo42511B() {
        return this.f33566u;
    }

    /* renamed from: D */
    public boolean mo42512D() {
        return this.f33552b;
    }

    /* renamed from: E */
    public boolean mo42513E() {
        return this.f33558f;
    }

    /* renamed from: F */
    public final boolean mo42514F(@mr2 RectF rectF, @mr2 RectF rectF2) {
        int i = this.f33566u;
        if (i == 0) {
            return rh4.m63610a(rectF2) > rh4.m63610a(rectF);
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid transition direction: " + this.f33566u);
    }

    /* renamed from: G */
    public boolean mo42515G() {
        return this.f33554c;
    }

    /* renamed from: H */
    public final void mo42516H(Context context, boolean z) {
        rh4.m63627r(this, context, fd3.C2153c.motionEasingEmphasizedInterpolator, C1947d7.f10650b);
        rh4.m63626q(this, context, z ? fd3.C2153c.motionDurationLong2 : fd3.C2153c.motionDurationMedium4);
        if (!this.f33556d) {
            rh4.m63628s(this, context, fd3.C2153c.motionPath);
        }
    }

    /* renamed from: I */
    public void mo42517I(@d10 int i) {
        this.f33562q = i;
        this.f33563r = i;
        this.f33564s = i;
    }

    /* renamed from: J */
    public void mo42518J(@d10 int i) {
        this.f33562q = i;
    }

    /* renamed from: K */
    public void mo42519K(boolean z) {
        this.f33552b = z;
    }

    /* renamed from: L */
    public void mo42520L(@mo1 int i) {
        this.f33559n = i;
    }

    /* renamed from: M */
    public void mo42521M(boolean z) {
        this.f33558f = z;
    }

    /* renamed from: N */
    public void mo42522N(@d10 int i) {
        this.f33564s = i;
    }

    /* renamed from: O */
    public void mo42523O(float f) {
        this.f33548b = f;
    }

    /* renamed from: P */
    public void mo42524P(@ts2 uw3 uw3) {
        this.f33551b = uw3;
    }

    /* renamed from: Q */
    public void mo42525Q(@ts2 View view) {
        this.f33549b = view;
    }

    /* renamed from: R */
    public void mo42526R(@mo1 int i) {
        this.f33561p = i;
    }

    /* renamed from: S */
    public void mo42527S(int i) {
        this.f33567v = i;
    }

    /* renamed from: T */
    public void mo42528T(@ts2 C6433f fVar) {
        this.f33546a = fVar;
    }

    /* renamed from: U */
    public void mo42529U(int i) {
        this.f33568w = i;
    }

    /* renamed from: V */
    public void mo42530V(boolean z) {
        this.f33554c = z;
    }

    /* renamed from: W */
    public void mo42531W(@ts2 C6433f fVar) {
        this.f33553c = fVar;
    }

    /* renamed from: X */
    public void mo42532X(@ts2 C6433f fVar) {
        this.f33550b = fVar;
    }

    /* renamed from: Y */
    public void mo42533Y(@d10 int i) {
        this.f33565t = i;
    }

    /* renamed from: Z */
    public void mo42534Z(@ts2 C6433f fVar) {
        this.f33555d = fVar;
    }

    /* renamed from: a0 */
    public void mo42535a0(@d10 int i) {
        this.f33563r = i;
    }

    /* renamed from: b */
    public final C6434g mo42536b(boolean z) {
        C6434g gVar;
        C6434g gVar2;
        PathMotion pathMotion = getPathMotion();
        if ((pathMotion instanceof ArcMotion) || (pathMotion instanceof he2)) {
            gVar = f33537c;
            gVar2 = f33539d;
        } else {
            gVar = f33532a;
            gVar2 = f33534b;
        }
        return mo42510A(z, gVar, gVar2);
    }

    /* renamed from: b0 */
    public void mo42537b0(float f) {
        this.f33544a = f;
    }

    /* renamed from: c0 */
    public void mo42538c0(@ts2 uw3 uw3) {
        this.f33547a = uw3;
    }

    public void captureEndValues(@mr2 TransitionValues transitionValues) {
        m60887e(transitionValues, this.f33549b, this.f33561p, this.f33551b);
    }

    public void captureStartValues(@mr2 TransitionValues transitionValues) {
        m60887e(transitionValues, this.f33545a, this.f33560o, this.f33547a);
    }

    @ts2
    public Animator createAnimator(@mr2 ViewGroup viewGroup, @ts2 TransitionValues transitionValues, @ts2 TransitionValues transitionValues2) {
        String str;
        String str2;
        View view;
        View view2;
        TransitionValues transitionValues3 = transitionValues;
        TransitionValues transitionValues4 = transitionValues2;
        if (transitionValues3 == null || transitionValues4 == null) {
            return null;
        }
        RectF rectF = (RectF) transitionValues3.values.get("materialContainerTransition:bounds");
        uw3 uw3 = (uw3) transitionValues3.values.get("materialContainerTransition:shapeAppearance");
        if (rectF == null || uw3 == null) {
            str = f33535b;
            str2 = "Skipping due to null start bounds. Ensure start view is laid out and measured.";
        } else {
            RectF rectF2 = (RectF) transitionValues4.values.get("materialContainerTransition:bounds");
            uw3 uw32 = (uw3) transitionValues4.values.get("materialContainerTransition:shapeAppearance");
            if (rectF2 == null || uw32 == null) {
                str = f33535b;
                str2 = "Skipping due to null end bounds. Ensure end view is laid out and measured.";
            } else {
                View view3 = transitionValues3.view;
                View view4 = transitionValues4.view;
                View view5 = view4.getParent() != null ? view4 : view3;
                if (this.f33559n == view5.getId()) {
                    view = (View) view5.getParent();
                    view2 = view5;
                } else {
                    view = rh4.m63614e(view5, this.f33559n);
                    view2 = null;
                }
                RectF g = rh4.m63616g(view);
                float f = -g.left;
                float f2 = -g.top;
                RectF c = m60885c(view, view2, f, f2);
                rectF.offset(f, f2);
                rectF2.offset(f, f2);
                boolean F = mo42514F(rectF, rectF2);
                if (!this.f33557e) {
                    mo42516H(view5.getContext(), F);
                }
                C6428c cVar = new C6428c(getPathMotion(), view3, rectF, uw3, m60888h(this.f33544a, view3), view4, rectF2, uw32, m60888h(this.f33548b, view4), this.f33562q, this.f33563r, this.f33564s, this.f33565t, F, this.f33558f, qz0.m63277a(this.f33567v, F), h71.m50293a(this.f33568w, F, rectF, rectF2), mo42536b(F), this.f33552b, (C6426a) null);
                cVar.setBounds(Math.round(c.left), Math.round(c.top), Math.round(c.right), Math.round(c.bottom));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.addUpdateListener(new C6426a(cVar));
                addListener(new C6427b(view, cVar, view3, view4));
                return ofFloat;
            }
        }
        Log.w(str, str2);
        return null;
    }

    /* renamed from: d0 */
    public void mo42542d0(@ts2 View view) {
        this.f33545a = view;
    }

    /* renamed from: e0 */
    public void mo42543e0(@mo1 int i) {
        this.f33560o = i;
    }

    @d10
    /* renamed from: f */
    public int mo42544f() {
        return this.f33562q;
    }

    /* renamed from: f0 */
    public void mo42545f0(int i) {
        this.f33566u = i;
    }

    @mo1
    /* renamed from: g */
    public int mo42546g() {
        return this.f33559n;
    }

    @ts2
    public String[] getTransitionProperties() {
        return f33533a;
    }

    @d10
    /* renamed from: i */
    public int mo42548i() {
        return this.f33564s;
    }

    /* renamed from: j */
    public float mo42549j() {
        return this.f33548b;
    }

    @ts2
    /* renamed from: k */
    public uw3 mo42550k() {
        return this.f33551b;
    }

    @ts2
    /* renamed from: l */
    public View mo42551l() {
        return this.f33549b;
    }

    @mo1
    /* renamed from: m */
    public int mo42552m() {
        return this.f33561p;
    }

    /* renamed from: n */
    public int mo42553n() {
        return this.f33567v;
    }

    @ts2
    /* renamed from: o */
    public C6433f mo42554o() {
        return this.f33546a;
    }

    /* renamed from: p */
    public int mo42555p() {
        return this.f33568w;
    }

    @ts2
    /* renamed from: q */
    public C6433f mo42556q() {
        return this.f33553c;
    }

    @ts2
    /* renamed from: r */
    public C6433f mo42557r() {
        return this.f33550b;
    }

    @d10
    /* renamed from: s */
    public int mo42558s() {
        return this.f33565t;
    }

    public void setPathMotion(@ts2 PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f33556d = true;
    }

    @ts2
    /* renamed from: u */
    public C6433f mo42560u() {
        return this.f33555d;
    }

    @d10
    /* renamed from: v */
    public int mo42561v() {
        return this.f33563r;
    }

    /* renamed from: w */
    public float mo42562w() {
        return this.f33544a;
    }

    @ts2
    /* renamed from: x */
    public uw3 mo42563x() {
        return this.f33547a;
    }

    @ts2
    /* renamed from: y */
    public View mo42564y() {
        return this.f33545a;
    }

    @mo1
    /* renamed from: z */
    public int mo42565z() {
        return this.f33560o;
    }
}
