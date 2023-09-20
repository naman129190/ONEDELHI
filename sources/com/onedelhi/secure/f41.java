package com.onedelhi.secure;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;

@KeepForSdk
public class f41 implements StatusExceptionMapper {
    @mr2
    public final Exception getException(@mr2 Status status) {
        return status.getStatusCode() == 8 ? new e41(status.zza()) : new t31(status.zza());
    }
}
