package com.onedelhi.secure;

import android.accounts.Account;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.onedelhi.secure.cy4;

public final class fg5 implements cy4 {

    /* renamed from: a */
    public static final Status f12064a = new Status(13);

    /* renamed from: a */
    public final PendingResult<Result> mo14427a(GoogleApiClient googleApiClient, boolean z) {
        return googleApiClient.execute(new hc5(this, by4.f10026a, googleApiClient, z));
    }

    /* renamed from: b */
    public final void mo14428b(GoogleApiClient googleApiClient, boolean z) {
        mo14427a(googleApiClient, z);
    }

    /* renamed from: c */
    public final PendingResult<Result> mo14429c(GoogleApiClient googleApiClient, Account account) {
        return googleApiClient.execute(new de5(this, by4.f10026a, googleApiClient, account));
    }

    /* renamed from: d */
    public final PendingResult<cy4.C1928a> mo14430d(GoogleApiClient googleApiClient, String str) {
        return googleApiClient.execute(new gd5(this, by4.f10026a, googleApiClient, str));
    }
}
