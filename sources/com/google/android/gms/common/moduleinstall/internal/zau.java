package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.x94;
import java.util.concurrent.atomic.AtomicReference;

final class zau extends zaa {
    public final /* synthetic */ AtomicReference zaa;
    public final /* synthetic */ x94 zab;
    public final /* synthetic */ InstallStatusListener zac;
    public final /* synthetic */ zay zad;

    public zau(zay zay, AtomicReference atomicReference, x94 x94, InstallStatusListener installStatusListener) {
        this.zad = zay;
        this.zaa = atomicReference;
        this.zab = x94;
        this.zac = installStatusListener;
    }

    public final void zad(Status status, @ts2 ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse != null) {
            this.zaa.set(moduleInstallResponse);
        }
        TaskUtil.trySetResultOrApiException(status, null, this.zab);
        if (!status.isSuccess() || (moduleInstallResponse != null && moduleInstallResponse.zaa())) {
            this.zad.doUnregisterEventListener(ListenerHolders.createListenerKey(this.zac, InstallStatusListener.class.getSimpleName()), 27306);
        }
    }
}
