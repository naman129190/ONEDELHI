package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.C3042oa;
import com.onedelhi.secure.ar4;
import com.onedelhi.secure.c55;
import com.onedelhi.secure.h55;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.yg1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

final class zaaa implements zaca {
    private final Context zaa;
    private final zabe zab;
    private final Looper zac;
    /* access modifiers changed from: private */
    public final zabi zad;
    /* access modifiers changed from: private */
    public final zabi zae;
    private final Map zaf;
    private final Set zag = Collections.newSetFromMap(new WeakHashMap());
    @ts2
    private final Api.Client zah;
    @ts2
    private Bundle zai;
    /* access modifiers changed from: private */
    @ts2
    public ConnectionResult zaj = null;
    /* access modifiers changed from: private */
    @ts2
    public ConnectionResult zak = null;
    /* access modifiers changed from: private */
    public boolean zal = false;
    /* access modifiers changed from: private */
    public final Lock zam;
    @GuardedBy("mLock")
    private int zan = 0;

    private zaaa(Context context, zabe zabe, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, Map map2, ClientSettings clientSettings, Api.AbstractClientBuilder abstractClientBuilder, @ts2 Api.Client client, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.zaa = context;
        this.zab = zabe;
        this.zam = lock;
        this.zac = looper;
        this.zah = client;
        Context context2 = context;
        zabe zabe2 = zabe;
        Lock lock2 = lock;
        Looper looper2 = looper;
        GoogleApiAvailabilityLight googleApiAvailabilityLight2 = googleApiAvailabilityLight;
        zabi zabi = r3;
        zabi zabi2 = new zabi(context2, zabe2, lock2, looper2, googleApiAvailabilityLight2, map2, (ClientSettings) null, map4, (Api.AbstractClientBuilder) null, arrayList2, new zax(this, (zaw) null));
        this.zad = zabi;
        this.zae = new zabi(context2, zabe2, lock2, looper2, googleApiAvailabilityLight2, map, clientSettings, map3, abstractClientBuilder, arrayList, new zaz(this, (zay) null));
        C3042oa oaVar = new C3042oa();
        for (Api.AnyClientKey put : map2.keySet()) {
            oaVar.put(put, this.zad);
        }
        for (Api.AnyClientKey put2 : map.keySet()) {
            oaVar.put(put2, this.zae);
        }
        this.zaf = Collections.unmodifiableMap(oaVar);
    }

