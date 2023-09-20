package com.onedelhi.secure;

import android.view.View;
import android.widget.EditText;

public final /* synthetic */ class le0<S> {
    /* renamed from: a */
    public static /* synthetic */ void m20527a(EditText[] editTextArr, View view, boolean z) {
        int length = editTextArr.length;
        int i = 0;
        while (i < length) {
            if (!editTextArr[i].hasFocus()) {
                i++;
            } else {
                return;
            }
        }
        pv4.m61671k(view);
    }

    /* renamed from: b */
    public static void m20528b(@mr2 EditText... editTextArr) {
        if (editTextArr.length != 0) {
            ke0 ke0 = new ke0(editTextArr);
            for (EditText onFocusChangeListener : editTextArr) {
                onFocusChangeListener.setOnFocusChangeListener(ke0);
            }
            pv4.m61677q(editTextArr[0]);
        }
    }
}
