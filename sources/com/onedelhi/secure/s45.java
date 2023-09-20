package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zat;

@SafeParcelable.Class(creator = "SignInRequestCreator")
public final class s45 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<s45> CREATOR = new u45();
    @SafeParcelable.Field(getter = "getResolveAccountRequest", mo10053id = 2)

    /* renamed from: a */
    public final zat f20201a;
    @SafeParcelable.VersionField(mo10062id = 1)

    /* renamed from: n */
    public final int f20202n;

    @SafeParcelable.Constructor
    public s45(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) zat zat) {
        this.f20202n = i;
        this.f20201a = zat;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f20202n);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f20201a, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
