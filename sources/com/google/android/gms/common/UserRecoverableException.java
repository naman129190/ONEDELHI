package com.google.android.gms.common;

import android.content.Intent;
import com.onedelhi.secure.mr2;

public class UserRecoverableException extends Exception {
    private final Intent zza;

    public UserRecoverableException(@mr2 String str, @mr2 Intent intent) {
        super(str);
        this.zza = intent;
    }

    @mr2
    public Intent getIntent() {
        return new Intent(this.zza);
    }
}
