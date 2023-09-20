package com.onedelhi.secure;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
@KeepForSdk
public interface h73 {

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: com.onedelhi.secure.h73$a */
    public interface C2314a extends Result {
        @mr2
        @KeepForSdk
        /* renamed from: b */
        o73 mo17129b();
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: com.onedelhi.secure.h73$b */
    public interface C2315b extends Result {
        @ShowFirstParty
        @mr2
        @KeepForSdk
        /* renamed from: l1 */
        String mo17130l1();
    }

    @ShowFirstParty
    @mr2
    @KeepForSdk
    @Deprecated
    /* renamed from: a */
    PendingResult<C2315b> mo17127a(@mr2 GoogleApiClient googleApiClient);

    @mr2
    @KeepForSdk
    @Deprecated
    /* renamed from: b */
    PendingResult<C2314a> mo17128b(@mr2 GoogleApiClient googleApiClient, @mr2 n73 n73);
}
