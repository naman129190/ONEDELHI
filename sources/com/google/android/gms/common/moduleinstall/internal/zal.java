package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.onedelhi.secure.x94;

public final /* synthetic */ class zal implements RemoteCall {
    public final /* synthetic */ zay zaa;
    public final /* synthetic */ ApiFeatureRequest zab;

    public /* synthetic */ zal(zay zay, ApiFeatureRequest apiFeatureRequest) {
        this.zaa = zay;
        this.zab = apiFeatureRequest;
    }

    public final void accept(Object obj, Object obj2) {
        zay zay = this.zaa;
        ApiFeatureRequest apiFeatureRequest = this.zab;
        ((zaf) ((zaz) obj).getService()).zah(new zax(zay, (x94) obj2), apiFeatureRequest);
    }
}
