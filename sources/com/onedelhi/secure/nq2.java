package com.onedelhi.secure;

import android.app.Dialog;
import android.view.View;
import android.widget.Switch;
import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class nq2 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Dialog f32721a;

    /* renamed from: a */
    public final /* synthetic */ Switch f32722a;

    /* renamed from: a */
    public final /* synthetic */ rq2 f32723a;

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f32724a;

    /* renamed from: b */
    public final /* synthetic */ Switch f32725b;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f32726b;

    public /* synthetic */ nq2(rq2 rq2, Switch switchR, Switch switchR2, AtomicReference atomicReference, AtomicReference atomicReference2, Dialog dialog) {
        this.f32723a = rq2;
        this.f32722a = switchR;
        this.f32725b = switchR2;
        this.f32724a = atomicReference;
        this.f32726b = atomicReference2;
        this.f32721a = dialog;
    }

    public final void onClick(View view) {
        this.f32723a.m26927X0(this.f32722a, this.f32725b, this.f32724a, this.f32726b, this.f32721a, view);
    }
}
