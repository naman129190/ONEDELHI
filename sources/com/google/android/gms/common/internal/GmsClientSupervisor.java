package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;
import java.util.concurrent.Executor;

@KeepForSdk
public abstract class GmsClientSupervisor {
    @ts2
    @VisibleForTesting
    public static HandlerThread zza = null;
    private static final Object zzb = new Object();
    @ts2
    private static zzs zzc = null;
    @ts2
    private static Executor zzd = null;
    private static boolean zze = false;

    @KeepForSdk
    public static int getDefaultBindFlags() {
        return 4225;
    }

    @mr2
    @KeepForSdk
    public static GmsClientSupervisor getInstance(@mr2 Context context) {
        synchronized (zzb) {
            if (zzc == null) {
                zzc = new zzs(context.getApplicationContext(), zze ? getOrStartHandlerThread().getLooper() : context.getMainLooper(), zzd);
            }
        }
        return zzc;
    }

    @mr2
    @KeepForSdk
    public static HandlerThread getOrStartHandlerThread() {
        synchronized (zzb) {
            HandlerThread handlerThread = zza;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            zza = handlerThread2;
            handlerThread2.start();
            HandlerThread handlerThread3 = zza;
            return handlerThread3;
        }
    }

    @KeepForSdk
    public static void setDefaultBindExecutor(@ts2 Executor executor) {
        synchronized (zzb) {
            zzs zzs = zzc;
            if (zzs != null) {
                zzs.zzi(executor);
            }
            zzd = executor;
        }
    }

    @KeepForSdk
    public static void setUseHandlerThreadForCallbacks() {
        synchronized (zzb) {
            zzs zzs = zzc;
            if (zzs != null && !zze) {
                zzs.zzj(getOrStartHandlerThread().getLooper());
            }
            zze = true;
        }
    }

    @KeepForSdk
    public boolean bindService(@mr2 ComponentName componentName, @mr2 ServiceConnection serviceConnection, @mr2 String str) {
        return zzc(new zzo(componentName, 4225), serviceConnection, str, (Executor) null);
    }

    @KeepForSdk
    public boolean bindService(@mr2 ComponentName componentName, @mr2 ServiceConnection serviceConnection, @mr2 String str, @ts2 Executor executor) {
        return zzc(new zzo(componentName, 4225), serviceConnection, str, executor);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public boolean bindService(@mr2 String str, @mr2 ServiceConnection serviceConnection, @mr2 String str2) {
        return zzc(new zzo(str, 4225, false), serviceConnection, str2, (Executor) null);
    }

    @KeepForSdk
    public void unbindService(@mr2 ComponentName componentName, @mr2 ServiceConnection serviceConnection, @mr2 String str) {
        zza(new zzo(componentName, 4225), serviceConnection, str);
    }

    @KeepForSdk
    public void unbindService(@mr2 String str, @mr2 ServiceConnection serviceConnection, @mr2 String str2) {
        zza(new zzo(str, 4225, false), serviceConnection, str2);
    }

    public abstract void zza(zzo zzo, ServiceConnection serviceConnection, String str);

    public final void zzb(@mr2 String str, @mr2 String str2, int i, @mr2 ServiceConnection serviceConnection, @mr2 String str3, boolean z) {
        zza(new zzo(str, str2, 4225, z), serviceConnection, str3);
    }

    public abstract boolean zzc(zzo zzo, ServiceConnection serviceConnection, String str, @ts2 Executor executor);
}
