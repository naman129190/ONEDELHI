package com.onedelhi.secure;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.Preconditions;

public final class vd5 implements BaseImplementation.ResultHolder {

    /* renamed from: a */
    public final x94 f21731a;

    public vd5(x94 x94) {
        Preconditions.checkNotNull(x94);
        this.f21731a = x94;
    }

    public final void setFailedResult(@ts2 Status status) {
        if (status != null) {
            this.f21731a.mo26836b(new ApiException(status));
        }
    }

    public final /* synthetic */ void setResult(Object obj) {
        TaskUtil.setResultOrApiException((Status) obj, null, this.f21731a);
    }
}
