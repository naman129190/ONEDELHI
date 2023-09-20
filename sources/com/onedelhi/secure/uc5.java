package com.onedelhi.secure;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

public final class uc5 extends oe5 {

    /* renamed from: a */
    public final /* synthetic */ gd5 f21320a;

    public uc5(gd5 gd5) {
        this.f21320a = gd5;
    }

    /* renamed from: h8 */
    public final void mo16712h8(@ts2 Account account) {
        this.f21320a.setResult(new ze5(account != null ? Status.RESULT_SUCCESS : fg5.f12064a, account));
    }
}
