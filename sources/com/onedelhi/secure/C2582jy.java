package com.onedelhi.secure;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.onedelhi.secure.hl3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.onedelhi.secure.jy */
public class C2582jy extends Drawable implements Animatable {

    /* renamed from: a */
    public static final Interpolator f14611a = new LinearInterpolator();

    /* renamed from: a */
    public static final int[] f14612a = {-16777216};

    /* renamed from: b */
    public static final Interpolator f14613b = new b01();

    /* renamed from: c */
    public static final float f14614c = 11.0f;

    /* renamed from: d */
    public static final float f14615d = 3.0f;

    /* renamed from: e */
    public static final float f14616e = 7.5f;

    /* renamed from: f */
    public static final float f14617f = 2.5f;

    /* renamed from: g */
    public static final float f14618g = 0.75f;

    /* renamed from: h */
    public static final float f14619h = 0.5f;

    /* renamed from: i */
    public static final float f14620i = 216.0f;

    /* renamed from: j */
    public static final float f14621j = 0.8f;

    /* renamed from: k */
    public static final float f14622k = 0.01f;

    /* renamed from: l */
    public static final float f14623l = 0.20999998f;

    /* renamed from: n */
    public static final int f14624n = 0;

    /* renamed from: o */
    public static final int f14625o = 12;

    /* renamed from: p */
    public static final int f14626p = 6;

    /* renamed from: q */
    public static final int f14627q = 1;

    /* renamed from: r */
    public static final int f14628r = 10;

    /* renamed from: s */
    public static final int f14629s = 5;

    /* renamed from: t */
    public static final int f14630t = 1332;

    /* renamed from: a */
    public float f14631a;

    /* renamed from: a */
    public Animator f14632a;

    /* renamed from: a */
    public Resources f14633a;

    /* renamed from: a */
    public final C2586d f14634a;

    /* renamed from: b */
    public float f14635b;

    /* renamed from: b */
    public boolean f14636b;

    /* renamed from: com.onedelhi.secure.jy$a */
    public class C2583a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ C2586d f14637a;

