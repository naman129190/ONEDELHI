package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.C0426d;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import com.onedelhi.secure.C3884x1;
import com.onedelhi.secure.ae4;
import com.onedelhi.secure.e54;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.sd4;
import com.onedelhi.secure.ts2;
import java.util.Locale;

class TimePickerView extends ConstraintLayout implements ae4 {

    /* renamed from: d */
    public static final String f24745d = "android.view.View";

    /* renamed from: a */
    public final View.OnClickListener f24746a;

    /* renamed from: a */
    public final MaterialButtonToggleGroup f24747a;

    /* renamed from: a */
    public final Chip f24748a;

    /* renamed from: a */
    public final ClockFaceView f24749a;

    /* renamed from: a */
    public final ClockHandView f24750a;

    /* renamed from: a */
    public C4274d f24751a;

    /* renamed from: a */
    public C4275e f24752a;

    /* renamed from: a */
    public C4276f f24753a;

    /* renamed from: b */
    public final Chip f24754b;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$a */
    public class C4271a implements View.OnClickListener {
        public C4271a() {
        }

        public void onClick(View view) {
            if (TimePickerView.this.f24753a != null) {
                TimePickerView.this.f24753a.mo29559d(((Integer) view.getTag(fd3.C2158h.selection_type)).intValue());
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$b */
    public class C4272b extends GestureDetector.SimpleOnGestureListener {
        public C4272b() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            C4274d I = TimePickerView.this.f24751a;
            if (I == null) {
                return false;
            }
            I.mo29557f();
            return true;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$c */
    public class C4273c implements View.OnTouchListener {

        /* renamed from: a */
        public final /* synthetic */ GestureDetector f24757a;

        public C4273c(GestureDetector gestureDetector) {
            this.f24757a = gestureDetector;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f24757a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$d */
    public interface C4274d {
        /* renamed from: f */
        void mo29557f();
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$e */
    public interface C4275e {
        /* renamed from: h */
        void mo29558h(int i);
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$f */
    public interface C4276f {
        /* renamed from: d */
        void mo29559d(int i);
    }

    public TimePickerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public TimePickerView(Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24746a = new C4271a();
        LayoutInflater.from(context).inflate(fd3.C2161k.material_timepicker, this);
        this.f24749a = (ClockFaceView) findViewById(fd3.C2158h.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(fd3.C2158h.material_clock_period_toggle);
        this.f24747a = materialButtonToggleGroup;
        materialButtonToggleGroup.mo11409b(new C4293f(this));
        this.f24748a = (Chip) findViewById(fd3.C2158h.material_minute_tv);
        this.f24754b = (Chip) findViewById(fd3.C2158h.material_hour_tv);
        this.f24750a = (ClockHandView) findViewById(fd3.C2158h.material_clock_hand);
        mo29544U();
        mo29543T();
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m34433K(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        C4275e eVar;
        if (z && (eVar = this.f24752a) != null) {
            eVar.mo29558h(i == fd3.C2158h.material_clock_period_pm_button ? 1 : 0);
        }
    }

    /* renamed from: J */
    public void mo29534J(ClockHandView.C4270d dVar) {
        this.f24750a.mo29507b(dVar);
    }

    /* renamed from: L */
    public void mo29535L(boolean z) {
        this.f24750a.mo29515j(z);
    }

    /* renamed from: M */
    public void mo29536M(float f, boolean z) {
        this.f24750a.mo29518m(f, z);
    }

    /* renamed from: N */
    public void mo29537N(C3884x1 x1Var) {
        jt4.m18849B1(this.f24748a, x1Var);
    }

    /* renamed from: O */
    public void mo29538O(C3884x1 x1Var) {
        jt4.m18849B1(this.f24754b, x1Var);
    }

    /* renamed from: P */
    public void mo29539P(ClockHandView.C4269c cVar) {
        this.f24750a.mo29520o(cVar);
    }

    /* renamed from: Q */
    public void mo29540Q(@ts2 C4274d dVar) {
        this.f24751a = dVar;
    }

    /* renamed from: R */
    public void mo29541R(C4275e eVar) {
        this.f24752a = eVar;
    }

    /* renamed from: S */
    public void mo29542S(C4276f fVar) {
        this.f24753a = fVar;
    }

    /* renamed from: T */
    public final void mo29543T() {
        Chip chip = this.f24748a;
        int i = fd3.C2158h.selection_type;
        chip.setTag(i, 12);
        this.f24754b.setTag(i, 10);
        this.f24748a.setOnClickListener(this.f24746a);
        this.f24754b.setOnClickListener(this.f24746a);
        this.f24748a.setAccessibilityClassName("android.view.View");
        this.f24754b.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: U */
    public final void mo29544U() {
        C4273c cVar = new C4273c(new GestureDetector(getContext(), new C4272b()));
        this.f24748a.setOnTouchListener(cVar);
        this.f24754b.setOnTouchListener(cVar);
    }

    /* renamed from: V */
    public void mo29545V() {
        this.f24747a.setVisibility(0);
    }

    /* renamed from: W */
    public final void mo29546W(Chip chip, boolean z) {
        chip.setChecked(z);
        jt4.m18857D1(chip, z ? 2 : 0);
    }

    /* renamed from: X */
    public final void mo29547X() {
        if (this.f24747a.getVisibility() == 0) {
            C0426d dVar = new C0426d();
            dVar.mo3397H(this);
            int i = 1;
            if (jt4.m18928Z(this) == 0) {
                i = 2;
            }
            dVar.mo3392F(fd3.C2158h.material_clock_display, i);
            dVar.mo3473r(this);
        }
    }

    /* renamed from: a */
    public void mo29548a(String[] strArr, @e54 int i) {
        this.f24749a.mo29502a(strArr, i);
    }

    /* renamed from: c */
    public void mo29549c(float f) {
        this.f24750a.mo29517l(f);
    }

    /* renamed from: d */
    public void mo29550d(int i) {
        boolean z = true;
        mo29546W(this.f24748a, i == 12);
        Chip chip = this.f24754b;
        if (i != 10) {
            z = false;
        }
        mo29546W(chip, z);
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: e */
    public void mo29551e(int i, int i2, int i3) {
        this.f24747a.mo11413e(i == 1 ? fd3.C2158h.material_clock_period_pm_button : fd3.C2158h.material_clock_period_am_button);
        Locale locale = getResources().getConfiguration().locale;
        String format = String.format(locale, sd4.f34978b, new Object[]{Integer.valueOf(i3)});
        String format2 = String.format(locale, sd4.f34978b, new Object[]{Integer.valueOf(i2)});
        if (!TextUtils.equals(this.f24748a.getText(), format)) {
            this.f24748a.setText(format);
        }
        if (!TextUtils.equals(this.f24754b.getText(), format2)) {
            this.f24754b.setText(format2);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo29547X();
    }

    public void onVisibilityChanged(@mr2 View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            mo29547X();
        }
    }
}
