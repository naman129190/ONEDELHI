package com.onedelhi.secure;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public final class e75 implements vh1 {
    /* renamed from: f */
    public static final GoogleSignInOptions m13606f(GoogleApiClient googleApiClient) {
        return ((i75) googleApiClient.getClient(C2326hc.f13038b)).mo17661d();
    }

    @ts2
    /* renamed from: a */
    public final zh1 mo15070a(Intent intent) {
        return h85.m16536d(intent);
    }

    /* renamed from: b */
    public final PendingResult<Status> mo15071b(GoogleApiClient googleApiClient) {
        return h85.m16539g(googleApiClient, googleApiClient.getContext(), false);
    }

    /* renamed from: c */
    public final OptionalPendingResult<zh1> mo15072c(GoogleApiClient googleApiClient) {
        return h85.m16537e(googleApiClient, googleApiClient.getContext(), m13606f(googleApiClient), false);
    }

    /* renamed from: d */
    public final Intent mo15073d(GoogleApiClient googleApiClient) {
        return h85.m16535c(googleApiClient.getContext(), m13606f(googleApiClient));
    }

    /* renamed from: e */
    public final PendingResult<Status> mo15074e(GoogleApiClient googleApiClient) {
        return h85.m16538f(googleApiClient, googleApiClient.getContext(), false);
    }
}
