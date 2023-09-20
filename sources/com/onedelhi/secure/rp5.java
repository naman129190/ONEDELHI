package com.onedelhi.secure;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

public final /* synthetic */ class rp5 implements nu2 {

    /* renamed from: a */
    public final /* synthetic */ BaseImplementation.ResultHolder f19966a;

    public /* synthetic */ rp5(BaseImplementation.ResultHolder resultHolder) {
        this.f19966a = resultHolder;
    }

    public final void onComplete(w94 w94) {
        BaseImplementation.ResultHolder resultHolder = this.f19966a;
        if (w94.mo17590v()) {
            resultHolder.setResult(Status.RESULT_SUCCESS);
        } else if (w94.mo17588t()) {
            resultHolder.setFailedResult(Status.RESULT_CANCELED);
        } else {
            Exception q = w94.mo17585q();
            if (q instanceof ApiException) {
                resultHolder.setFailedResult(((ApiException) q).getStatus());
            } else {
                resultHolder.setFailedResult(Status.RESULT_INTERNAL_ERROR);
            }
        }
    }
}
