package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;

@SafeParcelable.Class(creator = "StreetViewPanoramaLocationCreator")
@SafeParcelable.Reserved({1})
public class t44 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<t44> CREATOR = new l07();
    @SafeParcelable.Field(mo10053id = 3)
    @mr2

    /* renamed from: a */
    public final LatLng f20648a;
    @SafeParcelable.Field(mo10053id = 2)
    @mr2

    /* renamed from: a */
    public final s44[] f20649a;
    @SafeParcelable.Field(mo10053id = 4)
    @mr2

    /* renamed from: b */
    public final String f20650b;

    @SafeParcelable.Constructor
    public t44(@SafeParcelable.Param(mo10056id = 2) @mr2 s44[] s44Arr, @SafeParcelable.Param(mo10056id = 3) @mr2 LatLng latLng, @SafeParcelable.Param(mo10056id = 4) @mr2 String str) {
        this.f20649a = s44Arr;
        this.f20648a = latLng;
        this.f20650b = str;
    }

    public boolean equals(@ts2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t44)) {
            return false;
        }
        t44 t44 = (t44) obj;
        return this.f20650b.equals(t44.f20650b) && this.f20648a.equals(t44.f20648a);
    }

    public int hashCode() {
        return Objects.hashCode(this.f20648a, this.f20650b);
    }

    @mr2
    public String toString() {
        return Objects.toStringHelper(this).add("panoId", this.f20650b).add("position", this.f20648a.toString()).toString();
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.f20649a, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f20648a, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.f20650b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
