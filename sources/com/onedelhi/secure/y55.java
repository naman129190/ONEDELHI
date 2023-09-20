package com.onedelhi.secure;

import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;

public final /* synthetic */ class y55 implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ SaveAccountLinkingTokenRequest f22892a;

    /* renamed from: a */
    public final /* synthetic */ d65 f22893a;

    public /* synthetic */ y55(d65 d65, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        this.f22893a = d65;
        this.f22892a = saveAccountLinkingTokenRequest;
    }

    public final void accept(Object obj, Object obj2) {
        d65 d65 = this.f22893a;
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = this.f22892a;
        ((k95) ((g95) obj).getService()).mo18964l8(new b65(d65, (x94) obj2), (SaveAccountLinkingTokenRequest) Preconditions.checkNotNull(saveAccountLinkingTokenRequest));
    }
}
