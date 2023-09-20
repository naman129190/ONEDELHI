package com.onedelhi.secure;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "StreetViewPanoramaLinkCreator")
@SafeParcelable.Reserved({1})
public class s44 extends AbstractSafeParcelable {
    @mr2
    public static final Parcelable.Creator<s44> CREATOR = new ty6();
    @SafeParcelable.Field(mo10053id = 3)

    /* renamed from: a */
    public final float f20199a;
    @SafeParcelable.Field(mo10053id = 2)
    @mr2

    /* renamed from: b */
    public final String f20200b;

    @SafeParcelable.Constructor
    public s44(@SafeParcelable.Param(mo10056id = 2) @mr2 String str, @SafeParcelable.Param(mo10056id = 3) float f) {
        this.f20200b = str;
        this.f20199a = (((double) f) <= 0.0d ? (f % 360.0f) + 360.0f : f) % 360.0f;
    }

    public boolean equals(@ts2 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s44)) {
            return false;
        }
        s44 s44 = (s44) obj;
        return this.f20200b.equals(s44.f20200b) && Float.floatToIntBits(this.f20199a) == Float.floatToIntBits(s44.f20199a);
    }

    public int hashCode() {
        return Objects.hashCode(this.f20200b, Float.valueOf(this.f20199a));
    }

    @mr2
    public String toString() {
        return Objects.toStringHelper(this).add("panoId", this.f20200b).add("bearing", Float.valueOf(this.f20199a)).toString();
    }

    public void writeToParcel(@mr2 Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f20200b, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.f20199a);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
