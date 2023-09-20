package com.onedelhi.secure;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;

/* renamed from: com.onedelhi.secure.by */
public class C1824by extends ImageView {

    /* renamed from: a */
    public static final float f10010a = 0.0f;

    /* renamed from: b */
    public static final float f10011b = 1.75f;

    /* renamed from: c */
    public static final float f10012c = 3.5f;

    /* renamed from: o */
    public static final int f10013o = 503316480;

    /* renamed from: p */
    public static final int f10014p = 1023410176;

    /* renamed from: q */
    public static final int f10015q = 4;

    /* renamed from: a */
    public Animation.AnimationListener f10016a;

    /* renamed from: n */
    public int f10017n;

    /* renamed from: com.onedelhi.secure.by$a */
    public class C1825a extends OvalShape {

        /* renamed from: a */
        public Paint f10018a = new Paint();

        /* renamed from: a */
        public RadialGradient f10019a;

        public C1825a(int i) {
            C1824by.this.f10017n = i;
            mo13864a((int) rect().width());
        }

        /* renamed from: a */
        public final void mo13864a(int i) {
            float f = (float) (i / 2);
            RadialGradient radialGradient = new RadialGradient(f, f, (float) C1824by.this.f10017n, new int[]{C1824by.f10014p, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f10019a = radialGradient;
            this.f10018a.setShader(radialGradient);
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = C1824by.this.getWidth() / 2;
            float f = (float) width;
            float height = (float) (C1824by.this.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f10018a);
            canvas.drawCircle(f, height, (float) (width - C1824by.this.f10017n), paint);
        }

        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            mo13864a((int) f);
        }
    }

    public C1824by(Context context, int i) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f10017n = (int) (3.5f * f);
        if (mo13857a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            jt4.m18894N1(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C1825a(this.f10017n));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f10017n, (float) i3, (float) i2, f10013o);
            int i4 = this.f10017n;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        jt4.m18877I1(this, shapeDrawable);
    }

    /* renamed from: a */
    public final boolean mo13857a() {
        return true;
    }

    /* renamed from: b */
    public void mo13858b(Animation.AnimationListener animationListener) {
        this.f10016a = animationListener;
    }

    /* renamed from: c */
    public void mo13859c(int i) {
        setBackgroundColor(r70.m26353f(getContext(), i));
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f10016a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f10016a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!mo13857a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f10017n * 2), getMeasuredHeight() + (this.f10017n * 2));
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
