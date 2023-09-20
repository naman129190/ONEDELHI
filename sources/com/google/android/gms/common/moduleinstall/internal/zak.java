package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.onedelhi.secure.ha4;
import com.onedelhi.secure.r64;
import com.onedelhi.secure.w94;
import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class zak implements r64 {
    public final /* synthetic */ AtomicReference zaa;

    public /* synthetic */ zak(AtomicReference atomicReference) {
        this.zaa = atomicReference;
    }

    public final w94 then(Object obj) {
        AtomicReference atomicReference = this.zaa;
        Void voidR = (Void) obj;
        int i = zay.zab;
        return atomicReference.get() != null ? ha4.m16572g((ModuleInstallResponse) atomicReference.get()) : ha4.m16571f(new ApiException(Status.RESULT_INTERNAL_ERROR));
    }
}
