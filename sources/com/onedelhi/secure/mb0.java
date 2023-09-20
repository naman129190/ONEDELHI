package com.onedelhi.secure;

import android.content.Intent;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.Status;

public interface mb0 extends HasApiKey<y65> {
    @mr2
    /* renamed from: C */
    w94<rq3> mo14537C(@mr2 SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest);

    @mr2
    /* renamed from: k */
    Status mo14538k(@ts2 Intent intent);

    @mr2
    /* renamed from: l */
    w94<tq3> mo14539l(@mr2 sq3 sq3);
}
