package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.onedelhi.secure.np1;
import com.onedelhi.secure.ts2;
import com.onedelhi.secure.zh6;
import java.util.HashMap;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

final class zzs extends GmsClientSupervisor {
    /* access modifiers changed from: private */
    @GuardedBy("connectionStatus")
    public final HashMap zzb = new HashMap();
    /* access modifiers changed from: private */
    public final Context zzc;
    /* access modifiers changed from: private */
    public volatile Handler zzd;
    private final zzr zze;
    /* access modifiers changed from: private */
    public final ConnectionTracker zzf;
    private final long zzg;
    /* access modifiers changed from: private */
    public final long zzh;
    @ts2
    private volatile Executor zzi;

    public zzs(Context context, Looper looper, @ts2 Executor executor) {
        zzr zzr = new zzr(this, (zzq) null);
        this.zze = zzr;
        this.zzc = context.getApplicationContext();
        this.zzd = new zh6(looper, zzr);
        this.zzf = ConnectionTracker.getInstance();
        this.zzg = 5000;
        this.zzh = np1.f32709a;
        this.zzi = executor;
    }

    public final void zza(zzo zzo, ServiceConnection serviceConnection, String str) {
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zzb) {
            zzp zzp = (zzp) this.zzb.get(zzo);
            if (zzp == null) {
                String obj = zzo.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
            } else if (zzp.zzh(serviceConnection)) {
                zzp.zzf(serviceConnection, str);
                if (zzp.zzi()) {
                    this.zzd.sendMessageDelayed(this.zzd.obtainMessage(0, zzo), this.zzg);
                }
            } else {
                String obj2 = zzo.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
            }
        }
    }

    public final boolean zzc(zzo zzo, ServiceConnection serviceConnection, String str, @ts2 Executor executor) {
        boolean zzj;
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.zzb) {
            zzp zzp = (zzp) this.zzb.get(zzo);
            if (executor == null) {
                executor = this.zzi;
            }
            if (zzp == null) {
                zzp = new zzp(this, zzo);
                zzp.zzd(serviceConnection, serviceConnection, str);
                zzp.zze(str, executor);
                this.zzb.put(zzo, zzp);
            } else {
                this.zzd.removeMessages(0, zzo);
                if (!zzp.zzh(serviceConnection)) {
                    zzp.zzd(serviceConnection, serviceConnection, str);
                    int zza = zzp.zza();
                    if (zza == 1) {
                        serviceConnection.onServiceConnected(zzp.zzb(), zzp.zzc());
                    } else if (zza == 2) {
                        zzp.zze(str, executor);
                    }
                } else {
                    String obj = zzo.toString();
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                }
            }
            zzj = zzp.zzj();
        }
        return zzj;
    }

    public final void zzi(@ts2 Executor executor) {
        synchronized (this.zzb) {
            this.zzi = executor;
        }
    }

    public final void zzj(Looper looper) {
        synchronized (this.zzb) {
            this.zzd = new zh6(looper, this.zze);
        }
    }
}
