package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.onedelhi.secure.C4101zk;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@VisibleForTesting
public final class zzd extends zzac {
    @ts2
    private BaseGmsClient zza;
    private final int zzb;

    public zzd(@mr2 BaseGmsClient baseGmsClient, int i) {
        this.zza = baseGmsClient;
        this.zzb = i;
    }

    @C4101zk
    public final void onPostInitComplete(int i, @mr2 IBinder iBinder, @ts2 Bundle bundle) {
        Preconditions.checkNotNull(this.zza, "onPostInitComplete can be called only once per call to getRemoteService");
        this.zza.onPostInitHandler(i, iBinder, bundle, this.zzb);
        this.zza = null;
    }

    @C4101zk
    public final void zzb(int i, @ts2 Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @C4101zk
    public final void zzc(int i, @mr2 IBinder iBinder, @mr2 zzk zzk) {
        BaseGmsClient baseGmsClient = this.zza;
        Preconditions.checkNotNull(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        Preconditions.checkNotNull(zzk);
        BaseGmsClient.zzj(baseGmsClient, zzk);
        onPostInitComplete(i, iBinder, zzk.zza);
    }
}
