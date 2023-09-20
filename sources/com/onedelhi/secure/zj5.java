package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "RetrieveDataRequestCreator")
public final class zj5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zj5> CREATOR = new hk5();
    @SafeParcelable.Field(mo10053id = 2)

    /* renamed from: b */
    public final String f23741b;
    @SafeParcelable.VersionField(mo10062id = 1)

    /* renamed from: n */
    public final int f23742n;

    @SafeParcelable.Constructor
    public zj5(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) String str) {
        this.f23742n = 1;
        this.f23741b = (String) Preconditions.checkNotNull(str);
    }

    public zj5(String str) {
        this(1, str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f23742n);
        SafeParcelWriter.writeString(parcel, 2, this.f23741b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
