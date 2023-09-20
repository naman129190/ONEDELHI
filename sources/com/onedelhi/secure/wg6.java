package com.onedelhi.secure;

import java.util.concurrent.atomic.AtomicReference;

public final class wg6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ri6 f22125a;

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f22126a;

    /* renamed from: b */
    public final /* synthetic */ String f22127b;

    /* renamed from: b */
    public final /* synthetic */ boolean f22128b;

    /* renamed from: c */
    public final /* synthetic */ String f22129c;

    public wg6(ri6 ri6, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f22125a = ri6;
        this.f22126a = atomicReference;
        this.f22127b = str2;
        this.f22129c = str3;
        this.f22128b = z;
    }

    public final void run() {
        this.f22125a.f11205a.mo27869L().mo22009X(this.f22126a, (String) null, this.f22127b, this.f22129c, this.f22128b);
    }
}
