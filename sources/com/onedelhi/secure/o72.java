package com.onedelhi.secure;

import com.onedelhi.secure.i72;
import java.util.concurrent.Executor;

public final /* synthetic */ class o72 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ i72.C2411i f32895a;

    /* renamed from: a */
    public final /* synthetic */ Executor f32896a;

    /* renamed from: n */
    public final /* synthetic */ int f32897n;

    public /* synthetic */ o72(i72.C2411i iVar, Executor executor, int i) {
        this.f32895a = iVar;
        this.f32896a = executor;
        this.f32897n = i;
    }

    public final void run() {
        this.f32895a.m17296g(this.f32896a, this.f32897n);
    }
}
