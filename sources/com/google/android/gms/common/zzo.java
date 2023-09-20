package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.onedelhi.secure.nt2;
import com.onedelhi.secure.tn1;

@SafeParcelable.Class(creator = "GoogleCertificatesLookupQueryCreator")
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();
    @SafeParcelable.Field(getter = "getCallingPackage", mo10053id = 1)
    private final String zza;
    @SafeParcelable.Field(getter = "getAllowTestKeys", mo10053id = 2)
    private final boolean zzb;
    @SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", mo10053id = 3)
    private final boolean zzc;
    @SafeParcelable.Field(getter = "getCallingContextBinder", mo10053id = 4, type = "android.os.IBinder")
    private final Context zzd;
    @SafeParcelable.Field(getter = "getIsChimeraPackage", mo10053id = 5)
    private final boolean zze;
    @SafeParcelable.Field(getter = "getIncludeHashesInErrorMessage", mo10053id = 6)
    private final boolean zzf;

    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param(mo10056id = 1) String str, @SafeParcelable.Param(mo10056id = 2) boolean z, @SafeParcelable.Param(mo10056id = 3) boolean z2, @SafeParcelable.Param(mo10056id = 4) IBinder iBinder, @SafeParcelable.Param(mo10056id = 5) boolean z3, @SafeParcelable.Param(mo10056id = 6) boolean z4) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = (Context) nt2.m23165k8(tn1.C3647a.m28820j8(iBinder));
        this.zze = z3;
        this.zzf = z4;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [com.onedelhi.secure.tn1, android.os.IBinder] */
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeIBinder(parcel, 4, nt2.m23166l8(this.zzd), false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
