package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "DeviceMetaDataRequestCreator")
public final class vh5 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<vh5> CREATOR = new di5();
    @SafeParcelable.Field(mo10053id = 2)

    /* renamed from: b */
    public final String f21792b;
    @SafeParcelable.VersionField(mo10062id = 1)

    /* renamed from: n */
    public final int f21793n;

    @SafeParcelable.Constructor
    public vh5(@SafeParcelable.Param(mo10056id = 1) int i, @SafeParcelable.Param(mo10056id = 2) String str) {
        this.f21793n = 1;
        this.f21792b = (String) Preconditions.checkNotNull(str);
    }

    public vh5(String str) {
        this(1, str);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f21793n);
        SafeParcelWriter.writeString(parcel, 2, this.f21792b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
