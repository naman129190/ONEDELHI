package com.google.android.gms.common;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.onedelhi.secure.C6067lx;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@RestrictedInheritance(allowedOnPath = ".*javatests.*/com/google/android/gms/common/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
@ShowFirstParty
@C6067lx
@KeepForSdk
public class PackageSignatureVerifier {
    @ts2
    @VisibleForTesting
    public static volatile zzac zza;
    @ts2
    private static zzad zzb;

    private static zzad zza() {
        zzad zzad;
        synchronized (zzad.class) {
            if (zzb == null) {
                zzb = new zzad();
            }
            zzad = zzb;
        }
        return zzad;
    }

    @ShowFirstParty
    @mr2
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerified(@mr2 Context context, @mr2 String str) {
        boolean honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(context);
        zza();
        if (zzn.zzf()) {
            String concat = String.valueOf(str).concat(true != honorsDebugCertificates ? "-0" : "-1");
            if (zza == null || !zza.zza.equals(concat)) {
                zza();
                zzx zzc = zzn.zzc(str, honorsDebugCertificates, false, false);
                if (zzc.zza) {
                    zza = new zzac(concat, PackageVerificationResult.zzd(str, zzc.zzd));
                } else {
                    Preconditions.checkNotNull(zzc.zzb);
                    return PackageVerificationResult.zza(str, zzc.zzb, zzc.zzc);
                }
            }
            return zza.zzb;
        }
        throw new zzae();
    }

    @ShowFirstParty
    @mr2
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerifiedWithRetry(@mr2 Context context, @mr2 String str) {
        try {
            PackageVerificationResult queryPackageSignatureVerified = queryPackageSignatureVerified(context, str);
            queryPackageSignatureVerified.zzb();
            return queryPackageSignatureVerified;
        } catch (SecurityException e) {
            PackageVerificationResult queryPackageSignatureVerified2 = queryPackageSignatureVerified(context, str);
            if (!queryPackageSignatureVerified2.zzc()) {
                return queryPackageSignatureVerified2;
            }
            Log.e("PkgSignatureVerifier", "Got flaky result during package signature verification", e);
            return queryPackageSignatureVerified2;
        }
    }
}
