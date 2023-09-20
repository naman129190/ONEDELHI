package com.onedelhi.secure;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import java.util.List;

public interface vf1 extends HasApiKey<Api.ApiOptions.NoOptions> {
    @mr2
    /* renamed from: D */
    w94<Void> mo19178D(@mr2 List<String> list);

    @mr2
    @wj3("android.permission.ACCESS_FINE_LOCATION")
    /* renamed from: J */
    w94<Void> mo19179J(@mr2 xf1 xf1, @mr2 PendingIntent pendingIntent);

    @mr2
    /* renamed from: L */
    w94<Void> mo19180L(@mr2 PendingIntent pendingIntent);
}
