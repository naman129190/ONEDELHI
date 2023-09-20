package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "TileCreator")
@SafeParcelable.Reserved({1})
public final class kd4 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<kd4> CREATOR = new b67();
    @SafeParcelable.Field(mo10053id = 4)
    @ts2

    /* renamed from: a */
    public final byte[] f14840a;
    @SafeParcelable.Field(mo10053id = 2)

    /* renamed from: n */
    public final int f14841n;
    @SafeParcelable.Field(mo10053id = 3)

    /* renamed from: o */
    public final int f14842o;

    @SafeParcelable.Constructor
    public kd4(@SafeParcelable.Param(mo10056id = 2) int i, @SafeParcelable.Param(mo10056id = 3) int i2, @SafeParcelable.Param(mo10056id = 4) @ts2 byte[] bArr) {
        this.f14841n = i;
        this.f14842o = i2;
        this.f14840a = bArr;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f14841n);
        SafeParcelWriter.writeInt(parcel, 3, this.f14842o);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f14840a, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
