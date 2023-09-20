package com.onedelhi.secure;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.Executor;

public interface jd1 extends HasApiKey<Api.ApiOptions.NoOptions> {
    @mr2
    @Deprecated

    /* renamed from: a */
    public static final String f14097a = "mockLocation";
    @mr2
    @Deprecated

    /* renamed from: b */
    public static final String f14098b = "verticalAccuracy";

    @mr2
    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: A */
    w94<Void> mo18262A(@mr2 LocationRequest locationRequest, @mr2 z62 z62, @ts2 Looper looper);

    @mr2
    /* renamed from: B */
    w94<Void> mo18263B();

    @mr2
    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: F */
    w94<LocationAvailability> mo18264F();

    @mr2
    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: H */
    w94<Void> mo18265H(boolean z);

    @mr2
    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: K */
    w94<Void> mo18266K(@mr2 Location location);

    @mr2
    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: M */
    w94<Location> mo18267M(@mr2 ub0 ub0, @ts2 C3452ru ruVar);

    @mr2
    /* renamed from: N */
    w94<Void> mo18268N(@mr2 c72 c72);

    @mr2
    /* renamed from: P */
    w94<Void> mo18269P(@mr2 PendingIntent pendingIntent);

    @mr2
    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: Q */
    w94<Void> mo18270Q(@mr2 LocationRequest locationRequest, @mr2 Executor executor, @mr2 c72 c72);

    @mr2
    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: R */
    w94<Location> mo18271R(@mr2 f12 f12);

    @mr2
    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: U */
    w94<Location> mo18272U();

    @mr2
    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: d */
    w94<Void> mo18273d(@mr2 LocationRequest locationRequest, @mr2 c72 c72, @ts2 Looper looper);

    @mr2
    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: g */
    w94<Void> mo18274g(@mr2 LocationRequest locationRequest, @mr2 PendingIntent pendingIntent);

    @mr2
    /* renamed from: n */
    w94<Void> mo18275n(@mr2 z62 z62);

    @mr2
    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: r */
    w94<Location> mo18276r(int i, @ts2 C3452ru ruVar);

    @mr2
    @wj3(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* renamed from: t */
    w94<Void> mo18277t(@mr2 LocationRequest locationRequest, @mr2 Executor executor, @mr2 z62 z62);
}
