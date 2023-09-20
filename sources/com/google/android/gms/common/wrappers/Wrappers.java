package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@KeepForSdk
public class Wrappers {
    private static final Wrappers zza = new Wrappers();
    @ts2
    private PackageManagerWrapper zzb = null;

    @mr2
    @KeepForSdk
    public static PackageManagerWrapper packageManager(@mr2 Context context) {
        return zza.zza(context);
    }

    @mr2
    @VisibleForTesting
    public final synchronized PackageManagerWrapper zza(@mr2 Context context) {
        if (this.zzb == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.zzb = new PackageManagerWrapper(context);
        }
        return this.zzb;
    }
}
