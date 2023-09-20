package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.vf4;
import java.util.List;
import javax.annotation.Nullable;

@KeepForSdk
@SafeParcelable.Class(creator = "WakeLockEventCreator")
@Deprecated
public final class WakeLockEvent extends StatsEvent {
    @mr2
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();
    @SafeParcelable.VersionField(mo10062id = 1)
    public final int zza;
    @SafeParcelable.Field(getter = "getTimeMillis", mo10053id = 2)
    private final long zzb;
    @SafeParcelable.Field(getter = "getEventType", mo10053id = 11)
    private final int zzc;
    @SafeParcelable.Field(getter = "getWakeLockName", mo10053id = 4)
    private final String zzd;
    @SafeParcelable.Field(getter = "getSecondaryWakeLockName", mo10053id = 10)
    private final String zze;
    @SafeParcelable.Field(getter = "getCodePackage", mo10053id = 17)
    private final String zzf;
    @SafeParcelable.Field(getter = "getWakeLockType", mo10053id = 5)
    private final int zzg;
    @SafeParcelable.Field(getter = "getCallingPackages", mo10053id = 6)
    @Nullable
    private final List zzh;
    @SafeParcelable.Field(getter = "getEventKey", mo10053id = 12)
    private final String zzi;
    @SafeParcelable.Field(getter = "getElapsedRealtime", mo10053id = 8)
    private final long zzj;
    @SafeParcelable.Field(getter = "getDeviceState", mo10053id = 14)
    private final int zzk;
    @SafeParcelable.Field(getter = "getHostPackage", mo10053id = 13)
    private final String zzl;
    @SafeParcelable.Field(getter = "getBeginPowerPercentage", mo10053id = 15)
    private final float zzm;
    @SafeParcelable.Field(getter = "getTimeout", mo10053id = 16)
    private final long zzn;
    @SafeParcelable.Field(getter = "getAcquiredWithTimeout", mo10053id = 18)
    private final boolean zzo;

    @SafeParcelable.Constructor
    public WakeLockEvent(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) long j, @SafeParcelable.Param(mo10056id = 11) int i2, @SafeParcelable.Param(mo10056id = 4) String str, @SafeParcelable.Param(mo10056id = 5) int i3, @SafeParcelable.Param(mo10056id = 6) @Nullable List list, @SafeParcelable.Param(mo10056id = 12) String str2, @SafeParcelable.Param(mo10056id = 8) long j2, @SafeParcelable.Param(mo10056id = 14) int i4, @SafeParcelable.Param(mo10056id = 10) String str3, @SafeParcelable.Param(mo10056id = 13) String str4, @SafeParcelable.Param(mo10056id = 15) float f, @SafeParcelable.Param(mo10056id = 16) long j3, @SafeParcelable.Param(mo10056id = 17) String str5, @SafeParcelable.Param(mo10056id = 18) boolean z) {
        this.zza = i;
        this.zzb = j;
        this.zzc = i2;
        this.zzd = str;
        this.zze = str3;
        this.zzf = str5;
        this.zzg = i3;
        this.zzh = list;
        this.zzi = str2;
        this.zzj = j2;
        this.zzk = i4;
        this.zzl = str4;
        this.zzm = f;
        this.zzn = j3;
        this.zzo = z;
    }

    public final void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzg);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzh, false);
        SafeParcelWriter.writeLong(parcel, 8, this.zzj);
        SafeParcelWriter.writeString(parcel, 10, this.zze, false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzc);
        SafeParcelWriter.writeString(parcel, 12, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeInt(parcel, 14, this.zzk);
        SafeParcelWriter.writeFloat(parcel, 15, this.zzm);
        SafeParcelWriter.writeLong(parcel, 16, this.zzn);
        SafeParcelWriter.writeString(parcel, 17, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zzc;
    }

    public final long zzb() {
        return this.zzb;
    }

    @mr2
    public final String zzc() {
        List list = this.zzh;
        String str = this.zzd;
        int i = this.zzg;
        String str2 = "";
        String join = list == null ? str2 : TextUtils.join(vf4.f36537c, list);
        int i2 = this.zzk;
        String str3 = this.zze;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = this.zzl;
        if (str4 == null) {
            str4 = str2;
        }
        float f = this.zzm;
        String str5 = this.zzf;
        if (str5 != null) {
            str2 = str5;
        }
        boolean z = this.zzo;
        return "\t" + str + "\t" + i + "\t" + join + "\t" + i2 + "\t" + str3 + "\t" + str4 + "\t" + f + "\t" + str2 + "\t" + z;
    }
}
