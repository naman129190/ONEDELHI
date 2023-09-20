package com.google.android.gms.common;

import com.onedelhi.secure.C6067lx;
import com.onedelhi.secure.mr2;
import javax.annotation.Nullable;

@C6067lx
public class PackageVerificationResult {
    private final String zza;
    private final boolean zzb;
    @Nullable
    private final String zzc;
    @Nullable
    private final Throwable zzd;

    private PackageVerificationResult(String str, int i, boolean z, @Nullable String str2, @Nullable Throwable th) {
        this.zza = str;
        this.zzb = z;
        this.zzc = str2;
        this.zzd = th;
    }

    @mr2
    public static PackageVerificationResult zza(@mr2 String str, @mr2 String str2, @Nullable Throwable th) {
        return new PackageVerificationResult(str, 1, false, str2, th);
    }

    @mr2
    public static PackageVerificationResult zzd(@mr2 String str, int i) {
        return new PackageVerificationResult(str, i, true, (String) null, (Throwable) null);
    }

    public final void zzb() {
        if (!this.zzb) {
            String valueOf = String.valueOf(this.zzc);
            Throwable th = this.zzd;
            String concat = "PackageVerificationRslt: ".concat(valueOf);
            if (th != null) {
                throw new SecurityException(concat, th);
            }
            throw new SecurityException(concat);
        }
    }

    public final boolean zzc() {
        return this.zzb;
    }
}
