package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.C3884x1;
import com.onedelhi.secure.af2;
import com.onedelhi.secure.d81;
import com.onedelhi.secure.e54;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.Arrays;

class ClockFaceView extends RadialViewGroup implements ClockHandView.C4270d {

    /* renamed from: H */
    public static final int f24702H = 12;

    /* renamed from: b */
    public static final float f24703b = 0.001f;

    /* renamed from: e */
    public static final String f24704e = "";

    /* renamed from: D */
    public final int f24705D;

    /* renamed from: E */
    public final int f24706E;

    /* renamed from: F */
    public final int f24707F;

    /* renamed from: G */
    public final int f24708G;

    /* renamed from: a */
    public float f24709a;

    /* renamed from: a */
    public final ColorStateList f24710a;

    /* renamed from: a */
    public final Rect f24711a;

    /* renamed from: a */
    public final RectF f24712a;

    /* renamed from: a */
    public final ClockHandView f24713a;

    /* renamed from: a */
    public final C3884x1 f24714a;

    /* renamed from: a */
    public final float[] f24715a;

    /* renamed from: a */
    public final int[] f24716a;

    /* renamed from: a */
    public String[] f24717a;

    /* renamed from: c */
    public final SparseArray<TextView> f24718c;

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$a */
    public class C4265a implements ViewTreeObserver.OnPreDrawListener {
        public C4265a() {
        }

        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.mo29498I(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f24713a.mo29512g()) - ClockFaceView.this.f24705D);
            return true;
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$b */
    public class C4266b extends C3884x1 {
        public C4266b() {
        }

        /* renamed from: g */
        public void mo3893g(View view, @mr2 C1638a2 a2Var) {
            super.mo3893g(view, a2Var);
            int intValue = ((Integer) view.getTag(fd3.C2158h.material_value_index)).intValue();
            if (intValue > 0) {
                a2Var.mo12531Q1((View) ClockFaceView.this.f24718c.get(intValue - 1));
            }
            a2Var.mo12555Z0(C1638a2.C1641c.m10709h(0, 1, intValue, 1, false, view.isSelected()));
            a2Var.mo12551X0(true);
            a2Var.mo12559b(C1638a2.C1639a.f8642e);
        }

        /* renamed from: j */
        public boolean mo3894j(View view, int i, Bundle bundle) {
            if (i != 16) {
                return super.mo3894j(view, i, bundle);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            float x = view.getX() + (((float) view.getWidth()) / 2.0f);
            long j = uptimeMillis;
            float f = x;
            float height = (((float) view.getHeight()) / 2.0f) + view.getY();
            ClockFaceView.this.f24713a.onTouchEvent(MotionEvent.obtain(uptimeMillis, j, 0, f, height, 0));
            ClockFaceView.this.f24713a.onTouchEvent(MotionEvent.obtain(uptimeMillis, j, 1, f, height, 0));
            return true;
        }
    }

    public ClockFaceView(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public ClockFaceView(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, fd3.C2153c.materialClockStyle);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24711a = new Rect();
        this.f24712a = new RectF();
        this.f24718c = new SparseArray<>();
        this.f24715a = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fd3.C2165o.ClockFaceView, i, fd3.C2164n.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList a = af2.m38610a(context, obtainStyledAttributes, fd3.C2165o.ClockFaceView_clockNumberTextColor);
        this.f24710a = a;
        LayoutInflater.from(context).inflate(fd3.C2161k.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(fd3.C2158h.material_clock_hand);
        this.f24713a = clockHandView;
        this.f24705D = resources.getDimensionPixelSize(fd3.C2156f.material_clock_hand_padding);
        int colorForState = a.getColorForState(new int[]{16842913}, a.getDefaultColor());
        this.f24716a = new int[]{colorForState, colorForState, a.getDefaultColor()};
        clockHandView.mo29507b(this);
        int defaultColor = C3129p8.m24528a(context, fd3.C2155e.material_timepicker_clockface).getDefaultColor();
        ColorStateList a2 = af2.m38610a(context, obtainStyledAttributes, fd3.C2165o.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(a2 != null ? a2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new C4265a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f24714a = new C4266b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        mo29502a(strArr, 0);
        this.f24706E = resources.getDimensionPixelSize(fd3.C2156f.material_time_picker_minimum_screen_height);
        this.f24707F = resources.getDimensionPixelSize(fd3.C2156f.material_time_picker_minimum_screen_width);
        this.f24708G = resources.getDimensionPixelSize(fd3.C2156f.material_clock_size);
    }

    /* renamed from: R */
    public static float m34397R(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    /* renamed from: I */
    public void mo29498I(int i) {
        if (i != mo29528H()) {
            super.mo29498I(i);
            this.f24713a.mo29516k(mo29528H());
        }
    }

    /* renamed from: P */
    public final void mo29499P() {
        RectF d = this.f24713a.mo29509d();
        for (int i = 0; i < this.f24718c.size(); i++) {
            TextView textView = this.f24718c.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.f24711a);
                offsetDescendantRectToMyCoords(textView, this.f24711a);
                textView.setSelected(d.contains((float) this.f24711a.centerX(), (float) this.f24711a.centerY()));
                textView.getPaint().setShader(mo29500Q(d, this.f24711a, textView));
                textView.invalidate();
            }
        }
    }

    @ts2
    /* renamed from: Q */
    public final RadialGradient mo29500Q(RectF rectF, Rect rect, TextView textView) {
        this.f24712a.set(rect);
        this.f24712a.offset((float) textView.getPaddingLeft(), (float) textView.getPaddingTop());
        if (!RectF.intersects(rectF, this.f24712a)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.f24712a.left, rectF.centerY() - this.f24712a.top, rectF.width() * 0.5f, this.f24716a, this.f24715a, Shader.TileMode.CLAMP);
    }

    /* renamed from: S */
    public final void mo29501S(@e54 int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f24718c.size();
        for (int i2 = 0; i2 < Math.max(this.f24717a.length, size); i2++) {
            TextView textView = this.f24718c.get(i2);
            if (i2 >= this.f24717a.length) {
                removeView(textView);
                this.f24718c.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(fd3.C2161k.material_clockface_textview, this, false);
                    this.f24718c.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f24717a[i2]);
                textView.setTag(fd3.C2158h.material_value_index, Integer.valueOf(i2));
                jt4.m18849B1(textView, this.f24714a);
                textView.setTextColor(this.f24710a);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, new Object[]{this.f24717a[i2]}));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo29502a(String[] strArr, @e54 int i) {
        this.f24717a = strArr;
        mo29501S(i);
    }

    /* renamed from: c */
    public void mo29503c(@d81(from = 0.0d, mo14561to = 360.0d) float f) {
        this.f24713a.mo29517l(f);
        mo29499P();
    }

    /* renamed from: f */
    public void mo29504f(float f, boolean z) {
        if (Math.abs(this.f24709a - f) > 0.001f) {
            this.f24709a = f;
            mo29499P();
        }
    }

    public void onInitializeAccessibilityNodeInfo(@mr2 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1638a2.m10547X1(accessibilityNodeInfo).mo12553Y0(C1638a2.C1640b.m10703f(1, this.f24717a.length, false, 1));
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo29499P();
    }

    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int R = (int) (((float) this.f24708G) / m34397R(((float) this.f24706E) / ((float) displayMetrics.heightPixels), ((float) this.f24707F) / ((float) displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(R, 1073741824);
        setMeasuredDimension(R, R);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
