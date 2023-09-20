package com.onedelhi.secure;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

public final /* synthetic */ class i01 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f30045a;

    /* renamed from: a */
    public final /* synthetic */ Intent f30046a;

    public /* synthetic */ i01(Context context, Intent intent) {
        this.f30045a = context;
        this.f30046a = intent;
    }

    public final Object call() {
        return Integer.valueOf(tu3.m66209b().mo45321h(this.f30045a, this.f30046a));
    }
}