        public C2583a(C2586d dVar) {
            this.f14637a = dVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C2582jy.this.mo18726H(floatValue, this.f14637a);
            C2582jy.this.mo18729e(floatValue, this.f14637a, false);
            C2582jy.this.invalidateSelf();
        }
    }

    /* renamed from: com.onedelhi.secure.jy$b */
    public class C2584b implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ C2586d f14639a;

        public C2584b(C2586d dVar) {
            this.f14639a = dVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
            C2582jy.this.mo18729e(1.0f, this.f14639a, true);
            this.f14639a.mo18775M();
            this.f14639a.mo18797v();
            C2582jy jyVar = C2582jy.this;
            if (jyVar.f14636b) {
                jyVar.f14636b = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                this.f14639a.mo18771I(false);
                return;
            }
            jyVar.f14635b += 1.0f;
        }

        public void onAnimationStart(Animator animator) {
            C2582jy.this.f14635b = 0.0f;
        }
    }

    @hl3({hl3.C2354a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.jy$c */
    public @interface C2585c {
    }

    /* renamed from: com.onedelhi.secure.jy$d */
    public static class C2586d {

        /* renamed from: a */
        public float f14641a;

        /* renamed from: a */
        public int f14642a;

        /* renamed from: a */
        public final Paint f14643a;

        /* renamed from: a */
        public Path f14644a;

        /* renamed from: a */
        public final RectF f14645a = new RectF();

        /* renamed from: a */
        public boolean f14646a;

        /* renamed from: a */
        public int[] f14647a;

        /* renamed from: b */
        public float f14648b;

        /* renamed from: b */
        public int f14649b;

        /* renamed from: b */
        public final Paint f14650b;

        /* renamed from: c */
        public float f14651c;

        /* renamed from: c */
        public int f14652c;

        /* renamed from: c */
        public final Paint f14653c;

        /* renamed from: d */
        public float f14654d;

        /* renamed from: d */
        public int f14655d;

        /* renamed from: e */
        public float f14656e;

        /* renamed from: e */
        public int f14657e;

        /* renamed from: f */
        public float f14658f;

        /* renamed from: g */
        public float f14659g;

        /* renamed from: h */
        public float f14660h;

        /* renamed from: i */
        public float f14661i;

        public C2586d() {
            Paint paint = new Paint();
            this.f14643a = paint;
            Paint paint2 = new Paint();
            this.f14650b = paint2;
            Paint paint3 = new Paint();
            this.f14653c = paint3;
            this.f14641a = 0.0f;
            this.f14648b = 0.0f;
            this.f14651c = 0.0f;
            this.f14654d = 5.0f;
            this.f14660h = 1.0f;
            this.f14655d = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* renamed from: A */
        public void mo18763A(int i) {
            this.f14653c.setColor(i);
        }

        /* renamed from: B */
        public void mo18764B(float f) {
            this.f14661i = f;
        }

        /* renamed from: C */
        public void mo18765C(int i) {
            this.f14657e = i;
        }

        /* renamed from: D */
        public void mo18766D(ColorFilter colorFilter) {
            this.f14643a.setColorFilter(colorFilter);
        }

        /* renamed from: E */
        public void mo18767E(int i) {
            this.f14642a = i;
            this.f14657e = this.f14647a[i];
        }

        /* renamed from: F */
        public void mo18768F(@mr2 int[] iArr) {
            this.f14647a = iArr;
            mo18767E(0);
        }

        /* renamed from: G */
        public void mo18769G(float f) {
            this.f14648b = f;
        }

        /* renamed from: H */
        public void mo18770H(float f) {
            this.f14651c = f;
        }

        /* renamed from: I */
        public void mo18771I(boolean z) {
            if (this.f14646a != z) {
                this.f14646a = z;
            }
        }

        /* renamed from: J */
        public void mo18772J(float f) {
            this.f14641a = f;
        }

        /* renamed from: K */
        public void mo18773K(Paint.Cap cap) {
            this.f14643a.setStrokeCap(cap);
        }

        /* renamed from: L */
        public void mo18774L(float f) {
            this.f14654d = f;
            this.f14643a.setStrokeWidth(f);
        }

        /* renamed from: M */
        public void mo18775M() {
            this.f14656e = this.f14641a;
            this.f14658f = this.f14648b;
            this.f14659g = this.f14651c;
        }

        /* renamed from: a */
        public void mo18776a(Canvas canvas, Rect rect) {
            RectF rectF = this.f14645a;
            float f = this.f14661i;
            float f2 = (this.f14654d / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f14649b) * this.f14660h) / 2.0f, this.f14654d / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f2, ((float) rect.centerY()) - f2, ((float) rect.centerX()) + f2, ((float) rect.centerY()) + f2);
            float f3 = this.f14641a;
            float f4 = this.f14651c;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f14648b + f4) * 360.0f) - f5;
            this.f14643a.setColor(this.f14657e);
            this.f14643a.setAlpha(this.f14655d);
            float f7 = this.f14654d / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f14653c);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f14643a);
            mo18777b(canvas, f5, f6, rectF);
        }

        /* renamed from: b */
        public void mo18777b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f14646a) {
                Path path = this.f14644a;
                if (path == null) {
                    Path path2 = new Path();
                    this.f14644a = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f14644a.moveTo(0.0f, 0.0f);
                this.f14644a.lineTo(((float) this.f14649b) * this.f14660h, 0.0f);
                Path path3 = this.f14644a;
                float f3 = this.f14660h;
                path3.lineTo((((float) this.f14649b) * f3) / 2.0f, ((float) this.f14652c) * f3);
                this.f14644a.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) this.f14649b) * this.f14660h) / 2.0f), rectF.centerY() + (this.f14654d / 2.0f));
                this.f14644a.close();
                this.f14650b.setColor(this.f14657e);
                this.f14650b.setAlpha(this.f14655d);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f14644a, this.f14650b);
                canvas.restore();
            }
        }

        /* renamed from: c */
        public int mo18778c() {
            return this.f14655d;
        }

        /* renamed from: d */
        public float mo18779d() {
            return (float) this.f14652c;
        }

        /* renamed from: e */
        public float mo18780e() {
            return this.f14660h;
        }

        /* renamed from: f */
        public float mo18781f() {
            return (float) this.f14649b;
        }

        /* renamed from: g */
        public int mo18782g() {
            return this.f14653c.getColor();
        }

        /* renamed from: h */
        public float mo18783h() {
            return this.f14661i;
        }

        /* renamed from: i */
        public int[] mo18784i() {
            return this.f14647a;
        }

        /* renamed from: j */
        public float mo18785j() {
            return this.f14648b;
        }

        /* renamed from: k */
        public int mo18786k() {
            return this.f14647a[mo18787l()];
        }

        /* renamed from: l */
        public int mo18787l() {
            return (this.f14642a + 1) % this.f14647a.length;
        }

        /* renamed from: m */
        public float mo18788m() {
            return this.f14651c;
        }

        /* renamed from: n */
        public boolean mo18789n() {
            return this.f14646a;
        }

        /* renamed from: o */
        public float mo18790o() {
            return this.f14641a;
        }

        /* renamed from: p */
        public int mo18791p() {
            return this.f14647a[this.f14642a];
        }

        /* renamed from: q */
        public float mo18792q() {
            return this.f14658f;
        }

        /* renamed from: r */
        public float mo18793r() {
            return this.f14659g;
        }

        /* renamed from: s */
        public float mo18794s() {
            return this.f14656e;
        }

        /* renamed from: t */
        public Paint.Cap mo18795t() {
            return this.f14643a.getStrokeCap();
        }

        /* renamed from: u */
        public float mo18796u() {
            return this.f14654d;
        }

        /* renamed from: v */
        public void mo18797v() {
            mo18767E(mo18787l());
        }

        /* renamed from: w */
        public void mo18798w() {
            this.f14656e = 0.0f;
            this.f14658f = 0.0f;
            this.f14659g = 0.0f;
            mo18772J(0.0f);
            mo18769G(0.0f);
            mo18770H(0.0f);
        }

        /* renamed from: x */
        public void mo18799x(int i) {
            this.f14655d = i;
        }

        /* renamed from: y */
        public void mo18800y(float f, float f2) {
            this.f14649b = (int) f;
            this.f14652c = (int) f2;
        }

        /* renamed from: z */
        public void mo18801z(float f) {
            if (f != this.f14660h) {
                this.f14660h = f;
            }
        }
    }

    public C2582jy(@mr2 Context context) {
        this.f14633a = ((Context) k43.m19455l(context)).getResources();
        C2586d dVar = new C2586d();
        this.f14634a = dVar;
        dVar.mo18768F(f14612a);
        mo18723E(2.5f);
        mo18725G();
    }

    /* renamed from: A */
    public final void mo18719A(float f) {
        this.f14631a = f;
    }

    /* renamed from: B */
    public final void mo18720B(float f, float f2, float f3, float f4) {
        C2586d dVar = this.f14634a;
        float f5 = this.f14633a.getDisplayMetrics().density;
        dVar.mo18774L(f2 * f5);
        dVar.mo18764B(f * f5);
        dVar.mo18767E(0);
        dVar.mo18800y(f3 * f5, f4 * f5);
    }

    /* renamed from: C */
    public void mo18721C(float f, float f2) {
        this.f14634a.mo18772J(f);
        this.f14634a.mo18769G(f2);
        invalidateSelf();
    }

    /* renamed from: D */
    public void mo18722D(@mr2 Paint.Cap cap) {
        this.f14634a.mo18773K(cap);
        invalidateSelf();
    }

    /* renamed from: E */
    public void mo18723E(float f) {
        this.f14634a.mo18774L(f);
        invalidateSelf();
    }

    /* renamed from: F */
    public void mo18724F(int i) {
        float f;
        float f2;
        float f3;
        float f4;
        if (i == 0) {
            f = 11.0f;
            f4 = 3.0f;
            f3 = 12.0f;
            f2 = 6.0f;
        } else {
            f = 7.5f;
            f4 = 2.5f;
            f3 = 10.0f;
            f2 = 5.0f;
        }
        mo18720B(f, f4, f3, f2);
        invalidateSelf();
    }

    /* renamed from: G */
    public final void mo18725G() {
        C2586d dVar = this.f14634a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C2583a(dVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f14611a);
        ofFloat.addListener(new C2584b(dVar));
        this.f14632a = ofFloat;
    }

    /* renamed from: H */
    public void mo18726H(float f, C2586d dVar) {
        dVar.mo18765C(f > 0.75f ? mo18730f((f - 0.75f) / 0.25f, dVar.mo18791p(), dVar.mo18786k()) : dVar.mo18791p());
    }

    /* renamed from: a */
    public final void mo18727a(float f, C2586d dVar) {
        mo18726H(f, dVar);
        dVar.mo18772J(dVar.mo18794s() + (((dVar.mo18792q() - 0.01f) - dVar.mo18794s()) * f));
        dVar.mo18769G(dVar.mo18792q());
        dVar.mo18770H(dVar.mo18793r() + ((((float) (Math.floor((double) (dVar.mo18793r() / 0.8f)) + 1.0d)) - dVar.mo18793r()) * f));
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f14631a, bounds.exactCenterX(), bounds.exactCenterY());
        this.f14634a.mo18776a(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public void mo18729e(float f, C2586d dVar, boolean z) {
        float f2;
        float f3;
        if (this.f14636b) {
            mo18727a(f, dVar);
        } else if (f != 1.0f || z) {
            float r = dVar.mo18793r();
            if (f < 0.5f) {
                f2 = dVar.mo18794s();
                f3 = (f14613b.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f2;
            } else {
                float s = dVar.mo18794s() + 0.79f;
                float f4 = s;
                f2 = s - (((1.0f - f14613b.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f3 = f4;
            }
            dVar.mo18772J(f2);
            dVar.mo18769G(f3);
            dVar.mo18770H(r + (0.20999998f * f));
            mo18719A((f + this.f14635b) * 216.0f);
        }
    }

    /* renamed from: f */
    public final int mo18730f(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & 255) - i6)))));
    }

    /* renamed from: g */
    public boolean mo18731g() {
        return this.f14634a.mo18789n();
    }

    public int getAlpha() {
        return this.f14634a.mo18778c();
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public float mo18734h() {
        return this.f14634a.mo18779d();
    }

    /* renamed from: i */
    public float mo18735i() {
        return this.f14634a.mo18780e();
    }

    public boolean isRunning() {
        return this.f14632a.isRunning();
    }

    /* renamed from: j */
    public float mo18737j() {
        return this.f14634a.mo18781f();
    }

    /* renamed from: k */
    public int mo18738k() {
        return this.f14634a.mo18782g();
    }

    /* renamed from: l */
    public float mo18739l() {
        return this.f14634a.mo18783h();
    }

    @mr2
    /* renamed from: m */
    public int[] mo18740m() {
        return this.f14634a.mo18784i();
    }

    /* renamed from: n */
    public float mo18741n() {
        return this.f14634a.mo18785j();
    }

    /* renamed from: o */
    public float mo18742o() {
        return this.f14634a.mo18788m();
    }

    /* renamed from: p */
    public final float mo18743p() {
        return this.f14631a;
    }

    /* renamed from: q */
    public float mo18744q() {
        return this.f14634a.mo18790o();
    }

    @mr2
    /* renamed from: r */
    public Paint.Cap mo18745r() {
        return this.f14634a.mo18795t();
    }

    /* renamed from: s */
    public float mo18746s() {
        return this.f14634a.mo18796u();
    }

    public void setAlpha(int i) {
        this.f14634a.mo18799x(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f14634a.mo18766D(colorFilter);
        invalidateSelf();
    }

    public void start() {
        long j;
        Animator animator;
        this.f14632a.cancel();
        this.f14634a.mo18775M();
        if (this.f14634a.mo18785j() != this.f14634a.mo18790o()) {
            this.f14636b = true;
            animator = this.f14632a;
            j = 666;
        } else {
            this.f14634a.mo18767E(0);
            this.f14634a.mo18798w();
            animator = this.f14632a;
            j = 1332;
        }
        animator.setDuration(j);
        this.f14632a.start();
    }

    public void stop() {
        this.f14632a.cancel();
        mo18719A(0.0f);
        this.f14634a.mo18771I(false);
        this.f14634a.mo18767E(0);
        this.f14634a.mo18798w();
        invalidateSelf();
    }

    /* renamed from: t */
    public void mo18751t(float f, float f2) {
        this.f14634a.mo18800y(f, f2);
        invalidateSelf();
    }

    /* renamed from: u */
    public void mo18752u(boolean z) {
        this.f14634a.mo18771I(z);
        invalidateSelf();
    }

    /* renamed from: v */
    public void mo18753v(float f) {
        this.f14634a.mo18801z(f);
        invalidateSelf();
    }

    /* renamed from: w */
    public void mo18754w(int i) {
        this.f14634a.mo18763A(i);
        invalidateSelf();
    }

    /* renamed from: x */
    public void mo18755x(float f) {
        this.f14634a.mo18764B(f);
        invalidateSelf();
    }

    /* renamed from: y */
    public void mo18756y(@mr2 int... iArr) {
        this.f14634a.mo18768F(iArr);
        this.f14634a.mo18767E(0);
        invalidateSelf();
    }

    /* renamed from: z */
    public void mo18757z(float f) {
        this.f14634a.mo18770H(f);
        invalidateSelf();
    }
}
