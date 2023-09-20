package com.onedelhi.secure;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

public final class k96 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final /* synthetic */ qa6 f14797a;

    /* renamed from: a */
    public final String f14798a;

    public k96(qa6 qa6, String str) {
        this.f14797a = qa6;
        Preconditions.checkNotNull(str);
        this.f14798a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f14797a.f11205a.mo15136e().mo12726r().mo25380b(this.f14798a, th);
    }
}
