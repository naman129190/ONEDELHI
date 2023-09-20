package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import com.onedelhi.secure.C3042oa;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.w94;
import com.onedelhi.secure.x94;
import java.util.Iterator;
import java.util.Set;

public final class zal {
    private final C3042oa zaa = new C3042oa();
    private final C3042oa zab = new C3042oa();
    private final x94 zac = new x94();
    private int zad;
    private boolean zae = false;

    public zal(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zaa.put(((HasApiKey) it.next()).getApiKey(), null);
        }
        this.zad = this.zaa.keySet().size();
    }

    public final w94 zaa() {
        return this.zac.mo26835a();
    }

    public final Set zab() {
        return this.zaa.keySet();
    }

    public final void zac(ApiKey apiKey, ConnectionResult connectionResult, @ts2 String str) {
        this.zaa.put(apiKey, connectionResult);
        this.zab.put(apiKey, str);
        this.zad--;
        if (!connectionResult.isSuccess()) {
            this.zae = true;
        }
        if (this.zad != 0) {
            return;
        }
        if (this.zae) {
            this.zac.mo26836b(new AvailabilityException(this.zaa));
            return;
        }
        this.zac.mo26837c(this.zab);
    }
}
