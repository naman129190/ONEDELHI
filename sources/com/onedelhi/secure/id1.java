package com.onedelhi.secure;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;

@Deprecated
public interface id1 {
    @mr2
    @Deprecated

    /* renamed from: a */
    public static final String f13626a = "com.google.android.location.LOCATION";
    @mr2
    @Deprecated

    /* renamed from: b */
    public static final String f13627b = "mockLocation";

    @mr2
    /* renamed from: a */
    PendingResult<Status> mo14696a(@mr2 GoogleApiClient googleApiClient, @mr2 z62 z62);

    @mr2
    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: b */
    PendingResult<Status> mo14697b(@mr2 GoogleApiClient googleApiClient, @mr2 LocationRequest locationRequest, @mr2 c72 c72, @mr2 Looper looper);

    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @ts2
    /* renamed from: c */
    Location mo14698c(@mr2 GoogleApiClient googleApiClient);

    @mr2
    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: d */
    PendingResult<Status> mo14699d(@mr2 GoogleApiClient googleApiClient, boolean z);

    @mr2
    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: e */
    PendingResult<Status> mo14700e(@mr2 GoogleApiClient googleApiClient, @mr2 LocationRequest locationRequest, @mr2 c72 c72);

    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @ts2
    /* renamed from: f */
    LocationAvailability mo14701f(@mr2 GoogleApiClient googleApiClient);

    @mr2
    /* renamed from: g */
    PendingResult<Status> mo14702g(@mr2 GoogleApiClient googleApiClient);

    @mr2
    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: h */
    PendingResult<Status> mo14703h(@mr2 GoogleApiClient googleApiClient, @mr2 LocationRequest locationRequest, @mr2 PendingIntent pendingIntent);

    @mr2
    /* renamed from: i */
    PendingResult<Status> mo14704i(@mr2 GoogleApiClient googleApiClient, @mr2 c72 c72);

    @mr2
    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: j */
    PendingResult<Status> mo14705j(@mr2 GoogleApiClient googleApiClient, @mr2 LocationRequest locationRequest, @mr2 z62 z62, @mr2 Looper looper);

    @mr2
    /* renamed from: k */
    PendingResult<Status> mo14706k(@mr2 GoogleApiClient googleApiClient, @mr2 PendingIntent pendingIntent);

    @mr2
    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: l */
    PendingResult<Status> mo14707l(@mr2 GoogleApiClient googleApiClient, @mr2 Location location);
}
