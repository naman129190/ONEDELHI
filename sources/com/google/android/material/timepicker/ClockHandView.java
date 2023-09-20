package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.onedelhi.secure.d81;
import com.onedelhi.secure.e83;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.zk0;
import java.util.ArrayList;
import java.util.List;

class ClockHandView extends View {

    /* renamed from: r */
    public static final int f24721r = 200;

    /* renamed from: a */
    public double f24722a;

    /* renamed from: a */
    public float f24723a;

    /* renamed from: a */
    public ValueAnimator f24724a;

    /* renamed from: a */
    public final Paint f24725a;

    /* renamed from: a */
    public final RectF f24726a;

    /* renamed from: a */
    public C4269c f24727a;

    /* renamed from: a */
    public final List<C4270d> f24728a;

    /* renamed from: b */
    public float f24729b;

    /* renamed from: b */
    public boolean f24730b;

    /* renamed from: c */
    public final float f24731c;

    /* renamed from: c */
    public boolean f24732c;

    /* renamed from: d */
    public float f24733d;

    /* renamed from: d */
    public boolean f24734d;

    /* renamed from: n */
    public int f24735n;

    /* renamed from: o */
    public final int f24736o;
    @e83

    /* renamed from: p */
    public final int f24737p;

    /* renamed from: q */
    public int f24738q;

    /* renamed from: com.google.android.material.timepicker.ClockHandView$a */
    public class C4267a implements ValueAnimator.AnimatorUpdateListener {
        public C4267a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.mo29519n(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$b */
    public class C4268b extends AnimatorListenerAdapter {
        public C4268b() {
        }

        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$c */
    public interface C4269c {
        /* renamed from: e */
        void mo29526e(@d81(from = 0.0d, mo14561to = 360.0d) float f, boolean z);
    }

    /* renamed from: com.google.android.material.timepicker.ClockHandView$d */
    public interface C4270d {
        /* renamed from: f */
        void mo29504f(@d81(from = 0.0d, mo14561to = 360.0d) float f, boolean z);
    }

    public ClockHandView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ClockHandView(Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.materialClockStyle);
    }

    public ClockHandView(Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24728a = new ArrayList();
        Paint paint = new Paint();
        this.f24725a = paint;
        this.f24726a = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fd3.C2165o.ClockHandView, i, fd3.C2164n.Widget_MaterialComponents_TimePicker_Clock);
        this.f24738q = obtainStyledAttributes.getDimensionPixelSize(fd3.C2165o.ClockHandView_materialCircleRadius, 0);
        this.f24736o = obtainStyledAttributes.getDimensionPixelSize(fd3.C2165o.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.f24737p = resources.getDimensionPixelSize(fd3.C2156f.material_clock_hand_stroke_width);
        this.f24731c = (float) resources.getDimensionPixelSize(fd3.C2156f.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(fd3.C2165o.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        mo29517l(0.0f);
        this.f24735n = ViewConfiguration.get(context).getScaledTouchSlop();
        jt4.m18906R1(this, 2);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public void mo29507b(C4270d dVar) {
        this.f24728a.add(dVar);
    }

    /* renamed from: c */
    public final void mo29508c(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = (float) width;
        float f2 = (float) height;
        this.f24725a.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) this.f24738q) * ((float) Math.cos(this.f24722a))) + f, (((float) this.f24738q) * ((float) Math.sin(this.f24722a))) + f2, (float) this.f24736o, this.f24725a);
        double sin = Math.sin(this.f24722a);
        double cos = Math.cos(this.f24722a);
        double d = (double) ((float) (this.f24738q - this.f24736o));
        float f3 = (float) (width + ((int) (cos * d)));
        float f4 = (float) (height + ((int) (d * sin)));
        this.f24725a.setStrokeWidth((float) this.f24737p);
        canvas.drawLine(f, f2, f3, f4, this.f24725a);
        canvas.drawCircle(f, f2, this.f24731c, this.f24725a);
    }

