package com.onedelhi.secure;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.google.android.gms.common.C1410R;

public class ve1 implements View.OnKeyListener {

    /* renamed from: a */
    public View f21733a;

    /* renamed from: b */
    public View f21734b;

    /* renamed from: c */
    public View f21735c;

    public ve1(View view, View view2, View view3) {
        this.f21733a = view;
        this.f21734b = view2;
        this.f21735c = view3;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (((EditText) this.f21733a).getText().toString().length() >= 1) {
            try {
                this.f21735c.requestFocus();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (keyEvent.getAction() != 0 || i != 67 || this.f21733a.getId() == C1410R.C1412id.edit_num_1 || !((EditText) this.f21733a).getText().toString().isEmpty()) {
            return false;
        }
        ((EditText) this.f21734b).setText("");
        this.f21734b.requestFocus();
        return true;
    }
}
