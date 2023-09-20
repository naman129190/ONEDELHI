package com.onedelhi.secure;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.onedelhi.secure.cy4;

public final class ze5 implements cy4.C1928a {

    /* renamed from: b */
    public static final Account f23591b = new Account("DUMMY_NAME", "com.google");

    /* renamed from: a */
    public final Account f23592a;

    /* renamed from: a */
    public final Status f23593a;

    public ze5(Status status, @ts2 Account account) {
        this.f23593a = status;
        this.f23592a = account == null ? f23591b : account;
    }

    public final Account getAccount() {
        return this.f23592a;
    }

    public final Status getStatus() {
        return this.f23593a;
    }
}
