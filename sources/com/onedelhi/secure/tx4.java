package com.onedelhi.secure;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final /* synthetic */ class tx4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ View f35836a;

    public /* synthetic */ tx4(View view) {
        this.f35836a = view;
    }

    public final void run() {
        ((InputMethodManager) this.f35836a.getContext().getSystemService("input_method")).showSoftInput(this.f35836a, 0);
    }
}
