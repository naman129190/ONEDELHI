package com.phonepe.intent.sdk.api;

import com.onedelhi.secure.vr2;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/phonepe/intent/sdk/api/CheckPhonePeAvailabilityCallback;", "", "", "isAvailable", "", "responseCode", "Lcom/onedelhi/secure/un4;", "onResponse", "IntentSDK_release"}, k = 1, mv = {1, 5, 1})
public interface CheckPhonePeAvailabilityCallback {
    void onResponse(boolean z, @vr2 String str);
}
