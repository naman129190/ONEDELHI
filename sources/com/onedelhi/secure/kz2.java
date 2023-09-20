package com.onedelhi.secure;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.C4258a;
import com.onedelhi.secure.fd3;

public class kz2 extends ju0 {

    /* renamed from: a */
    public int f31503a = fd3.C2157g.design_password_eye;

    /* renamed from: a */
    public final View.OnClickListener f31504a = new jz2(this);
    @ts2

    /* renamed from: a */
    public EditText f31505a;

    public kz2(@mr2 C4258a aVar, @dp0 int i) {
        super(aVar);
        if (i != 0) {
            this.f31503a = i;
        }
    }

    /* renamed from: x */
    public static boolean m55152x(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m55153y(View view) {
        PasswordTransformationMethod passwordTransformationMethod;
        EditText editText;
        EditText editText2 = this.f31505a;
        if (editText2 != null) {
            int selectionEnd = editText2.getSelectionEnd();
            if (mo39610w()) {
                editText = this.f31505a;
                passwordTransformationMethod = null;
            } else {
                editText = this.f31505a;
                passwordTransformationMethod = PasswordTransformationMethod.getInstance();
            }
            editText.setTransformationMethod(passwordTransformationMethod);
            if (selectionEnd >= 0) {
                this.f31505a.setSelection(selectionEnd);
            }
            mo38913r();
        }
    }

    /* renamed from: b */
    public void mo38910b(CharSequence charSequence, int i, int i2, int i3) {
        mo38913r();
    }

    @e54
    /* renamed from: c */
    public int mo31984c() {
        return fd3.C2163m.password_toggle_content_description;
    }

    @dp0
    /* renamed from: d */
    public int mo31985d() {
        return this.f31503a;
    }

    /* renamed from: f */
    public View.OnClickListener mo31987f() {
        return this.f31504a;
    }

    /* renamed from: l */
    public boolean mo31992l() {
        return true;
    }

    /* renamed from: m */
    public boolean mo31993m() {
        return !mo39610w();
    }

    /* renamed from: n */
    public void mo31994n(@ts2 EditText editText) {
        this.f31505a = editText;
        mo38913r();
    }

    /* renamed from: s */
    public void mo31997s() {
        if (m55152x(this.f31505a)) {
            this.f31505a.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* renamed from: u */
    public void mo31999u() {
        EditText editText = this.f31505a;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* renamed from: w */
    public final boolean mo39610w() {
        EditText editText = this.f31505a;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
