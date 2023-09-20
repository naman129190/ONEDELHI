package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.onedelhi.secure.mr2;

@KeepForSdk
public interface StatusExceptionMapper {
    @mr2
    @KeepForSdk
    Exception getException(@mr2 Status status);
}
