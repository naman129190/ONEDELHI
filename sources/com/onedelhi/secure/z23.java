package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;

@SafeParcelable.Class(creator = "PointOfInterestCreator")
@SafeParcelable.Reserved({1})
public final class z23 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<z23> CREATOR = new an6();
    @SafeParcelable.Field(mo10053id = 2)
    @mr2

    /* renamed from: a */
    public final LatLng f23379a;
    @SafeParcelable.Field(mo10053id = 3)
    @mr2

    /* renamed from: b */
    public final String f23380b;
    @SafeParcelable.Field(mo10053id = 4)
    @mr2

    /* renamed from: c */
    public final String f23381c;

    @SafeParcelable.Constructor
    public z23(@SafeParcelable.Param(mo10056id = 2) @mr2 LatLng latLng, @SafeParcelable.Param(mo10056id = 3) @mr2 String str, @SafeParcelable.Param(mo10056id = 4) @mr2 String str2) {
        this.f23379a = latLng;
        this.f23380b = str;
        this.f23381c = str2;
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f23379a, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.f23380b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f23381c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
