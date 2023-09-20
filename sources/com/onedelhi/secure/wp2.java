package com.onedelhi.secure;

import android.app.Dialog;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class wp2 implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ Dialog f37071a;

    /* renamed from: a */
    public final /* synthetic */ LinearLayout f37072a;

    /* renamed from: a */
    public final /* synthetic */ RadioGroup f37073a;

    /* renamed from: a */
    public final /* synthetic */ rq2 f37074a;

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f37075a;

    /* renamed from: b */
    public final /* synthetic */ LinearLayout f37076b;

    /* renamed from: b */
    public final /* synthetic */ RadioGroup f37077b;

    /* renamed from: c */
    public final /* synthetic */ LinearLayout f37078c;

    public /* synthetic */ wp2(rq2 rq2, Dialog dialog, RadioGroup radioGroup, AtomicReference atomicReference, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, RadioGroup radioGroup2) {
        this.f37074a = rq2;
        this.f37071a = dialog;
        this.f37073a = radioGroup;
        this.f37075a = atomicReference;
        this.f37072a = linearLayout;
        this.f37076b = linearLayout2;
        this.f37078c = linearLayout3;
        this.f37077b = radioGroup2;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.f37074a.m26923V0(this.f37071a, this.f37073a, this.f37075a, this.f37072a, this.f37076b, this.f37078c, this.f37077b, radioGroup, i);
    }
}
