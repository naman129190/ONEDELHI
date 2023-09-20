package com.onedelhi.secure;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.TaskApiCall;

public final class ub5 extends o04 {
    public ub5(Activity activity) {
        super(activity);
    }

    public ub5(Context context) {
        super(context);
    }

    /* renamed from: e */
    public final w94<Void> mo20828e(@ts2 String str) {
        return doWrite(TaskApiCall.builder().run(new s57(this, str)).setFeatures(ic5.f13584d).setMethodKey(1568).build());
    }

    /* renamed from: u */
    public final w94<Void> mo20829u() {
        return doWrite(TaskApiCall.builder().run(new c57(this)).setFeatures(ic5.f13583c).setMethodKey(1567).build());
    }
}
