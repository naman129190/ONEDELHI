package com.onedelhi.secure;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.credentials.C1403a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

@Deprecated
public interface ob0 {

    /* renamed from: a */
    public static final int f17905a = 1000;

    /* renamed from: b */
    public static final int f17906b = 1001;

    /* renamed from: c */
    public static final int f17907c = 1002;

    /* renamed from: d */
    public static final int f17908d = 2000;

    @mr2
    /* renamed from: a */
    PendingResult<Status> mo15895a(@mr2 GoogleApiClient googleApiClient);

    @mr2
    /* renamed from: b */
    PendingResult<Status> mo15896b(@mr2 GoogleApiClient googleApiClient, @mr2 Credential credential);

    @mr2
    /* renamed from: c */
    PendingIntent mo15897c(@mr2 GoogleApiClient googleApiClient, @mr2 HintRequest hintRequest);

    @mr2
    /* renamed from: d */
    PendingResult<lb0> mo15898d(@mr2 GoogleApiClient googleApiClient, @mr2 C1403a aVar);

    @mr2
    /* renamed from: e */
    PendingResult<Status> mo15899e(@mr2 GoogleApiClient googleApiClient, @mr2 Credential credential);
}
