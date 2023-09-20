package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "DeviceMetaDataCreator")
public class sk0 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<sk0> CREATOR = new y57();
    @SafeParcelable.Field(getter = "getMinAgeOfLockScreen", mo10053id = 3)

    /* renamed from: b */
    public long f20404b;
    @SafeParcelable.Field(getter = "isLockScreenSolved", mo10053id = 2)

    /* renamed from: b */
    public boolean f20405b;
    @SafeParcelable.Field(getter = "isChallengeAllowed", mo10053id = 4)

    /* renamed from: c */
    public final boolean f20406c;
    @SafeParcelable.VersionField(mo10062id = 1)

    /* renamed from: n */
    public final int f20407n;

    @SafeParcelable.Constructor
    public sk0(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) boolean z, @SafeParcelable.Param(mo10056id = 3) long j, @SafeParcelable.Param(mo10056id = 4) boolean z2) {
        this.f20407n = i;
        this.f20405b = z;
        this.f20404b = j;
        this.f20406c = z2;
    }

    /* renamed from: K2 */
    public long mo24452K2() {
        return this.f20404b;
    }

    /* renamed from: L2 */
    public boolean mo24453L2() {
        return this.f20406c;
    }

    /* renamed from: M2 */
    public boolean mo24454M2() {
        return this.f20405b;
    }

    public final void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f20407n);
        SafeParcelWriter.writeBoolean(parcel, 2, mo24454M2());
        SafeParcelWriter.writeLong(parcel, 3, mo24452K2());
        SafeParcelWriter.writeBoolean(parcel, 4, mo24453L2());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
