package com.onedelhi.secure;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

public final class au5 extends np6 {

    /* renamed from: a */
    public final /* synthetic */ x94 f9536a;

    public au5(x94 x94) {
        this.f9536a = x94;
    }

    /* renamed from: N2 */
    public final void mo13287N2(int i, PendingIntent pendingIntent) {
        TaskUtil.setResultOrApiException(new Status(tf1.m28381a(i)), this.f9536a);
    }

    /* renamed from: p5 */
    public final void mo13288p5(int i, String[] strArr) {
        TaskUtil.setResultOrApiException(new Status(tf1.m28381a(i)), this.f9536a);
    }

    /* renamed from: r3 */
    public final void mo13289r3(int i, String[] strArr) {
        TaskUtil.setResultOrApiException(new Status(tf1.m28381a(i)), this.f9536a);
    }
}
