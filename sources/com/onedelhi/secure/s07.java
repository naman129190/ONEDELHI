package com.onedelhi.secure;

import android.accounts.Account;
import com.google.android.gms.common.api.internal.RemoteCall;

public final /* synthetic */ class s07 implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ Account f20166a;

    /* renamed from: a */
    public final /* synthetic */ tb5 f20167a;

    public /* synthetic */ s07(tb5 tb5, Account account) {
        this.f20167a = tb5;
        this.f20166a = account;
    }

    public final void accept(Object obj, Object obj2) {
        tb5 tb5 = this.f20167a;
        ((ix6) ((xh6) obj).getService()).mo17998p8(new gb5(tb5, (x94) obj2), this.f20166a);
    }
}
