package com.onedelhi.secure;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.RemoteCall;

public final /* synthetic */ class lc5 implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ PendingIntent f15293a;

    /* renamed from: a */
    public final /* synthetic */ b04 f15294a;

    /* renamed from: a */
    public final /* synthetic */ ge5 f15295a;

    public /* synthetic */ lc5(ge5 ge5, PendingIntent pendingIntent, b04 b04) {
        this.f15295a = ge5;
        this.f15293a = pendingIntent;
        this.f15294a = b04;
    }

    public final void accept(Object obj, Object obj2) {
        ge5 ge5 = this.f15295a;
        ((tv6) ((w56) obj).getService()).mo14874S1(this.f15293a, this.f15294a, new jd5(ge5, (x94) obj2));
    }
}
