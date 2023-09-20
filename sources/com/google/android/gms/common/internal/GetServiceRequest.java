package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@KeepForSdk
@SafeParcelable.Class(creator = "GetServiceRequestCreator")
@SafeParcelable.Reserved({9})
public class GetServiceRequest extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new zzn();
    public static final Scope[] zza = new Scope[0];
    public static final Feature[] zzb = new Feature[0];
    @SafeParcelable.VersionField(mo10062id = 1)
    public final int zzc;
    @SafeParcelable.Field(mo10053id = 2)
    public final int zzd;
    @SafeParcelable.Field(mo10053id = 3)
    public final int zze;
    @SafeParcelable.Field(mo10053id = 4)
    public String zzf;
    @SafeParcelable.Field(mo10053id = 5)
    @ts2
    public IBinder zzg;
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_SCOPES", mo10053id = 6)
    public Scope[] zzh;
    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.Bundle()", mo10053id = 7)
    public Bundle zzi;
    @SafeParcelable.Field(mo10053id = 8)
    @ts2
    public Account zzj;
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", mo10053id = 10)
    public Feature[] zzk;
    @SafeParcelable.Field(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", mo10053id = 11)
    public Feature[] zzl;
    @SafeParcelable.Field(mo10053id = 12)
    public final boolean zzm;
    @SafeParcelable.Field(defaultValue = "0", mo10053id = 13)
    public final int zzn;
    @SafeParcelable.Field(getter = "isRequestingTelemetryConfiguration", mo10053id = 14)
    public boolean zzo;
    @SafeParcelable.Field(getter = "getAttributionTag", mo10053id = 15)
    @ts2
    private final String zzp;

    @SafeParcelable.Constructor
    public GetServiceRequest(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) int i2, @SafeParcelable.Param(mo10056id = 3) int i3, @SafeParcelable.Param(mo10056id = 4) String str, @SafeParcelable.Param(mo10056id = 5) @ts2 IBinder iBinder, @SafeParcelable.Param(mo10056id = 6) Scope[] scopeArr, @SafeParcelable.Param(mo10056id = 7) Bundle bundle, @SafeParcelable.Param(mo10056id = 8) @ts2 Account account, @SafeParcelable.Param(mo10056id = 10) Feature[] featureArr, @SafeParcelable.Param(mo10056id = 11) Feature[] featureArr2, @SafeParcelable.Param(mo10056id = 12) boolean z, @SafeParcelable.Param(mo10056id = 13) int i4, @SafeParcelable.Param(mo10056id = 14) boolean z2, @SafeParcelable.Param(mo10056id = 15) @ts2 String str2) {
        scopeArr = scopeArr == null ? zza : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? zzb : featureArr;
        featureArr2 = featureArr2 == null ? zzb : featureArr2;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        if ("com.google.android.gms".equals(str)) {
            this.zzf = "com.google.android.gms";
        } else {
            this.zzf = str;
        }
        if (i < 2) {
            this.zzj = iBinder != null ? AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(iBinder)) : null;
        } else {
            this.zzg = iBinder;
            this.zzj = account;
        }
        this.zzh = scopeArr;
        this.zzi = bundle;
        this.zzk = featureArr;
        this.zzl = featureArr2;
        this.zzm = z;
        this.zzn = i4;
        this.zzo = z2;
        this.zzp = str2;
    }

    @mr2
    @KeepForSdk
    public Bundle getExtraArgs() {
        return this.zzi;
    }

    public final void writeToParcel(@mr2 Parcel parcel, int i) {
        zzn.zza(this, parcel, i);
    }

    @ts2
    public final String zza() {
        return this.zzp;
    }
}
