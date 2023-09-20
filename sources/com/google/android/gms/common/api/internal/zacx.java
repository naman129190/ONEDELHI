package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.onedelhi.secure.c80;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.w94;

final class zacx implements c80 {
    public final /* bridge */ /* synthetic */ Object then(@mr2 w94 w94) throws Exception {
        if (((Boolean) w94.mo17586r()).booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}
