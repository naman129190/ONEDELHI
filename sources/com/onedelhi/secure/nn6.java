package com.onedelhi.secure;

import android.app.job.JobParameters;

public final /* synthetic */ class nn6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ JobParameters f17489a;

    /* renamed from: a */
    public final /* synthetic */ a56 f17490a;

    /* renamed from: a */
    public final /* synthetic */ vn6 f17491a;

    public /* synthetic */ nn6(vn6 vn6, a56 a56, JobParameters jobParameters) {
        this.f17491a = vn6;
        this.f17490a = a56;
        this.f17489a = jobParameters;
    }

    public final void run() {
        this.f17491a.mo26180d(this.f17490a, this.f17489a);
    }
}