    /* renamed from: d */
    public RectF mo29509d() {
        return this.f24726a;
    }

    /* renamed from: e */
    public final int mo29510e(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (f2 - ((float) (getHeight() / 2))), (double) (f - ((float) (getWidth() / 2)))))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    @d81(from = 0.0d, mo14561to = 360.0d)
    /* renamed from: f */
    public float mo29511f() {
        return this.f24733d;
    }

    /* renamed from: g */
    public int mo29512g() {
        return this.f24736o;
    }

    /* renamed from: h */
    public final Pair<Float, Float> mo29513h(float f) {
        float f2 = mo29511f();
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(f2), Float.valueOf(f));
    }

    /* renamed from: i */
    public final boolean mo29514i(float f, float f2, boolean z, boolean z2, boolean z3) {
        float e = (float) mo29510e(f, f2);
        boolean z4 = false;
        boolean z5 = mo29511f() != e;
        if (z2 && z5) {
            return true;
        }
        if (!z5 && !z) {
            return false;
        }
        if (z3 && this.f24730b) {
            z4 = true;
        }
        mo29518m(e, z4);
        return true;
    }

    /* renamed from: j */
    public void mo29515j(boolean z) {
        this.f24730b = z;
    }

    /* renamed from: k */
    public void mo29516k(@zk0 int i) {
        this.f24738q = i;
        invalidate();
    }

    /* renamed from: l */
    public void mo29517l(@d81(from = 0.0d, mo14561to = 360.0d) float f) {
        mo29518m(f, false);
    }

    /* renamed from: m */
    public void mo29518m(@d81(from = 0.0d, mo14561to = 360.0d) float f, boolean z) {
        ValueAnimator valueAnimator = this.f24724a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            mo29519n(f, false);
            return;
        }
        Pair<Float, Float> h = mo29513h(f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{((Float) h.first).floatValue(), ((Float) h.second).floatValue()});
        this.f24724a = ofFloat;
        ofFloat.setDuration(200);
        this.f24724a.addUpdateListener(new C4267a());
        this.f24724a.addListener(new C4268b());
        this.f24724a.start();
    }

    /* renamed from: n */
    public final void mo29519n(@d81(from = 0.0d, mo14561to = 360.0d) float f, boolean z) {
        float f2 = f % 360.0f;
        this.f24733d = f2;
        this.f24722a = Math.toRadians((double) (f2 - 90.0f));
        float width = ((float) (getWidth() / 2)) + (((float) this.f24738q) * ((float) Math.cos(this.f24722a)));
        float height = ((float) (getHeight() / 2)) + (((float) this.f24738q) * ((float) Math.sin(this.f24722a)));
        RectF rectF = this.f24726a;
        int i = this.f24736o;
        rectF.set(width - ((float) i), height - ((float) i), width + ((float) i), height + ((float) i));
        for (C4270d f3 : this.f24728a) {
            f3.mo29504f(f2, z);
        }
        invalidate();
    }

    /* renamed from: o */
    public void mo29520o(C4269c cVar) {
        this.f24727a = cVar;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mo29508c(canvas);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo29517l(mo29511f());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        C4269c cVar;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i = (int) (x - this.f24723a);
                int i2 = (int) (y - this.f24729b);
                this.f24732c = (i * i) + (i2 * i2) > this.f24735n;
                boolean z4 = this.f24734d;
                z3 = actionMasked == 1;
                z2 = z4;
            } else {
                z3 = false;
                z2 = false;
            }
            z = false;
        } else {
            this.f24723a = x;
            this.f24729b = y;
            this.f24732c = true;
            this.f24734d = false;
            z3 = false;
            z2 = false;
            z = true;
        }
        boolean i3 = mo29514i(x, y, z2, z, z3) | this.f24734d;
        this.f24734d = i3;
        if (i3 && z3 && (cVar = this.f24727a) != null) {
            cVar.mo29526e((float) mo29510e(x, y), this.f24732c);
        }
        return true;
    }
}
