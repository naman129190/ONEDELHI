package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zada;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.common.util.VisibleForTesting;
import com.onedelhi.secure.C3042oa;
import com.onedelhi.secure.C7277xt;
import com.onedelhi.secure.a45;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ry3;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.yg1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

@Deprecated
public abstract class GoogleApiClient {
    @mr2
    @KeepForSdk
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;
    /* access modifiers changed from: private */
    @GuardedBy("sAllClients")
    public static final Set zaa = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public static final class Builder {
        @ts2
        private Account zaa;
        private final Set zab;
        private final Set zac;
        private int zad;
        private View zae;
        private String zaf;
        private String zag;
        private final Map zah;
        private final Context zai;
        private final Map zaj;
        private LifecycleActivity zak;
        private int zal;
        @ts2
        private OnConnectionFailedListener zam;
        private Looper zan;
        private GoogleApiAvailability zao;
        private Api.AbstractClientBuilder zap;
        private final ArrayList zaq;
        private final ArrayList zar;

        public Builder(@mr2 Context context) {
            this.zab = new HashSet();
            this.zac = new HashSet();
            this.zah = new C3042oa();
            this.zaj = new C3042oa();
            this.zal = -1;
            this.zao = GoogleApiAvailability.getInstance();
            this.zap = a45.f8734a;
            this.zaq = new ArrayList();
            this.zar = new ArrayList();
            this.zai = context;
            this.zan = context.getMainLooper();
            this.zaf = context.getPackageName();
            this.zag = context.getClass().getName();
        }

        public Builder(@mr2 Context context, @mr2 ConnectionCallbacks connectionCallbacks, @mr2 OnConnectionFailedListener onConnectionFailedListener) {
            this(context);
            Preconditions.checkNotNull(connectionCallbacks, "Must provide a connected listener");
            this.zaq.add(connectionCallbacks);
            Preconditions.checkNotNull(onConnectionFailedListener, "Must provide a connection failed listener");
            this.zar.add(onConnectionFailedListener);
        }

        private final void zab(Api api, @ts2 Api.ApiOptions apiOptions, Scope... scopeArr) {
            HashSet hashSet = new HashSet(((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(apiOptions));
            for (Scope add : scopeArr) {
                hashSet.add(add);
            }
            this.zah.put(api, new zab(hashSet));
        }

        @mr2
        @C7277xt
        public Builder addApi(@mr2 Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.zaj.put(api, (Object) null);
            List<Scope> impliedScopes = ((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(null);
            this.zac.addAll(impliedScopes);
            this.zab.addAll(impliedScopes);
            return this;
        }

        @mr2
        @C7277xt
        public <O extends Api.ApiOptions.HasOptions> Builder addApi(@mr2 Api<O> api, @mr2 O o) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.zaj.put(api, o);
            List<Scope> impliedScopes = ((Api.BaseClientBuilder) Preconditions.checkNotNull(api.zac(), "Base client builder must not be null")).getImpliedScopes(o);
            this.zac.addAll(impliedScopes);
            this.zab.addAll(impliedScopes);
            return this;
        }

        @mr2
        @C7277xt
        public <O extends Api.ApiOptions.HasOptions> Builder addApiIfAvailable(@mr2 Api<O> api, @mr2 O o, @mr2 Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            Preconditions.checkNotNull(o, "Null options are not permitted for this Api");
            this.zaj.put(api, o);
            zab(api, o, scopeArr);
            return this;
        }

        @mr2
        @C7277xt
        public <T extends Api.ApiOptions.NotRequiredOptions> Builder addApiIfAvailable(@mr2 Api<? extends Api.ApiOptions.NotRequiredOptions> api, @mr2 Scope... scopeArr) {
            Preconditions.checkNotNull(api, "Api must not be null");
            this.zaj.put(api, (Object) null);
            zab(api, (Api.ApiOptions) null, scopeArr);
            return this;
        }

        @mr2
        @C7277xt
        public Builder addConnectionCallbacks(@mr2 ConnectionCallbacks connectionCallbacks) {
            Preconditions.checkNotNull(connectionCallbacks, "Listener must not be null");
            this.zaq.add(connectionCallbacks);
            return this;
        }

        @mr2
        @C7277xt
        public Builder addOnConnectionFailedListener(@mr2 OnConnectionFailedListener onConnectionFailedListener) {
            Preconditions.checkNotNull(onConnectionFailedListener, "Listener must not be null");
            this.zar.add(onConnectionFailedListener);
            return this;
        }

        @mr2
        @C7277xt
        public Builder addScope(@mr2 Scope scope) {
            Preconditions.checkNotNull(scope, "Scope must not be null");
            this.zab.add(scope);
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: com.google.android.gms.common.api.Api} */
        /* JADX WARNING: Multi-variable type inference failed */
        @com.onedelhi.secure.mr2
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.android.gms.common.api.GoogleApiClient build() {
            /*
                r22 = this;
                r1 = r22
                java.util.Map r0 = r1.zaj
                boolean r0 = r0.isEmpty()
                r2 = 1
                r0 = r0 ^ r2
                java.lang.String r3 = "must call addApi() to add at least one API"
                com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r3)
                com.google.android.gms.common.internal.ClientSettings r0 = r22.zaa()
                java.util.Map r3 = r0.zad()
                com.onedelhi.secure.oa r11 = new com.onedelhi.secure.oa
                r11.<init>()
                com.onedelhi.secure.oa r14 = new com.onedelhi.secure.oa
                r14.<init>()
                java.util.ArrayList r15 = new java.util.ArrayList
                r15.<init>()
                java.util.Map r4 = r1.zaj
                java.util.Set r4 = r4.keySet()
                java.util.Iterator r12 = r4.iterator()
                r13 = 0
                r4 = 0
                r16 = r4
                r17 = 0
            L_0x0036:
                boolean r4 = r12.hasNext()
                if (r4 == 0) goto L_0x00c1
                java.lang.Object r4 = r12.next()
                r10 = r4
                com.google.android.gms.common.api.Api r10 = (com.google.android.gms.common.api.Api) r10
                java.util.Map r4 = r1.zaj
                java.lang.Object r18 = r4.get(r10)
                java.lang.Object r4 = r3.get(r10)
                if (r4 == 0) goto L_0x0051
                r4 = 1
                goto L_0x0052
            L_0x0051:
                r4 = 0
            L_0x0052:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
                r11.put(r10, r5)
                com.google.android.gms.common.api.internal.zat r9 = new com.google.android.gms.common.api.internal.zat
                r9.<init>(r10, r4)
                r15.add(r9)
                com.google.android.gms.common.api.Api$AbstractClientBuilder r4 = r10.zaa()
                java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
                r19 = r4
                com.google.android.gms.common.api.Api$AbstractClientBuilder r19 = (com.google.android.gms.common.api.Api.AbstractClientBuilder) r19
                android.content.Context r5 = r1.zai
                android.os.Looper r6 = r1.zan
                r4 = r19
                r7 = r0
                r8 = r18
                r20 = r9
                r21 = r10
                r10 = r20
                com.google.android.gms.common.api.Api$Client r4 = r4.buildClient((android.content.Context) r5, (android.os.Looper) r6, (com.google.android.gms.common.internal.ClientSettings) r7, r8, (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) r9, (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) r10)
                com.google.android.gms.common.api.Api$AnyClientKey r5 = r21.zab()
                r14.put(r5, r4)
                int r5 = r19.getPriority()
                if (r5 != r2) goto L_0x0094
                if (r18 == 0) goto L_0x0092
                r17 = 1
                goto L_0x0094
            L_0x0092:
                r17 = 0
            L_0x0094:
                boolean r4 = r4.providesSignIn()
                if (r4 == 0) goto L_0x0036
                if (r16 != 0) goto L_0x009f
                r16 = r21
                goto L_0x0036
            L_0x009f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = r21.zad()
                java.lang.String r3 = r16.zad()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                java.lang.String r2 = " cannot be used with "
                r4.append(r2)
                r4.append(r3)
                java.lang.String r2 = r4.toString()
                r0.<init>(r2)
                throw r0
            L_0x00c1:
                if (r16 == 0) goto L_0x010f
                if (r17 != 0) goto L_0x00ef
                android.accounts.Account r3 = r1.zaa
                if (r3 != 0) goto L_0x00cb
                r3 = 1
                goto L_0x00cc
            L_0x00cb:
                r3 = 0
            L_0x00cc:
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = r16.zad()
                r4[r13] = r5
                java.lang.String r5 = "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead"
                com.google.android.gms.common.internal.Preconditions.checkState(r3, r5, r4)
                java.util.Set r3 = r1.zab
                java.util.Set r4 = r1.zac
                boolean r3 = r3.equals(r4)
                java.lang.Object[] r4 = new java.lang.Object[r2]
                java.lang.String r5 = r16.zad()
                r4[r13] = r5
                java.lang.String r5 = "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead."
                com.google.android.gms.common.internal.Preconditions.checkState(r3, r5, r4)
                goto L_0x010f
            L_0x00ef:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = r16.zad()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "With using "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = ", GamesOptions can only be specified within GoogleSignInOptions.Builder"
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r0.<init>(r2)
                throw r0
            L_0x010f:
                java.util.Collection r3 = r14.values()
                int r16 = com.google.android.gms.common.api.internal.zabe.zad(r3, r2)
                com.google.android.gms.common.api.internal.zabe r2 = new com.google.android.gms.common.api.internal.zabe
                android.content.Context r5 = r1.zai
                java.util.concurrent.locks.ReentrantLock r6 = new java.util.concurrent.locks.ReentrantLock
                r6.<init>()
                android.os.Looper r7 = r1.zan
                com.google.android.gms.common.GoogleApiAvailability r9 = r1.zao
                com.google.android.gms.common.api.Api$AbstractClientBuilder r10 = r1.zap
                java.util.ArrayList r12 = r1.zaq
                java.util.ArrayList r13 = r1.zar
                int r3 = r1.zal
                r4 = r2
                r8 = r0
                r0 = r15
                r15 = r3
                r17 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                java.util.Set r3 = com.google.android.gms.common.api.GoogleApiClient.zaa
                monitor-enter(r3)
                java.util.Set r0 = com.google.android.gms.common.api.GoogleApiClient.zaa     // Catch:{ all -> 0x0154 }
                r0.add(r2)     // Catch:{ all -> 0x0154 }
                monitor-exit(r3)     // Catch:{ all -> 0x0154 }
                int r0 = r1.zal
                if (r0 < 0) goto L_0x0153
                com.google.android.gms.common.api.internal.LifecycleActivity r0 = r1.zak
                com.google.android.gms.common.api.internal.zak r0 = com.google.android.gms.common.api.internal.zak.zaa(r0)
                int r3 = r1.zal
                com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener r4 = r1.zam
                r0.zad(r3, r2, r4)
            L_0x0153:
                return r2
            L_0x0154:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0154 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApiClient.Builder.build():com.google.android.gms.common.api.GoogleApiClient");
        }

        @mr2
        public Builder enableAutoManage(@mr2 FragmentActivity fragmentActivity, int i, @ts2 OnConnectionFailedListener onConnectionFailedListener) {
            LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) fragmentActivity);
            Preconditions.checkArgument(i >= 0, "clientId must be non-negative");
            this.zal = i;
            this.zam = onConnectionFailedListener;
            this.zak = lifecycleActivity;
            return this;
        }

        @mr2
        public Builder enableAutoManage(@mr2 FragmentActivity fragmentActivity, @ts2 OnConnectionFailedListener onConnectionFailedListener) {
            enableAutoManage(fragmentActivity, 0, onConnectionFailedListener);
            return this;
        }

        @mr2
        @C7277xt
        public Builder setAccountName(@mr2 String str) {
            this.zaa = str == null ? null : new Account(str, "com.google");
            return this;
        }

        @mr2
        @C7277xt
        public Builder setGravityForPopups(int i) {
            this.zad = i;
            return this;
        }

        @mr2
        @C7277xt
        public Builder setHandler(@mr2 Handler handler) {
            Preconditions.checkNotNull(handler, "Handler must not be null");
            this.zan = handler.getLooper();
            return this;
        }

        @mr2
        @C7277xt
        public Builder setViewForPopups(@mr2 View view) {
            Preconditions.checkNotNull(view, "View must not be null");
            this.zae = view;
            return this;
        }

        @mr2
        public Builder useDefaultAccount() {
            setAccountName("<<default account>>");
            return this;
        }

        @mr2
        @VisibleForTesting
        public final ClientSettings zaa() {
            ry3 ry3 = ry3.f20125a;
            Map map = this.zaj;
            Api api = a45.f8736a;
            if (map.containsKey(api)) {
                ry3 = (ry3) this.zaj.get(api);
            }
            return new ClientSettings(this.zaa, this.zab, this.zah, this.zad, this.zae, this.zaf, this.zag, ry3, false);
        }
    }

    @Deprecated
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;
    }

    @Deprecated
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    public static void dumpAll(@mr2 String str, @mr2 FileDescriptor fileDescriptor, @mr2 PrintWriter printWriter, @mr2 String[] strArr) {
        Set<GoogleApiClient> set = zaa;
        synchronized (set) {
            String str2 = str + yg1.C3999a.f23084c;
            int i = 0;
            for (GoogleApiClient dump : set) {
                printWriter.append(str).append("GoogleApiClient#").println(i);
                dump.dump(str2, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    @mr2
    @KeepForSdk
    public static Set<GoogleApiClient> getAllClients() {
        Set<GoogleApiClient> set = zaa;
        synchronized (set) {
        }
        return set;
    }

    @mr2
    public abstract ConnectionResult blockingConnect();

    @mr2
    public abstract ConnectionResult blockingConnect(long j, @mr2 TimeUnit timeUnit);

    @mr2
    public abstract PendingResult<Status> clearDefaultAccountAndReconnect();

    public abstract void connect();

    public void connect(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract void disconnect();

    public abstract void dump(@mr2 String str, @mr2 FileDescriptor fileDescriptor, @mr2 PrintWriter printWriter, @mr2 String[] strArr);

    @mr2
    @KeepForSdk
    public <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@mr2 T t) {
        throw new UnsupportedOperationException();
    }

    @mr2
    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@mr2 T t) {
        throw new UnsupportedOperationException();
    }

    @mr2
    @KeepForSdk
    public <C extends Api.Client> C getClient(@mr2 Api.AnyClientKey<C> anyClientKey) {
        throw new UnsupportedOperationException();
    }

    @mr2
    public abstract ConnectionResult getConnectionResult(@mr2 Api<?> api);

    @mr2
    @KeepForSdk
    public Context getContext() {
        throw new UnsupportedOperationException();
    }

    @mr2
    @KeepForSdk
    public Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public boolean hasApi(@mr2 Api<?> api) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean hasConnectedApi(@mr2 Api<?> api);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(@mr2 ConnectionCallbacks connectionCallbacks);

    public abstract boolean isConnectionFailedListenerRegistered(@mr2 OnConnectionFailedListener onConnectionFailedListener);

    @KeepForSdk
    public boolean maybeSignIn(@mr2 SignInConnectionListener signInConnectionListener) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk
    public void maybeSignOut() {
        throw new UnsupportedOperationException();
    }

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(@mr2 ConnectionCallbacks connectionCallbacks);

    public abstract void registerConnectionFailedListener(@mr2 OnConnectionFailedListener onConnectionFailedListener);

    @mr2
    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(@mr2 L l) {
        throw new UnsupportedOperationException();
    }

    public abstract void stopAutoManage(@mr2 FragmentActivity fragmentActivity);

    public abstract void unregisterConnectionCallbacks(@mr2 ConnectionCallbacks connectionCallbacks);

    public abstract void unregisterConnectionFailedListener(@mr2 OnConnectionFailedListener onConnectionFailedListener);

    public void zao(zada zada) {
        throw new UnsupportedOperationException();
    }

    public void zap(zada zada) {
        throw new UnsupportedOperationException();
    }
}
