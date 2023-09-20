package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.onedelhi.secure.nt2;
import com.onedelhi.secure.tn1;
import com.onedelhi.secure.ts2;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class zzj extends zzz {
    private final int zza;

    public zzj(byte[] bArr) {
        Preconditions.checkArgument(bArr.length == 25);
        this.zza = Arrays.hashCode(bArr);
    }

    public static byte[] zze(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(@ts2 Object obj) {
        tn1 zzd;
        if (obj != null && (obj instanceof zzaa)) {
            try {
                zzaa zzaa = (zzaa) obj;
                if (zzaa.zzc() != this.zza || (zzd = zzaa.zzd()) == null) {
                    return false;
                }
                return Arrays.equals(zzf(), (byte[]) nt2.m23165k8(zzd));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zza;
    }

    public final int zzc() {
        return this.zza;
    }

    public final tn1 zzd() {
        return nt2.m23166l8(zzf());
    }

    public abstract byte[] zzf();
}
