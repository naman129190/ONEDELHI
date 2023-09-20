package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.onedelhi.secure.C4101zk;
import com.onedelhi.secure.ts2;

public final class zzg extends zza {
    public final /* synthetic */ BaseGmsClient zze;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C4101zk
    public zzg(BaseGmsClient baseGmsClient, @ts2 int i, Bundle bundle) {
        super(baseGmsClient, i, (Bundle) null);
        this.zze = baseGmsClient;
    }

    public final void zzb(ConnectionResult connectionResult) {
        if (!this.zze.enableLocalFallback() || !BaseGmsClient.zzo(this.zze)) {
            this.zze.zzc.onReportServiceBinding(connectionResult);
            this.zze.onConnectionFailed(connectionResult);
            return;
        }
        BaseGmsClient.zzk(this.zze, 16);
    }

    public final boolean zzd() {
        this.zze.zzc.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
        return true;
    }
}
