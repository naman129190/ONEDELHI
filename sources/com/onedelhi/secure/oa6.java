package com.onedelhi.secure;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import java.io.IOException;

public final /* synthetic */ class oa6 implements mn6 {

    /* renamed from: a */
    public final /* synthetic */ Account f17893a;

    public /* synthetic */ oa6(Account account) {
        this.f17893a = account;
    }

    /* renamed from: a */
    public final Object mo13110a(IBinder iBinder) {
        Bundle U0 = r26.m26276k8(iBinder).mo20976U0(this.f17893a);
        if (U0 != null) {
            return U0;
        }
        throw new IOException("Service call returned null.");
    }
}
