package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.onedelhi.secure.C7277xt;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.x94;

@KeepForSdk
public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {
    @ts2
    private final Feature[] zaa;
    private final boolean zab;
    private final int zac;

    @KeepForSdk
    public static class Builder<A extends Api.AnyClient, ResultT> {
        /* access modifiers changed from: private */
        public RemoteCall zaa;
        private boolean zab = true;
        private Feature[] zac;
        private int zad = 0;

        private Builder() {
        }

        public /* synthetic */ Builder(zacw zacw) {
        }

        @mr2
        @KeepForSdk
        public TaskApiCall<A, ResultT> build() {
            Preconditions.checkArgument(this.zaa != null, "execute parameter required");
            return new zacv(this, this.zac, this.zab, this.zad);
        }

        @mr2
        @C7277xt
        @KeepForSdk
        @Deprecated
        public Builder<A, ResultT> execute(@mr2 BiConsumer<A, x94<ResultT>> biConsumer) {
            this.zaa = new zacu(biConsumer);
            return this;
        }

        @mr2
        @C7277xt
        @KeepForSdk
        public Builder<A, ResultT> run(@mr2 RemoteCall<A, x94<ResultT>> remoteCall) {
            this.zaa = remoteCall;
            return this;
        }

        @mr2
        @C7277xt
        @KeepForSdk
        public Builder<A, ResultT> setAutoResolveMissingFeatures(boolean z) {
            this.zab = z;
            return this;
        }

        @mr2
        @C7277xt
        @KeepForSdk
        public Builder<A, ResultT> setFeatures(@mr2 Feature... featureArr) {
            this.zac = featureArr;
            return this;
        }

        @mr2
        @C7277xt
        @KeepForSdk
        public Builder<A, ResultT> setMethodKey(int i) {
            this.zad = i;
            return this;
        }
    }

    @KeepForSdk
    @Deprecated
    public TaskApiCall() {
        this.zaa = null;
        this.zab = false;
        this.zac = 0;
    }

    @KeepForSdk
    public TaskApiCall(@ts2 Feature[] featureArr, boolean z, int i) {
        this.zaa = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.zab = z2;
        this.zac = i;
    }

    @mr2
    @KeepForSdk
    public static <A extends Api.AnyClient, ResultT> Builder<A, ResultT> builder() {
        return new Builder<>((zacw) null);
    }

    @KeepForSdk
    public abstract void doExecute(@mr2 A a, @mr2 x94<ResultT> x94) throws RemoteException;

    @KeepForSdk
    public boolean shouldAutoResolveMissingFeatures() {
        return this.zab;
    }

    public final int zaa() {
        return this.zac;
    }

    @ts2
    public final Feature[] zab() {
        return this.zaa;
    }
}
