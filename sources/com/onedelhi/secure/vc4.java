package com.onedelhi.secure;

import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public final /* synthetic */ class vc4 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f36482a;

    /* renamed from: a */
    public final /* synthetic */ Spinner f36483a;

    /* renamed from: a */
    public final /* synthetic */ id4 f36484a;

    /* renamed from: b */
    public final /* synthetic */ EditText f36485b;

    /* renamed from: c */
    public final /* synthetic */ EditText f36486c;

    public /* synthetic */ vc4(id4 id4, EditText editText, EditText editText2, EditText editText3, Spinner spinner) {
        this.f36484a = id4;
        this.f36482a = editText;
        this.f36485b = editText2;
        this.f36486c = editText3;
        this.f36483a = spinner;
    }

    public final void onClick(View view) {
        this.f36484a.m17448e0(this.f36482a, this.f36485b, this.f36486c, this.f36483a, view);
    }
}
