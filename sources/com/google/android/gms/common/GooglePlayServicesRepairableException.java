package com.google.android.gms.common;

import android.content.Intent;
import com.onedelhi.secure.mr2;

public class GooglePlayServicesRepairableException extends UserRecoverableException {
    private final int zza;

    public GooglePlayServicesRepairableException(int i, @mr2 String str, @mr2 Intent intent) {
        super(str, intent);
        this.zza = i;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}
