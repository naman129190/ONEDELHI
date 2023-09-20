package com.onedelhi.secure;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

public final class bz6 extends o66 {

    /* renamed from: a */
    public final /* synthetic */ x94 f10043a;

    public bz6(t07 t07, x94 x94) {
        this.f10043a = x94;
    }

    /* renamed from: d7 */
    public final void mo13870d7(Status status, boolean z) {
        TaskUtil.setResultOrApiException(status, Boolean.valueOf(z), this.f10043a);
    }
}
