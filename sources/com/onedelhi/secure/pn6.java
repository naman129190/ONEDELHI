package com.onedelhi.secure;

import android.content.Intent;

public final /* synthetic */ class pn6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Intent f18620a;

    /* renamed from: a */
    public final /* synthetic */ a56 f18621a;

    /* renamed from: a */
    public final /* synthetic */ vn6 f18622a;

    /* renamed from: n */
    public final /* synthetic */ int f18623n;

    public /* synthetic */ pn6(vn6 vn6, int i, a56 a56, Intent intent) {
        this.f18622a = vn6;
        this.f18623n = i;
        this.f18621a = a56;
        this.f18620a = intent;
    }

    public final void run() {
        this.f18622a.mo26179c(this.f18623n, this.f18621a, this.f18620a);
    }
}
