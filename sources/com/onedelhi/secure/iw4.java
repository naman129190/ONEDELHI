package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

@SafeParcelable.Class(creator = "VisibleRegionCreator")
@SafeParcelable.Reserved({1})
public final class iw4 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<iw4> CREATOR = new rc5();
    @SafeParcelable.Field(mo10053id = 2)
    @mr2

    /* renamed from: a */
    public final LatLng f13891a;
    @SafeParcelable.Field(mo10053id = 6)
    @mr2

    /* renamed from: a */
    public final LatLngBounds f13892a;
    @SafeParcelable.Field(mo10053id = 3)
    @mr2

    /* renamed from: b */
    public final LatLng f13893b;
    @SafeParcelable.Field(mo10053id = 4)
    @mr2

    /* renamed from: c */
    public final LatLng f13894c;
    @SafeParcelable.Field(mo10053id = 5)
    @mr2

    /* renamed from: d */
    public final LatLng f13895d;

    @SafeParcelable.Constructor
    public iw4(@SafeParcelable.Param(mo10056id = 2) @mr2 LatLng latLng, @SafeParcelable.Param(mo10056id = 3) @mr2 LatLng latLng2, @SafeParcelable.Param(mo10056id = 4) @mr2 LatLng latLng3, @SafeParcelable.Param(mo10056id = 5) @mr2 LatLng latLng4, @SafeParcelable.Param(mo10056id = 6) @mr2 LatLngBounds latLngBounds) {
        this.f13891a = latLng;
        this.f13893b = latLng2;
        this.f13894c = latLng3;
        this.f13895d = latLng4;
        this.f13892a = latLngBounds;
    }

    public boolean equals(@ts2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw4)) {
            return false;
        }
        iw4 iw4 = (iw4) obj;
        return this.f13891a.equals(iw4.f13891a) && this.f13893b.equals(iw4.f13893b) && this.f13894c.equals(iw4.f13894c) && this.f13895d.equals(iw4.f13895d) && this.f13892a.equals(iw4.f13892a);
    }

    public int hashCode() {
        return Objects.hashCode(this.f13891a, this.f13893b, this.f13894c, this.f13895d, this.f13892a);
    }

    @mr2
    public String toString() {
        return Objects.toStringHelper(this).add("nearLeft", this.f13891a).add("nearRight", this.f13893b).add("farLeft", this.f13894c).add("farRight", this.f13895d).add("latLngBounds", this.f13892a).toString();
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f13891a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f13893b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f13894c, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f13895d, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f13892a, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
