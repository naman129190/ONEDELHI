package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "ActivityRecognitionRequestCreator")
@SafeParcelable.Reserved({1000})
public final class jl5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<jl5> CREATOR = new yr5();
    @SafeParcelable.Field(getter = "getWorkSource", mo10053id = 3)
    @ts2

    /* renamed from: a */
    public final WorkSource f14250a;
    @SafeParcelable.Field(getter = "getNondefaultActivities", mo10053id = 5)
    @ts2

    /* renamed from: a */
    public final int[] f14251a;
    @SafeParcelable.Field(getter = "getIntervalMillis", mo10053id = 1)

    /* renamed from: b */
    public final long f14252b;
    @SafeParcelable.Field(getter = "getTag", mo10053id = 4)
    @ts2

    /* renamed from: b */
    public final String f14253b;
    @SafeParcelable.Field(getter = "getTriggerUpdate", mo10053id = 2)

    /* renamed from: b */
    public final boolean f14254b;
    @SafeParcelable.Field(defaultValueUnchecked = "ActivityRecognitionRequest.DEFAULT_MAX_REPORT_LATENCY_MILLIS", getter = "getMaxReportLatencyMillis", mo10053id = 8)

    /* renamed from: c */
    public final long f14255c;
    @SafeParcelable.Field(getter = "getAccountName", mo10053id = 7)
    @ts2

    /* renamed from: c */
    public final String f14256c;
    @SafeParcelable.Field(getter = "getRequestSensorData", mo10053id = 6)

    /* renamed from: c */
    public final boolean f14257c;
    @SafeParcelable.Field(getter = "getContextAttributionTag", mo10053id = 9)
    @ts2

    /* renamed from: d */
    public String f14258d;

    @SafeParcelable.Constructor
    public jl5(@SafeParcelable.Param(mo10056id = 1) long j, @SafeParcelable.Param(mo10056id = 2) boolean z, @SafeParcelable.Param(mo10056id = 3) @ts2 WorkSource workSource, @SafeParcelable.Param(mo10056id = 4) @ts2 String str, @SafeParcelable.Param(mo10056id = 5) @ts2 int[] iArr, @SafeParcelable.Param(mo10056id = 6) boolean z2, @SafeParcelable.Param(mo10056id = 7) @ts2 String str2, @SafeParcelable.Param(mo10056id = 8) long j2, @SafeParcelable.Param(mo10056id = 9) @ts2 String str3) {
        this.f14252b = j;
        this.f14254b = z;
        this.f14250a = workSource;
        this.f14253b = str;
        this.f14251a = iArr;
        this.f14257c = z2;
        this.f14256c = str2;
        this.f14255c = j2;
        this.f14258d = str3;
    }

    /* renamed from: K2 */
    public final jl5 mo18472K2(@ts2 String str) {
        this.f14258d = str;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.f14252b);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f14254b);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f14250a, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.f14253b, false);
        SafeParcelWriter.writeIntArray(parcel, 5, this.f14251a, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f14257c);
        SafeParcelWriter.writeString(parcel, 7, this.f14256c, false);
        SafeParcelWriter.writeLong(parcel, 8, this.f14255c);
        SafeParcelWriter.writeString(parcel, 9, this.f14258d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
