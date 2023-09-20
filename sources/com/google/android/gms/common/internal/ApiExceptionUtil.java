package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.onedelhi.secure.mr2;

@KeepForSdk
public class ApiExceptionUtil {
    @mr2
    @KeepForSdk
    public static ApiException fromStatus(@mr2 Status status) {
        return status.hasResolution() ? new ResolvableApiException(status) : new ApiException(status);
    }
}
