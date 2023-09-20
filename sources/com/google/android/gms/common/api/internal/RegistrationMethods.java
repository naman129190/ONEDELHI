package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.C7277xt;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.x94;

@KeepForSdk
public class RegistrationMethods<A extends Api.AnyClient, L> {
    @mr2
    @KeepForSdk
    public final RegisterListenerMethod<A, L> register;
    @mr2
    public final UnregisterListenerMethod zaa;
    @mr2
    public final Runnable zab;

    @KeepForSdk
    public static class Builder<A extends Api.AnyClient, L> {
        /* access modifiers changed from: private */
        public RemoteCall zaa;
        /* access modifiers changed from: private */
        public RemoteCall zab;
        private Runnable zac = zacj.zaa;
        private ListenerHolder zad;
        private Feature[] zae;
        private boolean zaf = true;
        private int zag;

        private Builder() {
        }

        public /* synthetic */ Builder(zacm zacm) {
        }

        @mr2
        @KeepForSdk
        public RegistrationMethods<A, L> build() {
            boolean z = true;
            Preconditions.checkArgument(this.zaa != null, "Must set register function");
            Preconditions.checkArgument(this.zab != null, "Must set unregister function");
            if (this.zad == null) {
                z = false;
            }
            Preconditions.checkArgument(z, "Must set holder");
            return new RegistrationMethods<>(new zack(this, this.zad, this.zae, this.zaf, this.zag), new zacl(this, (ListenerHolder.ListenerKey) Preconditions.checkNotNull(this.zad.getListenerKey(), "Key must not be null")), this.zac, (zacn) null);
        }

        @mr2
        @C7277xt
        @KeepForSdk
        public Builder<A, L> onConnectionSuspended(@mr2 Runnable runnable) {
            this.zac = runnable;
            return this;
        }

        @mr2
        @C7277xt
        @KeepForSdk
        public Builder<A, L> register(@mr2 RemoteCall<A, x94<Void>> remoteCall) {
            this.zaa = remoteCall;
            return this;
        }

        @mr2
        @C7277xt
        @KeepForSdk
        public Builder<A, L> setAutoResolveMissingFeatures(boolean z) {
            this.zaf = z;
            return this;
        }

        @mr2
        @C7277xt
        @KeepForSdk
        public Builder<A, L> setFeatures(@mr2 Feature... featureArr) {
            this.zae = featureArr;
            return this;
        }

        @mr2
        @C7277xt
        @KeepForSdk
        public Builder<A, L> setMethodKey(int i) {
            this.zag = i;
            return this;
        }

        @mr2
        @C7277xt
        @KeepForSdk
        public Builder<A, L> unregister(@mr2 RemoteCall<A, x94<Boolean>> remoteCall) {
            this.zab = remoteCall;
            return this;
        }

        @mr2
        @C7277xt
        @KeepForSdk
        public Builder<A, L> withHolder(@mr2 ListenerHolder<L> listenerHolder) {
            this.zad = listenerHolder;
            return this;
        }
    }

    public /* synthetic */ RegistrationMethods(RegisterListenerMethod registerListenerMethod, UnregisterListenerMethod unregisterListenerMethod, Runnable runnable, zacn zacn) {
        this.register = registerListenerMethod;
        this.zaa = unregisterListenerMethod;
        this.zab = runnable;
    }

    @mr2
    @KeepForSdk
    public static <A extends Api.AnyClient, L> Builder<A, L> builder() {
        return new Builder<>((zacm) null);
    }
}
