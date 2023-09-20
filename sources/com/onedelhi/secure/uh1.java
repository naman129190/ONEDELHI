package com.onedelhi.secure;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

public class uh1 extends UserRecoverableAuthException {

    /* renamed from: n */
    public final int f21376n;

    public uh1(int i, @ts2 String str, @ts2 Intent intent) {
        super(str, intent);
        this.f21376n = i;
    }

    /* renamed from: b */
    public int mo25621b() {
        return this.f21376n;
    }
}
