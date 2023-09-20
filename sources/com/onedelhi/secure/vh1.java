package com.onedelhi.secure;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public interface vh1 {
    @mr2

    /* renamed from: a */
    public static final String f21791a = "signInAccount";

    @ts2
    /* renamed from: a */
    zh1 mo15070a(@mr2 Intent intent);

    @mr2
    /* renamed from: b */
    PendingResult<Status> mo15071b(@mr2 GoogleApiClient googleApiClient);

    @mr2
    /* renamed from: c */
    OptionalPendingResult<zh1> mo15072c(@mr2 GoogleApiClient googleApiClient);

    @mr2
    /* renamed from: d */
    Intent mo15073d(@mr2 GoogleApiClient googleApiClient);

    @mr2
    /* renamed from: e */
    PendingResult<Status> mo15074e(@mr2 GoogleApiClient googleApiClient);
}
