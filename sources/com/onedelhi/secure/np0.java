package com.onedelhi.secure;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.onedelhi.secure.hl3;
import com.onedelhi.secure.za3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class np0 extends Drawable {

    /* renamed from: c */
    public static final int f17509c = 0;

    /* renamed from: d */
    public static final int f17510d = 1;

    /* renamed from: e */
    public static final int f17511e = 2;

    /* renamed from: f */
    public static final int f17512f = 3;

    /* renamed from: g */
    public static final float f17513g = ((float) Math.toRadians(45.0d));

    /* renamed from: a */
    public float f17514a;

    /* renamed from: a */
    public final int f17515a;

    /* renamed from: a */
    public final Paint f17516a;

    /* renamed from: a */
    public final Path f17517a = new Path();

    /* renamed from: a */
    public boolean f17518a;

    /* renamed from: b */
    public float f17519b;

    /* renamed from: b */
    public int f17520b = 2;

    /* renamed from: b */
    public boolean f17521b = false;

    /* renamed from: c */
    public float f17522c;

    /* renamed from: d */
    public float f17523d;

    /* renamed from: e */
    public float f17524e;

    /* renamed from: f */
    public float f17525f;

    @hl3({hl3.C2354a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.onedelhi.secure.np0$a */
    public @interface C2994a {
    }

    public np0(Context context) {
        Paint paint = new Paint();
        this.f17516a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, za3.C4068m.DrawerArrowToggle, za3.C4057b.drawerArrowStyle, za3.C4067l.Base_Widget_AppCompat_DrawerArrowToggle);
        mo21408p(obtainStyledAttributes.getColor(za3.C4068m.DrawerArrowToggle_color, 0));
        mo21407o(obtainStyledAttributes.getDimension(za3.C4068m.DrawerArrowToggle_thickness, 0.0f));
        mo21414t(obtainStyledAttributes.getBoolean(za3.C4068m.DrawerArrowToggle_spinBars, true));
        mo21410r((float) Math.round(obtainStyledAttributes.getDimension(za3.C4068m.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f17515a = obtainStyledAttributes.getDimensionPixelSize(za3.C4068m.DrawerArrowToggle_drawableSize, 0);
        this.f17519b = (float) Math.round(obtainStyledAttributes.getDimension(za3.C4068m.DrawerArrowToggle_barLength, 0.0f));
        this.f17514a = (float) Math.round(obtainStyledAttributes.getDimension(za3.C4068m.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f17522c = obtainStyledAttributes.getDimension(za3.C4068m.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: k */
    public static float m23082k(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: a */
    public float mo21390a() {
        return this.f17514a;
    }

    /* renamed from: b */
    public float mo21391b() {
        return this.f17522c;
    }

    /* renamed from: c */
    public float mo21392c() {
        return this.f17519b;
    }

    /* renamed from: d */
    public float mo21393d() {
        return this.f17516a.getStrokeWidth();
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int i = this.f17520b;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? wo0.m30977f(this) == 0 : wo0.m30977f(this) == 1))) {
            z = true;
        }
        float f = this.f17514a;
        float k = m23082k(this.f17519b, (float) Math.sqrt((double) (f * f * 2.0f)), this.f17524e);
        float k2 = m23082k(this.f17519b, this.f17522c, this.f17524e);
        float round = (float) Math.round(m23082k(0.0f, this.f17525f, this.f17524e));
        float k3 = m23082k(0.0f, f17513g, this.f17524e);
        double d = (double) k;
        float k4 = m23082k(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f17524e);
        double d2 = (double) k3;
        boolean z2 = z;
        float round2 = (float) Math.round(Math.cos(d2) * d);
        float round3 = (float) Math.round(d * Math.sin(d2));
        this.f17517a.rewind();
        float k5 = m23082k(this.f17523d + this.f17516a.getStrokeWidth(), -this.f17525f, this.f17524e);
        float f2 = (-k2) / 2.0f;
        this.f17517a.moveTo(f2 + round, 0.0f);
        this.f17517a.rLineTo(k2 - (round * 2.0f), 0.0f);
        this.f17517a.moveTo(f2, k5);
        this.f17517a.rLineTo(round2, round3);
        this.f17517a.moveTo(f2, -k5);
        this.f17517a.rLineTo(round2, -round3);
        this.f17517a.close();
        canvas.save();
        float strokeWidth = this.f17516a.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * strokeWidth);
        float f3 = this.f17523d;
        canvas2.translate((float) bounds.centerX(), ((float) ((((int) (height - (2.0f * f3))) / 4) * 2)) + (strokeWidth * 1.5f) + f3);
        if (this.f17518a) {
            canvas2.rotate(k4 * ((float) (this.f17521b ^ z2 ? -1 : 1)));
        } else if (z2) {
            canvas2.rotate(180.0f);
        }
        canvas2.drawPath(this.f17517a, this.f17516a);
        canvas.restore();
    }

    @d10
    /* renamed from: e */
    public int mo21395e() {
        return this.f17516a.getColor();
    }

    /* renamed from: f */
    public int mo21396f() {
        return this.f17520b;
    }

    /* renamed from: g */
    public float mo21397g() {
        return this.f17523d;
    }

    public int getIntrinsicHeight() {
        return this.f17515a;
    }

    public int getIntrinsicWidth() {
        return this.f17515a;
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public final Paint mo21401h() {
        return this.f17516a;
    }

    @d81(from = 0.0d, mo14561to = 1.0d)
    /* renamed from: i */
    public float mo21402i() {
        return this.f17524e;
    }

    /* renamed from: j */
    public boolean mo21403j() {
        return this.f17518a;
    }

    /* renamed from: l */
    public void mo21404l(float f) {
        if (this.f17514a != f) {
            this.f17514a = f;
            invalidateSelf();
        }
    }

    /* renamed from: m */
    public void mo21405m(float f) {
        if (this.f17522c != f) {
            this.f17522c = f;
            invalidateSelf();
        }
    }

    /* renamed from: n */
    public void mo21406n(float f) {
        if (this.f17519b != f) {
            this.f17519b = f;
            invalidateSelf();
        }
    }

    /* renamed from: o */
    public void mo21407o(float f) {
        if (this.f17516a.getStrokeWidth() != f) {
            this.f17516a.setStrokeWidth(f);
            this.f17525f = (float) (((double) (f / 2.0f)) * Math.cos((double) f17513g));
            invalidateSelf();
        }
    }

    /* renamed from: p */
    public void mo21408p(@d10 int i) {
        if (i != this.f17516a.getColor()) {
            this.f17516a.setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: q */
    public void mo21409q(int i) {
        if (i != this.f17520b) {
            this.f17520b = i;
            invalidateSelf();
        }
    }

    /* renamed from: r */
    public void mo21410r(float f) {
        if (f != this.f17523d) {
            this.f17523d = f;
            invalidateSelf();
        }
    }

    /* renamed from: s */
    public void mo21411s(@d81(from = 0.0d, mo14561to = 1.0d) float f) {
        if (this.f17524e != f) {
            this.f17524e = f;
            invalidateSelf();
        }
    }

    public void setAlpha(int i) {
        if (i != this.f17516a.getAlpha()) {
            this.f17516a.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f17516a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* renamed from: t */
    public void mo21414t(boolean z) {
        if (this.f17518a != z) {
            this.f17518a = z;
            invalidateSelf();
        }
    }

    /* renamed from: u */
    public void mo21415u(boolean z) {
        if (this.f17521b != z) {
            this.f17521b = z;
            invalidateSelf();
        }
    }
}
