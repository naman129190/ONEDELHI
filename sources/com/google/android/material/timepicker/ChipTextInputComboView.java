package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.onedelhi.secure.C3884x1;
import com.onedelhi.secure.fd3;
import com.onedelhi.secure.jt4;
import com.onedelhi.secure.mb4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.pv4;
import com.onedelhi.secure.sd4;
import com.onedelhi.secure.ts2;
import java.util.Arrays;

class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a */
    public TextWatcher f24695a;

    /* renamed from: a */
    public final EditText f24696a;

    /* renamed from: a */
    public TextView f24697a;

    /* renamed from: a */
    public final Chip f24698a;

    /* renamed from: a */
    public final TextInputLayout f24699a;

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$b */
    public class C4264b extends mb4 {

        /* renamed from: b */
        public static final String f24700b = "00";

        public C4264b() {
        }

        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f24698a.setText(ChipTextInputComboView.this.mo29485d("00"));
            } else {
                ChipTextInputComboView.this.f24698a.setText(ChipTextInputComboView.this.mo29485d(editable));
            }
        }
    }

    public ChipTextInputComboView(@mr2 Context context) {
        this(context, (AttributeSet) null);
    }

    public ChipTextInputComboView(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(@mr2 Context context, @ts2 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(fd3.C2161k.material_time_chip, this, false);
        this.f24698a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(fd3.C2161k.material_time_input, this, false);
        this.f24699a = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f24696a = editText;
        editText.setVisibility(4);
        C4264b bVar = new C4264b();
        this.f24695a = bVar;
        editText.addTextChangedListener(bVar);
        mo29492j();
        addView(chip);
        addView(textInputLayout);
        this.f24697a = (TextView) findViewById(fd3.C2158h.material_label);
        editText.setId(jt4.m18855D());
        jt4.m18915U1(this.f24697a, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    /* renamed from: c */
    public void mo29484c(InputFilter inputFilter) {
        InputFilter[] filters = this.f24696a.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.f24696a.setFilters(inputFilterArr);
    }

    /* renamed from: d */
    public final String mo29485d(CharSequence charSequence) {
        return sd4.m64461a(getResources(), charSequence);
    }

    /* renamed from: e */
    public TextInputLayout mo29486e() {
        return this.f24699a;
    }

    /* renamed from: f */
    public void mo29487f(C3884x1 x1Var) {
        jt4.m18849B1(this.f24698a, x1Var);
    }

    /* renamed from: g */
    public void mo29488g(boolean z) {
        this.f24696a.setCursorVisible(z);
    }

    /* renamed from: h */
    public void mo29489h(CharSequence charSequence) {
        this.f24697a.setText(charSequence);
    }

    /* renamed from: i */
    public void mo29490i(CharSequence charSequence) {
        this.f24698a.setText(mo29485d(charSequence));
        if (!TextUtils.isEmpty(this.f24696a.getText())) {
            this.f24696a.removeTextChangedListener(this.f24695a);
            this.f24696a.setText((CharSequence) null);
            this.f24696a.addTextChangedListener(this.f24695a);
        }
    }

    public boolean isChecked() {
        return this.f24698a.isChecked();
    }

    /* renamed from: j */
    public final void mo29492j() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f24696a.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo29492j();
    }

    public void setChecked(boolean z) {
        this.f24698a.setChecked(z);
        int i = 0;
        this.f24696a.setVisibility(z ? 0 : 4);
        Chip chip = this.f24698a;
        if (z) {
            i = 8;
        }
        chip.setVisibility(i);
        if (isChecked()) {
            pv4.m61677q(this.f24696a);
            if (!TextUtils.isEmpty(this.f24696a.getText())) {
                EditText editText = this.f24696a;
                editText.setSelection(editText.getText().length());
            }
        }
    }

    public void setOnClickListener(@ts2 View.OnClickListener onClickListener) {
        this.f24698a.setOnClickListener(onClickListener);
    }

    public void setTag(int i, Object obj) {
        this.f24698a.setTag(i, obj);
    }

    public void toggle() {
        this.f24698a.toggle();
    }
}
