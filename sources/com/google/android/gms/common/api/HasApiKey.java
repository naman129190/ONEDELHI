package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiKey;
import com.onedelhi.secure.mr2;

public interface HasApiKey<O extends Api.ApiOptions> {
    @mr2
    @KeepForSdk
    ApiKey<O> getApiKey();
}
