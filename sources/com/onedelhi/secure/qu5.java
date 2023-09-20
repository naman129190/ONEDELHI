package com.onedelhi.secure;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;

public final class qu5 extends mx6 {

    /* renamed from: a */
    public final /* synthetic */ x94 f19479a;

    public qu5(xx5 xx5, x94 x94) {
        this.f19479a = x94;
    }

    /* renamed from: Z6 */
    public final void mo15668Z6(Status status, Location location) {
        TaskUtil.setResultOrApiException(status, location, this.f19479a);
    }
}
