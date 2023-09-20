package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.onedelhi.secure.C6067lx;
import com.onedelhi.secure.C7277xt;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@SafeParcelable.Class(creator = "StatusCreator")
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {
    @mr2
    public static final Parcelable.Creator<Status> CREATOR = new zzb();
    @ShowFirstParty
    @mr2
    @KeepForSdk
    public static final Status RESULT_CANCELED = new Status(16);
    @mr2
    @KeepForSdk
    public static final Status RESULT_DEAD_CLIENT = new Status(18);
    @ShowFirstParty
    @mr2
    @KeepForSdk
    public static final Status RESULT_INTERNAL_ERROR = new Status(8);
    @ShowFirstParty
    @mr2
    @KeepForSdk
    public static final Status RESULT_INTERRUPTED = new Status(14);
    @ShowFirstParty
    @mr2
    @KeepForSdk
    public static final Status RESULT_SUCCESS = new Status(0);
    @ShowFirstParty
    @mr2
    @KeepForSdk
    public static final Status RESULT_SUCCESS_CACHE = new Status(-1);
    @ShowFirstParty
    @mr2
    @KeepForSdk
    public static final Status RESULT_TIMEOUT = new Status(15);
    @ShowFirstParty
    @mr2
    public static final Status zza = new Status(17);
    @SafeParcelable.VersionField(mo10062id = 1000)
    public final int zzb;
    @SafeParcelable.Field(getter = "getStatusCode", mo10053id = 1)
    private final int zzc;
    @SafeParcelable.Field(getter = "getStatusMessage", mo10053id = 2)
    @ts2
    private final String zzd;
    @SafeParcelable.Field(getter = "getPendingIntent", mo10053id = 3)
    @ts2
    private final PendingIntent zze;
    @SafeParcelable.Field(getter = "getConnectionResult", mo10053id = 4)
    @ts2
    private final ConnectionResult zzf;

    public Status(int i) {
        this(i, (String) null);
    }

    @SafeParcelable.Constructor
    public Status(@SafeParcelable.Param(mo10056id = 1000) int i, @SafeParcelable.Param(mo10056id = 1) int i2, @SafeParcelable.Param(mo10056id = 2) @ts2 String str, @SafeParcelable.Param(mo10056id = 3) @ts2 PendingIntent pendingIntent, @SafeParcelable.Param(mo10056id = 4) @ts2 ConnectionResult connectionResult) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = str;
        this.zze = pendingIntent;
        this.zzf = connectionResult;
    }

    public Status(int i, @ts2 String str) {
        this(1, i, str, (PendingIntent) null, (ConnectionResult) null);
    }

    public Status(int i, @ts2 String str, @ts2 PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent, (ConnectionResult) null);
    }

    public Status(@mr2 ConnectionResult connectionResult, @mr2 String str) {
        this(connectionResult, str, 17);
    }

    @KeepForSdk
    @Deprecated
    public Status(@mr2 ConnectionResult connectionResult, @mr2 String str, int i) {
        this(1, i, str, connectionResult.getResolution(), connectionResult);
    }

    public boolean equals(@ts2 Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.zzb == status.zzb && this.zzc == status.zzc && Objects.equal(this.zzd, status.zzd) && Objects.equal(this.zze, status.zze) && Objects.equal(this.zzf, status.zzf);
    }

    @ts2
    public ConnectionResult getConnectionResult() {
        return this.zzf;
    }

    @ts2
    public PendingIntent getResolution() {
        return this.zze;
    }

    @mr2
    @C7277xt
    public Status getStatus() {
        return this;
    }

    @ResultIgnorabilityUnspecified
    public int getStatusCode() {
        return this.zzc;
    }

    @ts2
    public String getStatusMessage() {
        return this.zzd;
    }

    @VisibleForTesting
    public boolean hasResolution() {
        return this.zze != null;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd, this.zze, this.zzf);
    }

    public boolean isCanceled() {
        return this.zzc == 16;
    }

    public boolean isInterrupted() {
        return this.zzc == 14;
    }

    @C6067lx
    public boolean isSuccess() {
        return this.zzc <= 0;
    }

    public void startResolutionForResult(@mr2 Activity activity, int i) throws IntentSender.SendIntentException {
        if (hasResolution()) {
            PendingIntent pendingIntent = this.zze;
            Preconditions.checkNotNull(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, (Intent) null, 0, 0, 0);
        }
    }

    @mr2
    public String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper(this);
        stringHelper.add("statusCode", zza());
        stringHelper.add("resolution", this.zze);
        return stringHelper.toString();
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getStatusCode());
        SafeParcelWriter.writeString(parcel, 2, getStatusMessage(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, getConnectionResult(), i, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @mr2
    public final String zza() {
        String str = this.zzd;
        return str != null ? str : CommonStatusCodes.getStatusCodeString(this.zzc);
    }
}
