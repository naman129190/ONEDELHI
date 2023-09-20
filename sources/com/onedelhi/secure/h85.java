package com.onedelhi.secure;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.logging.Logger;
import easypay.appinvoke.manager.Constants;

public final class h85 {

    /* renamed from: a */
    public static final Logger f13001a = new Logger("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static Intent m16533a(Context context, GoogleSignInOptions googleSignInOptions) {
        f13001a.mo10165d("getFallbackSignInIntent()", new Object[0]);
        Intent c = m16535c(context, googleSignInOptions);
        c.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return c;
    }

    /* renamed from: b */
    public static Intent m16534b(Context context, GoogleSignInOptions googleSignInOptions) {
        f13001a.mo10165d("getNoImplementationSignInIntent()", new Object[0]);
        Intent c = m16535c(context, googleSignInOptions);
        c.setAction("com.google.android.gms.auth.NO_IMPL");
        return c;
    }

    /* renamed from: c */
    public static Intent m16535c(Context context, GoogleSignInOptions googleSignInOptions) {
        f13001a.mo10165d("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(Constants.EASY_PAY_CONFIG_PREF_KEY, signInConfiguration);
        intent.putExtra(Constants.EASY_PAY_CONFIG_PREF_KEY, bundle);
        return intent;
    }

    @ts2
    /* renamed from: d */
    public static zh1 m16536d(@ts2 Intent intent) {
        if (intent == null) {
            return new zh1((GoogleSignInAccount) null, Status.RESULT_INTERNAL_ERROR);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new zh1(googleSignInAccount, Status.RESULT_SUCCESS);
        }
        if (status == null) {
            status = Status.RESULT_INTERNAL_ERROR;
        }
        return new zh1((GoogleSignInAccount) null, status);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.common.api.OptionalPendingResult m16537e(com.google.android.gms.common.api.GoogleApiClient r6, android.content.Context r7, com.google.android.gms.auth.api.signin.GoogleSignInOptions r8, boolean r9) {
        /*
            com.google.android.gms.common.logging.Logger r0 = f13001a
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "silentSignIn()"
            r0.mo10165d(r3, r2)
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "getEligibleSavedSignInResult()"
            r0.mo10165d(r3, r2)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            com.onedelhi.secure.k85 r2 = com.onedelhi.secure.k85.m19555c(r7)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = r2.mo18957b()
            r3 = 0
            if (r2 != 0) goto L_0x0022
        L_0x001f:
            r4 = r3
            goto L_0x0089
        L_0x0022:
            android.accounts.Account r4 = r2.getAccount()
            android.accounts.Account r5 = r8.getAccount()
            if (r4 != 0) goto L_0x002f
            if (r5 != 0) goto L_0x001f
            goto L_0x0036
        L_0x002f:
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0036
            goto L_0x001f
        L_0x0036:
            boolean r4 = r8.mo9226R2()
            if (r4 == 0) goto L_0x003d
            goto L_0x001f
        L_0x003d:
            boolean r4 = r8.mo9225Q2()
            if (r4 == 0) goto L_0x0059
            boolean r4 = r2.mo9225Q2()
            if (r4 != 0) goto L_0x004a
            goto L_0x001f
        L_0x004a:
            java.lang.String r4 = r8.mo9223O2()
            java.lang.String r5 = r2.mo9223O2()
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r4, r5)
            if (r4 != 0) goto L_0x0059
            goto L_0x001f
        L_0x0059:
            java.util.HashSet r4 = new java.util.HashSet
            java.util.ArrayList r2 = r2.mo9222N2()
            r4.<init>(r2)
            java.util.HashSet r2 = new java.util.HashSet
            java.util.ArrayList r5 = r8.mo9222N2()
            r2.<init>(r5)
            boolean r2 = r4.containsAll(r2)
            if (r2 != 0) goto L_0x0072
            goto L_0x001f
        L_0x0072:
            com.onedelhi.secure.k85 r2 = com.onedelhi.secure.k85.m19555c(r7)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r2 = r2.mo18956a()
            if (r2 == 0) goto L_0x001f
            boolean r4 = r2.mo9211W2()
            if (r4 != 0) goto L_0x001f
            com.onedelhi.secure.zh1 r4 = new com.onedelhi.secure.zh1
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            r4.<init>(r2, r5)
        L_0x0089:
            if (r4 == 0) goto L_0x0097
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r8 = "Eligible saved sign in result found"
            r0.mo10165d(r8, r7)
            com.google.android.gms.common.api.OptionalPendingResult r6 = com.google.android.gms.common.api.PendingResults.immediatePendingResult(r4, (com.google.android.gms.common.api.GoogleApiClient) r6)
            return r6
        L_0x0097:
            if (r9 == 0) goto L_0x00a9
            com.onedelhi.secure.zh1 r7 = new com.onedelhi.secure.zh1
            com.google.android.gms.common.api.Status r8 = new com.google.android.gms.common.api.Status
            r9 = 4
            r8.<init>(r9)
            r7.<init>(r3, r8)
            com.google.android.gms.common.api.OptionalPendingResult r6 = com.google.android.gms.common.api.PendingResults.immediatePendingResult(r7, (com.google.android.gms.common.api.GoogleApiClient) r6)
            return r6
        L_0x00a9:
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.String r1 = "trySilentSignIn()"
            r0.mo10165d(r1, r9)
            com.onedelhi.secure.p75 r9 = new com.onedelhi.secure.p75
            r9.<init>(r6, r7, r8)
            com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl r6 = r6.enqueue(r9)
            com.google.android.gms.common.api.internal.OptionalPendingResultImpl r7 = new com.google.android.gms.common.api.internal.OptionalPendingResultImpl
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onedelhi.secure.h85.m16537e(com.google.android.gms.common.api.GoogleApiClient, android.content.Context, com.google.android.gms.auth.api.signin.GoogleSignInOptions, boolean):com.google.android.gms.common.api.OptionalPendingResult");
    }

    /* renamed from: f */
    public static PendingResult m16538f(GoogleApiClient googleApiClient, Context context, boolean z) {
        f13001a.mo10165d("Revoking access", new Object[0]);
        String e = b44.m11561b(context).mo13412e();
        m16540h(context);
        return z ? s65.m27303a(e) : googleApiClient.execute(new b85(googleApiClient));
    }

    /* renamed from: g */
    public static PendingResult m16539g(GoogleApiClient googleApiClient, Context context, boolean z) {
        f13001a.mo10165d("Signing out", new Object[0]);
        m16540h(context);
        return z ? PendingResults.immediatePendingResult(Status.RESULT_SUCCESS, googleApiClient) : googleApiClient.execute(new v75(googleApiClient));
    }

    /* renamed from: h */
    public static void m16540h(Context context) {
        k85.m19555c(context).mo18958d();
        for (GoogleApiClient maybeSignOut : GoogleApiClient.getAllClients()) {
            maybeSignOut.maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
    }
}
