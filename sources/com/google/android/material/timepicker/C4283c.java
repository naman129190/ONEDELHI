package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C7205wy;
import com.onedelhi.secure.be4;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.mm0;
import com.onedelhi.secure.mx0;
import com.onedelhi.secure.r70;
import com.onedelhi.secure.sd4;

/* renamed from: com.google.android.material.timepicker.c */
public class C4283c implements ClockHandView.C4270d, TimePickerView.C4276f, TimePickerView.C4275e, ClockHandView.C4269c, be4 {

    /* renamed from: a */
    public static final String[] f24805a = {"12", mm0.f16219f, mx0.f16744n2, mx0.f16754o2, "4", "5", "6", "7", "8", "9", "10", "11"};

    /* renamed from: b */
    public static final String[] f24806b = {"00", mx0.f16744n2, "4", "6", "8", "10", "12", "14", "16", "18", "20", "22"};

    /* renamed from: c */
    public static final String[] f24807c = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    /* renamed from: n */
    public static final int f24808n = 30;

    /* renamed from: o */
    public static final int f24809o = 6;

    /* renamed from: a */
    public float f24810a;

    /* renamed from: a */
    public final TimePickerView f24811a;

    /* renamed from: a */
    public final sd4 f24812a;

    /* renamed from: b */
    public float f24813b;

    /* renamed from: b */
    public boolean f24814b = false;

    /* renamed from: com.google.android.material.timepicker.c$a */
    public class C4284a extends C7205wy {
        public C4284a(Context context, int i) {
            super(context, i);
        }

        /* renamed from: g */
        public void mo3893g(View view, C1638a2 a2Var) {
            super.mo3893g(view, a2Var);
            a2Var.mo12558a1(view.getResources().getString(fd3.C2163m.material_hour_suffix, new Object[]{String.valueOf(C4283c.this.f24812a.mo44282c())}));
        }
    }

    /* renamed from: com.google.android.material.timepicker.c$b */
    public class C4285b extends C7205wy {
        public C4285b(Context context, int i) {
            super(context, i);
        }

        /* renamed from: g */
        public void mo3893g(View view, C1638a2 a2Var) {
            super.mo3893g(view, a2Var);
            a2Var.mo12558a1(view.getResources().getString(fd3.C2163m.material_minute_suffix, new Object[]{String.valueOf(C4283c.this.f24812a.f34984p)}));
        }
    }

    public C4283c(TimePickerView timePickerView, sd4 sd4) {
        this.f24811a = timePickerView;
        this.f24812a = sd4;
        mo29602b();
    }

    /* renamed from: a */
    public void mo29601a() {
        this.f24811a.setVisibility(0);
    }

    /* renamed from: b */
    public void mo29602b() {
        if (this.f24812a.f34982n == 0) {
            this.f24811a.mo29545V();
        }
        this.f24811a.mo29534J(this);
        this.f24811a.mo29542S(this);
        this.f24811a.mo29541R(this);
        this.f24811a.mo29539P(this);
        mo29610o();
        mo29604g();
    }

    /* renamed from: c */
    public void mo29603c() {
        this.f24811a.setVisibility(8);
    }

    /* renamed from: d */
    public void mo29559d(int i) {
        mo29608m(i, true);
    }

    /* renamed from: e */
    public void mo29526e(float f, boolean z) {
        this.f24814b = true;
        sd4 sd4 = this.f24812a;
        int i = sd4.f34984p;
        int i2 = sd4.f34983o;
        if (sd4.f34985q == 10) {
            this.f24811a.mo29536M(this.f24813b, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) r70.m26362o(this.f24811a.getContext(), AccessibilityManager.class);
            if (!(accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled())) {
                mo29608m(12, true);
            }
        } else {
            int round = Math.round(f);
            if (!z) {
                this.f24812a.mo44290j(((round + 15) / 30) * 5);
                this.f24810a = (float) (this.f24812a.f34984p * 6);
            }
            this.f24811a.mo29536M(this.f24810a, z);
        }
        this.f24814b = false;
        mo29609n();
        mo29607l(i2, i);
    }

    /* renamed from: f */
    public void mo29504f(float f, boolean z) {
        if (!this.f24814b) {
            sd4 sd4 = this.f24812a;
            int i = sd4.f34983o;
            int i2 = sd4.f34984p;
            int round = Math.round(f);
            sd4 sd42 = this.f24812a;
            if (sd42.f34985q == 12) {
                sd42.mo44290j((round + 3) / 6);
                this.f24810a = (float) Math.floor((double) (this.f24812a.f34984p * 6));
            } else {
                this.f24812a.mo44287h((round + (mo29605j() / 2)) / mo29605j());
                this.f24813b = (float) (this.f24812a.mo44282c() * mo29605j());
            }
            if (!z) {
                mo29609n();
                mo29607l(i, i2);
            }
        }
    }

    /* renamed from: g */
    public void mo29604g() {
        this.f24813b = (float) (this.f24812a.mo44282c() * mo29605j());
        sd4 sd4 = this.f24812a;
        this.f24810a = (float) (sd4.f34984p * 6);
        mo29608m(sd4.f34985q, false);
        mo29609n();
    }

    /* renamed from: h */
    public void mo29558h(int i) {
        this.f24812a.mo44291k(i);
    }

    /* renamed from: j */
    public final int mo29605j() {
        return this.f24812a.f34982n == 1 ? 15 : 30;
    }

    /* renamed from: k */
    public final String[] mo29606k() {
        return this.f24812a.f34982n == 1 ? f24806b : f24805a;
    }

    /* renamed from: l */
    public final void mo29607l(int i, int i2) {
        sd4 sd4 = this.f24812a;
        if (sd4.f34984p != i2 || sd4.f34983o != i) {
            this.f24811a.performHapticFeedback(4);
        }
    }

    /* renamed from: m */
    public void mo29608m(int i, boolean z) {
        boolean z2 = i == 12;
        this.f24811a.mo29535L(z2);
        this.f24812a.f34985q = i;
        this.f24811a.mo29548a(z2 ? f24807c : mo29606k(), z2 ? fd3.C2163m.material_minute_suffix : fd3.C2163m.material_hour_suffix);
        this.f24811a.mo29536M(z2 ? this.f24810a : this.f24813b, z);
        this.f24811a.mo29550d(i);
        this.f24811a.mo29538O(new C4284a(this.f24811a.getContext(), fd3.C2163m.material_hour_selection));
        this.f24811a.mo29537N(new C4285b(this.f24811a.getContext(), fd3.C2163m.material_minute_selection));
    }

    /* renamed from: n */
    public final void mo29609n() {
        TimePickerView timePickerView = this.f24811a;
        sd4 sd4 = this.f24812a;
        timePickerView.mo29551e(sd4.f34986r, sd4.mo44282c(), this.f24812a.f34984p);
    }

    /* renamed from: o */
    public final void mo29610o() {
        mo29611p(f24805a, sd4.f34979c);
        mo29611p(f24806b, sd4.f34979c);
        mo29611p(f24807c, sd4.f34978b);
    }

    /* renamed from: p */
    public final void mo29611p(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = sd4.m64462b(this.f24811a.getResources(), strArr[i], str);
        }
    }
}