    @GuardedBy("mLock")
    private final void zaA(ConnectionResult connectionResult) {
        int i = this.zan;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.zan = 0;
            }
            this.zab.zaa(connectionResult);
        }
        zaB();
        this.zan = 0;
    }

    @GuardedBy("mLock")
    private final void zaB() {
        for (SignInConnectionListener onComplete : this.zag) {
            onComplete.onComplete();
        }
        this.zag.clear();
    }

    @GuardedBy("mLock")
    private final boolean zaC() {
        ConnectionResult connectionResult = this.zak;
        return connectionResult != null && connectionResult.getErrorCode() == 4;
    }

    private final boolean zaD(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        zabi zabi = (zabi) this.zaf.get(apiMethodImpl.getClientKey());
        Preconditions.checkNotNull(zabi, "GoogleApiClient is not configured to use the API required for this call.");
        return zabi.equals(this.zae);
    }

    private static boolean zaE(@ts2 ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.isSuccess();
    }

    public static zaaa zag(Context context, zabe zabe, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map map, ClientSettings clientSettings, Map map2, Api.AbstractClientBuilder abstractClientBuilder, ArrayList arrayList) {
        Map map3 = map2;
        C3042oa oaVar = new C3042oa();
        C3042oa oaVar2 = new C3042oa();
        Api.Client client = null;
        for (Map.Entry entry : map.entrySet()) {
            Api.Client client2 = (Api.Client) entry.getValue();
            if (true == client2.providesSignIn()) {
                client = client2;
            }
            boolean requiresSignIn = client2.requiresSignIn();
            Api.AnyClientKey anyClientKey = (Api.AnyClientKey) entry.getKey();
            if (requiresSignIn) {
                oaVar.put(anyClientKey, client2);
            } else {
                oaVar2.put(anyClientKey, client2);
            }
        }
        Preconditions.checkState(!oaVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C3042oa oaVar3 = new C3042oa();
        C3042oa oaVar4 = new C3042oa();
        for (Api api : map2.keySet()) {
            Api.AnyClientKey zab2 = api.zab();
            if (oaVar.containsKey(zab2)) {
                oaVar3.put(api, (Boolean) map3.get(api));
            } else if (oaVar2.containsKey(zab2)) {
                oaVar4.put(api, (Boolean) map3.get(api));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zat zat = (zat) arrayList.get(i);
            if (oaVar3.containsKey(zat.zaa)) {
                arrayList2.add(zat);
            } else if (oaVar4.containsKey(zat.zaa)) {
                arrayList3.add(zat);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new zaaa(context, zabe, lock, looper, googleApiAvailabilityLight, oaVar, oaVar2, clientSettings, abstractClientBuilder, client, arrayList2, arrayList3, oaVar3, oaVar4);
    }

    public static /* bridge */ /* synthetic */ void zan(zaaa zaaa, int i, boolean z) {
        zaaa.zab.zac(i, z);
        zaaa.zak = null;
        zaaa.zaj = null;
    }

    public static /* bridge */ /* synthetic */ void zao(zaaa zaaa, Bundle bundle) {
        Bundle bundle2 = zaaa.zai;
        if (bundle2 == null) {
            zaaa.zai = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    public static /* bridge */ /* synthetic */ void zap(zaaa zaaa) {
        ConnectionResult connectionResult;
        if (zaE(zaaa.zaj)) {
            if (zaE(zaaa.zak) || zaaa.zaC()) {
                int i = zaaa.zan;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        zaaa.zan = 0;
                        return;
                    }
                    ((zabe) Preconditions.checkNotNull(zaaa.zab)).zab(zaaa.zai);
                }
                zaaa.zaB();
                zaaa.zan = 0;
                return;
            }
            ConnectionResult connectionResult2 = zaaa.zak;
            if (connectionResult2 == null) {
                return;
            }
            if (zaaa.zan == 1) {
                zaaa.zaB();
                return;
            }
            zaaa.zaA(connectionResult2);
            zaaa.zad.zar();
        } else if (zaaa.zaj == null || !zaE(zaaa.zak)) {
            ConnectionResult connectionResult3 = zaaa.zaj;
            if (connectionResult3 != null && (connectionResult = zaaa.zak) != null) {
                if (zaaa.zae.zaf < zaaa.zad.zaf) {
                    connectionResult3 = connectionResult;
                }
                zaaa.zaA(connectionResult3);
            }
        } else {
            zaaa.zae.zar();
            zaaa.zaA((ConnectionResult) Preconditions.checkNotNull(zaaa.zaj));
        }
    }

    @ts2
    private final PendingIntent zaz() {
        if (this.zah == null) {
            return null;
        }
        return PendingIntent.getActivity(this.zaa, System.identityHashCode(this.zab), this.zah.getSignInIntent(), c55.f10152a | 134217728);
    }

    @GuardedBy("mLock")
    public final ConnectionResult zab() {
        throw new UnsupportedOperationException();
    }

    @GuardedBy("mLock")
    public final ConnectionResult zac(long j, @mr2 TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @GuardedBy("mLock")
    @ts2
    public final ConnectionResult zad(@mr2 Api api) {
        return Objects.equal(this.zaf.get(api.zab()), this.zae) ? zaC() ? new ConnectionResult(4, zaz()) : this.zae.zad(api) : this.zad.zad(api);
    }

    @GuardedBy("mLock")
    public final BaseImplementation.ApiMethodImpl zae(@mr2 BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (!zaD(apiMethodImpl)) {
            this.zad.zae(apiMethodImpl);
            return apiMethodImpl;
        } else if (zaC()) {
            apiMethodImpl.setFailedResult(new Status(4, (String) null, zaz()));
            return apiMethodImpl;
        } else {
            this.zae.zae(apiMethodImpl);
            return apiMethodImpl;
        }
    }

    @GuardedBy("mLock")
    public final BaseImplementation.ApiMethodImpl zaf(@mr2 BaseImplementation.ApiMethodImpl apiMethodImpl) {
        if (!zaD(apiMethodImpl)) {
            return this.zad.zaf(apiMethodImpl);
        }
        if (!zaC()) {
            return this.zae.zaf(apiMethodImpl);
        }
        apiMethodImpl.setFailedResult(new Status(4, (String) null, zaz()));
        return apiMethodImpl;
    }

    @GuardedBy("mLock")
    public final void zaq() {
        this.zan = 2;
        this.zal = false;
        this.zak = null;
        this.zaj = null;
        this.zad.zaq();
        this.zae.zaq();
    }

    @GuardedBy("mLock")
    public final void zar() {
        this.zak = null;
        this.zaj = null;
        this.zan = 0;
        this.zad.zar();
        this.zae.zar();
        zaB();
    }

    public final void zas(String str, @ts2 FileDescriptor fileDescriptor, PrintWriter printWriter, @ts2 String[] strArr) {
        printWriter.append(str).append("authClient").println(ar4.f25981a);
        this.zae.zas(String.valueOf(str).concat(yg1.C3999a.f23084c), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(ar4.f25981a);
        this.zad.zas(String.valueOf(str).concat(yg1.C3999a.f23084c), fileDescriptor, printWriter, strArr);
    }

    @GuardedBy("mLock")
    public final void zat() {
        this.zad.zat();
        this.zae.zat();
    }

    public final void zau() {
        this.zam.lock();
        try {
            boolean zax = zax();
            this.zae.zar();
            this.zak = new ConnectionResult(4);
            if (zax) {
                new h55(this.zac).post(new zav(this));
            } else {
                zaB();
            }
        } finally {
            this.zam.unlock();
        }
    }

    public final boolean zaw() {
        this.zam.lock();
        try {
            boolean z = false;
            if (this.zad.zaw() && (this.zae.zaw() || zaC() || this.zan == 1)) {
                z = true;
            }
            return z;
        } finally {
            this.zam.unlock();
        }
    }

    public final boolean zax() {
        this.zam.lock();
        try {
            return this.zan == 2;
        } finally {
            this.zam.unlock();
        }
    }

    public final boolean zay(SignInConnectionListener signInConnectionListener) {
        this.zam.lock();
        try {
            if ((zax() || zaw()) && !this.zae.zaw()) {
                this.zag.add(signInConnectionListener);
                if (this.zan == 0) {
                    this.zan = 1;
                }
                this.zak = null;
                this.zae.zaq();
                return true;
            }
            this.zam.unlock();
            return false;
        } finally {
            this.zam.unlock();
        }
    }
}
