package com.onedelhi.secure;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

public final class m65 extends p55 {

    /* renamed from: a */
    public final /* synthetic */ x94 f15933a;

    public m65(n65 n65, x94 x94) {
        this.f15933a = x94;
    }

    /* renamed from: y0 */
    public final void mo20133y0(Status status, PendingIntent pendingIntent) {
        TaskUtil.setResultOrApiException(status, pendingIntent, this.f15933a);
    }
}
