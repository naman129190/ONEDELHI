package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@KeepForSdk
public final class ApiKey<O extends Api.ApiOptions> {
    private final int zaa;
    private final Api zab;
    @ts2
    private final Api.ApiOptions zac;
    @ts2
    private final String zad;

    private ApiKey(Api api, @ts2 Api.ApiOptions apiOptions, @ts2 String str) {
        this.zab = api;
        this.zac = apiOptions;
        this.zad = str;
        this.zaa = Objects.hashCode(api, apiOptions, str);
    }

    @mr2
    @KeepForSdk
    public static <O extends Api.ApiOptions> ApiKey<O> getSharedApiKey(@mr2 Api<O> api, @ts2 O o, @ts2 String str) {
        return new ApiKey<>(api, o, str);
    }

    public final boolean equals(@ts2 Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApiKey)) {
            return false;
        }
        ApiKey apiKey = (ApiKey) obj;
        return Objects.equal(this.zab, apiKey.zab) && Objects.equal(this.zac, apiKey.zac) && Objects.equal(this.zad, apiKey.zad);
    }

    public final int hashCode() {
        return this.zaa;
    }

    @mr2
    public final String zaa() {
        return this.zab.zad();
    }
}
