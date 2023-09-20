package com.onedelhi.secure;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;

public final /* synthetic */ class q04 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ View.OnClickListener f33879a;

    /* renamed from: a */
    public final /* synthetic */ Snackbar f33880a;

    public /* synthetic */ q04(Snackbar snackbar, View.OnClickListener onClickListener) {
        this.f33880a = snackbar;
        this.f33879a = onClickListener;
    }

    public final void onClick(View view) {
        this.f33880a.m33978z0(this.f33879a, view);
    }
}
