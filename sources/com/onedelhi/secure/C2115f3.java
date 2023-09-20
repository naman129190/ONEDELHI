package com.onedelhi.secure;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

@Deprecated
/* renamed from: com.onedelhi.secure.f3 */
public interface C2115f3 {
    @mr2
    @wj3(anyOf = {"android.permission.ACTIVITY_RECOGNITION", "com.google.android.gms.permission.ACTIVITY_RECOGNITION"})
    /* renamed from: a */
    PendingResult<Status> mo15739a(@mr2 GoogleApiClient googleApiClient, long j, @mr2 PendingIntent pendingIntent);

    @mr2
    @wj3(anyOf = {"android.permission.ACTIVITY_RECOGNITION", "com.google.android.gms.permission.ACTIVITY_RECOGNITION"})
    /* renamed from: b */
    PendingResult<Status> mo15740b(@mr2 GoogleApiClient googleApiClient, @mr2 PendingIntent pendingIntent);
}
