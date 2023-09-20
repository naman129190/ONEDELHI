package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "ClearTokenRequestCreator")
public final class zq5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zq5> CREATOR = new er5();
    @SafeParcelable.Field(mo10053id = 2)

    /* renamed from: b */
    public String f23853b;
    @SafeParcelable.VersionField(mo10062id = 1)

    /* renamed from: n */
    public final int f23854n;

    public zq5() {
        this.f23854n = 1;
    }

    @SafeParcelable.Constructor
    public zq5(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) String str) {
        this.f23854n = i;
        this.f23853b = str;
    }

    /* renamed from: K2 */
    public final zq5 mo28066K2(String str) {
        this.f23853b = str;
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f23854n);
        SafeParcelWriter.writeString(parcel, 2, this.f23853b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
