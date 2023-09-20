package com.onedelhi.secure;

import com.onedelhi.secure.g15;
import com.phonepe.intent.sdk.contracts.DeviceIdListener;
import java.util.Map;

public final /* synthetic */ class y05 implements DeviceIdListener {

    /* renamed from: a */
    public final /* synthetic */ g15.C5355a f37755a;

    /* renamed from: a */
    public final /* synthetic */ g15 f37756a;

    /* renamed from: a */
    public final /* synthetic */ Map f37757a;

    public /* synthetic */ y05(g15 g15, Map map, g15.C5355a aVar) {
        this.f37756a = g15;
        this.f37757a = map;
        this.f37755a = aVar;
    }

    public final void onDeviceIdAvailable(String str) {
        this.f37756a.mo36533n(this.f37757a, this.f37755a, str);
    }
}
