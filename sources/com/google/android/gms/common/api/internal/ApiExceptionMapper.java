package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.onedelhi.secure.mr2;

@KeepForSdk
public class ApiExceptionMapper implements StatusExceptionMapper {
    @mr2
    public final Exception getException(@mr2 Status status) {
        return ApiExceptionUtil.fromStatus(status);
    }
}
