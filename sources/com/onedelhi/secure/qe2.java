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
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.transition.ArcMotion;
import androidx.transition.PathMotion;
import androidx.transition.Transition;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.sh4;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class qe2 extends Transition {

    /* renamed from: E */
    public static final int f34096E = 0;

    /* renamed from: F */
    public static final int f34097F = 1;

    /* renamed from: G */
    public static final int f34098G = 2;

    /* renamed from: H */
    public static final int f34099H = 0;

    /* renamed from: I */
    public static final int f34100I = 1;

    /* renamed from: J */
    public static final int f34101J = 2;

    /* renamed from: K */
    public static final int f34102K = 3;

    /* renamed from: L */
    public static final int f34103L = 0;

    /* renamed from: M */
    public static final int f34104M = 1;

    /* renamed from: N */
    public static final int f34105N = 2;

    /* renamed from: a */
    public static final C6561f f34106a = new C6561f(new C6560e(0.0f, 0.25f), new C6560e(0.0f, 1.0f), new C6560e(0.0f, 1.0f), new C6560e(0.0f, 0.75f), (C6556a) null);

    /* renamed from: a */
    public static final String[] f34107a = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};

    /* renamed from: b */
    public static final C6561f f34108b = new C6561f(new C6560e(0.6f, 0.9f), new C6560e(0.0f, 1.0f), new C6560e(0.0f, 0.9f), new C6560e(0.3f, 0.9f), (C6556a) null);

    /* renamed from: c */
    public static final float f34109c = -1.0f;

    /* renamed from: c */
    public static final C6561f f34110c = new C6561f(new C6560e(0.1f, 0.4f), new C6560e(0.1f, 1.0f), new C6560e(0.1f, 1.0f), new C6560e(0.1f, 0.9f), (C6556a) null);

    /* renamed from: d */
    public static final C6561f f34111d = new C6561f(new C6560e(0.6f, 0.9f), new C6560e(0.0f, 0.9f), new C6560e(0.0f, 0.9f), new C6560e(0.2f, 0.9f), (C6556a) null);

    /* renamed from: h */
    public static final String f34112h = qe2.class.getSimpleName();

    /* renamed from: i */
    public static final String f34113i = "materialContainerTransition:bounds";

    /* renamed from: j */
    public static final String f34114j = "materialContainerTransition:shapeAppearance";
    @d10

    /* renamed from: A */
    public int f34115A = 1375731712;

    /* renamed from: B */
    public int f34116B = 0;

    /* renamed from: C */
    public int f34117C = 0;

    /* renamed from: D */
    public int f34118D = 0;

    /* renamed from: a */
    public float f34119a;
    @ts2

    /* renamed from: a */
    public View f34120a;
    @ts2

    /* renamed from: a */
    public C6560e f34121a;
    @ts2

    /* renamed from: a */
    public uw3 f34122a;

    /* renamed from: b */
    public float f34123b;
    @ts2

    /* renamed from: b */
    public View f34124b;
    @ts2

    /* renamed from: b */
    public C6560e f34125b;
    @ts2

    /* renamed from: b */
    public uw3 f34126b;
    @ts2

    /* renamed from: c */
    public C6560e f34127c;
    @ts2

    /* renamed from: d */
    public C6560e f34128d;

    /* renamed from: f */
    public boolean f34129f = false;

    /* renamed from: g */
    public boolean f34130g = false;

    /* renamed from: h */
    public boolean f34131h = false;

    /* renamed from: i */
    public boolean f34132i = false;

    /* renamed from: j */
    public boolean f34133j;
    @mo1

    /* renamed from: u */
    public int f34134u = 16908290;
    @mo1

    /* renamed from: v */
    public int f34135v = -1;
    @mo1

    /* renamed from: w */
    public int f34136w = -1;
    @d10

    /* renamed from: x */
    public int f34137x = 0;
    @d10

    /* renamed from: y */
    public int f34138y = 0;
    @d10

    /* renamed from: z */
    public int f34139z = 0;

    /* renamed from: com.onedelhi.secure.qe2$a */
    public class C6556a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C6563h f34140a;

        public C6556a(C6563h hVar) {
            this.f34140a = hVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f34140a.mo43502o(valueAnimator.getAnimatedFraction());
        }
    }

    /* renamed from: com.onedelhi.secure.qe2$b */
    public class C6557b extends nh4 {

        /* renamed from: a */
        public final /* synthetic */ View f34142a;

        /* renamed from: a */
        public final /* synthetic */ C6563h f34143a;

        /* renamed from: b */
        public final /* synthetic */ View f34145b;

        /* renamed from: c */
        public final /* synthetic */ View f34146c;

        public C6557b(View view, C6563h hVar, View view2, View view3) {
            this.f34142a = view;
            this.f34143a = hVar;
            this.f34145b = view2;
            this.f34146c = view3;
        }

        /* renamed from: a */
        public void mo6964a(@mr2 Transition transition) {
            pv4.m61669i(this.f34142a).mo40792b(this.f34143a);
            this.f34145b.setAlpha(0.0f);
            this.f34146c.setAlpha(0.0f);
        }

        /* renamed from: e */
        public void mo6833e(@mr2 Transition transition) {
            qe2.this.mo6926h0(this);
            if (!qe2.this.f34130g) {
                this.f34145b.setAlpha(1.0f);
                this.f34146c.setAlpha(1.0f);
                pv4.m61669i(this.f34142a).mo40793c(this.f34143a);
            }
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.qe2$c */
    public @interface C6558c {
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.qe2$d */
    public @interface C6559d {
    }

    /* renamed from: com.onedelhi.secure.qe2$e */
    public static class C6560e {
        @d81(from = 0.0d, mo14561to = 1.0d)

        /* renamed from: a */
        public final float f34147a;
        @d81(from = 0.0d, mo14561to = 1.0d)

        /* renamed from: b */
        public final float f34148b;

        public C6560e(@d81(from = 0.0d, mo14561to = 1.0d) float f, @d81(from = 0.0d, mo14561to = 1.0d) float f2) {
            this.f34147a = f;
            this.f34148b = f2;
        }

        @d81(from = 0.0d, mo14561to = 1.0d)
        /* renamed from: c */
        public float mo43490c() {
            return this.f34148b;
        }

        @d81(from = 0.0d, mo14561to = 1.0d)
        /* renamed from: d */
        public float mo43491d() {
            return this.f34147a;
        }
    }

    /* renamed from: com.onedelhi.secure.qe2$f */
    public static class C6561f {
        @mr2

        /* renamed from: a */
        public final C6560e f34149a;
        @mr2

        /* renamed from: b */
        public final C6560e f34150b;
        @mr2

        /* renamed from: c */
        public final C6560e f34151c;
        @mr2

        /* renamed from: d */
        public final C6560e f34152d;

        public C6561f(@mr2 C6560e eVar, @mr2 C6560e eVar2, @mr2 C6560e eVar3, @mr2 C6560e eVar4) {
            this.f34149a = eVar;
            this.f34150b = eVar2;
            this.f34151c = eVar3;
            this.f34152d = eVar4;
        }

        public /* synthetic */ C6561f(C6560e eVar, C6560e eVar2, C6560e eVar3, C6560e eVar4, C6556a aVar) {
            this(eVar, eVar2, eVar3, eVar4);
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.qe2$g */
    public @interface C6562g {
    }

    /* renamed from: com.onedelhi.secure.qe2$h */
    public static final class C6563h extends Drawable {

        /* renamed from: a */
        public static final int f34153a = 754974720;

        /* renamed from: b */
        public static final int f34154b = -7829368;

        /* renamed from: i */
        public static final float f34155i = 0.3f;

        /* renamed from: j */
        public static final float f34156j = 1.5f;

        /* renamed from: a */
        public final float f34157a;

        /* renamed from: a */
        public final Paint f34158a;

        /* renamed from: a */
        public final Path f34159a;

        /* renamed from: a */
        public final PathMeasure f34160a;

        /* renamed from: a */
        public final RectF f34161a;

        /* renamed from: a */
        public final View f34162a;

        /* renamed from: a */
        public final bf2 f34163a;

        /* renamed from: a */
        public final f71 f34164a;

        /* renamed from: a */
        public j71 f34165a;

        /* renamed from: a */
        public final oz0 f34166a;

        /* renamed from: a */
        public final C6561f f34167a;

        /* renamed from: a */
        public sz0 f34168a;

        /* renamed from: a */
        public final uw3 f34169a;

        /* renamed from: a */
        public final vd2 f34170a;

        /* renamed from: a */
        public final boolean f34171a;

        /* renamed from: a */
        public final float[] f34172a;

        /* renamed from: b */
        public final float f34173b;

        /* renamed from: b */
        public final Paint f34174b;

        /* renamed from: b */
        public final RectF f34175b;

        /* renamed from: b */
        public final View f34176b;

        /* renamed from: b */
        public final uw3 f34177b;

        /* renamed from: b */
        public final boolean f34178b;

        /* renamed from: c */
        public final float f34179c;

        /* renamed from: c */
        public final Paint f34180c;

        /* renamed from: c */
        public final RectF f34181c;

        /* renamed from: c */
        public final boolean f34182c;

        /* renamed from: d */
        public final float f34183d;

        /* renamed from: d */
        public final Paint f34184d;

        /* renamed from: d */
        public final RectF f34185d;

        /* renamed from: e */
        public final float f34186e;

        /* renamed from: e */
        public final Paint f34187e;

        /* renamed from: e */
        public final RectF f34188e;

        /* renamed from: f */
        public float f34189f;

        /* renamed from: f */
        public final Paint f34190f;

        /* renamed from: f */
        public final RectF f34191f;

        /* renamed from: g */
        public float f34192g;

        /* renamed from: g */
        public RectF f34193g;

        /* renamed from: h */
        public float f34194h;

        /* renamed from: com.onedelhi.secure.qe2$h$a */
        public class C6564a implements sh4.C6769c {
            public C6564a() {
            }

            /* renamed from: a */
            public void mo43506a(Canvas canvas) {
                C6563h.this.f34162a.draw(canvas);
            }
        }

        /* renamed from: com.onedelhi.secure.qe2$h$b */
        public class C6565b implements sh4.C6769c {
            public C6565b() {
            }

            /* renamed from: a */
            public void mo43506a(Canvas canvas) {
                C6563h.this.f34176b.draw(canvas);
            }
        }

        public C6563h(PathMotion pathMotion, View view, RectF rectF, uw3 uw3, float f, View view2, RectF rectF2, uw3 uw32, float f2, @d10 int i, @d10 int i2, @d10 int i3, int i4, boolean z, boolean z2, oz0 oz0, f71 f71, C6561f fVar, boolean z3) {
            RectF rectF3 = rectF;
            Paint paint = new Paint();
            this.f34158a = paint;
            Paint paint2 = new Paint();
            this.f34174b = paint2;
            Paint paint3 = new Paint();
            this.f34180c = paint3;
            this.f34184d = new Paint();
            Paint paint4 = new Paint();
            this.f34187e = paint4;
            this.f34170a = new vd2();
            float[] fArr = new float[2];
            this.f34172a = fArr;
            bf2 bf2 = new bf2();
            this.f34163a = bf2;
            Paint paint5 = new Paint();
            this.f34190f = paint5;
            this.f34159a = new Path();
            this.f34162a = view;
            this.f34161a = rectF3;
            this.f34169a = uw3;
            this.f34157a = f;
            this.f34176b = view2;
            this.f34175b = rectF2;
            this.f34177b = uw32;
            this.f34173b = f2;
            this.f34171a = z;
            this.f34178b = z2;
            this.f34166a = oz0;
            this.f34164a = f71;
            this.f34167a = fVar;
            this.f34182c = z3;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            this.f34183d = (float) displayMetrics.widthPixels;
            this.f34186e = (float) displayMetrics.heightPixels;
            paint.setColor(i);
            paint2.setColor(i2);
            paint3.setColor(i3);
            bf2.mo31626o0(ColorStateList.valueOf(0));
            bf2.mo31645x0(2);
            bf2.mo31639u0(false);
            bf2.mo31641v0(-7829368);
            RectF rectF4 = new RectF(rectF3);
            this.f34181c = rectF4;
            this.f34185d = new RectF(rectF4);
            RectF rectF5 = new RectF(rectF4);
            this.f34188e = rectF5;
            this.f34191f = new RectF(rectF5);
            PointF m = m62701m(rectF);
            PointF m2 = m62701m(rectF2);
            PathMotion pathMotion2 = pathMotion;
            PathMeasure pathMeasure = new PathMeasure(pathMotion.mo6787a(m.x, m.y, m2.x, m2.y), false);
            this.f34160a = pathMeasure;
            this.f34179c = pathMeasure.getLength();
            fArr[0] = rectF.centerX();
            fArr[1] = rectF3.top;
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(sh4.m64577c(i4));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            mo43503p(0.0f);
        }

        public /* synthetic */ C6563h(PathMotion pathMotion, View view, RectF rectF, uw3 uw3, float f, View view2, RectF rectF2, uw3 uw32, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, oz0 oz0, f71 f71, C6561f fVar, boolean z3, C6556a aVar) {
            this(pathMotion, view, rectF, uw3, f, view2, rectF2, uw32, f2, i, i2, i3, i4, z, z2, oz0, f71, fVar, z3);
        }

        /* renamed from: d */
        public static float m62699d(RectF rectF, float f) {
            return ((rectF.centerX() / (f / 2.0f)) - 1.0f) * 0.3f;
        }

        /* renamed from: e */
        public static float m62700e(RectF rectF, float f) {
            return (rectF.centerY() / f) * 1.5f;
        }

        /* renamed from: m */
        public static PointF m62701m(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        public void draw(@mr2 Canvas canvas) {
            if (this.f34187e.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f34187e);
            }
            int save = this.f34182c ? canvas.save() : -1;
            if (this.f34178b && this.f34189f > 0.0f) {
                mo43496h(canvas);
            }
            this.f34170a.mo46123a(canvas);
            mo43501n(canvas, this.f34158a);
            if (this.f34168a.f35261a) {
                mo43500l(canvas);
                mo43499k(canvas);
            } else {
                mo43499k(canvas);
                mo43500l(canvas);
            }
            if (this.f34182c) {
                canvas.restoreToCount(save);
                mo43493f(canvas, this.f34181c, this.f34159a, -65281);
                mo43494g(canvas, this.f34185d, -256);
                mo43494g(canvas, this.f34181c, -16711936);
                mo43494g(canvas, this.f34191f, -16711681);
                mo43494g(canvas, this.f34188e, -16776961);
            }
        }

        /* renamed from: f */
        public final void mo43493f(Canvas canvas, RectF rectF, Path path, @d10 int i) {
            PointF m = m62701m(rectF);
            if (this.f34194h == 0.0f) {
                path.reset();
                path.moveTo(m.x, m.y);
                return;
            }
            path.lineTo(m.x, m.y);
            this.f34190f.setColor(i);
            canvas.drawPath(path, this.f34190f);
        }

        /* renamed from: g */
        public final void mo43494g(Canvas canvas, RectF rectF, @d10 int i) {
            this.f34190f.setColor(i);
            canvas.drawRect(rectF, this.f34190f);
        }

        public int getOpacity() {
            return -3;
        }

        /* renamed from: h */
        public final void mo43496h(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f34170a.mo46126d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                mo43498j(canvas);
            } else {
                mo43497i(canvas);
            }
            canvas.restore();
        }

        /* renamed from: i */
        public final void mo43497i(Canvas canvas) {
            bf2 bf2 = this.f34163a;
            RectF rectF = this.f34193g;
            bf2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f34163a.mo31624n0(this.f34189f);
            this.f34163a.mo31562B0((int) this.f34192g);
            this.f34163a.setShapeAppearanceModel(this.f34170a.mo46125c());
            this.f34163a.draw(canvas);
        }

        /* renamed from: j */
        public final void mo43498j(Canvas canvas) {
            uw3 c = this.f34170a.mo46125c();
            if (c.mo45823u(this.f34193g)) {
                float a = c.mo45820r().mo32234a(this.f34193g);
                canvas.drawRoundRect(this.f34193g, a, a, this.f34184d);
                return;
            }
            canvas.drawPath(this.f34170a.mo46126d(), this.f34184d);
        }

        /* renamed from: k */
        public final void mo43499k(Canvas canvas) {
            mo43501n(canvas, this.f34180c);
            Rect bounds = getBounds();
            RectF rectF = this.f34188e;
            sh4.m64597w(canvas, bounds, rectF.left, rectF.top, this.f34165a.f30585b, this.f34168a.f35262b, new C6565b());
        }

        /* renamed from: l */
        public final void mo43500l(Canvas canvas) {
            mo43501n(canvas, this.f34174b);
            Rect bounds = getBounds();
            RectF rectF = this.f34181c;
            sh4.m64597w(canvas, bounds, rectF.left, rectF.top, this.f34165a.f30584a, this.f34168a.f35260a, new C6564a());
        }

        /* renamed from: n */
        public final void mo43501n(Canvas canvas, Paint paint) {
            if (paint.getColor() != 0 && paint.getAlpha() > 0) {
                canvas.drawRect(getBounds(), paint);
            }
        }

        /* renamed from: o */
        public final void mo43502o(float f) {
            if (this.f34194h != f) {
                mo43503p(f);
            }
        }

        /* renamed from: p */
        public final void mo43503p(float f) {
            float f2;
            float f3;
            this.f34194h = f;
            this.f34187e.setAlpha((int) (this.f34171a ? sh4.m64585k(0.0f, 255.0f, f) : sh4.m64585k(255.0f, 0.0f, f)));
            this.f34160a.getPosTan(this.f34179c * f, this.f34172a, (float[]) null);
            float[] fArr = this.f34172a;
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
                this.f34160a.getPosTan(this.f34179c * f3, fArr, (float[]) null);
                float[] fArr2 = this.f34172a;
                f4 += (f4 - fArr2[0]) * f2;
                f5 += (f5 - fArr2[1]) * f2;
            }
            float f6 = f4;
            float f7 = f5;
            j71 c = this.f34164a.mo35788c(f, ((Float) k43.m19455l(Float.valueOf(this.f34167a.f34150b.f34147a))).floatValue(), ((Float) k43.m19455l(Float.valueOf(this.f34167a.f34150b.f34148b))).floatValue(), this.f34161a.width(), this.f34161a.height(), this.f34175b.width(), this.f34175b.height());
            this.f34165a = c;
            RectF rectF = this.f34181c;
            float f8 = c.f30586c;
            rectF.set(f6 - (f8 / 2.0f), f7, (f8 / 2.0f) + f6, c.f30587d + f7);
            RectF rectF2 = this.f34188e;
            j71 j71 = this.f34165a;
            float f9 = j71.f30588e;
            rectF2.set(f6 - (f9 / 2.0f), f7, f6 + (f9 / 2.0f), j71.f30589f + f7);
            this.f34185d.set(this.f34181c);
            this.f34191f.set(this.f34188e);
            float floatValue = ((Float) k43.m19455l(Float.valueOf(this.f34167a.f34151c.f34147a))).floatValue();
            float floatValue2 = ((Float) k43.m19455l(Float.valueOf(this.f34167a.f34151c.f34148b))).floatValue();
            boolean b = this.f34164a.mo35787b(this.f34165a);
            RectF rectF3 = b ? this.f34185d : this.f34191f;
            float l = sh4.m64586l(0.0f, 1.0f, floatValue, floatValue2, f);
            if (!b) {
                l = 1.0f - l;
            }
            this.f34164a.mo35786a(rectF3, l, this.f34165a);
            this.f34193g = new RectF(Math.min(this.f34185d.left, this.f34191f.left), Math.min(this.f34185d.top, this.f34191f.top), Math.max(this.f34185d.right, this.f34191f.right), Math.max(this.f34185d.bottom, this.f34191f.bottom));
            this.f34170a.mo46124b(f, this.f34169a, this.f34177b, this.f34181c, this.f34185d, this.f34191f, this.f34167a.f34152d);
            this.f34189f = sh4.m64585k(this.f34157a, this.f34173b, f);
            float d = m62699d(this.f34193g, this.f34183d);
            float e = m62700e(this.f34193g, this.f34186e);
            float f10 = this.f34189f;
            float f11 = (float) ((int) (e * f10));
            this.f34192g = f11;
            this.f34184d.setShadowLayer(f10, (float) ((int) (d * f10)), f11, 754974720);
            this.f34168a = this.f34166a.mo42309a(f, ((Float) k43.m19455l(Float.valueOf(this.f34167a.f34149a.f34147a))).floatValue(), ((Float) k43.m19455l(Float.valueOf(this.f34167a.f34149a.f34148b))).floatValue(), 0.35f);
            if (this.f34174b.getColor() != 0) {
                this.f34174b.setAlpha(this.f34168a.f35260a);
            }
            if (this.f34180c.getColor() != 0) {
                this.f34180c.setAlpha(this.f34168a.f35262b);
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

    public qe2() {
        boolean z = false;
        this.f34133j = Build.VERSION.SDK_INT >= 28 ? true : z;
        this.f34119a = -1.0f;
        this.f34123b = -1.0f;
    }

    public qe2(@mr2 Context context, boolean z) {
        boolean z2 = false;
        this.f34133j = Build.VERSION.SDK_INT >= 28 ? true : z2;
        this.f34119a = -1.0f;
        this.f34123b = -1.0f;
        mo43470h1(context, z);
        this.f34132i = true;
    }

    /* renamed from: C0 */
    public static RectF m62624C0(View view, @ts2 View view2, float f, float f2) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        }
        RectF g = sh4.m64581g(view2);
        g.offset(f, f2);
        return g;
    }

    /* renamed from: D0 */
    public static uw3 m62625D0(@mr2 View view, @mr2 RectF rectF, @ts2 uw3 uw3) {
        return sh4.m64576b(m62628T0(view, uw3), rectF);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: E0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m62626E0(@com.onedelhi.secure.mr2 com.onedelhi.secure.th4 r2, @com.onedelhi.secure.ts2 android.view.View r3, @com.onedelhi.secure.mo1 int r4, @com.onedelhi.secure.ts2 com.onedelhi.secure.uw3 r5) {
        /*
            r0 = -1
            if (r4 == r0) goto L_0x000c
            android.view.View r3 = r2.f20844a
            android.view.View r3 = com.onedelhi.secure.sh4.m64580f(r3, r4)
        L_0x0009:
            r2.f20844a = r3
            goto L_0x002a
        L_0x000c:
            if (r3 == 0) goto L_0x000f
            goto L_0x0009
        L_0x000f:
            android.view.View r3 = r2.f20844a
            int r4 = com.onedelhi.secure.fd3.C2158h.mtrl_motion_snapshot_view
            java.lang.Object r3 = r3.getTag(r4)
            boolean r3 = r3 instanceof android.view.View
            if (r3 == 0) goto L_0x002a
            android.view.View r3 = r2.f20844a
            java.lang.Object r3 = r3.getTag(r4)
            android.view.View r3 = (android.view.View) r3
            android.view.View r0 = r2.f20844a
            r1 = 0
            r0.setTag(r4, r1)
            goto L_0x0009
        L_0x002a:
            android.view.View r3 = r2.f20844a
            boolean r4 = com.onedelhi.secure.jt4.m18914U0(r3)
            if (r4 != 0) goto L_0x003e
            int r4 = r3.getWidth()
            if (r4 != 0) goto L_0x003e
            int r4 = r3.getHeight()
            if (r4 == 0) goto L_0x005f
        L_0x003e:
            android.view.ViewParent r4 = r3.getParent()
            if (r4 != 0) goto L_0x0049
            android.graphics.RectF r4 = com.onedelhi.secure.sh4.m64582h(r3)
            goto L_0x004d
        L_0x0049:
            android.graphics.RectF r4 = com.onedelhi.secure.sh4.m64581g(r3)
        L_0x004d:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f20846a
            java.lang.String r1 = "materialContainerTransition:bounds"
            r0.put(r1, r4)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f20846a
            com.onedelhi.secure.uw3 r3 = m62625D0(r3, r4, r5)
            java.lang.String r4 = "materialContainerTransition:shapeAppearance"
            r2.put(r4, r3)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.qe2.m62626E0(com.onedelhi.secure.th4, android.view.View, int, com.onedelhi.secure.uw3):void");
    }

    /* renamed from: H0 */
    public static float m62627H0(float f, View view) {
        return f != -1.0f ? f : jt4.m18904R(view);
    }

    /* renamed from: T0 */
    public static uw3 m62628T0(@mr2 View view, @ts2 uw3 uw3) {
        if (uw3 != null) {
            return uw3;
        }
        int i = fd3.C2158h.mtrl_motion_snapshot_view;
        if (view.getTag(i) instanceof uw3) {
            return (uw3) view.getTag(i);
        }
        Context context = view.getContext();
        int c1 = m62629c1(context);
        return c1 != -1 ? uw3.m67444b(context, c1, 0).mo45845m() : view instanceof nx3 ? ((nx3) view).getShapeAppearanceModel() : uw3.m67443a().mo45845m();
    }

    @e64
    /* renamed from: c1 */
    public static int m62629c1(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{fd3.C2153c.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: A1 */
    public void mo43438A1(@d10 int i) {
        this.f34138y = i;
    }

    /* renamed from: B0 */
    public final C6561f mo43439B0(boolean z) {
        C6561f fVar;
        C6561f fVar2;
        PathMotion L = mo6901L();
        if ((L instanceof ArcMotion) || (L instanceof ie2)) {
            fVar = f34110c;
            fVar2 = f34111d;
        } else {
            fVar = f34106a;
            fVar2 = f34108b;
        }
        return mo43464a1(z, fVar, fVar2);
    }

    /* renamed from: B1 */
    public void mo43440B1(float f) {
        this.f34119a = f;
    }

    /* renamed from: C1 */
    public void mo43441C1(@ts2 uw3 uw3) {
        this.f34122a = uw3;
    }

    /* renamed from: D1 */
    public void mo43442D1(@ts2 View view) {
        this.f34120a = view;
    }

    /* renamed from: E1 */
    public void mo43443E1(@mo1 int i) {
        this.f34135v = i;
    }

    @d10
    /* renamed from: F0 */
    public int mo43444F0() {
        return this.f34137x;
    }

    /* renamed from: F1 */
    public void mo43445F1(int i) {
        this.f34116B = i;
    }

    @mo1
    /* renamed from: G0 */
    public int mo43446G0() {
        return this.f34134u;
    }

    @d10
    /* renamed from: I0 */
    public int mo43447I0() {
        return this.f34139z;
    }

    /* renamed from: J0 */
    public float mo43448J0() {
        return this.f34123b;
    }

    @ts2
    /* renamed from: K0 */
    public uw3 mo43449K0() {
        return this.f34126b;
    }

    @ts2
    /* renamed from: L0 */
    public View mo43450L0() {
        return this.f34124b;
    }

    @mo1
    /* renamed from: M0 */
    public int mo43451M0() {
        return this.f34136w;
    }

    /* renamed from: N0 */
    public int mo43452N0() {
        return this.f34117C;
    }

    @ts2
    /* renamed from: O0 */
    public C6560e mo43453O0() {
        return this.f34121a;
    }

    /* renamed from: P0 */
    public int mo43454P0() {
        return this.f34118D;
    }

    @ts2
    /* renamed from: Q0 */
    public C6560e mo43455Q0() {
        return this.f34127c;
    }

    @ts2
    /* renamed from: R0 */
    public C6560e mo43456R0() {
        return this.f34125b;
    }

    @d10
    /* renamed from: S0 */
    public int mo43457S0() {
        return this.f34115A;
    }

    @ts2
    /* renamed from: T */
    public String[] mo6799T() {
        return f34107a;
    }

    @ts2
    /* renamed from: U0 */
    public C6560e mo43458U0() {
        return this.f34128d;
    }

    @d10
    /* renamed from: V0 */
    public int mo43459V0() {
        return this.f34138y;
    }

    /* renamed from: W0 */
    public float mo43460W0() {
        return this.f34119a;
    }

    @ts2
    /* renamed from: X0 */
    public uw3 mo43461X0() {
        return this.f34122a;
    }

    @ts2
    /* renamed from: Y0 */
    public View mo43462Y0() {
        return this.f34120a;
    }

    @mo1
    /* renamed from: Z0 */
    public int mo43463Z0() {
        return this.f34135v;
    }

    /* renamed from: a1 */
    public final C6561f mo43464a1(boolean z, C6561f fVar, C6561f fVar2) {
        if (!z) {
            fVar = fVar2;
        }
        return new C6561f((C6560e) sh4.m64578d(this.f34121a, fVar.f34149a), (C6560e) sh4.m64578d(this.f34125b, fVar.f34150b), (C6560e) sh4.m64578d(this.f34127c, fVar.f34151c), (C6560e) sh4.m64578d(this.f34128d, fVar.f34152d), (C6556a) null);
    }

    /* renamed from: b1 */
    public int mo43465b1() {
        return this.f34116B;
    }

    /* renamed from: d1 */
    public boolean mo43466d1() {
        return this.f34129f;
    }

    /* renamed from: e1 */
    public boolean mo43467e1() {
        return this.f34133j;
    }

    /* renamed from: f1 */
    public final boolean mo43468f1(@mr2 RectF rectF, @mr2 RectF rectF2) {
        int i = this.f34116B;
        if (i == 0) {
            return sh4.m64575a(rectF2) > sh4.m64575a(rectF);
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid transition direction: " + this.f34116B);
    }

    /* renamed from: g1 */
    public boolean mo43469g1() {
        return this.f34130g;
    }

    /* renamed from: h1 */
    public final void mo43470h1(Context context, boolean z) {
        sh4.m64592r(this, context, fd3.C2153c.motionEasingEmphasizedInterpolator, C1947d7.f10650b);
        sh4.m64591q(this, context, z ? fd3.C2153c.motionDurationLong2 : fd3.C2153c.motionDurationMedium4);
        if (!this.f34131h) {
            sh4.m64593s(this, context, fd3.C2153c.motionPath);
        }
    }

    /* renamed from: i1 */
    public void mo43471i1(@d10 int i) {
        this.f34137x = i;
        this.f34138y = i;
        this.f34139z = i;
    }

    /* renamed from: j */
    public void mo6800j(@mr2 th4 th4) {
        m62626E0(th4, this.f34124b, this.f34136w, this.f34126b);
    }

    /* renamed from: j1 */
    public void mo43472j1(@d10 int i) {
        this.f34137x = i;
    }

    /* renamed from: k1 */
    public void mo43473k1(boolean z) {
        this.f34129f = z;
    }

    /* renamed from: l1 */
    public void mo43474l1(@mo1 int i) {
        this.f34134u = i;
    }

    /* renamed from: m */
    public void mo6801m(@mr2 th4 th4) {
        m62626E0(th4, this.f34120a, this.f34135v, this.f34122a);
    }

    /* renamed from: m1 */
    public void mo43475m1(boolean z) {
        this.f34133j = z;
    }

    /* renamed from: n1 */
    public void mo43476n1(@d10 int i) {
        this.f34139z = i;
    }

    /* renamed from: o1 */
    public void mo43477o1(float f) {
        this.f34123b = f;
    }

    /* renamed from: p1 */
    public void mo43478p1(@ts2 uw3 uw3) {
        this.f34126b = uw3;
    }

    @ts2
    /* renamed from: q */
    public Animator mo6802q(@mr2 ViewGroup viewGroup, @ts2 th4 th4, @ts2 th4 th42) {
        String str;
        String str2;
        View view;
        View view2;
        th4 th43 = th4;
        th4 th44 = th42;
        if (th43 == null || th44 == null) {
            return null;
        }
        RectF rectF = (RectF) th43.f20846a.get("materialContainerTransition:bounds");
        uw3 uw3 = (uw3) th43.f20846a.get("materialContainerTransition:shapeAppearance");
        if (rectF == null || uw3 == null) {
            str = f34112h;
            str2 = "Skipping due to null start bounds. Ensure start view is laid out and measured.";
        } else {
            RectF rectF2 = (RectF) th44.f20846a.get("materialContainerTransition:bounds");
            uw3 uw32 = (uw3) th44.f20846a.get("materialContainerTransition:shapeAppearance");
            if (rectF2 == null || uw32 == null) {
                str = f34112h;
                str2 = "Skipping due to null end bounds. Ensure end view is laid out and measured.";
            } else {
                View view3 = th43.f20844a;
                View view4 = th44.f20844a;
                View view5 = view4.getParent() != null ? view4 : view3;
                if (this.f34134u == view5.getId()) {
                    view = (View) view5.getParent();
                    view2 = view5;
                } else {
                    view = sh4.m64579e(view5, this.f34134u);
                    view2 = null;
                }
                RectF g = sh4.m64581g(view);
                float f = -g.left;
                float f2 = -g.top;
                RectF C0 = m62624C0(view, view2, f, f2);
                rectF.offset(f, f2);
                rectF2.offset(f, f2);
                boolean f1 = mo43468f1(rectF, rectF2);
                if (!this.f34132i) {
                    mo43470h1(view5.getContext(), f1);
                }
                C6563h hVar = new C6563h(mo6901L(), view3, rectF, uw3, m62627H0(this.f34119a, view3), view4, rectF2, uw32, m62627H0(this.f34123b, view4), this.f34137x, this.f34138y, this.f34139z, this.f34115A, f1, this.f34133j, pz0.m61767a(this.f34117C, f1), g71.m49090a(this.f34118D, f1, rectF, rectF2), mo43439B0(f1), this.f34129f, (C6556a) null);
                hVar.setBounds(Math.round(C0.left), Math.round(C0.top), Math.round(C0.right), Math.round(C0.bottom));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.addUpdateListener(new C6556a(hVar));
                mo6912a(new C6557b(view, hVar, view3, view4));
                return ofFloat;
            }
        }
        Log.w(str, str2);
        return null;
    }

    /* renamed from: q1 */
    public void mo43479q1(@ts2 View view) {
        this.f34124b = view;
    }

    /* renamed from: r1 */
    public void mo43480r1(@mo1 int i) {
        this.f34136w = i;
    }

    /* renamed from: s1 */
    public void mo43481s1(int i) {
        this.f34117C = i;
    }

    /* renamed from: t1 */
    public void mo43482t1(@ts2 C6560e eVar) {
        this.f34121a = eVar;
    }

    /* renamed from: u0 */
    public void mo6950u0(@ts2 PathMotion pathMotion) {
        super.mo6950u0(pathMotion);
        this.f34131h = true;
    }

    /* renamed from: u1 */
    public void mo43483u1(int i) {
        this.f34118D = i;
    }

    /* renamed from: v1 */
    public void mo43484v1(boolean z) {
        this.f34130g = z;
    }

    /* renamed from: w1 */
    public void mo43485w1(@ts2 C6560e eVar) {
        this.f34127c = eVar;
    }

    /* renamed from: x1 */
    public void mo43486x1(@ts2 C6560e eVar) {
        this.f34125b = eVar;
    }

    /* renamed from: y1 */
    public void mo43487y1(@d10 int i) {
        this.f34115A = i;
    }

    /* renamed from: z1 */
    public void mo43488z1(@ts2 C6560e eVar) {
        this.f34128d = eVar;
    }
}
