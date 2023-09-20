package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.timepicker.TimePickerView;
import com.onedelhi.secure.C1638a2;
import com.onedelhi.secure.C3129p8;
import com.onedelhi.secure.C7205wy;
import com.onedelhi.secure.be4;
import com.onedelhi.secure.ce4;
import com.onedelhi.secure.d10;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.mb4;
import com.onedelhi.secure.pv4;
import com.onedelhi.secure.sd4;
import java.lang.reflect.Field;
import java.util.Locale;

/* renamed from: com.google.android.material.timepicker.e */
public class C4287e implements TimePickerView.C4276f, be4 {

    /* renamed from: a */
    public final TextWatcher f24821a = new C4288a();

    /* renamed from: a */
    public final EditText f24822a;

    /* renamed from: a */
    public final LinearLayout f24823a;

    /* renamed from: a */
    public MaterialButtonToggleGroup f24824a;

    /* renamed from: a */
    public final ChipTextInputComboView f24825a;

    /* renamed from: a */
    public final C4286d f24826a;

    /* renamed from: a */
    public final sd4 f24827a;

    /* renamed from: b */
    public final TextWatcher f24828b = new C4289b();

    /* renamed from: b */
    public final EditText f24829b;

    /* renamed from: b */
    public final ChipTextInputComboView f24830b;

    /* renamed from: com.google.android.material.timepicker.e$a */
    public class C4288a extends mb4 {
        public C4288a() {
        }

        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    C4287e.this.f24827a.mo44290j(0);
                    return;
                }
                C4287e.this.f24827a.mo44290j(Integer.parseInt(editable.toString()));
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.e$b */
    public class C4289b extends mb4 {
        public C4289b() {
        }

        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    C4287e.this.f24827a.mo44287h(0);
                    return;
                }
                C4287e.this.f24827a.mo44287h(Integer.parseInt(editable.toString()));
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.e$c */
    public class C4290c implements View.OnClickListener {
        public C4290c() {
        }

        public void onClick(View view) {
            C4287e.this.mo29559d(((Integer) view.getTag(fd3.C2158h.selection_type)).intValue());
        }
    }

    /* renamed from: com.google.android.material.timepicker.e$d */
    public class C4291d extends C7205wy {

        /* renamed from: a */
        public final /* synthetic */ sd4 f24835a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4291d(Context context, int i, sd4 sd4) {
            super(context, i);
            this.f24835a = sd4;
        }

        /* renamed from: g */
        public void mo3893g(View view, C1638a2 a2Var) {
            super.mo3893g(view, a2Var);
            a2Var.mo12558a1(view.getResources().getString(fd3.C2163m.material_hour_suffix, new Object[]{String.valueOf(this.f24835a.mo44282c())}));
        }
    }

    /* renamed from: com.google.android.material.timepicker.e$e */
    public class C4292e extends C7205wy {

        /* renamed from: a */
        public final /* synthetic */ sd4 f24837a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4292e(Context context, int i, sd4 sd4) {
            super(context, i);
            this.f24837a = sd4;
        }

        /* renamed from: g */
        public void mo3893g(View view, C1638a2 a2Var) {
            super.mo3893g(view, a2Var);
            a2Var.mo12558a1(view.getResources().getString(fd3.C2163m.material_minute_suffix, new Object[]{String.valueOf(this.f24837a.f34984p)}));
        }
    }

