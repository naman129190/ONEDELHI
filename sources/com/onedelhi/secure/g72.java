package com.onedelhi.secure;

import android.location.Location;

public final /* synthetic */ class g72 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Location f28996a;

    /* renamed from: a */
    public final /* synthetic */ s60 f28997a;

    public /* synthetic */ g72(s60 s60, Location location) {
        this.f28997a = s60;
        this.f28996a = location;
    }

    public final void run() {
        this.f28997a.accept(this.f28996a);
    }
}
