package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.onedelhi.secure.mr2;
import com.onedelhi.secure.ts2;

@KeepForSdk
@SafeParcelable.Class(creator = "MethodInvocationCreator")
public class MethodInvocation extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new zan();
    @SafeParcelable.Field(getter = "getMethodKey", mo10053id = 1)
    private final int zaa;
    @SafeParcelable.Field(getter = "getResultStatusCode", mo10053id = 2)
    private final int zab;
    @SafeParcelable.Field(getter = "getConnectionResultStatusCode", mo10053id = 3)
    private final int zac;
    @SafeParcelable.Field(getter = "getStartTimeMillis", mo10053id = 4)
    private final long zad;
    @SafeParcelable.Field(getter = "getEndTimeMillis", mo10053id = 5)
    private final long zae;
    @SafeParcelable.Field(getter = "getCallingModuleId", mo10053id = 6)
    @ts2
    private final String zaf;
    @SafeParcelable.Field(getter = "getCallingEntryPoint", mo10053id = 7)
    @ts2
    private final String zag;
    @SafeParcelable.Field(defaultValue = "0", getter = "getServiceId", mo10053id = 8)
    private final int zah;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getLatencyMillis", mo10053id = 9)
    private final int zai;

    @KeepForSdk
    @Deprecated
    public MethodInvocation(int i, int i2, int i3, long j, long j2, @ts2 String str, @ts2 String str2, int i4) {
        this(i, i2, i3, j, j2, str, str2, i4, -1);
    }

    @SafeParcelable.Constructor
    public MethodInvocation(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) int i2, @SafeParcelable.Param(mo10056id = 3) int i3, @SafeParcelable.Param(mo10056id = 4) long j, @SafeParcelable.Param(mo10056id = 5) long j2, @SafeParcelable.Param(mo10056id = 6) @ts2 String str, @SafeParcelable.Param(mo10056id = 7) @ts2 String str2, @SafeParcelable.Param(mo10056id = 8) int i4, @SafeParcelable.Param(mo10056id = 9) int i5) {
        this.zaa = i;
        this.zab = i2;
        this.zac = i3;
        this.zad = j;
        this.zae = j2;
        this.zaf = str;
        this.zag = str2;
        this.zah = i4;
        this.zai = i5;
    }

    public final void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeInt(parcel, 2, this.zab);
        SafeParcelWriter.writeInt(parcel, 3, this.zac);
        SafeParcelWriter.writeLong(parcel, 4, this.zad);
        SafeParcelWriter.writeLong(parcel, 5, this.zae);
        SafeParcelWriter.writeString(parcel, 6, this.zaf, false);
        SafeParcelWriter.writeString(parcel, 7, this.zag, false);
        SafeParcelWriter.writeInt(parcel, 8, this.zah);
        SafeParcelWriter.writeInt(parcel, 9, this.zai);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
