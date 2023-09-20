package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.onedelhi.secure.mr2;

public interface OptionalModuleApi {
    @mr2
    @KeepForSdk
    Feature[] getOptionalFeatures();
}
