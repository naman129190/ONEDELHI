package com.onedelhi.secure;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;

public final class ss5 extends xs5 {

    /* renamed from: a */
    public final /* synthetic */ c82 f20506a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ss5(ct5 ct5, GoogleApiClient googleApiClient, c82 c82, String str) {
        super(googleApiClient);
        this.f20506a = c82;
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        xx5 xx5 = (xx5) anyClient;
        c82 c82 = this.f20506a;
        Preconditions.checkArgument(c82 != null, "locationSettingsRequest can't be null");
        ((tv6) xx5.getService()).mo14875V7(c82, new kv5(this), (String) null);
    }
}
