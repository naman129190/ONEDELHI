package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.onedelhi.secure.mr2;

public final class Common {
    @mr2
    @KeepForSdk
    public static final Api<Api.ApiOptions.NoOptions> API;
    @mr2
    @KeepForSdk
    public static final Api.ClientKey<zah> CLIENT_KEY;
    public static final zae zaa = new zae();
    private static final Api.AbstractClientBuilder zab;

    static {
        Api.ClientKey<zah> clientKey = new Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        zab zab2 = new zab();
        zab = zab2;
        API = new Api<>("Common.API", zab2, clientKey);
    }
}
