package com.onedelhi.secure;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public class zh1 implements Result {
    @ts2

    /* renamed from: a */
    public final GoogleSignInAccount f23659a;

    /* renamed from: a */
    public final Status f23660a;

    public zh1(@ts2 GoogleSignInAccount googleSignInAccount, @mr2 Status status) {
        this.f23659a = googleSignInAccount;
        this.f23660a = status;
    }

    @ts2
    /* renamed from: a */
    public GoogleSignInAccount mo27987a() {
        return this.f23659a;
    }

    /* renamed from: c */
    public boolean mo27988c() {
        return this.f23660a.isSuccess();
    }

    @mr2
    public Status getStatus() {
        return this.f23660a;
    }
}
