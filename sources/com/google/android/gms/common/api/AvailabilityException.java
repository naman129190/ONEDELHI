package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.C3042oa;
import com.onedelhi.secure.mr2;
import java.util.ArrayList;

public class AvailabilityException extends Exception {
    private final C3042oa zaa;

    public AvailabilityException(@mr2 C3042oa oaVar) {
        this.zaa = oaVar;
    }

    @mr2
    public ConnectionResult getConnectionResult(@mr2 GoogleApi<? extends Api.ApiOptions> googleApi) {
        ApiKey<? extends Api.ApiOptions> apiKey = googleApi.getApiKey();
        boolean z = this.zaa.get(apiKey) != null;
        String zaa2 = apiKey.zaa();
        Preconditions.checkArgument(z, "The given API (" + zaa2 + ") was not part of the availability request.");
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
    }

    @mr2
    public ConnectionResult getConnectionResult(@mr2 HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        ApiKey<? extends Api.ApiOptions> apiKey = hasApiKey.getApiKey();
        boolean z = this.zaa.get(apiKey) != null;
        String zaa2 = apiKey.zaa();
        Preconditions.checkArgument(z, "The given API (" + zaa2 + ") was not part of the availability request.");
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
    }

    @mr2
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (ApiKey apiKey : this.zaa.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
            z &= !connectionResult.isSuccess();
            String zaa2 = apiKey.zaa();
            String valueOf = String.valueOf(connectionResult);
            arrayList.add(zaa2 + ": " + valueOf);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}
