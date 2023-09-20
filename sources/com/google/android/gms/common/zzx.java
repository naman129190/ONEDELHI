package com.google.android.gms.common;

import android.util.Log;
import com.onedelhi.secure.C6067lx;
import com.onedelhi.secure.mr2;
import javax.annotation.Nullable;

@C6067lx
class zzx {
    private static final zzx zze = new zzx(true, 3, 1, (String) null, (Throwable) null);
    public final boolean zza;
    @Nullable
    public final String zzb;
    @Nullable
    public final Throwable zzc;
    public final int zzd;

    private zzx(boolean z, int i, int i2, @Nullable String str, @Nullable Throwable th) {
        this.zza = z;
        this.zzd = i;
        this.zzb = str;
        this.zzc = th;
    }

    public /* synthetic */ zzx(boolean z, int i, int i2, String str, Throwable th, zzw zzw) {
        this(false, 1, 5, (String) null, (Throwable) null);
    }

    @Deprecated
    public static zzx zzb() {
        return zze;
    }

    public static zzx zzc(@mr2 String str) {
        return new zzx(false, 1, 5, str, (Throwable) null);
    }

    public static zzx zzd(@mr2 String str, @mr2 Throwable th) {
        return new zzx(false, 1, 5, str, th);
    }

    public static zzx zzf(int i) {
        return new zzx(true, i, 1, (String) null, (Throwable) null);
    }

    public static zzx zzg(int i, int i2, @mr2 String str, @Nullable Throwable th) {
        return new zzx(false, i, i2, str, th);
    }

    @Nullable
    public String zza() {
        return this.zzb;
    }

    public final void zze() {
        if (!this.zza && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.zzc != null) {
                Log.d("GoogleCertificatesRslt", zza(), this.zzc);
            } else {
                Log.d("GoogleCertificatesRslt", zza());
            }
        }
    }
}
