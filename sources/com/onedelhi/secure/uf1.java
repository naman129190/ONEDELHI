package com.onedelhi.secure;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.util.List;

@Deprecated
public interface uf1 {
    @mr2
    /* renamed from: a */
    PendingResult<Status> mo23348a(@mr2 GoogleApiClient googleApiClient, @mr2 List<String> list);

    @mr2
    /* renamed from: b */
    PendingResult<Status> mo23349b(@mr2 GoogleApiClient googleApiClient, @mr2 PendingIntent pendingIntent);

    @mr2
    @wj3("android.permission.ACCESS_FINE_LOCATION")
    @Deprecated
    /* renamed from: c */
    PendingResult<Status> mo23350c(@mr2 GoogleApiClient googleApiClient, @mr2 List<sf1> list, @mr2 PendingIntent pendingIntent);

    @mr2
    @wj3("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: d */
    PendingResult<Status> mo23351d(@mr2 GoogleApiClient googleApiClient, @mr2 xf1 xf1, @mr2 PendingIntent pendingIntent);
}