    public C4287e(LinearLayout linearLayout, sd4 sd4) {
        this.f24823a = linearLayout;
        this.f24827a = sd4;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(fd3.C2158h.material_minute_text_input);
        this.f24825a = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(fd3.C2158h.material_hour_text_input);
        this.f24830b = chipTextInputComboView2;
        int i = fd3.C2158h.material_label;
        ((TextView) chipTextInputComboView.findViewById(i)).setText(resources.getString(fd3.C2163m.material_timepicker_minute));
        ((TextView) chipTextInputComboView2.findViewById(i)).setText(resources.getString(fd3.C2163m.material_timepicker_hour));
        int i2 = fd3.C2158h.selection_type;
        chipTextInputComboView.setTag(i2, 12);
        chipTextInputComboView2.setTag(i2, 10);
        if (sd4.f34982n == 0) {
            mo29623o();
        }
        C4290c cVar = new C4290c();
        chipTextInputComboView2.setOnClickListener(cVar);
        chipTextInputComboView.setOnClickListener(cVar);
        chipTextInputComboView2.mo29484c(sd4.mo44283d());
        chipTextInputComboView.mo29484c(sd4.mo44285e());
        this.f24822a = chipTextInputComboView2.mo29486e().getEditText();
        this.f24829b = chipTextInputComboView.mo29486e().getEditText();
        this.f24826a = new C4286d(chipTextInputComboView2, chipTextInputComboView, sd4);
        chipTextInputComboView2.mo29487f(new C4291d(linearLayout.getContext(), fd3.C2163m.material_hour_selection, sd4));
        chipTextInputComboView.mo29487f(new C4292e(linearLayout.getContext(), fd3.C2163m.material_minute_selection, sd4));
        mo29602b();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m34534j(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        if (z) {
            this.f24827a.mo44291k(i == fd3.C2158h.material_clock_period_pm_button ? 1 : 0);
        }
    }

    /* renamed from: m */
    public static void m34535m(EditText editText, @d10 int i) {
        try {
            Context context = editText.getContext();
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable b = C3129p8.m24529b(context, i2);
            b.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            declaredField3.set(obj, new Drawable[]{b, b});
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo29601a() {
        this.f24823a.setVisibility(0);
        mo29559d(this.f24827a.f34985q);
    }

    /* renamed from: b */
    public void mo29602b() {
        mo29618h();
        mo29622n(this.f24827a);
        this.f24826a.mo29612a();
    }

    /* renamed from: c */
    public void mo29603c() {
        View focusedChild = this.f24823a.getFocusedChild();
        if (focusedChild != null) {
            pv4.m61671k(focusedChild);
        }
        this.f24823a.setVisibility(8);
    }

    /* renamed from: d */
    public void mo29559d(int i) {
        this.f24827a.f34985q = i;
        boolean z = true;
        this.f24825a.setChecked(i == 12);
        ChipTextInputComboView chipTextInputComboView = this.f24830b;
        if (i != 10) {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
        mo29624p();
    }

    /* renamed from: g */
    public void mo29604g() {
        mo29622n(this.f24827a);
    }

    /* renamed from: h */
    public final void mo29618h() {
        this.f24822a.addTextChangedListener(this.f24828b);
        this.f24829b.addTextChangedListener(this.f24821a);
    }

    /* renamed from: i */
    public void mo29619i() {
        this.f24825a.setChecked(false);
        this.f24830b.setChecked(false);
    }

    /* renamed from: k */
    public final void mo29620k() {
        this.f24822a.removeTextChangedListener(this.f24828b);
        this.f24829b.removeTextChangedListener(this.f24821a);
    }

    /* renamed from: l */
    public void mo29621l() {
        boolean z = true;
        this.f24825a.setChecked(this.f24827a.f34985q == 12);
        ChipTextInputComboView chipTextInputComboView = this.f24830b;
        if (this.f24827a.f34985q != 10) {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
    }

    /* renamed from: n */
    public final void mo29622n(sd4 sd4) {
        mo29620k();
        Locale locale = this.f24823a.getResources().getConfiguration().locale;
        String format = String.format(locale, sd4.f34978b, new Object[]{Integer.valueOf(sd4.f34984p)});
        String format2 = String.format(locale, sd4.f34978b, new Object[]{Integer.valueOf(sd4.mo44282c())});
        this.f24825a.mo29490i(format);
        this.f24830b.mo29490i(format2);
        mo29618h();
        mo29624p();
    }

    /* renamed from: o */
    public final void mo29623o() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f24823a.findViewById(fd3.C2158h.material_clock_period_toggle);
        this.f24824a = materialButtonToggleGroup;
        materialButtonToggleGroup.mo11409b(new ce4(this));
        this.f24824a.setVisibility(0);
        mo29624p();
    }

    /* renamed from: p */
    public final void mo29624p() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f24824a;
        if (materialButtonToggleGroup != null) {
            materialButtonToggleGroup.mo11413e(this.f24827a.f34986r == 0 ? fd3.C2158h.material_clock_period_am_button : fd3.C2158h.material_clock_period_pm_button);
        }
    }
}
