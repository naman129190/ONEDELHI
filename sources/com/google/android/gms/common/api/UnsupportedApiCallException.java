package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.onedelhi.secure.mr2;

public final class UnsupportedApiCallException extends UnsupportedOperationException {
    private final Feature zza;

    @KeepForSdk
    public UnsupportedApiCallException(@mr2 Feature feature) {
        this.zza = feature;
    }

    @mr2
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.zza));
    }
}
