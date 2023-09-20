package com.google.android.gms.common.moduleinstall;

import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.onedelhi.secure.C7277xt;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class ModuleInstallRequest {
    private final List zaa;
    @ts2
    private final InstallStatusListener zab;
    @ts2
    private final Executor zac;
    private final boolean zad;

    public static class Builder {
        private final List zaa = new ArrayList();
        private boolean zab = true;
        @ts2
        private InstallStatusListener zac;
        @ts2
        private Executor zad;

        @mr2
        @C7277xt
        public Builder addApi(@mr2 OptionalModuleApi optionalModuleApi) {
            this.zaa.add(optionalModuleApi);
            return this;
        }

        @mr2
        public ModuleInstallRequest build() {
            return new ModuleInstallRequest(this.zaa, this.zac, this.zad, this.zab, (zac) null);
        }

        @mr2
        public Builder setListener(@mr2 InstallStatusListener installStatusListener) {
            return setListener(installStatusListener, (Executor) null);
        }

        @mr2
        @C7277xt
        public Builder setListener(@mr2 InstallStatusListener installStatusListener, @ts2 Executor executor) {
            this.zac = installStatusListener;
            this.zad = executor;
            return this;
        }
    }

    public /* synthetic */ ModuleInstallRequest(List list, InstallStatusListener installStatusListener, Executor executor, boolean z, zac zac2) {
        Preconditions.checkNotNull(list, "APIs must not be null.");
        Preconditions.checkArgument(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            Preconditions.checkNotNull(installStatusListener, "Listener must not be null when listener executor is set.");
        }
        this.zaa = list;
        this.zab = installStatusListener;
        this.zac = executor;
        this.zad = z;
    }

    @mr2
    public static Builder newBuilder() {
        return new Builder();
    }

    @mr2
    public List<OptionalModuleApi> getApis() {
        return this.zaa;
    }

    @ts2
    public InstallStatusListener getListener() {
        return this.zab;
    }

    @ts2
    public Executor getListenerExecutor() {
        return this.zac;
    }

    @ShowFirstParty
    public final boolean zaa() {
        return this.zad;
    }
}
