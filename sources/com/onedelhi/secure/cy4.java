package com.onedelhi.secure;

import android.accounts.Account;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;

@Deprecated
public interface cy4 {

    @Deprecated
    /* renamed from: com.onedelhi.secure.cy4$a */
    public interface C1928a extends Result {
        @mr2
        Account getAccount();
    }

    @mr2
    @Deprecated
    /* renamed from: a */
    PendingResult<Result> mo14427a(@mr2 GoogleApiClient googleApiClient, boolean z);

    @Deprecated
    /* renamed from: b */
    void mo14428b(@mr2 GoogleApiClient googleApiClient, boolean z);

    @mr2
    @Deprecated
    /* renamed from: c */
    PendingResult<Result> mo14429c(@mr2 GoogleApiClient googleApiClient, @mr2 Account account);

    @mr2
    @Deprecated
    /* renamed from: d */
    PendingResult<C1928a> mo14430d(@mr2 GoogleApiClient googleApiClient, @mr2 String str);
}
