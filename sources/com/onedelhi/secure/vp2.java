package com.onedelhi.secure;

import android.app.Dialog;
import android.widget.RadioGroup;
import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class vp2 implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ Dialog f36614a;

    /* renamed from: a */
    public final /* synthetic */ RadioGroup f36615a;

    /* renamed from: a */
    public final /* synthetic */ rq2 f36616a;

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f36617a;

    public /* synthetic */ vp2(rq2 rq2, Dialog dialog, RadioGroup radioGroup, AtomicReference atomicReference) {
        this.f36616a = rq2;
        this.f36614a = dialog;
        this.f36615a = radioGroup;
        this.f36617a = atomicReference;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.f36616a.m26925W0(this.f36614a, this.f36615a, this.f36617a, radioGroup, i);
    }
}
