package com.google.android.gms.auth;

import android.content.Intent;
import com.google.android.gms.common.annotation.KeepName;
import com.onedelhi.secure.rh1;
import com.onedelhi.secure.ts2;

@KeepName
public class UserRecoverableAuthException extends rh1 {
    @ts2

    /* renamed from: a */
    public final Intent f7214a;

    public UserRecoverableAuthException(@ts2 String str, @ts2 Intent intent) {
        super(str);
        this.f7214a = intent;
    }

    @ts2
    /* renamed from: a */
    public Intent mo9123a() {
        Intent intent = this.f7214a;
        if (intent == null) {
            return null;
        }
        return new Intent(intent);
    }
}
