package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.onedelhi.secure.h53;
import com.onedelhi.secure.ni4;
import com.onedelhi.secure.sj3;
import com.onedelhi.secure.wu1;
import com.onedelhi.secure.xh4;

@sj3(api = 21)
public class JobInfoSchedulerService extends JobService {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m8710b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        ni4.m22861f(getApplicationContext());
        xh4.C3922a d = xh4.m31443a().mo23183b(string).mo23185d(h53.m16480b(i));
        if (string2 != null) {
            d.mo23184c(Base64.decode(string2, 0));
        }
        ni4.m22859c().mo21297e().mo16136v(d.mo23182a(), i2, new wu1(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
