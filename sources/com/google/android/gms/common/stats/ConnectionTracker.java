package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.onedelhi.secure.mr2;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

@KeepForSdk
public class ConnectionTracker {
    private static final Object zzb = new Object();
    @Nullable
    private static volatile ConnectionTracker zzc;
    @mr2
    @VisibleForTesting
    public final ConcurrentHashMap zza = new ConcurrentHashMap();

    private ConnectionTracker() {
    }

    @mr2
    @KeepForSdk
    public static ConnectionTracker getInstance() {
        if (zzc == null) {
            synchronized (zzb) {
                if (zzc == null) {
                    zzc = new ConnectionTracker();
                }
            }
        }
        ConnectionTracker connectionTracker = zzc;
        Preconditions.checkNotNull(connectionTracker);
        return connectionTracker;
    }

    private static void zzb(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean zzc(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z, @Nullable Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((Wrappers.packageManager(context).getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!zzd(serviceConnection)) {
            return zze(context, intent, serviceConnection, i, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.zza.putIfAbsent(serviceConnection, serviceConnection);
        if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()}));
        }
        try {
            boolean zze = zze(context, intent, serviceConnection, i, executor);
            if (zze) {
                return zze;
            }
            return false;
        } finally {
            this.zza.remove(serviceConnection, serviceConnection);
        }
    }

    private static boolean zzd(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof zzt);
    }

    private static final boolean zze(Context context, Intent intent, ServiceConnection serviceConnection, int i, @Nullable Executor executor) {
        return (!PlatformVersion.isAtLeastQ() || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public boolean bindService(@mr2 Context context, @mr2 Intent intent, @mr2 ServiceConnection serviceConnection, int i) {
        return zzc(context, context.getClass().getName(), intent, serviceConnection, i, true, (Executor) null);
    }

    @KeepForSdk
    public void unbindService(@mr2 Context context, @mr2 ServiceConnection serviceConnection) {
        if (!zzd(serviceConnection) || !this.zza.containsKey(serviceConnection)) {
            zzb(context, serviceConnection);
            return;
        }
        try {
            zzb(context, (ServiceConnection) this.zza.get(serviceConnection));
        } finally {
            this.zza.remove(serviceConnection);
        }
    }

    @KeepForSdk
    public void unbindServiceSafe(@mr2 Context context, @mr2 ServiceConnection serviceConnection) {
        try {
            unbindService(context, serviceConnection);
        } catch (IllegalArgumentException unused) {
        }
    }

    @ResultIgnorabilityUnspecified
    public final boolean zza(@mr2 Context context, @mr2 String str, @mr2 Intent intent, @mr2 ServiceConnection serviceConnection, int i, @Nullable Executor executor) {
        return zzc(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
