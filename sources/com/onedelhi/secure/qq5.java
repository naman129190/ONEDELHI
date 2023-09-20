package com.onedelhi.secure;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.onedelhi.secure.xf1;
import java.util.List;

public final class qq5 implements uf1 {
    /* renamed from: e */
    public static /* bridge */ /* synthetic */ x94 m26051e(BaseImplementation.ResultHolder resultHolder) {
        x94 x94 = new x94();
        x94.mo26835a().mo17573e(new rp5(resultHolder));
        return x94;
    }

    /* renamed from: a */
    public final PendingResult<Status> mo23348a(GoogleApiClient googleApiClient, List<String> list) {
        return googleApiClient.execute(new gq5(this, googleApiClient, list));
    }

    /* renamed from: b */
    public final PendingResult<Status> mo23349b(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return googleApiClient.execute(new bq5(this, googleApiClient, pendingIntent));
    }

    @Deprecated
    /* renamed from: c */
    public final PendingResult<Status> mo23350c(GoogleApiClient googleApiClient, List<sf1> list, PendingIntent pendingIntent) {
        xf1.C3920a aVar = new xf1.C3920a();
        aVar.mo26915b(list);
        aVar.mo26917d(5);
        return googleApiClient.execute(new wp5(this, googleApiClient, aVar.mo26916c(), pendingIntent));
    }

    /* renamed from: d */
    public final PendingResult<Status> mo23351d(GoogleApiClient googleApiClient, xf1 xf1, PendingIntent pendingIntent) {
        return googleApiClient.execute(new wp5(this, googleApiClient, xf1, pendingIntent));
    }
}
