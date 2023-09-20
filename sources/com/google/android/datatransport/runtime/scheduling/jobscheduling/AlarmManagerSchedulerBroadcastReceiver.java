package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.onedelhi.secure.C5960l4;
import com.onedelhi.secure.h53;
import com.onedelhi.secure.ni4;
import com.onedelhi.secure.xh4;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: b */
    public static /* synthetic */ void m8708b() {
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        ni4.m22861f(context);
        xh4.C3922a d = xh4.m31443a().mo23183b(queryParameter).mo23185d(h53.m16480b(intValue));
        if (queryParameter2 != null) {
            d.mo23184c(Base64.decode(queryParameter2, 0));
        }
        ni4.m22859c().mo21297e().mo16136v(d.mo23182a(), i, C5960l4.f31541a);
    }
}
