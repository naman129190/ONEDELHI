package com.onedelhi.secure;

import android.location.GnssStatus;
import com.onedelhi.secure.i72;
import java.util.concurrent.Executor;

public final /* synthetic */ class z72 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ GnssStatus f38229a;

    /* renamed from: a */
    public final /* synthetic */ i72.C2415m f38230a;

    /* renamed from: a */
    public final /* synthetic */ Executor f38231a;

    public /* synthetic */ z72(i72.C2415m mVar, Executor executor, GnssStatus gnssStatus) {
        this.f38230a = mVar;
        this.f38231a = executor;
        this.f38229a = gnssStatus;
    }

    public final void run() {
        this.f38230a.m17319f(this.f38231a, this.f38229a);
    }
}
