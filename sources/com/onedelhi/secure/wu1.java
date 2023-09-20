package com.onedelhi.secure;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

public final /* synthetic */ class wu1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ JobParameters f37117a;

    /* renamed from: a */
    public final /* synthetic */ JobInfoSchedulerService f37118a;

    public /* synthetic */ wu1(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f37118a = jobInfoSchedulerService;
        this.f37117a = jobParameters;
    }

    public final void run() {
        this.f37118a.m8710b(this.f37117a);
    }
}
