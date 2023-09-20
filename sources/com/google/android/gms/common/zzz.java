package com.google.android.gms.common;

import com.google.android.gms.common.internal.Preconditions;
import com.onedelhi.secure.C7277xt;
import com.onedelhi.secure.ee5;
import com.onedelhi.secure.ts2;
import java.util.List;

final class zzz {
    @ts2
    private String zza = null;
    private long zzb = -1;
    private ee5 zzc = ee5.m13720s();
    private ee5 zzd = ee5.m13720s();

    @C7277xt
    public final zzz zza(long j) {
        this.zzb = j;
        return this;
    }

    @C7277xt
    public final zzz zzb(List list) {
        Preconditions.checkNotNull(list);
        this.zzd = ee5.m13719r(list);
        return this;
    }

    @C7277xt
    public final zzz zzc(List list) {
        Preconditions.checkNotNull(list);
        this.zzc = ee5.m13719r(list);
        return this;
    }

    @C7277xt
    public final zzz zzd(String str) {
        this.zza = str;
        return this;
    }

    public final zzab zze() {
        if (this.zza == null) {
            throw new IllegalStateException("packageName must be defined");
        } else if (this.zzb < 0) {
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        } else if (!this.zzc.isEmpty() || !this.zzd.isEmpty()) {
            return new zzab(this.zza, this.zzb, this.zzc, this.zzd, (zzaa) null);
        } else {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
    }
}
