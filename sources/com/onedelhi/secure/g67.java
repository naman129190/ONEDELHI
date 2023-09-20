package com.onedelhi.secure;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

public final class g67 extends yh6 {

    /* renamed from: a */
    public final /* synthetic */ x94 f12455a;

    public g67(ub5 ub5, x94 x94) {
        this.f12455a = x94;
    }

    /* renamed from: Z3 */
    public final void mo16366Z3(Status status) {
        TaskUtil.setResultOrApiException(status, this.f12455a);
    }
}
