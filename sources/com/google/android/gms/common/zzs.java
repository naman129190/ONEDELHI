package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.onedelhi.secure.nt2;
import com.onedelhi.secure.tn1;
import javax.annotation.Nullable;

@SafeParcelable.Class(creator = "GoogleCertificatesQueryCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    @SafeParcelable.Field(getter = "getCallingPackage", mo10053id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getCallingCertificateBinder", mo10053id = 2, type = "android.os.IBinder")
    @Nullable
    private final zzj zzb;
    @SafeParcelable.Field(getter = "getAllowTestKeys", mo10053id = 3)
    private final boolean zzc;
    @SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", mo10053id = 4)
    private final boolean zzd;

    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(mo10056id = 1) String str, @SafeParcelable.Param(mo10056id = 2) @Nullable IBinder iBinder, @SafeParcelable.Param(mo10056id = 3) boolean z, @SafeParcelable.Param(mo10056id = 4) boolean z2) {
        this.zza = str;
        zzk zzk = null;
        if (iBinder != null) {
            try {
                tn1 zzd2 = zzz.zzg(iBinder).zzd();
                byte[] bArr = zzd2 == null ? null : (byte[]) nt2.m23165k8(zzd2);
                if (bArr != null) {
                    zzk = new zzk(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.zzb = zzk;
        this.zzc = z;
        this.zzd = z2;
    }

    public zzs(String str, @Nullable zzj zzj, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = zzj;
        this.zzc = z;
        this.zzd = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        zzj zzj = this.zzb;
        if (zzj == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            zzj = null;
        }
        SafeParcelWriter.writeIBinder(parcel, 2, zzj, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
