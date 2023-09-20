package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textview.MaterialTextView;
import com.onedelhi.secure.C3767v8;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

public class MaterialComponentsViewInflater extends C3767v8 {
    @mr2
    /* renamed from: c */
    public AppCompatAutoCompleteTextView mo25881c(@mr2 Context context, @ts2 AttributeSet attributeSet) {
        return new MaterialAutoCompleteTextView(context, attributeSet);
    }

    @mr2
    /* renamed from: d */
    public AppCompatButton mo25882d(@mr2 Context context, @mr2 AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @mr2
    /* renamed from: e */
    public AppCompatCheckBox mo25883e(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @mr2
    /* renamed from: k */
    public AppCompatRadioButton mo25889k(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @mr2
    /* renamed from: o */
    public AppCompatTextView mo25893o(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
