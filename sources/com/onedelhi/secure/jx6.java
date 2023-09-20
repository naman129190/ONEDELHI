package com.onedelhi.secure;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

public final class jx6 extends vw5 {

    /* renamed from: a */
    public final /* synthetic */ x94 f14610a;

    public jx6(t07 t07, x94 x94) {
        this.f14610a = x94;
    }

    /* renamed from: f3 */
    public final void mo18718f3(Status status, int i) {
        TaskUtil.setResultOrApiException(status, Integer.valueOf(i), this.f14610a);
    }
}
