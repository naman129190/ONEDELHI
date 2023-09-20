package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import com.google.android.material.slider.BaseSlider;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C1947d7;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.C6582qj;
import com.onedelhi.secure.C6703rj;
import com.onedelhi.secure.a12;
import com.onedelhi.secure.af2;
import com.onedelhi.secure.bf2;
import com.onedelhi.secure.bk0;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.dp0;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.hf2;
import com.onedelhi.secure.hw4;
import com.onedelhi.secure.js1;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.k10;
import com.onedelhi.secure.kp0;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ob4;
import com.onedelhi.secure.pu4;
import com.onedelhi.secure.pv4;
import com.onedelhi.secure.py0;
import com.onedelhi.secure.rf2;
import com.onedelhi.secure.sf4;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.uw3;
import com.onedelhi.secure.vf4;
import com.onedelhi.secure.wo0;
import com.onedelhi.secure.yk0;
import com.onedelhi.secure.zk0;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends C6582qj<S>, T extends C6703rj<S>> extends View {

    /* renamed from: D */
    public static final int f24233D = 200;

    /* renamed from: E */
    public static final int f24234E = 63;

    /* renamed from: F */
    public static final int f24235F = fd3.C2164n.Widget_MaterialComponents_Slider;

    /* renamed from: G */
    public static final int f24236G = 1;

    /* renamed from: H */
    public static final int f24237H = 0;

    /* renamed from: a */
    public static final double f24238a = 1.0E-4d;

    /* renamed from: b */
    public static final long f24239b = 83;

    /* renamed from: b */
    public static final String f24240b = BaseSlider.class.getSimpleName();

    /* renamed from: c */
    public static final long f24241c = 117;

    /* renamed from: c */
    public static final String f24242c = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";

    /* renamed from: d */
    public static final String f24243d = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";

    /* renamed from: e */
    public static final String f24244e = "valueFrom(%s) must be smaller than valueTo(%s)";

    /* renamed from: f */
    public static final String f24245f = "valueTo(%s) must be greater than valueFrom(%s)";

    /* renamed from: g */
    public static final String f24246g = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";

    /* renamed from: h */
    public static final String f24247h = "minSeparation(%s) must be greater or equal to 0";

    /* renamed from: i */
    public static final String f24248i = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)";

    /* renamed from: j */
    public static final String f24249j = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)";

    /* renamed from: k */
    public static final String f24250k = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";

    /* renamed from: A */
    public int f24251A;

    /* renamed from: B */
    public int f24252B;

    /* renamed from: C */
    public int f24253C;

    /* renamed from: a */
    public float f24254a;

    /* renamed from: a */
    public ValueAnimator f24255a;
    @mr2

    /* renamed from: a */
    public ColorStateList f24256a;
    @mr2

    /* renamed from: a */
    public final Paint f24257a;
    @ts2

    /* renamed from: a */
    public Drawable f24258a;

    /* renamed from: a */
    public MotionEvent f24259a;

    /* renamed from: a */
    public final AccessibilityManager f24260a;

    /* renamed from: a */
    public BaseSlider<S, L, T>.d f24261a;
    @mr2

    /* renamed from: a */
    public final C4182e f24262a;
    @mr2

    /* renamed from: a */
    public final C4185g f24263a;

    /* renamed from: a */
    public a12 f24264a;
    @mr2

    /* renamed from: a */
    public final bf2 f24265a;

    /* renamed from: a */
    public ArrayList<Float> f24266a;
    @mr2

    /* renamed from: a */
    public final List<sf4> f24267a;

    /* renamed from: a */
    public float[] f24268a;

    /* renamed from: b */
    public float f24269b;

    /* renamed from: b */
    public ValueAnimator f24270b;
    @mr2

    /* renamed from: b */
    public ColorStateList f24271b;
    @mr2

    /* renamed from: b */
    public final Paint f24272b;
    @mr2

    /* renamed from: b */
    public final List<L> f24273b;

    /* renamed from: b */
    public boolean f24274b;

    /* renamed from: c */
    public float f24275c;
    @mr2

    /* renamed from: c */
    public ColorStateList f24276c;
    @mr2

    /* renamed from: c */
    public final Paint f24277c;
    @mr2

    /* renamed from: c */
    public final List<T> f24278c;

    /* renamed from: c */
    public boolean f24279c;

    /* renamed from: d */
    public float f24280d;
    @mr2

    /* renamed from: d */
    public ColorStateList f24281d;
    @mr2

    /* renamed from: d */
    public final Paint f24282d;
    @mr2

    /* renamed from: d */
    public List<Drawable> f24283d;

    /* renamed from: d */
    public boolean f24284d;

    /* renamed from: e */
    public float f24285e;
    @mr2

    /* renamed from: e */
    public ColorStateList f24286e;
    @mr2

    /* renamed from: e */
    public final Paint f24287e;

    /* renamed from: e */
    public boolean f24288e;
    @mr2

    /* renamed from: f */
    public final Paint f24289f;

    /* renamed from: f */
    public boolean f24290f;

    /* renamed from: g */
    public boolean f24291g;

    /* renamed from: n */
    public final int f24292n;

    /* renamed from: o */
    public int f24293o;

    /* renamed from: p */
    public int f24294p;

    /* renamed from: q */
    public int f24295q;

    /* renamed from: r */
    public int f24296r;

    /* renamed from: s */
    public int f24297s;

    /* renamed from: t */
    public int f24298t;

    /* renamed from: u */
    public int f24299u;

    /* renamed from: v */
    public int f24300v;

    /* renamed from: w */
    public int f24301w;

    /* renamed from: x */
    public int f24302x;

    /* renamed from: y */
    public int f24303y;

    /* renamed from: z */
    public int f24304z;

    /* renamed from: com.google.android.material.slider.BaseSlider$a */
    public class C4178a implements C4185g {

        /* renamed from: a */
        public final /* synthetic */ int f24305a;

        /* renamed from: a */
        public final /* synthetic */ AttributeSet f24306a;

        public C4178a(AttributeSet attributeSet, int i) {
            this.f24306a = attributeSet;
            this.f24305a = i;
        }

        /* renamed from: a */
        public sf4 mo28767a() {
            TypedArray k = ob4.m59195k(BaseSlider.this.getContext(), this.f24306a, fd3.C2165o.Slider, this.f24305a, BaseSlider.f24235F, new int[0]);
            sf4 a = BaseSlider.m33751f0(BaseSlider.this.getContext(), k);
            k.recycle();
            return a;
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$b */
    public class C4179b implements ValueAnimator.AnimatorUpdateListener {
        public C4179b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (sf4 l1 : BaseSlider.this.f24267a) {
                l1.mo44337l1(floatValue);
            }
            jt4.m18985n1(BaseSlider.this);
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$c */
    public class C4180c extends AnimatorListenerAdapter {
        public C4180c() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            pu4 h = pv4.m61668h(BaseSlider.this);
            for (sf4 c : BaseSlider.this.f24267a) {
                h.mo40793c(c);
            }
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$d */
    public class C4181d implements Runnable {

        /* renamed from: n */
        public int f24311n;

        public C4181d() {
            this.f24311n = -1;
        }

        public /* synthetic */ C4181d(BaseSlider baseSlider, C4178a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo28770a(int i) {
            this.f24311n = i;
        }

        public void run() {
            BaseSlider.this.f24262a.mo22745Y(this.f24311n, 4);
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$e */
    public static class C4182e extends py0 {

        /* renamed from: a */
        public final BaseSlider<?, ?, ?> f24312a;

        /* renamed from: e */
        public final Rect f24313e = new Rect();

        public C4182e(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f24312a = baseSlider;
        }

        /* renamed from: C */
        public int mo11713C(float f, float f2) {
            for (int i = 0; i < this.f24312a.getValues().size(); i++) {
                this.f24312a.mo28756u0(i, this.f24313e);
                if (this.f24313e.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: D */
        public void mo11714D(List<Integer> list) {
            for (int i = 0; i < this.f24312a.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
            if (com.google.android.material.slider.BaseSlider.m33749e(r4.f24312a, r5, r7.getFloat(com.onedelhi.secure.C1638a2.f8611t)) != false) goto L_0x0030;
         */
        /* renamed from: N */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo11715N(int r5, int r6, android.os.Bundle r7) {
            /*
                r4 = this;
                com.google.android.material.slider.BaseSlider<?, ?, ?> r0 = r4.f24312a
                boolean r0 = r0.isEnabled()
                r1 = 0
                if (r0 != 0) goto L_0x000a
                return r1
            L_0x000a:
                r0 = 4096(0x1000, float:5.74E-42)
                r2 = 1
                r3 = 8192(0x2000, float:1.14794E-41)
                if (r6 == r0) goto L_0x003f
                if (r6 == r3) goto L_0x003f
                r0 = 16908349(0x102003d, float:2.38774E-38)
                if (r6 == r0) goto L_0x0019
                return r1
            L_0x0019:
                if (r7 == 0) goto L_0x003e
                java.lang.String r6 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
                boolean r0 = r7.containsKey(r6)
                if (r0 != 0) goto L_0x0024
                goto L_0x003e
            L_0x0024:
                float r6 = r7.getFloat(r6)
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r4.f24312a
                boolean r6 = r7.mo28717s0(r5, r6)
                if (r6 == 0) goto L_0x003e
            L_0x0030:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.f24312a
                r6.mo28758v0()
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.f24312a
                r6.postInvalidate()
                r4.mo22732G(r5)
                return r2
            L_0x003e:
                return r1
            L_0x003f:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r4.f24312a
                r0 = 20
                float r7 = r7.mo28694n(r0)
                if (r6 != r3) goto L_0x004a
                float r7 = -r7
            L_0x004a:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.f24312a
                boolean r6 = r6.mo28639R()
                if (r6 == 0) goto L_0x0053
                float r7 = -r7
            L_0x0053:
                com.google.android.material.slider.BaseSlider<?, ?, ?> r6 = r4.f24312a
                java.util.List r6 = r6.getValues()
                java.lang.Object r6 = r6.get(r5)
                java.lang.Float r6 = (java.lang.Float) r6
                float r6 = r6.floatValue()
                float r6 = r6 + r7
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r4.f24312a
                float r7 = r7.getValueFrom()
                com.google.android.material.slider.BaseSlider<?, ?, ?> r0 = r4.f24312a
                float r0 = r0.getValueTo()
                float r6 = com.onedelhi.secure.rf2.m26698d(r6, r7, r0)
                com.google.android.material.slider.BaseSlider<?, ?, ?> r7 = r4.f24312a
                boolean r6 = r7.mo28717s0(r5, r6)
                if (r6 == 0) goto L_0x007d
                goto L_0x0030
            L_0x007d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.C4182e.mo11715N(int, int, android.os.Bundle):boolean");
        }

        /* renamed from: R */
        public void mo11717R(int i, C1638a2 a2Var) {
            a2Var.mo12559b(C1638a2.C1639a.f8631H);
            List<Float> values = this.f24312a.getValues();
            float floatValue = values.get(i).floatValue();
            float valueFrom = this.f24312a.getValueFrom();
            float valueTo = this.f24312a.getValueTo();
            if (this.f24312a.isEnabled()) {
                if (floatValue > valueFrom) {
                    a2Var.mo12556a(8192);
                }
                if (floatValue < valueTo) {
                    a2Var.mo12556a(4096);
                }
            }
            a2Var.mo12492C1(C1638a2.C1642d.m10716e(1, valueFrom, valueTo, floatValue));
            a2Var.mo12548W0(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.f24312a.getContentDescription() != null) {
                sb.append(this.f24312a.getContentDescription());
                sb.append(vf4.f36537c);
            }
            if (values.size() > 1) {
                sb.append(mo28772a0(i));
                sb.append(this.f24312a.mo28626F(floatValue));
            }
            a2Var.mo12558a1(sb.toString());
            this.f24312a.mo28756u0(i, this.f24313e);
            a2Var.mo12533R0(this.f24313e);
        }

        @mr2
        /* renamed from: a0 */
        public final String mo28772a0(int i) {
            Context context;
            int i2;
            if (i == this.f24312a.getValues().size() - 1) {
                context = this.f24312a.getContext();
                i2 = fd3.C2163m.material_slider_range_end;
            } else if (i != 0) {
                return "";
            } else {
                context = this.f24312a.getContext();
                i2 = fd3.C2163m.material_slider_range_start;
            }
            return context.getString(i2);
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$f */
    public static class C4183f extends View.BaseSavedState {
        public static final Parcelable.Creator<C4183f> CREATOR = new C4184a();

        /* renamed from: a */
        public float f24314a;

        /* renamed from: a */
        public ArrayList<Float> f24315a;

        /* renamed from: b */
        public float f24316b;

        /* renamed from: b */
        public boolean f24317b;

        /* renamed from: c */
        public float f24318c;

        /* renamed from: com.google.android.material.slider.BaseSlider$f$a */
        public class C4184a implements Parcelable.Creator<C4183f> {
            @mr2
            /* renamed from: a */
            public C4183f createFromParcel(@mr2 Parcel parcel) {
                return new C4183f(parcel, (C4178a) null);
            }

            @mr2
            /* renamed from: b */
            public C4183f[] newArray(int i) {
                return new C4183f[i];
            }
        }

        public C4183f(@mr2 Parcel parcel) {
            super(parcel);
            this.f24314a = parcel.readFloat();
            this.f24316b = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f24315a = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f24318c = parcel.readFloat();
            this.f24317b = parcel.createBooleanArray()[0];
        }

        public /* synthetic */ C4183f(Parcel parcel, C4178a aVar) {
            this(parcel);
        }

        public C4183f(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(@mr2 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f24314a);
            parcel.writeFloat(this.f24316b);
            parcel.writeList(this.f24315a);
            parcel.writeFloat(this.f24318c);
            parcel.writeBooleanArray(new boolean[]{this.f24317b});
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$g */
    public interface C4185g {
        /* renamed from: a */
        sf4 mo28767a();
    }

    public BaseSlider(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public BaseSlider(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.sliderStyle);
    }

    public BaseSlider(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(hf2.m50488c(context, attributeSet, i, f24235F), attributeSet, i);
        this.f24267a = new ArrayList();
        this.f24273b = new ArrayList();
        this.f24278c = new ArrayList();
        this.f24274b = false;
        this.f24279c = false;
        this.f24266a = new ArrayList<>();
        this.f24304z = -1;
        this.f24251A = -1;
        this.f24280d = 0.0f;
        this.f24284d = true;
        this.f24290f = false;
        bf2 bf2 = new bf2();
        this.f24265a = bf2;
        this.f24283d = Collections.emptyList();
        this.f24253C = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f24257a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f24272b = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.f24277c = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f24282d = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.f24287e = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.f24289f = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        mo28641T(context2.getResources());
        this.f24263a = new C4178a(attributeSet, i);
        mo28685i0(context2, attributeSet, i);
        setFocusable(true);
        setClickable(true);
        bf2.mo31645x0(2);
        this.f24292n = ViewConfiguration.get(context2).getScaledTouchSlop();
        C4182e eVar = new C4182e(this);
        this.f24262a = eVar;
        jt4.m18849B1(this, eVar);
        this.f24260a = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    /* renamed from: H */
    public static float m33744H(ValueAnimator valueAnimator, float f) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return floatValue;
    }

    @mr2
    /* renamed from: f0 */
    public static sf4 m33751f0(@mr2 Context context, @mr2 TypedArray typedArray) {
        return sf4.m64532V0(context, (AttributeSet) null, 0, typedArray.getResourceId(fd3.C2165o.Slider_labelStyle, fd3.C2164n.Widget_MaterialComponents_Tooltip));
    }

    /* renamed from: h0 */
    public static int m33753h0(float[] fArr, float f) {
        return Math.round(f * ((float) ((fArr.length / 2) - 1)));
    }

    /* renamed from: A */
    public final void mo28616A(@mr2 Canvas canvas, int i, int i2) {
        for (int i3 = 0; i3 < this.f24266a.size(); i3++) {
            float floatValue = this.f24266a.get(i3).floatValue();
            Drawable drawable = this.f24258a;
            if (drawable == null) {
                if (i3 < this.f24283d.size()) {
                    drawable = this.f24283d.get(i3);
                } else {
                    if (!isEnabled()) {
                        canvas.drawCircle(((float) this.f24300v) + (mo28649b0(floatValue) * ((float) i)), (float) i2, (float) this.f24301w, this.f24277c);
                    }
                    drawable = this.f24265a;
                }
            }
            mo28765z(canvas, i, i2, floatValue, drawable);
        }
    }

    /* renamed from: A0 */
    public final void mo28617A0() {
        if (this.f24280d > 0.0f && !mo28625E0(this.f24275c)) {
            throw new IllegalStateException(String.format(f24246g, new Object[]{Float.valueOf(this.f24280d), Float.valueOf(this.f24269b), Float.valueOf(this.f24275c)}));
        }
    }

    /* renamed from: B */
    public final void mo28618B() {
        if (this.f24298t != 2) {
            if (!this.f24274b) {
                this.f24274b = true;
                ValueAnimator r = mo28714r(true);
                this.f24255a = r;
                this.f24270b = null;
                r.start();
            }
            Iterator<sf4> it = this.f24267a.iterator();
            for (int i = 0; i < this.f24266a.size() && it.hasNext(); i++) {
                if (i != this.f24251A) {
                    mo28693m0(it.next(), this.f24266a.get(i).floatValue());
                }
            }
            if (it.hasNext()) {
                mo28693m0(it.next(), this.f24266a.get(this.f24251A).floatValue());
            } else {
                throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", new Object[]{Integer.valueOf(this.f24267a.size()), Integer.valueOf(this.f24266a.size())}));
            }
        }
    }

    /* renamed from: B0 */
    public final void mo28619B0() {
        if (this.f24269b >= this.f24275c) {
            throw new IllegalStateException(String.format(f24244e, new Object[]{Float.valueOf(this.f24269b), Float.valueOf(this.f24275c)}));
        }
    }

    /* renamed from: C */
    public final void mo28620C() {
        if (this.f24274b) {
            this.f24274b = false;
            ValueAnimator r = mo28714r(false);
            this.f24270b = r;
            this.f24255a = null;
            r.addListener(new C4180c());
            this.f24270b.start();
        }
    }

    /* renamed from: C0 */
    public final void mo28621C0() {
        if (this.f24275c <= this.f24269b) {
            throw new IllegalStateException(String.format(f24245f, new Object[]{Float.valueOf(this.f24275c), Float.valueOf(this.f24269b)}));
        }
    }

    /* renamed from: D */
    public final void mo28622D(int i) {
        if (i == 1) {
            mo28647Z(Integer.MAX_VALUE);
        } else if (i == 2) {
            mo28647Z(Integer.MIN_VALUE);
        } else if (i == 17) {
            mo28648a0(Integer.MAX_VALUE);
        } else if (i == 66) {
            mo28648a0(Integer.MIN_VALUE);
        }
    }

    /* renamed from: D0 */
    public final void mo28623D0() {
        Iterator<Float> it = this.f24266a.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() < this.f24269b || next.floatValue() > this.f24275c) {
                throw new IllegalStateException(String.format(f24242c, new Object[]{next, Float.valueOf(this.f24269b), Float.valueOf(this.f24275c)}));
            } else if (this.f24280d > 0.0f && !mo28625E0(next.floatValue())) {
                throw new IllegalStateException(String.format(f24243d, new Object[]{next, Float.valueOf(this.f24269b), Float.valueOf(this.f24280d), Float.valueOf(this.f24280d)}));
            }
        }
    }

    @hw4
    /* renamed from: E */
    public void mo28624E(boolean z) {
        this.f24288e = z;
    }

    /* renamed from: E0 */
    public final boolean mo28625E0(float f) {
        return mo28638Q(f - this.f24269b);
    }

    /* renamed from: F */
    public final String mo28626F(float f) {
        if (mo28634M()) {
            return this.f24264a.mo30411a(f);
        }
        return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", new Object[]{Float.valueOf(f)});
    }

    /* renamed from: F0 */
    public final float mo28627F0(float f) {
        return (mo28649b0(f) * ((float) this.f24252B)) + ((float) this.f24300v);
    }

    /* renamed from: G */
    public final float[] mo28628G() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f24266a.size() == 1) {
            floatValue2 = this.f24269b;
        }
        float b0 = mo28649b0(floatValue2);
        float b02 = mo28649b0(floatValue);
        if (mo28639R()) {
            return new float[]{b02, b0};
        }
        return new float[]{b0, b02};
    }

    /* renamed from: G0 */
    public final void mo28629G0() {
        float f = this.f24280d;
        if (f != 0.0f) {
            if (((float) ((int) f)) != f) {
                Log.w(f24240b, String.format(f24250k, new Object[]{"stepSize", Float.valueOf(f)}));
            }
            float f2 = this.f24269b;
            if (((float) ((int) f2)) != f2) {
                Log.w(f24240b, String.format(f24250k, new Object[]{"valueFrom", Float.valueOf(f2)}));
            }
            float f3 = this.f24275c;
            if (((float) ((int) f3)) != f3) {
                Log.w(f24240b, String.format(f24250k, new Object[]{"valueTo", Float.valueOf(f3)}));
            }
        }
    }

    /* renamed from: I */
    public final float mo28630I(int i, float f) {
        float minSeparation = getMinSeparation();
        if (this.f24253C == 0) {
            minSeparation = mo28755u(minSeparation);
        }
        if (mo28639R()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        return rf2.m26698d(f, i3 < 0 ? this.f24269b : this.f24266a.get(i3).floatValue() + minSeparation, i2 >= this.f24266a.size() ? this.f24275c : this.f24266a.get(i2).floatValue() - minSeparation);
    }

    @d10
    /* renamed from: J */
    public final int mo28631J(@mr2 ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* renamed from: K */
    public final float mo28632K() {
        double r0 = mo28715r0(this.f24285e);
        if (mo28639R()) {
            r0 = 1.0d - r0;
        }
        float f = this.f24275c;
        float f2 = this.f24269b;
        return (float) ((r0 * ((double) (f - f2))) + ((double) f2));
    }

    /* renamed from: L */
    public final float mo28633L() {
        float f = this.f24285e;
        if (mo28639R()) {
            f = 1.0f - f;
        }
        float f2 = this.f24275c;
        float f3 = this.f24269b;
        return (f * (f2 - f3)) + f3;
    }

    /* renamed from: M */
    public boolean mo28634M() {
        return this.f24264a != null;
    }

    /* renamed from: N */
    public final Drawable mo28635N(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        mo28686j(newDrawable);
        return newDrawable;
    }

    /* renamed from: O */
    public final void mo28636O() {
        this.f24257a.setStrokeWidth((float) this.f24299u);
        this.f24272b.setStrokeWidth((float) this.f24299u);
        this.f24287e.setStrokeWidth(((float) this.f24299u) / 2.0f);
        this.f24289f.setStrokeWidth(((float) this.f24299u) / 2.0f);
    }

    /* renamed from: P */
    public final boolean mo28637P() {
        ViewParent parent = getParent();
        while (true) {
            boolean z = false;
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) {
                z = true;
            }
            if (z && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
    }

    /* renamed from: Q */
    public final boolean mo28638Q(float f) {
        double doubleValue = new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(this.f24280d)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(doubleValue)) - doubleValue) < 1.0E-4d;
    }

    /* renamed from: R */
    public final boolean mo28639R() {
        return jt4.m18928Z(this) == 1;
    }

    /* renamed from: S */
    public boolean mo28640S() {
        return this.f24284d;
    }

    /* renamed from: T */
    public final void mo28641T(@mr2 Resources resources) {
        this.f24296r = resources.getDimensionPixelSize(fd3.C2156f.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(fd3.C2156f.mtrl_slider_track_side_padding);
        this.f24293o = dimensionPixelOffset;
        this.f24300v = dimensionPixelOffset;
        this.f24294p = resources.getDimensionPixelSize(fd3.C2156f.mtrl_slider_thumb_radius);
        this.f24295q = resources.getDimensionPixelSize(fd3.C2156f.mtrl_slider_track_height);
        this.f24303y = resources.getDimensionPixelSize(fd3.C2156f.mtrl_slider_label_padding);
    }

    /* renamed from: U */
    public final void mo28642U() {
        if (this.f24280d > 0.0f) {
            mo28764y0();
            int min = Math.min((int) (((this.f24275c - this.f24269b) / this.f24280d) + 1.0f), (this.f24252B / (this.f24299u * 2)) + 1);
            float[] fArr = this.f24268a;
            if (fArr == null || fArr.length != min * 2) {
                this.f24268a = new float[(min * 2)];
            }
            float f = ((float) this.f24252B) / ((float) (min - 1));
            for (int i = 0; i < min * 2; i += 2) {
                float[] fArr2 = this.f24268a;
                fArr2[i] = ((float) this.f24300v) + (((float) (i / 2)) * f);
                fArr2[i + 1] = (float) mo28696o();
            }
        }
    }

    /* renamed from: V */
    public final void mo28643V(@mr2 Canvas canvas, int i, int i2) {
        if (mo28711p0()) {
            int b0 = (int) (((float) this.f24300v) + (mo28649b0(this.f24266a.get(this.f24251A).floatValue()) * ((float) i)));
            if (Build.VERSION.SDK_INT < 28) {
                int i3 = this.f24302x;
                canvas.clipRect((float) (b0 - i3), (float) (i2 - i3), (float) (b0 + i3), (float) (i3 + i2), Region.Op.UNION);
            }
            canvas.drawCircle((float) b0, (float) i2, (float) this.f24302x, this.f24282d);
        }
    }

    /* renamed from: W */
    public final void mo28644W(@mr2 Canvas canvas) {
        if (this.f24284d && this.f24280d > 0.0f) {
            float[] G = mo28628G();
            int h0 = m33753h0(this.f24268a, G[0]);
            int h02 = m33753h0(this.f24268a, G[1]);
            int i = h0 * 2;
            canvas.drawPoints(this.f24268a, 0, i, this.f24287e);
            int i2 = h02 * 2;
            canvas.drawPoints(this.f24268a, i, i2 - i, this.f24289f);
            float[] fArr = this.f24268a;
            canvas.drawPoints(fArr, i2, fArr.length - i2, this.f24287e);
        }
    }

    /* renamed from: X */
    public final boolean mo28645X() {
        int max = this.f24293o + Math.max(Math.max(this.f24301w - this.f24294p, 0), Math.max((this.f24299u - this.f24295q) / 2, 0));
        if (this.f24300v == max) {
            return false;
        }
        this.f24300v = max;
        if (!jt4.m18914U0(this)) {
            return true;
        }
        mo28760w0(getWidth());
        return true;
    }

    /* renamed from: Y */
    public final boolean mo28646Y() {
        int max = Math.max(this.f24296r, Math.max(this.f24299u + getPaddingTop() + getPaddingBottom(), (this.f24301w * 2) + getPaddingTop() + getPaddingBottom()));
        if (max == this.f24297s) {
            return false;
        }
        this.f24297s = max;
        return true;
    }

    /* renamed from: Z */
    public final boolean mo28647Z(int i) {
        int i2 = this.f24251A;
        int f = (int) rf2.m26700f(((long) i2) + ((long) i), 0, (long) (this.f24266a.size() - 1));
        this.f24251A = f;
        if (f == i2) {
            return false;
        }
        if (this.f24304z != -1) {
            this.f24304z = f;
        }
        mo28758v0();
        postInvalidate();
        return true;
    }

    /* renamed from: a0 */
    public final boolean mo28648a0(int i) {
        if (mo28639R()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        return mo28647Z(i);
    }

    /* renamed from: b0 */
    public final float mo28649b0(float f) {
        float f2 = this.f24269b;
        float f3 = (f - f2) / (this.f24275c - f2);
        return mo28639R() ? 1.0f - f3 : f3;
    }

    @ts2
    /* renamed from: c0 */
    public final Boolean mo28650c0(int i, @mr2 KeyEvent keyEvent) {
        if (i == 61) {
            return keyEvent.hasNoModifiers() ? Boolean.valueOf(mo28647Z(1)) : keyEvent.isShiftPressed() ? Boolean.valueOf(mo28647Z(-1)) : Boolean.FALSE;
        }
        if (i != 66) {
            if (i != 81) {
                if (i == 69) {
                    mo28647Z(-1);
                    return Boolean.TRUE;
                } else if (i != 70) {
                    switch (i) {
                        case 21:
                            mo28648a0(-1);
                            return Boolean.TRUE;
                        case 22:
                            mo28648a0(1);
                            return Boolean.TRUE;
                        case 23:
                            break;
                        default:
                            return null;
                    }
                }
            }
            mo28647Z(1);
            return Boolean.TRUE;
        }
        this.f24304z = this.f24251A;
        postInvalidate();
        return Boolean.TRUE;
    }

    /* renamed from: d0 */
    public final void mo28651d0() {
        for (T a : this.f24278c) {
            a.mo28782a(this);
        }
    }

    public boolean dispatchHoverEvent(@mr2 MotionEvent motionEvent) {
        return this.f24262a.mo22755v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(@mr2 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f24257a.setColor(mo28631J(this.f24286e));
        this.f24272b.setColor(mo28631J(this.f24281d));
        this.f24287e.setColor(mo28631J(this.f24276c));
        this.f24289f.setColor(mo28631J(this.f24271b));
        for (sf4 next : this.f24267a) {
            if (next.isStateful()) {
                next.setState(getDrawableState());
            }
        }
        if (this.f24265a.isStateful()) {
            this.f24265a.setState(getDrawableState());
        }
        this.f24282d.setColor(mo28631J(this.f24256a));
        this.f24282d.setAlpha(63);
    }

    /* renamed from: e0 */
    public final void mo28655e0() {
        for (T b : this.f24278c) {
            b.mo28783b(this);
        }
    }

    /* renamed from: g0 */
    public boolean mo28656g0() {
        if (this.f24304z != -1) {
            return true;
        }
        float L = mo28633L();
        float F0 = mo28627F0(L);
        this.f24304z = 0;
        float abs = Math.abs(this.f24266a.get(0).floatValue() - L);
        for (int i = 1; i < this.f24266a.size(); i++) {
            float abs2 = Math.abs(this.f24266a.get(i).floatValue() - L);
            float F02 = mo28627F0(this.f24266a.get(i).floatValue());
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            boolean z = !mo28639R() ? F02 - F0 < 0.0f : F02 - F0 > 0.0f;
            if (Float.compare(abs2, abs) >= 0) {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else if (Math.abs(F02 - F0) < ((float) this.f24292n)) {
                    this.f24304z = -1;
                    return false;
                } else if (!z) {
                }
            }
            this.f24304z = i;
            abs = abs2;
        }
        return this.f24304z != -1;
    }

    @mr2
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @hw4
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f24262a.mo22757x();
    }

    public int getActiveThumbIndex() {
        return this.f24304z;
    }

    public int getFocusedThumbIndex() {
        return this.f24251A;
    }

    @zk0
    public int getHaloRadius() {
        return this.f24302x;
    }

    @mr2
    public ColorStateList getHaloTintList() {
        return this.f24256a;
    }

    public int getLabelBehavior() {
        return this.f24298t;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.f24280d;
    }

    public float getThumbElevation() {
        return this.f24265a.mo31644x();
    }

    @zk0
    public int getThumbRadius() {
        return this.f24301w;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f24265a.mo31585N();
    }

    public float getThumbStrokeWidth() {
        return this.f24265a.mo31590Q();
    }

    @mr2
    public ColorStateList getThumbTintList() {
        return this.f24265a.mo31646y();
    }

    @mr2
    public ColorStateList getTickActiveTintList() {
        return this.f24271b;
    }

    @mr2
    public ColorStateList getTickInactiveTintList() {
        return this.f24276c;
    }

    @mr2
    public ColorStateList getTickTintList() {
        if (this.f24276c.equals(this.f24271b)) {
            return this.f24271b;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @mr2
    public ColorStateList getTrackActiveTintList() {
        return this.f24281d;
    }

    @zk0
    public int getTrackHeight() {
        return this.f24299u;
    }

    @mr2
    public ColorStateList getTrackInactiveTintList() {
        return this.f24286e;
    }

    @zk0
    public int getTrackSidePadding() {
        return this.f24300v;
    }

    @mr2
    public ColorStateList getTrackTintList() {
        if (this.f24286e.equals(this.f24281d)) {
            return this.f24281d;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @zk0
    public int getTrackWidth() {
        return this.f24252B;
    }

    public float getValueFrom() {
        return this.f24269b;
    }

    public float getValueTo() {
        return this.f24275c;
    }

    @mr2
    public List<Float> getValues() {
        return new ArrayList(this.f24266a);
    }

    /* renamed from: h */
    public void mo28683h(@mr2 L l) {
        this.f24273b.add(l);
    }

    /* renamed from: i */
    public void mo28684i(@mr2 T t) {
        this.f24278c.add(t);
    }

    /* renamed from: i0 */
    public final void mo28685i0(Context context, AttributeSet attributeSet, int i) {
        TypedArray k = ob4.m59195k(context, attributeSet, fd3.C2165o.Slider, i, f24235F, new int[0]);
        this.f24269b = k.getFloat(fd3.C2165o.Slider_android_valueFrom, 0.0f);
        this.f24275c = k.getFloat(fd3.C2165o.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.f24269b));
        this.f24280d = k.getFloat(fd3.C2165o.Slider_android_stepSize, 0.0f);
        int i2 = fd3.C2165o.Slider_trackColor;
        boolean hasValue = k.hasValue(i2);
        int i3 = hasValue ? i2 : fd3.C2165o.Slider_trackColorInactive;
        if (!hasValue) {
            i2 = fd3.C2165o.Slider_trackColorActive;
        }
        ColorStateList a = af2.m38610a(context, k, i3);
        if (a == null) {
            a = C3129p8.m24528a(context, fd3.C2155e.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(a);
        ColorStateList a2 = af2.m38610a(context, k, i2);
        if (a2 == null) {
            a2 = C3129p8.m24528a(context, fd3.C2155e.material_slider_active_track_color);
        }
        setTrackActiveTintList(a2);
        this.f24265a.mo31626o0(af2.m38610a(context, k, fd3.C2165o.Slider_thumbColor));
        int i4 = fd3.C2165o.Slider_thumbStrokeColor;
        if (k.hasValue(i4)) {
            setThumbStrokeColor(af2.m38610a(context, k, i4));
        }
        setThumbStrokeWidth(k.getDimension(fd3.C2165o.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList a3 = af2.m38610a(context, k, fd3.C2165o.Slider_haloColor);
        if (a3 == null) {
            a3 = C3129p8.m24528a(context, fd3.C2155e.material_slider_halo_color);
        }
        setHaloTintList(a3);
        this.f24284d = k.getBoolean(fd3.C2165o.Slider_tickVisible, true);
        int i5 = fd3.C2165o.Slider_tickColor;
        boolean hasValue2 = k.hasValue(i5);
        int i6 = hasValue2 ? i5 : fd3.C2165o.Slider_tickColorInactive;
        if (!hasValue2) {
            i5 = fd3.C2165o.Slider_tickColorActive;
        }
        ColorStateList a4 = af2.m38610a(context, k, i6);
        if (a4 == null) {
            a4 = C3129p8.m24528a(context, fd3.C2155e.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(a4);
        ColorStateList a5 = af2.m38610a(context, k, i5);
        if (a5 == null) {
            a5 = C3129p8.m24528a(context, fd3.C2155e.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(a5);
        setThumbRadius(k.getDimensionPixelSize(fd3.C2165o.Slider_thumbRadius, 0));
        setHaloRadius(k.getDimensionPixelSize(fd3.C2165o.Slider_haloRadius, 0));
        setThumbElevation(k.getDimension(fd3.C2165o.Slider_thumbElevation, 0.0f));
        setTrackHeight(k.getDimensionPixelSize(fd3.C2165o.Slider_trackHeight, 0));
        setLabelBehavior(k.getInt(fd3.C2165o.Slider_labelBehavior, 0));
        if (!k.getBoolean(fd3.C2165o.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        k.recycle();
    }

    /* renamed from: j */
    public final void mo28686j(Drawable drawable) {
        int i = this.f24301w * 2;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i, i);
            return;
        }
        float max = ((float) i) / ((float) Math.max(intrinsicWidth, intrinsicHeight));
        drawable.setBounds(0, 0, (int) (((float) intrinsicWidth) * max), (int) (((float) intrinsicHeight) * max));
    }

    /* renamed from: j0 */
    public void mo28687j0(@mr2 L l) {
        this.f24273b.remove(l);
    }

    /* renamed from: k */
    public final void mo28688k(sf4 sf4) {
        sf4.mo44336k1(pv4.m61667g(this));
    }

    /* renamed from: k0 */
    public void mo28689k0(@mr2 T t) {
        this.f24278c.remove(t);
    }

    @ts2
    /* renamed from: l */
    public final Float mo28690l(int i) {
        float n = this.f24290f ? mo28694n(20) : mo28692m();
        if (i == 21) {
            if (!mo28639R()) {
                n = -n;
            }
            return Float.valueOf(n);
        } else if (i == 22) {
            if (mo28639R()) {
                n = -n;
            }
            return Float.valueOf(n);
        } else if (i == 69) {
            return Float.valueOf(-n);
        } else {
            if (i == 70 || i == 81) {
                return Float.valueOf(n);
            }
            return null;
        }
    }

    /* renamed from: l0 */
    public final void mo28691l0(int i) {
        BaseSlider<S, L, T>.d dVar = this.f24261a;
        if (dVar == null) {
            this.f24261a = new C4181d(this, (C4178a) null);
        } else {
            removeCallbacks(dVar);
        }
        this.f24261a.mo28770a(i);
        postDelayed(this.f24261a, 200);
    }

    /* renamed from: m */
    public final float mo28692m() {
        float f = this.f24280d;
        if (f == 0.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: m0 */
    public final void mo28693m0(sf4 sf4, float f) {
        sf4.mo44338m1(mo28626F(f));
        int b0 = (this.f24300v + ((int) (mo28649b0(f) * ((float) this.f24252B)))) - (sf4.getIntrinsicWidth() / 2);
        int o = mo28696o() - (this.f24303y + this.f24301w);
        sf4.setBounds(b0, o - sf4.getIntrinsicHeight(), sf4.getIntrinsicWidth() + b0, o);
        Rect rect = new Rect(sf4.getBounds());
        bk0.m40129c(pv4.m61667g(this), this, rect);
        sf4.setBounds(rect);
        pv4.m61668h(this).mo40792b(sf4);
    }

    /* renamed from: n */
    public final float mo28694n(int i) {
        float m = mo28692m();
        float f = (this.f24275c - this.f24269b) / m;
        float f2 = (float) i;
        return f <= f2 ? m : ((float) Math.round(f / f2)) * m;
    }

    /* renamed from: n0 */
    public final void mo28695n0(@mr2 ArrayList<Float> arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.f24266a.size() != arrayList.size() || !this.f24266a.equals(arrayList)) {
                this.f24266a = arrayList;
                this.f24291g = true;
                this.f24251A = 0;
                mo28758v0();
                mo28716s();
                mo28759w();
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    /* renamed from: o */
    public final int mo28696o() {
        int i = this.f24297s / 2;
        int i2 = 0;
        if (this.f24298t == 1 || mo28697o0()) {
            i2 = this.f24267a.get(0).getIntrinsicHeight();
        }
        return i + i2;
    }

    /* renamed from: o0 */
    public final boolean mo28697o0() {
        return this.f24298t == 3;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (sf4 k : this.f24267a) {
            mo28688k(k);
        }
    }

    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.d dVar = this.f24261a;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.f24274b = false;
        for (sf4 t : this.f24267a) {
            mo28753t(t);
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(@mr2 Canvas canvas) {
        if (this.f24291g) {
            mo28764y0();
            mo28642U();
        }
        super.onDraw(canvas);
        int o = mo28696o();
        mo28763y(canvas, this.f24252B, o);
        if (((Float) Collections.max(getValues())).floatValue() > this.f24269b) {
            mo28761x(canvas, this.f24252B, o);
        }
        mo28644W(canvas);
        if ((this.f24279c || isFocused() || mo28697o0()) && isEnabled()) {
            mo28643V(canvas, this.f24252B, o);
            if (this.f24304z != -1 || mo28697o0()) {
                mo28618B();
                mo28616A(canvas, this.f24252B, o);
            }
        }
        mo28620C();
        mo28616A(canvas, this.f24252B, o);
    }

    public void onFocusChanged(boolean z, int i, @ts2 Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.f24304z = -1;
            this.f24262a.mo22748o(this.f24251A);
            return;
        }
        mo28622D(i);
        this.f24262a.mo22744X(this.f24251A);
    }

    public boolean onKeyDown(int i, @mr2 KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f24266a.size() == 1) {
            this.f24304z = 0;
        }
        if (this.f24304z == -1) {
            Boolean c0 = mo28650c0(i, keyEvent);
            return c0 != null ? c0.booleanValue() : super.onKeyDown(i, keyEvent);
        }
        this.f24290f |= keyEvent.isLongPress();
        Float l = mo28690l(i);
        if (l != null) {
            if (mo28713q0(this.f24266a.get(this.f24304z).floatValue() + l.floatValue())) {
                mo28758v0();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i != 61) {
                if (i != 66) {
                    return super.onKeyDown(i, keyEvent);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return mo28647Z(1);
            } else {
                if (keyEvent.isShiftPressed()) {
                    return mo28647Z(-1);
                }
                return false;
            }
        }
        this.f24304z = -1;
        postInvalidate();
        return true;
    }

    public boolean onKeyUp(int i, @mr2 KeyEvent keyEvent) {
        this.f24290f = false;
        return super.onKeyUp(i, keyEvent);
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.f24297s;
        int i4 = 0;
        if (this.f24298t == 1 || mo28697o0()) {
            i4 = this.f24267a.get(0).getIntrinsicHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + i4, 1073741824));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C4183f fVar = (C4183f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        this.f24269b = fVar.f24314a;
        this.f24275c = fVar.f24316b;
        mo28695n0(fVar.f24315a);
        this.f24280d = fVar.f24318c;
        if (fVar.f24317b) {
            requestFocus();
        }
    }

    public Parcelable onSaveInstanceState() {
        C4183f fVar = new C4183f(super.onSaveInstanceState());
        fVar.f24314a = this.f24269b;
        fVar.f24316b = this.f24275c;
        fVar.f24315a = new ArrayList<>(this.f24266a);
        fVar.f24318c = this.f24280d;
        fVar.f24317b = hasFocus();
        return fVar;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        mo28760w0(i);
        mo28758v0();
    }

    public boolean onTouchEvent(@mr2 MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float f = (x - ((float) this.f24300v)) / ((float) this.f24252B);
        this.f24285e = f;
        float max = Math.max(0.0f, f);
        this.f24285e = max;
        this.f24285e = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.f24279c = false;
                MotionEvent motionEvent2 = this.f24259a;
                if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.f24259a.getX() - motionEvent.getX()) <= ((float) this.f24292n) && Math.abs(this.f24259a.getY() - motionEvent.getY()) <= ((float) this.f24292n) && mo28656g0()) {
                    mo28651d0();
                }
                if (this.f24304z != -1) {
                    mo28754t0();
                    this.f24304z = -1;
                    mo28655e0();
                }
            } else if (actionMasked == 2) {
                if (!this.f24279c) {
                    if (mo28637P() && Math.abs(x - this.f24254a) < ((float) this.f24292n)) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    mo28651d0();
                }
                if (mo28656g0()) {
                    this.f24279c = true;
                    mo28754t0();
                    mo28758v0();
                }
            }
            invalidate();
        } else {
            this.f24254a = x;
            if (!mo28637P()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (mo28656g0()) {
                    requestFocus();
                    this.f24279c = true;
                    mo28754t0();
                    mo28758v0();
                    invalidate();
                    mo28651d0();
                }
            }
        }
        setPressed(this.f24279c);
        this.f24259a = MotionEvent.obtain(motionEvent);
        return true;
    }

    public void onVisibilityChanged(@mr2 View view, int i) {
        pu4 h;
        super.onVisibilityChanged(view, i);
        if (i != 0 && (h = pv4.m61668h(this)) != null) {
            for (sf4 c : this.f24267a) {
                h.mo40793c(c);
            }
        }
    }

    /* renamed from: p */
    public void mo28710p() {
        this.f24273b.clear();
    }

    /* renamed from: p0 */
    public final boolean mo28711p0() {
        return this.f24288e || !(getBackground() instanceof RippleDrawable);
    }

    /* renamed from: q */
    public void mo28712q() {
        this.f24278c.clear();
    }

    /* renamed from: q0 */
    public final boolean mo28713q0(float f) {
        return mo28717s0(this.f24304z, f);
    }

    /* renamed from: r */
    public final ValueAnimator mo28714r(boolean z) {
        float f = 0.0f;
        float H = m33744H(z ? this.f24270b : this.f24255a, z ? 0.0f : 1.0f);
        if (z) {
            f = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{H, f});
        ofFloat.setDuration(z ? 83 : 117);
        ofFloat.setInterpolator(z ? C1947d7.f10653e : C1947d7.f10651c);
        ofFloat.addUpdateListener(new C4179b());
        return ofFloat;
    }

    /* renamed from: r0 */
    public final double mo28715r0(float f) {
        float f2 = this.f24280d;
        if (f2 <= 0.0f) {
            return (double) f;
        }
        int i = (int) ((this.f24275c - this.f24269b) / f2);
        return ((double) Math.round(f * ((float) i))) / ((double) i);
    }

    /* renamed from: s */
    public final void mo28716s() {
        if (this.f24267a.size() > this.f24266a.size()) {
            List<sf4> subList = this.f24267a.subList(this.f24266a.size(), this.f24267a.size());
            for (sf4 next : subList) {
                if (jt4.m18896O0(this)) {
                    mo28753t(next);
                }
            }
            subList.clear();
        }
        while (this.f24267a.size() < this.f24266a.size()) {
            sf4 a = this.f24263a.mo28767a();
            this.f24267a.add(a);
            if (jt4.m18896O0(this)) {
                mo28688k(a);
            }
        }
        int i = 1;
        if (this.f24267a.size() == 1) {
            i = 0;
        }
        for (sf4 I0 : this.f24267a) {
            I0.mo31576I0((float) i);
        }
    }

    /* renamed from: s0 */
    public final boolean mo28717s0(int i, float f) {
        this.f24251A = i;
        if (((double) Math.abs(f - this.f24266a.get(i).floatValue())) < 1.0E-4d) {
            return false;
        }
        this.f24266a.set(i, Float.valueOf(mo28630I(i, f)));
        mo28757v(i);
        return true;
    }

    public void setActiveThumbIndex(int i) {
        this.f24304z = i;
    }

    public void setCustomThumbDrawable(@dp0 int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    public void setCustomThumbDrawable(@mr2 Drawable drawable) {
        this.f24258a = mo28635N(drawable);
        this.f24283d.clear();
        postInvalidate();
    }

    public void setCustomThumbDrawablesForValues(@dp0 @mr2 int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    public void setCustomThumbDrawablesForValues(@mr2 Drawable... drawableArr) {
        this.f24258a = null;
        this.f24283d = new ArrayList();
        for (Drawable N : drawableArr) {
            this.f24283d.add(mo28635N(N));
        }
        postInvalidate();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, (Paint) null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.f24266a.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f24251A = i;
        this.f24262a.mo22744X(i);
        postInvalidate();
    }

    public void setHaloRadius(@js1(from = 0) @zk0 int i) {
        if (i != this.f24302x) {
            this.f24302x = i;
            Drawable background = getBackground();
            if (mo28711p0() || !(background instanceof RippleDrawable)) {
                postInvalidate();
            } else {
                kp0.m19973h((RippleDrawable) background, this.f24302x);
            }
        }
    }

    public void setHaloRadiusResource(@yk0 int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(@mr2 ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f24256a)) {
            this.f24256a = colorStateList;
            Drawable background = getBackground();
            if (mo28711p0() || !(background instanceof RippleDrawable)) {
                this.f24282d.setColor(mo28631J(colorStateList));
                this.f24282d.setAlpha(63);
                invalidate();
                return;
            }
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public void setLabelBehavior(int i) {
        if (this.f24298t != i) {
            this.f24298t = i;
            requestLayout();
        }
    }

    public void setLabelFormatter(@ts2 a12 a12) {
        this.f24264a = a12;
    }

    public void setSeparationUnit(int i) {
        this.f24253C = i;
        this.f24291g = true;
        postInvalidate();
    }

    public void setStepSize(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException(String.format(f24246g, new Object[]{Float.valueOf(f), Float.valueOf(this.f24269b), Float.valueOf(this.f24275c)}));
        } else if (this.f24280d != f) {
            this.f24280d = f;
            this.f24291g = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f) {
        this.f24265a.mo31624n0(f);
    }

    public void setThumbElevationResource(@yk0 int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbRadius(@js1(from = 0) @zk0 int i) {
        if (i != this.f24301w) {
            this.f24301w = i;
            this.f24265a.setShapeAppearanceModel(uw3.m67443a().mo45848q(0, (float) this.f24301w).mo45845m());
            bf2 bf2 = this.f24265a;
            int i2 = this.f24301w;
            bf2.setBounds(0, 0, i2 * 2, i2 * 2);
            Drawable drawable = this.f24258a;
            if (drawable != null) {
                mo28686j(drawable);
            }
            for (Drawable j : this.f24283d) {
                mo28686j(j);
            }
            mo28762x0();
        }
    }

    public void setThumbRadiusResource(@yk0 int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(@ts2 ColorStateList colorStateList) {
        this.f24265a.mo31570F0(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(@k10 int i) {
        if (i != 0) {
            setThumbStrokeColor(C3129p8.m24528a(getContext(), i));
        }
    }

    public void setThumbStrokeWidth(float f) {
        this.f24265a.mo31576I0(f);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(@yk0 int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(@mr2 ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f24265a.mo31646y())) {
            this.f24265a.mo31626o0(colorStateList);
            invalidate();
        }
    }

    public void setTickActiveTintList(@mr2 ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f24271b)) {
            this.f24271b = colorStateList;
            this.f24289f.setColor(mo28631J(colorStateList));
            invalidate();
        }
    }

    public void setTickInactiveTintList(@mr2 ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f24276c)) {
            this.f24276c = colorStateList;
            this.f24287e.setColor(mo28631J(colorStateList));
            invalidate();
        }
    }

    public void setTickTintList(@mr2 ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.f24284d != z) {
            this.f24284d = z;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(@mr2 ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f24281d)) {
            this.f24281d = colorStateList;
            this.f24272b.setColor(mo28631J(colorStateList));
            invalidate();
        }
    }

    public void setTrackHeight(@js1(from = 0) @zk0 int i) {
        if (this.f24299u != i) {
            this.f24299u = i;
            mo28636O();
            mo28762x0();
        }
    }

    public void setTrackInactiveTintList(@mr2 ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f24286e)) {
            this.f24286e = colorStateList;
            this.f24257a.setColor(mo28631J(colorStateList));
            invalidate();
        }
    }

    public void setTrackTintList(@mr2 ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f) {
        this.f24269b = f;
        this.f24291g = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f24275c = f;
        this.f24291g = true;
        postInvalidate();
    }

    public void setValues(@mr2 List<Float> list) {
        mo28695n0(new ArrayList(list));
    }

    public void setValues(@mr2 Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        mo28695n0(arrayList);
    }

    /* renamed from: t */
    public final void mo28753t(sf4 sf4) {
        pu4 h = pv4.m61668h(this);
        if (h != null) {
            h.mo40793c(sf4);
            sf4.mo44321X0(pv4.m61667g(this));
        }
    }

    /* renamed from: t0 */
    public final boolean mo28754t0() {
        return mo28713q0(mo28632K());
    }

    /* renamed from: u */
    public final float mo28755u(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        float f2 = (f - ((float) this.f24300v)) / ((float) this.f24252B);
        float f3 = this.f24269b;
        return (f2 * (f3 - this.f24275c)) + f3;
    }

    /* renamed from: u0 */
    public void mo28756u0(int i, Rect rect) {
        int b0 = this.f24300v + ((int) (mo28649b0(getValues().get(i).floatValue()) * ((float) this.f24252B)));
        int o = mo28696o();
        int i2 = this.f24301w;
        rect.set(b0 - i2, o - i2, b0 + i2, o + i2);
    }

    /* renamed from: v */
    public final void mo28757v(int i) {
        for (L a : this.f24273b) {
            a.mo28780a(this, this.f24266a.get(i).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f24260a;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            mo28691l0(i);
        }
    }

    /* renamed from: v0 */
    public final void mo28758v0() {
        if (!mo28711p0() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int b0 = (int) ((mo28649b0(this.f24266a.get(this.f24251A).floatValue()) * ((float) this.f24252B)) + ((float) this.f24300v));
                int o = mo28696o();
                int i = this.f24302x;
                wo0.m30983l(background, b0 - i, o - i, b0 + i, o + i);
            }
        }
    }

    /* renamed from: w */
    public final void mo28759w() {
        for (L l : this.f24273b) {
            Iterator<Float> it = this.f24266a.iterator();
            while (it.hasNext()) {
                l.mo28780a(this, it.next().floatValue(), false);
            }
        }
    }

    /* renamed from: w0 */
    public final void mo28760w0(int i) {
        this.f24252B = Math.max(i - (this.f24300v * 2), 0);
        mo28642U();
    }

    /* renamed from: x */
    public final void mo28761x(@mr2 Canvas canvas, int i, int i2) {
        float[] G = mo28628G();
        int i3 = this.f24300v;
        float f = (float) i;
        float f2 = (float) i2;
        Canvas canvas2 = canvas;
        canvas2.drawLine(((float) i3) + (G[0] * f), f2, ((float) i3) + (G[1] * f), f2, this.f24272b);
    }

    /* renamed from: x0 */
    public final void mo28762x0() {
        boolean Y = mo28646Y();
        boolean X = mo28645X();
        if (Y) {
            requestLayout();
        } else if (X) {
            postInvalidate();
        }
    }

    /* renamed from: y */
    public final void mo28763y(@mr2 Canvas canvas, int i, int i2) {
        float[] G = mo28628G();
        int i3 = this.f24300v;
        float f = (float) i;
        float f2 = ((float) i3) + (G[1] * f);
        if (f2 < ((float) (i3 + i))) {
            float f3 = (float) i2;
            canvas.drawLine(f2, f3, (float) (i3 + i), f3, this.f24257a);
        }
        int i4 = this.f24300v;
        float f4 = ((float) i4) + (G[0] * f);
        if (f4 > ((float) i4)) {
            float f5 = (float) i2;
            canvas.drawLine((float) i4, f5, f4, f5, this.f24257a);
        }
    }

    /* renamed from: y0 */
    public final void mo28764y0() {
        if (this.f24291g) {
            mo28619B0();
            mo28621C0();
            mo28617A0();
            mo28623D0();
            mo28766z0();
            mo28629G0();
            this.f24291g = false;
        }
    }

    /* renamed from: z */
    public final void mo28765z(@mr2 Canvas canvas, int i, int i2, float f, @mr2 Drawable drawable) {
        canvas.save();
        canvas.translate(((float) (this.f24300v + ((int) (mo28649b0(f) * ((float) i))))) - (((float) drawable.getBounds().width()) / 2.0f), ((float) i2) - (((float) drawable.getBounds().height()) / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    /* renamed from: z0 */
    public final void mo28766z0() {
        float minSeparation = getMinSeparation();
        if (minSeparation >= 0.0f) {
            float f = this.f24280d;
            if (f > 0.0f && minSeparation > 0.0f) {
                if (this.f24253C != 1) {
                    throw new IllegalStateException(String.format(f24248i, new Object[]{Float.valueOf(minSeparation), Float.valueOf(this.f24280d)}));
                } else if (minSeparation < f || !mo28638Q(minSeparation)) {
                    throw new IllegalStateException(String.format(f24249j, new Object[]{Float.valueOf(minSeparation), Float.valueOf(this.f24280d), Float.valueOf(this.f24280d)}));
                }
            }
        } else {
            throw new IllegalStateException(String.format(f24247h, new Object[]{Float.valueOf(minSeparation)}));
        }
    }
}
