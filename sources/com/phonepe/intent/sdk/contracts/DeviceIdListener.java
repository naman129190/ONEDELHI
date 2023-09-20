package com.phonepe.intent.sdk.contracts;

import com.onedelhi.secure.ss2;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/phonepe/intent/sdk/contracts/DeviceIdListener;", "", "", "deviceId", "Lcom/onedelhi/secure/un4;", "onDeviceIdAvailable", "IntentSDK_release"}, k = 1, mv = {1, 5, 1})
public interface DeviceIdListener {
    void onDeviceIdAvailable(@ss2 String str);
}
