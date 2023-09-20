package com.onedelhi.secure;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.RemoteCall;

public final /* synthetic */ class x17 implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ Account f22390a;

    /* renamed from: a */
    public final /* synthetic */ Bundle f22391a;

    /* renamed from: a */
    public final /* synthetic */ tb5 f22392a;

    /* renamed from: a */
    public final /* synthetic */ String f22393a;

    public /* synthetic */ x17(tb5 tb5, Account account, String str, Bundle bundle) {
        this.f22392a = tb5;
        this.f22390a = account;
        this.f22393a = str;
        this.f22391a = bundle;
    }

    public final void accept(Object obj, Object obj2) {
        tb5 tb5 = this.f22392a;
        ((ix6) ((xh6) obj).getService()).mo17997o8(new l47(tb5, (x94) obj2), this.f22390a, this.f22393a, this.f22391a);
    }
}
