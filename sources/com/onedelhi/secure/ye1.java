package com.onedelhi.secure;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.google.android.gms.common.C1410R;

public class ye1 implements TextWatcher {

    /* renamed from: a */
    public View f23026a;

    /* renamed from: b */
    public View f23027b;

    public ye1(View view, View view2) {
        this.f23026a = view;
        this.f23027b = view2;
    }

    @SuppressLint({"NonConstantResourceId"})
    public void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        switch (this.f23026a.getId()) {
            case C1410R.C1412id.edit_num_1:
            case C1410R.C1412id.edit_num_2:
            case C1410R.C1412id.edit_num_3:
                if (obj.length() == 1) {
                    this.f23027b.requestFocus();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i3 >= 1) {
            this.f23027b.requestFocus();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i3 >= 1) {
            this.f23027b.requestFocus();
        }
    }
}
