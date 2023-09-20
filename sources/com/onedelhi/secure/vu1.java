package com.onedelhi.secure;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

@sj3(api = 21)
public class vu1 implements ky4 {

    /* renamed from: a */
    public static final String f21960a = "JobInfoScheduler";

    /* renamed from: b */
    public static final String f21961b = "attemptNumber";

    /* renamed from: c */
    public static final String f21962c = "backendName";

    /* renamed from: d */
    public static final String f21963d = "priority";

    /* renamed from: e */
    public static final String f21964e = "extras";

    /* renamed from: a */
    public final Context f21965a;

    /* renamed from: a */
    public final aw0 f21966a;

    /* renamed from: a */
    public final pr3 f21967a;

    public vu1(Context context, aw0 aw0, pr3 pr3) {
        this.f21965a = context;
        this.f21966a = aw0;
        this.f21967a = pr3;
    }

    /* renamed from: a */
    public void mo18889a(xh4 xh4, int i) {
        mo18890b(xh4, i, false);
    }

    /* renamed from: b */
    public void mo18890b(xh4 xh4, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.f21965a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f21965a.getSystemService("jobscheduler");
        int c = mo26338c(xh4);
        if (z || !mo26339d(jobScheduler, c, i)) {
            long K1 = this.f21966a.mo13294K1(xh4);
            JobInfo.Builder c2 = this.f21967a.mo22611c(new JobInfo.Builder(c, componentName), xh4.mo23179d(), K1, i);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", xh4.mo23177b());
            persistableBundle.putInt("priority", h53.m16479a(xh4.mo23179d()));
            if (xh4.mo23178c() != null) {
                persistableBundle.putString("extras", Base64.encodeToString(xh4.mo23178c(), 0));
            }
            c2.setExtras(persistableBundle);
            r92.m26531e(f21960a, "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", xh4, Integer.valueOf(c), Long.valueOf(this.f21967a.mo22613h(xh4.mo23179d(), K1, i)), Long.valueOf(K1), Integer.valueOf(i));
            jobScheduler.schedule(c2.build());
            return;
        }
        r92.m26529c(f21960a, "Upload for context %s is already scheduled. Returning...", xh4);
    }

    @hw4
    /* renamed from: c */
    public int mo26338c(xh4 xh4) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f21965a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(xh4.mo23177b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(h53.m16479a(xh4.mo23179d())).array());
        if (xh4.mo23178c() != null) {
            adler32.update(xh4.mo23178c());
        }
        return (int) adler32.getValue();
    }

    /* renamed from: d */
    public final boolean mo26339d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i3 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }
}
