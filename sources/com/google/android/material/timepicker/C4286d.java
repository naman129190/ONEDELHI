package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.onedelhi.secure.sd4;

/* renamed from: com.google.android.material.timepicker.d */
public class C4286d implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* renamed from: a */
    public final ChipTextInputComboView f24817a;

    /* renamed from: a */
    public final sd4 f24818a;

    /* renamed from: b */
    public final ChipTextInputComboView f24819b;

    /* renamed from: b */
    public boolean f24820b = false;

    public C4286d(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, sd4 sd4) {
        this.f24817a = chipTextInputComboView;
        this.f24819b = chipTextInputComboView2;
        this.f24818a = sd4;
    }

    /* renamed from: a */
    public void mo29612a() {
        TextInputLayout e = this.f24817a.mo29486e();
        TextInputLayout e2 = this.f24819b.mo29486e();
        EditText editText = e.getEditText();
        EditText editText2 = e2.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(this);
        editText.setOnKeyListener(this);
        editText2.setOnKeyListener(this);
    }

    /* renamed from: b */
    public final void mo29613b(int i) {
        boolean z = true;
        this.f24819b.setChecked(i == 12);
        ChipTextInputComboView chipTextInputComboView = this.f24817a;
        if (i != 10) {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
        this.f24818a.f34985q = i;
    }

    /* renamed from: c */
    public final boolean mo29614c(int i, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (!(i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2)) {
            return false;
        }
        mo29613b(12);
        return true;
    }

    /* renamed from: d */
    public final boolean mo29615d(int i, KeyEvent keyEvent, EditText editText) {
        if (!(i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText()))) {
            return false;
        }
        mo29613b(10);
        return true;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = i == 5;
        if (z) {
            mo29613b(12);
        }
        return z;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.f24820b) {
            return false;
        }
        this.f24820b = true;
        EditText editText = (EditText) view;
        boolean d = this.f24818a.f34985q == 12 ? mo29615d(i, keyEvent, editText) : mo29614c(i, keyEvent, editText);
        this.f24820b = false;
        return d;
    }
}
