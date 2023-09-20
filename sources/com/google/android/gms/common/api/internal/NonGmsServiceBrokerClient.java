package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.ly4;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;

@KeepForSdk
public final class NonGmsServiceBrokerClient implements Api.Client, ServiceConnection {
    private static final String zaa = NonGmsServiceBrokerClient.class.getSimpleName();
    @ts2
    private final String zab;
    @ts2
    private final String zac;
    @ts2
    private final ComponentName zad;
    private final Context zae;
    private final ConnectionCallbacks zaf;
    private final Handler zag;
    private final OnConnectionFailedListener zah;
    @ts2
    private IBinder zai;
    private boolean zaj;
    @ts2
    private String zak;
    @ts2
    private String zal;

    @KeepForSdk
    public NonGmsServiceBrokerClient(@mr2 Context context, @mr2 Looper looper, @mr2 ComponentName componentName, @mr2 ConnectionCallbacks connectionCallbacks, @mr2 OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, (String) null, (String) null, componentName, connectionCallbacks, onConnectionFailedListener);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r6 != null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private NonGmsServiceBrokerClient(android.content.Context r2, android.os.Looper r3, @com.onedelhi.secure.ts2 java.lang.String r4, @com.onedelhi.secure.ts2 java.lang.String r5, @com.onedelhi.secure.ts2 android.content.ComponentName r6, com.google.android.gms.common.api.internal.ConnectionCallbacks r7, com.google.android.gms.common.api.internal.OnConnectionFailedListener r8) {
        /*
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zaj = r0
            r0 = 0
            r1.zak = r0
            r1.zae = r2
            com.onedelhi.secure.h55 r2 = new com.onedelhi.secure.h55
            r2.<init>(r3)
            r1.zag = r2
            r1.zaf = r7
            r1.zah = r8
            if (r4 == 0) goto L_0x001e
            if (r5 == 0) goto L_0x001e
            if (r6 != 0) goto L_0x0027
            r6 = r0
            goto L_0x0020
        L_0x001e:
            if (r6 == 0) goto L_0x0027
        L_0x0020:
            r1.zab = r4
            r1.zac = r5
            r1.zad = r6
            return
        L_0x0027:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "Must specify either package or component, but not both"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient.<init>(android.content.Context, android.os.Looper, java.lang.String, java.lang.String, android.content.ComponentName, com.google.android.gms.common.api.internal.ConnectionCallbacks, com.google.android.gms.common.api.internal.OnConnectionFailedListener):void");
    }

    @KeepForSdk
    public NonGmsServiceBrokerClient(@mr2 Context context, @mr2 Looper looper, @mr2 String str, @mr2 String str2, @mr2 ConnectionCallbacks connectionCallbacks, @mr2 OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, str, str2, (ComponentName) null, connectionCallbacks, onConnectionFailedListener);
    }

    @ly4
    private final void zad() {
        if (Thread.currentThread() != this.zag.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    @ly4
    public final void connect(@mr2 BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        zad();
        String.valueOf(this.zai);
        if (isConnected()) {
            try {
                disconnect("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.zad;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.zab).setAction(this.zac);
            }
            boolean bindService = this.zae.bindService(intent, this, GmsClientSupervisor.getDefaultBindFlags());
            this.zaj = bindService;
            if (!bindService) {
                this.zai = null;
                this.zah.onConnectionFailed(new ConnectionResult(16));
            }
            String.valueOf(this.zai);
        } catch (SecurityException e) {
            this.zaj = false;
            this.zai = null;
            throw e;
        }
    }

    @ly4
    public final void disconnect() {
        zad();
        String.valueOf(this.zai);
        try {
            this.zae.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.zaj = false;
        this.zai = null;
    }

    @ly4
    public final void disconnect(@mr2 String str) {
        zad();
        this.zak = str;
        disconnect();
    }

    public final void dump(@mr2 String str, @ts2 FileDescriptor fileDescriptor, @mr2 PrintWriter printWriter, @ts2 String[] strArr) {
    }

    @mr2
    public final Feature[] getAvailableFeatures() {
        return new Feature[0];
    }

    @KeepForSdk
    @ts2
    @ly4
    public IBinder getBinder() {
        zad();
        return this.zai;
    }

    @mr2
    public final String getEndpointPackageName() {
        String str = this.zab;
        if (str != null) {
            return str;
        }
        Preconditions.checkNotNull(this.zad);
        return this.zad.getPackageName();
    }

    @ts2
    public final String getLastDisconnectMessage() {
        return this.zak;
    }

    public final int getMinApkVersion() {
        return 0;
    }

    public final void getRemoteService(@ts2 IAccountAccessor iAccountAccessor, @ts2 Set<Scope> set) {
    }

    @mr2
    public final Feature[] getRequiredFeatures() {
        return new Feature[0];
    }

    @mr2
    public final Set<Scope> getScopesForConnectionlessNonSignIn() {
        return Collections.emptySet();
    }

    @ts2
    public final IBinder getServiceBrokerBinder() {
        return null;
    }

    @mr2
    public final Intent getSignInIntent() {
        return new Intent();
    }

    @ly4
    public final boolean isConnected() {
        zad();
        return this.zai != null;
    }

    @ly4
    public final boolean isConnecting() {
        zad();
        return this.zaj;
    }

    public final void onServiceConnected(@mr2 ComponentName componentName, @mr2 IBinder iBinder) {
        this.zag.post(new zacg(this, iBinder));
    }

    public final void onServiceDisconnected(@mr2 ComponentName componentName) {
        this.zag.post(new zacf(this));
    }

    public final void onUserSignOut(@mr2 BaseGmsClient.SignOutCallbacks signOutCallbacks) {
    }

    public final boolean providesSignIn() {
        return false;
    }

    public final boolean requiresAccount() {
        return false;
    }

    public final boolean requiresGooglePlayServices() {
        return false;
    }

    public final boolean requiresSignIn() {
        return false;
    }

    public final /* synthetic */ void zaa(IBinder iBinder) {
        this.zaj = false;
        this.zai = iBinder;
        String.valueOf(iBinder);
        this.zaf.onConnected(new Bundle());
    }

    public final /* synthetic */ void zab() {
        this.zaj = false;
        this.zai = null;
        this.zaf.onConnectionSuspended(1);
    }

    public final void zac(@ts2 String str) {
        this.zal = str;
    }
}
