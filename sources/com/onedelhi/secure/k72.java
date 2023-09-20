package com.onedelhi.secure;

import android.location.Location;

public final /* synthetic */ class k72 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Location f31117a;

    /* renamed from: a */
    public final /* synthetic */ s60 f31118a;

    public /* synthetic */ k72(s60 s60, Location location) {
        this.f31118a = s60;
        this.f31117a = location;
    }

    public final void run() {
        this.f31118a.accept(this.f31117a);
    }
}
