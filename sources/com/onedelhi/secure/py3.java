package com.onedelhi.secure;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;

@KeepForSdk
public class py3 extends GmsClient<k45> implements f45 {

    /* renamed from: n */
    public static final /* synthetic */ int f18832n = 0;

    /* renamed from: a */
    public final Bundle f18833a;

    /* renamed from: a */
    public final ClientSettings f18834a;
    @ts2

    /* renamed from: a */
    public final Integer f18835a;

    /* renamed from: b */
    public final boolean f18836b = true;

    public py3(@mr2 Context context, @mr2 Looper looper, boolean z, @mr2 ClientSettings clientSettings, @mr2 Bundle bundle, @mr2 GoogleApiClient.ConnectionCallbacks connectionCallbacks, @mr2 GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.f18834a = clientSettings;
        this.f18833a = bundle;
        this.f18835a = clientSettings.zab();
    }

    @mr2
    @KeepForSdk
    /* renamed from: d */
    public static Bundle m25208d(@mr2 ClientSettings clientSettings) {
        clientSettings.zaa();
        Integer zab = clientSettings.zab();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", clientSettings.getAccount());
        if (zab != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", zab.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* renamed from: a */
    public final void mo15775a() {
        try {
            ((k45) getService()).mo18895j8(((Integer) Preconditions.checkNotNull(this.f18835a)).intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    /* renamed from: b */
    public final void mo15776b(@mr2 IAccountAccessor iAccountAccessor, boolean z) {
        try {
            ((k45) getService()).mo18896k8(iAccountAccessor, ((Integer) Preconditions.checkNotNull(this.f18835a)).intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    /* renamed from: c */
    public final void mo15777c(g45 g45) {
        Preconditions.checkNotNull(g45, "Expecting a valid ISignInCallbacks");
        try {
            Account accountOrDefault = this.f18834a.getAccountOrDefault();
            ((k45) getService()).mo18897l8(new s45(1, new zat(accountOrDefault, ((Integer) Preconditions.checkNotNull(this.f18835a)).intValue(), "<<default account>>".equals(accountOrDefault.name) ? b44.m11561b(getContext()).mo13410c() : null)), g45);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                g45.zab(new w45(1, new ConnectionResult(8, (PendingIntent) null), (zav) null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @mr2
    public final /* synthetic */ IInterface createServiceInterface(@mr2 IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof k45 ? (k45) queryLocalInterface : new k45(iBinder);
    }

    @mr2
    public final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f18834a.getRealClientPackageName())) {
            this.f18833a.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f18834a.getRealClientPackageName());
        }
        return this.f18833a;
    }

    public final int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @mr2
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @mr2
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    public final boolean requiresSignIn() {
        return this.f18836b;
    }

    public final void zab() {
        connect(new BaseGmsClient.LegacyClientCallbackAdapter());
    }
}
